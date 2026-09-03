package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class al extends TextView {
    public final /* synthetic */ int a;
    public float b;
    public float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al(Context context, int i10) {
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
    public final void setTranslationX(float f10) {
        switch (this.a) {
            case 0:
                this.b = f10;
                setTranslationY(this.c + f10);
                break;
            default:
                this.b = f10;
                setTranslationY(this.c + f10);
                break;
        }
    }
}
