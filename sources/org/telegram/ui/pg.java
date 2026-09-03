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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ pg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph.f3 f3Var;
        int i10 = this.a;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.removeFromParent(znVar.G0);
                break;
            case 1:
                ArrayList arrayList = znVar.r6;
                znVar.Eb = System.currentTimeMillis();
                if (znVar.u0 != null && znVar.x0 != null) {
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i12 = TLObject.FLAG_31;
                    for (int i13 = 0; i13 < znVar.u0.getChildCount(); i13++) {
                        View childAt = znVar.u0.getChildAt(i13);
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
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) znVar.u6.f(messageObject.getGroupId());
                            if (groupedMessages == null) {
                                int id4 = messageObject.getId();
                                znVar.getMessagesController().getTranslateController().checkTranslation(messageObject, id4 >= i11 + (-7) && id4 <= i12 + 7);
                            } else if (!arrayList2.contains(Long.valueOf(groupedMessages.groupId))) {
                                for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                                    MessageObject messageObject2 = groupedMessages.messages.get(i16);
                                    if (messageObject2 != null) {
                                        int id5 = messageObject2.getId();
                                        znVar.getMessagesController().getTranslateController().checkTranslation(messageObject2, id5 >= i11 + (-7) && id5 <= i12 + 7);
                                    }
                                }
                                arrayList2.add(Long.valueOf(groupedMessages.groupId));
                            }
                        }
                    }
                }
                if (znVar.I4 > 0 && znVar.G4 != null) {
                    znVar.getMessagesController().getTranslateController().checkTranslation((MessageObject) znVar.G4.get(Integer.valueOf(znVar.I4)), true);
                }
                znVar.Uc();
                break;
            case 2:
                lk lkVar = znVar.V;
                if (lkVar != null && znVar.zc != null) {
                    if (lkVar.t0()) {
                        znVar.V.m0(false);
                        AndroidUtilities.showKeyboard(znVar.zc.a);
                        znVar.zc.b.a.a(false, true);
                        break;
                    } else {
                        znVar.V.V0(false, false, false);
                        znVar.V.s1();
                        znVar.zc.b.a.a(true, true);
                        break;
                    }
                }
                break;
            case 3:
                znVar.ta();
                break;
            case 4:
                znVar.g8(false, true, 0.0f);
                break;
            case 5:
                znVar.S9();
                break;
            case 6:
                znVar.c9();
                znVar.yc(0, true);
                break;
            case 7:
                znVar.g8(false, true, 0.0f);
                break;
            case 8:
                znVar.q9(2);
                break;
            case 9:
                znVar.g8(false, true, 0.0f);
                break;
            case 10:
                zn.X(znVar);
                break;
            case 11:
                znVar.g8(false, true, 0.0f);
                break;
            case 12:
                znVar.g8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(znVar.getParentActivity(), 3, znVar.ba);
                znVar.mb = d2Var;
                d2Var.setOnShowListener(new lf(znVar, 1));
                znVar.mb.setOnCancelListener(znVar.ja);
                znVar.mb.q(500L);
                break;
            case 14:
                znVar.N6();
                break;
            case 15:
                znVar.a = (znVar.a + 1) % 3;
                break;
            case 16:
                znVar.b = !znVar.b;
                break;
            case 17:
                znVar.A7(true);
                kf.k0.v(R.string.TranscriptionReportSent, org.telegram.ui.Components.qc.a0(znVar), R.raw.chats_infotip, 36);
                break;
            case 18:
                znVar.x0.J.clear();
                lm lmVar = znVar.x0;
                lmVar.I = false;
                lmVar.O(true);
                znVar.Pb(false);
                break;
            case 19:
                znVar.o9();
                znVar.r9();
                znVar.r7();
                znVar.t7();
                break;
            case 20:
                znVar.fc = 0;
                znVar.gc = false;
                znVar.u0.e1();
                break;
            case 21:
                znVar.q9(5);
                break;
            case 22:
                znVar.yc(0, znVar.M5 != 0 && SystemClock.elapsedRealtime() >= znVar.M5 + 150);
                break;
            case 23:
                pk pkVar = znVar.O2;
                if ((pkVar == null || pkVar.getVisibility() != 0) && (f3Var = znVar.t1) != null) {
                    f3Var.u();
                    break;
                }
                break;
            case 24:
                znVar.k7();
                break;
            case 25:
                znVar.q9(5);
                break;
            case 26:
                znVar.a7(false);
                break;
            case 27:
                FrameLayout.LayoutParams e = k7.b6.e(-1, -2, 87);
                e.bottomMargin = znVar.V.getMeasuredHeight();
                znVar.U0.addView(znVar.v1, e);
                znVar.v1.setTranslationY(-AndroidUtilities.navigationBarHeight);
                znVar.v1.m(0.0f, znVar.V.getEmojiButton().getX() + AndroidUtilities.dp(22.0f));
                znVar.v1.u();
                break;
            case 28:
                int i17 = zn.Ec;
                znVar.Z6();
                break;
            default:
                int i18 = zn.Ec;
                znVar.Z6();
                break;
        }
    }
}
