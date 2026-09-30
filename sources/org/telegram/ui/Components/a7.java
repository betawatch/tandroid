package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ a7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                j8 j8Var = this.b;
                j8Var.Y = z10;
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.a1 a1Var = j8Var.X;
                float floatValue = ((Float) obj).floatValue();
                a1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.i0.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
