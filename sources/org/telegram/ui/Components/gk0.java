package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class gk0 extends og.a {
    public final zg.o0 c;

    public gk0(int i10, zg.o0 o0Var) {
        super(i10, false);
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gk0.class == obj.getClass()) {
            gk0 gk0Var = (gk0) obj;
            int i10 = this.a;
            int i11 = gk0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                zg.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(gk0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
