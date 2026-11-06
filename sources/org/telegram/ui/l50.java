package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public q10 f;
    public String h;
    public int n;
    public final /* synthetic */ m50 r;

    public l50(m50 m50Var, Context context) {
        this.r = m50Var;
        this.c = context;
        C(true);
    }

    public static void E(l50 l50Var, String str) {
        m50 m50Var = l50Var.r;
        if (m50Var.N) {
            if (TextUtils.isEmpty(str)) {
                m50Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, m50Var.d, m50Var.getResourceProvider());
            }
        }
        if (l50Var.n != 0) {
            m50Var.getConnectionsManager().cancelRequest(l50Var.n, true);
            l50Var.n = 0;
        }
        q10 q10Var = l50Var.f;
        if (q10Var != null) {
            org.telegram.messenger.g0.r(q10Var);
            l50Var.f = null;
        }
        l50Var.h = null;
        int b10 = l50Var.b();
        if (b10 > 0) {
            l50Var.d.clear();
            l50Var.e.clear();
            l50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            m50Var.b.setVisibility(8);
            m50Var.b.e(false, true);
            return;
        }
        if (m50Var.b.getVisibility() != 0) {
            m50Var.b.setVisibility(0);
            m50Var.b.e(true, false);
        } else {
            m50Var.b.e(true, true);
        }
        q10 q10Var2 = new q10(5, l50Var, str);
        l50Var.f = q10Var2;
        org.telegram.messenger.g0.i3(q10Var2, 300L);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d(d1Var.b()) == 0;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final int d(int i7) {
        return this.d.size() == i7 ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d(i7) != 0) {
            return;
        }
        boolean z9 = i7 > this.d.size();
        ArrayList arrayList = z9 ? this.e : this.d;
        if (z9) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) d1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i7);
        g8Var.d(tL_messages_stickerSet, i7 != arrayList.size() - 1, !z9);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        m50 m50Var = this.r;
        org.telegram.ui.ActionBar.f6 resourceProvider = m50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            g8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str3);
            m10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(m10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            g8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m50Var.r;
        g8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : m50Var.g0(m50Var.w) != null ? m50Var.g0(m50Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g8 g8Var;
        if (i7 != 0) {
            int i10 = org.telegram.ui.ActionBar.k6.B6;
            m50 m50Var = this.r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, i10, 21, 0, 0, false, false, m50Var.getResourceProvider());
            n4Var.setText(org.telegram.messenger.hd.M0(m50Var.N ? 2131752119 : 2131752118, null));
            g8Var = n4Var;
        } else {
            org.telegram.ui.Cells.g8 g8Var2 = new org.telegram.ui.Cells.g8(this.c, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, g8Var2, null);
            g8Var = g8Var2;
        }
        g8Var.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(g8Var);
    }
}
