package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ge extends dg {
    public final /* synthetic */ int n0 = 0;
    public final /* synthetic */ ChatActivityEnterView o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ChatActivityEnterView chatActivityEnterView, Activity activity, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, activity, f6Var, true);
        this.o0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.dg
    public boolean b() {
        switch (this.n0) {
            case 0:
                return this.o0.c();
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean c() {
        switch (this.n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.o0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.o0.q3;
        }
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean d() {
        switch (this.n0) {
            case 0:
                ue ueVar = this.o0.L0;
                return !(ueVar == null || ueVar.p0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.dg
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
    public ge(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(R.drawable.input_done, context, f6Var, true);
        this.o0 = chatActivityEnterView;
    }
}
