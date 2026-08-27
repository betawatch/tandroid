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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.vn, MessagesStorage.BooleanCallback, org.telegram.ui.Components.dj0, ResultCallback, fh.d, sg.a, sg.b, j60, is, org.telegram.ui.Components.rk0, sg.d, org.telegram.ui.Components.ek0, FlagSecureReason.FlagSecureCondition, lu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ oe(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        rn rnVar = this.b;
        boolean z10 = false;
        if (rnVar.getParentActivity() != null) {
            pf.u0 adapter = rnVar.E1.getAdapter();
            if ((adapter.E != null || adapter.F != null) && i10 != 0) {
                pf.u0 adapter2 = rnVar.E1.getAdapter();
                if (adapter2.s0 != null && !adapter2.d0) {
                    return false;
                }
                Object J = rnVar.E1.getAdapter().J(i10 - 1);
                if (J instanceof pf.r0) {
                    pf.r0 r0Var = (pf.r0) J;
                    if (rnVar.E1.getAdapter().F != null && org.telegram.ui.Components.o41.h) {
                        rnVar.U.setFieldText("");
                        ck ckVar = rnVar.U;
                        String str = r0Var.a;
                        TLRPC.Chat chat = rnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        ckVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (rnVar.E1.getAdapter().F == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.aa);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new oe(rnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        rnVar.showDialog(alertDialog$Builder.a);
                        return true;
                    }
                    if (org.telegram.ui.Components.o41.h) {
                        rnVar.U.setFieldText("");
                        ck ckVar2 = rnVar.U;
                        String str2 = (String) J;
                        TLRPC.Chat chat2 = rnVar.e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        ckVar2.Z0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public void b() {
        rn rnVar = this.b;
        rnVar.q9(1);
        rnVar.r9();
    }

    @Override // org.telegram.ui.is
    public void c() {
        rn rnVar = this.b;
        if (rnVar.u3 != null || rnVar.getParentActivity() == null) {
            return;
        }
        rnVar.Q7();
        rnVar.u3.m(rnVar.P5, rnVar.f, 8);
    }

    @Override // org.telegram.ui.Components.vn
    public void d(TLRPC.Document document) {
        switch (this.a) {
            case 2:
                rn.u0(this.b, document);
                break;
            default:
                rn.v0(this.b, document);
                break;
        }
    }

    @Override // fh.d
    public void e(boolean z10, boolean z11) {
        rn rnVar = this.b;
        rnVar.I0.i(rnVar.ba.c(), z10, z11);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                jk jkVar = this.b.x0;
                if (jkVar != null) {
                    jkVar.callOnClick();
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
                rn rnVar = this.b;
                MessageObject messageObject = (MessageObject) rnVar.F4.get(Integer.valueOf(rnVar.H4));
                if (messageObject == null) {
                    messageObject = (MessageObject) rnVar.k6[0].get(rnVar.H4);
                }
                rnVar.cc(messageObject);
                break;
            case 4:
                rn rnVar2 = this.b;
                MessagePreviewParams messagePreviewParams = rnVar2.b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, rnVar2.P5);
                }
                rnVar2.j8();
                break;
            case 5:
                this.b.ca(1);
                break;
            case 6:
                rn rnVar3 = this.b;
                rnVar3.getMessagesController().unblockPeer(rnVar3.f.id);
                break;
            case 8:
                this.b.finishFragment();
                break;
            case 10:
                pf.u0 adapter = this.b.E1.getAdapter();
                adapter.w.c();
                adapter.E.clear();
                adapter.l();
                org.telegram.ui.Components.v90 v90Var = adapter.R;
                if (v90Var != null) {
                    v90Var.a(false);
                    break;
                }
                break;
            case 12:
                rn rnVar4 = this.b;
                rnVar4.showDialog(new nl(rnVar4, rnVar4.getParentActivity(), rnVar4));
                break;
            case 13:
                rn rnVar5 = this.b;
                rnVar5.Q7();
                UndoView undoView = rnVar5.u3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                rn rnVar6 = this.b;
                MessagePreviewParams messagePreviewParams2 = rnVar6.b5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    rnVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.b.e9(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public void g(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                rn rnVar = this.b;
                if (rnVar.getParentActivity() != null && rnVar.getParentActivity() != null) {
                    zh zhVar = new zh(rnVar, rnVar, rnVar.getParentActivity(), rnVar.aa, arrayList);
                    zhVar.setCalcMandatoryInsets(rnVar.x9());
                    zhVar.setDimBehind(false);
                    rnVar.A7(false);
                    rnVar.showDialog(zhVar);
                    break;
                }
                break;
            default:
                rn rnVar2 = this.b;
                if (rnVar2.getParentActivity() != null && rnVar2.getParentActivity() != null) {
                    wi wiVar = new wi(rnVar2, rnVar2, rnVar2.getParentActivity(), rnVar2.aa, arrayList);
                    wiVar.setCalcMandatoryInsets(rnVar2.x9());
                    wiVar.setDimBehind(false);
                    rnVar2.A7(false);
                    rnVar2.showDialog(wiVar);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.lu0
    public void h(float[] fArr) {
        rn rnVar = this.b;
        fArr[1] = rnVar.t0.getBottom() - rnVar.wa;
        fArr[0] = (rnVar.t0.getTop() + rnVar.o9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.j60
    public void j(int i10, ArrayList arrayList) {
        rn rnVar = this.b;
        rnVar.getMessagesController().addUsersToChat(rnVar.e, rnVar, arrayList, i10, null, null, null);
        rnVar.getMessagesController().hidePeerSettingsBar(rnVar.P5, rnVar.f, rnVar.e);
        rnVar.Qc(true);
        rnVar.oc(true);
    }

    @Override // sg.a
    public void k(int i10) {
        rn rnVar = this.b;
        if (i10 == 1) {
            rnVar.U9();
            return;
        }
        if (i10 == 2) {
            rnVar.H9();
            return;
        }
        if (i10 == 3) {
            rnVar.z4 = true;
            rnVar.getMessagesController().getNextReactionMention(rnVar.P5, rnVar.b(), rnVar.h1, new hg(rnVar, 0));
            return;
        }
        if (i10 == 4) {
            rnVar.z4 = true;
            rnVar.getMessagesController().getNextPollVotesMention(rnVar.P5, rnVar.b(), rnVar.i1, new hg(rnVar, 1));
            return;
        }
        if (i10 == 6) {
            rnVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            rnVar.Y8(false);
        } else if (i10 == 0) {
            jh.t2 t2Var = rnVar.F1;
            if (t2Var != null) {
                t2Var.I1(null, 0);
            }
            rnVar.X9();
        }
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        rn rnVar = this.b;
        pn pnVar = rnVar.aa;
        pnVar.i(b4Var, pnVar.h, rnVar.L5 != 0, null, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        rn rnVar = this.b;
        NotificationCenter notificationCenter = rnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(rnVar, i10);
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        rnVar.finishFragment();
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(rnVar.P5), rnVar.f, rnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        rn rnVar = this.b;
        return rnVar.h != null || rnVar.y9();
    }

    @Override // org.telegram.ui.j60
    public /* synthetic */ void i(TLRPC.User user) {
    }
}
