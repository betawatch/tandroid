package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zs {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((jf.k) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new jf.k(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
