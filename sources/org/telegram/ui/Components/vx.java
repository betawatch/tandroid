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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vx extends kw {
    public final /* synthetic */ tz g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(tz tzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, lw lwVar, boolean z11) {
        super(context, d6Var, true, false, true, z10, 0, lwVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v6, d6Var), z11);
        this.g0 = tzVar;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean d() {
        return this.g0.U0;
    }

    @Override // org.telegram.ui.Components.kw
    public final void e() {
        tz tzVar = this.g0;
        ArrayList arrayList = tzVar.n1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || MessagesController.getEmojiSettings(tzVar.c1).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean g(fy fyVar) {
        return fyVar.f || this.g0.p1.contains(Long.valueOf(fyVar.b.id));
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
        fz fzVar;
        tz tzVar = this.g0;
        ArrayList arrayList = tzVar.q1;
        ay ayVar = tzVar.R;
        if (tzVar.f0) {
            return false;
        }
        ty tyVar = tzVar.S;
        if (tyVar != null) {
            tyVar.F(null, true);
        }
        rw rwVar = tzVar.V;
        if (rwVar != null && (fzVar = rwVar.r) != null) {
            fzVar.G1(null);
        }
        if (i10 == 0) {
            num = Integer.valueOf(tzVar.d0 ? 1 : 0);
        } else {
            i10--;
            num = null;
        }
        if (num == null && i10 < EmojiData.dataColored.length && ayVar.s.indexOfKey(i10) >= 0) {
            num = Integer.valueOf(ayVar.s.get(i10));
        }
        if (num == null) {
            ArrayList<fy> emojipacks = tzVar.getEmojipacks();
            int length = i10 - EmojiData.dataColored.length;
            if (emojipacks != null && length >= 0 && length < emojipacks.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((fy) arrayList.get(i12)).b.id == emojipacks.get(length).b.id) {
                        break;
                    }
                    i12++;
                }
                num = Integer.valueOf(ayVar.s.get(i12 + EmojiData.dataColored.length));
                i11 = AndroidUtilities.dp(-9.0f);
                if (num != null) {
                    tzVar.P.B0();
                    tzVar.U(num.intValue());
                    tzVar.F(num.intValue(), i11);
                    tzVar.n(0, null);
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
            tz tzVar = this.g0;
            View view = tzVar.O;
            if (view != null) {
                view.setTranslationY(f7);
            }
            tzVar.J.invalidate();
        }
    }
}
