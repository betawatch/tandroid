package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v8 extends z70 {
    public final /* synthetic */ int M;
    public final /* synthetic */ w8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(w8 w8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.M = i7;
        this.N = w8Var;
    }

    @Override // org.telegram.ui.Components.z70
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.z70
    public final int d(int i7) {
        switch (this.M) {
        }
        return this.N.a(i7);
    }
}
