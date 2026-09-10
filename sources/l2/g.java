package l2;

import a9.r;
import android.content.Context;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.s0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import g.z;
import j$.util.Objects;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import m.e3;
import m.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.ka;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yi;
import org.telegram.ui.j71;
import org.telegram.ui.rv0;
import pg.n2;
import pg.v1;
import r0.l1;
import u2.u;
import w7.x8;
import y8.e0;
import zh.a3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class g implements y2.i, x0, n5.b, k1, zg.g, i71, r0.n, v1, r4.c, com.google.android.gms.common.api.internal.o, OnCompleteListener, j71, hq0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean B(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        u20 u20Var;
        boolean z11;
        t20 t20Var = (t20) this.b;
        int i10 = t20.w;
        u20 u20Var2 = t20Var.f;
        androidx.mediarouter.app.c cVar = t20Var.e;
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
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
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
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, t20Var.m.getDownTime() + i10 + t20Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, t20Var.m.getDownTime() + i10);
                        return u20Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
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
            cVar.sendEmptyMessageAtTime(1, t20Var.m.getDownTime() + i10);
            return u20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            t20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (t20Var.o) {
                onFling = t20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (t20Var.j) {
                    cVar.removeMessages(3);
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
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
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
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
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
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
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

    @Override // y2.i
    public void C(y2.k kVar, long j3, long j10, boolean z10) {
        ((i) this.b).w((y2.q) kVar, j10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public byte F() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int G() {
        return ((F() & 255) << 24) | ((F() & 255) << 16) | ((F() & 255) << 8) | (F() & 255);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1() {
        return false;
    }

    public int I() {
        return ((F() & Byte.MAX_VALUE) << 21) | ((F() & Byte.MAX_VALUE) << 14) | ((F() & Byte.MAX_VALUE) << 7) | (F() & Byte.MAX_VALUE);
    }

    public g J(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // org.telegram.ui.Cells.k1
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle M1(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ka kaVar = (ka) this.b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void P0(int i10, t1 t1Var) {
        ka kaVar = (ka) this.b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        km0 km0Var = (km0) this.b;
        km0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        km0Var.s.requestLayout();
        return l1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int U() {
        return 0;
    }

    @Override // pg.v1
    public void V(float f7) {
        ((n2) this.b).setOutlineWidth(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public /* bridge */ void W(int i10) {
        J(i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ gh.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ rv0 X1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y(t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(long j3) {
        return false;
    }

    public void Z(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ka kaVar = (ka) this.b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    public n4.a c() {
        return new n4.a(((AudioAttributes.Builder) this.b).build());
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean c1(int i10, t1 t1Var) {
        return i10 == ((ka) this.b).s;
    }

    @Override // zg.g
    public void d(Canvas canvas) {
        yi yiVar = (yi) this.b;
        canvas.drawColor(yiVar.getThemedColor(j6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            yiVar.C2.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean e() {
        return ((ka) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(MessageObject messageObject) {
        return em.a(messageObject);
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 3:
                return new e3((Context) ((r) this.b).a, new rb.a(23), new qb.b(23), 3);
            default:
                return new s5.i((Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void h(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.c).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.d).c(nVar, 2441);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.i71
    public void invalidate() {
        ((og0) this.b).h.invalidate();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // y2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.q qVar = (y2.q) kVar;
        i iVar = (i) this.b;
        long j12 = qVar.a;
        Uri uri = qVar.d.c;
        u uVar = new u(j10);
        int i11 = qVar.c;
        iVar.m.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.m)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k4.d dVar = j11 != -9223372036854775807L ? y2.n.f : new k4.d(0, j11, false);
            iVar.q.q(uVar, i11, iOException, !dVar.a());
            return dVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        iVar.q.q(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // y2.i
    public void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        y2.q qVar = (y2.q) kVar;
        i iVar = (i) this.b;
        if (i10 == 0) {
            long j11 = qVar.a;
            uVar = new u(qVar.b);
        } else {
            long j12 = qVar.a;
            Uri uri = qVar.d.c;
            uVar = new u(j10);
        }
        iVar.q.r(uVar, qVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return e();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(y5 y5Var) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.M0(e0Var, false, null);
        }
    }

    @Override // y2.i
    public void p(y2.k kVar, long j3, long j10) {
        int i10;
        long j11;
        y2.q qVar = (y2.q) kVar;
        i iVar = (i) this.b;
        long j12 = qVar.a;
        Uri uri = qVar.d.c;
        u uVar = new u(j10);
        iVar.m.getClass();
        iVar.q.o(uVar, qVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) qVar.f;
        m2.c cVar2 = iVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i11 = 0;
        while (i11 < size && iVar.H.b(i11).b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = iVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + iVar.N);
                    }
                } else {
                    i10 = i11;
                }
                iVar.M = 0;
            }
            int i12 = iVar.M;
            iVar.M = i12 + 1;
            if (i12 < iVar.m.o3(qVar.c)) {
                iVar.D.postDelayed(iVar.v, Math.min((iVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                iVar.C = new b5();
                return;
            }
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        iVar.H = cVar;
        iVar.I = cVar.d & iVar.I;
        iVar.J = j3 - j10;
        iVar.K = j3;
        iVar.O += i10;
        synchronized (iVar.t) {
            try {
                if (qVar.b.a.equals(iVar.F)) {
                    Uri uri2 = iVar.H.k;
                    if (uri2 == null) {
                        uri2 = x8.a(qVar.d.c);
                    }
                    iVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = iVar.H;
        if (!cVar3.d || iVar.L != j11) {
            iVar.y(true);
            return;
        }
        lf.g gVar = cVar3.i;
        if (gVar == null) {
            iVar.v();
            return;
        }
        String str = gVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                iVar.L = d0.T(gVar.c) - iVar.K;
                iVar.y(true);
                return;
            } catch (s0 e) {
                iVar.x(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            iVar.z(gVar, new f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            iVar.z(gVar, new ob.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            iVar.v();
        } else {
            iVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // org.telegram.ui.Components.hq0
    public void s0() {
        a3.j0((a3) this.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean t2(int i10) {
        return false;
    }

    @Override // zg.g
    public void u(z zVar) {
        zVar.a(((yi) this.b).getThemedColor(j6.d6));
        zVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j3) {
        return null;
    }

    @Override // r4.c
    public void w() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ t9 x2() {
        return null;
    }

    public void y() {
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
    public /* synthetic */ boolean z1() {
        return false;
    }

    public g(Context context, u20 u20Var) {
        this.a = 8;
        this.b = new t20(context, u20Var);
    }

    public g(int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            default:
                this.b = new AudioAttributes.Builder();
                break;
        }
    }

    @Override // pg.v1
    public float get() {
        return ((n2) this.b).F;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q1() {
    }

    @Override // org.telegram.ui.Components.hq0
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void E0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(t1 t1Var) {
    }

    @Override // m.x0
    public void a(int i10) {
    }

    @Override // m.x0
    public void b(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(t1 t1Var, ai.j jVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
