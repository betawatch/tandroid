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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ jg(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kh.x3 x3Var;
        int i9 = this.a;
        qn qnVar = this.b;
        switch (i9) {
            case 0:
                AndroidUtilities.removeFromParent(qnVar.F0);
                break;
            case 1:
                ArrayList arrayList = qnVar.q6;
                qnVar.Db = System.currentTimeMillis();
                if (qnVar.t0 != null && qnVar.w0 != null) {
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i11 = TLObject.FLAG_31;
                    for (int i12 = 0; i12 < qnVar.t0.getChildCount(); i12++) {
                        View childAt = qnVar.t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var.getCurrentMessagesGroup() != null) {
                                for (int i13 = 0; i13 < t1Var.getCurrentMessagesGroup().messages.size(); i13++) {
                                    int id2 = t1Var.getCurrentMessagesGroup().messages.get(i13).getId();
                                    i10 = Math.min(i10, id2);
                                    i11 = Math.max(i11, id2);
                                }
                            } else if (t1Var.getMessageObject() != null) {
                                int id3 = t1Var.getMessageObject().getId();
                                i10 = Math.min(i10, id3);
                                i11 = Math.max(i11, id3);
                            }
                        }
                    }
                    if (i10 <= i11) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i14);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) qnVar.t6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i10 + (-7) && id4 <= i11 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i15);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i10 + (-7) && id5 <= i11 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (qnVar.H4 > 0 && qnVar.F4 != null) {
                    qnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) qnVar.F4.get(Integer.valueOf(qnVar.H4)), true);
                }
                qnVar.Uc();
                break;
            case 2:
                ak akVar = qnVar.U;
                if (akVar != null && qnVar.yc != null) {
                    if (akVar.s0()) {
                        qnVar.U.l0(false);
                        AndroidUtilities.showKeyboard(qnVar.yc.a);
                        qnVar.yc.b.a.a(false, true);
                        break;
                    } else {
                        qnVar.U.V0(false, false, false);
                        qnVar.U.s1();
                        qnVar.yc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                qnVar.ta();
                break;
            case 4:
                qnVar.g8(false, true, 0.0f);
                break;
            case 5:
                qnVar.S9();
                break;
            case 6:
                qnVar.c9();
                qnVar.yc(0, true);
                break;
            case 7:
                qnVar.g8(false, true, 0.0f);
                break;
            case 8:
                qnVar.q9(2);
                break;
            case 9:
                qnVar.g8(false, true, 0.0f);
                break;
            case 10:
                qn.W(qnVar);
                break;
            case 11:
                qnVar.g8(false, true, 0.0f);
                break;
            case 12:
                qnVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, qnVar.aa);
                qnVar.lb = c2Var;
                c2Var.setOnShowListener(new ef(qnVar, 1));
                qnVar.lb.setOnCancelListener(qnVar.ia);
                qnVar.lb.q(500L);
                break;
            case 14:
                qnVar.N6();
                break;
            case 15:
                qnVar.a = (qnVar.a + 1) % 3;
                break;
            case 16:
                qnVar.b = !qnVar.b;
                break;
            case 17:
                qnVar.A7(true);
                org.telegram.messenger.l0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.oc.a0(qnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                qnVar.w0.I.clear();
                bm bmVar = qnVar.w0;
                bmVar.H = false;
                bmVar.O(true);
                qnVar.Pb(false);
                break;
            case 19:
                qnVar.o9();
                qnVar.r9();
                qnVar.r7();
                qnVar.t7();
                break;
            case 20:
                qnVar.ec = 0;
                qnVar.fc = false;
                qnVar.t0.f1();
                break;
            case 21:
                qnVar.q9(5);
                break;
            case 22:
                qnVar.yc(0, qnVar.L5 != 0 && SystemClock.elapsedRealtime() >= qnVar.L5 + 150);
                break;
            case 23:
                ek ekVar = qnVar.N2;
                if ((ekVar == null || ekVar.getVisibility() != 0) && (x3Var = qnVar.s1) != null) {
                    x3Var.v();
                    break;
                }
                break;
            case 24:
                qnVar.k7();
                break;
            case 25:
                qnVar.q9(5);
                break;
            case 26:
                qnVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e10 = g7.e6.e(-1, -2, 87);
                e10.bottomMargin = qnVar.U.getMeasuredHeight();
                qnVar.T0.addView(qnVar.u1, e10);
                qnVar.u1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                qnVar.u1.n(0.0f, qnVar.U.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                qnVar.u1.v();
                break;
            case 28:
                int i16 = qn.Dc;
                qnVar.Z6();
                break;
            default:
                int i17 = qn.Dc;
                qnVar.Z6();
                break;
        }
    }
}
