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
import li.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r3 implements o5.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public r3(Set set, a0.f fVar, String str, String str2, o8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? o8.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            throw a1.g.j(it);
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public void a() {
        e(null);
        k80 k80Var = (k80) this.c;
        if (k80Var != null) {
            k80Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(d6 d6Var, ArrayList arrayList) {
        u6 u6Var = (u6) this.b;
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
            li.m0 m0Var = (li.m0) obj;
            li.l0 l0Var = new li.l0(d6Var.getContext(), m0Var, u6Var);
            l0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            l0Var.setBackground(y6.Z(y6.w0(y6.i6, u6Var), 0, 0));
            l0Var.setOnClickListener(new bi.w0(this, d6Var, m0Var, 13));
            ((LinearLayout) this.d).addView(l0Var, gb1.r(-1, 48));
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float[] fArr2 = (float[]) this.a;
        float f11 = (i10 - i11) / 0.3902439f;
        if (f11 <= 0.0f || f11 > i10) {
            f11 = i10;
        }
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f11 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.b, 0, (float[]) this.c, 0);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.a, 0, (float[]) this.d, 0);
        float f12 = z10 ? 0.0125f : -0.0125f;
        float f13 = z10 ? 1.0f : -1.0f;
        float f14 = -f13;
        d(f12, 0.618561f, f13, i10, i11, fArr, 0);
        d(f12, 0.618561f, f14, i10, i11, fArr, 2);
        d(f12, -0.593561f, f14, i10, i11, fArr, 4);
        d(f12, -0.593561f, f13, i10, i11, fArr, 6);
    }

    public float d(float f7, float f10, float f11, int i10, int i11, float[] fArr, int i12) {
        float[] fArr2 = (float[]) this.f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = c3.h0.u(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.d3.A(fArr3[1], f12, 0.5f, 0.5f) * i11;
        return fArr3[2] * f12;
    }

    public void e(d6 d6Var) {
        d6 d6Var2 = (d6) this.h;
        if (d6Var2 == d6Var) {
            return;
        }
        if (d6Var2 != null) {
            d6Var2.setShowCommandBackground(false);
        }
        this.h = d6Var;
        if (d6Var != null) {
            d6Var.setShowCommandBackground(true);
        }
    }

    public void f(d6 d6Var, String str) {
        k80 k80Var;
        k80 k80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = li.m0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(d6Var);
        if (((d6) this.f) == d6Var && a2.equals((ArrayList) this.e) && (k80Var2 = (k80) this.c) != null && k80Var2.D()) {
            return;
        }
        if (((d6) this.f) == d6Var && (k80Var = (k80) this.c) != null && k80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((k80) this.c).O();
            return;
        }
        a();
        e(d6Var);
        this.f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        k80 a10 = ((li.n0) this.a).a(d6Var.getEditText());
        a10.Q = true;
        a10.s = 0;
        a10.t = false;
        a10.r((LinearLayout) this.d, gb1.r(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.p = new k2.c(this, 6);
        a10.d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.c = a10;
    }

    @Override // id.a
    public Object get() {
        Context context = (Context) ((id.a) this.a).get();
        n5.d dVar = (n5.d) ((id.a) this.b).get();
        t5.d dVar2 = (t5.d) ((id.a) this.c).get();
        s4.d dVar3 = (s4.d) ((k6.c) this.d).get();
        Executor executor = (Executor) ((id.a) this.e).get();
        u5.c cVar = (u5.c) ((id.a) this.f).get();
        pa.d dVar4 = new pa.d();
        u7.s sVar = new u7.s(24);
        t5.c cVar2 = (t5.c) ((id.a) this.h).get();
        aa.b0 b0Var = new aa.b0();
        b0Var.a = context;
        b0Var.c = dVar;
        b0Var.f = dVar2;
        b0Var.b = dVar3;
        b0Var.g = executor;
        b0Var.d = cVar;
        b0Var.e = dVar4;
        b0Var.h = sVar;
        b0Var.i = cVar2;
        return b0Var;
    }

    public r3() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }

    public r3(li.n0 n0Var, u6 u6Var) {
        this.a = n0Var;
        this.b = u6Var;
    }

    public r3(String str, da.c cVar, com.google.firebase.messaging.q qVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f = new d5.z(18, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new z9.f(cVar);
        this.b = qVar;
    }
}
