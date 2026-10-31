package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx0 b;

    public /* synthetic */ lx0(xx0 xx0Var, int i10) {
        this.a = i10;
        this.b = xx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.e;
                profileActivity.getMessagesController().u3(profileActivity, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = this.b.e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.S4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i10 = profileActivity2.j6;
                if (i10 >= 0) {
                    profileActivity2.c.h1(i10, profileActivity2.k6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
