package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ip extends org.telegram.ui.Components.u80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ mp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(mp mpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = mpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.u80
    public final boolean a(final boolean z10, org.telegram.ui.Components.s80 s80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        mp mpVar = this.x;
        if (!mpVar.V || (chatFull = mpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = mpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        f6Var = ((org.telegram.ui.ActionBar.p2) mpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.hp
            public final /* synthetic */ ip b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        ip ipVar = this.b;
                        ipVar.setJoinRequest(z11);
                        ipVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        ip ipVar2 = this.b;
                        ipVar2.setJoinRequest(z12);
                        ipVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.hp
            public final /* synthetic */ ip b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        ip ipVar = this.b;
                        ipVar.setJoinRequest(z11);
                        ipVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        ip ipVar2 = this.b;
                        ipVar2.setJoinRequest(z12);
                        ipVar2.x.W = false;
                        break;
                }
            }
        });
        mpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
