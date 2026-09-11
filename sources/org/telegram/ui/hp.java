package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class hp extends org.telegram.ui.Components.k80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ lp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(lp lpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = lpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.k80
    public final boolean a(final boolean z10, org.telegram.ui.Components.i80 i80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        lp lpVar = this.x;
        if (!lpVar.V || (chatFull = lpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = lpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        f6Var = ((org.telegram.ui.ActionBar.n2) lpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.gp
            public final /* synthetic */ hp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        hp hpVar = this.b;
                        hpVar.setJoinRequest(z11);
                        hpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        hp hpVar2 = this.b;
                        hpVar2.setJoinRequest(z12);
                        hpVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.gp
            public final /* synthetic */ hp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        hp hpVar = this.b;
                        hpVar.setJoinRequest(z11);
                        hpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        hp hpVar2 = this.b;
                        hpVar2.setJoinRequest(z12);
                        hpVar2.x.W = false;
                        break;
                }
            }
        });
        lpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
