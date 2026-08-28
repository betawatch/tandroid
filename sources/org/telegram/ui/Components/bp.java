package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bp {
    public final org.telegram.ui.ActionBar.b4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public bp(org.telegram.ui.ActionBar.b4 b4Var) {
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
