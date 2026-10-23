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
import ki.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j80;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class s3 implements n5.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public s3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
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
        j80 j80Var = (j80) this.c;
        if (j80Var != null) {
            j80Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(c6 c6Var, ArrayList arrayList) {
        g6 g6Var = (g6) this.b;
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
            ki.n0 n0Var = (ki.n0) obj;
            ki.m0 m0Var = new ki.m0(c6Var.getContext(), n0Var, g6Var);
            m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            m0Var.setBackground(k6.Z(k6.w0(k6.i6, g6Var), 0, 0));
            m0Var.setOnClickListener(new ai.v0(this, c6Var, n0Var, 13));
            ((LinearLayout) this.d).addView(m0Var, z5.n(-1, 48));
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
        fArr[i12] = com.google.android.gms.internal.play_billing.k3.t(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.Cells.b1.x(fArr3[1], f12, 0.5f, 0.5f) * i11;
        return fArr3[2] * f12;
    }

    public void e(c6 c6Var) {
        c6 c6Var2 = (c6) this.h;
        if (c6Var2 == c6Var) {
            return;
        }
        if (c6Var2 != null) {
            c6Var2.setShowCommandBackground(false);
        }
        this.h = c6Var;
        if (c6Var != null) {
            c6Var.setShowCommandBackground(true);
        }
    }

    public void f(c6 c6Var, String str) {
        j80 j80Var;
        j80 j80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ki.n0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(c6Var);
        if (((c6) this.f) == c6Var && a2.equals((ArrayList) this.e) && (j80Var2 = (j80) this.c) != null && j80Var2.D()) {
            return;
        }
        if (((c6) this.f) == c6Var && (j80Var = (j80) this.c) != null && j80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(c6Var, a2);
            ((j80) this.c).O();
            return;
        }
        a();
        e(c6Var);
        this.f = c6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(c6Var, a2);
        j80 i10 = ((ki.o0) this.a).i(c6Var.getEditText());
        i10.Q = true;
        i10.s = 0;
        i10.t = false;
        i10.r((LinearLayout) this.d, z5.n(220, -2));
        i10.X = AndroidUtilities.dp(240.0f);
        i10.i = 3;
        i10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        i10.p = new ki.u(this, 2);
        i10.d0 = true;
        if (i10.D()) {
            i10.C();
        }
        i10.Z();
        this.c = i10;
    }

    @Override // hd.a
    public Object get() {
        Context context = (Context) ((hd.a) this.a).get();
        m5.d dVar = (m5.d) ((hd.a) this.b).get();
        s5.d dVar2 = (s5.d) ((hd.a) this.c).get();
        g3 g3Var = (g3) ((g3) this.d).get();
        Executor executor = (Executor) ((hd.a) this.e).get();
        t5.c cVar = (t5.c) ((hd.a) this.f).get();
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        s5.c cVar2 = (s5.c) ((hd.a) this.h).get();
        ea.b bVar2 = new ea.b();
        bVar2.a = context;
        bVar2.b = dVar;
        bVar2.c = dVar2;
        bVar2.d = g3Var;
        bVar2.e = executor;
        bVar2.f = cVar;
        bVar2.g = bVar;
        bVar2.h = aVar;
        bVar2.i = cVar2;
        return bVar2;
    }

    public s3() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }

    public s3(ki.o0 o0Var, g6 g6Var) {
        this.a = o0Var;
        this.b = g6Var;
    }

    public s3(String str, ca.c cVar, com.google.firebase.messaging.r rVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f = new c5.c0(18, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new y9.f(cVar);
        this.b = rVar;
    }
}
