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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class px extends dw {
    public final /* synthetic */ lz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(lz lzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, ew ewVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, ewVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.v6, d6Var), z11);
        this.g0 = lzVar;
    }

    @Override // org.telegram.ui.Components.dw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.dw
    public final void e() {
        lz lzVar = this.g0;
        ArrayList arrayList = lzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(lzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.dw
    public final boolean g(yx yxVar) {
        return yxVar.f || this.g0.p1.contains(Long.valueOf(yxVar.b.id));
    }

    @Override // org.telegram.ui.Components.dw
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.dw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        xy xyVar;
        lz lzVar = this.g0;
        ArrayList arrayList = lzVar.q1;
        ux uxVar = lzVar.R;
        if (lzVar.f0) {
            return false;
        }
        ly lyVar = lzVar.S;
        if (lyVar != null) {
            lyVar.F(null, true);
        }
        kw kwVar = lzVar.V;
        if (kwVar != null && (xyVar = kwVar.r) != null) {
            xyVar.F1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(lzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && uxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(uxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<yx> emojipacks = lzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((yx) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(uxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    lzVar.P.B0();
                    lzVar.U(num.intValue());
                    lzVar.G(num.intValue(), i11);
                    lzVar.n(0, null);
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
            lz lzVar = this.g0;
            View view = lzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            lzVar.J.invalidate();
        }
    }
}
