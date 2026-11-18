package a3;

import e2.m1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class t {
    public final m1 a;
    public final int[] b;

    public t(m1 m1Var, int... iArr) {
        if (iArr.length == 0) {
            h2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = m1Var;
        this.b = iArr;
    }
}
