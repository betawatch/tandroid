package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class fz0 extends yl0 {
    public final iz0 c;
    public final /* synthetic */ iz0 d;

    public fz0(iz0 iz0Var, iz0 iz0Var2) {
        this.d = iz0Var;
        this.c = iz0Var2;
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
        hz0 hz0Var = (hz0) c1Var.a;
        iz0 iz0Var = this.c;
        ArrayList arrayList = iz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = iz0Var.getDirection();
        hz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            hz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = hz0Var.b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    hz0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, hz0Var.f.d()));
                }
            } catch (Exception unused) {
                hz0Var.setImageDrawable(null);
            }
        }
        if (hz0Var.d != direction) {
            hz0Var.d = direction;
            hz0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new il0(new hz0(this.d, this.c.getContext()));
    }
}
