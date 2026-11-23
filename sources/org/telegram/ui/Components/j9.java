package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ p9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ i50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c8.ia[] f;

    public /* synthetic */ j9(p9 p9Var, i50 i50Var, Runnable[] runnableArr, int i7, c8.ia[] iaVarArr) {
        this.b = p9Var;
        this.d = i50Var;
        this.c = runnableArr;
        this.e = i7;
        this.f = iaVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p9 p9Var = this.b;
                i50 i50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i7 = this.e;
                c8.ia[] iaVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = p9Var.getOrientation();
                    int[] iArr = p9Var.a;
                    int i10 = i50Var.a;
                    int i11 = i50Var.b;
                    Rect e10 = p9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.g3(new bg.m0(p9Var, runnableArr, createBitmap, i50Var, i7, iaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.g3(new j9(p9Var, runnableArr, i50Var, i7, iaVarArr));
                    throw th2;
                }
            default:
                p9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ j9(p9 p9Var, Runnable[] runnableArr, i50 i50Var, int i7, c8.ia[] iaVarArr) {
        this.b = p9Var;
        this.c = runnableArr;
        this.d = i50Var;
        this.e = i7;
        this.f = iaVarArr;
    }
}
