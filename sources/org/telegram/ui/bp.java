package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bp extends org.telegram.ui.Components.m80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ fp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(fp fpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = fpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.m80
    public final boolean a(final boolean z4, org.telegram.ui.Components.k80 k80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        fp fpVar = this.x;
        if (!fpVar.S || (chatFull = fpVar.V) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = fpVar.X ? z4 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z4 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        f6Var = ((org.telegram.ui.ActionBar.p2) fpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.ap
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z10 = z4;
                        bp bpVar = this.b;
                        bpVar.setJoinRequest(z10);
                        bpVar.x.T = true;
                        break;
                    default:
                        boolean z11 = z4;
                        bp bpVar2 = this.b;
                        bpVar2.setJoinRequest(z11);
                        bpVar2.x.T = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.ap
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z10 = z4;
                        bp bpVar = this.b;
                        bpVar.setJoinRequest(z10);
                        bpVar.x.T = true;
                        break;
                    default:
                        boolean z11 = z4;
                        bp bpVar2 = this.b;
                        bpVar2.setJoinRequest(z11);
                        bpVar2.x.T = false;
                        break;
                }
            }
        });
        fpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
