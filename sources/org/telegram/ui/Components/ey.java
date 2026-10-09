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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ey extends sw {
    public final /* synthetic */ a00 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(a00 a00Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, tw twVar, boolean z11) {
        super(context, e6Var, true, false, true, z10, 0, twVar, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.v6, e6Var), z11);
        this.g0 = a00Var;
    }

    @Override // org.telegram.ui.Components.sw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.sw
    public final void e() {
        a00 a00Var = this.g0;
        ArrayList arrayList = a00Var.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(a00Var.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.sw
    public final boolean g(ny nyVar) {
        return nyVar.f || this.g0.p1.contains(Long.valueOf(nyVar.b.id));
    }

    @Override // org.telegram.ui.Components.sw
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.sw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        lz lzVar;
        a00 a00Var = this.g0;
        ArrayList arrayList = a00Var.q1;
        jy jyVar = a00Var.R;
        if (a00Var.f0) {
            return false;
        }
        zy zyVar = a00Var.S;
        if (zyVar != null) {
            zyVar.F(null, true);
        }
        zw zwVar = a00Var.V;
        if (zwVar != null && (lzVar = zwVar.r) != null) {
            lzVar.G1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(a00Var.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && jyVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(jyVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<ny> emojipacks = a00Var.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((ny) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(jyVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    a00Var.P.B0();
                    a00Var.U(num.intValue());
                    a00Var.G(num.intValue(), i11);
                    a00Var.o(0, null);
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
            a00 a00Var = this.g0;
            View view = a00Var.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            a00Var.J.invalidate();
        }
    }
}
