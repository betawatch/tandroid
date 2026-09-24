package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class uy0 extends vl0 {
    public final xy0 c;
    public final /* synthetic */ xy0 d;

    public uy0(xy0 xy0Var, xy0 xy0Var2) {
        this.d = xy0Var;
        this.c = xy0Var2;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final long i(int i10) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i10)).emoji.hashCode();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        wy0 wy0Var = (wy0) c1Var.a;
        xy0 xy0Var = this.c;
        ArrayList arrayList = xy0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = xy0Var.getDirection();
        wy0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            wy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = wy0Var.b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    wy0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, wy0Var.f.d()));
                }
            } catch (Exception unused) {
                wy0Var.setImageDrawable(null);
            }
        }
        if (wy0Var.d != direction) {
            wy0Var.d = direction;
            wy0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new gl0(new wy0(this.d, this.c.getContext()));
    }
}
