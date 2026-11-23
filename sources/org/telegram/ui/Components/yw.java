package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yw extends ov {
    public final /* synthetic */ ty h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(ty tyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, pv pvVar, boolean z11) {
        super(context, h6Var, true, false, true, z10, 0, pvVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, h6Var), z11);
        this.h0 = tyVar;
    }

    @Override // org.telegram.ui.Components.ov
    public final boolean d() {
        return this.h0.V0;
    }

    @Override // org.telegram.ui.Components.ov
    public final void e() {
        ty tyVar = this.h0;
        ArrayList arrayList = tyVar.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.np.u1(tyVar.d1).i7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0);
    }

    @Override // org.telegram.ui.Components.ov
    public final boolean g(hx hxVar) {
        return hxVar.f || this.h0.q1.contains(Long.valueOf(hxVar.b.id));
    }

    @Override // org.telegram.ui.Components.ov
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7) {
        Integer num;
        int i10;
        fy fyVar;
        ty tyVar = this.h0;
        ArrayList arrayList = tyVar.r1;
        dx dxVar = tyVar.S;
        if (tyVar.g0) {
            return false;
        }
        sx sxVar = tyVar.T;
        if (sxVar != null) {
            sxVar.F(null, true);
        }
        vv vvVar = tyVar.W;
        if (vvVar != null && (fyVar = vvVar.r) != null) {
            fyVar.I1(null);
        }
        if (i7 == 0) {
            num = Integer.valueOf(tyVar.e0 ? 1 : 0);
        } else {
            i7--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.k6.a;
            if (i7 < 8 && dxVar.s.indexOfKey(i7) >= 0) {
                num = Integer.valueOf(dxVar.s.get(i7));
            }
        }
        if (num == null) {
            ArrayList<hx> emojipacks = tyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.k6.a;
            int i11 = i7 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((hx) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = dxVar.s;
                char[] cArr3 = org.telegram.messenger.k6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    tyVar.Q.C0();
                    tyVar.V(num.intValue());
                    tyVar.G(num.intValue(), i10);
                    tyVar.n(0, null);
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
            ty tyVar = this.h0;
            View view = tyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            tyVar.K.invalidate();
        }
    }
}
