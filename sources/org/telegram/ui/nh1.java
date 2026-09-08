package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nh1 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ UserInfoActivity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, str, false, false, -1, f6Var);
        this.x = i10;
        this.y = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                this.y.b0(true);
                break;
            case 1:
                this.y.b0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.y;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, true, false, i10, f6Var);
        this.x = 2;
        this.y = userInfoActivity;
    }
}
