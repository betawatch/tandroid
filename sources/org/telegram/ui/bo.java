package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.Components.f70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ go y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(go goVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = goVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.f70
    public final boolean a(final boolean z9, org.telegram.ui.Components.d70 d70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var;
        go goVar = this.y;
        final int i10 = 1;
        if (!goVar.V || (chatFull = goVar.Y) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = goVar.a0 ? z9 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z9 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        f6Var = ((org.telegram.ui.ActionBar.f2) goVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131754204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754206, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.ao
            public final /* synthetic */ bo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                switch (i11) {
                    case 0:
                        boolean z10 = z9;
                        bo boVar = this.b;
                        boVar.setJoinRequest(z10);
                        boVar.y.W = true;
                        break;
                    default:
                        boolean z11 = z9;
                        bo boVar2 = this.b;
                        boVar2.setJoinRequest(z11);
                        boVar2.y.W = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131754205, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.ao
            public final /* synthetic */ bo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                switch (i10) {
                    case 0:
                        boolean z10 = z9;
                        bo boVar = this.b;
                        boVar.setJoinRequest(z10);
                        boVar.y.W = true;
                        break;
                    default:
                        boolean z11 = z9;
                        bo boVar2 = this.b;
                        boVar2.setJoinRequest(z11);
                        boVar2.y.W = false;
                        break;
                }
            }
        });
        goVar.showDialog(u1Var);
        return false;
    }
}
