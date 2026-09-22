package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ha extends oa {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.xl0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = iaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.oa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).c.r;
            default:
                ci.h2 h2Var = ((gp) this.K).c.a3.a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(gp gpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = gpVar;
    }
}
