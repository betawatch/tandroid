package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ez0 extends hm0 {
    public final hz0 c;
    public final /* synthetic */ hz0 d;

    public ez0(hz0 hz0Var, hz0 hz0Var2) {
        this.d = hz0Var;
        this.c = hz0Var2;
    }

    @Override // org.telegram.ui.Components.hm0
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
        gz0 gz0Var = (gz0) b1Var.a;
        hz0 hz0Var = this.c;
        ArrayList arrayList = hz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = hz0Var.getDirection();
        gz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            gz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = gz0Var.b;
                if (!(drawable instanceof r5) || ((r5) drawable).i() != parseLong) {
                    gz0Var.setImageDrawable(r5.n(UserConfig.selectedAccount, parseLong, null, gz0Var.f.d()));
                }
            } catch (Exception unused) {
                gz0Var.setImageDrawable(null);
            }
        }
        if (gz0Var.d != direction) {
            gz0Var.d = direction;
            gz0Var.requestLayout();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new sl0(new gz0(this.d, this.c.getContext()));
    }
}
