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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ux extends kw {
    public final /* synthetic */ sz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(sz szVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, lw lwVar, boolean z11) {
        super(context, u6Var, true, false, true, z10, 0, lwVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v6, u6Var), z11);
        this.g0 = szVar;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.kw
    public final void e() {
        sz szVar = this.g0;
        ArrayList arrayList = szVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(szVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean g(ey eyVar) {
        return eyVar.f || this.g0.p1.contains(Long.valueOf(eyVar.b.id));
    }

    @Override // org.telegram.ui.Components.kw
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.kw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        ez ezVar;
        sz szVar = this.g0;
        ArrayList arrayList = szVar.q1;
        zx zxVar = szVar.R;
        if (szVar.f0) {
            return false;
        }
        sy syVar = szVar.S;
        if (syVar != null) {
            syVar.F(null, true);
        }
        rw rwVar = szVar.V;
        if (rwVar != null && (ezVar = rwVar.r) != null) {
            ezVar.L1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(szVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && zxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(zxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<ey> emojipacks = szVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((ey) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(zxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    szVar.P.C0();
                    szVar.U(num.intValue());
                    szVar.G(num.intValue(), i11);
                    szVar.n(0, null);
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
            sz szVar = this.g0;
            View view = szVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            szVar.J.invalidate();
        }
    }
}
