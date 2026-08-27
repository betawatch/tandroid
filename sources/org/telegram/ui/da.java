package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class da extends ka {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ org.telegram.ui.Components.yk0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.G = eaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ka
    public final String getUsernameEditable() {
        switch (this.F) {
            case 0:
                return ((ea) this.G).c.r;
            default:
                gg.g gVar = ((vo) this.G).c.W2.a;
                if (gVar == null) {
                    return null;
                }
                return gVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(vo voVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = voVar;
    }
}
