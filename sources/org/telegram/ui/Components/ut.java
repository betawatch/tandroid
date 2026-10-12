package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ut {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((zf.j) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new zf.j(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
