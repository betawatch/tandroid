package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w8 extends x70 {
    public final /* synthetic */ int L;
    public final /* synthetic */ x8 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(x8 x8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.L = i7;
        this.M = x8Var;
    }

    @Override // org.telegram.ui.Components.x70
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.x70
    public final int d(int i7) {
        switch (this.L) {
        }
        return this.M.a(i7);
    }
}
