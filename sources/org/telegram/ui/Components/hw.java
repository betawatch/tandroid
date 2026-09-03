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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hw extends zv {
    public final /* synthetic */ mz d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(mz mzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, aw awVar, boolean z10) {
        super(context, g6Var, true, false, true, z4, 0, awVar, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.v6, g6Var), z10);
        this.d0 = mzVar;
    }

    @Override // org.telegram.ui.Components.zv
    public final boolean d() {
        return this.d0.R0;
    }

    @Override // org.telegram.ui.Components.zv
    public final void e() {
        mz mzVar = this.d0;
        ArrayList arrayList = mzVar.k1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(mzVar.Z0).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.zv
    public final boolean g(xx xxVar) {
        return xxVar.f || this.d0.m1.contains(Long.valueOf(xxVar.b.id));
    }

    @Override // org.telegram.ui.Components.zv
    public final ColorFilter getEmojiColorFilter() {
        return this.d0.b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.zv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        xy xyVar;
        mz mzVar = this.d0;
        ArrayList arrayList = mzVar.n1;
        tx txVar = mzVar.O;
        if (mzVar.c0) {
            return false;
        }
        ly lyVar = mzVar.P;
        if (lyVar != null) {
            lyVar.F(null, true);
        }
        iw iwVar = mzVar.S;
        if (iwVar != null && (xyVar = iwVar.r) != null) {
            xyVar.E1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(mzVar.a0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && txVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(txVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<xx> emojipacks = mzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((xx) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(txVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    mzVar.M.B0();
                    mzVar.W(num.intValue());
                    mzVar.H(num.intValue(), i11);
                    mzVar.n(null, 0);
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
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            mz mzVar = this.d0;
            View view = mzVar.L;
            if (view != null) {
                view.setTranslationY(f10);
            }
            mzVar.G.invalidate();
        }
    }
}
