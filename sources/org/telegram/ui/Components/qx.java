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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class qx extends ew {
    public final /* synthetic */ mz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(mz mzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, fw fwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, fwVar, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.v6, d6Var), z11);
        this.g0 = mzVar;
    }

    @Override // org.telegram.ui.Components.ew
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.ew
    public final void e() {
        mz mzVar = this.g0;
        ArrayList arrayList = mzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(mzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.ew
    public final boolean g(zx zxVar) {
        return zxVar.f || this.g0.p1.contains(Long.valueOf(zxVar.b.id));
    }

    @Override // org.telegram.ui.Components.ew
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    @Override // org.telegram.ui.Components.ew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i10) {
        Integer num;
        int i11;
        yy yyVar;
        mz mzVar = this.g0;
        ArrayList arrayList = mzVar.q1;
        vx vxVar = mzVar.R;
        if (mzVar.f0) {
            return false;
        }
        my myVar = mzVar.S;
        if (myVar != null) {
            myVar.F(null, true);
        }
        lw lwVar = mzVar.V;
        if (lwVar != null && (yyVar = lwVar.r) != null) {
            yyVar.F1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(mzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && vxVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(vxVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<zx> emojipacks = mzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((zx) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(vxVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    mzVar.P.B0();
                    mzVar.U(num.intValue());
                    mzVar.G(num.intValue(), i11);
                    mzVar.n(0, null);
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
            mz mzVar = this.g0;
            View view = mzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            mzVar.J.invalidate();
        }
    }
}
