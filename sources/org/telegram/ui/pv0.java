package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ pv0(bw0 bw0Var, int i3) {
        this.a = i3;
        this.b = bw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.e1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = this.b.e;
                profileActivity2.P4 = !profileActivity2.P4;
                if (!profileActivity2.O4) {
                    profileActivity2.O4 = true;
                }
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.O3);
                int i3 = profileActivity2.l6;
                if (i3 >= 0) {
                    profileActivity2.c.h1(i3, profileActivity2.m6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
