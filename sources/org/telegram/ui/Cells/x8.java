package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x8 extends m80 {
    public final /* synthetic */ int M;
    public final /* synthetic */ y8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(y8 y8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.M = i7;
        this.N = y8Var;
    }

    @Override // org.telegram.ui.Components.m80
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.m80
    public final int d(int i7) {
        switch (this.M) {
        }
        return this.N.a(i7);
    }
}
