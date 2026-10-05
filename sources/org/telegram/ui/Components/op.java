package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
