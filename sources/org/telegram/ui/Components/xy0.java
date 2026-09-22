package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xy0 extends xl0 {
    public final az0 c;
    public final /* synthetic */ az0 d;

    public xy0(az0 az0Var, az0 az0Var2) {
        this.d = az0Var;
        this.c = az0Var2;
    }

    @Override // org.telegram.ui.Components.xl0
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
        zy0 zy0Var = (zy0) c1Var.a;
        az0 az0Var = this.c;
        ArrayList arrayList = az0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = az0Var.getDirection();
        zy0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            zy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = zy0Var.b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    zy0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, zy0Var.f.d()));
                }
            } catch (Exception unused) {
                zy0Var.setImageDrawable(null);
            }
        }
        if (zy0Var.d != direction) {
            zy0Var.d = direction;
            zy0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new il0(new zy0(this.d, this.c.getContext()));
    }
}
