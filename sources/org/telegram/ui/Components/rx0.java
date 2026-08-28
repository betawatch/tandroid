package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rx0 extends vk0 {
    public final ux0 c;
    public final /* synthetic */ ux0 d;

    public rx0(ux0 ux0Var, ux0 ux0Var2) {
        this.d = ux0Var;
        this.c = ux0Var2;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.r0
    public final long i(int i9) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i9)).emoji.hashCode();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        tx0 tx0Var = (tx0) q1Var.a;
        ux0 ux0Var = this.c;
        ArrayList arrayList = ux0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i9)).emoji;
        int direction = ux0Var.getDirection();
        tx0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            tx0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = tx0Var.b;
                if (!(drawable instanceof k5) || ((k5) drawable).i() != parseLong) {
                    tx0Var.setImageDrawable(k5.n(UserConfig.selectedAccount, parseLong, null, tx0Var.f.d()));
                }
            } catch (Exception unused) {
                tx0Var.setImageDrawable(null);
            }
        }
        if (tx0Var.d != direction) {
            tx0Var.d = direction;
            tx0Var.requestLayout();
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new ik0(new tx0(this.d, this.c.getContext()));
    }
}
