package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xe extends ug {
    public final /* synthetic */ int l0;
    public final /* synthetic */ ChatActivityEnterView m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ug
    public boolean d() {
        switch (this.l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean e() {
        switch (this.l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.m0.p3;
        }
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean f() {
        switch (this.l0) {
            case 0:
                mf mfVar = this.m0.L0;
                return !(mfVar == null || mfVar.q0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.ug
    public boolean j() {
        switch (this.l0) {
            case 0:
                return this.m0.x4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.m5;
                this.m0.y1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}
