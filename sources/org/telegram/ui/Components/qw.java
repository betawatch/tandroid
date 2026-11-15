package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qw extends gv {
    public final /* synthetic */ ly h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(ly lyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, hv hvVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, hvVar, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, e6Var), z11);
        this.h0 = lyVar;
    }

    @Override // org.telegram.ui.Components.gv
    public final boolean d() {
        return this.h0.V0;
    }

    @Override // org.telegram.ui.Components.gv
    public final void e() {
        ly lyVar = this.h0;
        ArrayList arrayList = lyVar.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.np.s1(lyVar.d1).g7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0);
    }

    @Override // org.telegram.ui.Components.gv
    public final boolean g(zw zwVar) {
        return zwVar.f || this.h0.q1.contains(Long.valueOf(zwVar.b.id));
    }

    @Override // org.telegram.ui.Components.gv
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.gv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7) {
        Integer num;
        int i10;
        xx xxVar;
        ly lyVar = this.h0;
        ArrayList arrayList = lyVar.r1;
        vw vwVar = lyVar.S;
        if (lyVar.g0) {
            return false;
        }
        lx lxVar = lyVar.T;
        if (lxVar != null) {
            lxVar.F(null, true);
        }
        nv nvVar = lyVar.W;
        if (nvVar != null && (xxVar = nvVar.r) != null) {
            xxVar.I1(null);
        }
        if (i7 == 0) {
            num = Integer.valueOf(lyVar.e0 ? 1 : 0);
        } else {
            i7--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.k6.a;
            if (i7 < 8 && vwVar.s.indexOfKey(i7) >= 0) {
                num = Integer.valueOf(vwVar.s.get(i7));
            }
        }
        if (num == null) {
            ArrayList<zw> emojipacks = lyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.k6.a;
            int i11 = i7 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((zw) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = vwVar.s;
                char[] cArr3 = org.telegram.messenger.k6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    lyVar.Q.C0();
                    lyVar.V(num.intValue());
                    lyVar.H(num.intValue(), i10);
                    lyVar.n(0, null);
                }
                return true;
            }
        }
        i10 = 0;
        if (num != null) {
        }
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            ly lyVar = this.h0;
            View view = lyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            lyVar.K.invalidate();
        }
    }
}
