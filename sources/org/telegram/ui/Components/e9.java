package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ v40 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c8.ea[] f;

    public /* synthetic */ e9(k9 k9Var, v40 v40Var, Runnable[] runnableArr, int i7, c8.ea[] eaVarArr) {
        this.b = k9Var;
        this.d = v40Var;
        this.c = runnableArr;
        this.e = i7;
        this.f = eaVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                v40 v40Var = this.d;
                Runnable[] runnableArr = this.c;
                int i7 = this.e;
                c8.ea[] eaVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = k9Var.getOrientation();
                    int[] iArr = k9Var.a;
                    int i10 = v40Var.a;
                    int i11 = v40Var.b;
                    Rect e10 = k9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(k9Var, runnableArr, createBitmap, v40Var, i7, eaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new e9(k9Var, runnableArr, v40Var, i7, eaVarArr));
                    throw th2;
                }
            default:
                k9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ e9(k9 k9Var, Runnable[] runnableArr, v40 v40Var, int i7, c8.ea[] eaVarArr) {
        this.b = k9Var;
        this.c = runnableArr;
        this.d = v40Var;
        this.e = i7;
        this.f = eaVarArr;
    }
}
