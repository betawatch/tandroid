package ji;

import a8.p0;
import ai.a2;
import ai.c2;
import ai.n0;
import ai.u1;
import ai.w;
import ai.x2;
import ai.y;
import ai.z;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c8.b1;
import c8.ma;
import hi.d8;
import hi.r1;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m implements a2 {
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
    public c2 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context a;
    public final pf b;
    public int b0;
    public z d;
    public q e;
    public String e0;
    public c2 f;
    public int f0;
    public String g0;
    public p h;
    public boolean h0;
    public boolean i0;
    public final i k0;
    public String l0;
    public final f m0;
    public long r;
    public long s;
    public volatile long w;
    public volatile long x;
    public volatile int y;
    public int c = 0;
    public String n = "";
    public final i I = new i(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final i W = new i(this, 1);
    public String a0 = "";
    public final int[] c0 = new int[2];
    public final int[] d0 = new int[2];
    public final f j0 = new f(this, 1);

    public m(Context context, pf pfVar) {
        int i7 = 2;
        this.k0 = new i(this, i7);
        this.m0 = new f(this, i7);
        this.a = context;
        this.b = pfVar;
    }

    public static void b(m mVar, c2 c2Var, String str, int i7) {
        if (c2Var == mVar.f || c2Var == mVar.U) {
            if (!mVar.J) {
                mVar.l(i7, str);
                return;
            }
            int i10 = mVar.c;
            if (i10 == 2 || i10 == 4) {
                mVar.v(c2Var, str);
                mVar.p();
            }
        }
    }

    @Override // ai.a2
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
            p pVar = this.h;
            if (pVar != null) {
                pVar.m();
                return;
            }
            return;
        }
        p pVar2 = this.h;
        if (pVar2 != null) {
            pVar2.setText(this.n);
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
        String U = DictationAsr.U();
        if (U == null) {
            return;
        }
        String p10 = n0.p(U);
        p pVar = this.h;
        if (pVar != null) {
            pVar.setLanguage(p10);
        }
        e eVar = this.K;
        if (eVar == null || !this.J) {
            return;
        }
        this.l0 = p10;
        eVar.setLanguage(p10);
    }

    public final void e() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    public final boolean[] f(ArrayList arrayList, float f10, float f11) {
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
                    long j14 = ((l) arrayList.get(i7)).b;
                    long j15 = j10;
                    long max = ((((l) arrayList.get(i7)).c >= j15 ? ((l) arrayList.get(i7)).c : Math.max(j13, j14 - 900)) + j14) / 2;
                    zArr[i7] = max < j11 || max > j12;
                    i7++;
                    j13 = j14;
                    j10 = j15;
                }
            }
        }
        return zArr;
    }

    public final void g(String str, boolean z10) {
        p pVar;
        e eVar;
        int i7 = this.c;
        if (i7 == 0 && this.h == null && this.K == null) {
            return;
        }
        boolean z11 = this.J && i7 == 4 && this.b.c() && ("chat paused".equals(str) || "destroy".equals(str));
        if (this.J && this.c != 0 && !z11) {
            o0.remove(r());
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
        c2 c2Var = this.U;
        if (c2Var != null) {
            c2Var.c();
            this.U = null;
        }
        j(true);
        if (z11) {
            if (this.U == null) {
                e();
            }
            k kVar = new k();
            ArrayList arrayList = kVar.a;
            ArrayList arrayList2 = this.L;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                l lVar = (l) obj;
                l lVar2 = new l(lVar.a, lVar.b);
                lVar2.c = lVar.c;
                arrayList.add(lVar2);
            }
            ArrayList arrayList3 = this.M;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                l lVar3 = (l) obj2;
                l lVar4 = new l(lVar3.a, lVar3.b);
                lVar4.c = lVar3.c;
                arrayList.add(lVar4);
            }
            kVar.b = this.O;
            kVar.c = this.P;
            kVar.d = this.Q;
            kVar.e = this.e0;
            kVar.g = this.f0;
            kVar.f = this.g0;
            kVar.h = this.h0;
            kVar.i = this.l0;
            o0.put(r(), kVar);
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
        DictationAsr.N(this.m0);
        g0.r(this.k0);
        g0.r(this.j0);
        if (vr.k == this) {
            vr.k = null;
        }
        c2 c2Var2 = this.f;
        if (c2Var2 != null) {
            c2Var2.c();
            this.f = null;
        }
        z zVar = this.d;
        if (zVar != null) {
            zVar.d();
            this.d = null;
        }
        this.e = null;
        if (!z10 || (pVar = this.h) == null) {
            return;
        }
        pVar.m();
    }

    @Override // ai.a2
    public final void h(float f10) {
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
        p pVar = this.h;
        if (pVar != null) {
            pVar.setLevel(f10);
        }
    }

    @Override // ai.a2
    public final void i(String str) {
        l(-1, str);
    }

    public final void j(boolean z10) {
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

    public final void k(Object obj) {
        if (obj == null || this.i0 || this.K == null) {
            return;
        }
        if (this.X != null) {
            j(false);
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
        pf pfVar = this.b;
        pfVar.getClass();
        sb2.append(obj instanceof ai.g ? ((ai.g) obj).a() : null);
        sb2.append(" in place on ");
        sb2.append(str.length());
        sb2.append(" chars");
        Log.d("VoiceLive", sb2.toString());
        pfVar.f(obj, str, new d8(this, SystemClock.uptimeMillis(), 1));
    }

    @Override // ai.a2
    public final void l(int i7, String str) {
        if (this.c != 2) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.n = str;
        p pVar = this.h;
        if (pVar != null) {
            pVar.t(i7, str);
        }
    }

    public final void m() {
        int i7 = this.c;
        pf pfVar = this.b;
        if (i7 != 4) {
            if (i7 != 2) {
                return;
            }
            pfVar.e();
            g0.h3(new f(this, 4), 300L);
            return;
        }
        t();
        bn bnVar = pfVar.a.D3;
        if (bnVar != null) {
            bnVar.presentFragment(new x2());
        }
    }

    public final void n(String str) {
        boolean z10 = this.c == 4;
        g(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        g0.h3(new r1(26, this, eVar), z10 ? 470L : 60L);
    }

    public final void o(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        z zVar = this.d;
        q qVar = this.e;
        if (zVar == null || qVar == null) {
            return;
        }
        this.E = i10;
        this.F = i11;
        this.y++;
        this.w += i7;
        int c10 = qVar.c(byteBuffer, i7, i10);
        if (qVar.c <= 0) {
            if (this.G) {
                return;
            }
            this.G = true;
            Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
            return;
        }
        if (c10 > 0) {
            this.x += c10;
            byte[] bArr = (byte[]) qVar.g;
            if (c10 <= 0) {
                return;
            }
            synchronized (zVar.a) {
                try {
                    if (zVar.d) {
                        return;
                    }
                    zVar.a(c10, bArr);
                    int i12 = c10 / 2;
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i13 * 2;
                        double d = (short) ((bArr[i14 + 1] << 8) | (bArr[i14] & 255));
                        zVar.h = (d * d) + zVar.h;
                    }
                    int i15 = zVar.i + i12;
                    zVar.i = i15;
                    if (i15 >= 1600) {
                        double sqrt = Math.sqrt(zVar.h / Math.max(1, i15));
                        zVar.h = 0.0d;
                        zVar.i = 0;
                        u1 u1Var = zVar.g;
                        if (u1Var != null) {
                            u1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void p() {
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
                sb2.append(((l) c10.get(i12)).a);
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
                arrayList.add(((l) c10.get(i13)).a);
                sb4.append(' ');
                sb4.append(((l) c10.get(i13)).a);
            }
            this.n = sb4.toString();
            e eVar = this.K;
            if (eVar != null) {
                eVar.x(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] f10 = f(c10, this.P, this.Q);
        boolean[] f11 = this.T ? f(c10, this.R, this.S) : null;
        StringBuilder sb5 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(c10.size());
        boolean[] zArr = new boolean[c10.size()];
        int i14 = 0;
        while (i10 < c10.size()) {
            if (f11 == null || !f11[i10] || !f10[i10]) {
                arrayList2.add(((l) c10.get(i10)).a);
                int i15 = i14 + 1;
                zArr[i14] = f10[i10];
                if (!f10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((l) c10.get(i10)).a);
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

    public final void q() {
        pf pfVar = this.b;
        au0 au0Var = pfVar.a.a2;
        if (au0Var == null) {
            return;
        }
        if (this.K == null) {
            i6 i6Var = pfVar.a.K4;
            xi.e eVar = new xi.e();
            eVar.d = this;
            eVar.c = au0Var;
            eVar.a = new int[2];
            eVar.b = new int[2];
            this.K = new e(this.a, i6Var, eVar);
        }
        View a10 = pfVar.a();
        if (this.K.getParent() != au0Var) {
            g0.E2(this.K);
            int indexOfChild = (a10 == null || a10.getParent() != au0Var) ? -1 : au0Var.indexOfChild(a10);
            if (indexOfChild >= 0) {
                au0Var.addView(this.K, indexOfChild, ma.c(-1.0f, -1));
            } else {
                au0Var.addView(this.K, ma.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        p();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String r() {
        StringBuilder sb2 = new StringBuilder();
        pf pfVar = this.b;
        sb2.append(pfVar.a.R);
        sb2.append(":");
        sb2.append(pfVar.a.E3);
        return sb2.toString();
    }

    public final void s() {
        j jVar = new j(this);
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        c2 c2Var = new c2(this.a, chatActivityEnterView.R, chatActivityEnterView.E3, false, jVar);
        jVar.b = c2Var;
        this.f = c2Var;
        c2Var.J = this.d;
        c2Var.s();
    }

    public final void t() {
        String str;
        int i7;
        k kVar;
        long j3;
        int i10 = this.c;
        if (i10 == 3) {
            return;
        }
        if (i10 == 0 && mp.g1().getBoolean("design_voice_live_field", true) && !this.b.d() && this.b.c() && (kVar = (k) o0.get(r())) != null) {
            i iVar = this.k0;
            i iVar2 = this.W;
            float[] fArr = this.V;
            this.J = true;
            ArrayList arrayList = this.L;
            arrayList.clear();
            ArrayList arrayList2 = kVar.a;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                l lVar = (l) arrayList2.get(i11);
                l lVar2 = new l(lVar.a, lVar.b);
                lVar2.c = lVar.c;
                arrayList.add(lVar2);
            }
            long j10 = 0;
            this.M.clear();
            this.O = kVar.b;
            this.e0 = kVar.e;
            this.f0 = Math.min(kVar.g, arrayList.size());
            this.g0 = kVar.f;
            this.h0 = kVar.h;
            this.l0 = kVar.i;
            this.c = 4;
            this.P = 0.0f;
            this.Q = 1.0f;
            this.T = false;
            boolean z10 = kVar.c > 0.001f || kVar.d < 0.999f;
            boolean z11 = this.b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f);
            if (z10 && !z11 && this.O > 0) {
                float f10 = kVar.c;
                this.P = f10;
                float f11 = kVar.d;
                this.Q = f11;
                boolean[] f12 = f(arrayList, f10, f11);
                float f13 = this.P;
                float f14 = this.O;
                long j11 = (long) (f13 * f14);
                long j12 = (long) (this.Q * f14);
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f12[i12]) {
                        j3 = j12;
                    } else {
                        l lVar3 = (l) arrayList.get(i12);
                        j3 = j12;
                        long j13 = j10;
                        lVar3.b = Math.max(j13, lVar3.b - j11);
                        long j14 = lVar3.c;
                        if (j14 >= j13) {
                            lVar3.c = Math.max(j13, j14 - j11);
                        }
                        arrayList3.add(lVar3);
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
            q();
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
            p();
            g0.r(iVar2);
            g0.h3(iVar2, 50L);
            g0.r(iVar);
            g0.h3(iVar, 250L);
            return;
        }
        if (this.c == 4) {
            if (!this.b.d()) {
                if (this.b.c()) {
                    return;
                }
                g("draft gone", true);
                return;
            }
            g0.r(this.W);
            c2 c2Var = this.U;
            if (c2Var != null) {
                this.U = null;
                c2Var.c();
                e();
            }
            e();
            float f15 = this.P;
            long j15 = this.O;
            float f16 = j15;
            long j16 = (long) (f15 * f16);
            float f17 = this.Q;
            long j17 = (long) (f16 * f17);
            if (j15 <= 0 || (f15 <= 0.001f && f17 >= 0.999f)) {
                this.N = j15;
                Log.d("VoiceLive", "field: resumed at " + this.N + " ms");
            } else {
                boolean[] f18 = f(this.L, f15, f17);
                ArrayList arrayList4 = new ArrayList();
                int i13 = 0;
                while (i13 < this.L.size()) {
                    if (f18[i13]) {
                        i7 = i13;
                    } else {
                        l lVar4 = (l) this.L.get(i13);
                        i7 = i13;
                        lVar4.b = Math.max(0L, lVar4.b - j16);
                        long j18 = lVar4.c;
                        if (j18 >= 0) {
                            lVar4.c = Math.max(0L, j18 - j16);
                        }
                        arrayList4.add(lVar4);
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
            this.d = new z();
            this.e = new q(0);
            vr.k = this;
            this.c = 2;
            s();
            e eVar3 = this.K;
            if (eVar3 != null) {
                eVar3.setPaused(false);
                this.K.setListening(true);
            }
            d();
            DictationAsr.N(this.m0);
            DictationAsr.g.add(this.m0);
            u();
            p();
            g0.r(this.k0);
            g0.h3(this.k0, 250L);
            return;
        }
        if (!b1.a()) {
            if (this.c != 0) {
                g("unavailable", true);
                return;
            }
            return;
        }
        if (!this.b.d()) {
            if (this.J && this.c == 2) {
                pf pfVar = this.b;
                pfVar.getClass();
                if ((MediaController.B().K() || pfVar.a.P3 != null) && this.b.c()) {
                    i iVar3 = this.W;
                    this.c = 4;
                    g0.r(this.j0);
                    this.O = this.N + (this.d != null ? r2.c() / 32 : 0L);
                    if (vr.k == this) {
                        vr.k = null;
                    }
                    c2 c2Var2 = this.f;
                    if (c2Var2 != null) {
                        this.U = c2Var2;
                        this.f = null;
                        z zVar = this.d;
                        if (zVar != null) {
                            zVar.d();
                        }
                        this.U.u();
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
                    p();
                    g0.r(iVar3);
                    g0.h3(iVar3, 50L);
                    return;
                }
            }
            if (this.c != 0) {
                g("not recording", true);
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
                    q qVar = new q(0);
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
                    int c10 = qVar.c(allocate, 19200, 48000);
                    byte[] bArr = (byte[]) qVar.g;
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
            this.d = new z();
            this.e = new q(0);
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
        if (this.c == i14 && this.b.a.Q0()) {
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
            s();
            if (this.J) {
                q();
            } else {
                pf pfVar2 = this.b;
                au0 au0Var = pfVar2.a.a2;
                if (au0Var != null) {
                    if (this.h == null) {
                        this.h = new p(this.a, pfVar2.a.K4, this);
                    }
                    View a10 = pfVar2.a();
                    int indexOfChild = (a10 == null || a10.getParent() != au0Var) ? -1 : au0Var.indexOfChild(a10);
                    if (this.h.getParent() != au0Var || (indexOfChild >= 0 && au0Var.indexOfChild(this.h) != indexOfChild - 1)) {
                        g0.E2(this.h);
                        int indexOfChild2 = (a10 == null || a10.getParent() != au0Var) ? -1 : au0Var.indexOfChild(a10);
                        if (indexOfChild2 >= 0) {
                            au0Var.addView(this.h, indexOfChild2, ma.e(-1, -1, 80));
                        } else {
                            au0Var.addView(this.h, ma.e(-1, -1, 80));
                            Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                        }
                    }
                    p pVar = this.h;
                    ChatActivityEnterView chatActivityEnterView = pfVar2.a;
                    int i23 = n6.Pe;
                    int i24 = ChatActivityEnterView.n7;
                    pVar.setAccent(chatActivityEnterView.C0(i23) | (-16777216));
                    p pVar2 = this.h;
                    TextPaint textPaint = pVar2.c;
                    int i25 = n6.d6;
                    i6 i6Var = pVar2.b;
                    pVar2.g0 = g0.B(n6.w0(i25, i6Var)) < 0.5f;
                    int w02 = (-16777216) | n6.w0(n6.G6, i6Var);
                    pVar2.h0 = w02;
                    textPaint.setColor(w02);
                    int i26 = pVar2.h0;
                    p.Y1 = i26;
                    p.X1 = pVar2.g0 ? i0.a.f(0.12f, pVar2.i0, -1) : i0.a.f(0.32f, pVar2.i0, i26);
                    p.Z1 = g0.L(7.0f);
                    pVar2.d.setColor(n6.r1(pVar2.g0 ? 0.42f : 0.36f, pVar2.h0));
                    pVar2.j0 = Build.VERSION.SDK_INT >= 31 && bz.o() != 0;
                    pVar2.r = 0;
                    pVar2.s.setColor(pVar2.g0 ? 0 : 335544320);
                    pVar2.k0 = "";
                    pVar2.y1 = -1;
                    pVar2.l0 = null;
                    pVar2.o0.clear();
                    pVar2.U0 = true;
                    pVar2.D0 = 0.0f;
                    pVar2.C0 = 0.0f;
                    pVar2.E0 = 0.0f;
                    pVar2.F0 = 0.0f;
                    pVar2.H0 = -1.0f;
                    pVar2.G0 = -1.0f;
                    pVar2.J0 = -1.0f;
                    pVar2.L0 = false;
                    pVar2.setStyleIcon(null);
                    pVar2.M0 = false;
                    pVar2.P0 = false;
                    pVar2.x1 = null;
                    pVar2.P1 = false;
                    pVar2.z1 = false;
                    pVar2.D1 = null;
                    pVar2.E1.clear();
                    textPaint.setShader(null);
                    pVar2.S0 = 0L;
                    pVar2.T0 = 0.0f;
                    pVar2.A0 = true;
                    pVar2.X0 = 0.0f;
                    pVar2.Y0 = 0.0f;
                    pVar2.Z0 = true;
                    pVar2.a1 = 1.0f;
                    pVar2.b1 = 0.0f;
                    pVar2.l1 = -1;
                    Arrays.fill(pVar2.m1, 0.0f);
                    pVar2.O = null;
                    pVar2.P = 0.0f;
                    pVar2.Q = 0.0f;
                    pVar2.W = false;
                    pVar2.R.setEmpty();
                    pVar2.setPlaceholder(null);
                    pVar2.p0 = true;
                    pVar2.r0 = SystemClock.uptimeMillis();
                    pVar2.t0 = 0L;
                    pVar2.f0 = 0L;
                    pVar2.setVisibility(0);
                    pVar2.invalidate();
                    Log.d("VoiceLive", "overlay shown at index " + au0Var.indexOfChild(this.h) + "/" + au0Var.getChildCount());
                }
            }
            e eVar5 = this.K;
            if (eVar5 != null && this.J && (str = this.l0) != null) {
                eVar5.setLanguage(str);
            }
            d();
            DictationAsr.N(this.m0);
            DictationAsr.g.add(this.m0);
            u();
            g0.h3(this.j0, 1500L);
        }
    }

    public final void u() {
        String a02 = DictationAsr.F(new long[2]) ? gd.a0(null, null, 2131745067, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d)))) : null;
        p pVar = this.h;
        if (pVar != null) {
            pVar.setPlaceholder(a02);
        }
        e eVar = this.K;
        if (eVar == null || !this.J) {
            return;
        }
        eVar.setPlaceholder(a02);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[LOOP:1: B:23:0x008b->B:25:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(c2 c2Var, String str) {
        int i7;
        int i10;
        int length;
        int i11;
        int[] iArr;
        long j3;
        int i12;
        long j10;
        int i13;
        int i14 = 0;
        String[] split = str == null ? new String[0] : str.trim().split("\\s+");
        int i15 = 0;
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                i15++;
            }
        }
        w wVar = c2Var.A;
        if (wVar != null) {
            i7 = wVar.m;
        } else {
            y yVar = c2Var.v;
            i7 = yVar != null ? yVar.d : -1;
        }
        if (i7 < 0) {
            z zVar = this.d;
            if (zVar == null) {
                i10 = 0;
                long j11 = 0;
                long max = Math.max(0L, i10 - 350) + this.N;
                int min = Math.min(this.M.size(), i15);
                int i16 = 1;
                long max2 = min <= 0 ? ((l) this.M.get(min - 1)).b : this.L.isEmpty() ? this.N : Math.max(this.N, ((l) i5.c.h(1, this.L)).b);
                int i17 = i15 - min;
                while (this.M.size() > i15) {
                    p0.z(1, this.M);
                }
                length = split.length;
                i11 = 0;
                int i18 = 0;
                while (i11 < length) {
                    long j12 = j11;
                    String str3 = split[i11];
                    if (str3.isEmpty()) {
                        j10 = max;
                        i12 = i18;
                    } else {
                        if (i14 < min) {
                            ((l) this.M.get(i14)).a = str3;
                            i13 = i14;
                            j10 = max;
                            i12 = i18;
                        } else {
                            i12 = i18 + 1;
                            j10 = max;
                            i13 = i14;
                            this.M.add(new l(str3, Math.max(max2, (((Math.max(max, max2) - max2) * i12) / Math.max(i16, i17)) + max2)));
                        }
                        i14 = i13 + 1;
                    }
                    i11++;
                    i18 = i12;
                    j11 = j12;
                    max = j10;
                    i16 = 1;
                }
                long j13 = j11;
                w wVar2 = c2Var.A;
                iArr = wVar2 == null ? wVar2.g : null;
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
                            l lVar = (l) this.M.get(i21);
                            long j16 = this.N;
                            lVar.b = j14 + j16;
                            j3 = j13;
                            lVar.c = Math.max(j3, j15) + j16;
                        }
                        i21++;
                        i20 = length3;
                    }
                    i19++;
                    j13 = j3;
                }
                return;
            }
            i7 = zVar.c();
        }
        i10 = i7 / 32;
        long j112 = 0;
        long max3 = Math.max(0L, i10 - 350) + this.N;
        int min2 = Math.min(this.M.size(), i15);
        int i162 = 1;
        if (min2 <= 0) {
        }
        int i172 = i15 - min2;
        while (this.M.size() > i15) {
        }
        length = split.length;
        i11 = 0;
        int i182 = 0;
        while (i11 < length) {
        }
        long j132 = j112;
        w wVar22 = c2Var.A;
        if (wVar22 == null) {
        }
        if (iArr != null) {
        }
    }

    @Override // ai.a2
    public final void x(String str) {
        String p10 = str == null ? null : n0.p(str);
        p pVar = this.h;
        if (pVar != null && this.c == 2) {
            pVar.setLanguage(p10);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.c == 2) {
            this.l0 = p10;
            eVar.setLanguage(p10);
        }
    }
}
