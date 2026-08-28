package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r31 implements wu0 {
    public int a;
    public boolean b;
    public final /* synthetic */ s31 c;

    public r31(s31 s31Var) {
        this.c = s31Var;
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        if (this.a == i9 && this.b == z10) {
            return;
        }
        this.a = i9;
        this.b = z10;
        if (i9 > AndroidUtilities.dp(20.0f)) {
            s31 s31Var = this.c;
            if (s31Var.t0) {
                return;
            }
            s31Var.A0.setAllowNestedScroll(false);
            s31Var.t0 = true;
        }
    }
}
