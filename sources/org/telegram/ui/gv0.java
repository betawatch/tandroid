package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv0 implements org.telegram.messenger.zr, ms {
    public final /* synthetic */ ProfileActivity a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ gv0(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override // org.telegram.ui.ms
    public void a() {
        ProfileActivity.a0(this.a, this.b);
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack)) instanceof un) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.M1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(profileActivity.h1), this.b, profileActivity.D2, Boolean.valueOf(z10));
    }
}
