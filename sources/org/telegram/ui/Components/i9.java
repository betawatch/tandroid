package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o9 b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ f50 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ c8.ja[] f;

    public /* synthetic */ i9(o9 o9Var, f50 f50Var, Runnable[] runnableArr, int i7, c8.ja[] jaVarArr) {
        this.b = o9Var;
        this.d = f50Var;
        this.c = runnableArr;
        this.e = i7;
        this.f = jaVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o9 o9Var = this.b;
                f50 f50Var = this.d;
                Runnable[] runnableArr = this.c;
                int i7 = this.e;
                c8.ja[] jaVarArr = this.f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.a;
                    int i10 = f50Var.a;
                    int i11 = f50Var.b;
                    Rect e10 = o9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.g3(new bg.m0(o9Var, runnableArr, createBitmap, f50Var, i7, jaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.g3(new i9(o9Var, runnableArr, f50Var, i7, jaVarArr));
                    throw th2;
                }
            default:
                o9.a(this.b, this.c, null, this.d, this.e, this.f);
                return;
        }
    }

    public /* synthetic */ i9(o9 o9Var, Runnable[] runnableArr, f50 f50Var, int i7, c8.ja[] jaVarArr) {
        this.b = o9Var;
        this.c = runnableArr;
        this.d = f50Var;
        this.e = i7;
        this.f = jaVarArr;
    }
}
