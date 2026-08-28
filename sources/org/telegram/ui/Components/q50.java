package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vk0 h;

    public /* synthetic */ q50(vk0 vk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i9) {
        this.a = i9;
        this.h = vk0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        switch (this.a) {
            case 0:
                a60 a60Var = ((v50) this.h).c;
                Context context = a60Var.getContext();
                i9 = ((org.telegram.ui.ActionBar.f3) a60Var).currentAccount;
                long j10 = -a60Var.c0;
                b6Var = ((org.telegram.ui.ActionBar.f3) a60Var).resourcesProvider;
                iz0.b(context, i9, j10, this.b, this.c, this.d, this.e, this.f, b6Var);
                break;
            default:
                eu0 eu0Var = ((os0) this.h).f;
                iz0.b(eu0Var.getContext(), eu0Var.r1.getCurrentAccount(), eu0Var.f1, this.b, this.c, this.d, this.e, this.f, eu0Var.B1);
                break;
        }
    }
}
