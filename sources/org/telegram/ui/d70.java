package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class d70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ot f;
    public String h;
    public int n;
    public final /* synthetic */ e70 r;

    public d70(e70 e70Var, Context context) {
        this.r = e70Var;
        this.c = context;
        C(true);
    }

    public static void E(d70 d70Var, String str) {
        e70 e70Var = d70Var.r;
        if (e70Var.N) {
            if (TextUtils.isEmpty(str)) {
                e70Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, e70Var.d, e70Var.getResourceProvider());
            }
        }
        if (d70Var.n != 0) {
            e70Var.getConnectionsManager().cancelRequest(d70Var.n, true);
            d70Var.n = 0;
        }
        ot otVar = d70Var.f;
        if (otVar != null) {
            AndroidUtilities.cancelRunOnUIThread(otVar);
            d70Var.f = null;
        }
        d70Var.h = null;
        int h = d70Var.h();
        if (h > 0) {
            d70Var.d.clear();
            d70Var.e.clear();
            d70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            e70Var.b.setVisibility(8);
            e70Var.b.e(false, true);
            return;
        }
        if (e70Var.b.getVisibility() != 0) {
            e70Var.b.setVisibility(0);
            e70Var.b.e(true, false);
        } else {
            e70Var.b.e(true, true);
        }
        ot otVar2 = new ot(27, d70Var, str);
        d70Var.f = otVar2;
        AndroidUtilities.runOnUIThread(otVar2, 300L);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return j(b1Var.b()) == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) b1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        l8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        e70 e70Var = this.r;
        org.telegram.ui.ActionBar.g6 resourceProvider = e70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            l8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder u10 = a1.g.u(str3);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            l8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = e70Var.r;
        l8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : e70Var.b0(e70Var.v) != null ? e70Var.b0(e70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l8 l8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            e70 e70Var = this.r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, i11, 21, 0, 0, false, false, e70Var.getResourceProvider());
            Drawable X0 = org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            int i12 = org.telegram.ui.ActionBar.k6.a7;
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(new ColorDrawable(e70Var.getThemedColor(i12)), X0);
            yqVar.w = true;
            l4Var.setBackground(yqVar);
            org.telegram.ui.ActionBar.g6 resourceProvider = e70Var.getResourceProvider();
            wv wvVar = new wv(4);
            wv wvVar2 = new wv(5);
            int R = org.telegram.ui.ActionBar.r6.R(i12, -1, 0, 0.0f, resourceProvider);
            wvVar2.d(R, l4Var);
            org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(100, l4Var);
            y3.c(i12, -1, 0, 0.0f, resourceProvider);
            y3.n = wvVar;
            y3.o = wvVar2;
            y3.m = false;
            y3.g = R;
            l4Var.setText(LocaleController.getString(e70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            l8Var = l4Var;
        } else {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var2, null);
            l8Var = l8Var2;
        }
        l8Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(l8Var);
    }
}
