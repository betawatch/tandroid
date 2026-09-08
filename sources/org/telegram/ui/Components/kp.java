package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kp {
    public final org.telegram.ui.ActionBar.d4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public kp(org.telegram.ui.ActionBar.d4 d4Var) {
        this.a = d4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.d4 d4Var = this.a;
        if (d4Var == null || d4Var.a) {
            return null;
        }
        return d4Var.e;
    }
}
