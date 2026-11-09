package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ af(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.d0(cnVar.z0, new di.e(10));
                ll llVar = cnVar.C0;
                if (llVar != null) {
                    llVar.O(false);
                    break;
                }
                break;
            case 1:
                cnVar.P7(true);
                break;
            case 2:
                cnVar.P7(true);
                break;
            case 3:
                cnVar.bd();
                break;
            case 4:
                cnVar.P7(false);
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 24, true);
                w0Var.o0 = false;
                w0Var.H0 = new ee(cnVar, 7);
                w0Var.show();
                break;
            case 5:
                cn.A0(cnVar);
                break;
            case 6:
                if (cnVar.getUserConfig().q()) {
                    cnVar.oc = null;
                    cnVar.yd(true);
                    org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                    cnVar.getMessagesController().o0(true);
                    break;
                } else {
                    cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 3, true));
                    break;
                }
            case 7:
                sj sjVar = cnVar.Z;
                if (sjVar != null) {
                    sjVar.o0(true);
                    break;
                }
                break;
            case 8:
                cn.Z(cnVar);
                break;
            case 9:
                cnVar.La = null;
                cnVar.Ka = -1;
                View view = cnVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = cnVar.K6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.ij) arrayList.get(i11)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                cnVar.B6 = 0;
                cnVar.getMessagesController().o3(cnVar.j6, cnVar.b());
                cnVar.C6 = true;
                cnVar.qc(false);
                org.telegram.ui.ActionBar.g1 g1Var = cnVar.e9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList2 = cnVar.K6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.ij) arrayList2.get(i12)).h5();
                }
                cnVar.z1 = 0;
                cnVar.id(true);
                cnVar.getMessagesController().t3(cnVar.j6, cnVar.b());
                org.telegram.ui.ActionBar.g1 g1Var2 = cnVar.e9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList3 = cnVar.K6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.ij) arrayList3.get(i13)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                cnVar.A1 = 0;
                cnVar.hd(true);
                cnVar.getMessagesController().s3(cnVar.j6, cnVar.b());
                org.telegram.ui.ActionBar.g1 g1Var3 = cnVar.e9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                cn.D1(cnVar);
                break;
            case 14:
                cnVar.w8(false, true, 0.0f);
                break;
            case 15:
                cnVar.Z.H0();
                break;
            case 16:
                cnVar.Hc(true);
                cnVar.xd(true);
                org.telegram.ui.Components.hc.z(cnVar, 4, 0, cnVar.za).j();
                break;
            case 17:
                org.telegram.ui.Components.hc.a0(cnVar).I(R.raw.chats_infotip, org.telegram.messenger.id.M0(2131753290, null), org.telegram.messenger.id.M0(2131753291, null)).j();
                break;
            case 18:
                cnVar.finishFragment();
                break;
            case 19:
                org.telegram.messenger.g0.E2(cnVar.X0);
                break;
            case 20:
                cnVar.O4 = null;
                cnVar.L9();
                cnVar.N9();
                break;
            case 21:
                cnVar.Oc(false);
                break;
            case 22:
                cnVar.h7();
                break;
            case 23:
                cnVar.Jb = null;
                break;
            case 24:
                cnVar.J9 = false;
                cnVar.C9(true);
                break;
            case 25:
                cnVar.G7 = null;
                org.telegram.ui.Components.u40 u40Var = cnVar.p3;
                if (u40Var != null) {
                    org.telegram.ui.Components.r40 cameraContainer = u40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r40, Float>) property, 0.0f), ObjectAnimator.ofFloat(cnVar.p3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(cnVar.p3.getPaint(), org.telegram.ui.Components.m6.b, 0), ObjectAnimator.ofFloat(cnVar.p3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new gi(cnVar, i10));
                    animatorSet.start();
                    break;
                }
                break;
            case 26:
                vj vjVar = cnVar.H8;
                if (vjVar != null && vjVar.getParent() != null) {
                    cnVar.z0.g1();
                    cnVar.J8.setDrawingReady(false);
                    cnVar.H8.setTag(null);
                    cnVar.l1.removeView(cnVar.H8);
                    break;
                }
                break;
            case 27:
                sj sjVar2 = cnVar.Z;
                if (sjVar2 != null && cnVar.id != null) {
                    if (sjVar2.s0()) {
                        cnVar.Z.k0(false);
                        org.telegram.messenger.g0.K3(cnVar.id.a);
                        ((te.a) cnVar.id.b.b).a(false, true);
                        break;
                    } else {
                        cnVar.Z.V0(false, false, false);
                        cnVar.Z.s1();
                        ((te.a) cnVar.id.b.b).a(true, true);
                        break;
                    }
                }
                break;
            case 28:
                cnVar.Ua();
                break;
            default:
                cnVar.A9();
                cnVar.fd(0, true);
                break;
        }
    }
}
