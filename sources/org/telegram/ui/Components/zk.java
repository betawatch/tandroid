package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zk extends TextView {
    public final /* synthetic */ int a;
    public float b;
    public float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk(Context context, int i10) {
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
    public final void setTranslationX(float f9) {
        switch (this.a) {
            case 0:
                this.b = f9;
                setTranslationY(this.c + f9);
                break;
            default:
                this.b = f9;
                setTranslationY(this.c + f9);
                break;
        }
    }
}
