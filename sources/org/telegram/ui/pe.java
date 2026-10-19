package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements org.telegram.ui.Components.n60, org.telegram.ui.Components.q60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.so, MessagesStorage.BooleanCallback, org.telegram.ui.Components.jk0, ResultCallback, xh.c, kh.a, kh.b, g60, es, org.telegram.ui.Components.yl0, kh.d, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ pe(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        qn qnVar = this.b;
        boolean z10 = false;
        if (qnVar.getParentActivity() != null) {
            hg.j1 adapter = qnVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = qnVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = qnVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (qnVar.I1.getAdapter().J != null && org.telegram.ui.Components.h61.h) {
                        qnVar.Y.setFieldText("");
                        fk fkVar = qnVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = qnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        fkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (qnVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(qnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.h61.h) {
                        qnVar.Y.setFieldText("");
                        fk fkVar2 = qnVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = qnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        fkVar2.X0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public void b() {
        qn qnVar = this.b;
        qnVar.v9(1);
        qnVar.w9();
    }

    @Override // org.telegram.ui.es
    public void c() {
        qn qnVar = this.b;
        if (qnVar.y3 != null || qnVar.getParentActivity() == null) {
            return;
        }
        qnVar.T7();
        qnVar.y3.m(qnVar.T5, qnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.so
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                qn.j0(this.b, document);
                break;
            default:
                qn.D0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                qn qnVar = this.b;
                if (qnVar.getParentActivity() != null && qnVar.getParentActivity() != null) {
                    ai aiVar = new ai(qnVar, qnVar, qnVar.getParentActivity(), qnVar.ea, arrayList);
                    aiVar.setCalcMandatoryInsets(qnVar.C9());
                    aiVar.setDimBehind(false);
                    qnVar.D7(false);
                    qnVar.showDialog(aiVar);
                    break;
                }
                break;
            default:
                qn qnVar2 = this.b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    xi xiVar = new xi(qnVar2, qnVar2, qnVar2.getParentActivity(), qnVar2.ea, arrayList);
                    xiVar.setCalcMandatoryInsets(qnVar2.C9());
                    xiVar.setDimBehind(false);
                    qnVar2.D7(false);
                    qnVar2.showDialog(xiVar);
                    break;
                }
                break;
        }
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        qn qnVar = this.b;
        qnVar.M0.i(qnVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                lk lkVar = this.b.B0;
                if (lkVar != null) {
                    lkVar.callOnClick();
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                qn qnVar = this.b;
                MessageObject messageObject = (MessageObject) qnVar.J4.get(Integer.valueOf(qnVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) qnVar.o6[0].get(qnVar.L4);
                }
                qnVar.gc(messageObject);
                break;
            case 6:
                qn qnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = qnVar2.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, qnVar2.T5);
                }
                qnVar2.m8();
                break;
            case 7:
                this.b.ha(1);
                break;
            case 8:
                qn qnVar3 = this.b;
                qnVar3.getMessagesController().unblockPeer(qnVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                hg.j1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.db0 db0Var = adapter.V;
                if (db0Var != null) {
                    db0Var.a(false);
                    break;
                }
                break;
            case 15:
                qn qnVar4 = this.b;
                qnVar4.showDialog(new ol(qnVar4, qnVar4.getParentActivity(), qnVar4));
                break;
            case 16:
                qn qnVar5 = this.b;
                qnVar5.T7();
                UndoView undoView = qnVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                qn qnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = qnVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    qnVar6.ha(0);
                    break;
                }
                break;
            case 18:
                this.b.j9(true);
                break;
        }
    }

    @Override // org.telegram.ui.g60
    public void i(int i10, ArrayList arrayList) {
        qn qnVar = this.b;
        qnVar.getMessagesController().addUsersToChat(qnVar.e, qnVar, arrayList, i10, null, null, null);
        qnVar.getMessagesController().hidePeerSettingsBar(qnVar.T5, qnVar.f, qnVar.e);
        qnVar.Uc(true);
        qnVar.sc(true);
    }

    @Override // kh.a
    public void j(int i10) {
        qn qnVar = this.b;
        if (i10 == 1) {
            qnVar.Z9();
            return;
        }
        if (i10 == 2) {
            qnVar.M9();
            return;
        }
        if (i10 == 3) {
            qnVar.D4 = true;
            qnVar.getMessagesController().getNextReactionMention(qnVar.T5, qnVar.d(), qnVar.l1, new eg(qnVar, 0));
            return;
        }
        if (i10 == 4) {
            qnVar.D4 = true;
            qnVar.getMessagesController().getNextPollVotesMention(qnVar.T5, qnVar.d(), qnVar.m1, new eg(qnVar, 1));
            return;
        }
        if (i10 == 6) {
            qnVar.d9(true);
            return;
        }
        if (i10 == 5) {
            qnVar.d9(false);
        } else if (i10 == 0) {
            ci.b3 b3Var = qnVar.J1;
            if (b3Var != null) {
                b3Var.L1(null, 0);
            }
            qnVar.ca();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        qn qnVar = this.b;
        on onVar = qnVar.ea;
        onVar.k(c4Var, onVar.h, qnVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        qn qnVar = this.b;
        NotificationCenter notificationCenter = qnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(qnVar, i10);
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        qnVar.finishFragment();
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qnVar.T5), qnVar.f, qnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.g60
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
