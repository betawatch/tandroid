package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ kx0(wx0 wx0Var, int i10) {
        this.a = i10;
        this.b = wx0Var;
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
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i10 = profileActivity2.k6;
                if (i10 >= 0) {
                    profileActivity2.c.h1(i10, profileActivity2.l6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
