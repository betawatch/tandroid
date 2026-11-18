package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements org.telegram.ui.ActionBar.r1, v10, w10 {
    public final /* synthetic */ n6 a;

    public /* synthetic */ o4(n6 n6Var) {
        this.a = n6Var;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.a.c0(l41Var, view));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        n6 n6Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            n6Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.b0((l41) obj, (View) obj2);
    }
}
