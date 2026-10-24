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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ kg(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ei.x3 x3Var;
        int i10 = this.a;
        sn snVar = this.b;
        switch (i10) {
            case 0:
                gk gkVar = snVar.Y;
                if (gkVar != null && snVar.Qc != null) {
                    if (gkVar.q0()) {
                        snVar.Y.j0(false);
                        AndroidUtilities.showKeyboard(snVar.Qc.a);
                        snVar.Qc.b.a.a(false, true);
                        break;
                    } else {
                        snVar.Y.S0(false, false, false);
                        snVar.Y.p1();
                        snVar.Qc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 1:
                snVar.xa();
                break;
            case 2:
                ArrayList arrayList = snVar.G6;
                snVar.Ub = System.currentTimeMillis();
                if (snVar.x0 != null && snVar.A0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < snVar.x0.getChildCount(); i13++) {
                        View childAt = snVar.x0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var.getCurrentMessagesGroup() != null) {
                                for (int i14 = 0; i14 < t1Var.getCurrentMessagesGroup().messages.size(); i14++) {
                                    int id2 = t1Var.getCurrentMessagesGroup().messages.get(i14).getId();
                                    i11 = Math.min(i11, id2);
                                    i12 = Math.max(i12, id2);
                                }
                            } else if (t1Var.getMessageObject() != null) {
                                int id3 = t1Var.getMessageObject().getId();
                                i11 = Math.min(i11, id3);
                                i12 = Math.max(i12, id3);
                            }
                        }
                    }
                    if (i11 <= i12) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            MessageObject messageObject = (MessageObject) arrayList.get(i15);
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) snVar.J6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                snVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        snVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (snVar.X4 > 0 && snVar.V4 != null) {
                    snVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) snVar.V4.get(Integer.valueOf(snVar.X4)), true);
                }
                snVar.bd();
                break;
            case 3:
                AndroidUtilities.removeFromParent(snVar.V0);
                break;
            case 4:
                snVar.h9();
                snVar.Fc(0, true);
                break;
            case 5:
                snVar.j8(false, true, 0.0f);
                break;
            case 6:
                snVar.oc(false);
                break;
            case 7:
                snVar.X9();
                break;
            case 8:
                snVar.j8(false, true, 0.0f);
                break;
            case 9:
                snVar.v9(2);
                break;
            case 10:
                sn.x0(snVar);
                break;
            case 11:
                snVar.j8(false, true, 0.0f);
                break;
            case 12:
                AndroidUtilities.removeFromParent(snVar.X0);
                break;
            case 13:
                snVar.j8(false, true, 0.0f);
                break;
            case 14:
                snVar.Q6();
                break;
            case 15:
                snVar.a = (snVar.a + 1) % 3;
                break;
            case 16:
                snVar.b = !snVar.b;
                break;
            case 17:
                snVar.D7(true);
                org.telegram.messenger.v0.p(R.string.TranscriptionReportSent, org.telegram.ui.Components.xc.a0(snVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                snVar.A0.M.clear();
                em emVar = snVar.A0;
                emVar.L = false;
                emVar.O(true);
                snVar.Vb(false);
                break;
            case 19:
                snVar.t9();
                snVar.w9();
                snVar.u7();
                snVar.w7();
                break;
            case 20:
                snVar.Ka = false;
                snVar.Bc();
                break;
            case 21:
                snVar.vc = 0;
                snVar.wc = false;
                snVar.x0.g1();
                break;
            case 22:
                snVar.v9(5);
                break;
            case 23:
                snVar.Fc(0, snVar.b6 != 0 && SystemClock.elapsedRealtime() >= snVar.b6 + 150);
                break;
            case 24:
                jk jkVar = snVar.d3;
                if ((jkVar == null || jkVar.getVisibility() != 0) && (x3Var = snVar.I1) != null) {
                    x3Var.u();
                    break;
                }
                break;
            case 25:
                snVar.n7();
                break;
            case 26:
                snVar.v9(5);
                break;
            case 27:
                snVar.d7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 87);
                e.bottomMargin = snVar.Y.getMeasuredHeight();
                snVar.j1.addView(snVar.K1, e);
                snVar.K1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                snVar.K1.m(0.0f, snVar.Y.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                snVar.K1.u();
                break;
            default:
                int i17 = sn.Vc;
                snVar.c7();
                break;
        }
    }
}
