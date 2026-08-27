package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u8 extends p80 {
    public final /* synthetic */ int H;
    public final /* synthetic */ v8 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(v8 v8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.H = i10;
        this.I = v8Var;
    }

    @Override // org.telegram.ui.Components.p80
    public final int c() {
        switch (this.H) {
            case 0:
                return this.I.a(super.c());
            default:
                return this.I.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.p80
    public final int d(int i10) {
        switch (this.H) {
        }
        return this.I.a(i10);
    }
}
