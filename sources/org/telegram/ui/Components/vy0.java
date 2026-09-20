package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vy0 extends ul0 {
    public final yy0 c;
    public final /* synthetic */ yy0 d;

    public vy0(yy0 yy0Var, yy0 yy0Var2) {
        this.d = yy0Var;
        this.c = yy0Var2;
    }

    @Override // org.telegram.ui.Components.ul0
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
        xy0 xy0Var = (xy0) c1Var.a;
        yy0 yy0Var = this.c;
        ArrayList arrayList = yy0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = yy0Var.getDirection();
        xy0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            xy0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = xy0Var.b;
                if (!(drawable instanceof p5) || ((p5) drawable).i() != parseLong) {
                    xy0Var.setImageDrawable(p5.n(UserConfig.selectedAccount, parseLong, null, xy0Var.f.d()));
                }
            } catch (Exception unused) {
                xy0Var.setImageDrawable(null);
            }
        }
        if (xy0Var.d != direction) {
            xy0Var.d = direction;
            xy0Var.requestLayout();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new xy0(this.d, this.c.getContext()));
    }
}
