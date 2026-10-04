package k2;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.oq0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.os0;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import yh.x3;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public class e implements m.k, xo0, d5, lg.o, a81, com.google.android.gms.common.api.internal.s, h1, oq0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ e(int i10, boolean z10) {
        this.a = i10;
    }

    public static float[] f(ArrayList arrayList) {
        double d;
        double d10;
        float f7;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
        int i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f11 = pointF3.x;
                double d14 = d12;
                double d15 = f11 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f12 = pointF4.x;
                dArr5[1] = (f12 - r14) / 3.0d;
                double d16 = f12 - f11;
                dArr5[2] = d16 / 6.0d;
                float f13 = pointF4.y;
                float f14 = pointF3.y;
                dArr3[i12] = ((f13 - f14) / d16) - ((f14 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f15 = pointF6.x;
                    if (i21 < ((int) f15)) {
                        float f16 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f15 - pointF5.x;
                        double d23 = (f16 - r12) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f17 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f17 > f7) {
                            f17 = 255.0f;
                        } else if (f17 < 0.0f) {
                            f17 = 0.0f;
                        }
                        arrayList2.add(new PointF(f16, f17));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) hg.k0.g(1, arrayList));
        }
        float f18 = ((PointF) arrayList2.get(0)).x;
        if (f18 > f10) {
            for (int i23 = (int) f18; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f19 = ((PointF) hg.k0.g(1, arrayList2)).x;
        if (f19 < f7) {
            for (int i24 = ((int) f19) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    @Override // lg.o
    public void F() {
        ff0 ff0Var = ((gf0) this.b).a;
        if (ff0Var != null) {
            ((os0) ff0Var).a.e0.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // lg.o
    public void S(boolean z10) {
        ((gf0) this.b).c.setAspectLock(z10);
    }

    @Override // org.telegram.ui.Components.xo0
    public void Y(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.b;
        float f10 = hVar.b;
        float z11 = e2.z(hVar.c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            r6 r6Var = hVar.e;
            r6Var.getClass();
            r6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    public n4.a a() {
        return new n4.a(((AudioAttributes.Builder) this.b).build());
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                g8.e eVar = (g8.e) this.b;
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, eVar);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                break;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar2 = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar2.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, aVar);
                eVar2.J0(I0, 1);
                break;
        }
    }

    public s0.d b(int i10) {
        return null;
    }

    public String c(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.b;
            ka.e eVar = new ka.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public s0.d d(int i10) {
        return null;
    }

    @Override // s4.h1
    public int e(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    public void g(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    @Override // org.telegram.ui.Components.xo0
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.b;
        float f7 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
    }

    public void h(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        p4.u uVar = eVar.x.a;
        String d = mVar.d();
        p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public boolean i(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void j(c1 c1Var, q0 q0Var, q0 q0Var2) {
        boolean z10;
        c1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = c1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public e k(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // s4.h1
    public int l() {
        return ((o0) this.b).D();
    }

    public /* bridge */ void m(int i10) {
        k(i10);
    }

    @Override // s4.h1
    public int n() {
        o0 o0Var = (o0) this.b;
        return o0Var.m - o0Var.E();
    }

    @Override // lg.o
    public void n0(boolean z10) {
        gf0 gf0Var = (gf0) this.b;
        gf0Var.getClass();
        ff0 ff0Var = gf0Var.a;
        if (ff0Var != null) {
            ((os0) ff0Var).a(z10);
        }
    }

    public void o(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        o0 o0Var = recyclerView.x;
        View view = c1Var.a;
        of.e eVar = recyclerView.b;
        la.h hVar = o0Var.a;
        hh.h hVar2 = (hh.h) hVar.b;
        int indexOfChild = hVar2.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.c).A(indexOfChild)) {
                hVar.Y(view);
            }
            hVar2.a(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onStateChanged(boolean z10, int i10) {
        tk0 tk0Var = (tk0) this.b;
        if (z10 && tk0Var.n.n() >= 0) {
            tk0Var.w = true;
        }
        sg0 sg0Var = tk0Var.f;
        lc0 lc0Var = tk0Var.x;
        sg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(lc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(lc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // s4.h1
    public View p(int i10) {
        return ((o0) this.b).q(i10);
    }

    @Override // org.telegram.ui.Components.xo0
    public /* synthetic */ int p0() {
        return 0;
    }

    public Object q() {
        if (n7.a.b == null) {
            n7.a.b = new cc.k();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // s4.h1
    public int r(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override // lg.o
    public void r0() {
        ff0 ff0Var = ((gf0) this.b).a;
        if (ff0Var != null) {
            PhotoViewer photoViewer = ((os0) ff0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // org.telegram.ui.Components.oq0
    public void x0() {
        rc k10 = ((x3) this.b).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.a81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ e(s6.g gVar, s6.a aVar) {
        this.a = 21;
        this.b = aVar;
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 15;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new mh0(this);
                    break;
                }
            case 25:
                this.b = new CopyOnWriteArrayList();
                break;
            case 27:
                this.b = new z0[zf.b.values().length];
                break;
            default:
                this.b = new AudioAttributes.Builder();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.oq0
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onError(d81 d81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
