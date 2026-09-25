package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class fh1 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ UserInfoActivity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, str, false, false, -1, d6Var);
        this.x = i10;
        this.y = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.j3
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
    public fh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, true, false, i10, d6Var);
        this.x = 2;
        this.y = userInfoActivity;
    }
}
