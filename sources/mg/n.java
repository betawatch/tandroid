package mg;

import ah.u;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import b2.l1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ov0;
import rg.o2;
import rg.x1;
import s4.e0;
import s4.h0;
import u2.c1;
import u2.d1;
import u2.o1;
import v7.t7;
import w9.w;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class n implements o0.b, c1, k1, bh.h, me.a, com.google.android.gms.common.api.internal.o, x1, e0, n5.b, v0.i, s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ n(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override // rg.x1
    public void H(float f7) {
        ((o2) this.b).setOutlineWidth(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ia iaVar = (ia) this.b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void L0(int i10, t1 t1Var) {
        ia iaVar = (ia) this.b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // s4.e0
    public void P0(int i10, int i11) {
        ((h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ov0 Q1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ia iaVar = (ia) this.b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean X0(int i10, t1 t1Var) {
        return i10 == ((ia) this.b).s;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.b;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e7) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override // u2.c1
    public void b(d1 d1Var) {
        o2.k kVar = (o2.k) this.b;
        kVar.G.b(kVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean c() {
        return ((ia) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    public n4.a d() {
        return new n4.a(((AudioAttributes.Builder) this.b).build());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public void e() {
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
        l1[] l1VarArr = new l1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new o1(l1VarArr);
        kVar.G.a(kVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int f0(t1 t1Var) {
        return 0;
    }

    @Override // me.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // fd.a
    public Object get() {
        String packageName = ((Context) ((fd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // me.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        l20 l20Var;
        boolean z11;
        k20 k20Var = (k20) this.b;
        int i10 = k20.w;
        l20 l20Var2 = k20Var.f;
        androidx.mediarouter.app.c cVar = k20Var.e;
        int action = motionEvent.getAction();
        if (k20Var.v == null) {
            k20Var.v = VelocityTracker.obtain();
        }
        k20Var.v.addMovement(motionEvent);
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
            if (k20Var.g != null && l20Var2.a()) {
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = k20Var.m;
                if (motionEvent4 != null && (motionEvent3 = k20Var.n) != null && hasMessages && k20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < k20Var.b) {
                        k20Var.o = true;
                        z10 = k20Var.g.onDoubleTap(k20Var.m) | k20Var.g.onDoubleTapEvent(motionEvent);
                        k20Var.p = f12;
                        k20Var.r = f12;
                        k20Var.q = f13;
                        k20Var.s = f13;
                        motionEvent2 = k20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        k20Var.m = MotionEvent.obtain(motionEvent);
                        k20Var.k = true;
                        k20Var.l = true;
                        k20Var.h = true;
                        k20Var.j = false;
                        k20Var.i = false;
                        if (k20Var.t) {
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, k20Var.m.getDownTime() + i10 + k20Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, k20Var.m.getDownTime() + i10);
                        return l20Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            k20Var.p = f12;
            k20Var.r = f12;
            k20Var.q = f13;
            k20Var.s = f13;
            motionEvent2 = k20Var.m;
            if (motionEvent2 != null) {
            }
            k20Var.m = MotionEvent.obtain(motionEvent);
            k20Var.k = true;
            k20Var.l = true;
            k20Var.h = true;
            k20Var.j = false;
            k20Var.i = false;
            if (k20Var.t) {
            }
            cVar.sendEmptyMessageAtTime(1, k20Var.m.getDownTime() + i10);
            return l20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            k20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (k20Var.o) {
                onFling = k20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (k20Var.j) {
                    cVar.removeMessages(3);
                    k20Var.j = false;
                } else if (k20Var.k) {
                    boolean onSingleTapUp = l20Var2.onSingleTapUp(motionEvent);
                    if (k20Var.i && (l20Var = k20Var.g) != null) {
                        l20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = k20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, k20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > k20Var.c || Math.abs(xVelocity) > k20Var.c) {
                        onFling = l20Var2.onFling(k20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = k20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            k20Var.n = obtain;
            VelocityTracker velocityTracker2 = k20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                k20Var.v = null;
            }
            k20Var.o = false;
            k20Var.i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                k20Var.v.recycle();
                k20Var.v = null;
                k20Var.o = false;
                k20Var.h = false;
                k20Var.k = false;
                k20Var.l = false;
                k20Var.i = false;
                if (k20Var.j) {
                    k20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                k20Var.p = f12;
                k20Var.r = f12;
                k20Var.q = f13;
                k20Var.s = f13;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                k20Var.o = false;
                k20Var.k = false;
                k20Var.l = false;
                k20Var.i = false;
                if (k20Var.j) {
                    k20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                k20Var.p = f12;
                k20Var.r = f12;
                k20Var.q = f13;
                k20Var.s = f13;
                k20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, k20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = k20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = k20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((k20Var.v.getYVelocity(pointerId3) * yVelocity2) + (k20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            k20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!k20Var.j) {
            float f14 = k20Var.p - f12;
            float f15 = k20Var.q - f13;
            if (k20Var.o) {
                return k20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (k20Var.k) {
                int i14 = (int) (f12 - k20Var.r);
                int i15 = (int) (f13 - k20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > k20Var.a) {
                    z11 = l20Var2.onScroll(k20Var.m, motionEvent, f14, f15);
                    k20Var.p = f12;
                    k20Var.q = f13;
                    k20Var.k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > k20Var.a) {
                    k20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = l20Var2.onScroll(k20Var.m, motionEvent, f14, f15);
                k20Var.p = f12;
                k20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j0() {
        return c();
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        switch (this.a) {
            case 5:
                vi viVar = (vi) this.b;
                canvas.drawColor(viVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -2);
                    break;
                }
                break;
            default:
                hq0 hq0Var = (hq0) this.b;
                canvas.drawColor(hq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    hq0Var.O0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((h0) this.b).s(i10, i11);
    }

    @Override // o0.b
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // s4.e0
    public void m1(int i10, int i11) {
        ((h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n0(z5 z5Var) {
        return false;
    }

    @Override // me.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // me.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        g61 g61Var = (g61) this.b;
        float f11 = -dp;
        g61Var.g.inset(f11, f11);
        boolean contains = g61Var.g.contains(f7, f10);
        float f12 = dp;
        g61Var.g.inset(f12, f12);
        return contains;
    }

    @Override // me.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((g61) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // me.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((g61) this.b).h.c(true);
    }

    @Override // me.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((g61) this.b).h.c(false);
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e7 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(t7.a(e7));
        }
    }

    @Override // me.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void p(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    public void q(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.e.i(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 q2() {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 13:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u1() {
        return false;
    }

    @Override // bh.h
    public void v(bh.a aVar) {
        switch (this.a) {
            case 5:
                aVar.a(((vi) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((hq0) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    public n x(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    public /* bridge */ void z(int i10) {
        x(i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public n(Context context, Uri uri) {
        this.a = 2;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // rg.x1
    public float get() {
        return ((o2) this.b).F;
    }

    public n(Context context, l20 l20Var) {
        this.a = 6;
        this.b = new k20(context, l20Var);
    }

    public n(int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                this.b = new z0[zf.b.values().length];
                break;
            default:
                this.b = new AudioAttributes.Builder();
                break;
        }
    }

    public n(int i10, int i11) {
        this.a = 7;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a4.a.l(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void A0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, u uVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
