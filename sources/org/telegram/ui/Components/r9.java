package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ v60 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ gb1[] f;

    public /* synthetic */ r9(x9 x9Var, v60 v60Var, Runnable[] runnableArr, int i10, gb1[] gb1VarArr) {
        this.b = x9Var;
        this.d = v60Var;
        this.c = runnableArr;
        this.e = i10;
        this.f = gb1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                v60 v60Var = this.d;
                Runnable[] runnableArr = this.c;
                int i10 = this.e;
                gb1[] gb1VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.a;
                    int i11 = v60Var.a;
                    int i12 = v60Var.b;
                    Rect e = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ag.q0(x9Var, runnableArr, createBitmap, v60Var, i10, gb1VarArr, 10));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, v60Var, i10, gb1VarArr));
                    throw th2;
                }
            default:
                x9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ r9(x9 x9Var, Runnable[] runnableArr, v60 v60Var, int i10, gb1[] gb1VarArr) {
        this.b = x9Var;
        this.c = runnableArr;
        this.d = v60Var;
        this.e = i10;
        this.f = gb1VarArr;
    }
}
