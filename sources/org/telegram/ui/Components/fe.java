package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fe extends cg {
    public final /* synthetic */ int n0 = 0;
    public final /* synthetic */ ChatActivityEnterView o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, activity, h6Var, true);
        this.o0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.cg
    public boolean b() {
        switch (this.n0) {
            case 0:
                return this.o0.c();
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean c() {
        switch (this.n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.o0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.o0.q3;
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean d() {
        switch (this.n0) {
            case 0:
                te teVar = this.o0.L0;
                return !(teVar == null || teVar.p0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.cg
    public boolean j() {
        switch (this.n0) {
            case 0:
                return this.o0.y4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.n0) {
            case 0:
                super.setAlpha(f10);
                int i7 = ChatActivityEnterView.s5;
                this.o0.B1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(R.drawable.input_done, context, h6Var, true);
        this.o0 = chatActivityEnterView;
    }
}
