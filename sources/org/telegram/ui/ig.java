package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ig(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk jkVar;
        View sendButton;
        View sendButton2;
        org.telegram.ui.ActionBar.g1 g1Var;
        fi.v3 v3Var;
        int i10 = this.a;
        int i11 = 0;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                wnVar.G7 = null;
                org.telegram.ui.Components.u60 u60Var = wnVar.n3;
                if (u60Var != null) {
                    org.telegram.ui.Components.r60 cameraContainer = u60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r60, Float>) property, 0.0f), ObjectAnimator.ofFloat(wnVar.n3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(wnVar.n3.getPaint(), org.telegram.ui.Components.v6.b, 0), ObjectAnimator.ofFloat(wnVar.n3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new si(wnVar, i11));
                    animatorSet.start();
                    break;
                }
                break;
            case 1:
                wnVar.A0.M.clear();
                hm hmVar = wnVar.A0;
                hmVar.L = false;
                hmVar.O(true);
                wnVar.fc(false);
                break;
            case 2:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && (jkVar = wnVar.Y) != null && (sendButton = jkVar.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (wnVar.s2 == null) {
                        ej ejVar = new ej(4, 0, wnVar.getParentActivity(), wnVar.ua, false);
                        wnVar.s2 = ejVar;
                        ejVar.a();
                        wnVar.s2.setAlpha(0.0f);
                        wnVar.s2.setVisibility(4);
                        wnVar.s2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        wnVar.j1.addView(wnVar.s2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.s2.f(sendButton, true);
                    wnVar.t2 = true;
                    break;
                }
                break;
            case 3:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null && wnVar.dd != null) {
                    if (jkVar2.p0()) {
                        wnVar.Y.i0(false);
                        AndroidUtilities.showKeyboard(wnVar.dd.a);
                        wnVar.dd.b.a.a(false, true);
                        break;
                    } else {
                        wnVar.Y.R0(false, false, false);
                        wnVar.Y.o1();
                        wnVar.dd.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 4:
                wnVar.Fa();
                break;
            case 5:
                wnVar.p9();
                wnVar.Pc(0, true);
                break;
            case 6:
                wnVar.p8(false, true, 0.0f);
                break;
            case 7:
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && wnVar.Y != null && wnVar.Va == null && wnVar.getMessagesController().getSendPaidMessagesStars(wnVar.a()) <= 0 && (sendButton2 = wnVar.Y.getSendButton()) != null && wnVar.Y.getEditField() != null && wnVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (wnVar.u2 == null) {
                        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(4, wnVar.getParentActivity(), wnVar.ua, false);
                        wnVar.u2 = t40Var;
                        t40Var.a();
                        wnVar.u2.setAlpha(0.0f);
                        wnVar.u2.setVisibility(4);
                        wnVar.u2.setText(LocaleController.getString(R.string.ScheduledHint));
                        wnVar.j1.addView(wnVar.u2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    wnVar.u2.f(sendButton2, true);
                    wnVar.v2 = true;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.g1[] g1VarArr = wnVar.i9;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    wnVar.i9[0].performAccessibilityAction(64, null);
                    wnVar.i9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = wnVar.K6;
                wnVar.hc = System.currentTimeMillis();
                if (wnVar.x0 != null && wnVar.A0 != null) {
                    int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i13 = TLObject.FLAG_31;
                    for (int i14 = 0; i14 < wnVar.x0.getChildCount(); i14++) {
                        View childAt = wnVar.x0.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var.getCurrentMessagesGroup() != null) {
                                for (int i15 = 0; i15 < s1Var.getCurrentMessagesGroup().messages.size(); i15++) {
                                    int id2 = s1Var.getCurrentMessagesGroup().messages.get(i15).getId();
                                    i12 = Math.min(i12, id2);
                                    i13 = Math.max(i13, id2);
                                }
                            } else if (s1Var.getMessageObject() != null) {
                                int id3 = s1Var.getMessageObject().getId();
                                i12 = Math.min(i12, id3);
                                i13 = Math.max(i13, id3);
                            }
                        }
                    }
                    if (i12 <= i13) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i16);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) wnVar.N6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i12 + (-7) && id4 <= i13 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i17 = 0; i17 < groupedMessages.messages.size(); i17++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i17);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        wnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i12 + (-7) && id5 <= i13 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (wnVar.X4 > 0 && wnVar.V4 != null) {
                    wnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) wnVar.V4.get(Integer.valueOf(wnVar.X4)), true);
                }
                wnVar.ld();
                break;
            case 10:
                wnVar.p8(false, true, 0.0f);
                break;
            case 11:
                wnVar.fa();
                break;
            case 12:
                wn.T0(wnVar);
                break;
            case 13:
                wnVar.p8(false, true, 0.0f);
                break;
            case 14:
                wnVar.p8(false, true, 0.0f);
                break;
            case 15:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, wnVar.ua);
                wnVar.Pb = e2Var;
                e2Var.setOnShowListener(new gf(wnVar, 1));
                wnVar.Pb.setOnCancelListener(wnVar.Ca);
                wnVar.Pb.r(500L);
                break;
            case 16:
                wnVar.p8(false, true, 0.0f);
                break;
            case 17:
                AndroidUtilities.removeFromParent(wnVar.X0);
                break;
            case 18:
                wnVar.W6();
                break;
            case 19:
                wnVar.J7(true);
                org.telegram.messenger.t.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.wc.b0(wnVar), R.raw.chats_infotip, 36);
                break;
            case 20:
                wnVar.A0.M.clear();
                hm hmVar2 = wnVar.A0;
                hmVar2.L = false;
                hmVar2.O(true);
                wnVar.fc(false);
                break;
            case 21:
                wnVar.a = (wnVar.a + 1) % 3;
                break;
            case 22:
                wnVar.b = !wnVar.b;
                break;
            case 23:
                wnVar.Oa = false;
                wnVar.Lc();
                break;
            case 24:
                wnVar.Ic = 0;
                wnVar.Jc = false;
                wnVar.x0.g1();
                break;
            case 25:
                wnVar.A9();
                wnVar.C9();
                wnVar.A7();
                wnVar.C7();
                break;
            case 26:
                wnVar.Pc(0, wnVar.f6 != 0 && SystemClock.elapsedRealtime() >= wnVar.f6 + 150);
                break;
            case 27:
                mk mkVar = wnVar.d3;
                if ((mkVar == null || mkVar.getVisibility() != 0) && (v3Var = wnVar.I1) != null) {
                    v3Var.u();
                    break;
                }
                break;
            case 28:
                wnVar.t7();
                break;
            default:
                wnVar.j7(false);
                break;
        }
    }
}
