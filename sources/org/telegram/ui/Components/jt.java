package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class jt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((yf.i) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new yf.i(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
