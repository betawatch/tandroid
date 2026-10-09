package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lz0 extends pm0 {
    public final oz0 c;
    public final /* synthetic */ oz0 d;

    public lz0(oz0 oz0Var, oz0 oz0Var2) {
        this.d = oz0Var;
        this.c = oz0Var2;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.i0
    public final long i(int i10) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i10)).emoji.hashCode();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        nz0 nz0Var = (nz0) d1Var.a;
        oz0 oz0Var = this.c;
        ArrayList arrayList = oz0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = oz0Var.getDirection();
        nz0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            nz0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = nz0Var.b;
                if (!(drawable instanceof s5) || ((s5) drawable).i() != parseLong) {
                    nz0Var.setImageDrawable(s5.n(UserConfig.selectedAccount, parseLong, null, nz0Var.f.d()));
                }
            } catch (Exception unused) {
                nz0Var.setImageDrawable(null);
            }
        }
        if (nz0Var.d != direction) {
            nz0Var.d = direction;
            nz0Var.requestLayout();
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new am0(new nz0(this.d, this.c.getContext()));
    }
}
