package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ow extends gw {
    public final /* synthetic */ rz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(rz rzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, hw hwVar, boolean z11) {
        super(context, f6Var, true, false, true, z10, 0, hwVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var), z11);
        this.g0 = rzVar;
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.gw
    public final void e() {
        rz rzVar = this.g0;
        ArrayList arrayList = rzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(rzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean g(dy dyVar) {
        return dyVar.f || this.g0.p1.contains(Long.valueOf(dyVar.b.id));
    }

    @Override // org.telegram.ui.Components.gw
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.gw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        dz dzVar;
        rz rzVar = this.g0;
        ArrayList arrayList = rzVar.q1;
        yx yxVar = rzVar.R;
        if (rzVar.f0) {
            return false;
        }
        ry ryVar = rzVar.S;
        if (ryVar != null) {
            ryVar.F(null, true);
        }
        pw pwVar = rzVar.V;
        if (pwVar != null && (dzVar = pwVar.r) != null) {
            dzVar.E1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(rzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && yxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(yxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<dy> emojipacks = rzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((dy) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(yxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    rzVar.P.B0();
                    rzVar.W(num.intValue());
                    rzVar.I(num.intValue(), i11);
                    rzVar.n(null, 0);
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
            rz rzVar = this.g0;
            View view = rzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            rzVar.J.invalidate();
        }
    }
}
