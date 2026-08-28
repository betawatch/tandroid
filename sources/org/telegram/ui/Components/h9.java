package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ n9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ h50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ g7.b6[] f;

    public /* synthetic */ h9(n9 n9Var, h50 h50Var, Runnable[] runnableArr, int i9, g7.b6[] b6VarArr) {
        this.b = n9Var;
        this.d = h50Var;
        this.c = runnableArr;
        this.e = i9;
        this.f = b6VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n9 n9Var = this.b;
                h50 h50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i9 = this.e;
                g7.b6[] b6VarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = n9Var.getOrientation();
                    int[] iArr = n9Var.a;
                    int i10 = h50Var.a;
                    int i11 = h50Var.b;
                    Rect e10 = n9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    AndroidUtilities.runOnUIThread(new ff.k0(n9Var, runnableArr, createBitmap, h50Var, i9, b6VarArr));
                    return;
                } catch (Throwable th) {
                    AndroidUtilities.runOnUIThread(new h9(n9Var, runnableArr, h50Var, i9, b6VarArr));
                    throw th;
                }
            default:
                n9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ h9(n9 n9Var, Runnable[] runnableArr, h50 h50Var, int i9, g7.b6[] b6VarArr) {
        this.b = n9Var;
        this.c = runnableArr;
        this.d = h50Var;
        this.e = i9;
        this.f = b6VarArr;
    }
}
