package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qz0 extends lm0 {
    public final tz0 c;
    public final /* synthetic */ tz0 d;

    public qz0(tz0 tz0Var, tz0 tz0Var2) {
        this.d = tz0Var;
        this.c = tz0Var2;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        sz0 sz0Var = (sz0) e1Var.a;
        tz0 tz0Var = this.c;
        ArrayList arrayList = tz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = tz0Var.getDirection();
        sz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            sz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = sz0Var.b;
                if (!(drawable instanceof t5) || ((t5) drawable).i() != parseLong) {
                    sz0Var.setImageDrawable(t5.n(UserConfig.selectedAccount, parseLong, null, sz0Var.f.d()));
                }
            } catch (Exception unused) {
                sz0Var.setImageDrawable(null);
            }
        }
        if (sz0Var.d != direction) {
            sz0Var.d = direction;
            sz0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new vl0(new sz0(this.d, this.c.getContext()));
    }
}
