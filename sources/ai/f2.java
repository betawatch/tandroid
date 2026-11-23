package ai;

import android.content.Context;
import android.content.Intent;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f2 {
    public static final int[] j0 = {1000, 2000, 5000, 10000};
    public static final String[][] k0 = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public w A;
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public z J;
    public String K;
    public boolean L;
    public ArrayList M;
    public int N;
    public int O;
    public final a2 P;
    public final ArrayList Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public final r1 V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;
    public final Context a;
    public int a0;
    public final int b;
    public int b0;
    public final long c;
    public boolean c0;
    public final d2 d;
    public String d0;
    public final boolean e;
    public final a2 e0;
    public final Handler f = new Handler(Looper.getMainLooper());
    public long f0;
    public final l2 g;
    public final a2 g0;
    public SpeechRecognizer h;
    public long h0;
    public boolean i;
    public long i0;
    public boolean j;
    public int k;
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

    public f2(Context context, int i7, long j3, boolean z10, d2 d2Var) {
        l2 l2Var = new l2();
        this.g = l2Var;
        this.q = new ArrayList();
        this.t = -1;
        this.x = -1;
        this.B = "";
        this.P = new a2(this, 0);
        this.Q = new ArrayList();
        this.U = -1;
        this.V = new r1(this, 3);
        this.e0 = new a2(this, 1);
        this.g0 = new a2(this, 2);
        this.a = context.getApplicationContext();
        this.b = i7;
        this.c = j3;
        this.e = z10;
        this.d = d2Var;
        l2Var.g = new a3.l(13);
    }

    public static String a(Bundle bundle) {
        ArrayList<String> stringArrayList;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || stringArrayList.isEmpty()) {
            return null;
        }
        return stringArrayList.get(0);
    }

    public final String b() {
        String[] strArr = DictationLid.d;
        android.support.v4.media.session.a0 a0Var = this.y;
        t[] tVarArr = DictationAsr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = (List) a0Var.d;
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.I(str, a0Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void c(Runnable runnable, long j3) {
        this.i0 += j3;
        this.f.postAtTime(new a1.e(17, this, runnable), SystemClock.uptimeMillis() + this.i0);
    }

    public final void d() {
        this.j = true;
        this.f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.l = true;
        }
        e();
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

    public final void e() {
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

    public final void f() {
        this.d.i(r(this.g.n()));
        Handler handler = this.f;
        r1 r1Var = this.V;
        handler.removeCallbacks(r1Var);
        if (!this.T || this.j || this.i) {
            return;
        }
        handler.postDelayed(r1Var, 2000L);
    }

    public final void g(String str) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.l = true;
        }
        e();
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
        if (this.U >= 0) {
            ConnectionsManager.getInstance(this.b).cancelRequest(this.U, true);
        }
        String r10 = this.z ? this.B : r(this.g.n());
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.k);
        u10.append(" chars=");
        u10.append(r10.length());
        Log.d("Dictation", u10.toString());
        this.d.a(r10, str);
    }

    public final void h() {
        w wVar = this.A;
        if (wVar != null) {
            wVar.o = new r1(this, 4);
            wVar.k = true;
        } else {
            z zVar = this.u;
            if (zVar != null) {
                zVar.d();
            }
        }
    }

    public final boolean i(String str) {
        String str2;
        String str3;
        if (DictationAsr.z(this.c) && d.i() && Build.VERSION.SDK_INT >= 33 && this.u != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.q;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String str4 = (String) obj;
                if (DictationAsr.V(Locale.forLanguageTag(str4.replace('_', '-')).getLanguage(), this.y, false) == null) {
                    arrayList.add(str4);
                }
            }
            if (!arrayList.isEmpty()) {
                if (str != null && !"other".equals(str)) {
                    HashMap hashMap = w0.a;
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
                                if (w0.d(str2, str)) {
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
                this.M = arrayList;
                StringBuilder sb2 = new StringBuilder("tinyasr → Google in ");
                sb2.append(str5);
                if (this.M != null) {
                    str3 = " detecting among " + this.M;
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
                this.f.removeCallbacks(this.P);
                this.z = false;
                this.B = "";
                this.d.l(0, "");
                s(str5);
                w(str5, "tinylid: no model");
                this.x = 0;
                this.X = 0;
                u();
                return true;
            }
        }
        return false;
    }

    public final void j(int i7, int i10) {
        String str;
        int i11;
        int i12;
        if (this.j || i7 == this.t) {
            return;
        }
        l2 l2Var = this.g;
        boolean z10 = l2Var.h(i7) || i7 == this.k;
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
            if (l2Var.b.isEmpty() && l2Var.c.isEmpty() && SystemClock.elapsedRealtime() - this.o < 1000 && i10 != 7 && i10 != 6) {
                this.x = this.w;
            }
            l2Var.g(i7, "error " + i10);
            f();
            this.p = SystemClock.elapsedRealtime();
            if (this.i && !m()) {
                g(null);
                return;
            }
            if (this.e) {
                return;
            }
            if (i10 == 7 || i10 == 6) {
                boolean z11 = SystemClock.elapsedRealtime() - this.o < 1000;
                int i13 = z11 ? this.m + 1 : 0;
                this.m = i13;
                o(i7, z11 ? Math.min(1000L, i13 * 120) : 0L);
                return;
            }
            if (i10 == 11 && (i12 = this.l) < 4) {
                this.l = i12 + 1;
                e();
                o(i7, 300L);
            } else if ((i10 == 12 || i10 == 13) && (i11 = this.n) < 2) {
                this.n = i11 + 1;
                e();
                o(i7, 60L);
            } else if (i10 != 8 && i10 != 5) {
                g((i10 == 1 || i10 == 2) ? "no connection for speech recognition" : i10 != 3 ? i10 != 9 ? (i10 == 12 || i10 == 13) ? "speech recognition language unavailable" : i5.c.j(i10, "speech recognition stopped (", ")") : "microphone permission needed" : "microphone error");
            } else {
                e();
                o(i7, 250L);
            }
        }
    }

    public final void k(int i7, String str) {
        boolean z10;
        if (this.j || i7 == this.t) {
            return;
        }
        l2 l2Var = this.g;
        boolean h = l2Var.h(i7);
        StringBuilder m10 = i5.c.m(i7, "session ", " onResults ");
        m10.append(l2.c(str));
        p5.c.t(m10, h ? "" : " (stale)", "Dictation");
        if (h) {
            if (l2Var.h(i7)) {
                String n10 = l2Var.n();
                String trim = str == null ? "" : str.trim();
                if (!trim.isEmpty()) {
                    ArrayList o4 = l2.o(trim);
                    ArrayList o10 = l2.o(l2Var.b);
                    if (o10.isEmpty() || !l2.m(o4, o10, Math.min(3, o10.size()))) {
                        l2Var.a(trim, l2Var.d);
                    } else {
                        l2Var.b = "";
                        l2Var.c = trim;
                    }
                }
                l2Var.d("final");
                z10 = !n10.equals(l2Var.n());
            } else {
                StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                m11.append(l2Var.e);
                m11.append(", open ");
                m11.append(l2Var.f);
                m11.append("): ");
                m11.append(l2.c(str));
                l2Var.j(m11.toString());
                z10 = false;
            }
            if (z10) {
                f();
            }
            this.p = SystemClock.elapsedRealtime();
            if (!this.i || m()) {
                o(i7, 0L);
            } else {
                g(null);
            }
        }
    }

    public final void l(int i7, String str) {
        if (this.j) {
            return;
        }
        l2 l2Var = this.g;
        boolean z10 = false;
        if (!l2Var.h(i7)) {
            StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
            m10.append(l2Var.e);
            m10.append(", open ");
            m10.append(l2Var.f);
            m10.append("): ");
            m10.append(l2.c(str));
            l2Var.j(m10.toString());
        } else if (str != null) {
            String n10 = l2Var.n();
            String trim = str.trim();
            if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                z10 = true;
            }
            l2Var.a(trim, z10);
            z10 = !n10.equals(l2Var.n());
        }
        if (z10 && !this.i) {
            f();
        }
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        s(this.r);
    }

    public final boolean m() {
        y yVar;
        return this.L && (yVar = this.v) != null && this.u != null && yVar.d < this.u.c() + (-3200);
    }

    public final void n() {
        AudioRecord audioRecord;
        if (this.e || this.u != null || this.j) {
            return;
        }
        z zVar = this.J;
        if (zVar != null) {
            this.u = zVar;
            zVar.g = new x1(this, 0);
            this.y = DictationAsr.T(w0.c(this.a, this.c), DictationAsr.z(this.c));
            return;
        }
        android.support.v4.media.session.a0 T = DictationAsr.T(w0.c(this.a, this.c), DictationAsr.z(this.c));
        this.y = T;
        if (Build.VERSION.SDK_INT >= 33 || T != null) {
            z zVar2 = new z();
            this.u = zVar2;
            x1 x1Var = new x1(this, 1);
            try {
                audioRecord = new AudioRecord(6, androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 16, 2, Math.max(AudioRecord.getMinBufferSize(androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE, 16, 2), 12800));
                zVar2.e = audioRecord;
            } catch (Exception e10) {
                Log.e("Dictation", "audio capture", e10);
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
            Thread thread = new Thread(new a1.e(11, zVar2, x1Var), "DictationAudio");
            zVar2.f = thread;
            thread.start();
        }
    }

    public final void o(int i7, long j3) {
        if (this.j) {
            return;
        }
        if ((!this.i || m()) && !this.e) {
            this.f.postDelayed(new p1(this, i7, 0), j3);
        }
    }

    public final void p(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.C + 1;
        this.C = i7;
        this.y = a0Var;
        DictationAsr.f0((t) a0Var.b, new u() { // from class: ai.s1
            @Override // ai.u
            public final void a(boolean z10) {
                f2 f2Var = f2.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (f2Var.j || i10 != f2Var.C) {
                    return;
                }
                if (!z10) {
                    f2Var.g("speech model download failed");
                    return;
                }
                w wVar = f2Var.A;
                if (wVar != null) {
                    wVar.l = true;
                }
                w wVar2 = new w(f2Var.u, a0Var2, new u1(f2Var, i10, a0Var2, 0));
                f2Var.A = wVar2;
                new Thread(new a3.f(wVar2, 5), "DictationAsr").start();
                if (f2Var.i) {
                    f2Var.h();
                }
            }
        });
    }

    public final void q(String str) {
        t J;
        if (this.j || !this.z || this.u == null || (J = DictationAsr.J(str)) == null) {
            return;
        }
        this.D = false;
        this.f.removeCallbacks(this.P);
        s(str);
        p(new android.support.v4.media.session.a0(J, str, this.q, false, 7));
    }

    public final String r(String str) {
        ArrayList arrayList = this.Q;
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
            c2 c2Var = (c2) obj;
            int i11 = c2Var.a;
            int i12 = c2Var.a;
            String str2 = c2Var.b;
            if (i11 >= i7 && str.startsWith(str2, i11)) {
                sb2.append((CharSequence) str, i7, i12);
                sb2.append(c2Var.c);
                i7 = str2.length() + i12;
            }
        }
        sb2.append((CharSequence) str, Math.min(i7, str.length()), str.length());
        return sb2.toString();
    }

    public final void s(String str) {
        if (str == null || w0.d(str, this.K)) {
            return;
        }
        this.K = str;
        this.d.x(str);
    }

    public final void t() {
        String str;
        final String str2;
        int i7;
        long j3;
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
        p5.c.t(sb2, str, "Dictation");
        final int i11 = 1;
        Handler handler = this.f;
        final int i12 = 0;
        if (!z10) {
            if (this.u == null) {
                n();
            }
            Context context = this.a;
            long j10 = this.c;
            this.q = w0.c(context, j10);
            android.support.v4.media.session.a0 a0Var = this.y;
            boolean z11 = (a0Var == null || this.u == null) ? false : true;
            this.z = z11;
            if (!z11) {
                if (a0Var != null) {
                    g("microphone error");
                    return;
                }
                if (!DictationAsr.z(j10)) {
                    g("speech recognition unavailable");
                    return;
                }
                if (this.u != null) {
                    DictationLid.k(context);
                    handler.postDelayed(this.e0, 700L);
                }
                Log.d("Dictation", "language candidates " + this.q);
                w(this.q.isEmpty() ? null : (String) this.q.get(0), "start");
                u();
                return;
            }
            boolean x10 = DictationAsr.x();
            this.D = x10;
            if (x10) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.d(context);
                }
                String string = np.g1().getString("tinylid_lang", null);
                android.support.v4.media.session.a0 V = string != null ? DictationAsr.V(string, this.y, false) : null;
                if (V != null) {
                    this.y = V;
                }
                handler.postDelayed(this.P, 700L);
            } else {
                s(this.y.i());
            }
            StringBuilder sb3 = new StringBuilder("tinyasr route: ");
            sb3.append(this.y);
            sb3.append(" (candidates ");
            sb3.append(this.q);
            sb3.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb3.append(np.g1().getString("tinylid_lang", null));
            sb3.append(")");
            Log.d("Dictation", sb3.toString());
            p(this.y);
            return;
        }
        this.h0 = SystemClock.elapsedRealtime();
        long j11 = 0;
        this.i0 = 0L;
        handler.post(this.g0);
        c(new org.telegram.messenger.j2(0), 500L);
        int i13 = 0;
        while (i13 < 5) {
            final int i14 = i13 + 1;
            String[] strArr = k0[i13];
            String str3 = strArr[0];
            String str4 = strArr[i11];
            final int i15 = 2;
            c(new p1(this, i14, 2), i13 == 0 ? j11 : 140L);
            if (i13 == 2) {
                c(new r1(this, 6), 60L);
            }
            int i16 = 3;
            if (str3.equals("~")) {
                c(new p1(this, i14, 3), 5000L);
            } else {
                String[] split = str3.split(" \\| ");
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
                            i7 = i17;
                            j3 = split2[i18].equals("now") ? ls.X4 : split2[i18].equals("text") ? 800 : split2[i18].equals("word") ? 1100 : split2[i18].equals("pause") ? 1500 : 0;
                        } else {
                            i7 = i17;
                            j3 = 0;
                        }
                        String str5 = str4;
                        long length2 = (split2[i18].length() * 24) + j3 + 170 + ((long) (Math.random() * 60.0d));
                        if (split2[i18].equals("feature") || split2[i18].equals("office")) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(sb5.substring(0, sb5.length() - split2[i18].length()));
                            sb6.append(split2[i18].equals("feature") ? "feet" : "offers");
                            final String sb7 = sb6.toString();
                            c(new Runnable(this) { // from class: ai.q1
                                public final /* synthetic */ f2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            f2 f2Var = this.b;
                                            f2Var.getClass();
                                            f2Var.f0 = SystemClock.elapsedRealtime() + 400;
                                            f2Var.l(i14, sb7);
                                            break;
                                        case 1:
                                            this.b.k(i14, sb7);
                                            break;
                                        case 2:
                                            f2 f2Var2 = this.b;
                                            f2Var2.getClass();
                                            f2Var2.f0 = SystemClock.elapsedRealtime() + 400;
                                            f2Var2.l(i14, sb7);
                                            break;
                                        default:
                                            this.b.l(i14, sb7);
                                            break;
                                    }
                                }
                            }, length2);
                            i10 = 3;
                            c(new Runnable(this) { // from class: ai.q1
                                public final /* synthetic */ f2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            f2 f2Var = this.b;
                                            f2Var.getClass();
                                            f2Var.f0 = SystemClock.elapsedRealtime() + 400;
                                            f2Var.l(i14, sb5);
                                            break;
                                        case 1:
                                            this.b.k(i14, sb5);
                                            break;
                                        case 2:
                                            f2 f2Var2 = this.b;
                                            f2Var2.getClass();
                                            f2Var2.f0 = SystemClock.elapsedRealtime() + 400;
                                            f2Var2.l(i14, sb5);
                                            break;
                                        default:
                                            this.b.l(i14, sb5);
                                            break;
                                    }
                                }
                            }, 180L);
                        } else {
                            c(new Runnable(this) { // from class: ai.q1
                                public final /* synthetic */ f2 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            f2 f2Var = this.b;
                                            f2Var.getClass();
                                            f2Var.f0 = SystemClock.elapsedRealtime() + 400;
                                            f2Var.l(i14, sb5);
                                            break;
                                        case 1:
                                            this.b.k(i14, sb5);
                                            break;
                                        case 2:
                                            f2 f2Var2 = this.b;
                                            f2Var2.getClass();
                                            f2Var2.f0 = SystemClock.elapsedRealtime() + 400;
                                            f2Var2.l(i14, sb5);
                                            break;
                                        default:
                                            this.b.l(i14, sb5);
                                            break;
                                    }
                                }
                            }, length2);
                            i10 = 3;
                        }
                        i18++;
                        i16 = i10;
                        i17 = i7;
                        str4 = str5;
                        c10 = ' ';
                    }
                    c(new org.telegram.messenger.j2(0), 650L);
                    i17++;
                    c10 = ' ';
                }
                String str6 = str4;
                if (str6.startsWith("!")) {
                    i11 = 1;
                    str2 = str6.substring(1);
                } else {
                    i11 = 1;
                    str2 = str6;
                }
                c(new Runnable(this) { // from class: ai.q1
                    public final /* synthetic */ f2 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                f2 f2Var = this.b;
                                f2Var.getClass();
                                f2Var.f0 = SystemClock.elapsedRealtime() + 400;
                                f2Var.l(i14, str2);
                                break;
                            case 1:
                                this.b.k(i14, str2);
                                break;
                            case 2:
                                f2 f2Var2 = this.b;
                                f2Var2.getClass();
                                f2Var2.f0 = SystemClock.elapsedRealtime() + 400;
                                f2Var2.l(i14, str2);
                                break;
                            default:
                                this.b.l(i14, str2);
                                break;
                        }
                    }
                }, 900L);
            }
            i13 = i14;
            c10 = ' ';
            j11 = 0;
        }
        c(new r1(this, i12), 1300L);
    }

    public final void u() {
        if (this.j) {
            return;
        }
        Context context = this.a;
        y yVar = null;
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
                g("speech recognition unavailable on this device");
                return;
            }
        }
        int i7 = this.k + 1;
        this.k = i7;
        this.g.b(i7);
        l2 l2Var = this.g;
        boolean z10 = this.u != null;
        if (z10 != this.T) {
            this.T = z10;
            this.f.removeCallbacks(this.V);
            this.R = Math.max(this.R, (z10 ? l2Var.a.toString() : l2Var.n()).length());
        }
        this.o = SystemClock.elapsedRealtime();
        StringBuilder m10 = i5.c.m(i7, "session ", " start lang=");
        int i10 = this.n;
        String str = "en-US";
        m10.append(i10 == 0 ? this.r : i10 == 2 ? "en-US" : null);
        p5.c.t(m10, this.p > 0 ? a8.p0.r(new StringBuilder(" gap="), this.o - this.p, "ms") : "", "Dictation");
        this.h.setRecognitionListener(new e2(this, i7));
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        int i11 = this.n;
        if (i11 == 0) {
            str = this.r;
        } else if (i11 != 2) {
            str = null;
        }
        if (str != null) {
            intent.putExtra("android.speech.extra.LANGUAGE", str);
        }
        intent.putExtra("android.speech.extra.PREFER_OFFLINE", false);
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        if (this.M != null && this.n == 0 && Build.VERSION.SDK_INT >= 34) {
            intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION", true);
            intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_DETECTION_ALLOWED_LANGUAGES", this.M);
            intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH", "balanced");
            intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_SWITCH_ALLOWED_LANGUAGES", this.M);
        }
        if (this.u != null) {
            int i12 = this.x;
            if (i12 < 0) {
                y yVar2 = this.v;
                i12 = yVar2 != null ? yVar2.d : 0;
            }
            this.x = -1;
            y yVar3 = this.v;
            if (yVar3 != null) {
                yVar3.a();
            }
            z zVar = this.u;
            zVar.getClass();
            try {
                yVar = new y(zVar, Math.max(0, Math.min(i12, zVar.c())), 48000, 64);
            } catch (Exception e11) {
                Log.e("Dictation", "feed", e11);
            }
            this.v = yVar;
            this.w = i12;
            if (yVar != null) {
                intent.putExtra("android.speech.extra.AUDIO_SOURCE", yVar.a);
                intent.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                intent.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                intent.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE);
                Log.d("Dictation", "session " + this.k + " audio from " + ((i12 * 1000) / 32000) + " ms (captured " + ((this.u.c() * 1000) / 32000) + " ms)");
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
        }
        try {
            this.h.startListening(intent);
        } catch (Exception e12) {
            Log.e("Dictation", "startListening", e12);
            g("speech recognition failed to start");
        }
    }

    public final void v() {
        z zVar;
        if (this.j) {
            return;
        }
        this.i = true;
        Log.d("Dictation", "stop requested (session " + this.k + ")");
        boolean z10 = this.e;
        Handler handler = this.f;
        l2 l2Var = this.g;
        if (z10) {
            handler.removeCallbacksAndMessages(null);
            l2Var.g(this.k, "stop");
            f();
            handler.postDelayed(new r1(this, 2), 350L);
            return;
        }
        if (!this.z) {
            if (l2Var.b.isEmpty() && l2Var.c.isEmpty()) {
                Log.d("Dictation", "stop: current session is empty → finish now");
                l2Var.g(this.k, "stop-empty");
                g(null);
                return;
            } else {
                try {
                    SpeechRecognizer speechRecognizer = this.h;
                    if (speechRecognizer != null) {
                        speechRecognizer.stopListening();
                    }
                } catch (Exception e10) {
                    Log.e("Dictation", "stopListening", e10);
                }
                handler.postDelayed(new r1(this, 1), 1600L);
                return;
            }
        }
        if (!this.D || this.F || this.G || !DictationLid.f() || (zVar = this.u) == null) {
            h();
            return;
        }
        this.G = true;
        int i7 = this.C;
        zVar.d();
        z zVar2 = this.u;
        DictationLid.j(500, new v1(this, i7, 0), b(), zVar2.b(0, zVar2.c()));
    }

    public final void w(String str, String str2) {
        this.n = 0;
        this.r = str;
        Log.d("Dictation", p5.c.l("language ", str, " (", str2, ")"));
    }
}
