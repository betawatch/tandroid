package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class bp extends org.telegram.ui.Components.v80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ fp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(fp fpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = fpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.v80
    public final boolean a(final boolean z10, org.telegram.ui.Components.t80 t80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        fp fpVar = this.x;
        if (!fpVar.V || (chatFull = fpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = fpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        d6Var = ((org.telegram.ui.ActionBar.m2) fpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.ap
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        bp bpVar = this.b;
                        bpVar.setJoinRequest(z11);
                        bpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        bp bpVar2 = this.b;
                        bpVar2.setJoinRequest(z12);
                        bpVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.ap
            public final /* synthetic */ bp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        bp bpVar = this.b;
                        bpVar.setJoinRequest(z11);
                        bpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        bp bpVar2 = this.b;
                        bpVar2.setJoinRequest(z12);
                        bpVar2.x.W = false;
                        break;
                }
            }
        });
        fpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
