// default package

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.m;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements ee, qq7, k8, qy2, g59, oac, oc, ip7, jp7, t66, zw9, c32, ln5, aac, gk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // t66
    public final void A() {
        on onVar = (on) this.b;
        onVar.b();
        onVar.f();
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        yd ydVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                iq5 H0 = gm.H0(wzcVar, false);
                iq5 H02 = gm.H0(wzcVar, true);
                actionBarLayout.u1 = H0;
                actionBarLayout.v1 = H02;
                actionBarLayout.t1 = wzcVar;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.m(actionBarLayout.getChildAt(i), wzcVar);
                }
                break;
            default:
                yh4 yh4Var = (yh4) obj;
                yh4Var.getClass();
                iq5 H03 = gm.H0(wzcVar, false);
                rc0 rc0Var = (rc0) yh4Var.d;
                if (rc0Var == view && (ydVar = rc0Var.b) != null) {
                    ydVar.setPadding(H03.a, H03.b, H03.c, H03.d);
                }
                break;
        }
        return wzc.b;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // aac
    public final void a(int i, ArrayList arrayList) {
        gm.d3(new x30((o1) this.b, arrayList, (byte) 5), 100L);
    }

    @Override // ip7
    public final void b(int i) {
        uh uhVar = (uh) this.b;
        if (i == 0) {
            uhVar.run();
        }
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 23:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new f0((yy) obj, (byte) 9));
                duration.start();
                break;
            default:
                bf0 bf0Var = (bf0) obj;
                if (z && !z2) {
                    bf0Var.a();
                    break;
                }
                break;
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
    @Override // g59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(float f, float f2, int i, View view) {
        boolean z;
        ArrayList arrayList;
        int i2;
        ib ibVar = (ib) this.b;
        c6c G = ibVar.S1.G(i - 1);
        if (G == null) {
            return;
        }
        int i3 = G.a;
        if (i3 == 41) {
            if (!jb6.a0 ? f > gm.L(60.0f) : f < view.getMeasuredWidth() - gm.L(60.0f)) {
                z = true;
                oh2 oh2Var = (oh2) view;
                if (!z) {
                    oh2Var.c(!oh2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                            boolean b = oh2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b;
                            tL_channelAdminLogEventsFilter.leave = b;
                            tL_channelAdminLogEventsFilter.join = b;
                            tL_channelAdminLogEventsFilter.invite = b;
                            tL_channelAdminLogEventsFilter.demote = b;
                            tL_channelAdminLogEventsFilter.promote = b;
                            if (ibVar.W1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                                boolean b2 = oh2Var.b();
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
                        boolean b3 = oh2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b3;
                        tL_channelAdminLogEventsFilter3.promote = b3;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = ibVar.T1;
                        boolean b4 = oh2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b4;
                        tL_channelAdminLogEventsFilter4.unkick = b4;
                        tL_channelAdminLogEventsFilter4.ban = b4;
                        tL_channelAdminLogEventsFilter4.kick = b4;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = ibVar.T1;
                        boolean b5 = oh2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b5;
                        tL_channelAdminLogEventsFilter5.invite = b5;
                        break;
                    case 6:
                        ibVar.T1.leave = oh2Var.b();
                        break;
                    case 7:
                        ibVar.T1.edit_rank = oh2Var.b();
                        break;
                    case 8:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = ibVar.T1;
                            boolean b6 = oh2Var.b();
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
                        boolean b7 = oh2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b7;
                        tL_channelAdminLogEventsFilter7.info = b7;
                        break;
                    case 10:
                        ibVar.T1.invites = oh2Var.b();
                        break;
                    case 11:
                        ibVar.T1.group_call = oh2Var.b();
                        break;
                    case 12:
                        if (!z) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = ibVar.T1;
                            boolean b8 = oh2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b8;
                            tL_channelAdminLogEventsFilter8.edit = b8;
                            tL_channelAdminLogEventsFilter8.delete = b8;
                            break;
                        } else {
                            ibVar.a2 = !ibVar.a2;
                            break;
                        }
                    case 13:
                        ibVar.T1.delete = oh2Var.b();
                        break;
                    case 14:
                        ibVar.T1.edit = oh2Var.b();
                        break;
                    case 15:
                        ibVar.T1.pinned = oh2Var.b();
                        break;
                    case 16:
                        vh6 vh6Var = ibVar.V1;
                        if (vh6Var == null) {
                            vh6Var = new vh6();
                            ibVar.V1 = vh6Var;
                        }
                        vh6Var.b();
                        if (oh2Var.b() && (arrayList = ibVar.U1) != null) {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                long n = pg3.n(((TLRPC.ChannelParticipant) obj).peer);
                                ibVar.V1.k(oc7.r1(ibVar.a).W1(Long.valueOf(n)), n);
                            }
                            break;
                        }
                        break;
                }
                ibVar.S1.O(true);
                i2 = G.d;
                if (i2 >= 0) {
                    oh2 oh2Var2 = (oh2) view;
                    int i5 = (-i2) - 1;
                    if (i5 < 0 || i5 >= ibVar.U1.size()) {
                        return;
                    }
                    long n2 = pg3.n(((TLRPC.ChannelParticipant) ibVar.U1.get(i5)).peer);
                    TLRPC.User W1 = oc7.r1(ibVar.a).W1(Long.valueOf(n2));
                    vh6 vh6Var2 = ibVar.V1;
                    if (vh6Var2 == null) {
                        vh6Var2 = new vh6();
                        ibVar.V1 = vh6Var2;
                    }
                    boolean d = vh6Var2.d(n2);
                    vh6 vh6Var3 = ibVar.V1;
                    if (d) {
                        vh6Var3.l(n2);
                        oh2Var2.c(false, true);
                    } else {
                        vh6Var3.k(W1, n2);
                        oh2Var2.c(true, true);
                    }
                    ibVar.S1.O(true);
                    return;
                }
                return;
            }
        }
        z = false;
        oh2 oh2Var3 = (oh2) view;
        if (!z) {
        }
        switch (G.d) {
        }
        ibVar.S1.O(true);
        i2 = G.d;
        if (i2 >= 0) {
        }
    }

    @Override // c32
    public final void e(boolean z) {
        m mVar = (m) this.b;
        sx sxVar = mVar.M.L;
        if (sxVar != null) {
            mVar.h = true;
            sxVar.a(true);
        }
    }

    @Override // zw9
    public final void f(float f) {
        bv bvVar = (bv) this.b;
        k47 k47Var = bvVar.N;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(bvVar.N, f);
    }

    @Override // jp7
    public final void g(lp7 lp7Var, int i) {
        rj rjVar = (rj) this.b;
        try {
            if (i == 0) {
                rjVar.setText(jb6.M0(2131751371, null));
            } else {
                rjVar.setText(jb6.M0(2131745274, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        jc jcVar = (jc) this.b;
        c6c c6cVar = (c6c) obj;
        if (jcVar.l2) {
            return;
        }
        byte b = 1;
        if (c6cVar.d == 1) {
            Object obj3 = c6cVar.H;
            if (obj3 instanceof TL_agent.agentProvider) {
                TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) obj3;
                jcVar.k2 = agentprovider;
                jcVar.g2.setText("");
                jcVar.c1(false);
                jcVar.j2.i(jb6.a0(null, null, 2131754294, agentprovider.title), false, true);
                jcVar.d1();
                jcVar.b2.g3.O(false);
                jcVar.Z1.b(1, true);
                gm.d3(new fc(jcVar, b), 250L);
            }
        }
    }

    @Override // t66
    public final boolean l() {
        return false;
    }

    @Override // t66
    public final boolean m(float f) {
        return false;
    }

    @Override // qy2
    public final void n(long j) {
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

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        m8 m8Var;
        r7 r7Var = (r7) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
            r7Var.d.d(true);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                r0 r0Var = (r0) obj;
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(deletetone, new kc(b2), new p((Object) r0Var, (Object) g, (Object) heVar, (byte) 2));
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            default:
                ((wz) obj).run();
                break;
            case 6:
                ((rb) obj).run();
                break;
            case 7:
                bc bcVar = (bc) obj;
                bcVar.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = bcVar.getMessagesController().n1(bcVar.S);
                updatestarrefprogram.commission_permille = 0;
                he heVar2 = new he(3, null, bcVar.getParentActivity());
                heVar2.q(150L);
                bcVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ob(bcVar, heVar2, b2));
                break;
            case 10:
                he heVar3 = (he) obj;
                DialogInterface.OnCancelListener onCancelListener = heVar3.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(heVar3);
                }
                heVar3.dismiss();
                break;
            case 11:
                ((l97) obj).run();
                break;
            case 12:
                ((fu) obj).run();
                break;
            case 13:
                ((jg) obj).run();
                break;
            case 14:
                ((kg) obj).run();
                break;
            case 15:
                ((ze3) obj).run();
                break;
            case 16:
                ((z62) obj).run();
                heVar.dismiss();
                break;
            case 17:
                ((qf2) obj).run();
                break;
        }
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        ((y70) this.b).l(i * 60, i == 0 ? 71 : 70);
    }

    private final void t(ImageReceiver imageReceiver) {
    }

    private final void v(ImageReceiver imageReceiver) {
    }

    @Override // t66
    public final void c() {
    }

    @Override // zw9
    public final void h(float f) {
    }

    @Override // t66
    public final void j(boolean z) {
    }

    @Override // t66
    public final void o() {
    }

    private final void i(int i, Drawable drawable) {
    }

    private final void s(int i, Drawable drawable) {
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }
}
