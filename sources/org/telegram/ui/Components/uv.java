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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uv extends mv {
    public final /* synthetic */ yy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, nv nvVar, boolean z11) {
        super(context, c6Var, true, false, true, z10, 0, nvVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var), z11);
        this.e0 = yyVar;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean d() {
        return this.e0.Q0;
    }

    @Override // org.telegram.ui.Components.mv
    public final void e() {
        yy yyVar = this.e0;
        ArrayList arrayList = yyVar.j1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(yyVar.Y0).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean g(kx kxVar) {
        return kxVar.f || this.e0.l1.contains(Long.valueOf(kxVar.b.id));
    }

    @Override // org.telegram.ui.Components.mv
    public final ColorFilter getEmojiColorFilter() {
        return this.e0.a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.mv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        jy jyVar;
        yy yyVar = this.e0;
        ArrayList arrayList = yyVar.m1;
        gx gxVar = yyVar.N;
        if (yyVar.b0) {
            return false;
        }
        wx wxVar = yyVar.O;
        if (wxVar != null) {
            wxVar.F(null, true);
        }
        vv vvVar = yyVar.R;
        if (vvVar != null && (jyVar = vvVar.r) != null) {
            jyVar.F1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(yyVar.W ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && gxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(gxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<kx> emojipacks = yyVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((kx) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(gxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    yyVar.L.B0();
                    yyVar.W(num.intValue());
                    yyVar.I(num.intValue(), i11);
                    yyVar.n(null, 0);
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
            yy yyVar = this.e0;
            View view = yyVar.K;
            if (view != null) {
                view.setTranslationY(f10);
            }
            yyVar.F.invalidate();
        }
    }
}
