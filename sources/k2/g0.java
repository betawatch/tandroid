package k2;

import ai.p8;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import b2.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.a2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.s8;
import org.telegram.ui.qv0;
import org.telegram.ui.ts0;
import qg.o2;
import qg.v1;
import s4.j1;
import s4.p0;
import s4.q0;
import u2.c1;
import u2.d1;
import u2.o1;
import v7.a8;
import w7.u8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g0 implements n, e2, y2.g, m.k, n5.b, o0.a, c1, l1, ah.j, lg.e, h81, a2, com.google.android.gms.common.api.internal.s, v1, r4.c, com.google.android.gms.common.api.internal.o, j1, v0.i {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A2(int i10) {
        return false;
    }

    @Override // ah.j
    public void B0(ah.a aVar) {
        aVar.a(((yi) this.b).getThemedColor(i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // y2.g
    public void C(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        if (i10 == 0) {
            long j11 = oVar.a;
            tVar = new u2.t(oVar.b);
        } else {
            long j12 = oVar.a;
            Uri uri = oVar.d.c;
            tVar = new u2.t(j10);
        }
        hVar.q.u(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // u2.c1
    public void D(d1 d1Var) {
        o2.k kVar = (o2.k) this.b;
        kVar.G.D(kVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ p9 E2() {
        return null;
    }

    @Override // y2.g
    public void F(y2.i iVar, long j3, long j10) {
        int i10;
        boolean z10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j12 = oVar.a;
        Uri uri = oVar.d.c;
        u2.t tVar = new u2.t(j10);
        hVar.m.getClass();
        hVar.q.q(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f;
        m2.c cVar2 = hVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i11 = 0;
        while (i11 < size && hVar.H.b(i11).b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = hVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    z10 = true;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                    }
                } else {
                    i10 = i11;
                    z10 = true;
                }
                hVar.M = 0;
            }
            int i12 = hVar.M;
            hVar.M = i12 + 1;
            if (i12 < hVar.m.m3(oVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                hVar.C = new z4();
                return;
            }
        }
        i10 = i11;
        z10 = true;
        j11 = -9223372036854775807L;
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j3 - j10;
        hVar.K = j3;
        hVar.O += i10;
        synchronized (hVar.t) {
            try {
                if (oVar.b.a.equals(hVar.F)) {
                    Uri uri2 = hVar.H.k;
                    if (uri2 == null) {
                        uri2 = u8.a(oVar.d.c);
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.H;
        if (!cVar3.d || hVar.L != j11) {
            hVar.y(true);
            return;
        }
        c5.a aVar = cVar3.i;
        if (aVar == null) {
            hVar.v();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.L = e2.d0.S(aVar.c) - hVar.K;
                hVar.y(z10);
                return;
            } catch (s0 e7) {
                hVar.x(e7);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.z(aVar, new l2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.z(aVar, new ob.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.v();
        } else {
            hVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // r4.c
    public void H() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1() {
        return false;
    }

    @Override // lg.e
    public void I0() {
        ((vf0) this.b).b.k();
    }

    @Override // r4.c
    public void J(int i10, Object obj) {
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

    @Override // lg.e
    public void K() {
        ((vf0) this.b).b.o();
    }

    @Override // lg.e
    public void K0(float f7) {
        vf0 vf0Var = (vf0) this.b;
        vf0Var.b.setRotation(f7);
        vf0Var.getClass();
        uf0 uf0Var = vf0Var.a;
        if (uf0Var != null) {
            ((ts0) uf0Var).a(false);
        }
    }

    public void M0() {
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
        b2.l1[] l1VarArr = new b2.l1[i11];
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
        kVar.G.m(kVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // y2.g
    public void O0(y2.i iVar, long j3, long j10, boolean z10) {
        ((l2.h) this.b).w((y2.o) iVar, j10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1() {
        return false;
    }

    @Override // k2.n
    public void P(int i10, long j3, long j10) {
        n4.x xVar = ((h0) this.b).X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new i(xVar, i10, j3, j10, 0));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean T0(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        c30 c30Var;
        boolean z11;
        b30 b30Var = (b30) this.b;
        int i10 = b30.w;
        c30 c30Var2 = b30Var.f;
        androidx.mediarouter.app.c cVar = b30Var.e;
        int action = motionEvent.getAction();
        if (b30Var.v == null) {
            b30Var.v = VelocityTracker.obtain();
        }
        b30Var.v.addMovement(motionEvent);
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
            if (b30Var.g != null && c30Var2.a()) {
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = b30Var.m;
                if (motionEvent4 != null && (motionEvent3 = b30Var.n) != null && hasMessages && b30Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < b30Var.b) {
                        b30Var.o = true;
                        z10 = b30Var.g.onDoubleTap(b30Var.m) | b30Var.g.onDoubleTapEvent(motionEvent);
                        b30Var.p = f12;
                        b30Var.r = f12;
                        b30Var.q = f13;
                        b30Var.s = f13;
                        motionEvent2 = b30Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        b30Var.m = MotionEvent.obtain(motionEvent);
                        b30Var.k = true;
                        b30Var.l = true;
                        b30Var.h = true;
                        b30Var.j = false;
                        b30Var.i = false;
                        if (b30Var.t) {
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, b30Var.m.getDownTime() + i10 + b30Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, b30Var.m.getDownTime() + i10);
                        return c30Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            b30Var.p = f12;
            b30Var.r = f12;
            b30Var.q = f13;
            b30Var.s = f13;
            motionEvent2 = b30Var.m;
            if (motionEvent2 != null) {
            }
            b30Var.m = MotionEvent.obtain(motionEvent);
            b30Var.k = true;
            b30Var.l = true;
            b30Var.h = true;
            b30Var.j = false;
            b30Var.i = false;
            if (b30Var.t) {
            }
            cVar.sendEmptyMessageAtTime(1, b30Var.m.getDownTime() + i10);
            return c30Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            b30Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (b30Var.o) {
                onFling = b30Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (b30Var.j) {
                    cVar.removeMessages(3);
                    b30Var.j = false;
                } else if (b30Var.k) {
                    boolean onSingleTapUp = c30Var2.onSingleTapUp(motionEvent);
                    if (b30Var.i && (c30Var = b30Var.g) != null) {
                        c30Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = b30Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, b30Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > b30Var.c || Math.abs(xVelocity) > b30Var.c) {
                        onFling = c30Var2.onFling(b30Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = b30Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            b30Var.n = obtain;
            VelocityTracker velocityTracker2 = b30Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                b30Var.v = null;
            }
            b30Var.o = false;
            b30Var.i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                b30Var.v.recycle();
                b30Var.v = null;
                b30Var.o = false;
                b30Var.h = false;
                b30Var.k = false;
                b30Var.l = false;
                b30Var.i = false;
                if (b30Var.j) {
                    b30Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                b30Var.p = f12;
                b30Var.r = f12;
                b30Var.q = f13;
                b30Var.s = f13;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                b30Var.o = false;
                b30Var.k = false;
                b30Var.l = false;
                b30Var.i = false;
                if (b30Var.j) {
                    b30Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                b30Var.p = f12;
                b30Var.r = f12;
                b30Var.q = f13;
                b30Var.s = f13;
                b30Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, b30Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = b30Var.v.getXVelocity(pointerId2);
                float yVelocity2 = b30Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((b30Var.v.getYVelocity(pointerId3) * yVelocity2) + (b30Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            b30Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!b30Var.j) {
            float f14 = b30Var.p - f12;
            float f15 = b30Var.q - f13;
            if (b30Var.o) {
                return b30Var.g.onDoubleTapEvent(motionEvent);
            }
            if (b30Var.k) {
                int i14 = (int) (f12 - b30Var.r);
                int i15 = (int) (f13 - b30Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > b30Var.a) {
                    z11 = c30Var2.onScroll(b30Var.m, motionEvent, f14, f15);
                    b30Var.p = f12;
                    b30Var.q = f13;
                    b30Var.k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > b30Var.a) {
                    b30Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = c30Var2.onScroll(b30Var.m, motionEvent, f14, f15);
                b30Var.p = f12;
                b30Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    public byte U0() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void V0(int i10, u1 u1Var) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    public int W0() {
        return ((U0() & 255) << 24) | ((U0() & 255) << 16) | ((U0() & 255) << 8) | (U0() & 255);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // o0.a
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    public int Y0() {
        return ((U0() & Byte.MAX_VALUE) << 21) | ((U0() & Byte.MAX_VALUE) << 14) | ((U0() & Byte.MAX_VALUE) << 7) | (U0() & Byte.MAX_VALUE);
    }

    @Override // k2.n
    public void Z() {
        x2.p pVar;
        h0 h0Var = (h0) this.b;
        synchronized (h0Var.a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    public void Z0(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // k2.n
    public void a(long j3) {
        n4.x xVar = ((h0) this.b).X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new ai.j(xVar, j3, 13));
        }
    }

    @Override // lg.e
    public void a0() {
        ((vf0) this.b).b.a.g(1, true);
    }

    public void a1(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                n6.o oVar = (n6.o) this.b;
                Parcel H0 = aVar.H0();
                k7.a.c(H0, oVar);
                try {
                    aVar.b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            case 25:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar2 = (s6.a) this.b;
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, aVar2);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
            default:
                v8.j jVar = (v8.j) this.b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar3 = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar3);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
                    Bundle bundle = Bundle.EMPTY;
                    aVar3.O(Status.h, null);
                    return;
                }
        }
    }

    @Override // s4.j1
    public int b(View view) {
        return p0.z(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // s4.j1
    public int c() {
        return ((p0) this.b).G();
    }

    @Override // s4.j1
    public int c0() {
        p0 p0Var = (p0) this.b;
        return p0Var.n - p0Var.C();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(u1 u1Var, boolean z10) {
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

    @Override // k2.n
    public void d() {
        ((h0) this.b).i1 = true;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        return ((ga) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qv0 e2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // k2.n
    public void f0(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        n4.x xVar = ((h0) this.b).X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new f(xVar, exc, 1));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(long j3) {
        return false;
    }

    @Override // gd.a
    public Object get() {
        return this.b;
    }

    @Override // gg.a2
    public void h(int i10) {
        switch (this.a) {
            case 15:
                ir0 ir0Var = (ir0) this.b;
                mr0 mr0Var = ir0Var.K;
                ir0Var.s = i10;
                if (ir0Var.v != i10) {
                    ir0Var.d.clear();
                }
                int i11 = ir0Var.J;
                if (ir0Var.h() != 0 || ir0Var.e.e() || ir0Var.I) {
                    mr0Var.x0.b(i11);
                } else {
                    mr0Var.Q.e(false, true);
                }
                ir0Var.l();
                int i12 = mr0.a1;
                mr0Var.L0(true);
                break;
            default:
                s8 s8Var = (s8) this.b;
                if (!s8Var.n && i10 == s8Var.I) {
                    s8Var.d0(s8Var.M.getText().toString().trim());
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // lg.e
    public boolean i0() {
        uf0 uf0Var = ((vf0) this.b).a;
        if (uf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((ts0) uf0Var).a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i1(int i10, u1 u1Var) {
        return i10 == ((ga) this.b).s;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // k2.n
    public void k0() {
        ((h0) this.b).g1 = true;
    }

    @Override // ah.j
    public void l(Canvas canvas) {
        yi yiVar = (yi) this.b;
        canvas.drawColor(yiVar.getThemedColor(i6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            yiVar.F2.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int l0(u1 u1Var) {
        return 0;
    }

    @Override // m.e2
    public void n0(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // k2.n
    public void o0(k kVar) {
        n4.x xVar = ((h0) this.b).X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new h(xVar, kVar, 0));
        }
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        r2.k kVar;
        h0 h0Var = (h0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (kVar = h0Var.Z0) != null) {
            kVar.d(i10);
        }
        n4.x xVar = h0Var.X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new p8(xVar, i10, 11));
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void onError(k81 k81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        ae.m mVar = (ae.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.x xVar = ((h0) this.b).X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new bi.f(8, xVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void onStateChanged(boolean z10, int i10) {
        ll0 ll0Var = (ll0) this.b;
        if (z10 && ll0Var.n.n() >= 0) {
            ll0Var.w = true;
        }
        hh0 hh0Var = ll0Var.f;
        bd0 bd0Var = ll0Var.x;
        hh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(bd0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(bd0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p0() {
        return e();
    }

    @Override // lg.e
    public boolean q() {
        uf0 uf0Var = ((vf0) this.b).a;
        if (uf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((ts0) uf0Var).a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.N0();
    }

    @Override // qg.v1
    public void q0(float f7) {
        ((o2) this.b).setOutlineWidth(f7);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // gg.a2
    public boolean s0(int i10) {
        switch (this.a) {
            case 15:
                return i10 == ((ir0) this.b).r;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean t0(b6 b6Var) {
        return false;
    }

    @Override // s4.j1
    public View u0(int i10) {
        return ((p0) this.b).q(i10);
    }

    @Override // k2.n
    public void v() {
        i2.j0 j0Var = ((h0) this.b).W;
        if (j0Var != null) {
            j0Var.a.g0 = true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // s4.j1
    public int w0(View view) {
        return p0.v(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void x(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((r7.i) this.b).b;
        synchronized (nVar2) {
            nVar2.b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.c).c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
        int i10 = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j12 = oVar.a;
        Uri uri = oVar.d.c;
        u2.t tVar = new u2.t(j10);
        int i11 = oVar.c;
        hVar.m.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.k)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k4.d dVar = j11 != -9223372036854775807L ? y2.l.f : new k4.d(0, j11, false);
            hVar.q.s(tVar, i11, iOException, !dVar.a());
            return dVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        hVar.q.s(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // k2.n
    public void y0() {
        i2.j0 j0Var = ((h0) this.b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // m.e2
    public void z(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // k2.n
    public void z0(k kVar) {
        n4.x xVar = ((h0) this.b).X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new h(xVar, kVar, 1));
        }
    }

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // qg.v1
    public float get() {
        return ((o2) this.b).F;
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e7 = (w0.d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        ae.m mVar = (ae.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(a8.a(e7));
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ g0(s6.g gVar, s6.a aVar) {
        this.a = 25;
        this.b = aVar;
    }

    public g0(ArrayList arrayList) {
        this.a = 22;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public g0(Context context, Uri uri) {
        this.a = 8;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g0(Context context, c30 c30Var) {
        this.a = 12;
        this.b = new b30(context, c30Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w2() {
    }

    private final /* synthetic */ void P0(ArrayList arrayList) {
    }

    private final /* synthetic */ void Q0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void J0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
