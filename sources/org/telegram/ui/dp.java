package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class dp extends org.telegram.ui.Components.y80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ hp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(hp hpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = hpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.y80
    public final boolean a(final boolean z10, org.telegram.ui.Components.w80 w80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        hp hpVar = this.x;
        if (!hpVar.W || (chatFull = hpVar.Z) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = hpVar.b0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        d6Var = ((org.telegram.ui.ActionBar.n2) hpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.cp
            public final /* synthetic */ dp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        dp dpVar = this.b;
                        dpVar.setJoinRequest(z11);
                        dpVar.x.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        dp dpVar2 = this.b;
                        dpVar2.setJoinRequest(z12);
                        dpVar2.x.X = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.cp
            public final /* synthetic */ dp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        dp dpVar = this.b;
                        dpVar.setJoinRequest(z11);
                        dpVar.x.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        dp dpVar2 = this.b;
                        dpVar2.setJoinRequest(z12);
                        dpVar2.x.X = false;
                        break;
                }
            }
        });
        hpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
