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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sz f;
    public String h;
    public int n;
    public final /* synthetic */ f70 r;

    public e70(f70 f70Var, Context context) {
        this.r = f70Var;
        this.c = context;
        C(true);
    }

    public static void E(e70 e70Var, String str) {
        f70 f70Var = e70Var.r;
        if (f70Var.N) {
            if (TextUtils.isEmpty(str)) {
                f70Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f70Var.d, f70Var.getResourceProvider());
            }
        }
        if (e70Var.n != 0) {
            f70Var.getConnectionsManager().cancelRequest(e70Var.n, true);
            e70Var.n = 0;
        }
        sz szVar = e70Var.f;
        if (szVar != null) {
            AndroidUtilities.cancelRunOnUIThread(szVar);
            e70Var.f = null;
        }
        e70Var.h = null;
        int h = e70Var.h();
        if (h > 0) {
            e70Var.d.clear();
            e70Var.e.clear();
            e70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            f70Var.b.setVisibility(8);
            f70Var.b.e(false, true);
            return;
        }
        if (f70Var.b.getVisibility() != 0) {
            f70Var.b.setVisibility(0);
            f70Var.b.e(true, false);
        } else {
            f70Var.b.e(true, true);
        }
        sz szVar2 = new sz(14, e70Var, str);
        e70Var.f = szVar2;
        AndroidUtilities.runOnUIThread(szVar2, 300L);
    }

    @Override // org.telegram.ui.Components.lm0
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
        f70 f70Var = this.r;
        org.telegram.ui.ActionBar.u6 resourceProvider = f70Var.getResourceProvider();
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = f70Var.r;
        p8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : f70Var.c0(f70Var.v) != null ? f70Var.c0(f70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.y6.B6;
            f70 f70Var = this.r;
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.c, i11, 21, 0, 0, false, false, f70Var.getResourceProvider());
            q4Var.setText(LocaleController.getString(f70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            p8Var = q4Var;
        } else {
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(this.c, 3);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, p8Var2, null);
            p8Var = p8Var2;
        }
        p8Var.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.vl0(p8Var);
    }
}
