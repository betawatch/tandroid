package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((lf.k) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new lf.k(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
