package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fo extends org.telegram.ui.Components.t70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ jo y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(jo joVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = joVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.t70
    public final boolean a(final boolean z10, org.telegram.ui.Components.r70 r70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        jo joVar = this.y;
        final int i10 = 1;
        if (!joVar.W || (chatFull = joVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = joVar.b0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        i6Var = ((org.telegram.ui.ActionBar.h2) joVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131754202, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754204, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.eo
            public final /* synthetic */ fo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        fo foVar = this.b;
                        foVar.setJoinRequest(z11);
                        foVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        fo foVar2 = this.b;
                        foVar2.setJoinRequest(z12);
                        foVar2.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131754203, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.eo
            public final /* synthetic */ fo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                switch (i10) {
                    case 0:
                        boolean z11 = z10;
                        fo foVar = this.b;
                        foVar.setJoinRequest(z11);
                        foVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        fo foVar2 = this.b;
                        foVar2.setJoinRequest(z12);
                        foVar2.y.X = false;
                        break;
                }
            }
        });
        joVar.showDialog(u1Var);
        return false;
    }
}
