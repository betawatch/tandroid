package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ee extends bg {
    public final /* synthetic */ int o0 = 0;
    public final /* synthetic */ ChatActivityEnterView p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ChatActivityEnterView chatActivityEnterView, Activity activity, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, activity, e6Var, true);
        this.p0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.bg
    public boolean b() {
        switch (this.o0) {
            case 0:
                return this.p0.c();
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean c() {
        switch (this.o0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.p0;
                return !chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE;
            default:
                return !this.p0.r3;
        }
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean d() {
        switch (this.o0) {
            case 0:
                se seVar = this.p0.M0;
                return !(seVar == null || seVar.q0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.bg
    public boolean j() {
        switch (this.o0) {
            case 0:
                return this.p0.z4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.o0) {
            case 0:
                super.setAlpha(f10);
                int i3 = ChatActivityEnterView.t5;
                this.p0.A1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(R.drawable.input_done, context, e6Var, true);
        this.p0 = chatActivityEnterView;
    }
}
