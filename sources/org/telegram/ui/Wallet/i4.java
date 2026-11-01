package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements org.telegram.ui.ActionBar.u1, p20, q20 {
    public final /* synthetic */ b6 a;

    public /* synthetic */ i4(b6 b6Var) {
        this.a = b6Var;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(this.a.c0(b51Var, view));
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

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.b0((b51) obj, (View) obj2);
    }
}
