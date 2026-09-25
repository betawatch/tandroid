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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements org.telegram.ui.Components.d60, org.telegram.ui.Components.g60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.jo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.xj0, ResultCallback, wh.c, jh.a, jh.b, u60, ls, org.telegram.ui.Components.ml0, jh.d, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ pe(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public void a() {
        wn wnVar = this.b;
        wnVar.q9(1);
        wnVar.r9();
    }

    @Override // org.telegram.ui.ls
    public void b() {
        wn wnVar = this.b;
        if (wnVar.y3 != null || wnVar.getParentActivity() == null) {
            return;
        }
        wnVar.Q7();
        wnVar.y3.m(wnVar.T5, wnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.jo
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                wn.b1(this.b, document);
                break;
            default:
                wn.e1(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        wn wnVar = this.b;
        boolean z10 = false;
        if (wnVar.getParentActivity() != null) {
            gg.k1 adapter = wnVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = wnVar.I1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = wnVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (wnVar.I1.getAdapter().J != null && org.telegram.ui.Components.w51.h) {
                        wnVar.Y.setFieldText("");
                        jk jkVar = wnVar.Y;
                        String str = h1Var.a;
                        TLRPC.Chat chat = wnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (wnVar.I1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ea);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(wnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.w51.h) {
                        wnVar.Y.setFieldText("");
                        jk jkVar2 = wnVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = wnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        jkVar2.a1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                wn wnVar = this.b;
                if (wnVar.getParentActivity() != null && wnVar.getParentActivity() != null) {
                    gi giVar = new gi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.ea, arrayList);
                    giVar.setCalcMandatoryInsets(wnVar.x9());
                    giVar.setDimBehind(false);
                    wnVar.A7(false);
                    wnVar.showDialog(giVar);
                    break;
                }
                break;
            default:
                wn wnVar2 = this.b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    dj djVar = new dj(wnVar2, wnVar2, wnVar2.getParentActivity(), wnVar2.ea, arrayList);
                    djVar.setCalcMandatoryInsets(wnVar2.x9());
                    djVar.setDimBehind(false);
                    wnVar2.A7(false);
                    wnVar2.showDialog(djVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                qk qkVar = this.b.B0;
                if (qkVar != null) {
                    qkVar.callOnClick();
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
            case 18:
            default:
                this.b.e9(true);
                break;
            case 6:
                wn wnVar = this.b;
                MessagePreviewParams messagePreviewParams = wnVar.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, wnVar.T5);
                }
                wnVar.j8();
                break;
            case 7:
                this.b.ca(1);
                break;
            case 8:
                wn wnVar2 = this.b;
                wnVar2.getMessagesController().unblockPeer(wnVar2.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                gg.k1 adapter = this.b.I1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ua0 ua0Var = adapter.V;
                if (ua0Var != null) {
                    ua0Var.a(false);
                    break;
                }
                break;
            case 15:
                wn wnVar3 = this.b;
                wnVar3.showDialog(new tl(wnVar3, wnVar3.getParentActivity(), wnVar3));
                break;
            case 16:
                wn wnVar4 = this.b;
                wnVar4.Q7();
                UndoView undoView = wnVar4.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                wn wnVar5 = this.b;
                MessageObject messageObject = (MessageObject) wnVar5.J4.get(Integer.valueOf(wnVar5.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) wnVar5.o6[0].get(wnVar5.L4);
                }
                wnVar5.cc(messageObject);
                break;
            case 19:
                wn wnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = wnVar6.f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    wnVar6.ca(0);
                    break;
                }
                break;
        }
    }

    @Override // wh.c
    public void h(boolean z10, boolean z11) {
        wn wnVar = this.b;
        wnVar.M0.i(wnVar.fa.c(), z10, z11);
    }

    @Override // org.telegram.ui.u60
    public void i(int i10, ArrayList arrayList) {
        wn wnVar = this.b;
        wnVar.getMessagesController().addUsersToChat(wnVar.e, wnVar, arrayList, i10, null, null, null);
        wnVar.getMessagesController().hidePeerSettingsBar(wnVar.T5, wnVar.f, wnVar.e);
        wnVar.Qc(true);
        wnVar.oc(true);
    }

    @Override // jh.a
    public void j(int i10) {
        wn wnVar = this.b;
        if (i10 == 1) {
            wnVar.U9();
            return;
        }
        if (i10 == 2) {
            wnVar.H9();
            return;
        }
        if (i10 == 3) {
            wnVar.D4 = true;
            wnVar.getMessagesController().getNextReactionMention(wnVar.T5, wnVar.d(), wnVar.l1, new ng(wnVar, 0));
            return;
        }
        if (i10 == 4) {
            wnVar.D4 = true;
            wnVar.getMessagesController().getNextPollVotesMention(wnVar.T5, wnVar.d(), wnVar.m1, new ng(wnVar, 1));
            return;
        }
        if (i10 == 6) {
            wnVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            wnVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = wnVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            wnVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        wn wnVar = this.b;
        un unVar = wnVar.ea;
        unVar.i(b4Var, unVar.h, wnVar.P5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wn wnVar = this.b;
        NotificationCenter notificationCenter = wnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wnVar, i10);
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wnVar.finishFragment();
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.T5), wnVar.f, wnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override // org.telegram.ui.u60
    public /* synthetic */ void g(TLRPC.User user) {
    }
}
