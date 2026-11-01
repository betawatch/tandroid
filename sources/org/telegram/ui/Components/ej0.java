package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ej0 extends hg.b {
    public final sg.o0 c;

    public ej0(int i10, sg.o0 o0Var) {
        super(i10, false);
        this.c = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ej0.class == obj.getClass()) {
            ej0 ej0Var = (ej0) obj;
            int i10 = this.a;
            int i11 = ej0Var.a;
            if (i10 == i11 && (i10 == 0 || i10 == 3)) {
                sg.o0 o0Var = this.c;
                return o0Var != null && o0Var.equals(ej0Var.c);
            }
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }
}
