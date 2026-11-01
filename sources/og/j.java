package og;

import android.content.Context;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j extends d {
    public final u5 s;
    public Object w;

    public j(Context context, p6 p6Var) {
        super(context, p6Var);
        this.c.setVisibility(8);
        u5 u5Var = this.e;
        int i10 = t6.B6;
        a7.Y(u5Var, i10, p6Var);
        u5 u5Var2 = new u5(context);
        this.s = u5Var2;
        u5Var2.setTextSize(16);
        a7.Y(u5Var2, i10, p6Var);
        u5Var2.setGravity(dd.X ? 3 : 5);
        addView(u5Var2);
        boolean z10 = dd.X;
        u5Var2.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override // og.d
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
