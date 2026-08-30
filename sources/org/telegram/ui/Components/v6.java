package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ v6(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean z4 = !((Boolean) obj2).booleanValue();
                c8 c8Var = this.b;
                c8Var.V = z4;
                MediaController mediaController = MediaController.getInstance();
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                float floatValue = ((Float) obj).floatValue();
                c1Var.getClass();
                mediaController.setPlaybackSpeed(true, (floatValue * 2.8f) + 0.2f);
                break;
            default:
                this.b.f0.setBackground(new BitmapDrawable((Bitmap) obj));
                break;
        }
    }
}
