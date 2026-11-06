package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ af(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.z0 z0Var;
        int i7 = this.a;
        int i10 = 0;
        an anVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.d0(anVar.z0, new di.e(10));
                jl jlVar = anVar.C0;
                if (jlVar != null) {
                    jlVar.O(false);
                    break;
                }
                break;
            case 1:
                anVar.O7(true);
                break;
            case 2:
                anVar.O7(true);
                break;
            case 3:
                anVar.Yc();
                break;
            case 4:
                anVar.O7(false);
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 24, true);
                w0Var.o0 = false;
                w0Var.H0 = new ee(anVar, 2);
                w0Var.show();
                break;
            case 5:
                an.x0(anVar);
                break;
            case 6:
                if (anVar.getUserConfig().q()) {
                    anVar.mc = null;
                    anVar.vd(true);
                    org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                    anVar.getMessagesController().o0(true);
                    break;
                } else {
                    anVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 3, true));
                    break;
                }
            case 7:
                qj qjVar = anVar.Z;
                if (qjVar != null) {
                    qjVar.o0(true);
                    break;
                }
                break;
            case 8:
                an.Z(anVar);
                break;
            case 9:
                anVar.Ja = null;
                anVar.Ia = -1;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                anVar.Lc(false);
                break;
            case 11:
                ArrayList arrayList = anVar.K6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.ij) arrayList.get(i11)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                anVar.B6 = 0;
                anVar.getMessagesController().o3(anVar.j6, anVar.b());
                anVar.C6 = true;
                anVar.nc(false);
                org.telegram.ui.ActionBar.g1 g1Var = anVar.e9;
                if (g1Var != null) {
                    g1Var.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList2 = anVar.K6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.ij) arrayList2.get(i12)).i5();
                }
                anVar.z1 = 0;
                anVar.fd(true);
                anVar.getMessagesController().t3(anVar.j6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var2 = anVar.e9;
                if (g1Var2 != null) {
                    g1Var2.dismiss();
                    break;
                }
                break;
            case 13:
                ArrayList arrayList3 = anVar.K6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.ij) arrayList3.get(i13)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                anVar.A1 = 0;
                anVar.ed(true);
                anVar.getMessagesController().s3(anVar.j6, anVar.b());
                org.telegram.ui.ActionBar.g1 g1Var3 = anVar.e9;
                if (g1Var3 != null) {
                    g1Var3.dismiss();
                    break;
                }
                break;
            case 14:
                an.z1(anVar);
                break;
            case 15:
                anVar.Z.H0();
                break;
            case 16:
                anVar.Ec(true);
                anVar.ud(true);
                org.telegram.ui.Components.hc.z(anVar, 4, 0, anVar.xa).j();
                break;
            case 17:
                org.telegram.ui.Components.hc.a0(anVar).I(R.raw.chats_infotip, org.telegram.messenger.hd.M0(2131753290, null), org.telegram.messenger.hd.M0(2131753291, null)).j();
                break;
            case 18:
                anVar.finishFragment();
                break;
            case 19:
                anVar.v8(false, true, 0.0f);
                break;
            case 20:
                org.telegram.messenger.g0.E2(anVar.X0);
                break;
            case 21:
                anVar.O4 = null;
                anVar.K9();
                anVar.M9();
                break;
            case 22:
                anVar.v8(false, true, 0.0f);
                break;
            case 23:
                anVar.Hb = null;
                break;
            case 24:
                anVar.g7();
                break;
            case 25:
                anVar.H9 = false;
                anVar.B9(true);
                break;
            case 26:
                anVar.G7 = null;
                org.telegram.ui.Components.t40 t40Var = anVar.p3;
                if (t40Var != null) {
                    org.telegram.ui.Components.q40 cameraContainer = t40Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q40, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q40, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q40, Float>) property, 0.0f), ObjectAnimator.ofFloat(anVar.p3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(anVar.p3.getPaint(), org.telegram.ui.Components.m6.b, 0), ObjectAnimator.ofFloat(anVar.p3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ei(anVar, i10));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ActionBar.z0[] z0VarArr = anVar.g9;
                if (z0VarArr != null && z0VarArr.length > 0 && (z0Var = z0VarArr[0]) != null) {
                    z0Var.requestFocus();
                    anVar.g9[0].performAccessibilityAction(64, null);
                    anVar.g9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 28:
                tj tjVar = anVar.H8;
                if (tjVar != null && tjVar.getParent() != null) {
                    anVar.z0.g1();
                    anVar.J8.setDrawingReady(false);
                    anVar.H8.setTag(null);
                    anVar.l1.removeView(anVar.H8);
                    break;
                }
                break;
            default:
                anVar.v8(false, true, 0.0f);
                break;
        }
    }
}
