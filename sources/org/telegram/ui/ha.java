package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ha extends oa {
    public final /* synthetic */ int G = 1;
    public final /* synthetic */ org.telegram.ui.Components.ql0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.H = iaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.oa
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ia) this.H).c.r;
            default:
                kg.f fVar = ((dp) this.H).c.X2.a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(dp dpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = dpVar;
    }
}
