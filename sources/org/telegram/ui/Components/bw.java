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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bw extends tv {
    public final /* synthetic */ fz c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(fz fzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, uv uvVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, uvVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var), z11);
        this.c0 = fzVar;
    }

    @Override // org.telegram.ui.Components.tv
    public final boolean d() {
        return this.c0.Q0;
    }

    @Override // org.telegram.ui.Components.tv
    public final void e() {
        fz fzVar = this.c0;
        ArrayList arrayList = fzVar.j1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(fzVar.Y0).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.tv
    public final boolean g(rx rxVar) {
        return rxVar.f || this.c0.l1.contains(Long.valueOf(rxVar.b.id));
    }

    @Override // org.telegram.ui.Components.tv
    public final ColorFilter getEmojiColorFilter() {
        return this.c0.a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.tv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        qy qyVar;
        fz fzVar = this.c0;
        ArrayList arrayList = fzVar.m1;
        nx nxVar = fzVar.N;
        if (fzVar.b0) {
            return false;
        }
        ey eyVar = fzVar.O;
        if (eyVar != null) {
            eyVar.F(null, true);
        }
        cw cwVar = fzVar.R;
        if (cwVar != null && (qyVar = cwVar.r) != null) {
            qyVar.F1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(fzVar.W ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && nxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(nxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<rx> emojipacks = fzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((rx) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(nxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    fzVar.L.B0();
                    fzVar.W(num.intValue());
                    fzVar.H(num.intValue(), i11);
                    fzVar.n(null, 0);
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
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            fz fzVar = this.c0;
            View view = fzVar.K;
            if (view != null) {
                view.setTranslationY(f9);
            }
            fzVar.F.invalidate();
        }
    }
}
