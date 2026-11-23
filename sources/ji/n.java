package ji;

import a8.p0;
import ai.l0;
import ai.q1;
import ai.t;
import ai.v;
import ai.v1;
import ai.w1;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c8.c1;
import c8.na;
import di.p9;
import hi.x8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.vr;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class n implements v1 {
    public static boolean n0;
    public static final HashMap o0 = new HashMap();
    public volatile int E;
    public volatile int F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public e K;
    public long N;
    public long O;
    public boolean T;
    public w1 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context a;
    public final qf b;
    public int b0;
    public v d;
    public r e;
    public String e0;
    public w1 f;
    public int f0;
    public String g0;
    public q h;
    public boolean h0;
    public boolean i0;
    public String l0;
    public long r;
    public long s;
    public volatile long w;
    public volatile long x;
    public volatile int y;
    public int c = 0;
    public String n = "";
    public final j I = new j(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final j W = new j(this, 1);
    public String a0 = "";
    public final int[] c0 = new int[2];
    public final int[] d0 = new int[2];
    public final i j0 = new i(this, 0);
    public final j k0 = new j(this, 2);
    public final i m0 = new i(this, 1);

    public n(Context context, qf qfVar) {
        this.a = context;
        this.b = qfVar;
    }

    public static void b(n nVar, w1 w1Var, String str, int i7) {
        if (w1Var == nVar.f || w1Var == nVar.U) {
            if (!nVar.J) {
                nVar.M(i7, str);
                return;
            }
            int i10 = nVar.c;
            if (i10 == 2 || i10 == 4) {
                nVar.t(w1Var, str);
                nVar.m();
            }
        }
    }

    public static ArrayList u(String[] strArr, boolean z10, w10 w10Var) {
        w10 w10Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            int i10 = i7 + 1;
            ai.q M = DictationAsr.M(str);
            String[] d = M != null ? M.d(str) : new String[0];
            if (d.length < 2) {
                arrayList.add(null);
                w10Var2 = w10Var;
            } else {
                String g02 = DictationAsr.g0(M, str);
                ArrayList arrayList2 = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < d.length; i12++) {
                    arrayList2.add(l0.L(d[i12]));
                    if (!z10 && DictationAsr.B(str) && d[i12].equals(g02)) {
                        i11 = i12;
                    }
                }
                w10Var2 = w10Var;
                arrayList.add(new k(l0.N(g02), arrayList2, i11, new p9(str, d, w10Var2, i10, 2)));
            }
            w10Var = w10Var2;
            i7 = i10;
        }
        return arrayList;
    }

    @Override // ai.v1
    public final void M(int i7, String str) {
        if (this.c != 2) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.n = str;
        q qVar = this.h;
        if (qVar != null) {
            qVar.t(i7, str);
        }
    }

    @Override // ai.v1
    public final void P(String str) {
        String F = str == null ? null : l0.F(str);
        q qVar = this.h;
        if (qVar != null && this.c == 2) {
            qVar.setLanguage(F);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.c == 2) {
            this.l0 = F;
            eVar.setLanguage(F);
        }
    }

    @Override // ai.v1
    public final void a(String str, String str2) {
        if (this.c != 2) {
            return;
        }
        if (!str.isEmpty()) {
            this.n = str;
        }
        StringBuilder u10 = p0.u("recogniser ended error=", str2, " chars=");
        u10.append(this.n.length());
        u10.append(" (the voice recording goes on)");
        Log.d("VoiceLive", u10.toString());
        this.f = null;
        if (vr.k == this) {
            vr.k = null;
        }
        this.d = null;
        this.e = null;
        if (TextUtils.isEmpty(this.n.trim())) {
            q qVar = this.h;
            if (qVar != null) {
                qVar.m();
                return;
            }
            return;
        }
        q qVar2 = this.h;
        if (qVar2 != null) {
            qVar2.setText(this.n);
            this.h.setListening(false);
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public final void d() {
        String d02 = DictationAsr.d0();
        if (d02 == null) {
            return;
        }
        String F = l0.F(d02);
        q qVar = this.h;
        if (qVar != null) {
            qVar.setLanguage(F);
        }
        e eVar = this.K;
        if (eVar == null || !this.J) {
            return;
        }
        this.l0 = F;
        eVar.setLanguage(F);
    }

    public final void e() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    @Override // ai.v1
    public final void f(float f10) {
        if (this.c != 2) {
            return;
        }
        if (this.J) {
            e eVar = this.K;
            if (eVar != null) {
                eVar.setLevel(f10);
                return;
            }
            return;
        }
        q qVar = this.h;
        if (qVar != null) {
            qVar.setLevel(f10);
        }
    }

    public final boolean[] g(ArrayList arrayList, float f10, float f11) {
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.c == 4) {
            long j3 = this.O;
            long j10 = 0;
            if (j3 > 0 && (f10 > 0.001f || f11 < 0.999f)) {
                float f12 = j3;
                long j11 = (long) (f10 * f12);
                long j12 = (long) (f12 * f11);
                long j13 = 0;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    long j14 = ((m) arrayList.get(i7)).b;
                    long j15 = j10;
                    long max = ((((m) arrayList.get(i7)).c >= j15 ? ((m) arrayList.get(i7)).c : Math.max(j13, j14 - 900)) + j14) / 2;
                    zArr[i7] = max < j11 || max > j12;
                    i7++;
                    j13 = j14;
                    j10 = j15;
                }
            }
        }
        return zArr;
    }

    public final void h(String str, boolean z10) {
        q qVar;
        e eVar;
        int i7 = this.c;
        if (i7 == 0 && this.h == null && this.K == null) {
            return;
        }
        boolean z11 = this.J && i7 == 4 && this.b.c() && ("chat paused".equals(str) || "destroy".equals(str));
        if (this.J && this.c != 0 && !z11) {
            o0.remove(o());
        }
        if (this.c != 0) {
            StringBuilder u10 = p0.u("dispose (", str, ") state=");
            int i10 = this.c;
            u10.append(i10 == 2 ? "live" : i10 == 3 ? "review" : i10 == 4 ? "paused" : "buffering");
            u10.append(" chars=");
            u10.append(this.n.length());
            u10.append(" chunks=");
            u10.append(this.y);
            Log.d("VoiceLive", u10.toString());
        }
        this.c = 0;
        this.H = null;
        g0.r(this.W);
        w1 w1Var = this.U;
        if (w1Var != null) {
            w1Var.c();
            this.U = null;
        }
        i(true);
        if (z11) {
            if (this.U == null) {
                e();
            }
            l lVar = new l();
            ArrayList arrayList = lVar.a;
            ArrayList arrayList2 = this.L;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                m mVar = (m) obj;
                m mVar2 = new m(mVar.a, mVar.b);
                mVar2.c = mVar.c;
                arrayList.add(mVar2);
            }
            ArrayList arrayList3 = this.M;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                m mVar3 = (m) obj2;
                m mVar4 = new m(mVar3.a, mVar3.b);
                mVar4.c = mVar3.c;
                arrayList.add(mVar4);
            }
            lVar.b = this.O;
            lVar.c = this.P;
            lVar.d = this.Q;
            lVar.e = this.e0;
            lVar.g = this.f0;
            lVar.f = this.g0;
            lVar.h = this.h0;
            lVar.i = this.l0;
            o0.put(o(), lVar);
            StringBuilder sb2 = new StringBuilder("field: kept for the chat (");
            sb2.append(arrayList.size());
            sb2.append(" words");
            sb2.append(this.e0 != null ? ", styled / edited" : "");
            sb2.append(")");
            Log.d("VoiceLive", sb2.toString());
        }
        this.e0 = null;
        this.g0 = null;
        this.i0 = false;
        this.b.g(Float.NaN, 0.0f);
        if (z10 && (eVar = this.K) != null && eVar.R) {
            eVar.R = false;
            eVar.f0 = -1;
            eVar.invalidate();
        }
        g0.r(this.I);
        DictationAsr.U(this.m0);
        g0.r(this.k0);
        g0.r(this.j0);
        if (vr.k == this) {
            vr.k = null;
        }
        w1 w1Var2 = this.f;
        if (w1Var2 != null) {
            w1Var2.c();
            this.f = null;
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.d();
            this.d = null;
        }
        this.e = null;
        if (!z10 || (qVar = this.h) == null) {
            return;
        }
        qVar.m();
    }

    public final void i(boolean z10) {
        EditTextBoldCursor editTextBoldCursor = this.X;
        if (editTextBoldCursor == null) {
            return;
        }
        this.X = null;
        String obj = editTextBoldCursor.getText() == null ? this.n : editTextBoldCursor.getText().toString();
        this.n = obj;
        this.e0 = obj.trim();
        this.f0 = c().size();
        if (z10 && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            g0.v1(editTextBoldCursor);
        }
        g0.E2(editTextBoldCursor);
    }

    public final void j(Object obj) {
        if (obj == null || this.i0 || this.K == null) {
            return;
        }
        if (this.X != null) {
            i(false);
        }
        if (this.g0 == null) {
            this.g0 = this.n.trim();
            this.h0 = this.e0 != null;
        }
        String str = this.g0;
        if (str.isEmpty()) {
            return;
        }
        this.i0 = true;
        this.K.setBusy(true);
        StringBuilder sb2 = new StringBuilder("field: style ");
        qf qfVar = this.b;
        qfVar.getClass();
        sb2.append(obj instanceof ai.c ? ((ai.c) obj).a() : null);
        sb2.append(" in place on ");
        sb2.append(str.length());
        sb2.append(" chars");
        Log.d("VoiceLive", sb2.toString());
        qfVar.f(obj, str, new x8(this, SystemClock.uptimeMillis(), 1));
    }

    public final void k(String str) {
        boolean z10 = this.c == 4;
        h(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        g0.h3(new f(0, this, eVar), z10 ? 470L : 60L);
    }

    public final void l(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        v vVar = this.d;
        r rVar = this.e;
        if (vVar == null || rVar == null) {
            return;
        }
        this.E = i10;
        this.F = i11;
        this.y++;
        this.w += i7;
        int c10 = rVar.c(byteBuffer, i7, i10);
        if (rVar.c <= 0) {
            if (this.G) {
                return;
            }
            this.G = true;
            Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
            return;
        }
        if (c10 > 0) {
            this.x += c10;
            byte[] bArr = (byte[]) rVar.g;
            if (c10 <= 0) {
                return;
            }
            synchronized (vVar.a) {
                try {
                    if (vVar.d) {
                        return;
                    }
                    vVar.a(c10, bArr);
                    int i12 = c10 / 2;
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i13 * 2;
                        double d = (short) ((bArr[i14 + 1] << 8) | (bArr[i14] & 255));
                        vVar.h = (d * d) + vVar.h;
                    }
                    int i15 = vVar.i + i12;
                    vVar.i = i15;
                    if (i15 >= 1600) {
                        double sqrt = Math.sqrt(vVar.h / Math.max(1, i15));
                        vVar.h = 0.0d;
                        vVar.i = 0;
                        q1 q1Var = vVar.g;
                        if (q1Var != null) {
                            q1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void m() {
        String str;
        int i7;
        ArrayList c10 = c();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i10 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text == null) {
                return;
            }
            int i11 = this.Z;
            str = "";
            if (i11 < 0 || this.a0.length() + i11 != text.length() || !text.toString().substring(this.Z).equals(this.a0)) {
                this.Y = Math.min(this.b0, c10.size());
                this.Z = text.length();
                this.a0 = "";
            }
            if (this.Y > c10.size()) {
                this.Y = c10.size();
            }
            this.b0 = c10.size();
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = this.Y; i12 < c10.size(); i12++) {
                if (sb2.length() > 0) {
                    sb2.append(' ');
                }
                sb2.append(((m) c10.get(i12)).a);
            }
            if (sb2.length() == 0 && this.a0.isEmpty()) {
                return;
            }
            if (sb2.length() > 0 && (i7 = this.Z) > 0 && !Character.isWhitespace(text.charAt(i7 - 1))) {
                i10 = 1;
            }
            if (sb2.length() != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i10 != 0 ? " " : "");
                sb3.append((Object) sb2);
                str = sb3.toString();
            }
            if (str.equals(this.a0)) {
                return;
            }
            text.replace(this.Z, text.length(), str);
            this.a0 = str;
            return;
        }
        if (this.e0 != null) {
            if (this.f0 > c10.size()) {
                this.f0 = c10.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.e0);
            StringBuilder sb4 = new StringBuilder(this.e0);
            for (int i13 = this.f0; i13 < c10.size(); i13++) {
                arrayList.add(((m) c10.get(i13)).a);
                sb4.append(' ');
                sb4.append(((m) c10.get(i13)).a);
            }
            this.n = sb4.toString();
            e eVar = this.K;
            if (eVar != null) {
                eVar.x(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] g10 = g(c10, this.P, this.Q);
        boolean[] g11 = this.T ? g(c10, this.R, this.S) : null;
        StringBuilder sb5 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(c10.size());
        boolean[] zArr = new boolean[c10.size()];
        int i14 = 0;
        while (i10 < c10.size()) {
            if (g11 == null || !g11[i10] || !g10[i10]) {
                arrayList2.add(((m) c10.get(i10)).a);
                int i15 = i14 + 1;
                zArr[i14] = g10[i10];
                if (!g10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((m) c10.get(i10)).a);
                }
                i14 = i15;
            }
            i10++;
        }
        this.n = sb5.toString();
        e eVar2 = this.K;
        if (eVar2 != null) {
            eVar2.x(arrayList2, Arrays.copyOf(zArr, i14), this.T);
        }
    }

    public final void n() {
        qf qfVar = this.b;
        cu0 cu0Var = qfVar.a.c2;
        if (cu0Var == null) {
            return;
        }
        if (this.K == null) {
            i6 i6Var = qfVar.a.M4;
            xi.e eVar = new xi.e();
            eVar.d = this;
            eVar.c = cu0Var;
            eVar.a = new int[2];
            eVar.b = new int[2];
            this.K = new e(this.a, i6Var, eVar);
        }
        View a10 = qfVar.a();
        if (this.K.getParent() != cu0Var) {
            g0.E2(this.K);
            int indexOfChild = (a10 == null || a10.getParent() != cu0Var) ? -1 : cu0Var.indexOfChild(a10);
            if (indexOfChild >= 0) {
                cu0Var.addView(this.K, indexOfChild, na.c(-1.0f, -1));
            } else {
                cu0Var.addView(this.K, na.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        m();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String o() {
        StringBuilder sb2 = new StringBuilder();
        qf qfVar = this.b;
        sb2.append(qfVar.a.R);
        sb2.append(":");
        sb2.append(qfVar.a.G3);
        return sb2.toString();
    }

    public final void p() {
        j6.k kVar = new j6.k(this);
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        w1 w1Var = new w1(this.a, chatActivityEnterView.R, chatActivityEnterView.G3, false, kVar);
        kVar.b = w1Var;
        this.f = w1Var;
        w1Var.w = this.d;
        w1Var.l();
    }

    public final void q() {
        String str;
        int i7;
        l lVar;
        long j3;
        int i10 = this.c;
        if (i10 == 3) {
            return;
        }
        if (i10 == 0 && mp.g1().getBoolean("design_voice_live_field", true) && !this.b.d() && this.b.c() && (lVar = (l) o0.get(o())) != null) {
            j jVar = this.k0;
            j jVar2 = this.W;
            float[] fArr = this.V;
            this.J = true;
            ArrayList arrayList = this.L;
            arrayList.clear();
            ArrayList arrayList2 = lVar.a;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList2.get(i11);
                m mVar2 = new m(mVar.a, mVar.b);
                mVar2.c = mVar.c;
                arrayList.add(mVar2);
            }
            long j10 = 0;
            this.M.clear();
            this.O = lVar.b;
            this.e0 = lVar.e;
            this.f0 = Math.min(lVar.g, arrayList.size());
            this.g0 = lVar.f;
            this.h0 = lVar.h;
            this.l0 = lVar.i;
            this.c = 4;
            this.P = 0.0f;
            this.Q = 1.0f;
            this.T = false;
            boolean z10 = lVar.c > 0.001f || lVar.d < 0.999f;
            boolean z11 = this.b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f);
            if (z10 && !z11 && this.O > 0) {
                float f10 = lVar.c;
                this.P = f10;
                float f11 = lVar.d;
                this.Q = f11;
                boolean[] g10 = g(arrayList, f10, f11);
                float f12 = this.P;
                float f13 = this.O;
                long j11 = (long) (f12 * f13);
                long j12 = (long) (this.Q * f13);
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (g10[i12]) {
                        j3 = j12;
                    } else {
                        m mVar3 = (m) arrayList.get(i12);
                        j3 = j12;
                        long j13 = j10;
                        mVar3.b = Math.max(j13, mVar3.b - j11);
                        long j14 = mVar3.c;
                        if (j14 >= j13) {
                            mVar3.c = Math.max(j13, j14 - j11);
                        }
                        arrayList3.add(mVar3);
                    }
                    i12++;
                    j12 = j3;
                    j10 = 0;
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                this.O = Math.max(0L, j12 - j11);
                this.P = 0.0f;
                this.Q = 1.0f;
            } else if (z11) {
                this.P = fArr[0];
                this.Q = fArr[1];
            }
            Log.d("VoiceLive", "field: back with the chat (" + arrayList.size() + " words, " + this.O + " ms)");
            n();
            e eVar = this.K;
            if (eVar != null) {
                eVar.setListening(false);
                this.K.setPaused(true);
                this.K.setRevertShown(this.g0 != null);
                e eVar2 = this.K;
                eVar2.z();
                eVar2.W = 1.0f;
                boolean z12 = eVar2.T;
                eVar2.a0 = z12 ? 1.0f : 0.0f;
                eVar2.T0 = z12 ? 1.0f : 0.0f;
                eVar2.b0 = 0.0f;
                eVar2.E0 = -1.0f;
                eVar2.invalidate();
                this.K.setLanguage(this.l0);
                d();
            }
            m();
            g0.r(jVar2);
            g0.h3(jVar2, 50L);
            g0.r(jVar);
            g0.h3(jVar, 250L);
            return;
        }
        if (this.c == 4) {
            if (!this.b.d()) {
                if (this.b.c()) {
                    return;
                }
                h("draft gone", true);
                return;
            }
            g0.r(this.W);
            w1 w1Var = this.U;
            if (w1Var != null) {
                this.U = null;
                w1Var.c();
                e();
            }
            e();
            float f14 = this.P;
            long j15 = this.O;
            float f15 = j15;
            long j16 = (long) (f14 * f15);
            float f16 = this.Q;
            long j17 = (long) (f15 * f16);
            if (j15 <= 0 || (f14 <= 0.001f && f16 >= 0.999f)) {
                this.N = j15;
                Log.d("VoiceLive", "field: resumed at " + this.N + " ms");
            } else {
                boolean[] g11 = g(this.L, f14, f16);
                ArrayList arrayList4 = new ArrayList();
                int i13 = 0;
                while (i13 < this.L.size()) {
                    if (g11[i13]) {
                        i7 = i13;
                    } else {
                        m mVar4 = (m) this.L.get(i13);
                        i7 = i13;
                        mVar4.b = Math.max(0L, mVar4.b - j16);
                        long j18 = mVar4.c;
                        if (j18 >= 0) {
                            mVar4.c = Math.max(0L, j18 - j16);
                        }
                        arrayList4.add(mVar4);
                    }
                    i13 = i7 + 1;
                }
                this.L.clear();
                this.L.addAll(arrayList4);
                this.N = Math.max(0L, j17 - j16);
                StringBuilder t6 = p0.t(j16, "field: resumed after a trim ", "..");
                t6.append(j17);
                t6.append(" ms, ");
                t6.append(this.L.size());
                t6.append(" words kept");
                Log.d("VoiceLive", t6.toString());
            }
            this.P = 0.0f;
            this.Q = 1.0f;
            this.T = false;
            if (this.e0 != null) {
                this.f0 = this.L.size();
            }
            if (this.X != null) {
                int size2 = this.L.size();
                this.b0 = size2;
                this.Y = size2;
                this.Z = this.X.length();
                this.a0 = "";
            }
            this.d = new v();
            this.e = new r(0);
            vr.k = this;
            this.c = 2;
            p();
            e eVar3 = this.K;
            if (eVar3 != null) {
                eVar3.setPaused(false);
                this.K.setListening(true);
            }
            d();
            DictationAsr.U(this.m0);
            DictationAsr.l(this.m0);
            s();
            m();
            g0.r(this.k0);
            g0.h3(this.k0, 250L);
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        if (!c1.a()) {
            if (this.c != 0) {
                h("unavailable", true);
                return;
            }
            return;
        }
        if (!this.b.d()) {
            if (this.J && this.c == 2) {
                qf qfVar = this.b;
                qfVar.getClass();
                if ((MediaController.B().K() || qfVar.a.R3 != null) && this.b.c()) {
                    j jVar3 = this.W;
                    this.c = 4;
                    g0.r(this.j0);
                    this.O = this.N + (this.d != null ? r2.c() / 32 : 0L);
                    if (vr.k == this) {
                        vr.k = null;
                    }
                    w1 w1Var2 = this.f;
                    if (w1Var2 != null) {
                        this.U = w1Var2;
                        this.f = null;
                        v vVar = this.d;
                        if (vVar != null) {
                            vVar.d();
                        }
                        this.U.m();
                    } else {
                        e();
                    }
                    this.d = null;
                    this.e = null;
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                    e eVar4 = this.K;
                    if (eVar4 != null) {
                        eVar4.setListening(false);
                        this.K.setPaused(true);
                    }
                    m();
                    g0.r(jVar3);
                    g0.h3(jVar3, 50L);
                    return;
                }
            }
            if (this.c != 0) {
                h("not recording", true);
                return;
            }
            return;
        }
        int i14 = 1;
        if (this.c == 0) {
            if (!n0) {
                n0 = true;
                StringBuilder sb2 = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                StringBuilder sb3 = new StringBuilder();
                int[] iArr = {1000, 12000};
                int i15 = 0;
                while (i15 < 2) {
                    int i16 = iArr[i15];
                    r rVar = new r(0);
                    ByteBuffer allocate = ByteBuffer.allocate(19200);
                    int i17 = 0;
                    while (i17 < 9600) {
                        int[] iArr2 = iArr;
                        short sin = (short) (Math.sin(((i16 * 6.283185307179586d) * i17) / 48000.0d) * 16000.0d);
                        int i18 = i17 * 2;
                        allocate.put(i18, (byte) sin);
                        allocate.put(i18 + 1, (byte) (sin >> 8));
                        i17++;
                        iArr = iArr2;
                    }
                    int[] iArr3 = iArr;
                    int c10 = rVar.c(allocate, 19200, 48000);
                    byte[] bArr = (byte[]) rVar.g;
                    double d = 0.0d;
                    int i19 = 0;
                    for (int i20 = ks.e3; i20 < c10 / 2; i20++) {
                        int i21 = i20 * 2;
                        double d2 = (short) ((bArr[i21] & 255) | (bArr[i21 + 1] << 8));
                        d += d2 * d2;
                        i19++;
                    }
                    double log10 = Math.log10(Math.max(1.0E-9d, Math.sqrt(d / Math.max(1, i19)) / (16000.0d / Math.sqrt(2.0d)))) * 20.0d;
                    sb3.append(i16);
                    sb3.append("Hz=");
                    sb3.append(String.format(Locale.US, "%.1f", Double.valueOf(log10)));
                    sb3.append("dB ");
                    i15++;
                    iArr = iArr3;
                }
                sb2.append(sb3.toString().trim());
                Log.d("VoiceLive", sb2.toString());
            }
            this.d = new v();
            this.e = new r(0);
            this.x = 0L;
            this.w = 0L;
            this.y = 0;
            this.E = 0;
            this.F = 0;
            this.G = false;
            this.n = "";
            this.J = mp.g1().getBoolean("design_voice_live_field", true);
            this.L.clear();
            this.M.clear();
            this.N = 0L;
            this.P = 0.0f;
            this.Q = 1.0f;
            this.T = false;
            this.r = SystemClock.elapsedRealtime();
            i14 = 1;
            this.c = 1;
            vr.k = this;
            g0.r(this.k0);
            g0.h3(this.k0, 250L);
            Log.d("VoiceLive", "buffering: recorder tap on");
        }
        if (this.c == i14 && this.b.a.V0()) {
            this.c = 2;
            this.l0 = null;
            this.s = SystemClock.elapsedRealtime();
            StringBuilder sb4 = new StringBuilder("locked → live: buffered ");
            sb4.append((this.d.c() * 1000) / 32000);
            sb4.append(" ms, chunks=");
            sb4.append(this.y);
            sb4.append(" rate=");
            sb4.append(this.E);
            sb4.append(" source=");
            int i22 = this.F;
            sb4.append(i22 == 1 ? "MediaController" : i22 == 2 ? "AudioRecorderV2" : "none");
            sb4.append(" (");
            sb4.append(this.s - this.r);
            sb4.append(" ms since start)");
            Log.d("VoiceLive", sb4.toString());
            p();
            if (this.J) {
                n();
            } else {
                qf qfVar2 = this.b;
                cu0 cu0Var = qfVar2.a.c2;
                if (cu0Var != null) {
                    if (this.h == null) {
                        this.h = new q(this.a, qfVar2.a.M4, this);
                    }
                    View a10 = qfVar2.a();
                    int indexOfChild = (a10 == null || a10.getParent() != cu0Var) ? -1 : cu0Var.indexOfChild(a10);
                    if (this.h.getParent() != cu0Var || (indexOfChild >= 0 && cu0Var.indexOfChild(this.h) != indexOfChild - 1)) {
                        g0.E2(this.h);
                        int indexOfChild2 = (a10 == null || a10.getParent() != cu0Var) ? -1 : cu0Var.indexOfChild(a10);
                        if (indexOfChild2 >= 0) {
                            cu0Var.addView(this.h, indexOfChild2, na.e(-1, -1, 80));
                        } else {
                            cu0Var.addView(this.h, na.e(-1, -1, 80));
                            Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                        }
                    }
                    q qVar = this.h;
                    ChatActivityEnterView chatActivityEnterView2 = qfVar2.a;
                    int i23 = n6.Pe;
                    int i24 = ChatActivityEnterView.s7;
                    qVar.setAccent(chatActivityEnterView2.G0(i23) | (-16777216));
                    q qVar2 = this.h;
                    TextPaint textPaint = qVar2.c;
                    int i25 = n6.d6;
                    i6 i6Var = qVar2.b;
                    qVar2.g0 = g0.B(n6.w0(i25, i6Var)) < 0.5f;
                    int w02 = (-16777216) | n6.w0(n6.G6, i6Var);
                    qVar2.h0 = w02;
                    textPaint.setColor(w02);
                    int i26 = qVar2.h0;
                    q.Y1 = i26;
                    q.X1 = qVar2.g0 ? i0.a.f(0.12f, qVar2.i0, -1) : i0.a.f(0.32f, qVar2.i0, i26);
                    q.Z1 = g0.L(7.0f);
                    qVar2.d.setColor(n6.r1(qVar2.g0 ? 0.42f : 0.36f, qVar2.h0));
                    qVar2.j0 = Build.VERSION.SDK_INT >= 31 && bz.o() != 0;
                    qVar2.r = 0;
                    qVar2.s.setColor(qVar2.g0 ? 0 : 335544320);
                    qVar2.k0 = "";
                    qVar2.y1 = -1;
                    qVar2.l0 = null;
                    qVar2.o0.clear();
                    qVar2.U0 = true;
                    qVar2.D0 = 0.0f;
                    qVar2.C0 = 0.0f;
                    qVar2.E0 = 0.0f;
                    qVar2.F0 = 0.0f;
                    qVar2.H0 = -1.0f;
                    qVar2.G0 = -1.0f;
                    qVar2.J0 = -1.0f;
                    qVar2.L0 = false;
                    qVar2.setStyleIcon(null);
                    qVar2.M0 = false;
                    qVar2.P0 = false;
                    qVar2.x1 = null;
                    qVar2.P1 = false;
                    qVar2.z1 = false;
                    qVar2.D1 = null;
                    qVar2.E1.clear();
                    textPaint.setShader(null);
                    qVar2.S0 = 0L;
                    qVar2.T0 = 0.0f;
                    qVar2.A0 = true;
                    qVar2.X0 = 0.0f;
                    qVar2.Y0 = 0.0f;
                    qVar2.Z0 = true;
                    qVar2.a1 = 1.0f;
                    qVar2.b1 = 0.0f;
                    qVar2.l1 = -1;
                    Arrays.fill(qVar2.m1, 0.0f);
                    qVar2.O = null;
                    qVar2.P = 0.0f;
                    qVar2.Q = 0.0f;
                    qVar2.W = false;
                    qVar2.R.setEmpty();
                    qVar2.setPlaceholder(null);
                    qVar2.p0 = true;
                    qVar2.r0 = SystemClock.uptimeMillis();
                    qVar2.t0 = 0L;
                    qVar2.f0 = 0L;
                    qVar2.setVisibility(0);
                    qVar2.invalidate();
                    Log.d("VoiceLive", "overlay shown at index " + cu0Var.indexOfChild(this.h) + "/" + cu0Var.getChildCount());
                }
            }
            e eVar5 = this.K;
            if (eVar5 != null && this.J && (str = this.l0) != null) {
                eVar5.setLanguage(str);
            }
            d();
            DictationAsr.U(this.m0);
            DictationAsr.l(this.m0);
            s();
            g0.h3(this.j0, 1500L);
        }
    }

    @Override // ai.v1
    public final void r(String str) {
        M(-1, str);
    }

    public final void s() {
        String a02 = DictationAsr.K(new long[2]) ? gd.a0(null, null, 2131745061, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d)))) : null;
        q qVar = this.h;
        if (qVar != null) {
            qVar.setPlaceholder(a02);
        }
        e eVar = this.K;
        if (eVar == null || !this.J) {
            return;
        }
        eVar.setPlaceholder(a02);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:1: B:23:0x0084->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(w1 w1Var, String str) {
        int i7;
        int length;
        int i10;
        int[] iArr;
        long j3;
        int i11;
        long j10;
        int i12;
        int i13 = 0;
        String[] split = str == null ? new String[0] : str.trim().split("\\s+");
        int i14 = 0;
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                i14++;
            }
        }
        t tVar = w1Var.n;
        int i15 = tVar != null ? tVar.m : -1;
        if (i15 < 0) {
            v vVar = this.d;
            if (vVar == null) {
                i7 = 0;
                long j11 = 0;
                long max = Math.max(0L, i7 - 350) + this.N;
                int min = Math.min(this.M.size(), i14);
                int i16 = 1;
                long max2 = min <= 0 ? ((m) this.M.get(min - 1)).b : this.L.isEmpty() ? this.N : Math.max(this.N, ((m) i5.c.h(1, this.L)).b);
                int i17 = i14 - min;
                while (this.M.size() > i14) {
                    p0.z(1, this.M);
                }
                length = split.length;
                i10 = 0;
                int i18 = 0;
                while (i10 < length) {
                    long j12 = j11;
                    String str3 = split[i10];
                    if (str3.isEmpty()) {
                        j10 = max;
                        i11 = i18;
                    } else {
                        if (i13 < min) {
                            ((m) this.M.get(i13)).a = str3;
                            i12 = i13;
                            j10 = max;
                            i11 = i18;
                        } else {
                            i11 = i18 + 1;
                            j10 = max;
                            i12 = i13;
                            this.M.add(new m(str3, Math.max(max2, (((Math.max(max, max2) - max2) * i11) / Math.max(i16, i17)) + max2)));
                        }
                        i13 = i12 + 1;
                    }
                    i10++;
                    i18 = i11;
                    j11 = j12;
                    max = j10;
                    i16 = 1;
                }
                long j13 = j11;
                t tVar2 = w1Var.n;
                iArr = tVar2 == null ? tVar2.g : null;
                if (iArr != null || iArr.length < 4 || str == null) {
                    return;
                }
                int length2 = split.length;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i19 < length2) {
                    String str4 = split[i19];
                    if (str4.isEmpty()) {
                        j3 = j13;
                    } else {
                        int indexOf = str.indexOf(str4, i20);
                        if (indexOf < 0) {
                            return;
                        }
                        int length3 = str4.length() + indexOf;
                        long j14 = -1;
                        long j15 = -1;
                        while (true) {
                            int i23 = i22 + 3;
                            if (i23 >= iArr.length || iArr[i22 + 1] > length3) {
                                break;
                            }
                            if (iArr[i22] >= indexOf) {
                                if (j15 < j13) {
                                    j15 = iArr[i22 + 2];
                                }
                                j14 = iArr[i23];
                            }
                            i22 += 4;
                        }
                        if (j14 < j13 || i21 >= this.M.size()) {
                            j3 = j13;
                        } else {
                            m mVar = (m) this.M.get(i21);
                            long j16 = this.N;
                            mVar.b = j14 + j16;
                            j3 = j13;
                            mVar.c = Math.max(j3, j15) + j16;
                        }
                        i21++;
                        i20 = length3;
                    }
                    i19++;
                    j13 = j3;
                }
                return;
            }
            i15 = vVar.c();
        }
        i7 = i15 / 32;
        long j112 = 0;
        long max3 = Math.max(0L, i7 - 350) + this.N;
        int min2 = Math.min(this.M.size(), i14);
        int i162 = 1;
        if (min2 <= 0) {
        }
        int i172 = i14 - min2;
        while (this.M.size() > i14) {
        }
        length = split.length;
        i10 = 0;
        int i182 = 0;
        while (i10 < length) {
        }
        long j132 = j112;
        t tVar22 = w1Var.n;
        if (tVar22 == null) {
        }
        if (iArr != null) {
        }
    }
}
