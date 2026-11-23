package m;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import oi.a6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o3 implements q5.b {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    public o3() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = new float[4];
    }

    public void a() {
        e(null);
        x60 x60Var = (x60) this.c;
        if (x60Var != null) {
            x60Var.v();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void b(a6 a6Var, ArrayList arrayList) {
        i6 i6Var = (i6) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            oi.k0 k0Var = (oi.k0) obj;
            kg.x1 x1Var = new kg.x1(a6Var.getContext(), k0Var, i6Var);
            x1Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            x1Var.setBackground(n6.a0(n6.w0(n6.i6, i6Var), 0, 0));
            x1Var.setOnClickListener(new ah.h(this, a6Var, k0Var, 19));
            ((LinearLayout) this.d).addView(x1Var, na.o(-1, 48));
        }
    }

    public void c(int i7, int i10, float f10, float f11, boolean z10, float[] fArr) {
        float[] fArr2 = (float[]) this.a;
        float f12 = (i7 - i10) / 0.3902439f;
        if (f12 <= 0.0f || f12 > i7) {
            f12 = i7;
        }
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i10 / Math.max(1.0f, f12 / 1.64f))) * 2.0d), i7 / Math.max(1, i10), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f10, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f11, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.b, 0, (float[]) this.c, 0);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.a, 0, (float[]) this.d, 0);
        float f13 = z10 ? 0.0125f : -0.0125f;
        float f14 = z10 ? 1.0f : -1.0f;
        float f15 = -f14;
        d(f13, 0.618561f, f14, i7, i10, fArr, 0);
        d(f13, 0.618561f, f15, i7, i10, fArr, 2);
        d(f13, -0.593561f, f15, i7, i10, fArr, 4);
        d(f13, -0.593561f, f14, i7, i10, fArr, 6);
    }

    public float d(float f10, float f11, float f12, int i7, int i10, float[] fArr, int i11) {
        float[] fArr2 = (float[]) this.f;
        fArr2[0] = f10;
        fArr2[1] = f11;
        fArr2[2] = f12;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f13 = 1.0f / fArr3[3];
        fArr[i11] = com.google.android.gms.internal.vision.e2.x(fArr3[0], f13, 0.5f, 0.5f) * i7;
        fArr[i11 + 1] = org.telegram.ui.Cells.c0.z(fArr3[1], f13, 0.5f, 0.5f) * i10;
        return fArr3[2] * f13;
    }

    public void e(a6 a6Var) {
        a6 a6Var2 = (a6) this.h;
        if (a6Var2 == a6Var) {
            return;
        }
        if (a6Var2 != null) {
            a6Var2.setShowCommandBackground(false);
        }
        this.h = a6Var;
        if (a6Var != null) {
            a6Var.setShowCommandBackground(true);
        }
    }

    public void f(long j3, long j10, boolean z10) {
        i6 i6Var = (i6) this.c;
        Context context = (Context) this.a;
        if (!z10) {
            this.f = null;
            fc fcVar = (fc) this.h;
            if (fcVar != null) {
                fcVar.b();
                this.h = null;
                return;
            }
            return;
        }
        int i7 = 1;
        boolean z11 = ((zb) this.f) == null;
        if (z11) {
            zb zbVar = new zb(context, i6Var);
            this.f = zbVar;
            zbVar.a.setAutoRepeat(true);
            ((zb) this.f).a.f(R.raw.download_progress, 32, 32, null);
            ((zb) this.f).a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ((zb) this.f).b.setText(gd.a0(null, null, 2131744467, (String) this.d));
            zb zbVar2 = (zb) this.f;
            dc dcVar = new dc(context, i6Var, true);
            dcVar.b = new hi.w(this, i7);
            zbVar2.setButton(dcVar);
            this.h = fc.f((FrameLayout) this.b, (zb) this.f, -1);
        }
        if (j10 > 0) {
            ((zb) this.f).c.c(gd.a0(null, null, 2131744466, org.telegram.messenger.g0.i0(Math.min(j3, j10), false, false), org.telegram.messenger.g0.i0(j10, false, false)), !z11, true);
        }
        if (z11) {
            ((fc) this.h).k(true);
        }
    }

    public void g(a6 a6Var, String str) {
        x60 x60Var;
        x60 x60Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a10 = oi.k0.a(str);
        if (a10.isEmpty()) {
            a();
            return;
        }
        e(a6Var);
        if (((a6) this.f) == a6Var && a10.equals((ArrayList) this.e) && (x60Var2 = (x60) this.c) != null && x60Var2.E()) {
            return;
        }
        if (((a6) this.f) == a6Var && (x60Var = (x60) this.c) != null && x60Var.E() && ((LinearLayout) this.d) != null) {
            this.e = a10;
            b(a6Var, a10);
            ((x60) this.c).P();
            return;
        }
        a();
        e(a6Var);
        this.f = a6Var;
        this.e = a10;
        LinearLayout linearLayout = new LinearLayout(a6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(a6Var, a10);
        x60 m10 = ((oi.l0) this.a).m(a6Var.getEditText());
        m10.T = true;
        m10.s = 0;
        m10.t = false;
        m10.r((LinearLayout) this.d, na.o(ks.x3, -2));
        m10.a0 = org.telegram.messenger.g0.L(240.0f);
        m10.i = 3;
        m10.b0(-org.telegram.messenger.g0.L(12.0f), 0.0f);
        m10.p = new kg.i0(this, 28);
        m10.g0 = true;
        if (m10.E()) {
            m10.D();
        }
        m10.a0();
        this.c = m10;
    }

    @Override // fd.a
    public Object get() {
        Context context = (Context) ((fd.a) this.a).get();
        p5.e eVar = (p5.e) ((fd.a) this.b).get();
        v5.d dVar = (v5.d) ((fd.a) this.c).get();
        i61 i61Var = (i61) ((i61) this.d).get();
        Executor executor = (Executor) ((fd.a) this.e).get();
        w5.c cVar = (w5.c) ((fd.a) this.f).get();
        qb.a aVar = new qb.a(28);
        pb.b bVar = new pb.b(28);
        v5.c cVar2 = (v5.c) ((fd.a) this.h).get();
        ia.c cVar3 = new ia.c();
        cVar3.a = context;
        cVar3.b = eVar;
        cVar3.c = dVar;
        cVar3.d = i61Var;
        cVar3.e = executor;
        cVar3.f = cVar;
        cVar3.g = aVar;
        cVar3.h = bVar;
        cVar3.i = cVar2;
        return cVar3;
    }

    public o3(Context context, FrameLayout frameLayout, i6 i6Var, String str, Runnable runnable) {
        this.a = context;
        this.b = frameLayout;
        this.c = i6Var;
        this.d = str;
        this.e = runnable;
    }

    public o3(oi.l0 l0Var, i6 i6Var) {
        this.a = l0Var;
        this.b = i6Var;
    }

    public o3(fd.a aVar, fd.a aVar2, fd.a aVar3, i61 i61Var, fd.a aVar4, fd.a aVar5, fd.a aVar6) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = i61Var;
        this.e = aVar4;
        this.f = aVar5;
        this.h = aVar6;
    }

    public o3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.h = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(o3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public o3(String str, ga.d dVar, ba.e eVar) {
        this.d = new ab.q(this, false);
        this.e = new ab.q(this, true);
        ca.q qVar = new ca.q();
        qVar.a = new ArrayList();
        qVar.b = 128;
        this.f = qVar;
        this.h = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new ca.h(dVar);
        this.b = eVar;
    }
}
