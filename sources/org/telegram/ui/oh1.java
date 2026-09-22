package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class oh1 extends org.telegram.ui.Cells.k3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ UserInfoActivity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, str, false, false, -1, f6Var);
        this.x = i10;
        this.y = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.k3
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
    public oh1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, true, false, i10, f6Var);
        this.x = 2;
        this.y = userInfoActivity;
    }
}
