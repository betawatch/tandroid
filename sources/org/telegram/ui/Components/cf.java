package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cf extends org.telegram.ui.ui0 {
    public final /* synthetic */ int x0;
    public final /* synthetic */ Object y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.x0 = i10;
        this.y0 = obj;
    }

    @Override // org.telegram.ui.ui0
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
