package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class n70 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public tt f;
    public String h;
    public int n;
    public final /* synthetic */ o70 r;

    public n70(o70 o70Var, Context context) {
        this.r = o70Var;
        this.c = context;
        C(true);
    }

    public static void E(n70 n70Var, String str) {
        o70 o70Var = n70Var.r;
        if (o70Var.N) {
            if (TextUtils.isEmpty(str)) {
                o70Var.d.setBackground(null);
            } else {
                o70Var.d.setBackgroundColor(o70Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            }
        }
        if (n70Var.n != 0) {
            o70Var.getConnectionsManager().cancelRequest(n70Var.n, true);
            n70Var.n = 0;
        }
        tt ttVar = n70Var.f;
        if (ttVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ttVar);
            n70Var.f = null;
        }
        n70Var.h = null;
        int h = n70Var.h();
        if (h > 0) {
            n70Var.d.clear();
            n70Var.e.clear();
            n70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            o70Var.b.setVisibility(8);
            o70Var.b.e(false, true);
            return;
        }
        if (o70Var.b.getVisibility() != 0) {
            o70Var.b.setVisibility(0);
            o70Var.b.e(true, false);
        } else {
            o70Var.b.e(true, true);
        }
        tt ttVar2 = new tt(28, n70Var, str);
        n70Var.f = ttVar2;
        AndroidUtilities.runOnUIThread(ttVar2, 300L);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return j(c1Var.b()) == 0;
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
    public final void v(s4.c1 c1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) c1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        m8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        o70 o70Var = this.r;
        org.telegram.ui.ActionBar.d6 resourceProvider = o70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            m8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder v = a4.a.v(str3);
            v.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(v.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            m8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o70Var.r;
        m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : o70Var.b0(o70Var.v) != null ? o70Var.b0(o70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.h6.B6;
            o70 o70Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i11, 21, 0, 0, false, false, o70Var.getResourceProvider());
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(o70Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            qqVar.w = true;
            m4Var.setBackground(qqVar);
            m4Var.setText(LocaleController.getString(o70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(m8Var);
    }
}
