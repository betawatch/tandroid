package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cf extends org.telegram.ui.li0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf(Object obj, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.w0 = i9;
        this.x0 = obj;
    }

    @Override // org.telegram.ui.li0
    public final void m(long j10) {
        switch (this.w0) {
            case 0:
                ((ChatActivityEnterView) this.x0).setEffectId(j10);
                break;
            default:
                ki kiVar = (ki) this.x0;
                vh vhVar = kiVar.E0;
                kiVar.J0 = j10;
                vhVar.setEffect(j10);
                break;
        }
    }
}
