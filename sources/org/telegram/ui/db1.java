package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class db1 extends org.telegram.ui.Cells.l3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, str, false, false, -1, i6Var);
        this.F = i7;
        this.G = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.l3
    public final void b(Editable editable) {
        switch (this.F) {
            case 0:
                this.G.g0(true);
                break;
            case 1:
                this.G.g0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.G;
                userInfoActivity.g0(true);
                userInfoActivity.j0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, true, false, i7, i6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
