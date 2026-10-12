package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jp extends org.telegram.ui.Components.l90 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ np x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(np npVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = npVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.l90
    public final boolean a(final boolean z10, org.telegram.ui.Components.i90 i90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        np npVar = this.x;
        if (!npVar.V || (chatFull = npVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = npVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        c6Var = ((org.telegram.ui.ActionBar.m2) npVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.ip
            public final /* synthetic */ jp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        jp jpVar = this.b;
                        jpVar.setJoinRequest(z11);
                        jpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        jp jpVar2 = this.b;
                        jpVar2.setJoinRequest(z12);
                        jpVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.ip
            public final /* synthetic */ jp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        jp jpVar = this.b;
                        jpVar.setJoinRequest(z11);
                        jpVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        jp jpVar2 = this.b;
                        jpVar2.setJoinRequest(z12);
                        jpVar2.x.W = false;
                        break;
                }
            }
        });
        npVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
