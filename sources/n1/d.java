package n1;

import ad.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.v;
import g.y;
import java.io.EOFException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.UUID;
import k1.z;
import ma.j;
import n5.k;
import oa.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.z10;
import org.telegram.ui.ni0;
import org.telegram.ui.ou0;
import pf.i1;
import pf.u0;
import r5.i;
import r5.t;
import rh.b2;
import rh.d1;
import rh.e4;
import rh.g0;
import rh.g4;
import rh.l3;
import rh.p3;
import rh.x;
import rh.x1;
import yf.b1;
import yf.y0;
import yf.z0;
import zf.n2;
import zf.v1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements k1.f, m4.h, OnCompleteListener, m, j1, jg.g, vd.a, p5.a, i1, s, ln0, x4, g0, y2.b, v1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(ga.c cVar) {
        this.a = 1;
        this.b = (r) cVar.b;
    }

    @Override // jg.g
    public void A(y yVar) {
        switch (this.a) {
            case 9:
                yVar.a(((gi) this.b).getThemedColor(g6.d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                yVar.a(((sp0) this.b).getThemedColor(g6.d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // m4.h
    public boolean B() {
        return true;
    }

    public void C() {
        z0 z0Var = ((b1) this.b).d;
        if (z0Var != null) {
            y0 y0Var = z0Var.s;
            if (y0Var != null) {
                z0Var.cancelRunnable(y0Var);
                z0Var.s = null;
            }
            y0 y0Var2 = new y0(z0Var, 1);
            z0Var.s = y0Var2;
            z0Var.postRunnable(y0Var2, 1L);
        }
    }

    @Override // pf.i1
    public /* synthetic */ boolean D0(int i10) {
        return true;
    }

    @Override // m4.h
    public long E() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.j1
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override // m4.h
    public long F(long j10) {
        return 1L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(s1 s1Var) {
        return null;
    }

    @Override // m4.h
    public long G(long j10, long j11) {
        return 1L;
    }

    @Override // org.telegram.ui.Cells.j1
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ba baVar = (ba) this.b;
        org.telegram.ui.Cells.g gVar = baVar.v;
        if (baVar.a()) {
            baVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        x1 x1Var = (x1) this.b;
        x1Var.s0(i10, i11, z10);
        ni0 ni0Var = x1Var.K0;
        if (ni0Var != null) {
            ni0Var.i();
            x1Var.K0 = null;
        }
    }

    @Override // rh.g0
    public void I0() {
        g4 g4Var = (g4) this.b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            rh.a aVar = g4Var.a;
            p3 p3Var = ((l3) e4Var).a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.d3.onContentChanged();
        }
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        return null;
    }

    public int K(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        ob.a aVar = (ob.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        ob.a aVar2 = ob.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        ob.b bVar = new ob.b(aVar, iArr5);
        ob.b a2 = aVar.a(i10, 1);
        ob.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        ob.b bVar3 = aVar.d;
        ob.b bVar4 = a2;
        ob.b bVar5 = bVar;
        ob.b bVar6 = bVar4;
        ob.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new ob.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            ob.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            ob.b a3 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            ob.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a3;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new ob.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        ob.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        ob.b bVar10 = bVarArr[0];
        ob.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new ob.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new ob.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // rh.g0
    public j9 N() {
        e4 e4Var = ((g4) this.b).C;
        if (e4Var != null) {
            return ((l3) e4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public void O0(int i10, s1 s1Var) {
        ba baVar = (ba) this.b;
        org.telegram.ui.Cells.g gVar = baVar.v;
        if (baVar.a()) {
            baVar.s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean P(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        z10 z10Var;
        boolean z11;
        y10 y10Var = (y10) this.b;
        int i10 = y10.w;
        z10 z10Var2 = y10Var.f;
        androidx.mediarouter.app.c cVar = y10Var.e;
        int action = motionEvent.getAction();
        if (y10Var.v == null) {
            y10Var.v = VelocityTracker.obtain();
        }
        y10Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f10 = motionEvent.getX(i12) + f10;
                f11 = motionEvent.getY(i12) + f11;
            }
        }
        float f12 = z12 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i11 == 0) {
            if (y10Var.g != null && z10Var2.a()) {
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = y10Var.m;
                if (motionEvent4 != null && (motionEvent3 = y10Var.n) != null && hasMessages && y10Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x8 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x8 * x8) < y10Var.b) {
                        y10Var.o = true;
                        z10 = y10Var.g.onDoubleTap(y10Var.m) | y10Var.g.onDoubleTapEvent(motionEvent);
                        y10Var.p = f13;
                        y10Var.r = f13;
                        y10Var.q = f14;
                        y10Var.s = f14;
                        motionEvent2 = y10Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        y10Var.m = MotionEvent.obtain(motionEvent);
                        y10Var.k = true;
                        y10Var.l = true;
                        y10Var.h = true;
                        y10Var.j = false;
                        y10Var.i = false;
                        if (y10Var.t) {
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, y10Var.m.getDownTime() + i10 + y10Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, y10Var.m.getDownTime() + i10);
                        return z10Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            y10Var.p = f13;
            y10Var.r = f13;
            y10Var.q = f14;
            y10Var.s = f14;
            motionEvent2 = y10Var.m;
            if (motionEvent2 != null) {
            }
            y10Var.m = MotionEvent.obtain(motionEvent);
            y10Var.k = true;
            y10Var.l = true;
            y10Var.h = true;
            y10Var.j = false;
            y10Var.i = false;
            if (y10Var.t) {
            }
            cVar.sendEmptyMessageAtTime(1, y10Var.m.getDownTime() + i10);
            return z10Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            y10Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (y10Var.o) {
                onFling = y10Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (y10Var.j) {
                    cVar.removeMessages(3);
                    y10Var.j = false;
                } else if (y10Var.k) {
                    boolean onSingleTapUp = z10Var2.onSingleTapUp(motionEvent);
                    if (y10Var.i && (z10Var = y10Var.g) != null) {
                        z10Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = y10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, y10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > y10Var.c || Math.abs(xVelocity) > y10Var.c) {
                        onFling = z10Var2.onFling(y10Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = y10Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            y10Var.n = obtain;
            VelocityTracker velocityTracker2 = y10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                y10Var.v = null;
            }
            y10Var.o = false;
            y10Var.i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                y10Var.v.recycle();
                y10Var.v = null;
                y10Var.o = false;
                y10Var.h = false;
                y10Var.k = false;
                y10Var.l = false;
                y10Var.i = false;
                if (y10Var.j) {
                    y10Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                y10Var.p = f13;
                y10Var.r = f13;
                y10Var.q = f14;
                y10Var.s = f14;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                y10Var.o = false;
                y10Var.k = false;
                y10Var.l = false;
                y10Var.i = false;
                if (y10Var.j) {
                    y10Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                y10Var.p = f13;
                y10Var.r = f13;
                y10Var.q = f14;
                y10Var.s = f14;
                y10Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, y10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = y10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = y10Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((y10Var.v.getYVelocity(pointerId3) * yVelocity2) + (y10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            y10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!y10Var.j) {
            float f15 = y10Var.p - f13;
            float f16 = y10Var.q - f14;
            if (y10Var.o) {
                return y10Var.g.onDoubleTapEvent(motionEvent);
            }
            if (y10Var.k) {
                int i14 = (int) (f13 - y10Var.r);
                int i15 = (int) (f14 - y10Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > y10Var.a) {
                    z11 = z10Var2.onScroll(y10Var.m, motionEvent, f15, f16);
                    y10Var.p = f13;
                    y10Var.q = f14;
                    y10Var.k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > y10Var.a) {
                    y10Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = z10Var2.onScroll(y10Var.m, motionEvent, f15, f16);
                y10Var.p = f13;
                y10Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        ba baVar = (ba) this.b;
        org.telegram.ui.Cells.g gVar = baVar.v;
        if (baVar.a()) {
            baVar.s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // rh.g0
    public void S(CharSequence charSequence) {
        e4 e4Var = ((g4) this.b).C;
        if (e4Var != null) {
            l3 l3Var = (l3) e4Var;
            l3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            l3Var.a.t4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // pf.i1
    public void V0(ArrayList arrayList) {
        u0 u0Var = (u0) this.b;
        String str = u0Var.V;
        if (str != null) {
            u0Var.U(str, u0Var.Y, u0Var.Z, u0Var.X, u0Var.W);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        return false;
    }

    @Override // rh.g0
    public void X0() {
        g4 g4Var = (g4) this.b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            rh.a aVar = g4Var.a;
            p3.O1(((l3) e4Var).a);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean Y0(int i10, s1 s1Var) {
        return i10 == ((ba) this.b).s;
    }

    @Override // m4.h
    public long a(long j10) {
        return 0L;
    }

    public byte a0() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        return rl.a(messageObject);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 16:
                r5.r rVar = new r5.r(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) obj3);
                iVar.R0(M0, 7);
                break;
            case 20:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.d dVar = (s6.d) ((s6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = b7.b.a;
                obtain.writeStrongBinder(fVar);
                b7.b.b(obtain, (r6.f) obj3);
                b7.b.b(obtain, gVar);
                ((s6.b) dVar).E0(obtain, 6);
                break;
            default:
                t6.a aVar = new t6.a((TaskCompletionSource) obj2);
                t6.i iVar2 = (t6.i) ((t6.c) obj).u();
                String str = ((t6.b) obj3).k;
                Parcel I0 = iVar2.I0();
                int i12 = t6.f.a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar2.J0(I0, 2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ln0
    public void b(float f10) {
        x xVar = (x) this.b;
        MessageObject messageObject = xVar.L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(xVar.L, f10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // k1.f
    public Object c(p pVar, tc.c cVar) {
        return ((z) this.b).c(new c(pVar, null, 0), cVar);
    }

    @Override // zf.v1
    public void c0(float f10) {
        ((n2) this.b).setOutlineWidth(f10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean d() {
        return ((ba) this.b).a();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ln0
    public void e(float f10) {
        MessageObject messageObject = ((x) this.b).L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // oa.m
    public Object f2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new j("Invalid EnumSet type: " + type.toString());
    }

    @Override // vd.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // rh.g0
    public void g(d1 d1Var) {
        e4 e4Var = ((g4) this.b).C;
        if (e4Var != null) {
            p3 p3Var = ((l3) e4Var).a;
            p3.M1(p3Var, d1Var);
            p3Var.d3.n0(d1Var, true);
        }
    }

    public int g0() {
        return ((a0() & 255) << 24) | ((a0() & 255) << 16) | ((a0() & 255) << 8) | (a0() & 255);
    }

    @Override // oc.a
    public Object get() {
        return new u2.b((Context) ((e.a) this.b).a, new w9.d(6), new v(6), 8);
    }

    @Override // k1.f
    public ld.b getData() {
        return ((z) this.b).c;
    }

    @Override // vd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(s1 s1Var) {
        return null;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        ((u0) this.b).l();
    }

    @Override // vd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(s1 s1Var) {
        return 0;
    }

    @Override // rh.g0
    public void m() {
        g4 g4Var = (g4) this.b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            p3.P1(((l3) e4Var).a, g4Var.a);
        }
    }

    @Override // jg.g
    public void n(Canvas canvas) {
        switch (this.a) {
            case 9:
                gi giVar = (gi) this.b;
                canvas.drawColor(giVar.getThemedColor(g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    giVar.y2.b(canvas, -2);
                    break;
                }
                break;
            default:
                sp0 sp0Var = (sp0) this.b;
                canvas.drawColor(sp0Var.getThemedColor(g6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sp0Var.K0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    public int n0() {
        return ((a0() & Byte.MAX_VALUE) << 21) | ((a0() & Byte.MAX_VALUE) << 14) | ((a0() & Byte.MAX_VALUE) << 7) | (a0() & Byte.MAX_VALUE);
    }

    @Override // vd.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // vd.a
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        n51 n51Var = (n51) this.b;
        float f12 = -dp;
        n51Var.g.inset(f12, f12);
        boolean contains = n51Var.g.contains(f10, f11);
        float f13 = dp;
        n51Var.g.inset(f13, f13);
        return contains;
    }

    @Override // vd.a
    public /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    public void o0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ k9 o2() {
        return null;
    }

    @Override // vd.a
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((n51) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // vd.a
    public void onClickTouchDown(View view, float f10, float f11) {
        ((n51) this.b).h.c(true);
    }

    @Override // vd.a
    public void onClickTouchUp(View view, float f10, float f11) {
        ((n51) this.b).h.c(false);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        n5.c.h((n5.c) ((k) this.b).c, "joinApplication", task);
    }

    @Override // vd.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return d();
    }

    @Override // rh.g0
    public i9 q0() {
        return (g4) this.b;
    }

    @Override // m4.h
    public long r(long j10, long j11) {
        return 0L;
    }

    @Override // m4.h
    public long s(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        return false;
    }

    @Override // rh.g0
    public rh.a u0() {
        return ((g4) this.b).a;
    }

    @Override // m4.h
    public n4.j w(long j10) {
        return (n4.j) this.b;
    }

    @Override // rh.g0
    public boolean w0() {
        g4 g4Var = (g4) this.b;
        e4 e4Var = g4Var.C;
        if (e4Var == null) {
            return false;
        }
        rh.a aVar = g4Var.a;
        return ((l3) e4Var).a.S4();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // m4.h
    public long y(long j10, long j11) {
        return 0L;
    }

    @Override // rh.g0
    public void y0(int i10, int i11) {
        g4 g4Var = (g4) this.b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            rh.a aVar = g4Var.a;
            b2 b2Var = ((l3) e4Var).a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // p5.a
    public void z0(Bitmap bitmap) {
        ((p5.h) this.b).e(bitmap, 3);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ d(r5.s sVar, String[] strArr) {
        this.a = 16;
        this.b = strArr;
    }

    public d() {
        this.a = 5;
        this.b = new SparseArray();
    }

    public d(UUID uuid, int i10, byte[] bArr) {
        this.a = 22;
        this.b = uuid;
    }

    public d(Context context, z10 z10Var) {
        this.a = 10;
        this.b = new y10(context, z10Var);
    }

    @Override // zf.v1
    public float get() {
        return ((n2) this.b).B;
    }

    public d(int i10, int i11) {
        this.a = 11;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a9.p.j(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(s1 s1Var, fh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(s1 s1Var, TLRPC.Document document) {
    }

    @Override // m4.h
    public long l(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(s1 s1Var, int i10, int i11) {
    }

    @Override // vd.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // vd.a
    public /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // vd.a
    public /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override // vd.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
