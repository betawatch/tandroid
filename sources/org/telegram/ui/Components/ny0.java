package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ny0 extends rl0 {
    public final qy0 c;
    public final /* synthetic */ qy0 d;

    public ny0(qy0 qy0Var, qy0 qy0Var2) {
        this.d = qy0Var;
        this.c = qy0Var2;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.o0
    public final long i(int i10) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i10)).emoji.hashCode();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        py0 py0Var = (py0) l1Var.a;
        qy0 qy0Var = this.c;
        ArrayList arrayList = qy0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = qy0Var.getDirection();
        py0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            py0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = py0Var.b;
                if (!(drawable instanceof l5) || ((l5) drawable).i() != parseLong) {
                    py0Var.setImageDrawable(l5.n(UserConfig.selectedAccount, parseLong, null, py0Var.f.d()));
                }
            } catch (Exception unused) {
                py0Var.setImageDrawable(null);
            }
        }
        if (py0Var.d != direction) {
            py0Var.d = direction;
            py0Var.requestLayout();
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new el0(new py0(this.d, this.c.getContext()));
    }
}
