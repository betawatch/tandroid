package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ nf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mk mkVar;
        View sendButton;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        un unVar = this.b;
        switch (i10) {
            case 0:
                unVar.M7(true);
                break;
            case 1:
                unVar.Tc();
                break;
            case 2:
                unVar.M7(false);
                kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 24, true);
                i1Var.o0 = false;
                i1Var.H0 = new qe(unVar, i11);
                i1Var.show();
                break;
            case 3:
                un.x0(unVar);
                break;
            case 4:
                if (unVar.getUserConfig().q()) {
                    unVar.ic = null;
                    unVar.qd(true);
                    org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                    unVar.getMessagesController().o0(true);
                    break;
                } else {
                    unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 3, true));
                    break;
                }
            case 5:
                mk mkVar2 = unVar.Z;
                if (mkVar2 != null) {
                    mkVar2.m0(true);
                    break;
                }
                break;
            case 6:
                org.telegram.messenger.i0.E2(unVar.Y0);
                break;
            case 7:
                un.z0(unVar);
                break;
            case 8:
                unVar.resumeDelayedFragmentAnimation();
                ci ciVar = unVar.pa;
                org.telegram.messenger.i0.r(ciVar);
                ciVar.run();
                unVar.getNotificationCenter().o();
                break;
            case 9:
                unVar.Ja = null;
                unVar.Ia = -1;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = unVar.K6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TLRPC.Message message = ((org.telegram.messenger.kj) arrayList.get(i13)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                unVar.B6 = 0;
                unVar.getMessagesController().l3(unVar.j6, unVar.b());
                unVar.C6 = true;
                unVar.ic(false);
                org.telegram.ui.ActionBar.k1 k1Var = unVar.e9;
                if (k1Var != null) {
                    k1Var.dismiss();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList2 = unVar.K6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((org.telegram.messenger.kj) arrayList2.get(i14)).h5();
                }
                unVar.z1 = 0;
                unVar.ad(true);
                unVar.getMessagesController().q3(unVar.j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var2 = unVar.e9;
                if (k1Var2 != null) {
                    k1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                ArrayList arrayList3 = unVar.K6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.kj) arrayList3.get(i15)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                unVar.A1 = 0;
                unVar.Zc(true);
                unVar.getMessagesController().p3(unVar.j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var3 = unVar.e9;
                if (k1Var3 != null) {
                    k1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                un.B1(unVar);
                break;
            case 14:
                unVar.Z.F0();
                break;
            case 15:
                unVar.zc(true);
                unVar.pd(true);
                org.telegram.ui.Components.cc.z(unVar, 4, 0, unVar.xa).j();
                break;
            case 16:
                org.telegram.ui.Components.cc.a0(unVar).I(R.raw.chats_infotip, org.telegram.messenger.dd.L0(2131753290, null), org.telegram.messenger.dd.L0(2131753291, null)).j();
                break;
            case 17:
                unVar.finishFragment();
                break;
            case 18:
                org.telegram.messenger.i0.E2(unVar.X0);
                break;
            case 19:
                unVar.O4 = null;
                unVar.F9();
                unVar.H9();
                break;
            case 20:
                unVar.H9 = false;
                unVar.w9(true);
                break;
            case 21:
                unVar.W5 = null;
                unVar.w8();
                break;
            case 22:
                unVar.W5 = null;
                unVar.w8();
                break;
            case 23:
                unVar.e7();
                break;
            case 24:
                unVar.G7 = null;
                org.telegram.ui.Components.j50 j50Var = unVar.p3;
                if (j50Var != null) {
                    org.telegram.ui.Components.g50 cameraContainer = j50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.g50, Float>) property, 0.0f), ObjectAnimator.ofFloat(unVar.p3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(unVar.p3.getPaint(), org.telegram.ui.Components.i6.b, 0), ObjectAnimator.ofFloat(unVar.p3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new bi(unVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 25:
                pk pkVar = unVar.H8;
                if (pkVar != null && pkVar.getParent() != null) {
                    unVar.z0.g1();
                    unVar.J8.setDrawingReady(false);
                    unVar.H8.setTag(null);
                    unVar.l1.removeView(unVar.H8);
                    break;
                }
                break;
            case 26:
                unVar.Gc(false);
                break;
            case 27:
                unVar.s8(false, true, 0.0f);
                break;
            case 28:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && (mkVar = unVar.Z) != null && (sendButton = mkVar.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() >= 5) {
                    int i16 = org.telegram.messenger.uz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    org.telegram.messenger.uz.L = System.currentTimeMillis();
                    int i17 = org.telegram.messenger.uz.K + 1;
                    org.telegram.messenger.uz.K = i17;
                    edit.putInt("scheduledOrNoSoundHintShows", i17);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.uz.L);
                    edit.apply();
                    if (unVar.u2 == null) {
                        ij ijVar = new ij(4, 0, unVar.getParentActivity(), unVar.xa, false);
                        unVar.u2 = ijVar;
                        ijVar.a();
                        unVar.u2.setAlpha(0.0f);
                        unVar.u2.setVisibility(4);
                        unVar.u2.setText(org.telegram.messenger.dd.L0(2131745864, null));
                        unVar.l1.addView(unVar.u2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.u2.f(sendButton, true);
                    unVar.v2 = true;
                    break;
                }
                break;
            default:
                mk mkVar3 = unVar.Z;
                if (mkVar3 != null && unVar.Zc != null) {
                    if (mkVar3.q0()) {
                        unVar.Z.i0(false);
                        org.telegram.messenger.i0.J3(unVar.Zc.a);
                        ((fe.b) unVar.Zc.b.b).a(false, true);
                        break;
                    } else {
                        unVar.Z.T0(false, false, false);
                        unVar.Z.q1();
                        ((fe.b) unVar.Zc.b.b).a(true, true);
                        break;
                    }
                }
                break;
        }
    }
}
