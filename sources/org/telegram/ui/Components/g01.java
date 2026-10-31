package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g01 {
    public final View a;
    public final ArrayList b;
    public final Runnable c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f;
    public float g;

    public g01(View view, Runnable runnable) {
        this.g = 1.0f;
        this.a = view;
        this.b = null;
        this.c = null;
        this.d = runnable;
        this.e = null;
        this.f = null;
    }

    public g01(ArrayList arrayList, a3.l0 l0Var) {
        this.g = 1.0f;
        this.a = null;
        this.b = arrayList;
        this.c = null;
        this.d = l0Var;
        this.e = null;
        this.f = null;
    }

    public g01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.g = 1.0f;
        this.a = null;
        this.b = null;
        this.c = runnable;
        this.d = runnable2;
        this.f = matrix;
        this.e = bitmap;
    }
}
