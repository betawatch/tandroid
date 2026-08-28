package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d60 extends gw0 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d60(Context context, View view, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, view, i9, b6Var);
        this.G = i10;
    }

    @Override // org.telegram.ui.Components.gw0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.G) {
            case 0:
                super.onAttachedToWindow();
                this.b.getImageReceiver().startAnimation();
                break;
            case 1:
                super.onAttachedToWindow();
                this.b.getImageReceiver().startAnimation();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gw0, android.view.View
    public void setVisibility(int i9) {
        switch (this.G) {
            case 2:
                super.setVisibility(i9);
                if (i9 != 0) {
                    e(false, false);
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
