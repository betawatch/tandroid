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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ kg(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ei.x3 x3Var;
        int i10 = this.a;
        qn qnVar = this.b;
        switch (i10) {
            case 0:
                fk fkVar = qnVar.Y;
                if (fkVar != null && qnVar.Dc != null) {
                    if (fkVar.r0()) {
                        qnVar.Y.k0(false);
                        AndroidUtilities.showKeyboard(qnVar.Dc.a);
                        qnVar.Dc.b.a.a(false, true);
                        break;
                    } else {
                        qnVar.Y.S0(false, false, false);
                        qnVar.Y.p1();
                        qnVar.Dc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 1:
                ArrayList arrayList = qnVar.u6;
                qnVar.Hb = System.currentTimeMillis();
                if (qnVar.x0 != null && qnVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < qnVar.x0.getChildCount(); i13++) {
                        View childAt = qnVar.x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < u1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = u1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (u1Var.getMessageObject() != null) {
                                int id3 = u1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) qnVar.x6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (qnVar.L4 > 0 && qnVar.J4 != null) {
                    qnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) qnVar.J4.get(Integer.valueOf(qnVar.L4)), true);
                }
                qnVar.Zc();
                break;
            case 2:
                qnVar.xa();
                break;
            case 3:
                AndroidUtilities.removeFromParent(qnVar.J0);
                break;
            case 4:
                qnVar.h9();
                qnVar.Dc(0, true);
                break;
            case 5:
                qnVar.j8(false, true, 0.0f);
                break;
            case 6:
                qnVar.X9();
                break;
            case 7:
                qnVar.mc(false);
                break;
            case 8:
                qnVar.v9(2);
                break;
            case 9:
                qnVar.j8(false, true, 0.0f);
                break;
            case 10:
                qn.x0(qnVar);
                break;
            case 11:
                qnVar.j8(false, true, 0.0f);
                break;
            case 12:
                AndroidUtilities.removeFromParent(qnVar.L0);
                break;
            case 13:
                qnVar.j8(false, true, 0.0f);
                break;
            case 14:
                qnVar.Q6();
                break;
            case 15:
                qnVar.a = (qnVar.a + 1) % 3;
                break;
            case 16:
                qnVar.b = !qnVar.b;
                break;
            case 17:
                qnVar.D7(true);
                org.telegram.messenger.g0.q(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(qnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                qnVar.A0.M.clear();
                dm dmVar = qnVar.A0;
                dmVar.L = false;
                dmVar.O(true);
                qnVar.Ub(false);
                break;
            case 19:
                qnVar.t9();
                qnVar.w9();
                qnVar.u7();
                qnVar.w7();
                break;
            case 20:
                qnVar.ya = false;
                qnVar.zc();
                break;
            case 21:
                qnVar.ic = 0;
                qnVar.jc = false;
                qnVar.x0.f1();
                break;
            case 22:
                qnVar.v9(5);
                break;
            case 23:
                qnVar.Dc(0, qnVar.P5 != 0 && SystemClock.elapsedRealtime() >= qnVar.P5 + 150);
                break;
            case 24:
                ik ikVar = qnVar.R2;
                if ((ikVar == null || ikVar.getVisibility() != 0) && (x3Var = qnVar.w1) != null) {
                    x3Var.u();
                    break;
                }
                break;
            case 25:
                qnVar.n7();
                break;
            case 26:
                qnVar.v9(5);
                break;
            case 27:
                qnVar.d7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 87);
                e.bottomMargin = qnVar.Y.getMeasuredHeight();
                qnVar.X0.addView(qnVar.y1, e);
                qnVar.y1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                qnVar.y1.m(0.0f, qnVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                qnVar.y1.u();
                break;
            default:
                int i17 = qn.Ic;
                qnVar.c7();
                break;
        }
    }
}
