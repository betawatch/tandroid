package ji;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.r8;
import org.telegram.ui.at0;
import org.telegram.ui.wv0;
import v7.i8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public class h5 implements g1, y2.m, OnCompleteListener, m.x0, n5.b, o0.a, u2.e1, org.telegram.ui.Cells.l1, bh.h, mg.e, e81, hg.z1, com.google.android.gms.common.api.internal.s, r2.m, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rg.x1
    public void B0(float f7) {
        rg.y0 y0Var = (rg.y0) this.b;
        qg.s0.e(y0Var.a).k("-1", f7);
        y0Var.e.setBrushSize(f7);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // ji.g1
    public /* synthetic */ boolean C(h1 h1Var) {
        return false;
    }

    @Override // s4.h1
    public int D() {
        return ((s4.n0) this.b).G();
    }

    @Override // s4.h1
    public View D0(int i10) {
        return ((s4.n0) this.b).q(i10);
    }

    @Override // ji.g1
    public /* synthetic */ boolean F0(boolean z10) {
        return false;
    }

    @Override // u2.e1
    public void G(u2.f1 f1Var) {
        o2.k kVar = (o2.k) this.b;
        kVar.G.G(kVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override // mg.e
    public void H() {
        ((tf0) this.b).b.o();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ void I0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        switch (this.a) {
        }
        return null;
    }

    @Override // s4.h1
    public int L0(View view) {
        return s4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override // org.telegram.ui.Cells.l1
    public void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // mg.e
    public void N0() {
        ((tf0) this.b).b.k();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // mg.e
    public void P0(float f7) {
        tf0 tf0Var = (tf0) this.b;
        tf0Var.b.setRotation(f7);
        tf0Var.getClass();
        sf0 sf0Var = tf0Var.a;
        if (sf0Var != null) {
            ((at0) sf0Var).a(false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ wv0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    public void Q0() {
        qg.a1 a1Var = ((qg.c1) this.b).d;
        if (a1Var != null) {
            qg.z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            qg.z0 z0Var2 = new qg.z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // ji.g1
    public void U(h1 h1Var, int i10, int i11) {
        j5 j5Var;
        o9 textSelectionHelper;
        l5 l5Var = (l5) this.b;
        if (l5Var.w || i10 == i11 || (j5Var = l5Var.s) == null || (textSelectionHelper = ((c3) j5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 3));
    }

    public void U0() {
        o2.k kVar = (o2.k) this.b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                q1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.r1(q1VarArr);
        kVar.G.y(kVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // o0.a
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Y0(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        y20 y20Var;
        boolean z11;
        x20 x20Var = (x20) this.b;
        int i10 = x20.w;
        y20 y20Var2 = x20Var.f;
        ab.o0 o0Var = x20Var.e;
        int action = motionEvent.getAction();
        if (x20Var.v == null) {
            x20Var.v = VelocityTracker.obtain();
        }
        x20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 = motionEvent.getX(i12) + f7;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (x20Var.g != null && y20Var2.a()) {
                boolean hasMessages = o0Var.hasMessages(3);
                if (hasMessages) {
                    o0Var.removeMessages(3);
                }
                MotionEvent motionEvent4 = x20Var.m;
                if (motionEvent4 != null && (motionEvent3 = x20Var.n) != null && hasMessages && x20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < x20Var.b) {
                        x20Var.o = true;
                        z10 = x20Var.g.onDoubleTap(x20Var.m) | x20Var.g.onDoubleTapEvent(motionEvent);
                        x20Var.p = f12;
                        x20Var.r = f12;
                        x20Var.q = f13;
                        x20Var.s = f13;
                        motionEvent2 = x20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        x20Var.m = MotionEvent.obtain(motionEvent);
                        x20Var.k = true;
                        x20Var.l = true;
                        x20Var.h = true;
                        x20Var.j = false;
                        x20Var.i = false;
                        if (x20Var.t) {
                            o0Var.removeMessages(2);
                            o0Var.sendEmptyMessageAtTime(2, x20Var.m.getDownTime() + i10 + x20Var.u);
                        }
                        o0Var.sendEmptyMessageAtTime(1, x20Var.m.getDownTime() + i10);
                        return y20Var2.onDown(motionEvent) | z10;
                    }
                }
                o0Var.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            x20Var.p = f12;
            x20Var.r = f12;
            x20Var.q = f13;
            x20Var.s = f13;
            motionEvent2 = x20Var.m;
            if (motionEvent2 != null) {
            }
            x20Var.m = MotionEvent.obtain(motionEvent);
            x20Var.k = true;
            x20Var.l = true;
            x20Var.h = true;
            x20Var.j = false;
            x20Var.i = false;
            if (x20Var.t) {
            }
            o0Var.sendEmptyMessageAtTime(1, x20Var.m.getDownTime() + i10);
            return y20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            x20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (x20Var.o) {
                onFling = x20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (x20Var.j) {
                    o0Var.removeMessages(3);
                    x20Var.j = false;
                } else if (x20Var.k) {
                    boolean onSingleTapUp = y20Var2.onSingleTapUp(motionEvent);
                    if (x20Var.i && (y20Var = x20Var.g) != null) {
                        y20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = x20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, x20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > x20Var.c || Math.abs(xVelocity) > x20Var.c) {
                        onFling = y20Var2.onFling(x20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = x20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            x20Var.n = obtain;
            VelocityTracker velocityTracker2 = x20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                x20Var.v = null;
            }
            x20Var.o = false;
            x20Var.i = false;
            o0Var.removeMessages(1);
            o0Var.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                o0Var.removeMessages(1);
                o0Var.removeMessages(2);
                o0Var.removeMessages(3);
                x20Var.v.recycle();
                x20Var.v = null;
                x20Var.o = false;
                x20Var.h = false;
                x20Var.k = false;
                x20Var.l = false;
                x20Var.i = false;
                if (x20Var.j) {
                    x20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                x20Var.p = f12;
                x20Var.r = f12;
                x20Var.q = f13;
                x20Var.s = f13;
                o0Var.removeMessages(1);
                o0Var.removeMessages(2);
                o0Var.removeMessages(3);
                x20Var.o = false;
                x20Var.k = false;
                x20Var.l = false;
                x20Var.i = false;
                if (x20Var.j) {
                    x20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                x20Var.p = f12;
                x20Var.r = f12;
                x20Var.q = f13;
                x20Var.s = f13;
                x20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, x20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = x20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = x20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((x20Var.v.getYVelocity(pointerId3) * yVelocity2) + (x20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            x20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!x20Var.j) {
            float f14 = x20Var.p - f12;
            float f15 = x20Var.q - f13;
            if (x20Var.o) {
                return x20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (x20Var.k) {
                int i14 = (int) (f12 - x20Var.r);
                int i15 = (int) (f13 - x20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > x20Var.a) {
                    z11 = y20Var2.onScroll(x20Var.m, motionEvent, f14, f15);
                    x20Var.p = f12;
                    x20Var.q = f13;
                    x20Var.k = false;
                    o0Var.removeMessages(3);
                    o0Var.removeMessages(1);
                    o0Var.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > x20Var.a) {
                    x20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = y20Var2.onScroll(x20Var.m, motionEvent, f14, f15);
                x20Var.p = f12;
                x20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return i10 == ((ga) this.b).s;
    }

    @Override // ji.g1
    public void a(h1 h1Var) {
        j5 j5Var = ((l5) this.b).s;
        if (j5Var != null) {
            x3 x3Var = ((c3) j5Var).a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.c0(h1Var, true);
        }
    }

    @Override // mg.e
    public void a0() {
        ((tf0) this.b).b.a.g(1, true);
    }

    public void a1(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                n6.p pVar = (n6.p) this.b;
                Parcel H0 = aVar.H0();
                k7.a.c(H0, pVar);
                try {
                    aVar.b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar2 = (s6.a) this.b;
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, aVar2);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
        }
    }

    @Override // r2.m
    public void b(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // s4.h1
    public int b0() {
        s4.n0 n0Var = (s4.n0) this.b;
        return n0Var.n - n0Var.C();
    }

    public void b1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + e1());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return ((ga) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    public void c1(long j10) {
        long e12 = e1();
        if (e12 != j10) {
            if (e12 != -1) {
                if (e12 != -2) {
                    return;
                } else {
                    e12 = -2;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(e12);
            throw new IOException(t10.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                com.google.android.gms.internal.cast.i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // y2.m
    public void d() {
        l2.h hVar = (l2.h) this.b;
        hVar.A.d();
        IOException iOException = hVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.d0.a(messageObject);
    }

    @Override // r2.m
    public void e(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i10, 0, dVar.i, j10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    public long e1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // hd.a
    public Object get() {
        return new li.k((Context) ((n5.c) this.b).a, new rb.b(24), new pb.a(24), 4);
    }

    @Override // ji.g1
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h j0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // hg.z1
    public void k(int i10) {
        switch (this.a) {
            case 16:
                fr0 fr0Var = (fr0) this.b;
                jr0 jr0Var = fr0Var.K;
                fr0Var.s = i10;
                if (fr0Var.v != i10) {
                    fr0Var.d.clear();
                }
                int i11 = fr0Var.J;
                if (fr0Var.h() != 0 || fr0Var.e.e() || fr0Var.I) {
                    jr0Var.x0.b(i11);
                } else {
                    jr0Var.Q.e(false, true);
                }
                fr0Var.l();
                int i12 = jr0.a1;
                jr0Var.L0(true);
                break;
            default:
                r8 r8Var = (r8) this.b;
                if (!r8Var.n && i10 == r8Var.I) {
                    r8Var.d0(r8Var.M.getText().toString().trim());
                    break;
                }
                break;
        }
    }

    @Override // mg.e
    public boolean k0() {
        sf0 sf0Var = ((tf0) this.b).a;
        if (sf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((at0) sf0Var).a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override // ji.g1
    public /* synthetic */ boolean l(h1 h1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return c();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((vi) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        be.m mVar = (be.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(i8.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.b;
        if (z10 && hl0Var.n.n() >= 0) {
            hl0Var.w = true;
        }
        gh0 gh0Var = hl0Var.f;
        yc0 yc0Var = hl0Var.x;
        gh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(yc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ji.g1
    public void p0(h1 h1Var) {
        a aVar;
        l5 l5Var = (l5) this.b;
        j5 j5Var = l5Var.s;
        if (j5Var == null || (aVar = l5Var.a) == null) {
            return;
        }
        x3 x3Var = ((c3) j5Var).a;
        ArrayList arrayList = x3Var.j3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        h2 h2Var = x3Var.H3;
        if (h2Var != null) {
            h2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.y(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        x3Var.t4();
        x3Var.W2.N(false);
        h2 h2Var2 = x3Var.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        x3Var.post(new o2(x3Var, aVar2, 26));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 p2() {
        return null;
    }

    @Override // s4.h1
    public int q(View view) {
        return s4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).topMargin;
    }

    @Override // ji.g1
    public void s0(Editable editable) {
        ((l5) this.b).h();
    }

    @Override // r2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // hg.z1
    public boolean t0(int i10) {
        switch (this.a) {
            case 16:
                return i10 == ((fr0) this.b).r;
            default:
                return true;
        }
    }

    @Override // bh.h
    public void v(Canvas canvas) {
        vi viVar = (vi) this.b;
        canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            viVar.F2.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // mg.e
    public boolean x() {
        sf0 sf0Var = ((tf0) this.b).a;
        if (sf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((at0) sf0Var).a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.N0();
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void z(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public /* synthetic */ h5(s6.g gVar, s6.a aVar) {
        this.a = 27;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.e81
    public void onRenderedFirstFrame() {
    }

    public h5(int i10) {
        this.a = i10;
        switch (i10) {
            case 28:
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public h5(ArrayList arrayList) {
        this.a = 24;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public h5(Context context, Uri uri) {
        this.a = 9;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public h5(Context context, y20 y20Var) {
        this.a = 13;
        this.b = new x20(context, y20Var);
    }

    @Override // rg.x1
    public float get() {
        rg.y0 y0Var = (rg.y0) this.b;
        int i10 = y0Var.a;
        qg.m currentBrush = y0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).i;
        }
        return qg.s0.e(i10).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1() {
    }

    @Override // ji.g1
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1() {
    }

    @Override // r2.m
    public void flush() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // r2.m
    public void r0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // r2.m
    public void shutdown() {
    }

    @Override // r2.m
    public void start() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    private final /* synthetic */ void W0(ArrayList arrayList) {
    }

    private final /* synthetic */ void X0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // m.x0
    public void H0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // m.x0
    public void J(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // ji.g1
    public /* synthetic */ void g0(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onError(h81 h81Var, Exception exc) {
    }

    @Override // ji.g1
    public /* synthetic */ void p(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
