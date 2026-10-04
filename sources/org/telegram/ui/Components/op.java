package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class op {
    public final org.telegram.ui.ActionBar.c4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public op(org.telegram.ui.ActionBar.c4 c4Var) {
        this.a = c4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.c4 c4Var = this.a;
        if (c4Var == null || c4Var.a) {
            return null;
        }
        return c4Var.e;
    }
}
