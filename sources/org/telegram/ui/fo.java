package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fo extends org.telegram.ui.Components.v70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ jo y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(jo joVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = joVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean a(final boolean z10, org.telegram.ui.Components.t70 t70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        jo joVar = this.y;
        final int i10 = 1;
        if (!joVar.W || (chatFull = joVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = joVar.b0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        h6Var = ((org.telegram.ui.ActionBar.g2) joVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = org.telegram.messenger.hd.N0(2131754201, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754203, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.eo
            public final /* synthetic */ fo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
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
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131754202, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.eo
            public final /* synthetic */ fo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
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
        joVar.showDialog(t1Var);
        return false;
    }
}
