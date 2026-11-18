package org.telegram.ui;

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fb1 extends org.telegram.ui.Cells.l3 {
    public final /* synthetic */ int F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb1(UserInfoActivity userInfoActivity, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
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
    public fb1(UserInfoActivity userInfoActivity, Context context, String str, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, true, false, i7, i6Var);
        this.F = 2;
        this.G = userInfoActivity;
    }
}
