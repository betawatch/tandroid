package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.vi;
import org.telegram.ui.pv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ia implements k1, ah.j, me.a, qg.y1, com.google.android.gms.common.api.internal.o, s4.e0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ia(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A1() {
        return false;
    }

    public void B(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w9.x.a(mVar.e.l(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // s4.e0
    public void O0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle O1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void P0(int i10, t1 t1Var) {
        ja jaVar = (ja) this.b;
        g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ja jaVar = (ja) this.b;
        g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pv0 Y1() {
        return null;
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e) {
                yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(long j3) {
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
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override // ah.j
    public void b(Canvas canvas) {
        switch (this.a) {
            case 1:
                vi viVar = (vi) this.b;
                canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -2);
                    break;
                }
                break;
            default:
                hq0 hq0Var = (hq0) this.b;
                canvas.drawColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    hq0Var.O0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ja jaVar = (ja) this.b;
        g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void c(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean c1(int i10, t1 t1Var) {
        return i10 == ((ja) this.b).s;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public void d(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return ((ja) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // me.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    public void g(za.a0 a0Var) {
        ((l5.r) ((i5.f) ((pa.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new r5.e(this, 27)).a(new i5.a(null, a0Var, i5.d.a, null), new j2.e(17));
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String h(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return vl.a(messageObject);
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // qg.y1
    public void l(float f7) {
        qg.z0 z0Var = (qg.z0) this.b;
        pg.s0.e(z0Var.a).k("-1", f7);
        z0Var.e.setBrushSize(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return e();
    }

    @Override // s4.e0
    public void l1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // ah.j
    public void m(ah.a aVar) {
        switch (this.a) {
            case 1:
                aVar.a(((vi) this.b).getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((hq0) this.b).getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // me.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // me.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        h61 h61Var = (h61) this.b;
        float f11 = -dp;
        h61Var.g.inset(f11, f11);
        boolean contains = h61Var.g.contains(f7, f10);
        float f12 = dp;
        h61Var.g.inset(f12, f12);
        return contains;
    }

    @Override // me.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((h61) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // me.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((h61) this.b).h.c(true);
    }

    @Override // me.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((h61) this.b).h.c(false);
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(v7.t7.a(e));
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

    public void q(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.e.K(i15);
            s4.c1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((s4.p0) K.getLayoutParams()).c = true;
            }
        }
        of.e eVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.x0 = true;
    }

    public void v(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        for (int i12 = 0; i12 < L; i12++) {
            s4.c1 U = RecyclerView.U(recyclerView.e.K(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.t0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            s4.c1 c1Var = (s4.c1) arrayList.get(i13);
            if (c1Var != null && c1Var.c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.w0 = true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    public void x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < L; i20++) {
            s4.c1 U = RecyclerView.U(recyclerView.e.K(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.t0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            s4.c1 c1Var = (s4.c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.w0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean y(MotionEvent motionEvent) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ r9 z2() {
        return null;
    }

    public /* synthetic */ ia(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public ia(TextView textView) {
        this.a = 7;
        this.b = new q1.g(textView);
    }

    @Override // qg.y1
    public float get() {
        qg.z0 z0Var = (qg.z0) this.b;
        int i10 = z0Var.a;
        pg.m currentBrush = z0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return pg.s0.e(i10).i;
        }
        return pg.s0.e(i10).f("-1", currentBrush.d());
    }

    public ia() {
        this.a = 22;
        File file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.b = new ArrayList();
    }

    public ia(Context context, l20 l20Var) {
        this.a = 2;
        this.b = new k20(context, l20Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void D0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2() {
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
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
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
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // me.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
