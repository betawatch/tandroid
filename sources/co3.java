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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class co3 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final ao3 A;
    public long B;
    public final ao3 C;
    public long D;
    public long E;
    public final Context a;
    public final long b;
    public final bo3 c;
    public final boolean d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final io3 f;
    public boolean g;
    public boolean h;
    public int i;
    public ArrayList j;
    public sm3 k;
    public pm3 l;
    public boolean m;
    public qm3 n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public sm3 w;
    public String x;
    public int y;
    public int z;

    public co3(Context context, int i, long j, boolean z, bo3 bo3Var) {
        io3 io3Var = new io3();
        this.f = io3Var;
        this.j = new ArrayList();
        this.o = "";
        this.A = new ao3(this, (byte) 0);
        this.C = new ao3(this, (byte) 1);
        this.a = context.getApplicationContext();
        this.b = j;
        this.d = z;
        this.c = bo3Var;
        io3Var.g = new da3((byte) 21);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        pm3 pm3Var = this.l;
        nm3[] nm3VarArr = DictationAsr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = (ArrayList) pm3Var.d;
        if (arrayList != null) {
            linkedHashSet.addAll(arrayList);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.M(str, pm3Var, false, false) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j) {
        this.E += j;
        this.e.postAtTime(new wd3(this, runnable, (byte) 21), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        qm3 qm3Var = this.n;
        if (qm3Var != null) {
            qm3Var.l = true;
        }
        sm3 sm3Var = this.k;
        if (sm3Var != null) {
            sm3Var.d();
            this.k = null;
        }
    }

    public final void d(String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        qm3 qm3Var = this.n;
        if (qm3Var != null) {
            qm3Var.l = true;
        }
        sm3 sm3Var = this.k;
        if (sm3Var != null) {
            sm3Var.d();
            this.k = null;
        }
        String m = this.m ? this.o : this.f.m();
        StringBuilder p = ik8.p("finish error=", str, " sessions=");
        p.append(this.i);
        p.append(" chars=");
        p.append(m.length());
        Log.d("Dictation", p.toString());
        this.c.a(m, str);
    }

    public final void e() {
        qm3 qm3Var = this.n;
        if (qm3Var != null) {
            qm3Var.o = new tn3(this, (byte) 2);
            qm3Var.k = true;
        } else {
            sm3 sm3Var = this.k;
            if (sm3Var != null) {
                sm3Var.d();
            }
        }
    }

    public final void f(int i, String str) {
        boolean z;
        if (this.h) {
            return;
        }
        io3 io3Var = this.f;
        boolean g = io3Var.g(i);
        StringBuilder m = uh9.m(i, "session ", " final ");
        m.append(io3.b(str));
        bs2.x(m, g ? "" : " (stale)", "Dictation");
        if (g) {
            if (io3Var.g(i)) {
                String m2 = io3Var.m();
                String trim = str.trim();
                if (!trim.isEmpty()) {
                    ArrayList n = io3.n(trim);
                    ArrayList n2 = io3.n(io3Var.b);
                    if (n2.isEmpty() || !io3.l(n, n2, Math.min(3, n2.size()))) {
                        io3Var.a(trim, io3Var.d);
                    } else {
                        io3Var.b = "";
                        io3Var.c = trim;
                    }
                }
                io3Var.c("final");
                z = !m2.equals(io3Var.m());
            } else {
                StringBuilder m3 = uh9.m(i, "session ", " STALE final ignored (current ");
                m3.append(io3Var.e);
                m3.append(", open ");
                m3.append(io3Var.f);
                m3.append("): ");
                m3.append(io3.b(str));
                io3Var.i(m3.toString());
                z = false;
            }
            if (z) {
                this.c.f(io3Var.m());
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
        io3 io3Var = this.f;
        boolean z = false;
        if (io3Var.g(i)) {
            String m = io3Var.m();
            String trim = str.trim();
            if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                z = true;
            }
            io3Var.a(trim, z);
            z = !m.equals(io3Var.m());
        } else {
            StringBuilder m2 = uh9.m(i, "session ", " STALE partial ignored (current ");
            m2.append(io3Var.e);
            m2.append(", open ");
            m2.append(io3Var.f);
            m2.append("): ");
            m2.append(io3.b(str));
            io3Var.i(m2.toString());
        }
        if (!z || this.g) {
            return;
        }
        this.c.f(io3Var.m());
    }

    public final void h() {
        int state;
        AudioRecord audioRecord;
        if (this.d || this.k != null || this.h) {
            return;
        }
        sm3 sm3Var = this.w;
        if (sm3Var != null) {
            this.k = sm3Var;
            sm3Var.g = new xn3(this, (byte) 0);
            this.l = DictationAsr.X(in3.c(this.a, this.b));
            return;
        }
        pm3 X = DictationAsr.X(in3.c(this.a, this.b));
        this.l = X;
        if (X != null) {
            sm3 sm3Var2 = new sm3();
            this.k = sm3Var2;
            xn3 xn3Var = new xn3(this, (byte) 1);
            byte b = 16;
            try {
                AudioRecord audioRecord2 = new AudioRecord(6, oc1.AUDIO_CONTENT_SAMPLING_RATE, 16, 2, Math.max(AudioRecord.getMinBufferSize(oc1.AUDIO_CONTENT_SAMPLING_RATE, 16, 2), 12800));
                sm3Var2.e = audioRecord2;
                state = audioRecord2.getState();
                audioRecord = sm3Var2.e;
            } catch (Exception e) {
                Log.e("Dictation", "audio capture", e);
                AudioRecord audioRecord3 = sm3Var2.e;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
                sm3Var2.e = null;
            }
            if (state != 1) {
                audioRecord.release();
                sm3Var2.e = null;
                Log.d("Dictation", "own audio capture unavailable");
                this.k = null;
                return;
            }
            audioRecord.startRecording();
            Thread thread = new Thread(new wd3(sm3Var2, xn3Var, b), "DictationAudio");
            sm3Var2.f = thread;
            thread.start();
        }
    }

    public final void i(final pm3 pm3Var) {
        final int i = this.p + 1;
        this.p = i;
        this.l = pm3Var;
        DictationAsr.k0((nm3) pm3Var.b, false, new om3() { // from class: vn3
            @Override // om3
            public final void a(boolean z) {
                co3 co3Var = co3.this;
                int i2 = i;
                pm3 pm3Var2 = pm3Var;
                if (co3Var.h || i2 != co3Var.p) {
                    return;
                }
                if (!z) {
                    co3Var.d("speech model download failed");
                    return;
                }
                qm3 qm3Var = co3Var.n;
                if (qm3Var != null) {
                    qm3Var.l = true;
                }
                qm3 qm3Var2 = new qm3(co3Var.k, pm3Var2, new bf(co3Var, i2, pm3Var2, (byte) 4));
                co3Var.n = qm3Var2;
                new Thread(new zg3(qm3Var2, (byte) 15), "DictationAsr").start();
                if (co3Var.g) {
                    co3Var.e();
                }
            }
        });
    }

    public final void j(String str) {
        nm3 N;
        if (this.h || !this.m || this.k == null || (N = DictationAsr.N(str)) == null) {
            return;
        }
        this.q = false;
        this.e.removeCallbacks(this.A);
        k(str);
        i(new pm3((Object) N, (Object) str, (Object) this.j, (byte) 0));
    }

    public final void k(String str) {
        if (str != null) {
            String str2 = this.x;
            HashMap hashMap = in3.a;
            if (str2 == null ? false : Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage())) {
                return;
            }
            this.x = str;
            this.c.i(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        String str;
        pm3 pm3Var;
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
        bs2.x(sb, str, "Dictation");
        final byte b2 = 0;
        Handler handler = this.e;
        final byte b3 = 1;
        if (!z) {
            if (this.k == null) {
                h();
            }
            long j2 = this.b;
            Context context = this.a;
            this.j = in3.c(context, j2);
            if (this.l == null) {
                d("speech recognition unavailable");
                return;
            }
            if (this.k == null) {
                d("microphone error");
                return;
            }
            this.m = true;
            boolean y = DictationAsr.y();
            this.q = y;
            if (y) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.y()) {
                    DictationLid.a(context);
                }
                String string = uc7.e1().getString("tinylid_lang", null);
                if (string != null) {
                    pm3 pm3Var2 = this.l;
                    byte b4 = 0;
                    nm3 M = DictationAsr.M(string, pm3Var2, false, false);
                    if (M != null) {
                        pm3Var = new pm3(M, string, (ArrayList) pm3Var2.d, b4);
                        if (pm3Var != null) {
                            this.l = pm3Var;
                        }
                        handler.postDelayed(this.A, 700L);
                    }
                }
                pm3Var = null;
                if (pm3Var != null) {
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.l.t());
            }
            StringBuilder sb2 = new StringBuilder("tinyasr route: ");
            sb2.append(this.l);
            sb2.append(" (candidates ");
            sb2.append(this.j);
            sb2.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb2.append(uc7.e1().getString("tinylid_lang", null));
            sb2.append(")");
            Log.d("Dictation", sb2.toString());
            i(this.l);
            return;
        }
        this.D = SystemClock.elapsedRealtime();
        long j3 = 0;
        this.E = 0L;
        handler.post(this.C);
        b(new kc((byte) 10), 500L);
        int i = 0;
        while (i < 5) {
            final int i2 = i + 1;
            String[] strArr2 = G[i];
            String str2 = strArr2[b2];
            final String str3 = strArr2[b3];
            b(new Runnable(this) { // from class: yn3
                public final /* synthetic */ co3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b5 = b2;
                    boolean z2 = true;
                    int i3 = i2;
                    co3 co3Var = this.b;
                    switch (b5) {
                        case 0:
                            co3Var.i = i3;
                            io3 io3Var = co3Var.f;
                            if (io3Var.f) {
                                io3Var.c("superseded");
                            }
                            io3Var.e = i3;
                            io3Var.f = true;
                            io3Var.b = "";
                            io3Var.c = "";
                            io3Var.d = false;
                            io3Var.i("session " + i3 + " begin");
                            Log.d("Dictation", "session " + i3 + " start (simulated)");
                            break;
                        default:
                            io3 io3Var2 = co3Var.f;
                            if (!co3Var.h) {
                                if (!io3Var2.g(i3) && i3 != co3Var.i) {
                                    z2 = false;
                                }
                                bs2.x(uh9.m(i3, "session ", " no match"), z2 ? "" : " (stale, ignored)", "Dictation");
                                if (z2) {
                                    io3Var2.f(i3, "no match");
                                    co3Var.c.f(io3Var2.m());
                                    if (co3Var.g) {
                                        co3Var.d(null);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            }, i == 0 ? j3 : 140L);
            final byte b5 = 3;
            if (i == 2) {
                b(new tn3(this, (byte) 3), 60L);
            }
            if (str2.equals("~")) {
                b(new Runnable(this) { // from class: yn3
                    public final /* synthetic */ co3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b52 = b3;
                        boolean z2 = true;
                        int i3 = i2;
                        co3 co3Var = this.b;
                        switch (b52) {
                            case 0:
                                co3Var.i = i3;
                                io3 io3Var = co3Var.f;
                                if (io3Var.f) {
                                    io3Var.c("superseded");
                                }
                                io3Var.e = i3;
                                io3Var.f = true;
                                io3Var.b = "";
                                io3Var.c = "";
                                io3Var.d = false;
                                io3Var.i("session " + i3 + " begin");
                                Log.d("Dictation", "session " + i3 + " start (simulated)");
                                break;
                            default:
                                io3 io3Var2 = co3Var.f;
                                if (!co3Var.h) {
                                    if (!io3Var2.g(i3) && i3 != co3Var.i) {
                                        z2 = false;
                                    }
                                    bs2.x(uh9.m(i3, "session ", " no match"), z2 ? "" : " (stale, ignored)", "Dictation");
                                    if (z2) {
                                        io3Var2.f(i3, "no match");
                                        co3Var.c.f(io3Var2.m());
                                        if (co3Var.g) {
                                            co3Var.d(null);
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
                            final byte b6 = 1;
                            b(new Runnable(this) { // from class: un3
                                public final /* synthetic */ co3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b7 = b6;
                                    String str4 = concat;
                                    int i6 = i2;
                                    co3 co3Var = this.b;
                                    switch (b7) {
                                        case 0:
                                            co3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            co3Var.B = SystemClock.elapsedRealtime() + 400;
                                            co3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            co3Var.g(i6, str4);
                                            break;
                                        default:
                                            co3Var.B = SystemClock.elapsedRealtime() + 400;
                                            co3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, length2);
                            final byte b7 = 2;
                            b(new Runnable(this) { // from class: un3
                                public final /* synthetic */ co3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b7;
                                    String str4 = sb4;
                                    int i6 = i2;
                                    co3 co3Var = this.b;
                                    switch (b72) {
                                        case 0:
                                            co3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            co3Var.B = SystemClock.elapsedRealtime() + 400;
                                            co3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            co3Var.g(i6, str4);
                                            break;
                                        default:
                                            co3Var.B = SystemClock.elapsedRealtime() + 400;
                                            co3Var.g(i6, str4);
                                            break;
                                    }
                                }
                            }, 180L);
                        } else {
                            b(new Runnable(this) { // from class: un3
                                public final /* synthetic */ co3 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b5;
                                    String str4 = sb4;
                                    int i6 = i2;
                                    co3 co3Var = this.b;
                                    switch (b72) {
                                        case 0:
                                            co3Var.f(i6, str4);
                                            break;
                                        case 1:
                                            co3Var.B = SystemClock.elapsedRealtime() + 400;
                                            co3Var.g(i6, str4);
                                            break;
                                        case 2:
                                            co3Var.g(i6, str4);
                                            break;
                                        default:
                                            co3Var.B = SystemClock.elapsedRealtime() + 400;
                                            co3Var.g(i6, str4);
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
                    b(new kc((byte) 10), 650L);
                    i3++;
                    i = i;
                    b2 = 0;
                    c = ' ';
                }
                b = 1;
                if (str3.startsWith("!")) {
                    str3 = str3.substring(1);
                }
                final byte b8 = 0;
                b(new Runnable(this) { // from class: un3
                    public final /* synthetic */ co3 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b72 = b8;
                        String str4 = str3;
                        int i6 = i2;
                        co3 co3Var = this.b;
                        switch (b72) {
                            case 0:
                                co3Var.f(i6, str4);
                                break;
                            case 1:
                                co3Var.B = SystemClock.elapsedRealtime() + 400;
                                co3Var.g(i6, str4);
                                break;
                            case 2:
                                co3Var.g(i6, str4);
                                break;
                            default:
                                co3Var.B = SystemClock.elapsedRealtime() + 400;
                                co3Var.g(i6, str4);
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
        b(new tn3(this, b3), 1300L);
    }

    public final void m() {
        sm3 sm3Var;
        if (this.h) {
            return;
        }
        this.g = true;
        Log.d("Dictation", "stop requested (session " + this.i + ")");
        if (this.d) {
            Handler handler = this.e;
            handler.removeCallbacksAndMessages(null);
            this.f.f(this.i, "stop");
            this.c.f(this.f.m());
            handler.postDelayed(new tn3(this, (byte) 0), 350L);
            return;
        }
        if (!this.m) {
            d(null);
            return;
        }
        if (!this.q || this.s || this.t || DictationLid.c == 0 || (sm3Var = this.k) == null) {
            e();
            return;
        }
        this.t = true;
        int i = this.p;
        sm3Var.d();
        sm3 sm3Var2 = this.k;
        DictationLid.i(500, new wg((Object) this, i, (byte) 7), a(), sm3Var2.b(0, sm3Var2.c()));
    }
}
