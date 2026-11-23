package ai;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w1 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final u1 A;
    public long B;
    public final u1 C;
    public long D;
    public long E;
    public final Context a;
    public final long b;
    public final v1 c;
    public final boolean d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final c2 f;
    public boolean g;
    public boolean h;
    public int i;
    public ArrayList j;
    public v k;
    public android.support.v4.media.session.a0 l;
    public boolean m;
    public t n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public v w;
    public String x;
    public int y;
    public int z;

    public w1(Context context, int i7, long j3, boolean z10, v1 v1Var) {
        c2 c2Var = new c2();
        this.f = c2Var;
        this.j = new ArrayList();
        this.o = "";
        this.A = new u1(this, 0);
        this.C = new u1(this, 1);
        this.a = context.getApplicationContext();
        this.b = j3;
        this.d = z10;
        this.c = v1Var;
        c2Var.g = new a3.l(13);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        android.support.v4.media.session.a0 a0Var = this.l;
        q[] qVarArr = DictationAsr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = (List) a0Var.d;
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.L(str, a0Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j3) {
        this.E += j3;
        this.e.postAtTime(new a1.e(17, this, runnable), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        t tVar = this.n;
        if (tVar != null) {
            tVar.l = true;
        }
        v vVar = this.k;
        if (vVar != null) {
            vVar.d();
            this.k = null;
        }
    }

    public final void d(String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        t tVar = this.n;
        if (tVar != null) {
            tVar.l = true;
        }
        v vVar = this.k;
        if (vVar != null) {
            vVar.d();
            this.k = null;
        }
        String m10 = this.m ? this.o : this.f.m();
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.i);
        u10.append(" chars=");
        u10.append(m10.length());
        Log.d("Dictation", u10.toString());
        this.c.a(m10, str);
    }

    public final void e() {
        t tVar = this.n;
        if (tVar != null) {
            tVar.o = new k1(this, 2);
            tVar.k = true;
        } else {
            v vVar = this.k;
            if (vVar != null) {
                vVar.d();
            }
        }
    }

    public final void f(int i7, String str) {
        boolean z10;
        if (this.h) {
            return;
        }
        c2 c2Var = this.f;
        boolean g10 = c2Var.g(i7);
        StringBuilder m10 = i5.c.m(i7, "session ", " final ");
        m10.append(c2.b(str));
        p5.c.t(m10, g10 ? "" : " (stale)", "Dictation");
        if (g10) {
            if (c2Var.g(i7)) {
                String m11 = c2Var.m();
                String trim = str == null ? "" : str.trim();
                if (!trim.isEmpty()) {
                    ArrayList n10 = c2.n(trim);
                    ArrayList n11 = c2.n(c2Var.b);
                    if (n11.isEmpty() || !c2.l(n10, n11, Math.min(3, n11.size()))) {
                        c2Var.a(trim, c2Var.d);
                    } else {
                        c2Var.b = "";
                        c2Var.c = trim;
                    }
                }
                c2Var.c("final");
                z10 = !m11.equals(c2Var.m());
            } else {
                StringBuilder m12 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                m12.append(c2Var.e);
                m12.append(", open ");
                m12.append(c2Var.f);
                m12.append("): ");
                m12.append(c2.b(str));
                c2Var.i(m12.toString());
                z10 = false;
            }
            if (z10) {
                this.c.r(c2Var.m());
            }
            if (this.g) {
                d(null);
            }
        }
    }

    public final void g(int i7, String str) {
        if (this.h) {
            return;
        }
        c2 c2Var = this.f;
        boolean z10 = false;
        if (!c2Var.g(i7)) {
            StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
            m10.append(c2Var.e);
            m10.append(", open ");
            m10.append(c2Var.f);
            m10.append("): ");
            m10.append(c2.b(str));
            c2Var.i(m10.toString());
        } else if (str != null) {
            String m11 = c2Var.m();
            String trim = str.trim();
            if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                z10 = true;
            }
            c2Var.a(trim, z10);
            z10 = !m11.equals(c2Var.m());
        }
        if (!z10 || this.g) {
            return;
        }
        this.c.r(c2Var.m());
    }

    public final void h() {
        AudioRecord audioRecord;
        if (this.d || this.k != null || this.h) {
            return;
        }
        v vVar = this.w;
        if (vVar != null) {
            this.k = vVar;
            vVar.g = new q1(this, 0);
            this.l = DictationAsr.W(s0.c(this.a, this.b));
            return;
        }
        android.support.v4.media.session.a0 W = DictationAsr.W(s0.c(this.a, this.b));
        this.l = W;
        if (W != null) {
            v vVar2 = new v();
            this.k = vVar2;
            q1 q1Var = new q1(this, 1);
            try {
                audioRecord = new AudioRecord(6, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 16, 2, Math.max(AudioRecord.getMinBufferSize(androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 16, 2), 12800));
                vVar2.e = audioRecord;
            } catch (Exception e10) {
                Log.e("Dictation", "audio capture", e10);
                AudioRecord audioRecord2 = vVar2.e;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                vVar2.e = null;
            }
            if (audioRecord.getState() != 1) {
                vVar2.e.release();
                vVar2.e = null;
                Log.d("Dictation", "own audio capture unavailable");
                this.k = null;
                return;
            }
            vVar2.e.startRecording();
            Thread thread = new Thread(new a1.e(11, vVar2, q1Var), "DictationAudio");
            vVar2.f = thread;
            thread.start();
        }
    }

    public final void i(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.p + 1;
        this.p = i7;
        this.l = a0Var;
        DictationAsr.i0((q) a0Var.b, false, new r() { // from class: ai.m1
            @Override // ai.r
            public final void a(boolean z10) {
                w1 w1Var = w1.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (w1Var.h || i10 != w1Var.p) {
                    return;
                }
                if (!z10) {
                    w1Var.d("speech model download failed");
                    return;
                }
                t tVar = w1Var.n;
                if (tVar != null) {
                    tVar.l = true;
                }
                t tVar2 = new t(w1Var.k, a0Var2, new o1(w1Var, i10, a0Var2, 0));
                w1Var.n = tVar2;
                new Thread(new a3.f(tVar2, 5), "DictationAsr").start();
                if (w1Var.g) {
                    w1Var.e();
                }
            }
        });
    }

    public final void j(String str) {
        q M;
        if (this.h || !this.m || this.k == null || (M = DictationAsr.M(str)) == null) {
            return;
        }
        this.q = false;
        this.e.removeCallbacks(this.A);
        k(str);
        i(new android.support.v4.media.session.a0(M, str, this.j, false, 7));
    }

    public final void k(String str) {
        if (str != null) {
            String str2 = this.x;
            HashMap hashMap = s0.a;
            if (str2 == null ? false : Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage())) {
                return;
            }
            this.x = str;
            this.c.P(str);
        }
    }

    public final void l() {
        String str;
        int i7;
        int i10;
        long j3;
        final int i11;
        StringBuilder sb2 = new StringBuilder("start ");
        boolean z10 = this.d;
        sb2.append(z10 ? "SIMULATED" : "real");
        sb2.append(" sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(" locale=");
        sb2.append(Locale.getDefault());
        char c10 = ' ';
        if (this.k != null) {
            str = " (captured " + (this.k.c() / 32) + " ms already)";
        } else {
            str = "";
        }
        p5.c.t(sb2, str, "Dictation");
        final int i12 = 0;
        Handler handler = this.e;
        final int i13 = 1;
        if (!z10) {
            if (this.k == null) {
                h();
            }
            long j10 = this.b;
            Context context = this.a;
            this.j = s0.c(context, j10);
            if (this.l == null) {
                d("speech recognition unavailable");
                return;
            }
            if (this.k == null) {
                d("microphone error");
                return;
            }
            this.m = true;
            boolean z11 = DictationAsr.z();
            this.q = z11;
            if (z11) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.z()) {
                    DictationLid.d(context);
                }
                String string = mp.g1().getString("tinylid_lang", null);
                android.support.v4.media.session.a0 Y = string != null ? DictationAsr.Y(string, this.l, false) : null;
                if (Y != null) {
                    this.l = Y;
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.l.i());
            }
            StringBuilder sb3 = new StringBuilder("tinyasr route: ");
            sb3.append(this.l);
            sb3.append(" (candidates ");
            sb3.append(this.j);
            sb3.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb3.append(mp.g1().getString("tinylid_lang", null));
            sb3.append(")");
            Log.d("Dictation", sb3.toString());
            i(this.l);
            return;
        }
        this.D = SystemClock.elapsedRealtime();
        long j11 = 0;
        this.E = 0L;
        handler.post(this.C);
        b(new org.telegram.messenger.j2(0), 500L);
        int i14 = 0;
        while (i14 < 5) {
            final int i15 = i14 + 1;
            String[] strArr = G[i14];
            String str2 = strArr[i12];
            final String str3 = strArr[i13];
            b(new Runnable(this) { // from class: ai.r1
                public final /* synthetic */ w1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            w1 w1Var = this.b;
                            int i16 = i15;
                            w1Var.i = i16;
                            c2 c2Var = w1Var.f;
                            if (c2Var.f) {
                                c2Var.c("superseded");
                            }
                            c2Var.e = i16;
                            c2Var.f = true;
                            c2Var.b = "";
                            c2Var.c = "";
                            c2Var.d = false;
                            c2Var.i("session " + i16 + " begin");
                            Log.d("Dictation", "session " + i16 + " start (simulated)");
                            break;
                        default:
                            w1 w1Var2 = this.b;
                            c2 c2Var2 = w1Var2.f;
                            if (!w1Var2.h) {
                                int i17 = i15;
                                boolean z12 = c2Var2.g(i17) || i17 == w1Var2.i;
                                p5.c.t(i5.c.m(i17, "session ", " no match"), z12 ? "" : " (stale, ignored)", "Dictation");
                                if (z12) {
                                    c2Var2.f(i17, "no match");
                                    w1Var2.c.r(c2Var2.m());
                                    if (w1Var2.g) {
                                        w1Var2.d(null);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, i14 == 0 ? j11 : 140L);
            int i16 = 2;
            final int i17 = 3;
            if (i14 == 2) {
                b(new k1(this, 3), 60L);
            }
            if (str2.equals("~")) {
                b(new Runnable(this) { // from class: ai.r1
                    public final /* synthetic */ w1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                w1 w1Var = this.b;
                                int i162 = i15;
                                w1Var.i = i162;
                                c2 c2Var = w1Var.f;
                                if (c2Var.f) {
                                    c2Var.c("superseded");
                                }
                                c2Var.e = i162;
                                c2Var.f = true;
                                c2Var.b = "";
                                c2Var.c = "";
                                c2Var.d = false;
                                c2Var.i("session " + i162 + " begin");
                                Log.d("Dictation", "session " + i162 + " start (simulated)");
                                break;
                            default:
                                w1 w1Var2 = this.b;
                                c2 c2Var2 = w1Var2.f;
                                if (!w1Var2.h) {
                                    int i172 = i15;
                                    boolean z12 = c2Var2.g(i172) || i172 == w1Var2.i;
                                    p5.c.t(i5.c.m(i172, "session ", " no match"), z12 ? "" : " (stale, ignored)", "Dictation");
                                    if (z12) {
                                        c2Var2.f(i172, "no match");
                                        w1Var2.c.r(c2Var2.m());
                                        if (w1Var2.g) {
                                            w1Var2.d(null);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, 5000L);
                i7 = i13;
            } else {
                String[] split = str2.split(" \\| ");
                int length = split.length;
                int i18 = i12;
                while (i18 < length) {
                    String[] split2 = split[i18].split(" ");
                    StringBuilder sb4 = new StringBuilder();
                    int i19 = i12;
                    while (i19 < split2.length) {
                        if (i19 > 0) {
                            sb4.append(c10);
                        }
                        sb4.append(split2[i19]);
                        final String sb5 = sb4.toString();
                        if (i14 == 3) {
                            i10 = i19;
                            j3 = split2[i19].equals("now") ? ks.X4 : split2[i19].equals("text") ? 800 : split2[i19].equals("word") ? 1100 : split2[i19].equals("pause") ? 1500 : i12;
                        } else {
                            i10 = i19;
                            j3 = 0;
                        }
                        int i20 = i14;
                        long length2 = (split2[i10].length() * 24) + j3 + 170 + ((long) (Math.random() * 60.0d));
                        if (split2[i10].equals("feature") || split2[i10].equals("office")) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(sb5.substring(0, sb5.length() - split2[i10].length()));
                            sb6.append(split2[i10].equals("feature") ? "feet" : "offers");
                            final String sb7 = sb6.toString();
                            final int i21 = 1;
                            b(new Runnable(this) { // from class: ai.l1
                                public final /* synthetic */ w1 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i21) {
                                        case 0:
                                            this.b.f(i15, sb7);
                                            break;
                                        case 1:
                                            w1 w1Var = this.b;
                                            w1Var.getClass();
                                            w1Var.B = SystemClock.elapsedRealtime() + 400;
                                            w1Var.g(i15, sb7);
                                            break;
                                        case 2:
                                            this.b.g(i15, sb7);
                                            break;
                                        default:
                                            w1 w1Var2 = this.b;
                                            w1Var2.getClass();
                                            w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                            w1Var2.g(i15, sb7);
                                            break;
                                    }
                                }
                            }, length2);
                            i11 = 2;
                            b(new Runnable(this) { // from class: ai.l1
                                public final /* synthetic */ w1 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            this.b.f(i15, sb5);
                                            break;
                                        case 1:
                                            w1 w1Var = this.b;
                                            w1Var.getClass();
                                            w1Var.B = SystemClock.elapsedRealtime() + 400;
                                            w1Var.g(i15, sb5);
                                            break;
                                        case 2:
                                            this.b.g(i15, sb5);
                                            break;
                                        default:
                                            w1 w1Var2 = this.b;
                                            w1Var2.getClass();
                                            w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                            w1Var2.g(i15, sb5);
                                            break;
                                    }
                                }
                            }, 180L);
                        } else {
                            b(new Runnable(this) { // from class: ai.l1
                                public final /* synthetic */ w1 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            this.b.f(i15, sb5);
                                            break;
                                        case 1:
                                            w1 w1Var = this.b;
                                            w1Var.getClass();
                                            w1Var.B = SystemClock.elapsedRealtime() + 400;
                                            w1Var.g(i15, sb5);
                                            break;
                                        case 2:
                                            this.b.g(i15, sb5);
                                            break;
                                        default:
                                            w1 w1Var2 = this.b;
                                            w1Var2.getClass();
                                            w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                            w1Var2.g(i15, sb5);
                                            break;
                                    }
                                }
                            }, length2);
                            i11 = 2;
                        }
                        i19 = i10 + 1;
                        i16 = i11;
                        i14 = i20;
                        i12 = 0;
                        c10 = ' ';
                    }
                    b(new org.telegram.messenger.j2(0), 650L);
                    i18++;
                    i14 = i14;
                    i12 = 0;
                    c10 = ' ';
                }
                i7 = 1;
                if (str3.startsWith("!")) {
                    str3 = str3.substring(1);
                }
                final int i22 = 0;
                b(new Runnable(this) { // from class: ai.l1
                    public final /* synthetic */ w1 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i22) {
                            case 0:
                                this.b.f(i15, str3);
                                break;
                            case 1:
                                w1 w1Var = this.b;
                                w1Var.getClass();
                                w1Var.B = SystemClock.elapsedRealtime() + 400;
                                w1Var.g(i15, str3);
                                break;
                            case 2:
                                this.b.g(i15, str3);
                                break;
                            default:
                                w1 w1Var2 = this.b;
                                w1Var2.getClass();
                                w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                w1Var2.g(i15, str3);
                                break;
                        }
                    }
                }, 900L);
            }
            i14 = i15;
            i13 = i7;
            i12 = 0;
            c10 = ' ';
            j11 = 0;
        }
        b(new k1(this, i13), 1300L);
    }

    public final void m() {
        v vVar;
        if (this.h) {
            return;
        }
        this.g = true;
        Log.d("Dictation", "stop requested (session " + this.i + ")");
        if (this.d) {
            Handler handler = this.e;
            handler.removeCallbacksAndMessages(null);
            this.f.f(this.i, "stop");
            this.c.r(this.f.m());
            handler.postDelayed(new k1(this, 0), 350L);
            return;
        }
        if (!this.m) {
            d(null);
            return;
        }
        if (!this.q || this.s || this.t || DictationLid.c == 0 || (vVar = this.k) == null) {
            e();
            return;
        }
        this.t = true;
        int i7 = this.p;
        vVar.d();
        v vVar2 = this.k;
        DictationLid.h(500, new n1(this, i7, 0), a(), vVar2.b(0, vVar2.c()));
    }
}
