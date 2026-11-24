// default package

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.m;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements ed, no7, k8, gx2, d39, en7, fn7, t46, wu9, q12, ll5, z7c, gj, mw4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new f0((xx) obj, (byte) 8));
                duration.start();
                break;
            default:
                be0 be0Var = (be0) obj;
                if (z && !z2) {
                    be0Var.a();
                    break;
                }
                break;
        }
    }

    @Override // t46
    public final void D() {
        om omVar = (om) this.b;
        omVar.b();
        omVar.f();
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        yc ycVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                io5 H0 = gl.H0(vxcVar, false);
                io5 H02 = gl.H0(vxcVar, true);
                actionBarLayout.u1 = H0;
                actionBarLayout.v1 = H02;
                actionBarLayout.t1 = vxcVar;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.m(actionBarLayout.getChildAt(i), vxcVar);
                }
                break;
            default:
                xf4 xf4Var = (xf4) obj;
                xf4Var.getClass();
                io5 H03 = gl.H0(vxcVar, false);
                rb0 rb0Var = (rb0) xf4Var.d;
                if (rb0Var == view && (ycVar = rb0Var.b) != null) {
                    ycVar.setPadding(H03.a, H03.b, H03.c, H03.d);
                }
                break;
        }
        return vxc.b;
    }

    @Override // z7c
    public final void a(int i, ArrayList arrayList) {
        gl.e3(new z20((o1) this.b, arrayList, (byte) 4), 100L);
    }

    @Override // en7
    public final void b(int i) {
        ug ugVar = (ug) this.b;
        if (i == 0) {
            ugVar.run();
        }
    }

    @Override // q12
    public final void d(boolean z) {
        m mVar = (m) this.b;
        sw swVar = mVar.M.L;
        if (swVar != null) {
            mVar.h = true;
            swVar.a(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r10 == 35) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0169  */
    @Override // d39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f, float f2, int i, View view) {
        boolean z;
        ArrayList arrayList;
        int i2;
        ib ibVar = (ib) this.b;
        c4c G = ibVar.S1.G(i - 1);
        if (G == null) {
            return;
        }
        int i3 = G.a;
        if (i3 == 41) {
            if (!k96.a0 ? f > gl.L(60.0f) : f < view.getMeasuredWidth() - gl.L(60.0f)) {
                z = true;
                ag2 ag2Var = (ag2) view;
                if (!z) {
                    ag2Var.c(!ag2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                            boolean b = ag2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b;
                            tL_channelAdminLogEventsFilter.leave = b;
                            tL_channelAdminLogEventsFilter.join = b;
                            tL_channelAdminLogEventsFilter.invite = b;
                            tL_channelAdminLogEventsFilter.demote = b;
                            tL_channelAdminLogEventsFilter.promote = b;
                            if (ibVar.W1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                                boolean b2 = ag2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b2;
                                tL_channelAdminLogEventsFilter2.unkick = b2;
                                tL_channelAdminLogEventsFilter2.ban = b2;
                                tL_channelAdminLogEventsFilter2.kick = b2;
                                break;
                            }
                        } else {
                            ibVar.Y1 = !ibVar.Y1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = ibVar.T1;
                        boolean b3 = ag2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b3;
                        tL_channelAdminLogEventsFilter3.promote = b3;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = ibVar.T1;
                        boolean b4 = ag2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b4;
                        tL_channelAdminLogEventsFilter4.unkick = b4;
                        tL_channelAdminLogEventsFilter4.ban = b4;
                        tL_channelAdminLogEventsFilter4.kick = b4;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = ibVar.T1;
                        boolean b5 = ag2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b5;
                        tL_channelAdminLogEventsFilter5.invite = b5;
                        break;
                    case 6:
                        ibVar.T1.leave = ag2Var.b();
                        break;
                    case 7:
                        ibVar.T1.edit_rank = ag2Var.b();
                        break;
                    case 8:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = ibVar.T1;
                            boolean b6 = ag2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b6;
                            tL_channelAdminLogEventsFilter6.invites = b6;
                            tL_channelAdminLogEventsFilter6.settings = b6;
                            tL_channelAdminLogEventsFilter6.info = b6;
                            break;
                        } else {
                            ibVar.Z1 = !ibVar.Z1;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = ibVar.T1;
                        boolean b7 = ag2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b7;
                        tL_channelAdminLogEventsFilter7.info = b7;
                        break;
                    case 10:
                        ibVar.T1.invites = ag2Var.b();
                        break;
                    case 11:
                        ibVar.T1.group_call = ag2Var.b();
                        break;
                    case 12:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = ibVar.T1;
                            boolean b8 = ag2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b8;
                            tL_channelAdminLogEventsFilter8.edit = b8;
                            tL_channelAdminLogEventsFilter8.delete = b8;
                            break;
                        } else {
                            ibVar.a2 = !ibVar.a2;
                            break;
                        }
                    case 13:
                        ibVar.T1.delete = ag2Var.b();
                        break;
                    case 14:
                        ibVar.T1.edit = ag2Var.b();
                        break;
                    case 15:
                        ibVar.T1.pinned = ag2Var.b();
                        break;
                    case 16:
                        vf6 vf6Var = ibVar.V1;
                        if (vf6Var == null) {
                            vf6Var = new vf6();
                            ibVar.V1 = vf6Var;
                        }
                        vf6Var.b();
                        if (ag2Var.b() && (arrayList = ibVar.U1) != null) {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                long n = cf3.n(((TLRPC.ChannelParticipant) obj).peer);
                                ibVar.V1.k(na7.q1(ibVar.a).V1(Long.valueOf(n)), n);
                            }
                            break;
                        }
                        break;
                }
                ibVar.S1.O(true);
                i2 = G.d;
                if (i2 >= 0) {
                    ag2 ag2Var2 = (ag2) view;
                    int i5 = (-i2) - 1;
                    if (i5 < 0 || i5 >= ibVar.U1.size()) {
                        return;
                    }
                    long n2 = cf3.n(((TLRPC.ChannelParticipant) ibVar.U1.get(i5)).peer);
                    TLRPC.User V1 = na7.q1(ibVar.a).V1(Long.valueOf(n2));
                    vf6 vf6Var2 = ibVar.V1;
                    if (vf6Var2 == null) {
                        vf6Var2 = new vf6();
                        ibVar.V1 = vf6Var2;
                    }
                    boolean d = vf6Var2.d(n2);
                    vf6 vf6Var3 = ibVar.V1;
                    if (d) {
                        vf6Var3.l(n2);
                        ag2Var2.c(false, true);
                    } else {
                        vf6Var3.k(V1, n2);
                        ag2Var2.c(true, true);
                    }
                    ibVar.S1.O(true);
                    return;
                }
                return;
            }
        }
        z = false;
        ag2 ag2Var3 = (ag2) view;
        if (!z) {
        }
        switch (G.d) {
        }
        ibVar.S1.O(true);
        i2 = G.d;
        if (i2 >= 0) {
        }
    }

    @Override // wu9
    public final void f(float f) {
        bu buVar = (bu) this.b;
        k27 k27Var = buVar.N;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(buVar.N, f);
    }

    @Override // fn7
    public final void i(hn7 hn7Var, int i) {
        ri riVar = (ri) this.b;
        try {
            if (i == 0) {
                riVar.setText(k96.M0(2131751422, null));
            } else {
                riVar.setText(k96.M0(2131745348, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // mw4
    public final void j(int i) {
        dg0 dg0Var = (dg0) this.b;
        qw4 qw4Var = dg0Var.a;
        ew4 ew4Var = dg0Var.g;
        if (Build.VERSION.SDK_INT < 31 || ew4Var == null) {
            return;
        }
        ArrayList arrayList = ew4Var.a;
        if (dg0Var.l || qw4.f().a) {
            if (fod.a(i, 4) || fod.a(i, 2)) {
                zw4 e = qw4Var.e();
                ViewGroup viewGroup = dg0Var.n;
                if (viewGroup != null) {
                    e.b(viewGroup.getY(), dg0Var.m.getWidth(), dg0Var.n.getY() + dg0Var.n.getHeight());
                }
                ew4Var.b = e.b;
                while (ew4Var.b > arrayList.size()) {
                    arrayList.add(new cw4(arrayList.size()));
                }
                for (int i2 = 0; i2 < ew4Var.b; i2++) {
                    cw4 cw4Var = (cw4) arrayList.get(i2);
                    cw4Var.a.set(e.c(i2));
                    cw4Var.b(ew4Var.m, ew4Var.n, ew4Var.o);
                    cw4Var.c(ew4Var.k);
                    int i3 = ew4Var.p;
                    int i4 = ew4Var.q;
                    int i5 = ew4Var.r;
                    int i6 = ew4Var.s;
                    cw4Var.u = i3;
                    cw4Var.v = i4;
                    cw4Var.w = i5;
                    cw4Var.x = i6;
                }
            }
            ew4Var.c = dg0Var.o;
            ew4Var.d = dg0Var.m;
            boolean z = qw4Var.j > 0;
            boolean z2 = !z;
            if (ew4Var.l != z2) {
                ew4Var.l = z2;
                byte b = !z ? (byte) 5 : (byte) 1;
                ew4Var.m = b;
                byte b2 = z ? (byte) 1 : (byte) 10;
                ew4Var.n = b2;
                ew4Var.o = Math.max((int) b, (int) b2);
                for (int i7 = 0; i7 < ew4Var.b; i7++) {
                    ((cw4) arrayList.get(i7)).b(ew4Var.m, ew4Var.n, ew4Var.o);
                }
                ew4Var.f();
            }
            int i8 = qw4Var.k;
            int i9 = qw4Var.l;
            ew4Var.t = i8;
            ew4Var.u = i9;
            ew4Var.f();
            ew4Var.e();
            Runnable runnable = dg0Var.j;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // t46
    public final boolean m() {
        return false;
    }

    @Override // t46
    public final boolean n(float f) {
        return false;
    }

    @Override // gx2
    public final void o(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((i9) obj).a(j, true);
                break;
            default:
                ((k9) obj).b(j);
                break;
        }
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        m8 m8Var;
        r7 r7Var = (r7) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
            r7Var.d.d(true);
        }
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ((y60) this.b).n(i * 60, i == 0 ? 71 : 70);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                r0 r0Var = (r0) obj;
                c01 g = hdVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(deletetone, new hc(b2), new p((Object) r0Var, (Object) g, (Object) hdVar, (byte) 2));
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                ((wy) obj).run();
                break;
            case 6:
                ((rb) obj).run();
                break;
            case 7:
                bc bcVar = (bc) obj;
                bcVar.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = bcVar.getMessagesController().m1(bcVar.S);
                updatestarrefprogram.commission_permille = 0;
                hd hdVar2 = new hd(3, null, bcVar.getParentActivity());
                hdVar2.q(150L);
                bcVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ob(bcVar, hdVar2, b2));
                break;
            case 8:
                hd hdVar3 = (hd) obj;
                DialogInterface.OnCancelListener onCancelListener = hdVar3.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(hdVar3);
                }
                hdVar3.dismiss();
                break;
            case 9:
                ((s67) obj).run();
                break;
            case 10:
                ((et) obj).run();
                break;
            case 11:
                ((kf) obj).run();
                break;
            case 12:
                ((lf) obj).run();
                break;
            case 13:
                ((nd3) obj).run();
                break;
            case 14:
                ((o52) obj).run();
                hdVar.dismiss();
                break;
            case 15:
                ((fe2) obj).run();
                break;
        }
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // t46
    public final void c() {
    }

    @Override // t46
    public final void p() {
    }

    private final void w(ImageReceiver imageReceiver) {
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    @Override // wu9
    public final void h(float f) {
    }

    @Override // t46
    public final void k(boolean z) {
    }

    private final void g(int i, Drawable drawable) {
    }

    private final void t(int i, Drawable drawable) {
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }
}
