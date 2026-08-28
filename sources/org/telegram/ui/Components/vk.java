package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vk extends TextView {
    public final /* synthetic */ int a;
    public float b;
    public float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk(Context context, int i9) {
        super(context);
        this.a = i9;
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
