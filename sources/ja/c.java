package ja;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.biometric.r;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.k0;
import f2.o0;
import g.x;
import h5.d0;
import j$.util.DesugarCollections;
import j7.r5;
import j8.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import la.b0;
import m.j1;
import m.y0;
import ng.g;
import o4.n0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.u5;
import org.telegram.ui.vu0;
import ph.c0;
import s7.i;
import v2.d;
import v2.f;
import v7.j;
import yf.m;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class c implements a0, androidx.activity.result.b, k0, a3.b, o, j1, Continuation, s, y0, o0.a, n0, k1, g, yd.a, m {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10, boolean z4) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // o4.n0
    public boolean C(long j10) {
        boolean z4;
        boolean z10 = false;
        do {
            long l10 = l();
            if (l10 == Long.MIN_VALUE) {
                return z10;
            }
            z4 = false;
            for (n0 n0Var : (n0[]) this.b) {
                long l11 = n0Var.l();
                boolean z11 = l11 != Long.MIN_VALUE && l11 <= j10;
                if (l11 == l10 || z11) {
                    z4 |= n0Var.C(j10);
                }
            }
            z10 |= z4;
        } while (z4);
        return z10;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ n9 C2() {
        return null;
    }

    @Override // f2.k0
    public void D(int i10, int i11) {
        ((o0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean D1() {
        return false;
    }

    @Override // yf.m
    public void G() {
        ((c0) this.b).d.invalidate();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // o0.a
    public Cursor J(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K1() {
        return false;
    }

    @Override // f2.k0
    public void M0(int i10, int i11) {
        ((o0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void R0(int i10, t1 t1Var) {
        ea eaVar = (ea) this.b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle R1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ea eaVar = (ea) this.b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean T1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // o4.n0
    public long X() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.b) {
            long X = n0Var.X();
            if (X != Long.MIN_VALUE) {
                j10 = Math.min(j10, X);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // ng.g
    public void Y(x xVar) {
        switch (this.a) {
            case 24:
                xVar.a(((li) this.b).getThemedColor(j6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                xVar.a(((lq0) this.b).getThemedColor(j6.d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(t1 t1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vu0 a2() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.b;
        s7.b bVar = (s7.b) obj;
        bVar.getClass();
        s7.a aVar = new s7.a(1, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = s7.c.a;
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
            r5.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    @Override // o4.n0
    public boolean b() {
        for (n0 n0Var : (n0[]) this.b) {
            if (n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d() {
        return ((ea) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean d1(int i10, t1 t1Var) {
        return i10 == ((ea) this.b).s;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // f2.k0
    public void e0(int i10, int i11) {
        ((o0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        ea eaVar = (ea) this.b;
        org.telegram.ui.Cells.g gVar = eaVar.v;
        if (eaVar.a()) {
            eaVar.s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 2:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i10 = f0Var.b;
                    androidx.fragment.app.s v = j0Var.c.v(str);
                    if (v != null) {
                        v.x(i10, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.K;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // o4.n0
    public void f0(long j10) {
        for (n0 n0Var : (n0[]) this.b) {
            n0Var.f0(j10);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // yd.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // rc.a
    public Object get() {
        String packageName = ((Context) ((rc.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // yd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    public void j0(int i10, boolean z4) {
        c2.u uVar = (c2.u) this.b;
        if (z4) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override // ng.g
    public void k(Canvas canvas) {
        switch (this.a) {
            case 24:
                li liVar = (li) this.b;
                canvas.drawColor(liVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    liVar.z2.b(canvas, -2);
                    break;
                }
                break;
            default:
                lq0 lq0Var = (lq0) this.b;
                canvas.drawColor(lq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lq0Var.L0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(t1 t1Var) {
        return 0;
    }

    @Override // f2.k0
    public void k1(int i10, int i11) {
        ((o0) this.b).r(i10, i11, null);
    }

    @Override // o4.n0
    public long l() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.b) {
            long l10 = n0Var.l();
            if (l10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, l10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // androidx.lifecycle.a0
    public void m0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        r rVar = (r) this.b;
        if (charSequence != null) {
            if (rVar.R()) {
                rVar.W(charSequence);
            }
            rVar.i0.d(null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        return d();
    }

    @Override // yd.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // yd.a
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        j61 j61Var = (j61) this.b;
        float f12 = -dp;
        j61Var.g.inset(f12, f12);
        boolean contains = j61Var.g.contains(f10, f11);
        float f13 = dp;
        j61Var.g.inset(f13, f13);
        return contains;
    }

    @Override // yd.a
    public /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    public Set o0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // yd.a
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((j61) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // yd.a
    public void onClickTouchDown(View view, float f10, float f11) {
        ((j61) this.b).h.c(true);
    }

    @Override // yd.a
    public void onClickTouchUp(View view, float f10, float f11) {
        ((j61) this.b).h.c(false);
    }

    @Override // yd.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(u5 u5Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void r(Object obj) {
        ((u7.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    public boolean r0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public void t0(b0 b0Var) {
        ((y2.o) ((f) ((ba.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new gg.f(this, 24)).a(new v2.a(null, b0Var, d.a, null), new s0.b(28));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public void u0(s5.m mVar) {
        j jVar = (j) this.b;
        jVar.a = mVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((l6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v0(MotionEvent motionEvent) {
        boolean z4;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        m20 m20Var;
        boolean z10;
        l20 l20Var = (l20) this.b;
        int i10 = l20.w;
        m20 m20Var2 = l20Var.f;
        androidx.mediarouter.app.d dVar = l20Var.e;
        int action = motionEvent.getAction();
        if (l20Var.v == null) {
            l20Var.v = VelocityTracker.obtain();
        }
        l20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z11 = i11 == 6;
        int actionIndex = z11 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f10 = motionEvent.getX(i12) + f10;
                f11 = motionEvent.getY(i12) + f11;
            }
        }
        float f12 = z11 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i11 == 0) {
            if (l20Var.g != null && m20Var2.a()) {
                boolean hasMessages = dVar.hasMessages(3);
                if (hasMessages) {
                    dVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = l20Var.m;
                if (motionEvent4 != null && (motionEvent3 = l20Var.n) != null && hasMessages && l20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < l20Var.b) {
                        l20Var.o = true;
                        z4 = l20Var.g.onDoubleTap(l20Var.m) | l20Var.g.onDoubleTapEvent(motionEvent);
                        l20Var.p = f13;
                        l20Var.r = f13;
                        l20Var.q = f14;
                        l20Var.s = f14;
                        motionEvent2 = l20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        l20Var.m = MotionEvent.obtain(motionEvent);
                        l20Var.k = true;
                        l20Var.l = true;
                        l20Var.h = true;
                        l20Var.j = false;
                        l20Var.i = false;
                        if (l20Var.t) {
                            dVar.removeMessages(2);
                            dVar.sendEmptyMessageAtTime(2, l20Var.m.getDownTime() + i10 + l20Var.u);
                        }
                        dVar.sendEmptyMessageAtTime(1, l20Var.m.getDownTime() + i10);
                        return m20Var2.onDown(motionEvent) | z4;
                    }
                }
                dVar.sendEmptyMessageDelayed(3, 220L);
            }
            z4 = false;
            l20Var.p = f13;
            l20Var.r = f13;
            l20Var.q = f14;
            l20Var.s = f14;
            motionEvent2 = l20Var.m;
            if (motionEvent2 != null) {
            }
            l20Var.m = MotionEvent.obtain(motionEvent);
            l20Var.k = true;
            l20Var.l = true;
            l20Var.h = true;
            l20Var.j = false;
            l20Var.i = false;
            if (l20Var.t) {
            }
            dVar.sendEmptyMessageAtTime(1, l20Var.m.getDownTime() + i10);
            return m20Var2.onDown(motionEvent) | z4;
        }
        if (i11 == 1) {
            l20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (l20Var.o) {
                onFling = l20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (l20Var.j) {
                    dVar.removeMessages(3);
                    l20Var.j = false;
                } else if (l20Var.k) {
                    boolean onSingleTapUp = m20Var2.onSingleTapUp(motionEvent);
                    if (l20Var.i && (m20Var = l20Var.g) != null) {
                        m20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = l20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, l20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > l20Var.c || Math.abs(xVelocity) > l20Var.c) {
                        onFling = m20Var2.onFling(l20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = l20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            l20Var.n = obtain;
            VelocityTracker velocityTracker2 = l20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                l20Var.v = null;
            }
            l20Var.o = false;
            l20Var.i = false;
            dVar.removeMessages(1);
            dVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                l20Var.v.recycle();
                l20Var.v = null;
                l20Var.o = false;
                l20Var.h = false;
                l20Var.k = false;
                l20Var.l = false;
                l20Var.i = false;
                if (l20Var.j) {
                    l20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                l20Var.p = f13;
                l20Var.r = f13;
                l20Var.q = f14;
                l20Var.s = f14;
                dVar.removeMessages(1);
                dVar.removeMessages(2);
                dVar.removeMessages(3);
                l20Var.o = false;
                l20Var.k = false;
                l20Var.l = false;
                l20Var.i = false;
                if (l20Var.j) {
                    l20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                l20Var.p = f13;
                l20Var.r = f13;
                l20Var.q = f14;
                l20Var.s = f14;
                l20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, l20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = l20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = l20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((l20Var.v.getYVelocity(pointerId3) * yVelocity2) + (l20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            l20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!l20Var.j) {
            float f15 = l20Var.p - f13;
            float f16 = l20Var.q - f14;
            if (l20Var.o) {
                return l20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (l20Var.k) {
                int i14 = (int) (f13 - l20Var.r);
                int i15 = (int) (f14 - l20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > l20Var.a) {
                    z10 = m20Var2.onScroll(l20Var.m, motionEvent, f15, f16);
                    l20Var.p = f13;
                    l20Var.q = f14;
                    l20Var.k = false;
                    dVar.removeMessages(3);
                    dVar.removeMessages(1);
                    dVar.removeMessages(2);
                } else {
                    z10 = false;
                }
                if (i16 > l20Var.a) {
                    l20Var.l = false;
                }
                return z10;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = m20Var2.onScroll(l20Var.m, motionEvent, f15, f16);
                l20Var.p = f13;
                l20Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean y2(int i10) {
        return false;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                this.b = new CopyOnWriteArrayList();
                break;
            case 13:
                this.b = new c2.u();
                break;
            case 19:
                this.b = new f7.b[mf.b.values().length];
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(l3.d dVar) {
        this.a = 15;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.a).setFlags(dVar.b).setUsage(dVar.c);
        int i10 = d0.a;
        if (i10 >= 29) {
            l3.b.a(usage, dVar.d);
        }
        if (i10 >= 32) {
            l3.c.a(usage, dVar.e);
        }
        this.b = usage.build();
    }

    public c(Context context, Uri uri) {
        this.a = 20;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(Context context, m20 m20Var) {
        this.a = 25;
        this.b = new l20(context, m20Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V1() {
    }

    @Override // yf.m
    public void c0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(t1 t1Var) {
    }

    @Override // yf.m
    public void H(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void H0(t1 t1Var) {
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
    public /* synthetic */ void L0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // m.y0
    public void a(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(t1 t1Var) {
    }

    @Override // yf.m
    public void b0(boolean z4) {
    }

    @Override // m.y0
    public void c(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G1(t1 t1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(t1 t1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // yd.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
