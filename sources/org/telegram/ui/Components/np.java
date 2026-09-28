package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class np {
    public final org.telegram.ui.ActionBar.b4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public np(org.telegram.ui.ActionBar.b4 b4Var) {
        this.a = b4Var;
    }

    public final String a() {
        org.telegram.ui.ActionBar.b4 b4Var = this.a;
        if (b4Var == null || b4Var.a) {
            return null;
        }
        return b4Var.e;
    }
}
