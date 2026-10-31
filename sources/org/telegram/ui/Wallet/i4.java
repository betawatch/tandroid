package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.a51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements org.telegram.ui.ActionBar.u1, o20, p20 {
    public final /* synthetic */ b6 a;

    public /* synthetic */ i4(b6 b6Var) {
        this.a = b6Var;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(this.a.b0(a51Var, view));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        b6 b6Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
            b6Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.a0((a51) obj, (View) obj2);
    }
}
