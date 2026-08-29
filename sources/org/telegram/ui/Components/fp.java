package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fp {
    public final org.telegram.ui.ActionBar.b4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public fp(org.telegram.ui.ActionBar.b4 b4Var) {
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
