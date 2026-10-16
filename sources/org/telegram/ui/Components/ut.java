package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
