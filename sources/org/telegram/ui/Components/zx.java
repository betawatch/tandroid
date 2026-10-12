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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zx extends ow {
    public final /* synthetic */ wz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(wz wzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, pw pwVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, pwVar, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v6, c6Var), z11);
        this.g0 = wzVar;
    }

    @Override // org.telegram.ui.Components.ow
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.ow
    public final void e() {
        wz wzVar = this.g0;
        ArrayList arrayList = wzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(wzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.ow
    public final boolean g(jy jyVar) {
        return jyVar.f || this.g0.p1.contains(Long.valueOf(jyVar.b.id));
    }

    @Override // org.telegram.ui.Components.ow
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.ow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        hz hzVar;
        wz wzVar = this.g0;
        ArrayList arrayList = wzVar.q1;
        fy fyVar = wzVar.R;
        if (wzVar.f0) {
            return false;
        }
        vy vyVar = wzVar.S;
        if (vyVar != null) {
            vyVar.F(null, true);
        }
        vw vwVar = wzVar.V;
        if (vwVar != null && (hzVar = vwVar.r) != null) {
            hzVar.G1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(wzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && fyVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(fyVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<jy> emojipacks = wzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((jy) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(fyVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    wzVar.P.B0();
                    wzVar.U(num.intValue());
                    wzVar.G(num.intValue(), i11);
                    wzVar.n(0, null);
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
            wz wzVar = this.g0;
            View view = wzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            wzVar.J.invalidate();
        }
    }
}
