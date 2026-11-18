package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w8 extends k80 {
    public final /* synthetic */ int M;
    public final /* synthetic */ x8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(x8 x8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.M = i7;
        this.N = x8Var;
    }

    @Override // org.telegram.ui.Components.k80
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.k80
    public final int d(int i7) {
        switch (this.M) {
        }
        return this.N.a(i7);
    }
}
