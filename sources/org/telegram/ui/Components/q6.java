package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ q6(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                w7 w7Var = this.b;
                w7Var.O1 = z10;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.x0 x0Var = w7Var.N1;
                float floatValue = ((Float) obj).floatValue();
                x0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.Y1.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
