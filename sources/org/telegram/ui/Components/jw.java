package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jw extends zu {
    public final /* synthetic */ ey h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(ey eyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, av avVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, avVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, e6Var), z11);
        this.h0 = eyVar;
    }

    @Override // org.telegram.ui.Components.zu
    public final boolean d() {
        return this.h0.V0;
    }

    @Override // org.telegram.ui.Components.zu
    public final void e() {
        ey eyVar = this.h0;
        ArrayList arrayList = eyVar.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || org.telegram.messenger.hp.s1(eyVar.d1).f7.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0);
    }

    @Override // org.telegram.ui.Components.zu
    public final boolean g(sw swVar) {
        return swVar.f || this.h0.q1.contains(Long.valueOf(swVar.b.id));
    }

    @Override // org.telegram.ui.Components.zu
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // org.telegram.ui.Components.zu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i3) {
        Integer num;
        int i10;
        qx qxVar;
        ey eyVar = this.h0;
        ArrayList arrayList = eyVar.r1;
        ow owVar = eyVar.S;
        if (eyVar.g0) {
            return false;
        }
        ex exVar = eyVar.T;
        if (exVar != null) {
            exVar.F(null, true);
        }
        gv gvVar = eyVar.W;
        if (gvVar != null && (qxVar = gvVar.r) != null) {
            qxVar.I1(null);
        }
        if (i3 == 0) {
            num = Integer.valueOf(eyVar.e0 ? 1 : 0);
        } else {
            i3--;
            num = null;
        }
        if (num == null) {
            char[] cArr = org.telegram.messenger.j6.a;
            if (i3 < 8 && owVar.s.indexOfKey(i3) >= 0) {
                num = Integer.valueOf(owVar.s.get(i3));
            }
        }
        if (num == null) {
            ArrayList<sw> emojipacks = eyVar.getEmojipacks();
            char[] cArr2 = org.telegram.messenger.j6.a;
            int i11 = i3 - 8;
            if (emojipacks != null && i11 >= 0 && i11 < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((sw) arrayList.get(i12)).b.id == emojipacks.get(i11).b.id) {
                        break;
                    }
                    i12++;
                }
                SparseIntArray sparseIntArray = owVar.s;
                char[] cArr3 = org.telegram.messenger.j6.a;
                num = Integer.valueOf(sparseIntArray.get(i12 + 8));
                i10 = org.telegram.messenger.g0.L(-9.0f);
                if (num != null) {
                    eyVar.Q.C0();
                    eyVar.U(num.intValue());
                    eyVar.G(num.intValue(), i10);
                    eyVar.n(0, null);
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
            ey eyVar = this.h0;
            View view = eyVar.P;
            if (view != null) {
                view.setTranslationY(f10);
            }
            eyVar.K.invalidate();
        }
    }
}
