package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class co extends org.telegram.ui.Components.i70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ ho y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(ho hoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = hoVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.i70
    public final boolean a(final boolean z10, org.telegram.ui.Components.g70 g70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        ho hoVar = this.y;
        final int i10 = 1;
        if (!hoVar.W || (chatFull = hoVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = hoVar.b0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        e6Var = ((org.telegram.ui.ActionBar.e2) hoVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131754204, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754206, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.bo
            public final /* synthetic */ co b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        co coVar = this.b;
                        coVar.setJoinRequest(z11);
                        coVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        co coVar2 = this.b;
                        coVar2.setJoinRequest(z12);
                        coVar2.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131754205, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.bo
            public final /* synthetic */ co b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                switch (i10) {
                    case 0:
                        boolean z11 = z10;
                        co coVar = this.b;
                        coVar.setJoinRequest(z11);
                        coVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        co coVar2 = this.b;
                        coVar2.setJoinRequest(z12);
                        coVar2.y.X = false;
                        break;
                }
            }
        });
        hoVar.showDialog(t1Var);
        return false;
    }
}
