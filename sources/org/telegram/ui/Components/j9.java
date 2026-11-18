package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ p9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ f50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c8.ia[] f;

    public /* synthetic */ j9(p9 p9Var, f50 f50Var, Runnable[] runnableArr, int i7, c8.ia[] iaVarArr) {
        this.b = p9Var;
        this.d = f50Var;
        this.c = runnableArr;
        this.e = i7;
        this.f = iaVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p9 p9Var = this.b;
                f50 f50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i7 = this.e;
                c8.ia[] iaVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = p9Var.getOrientation();
                    int[] iArr = p9Var.a;
                    int i10 = f50Var.a;
                    int i11 = f50Var.b;
                    Rect e10 = p9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.g3(new bg.m0(p9Var, runnableArr, createBitmap, f50Var, i7, iaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.g3(new j9(p9Var, runnableArr, f50Var, i7, iaVarArr));
                    throw th2;
                }
            default:
                p9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ j9(p9 p9Var, Runnable[] runnableArr, f50 f50Var, int i7, c8.ia[] iaVarArr) {
        this.b = p9Var;
        this.c = runnableArr;
        this.d = f50Var;
        this.e = i7;
        this.f = iaVarArr;
    }
}
