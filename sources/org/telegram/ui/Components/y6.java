package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ y6(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z10 = !((Boolean) obj2).booleanValue();
                h8 h8Var = this.b;
                h8Var.Y = z10;
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.b1 b1Var = h8Var.X;
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
