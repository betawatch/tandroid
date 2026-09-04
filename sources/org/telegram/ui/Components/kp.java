package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
