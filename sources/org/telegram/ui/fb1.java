package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fb1 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, str, false, false, -1, i6Var);
        this.F = i7;
        this.G = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.k3
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
    public fb1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, true, false, i7, i6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
