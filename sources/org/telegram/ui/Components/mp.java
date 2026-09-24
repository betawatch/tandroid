package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mp {
    public final org.telegram.ui.ActionBar.b4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public mp(org.telegram.ui.ActionBar.b4 b4Var) {
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
