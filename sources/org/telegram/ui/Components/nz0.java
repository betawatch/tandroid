package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class nz0 {
    public final View a;
    public final ArrayList b;
    public final Runnable c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f;
    public float g;

    public nz0(View view, Runnable runnable) {
        this.g = 1.0f;
        this.a = view;
        this.b = null;
        this.c = null;
        this.d = runnable;
        this.e = null;
        this.f = null;
    }

    public nz0(ArrayList arrayList, es0 es0Var) {
        this.g = 1.0f;
        this.a = null;
        this.b = arrayList;
        this.c = null;
        this.d = es0Var;
        this.e = null;
        this.f = null;
    }

    public nz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.g = 1.0f;
        this.a = null;
        this.b = null;
        this.c = runnable;
        this.d = runnable2;
        this.f = matrix;
        this.e = bitmap;
    }
}
