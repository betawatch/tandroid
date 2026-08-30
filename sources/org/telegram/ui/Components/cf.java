package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cf extends org.telegram.ui.si0 {
    public final /* synthetic */ int x0;
    public final /* synthetic */ Object y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.x0 = i10;
        this.y0 = obj;
    }

    @Override // org.telegram.ui.si0
    public final void m(long j10) {
        switch (this.x0) {
            case 0:
                ((ChatActivityEnterView) this.y0).setEffectId(j10);
                break;
            default:
                li liVar = (li) this.y0;
                vh vhVar = liVar.F0;
                liVar.K0 = j10;
                vhVar.setEffect(j10);
                break;
        }
    }
}
