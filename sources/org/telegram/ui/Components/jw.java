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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jw extends bw {
    public final /* synthetic */ kz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, cw cwVar, boolean z11) {
        super(context, f6Var, true, false, true, z10, 0, cwVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var), z11);
        this.g0 = kzVar;
    }

    @Override // org.telegram.ui.Components.bw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.bw
    public final void e() {
        kz kzVar = this.g0;
        ArrayList arrayList = kzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(kzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.bw
    public final boolean g(xx xxVar) {
        return xxVar.f || this.g0.p1.contains(Long.valueOf(xxVar.b.id));
    }

    @Override // org.telegram.ui.Components.bw
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.bw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        wy wyVar;
        kz kzVar = this.g0;
        ArrayList arrayList = kzVar.q1;
        tx txVar = kzVar.R;
        if (kzVar.f0) {
            return false;
        }
        ky kyVar = kzVar.S;
        if (kyVar != null) {
            kyVar.F(null, true);
        }
        kw kwVar = kzVar.V;
        if (kwVar != null && (wyVar = kwVar.r) != null) {
            wyVar.E1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(kzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && txVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(txVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<xx> emojipacks = kzVar.getEmojipacks();
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
                    kzVar.P.B0();
                    kzVar.W(num.intValue());
                    kzVar.I(num.intValue(), i11);
                    kzVar.n(null, 0);
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
            kz kzVar = this.g0;
            View view = kzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            kzVar.J.invalidate();
        }
    }
}
