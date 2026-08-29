package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ff extends org.telegram.ui.ki0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.w0 = i10;
        this.x0 = obj;
    }

    @Override // org.telegram.ui.ki0
    public final void m(long j10) {
        switch (this.w0) {
            case 0:
                ((ChatActivityEnterView) this.x0).setEffectId(j10);
                break;
            default:
                ni niVar = (ni) this.x0;
                yh yhVar = niVar.E0;
                niVar.J0 = j10;
                yhVar.setEffect(j10);
                break;
        }
    }
}
