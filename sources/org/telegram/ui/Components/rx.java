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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class rx extends gw {
    public final /* synthetic */ nz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(nz nzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, hw hwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, hwVar, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.v6, d6Var), z11);
        this.g0 = nzVar;
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.gw
    public final void e() {
        nz nzVar = this.g0;
        ArrayList arrayList = nzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(nzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean g(ay ayVar) {
        return ayVar.f || this.g0.p1.contains(Long.valueOf(ayVar.b.id));
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
        zy zyVar;
        nz nzVar = this.g0;
        ArrayList arrayList = nzVar.q1;
        wx wxVar = nzVar.R;
        if (nzVar.f0) {
            return false;
        }
        ny nyVar = nzVar.S;
        if (nyVar != null) {
            nyVar.F(null, true);
        }
        nw nwVar = nzVar.V;
        if (nwVar != null && (zyVar = nwVar.r) != null) {
            zyVar.G1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(nzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && wxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(wxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<ay> emojipacks = nzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((ay) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(wxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    nzVar.P.C0();
                    nzVar.S(num.intValue());
                    nzVar.E(num.intValue(), i11);
                    nzVar.n(0, null);
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
            nz nzVar = this.g0;
            View view = nzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            nzVar.J.invalidate();
        }
    }
}
