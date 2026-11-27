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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements fd, nr7, l8, ay2, s69, eq7, fq7, x66, qy9, h22, on5, zbc, hj, ry4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // x66
    public final void H() {
        pm pmVar = (pm) this.b;
        pmVar.b();
        pmVar.f();
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        zc zcVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                mq5 H0 = hl.H0(l2dVar, false);
                mq5 H02 = hl.H0(l2dVar, true);
                actionBarLayout.u1 = H0;
                actionBarLayout.v1 = H02;
                actionBarLayout.t1 = l2dVar;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.m(actionBarLayout.getChildAt(i), l2dVar);
                }
                break;
            default:
                vh4 vh4Var = (vh4) obj;
                vh4Var.getClass();
                mq5 H03 = hl.H0(l2dVar, false);
                tb0 tb0Var = (tb0) vh4Var.d;
                if (tb0Var == view && (zcVar = tb0Var.b) != null) {
                    zcVar.setPadding(H03.a, H03.b, H03.c, H03.d);
                }
                break;
        }
        return l2d.b;
    }

    @Override // zbc
    public final void a(int i, ArrayList arrayList) {
        hl.d3(new a30((p1) this.b, arrayList, (byte) 4), 100L);
    }

    @Override // eq7
    public final void b(int i) {
        xd xdVar = (xd) this.b;
        if (i == 0) {
            xdVar.run();
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
    @Override // s69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        boolean z;
        ArrayList arrayList;
        int i2;
        jb jbVar = (jb) this.b;
        b8c G = jbVar.S1.G(i - 1);
        if (G == null) {
            return;
        }
        int i3 = G.a;
        if (i3 == 41) {
            if (!ob6.a0 ? f > hl.L(60.0f) : f < view.getMeasuredWidth() - hl.L(60.0f)) {
                z = true;
                sg2 sg2Var = (sg2) view;
                if (!z) {
                    sg2Var.c(!sg2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = jbVar.T1;
                            boolean b = sg2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b;
                            tL_channelAdminLogEventsFilter.leave = b;
                            tL_channelAdminLogEventsFilter.join = b;
                            tL_channelAdminLogEventsFilter.invite = b;
                            tL_channelAdminLogEventsFilter.demote = b;
                            tL_channelAdminLogEventsFilter.promote = b;
                            if (jbVar.W1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = jbVar.T1;
                                boolean b2 = sg2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b2;
                                tL_channelAdminLogEventsFilter2.unkick = b2;
                                tL_channelAdminLogEventsFilter2.ban = b2;
                                tL_channelAdminLogEventsFilter2.kick = b2;
                                break;
                            }
                        } else {
                            jbVar.Y1 = !jbVar.Y1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = jbVar.T1;
                        boolean b3 = sg2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b3;
                        tL_channelAdminLogEventsFilter3.promote = b3;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = jbVar.T1;
                        boolean b4 = sg2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b4;
                        tL_channelAdminLogEventsFilter4.unkick = b4;
                        tL_channelAdminLogEventsFilter4.ban = b4;
                        tL_channelAdminLogEventsFilter4.kick = b4;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = jbVar.T1;
                        boolean b5 = sg2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b5;
                        tL_channelAdminLogEventsFilter5.invite = b5;
                        break;
                    case 6:
                        jbVar.T1.leave = sg2Var.b();
                        break;
                    case 7:
                        jbVar.T1.edit_rank = sg2Var.b();
                        break;
                    case 8:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = jbVar.T1;
                            boolean b6 = sg2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b6;
                            tL_channelAdminLogEventsFilter6.invites = b6;
                            tL_channelAdminLogEventsFilter6.settings = b6;
                            tL_channelAdminLogEventsFilter6.info = b6;
                            break;
                        } else {
                            jbVar.Z1 = !jbVar.Z1;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = jbVar.T1;
                        boolean b7 = sg2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b7;
                        tL_channelAdminLogEventsFilter7.info = b7;
                        break;
                    case 10:
                        jbVar.T1.invites = sg2Var.b();
                        break;
                    case 11:
                        jbVar.T1.group_call = sg2Var.b();
                        break;
                    case 12:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = jbVar.T1;
                            boolean b8 = sg2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b8;
                            tL_channelAdminLogEventsFilter8.edit = b8;
                            tL_channelAdminLogEventsFilter8.delete = b8;
                            break;
                        } else {
                            jbVar.a2 = !jbVar.a2;
                            break;
                        }
                    case 13:
                        jbVar.T1.delete = sg2Var.b();
                        break;
                    case 14:
                        jbVar.T1.edit = sg2Var.b();
                        break;
                    case 15:
                        jbVar.T1.pinned = sg2Var.b();
                        break;
                    case 16:
                        zh6 zh6Var = jbVar.V1;
                        if (zh6Var == null) {
                            zh6Var = new zh6();
                            jbVar.V1 = zh6Var;
                        }
                        zh6Var.b();
                        if (sg2Var.b() && (arrayList = jbVar.U1) != null) {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                long n = wf3.n(((TLRPC.ChannelParticipant) obj).peer);
                                jbVar.V1.k(n, uc7.s1(jbVar.a).X1(Long.valueOf(n)));
                            }
                            break;
                        }
                        break;
                }
                jbVar.S1.O(true);
                i2 = G.d;
                if (i2 >= 0) {
                    sg2 sg2Var2 = (sg2) view;
                    int i5 = (-i2) - 1;
                    if (i5 < 0 || i5 >= jbVar.U1.size()) {
                        return;
                    }
                    long n2 = wf3.n(((TLRPC.ChannelParticipant) jbVar.U1.get(i5)).peer);
                    TLRPC.User X1 = uc7.s1(jbVar.a).X1(Long.valueOf(n2));
                    zh6 zh6Var2 = jbVar.V1;
                    if (zh6Var2 == null) {
                        zh6Var2 = new zh6();
                        jbVar.V1 = zh6Var2;
                    }
                    boolean d = zh6Var2.d(n2);
                    zh6 zh6Var3 = jbVar.V1;
                    if (d) {
                        zh6Var3.l(n2);
                        sg2Var2.c(false, true);
                    } else {
                        zh6Var3.k(n2, X1);
                        sg2Var2.c(true, true);
                    }
                    jbVar.S1.O(true);
                    return;
                }
                return;
            }
        }
        z = false;
        sg2 sg2Var3 = (sg2) view;
        if (!z) {
        }
        switch (G.d) {
        }
        jbVar.S1.O(true);
        i2 = G.d;
        if (i2 >= 0) {
        }
    }

    @Override // h22
    public final void e(boolean z) {
        m mVar = (m) this.b;
        tw twVar = mVar.M.L;
        if (twVar != null) {
            mVar.h = true;
            twVar.a(true);
        }
    }

    @Override // qy9
    public final void g(float f) {
        cu cuVar = (cu) this.b;
        r47 r47Var = cuVar.N;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(cuVar.N, f);
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
        si siVar = (si) this.b;
        try {
            if (i == 0) {
                siVar.setText(ob6.M0(2131751399, null));
            } else {
                siVar.setText(ob6.M0(2131745268, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // ry4
    public final void k(int i) {
        eg0 eg0Var = (eg0) this.b;
        vy4 vy4Var = eg0Var.a;
        jy4 jy4Var = eg0Var.g;
        if (Build.VERSION.SDK_INT < 31 || jy4Var == null) {
            return;
        }
        ArrayList arrayList = jy4Var.a;
        if (eg0Var.l || vy4.f().a) {
            if (vsd.a(i, 4) || vsd.a(i, 2)) {
                fz4 e = vy4Var.e();
                ViewGroup viewGroup = eg0Var.n;
                if (viewGroup != null) {
                    e.b(viewGroup.getY(), eg0Var.m.getWidth(), eg0Var.n.getY() + eg0Var.n.getHeight());
                }
                jy4Var.b = e.b;
                while (jy4Var.b > arrayList.size()) {
                    arrayList.add(new hy4(arrayList.size()));
                }
                for (int i2 = 0; i2 < jy4Var.b; i2++) {
                    hy4 hy4Var = (hy4) arrayList.get(i2);
                    hy4Var.a.set(e.c(i2));
                    hy4Var.b(jy4Var.m, jy4Var.n, jy4Var.o);
                    hy4Var.c(jy4Var.k);
                    int i3 = jy4Var.p;
                    int i4 = jy4Var.q;
                    int i5 = jy4Var.r;
                    int i6 = jy4Var.s;
                    hy4Var.u = i3;
                    hy4Var.v = i4;
                    hy4Var.w = i5;
                    hy4Var.x = i6;
                }
            }
            jy4Var.c = eg0Var.o;
            jy4Var.d = eg0Var.m;
            boolean z = vy4Var.j > 0;
            boolean z2 = !z;
            if (jy4Var.l != z2) {
                jy4Var.l = z2;
                byte b = !z ? (byte) 5 : (byte) 1;
                jy4Var.m = b;
                byte b2 = z ? (byte) 1 : (byte) 10;
                jy4Var.n = b2;
                jy4Var.o = Math.max((int) b, (int) b2);
                for (int i7 = 0; i7 < jy4Var.b; i7++) {
                    ((hy4) arrayList.get(i7)).b(jy4Var.m, jy4Var.n, jy4Var.o);
                }
                jy4Var.f();
            }
            int i8 = vy4Var.k;
            int i9 = vy4Var.l;
            jy4Var.t = i8;
            jy4Var.u = i9;
            jy4Var.f();
            jy4Var.e();
            Runnable runnable = eg0Var.j;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // ay2
    public final void l(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((j9) obj).a(j, true);
                break;
            default:
                ((l9) obj).b(j);
                break;
        }
    }

    @Override // x66
    public final boolean m() {
        return false;
    }

    @Override // x66
    public final boolean n(float f) {
        return false;
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        n8 n8Var;
        s7 s7Var = (s7) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = s7Var.d) != null && n8Var.isShowing()) {
            s7Var.d.d(true);
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new g0((yx) obj, (byte) 8));
                duration.start();
                break;
            default:
                de0 de0Var = (de0) obj;
                if (z && !z2) {
                    de0Var.a();
                    break;
                }
                break;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                s0 s0Var = (s0) obj;
                l01 g = idVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(s0Var.e2);
                ConnectionsManager.getInstance(s0Var.a).sendRequestTyped(deletetone, new ic(b2), new p((Object) s0Var, (Object) g, (Object) idVar, (byte) 2));
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 15:
            default:
                ((wy) obj).run();
                break;
            case 6:
                cc ccVar = (cc) obj;
                ccVar.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = ccVar.getMessagesController().o1(ccVar.S);
                updatestarrefprogram.commission_permille = 0;
                id idVar2 = new id(3, null, ccVar.getParentActivity());
                idVar2.q(150L);
                ccVar.getConnectionsManager().sendRequest(updatestarrefprogram, new qb(ccVar, idVar2, b2));
                break;
            case 7:
                ((pb) obj).run();
                break;
            case 8:
                id idVar3 = (id) obj;
                DialogInterface.OnCancelListener onCancelListener = idVar3.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(idVar3);
                }
                idVar3.dismiss();
                break;
            case 10:
                ((kt) obj).run();
                break;
            case 11:
                ((te) obj).run();
                break;
            case 12:
                ((ue) obj).run();
                break;
            case 13:
                ((ge3) obj).run();
                break;
            case 14:
                ((e62) obj).run();
                idVar.dismiss();
                break;
            case 16:
                ((re2) obj).run();
                break;
            case 17:
                ((o97) obj).run();
                break;
        }
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        ((a70) this.b).H(i * 60, i == 0 ? 71 : 70);
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // x66
    public final void c() {
    }

    @Override // x66
    public final void p() {
    }

    private final void s(ImageReceiver imageReceiver) {
    }

    private final void t(ImageReceiver imageReceiver) {
    }

    @Override // qy9
    public final void h(float f) {
    }

    @Override // x66
    public final void j(boolean z) {
    }

    private final void f(int i, Drawable drawable) {
    }

    private final void q(int i, Drawable drawable) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
