package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cy0 extends il0 {
    public final fy0 c;
    public final /* synthetic */ fy0 d;

    public cy0(fy0 fy0Var, fy0 fy0Var2) {
        this.d = fy0Var;
        this.c = fy0Var2;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.p0
    public final long i(int i10) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i10)).emoji.hashCode();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ey0 ey0Var = (ey0) n1Var.a;
        fy0 fy0Var = this.c;
        ArrayList arrayList = fy0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = fy0Var.getDirection();
        ey0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            ey0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = ey0Var.b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    ey0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, ey0Var.f.d()));
                }
            } catch (Exception unused) {
                ey0Var.setImageDrawable(null);
            }
        }
        if (ey0Var.d != direction) {
            ey0Var.d = direction;
            ey0Var.requestLayout();
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new ey0(this.d, this.c.getContext()));
    }
}
