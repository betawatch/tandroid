package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class se extends tg {
    public final /* synthetic */ int y0 = 0;
    public final /* synthetic */ ChatActivityEnterView z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, activity, i6Var, true);
        this.z0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.tg
    public boolean b() {
        switch (this.y0) {
            case 0:
                return this.z0.c();
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean c() {
        switch (this.y0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.z0;
                return !chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE;
            default:
                return !this.z0.g4;
        }
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean d() {
        switch (this.y0) {
            case 0:
                org.telegram.ui.dg0 dg0Var = this.z0.M0;
                return !(dg0Var == null || dg0Var.u0) || this.w > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.tg
    public boolean j() {
        switch (this.y0) {
            case 0:
                return this.z0.Y5;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.y0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.s7;
                this.z0.i2();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(R.drawable.input_done, context, i6Var, true);
        this.z0 = chatActivityEnterView;
    }
}
