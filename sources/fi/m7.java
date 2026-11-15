package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m7 extends b4 {
    public final /* synthetic */ n7 P3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n7 n7Var, Context context, i9 i9Var, y3 y3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i9Var, y3Var, e6Var);
        this.P3 = n7Var;
    }

    @Override // fi.b4
    public final boolean I0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.P3.f.getCurrentItem();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (v.c) {
            v.b.add(this);
        } else {
            super.invalidate(i7, i10, i11, i12);
        }
    }
}
