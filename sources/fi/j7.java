package fi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j7 extends z3 {
    public final /* synthetic */ k7 P3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(k7 k7Var, Context context, f9 f9Var, w3 w3Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, f9Var, w3Var, i6Var);
        this.P3 = k7Var;
    }

    @Override // fi.z3
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
