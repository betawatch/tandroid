package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ly0 extends ll0 {
    public final oy0 c;
    public final /* synthetic */ oy0 d;

    public ly0(oy0 oy0Var, oy0 oy0Var2) {
        this.d = oy0Var;
        this.c = oy0Var2;
    }

    @Override // org.telegram.ui.Components.ll0
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
        ny0 ny0Var = (ny0) c1Var.a;
        oy0 oy0Var = this.c;
        ArrayList arrayList = oy0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = oy0Var.getDirection();
        ny0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            ny0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = ny0Var.b;
                if (!(drawable instanceof o5) || ((o5) drawable).i() != parseLong) {
                    ny0Var.setImageDrawable(o5.n(UserConfig.selectedAccount, parseLong, null, ny0Var.f.d()));
                }
            } catch (Exception unused) {
                ny0Var.setImageDrawable(null);
            }
        }
        if (ny0Var.d != direction) {
            ny0Var.d = direction;
            ny0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new wk0(new ny0(this.d, this.c.getContext()));
    }
}
