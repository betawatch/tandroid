package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ u40 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c8.ea[] f;

    public /* synthetic */ d9(j9 j9Var, u40 u40Var, Runnable[] runnableArr, int i7, c8.ea[] eaVarArr) {
        this.b = j9Var;
        this.d = u40Var;
        this.c = runnableArr;
        this.e = i7;
        this.f = eaVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j9 j9Var = this.b;
                u40 u40Var = this.d;
                Runnable[] runnableArr = this.c;
                int i7 = this.e;
                c8.ea[] eaVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = j9Var.getOrientation();
                    int[] iArr = j9Var.a;
                    int i10 = u40Var.a;
                    int i11 = u40Var.b;
                    Rect e10 = j9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(j9Var, runnableArr, createBitmap, u40Var, i7, eaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new d9(j9Var, runnableArr, u40Var, i7, eaVarArr));
                    throw th2;
                }
            default:
                j9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ d9(j9 j9Var, Runnable[] runnableArr, u40 u40Var, int i7, c8.ea[] eaVarArr) {
        this.b = j9Var;
        this.c = runnableArr;
        this.d = u40Var;
        this.e = i7;
        this.f = eaVarArr;
    }
}
