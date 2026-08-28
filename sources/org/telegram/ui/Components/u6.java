package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ u6(c8 c8Var, int i9) {
        this.a = i9;
        this.b = c8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                c8 c8Var = this.b;
                c8Var.U = z10;
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.T;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.e0.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
