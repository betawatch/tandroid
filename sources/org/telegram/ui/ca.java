package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ca extends ja {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ org.telegram.ui.Components.vk0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(da daVar, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, b6Var);
        this.G = daVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ja
    public final String getUsernameEditable() {
        switch (this.F) {
            case 0:
                return ((da) this.G).c.r;
            default:
                fg.g gVar = ((to) this.G).c.W2.a;
                if (gVar == null) {
                    return null;
                }
                return gVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(to toVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.G = toVar;
    }
}
