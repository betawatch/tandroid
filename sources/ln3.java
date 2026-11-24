// default package

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
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ln3 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final jn3 A;
    public long B;
    public final jn3 C;
    public long D;
    public long E;
    public final Context a;
    public final long b;
    public final kn3 c;
    public final boolean d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final rn3 f;
    public boolean g;
    public boolean h;
    public int i;
    public ArrayList j;
    public am3 k;
    public xl3 l;
    public boolean m;
    public yl3 n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public am3 w;
    public String x;
    public int y;
    public int z;

    public ln3(Context context, int i, long j, boolean z, kn3 kn3Var) {
        rn3 rn3Var = new rn3();
        this.f = rn3Var;
        this.j = new ArrayList();
        this.o = "";
        this.A = new jn3(this, (byte) 0);
        this.C = new jn3(this, (byte) 1);
        this.a = context.getApplicationContext();
        this.b = j;
        this.d = z;
        this.c = kn3Var;
        rn3Var.g = new k93((byte) 15);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        xl3 xl3Var = this.l;
        vl3[] vl3VarArr = DictationAsr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = (ArrayList) xl3Var.d;
        if (arrayList != null) {
            linkedHashSet.addAll(arrayList);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.K(str, xl3Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j) {
        this.E += j;
        this.e.postAtTime(new wc3(this, runnable, (byte) 23), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        yl3 yl3Var = this.n;
        if (yl3Var != null) {
            yl3Var.l = true;
        }
        am3 am3Var = this.k;
        if (am3Var != null) {
            am3Var.d();
            this.k = null;
        }
    }

    public final void d(String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        yl3 yl3Var = this.n;
        if (yl3Var != null) {
            yl3Var.l = true;
        }
        am3 am3Var = this.k;
        if (am3Var != null) {
            am3Var.d();
            this.k = null;
        }
        String m = this.m ? this.o : this.f.m();
        StringBuilder p = ug8.p("finish error=", str, " sessions=");
        p.append(this.i);
        p.append(" chars=");
        p.append(m.length());
        Log.d("Dictation", p.toString());
        this.c.a(m, str);
    }

    public final void e() {
        yl3 yl3Var = this.n;
        if (yl3Var != null) {
            yl3Var.o = new cn3(this, (byte) 2);
            yl3Var.k = true;
        } else {
            am3 am3Var = this.k;
            if (am3Var != null) {
                am3Var.d();
            }
        }
    }

    public final void f(int i, String str) {
        boolean z;
        if (this.h) {
            return;
        }
        rn3 rn3Var = this.f;
        boolean g = rn3Var.g(i);
        StringBuilder m = de9.m(i, "session ", " final ");
        m.append(rn3.b(str));
        ir2.x(m, g ? "" : " (stale)", "Dictation");
        if (g) {
            if (rn3Var.g(i)) {
                String m2 = rn3Var.m();
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    ArrayList n = rn3.n(trim);
                    ArrayList n2 = rn3.n(rn3Var.b);
                    if (n2.isEmpty() || !rn3.l(n, n2, Math.min(3, n2.size()))) {
                        rn3Var.a(trim, rn3Var.d);
                    } else {
                        rn3Var.b = "";
                        rn3Var.c = trim;
                    }
                }
                rn3Var.c("final");
                z = !m2.equals(rn3Var.m());
            } else {
                StringBuilder m3 = de9.m(i, "session ", " STALE final ignored (current ");
                m3.append(rn3Var.e);
                m3.append(", open ");
                m3.append(rn3Var.f);
                m3.append("): ");
                m3.append(rn3.b(str));
                rn3Var.i(m3.toString());
                z = false;
            }
            if (z) {
                this.c.e(rn3Var.m());
            }
            if (this.g) {
                d(null);
            }
        }
    }

    public final void g(int i, String str) {
        if (this.h) {
            return;
        }
        rn3 rn3Var = this.f;
        boolean z = false;
        if (rn3Var.g(i)) {
            String m = rn3Var.m();
            String trim = str.trim();
            if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                z = true;
            }
            rn3Var.a(trim, z);
            z = !m.equals(rn3Var.m());
        } else {
            StringBuilder m2 = de9.m(i, "session ", " STALE partial ignored (current ");
            m2.append(rn3Var.e);
            m2.append(", open ");
            m2.append(rn3Var.f);
            m2.append("): ");
            m2.append(rn3.b(str));
            rn3Var.i(m2.toString());
        }
        if (!z || this.g) {
            return;
        }
        this.c.e(rn3Var.m());
    }

    public final void h() {
        int state;
        AudioRecord audioRecord;
        if (this.d || this.k != null || this.h) {
            return;
        }
        am3 am3Var = this.w;
        if (am3Var != null) {
            this.k = am3Var;
            am3Var.g = new gn3(this, (byte) 0);
            this.l = DictationAsr.V(qm3.c(this.a, this.b));
            return;
        }
        xl3 V = DictationAsr.V(qm3.c(this.a, this.b));
        this.l = V;
        if (V != null) {
            am3 am3Var2 = new am3();
            this.k = am3Var2;
            gn3 gn3Var = new gn3(this, (byte) 1);
            try {
                AudioRecord audioRecord2 = new AudioRecord(6, gc1.AUDIO_CONTENT_SAMPLING_RATE, 16, 2, Math.max(AudioRecord.getMinBufferSize(gc1.AUDIO_CONTENT_SAMPLING_RATE, 16, 2), 12800));
                am3Var2.e = audioRecord2;
                state = audioRecord2.getState();
                audioRecord = am3Var2.e;
            } catch (Exception e) {
                Log.e("Dictation", "audio capture", e);
                AudioRecord audioRecord3 = am3Var2.e;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
                am3Var2.e = null;
            }
            if (state != 1) {
                audioRecord.release();
                am3Var2.e = null;
                Log.d("Dictation", "own audio capture unavailable");
                this.k = null;
                return;
            }
            audioRecord.startRecording();
            Thread thread = new Thread(new wc3(am3Var2, gn3Var, (byte) 17), "DictationAudio");
            am3Var2.f = thread;
            thread.start();
        }
    }

    public final void i(final xl3 xl3Var) {
        final int i = this.p + 1;
        this.p = i;
        this.l = xl3Var;
        DictationAsr.i0((vl3) xl3Var.b, false, new wl3() { // from class: en3
            @Override // wl3
            public final void a(boolean z) {
                ln3 ln3Var = ln3.this;
                int i2 = i;
                xl3 xl3Var2 = xl3Var;
                if (ln3Var.h || i2 != ln3Var.p) {
                    return;
                }
                if (!z) {
                    ln3Var.d("speech model download failed");
                    return;
                }
                yl3 yl3Var = ln3Var.n;
                if (yl3Var != null) {
                    yl3Var.l = true;
                }
                yl3 yl3Var2 = new yl3(ln3Var.k, xl3Var2, new yf(ln3Var, i2, xl3Var2, (byte) 4));
                ln3Var.n = yl3Var2;
                new Thread(new li3(yl3Var2, (byte) 9), "DictationAsr").start();
                if (ln3Var.g) {
                    ln3Var.e();
                }
            }
        });
    }

    public final void j(String str) {
        vl3 L;
        if (this.h || !this.m || this.k == null || (L = DictationAsr.L(str)) == null) {
            return;
        }
        this.q = false;
        this.e.removeCallbacks(this.A);
        k(str);
        i(new xl3((Object) L, (Object) str, (Object) this.j, (byte) 0));
    }

    public final void k(String str) {
        if (str != null) {
            String str2 = this.x;
            HashMap hashMap = qm3.a;
            if (str2 == null ? false : Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage())) {
                return;
            }
            this.x = str;
            this.c.g(str);
        }
    }

    public final void l() {
        String str;
        byte b;
        String[] strArr;
        long j;
        StringBuilder sb = new StringBuilder("start ");
        boolean z = this.d;
        sb.append(z ? "SIMULATED" : "real");
        sb.append(" sdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(" locale=");
        sb.append(Locale.getDefault());
        char c = ' ';
        if (this.k != null) {
            str = " (captured " + (this.k.c() / 32) + " ms already)";
        } else {
            str = "";
        }
        ir2.x(sb, str, "Dictation");
        final byte b2 = 0;
        Handler handler = this.e;
        final byte b3 = 1;
        if (!z) {
            if (this.k == null) {
                h();
            }
            long j2 = this.b;
            Context context = this.a;
            this.j = qm3.c(context, j2);
            if (this.l == null) {
                d("speech recognition unavailable");
                return;
            }
            if (this.k == null) {
                d("microphone error");
                return;
            }
            this.m = true;
            boolean x = DictationAsr.x();
            this.q = x;
            if (x) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.a(context);
                }
                String string = na7.c1().getString("tinylid_lang", null);
                xl3 X = string != null ? DictationAsr.X(string, this.l, false) : null;
                if (X != null) {
                    this.l = X;
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.l.u());
            }
            StringBuilder sb2 = new StringBuilder("tinyasr route: ");
            sb2.append(this.l);
            sb2.append(" (candidates ");
            sb2.append(this.j);
            sb2.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb2.append(na7.c1().getString("tinylid_lang", null));
            sb2.append(")");
            Log.d("Dictation", sb2.toString());
            i(this.l);
            return;
        }
        this.D = SystemClock.elapsedRealtime();
        long j3 = 0;
        this.E = 0L;
        handler.post(this.C);
        b(new jc((byte) 10), 500L);
        int i = 0;
        while (i < 5) {
            final int i2 = i + 1;
            String[] strArr2 = G[i];
            String str2 = strArr2[b2];
            final String str3 = strArr2[b3];
            b(new Runnable(this) { // from class: hn3
                public final /* synthetic */ ln3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b2;
                    boolean z2 = true;
                    int i3 = i2;
                    ln3 ln3Var = this.b;
                    switch (b4) {
                        case 0:
                            ln3Var.i = i3;
                            rn3 rn3Var = ln3Var.f;
                            if (rn3Var.f) {
                                rn3Var.c("superseded");
                            }
                            rn3Var.e = i3;
                            rn3Var.f = true;
                            rn3Var.b = "";
                            rn3Var.c = "";
                            rn3Var.d = false;
                            rn3Var.i("session " + i3 + " begin");
                            Log.d("Dictation", "session " + i3 + " start (simulated)");
                            break;
                        default:
                            rn3 rn3Var2 = ln3Var.f;
                            if (!ln3Var.h) {
                                if (!rn3Var2.g(i3) && i3 != ln3Var.i) {
                                    z2 = false;
                                }
                                ir2.x(de9.m(i3, "session ", " no match"), z2 ? "" : " (stale, ignored)", "Dictation");
                                if (z2) {
                                    rn3Var2.f(i3, "no match");
                                    ln3Var.c.e(rn3Var2.m());
                                    if (ln3Var.g) {
                                        ln3Var.d(null);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, i == 0 ? j3 : 140L);
            final byte b4 = 3;
            if (i == 2) {
                b(new cn3(this, (byte) 3), 60L);
            }
            if (str2.equals("~")) {
                b(new Runnable(this) { // from class: hn3
                    public final /* synthetic */ ln3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b3;
                        boolean z2 = true;
                        int i3 = i2;
                        ln3 ln3Var = this.b;
                        switch (b42) {
                            case 0:
                                ln3Var.i = i3;
                                rn3 rn3Var = ln3Var.f;
                                if (rn3Var.f) {
                                    rn3Var.c("superseded");
                                }
                                rn3Var.e = i3;
                                rn3Var.f = true;
                                rn3Var.b = "";
                                rn3Var.c = "";
                                rn3Var.d = false;
                                rn3Var.i("session " + i3 + " begin");
                                Log.d("Dictation", "session " + i3 + " start (simulated)");
                                break;
                            default:
                                rn3 rn3Var2 = ln3Var.f;
                                if (!ln3Var.h) {
                                    if (!rn3Var2.g(i3) && i3 != ln3Var.i) {
                                        z2 = false;
                                    }
                                    ir2.x(de9.m(i3, "session ", " no match"), z2 ? "" : " (stale, ignored)", "Dictation");
                                    if (z2) {
                                        rn3Var2.f(i3, "no match");
                                        ln3Var.c.e(rn3Var2.m());
                                        if (ln3Var.g) {
                                            ln3Var.d(null);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, 5000L);
                b = b3;
            } else {
                String[] split = str2.split(" \\| ");
                int length = split.length;
                int i3 = b2;
                while (i3 < length) {
                    String[] split2 = split[i3].split(" ");
                    StringBuilder sb3 = new StringBuilder();
                    int i4 = b2;
                    while (i4 < split2.length) {
                        if (i4 > 0) {
                            sb3.append(c);
                        }
                        sb3.append(split2[i4]);
                        final String sb4 = sb3.toString();
                        if (i == 3) {
                            strArr = split2;
                            j = split2[i4].equals("now") ? (byte) 300 : split2[i4].equals("text") ? (byte) 800 : split2[i4].equals("word") ? (byte) 1100 : split2[i4].equals("pause") ? (byte) 1500 : b2;
                        } else {
                            strArr = split2;
                            j = 0;
                        }
                        int i5 = i;
                        long length2 = (strArr[i4].length() * 24) + j + 170 + ((long) (Math.random() * 60.0d));
                        if (strArr[i4].equals("feature") || strArr[i4].equals("office")) {
                            final String concat = sb4.substring(0, sb4.length() - strArr[i4].length()).concat(strArr[i4].equals("feature") ? "feet" : "offers");
                            final byte b5 = 1;
                            b(new Runnable(this) { // from class: dn3
                                public final /* synthetic */ ln3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    String str4 = concat;
                                    int i6 = i2;
                                    ln3 ln3Var = this.b;
                                    switch (b6) {
                                        case 0:
                                            ln3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                            ln3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            ln3Var.g(i6, str4);
                                            break;
                                        default:
                                            ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                            ln3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, length2);
                            final byte b6 = 2;
                            b(new Runnable(this) { // from class: dn3
                                public final /* synthetic */ ln3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b62 = b6;
                                    String str4 = sb4;
                                    int i6 = i2;
                                    ln3 ln3Var = this.b;
                                    switch (b62) {
                                        case 0:
                                            ln3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                            ln3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            ln3Var.g(i6, str4);
                                            break;
                                        default:
                                            ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                            ln3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, 180L);
                        } else {
                            b(new Runnable(this) { // from class: dn3
                                public final /* synthetic */ ln3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b62 = b4;
                                    String str4 = sb4;
                                    int i6 = i2;
                                    ln3 ln3Var = this.b;
                                    switch (b62) {
                                        case 0:
                                            ln3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                            ln3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            ln3Var.g(i6, str4);
                                            break;
                                        default:
                                            ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                            ln3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, length2);
                        }
                        i4++;
                        split2 = strArr;
                        i = i5;
                        b2 = 0;
                        c = ' ';
                    }
                    b(new jc((byte) 10), 650L);
                    i3++;
                    i = i;
                    b2 = 0;
                    c = ' ';
                }
                b = 1;
                if (str3.startsWith("!")) {
                    str3 = str3.substring(1);
                }
                final byte b7 = 0;
                b(new Runnable(this) { // from class: dn3
                    public final /* synthetic */ ln3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b62 = b7;
                        String str4 = str3;
                        int i6 = i2;
                        ln3 ln3Var = this.b;
                        switch (b62) {
                            case 0:
                                ln3Var.f(i6, str4);
                                break;
                            case 1:
                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                ln3Var.g(i6, str4);
                                break;
                            case 2:
                                ln3Var.g(i6, str4);
                                break;
                            default:
                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                ln3Var.g(i6, str4);
                                break;
                        }
                    }
                }, 900L);
            }
            i = i2;
            b3 = b;
            b2 = 0;
            c = ' ';
            j3 = 0;
        }
        b(new cn3(this, b3), 1300L);
    }

    public final void m() {
        am3 am3Var;
        if (this.h) {
            return;
        }
        this.g = true;
        Log.d("Dictation", "stop requested (session " + this.i + ")");
        if (this.d) {
            Handler handler = this.e;
            handler.removeCallbacksAndMessages(null);
            this.f.f(this.i, "stop");
            this.c.e(this.f.m());
            handler.postDelayed(new cn3(this, (byte) 0), 350L);
            return;
        }
        if (!this.m) {
            d(null);
            return;
        }
        if (!this.q || this.s || this.t || DictationLid.c == 0 || (am3Var = this.k) == null) {
            e();
            return;
        }
        this.t = true;
        int i = this.p;
        am3Var.d();
        am3 am3Var2 = this.k;
        DictationLid.h(500, new jh((Object) this, i, (byte) 7), a(), am3Var2.b(0, am3Var2.c()));
    }
}
