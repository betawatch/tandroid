package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ c(g gVar, int i7) {
        this.a = i7;
        this.b = gVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.b;
                gVar2.getClass();
                de0 de0Var = new de0();
                de0Var.G = 2;
                gVar2.presentFragment(de0Var, true);
                break;
        }
    }
}
