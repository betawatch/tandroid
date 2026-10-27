package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public kz f;
    public String h;
    public int n;
    public final /* synthetic */ h70 r;

    public g70(h70 h70Var, Context context) {
        this.r = h70Var;
        this.c = context;
        C(true);
    }

    public static void E(g70 g70Var, String str) {
        h70 h70Var = g70Var.r;
        if (h70Var.N) {
            if (TextUtils.isEmpty(str)) {
                h70Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, h70Var.d, h70Var.getResourceProvider());
            }
        }
        if (g70Var.n != 0) {
            h70Var.getConnectionsManager().cancelRequest(g70Var.n, true);
            g70Var.n = 0;
        }
        kz kzVar = g70Var.f;
        if (kzVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kzVar);
            g70Var.f = null;
        }
        g70Var.h = null;
        int h = g70Var.h();
        if (h > 0) {
            g70Var.d.clear();
            g70Var.e.clear();
            g70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            h70Var.b.setVisibility(8);
            h70Var.b.e(false, true);
            return;
        }
        if (h70Var.b.getVisibility() != 0) {
            h70Var.b.setVisibility(0);
            h70Var.b.e(true, false);
        } else {
            h70Var.b.e(true, true);
        }
        kz kzVar2 = new kz(15, g70Var, str);
        g70Var.f = kzVar2;
        AndroidUtilities.runOnUIThread(kzVar2, 300L);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return j(e1Var.b()) == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // s4.h0
    public final long i(int i10) {
        if (j(i10) != 0) {
            return -1L;
        }
        ArrayList arrayList = i10 > this.d.size() ? this.e : this.d;
        if (i10 > this.d.size()) {
            i10 = (i10 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) e1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        p8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        h70 h70Var = this.r;
        org.telegram.ui.ActionBar.u6 resourceProvider = h70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            p8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder u10 = a1.g.u(str3);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            p8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = h70Var.r;
        p8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : h70Var.c0(h70Var.v) != null ? h70Var.c0(h70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.y6.B6;
            h70 h70Var = this.r;
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.c, i11, 21, 0, 0, false, false, h70Var.getResourceProvider());
            q4Var.setText(LocaleController.getString(h70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            p8Var = q4Var;
        } else {
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(this.c, 3);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, p8Var2, null);
            p8Var = p8Var2;
        }
        p8Var.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.wl0(p8Var);
    }
}
