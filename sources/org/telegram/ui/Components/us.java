package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class us {
    public int a;
    public Object b;

    public boolean a(int i9) {
        if (((ff.l) this.b) != null && this.a == i9) {
            return false;
        }
        this.a = i9;
        this.b = new ff.l(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i9, i9}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
