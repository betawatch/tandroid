package ig;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j extends d {
    public final k5 r;
    public Object s;

    public j(Context context, f6 f6Var) {
        super(context, f6Var);
        this.c.setVisibility(8);
        k5 k5Var = this.e;
        int i10 = j6.B6;
        k5Var.setTextColor(j6.v0(i10, f6Var));
        k5 k5Var2 = new k5(context);
        this.r = k5Var2;
        k5Var2.setTextSize(16);
        k5Var2.setTextColor(j6.v0(i10, f6Var));
        k5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k5Var2);
        boolean z4 = LocaleController.isRTL;
        k5Var2.setLayoutParams(b6.d(-1, -2.0f, (z4 ? 3 : 5) | 16, z4 ? 20.0f : 0.0f, 0.0f, z4 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // ig.d
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.s;
    }
}
