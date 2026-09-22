package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Components.k80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ kp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(kp kpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = kpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.k80
    public final boolean a(final boolean z10, org.telegram.ui.Components.i80 i80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        kp kpVar = this.x;
        if (!kpVar.V || (chatFull = kpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = kpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        e6Var = ((org.telegram.ui.ActionBar.n2) kpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.fp
            public final /* synthetic */ gp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        gp gpVar = this.b;
                        gpVar.setJoinRequest(z11);
                        gpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        gp gpVar2 = this.b;
                        gpVar2.setJoinRequest(z12);
                        gpVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.fp
            public final /* synthetic */ gp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        gp gpVar = this.b;
                        gpVar.setJoinRequest(z11);
                        gpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        gp gpVar2 = this.b;
                        gpVar2.setJoinRequest(z12);
                        gpVar2.x.W = false;
                        break;
                }
            }
        });
        kpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
