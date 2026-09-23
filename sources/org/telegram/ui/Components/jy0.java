package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jy0 extends ll0 {
    public final my0 c;
    public final /* synthetic */ my0 d;

    public jy0(my0 my0Var, my0 my0Var2) {
        this.d = my0Var;
        this.c = my0Var2;
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
        ly0 ly0Var = (ly0) c1Var.a;
        my0 my0Var = this.c;
        ArrayList arrayList = my0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = my0Var.getDirection();
        ly0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            ly0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = ly0Var.b;
                if (!(drawable instanceof q5) || ((q5) drawable).i() != parseLong) {
                    ly0Var.setImageDrawable(q5.n(UserConfig.selectedAccount, parseLong, null, ly0Var.f.d()));
                }
            } catch (Exception unused) {
                ly0Var.setImageDrawable(null);
            }
        }
        if (ly0Var.d != direction) {
            ly0Var.d = direction;
            ly0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new wk0(new ly0(this.d, this.c.getContext()));
    }
}
