package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class he extends jg {
    public final /* synthetic */ int w0 = 0;
    public final /* synthetic */ ChatActivityEnterView x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, activity, e6Var, true);
        this.x0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.jg
    public boolean b() {
        switch (this.w0) {
            case 0:
                return this.x0.c();
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean c() {
        switch (this.w0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.x0;
                return !chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE;
            default:
                return !this.x0.Y3;
        }
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean d() {
        switch (this.w0) {
            case 0:
                org.telegram.ui.bg0 bg0Var = this.x0.M0;
                return !(bg0Var == null || bg0Var.u0) || this.w > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.jg
    public boolean j() {
        switch (this.w0) {
            case 0:
                return this.x0.Q5;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.w0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.N6;
                this.x0.T1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(R.drawable.input_done, context, e6Var, true);
        this.x0 = chatActivityEnterView;
    }
}
