// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k81 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k81(r23 r23Var, ts9 ts9Var, b61 b61Var) {
        this.a = (byte) 24;
        this.b = ts9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CameraSessionWrapper cameraSession;
        tk5 tk5Var;
        tk5 tk5Var2;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                n81 n81Var = (n81) obj;
                switch (n81Var.f) {
                    case 0:
                        ((o81) n81Var.h).r.G.h(null, (b81) n81Var.getTag(), true);
                        break;
                    default:
                        ((t81) n81Var.h).n.G.h(null, (b81) n81Var.getTag(), true);
                        break;
                }
            case 1:
                ((wc7) obj).run();
                break;
            case 2:
                s09 s09Var = (s09) ((jp0) obj).e;
                if (!s09Var.b()) {
                    s09Var.setProgress(0.0f);
                    s09Var.d();
                    break;
                }
                break;
            case 3:
                lb1 lb1Var = (lb1) obj;
                CameraView cameraView = lb1Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) lb1Var.s.getBackground();
                    AnimatorSet animatorSet = lb1Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        lb1Var.w = null;
                    }
                    lb1Var.w = new AnimatorSet();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, so.e, lb1Var.s.getTag() == null ? 68 : 34);
                    ofInt.addUpdateListener(new fb1(lb1Var, b4));
                    lb1Var.w.playTogether(ofInt);
                    lb1Var.w.setDuration(200L);
                    lb1Var.w.setInterpolator(d53.f);
                    lb1Var.w.addListener(new b91(lb1Var, b4));
                    lb1Var.w.start();
                    Object tag = lb1Var.s.getTag();
                    ImageView imageView = lb1Var.s;
                    if (tag != null) {
                        imageView.setTag(null);
                        cameraSession.setCurrentFlashMode("off");
                        break;
                    } else {
                        imageView.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        break;
                    }
                }
                break;
            case 4:
                pc1 pc1Var = (pc1) obj;
                jc1 jc1Var = pc1Var.f;
                jc1Var.d();
                jc1Var.k(true);
                hc1 hc1Var = pc1Var.d0;
                gm.r(hc1Var);
                hc1Var.run();
                break;
            case 5:
                tc1 tc1Var = (tc1) obj;
                oc7.d1().edit().putInt("aihintshown", 3).apply();
                a1 a1Var = new a1(tc1Var.getContext(), new r63());
                a1Var.o1(tc1Var.f.getText());
                a1Var.e2 = new mf2(tc1Var, (byte) 12);
                a1Var.m1(0L, true, new z02(tc1Var, b2));
                a1Var.show();
                break;
            case 6:
                ((l9b) obj).B();
                break;
            case 7:
                ((l97) obj).run();
                break;
            case 8:
                ((vi1) obj).A0();
                break;
            case 9:
                yv1 yv1Var = ((nr1) obj).b;
                yv1Var.j0.p();
                e51 e51Var = yv1Var.Y1;
                if (e51Var != null) {
                    e51Var.r1(0, null);
                }
                yv1Var.ma();
                break;
            case 10:
                yv1 yv1Var2 = ((iv1) obj).a;
                tk5Var = ((d) yv1Var2).parentLayout;
                if (tk5Var != null) {
                    tk5Var2 = ((d) yv1Var2).parentLayout;
                    ((ActionBarLayout) tk5Var2).p();
                    break;
                }
                break;
            case 11:
                int i = ChatActivityEnterView.z7;
                ((qw1) obj).a(Boolean.TRUE, 0, 0);
                break;
            case 12:
                ((n52) obj).r.U(null, null);
                break;
            case 13:
                p82 p82Var = (p82) obj;
                p82Var.K(true, 0, 0, 0L, false);
                j67 j67Var = p82Var.P;
                if (j67Var != null) {
                    j67Var.f(true);
                    p82Var.P = null;
                    break;
                }
                break;
            case 14:
                ua2 ua2Var = (ua2) obj;
                ua2Var.w.setProgress(0.0f);
                ua2Var.w.d();
                break;
            case 15:
                ((je2) obj).e.o0(true);
                break;
            case 16:
                rj2 rj2Var = (rj2) obj;
                if (!rj2Var.u1) {
                    int i2 = rj2Var.t1;
                    if (i2 != rj2Var.s1) {
                        rj2Var.u1 = true;
                        int i3 = 70;
                        if (i2 == 3) {
                            b3 = 2678400;
                        } else if (i2 == 2) {
                            b3 = 604800;
                        } else if (i2 == 1) {
                            b3 = 86400;
                        } else {
                            i3 = 71;
                        }
                        int i4 = i3;
                        vg1 vg1Var = rj2Var.v1.a;
                        oc7 messagesController = vg1Var.getMessagesController();
                        TLRPC.Chat chat = vg1Var.f;
                        messagesController.P4(b3, -chat.id);
                        TLRPC.ChatFull M0 = vg1Var.getMessagesController().M0(chat.id);
                        if (M0 != null) {
                            vg1Var.x.k(-chat.id, i4, null, Integer.valueOf(M0.ttl_period), null, null);
                        }
                    }
                    if (!rj2Var.u1) {
                        rj2Var.dismiss();
                        break;
                    } else {
                        gm.d3(new xf2(rj2Var, (byte) 4), 200L);
                        break;
                    }
                }
                break;
            case 17:
                ((ln2) obj).dismiss();
                break;
            case 18:
                po2 po2Var = (po2) obj;
                TLRPC.Chat chat2 = po2Var.J;
                if (chat2 != null && !chat2.title.equals(((vc) po2Var.r.b).getText().toString())) {
                    po2Var.getMessagesController().y(po2Var.J.id, ((vc) po2Var.r.b).getText().toString(), new ko2(po2Var, b4));
                }
                TLRPC.Chat chat3 = po2Var.J;
                if (chat3 != null && po2Var.n != po2Var.h) {
                    if (chat3.default_banned_rights == null) {
                        chat3.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    po2Var.J.default_banned_rights.manage_linked_peers = !po2Var.n;
                    po2Var.getMessagesController().O4(po2Var.c, po2Var.J.default_banned_rights, false, po2Var);
                }
                po2Var.finishFragment();
                break;
            case 19:
                ((qo2) obj).dismiss();
                break;
            case 20:
                ((jp2) obj).n.n1.E(0);
                break;
            case 21:
                pp2 pp2Var = ((kp2) obj).r;
                if (!sd2.w(27, pp2Var.p1)) {
                    pp2Var.dismiss();
                    break;
                } else {
                    b61 b61Var = pp2Var.r1;
                    if (!b61Var.R) {
                        b61Var.setLoading(true);
                        oc7 r1 = oc7.r1(pp2Var.a);
                        dp2 dp2Var = new dp2(pp2Var, b2);
                        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                        tL_channels_getAdminedPublicChannels.for_community_peer = true;
                        r1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new kc(b3), new s87(r1, dp2Var, b3));
                        break;
                    }
                }
                break;
            case 22:
                ((ContactsActivity) obj).m0();
                break;
            case 23:
                ((i13) obj).run();
                break;
            case 24:
                ts9 ts9Var = (ts9) obj;
                v7b v7bVar = (v7b) ts9Var.b;
                r23[] r23VarArr = (r23[]) ts9Var.c;
                v7bVar.a0.A1 = true;
                r23VarArr[0].dismiss();
                v7bVar.h(true);
                break;
            case 25:
                x53 x53Var = (x53) obj;
                if (x53Var.k) {
                    x53Var.d();
                    break;
                }
                break;
            case 26:
                ((bjb[]) obj)[0].setChecked(!r0.e.h);
                break;
            case 27:
                ((my0) ((k6d) obj).b).y0.run();
                break;
            case 28:
                hg9.n(3, (d) obj);
                break;
            default:
                ((ef3) obj).d1(true);
                break;
        }
    }

    public /* synthetic */ k81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
