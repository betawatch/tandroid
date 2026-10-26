package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ jg(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View sendButton;
        fi.v3 v3Var;
        int i10 = this.a;
        int i11 = 0;
        un unVar = this.b;
        switch (i10) {
            case 0:
                unVar.C7 = null;
                org.telegram.ui.Components.t60 t60Var = unVar.n3;
                if (t60Var != null) {
                    org.telegram.ui.Components.q60 cameraContainer = t60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q60, Float>) property, 0.0f), ObjectAnimator.ofFloat(unVar.n3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(unVar.n3.getPaint(), org.telegram.ui.Components.v6.b, 0), ObjectAnimator.ofFloat(unVar.n3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new pi(unVar, i11));
                    animatorSet.start();
                    break;
                }
                break;
            case 1:
                unVar.n8(false, true, 0.0f);
                break;
            case 2:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && unVar.Y != null && unVar.Ra == null && unVar.getMessagesController().getSendPaidMessagesStars(unVar.a()) <= 0 && (sendButton = unVar.Y.getSendButton()) != null && unVar.Y.getEditField() != null && unVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (unVar.u2 == null) {
                        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(4, unVar.getParentActivity(), unVar.qa, false);
                        unVar.u2 = t40Var;
                        t40Var.a();
                        unVar.u2.setAlpha(0.0f);
                        unVar.u2.setVisibility(4);
                        unVar.u2.setText(LocaleController.getString(R.string.ScheduledHint));
                        unVar.j1.addView(unVar.u2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.u2.f(sendButton, true);
                    unVar.v2 = true;
                    break;
                }
                break;
            case 3:
                unVar.S5 = null;
                unVar.q8();
                break;
            case 4:
                unVar.S5 = null;
                unVar.q8();
                break;
            case 5:
                ArrayList arrayList = unVar.G6;
                unVar.dc = System.currentTimeMillis();
                if (unVar.x0 != null && unVar.A0 != null) {
                    int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i13 = TLObject.FLAG_31;
                    for (int i14 = 0; i14 < unVar.x0.getChildCount(); i14++) {
                        View childAt = unVar.x0.getChildAt(i14);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) unVar.J6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                unVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i12 + (-7) && id4 <= i13 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i17 = 0; i17 < groupedMessages.messages.size(); i17++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i17);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        unVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i12 + (-7) && id5 <= i13 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (unVar.X4 > 0 && unVar.V4 != null) {
                    unVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) unVar.V4.get(Integer.valueOf(unVar.X4)), true);
                }
                unVar.hd();
                break;
            case 6:
                unVar.A0.M.clear();
                fm fmVar = unVar.A0;
                fmVar.L = false;
                fmVar.O(true);
                unVar.bc(false);
                break;
            case 7:
                hk hkVar = unVar.Y;
                if (hkVar != null && unVar.Zc != null) {
                    if (hkVar.q0()) {
                        unVar.Y.j0(false);
                        AndroidUtilities.showKeyboard(unVar.Zc.a);
                        unVar.Zc.b.a.a(false, true);
                        break;
                    } else {
                        unVar.Y.S0(false, false, false);
                        unVar.Y.p1();
                        unVar.Zc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 8:
                unVar.ca();
                break;
            case 9:
                unVar.Ca();
                break;
            case 10:
                unVar.m9();
                unVar.Lc(0, true);
                break;
            case 11:
                unVar.n8(false, true, 0.0f);
                break;
            case 12:
                unVar.n8(false, true, 0.0f);
                break;
            case 13:
                un.s1(unVar);
                break;
            case 14:
                unVar.n8(false, true, 0.0f);
                break;
            case 15:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(unVar.getParentActivity(), 3, unVar.qa);
                unVar.Lb = e2Var;
                e2Var.setOnShowListener(new hf(unVar, 1));
                unVar.Lb.setOnCancelListener(unVar.ya);
                unVar.Lb.r(500L);
                break;
            case 16:
                AndroidUtilities.removeFromParent(unVar.X0);
                break;
            case 17:
                unVar.H7(true);
                org.telegram.messenger.t.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.wc.b0(unVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                unVar.U6();
                break;
            case 19:
                unVar.a = (unVar.a + 1) % 3;
                break;
            case 20:
                unVar.b = !unVar.b;
                break;
            case 21:
                unVar.A0.M.clear();
                fm fmVar2 = unVar.A0;
                fmVar2.L = false;
                fmVar2.O(true);
                unVar.bc(false);
                break;
            case 22:
                unVar.Ka = false;
                unVar.Hc();
                break;
            case 23:
                unVar.Ec = 0;
                unVar.Fc = false;
                unVar.x0.g1();
                break;
            case 24:
                unVar.x9();
                unVar.z9();
                unVar.y7();
                unVar.A7();
                break;
            case 25:
                unVar.Lc(0, unVar.b6 != 0 && SystemClock.elapsedRealtime() >= unVar.b6 + 150);
                break;
            case 26:
                kk kkVar = unVar.d3;
                if ((kkVar == null || kkVar.getVisibility() != 0) && (v3Var = unVar.I1) != null) {
                    v3Var.u();
                    break;
                }
                break;
            case 27:
                unVar.r7();
                break;
            case 28:
                unVar.h7(false);
                break;
            default:
                FrameLayout.LayoutParams i18 = org.telegram.ui.Components.gb1.i(-1, -2, 87);
                i18.bottomMargin = unVar.Y.getMeasuredHeight();
                unVar.j1.addView(unVar.K1, i18);
                unVar.K1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                unVar.K1.m(0.0f, unVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                unVar.K1.u();
                break;
        }
    }
}
