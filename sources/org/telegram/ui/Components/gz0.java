package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class gz0 extends yl0 {
    public final jz0 c;
    public final /* synthetic */ jz0 d;

    public gz0(jz0 jz0Var, jz0 jz0Var2) {
        this.d = jz0Var;
        this.c = jz0Var2;
    }

    @Override // org.telegram.ui.Components.yl0
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
        iz0 iz0Var = (iz0) c1Var.a;
        jz0 jz0Var = this.c;
        ArrayList arrayList = jz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = jz0Var.getDirection();
        iz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            iz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = iz0Var.b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    iz0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, iz0Var.f.d()));
                }
            } catch (Exception unused) {
                iz0Var.setImageDrawable(null);
            }
        }
        if (iz0Var.d != direction) {
            iz0Var.d = direction;
            iz0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new il0(new iz0(this.d, this.c.getContext()));
    }
}
