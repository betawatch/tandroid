package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zw extends mv {
    public final /* synthetic */ vy g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(vy vyVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, nv nvVar, boolean z11) {
        super(context, p6Var, true, false, true, z10, 0, nvVar, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var), z11);
        this.g0 = vyVar;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.mv
    public final void e() {
        vy vyVar = this.g0;
        ArrayList arrayList = vyVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.vp.r1(vyVar.c1).g7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0);
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean g(ix ixVar) {
        return ixVar.f || this.g0.p1.contains(Long.valueOf(ixVar.b.id));
    }

    @Override // org.telegram.ui.Components.mv
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.mv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        hy hyVar;
        vy vyVar = this.g0;
        ArrayList arrayList = vyVar.q1;
        ex exVar = vyVar.R;
        if (vyVar.f0) {
            return false;
        }
        ux uxVar = vyVar.S;
        if (uxVar != null) {
            uxVar.F(null, true);
        }
        tv tvVar = vyVar.V;
        if (tvVar != null && (hyVar = tvVar.r) != null) {
            hyVar.I1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(vyVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.l6.a;
            if (i10 < 8 && exVar.s.indexOfKey(i10) >= 0) {
                num = Integer.valueOf(exVar.s.get(i10));
            }
        }
        if (num == null) {
            ArrayList<ix> emojipacks = vyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.l6.a;
            int i12 = i10 - 8;
            if (emojipacks != null && i12 >= 0 && i12 < emojipacks.size()) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    if (((ix) arrayList.get(i13)).b.id == emojipacks.get(i12).b.id) {
                        break;
                    }
                    i13++;
                }
                SparseIntArray sparseIntArray = exVar.s;
                char[] cArr3 = org.telegram.messenger.l6.a;
                num = Integer.valueOf(sparseIntArray.get(i13 + 8));
                i11 = org.telegram.messenger.i0.L(-9.0f);
                if (num != null) {
                    vyVar.P.C0();
                    vyVar.V(num.intValue());
                    vyVar.H(num.intValue(), i11);
                    vyVar.n(0, null);
                }
                return true;
            }
        }
        i11 = 0;
        if (num != null) {
        }
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            vy vyVar = this.g0;
            View view = vyVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            vyVar.J.invalidate();
        }
    }
}
