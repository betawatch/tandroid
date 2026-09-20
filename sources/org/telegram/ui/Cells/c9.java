package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.k90;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c9 extends k90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ d9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(d9 d9Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.L = i10;
        this.M = d9Var;
    }

    @Override // org.telegram.ui.Components.k90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.k90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
