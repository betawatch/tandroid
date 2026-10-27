package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rz0 extends mm0 {
    public final uz0 c;
    public final /* synthetic */ uz0 d;

    public rz0(uz0 uz0Var, uz0 uz0Var2) {
        this.d = uz0Var;
        this.c = uz0Var2;
    }

    @Override // org.telegram.ui.Components.mm0
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
        tz0 tz0Var = (tz0) e1Var.a;
        uz0 uz0Var = this.c;
        ArrayList arrayList = uz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = uz0Var.getDirection();
        tz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            tz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = tz0Var.b;
                if (!(drawable instanceof t5) || ((t5) drawable).i() != parseLong) {
                    tz0Var.setImageDrawable(t5.n(UserConfig.selectedAccount, parseLong, null, tz0Var.f.d()));
                }
            } catch (Exception unused) {
                tz0Var.setImageDrawable(null);
            }
        }
        if (tz0Var.d != direction) {
            tz0Var.d = direction;
            tz0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new tz0(this.d, this.c.getContext()));
    }
}
