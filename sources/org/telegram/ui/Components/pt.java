package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pt {
    public int a;
    public Object b;

    public boolean a(int i10) {
        if (((zf.i) this.b) != null && this.a == i10) {
            return false;
        }
        this.a = i10;
        this.b = new zf.i(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, null, Shader.TileMode.CLAMP);
        return true;
    }
}
