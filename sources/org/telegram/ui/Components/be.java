package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class be extends zf {
    public final /* synthetic */ int n0 = 0;
    public final /* synthetic */ ChatActivityEnterView o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ChatActivityEnterView chatActivityEnterView, Activity activity, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, activity, p6Var, true);
        this.o0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.zf
    public boolean d() {
        switch (this.n0) {
            case 0:
                return this.o0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean e() {
        switch (this.n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.o0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.o0.q3;
        }
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean f() {
        switch (this.n0) {
            case 0:
                pe peVar = this.o0.L0;
                return !(peVar == null || peVar.p0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.zf
    public boolean j() {
        switch (this.n0) {
            case 0:
                return this.o0.y4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.n0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.s5;
                this.o0.y1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(R.drawable.input_done, context, p6Var, true);
        this.o0 = chatActivityEnterView;
    }
}
