package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wy0 extends ul0 {
    public final zy0 c;
    public final /* synthetic */ zy0 d;

    public wy0(zy0 zy0Var, zy0 zy0Var2) {
        this.d = zy0Var;
        this.c = zy0Var2;
    }

    @Override // org.telegram.ui.Components.ul0
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
        yy0 yy0Var = (yy0) c1Var.a;
        zy0 zy0Var = this.c;
        ArrayList arrayList = zy0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = zy0Var.getDirection();
        yy0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            yy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = yy0Var.b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    yy0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, yy0Var.f.d()));
                }
            } catch (Exception unused) {
                yy0Var.setImageDrawable(null);
            }
        }
        if (yy0Var.d != direction) {
            yy0Var.d = direction;
            yy0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new yy0(this.d, this.c.getContext()));
    }
}
