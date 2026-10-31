package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nv0 b;

    public /* synthetic */ kv0(nv0 nv0Var, int i10) {
        this.a = i10;
        this.b = nv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nv0 nv0Var = this.b;
                nv0Var.invalidate();
                org.telegram.messenger.i0.g3(new kv0(nv0Var, 1));
                break;
            default:
                nv0 nv0Var2 = this.b;
                mv0 mv0Var = nv0Var2.e;
                if (mv0Var != null) {
                    nv0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.bv0) mv0Var).b;
                    profileActivity.r.setTranslationX(profileActivity.l4(profileActivity.t6, profileActivity.v6));
                    profileActivity.r.setTranslationY(profileActivity.m4(profileActivity.w6));
                    break;
                }
                break;
        }
    }
}
