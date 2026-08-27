package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ lg(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.w3 w3Var;
        int i10 = this.a;
        rn rnVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(rnVar.F0);
                break;
            case 1:
                ArrayList arrayList = rnVar.q6;
                rnVar.Db = System.currentTimeMillis();
                if (rnVar.t0 != null && rnVar.w0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < rnVar.t0.getChildCount(); i13++) {
                        View childAt = rnVar.t0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < s1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = s1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (s1Var.getMessageObject() != null) {
                                int id3 = s1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) rnVar.t6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                rnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        rnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (rnVar.H4 > 0 && rnVar.F4 != null) {
                    rnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) rnVar.F4.get(Integer.valueOf(rnVar.H4)), true);
                }
                rnVar.Uc();
                break;
            case 2:
                ck ckVar = rnVar.U;
                if (ckVar != null && rnVar.yc != null) {
                    if (ckVar.t0()) {
                        rnVar.U.m0(false);
                        AndroidUtilities.showKeyboard(rnVar.yc.a);
                        rnVar.yc.b.a.a(false, true);
                        break;
                    } else {
                        rnVar.U.U0(false, false, false);
                        rnVar.U.r1();
                        rnVar.yc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                rnVar.ta();
                break;
            case 4:
                rnVar.g8(false, true, 0.0f);
                break;
            case 5:
                rnVar.S9();
                break;
            case 6:
                rnVar.c9();
                rnVar.yc(0, true);
                break;
            case 7:
                rnVar.g8(false, true, 0.0f);
                break;
            case 8:
                rnVar.q9(2);
                break;
            case 9:
                rnVar.g8(false, true, 0.0f);
                break;
            case 10:
                rn.X(rnVar);
                break;
            case 11:
                rnVar.g8(false, true, 0.0f);
                break;
            case 12:
                rnVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, rnVar.aa);
                rnVar.lb = b2Var;
                b2Var.setOnShowListener(new ef(rnVar, 1));
                rnVar.lb.setOnCancelListener(rnVar.ia);
                rnVar.lb.q(500L);
                break;
            case 14:
                rnVar.N6();
                break;
            case 15:
                rnVar.a = (rnVar.a + 1) % 3;
                break;
            case 16:
                rnVar.b = !rnVar.b;
                break;
            case 17:
                rnVar.A7(true);
                org.telegram.messenger.y1.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.mc.a0(rnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                rnVar.w0.I.clear();
                dm dmVar = rnVar.w0;
                dmVar.H = false;
                dmVar.O(true);
                rnVar.Pb(false);
                break;
            case 19:
                rnVar.o9();
                rnVar.r9();
                rnVar.r7();
                rnVar.t7();
                break;
            case 20:
                rnVar.ec = 0;
                rnVar.fc = false;
                rnVar.t0.f1();
                break;
            case 21:
                rnVar.q9(5);
                break;
            case 22:
                rnVar.yc(0, rnVar.L5 != 0 && SystemClock.elapsedRealtime() >= rnVar.L5 + 150);
                break;
            case 23:
                gk gkVar = rnVar.N2;
                if ((gkVar == null || gkVar.getVisibility() != 0) && (w3Var = rnVar.s1) != null) {
                    w3Var.v();
                    break;
                }
                break;
            case 24:
                rnVar.k7();
                break;
            case 25:
                rnVar.q9(5);
                break;
            case 26:
                rnVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e9 = h7.z5.e(-1, -2, 87);
                e9.bottomMargin = rnVar.U.getMeasuredHeight();
                rnVar.T0.addView(rnVar.u1, e9);
                rnVar.u1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                rnVar.u1.n(0.0f, rnVar.U.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                rnVar.u1.v();
                break;
            case 28:
                int i17 = rn.Dc;
                rnVar.Z6();
                break;
            default:
                int i18 = rn.Dc;
                rnVar.Z6();
                break;
        }
    }
}
