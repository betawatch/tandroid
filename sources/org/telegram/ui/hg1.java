package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hg1 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ UserInfoActivity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, str, false, false, -1, c6Var);
        this.x = i10;
        this.y = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.g3
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
    public hg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, true, false, i10, c6Var);
        this.x = 2;
        this.y = userInfoActivity;
    }
}
