package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class dz0 extends hm0 {
    public final gz0 c;
    public final /* synthetic */ gz0 d;

    public dz0(gz0 gz0Var, gz0 gz0Var2) {
        this.d = gz0Var;
        this.c = gz0Var2;
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
        fz0 fz0Var = (fz0) b1Var.a;
        gz0 gz0Var = this.c;
        ArrayList arrayList = gz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = gz0Var.getDirection();
        fz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            fz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = fz0Var.b;
                if (!(drawable instanceof r5) || ((r5) drawable).i() != parseLong) {
                    fz0Var.setImageDrawable(r5.n(UserConfig.selectedAccount, parseLong, null, fz0Var.f.d()));
                }
            } catch (Exception unused) {
                fz0Var.setImageDrawable(null);
            }
        }
        if (fz0Var.d != direction) {
            fz0Var.d = direction;
            fz0Var.requestLayout();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new sl0(new fz0(this.d, this.c.getContext()));
    }
}
