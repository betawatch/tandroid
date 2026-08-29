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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mj0, ResultCallback, hh.d, ug.a, ug.b, h60, gs, org.telegram.ui.Components.bl0, ug.d, org.telegram.ui.Components.nk0, FlagSecureReason.FlagSecureCondition, iu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ me(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        tn tnVar = this.b;
        tnVar.q9(1);
        tnVar.r9();
    }

    @Override // org.telegram.ui.gs
    public void b() {
        tn tnVar = this.b;
        if (tnVar.u3 != null || tnVar.getParentActivity() == null) {
            return;
        }
        tnVar.Q7();
        tnVar.u3.m(tnVar.P5, tnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        tn tnVar = this.b;
        boolean z10 = false;
        if (tnVar.getParentActivity() != null) {
            rf.v0 adapter = tnVar.E1.getAdapter();
            if ((adapter.E != null || adapter.F != null) && i10 != 0) {
                rf.v0 adapter2 = tnVar.E1.getAdapter();
                if (adapter2.s0 != null && !adapter2.d0) {
                    return false;
                }
                Object J = tnVar.E1.getAdapter().J(i10 - 1);
                if (J instanceof rf.s0) {
                    rf.s0 s0Var = (rf.s0) J;
                    if (tnVar.E1.getAdapter().F != null && org.telegram.ui.Components.x41.h) {
                        tnVar.U.setFieldText("");
                        dk dkVar = tnVar.U;
                        String str = s0Var.a;
                        TLRPC.Chat chat = tnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        dkVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (tnVar.E1.getAdapter().F == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.aa);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new me(tnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        tnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.x41.h) {
                        tnVar.U.setFieldText("");
                        dk dkVar2 = tnVar.U;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = tnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        dkVar2.a1(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bo
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                tn.u0(this.b, document);
                break;
            default:
                tn.v0(this.b, document);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mj0
    public void e(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                tn tnVar = this.b;
                if (tnVar.getParentActivity() != null && tnVar.getParentActivity() != null) {
                    ai aiVar = new ai(tnVar, tnVar, tnVar.getParentActivity(), tnVar.aa, arrayList);
                    aiVar.setCalcMandatoryInsets(tnVar.x9());
                    aiVar.setDimBehind(false);
                    tnVar.A7(false);
                    tnVar.showDialog(aiVar);
                    break;
                }
                break;
            default:
                tn tnVar2 = this.b;
                if (tnVar2.getParentActivity() != null && tnVar2.getParentActivity() != null) {
                    xi xiVar = new xi(tnVar2, tnVar2, tnVar2.getParentActivity(), tnVar2.aa, arrayList);
                    xiVar.setCalcMandatoryInsets(tnVar2.x9());
                    xiVar.setDimBehind(false);
                    tnVar2.A7(false);
                    tnVar2.showDialog(xiVar);
                    break;
                }
                break;
        }
    }

    @Override // hh.d
    public void f(boolean z10, boolean z11) {
        tn tnVar = this.b;
        tnVar.I0.i(tnVar.ba.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                kk kkVar = this.b.x0;
                if (kkVar != null) {
                    kkVar.callOnClick();
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
                tn tnVar = this.b;
                MessageObject messageObject = (MessageObject) tnVar.F4.get(Integer.valueOf(tnVar.H4));
                if (messageObject == null) {
                    messageObject = (MessageObject) tnVar.k6[0].get(tnVar.H4);
                }
                tnVar.cc(messageObject);
                break;
            case 4:
                tn tnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = tnVar2.b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, tnVar2.P5);
                }
                tnVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                tn tnVar3 = this.b;
                tnVar3.getMessagesController().unblockPeer(tnVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                rf.v0 adapter = this.b.E1.getAdapter();
                adapter.w.c();
                adapter.E.clear();
                adapter.l();
                org.telegram.ui.Components.fa0 fa0Var = adapter.R;
                if (fa0Var != null) {
                    fa0Var.a(false);
                    break;
                }
                break;
            case 12:
                tn tnVar4 = this.b;
                tnVar4.showDialog(new ol(tnVar4, tnVar4.getParentActivity(), tnVar4));
                break;
            case 13:
                tn tnVar5 = this.b;
                tnVar5.Q7();
                UndoView undoView = tnVar5.u3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                tn tnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = tnVar6.b5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    tnVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.ui.iu0
    public void h(float[] fArr) {
        tn tnVar = this.b;
        fArr[1] = tnVar.t0.getBottom() - tnVar.wa;
        fArr[0] = (tnVar.t0.getTop() + tnVar.o9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.h60
    public void j(int i10, ArrayList arrayList) {
        tn tnVar = this.b;
        tnVar.getMessagesController().addUsersToChat(tnVar.e, tnVar, arrayList, i10, null, null, null);
        tnVar.getMessagesController().hidePeerSettingsBar(tnVar.P5, tnVar.f, tnVar.e);
        tnVar.Qc(true);
        tnVar.oc(true);
    }

    @Override // ug.a
    public void k(int i10) {
        tn tnVar = this.b;
        if (i10 == 1) {
            tnVar.U9();
            return;
        }
        if (i10 == 2) {
            tnVar.H9();
            return;
        }
        if (i10 == 3) {
            tnVar.z4 = true;
            tnVar.getMessagesController().getNextReactionMention(tnVar.P5, tnVar.b(), tnVar.h1, new dg(tnVar, 0));
            return;
        }
        if (i10 == 4) {
            tnVar.z4 = true;
            tnVar.getMessagesController().getNextPollVotesMention(tnVar.P5, tnVar.b(), tnVar.i1, new dg(tnVar, 1));
            return;
        }
        if (i10 == 6) {
            tnVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            tnVar.Y8(false);
        } else if (i10 == 0) {
            lh.s2 s2Var = tnVar.F1;
            if (s2Var != null) {
                s2Var.I1(null, 0);
            }
            tnVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        tn tnVar = this.b;
        rn rnVar = tnVar.aa;
        rnVar.i(b4Var, rnVar.h, tnVar.L5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        tn tnVar = this.b;
        NotificationCenter notificationCenter = tnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(tnVar, i10);
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        tnVar.finishFragment();
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(tnVar.P5), tnVar.f, tnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        tn tnVar = this.b;
        return tnVar.h != null || tnVar.y9();
    }

    @Override // org.telegram.ui.h60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
