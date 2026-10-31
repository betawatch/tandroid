package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ c(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    fVar.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                f fVar2 = this.b;
                fVar2.getClass();
                hf0 hf0Var = new hf0();
                hf0Var.F = 2;
                fVar2.presentFragment(hf0Var, true);
                break;
        }
    }
}
