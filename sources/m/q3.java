package m;

import android.content.Context;
import android.opengl.Matrix;
import android.widget.LinearLayout;
import ii.f6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Wallet.k5;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class q3 implements n5.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public q3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
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
            throw a1.g.k(it);
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a() {
        e(null);
        p80 p80Var = (p80) this.c;
        if (p80Var != null) {
            p80Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(f6 f6Var, ArrayList arrayList) {
        e6 e6Var = (e6) this.b;
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
            ii.o0 o0Var = (ii.o0) obj;
            ii.n0 n0Var = new ii.n0(f6Var.getContext(), o0Var, e6Var);
            n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            n0Var.setBackground(i6.Z(i6.w0(i6.i6, e6Var), 0, 0));
            n0Var.setOnClickListener(new ai.d0(this, f6Var, o0Var, 10));
            ((LinearLayout) this.d).addView(n0Var, x5.n(-1, 48));
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float[] fArr2 = (float[]) this.a;
        k5.e(fArr2, i10, i11);
        float[] fArr3 = (float[]) this.b;
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = (float[]) this.c;
        k5.d(f7, f10, fArr4);
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
        fArr[i12] = com.google.android.gms.internal.vision.e2.w(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = (0.5f - ((fArr3[1] * f12) * 0.5f)) * i11;
    }

    public void e(f6 f6Var) {
        f6 f6Var2 = (f6) this.h;
        if (f6Var2 == f6Var) {
            return;
        }
        if (f6Var2 != null) {
            f6Var2.setShowCommandBackground(false);
        }
        this.h = f6Var;
        if (f6Var != null) {
            f6Var.setShowCommandBackground(true);
        }
    }

    public void f(f6 f6Var, String str) {
        p80 p80Var;
        p80 p80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(f6Var);
        if (((f6) this.f) == f6Var && a2.equals((ArrayList) this.e) && (p80Var2 = (p80) this.c) != null && p80Var2.D()) {
            return;
        }
        if (((f6) this.f) == f6Var && (p80Var = (p80) this.c) != null && p80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(f6Var, a2);
            ((p80) this.c).O();
            return;
        }
        a();
        e(f6Var);
        this.f = f6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(f6Var, a2);
        p80 a10 = ((ii.p0) this.a).a(f6Var.getEditText());
        a10.Q = true;
        a10.s = 0;
        a10.t = false;
        a10.r((LinearLayout) this.d, x5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.p = new i2.h0(this, 4);
        a10.d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.c = a10;
    }

    @Override // gd.a
    public Object get() {
        Context context = (Context) ((gd.a) this.a).get();
        m5.d dVar = (m5.d) ((gd.a) this.b).get();
        s5.d dVar2 = (s5.d) ((gd.a) this.c).get();
        la.h hVar = (la.h) ((la.h) this.d).get();
        Executor executor = (Executor) ((gd.a) this.e).get();
        t5.c cVar = (t5.c) ((gd.a) this.f).get();
        ob.a aVar = new ob.a(24);
        na.d dVar3 = new na.d(24);
        s5.c cVar2 = (s5.c) ((gd.a) this.h).get();
        da.c cVar3 = new da.c();
        cVar3.a = context;
        cVar3.b = dVar;
        cVar3.c = dVar2;
        cVar3.d = hVar;
        cVar3.e = executor;
        cVar3.f = cVar;
        cVar3.g = aVar;
        cVar3.h = dVar3;
        cVar3.i = cVar2;
        return cVar3;
    }

    public q3(ii.p0 p0Var, e6 e6Var) {
        this.a = p0Var;
        this.b = e6Var;
    }

    public q3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.e = new com.google.firebase.messaging.m(this, true);
        this.f = new c5.b0(14, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new x9.f(cVar);
        this.b = sVar;
    }

    public q3() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }
}
