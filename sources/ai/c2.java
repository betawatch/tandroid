package ai;

import android.content.Context;
import android.content.Intent;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c2 {
    public static final int[] l0 = {1000, 2000, 5000, 10000};
    public static final String[][] m0 = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public w A;
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public ParcelFileDescriptor J;
    public Thread K;
    public z L;
    public String M;
    public boolean N;
    public ArrayList O;
    public int P;
    public int Q;
    public final x1 R;
    public final ArrayList S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public final o1 X;
    public boolean Y;
    public int Z;
    public final Context a;
    public int a0;
    public final int b;
    public int b0;
    public final long c;
    public int c0;
    public final a2 d;
    public int d0;
    public final boolean e;
    public boolean e0;
    public final Handler f = new Handler(Looper.getMainLooper());
    public String f0;
    public final i2 g;
    public final x1 g0;
    public SpeechRecognizer h;
    public long h0;
    public boolean i;
    public final x1 i0;
    public boolean j;
    public long j0;
    public int k;
    public long k0;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p;
    public ArrayList q;
    public String r;
    public int s;
    public int t;
    public z u;
    public y v;
    public int w;
    public int x;
    public android.support.v4.media.session.a0 y;
    public boolean z;

    public c2(Context context, int i7, long j3, boolean z10, a2 a2Var) {
        i2 i2Var = new i2();
        this.g = i2Var;
        this.q = new ArrayList();
        this.t = -1;
        this.x = -1;
        this.B = "";
        this.R = new x1(this, 0);
        this.S = new ArrayList();
        this.W = -1;
        this.X = new o1(this, 3);
        this.g0 = new x1(this, 1);
        this.i0 = new x1(this, 2);
        this.a = context.getApplicationContext();
        this.b = i7;
        this.c = j3;
        this.e = z10;
        this.d = a2Var;
        i2Var.g = new a3.l(13);
    }

    public static String a(Bundle bundle) {
        ArrayList<String> stringArrayList;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || stringArrayList.isEmpty()) {
            return null;
        }
        return stringArrayList.get(0);
    }

    public final void b(Runnable runnable, long j3) {
        this.k0 += j3;
        this.f.postAtTime(new a1.e(18, this, runnable), SystemClock.uptimeMillis() + this.k0);
    }

    public final void c() {
        this.j = true;
        this.f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.l = true;
        }
        d();
        Thread thread = this.K;
        if (thread != null) {
            thread.interrupt();
            this.K = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.J;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused) {
            }
            this.J = null;
        }
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.u;
        if (zVar != null) {
            zVar.d();
            this.u = null;
        }
    }

    public final void d() {
        SpeechRecognizer speechRecognizer = this.h;
        if (speechRecognizer != null) {
            try {
                speechRecognizer.cancel();
            } catch (Exception unused) {
            }
            try {
                this.h.destroy();
            } catch (Exception unused2) {
            }
            this.h = null;
        }
    }

    public final void e() {
        this.d.r(q(this.g.n()));
        Handler handler = this.f;
        o1 o1Var = this.X;
        handler.removeCallbacks(o1Var);
        if (!this.V || this.j || this.i) {
            return;
        }
        handler.postDelayed(o1Var, 2000L);
    }

    public final void f(String str) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.l = true;
        }
        d();
        Thread thread = this.K;
        if (thread != null) {
            thread.interrupt();
            this.K = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.J;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused) {
            }
            this.J = null;
        }
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.u;
        if (zVar != null) {
            zVar.d();
            this.u = null;
        }
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.b).cancelRequest(this.W, true);
        }
        String q10 = this.z ? this.B : q(this.g.n());
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.k);
        u10.append(" chars=");
        u10.append(q10.length());
        Log.d("Dictation", u10.toString());
        this.d.a(q10, str);
    }

    public final void g() {
        w wVar = this.A;
        if (wVar != null) {
            wVar.o = new o1(this, 4);
            wVar.k = true;
        } else {
            z zVar = this.u;
            if (zVar != null) {
                zVar.d();
            }
        }
    }

    public final boolean h(String str) {
        String str2;
        String str3;
        if (DictationAsr.x() && d.h() && Build.VERSION.SDK_INT >= 33 && this.u != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.q;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String str4 = (String) obj;
                if (DictationAsr.R(Locale.forLanguageTag(str4.replace('_', '-')).getLanguage(), this.y, false) == null) {
                    arrayList.add(str4);
                }
            }
            if (!arrayList.isEmpty()) {
                if (str != null && !"other".equals(str)) {
                    HashMap hashMap = u0.a;
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            str2 = (String) obj2;
                            if (str2.equalsIgnoreCase(str)) {
                                break;
                            }
                        } else {
                            int size3 = arrayList.size();
                            int i11 = 0;
                            while (i11 < size3) {
                                Object obj3 = arrayList.get(i11);
                                i11++;
                                str2 = (String) obj3;
                                if (u0.c(str2, str)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                str2 = null;
                if (str2 != null) {
                    arrayList.remove(str2);
                    arrayList.add(0, str2);
                }
                String str5 = (String) arrayList.get(0);
                if (arrayList.size() <= 1) {
                    arrayList = null;
                }
                this.O = arrayList;
                StringBuilder sb2 = new StringBuilder("tinyasr → Google in ");
                sb2.append(str5);
                if (this.O != null) {
                    str3 = " detecting among " + this.O;
                } else {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(" (tinylid: ");
                sb2.append(str);
                sb2.append(", no model for it)");
                Log.d("Dictation", sb2.toString());
                this.C++;
                w wVar = this.A;
                if (wVar != null) {
                    wVar.l = true;
                    this.A = null;
                }
                this.f.removeCallbacks(this.R);
                this.z = false;
                this.B = "";
                this.d.M(0, "");
                r(str5);
                v(str5, "tinylid: no model");
                this.x = 0;
                this.Z = 0;
                t();
                return true;
            }
        }
        return false;
    }

    public final void i(int i7, int i10) {
        String str;
        int i11;
        int i12;
        if (this.j || i7 == this.t) {
            return;
        }
        i2 i2Var = this.g;
        boolean z10 = i2Var.h(i7) || i7 == this.k;
        StringBuilder n10 = i5.c.n("session ", i7, " onError ", i10, " (");
        switch (i10) {
            case 1:
                str = "NETWORK_TIMEOUT";
                break;
            case 2:
                str = "NETWORK";
                break;
            case 3:
                str = "AUDIO";
                break;
            case 4:
                str = "SERVER";
                break;
            case 5:
                str = "CLIENT";
                break;
            case 6:
                str = "SPEECH_TIMEOUT";
                break;
            case 7:
                str = "NO_MATCH";
                break;
            case 8:
                str = "BUSY";
                break;
            case 9:
                str = "PERMISSIONS";
                break;
            case 10:
                str = "TOO_MANY_REQUESTS";
                break;
            case 11:
                str = "SERVER_DISCONNECTED";
                break;
            case 12:
                str = "LANGUAGE_NOT_SUPPORTED";
                break;
            case 13:
                str = "LANGUAGE_UNAVAILABLE";
                break;
            default:
                str = "?";
                break;
        }
        n10.append(str);
        n10.append(")");
        n10.append(z10 ? "" : " (stale, ignored)");
        n10.append(" stop=");
        n10.append(this.i);
        n10.append(" after ");
        n10.append(SystemClock.elapsedRealtime() - this.o);
        n10.append(" ms");
        Log.d("Dictation", n10.toString());
        if (z10) {
            if (i2Var.b.isEmpty() && i2Var.c.isEmpty() && SystemClock.elapsedRealtime() - this.o < 1000 && i10 != 7 && i10 != 6) {
                this.x = this.w;
            }
            i2Var.g(i7, "error " + i10);
            e();
            this.p = SystemClock.elapsedRealtime();
            if (this.i && !l()) {
                f(null);
                return;
            }
            if (this.e) {
                return;
            }
            if (i10 == 7 || i10 == 6) {
                boolean z11 = SystemClock.elapsedRealtime() - this.o < 1000;
                int i13 = z11 ? this.m + 1 : 0;
                this.m = i13;
                n(i7, z11 ? Math.min(1000L, i13 * 120) : 0L);
                return;
            }
            if (i10 == 11 && (i12 = this.l) < 4) {
                this.l = i12 + 1;
                d();
                n(i7, 300L);
            } else if ((i10 == 12 || i10 == 13) && (i11 = this.n) < 2) {
                this.n = i11 + 1;
                d();
                n(i7, 60L);
            } else if (i10 != 8 && i10 != 5) {
                f((i10 == 1 || i10 == 2) ? "No connection for speech recognition" : i10 != 3 ? i10 != 9 ? (i10 == 12 || i10 == 13) ? "Speech recognition language isn't available" : i5.c.j(i10, "Speech recognition stopped (", ")") : "Microphone permission needed" : "Microphone error");
            } else {
                d();
                n(i7, 250L);
            }
        }
    }

    public final void j(int i7, String str) {
        boolean z10;
        if (this.j || i7 == this.t) {
            return;
        }
        i2 i2Var = this.g;
        boolean h = i2Var.h(i7);
        StringBuilder m10 = i5.c.m(i7, "session ", " onResults \"");
        m10.append(i2.c(str));
        m10.append("\"");
        r.b.t(m10, h ? "" : " (stale)", "Dictation");
        if (h) {
            if (i2Var.h(i7)) {
                String n10 = i2Var.n();
                String trim = str == null ? "" : str.trim();
                if (!trim.isEmpty()) {
                    ArrayList o4 = i2.o(trim);
                    ArrayList o10 = i2.o(i2Var.b);
                    if (o10.isEmpty() || !i2.m(o4, o10, Math.min(3, o10.size()))) {
                        i2Var.a(trim, i2Var.d);
                    } else {
                        i2Var.b = "";
                        i2Var.c = trim;
                    }
                }
                i2Var.d("final");
                z10 = !n10.equals(i2Var.n());
            } else {
                StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                m11.append(i2Var.e);
                m11.append(", open ");
                m11.append(i2Var.f);
                m11.append("): ");
                m11.append(i2.c(str));
                i2Var.j(m11.toString());
                z10 = false;
            }
            if (z10) {
                e();
            }
            this.p = SystemClock.elapsedRealtime();
            if (!this.i || l()) {
                n(i7, 0L);
            } else {
                f(null);
            }
        }
    }

    public final void k(int i7, String str) {
        if (this.j) {
            return;
        }
        i2 i2Var = this.g;
        boolean z10 = false;
        if (!i2Var.h(i7)) {
            StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
            m10.append(i2Var.e);
            m10.append(", open ");
            m10.append(i2Var.f);
            m10.append("): ");
            m10.append(i2.c(str));
            i2Var.j(m10.toString());
        } else if (str != null) {
            String n10 = i2Var.n();
            String trim = str.trim();
            if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                z10 = true;
            }
            i2Var.a(trim, z10);
            z10 = !n10.equals(i2Var.n());
        }
        if (z10 && !this.i) {
            e();
        }
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        r(this.r);
    }

    public final boolean l() {
        y yVar;
        return this.N && (yVar = this.v) != null && this.u != null && yVar.d < this.u.c() + (-3200);
    }

    public final void m() {
        AudioRecord audioRecord;
        if (this.e || this.u != null || this.j) {
            return;
        }
        z zVar = this.L;
        if (zVar != null) {
            this.u = zVar;
            zVar.g = new u1(this, 0);
            this.y = DictationAsr.P(u0.b(this.a, this.c), true);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            File externalFilesDir = this.a.getExternalFilesDir(null);
            File file = externalFilesDir == null ? null : new File(externalFilesDir, "dictation_test.pcm");
            if (file != null && file.exists()) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    this.J = createPipe[0];
                    ParcelFileDescriptor parcelFileDescriptor = createPipe[1];
                    Log.d("Dictation", "test source: " + file + " (" + file.length() + " bytes)");
                    Thread thread = new Thread(new a1.e(19, file, parcelFileDescriptor), "DictationTestFeeder");
                    this.K = thread;
                    thread.start();
                } catch (Exception e10) {
                    Log.e("Dictation", "test source", e10);
                    this.J = null;
                }
            }
        }
        android.support.v4.media.session.a0 P = DictationAsr.P(u0.b(this.a, this.c), true);
        this.y = P;
        if ((Build.VERSION.SDK_INT >= 33 || P != null) && this.J == null) {
            z zVar2 = new z();
            this.u = zVar2;
            u1 u1Var = new u1(this, 1);
            try {
                audioRecord = new AudioRecord(6, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 16, 2, Math.max(AudioRecord.getMinBufferSize(androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 16, 2), 12800));
                zVar2.e = audioRecord;
            } catch (Exception e11) {
                Log.e("Dictation", "audio capture", e11);
                AudioRecord audioRecord2 = zVar2.e;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                zVar2.e = null;
            }
            if (audioRecord.getState() != 1) {
                zVar2.e.release();
                zVar2.e = null;
                Log.d("Dictation", "own audio capture unavailable → the recogniser's microphone");
                this.u = null;
                return;
            }
            zVar2.e.startRecording();
            Thread thread2 = new Thread(new a1.e(12, zVar2, u1Var), "DictationAudio");
            zVar2.f = thread2;
            thread2.start();
        }
    }

    public final void n(int i7, long j3) {
        if (this.j) {
            return;
        }
        if ((!this.i || l()) && !this.e) {
            this.f.postDelayed(new m1(this, i7, 0), j3);
        }
    }

    public final void o(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.C + 1;
        this.C = i7;
        this.y = a0Var;
        DictationAsr.V((t) a0Var.b, new u() { // from class: ai.p1
            @Override // ai.u
            public final void a(boolean z10) {
                c2 c2Var = c2.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (c2Var.j || i10 != c2Var.C) {
                    return;
                }
                if (!z10) {
                    c2Var.f("Couldn't download the speech recognition model");
                    return;
                }
                w wVar = c2Var.A;
                if (wVar != null) {
                    wVar.l = true;
                }
                w wVar2 = new w(c2Var.u, a0Var2, new r1(c2Var, i10, a0Var2, 0));
                c2Var.A = wVar2;
                new Thread(new a3.f(wVar2, 4), "DictationAsr").start();
                if (c2Var.i) {
                    c2Var.g();
                }
            }
        });
    }

    public final void p(String str) {
        t H;
        if (this.j || !this.z || this.u == null || (H = DictationAsr.H(str)) == null) {
            return;
        }
        this.D = false;
        this.f.removeCallbacks(this.R);
        r(str);
        o(new android.support.v4.media.session.a0(H, str, this.q, false, 7));
    }

    public final String q(String str) {
        ArrayList arrayList = this.S;
        if (arrayList.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            int i11 = z1Var.a;
            int i12 = z1Var.a;
            String str2 = z1Var.b;
            if (i11 >= i7 && str.startsWith(str2, i11)) {
                sb2.append((CharSequence) str, i7, i12);
                sb2.append(z1Var.c);
                i7 = str2.length() + i12;
            }
        }
        sb2.append((CharSequence) str, Math.min(i7, str.length()), str.length());
        return sb2.toString();
    }

    public final void r(String str) {
        if (str == null || u0.c(str, this.M)) {
            return;
        }
        this.M = str;
        this.d.P(str);
    }

    public final void s() {
        String str;
        long j3;
        final int i7;
        final int i10;
        StringBuilder sb2 = new StringBuilder("start ");
        boolean z10 = this.e;
        sb2.append(z10 ? "SIMULATED" : "real");
        sb2.append(" sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(" locale=");
        sb2.append(Locale.getDefault());
        char c10 = ' ';
        if (this.u != null) {
            str = " (captured " + (this.u.c() / 32) + " ms already)";
        } else {
            str = "";
        }
        r.b.t(sb2, str, "Dictation");
        final int i11 = 1;
        Handler handler = this.f;
        final int i12 = 0;
        if (!z10) {
            if (this.u == null && this.J == null) {
                m();
            }
            long j10 = this.c;
            Context context = this.a;
            this.q = u0.b(context, j10);
            android.support.v4.media.session.a0 a0Var = this.y;
            boolean z11 = (a0Var == null || this.u == null) ? false : true;
            this.z = z11;
            if (!z11) {
                if (a0Var != null) {
                    f("Microphone error");
                    return;
                }
                if (!DictationAsr.x()) {
                    f("Speech recognition isn't available");
                    return;
                }
                if (this.u != null) {
                    DictationLid.k(context);
                    handler.postDelayed(this.g0, 700L);
                }
                Log.d("Dictation", "language candidates " + this.q);
                v(this.q.isEmpty() ? null : (String) this.q.get(0), "start");
                t();
                return;
            }
            boolean v = DictationAsr.v();
            this.D = v;
            if (v) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.v()) {
                    DictationLid.d(context);
                }
                String string = np.e1().getString("tinylid_lang", null);
                android.support.v4.media.session.a0 R = string != null ? DictationAsr.R(string, this.y, false) : null;
                if (R != null) {
                    this.y = R;
                }
                handler.postDelayed(this.R, 700L);
            } else {
                r(this.y.i());
            }
            StringBuilder sb3 = new StringBuilder("tinyasr route: ");
            sb3.append(this.y);
            sb3.append(" (candidates ");
            sb3.append(this.q);
            sb3.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb3.append(np.e1().getString("tinylid_lang", null));
            sb3.append(")");
            Log.d("Dictation", sb3.toString());
            o(this.y);
            return;
        }
        this.j0 = SystemClock.elapsedRealtime();
        long j11 = 0;
        this.k0 = 0L;
        handler.post(this.i0);
        b(new o(28), 500L);
        int i13 = 0;
        while (i13 < 5) {
            final int i14 = i13 + 1;
            String[] strArr = m0[i13];
            String str2 = strArr[0];
            final String str3 = strArr[i11];
            int i15 = 2;
            b(new m1(this, i14, 2), i13 == 0 ? j11 : 140L);
            if (i13 == 2) {
                b(new o1(this, 6), 60L);
            }
            int i16 = 3;
            if (str2.equals("~")) {
                b(new m1(this, i14, 3), 5000L);
            } else {
                String[] split = str2.split(" \\| ");
                int length = split.length;
                int i17 = 0;
                while (i17 < length) {
                    String[] split2 = split[i17].split(" ");
                    StringBuilder sb4 = new StringBuilder();
                    int i18 = 0;
                    while (i18 < split2.length) {
                        if (i18 > 0) {
                            sb4.append(c10);
                        }
                        sb4.append(split2[i18]);
                        final String sb5 = sb4.toString();
                        if (i13 == i16) {
                            j3 = split2[i18].equals("now") ? ns.X4 : split2[i18].equals("text") ? 800 : split2[i18].equals("word") ? 1100 : split2[i18].equals("pause") ? 1500 : 0;
                        } else {
                            j3 = 0;
                        }
                        int i19 = i18;
                        long length2 = (split2[i18].length() * 24) + j3 + 170 + ((long) (Math.random() * 60.0d));
                        if (split2[i19].equals("feature") || split2[i19].equals("office")) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(sb5.substring(0, sb5.length() - split2[i19].length()));
                            sb6.append(split2[i19].equals("feature") ? "feet" : "offers");
                            final String sb7 = sb6.toString();
                            i7 = 2;
                            b(new Runnable(this) { // from class: ai.n1
                                public final /* synthetic */ c2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i7) {
                                        case 0:
                                            c2 c2Var = this.b;
                                            c2Var.getClass();
                                            c2Var.h0 = SystemClock.elapsedRealtime() + 400;
                                            c2Var.k(i14, sb7);
                                            break;
                                        case 1:
                                            this.b.j(i14, sb7);
                                            break;
                                        case 2:
                                            c2 c2Var2 = this.b;
                                            c2Var2.getClass();
                                            c2Var2.h0 = SystemClock.elapsedRealtime() + 400;
                                            c2Var2.k(i14, sb7);
                                            break;
                                        default:
                                            this.b.k(i14, sb7);
                                            break;
                                    }
                                }
                            }, length2);
                            i10 = 3;
                            b(new Runnable(this) { // from class: ai.n1
                                public final /* synthetic */ c2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            c2 c2Var = this.b;
                                            c2Var.getClass();
                                            c2Var.h0 = SystemClock.elapsedRealtime() + 400;
                                            c2Var.k(i14, sb5);
                                            break;
                                        case 1:
                                            this.b.j(i14, sb5);
                                            break;
                                        case 2:
                                            c2 c2Var2 = this.b;
                                            c2Var2.getClass();
                                            c2Var2.h0 = SystemClock.elapsedRealtime() + 400;
                                            c2Var2.k(i14, sb5);
                                            break;
                                        default:
                                            this.b.k(i14, sb5);
                                            break;
                                    }
                                }
                            }, 180L);
                        } else {
                            b(new Runnable(this) { // from class: ai.n1
                                public final /* synthetic */ c2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            c2 c2Var = this.b;
                                            c2Var.getClass();
                                            c2Var.h0 = SystemClock.elapsedRealtime() + 400;
                                            c2Var.k(i14, sb5);
                                            break;
                                        case 1:
                                            this.b.j(i14, sb5);
                                            break;
                                        case 2:
                                            c2 c2Var2 = this.b;
                                            c2Var2.getClass();
                                            c2Var2.h0 = SystemClock.elapsedRealtime() + 400;
                                            c2Var2.k(i14, sb5);
                                            break;
                                        default:
                                            this.b.k(i14, sb5);
                                            break;
                                    }
                                }
                            }, length2);
                            i10 = 3;
                            i7 = 2;
                        }
                        i18 = i19 + 1;
                        i15 = i7;
                        i16 = i10;
                        c10 = ' ';
                    }
                    b(new o(28), 650L);
                    i17++;
                    i16 = i16;
                    c10 = ' ';
                }
                if (str3.startsWith("!")) {
                    i11 = 1;
                    str3 = str3.substring(1);
                } else {
                    i11 = 1;
                }
                b(new Runnable(this) { // from class: ai.n1
                    public final /* synthetic */ c2 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c2 c2Var = this.b;
                                c2Var.getClass();
                                c2Var.h0 = SystemClock.elapsedRealtime() + 400;
                                c2Var.k(i14, str3);
                                break;
                            case 1:
                                this.b.j(i14, str3);
                                break;
                            case 2:
                                c2 c2Var2 = this.b;
                                c2Var2.getClass();
                                c2Var2.h0 = SystemClock.elapsedRealtime() + 400;
                                c2Var2.k(i14, str3);
                                break;
                            default:
                                this.b.k(i14, str3);
                                break;
                        }
                    }
                }, 900L);
            }
            i13 = i14;
            c10 = ' ';
            j11 = 0;
        }
        b(new o1(this, i12), 1300L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:39|(2:55|(1:57)(9:58|42|(1:44)|45|46|47|48|49|(1:51)))|41|42|(0)|45|46|47|48|49|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        android.util.Log.e("Dictation", "feed", r0);
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        int i7;
        y yVar;
        y yVar2;
        if (this.j) {
            return;
        }
        Context context = this.a;
        if (this.h == null) {
            try {
                if (SpeechRecognizer.isRecognitionAvailable(context)) {
                    this.h = SpeechRecognizer.createSpeechRecognizer(context);
                }
            } catch (Exception e10) {
                Log.e("Dictation", "create recognizer", e10);
                this.h = null;
            }
            if (this.h == null) {
                f("Speech recognition isn't available on this device");
                return;
            }
        }
        int i10 = this.k + 1;
        this.k = i10;
        this.g.b(i10);
        i2 i2Var = this.g;
        boolean z10 = this.u != null;
        if (z10 != this.V) {
            this.V = z10;
            this.f.removeCallbacks(this.X);
            this.T = Math.max(this.T, (z10 ? i2Var.a.toString() : i2Var.n()).length());
        }
        this.o = SystemClock.elapsedRealtime();
        StringBuilder m10 = i5.c.m(i10, "session ", " start lang=");
        int i11 = this.n;
        String str = "en-US";
        m10.append(i11 == 0 ? this.r : i11 == 2 ? "en-US" : null);
        m10.append(this.p > 0 ? a8.p0.r(new StringBuilder(" gap="), this.o - this.p, "ms") : "");
        r.b.t(m10, this.J != null ? " source=test-file" : "", "Dictation");
        this.h.setRecognitionListener(new b2(this, i10));
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        int i12 = this.n;
        if (i12 == 0) {
            str = this.r;
        } else if (i12 != 2) {
            str = null;
        }
        if (str != null) {
            intent.putExtra("android.speech.extra.LANGUAGE", str);
        }
        intent.putExtra("android.speech.extra.PREFER_OFFLINE", false);
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        if (this.O != null && this.n == 0 && Build.VERSION.SDK_INT >= 34) {
            intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION", true);
            intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_DETECTION_ALLOWED_LANGUAGES", this.O);
            intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH", "balanced");
            intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_SWITCH_ALLOWED_LANGUAGES", this.O);
        }
        if (this.u != null) {
            int i13 = this.x;
            if (i13 < 0) {
                y yVar3 = this.v;
                if (yVar3 != null) {
                    i13 = yVar3.d;
                } else {
                    i7 = 0;
                    this.x = -1;
                    yVar = this.v;
                    if (yVar != null) {
                        yVar.a();
                    }
                    z zVar = this.u;
                    zVar.getClass();
                    yVar2 = new y(zVar, Math.max(0, Math.min(i7, zVar.c())), 48000, 64);
                    this.v = yVar2;
                    this.w = i7;
                    if (yVar2 != null) {
                        intent.putExtra("android.speech.extra.AUDIO_SOURCE", yVar2.a);
                        intent.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                        intent.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                        intent.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE);
                        Log.d("Dictation", "session " + this.k + " audio from " + ((i7 * 1000) / 32000) + " ms (captured " + ((this.u.c() * 1000) / 32000) + " ms)");
                    }
                }
            }
            i7 = i13;
            this.x = -1;
            yVar = this.v;
            if (yVar != null) {
            }
            z zVar2 = this.u;
            zVar2.getClass();
            yVar2 = new y(zVar2, Math.max(0, Math.min(i7, zVar2.c())), 48000, 64);
            this.v = yVar2;
            this.w = i7;
            if (yVar2 != null) {
            }
        }
        if (this.u == null) {
            intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 3000);
            intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", 2500);
            intent.putExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", 15000);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intent.putExtra("android.speech.extra.HIDE_PARTIAL_TRAILING_PUNCTUATION", false);
            intent.putExtra("android.speech.extra.MASK_OFFENSIVE_WORDS", false);
            ParcelFileDescriptor parcelFileDescriptor = this.J;
            if (parcelFileDescriptor != null) {
                intent.putExtra("android.speech.extra.AUDIO_SOURCE", parcelFileDescriptor);
                intent.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                intent.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                intent.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE);
            }
        }
        try {
            this.h.startListening(intent);
        } catch (Exception e11) {
            Log.e("Dictation", "startListening", e11);
            f("Couldn't start speech recognition");
        }
    }

    public final void u() {
        z zVar;
        if (this.j) {
            return;
        }
        this.i = true;
        Log.d("Dictation", "stop requested (session " + this.k + ")");
        boolean z10 = this.e;
        Handler handler = this.f;
        i2 i2Var = this.g;
        if (z10) {
            handler.removeCallbacksAndMessages(null);
            i2Var.g(this.k, "stop");
            e();
            handler.postDelayed(new o1(this, 2), 350L);
            return;
        }
        if (this.z) {
            if (!this.D || this.F || this.G || !DictationLid.f() || (zVar = this.u) == null) {
                g();
                return;
            }
            this.G = true;
            int i7 = this.C;
            zVar.d();
            z zVar2 = this.u;
            DictationLid.j(zVar2.b(0, zVar2.c()), 500, new s1(this, i7, 0));
            return;
        }
        if (i2Var.b.isEmpty() && i2Var.c.isEmpty()) {
            Log.d("Dictation", "stop: current session is empty → finish now");
            i2Var.g(this.k, "stop-empty");
            f(null);
        } else {
            try {
                SpeechRecognizer speechRecognizer = this.h;
                if (speechRecognizer != null) {
                    speechRecognizer.stopListening();
                }
            } catch (Exception e10) {
                Log.e("Dictation", "stopListening", e10);
            }
            handler.postDelayed(new o1(this, 1), 1600L);
        }
    }

    public final void v(String str, String str2) {
        this.n = 0;
        this.r = str;
        Log.d("Dictation", r.b.l("language ", str, " (", str2, ")"));
    }
}
