package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class kw extends av {
    public final /* synthetic */ gy g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(gy gyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, bv bvVar, boolean z10) {
        super(context, f6Var, true, false, true, z9, 0, bvVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var), z10);
        this.g0 = gyVar;
    }

    @Override // org.telegram.ui.Components.av
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.av
    public final void e() {
        gy gyVar = this.g0;
        ArrayList arrayList = gyVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.qp.s1(gyVar.c1).f7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0);
    }

    @Override // org.telegram.ui.Components.av
    public final boolean g(tw twVar) {
        return twVar.f || this.g0.p1.contains(Long.valueOf(twVar.b.id));
    }

    @Override // org.telegram.ui.Components.av
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.av
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7) {
        Integer num;
        int i10;
        sx sxVar;
        gy gyVar = this.g0;
        ArrayList arrayList = gyVar.q1;
        pw pwVar = gyVar.R;
        if (gyVar.f0) {
            return false;
        }
        gx gxVar = gyVar.S;
        if (gxVar != null) {
            gxVar.F(null, true);
        }
        hv hvVar = gyVar.V;
        if (hvVar != null && (sxVar = hvVar.r) != null) {
            sxVar.I1(null);
        }
        if (i7 == 0) {
            num = Integer.valueOf(gyVar.d0 ? 1 : 0);
        } else {
            i7--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.j6.a;
            if (i7 < 8 && pwVar.s.indexOfKey(i7) >= 0) {
                num = Integer.valueOf(pwVar.s.get(i7));
            }
        }
        if (num == null) {
            ArrayList<tw> emojipacks = gyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.j6.a;
            int i11 = i7 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((tw) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = pwVar.s;
                char[] cArr3 = org.telegram.messenger.j6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    gyVar.P.C0();
                    gyVar.U(num.intValue());
                    gyVar.G(num.intValue(), i10);
                    gyVar.n(0, null);
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
            gy gyVar = this.g0;
            View view = gyVar.O;
            if (view != null) {
                view.setTranslationY(f10);
            }
            gyVar.J.invalidate();
        }
    }
}
