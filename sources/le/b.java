package le;

import ab.o0;
import ah.t;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.p1;
import be.m;
import bh.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e8.i;
import e9.n0;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import m.l;
import ne.d;
import ne.j;
import o2.k;
import o2.q;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u20;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
import org.telegram.ui.web.b1;
import org.telegram.ui.yu0;
import r0.n;
import r4.c;
import rg.o2;
import rg.w1;
import s4.d0;
import s4.g0;
import u2.g1;
import u2.h1;
import v7.h5;
import v7.i8;
import v8.e;
import x9.w;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class b implements OnCompleteListener, l, d, o0.a, g1, k1, h, a81, n, v9, c, o, w1, d0, n5.b, s0, r {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        cn0 cn0Var = (cn0) this.b;
        cn0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        cn0Var.s.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.v9
    public void E(String str) {
        b1 b1Var = (b1) this.b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override // ne.d
    public void H(float f7, int i10) {
        ((j) this.b).h(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.b;
        g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // bh.h
    public void J(bh.a aVar) {
        aVar.a(((ti) this.b).getThemedColor(k6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void M0(int i10, t1 t1Var) {
        ga gaVar = (ga) this.b;
        g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ yu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.b;
        g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // rg.w1
    public void U(float f7) {
        ((o2) this.b).setOutlineWidth(f7);
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a W() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public p0 W0(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // s4.d0
    public void X(int i10, int i11) {
        ((g0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean Z0(int i10, t1 t1Var) {
        return i10 == ((ga) this.b).s;
    }

    @Override // s4.d0
    public void a1(int i10, int i11) {
        ((g0) this.b).r(i10, i11, null);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.b;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            h5.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    @Override // u2.g1
    public void b(h1 h1Var) {
        k kVar = (k) this.b;
        kVar.G.b(kVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public p0 c(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    public void d() {
        k kVar = (k) this.b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.f();
            i11 += qVar.Y.a;
        }
        p1[] p1VarArr = new p1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.f();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.f();
                p1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.t1(p1VarArr);
        kVar.G.a(kVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.b1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return ((ga) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // hd.a
    public Object get() {
        String packageName = ((Context) ((hd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void h(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((p) oVar.b).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.c).c(nVar, 2441);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.a81
    public void invalidate() {
        ((dh0) this.b).h.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        u20 u20Var;
        boolean z11;
        t20 t20Var = (t20) this.b;
        int i10 = t20.w;
        u20 u20Var2 = t20Var.f;
        o0 o0Var = t20Var.e;
        int action = motionEvent.getAction();
        if (t20Var.v == null) {
            t20Var.v = VelocityTracker.obtain();
        }
        t20Var.v.addMovement(motionEvent);
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
            if (t20Var.g != null && u20Var2.a()) {
                boolean hasMessages = o0Var.hasMessages(3);
                if (hasMessages) {
                    o0Var.removeMessages(3);
                }
                MotionEvent motionEvent4 = t20Var.m;
                if (motionEvent4 != null && (motionEvent3 = t20Var.n) != null && hasMessages && t20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < t20Var.b) {
                        t20Var.o = true;
                        z10 = t20Var.g.onDoubleTap(t20Var.m) | t20Var.g.onDoubleTapEvent(motionEvent);
                        t20Var.p = f12;
                        t20Var.r = f12;
                        t20Var.q = f13;
                        t20Var.s = f13;
                        motionEvent2 = t20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        t20Var.m = MotionEvent.obtain(motionEvent);
                        t20Var.k = true;
                        t20Var.l = true;
                        t20Var.h = true;
                        t20Var.j = false;
                        t20Var.i = false;
                        if (t20Var.t) {
                            o0Var.removeMessages(2);
                            o0Var.sendEmptyMessageAtTime(2, t20Var.m.getDownTime() + i10 + t20Var.u);
                        }
                        o0Var.sendEmptyMessageAtTime(1, t20Var.m.getDownTime() + i10);
                        return u20Var2.onDown(motionEvent) | z10;
                    }
                }
                o0Var.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            t20Var.p = f12;
            t20Var.r = f12;
            t20Var.q = f13;
            t20Var.s = f13;
            motionEvent2 = t20Var.m;
            if (motionEvent2 != null) {
            }
            t20Var.m = MotionEvent.obtain(motionEvent);
            t20Var.k = true;
            t20Var.l = true;
            t20Var.h = true;
            t20Var.j = false;
            t20Var.i = false;
            if (t20Var.t) {
            }
            o0Var.sendEmptyMessageAtTime(1, t20Var.m.getDownTime() + i10);
            return u20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            t20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (t20Var.o) {
                onFling = t20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (t20Var.j) {
                    o0Var.removeMessages(3);
                    t20Var.j = false;
                } else if (t20Var.k) {
                    boolean onSingleTapUp = u20Var2.onSingleTapUp(motionEvent);
                    if (t20Var.i && (u20Var = t20Var.g) != null) {
                        u20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = t20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, t20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > t20Var.c || Math.abs(xVelocity) > t20Var.c) {
                        onFling = u20Var2.onFling(t20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = t20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            t20Var.n = obtain;
            VelocityTracker velocityTracker2 = t20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                t20Var.v = null;
            }
            t20Var.o = false;
            t20Var.i = false;
            o0Var.removeMessages(1);
            o0Var.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                o0Var.removeMessages(1);
                o0Var.removeMessages(2);
                o0Var.removeMessages(3);
                t20Var.v.recycle();
                t20Var.v = null;
                t20Var.o = false;
                t20Var.h = false;
                t20Var.k = false;
                t20Var.l = false;
                t20Var.i = false;
                if (t20Var.j) {
                    t20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                t20Var.p = f12;
                t20Var.r = f12;
                t20Var.q = f13;
                t20Var.s = f13;
                o0Var.removeMessages(1);
                o0Var.removeMessages(2);
                o0Var.removeMessages(3);
                t20Var.o = false;
                t20Var.k = false;
                t20Var.l = false;
                t20Var.i = false;
                if (t20Var.j) {
                    t20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                t20Var.p = f12;
                t20Var.r = f12;
                t20Var.q = f13;
                t20Var.s = f13;
                t20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, t20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = t20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = t20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((t20Var.v.getYVelocity(pointerId3) * yVelocity2) + (t20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            t20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!t20Var.j) {
            float f14 = t20Var.p - f12;
            float f15 = t20Var.q - f13;
            if (t20Var.o) {
                return t20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (t20Var.k) {
                int i14 = (int) (f12 - t20Var.r);
                int i15 = (int) (f13 - t20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > t20Var.a) {
                    z11 = u20Var2.onScroll(t20Var.m, motionEvent, f14, f15);
                    t20Var.p = f12;
                    t20Var.q = f13;
                    t20Var.k = false;
                    o0Var.removeMessages(3);
                    o0Var.removeMessages(1);
                    o0Var.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > t20Var.a) {
                    t20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = u20Var2.onScroll(t20Var.m, motionEvent, f14, f15);
                t20Var.p = f12;
                t20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return e();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // ne.d
    public void o(int i10, float f7, float f10, ne.e eVar) {
        ((j) this.b).h(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(a6 a6Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        m mVar = (m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(i8.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // org.telegram.ui.v9
    public void onDismiss() {
        b1 b1Var = (b1) this.b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.h0 = false;
    }

    @Override // org.telegram.ui.v9
    public String p0() {
        return ((b1) this.b).i0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ p9 p2() {
        return null;
    }

    @Override // o0.a
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // s4.d0
    public void t0(int i10, int i11) {
        ((g0) this.b).t(i10, i11);
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public void u(ea.b bVar, Thread thread, Throwable th2) {
        x9.m mVar = (x9.m) this.b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.e.w(new x9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override // r4.c
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // r4.c
    public void x(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    @Override // s4.d0
    public void y(int i10, int i11) {
        ((g0) this.b).p(i10, i11);
    }

    @Override // bh.h
    public void z(Canvas canvas) {
        ti tiVar = (ti) this.b;
        canvas.drawColor(tiVar.getThemedColor(k6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            tiVar.I2.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public b() {
        this.a = 3;
        this.b = n0.t();
    }

    @Override // rg.w1
    public float get() {
        return ((o2) this.b).F;
    }

    public b(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 16;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public b(v1.c[] initializers) {
        this.a = 25;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public b(EditText editText) {
        this.a = 15;
        this.b = new mi.q(editText);
    }

    public b(Context context, Uri uri) {
        this.a = 5;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public b(Context context, u20 u20Var) {
        this.a = 9;
        this.b = new t20(context, u20Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void C0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var, t tVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
