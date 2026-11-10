package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mw0 b;

    public /* synthetic */ bw0(mw0 mw0Var, int i7) {
        this.a = i7;
        this.b = mw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.d1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = this.b.e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i7 = profileActivity2.n6;
                if (i7 >= 0) {
                    profileActivity2.c.h1(i7, profileActivity2.o6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
