package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    public /* synthetic */ t6(a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z9 = !((Boolean) obj2).booleanValue();
                a8 a8Var = this.b;
                a8Var.R1 = z9;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = a8Var.Q1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.b2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
