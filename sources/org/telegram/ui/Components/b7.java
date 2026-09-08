package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ b7(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                k8 k8Var = this.b;
                k8Var.Y = z10;
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = k8Var.X;
                float floatValue = ((Float) obj).floatValue();
                b1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.i0.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
