package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ig1 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ UserInfoActivity F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, str, false, false, -1, u6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.c0(true);
                break;
            case 1:
                this.F.c0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.c0(true);
                userInfoActivity.f0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, str, true, false, i10, u6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
