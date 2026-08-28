package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.xn, MessagesStorage.BooleanCallback, org.telegram.ui.Components.bj0, ResultCallback, eh.d, rg.a, rg.b, f60, hs, org.telegram.ui.Components.ok0, rg.d, org.telegram.ui.Components.ck0, FlagSecureReason.FlagSecureCondition, ku0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ oe(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        qn qnVar = this.b;
        boolean z10 = false;
        if (qnVar.getParentActivity() != null) {
            of.f1 adapter = qnVar.E1.getAdapter();
            if ((adapter.E != null || adapter.F != null) && i9 != 0) {
                of.f1 adapter2 = qnVar.E1.getAdapter();
                if (adapter2.s0 != null && !adapter2.d0) {
                    return false;
                }
                Object J = qnVar.E1.getAdapter().J(i9 - 1);
                if (J instanceof of.c1) {
                    of.c1 c1Var = (of.c1) J;
                    if (qnVar.E1.getAdapter().F != null && org.telegram.ui.Components.m41.h) {
                        qnVar.U.setFieldText("");
                        ak akVar = qnVar.U;
                        String str = c1Var.a;
                        TLRPC.Chat chat = qnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        akVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (qnVar.E1.getAdapter().F == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.aa);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new oe(qnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.m41.h) {
                        qnVar.U.setFieldText("");
                        ak akVar2 = qnVar.U;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = qnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        akVar2.a1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ck0
    public void b() {
        qn qnVar = this.b;
        qnVar.q9(1);
        qnVar.r9();
    }

    @Override // org.telegram.ui.hs
    public void c() {
        qn qnVar = this.b;
        if (qnVar.u3 != null || qnVar.getParentActivity() == null) {
            return;
        }
        qnVar.Q7();
        qnVar.u3.m(qnVar.P5, qnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.xn
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                qn.t0(this.b, document);
                break;
            default:
                qn.u0(this.b, document);
                break;
        }
    }

    @Override // eh.d
    public void e(boolean z10, boolean z11) {
        qn qnVar = this.b;
        qnVar.I0.i(qnVar.ba.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                hk hkVar = this.b.x0;
                if (hkVar != null) {
                    hkVar.callOnClick();
                    break;
                }
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                qn qnVar = this.b;
                MessageObject messageObject = (MessageObject) qnVar.F4.get(Integer.valueOf(qnVar.H4));
                if (messageObject == null) {
                    messageObject = (MessageObject) qnVar.k6[0].get(qnVar.H4);
                }
                qnVar.cc(messageObject);
                break;
            case 4:
                qn qnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = qnVar2.b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, qnVar2.P5);
                }
                qnVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                qn qnVar3 = this.b;
                qnVar3.getMessagesController().unblockPeer(qnVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                of.f1 adapter = this.b.E1.getAdapter();
                adapter.w.c();
                adapter.E.clear();
                adapter.l();
                org.telegram.ui.Components.r90 r90Var = adapter.R;
                if (r90Var != null) {
                    r90Var.a(false);
                    break;
                }
                break;
            case 12:
                qn qnVar4 = this.b;
                qnVar4.showDialog(new ll(qnVar4, qnVar4.getParentActivity(), qnVar4));
                break;
            case 13:
                qn qnVar5 = this.b;
                qnVar5.Q7();
                UndoView undoView = qnVar5.u3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                qn qnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = qnVar6.b5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    qnVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bj0
    public void g(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                qn qnVar = this.b;
                if (qnVar.getParentActivity() != null && qnVar.getParentActivity() != null) {
                    xh xhVar = new xh(qnVar, qnVar, qnVar.getParentActivity(), qnVar.aa, arrayList);
                    xhVar.setCalcMandatoryInsets(qnVar.x9());
                    xhVar.setDimBehind(false);
                    qnVar.A7(false);
                    qnVar.showDialog(xhVar);
                    break;
                }
                break;
            default:
                qn qnVar2 = this.b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    ui uiVar = new ui(qnVar2, qnVar2, qnVar2.getParentActivity(), qnVar2.aa, arrayList);
                    uiVar.setCalcMandatoryInsets(qnVar2.x9());
                    uiVar.setDimBehind(false);
                    qnVar2.A7(false);
                    qnVar2.showDialog(uiVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ku0
    public void h(float[] fArr) {
        qn qnVar = this.b;
        fArr[1] = qnVar.t0.getBottom() - qnVar.wa;
        fArr[0] = (qnVar.t0.getTop() + qnVar.o9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.f60
    public void j(int i9, ArrayList arrayList) {
        qn qnVar = this.b;
        qnVar.getMessagesController().addUsersToChat(qnVar.e, qnVar, arrayList, i9, null, null, null);
        qnVar.getMessagesController().hidePeerSettingsBar(qnVar.P5, qnVar.f, qnVar.e);
        qnVar.Qc(true);
        qnVar.oc(true);
    }

    @Override // rg.a
    public void k(int i9) {
        qn qnVar = this.b;
        if (i9 == 1) {
            qnVar.U9();
            return;
        }
        if (i9 == 2) {
            qnVar.H9();
            return;
        }
        if (i9 == 3) {
            qnVar.z4 = true;
            qnVar.getMessagesController().getNextReactionMention(qnVar.P5, qnVar.b(), qnVar.h1, new fg(qnVar, 0));
            return;
        }
        if (i9 == 4) {
            qnVar.z4 = true;
            qnVar.getMessagesController().getNextPollVotesMention(qnVar.P5, qnVar.b(), qnVar.i1, new fg(qnVar, 1));
            return;
        }
        if (i9 == 6) {
            qnVar.Y8(true);
            return;
        }
        if (i9 == 5) {
            qnVar.Y8(false);
        } else if (i9 == 0) {
            ih.u2 u2Var = qnVar.F1;
            if (u2Var != null) {
                u2Var.I1(null, 0);
            }
            qnVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        qn qnVar = this.b;
        on onVar = qnVar.aa;
        onVar.i(b4Var, onVar.h, qnVar.L5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        qn qnVar = this.b;
        NotificationCenter notificationCenter = qnVar.getNotificationCenter();
        int i9 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(qnVar, i9);
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
        qnVar.finishFragment();
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qnVar.P5), qnVar.f, qnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        qn qnVar = this.b;
        return qnVar.h != null || qnVar.y9();
    }

    @Override // org.telegram.ui.f60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
