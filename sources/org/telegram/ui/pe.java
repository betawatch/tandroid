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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements org.telegram.ui.Components.o60, org.telegram.ui.Components.r60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.so, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nk0, ResultCallback, xh.c, kh.a, k60, gs, kh.b, org.telegram.ui.Components.cm0, kh.d, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ pe(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.ui.Components.ol0
    public void a() {
        sn snVar = this.b;
        snVar.v9(1);
        snVar.w9();
    }

    @Override // org.telegram.ui.gs
    public void b() {
        sn snVar = this.b;
        if (snVar.K3 != null || snVar.getParentActivity() == null) {
            return;
        }
        snVar.T7();
        snVar.K3.m(snVar.f6, snVar.f, 8);
    }

    @Override // org.telegram.ui.Components.so
    public void c(TLRPC.Document document) {
        switch (this.a) {
            case 4:
                sn.i0(this.b, document);
                break;
            default:
                sn.E0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        sn snVar = this.b;
        boolean z10 = false;
        if (snVar.getParentActivity() != null) {
            hg.j1 adapter = snVar.U1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = snVar.U1.getAdapter();
                if (adapter2.w0 != null && !adapter2.h0) {
                    return false;
                }
                Object J = snVar.U1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (snVar.U1.getAdapter().J != null && org.telegram.ui.Components.n61.h) {
                        snVar.Y.setFieldText("");
                        gk gkVar = snVar.Y;
                        String str = g1Var.a;
                        TLRPC.Chat chat = snVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        gkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (snVar.U1.getAdapter().J == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.qa);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(snVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.n61.h) {
                        snVar.Y.setFieldText("");
                        gk gkVar2 = snVar.Y;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = snVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        gkVar2.X0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                sn snVar = this.b;
                if (snVar.getParentActivity() != null && snVar.getParentActivity() != null) {
                    ai aiVar = new ai(snVar, snVar, snVar.getParentActivity(), snVar.qa, arrayList);
                    aiVar.setCalcMandatoryInsets(snVar.C9());
                    aiVar.setDimBehind(false);
                    snVar.D7(false);
                    snVar.showDialog(aiVar);
                    break;
                }
                break;
            default:
                sn snVar2 = this.b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    xi xiVar = new xi(snVar2, snVar2, snVar2.getParentActivity(), snVar2.qa, arrayList);
                    xiVar.setCalcMandatoryInsets(snVar2.C9());
                    xiVar.setDimBehind(false);
                    snVar2.D7(false);
                    snVar2.showDialog(xiVar);
                    break;
                }
                break;
        }
    }

    @Override // xh.c
    public void f(boolean z10, boolean z11) {
        sn snVar = this.b;
        snVar.Y0.i(snVar.ra.b(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                mk mkVar = this.b.B0;
                if (mkVar != null) {
                    mkVar.callOnClick();
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
                sn snVar = this.b;
                MessageObject messageObject = (MessageObject) snVar.V4.get(Integer.valueOf(snVar.X4));
                if (messageObject == null) {
                    messageObject = (MessageObject) snVar.A6[0].get(snVar.X4);
                }
                snVar.jc(messageObject);
                break;
            case 6:
                sn snVar2 = this.b;
                MessagePreviewParams messagePreviewParams = snVar2.r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, snVar2.f6);
                }
                snVar2.m8();
                break;
            case 7:
                this.b.ha(1);
                break;
            case 8:
                sn snVar3 = this.b;
                snVar3.getMessagesController().unblockPeer(snVar3.f.id);
                break;
            case 10:
                this.b.finishFragment();
                break;
            case 12:
                hg.j1 adapter = this.b.U1.getAdapter();
                adapter.w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.eb0 eb0Var = adapter.V;
                if (eb0Var != null) {
                    eb0Var.a(false);
                    break;
                }
                break;
            case 15:
                sn snVar4 = this.b;
                snVar4.showDialog(new pl(snVar4, snVar4.getParentActivity(), snVar4));
                break;
            case 16:
                sn snVar5 = this.b;
                snVar5.T7();
                UndoView undoView = snVar5.K3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 17:
                sn snVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = snVar6.r5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    snVar6.ha(0);
                    break;
                }
                break;
            case 18:
                this.b.j9(true);
                break;
        }
    }

    @Override // org.telegram.ui.k60
    public void i(int i10, ArrayList arrayList) {
        sn snVar = this.b;
        snVar.getMessagesController().addUsersToChat(snVar.e, snVar, arrayList, i10, null, null, null);
        snVar.getMessagesController().hidePeerSettingsBar(snVar.f6, snVar.f, snVar.e);
        snVar.Xc(true);
        snVar.vc(true);
    }

    @Override // kh.a
    public void j(int i10) {
        sn snVar = this.b;
        if (i10 == 1) {
            snVar.Z9();
            return;
        }
        if (i10 == 2) {
            snVar.M9();
            return;
        }
        if (i10 == 3) {
            snVar.P4 = true;
            snVar.getMessagesController().getNextReactionMention(snVar.f6, snVar.d(), snVar.x1, new hg(snVar, 0));
            return;
        }
        if (i10 == 4) {
            snVar.P4 = true;
            snVar.getMessagesController().getNextPollVotesMention(snVar.f6, snVar.d(), snVar.y1, new hg(snVar, 1));
            return;
        }
        if (i10 == 6) {
            snVar.d9(true);
            return;
        }
        if (i10 == 5) {
            snVar.d9(false);
        } else if (i10 == 0) {
            ci.a3 a3Var = snVar.V1;
            if (a3Var != null) {
                a3Var.P1(null, 0);
            }
            snVar.ca();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) obj;
        sn snVar = this.b;
        qn qnVar = snVar.qa;
        qnVar.q(f4Var, qnVar.g, snVar.b6 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        sn snVar = this.b;
        NotificationCenter notificationCenter = snVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(snVar, i10);
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        snVar.finishFragment();
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(snVar.f6), snVar.f, snVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.k60
    public /* synthetic */ void h(TLRPC.User user) {
    }
}
