package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d60 extends nv0 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d60(Context context, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, view, i7, h6Var);
        this.L = i10;
    }

    @Override // org.telegram.ui.Components.nv0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.L) {
            case 0:
                super.onAttachedToWindow();
                this.b.getImageReceiver().P0(false);
                break;
            case 1:
                super.onAttachedToWindow();
                this.b.getImageReceiver().P0(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nv0, android.view.View
    public void setVisibility(int i7) {
        switch (this.L) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    e(false, false);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
