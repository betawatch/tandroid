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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ ig(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nh.t3 t3Var;
        int i10 = this.a;
        tn tnVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(tnVar.F0);
                break;
            case 1:
                ArrayList arrayList = tnVar.q6;
                tnVar.Db = System.currentTimeMillis();
                if (tnVar.t0 != null && tnVar.w0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < tnVar.t0.getChildCount(); i13++) {
                        View childAt = tnVar.t0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) tnVar.t6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                tnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        tnVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (tnVar.H4 > 0 && tnVar.F4 != null) {
                    tnVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) tnVar.F4.get(Integer.valueOf(tnVar.H4)), true);
                }
                tnVar.Uc();
                break;
            case 2:
                dk dkVar = tnVar.U;
                if (dkVar != null && tnVar.yc != null) {
                    if (dkVar.t0()) {
                        tnVar.U.m0(false);
                        AndroidUtilities.showKeyboard(tnVar.yc.a);
                        tnVar.yc.b.a.a(false, true);
                        break;
                    } else {
                        tnVar.U.V0(false, false, false);
                        tnVar.U.s1();
                        tnVar.yc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                tnVar.ta();
                break;
            case 4:
                tnVar.g8(false, true, 0.0f);
                break;
            case 5:
                tnVar.S9();
                break;
            case 6:
                tnVar.c9();
                tnVar.yc(0, true);
                break;
            case 7:
                tnVar.g8(false, true, 0.0f);
                break;
            case 8:
                tnVar.q9(2);
                break;
            case 9:
                tnVar.g8(false, true, 0.0f);
                break;
            case 10:
                tn.X(tnVar);
                break;
            case 11:
                tnVar.g8(false, true, 0.0f);
                break;
            case 12:
                tnVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, tnVar.aa);
                tnVar.lb = c2Var;
                c2Var.setOnShowListener(new bf(tnVar, 1));
                tnVar.lb.setOnCancelListener(tnVar.ia);
                tnVar.lb.q(500L);
                break;
            case 14:
                tnVar.N6();
                break;
            case 15:
                tnVar.a = (tnVar.a + 1) % 3;
                break;
            case 16:
                tnVar.b = !tnVar.b;
                break;
            case 17:
                tnVar.A7(true);
                j7.l1.v(R.string.TranscriptionReportSent, org.telegram.ui.Components.tc.a0(tnVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                tnVar.w0.I.clear();
                em emVar = tnVar.w0;
                emVar.H = false;
                emVar.O(true);
                tnVar.Pb(false);
                break;
            case 19:
                tnVar.o9();
                tnVar.r9();
                tnVar.r7();
                tnVar.t7();
                break;
            case 20:
                tnVar.ec = 0;
                tnVar.fc = false;
                tnVar.t0.f1();
                break;
            case 21:
                tnVar.q9(5);
                break;
            case 22:
                tnVar.yc(0, tnVar.L5 != 0 && SystemClock.elapsedRealtime() >= tnVar.L5 + 150);
                break;
            case 23:
                hk hkVar = tnVar.N2;
                if ((hkVar == null || hkVar.getVisibility() != 0) && (t3Var = tnVar.s1) != null) {
                    t3Var.v();
                    break;
                }
                break;
            case 24:
                tnVar.k7();
                break;
            case 25:
                tnVar.q9(5);
                break;
            case 26:
                tnVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e10 = i7.f6.e(-1, -2, 87);
                e10.bottomMargin = tnVar.U.getMeasuredHeight();
                tnVar.T0.addView(tnVar.u1, e10);
                tnVar.u1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                tnVar.u1.n(0.0f, tnVar.U.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                tnVar.u1.v();
                break;
            case 28:
                int i17 = tn.Dc;
                tnVar.Z6();
                break;
            default:
                int i18 = tn.Dc;
                tnVar.Z6();
                break;
        }
    }
}
