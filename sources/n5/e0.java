package n5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.UUID;
import m.t3;
import nh.p0;
import nh.q0;
import of.u1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.x60;
import org.telegram.ui.nu0;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import qh.a4;
import qh.b2;
import qh.c3;
import qh.d1;
import qh.g0;
import qh.h3;
import qh.i3;
import qh.l3;
import qh.l4;
import qh.m3;
import qh.n3;
import qh.o3;
import qh.s5;
import qh.x1;
import yf.m2;
import yf.v1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public /* synthetic */ class e0 implements OnCompleteListener, na.n, p0, q5.o, u1, k1, ig.g, ud.a, p5.a, ii, g0, m3, com.google.android.gms.common.api.internal.s, td.b, y2.b, v1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ e0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // td.b
    public void B(float f10, int i9) {
        ((td.h) this.b).i(f10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String C(long j10) {
        return null;
    }

    @Override // qh.m3
    public void C0() {
        x1 x1Var = (x1) this.b;
        x1Var.E0 = x1Var.G0;
        x1.Y(x1Var, false, false);
        x1Var.w0(2, true);
    }

    @Override // qh.g0
    public n9 D() {
        switch (this.a) {
            case 17:
                i3 i3Var = ((qh.x) this.b).K;
                if (i3Var != null) {
                    return i3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                h3 h3Var = ((l4) this.b).J;
                if (h3Var != null) {
                    return h3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        fa faVar = (fa) this.b;
        org.telegram.ui.Cells.g gVar = faVar.v;
        if (faVar.a()) {
            faVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // qh.g0
    public void G(CharSequence charSequence) {
        switch (this.a) {
            case 17:
                i3 i3Var = ((qh.x) this.b).K;
                if (i3Var != null) {
                    i3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        i3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                h3 h3Var = ((l4) this.b).J;
                if (h3Var != null) {
                    h3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        h3Var.a.t4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // qh.g0
    public m9 H() {
        switch (this.a) {
            case 17:
                return (qh.x) this.b;
            default:
                return (l4) this.b;
        }
    }

    @Override // of.u1
    public void H0(ArrayList arrayList) {
        an0 an0Var = (an0) this.b;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            an0Var.F.add(((of.t1) arrayList.get(i9)).a);
        }
        ox oxVar = an0Var.Q;
        if (oxVar != null) {
            oxVar.d(an0Var.z0 > 0, false);
        }
        an0Var.l();
    }

    @Override // qh.g0
    public qh.a I() {
        switch (this.a) {
            case 17:
                return ((qh.x) this.b).a;
            default:
                return ((l4) this.b).a;
        }
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        ((td.h) this.b).i(f10);
    }

    @Override // qh.m3
    public x60 J1(View view) {
        return x60.H((x1) this.b, view);
    }

    @Override // qh.g0
    public boolean K() {
        switch (this.a) {
            case 17:
                qh.x xVar = (qh.x) this.b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.a;
                    if (i3Var.a.S4()) {
                    }
                }
                break;
            default:
                l4 l4Var = (l4) this.b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.a;
                    if (h3Var.a.S4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    public float L0(qb.c cVar, qb.c cVar2) {
        int i9 = (int) cVar.a;
        int i10 = (int) cVar.b;
        int i11 = (int) cVar2.a;
        int i12 = (int) cVar2.b;
        float i13 = i1(i9, i10, i11, i12);
        float i14 = i1((int) cVar2.a, i12, (int) cVar.a, i10);
        return Float.isNaN(i13) ? i14 / 7.0f : Float.isNaN(i14) ? i13 / 7.0f : (i13 + i14) / 14.0f;
    }

    @Override // qh.g0
    public void N0() {
        switch (this.a) {
            case 17:
                qh.x xVar = (qh.x) this.b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.a;
                    o3.O1(i3Var.a);
                    break;
                }
                break;
            default:
                l4 l4Var = (l4) this.b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.a;
                    o3.O1(h3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // qh.m3
    public void N1() {
        x1 x1Var = (x1) this.b;
        x1Var.y0();
        x1Var.B0();
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public void O0(int i9, t1 t1Var) {
        fa faVar = (fa) this.b;
        org.telegram.ui.Cells.g gVar = faVar.v;
        if (faVar.a()) {
            faVar.s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public s0.d P0(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // qh.g0
    public void Q(int i9, int i10) {
        switch (this.a) {
            case 17:
                qh.x xVar = (qh.x) this.b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.a;
                    b2 b2Var = i3Var.a.F3;
                    if (b2Var != null) {
                        b2Var.f(i9, i10);
                        break;
                    }
                }
                break;
            default:
                l4 l4Var = (l4) this.b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.a;
                    b2 b2Var2 = h3Var.a.F3;
                    if (b2Var2 != null) {
                        b2Var2.f(i9, i10);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
        fa faVar = (fa) this.b;
        org.telegram.ui.Cells.g gVar = faVar.v;
        if (faVar.a()) {
            faVar.s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // qh.g0
    public void T() {
        switch (this.a) {
            case 17:
                qh.x xVar = (qh.x) this.b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    qh.a aVar = xVar.a;
                    o3 o3Var = i3Var.a;
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.g();
                    }
                    o3Var.d3.onContentChanged();
                    break;
                }
                break;
            default:
                l4 l4Var = (l4) this.b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    qh.a aVar2 = l4Var.a;
                    o3 o3Var2 = h3Var.a;
                    b2 b2Var2 = o3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.g();
                    }
                    o3Var2.d3.onContentChanged();
                    break;
                }
                break;
        }
    }

    public qb.a T0(float f10, float f11, int i9, int i10) {
        qb.a b10;
        qb.a b11;
        int i11 = (int) (f11 * f10);
        int max = Math.max(0, i9 - i11);
        lb.b bVar = (lb.b) this.b;
        int min = Math.min(bVar.a - 1, i9 + i11) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw kb.e.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar.b - 1, i10 + i11) - max2;
        if (min2 < f12) {
            throw kb.e.a();
        }
        lb.b bVar2 = (lb.b) this.b;
        qb.b bVar3 = new qb.b(bVar2, max, max2, min, min2, f10);
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
            throw kb.e.a();
        }
        return (qb.a) arrayList.get(0);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(t1 t1Var) {
        return false;
    }

    public s0.d X0(int i9) {
        return null;
    }

    @Override // qh.m3
    public void X1(n3 n3Var, View view) {
        x1 x1Var = (x1) this.b;
        x60 H = x60.H(x1Var, view);
        H.Q = true;
        x1Var.getParentActivity();
        x1Var.getResourceProvider();
        x1Var.t0 = a4.b(H, x1Var, n3Var, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean Y0(int i9, t1 t1Var) {
        return i9 == ((fa) this.b).s;
    }

    @Override // na.n
    public Object Y1() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new la.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new la.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override // nh.p0
    public void a(long j10) {
        ((nh.r) this.b).presentFragment(qn.R9(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a1(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        w10 w10Var;
        boolean z11;
        v10 v10Var = (v10) this.b;
        int i9 = v10.w;
        w10 w10Var2 = v10Var.f;
        androidx.mediarouter.app.d dVar = v10Var.e;
        int action = motionEvent.getAction();
        if (v10Var.v == null) {
            v10Var.v = VelocityTracker.obtain();
        }
        v10Var.v.addMovement(motionEvent);
        int i10 = action & 255;
        boolean z12 = i10 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 = motionEvent.getX(i11) + f10;
                f11 = motionEvent.getY(i11) + f11;
            }
        }
        float f12 = z12 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i10 == 0) {
            if (v10Var.g != null && w10Var2.a()) {
                boolean hasMessages = dVar.hasMessages(3);
                if (hasMessages) {
                    dVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = v10Var.m;
                if (motionEvent4 != null && (motionEvent3 = v10Var.n) != null && hasMessages && v10Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < v10Var.b) {
                        v10Var.o = true;
                        z10 = v10Var.g.onDoubleTap(v10Var.m) | v10Var.g.onDoubleTapEvent(motionEvent);
                        v10Var.p = f13;
                        v10Var.r = f13;
                        v10Var.q = f14;
                        v10Var.s = f14;
                        motionEvent2 = v10Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        v10Var.m = MotionEvent.obtain(motionEvent);
                        v10Var.k = true;
                        v10Var.l = true;
                        v10Var.h = true;
                        v10Var.j = false;
                        v10Var.i = false;
                        if (v10Var.t) {
                            dVar.removeMessages(2);
                            dVar.sendEmptyMessageAtTime(2, v10Var.m.getDownTime() + i9 + v10Var.u);
                        }
                        dVar.sendEmptyMessageAtTime(1, v10Var.m.getDownTime() + i9);
                        return w10Var2.onDown(motionEvent) | z10;
                    }
                }
                dVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            v10Var.p = f13;
            v10Var.r = f13;
            v10Var.q = f14;
            v10Var.s = f14;
            motionEvent2 = v10Var.m;
            if (motionEvent2 != null) {
            }
            v10Var.m = MotionEvent.obtain(motionEvent);
            v10Var.k = true;
            v10Var.l = true;
            v10Var.h = true;
            v10Var.j = false;
            v10Var.i = false;
            if (v10Var.t) {
            }
            dVar.sendEmptyMessageAtTime(1, v10Var.m.getDownTime() + i9);
            return w10Var2.onDown(motionEvent) | z10;
        }
        if (i10 == 1) {
            v10Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (v10Var.o) {
                onFling = v10Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (v10Var.j) {
                    dVar.removeMessages(3);
                    v10Var.j = false;
                } else if (v10Var.k) {
                    boolean onSingleTapUp = w10Var2.onSingleTapUp(motionEvent);
                    if (v10Var.i && (w10Var = v10Var.g) != null) {
                        w10Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = v10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, v10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > v10Var.c || Math.abs(xVelocity) > v10Var.c) {
                        onFling = w10Var2.onFling(v10Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = v10Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            v10Var.n = obtain;
            VelocityTracker velocityTracker2 = v10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                v10Var.v = null;
            }
            v10Var.o = false;
            v10Var.i = false;
            dVar.removeMessages(1);
            dVar.removeMessages(2);
            return onFling;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                v10Var.v.recycle();
                v10Var.v = null;
                v10Var.o = false;
                v10Var.h = false;
                v10Var.k = false;
                v10Var.l = false;
                v10Var.i = false;
                if (v10Var.j) {
                    v10Var.j = false;
                    return false;
                }
            } else if (i10 == 5) {
                v10Var.p = f13;
                v10Var.r = f13;
                v10Var.q = f14;
                v10Var.s = f14;
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                v10Var.o = false;
                v10Var.k = false;
                v10Var.l = false;
                v10Var.i = false;
                if (v10Var.j) {
                    v10Var.j = false;
                    return false;
                }
            } else if (i10 == 6) {
                v10Var.p = f13;
                v10Var.r = f13;
                v10Var.q = f14;
                v10Var.s = f14;
                v10Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, v10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = v10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = v10Var.v.getYVelocity(pointerId2);
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    if (i12 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        if ((v10Var.v.getYVelocity(pointerId3) * yVelocity2) + (v10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            v10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!v10Var.j) {
            float f15 = v10Var.p - f13;
            float f16 = v10Var.q - f14;
            if (v10Var.o) {
                return v10Var.g.onDoubleTapEvent(motionEvent);
            }
            if (v10Var.k) {
                int i13 = (int) (f13 - v10Var.r);
                int i14 = (int) (f14 - v10Var.s);
                int i15 = (i14 * i14) + (i13 * i13);
                if (i15 > v10Var.a) {
                    z11 = w10Var2.onScroll(v10Var.m, motionEvent, f15, f16);
                    v10Var.p = f13;
                    v10Var.q = f14;
                    v10Var.k = false;
                    dVar.removeMessages(3);
                    dVar.removeMessages(1);
                    dVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i15 > v10Var.a) {
                    v10Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = w10Var2.onScroll(v10Var.m, motionEvent, f15, f16);
                v10Var.p = f13;
                v10Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 20:
                q6.f fVar = (q6.f) this.b;
                r6.f fVar2 = new r6.f(0, (TaskCompletionSource) obj2);
                r6.d dVar = (r6.d) ((r6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i9 = a7.b.a;
                obtain.writeStrongBinder(fVar2);
                a7.b.b(obtain, fVar);
                a7.b.b(obtain, gVar);
                ((r6.b) dVar).E0(obtain, 6);
                break;
            default:
                k5.l lVar = new k5.l((TaskCompletionSource) obj2);
                s6.i iVar = (s6.i) ((s6.c) obj).u();
                h5.e eVar = (h5.e) this.b;
                Parcel I0 = iVar.I0();
                int i10 = s6.f.a;
                I0.writeStrongBinder(lVar);
                s6.f.c(I0, eVar);
                iVar.J0(I0, 1);
                break;
        }
    }

    @Override // q5.o
    public void b(String str, long j10, long j11, long j12) {
        o5.n nVar = (o5.n) this.b;
        try {
            nVar.a(new o5.m(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            q5.b bVar = o5.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // nh.p0
    public void c() {
        nh.r rVar = (nh.r) this.b;
        td.a aVar = rVar.a;
        q0 q0Var = rVar.v;
        aVar.a(q0Var.n && q0Var.l == 0, true);
        rVar.d.U2.N(true);
    }

    @Override // qh.m3
    public void c0(int i9) {
        ((x1) this.b).n0(74, i9);
    }

    public boolean c1(int i9, int i10, Bundle bundle) {
        return false;
    }

    @Override // qh.m3
    public void c2(s5 s5Var, String str) {
        x1 x1Var = (x1) this.b;
        if (x1Var.v0 == null) {
            x1Var.v0 = new t3(new kh.p(this, 22), x1Var.getResourceProvider());
        }
        x1Var.v0.f(s5Var, str);
    }

    @Override // nh.p0
    public void close() {
        ((nh.r) this.b).finishFragment();
    }

    @Override // qh.g0
    public void d(d1 d1Var) {
        switch (this.a) {
            case 17:
                i3 i3Var = ((qh.x) this.b).K;
                if (i3Var != null) {
                    o3 o3Var = i3Var.a;
                    o3.M1(o3Var, d1Var);
                    o3Var.d3.f1(d1Var, true);
                    break;
                }
                break;
            default:
                h3 h3Var = ((l4) this.b).J;
                if (h3Var != null) {
                    o3 o3Var2 = h3Var.a;
                    o3.M1(o3Var2, d1Var);
                    o3Var2.d3.f1(d1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // qh.m3
    public void d2(l3 l3Var, View view) {
        x1 x1Var = (x1) this.b;
        x60 H = x60.H(x1Var, view);
        H.Q = true;
        x1Var.t0 = a4.c(H, x1Var, x1Var.getParentActivity(), x1Var.getResourceProvider(), l3Var, false);
    }

    @Override // of.u1
    public void e(int i9) {
        an0 an0Var = (an0) this.b;
        an0Var.z0--;
        an0Var.a0 = i9;
        if (an0Var.b0 != i9) {
            an0Var.s.clear();
        }
        if (an0Var.c0 != i9) {
            an0Var.E.clear();
        }
        an0Var.J = true;
        ox oxVar = an0Var.Q;
        if (oxVar != null) {
            oxVar.d(an0Var.z0 > 0, true);
        }
        an0Var.l();
        ox oxVar2 = an0Var.Q;
        if (oxVar2 != null) {
            oxVar2.c();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean f() {
        return ((fa) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // ud.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // qh.g0
    public void g() {
        switch (this.a) {
            case 17:
                qh.x xVar = (qh.x) this.b;
                i3 i3Var = xVar.K;
                if (i3Var != null) {
                    o3.P1(i3Var.a, xVar.a);
                    break;
                }
                break;
            default:
                l4 l4Var = (l4) this.b;
                h3 h3Var = l4Var.J;
                if (h3Var != null) {
                    o3.P1(h3Var.a, l4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // yf.v1
    public void g0(float f10) {
        ((m2) this.b).setOutlineWidth(f10);
    }

    @Override // nc.a
    public Object get() {
        switch (this.a) {
            case 25:
                return new t5.c((Context) ((e0) this.b).b, new ya.b(7), new wa.a(7), 9);
            default:
                return this.b;
        }
    }

    @Override // ud.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // qh.m3
    public void h0() {
        x1 x1Var = (x1) this.b;
        c3 c3Var = x1Var.L.j3;
        x1Var.w0((c3Var != null && c3Var.y() && x1Var.L.C4()) ? 1 : 0, true);
        x1Var.x0();
        x1Var.v0();
    }

    public float h1(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 1;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i9);
        if (z10) {
            i14 = i9;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i9;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i18 = (-abs) / 2;
        int i19 = i13 < i15 ? 1 : -1;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 + i19;
        int i22 = i13;
        int i23 = i14;
        int i24 = 0;
        while (i22 != i21) {
            boolean z11 = z10;
            int i25 = abs;
            if ((i24 == i17) == ((lb.b) this.b).b(z10 ? i23 : i22, z10 ? i22 : i23)) {
                if (i24 == 2) {
                    return g7.w.b(i22, i23, i13, i14);
                }
                i24++;
            }
            i18 += abs2;
            if (i18 > 0) {
                if (i23 == i16) {
                    break;
                }
                i23 += i20;
                i18 -= i25;
            }
            i22 += i19;
            abs = i25;
            z10 = z11;
            i17 = 1;
        }
        if (i24 == 2) {
            return g7.w.b(i21, i16, i13, i14);
        }
        return Float.NaN;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(t1 t1Var) {
        return null;
    }

    public float i1(int i9, int i10, int i11, int i12) {
        float f10;
        float f11;
        lb.b bVar = (lb.b) this.b;
        float h12 = h1(i9, i10, i11, i12);
        int i13 = i9 - (i11 - i9);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i9 / (i9 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i9) / (i13 - i9);
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
        return (h1(i9, i10, (int) (((i13 - i9) * f11) + i9), i14) + h12) - 1.0f;
    }

    @Override // ud.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // ig.g
    public void k(Canvas canvas) {
        switch (this.a) {
            case 8:
                ki kiVar = (ki) this.b;
                canvas.drawColor(kiVar.getThemedColor(f6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kiVar.y2.b(canvas, -2);
                    break;
                }
                break;
            default:
                rp0 rp0Var = (rp0) this.b;
                canvas.drawColor(rp0Var.getThemedColor(f6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    rp0Var.K0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(t1 t1Var) {
        return 0;
    }

    @Override // qh.m3
    public boolean n(float f10) {
        boolean z10;
        x1 x1Var = (x1) this.b;
        FrameLayout frameLayout = x1Var.r0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z10 = true;
                x1.Y(x1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        x1.Y(x1Var, z10, true);
        return z10;
    }

    @Override // qh.m3
    public void n0(qh.a aVar) {
        x1 x1Var = (x1) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(x1Var)) {
            ki kiVar = new ki(x1Var.getParentActivity(), x1Var, false, false, false, x1Var.getResourceProvider());
            kiVar.V1 = new ya.b(21);
            kiVar.L = true;
            kiVar.t1.setVisibility(8);
            kiVar.p2 = new hq0(x1Var, aVar, kiVar, 5);
            kiVar.r1();
            kiVar.show();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // ud.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // ud.a
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        l51 l51Var = (l51) this.b;
        float f12 = -dp;
        l51Var.g.inset(f12, f12);
        boolean contains = l51Var.g.contains(f10, f11);
        float f13 = dp;
        l51Var.g.inset(f13, f13);
        return contains;
    }

    @Override // ud.a
    public /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        return f();
    }

    @Override // ud.a
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((l51) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ud.a
    public void onClickTouchDown(View view, float f10, float f11) {
        ((l51) this.b).h.c(true);
    }

    @Override // ud.a
    public void onClickTouchUp(View view, float f10, float f11) {
        ((l51) this.b).h.c(false);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        c.h((c) ((j) this.b).c, "launchApplication", task);
    }

    @Override // qh.m3
    public void onContentChanged() {
        x1 x1Var = (x1) this.b;
        if (x1Var.u0 != null) {
            boolean m32 = x1Var.L.m3();
            x1Var.H0 = m32;
            x1Var.u0.h(m32);
            x1Var.u0.invalidate();
        }
        x1Var.B0();
        Runnable runnable = x1Var.I0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // ud.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // q5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(String str, long j10, int i9, Object obj, long j11, long j12) {
        int i10;
        Iterator it;
        o5.n nVar = (o5.n) this.b;
        try {
            i10 = i9;
            try {
                Status status = new Status(i10, null, null, null);
                Object obj2 = true == (obj instanceof q5.m) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                nVar.a(new o5.m(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                q5.b bVar = o5.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = nVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i10 = i9;
        }
        it = nVar.q.i.iterator();
        while (it.hasNext()) {
            ((o5.g) it.next()).h(str, j10, i10, j11, j12);
            i10 = i9;
        }
    }

    @Override // of.u1
    public boolean p0(int i9) {
        return i9 == ((an0) this.b).Z;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public void t(wg wgVar) {
        int i9;
        i9 = ((o2) ((pf.l) this.b)).currentAccount;
        NotificationCenter.getInstance(i9).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean t0() {
        return false;
    }

    @Override // qh.m3
    public void v1() {
        x1 x1Var = (x1) this.b;
        x1.Y(x1Var, false, true);
        int i9 = x1Var.E0;
        x1Var.w0(i9 != 2 ? i9 : 0, true);
    }

    @Override // ig.g
    public void x0(g.x xVar) {
        switch (this.a) {
            case 8:
                xVar.a(((ki) this.b).getThemedColor(f6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((rp0) this.b).getThemedColor(f6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // p5.a
    public void y0(Bitmap bitmap) {
        ((p5.h) this.b).e(bitmap, 3);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public /* synthetic */ e0(s6.b bVar, h5.e eVar) {
        this.a = 22;
        this.b = eVar;
    }

    public e0(TextView textView) {
        this.a = 15;
        this.b = new q1.g(textView);
    }

    public e0(int i9) {
        this.a = i9;
        switch (i9) {
            case 28:
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new lg0(this);
                    break;
                }
        }
    }

    @Override // yf.v1
    public float get() {
        return ((m2) this.b).B;
    }

    public e0(UUID uuid, int i9, byte[] bArr) {
        this.a = 24;
        this.b = uuid;
    }

    public e0(Context context, w10 w10Var) {
        this.a = 9;
        this.b = new v10(context, w10Var);
    }

    public e0(int i9, int i10) {
        this.a = 10;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(aa.d.k(i9, i10, "pip_layout_", "_"), 0);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
    }

    @Override // qh.m3
    public void V0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(t1 t1Var) {
    }

    @Override // qh.m3
    public void b1(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j10) {
    }

    @Override // qh.m3
    public void f1(d1 d1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, float f10, float f11) {
    }

    @Override // ud.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // ud.a
    public /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // ud.a
    public /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override // ud.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ii
    public void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
