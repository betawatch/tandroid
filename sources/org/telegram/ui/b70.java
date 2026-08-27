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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public a30 f;
    public String h;
    public int n;
    public final /* synthetic */ c70 r;

    public b70(c70 c70Var, Context context) {
        this.r = c70Var;
        this.c = context;
        C(true);
    }

    public static void E(b70 b70Var, String str) {
        c70 c70Var = b70Var.r;
        if (c70Var.J) {
            if (TextUtils.isEmpty(str)) {
                c70Var.d.setBackground(null);
            } else {
                c70Var.d.setBackgroundColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            }
        }
        if (b70Var.n != 0) {
            c70Var.getConnectionsManager().cancelRequest(b70Var.n, true);
            b70Var.n = 0;
        }
        a30 a30Var = b70Var.f;
        if (a30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a30Var);
            b70Var.f = null;
        }
        b70Var.h = null;
        int h = b70Var.h();
        if (h > 0) {
            b70Var.d.clear();
            b70Var.e.clear();
            b70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            c70Var.b.setVisibility(8);
            c70Var.b.e(false, true);
            return;
        }
        if (c70Var.b.getVisibility() != 0) {
            c70Var.b.setVisibility(0);
            c70Var.b.e(true, false);
        } else {
            c70Var.b.e(true, true);
        }
        a30 a30Var2 = new a30(4, b70Var, str);
        b70Var.f = a30Var2;
        AndroidUtilities.runOnUIThread(a30Var2, 300L);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return j(o1Var.b()) == 0;
    }

    @Override // f2.q0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // f2.q0
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

    @Override // f2.q0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) o1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        h8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        c70 c70Var = this.r;
        org.telegram.ui.ActionBar.c6 resourceProvider = c70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.s00(org.telegram.ui.ActionBar.g6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            h8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder o10 = com.google.android.recaptcha.internal.a.o(str3);
            o10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(o10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.s00(org.telegram.ui.ActionBar.g6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            h8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = c70Var.r;
        h8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : c70Var.b0(c70Var.v) != null ? c70Var.b0(c70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h8 h8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            c70 c70Var = this.r;
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.c, i11, 21, 0, 0, false, false, c70Var.getResourceProvider());
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            dqVar.w = true;
            j4Var.setBackground(dqVar);
            j4Var.setText(LocaleController.getString(c70Var.J ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            h8Var = j4Var;
        } else {
            org.telegram.ui.Cells.h8 h8Var2 = new org.telegram.ui.Cells.h8(context, 3);
            h8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            h8Var = h8Var2;
        }
        h8Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(h8Var);
    }
}
