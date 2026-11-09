package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class eo extends org.telegram.ui.Components.g70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ io y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(io ioVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = ioVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.g70
    public final boolean a(final boolean z9, org.telegram.ui.Components.e70 e70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        org.telegram.ui.ActionBar.g6 g6Var;
        io ioVar = this.y;
        final int i10 = 1;
        if (!ioVar.V || (chatFull = ioVar.Y) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = ioVar.a0 ? z9 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z9 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        g6Var = ((org.telegram.ui.ActionBar.f2) ioVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        String M0 = org.telegram.messenger.id.M0(2131754204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754206, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.co
            public final /* synthetic */ eo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                switch (i11) {
                    case 0:
                        boolean z10 = z9;
                        eo eoVar = this.b;
                        eoVar.setJoinRequest(z10);
                        eoVar.y.W = true;
                        break;
                    default:
                        boolean z11 = z9;
                        eo eoVar2 = this.b;
                        eoVar2.setJoinRequest(z11);
                        eoVar2.y.W = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131754205, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.co
            public final /* synthetic */ eo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                switch (i10) {
                    case 0:
                        boolean z10 = z9;
                        eo eoVar = this.b;
                        eoVar.setJoinRequest(z10);
                        eoVar.y.W = true;
                        break;
                    default:
                        boolean z11 = z9;
                        eo eoVar2 = this.b;
                        eoVar2.setJoinRequest(z11);
                        eoVar2.y.W = false;
                        break;
                }
            }
        });
        ioVar.showDialog(u1Var);
        return false;
    }
}
