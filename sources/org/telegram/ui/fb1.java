package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fb1 extends org.telegram.ui.Cells.l3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, str, false, false, -1, h6Var);
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
    public fb1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, str, true, false, i7, h6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
