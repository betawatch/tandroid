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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements org.telegram.ui.Components.p60, org.telegram.ui.Components.s60, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.uo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mk0, ResultCallback, oi.m, yh.c, lh.a, lh.b, org.telegram.ui.Components.bm0, m60, is, lh.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ pe(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.ui.is
    public void a() {
        un unVar = this.b;
        if (unVar.K3 != null || unVar.getParentActivity() == null) {
            return;
        }
        unVar.X7();
        unVar.K3.m(unVar.f6, unVar.f, 8);
    }

    @Override // org.telegram.ui.Components.uo
    public void b(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                un.u0(this.b, document);
                break;
            default:
                un.B0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        un unVar = this.b;
        boolean z10 = false;
        if (unVar.getParentActivity() != null) {
            ig.j1 adapter = unVar.U1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                ig.j1 adapter2 = unVar.U1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = unVar.U1.getAdapter().J(i10 - 1);
                if (J instanceof ig.g1) {
                    ig.g1 g1Var = (ig.g1) J;
                    if (unVar.U1.getAdapter().J != null && org.telegram.ui.Components.u61.h) {
                        unVar.Y.setFieldText("");
                        hk hkVar = unVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = unVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        hkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (unVar.U1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.qa);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(unVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        unVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.u61.h) {
                        unVar.Y.setFieldText("");
                        hk hkVar2 = unVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = unVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        hkVar2.X0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // yh.c
    public void d(boolean z10, boolean z11) {
        un unVar = this.b;
        unVar.Y0.i(unVar.ra.b(), z10, z11);
    }

    @Override // org.telegram.ui.m60
    public void f(int i10, ArrayList arrayList) {
        un unVar = this.b;
        unVar.getMessagesController().addUsersToChat(unVar.e, unVar, arrayList, i10, null, null, null);
        unVar.getMessagesController().hidePeerSettingsBar(unVar.f6, unVar.f, unVar.e);
        unVar.dd(true);
        unVar.Bc(true);
    }

    @Override // org.telegram.ui.Components.mk0
    public void g(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                un unVar = this.b;
                if (unVar.getParentActivity() != null && unVar.getParentActivity() != null) {
                    bi biVar = new bi(unVar, unVar, unVar.getParentActivity(), unVar.qa, arrayList);
                    biVar.setCalcMandatoryInsets(unVar.F9());
                    biVar.setDimBehind(false);
                    unVar.H7(false);
                    unVar.showDialog(biVar);
                    break;
                }
                break;
            default:
                un unVar2 = this.b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    yi yiVar = new yi(unVar2, unVar2, unVar2.getParentActivity(), unVar2.qa, arrayList);
                    yiVar.setCalcMandatoryInsets(unVar2.F9());
                    yiVar.setDimBehind(false);
                    unVar2.H7(false);
                    unVar2.showDialog(yiVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                nk nkVar = this.b.B0;
                if (nkVar != null) {
                    nkVar.callOnClick();
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
            case 17:
            case 19:
            default:
                this.b.o9(true);
                break;
            case 6:
                un unVar = this.b;
                MessagePreviewParams messagePreviewParams = unVar.r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, unVar.f6);
                }
                unVar.q8();
                break;
            case 7:
                this.b.ma(1);
                break;
            case 8:
                un unVar2 = this.b;
                unVar2.getMessagesController().unblockPeer(unVar2.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                ig.j1 adapter = this.b.U1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.bb0 bb0Var = adapter.V;
                if (bb0Var != null) {
                    bb0Var.a(false);
                    break;
                }
                break;
            case 15:
                un unVar3 = this.b;
                unVar3.showDialog(new ql(unVar3, unVar3.getParentActivity(), unVar3));
                break;
            case 16:
                un unVar4 = this.b;
                unVar4.X7();
                UndoView undoView = unVar4.K3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 18:
                un unVar5 = this.b;
                MessageObject messageObject = (MessageObject) unVar5.V4.get(Integer.valueOf(unVar5.X4));
                if (messageObject == null) {
                    messageObject = (MessageObject) unVar5.A6[0].get(unVar5.X4);
                }
                unVar5.pc(messageObject);
                break;
            case 20:
                un unVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = unVar6.r5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    unVar6.ma(0);
                    break;
                }
                break;
        }
    }

    @Override // lh.a
    public void i(int i10) {
        un unVar = this.b;
        if (i10 == 1) {
            unVar.ea();
            return;
        }
        if (i10 == 2) {
            unVar.R9();
            return;
        }
        if (i10 == 3) {
            unVar.P4 = true;
            unVar.getMessagesController().getNextReactionMention(unVar.f6, unVar.b(), unVar.x1, new hg(unVar, 0));
            return;
        }
        if (i10 == 4) {
            unVar.P4 = true;
            unVar.getMessagesController().getNextPollVotesMention(unVar.f6, unVar.b(), unVar.y1, new hg(unVar, 1));
            return;
        }
        if (i10 == 6) {
            unVar.i9(true);
            return;
        }
        if (i10 == 5) {
            unVar.i9(false);
        } else if (i10 == 0) {
            di.a3 a3Var = unVar.V1;
            if (a3Var != null) {
                a3Var.O1(null, 0);
            }
            unVar.ha();
        }
    }

    @Override // oi.m
    public void k(int i10) {
        un.b1(this.b, i10);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) obj;
        un unVar = this.b;
        sn snVar = unVar.qa;
        snVar.q(h4Var, snVar.g, unVar.b6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        un unVar = this.b;
        NotificationCenter notificationCenter = unVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(unVar, i10);
        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        unVar.finishFragment();
        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(unVar.f6), unVar.f, unVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.m60
    public /* synthetic */ void e(TLRPC.User user) {
    }
}
