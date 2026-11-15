package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public g50 f;
    public String h;
    public int n;
    public final /* synthetic */ l50 r;

    public k50(l50 l50Var, Context context) {
        this.r = l50Var;
        this.c = context;
        C(true);
    }

    public static void E(k50 k50Var, String str) {
        l50 l50Var = k50Var.r;
        if (l50Var.O) {
            if (TextUtils.isEmpty(str)) {
                l50Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l50Var.d, l50Var.getResourceProvider());
            }
        }
        if (k50Var.n != 0) {
            l50Var.getConnectionsManager().cancelRequest(k50Var.n, true);
            k50Var.n = 0;
        }
        g50 g50Var = k50Var.f;
        if (g50Var != null) {
            org.telegram.messenger.g0.r(g50Var);
            k50Var.f = null;
        }
        k50Var.h = null;
        int b10 = k50Var.b();
        if (b10 > 0) {
            k50Var.d.clear();
            k50Var.e.clear();
            k50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            l50Var.b.setVisibility(8);
            l50Var.b.e(false, true);
            return;
        }
        if (l50Var.b.getVisibility() != 0) {
            l50Var.b.setVisibility(0);
            l50Var.b.e(true, false);
        } else {
            l50Var.b.e(true, true);
        }
        g50 g50Var2 = new g50(1, k50Var, str);
        k50Var.f = g50Var2;
        org.telegram.messenger.g0.i3(g50Var2, 300L);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return d(e1Var.b()) == 0;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // v4.h0
    public final long c(int i7) {
        if (d(i7) != 0) {
            return -1L;
        }
        ArrayList arrayList = i7 > this.d.size() ? this.e : this.d;
        if (i7 > this.d.size()) {
            i7 = (i7 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i7)).set.id;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return this.d.size() == i7 ? 1 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (d(i7) != 0) {
            return;
        }
        boolean z10 = i7 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) e1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i7);
        f8Var.d(tL_messages_stickerSet, i7 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        l50 l50Var = this.r;
        org.telegram.ui.ActionBar.e6 resourceProvider = l50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            f8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str3);
            m10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(m10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            f8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = l50Var.r;
        f8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : l50Var.g0(l50Var.w) != null ? l50Var.g0(l50Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.f8 f8Var;
        if (i7 != 0) {
            int i10 = org.telegram.ui.ActionBar.j6.B6;
            l50 l50Var = this.r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, i10, 21, 0, 0, false, false, l50Var.getResourceProvider());
            n4Var.setText(org.telegram.messenger.hd.M0(l50Var.O ? 2131752119 : 2131752118, null));
            f8Var = n4Var;
        } else {
            org.telegram.ui.Cells.f8 f8Var2 = new org.telegram.ui.Cells.f8(this.c, 3);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, f8Var2, null);
            f8Var = f8Var2;
        }
        f8Var.setLayoutParams(new v4.p0(-1, -2));
        return new org.telegram.ui.Components.cj0(f8Var);
    }
}
