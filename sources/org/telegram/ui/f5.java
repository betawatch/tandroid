package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class f5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ((g5) this.b).b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.o5) this.b).a();
                break;
            case 2:
                ((x70) this.b).b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((xp0) this.b).i;
                if (o5Var != null) {
                    o5Var.a();
                    break;
                }
                break;
            default:
                a91 a91Var = (a91) this.b;
                a91Var.h.a();
                a91Var.n.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ((g5) this.b).b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.o5) this.b).b();
                break;
            case 2:
                ((x70) this.b).b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((xp0) this.b).i;
                if (o5Var != null) {
                    o5Var.b();
                    break;
                }
                break;
            default:
                a91 a91Var = (a91) this.b;
                a91Var.h.b();
                a91Var.n.b();
                break;
        }
    }
}
