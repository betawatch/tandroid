package gc;

import a3.s;
import a8.p0;
import a8.t9;
import ai.w0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.car.app.j;
import ca.n;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.r0;
import h6.g;
import h6.h;
import hi.m;
import hi.q4;
import hi.u9;
import hi.v5;
import hi.wa;
import hi.x5;
import j6.i;
import j6.r;
import j6.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.o1;
import jg.x1;
import jg.y1;
import l2.i0;
import li.d0;
import m.x0;
import n2.p;
import n2.s0;
import n2.u0;
import n2.v;
import oi.a5;
import oi.c5;
import oi.d1;
import oi.d2;
import oi.e1;
import oi.g0;
import oi.k2;
import oi.k3;
import oi.q3;
import oi.w;
import oi.x2;
import oi.z1;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.j6;
import org.telegram.messenger.l0;
import org.telegram.messenger.m0;
import org.telegram.messenger.ns;
import org.telegram.messenger.ua;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.bg0;
import org.telegram.ui.jw;
import org.telegram.ui.o00;
import org.telegram.ui.sz;
import org.telegram.ui.yz;
import sg.h1;
import sg.k0;
import tg.l1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class b implements g90, l1, s51, wa, i6.a, ft0, q, y1, yz, x0, OnCompleteListener, v, g0, r4, d1, ua {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(int i7, boolean z10) {
        this.a = i7;
    }

    public void B0() {
        ia.d dVar = (ia.d) this.b;
        dVar.getClass();
        try {
            l8.b bVar = (l8.b) dVar.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public void C0() {
        ia.d dVar = (ia.d) this.b;
        dVar.getClass();
        try {
            l8.b bVar = (l8.b) dVar.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    public void D0() {
        ia.d dVar = (ia.d) this.b;
        dVar.getClass();
        try {
            l8.b bVar = (l8.b) dVar.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // oi.g0
    public h9 E() {
        k3 k3Var = ((w) this.b).P;
        if (k3Var != null) {
            return k3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    public float E0(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        b bVar;
        int i19;
        int i20 = 1;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z10) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = 2;
        int i22 = (-abs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i21;
                break;
            }
            int i29 = z10 ? i27 : i26;
            int i30 = z10 ? i26 : i27;
            boolean z11 = z10;
            if (i28 == i20) {
                i18 = i20;
                i19 = abs;
                bVar = this;
            } else {
                i18 = 0;
                bVar = this;
                i19 = abs;
            }
            if (i18 == ((cc.b) bVar.b).b(i29, i30)) {
                if (i28 == 2) {
                    return t9.b(i26, i27, i13, i14);
                }
                i28++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i17 = 2;
                    break;
                }
                i27 += i24;
                i22 -= i19;
            }
            i26 += i23;
            abs = i19;
            z10 = z11;
            i20 = 1;
            i21 = 2;
        }
        if (i28 == i17) {
            return t9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    @Override // org.telegram.ui.Components.ft0
    public void F(boolean z10) {
        ii.f fVar = (ii.f) this.b;
        te.a aVar = fVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        o00 o00Var = fVar.s;
        if (o00Var != null) {
            o00Var.invalidate();
        }
    }

    public float F0(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.b;
        float E0 = E0(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i7) / (i13 - i7);
                int i16 = i15 - 1;
                f10 = f12;
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i10;
        int i17 = (int) (f13 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f13 / (i10 - i17);
        } else {
            int i18 = bVar.b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (E0(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + E0) - 1.0f;
    }

    @Override // n2.v
    public void G() {
        s sVar;
        u0 u0Var = (u0) this.b;
        synchronized (u0Var.a) {
            sVar = u0Var.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    public void G0() {
        h hVar = (h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a();
        }
    }

    @Override // oi.g0
    public void J(CharSequence charSequence) {
        k3 k3Var = ((w) this.b).P;
        if (k3Var != null) {
            k3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            k3Var.a.w4(charSequence.toString());
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        z1 z1Var = (z1) this.b;
        z1Var.x0(i7, i10, z10);
        bg0 bg0Var = z1Var.P0;
        if (bg0Var != null) {
            bg0Var.i();
            z1Var.P0 = null;
        }
    }

    @Override // oi.g0
    public g9 N() {
        return (w) this.b;
    }

    @Override // oi.g0
    public oi.a P() {
        return ((w) this.b).a;
    }

    @Override // org.telegram.ui.Components.g90
    public Paint.FontMetricsInt Q() {
        return ((m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // oi.g0
    public boolean R() {
        w wVar = (w) this.b;
        k3 k3Var = wVar.P;
        if (k3Var == null) {
            return false;
        }
        oi.a aVar = wVar.a;
        return k3Var.a.V4();
    }

    @Override // n2.v
    public void T(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new p(aVar, exc, 1));
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ft0
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((ii.f) this.b).c0), 0);
    }

    @Override // oi.g0
    public void V(int i7, int i10) {
        w wVar = (w) this.b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.a;
            d2 d2Var = k3Var.a.R3;
            if (d2Var != null) {
                d2Var.f(i7, i10);
            }
        }
    }

    @Override // n2.v
    public void W() {
        ((u0) this.b).k1 = true;
    }

    @Override // oi.d1
    public void Z(e1 e1Var, int i7, int i10) {
        a5 a5Var;
        h9 textSelectionHelper;
        c5 c5Var = (c5) this.b;
        if (c5Var.x || i7 == i10 || (a5Var = c5Var.s) == null || (textSelectionHelper = ((x2) a5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new o1(this, e1Var, i10, textSelectionHelper, i7, 3));
    }

    @Override // n2.v
    public void a(int i7) {
        u2.j jVar;
        u0 u0Var = (u0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = u0Var.d1) != null) {
            jVar.d(i7);
        }
        k8.a aVar = u0Var.b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new w0(aVar, i7, 15));
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                r rVar = new r(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((t) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 7);
                break;
            default:
                l7.b bVar = (l7.b) this.b;
                l7.a aVar = new l7.a((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                String str = bVar.l;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.a;
                l1.writeStrongBinder(aVar);
                l1.writeString(str);
                iVar2.m1(l1, 2);
                break;
        }
    }

    @Override // n2.v
    public void b(long j3) {
        u0 u0Var = (u0) this.b;
        u0Var.n1 = true;
        k8.a aVar = u0Var.b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new di.x2(aVar, j3, 13));
        }
    }

    @Override // oi.d1
    public void b0(Editable editable) {
        ((c5) this.b).g();
    }

    @Override // org.telegram.ui.Components.ft0
    public int b1() {
        return ((ii.f) this.b).d0;
    }

    @Override // n2.v
    public void c(boolean z10) {
        k8.a aVar = ((u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ai.q(13, aVar, z10));
        }
    }

    @Override // oi.g0
    public void c0() {
        w wVar = (w) this.b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.a;
            q3 q3Var = k3Var.a;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.p3.onContentChanged();
        }
    }

    @Override // oi.g0, oi.d1
    public void d(e1 e1Var) {
        switch (this.a) {
            case 22:
                k3 k3Var = ((w) this.b).P;
                if (k3Var != null) {
                    q3 q3Var = k3Var.a;
                    q3.Q1(q3Var, e1Var);
                    q3Var.p3.b(e1Var, true);
                    break;
                }
                break;
            default:
                a5 a5Var = ((c5) this.b).s;
                if (a5Var != null) {
                    q3 q3Var2 = ((x2) a5Var).a;
                    q3.Q1(q3Var2, e1Var);
                    q3Var2.p3.b(e1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // jg.y1
    public boolean e0(int i7) {
        switch (this.a) {
            case 10:
                return i7 == ((cm0) this.b).e0;
            default:
                return true;
        }
    }

    @Override // n2.v
    public void f(s0 s0Var) {
        k8.a aVar = ((u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override // oi.d1
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.yz
    public boolean g0() {
        return false;
    }

    @Override // tg.l1
    public float get() {
        u9 u9Var = (u9) this.b;
        int i7 = u9Var.p1;
        sg.h currentBrush = u9Var.y0.getCurrentBrush();
        return currentBrush == null ? k0.e(i7).i : k0.e(i7).f(String.valueOf(sg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // oi.g0
    public void h() {
        w wVar = (w) this.b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            q3.T1(k3Var.a, wVar.a);
        }
    }

    @Override // oi.d1
    public /* synthetic */ boolean h0(boolean z10) {
        return false;
    }

    @Override // jg.y1
    public void i(int i7) {
        switch (this.a) {
            case 10:
                cm0 cm0Var = (cm0) this.b;
                cm0Var.E0--;
                cm0Var.f0 = i7;
                if (cm0Var.g0 != i7) {
                    cm0Var.s.clear();
                }
                if (cm0Var.h0 != i7) {
                    cm0Var.J.clear();
                }
                cm0Var.O = true;
                jw jwVar = cm0Var.V;
                if (jwVar != null) {
                    jwVar.d(cm0Var.E0 > 0, true);
                }
                cm0Var.f();
                jw jwVar2 = cm0Var.V;
                if (jwVar2 != null) {
                    jwVar2.c();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new hi.e1(this, 27));
                break;
        }
    }

    @Override // org.telegram.ui.yz
    public boolean l(sz szVar) {
        return false;
    }

    @Override // jg.y1
    public void l0(ArrayList arrayList) {
        switch (this.a) {
            case 10:
                cm0 cm0Var = (cm0) this.b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    cm0Var.K.add(((x1) arrayList.get(i7)).a);
                }
                jw jwVar = cm0Var.V;
                if (jwVar != null) {
                    jwVar.d(cm0Var.E0 > 0, false);
                }
                cm0Var.f();
                break;
        }
    }

    public float m0(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.a;
        int i10 = (int) cVar.b;
        int i11 = (int) cVar2.a;
        int i12 = (int) cVar2.b;
        float F0 = F0(i7, i10, i11, i12);
        float F02 = F0((int) cVar2.a, i12, (int) cVar.a, i10);
        return Float.isNaN(F0) ? F02 / 7.0f : Float.isNaN(F02) ? F0 / 7.0f : (F0 + F02) / 14.0f;
    }

    @Override // n2.v
    public void n0() {
        i0 i0Var = ((u0) this.b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // oi.d1
    public /* synthetic */ boolean o(e1 e1Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onStateChanged(boolean z10, int i7) {
        x5 x5Var = (x5) this.b;
        v5 v5Var = x5Var.M;
        org.telegram.messenger.g0.r(v5Var);
        u51 u51Var = x5Var.E;
        if (u51Var == null || !u51Var.d0()) {
            return;
        }
        org.telegram.messenger.g0.h3(v5Var);
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((x5) this.b).i();
    }

    @Override // org.telegram.ui.Components.g90
    public void p0(int i7, int i10, CharSequence charSequence, boolean z10) {
        hi.g gVar = ((m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // n2.v
    public void q() {
        ((u0) this.b).m1 = true;
    }

    @Override // oi.d1
    public /* synthetic */ boolean q0(e1 e1Var) {
        return false;
    }

    @Override // tg.l1
    public void r0(float f10) {
        u9 u9Var = (u9) this.b;
        k0.e(u9Var.p1).k(String.valueOf(sg.h.a.indexOf(u9Var.y0.getCurrentBrush())), f10);
        h1 h1Var = u9Var.k1;
        h1Var.c = f10;
        u9Var.B0(h1Var, null, false);
    }

    @Override // n2.v
    public void t() {
        i0 i0Var = ((u0) this.b).Z;
        if (i0Var != null) {
            i0Var.a.j0 = true;
        }
    }

    @Override // n2.v
    public void u(s0 s0Var) {
        k8.a aVar = ((u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override // oi.g0
    public void u0() {
        w wVar = (w) this.b;
        k3 k3Var = wVar.P;
        if (k3Var != null) {
            oi.a aVar = wVar.a;
            q3.S1(k3Var.a);
        }
    }

    @Override // hi.wa
    public void v(boolean z10, float f10) {
        ((q4) this.b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override // n2.v
    public void w0(long j3, int i7, long j10) {
        k8.a aVar = ((u0) this.b).b1;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override // i6.a
    public void x(Bitmap bitmap) {
        j6.b bVar = i6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) p0.f(f10, 9.0f, 16.0f, 0.5f);
            float f12 = (f11 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f12, f10, height + f12);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, f11, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((i6.h) this.b).e(0, bitmap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw bc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cc.e x0(ab.q qVar) {
        int f10;
        e eVar;
        c cVar;
        int i7;
        int i10;
        cc.d dVar;
        int f11;
        f v = qVar.v();
        c cVar2 = qVar.u().a;
        d u10 = qVar.u();
        f v10 = qVar.v();
        int i11 = p1.g.d(8)[u10.b];
        cc.b bVar = (cc.b) qVar.b;
        int i12 = bVar.b;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                if (e2.b(i11, i14, i15)) {
                    bVar.a(i15, i14);
                }
            }
        }
        int i16 = v10.a * 4;
        int i17 = i16 + 17;
        int i18 = v10.d;
        cc.b bVar2 = new cc.b(i17, i17);
        bVar2.d(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar2.d(i19, 0, 8, 9);
        bVar2.d(0, i19, 9, 8);
        int[] iArr = v10.b;
        int length = iArr.length;
        int i20 = 0;
        while (i20 < length) {
            int i21 = iArr[i20] - 2;
            for (int i22 = i13; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar2.d(iArr[i22] - 2, i21, 5, 5);
                }
            }
            i20++;
            i13 = 0;
        }
        int i23 = 2;
        int i24 = 6;
        int i25 = 1;
        bVar2.d(6, 9, 1, i16);
        bVar2.d(9, 6, i16, 1);
        if (v10.a > 6) {
            int i26 = i16 + 6;
            bVar2.d(i26, 0, 3, 6);
            bVar2.d(0, i26, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i27 = i12 - 1;
        int i28 = i27;
        boolean z10 = true;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i28 > 0) {
            if (i28 == i24) {
                i28--;
            }
            int i32 = 0;
            while (i32 < i12) {
                int i33 = z10 ? i27 - i32 : i32;
                int i34 = i25;
                int i35 = 0;
                for (int i36 = i23; i35 < i36; i36 = 2) {
                    int i37 = i28 - i35;
                    if (!bVar2.b(i37, i33)) {
                        i30++;
                        i31 <<= 1;
                        if (bVar.b(i37, i33)) {
                            i31 |= 1;
                        }
                        if (i30 == 8) {
                            bArr[i29] = (byte) i31;
                            i29++;
                            i30 = 0;
                            i31 = 0;
                        }
                    }
                    i35++;
                }
                i32++;
                i25 = i34;
                i23 = 2;
            }
            z10 = !z10;
            i28 -= 2;
            i24 = 6;
            i23 = 2;
        }
        int i38 = i25;
        if (i29 != i18) {
            throw bc.c.a();
        }
        if (i18 != v.d) {
            throw new IllegalArgumentException();
        }
        f5.v vVar = v.c[cVar2.ordinal()];
        r0[] r0VarArr = (r0[]) vVar.c;
        int i39 = vVar.b;
        int i40 = 0;
        for (r0 r0Var : r0VarArr) {
            i40 += r0Var.a;
        }
        n[] nVarArr = new n[i40];
        int i41 = 0;
        for (r0 r0Var2 : r0VarArr) {
            int i42 = 0;
            while (i42 < r0Var2.a) {
                int i43 = r0Var2.b;
                nVarArr[i41] = new n(i43, new byte[i39 + i43]);
                i42++;
                i41++;
            }
        }
        int length2 = nVarArr[0].b.length;
        int i44 = i40 - 1;
        while (i44 >= 0 && nVarArr[i44].b.length != length2) {
            i44--;
        }
        int i45 = i44 + 1;
        int i46 = length2 - i39;
        int i47 = 0;
        int i48 = 0;
        while (i47 < i46) {
            int i49 = i48;
            int i50 = 0;
            while (i50 < i41) {
                nVarArr[i50].b[i47] = bArr[i49];
                i50++;
                i49++;
            }
            i47++;
            i48 = i49;
        }
        int i51 = i45;
        while (i51 < i41) {
            nVarArr[i51].b[i46] = bArr[i48];
            i51++;
            i48++;
        }
        boolean z11 = false;
        int length3 = nVarArr[0].b.length;
        while (i46 < length3) {
            int i52 = i48;
            int i53 = 0;
            while (i53 < i41) {
                nVarArr[i53].b[i53 < i45 ? i46 : i46 + 1] = bArr[i52];
                i53++;
                i52++;
            }
            i46++;
            i48 = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i40; i55++) {
            i54 += nVarArr[i55].a;
        }
        byte[] bArr2 = new byte[i54];
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        while (i57 < i40) {
            n nVar = nVarArr[i57];
            byte[] bArr3 = nVar.b;
            int i59 = nVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i60 = 0; i60 < length4; i60++) {
                iArr2[i60] = bArr3[i60] & 255;
            }
            try {
                int R = ((d6.i) this.b).R(iArr2, bArr3.length - i59);
                for (int i61 = 0; i61 < i59; i61++) {
                    bArr3[i61] = (byte) iArr2[i61];
                }
                i56 += R;
                int i62 = i58;
                int i63 = 0;
                while (i63 < i59) {
                    bArr2[i62] = bArr3[i63];
                    i63++;
                    i62++;
                }
                i57++;
                i58 = i62;
            } catch (ec.c unused) {
                bc.a aVar = bc.a.c;
                if (bc.h.a) {
                    throw new bc.a();
                }
                throw bc.a.c;
            }
        }
        char[] cArr = a.a;
        cc.c cVar3 = new cc.c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i38);
        int i64 = -1;
        int i65 = -1;
        boolean z12 = false;
        boolean z13 = false;
        cc.d dVar2 = null;
        while (true) {
            try {
                int d = cVar3.d();
                e eVar2 = e.c;
                if (d < 4 || (f10 = cVar3.f(4)) == 0) {
                    eVar = eVar2;
                } else if (f10 == 1) {
                    eVar = e.d;
                } else if (f10 == 2) {
                    eVar = e.e;
                } else if (f10 == 3) {
                    eVar = e.f;
                } else if (f10 == 4) {
                    eVar = e.h;
                } else if (f10 == 5) {
                    eVar = e.s;
                } else if (f10 == 7) {
                    eVar = e.n;
                } else if (f10 == 8) {
                    eVar = e.r;
                } else if (f10 == 9) {
                    eVar = e.w;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = e.x;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i7 = i56;
                            i10 = 1;
                            int f12 = cVar3.f(8);
                            if ((f12 & 128) == 0) {
                                f11 = f12 & ns.L1;
                            } else if ((f12 & ns.W2) == 128) {
                                f11 = ((f12 & 63) << 8) | cVar3.f(8);
                            } else {
                                if ((f12 & ns.B3) != 192) {
                                    throw bc.c.a();
                                }
                                f11 = ((f12 & 31) << 16) | cVar3.f(16);
                            }
                            HashMap hashMap = cc.d.c;
                            if (f11 < 0 || f11 >= 900) {
                                break;
                            }
                            cc.d dVar3 = (cc.d) cc.d.c.get(Integer.valueOf(f11));
                            if (dVar3 == null) {
                                throw bc.c.a();
                            }
                            dVar = dVar3;
                        } else if (ordinal == 7) {
                            i7 = i56;
                            i10 = 1;
                            dVar = dVar2;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i7 = i56;
                            i10 = 1;
                            dVar = dVar2;
                            z12 = true;
                            z13 = true;
                            int i66 = i64;
                            if (eVar != eVar2) {
                                if (dVar != null) {
                                    i10 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i10 = 3;
                                } else if (z13) {
                                    i10 = 5;
                                }
                                cc.e eVar3 = new cc.e(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i66, i65, i10);
                                eVar3.g = Integer.valueOf(i7);
                                return eVar3;
                            }
                            i64 = i66;
                            cVar2 = cVar;
                            dVar2 = dVar;
                            i56 = i7;
                        } else if (ordinal != 9) {
                            int f13 = cVar3.f(eVar.a(v));
                            int ordinal2 = eVar.ordinal();
                            i7 = i56;
                            if (ordinal2 == 1) {
                                a.e(cVar3, sb2, f13);
                            } else if (ordinal2 == 2) {
                                a.a(cVar3, sb2, f13, z12);
                            } else if (ordinal2 == 4) {
                                a.b(cVar3, sb2, f13, dVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw bc.c.a();
                                }
                                a.d(cVar3, sb2, f13);
                            }
                        } else {
                            i7 = i56;
                            int f14 = cVar3.f(4);
                            int f15 = cVar3.f(eVar.a(v));
                            i10 = 1;
                            if (f14 == 1) {
                                a.c(cVar3, sb2, f15);
                            }
                        }
                        int i662 = i64;
                        if (eVar != eVar2) {
                        }
                    } else {
                        i7 = i56;
                        i10 = 1;
                        if (cVar3.d() < 16) {
                            throw bc.c.a();
                        }
                        i64 = cVar3.f(8);
                        i65 = cVar3.f(8);
                    }
                    dVar = dVar2;
                    int i6622 = i64;
                    if (eVar != eVar2) {
                    }
                } else {
                    cVar = cVar2;
                    i7 = i56;
                }
                i10 = 1;
                dVar = dVar2;
                int i66222 = i64;
                if (eVar != eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw bc.c.a();
            }
        }
    }

    @Override // org.telegram.ui.yz
    public void y(gj gjVar) {
        d0 d0Var = (d0) this.b;
        d0Var.u1.presentFragment(jm0.K(d0Var.a, gjVar));
        d0Var.dismiss();
    }

    public hc.a y0(float f10, float f11, int i7, int i10) {
        hc.a b10;
        hc.a b11;
        int i11 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i11);
        cc.b bVar = (cc.b) this.b;
        int min = Math.min(bVar.a - 1, i7 + i11) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw bc.e.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar.b - 1, i10 + i11) - max2;
        if (min2 < f12) {
            throw bc.e.a();
        }
        cc.b bVar2 = (cc.b) this.b;
        hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
        int i12 = bVar3.e;
        int i13 = bVar3.c;
        int i14 = i12 + i13;
        int i15 = bVar3.f;
        int i16 = (i15 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (i19 < i14 && !bVar2.b(i19, i18)) {
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar2.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i18, i19, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i18, i14, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw bc.e.a();
        }
        return (hc.a) arrayList.get(0);
    }

    @Override // oi.d1
    public void z(e1 e1Var) {
        oi.a aVar;
        c5 c5Var = (c5) this.b;
        a5 a5Var = c5Var.s;
        if (a5Var == null || (aVar = c5Var.a) == null) {
            return;
        }
        q3 q3Var = ((x2) a5Var).a;
        ArrayList arrayList = q3Var.t3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i7 = -1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((oi.a) arrayList.get(i10)).k.contains(Long.valueOf(j3))) {
                i7 = i10;
            }
        }
        if (i7 < 0) {
            return;
        }
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
        }
        oi.a aVar2 = new oi.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            p0.z(1, arrayList3);
        }
        arrayList.add(i7 + 1, aVar2);
        q3Var.v4();
        q3Var.g3.O(false);
        d2 d2Var2 = q3Var.R3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        q3Var.post(new k2(q3Var, aVar2, 26));
    }

    public long z0(TimeUnit timeUnit) {
        return timeUnit.convert(((l0) this.b).c, TimeUnit.SECONDS);
    }

    public /* synthetic */ b(j6.s sVar, String[] strArr) {
        this.a = 9;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.s51
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public b(a7.a aVar) {
        this.a = 11;
        q6.m.g(aVar);
        this.b = aVar;
    }

    public b(int i7) {
        this.a = i7;
        switch (i7) {
            case 13:
                this.b = new HashMap();
                break;
            case 17:
                this.b = new AtomicInteger(0);
                break;
            case 25:
                this.b = new org.telegram.messenger.i0();
                break;
            case 26:
                this.b = new m0();
                break;
            default:
                this.b = new d6.i(ec.a.h, 15);
                break;
        }
    }

    public b(String str, long j3) {
        this.a = 27;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = new l0(str, j3);
    }

    @Override // oi.d1
    public /* synthetic */ void B() {
    }

    @Override // org.telegram.ui.yz
    public void j() {
    }

    @Override // hi.wa
    public /* synthetic */ void k0() {
    }

    @Override // hi.wa
    public /* synthetic */ void s() {
    }

    private final /* synthetic */ void A0(ArrayList arrayList) {
    }

    @Override // hi.wa
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // m.x0
    public void C(int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void H(float f10) {
    }

    @Override // oi.d1
    public /* synthetic */ void I(CharSequence charSequence) {
    }

    @Override // hi.wa
    public /* synthetic */ void O(long j3) {
    }

    @Override // hi.wa
    public /* synthetic */ void S(boolean z10) {
    }

    @Override // hi.wa
    public /* synthetic */ void Y(float f10) {
    }

    @Override // m.x0
    public void d0(int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void e(int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void f0(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void j0(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void k(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void n(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void o0(float f10) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // hi.wa
    public /* synthetic */ void t0(long j3) {
    }

    @Override // org.telegram.ui.Components.g90
    public /* synthetic */ void v0(String str) {
    }

    @Override // hi.wa
    public /* synthetic */ void w(float f10) {
    }

    @Override // hi.wa
    public /* synthetic */ void D(float f10, int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void X(float f10, int i7) {
    }

    @Override // hi.wa
    public /* synthetic */ void i0(float f10, int i7) {
    }

    @Override // oi.d1
    public /* synthetic */ void m(int i7, int i10) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onError(u51 u51Var, Exception exc) {
    }

    @Override // hi.wa
    public /* synthetic */ void p(long j3, boolean z10) {
    }

    @Override // hi.wa
    public /* synthetic */ void s0(int i7, long j3) {
    }

    @Override // org.telegram.ui.yz
    public void M(gj gjVar, View view, int i7) {
    }

    @Override // org.telegram.ui.Components.g90
    public /* synthetic */ void a0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.g90
    public /* synthetic */ void r(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
