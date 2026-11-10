package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public f10 f;
    public String h;
    public int n;
    public final /* synthetic */ p50 r;

    public o50(p50 p50Var, Context context) {
        this.r = p50Var;
        this.c = context;
        C(true);
    }

    public static void E(o50 o50Var, String str) {
        p50 p50Var = o50Var.r;
        if (p50Var.N) {
            if (TextUtils.isEmpty(str)) {
                p50Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, p50Var.d, p50Var.getResourceProvider());
            }
        }
        if (o50Var.n != 0) {
            p50Var.getConnectionsManager().cancelRequest(o50Var.n, true);
            o50Var.n = 0;
        }
        f10 f10Var = o50Var.f;
        if (f10Var != null) {
            org.telegram.messenger.g0.r(f10Var);
            o50Var.f = null;
        }
        o50Var.h = null;
        int b10 = o50Var.b();
        if (b10 > 0) {
            o50Var.d.clear();
            o50Var.e.clear();
            o50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            p50Var.b.setVisibility(8);
            p50Var.b.e(false, true);
            return;
        }
        if (p50Var.b.getVisibility() != 0) {
            p50Var.b.setVisibility(0);
            p50Var.b.e(true, false);
        } else {
            p50Var.b.e(true, true);
        }
        f10 f10Var2 = new f10(6, o50Var, str);
        o50Var.f = f10Var2;
        org.telegram.messenger.g0.i3(f10Var2, 300L);
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
        p50 p50Var = this.r;
        org.telegram.ui.ActionBar.h6 resourceProvider = p50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            g8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str3);
            m10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(m10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            g8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = p50Var.r;
        g8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : p50Var.g0(p50Var.w) != null ? p50Var.g0(p50Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g8 g8Var;
        if (i7 != 0) {
            int i10 = org.telegram.ui.ActionBar.m6.B6;
            p50 p50Var = this.r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, i10, 21, 0, 0, false, false, p50Var.getResourceProvider());
            n4Var.setText(org.telegram.messenger.id.M0(p50Var.N ? 2131752119 : 2131752118, null));
            g8Var = n4Var;
        } else {
            org.telegram.ui.Cells.g8 g8Var2 = new org.telegram.ui.Cells.g8(this.c, 3);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, g8Var2, null);
            g8Var = g8Var2;
        }
        g8Var.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(g8Var);
    }
}
