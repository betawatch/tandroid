package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bq {
    public final org.telegram.ui.ActionBar.c4 a;
    public Drawable b;
    public int c;
    public boolean d;
    public Bitmap e;

    public bq(org.telegram.ui.ActionBar.c4 c4Var) {
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
