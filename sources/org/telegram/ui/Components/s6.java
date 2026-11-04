package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ s6(z7 z7Var, int i3) {
        this.a = i3;
        this.b = z7Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                z7 z7Var = this.b;
                z7Var.P1 = z10;
                MediaController B = MediaController.B();
                org.telegram.ui.ActionBar.u0 u0Var = z7Var.O1;
                float floatValue = ((Float) obj).floatValue();
                u0Var.getClass();
                B.m0(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.Z1.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
