package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cp extends org.telegram.ui.Components.l80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ gp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(gp gpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = gpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.l80
    public final boolean a(final boolean z10, org.telegram.ui.Components.j80 j80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        gp gpVar = this.x;
        if (!gpVar.V || (chatFull = gpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = gpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        d6Var = ((org.telegram.ui.ActionBar.n2) gpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.bp
            public final /* synthetic */ cp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        cp cpVar = this.b;
                        cpVar.setJoinRequest(z11);
                        cpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        cp cpVar2 = this.b;
                        cpVar2.setJoinRequest(z12);
                        cpVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.bp
            public final /* synthetic */ cp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        cp cpVar = this.b;
                        cpVar.setJoinRequest(z11);
                        cpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        cp cpVar2 = this.b;
                        cpVar2.setJoinRequest(z12);
                        cpVar2.x.W = false;
                        break;
                }
            }
        });
        gpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
