package dg;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j extends d {
    public final h5 r;
    public Object s;

    public j(Context context, b6 b6Var) {
        super(context, b6Var);
        this.c.setVisibility(8);
        h5 h5Var = this.e;
        int i9 = f6.B6;
        h5Var.setTextColor(f6.v0(i9, b6Var));
        h5 h5Var2 = new h5(context);
        this.r = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(f6.v0(i9, b6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        boolean z10 = LocaleController.isRTL;
        h5Var2.setLayoutParams(e6.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // dg.d
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
