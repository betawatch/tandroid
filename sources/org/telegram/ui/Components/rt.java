package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((ag.o) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new ag.o(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
