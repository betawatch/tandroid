package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ql extends TextView {
    public final /* synthetic */ int a;
    public float b;
    public float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(Context context, int i10) {
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
