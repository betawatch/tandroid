package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ z6(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                f8 f8Var = this.b;
                f8Var.S1 = z10;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.u0 u0Var = f8Var.R1;
                float floatValue = ((Float) obj).floatValue();
                u0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.c2.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
