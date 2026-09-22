package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ve extends tg {
    public final /* synthetic */ int l0;
    public final /* synthetic */ ChatActivityEnterView m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(i10, context, e6Var, true);
        this.l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.tg
    public boolean d() {
        switch (this.l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean e() {
        switch (this.l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.m0.p3;
        }
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean f() {
        switch (this.l0) {
            case 0:
                kf kfVar = this.m0.L0;
                return !(kfVar == null || kfVar.q0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.tg
    public boolean j() {
        switch (this.l0) {
            case 0:
                return this.m0.y4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.n5;
                this.m0.A1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}
