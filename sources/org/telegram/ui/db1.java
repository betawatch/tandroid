package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class db1 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ UserInfoActivity F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, str, false, false, -1, f6Var);
        this.E = i7;
        this.F = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.g0(true);
                break;
            case 1:
                this.F.g0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, true, false, i7, f6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
