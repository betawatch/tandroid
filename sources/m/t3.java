package m;

import android.content.Context;
import android.opengl.Matrix;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ji.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Wallet.l5;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t3 implements n5.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public t3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? n8.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            throw a1.g.j(it);
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a() {
        e(null);
        l80 l80Var = (l80) this.c;
        if (l80Var != null) {
            l80Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(i6 i6Var, ArrayList arrayList) {
        c6 c6Var = (c6) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ji.n0 n0Var = (ji.n0) obj;
            ji.m0 m0Var = new ji.m0(i6Var.getContext(), n0Var, c6Var);
            m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            m0Var.setBackground(g6.Z(g6.w0(g6.i6, c6Var), 0, 0));
            m0Var.setOnClickListener(new bi.x(this, i6Var, n0Var, 10));
            ((LinearLayout) this.d).addView(m0Var, z5.n(-1, 48));
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float[] fArr2 = (float[]) this.a;
        l5.e(fArr2, i10, i11);
        float[] fArr3 = (float[]) this.b;
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = (float[]) this.c;
        l5.d(f7, f10, fArr4);
        float[] fArr5 = (float[]) this.d;
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        Matrix.multiplyMM((float[]) this.e, 0, fArr2, 0, fArr5, 0);
        float f11 = z10 ? 0.0125f : -0.0125f;
        float f12 = z10 ? 1.0f : -1.0f;
        float f13 = -f12;
        float f14 = f11;
        d(f14, 0.618561f, f12, i10, i11, fArr, 0);
        d(f14, 0.618561f, f13, i10, i11, fArr, 2);
        d(f14, -0.593561f, f13, i10, i11, fArr, 4);
        d(f14, -0.593561f, f12, i10, i11, fArr, 6);
    }

    public void d(float f7, float f10, float f11, int i10, int i11, float[] fArr, int i12) {
        float[] fArr2 = (float[]) this.f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        float[] fArr3 = (float[]) this.h;
        Matrix.multiplyMV(fArr3, 0, (float[]) this.e, 0, fArr2, 0);
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.play_billing.k3.t(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = (0.5f - ((fArr3[1] * f12) * 0.5f)) * i11;
    }

    public void e(i6 i6Var) {
        i6 i6Var2 = (i6) this.h;
        if (i6Var2 == i6Var) {
            return;
        }
        if (i6Var2 != null) {
            i6Var2.setShowCommandBackground(false);
        }
        this.h = i6Var;
        if (i6Var != null) {
            i6Var.setShowCommandBackground(true);
        }
    }

    public void f(i6 i6Var, String str) {
        l80 l80Var;
        l80 l80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ji.n0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(i6Var);
        if (((i6) this.f) == i6Var && a2.equals((ArrayList) this.e) && (l80Var2 = (l80) this.c) != null && l80Var2.D()) {
            return;
        }
        if (((i6) this.f) == i6Var && (l80Var = (l80) this.c) != null && l80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(i6Var, a2);
            ((l80) this.c).O();
            return;
        }
        a();
        e(i6Var);
        this.f = i6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(i6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(i6Var, a2);
        l80 h = ((ji.o0) this.a).h(i6Var.getEditText());
        h.Q = true;
        h.s = 0;
        h.t = false;
        h.r((LinearLayout) this.d, z5.n(220, -2));
        h.X = AndroidUtilities.dp(240.0f);
        h.i = 3;
        h.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        h.p = new ig.t0(this, 9);
        h.d0 = true;
        if (h.D()) {
            h.C();
        }
        h.Z();
        this.c = h;
    }

    @Override // hd.a
    public Object get() {
        Context context = (Context) ((hd.a) this.a).get();
        m5.d dVar = (m5.d) ((hd.a) this.b).get();
        s5.d dVar2 = (s5.d) ((hd.a) this.c).get();
        h3 h3Var = (h3) ((h3) this.d).get();
        Executor executor = (Executor) ((hd.a) this.e).get();
        t5.c cVar = (t5.c) ((hd.a) this.f).get();
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        s5.c cVar2 = (s5.c) ((hd.a) this.h).get();
        ea.b bVar2 = new ea.b();
        bVar2.a = context;
        bVar2.b = dVar;
        bVar2.c = dVar2;
        bVar2.d = h3Var;
        bVar2.e = executor;
        bVar2.f = cVar;
        bVar2.g = bVar;
        bVar2.h = aVar;
        bVar2.i = cVar2;
        return bVar2;
    }

    public t3(ji.o0 o0Var, c6 c6Var) {
        this.a = o0Var;
        this.b = c6Var;
    }

    public t3(String str, ca.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f = new c5.c0(17, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new y9.f(cVar);
        this.b = sVar;
    }

    public t3() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }
}
