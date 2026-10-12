package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hz0 extends lm0 {
    public final kz0 c;
    public final /* synthetic */ kz0 d;

    public hz0(kz0 kz0Var, kz0 kz0Var2) {
        this.d = kz0Var;
        this.c = kz0Var2;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final long i(int i10) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i10)).emoji.hashCode();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        jz0 jz0Var = (jz0) b1Var.a;
        kz0 kz0Var = this.c;
        ArrayList arrayList = kz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = kz0Var.getDirection();
        jz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            jz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = jz0Var.b;
                if (!(drawable instanceof s5) || ((s5) drawable).i() != parseLong) {
                    jz0Var.setImageDrawable(s5.n(UserConfig.selectedAccount, parseLong, null, jz0Var.f.d()));
                }
            } catch (Exception unused) {
                jz0Var.setImageDrawable(null);
            }
        }
        if (jz0Var.d != direction) {
            jz0Var.d = direction;
            jz0Var.requestLayout();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new jz0(this.d, this.c.getContext()));
    }
}
