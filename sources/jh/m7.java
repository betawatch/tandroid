package jh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m7 extends e4 {
    public final /* synthetic */ n7 a4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n7 n7Var, Context context, i9 i9Var, b4 b4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i9Var, b4Var, c6Var);
        this.a4 = n7Var;
    }

    @Override // jh.e4
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.a4.g.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (t.c) {
            t.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.c) {
            t.b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
