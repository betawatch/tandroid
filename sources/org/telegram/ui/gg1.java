package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class gg1 extends org.telegram.ui.Cells.h3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ UserInfoActivity F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, str, false, false, -1, g6Var);
        this.E = i10;
        this.F = userInfoActivity;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        switch (this.E) {
            case 0:
                this.F.b0(true);
                break;
            case 1:
                this.F.b0(true);
                break;
            default:
                UserInfoActivity userInfoActivity = this.F;
                userInfoActivity.b0(true);
                userInfoActivity.e0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(UserInfoActivity userInfoActivity, Context context, String str, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, true, false, i10, g6Var);
        this.E = 2;
        this.F = userInfoActivity;
    }
}
