package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ky0 extends kl0 {
    public final ny0 c;
    public final /* synthetic */ ny0 d;

    public ky0(ny0 ny0Var, ny0 ny0Var2) {
        this.d = ny0Var;
        this.c = ny0Var2;
    }

    @Override // org.telegram.ui.Components.kl0
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
        my0 my0Var = (my0) c1Var.a;
        ny0 ny0Var = this.c;
        ArrayList arrayList = ny0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = ny0Var.getDirection();
        my0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            my0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = my0Var.b;
                if (!(drawable instanceof o5) || ((o5) drawable).i() != parseLong) {
                    my0Var.setImageDrawable(o5.n(UserConfig.selectedAccount, parseLong, null, my0Var.f.d()));
                }
            } catch (Exception unused) {
                my0Var.setImageDrawable(null);
            }
        }
        if (my0Var.d != direction) {
            my0Var.d = direction;
            my0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new my0(this.d, this.c.getContext()));
    }
}
