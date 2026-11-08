package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class lw extends bv {
    public final /* synthetic */ hy g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(hy hyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, cv cvVar, boolean z10) {
        super(context, f6Var, true, false, true, z9, 0, cvVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var), z10);
        this.g0 = hyVar;
    }

    @Override // org.telegram.ui.Components.bv
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.bv
    public final void e() {
        hy hyVar = this.g0;
        ArrayList arrayList = hyVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.qp.s1(hyVar.c1).f7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0);
    }

    @Override // org.telegram.ui.Components.bv
    public final boolean g(uw uwVar) {
        return uwVar.f || this.g0.p1.contains(Long.valueOf(uwVar.b.id));
    }

    @Override // org.telegram.ui.Components.bv
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7) {
        Integer num;
        int i10;
        tx txVar;
        hy hyVar = this.g0;
        ArrayList arrayList = hyVar.q1;
        qw qwVar = hyVar.R;
        if (hyVar.f0) {
            return false;
        }
        hx hxVar = hyVar.S;
        if (hxVar != null) {
            hxVar.F(null, true);
        }
        iv ivVar = hyVar.V;
        if (ivVar != null && (txVar = ivVar.r) != null) {
            txVar.I1(null);
        }
        if (i7 == 0) {
            num = Integer.valueOf(hyVar.d0 ? 1 : 0);
        } else {
            i7--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.j6.a;
            if (i7 < 8 && qwVar.s.indexOfKey(i7) >= 0) {
                num = Integer.valueOf(qwVar.s.get(i7));
            }
        }
        if (num == null) {
            ArrayList<uw> emojipacks = hyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.j6.a;
            int i11 = i7 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((uw) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = qwVar.s;
                char[] cArr3 = org.telegram.messenger.j6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    hyVar.P.C0();
                    hyVar.U(num.intValue());
                    hyVar.G(num.intValue(), i10);
                    hyVar.n(0, null);
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
            hy hyVar = this.g0;
            View view = hyVar.O;
            if (view != null) {
                view.setTranslationY(f10);
            }
            hyVar.J.invalidate();
        }
    }
}
