package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ah1 extends org.telegram.ui.Cells.i3 {
    public final /* synthetic */ int x;
    public final /* synthetic */ UserInfoActivity y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, str, false, false, -1, g6Var);
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
    public ah1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, true, false, i10, g6Var);
        this.x = 2;
        this.y = userInfoActivity;
    }
}
