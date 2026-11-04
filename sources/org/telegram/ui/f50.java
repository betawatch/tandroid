package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ly f;
    public String h;
    public int n;
    public final /* synthetic */ g50 r;

    public f50(g50 g50Var, Context context) {
        this.r = g50Var;
        this.c = context;
        C(true);
    }

    public static void E(f50 f50Var, String str) {
        g50 g50Var = f50Var.r;
        if (g50Var.O) {
            if (TextUtils.isEmpty(str)) {
                g50Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, g50Var.d, g50Var.getResourceProvider());
            }
        }
        if (f50Var.n != 0) {
            g50Var.getConnectionsManager().cancelRequest(f50Var.n, true);
            f50Var.n = 0;
        }
        ly lyVar = f50Var.f;
        if (lyVar != null) {
            org.telegram.messenger.g0.r(lyVar);
            f50Var.f = null;
        }
        f50Var.h = null;
        int b10 = f50Var.b();
        if (b10 > 0) {
            f50Var.d.clear();
            f50Var.e.clear();
            f50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            g50Var.b.setVisibility(8);
            g50Var.b.e(false, true);
            return;
        }
        if (g50Var.b.getVisibility() != 0) {
            g50Var.b.setVisibility(0);
            g50Var.b.e(true, false);
        } else {
            g50Var.b.e(true, true);
        }
        ly lyVar2 = new ly(10, f50Var, str);
        f50Var.f = lyVar2;
        org.telegram.messenger.g0.i3(lyVar2, 300L);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d(d1Var.b()) == 0;
    }

    @Override // u4.h0
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // u4.h0
    public final long c(int i3) {
        if (d(i3) != 0) {
            return -1L;
        }
        ArrayList arrayList = i3 > this.d.size() ? this.e : this.d;
        if (i3 > this.d.size()) {
            i3 = (i3 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i3)).set.id;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return this.d.size() == i3 ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d(i3) != 0) {
            return;
        }
        boolean z10 = i3 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i3 = (i3 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) d1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
        f8Var.d(tL_messages_stickerSet, i3 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        g50 g50Var = this.r;
        org.telegram.ui.ActionBar.e6 resourceProvider = g50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            f8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str3);
            l10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(l10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            f8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = g50Var.r;
        f8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : g50Var.g0(g50Var.w) != null ? g50Var.g0(g50Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.f8 f8Var;
        if (i3 != 0) {
            int i10 = org.telegram.ui.ActionBar.k6.B6;
            g50 g50Var = this.r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, i10, 21, 0, 0, false, false, g50Var.getResourceProvider());
            n4Var.setText(org.telegram.messenger.bd.M0(g50Var.O ? 2131752119 : 2131752118, null));
            f8Var = n4Var;
        } else {
            org.telegram.ui.Cells.f8 f8Var2 = new org.telegram.ui.Cells.f8(this.c, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f8Var2, null);
            f8Var = f8Var2;
        }
        f8Var.setLayoutParams(new u4.p0(-1, -2));
        return new org.telegram.ui.Components.bj0(f8Var);
    }
}
