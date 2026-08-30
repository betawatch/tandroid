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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fw extends xv {
    public final /* synthetic */ kz d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, yv yvVar, boolean z10) {
        super(context, f6Var, true, false, true, z4, 0, yvVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var), z10);
        this.d0 = kzVar;
    }

    @Override // org.telegram.ui.Components.xv
    public final boolean d() {
        return this.d0.R0;
    }

    @Override // org.telegram.ui.Components.xv
    public final void e() {
        kz kzVar = this.d0;
        ArrayList arrayList = kzVar.k1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(kzVar.Z0).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.xv
    public final boolean g(vx vxVar) {
        return vxVar.f || this.d0.m1.contains(Long.valueOf(vxVar.b.id));
    }

    @Override // org.telegram.ui.Components.xv
    public final ColorFilter getEmojiColorFilter() {
        return this.d0.b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.xv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        vy vyVar;
        kz kzVar = this.d0;
        ArrayList arrayList = kzVar.n1;
        rx rxVar = kzVar.O;
        if (kzVar.c0) {
            return false;
        }
        jy jyVar = kzVar.P;
        if (jyVar != null) {
            jyVar.F(null, true);
        }
        gw gwVar = kzVar.S;
        if (gwVar != null && (vyVar = gwVar.r) != null) {
            vyVar.F1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(kzVar.a0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && rxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(rxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<vx> emojipacks = kzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((vx) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(rxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    kzVar.M.B0();
                    kzVar.W(num.intValue());
                    kzVar.H(num.intValue(), i11);
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
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            kz kzVar = this.d0;
            View view = kzVar.L;
            if (view != null) {
                view.setTranslationY(f10);
            }
            kzVar.G.invalidate();
        }
    }
}
