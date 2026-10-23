package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class iz0 extends lm0 {
    public final lz0 c;
    public final /* synthetic */ lz0 d;

    public iz0(lz0 lz0Var, lz0 lz0Var2) {
        this.d = lz0Var;
        this.c = lz0Var2;
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
        kz0 kz0Var = (kz0) b1Var.a;
        lz0 lz0Var = this.c;
        ArrayList arrayList = lz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = lz0Var.getDirection();
        kz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            kz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = kz0Var.b;
                if (!(drawable instanceof r5) || ((r5) drawable).i() != parseLong) {
                    kz0Var.setImageDrawable(r5.n(UserConfig.selectedAccount, parseLong, null, kz0Var.f.d()));
                }
            } catch (Exception unused) {
                kz0Var.setImageDrawable(null);
            }
        }
        if (kz0Var.d != direction) {
            kz0Var.d = direction;
            kz0Var.requestLayout();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new kz0(this.d, this.c.getContext()));
    }
}
