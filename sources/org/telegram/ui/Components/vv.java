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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vv extends nv {
    public final /* synthetic */ wy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(wy wyVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, ov ovVar, boolean z11) {
        super(context, b6Var, true, false, true, z10, 0, ovVar, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, b6Var), z11);
        this.c0 = wyVar;
    }

    @Override // org.telegram.ui.Components.nv
    public final boolean d() {
        return this.c0.Q0;
    }

    @Override // org.telegram.ui.Components.nv
    public final void e() {
        wy wyVar = this.c0;
        ArrayList arrayList = wyVar.j1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(wyVar.Y0).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.nv
    public final boolean g(jx jxVar) {
        return jxVar.f || this.c0.l1.contains(Long.valueOf(jxVar.b.id));
    }

    @Override // org.telegram.ui.Components.nv
    public final ColorFilter getEmojiColorFilter() {
        return this.c0.a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.nv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i9) {
        Integer num;
        int i10;
        iy iyVar;
        wy wyVar = this.c0;
        ArrayList arrayList = wyVar.m1;
        fx fxVar = wyVar.N;
        if (wyVar.b0) {
            return false;
        }
        vx vxVar = wyVar.O;
        if (vxVar != null) {
            vxVar.F(null, true);
        }
        wv wvVar = wyVar.R;
        if (wvVar != null && (iyVar = wvVar.r) != null) {
            iyVar.F1(null);
        }
        if (i9 == 0) {
            num = Integer.valueOf(wyVar.W ? 1 : 0);
        } else {
            i9--;
            num = null;
        }
        if (num == null && i9 < EmojiData.dataColored.length && fxVar.s.indexOfKey(i9) >= 0) {
            num = Integer.valueOf(fxVar.s.get(i9));
        }
        if (num == null) {
            ArrayList<jx> emojipacks = wyVar.getEmojipacks();
            int length = i9 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        i11 = -1;
                        break;
                    }
                    if (((jx) arrayList.get(i11)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i11++;
                }
                num = Integer.valueOf(fxVar.s.get(i11 + EmojiData.dataColored.length));
                i10 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    wyVar.L.B0();
                    wyVar.V(num.intValue());
                    wyVar.H(num.intValue(), i10);
                    wyVar.n(null, 0);
                }
                return true;
            }
        }
        i10 = 0;
        if (num != null) {
        }
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            wy wyVar = this.c0;
            View view = wyVar.K;
            if (view != null) {
                view.setTranslationY(f10);
            }
            wyVar.F.invalidate();
        }
    }
}
