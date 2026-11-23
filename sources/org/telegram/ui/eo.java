package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class eo extends org.telegram.ui.Components.s70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ io y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(io ioVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = ioVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.s70
    public final boolean a(final boolean z10, org.telegram.ui.Components.q70 q70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        io ioVar = this.y;
        final int i10 = 1;
        if (!ioVar.W || (chatFull = ioVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = ioVar.b0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        i6Var = ((org.telegram.ui.ActionBar.g2) ioVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131754201, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754203, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.co
            public final /* synthetic */ eo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        eo eoVar = this.b;
                        eoVar.setJoinRequest(z11);
                        eoVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        eo eoVar2 = this.b;
                        eoVar2.setJoinRequest(z12);
                        eoVar2.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131754202, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.co
            public final /* synthetic */ eo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                switch (i10) {
                    case 0:
                        boolean z11 = z10;
                        eo eoVar = this.b;
                        eoVar.setJoinRequest(z11);
                        eoVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        eo eoVar2 = this.b;
                        eoVar2.setJoinRequest(z12);
                        eoVar2.y.X = false;
                        break;
                }
            }
        });
        ioVar.showDialog(t1Var);
        return false;
    }
}
