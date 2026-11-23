package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vw extends lv {
    public final /* synthetic */ qy h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(qy qyVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, mv mvVar, boolean z11) {
        super(context, i6Var, true, false, true, z10, 0, mvVar, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var), z11);
        this.h0 = qyVar;
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean d() {
        return this.h0.V0;
    }

    @Override // org.telegram.ui.Components.lv
    public final void e() {
        qy qyVar = this.h0;
        ArrayList arrayList = qyVar.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.mp.u1(qyVar.d1).i7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0);
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean g(ex exVar) {
        return exVar.f || this.h0.q1.contains(Long.valueOf(exVar.b.id));
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
        cy cyVar;
        qy qyVar = this.h0;
        ArrayList arrayList = qyVar.r1;
        ax axVar = qyVar.S;
        if (qyVar.g0) {
            return false;
        }
        px pxVar = qyVar.T;
        if (pxVar != null) {
            pxVar.F(null, true);
        }
        sv svVar = qyVar.W;
        if (svVar != null && (cyVar = svVar.r) != null) {
            cyVar.I1(null);
        }
        if (i7 == 0) {
            num = Integer.valueOf(qyVar.e0 ? 1 : 0);
        } else {
            i7--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.k6.a;
            if (i7 < 8 && axVar.s.indexOfKey(i7) >= 0) {
                num = Integer.valueOf(axVar.s.get(i7));
            }
        }
        if (num == null) {
            ArrayList<ex> emojipacks = qyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.k6.a;
            int i11 = i7 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((ex) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = axVar.s;
                char[] cArr3 = org.telegram.messenger.k6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    qyVar.Q.C0();
                    qyVar.V(num.intValue());
                    qyVar.F(num.intValue(), i10);
                    qyVar.n(0, null);
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
            qy qyVar = this.h0;
            View view = qyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            qyVar.K.invalidate();
        }
    }
}
