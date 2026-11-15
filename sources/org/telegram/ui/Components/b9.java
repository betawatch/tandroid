package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ x40 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c8.ga[] f;

    public /* synthetic */ b9(h9 h9Var, x40 x40Var, Runnable[] runnableArr, int i7, c8.ga[] gaVarArr) {
        this.b = h9Var;
        this.d = x40Var;
        this.c = runnableArr;
        this.e = i7;
        this.f = gaVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h9 h9Var = this.b;
                x40 x40Var = this.d;
                Runnable[] runnableArr = this.c;
                int i7 = this.e;
                c8.ga[] gaVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = h9Var.getOrientation();
                    int[] iArr = h9Var.a;
                    int i10 = x40Var.a;
                    int i11 = x40Var.b;
                    Rect e10 = h9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(h9Var, runnableArr, createBitmap, x40Var, i7, gaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new b9(h9Var, runnableArr, x40Var, i7, gaVarArr));
                    throw th2;
                }
            default:
                h9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ b9(h9 h9Var, Runnable[] runnableArr, x40 x40Var, int i7, c8.ga[] gaVarArr) {
        this.b = h9Var;
        this.c = runnableArr;
        this.d = x40Var;
        this.e = i7;
        this.f = gaVarArr;
    }
}
