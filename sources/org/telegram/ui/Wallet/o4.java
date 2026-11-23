package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements org.telegram.ui.ActionBar.q1, w10, x10 {
    public final /* synthetic */ n6 a;

    public /* synthetic */ o4(n6 n6Var) {
        this.a = n6Var;
    }

    @Override // org.telegram.messenger.x10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.a.c0(o41Var, view));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        n6 n6Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            n6Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.b0((o41) obj, (View) obj2);
    }
}
