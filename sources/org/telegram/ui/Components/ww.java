package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ww extends lv {
    public final /* synthetic */ ry h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(ry ryVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, mv mvVar, boolean z11) {
        super(context, i6Var, true, false, true, z10, 0, mvVar, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var), z11);
        this.h0 = ryVar;
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean d() {
        return this.h0.V0;
    }

    @Override // org.telegram.ui.Components.lv
    public final void e() {
        ry ryVar = this.h0;
        ArrayList arrayList = ryVar.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.mp.u1(ryVar.d1).i7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0);
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean g(fx fxVar) {
        return fxVar.f || this.h0.q1.contains(Long.valueOf(fxVar.b.id));
    }

    @Override // org.telegram.ui.Components.lv
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7) {
        Integer num;
        int i10;
        dy dyVar;
        ry ryVar = this.h0;
        ArrayList arrayList = ryVar.r1;
        bx bxVar = ryVar.S;
        if (ryVar.g0) {
            return false;
        }
        qx qxVar = ryVar.T;
        if (qxVar != null) {
            qxVar.F(null, true);
        }
        sv svVar = ryVar.W;
        if (svVar != null && (dyVar = svVar.r) != null) {
            dyVar.I1(null);
        }
        if (i7 == 0) {
            num = Integer.valueOf(ryVar.e0 ? 1 : 0);
        } else {
            i7--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.k6.a;
            if (i7 < 8 && bxVar.s.indexOfKey(i7) >= 0) {
                num = Integer.valueOf(bxVar.s.get(i7));
            }
        }
        if (num == null) {
            ArrayList<fx> emojipacks = ryVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.k6.a;
            int i11 = i7 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((fx) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = bxVar.s;
                char[] cArr3 = org.telegram.messenger.k6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    ryVar.Q.C0();
                    ryVar.V(num.intValue());
                    ryVar.G(num.intValue(), i10);
                    ryVar.n(0, null);
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
            ry ryVar = this.h0;
            View view = ryVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            ryVar.K.invalidate();
        }
    }
}
