package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ss f;
    public String h;
    public int n;
    public final /* synthetic */ n50 r;

    public m50(n50 n50Var, Context context) {
        this.r = n50Var;
        this.c = context;
        C(true);
    }

    public static void E(m50 m50Var, String str) {
        n50 n50Var = m50Var.r;
        if (n50Var.O) {
            if (TextUtils.isEmpty(str)) {
                n50Var.d.setBackground(null);
            } else {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n50Var.d, n50Var.getResourceProvider());
            }
        }
        if (m50Var.n != 0) {
            n50Var.getConnectionsManager().cancelRequest(m50Var.n, true);
            m50Var.n = 0;
        }
        ss ssVar = m50Var.f;
        if (ssVar != null) {
            org.telegram.messenger.g0.r(ssVar);
            m50Var.f = null;
        }
        m50Var.h = null;
        int b10 = m50Var.b();
        if (b10 > 0) {
            m50Var.d.clear();
            m50Var.e.clear();
            m50Var.p(0, b10);
        }
        if (TextUtils.isEmpty(str)) {
            n50Var.b.setVisibility(8);
            n50Var.b.e(false, true);
            return;
        }
        if (n50Var.b.getVisibility() != 0) {
            n50Var.b.setVisibility(0);
            n50Var.b.e(true, false);
        } else {
            n50Var.b.e(true, true);
        }
        ss ssVar2 = new ss(28, m50Var, str);
        m50Var.f = ssVar2;
        org.telegram.messenger.g0.h3(ssVar2, 300L);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return d(f1Var.b()) == 0;
    }

    @Override // v4.i0
    public final int b() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final int d(int i7) {
        return this.d.size() == i7 ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (d(i7) != 0) {
            return;
        }
        boolean z10 = i7 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i7 = (i7 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) f1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i7);
        h8Var.d(tL_messages_stickerSet, i7 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        n50 n50Var = this.r;
        org.telegram.ui.ActionBar.h6 resourceProvider = n50Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            h8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str3);
            m10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(m10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            h8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n50Var.r;
        h8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : n50Var.g0(n50Var.w) != null ? n50Var.g0(n50Var.w).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h8 h8Var;
        if (i7 != 0) {
            int i10 = org.telegram.ui.ActionBar.m6.B6;
            n50 n50Var = this.r;
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.c, i10, 21, 0, 0, false, false, n50Var.getResourceProvider());
            o4Var.setText(org.telegram.messenger.gd.N0(n50Var.O ? 2131752107 : 2131752106, null));
            h8Var = o4Var;
        } else {
            org.telegram.ui.Cells.h8 h8Var2 = new org.telegram.ui.Cells.h8(this.c, 3);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, h8Var2, null);
            h8Var = h8Var2;
        }
        h8Var.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.mj0(h8Var);
    }
}
