package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fl extends TextView {
    public final /* synthetic */ int a;
    public float b;
    public float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        switch (this.a) {
            case 0:
                this.b = f7;
                setTranslationY(this.c + f7);
                break;
            default:
                this.b = f7;
                setTranslationY(this.c + f7);
                break;
        }
    }
}
