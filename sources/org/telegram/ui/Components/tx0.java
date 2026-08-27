package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tx0 extends yk0 {
    public final wx0 c;
    public final /* synthetic */ wx0 d;

    public tx0(wx0 wx0Var, wx0 wx0Var2) {
        this.d = wx0Var;
        this.c = wx0Var2;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.c.w;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.q0
    public final long i(int i10) {
        if (this.c.w == null) {
            return 0L;
        }
        return ((MediaDataController.KeywordResult) r0.get(i10)).emoji.hashCode();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        vx0 vx0Var = (vx0) o1Var.a;
        wx0 wx0Var = this.c;
        ArrayList arrayList = wx0Var.w;
        String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i10)).emoji;
        int direction = wx0Var.getDirection();
        vx0Var.a = str;
        if (str == null || !str.startsWith("animated_")) {
            vx0Var.setImageDrawable(Emoji.getEmojiBigDrawable(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = vx0Var.b;
                if (!(drawable instanceof k5) || ((k5) drawable).i() != parseLong) {
                    vx0Var.setImageDrawable(k5.n(UserConfig.selectedAccount, parseLong, null, vx0Var.f.d()));
                }
            } catch (Exception unused) {
                vx0Var.setImageDrawable(null);
            }
        }
        if (vx0Var.d != direction) {
            vx0Var.d = direction;
            vx0Var.requestLayout();
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new vx0(this.d, this.c.getContext()));
    }
}
