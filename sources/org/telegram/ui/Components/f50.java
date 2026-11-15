package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tj0 h;

    public /* synthetic */ f50(tj0 tj0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.h = tj0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p50 p50Var = ((k50) this.h).c;
                gy0.b(p50Var.getContext(), p50Var.a, -p50Var.b2, this.b, this.c, this.d, this.e, this.f, p50Var.J0);
                break;
            default:
                ys0 ys0Var = ((lr0) this.h).f;
                gy0.b(ys0Var.getContext(), ys0Var.y1.getCurrentAccount(), ys0Var.m1, this.b, this.c, this.d, this.e, this.f, ys0Var.I1);
                break;
        }
    }
}
