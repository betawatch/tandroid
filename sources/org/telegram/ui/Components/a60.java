package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a60 extends kv0 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a60(Context context, View view, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, view, i7, i6Var);
        this.L = i10;
    }

    @Override // org.telegram.ui.Components.kv0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.kv0, android.view.View
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
