package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ u6(b8 b8Var, int i7) {
        this.a = i7;
        this.b = b8Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z9 = !((Boolean) obj2).booleanValue();
                b8 b8Var = this.b;
                b8Var.O1 = z9;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.N1;
                float floatValue = ((Float) obj).floatValue();
                v0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.Y1.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
