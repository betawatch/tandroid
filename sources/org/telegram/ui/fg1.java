package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fg1 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ UserInfoActivity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, str, false, false, -1, b6Var);
        this.x = i9;
        this.y = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        switch (this.x) {
            case 0:
                this.y.a0(true);
                break;
            case 1:
                this.y.a0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.y;
                userInfoActivity.a0(true);
                userInfoActivity.d0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg1(UserInfoActivity userInfoActivity, Context context, String str, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, str, true, false, i9, b6Var);
        this.x = 2;
        this.y = userInfoActivity;
    }
}
