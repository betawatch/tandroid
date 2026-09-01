package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oy0 extends sl0 {
    public final ry0 c;
    public final /* synthetic */ ry0 d;

    public oy0(ry0 ry0Var, ry0 ry0Var2) {
        this.d = ry0Var;
        this.c = ry0Var2;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
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
    public final void v(f2.m1 m1Var, int i10) {
        qy0 qy0Var = (qy0) m1Var.a;
        ry0 ry0Var = this.c;
        ArrayList arrayList = ry0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = ry0Var.getDirection();
        qy0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            qy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = qy0Var.b;
                if (!(drawable instanceof l5) || ((l5) drawable).i() != parseLong) {
                    qy0Var.setImageDrawable(l5.n(UserConfig.selectedAccount, parseLong, null, qy0Var.f.d()));
                }
            } catch (Exception unused) {
                qy0Var.setImageDrawable(null);
            }
        }
        if (qy0Var.d != direction) {
            qy0Var.d = direction;
            qy0Var.requestLayout();
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new qy0(this.d, this.c.getContext()));
    }
}
