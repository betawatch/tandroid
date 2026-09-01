package org.telegram.ui.Components;

import android.graphics.Shader;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ft {
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
