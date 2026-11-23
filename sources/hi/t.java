package hi;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t {
    public final int a;
    public final Drawable b;
    public final org.telegram.ui.Components.lc c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public final RectF f;
    public String g;
    public wy0 h;
    public wy0 i;
    public float j;
    public boolean k;
    public final /* synthetic */ u l;

    public t(u uVar, int i7) {
        this.l = uVar;
        this.c = new org.telegram.ui.Components.lc(uVar);
        kr krVar = kr.h;
        this.d = new org.telegram.ui.Components.c6(uVar, 0L, 260L, krVar);
        this.e = new org.telegram.ui.Components.c6(uVar, 0L, 260L, krVar);
        this.f = new RectF();
        this.a = i7;
        this.b = uVar.getContext().getResources().getDrawable(i7 < 0 ? R.drawable.caption_arrow_up : R.drawable.caption_arrow_down).mutate();
    }

    public final float a() {
        float L = org.telegram.messenger.g0.L(30.0f);
        int i7 = this.a;
        u uVar = this.l;
        if (i7 < 0) {
            float f10 = L / 2.0f;
            return Math.max(org.telegram.messenger.g0.L(8.0f) + f10, (uVar.h - org.telegram.messenger.g0.L(8.0f)) - f10);
        }
        return (L / 2.0f) + uVar.n + org.telegram.messenger.g0.L(8.0f);
    }

    public final void b(String str) {
        wy0 wy0Var;
        if (TextUtils.equals(str, this.g)) {
            return;
        }
        this.g = str;
        u uVar = this.l;
        if (str == null) {
            wy0Var = null;
        } else {
            wy0 wy0Var2 = new wy0(str, 14.0f, org.telegram.messenger.g0.o());
            wy0Var2.p = i5.c.d(110.0f, uVar.getWidth(), org.telegram.messenger.g0.L(40.0f));
            wy0Var = wy0Var2;
        }
        this.h = wy0Var;
        uVar.invalidate();
    }
}
