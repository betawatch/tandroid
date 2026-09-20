package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ul0 h;

    public /* synthetic */ p60(ul0 ul0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = ul0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 0:
                z60 z60Var = ((u60) this.h).c;
                Context context = z60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) z60Var).currentAccount;
                long j3 = -z60Var.g0;
                f6Var = ((org.telegram.ui.ActionBar.f3) z60Var).resourcesProvider;
                m01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, f6Var);
                break;
            default:
                jv0 jv0Var = ((tt0) this.h).f;
                m01.b(jv0Var.getContext(), jv0Var.v1.getCurrentAccount(), jv0Var.j1, this.b, this.c, this.d, this.e, this.f, jv0Var.F1);
                break;
        }
    }
}
