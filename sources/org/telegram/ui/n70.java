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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n70 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public w10 f;
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
        if (o70Var.K) {
            if (TextUtils.isEmpty(str)) {
                o70Var.d.setBackground(null);
            } else {
                o70Var.d.setBackgroundColor(o70Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
        }
        if (n70Var.n != 0) {
            o70Var.getConnectionsManager().cancelRequest(n70Var.n, true);
            n70Var.n = 0;
        }
        w10 w10Var = n70Var.f;
        if (w10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w10Var);
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
        w10 w10Var2 = new w10(9, n70Var, str);
        n70Var.f = w10Var2;
        AndroidUtilities.runOnUIThread(w10Var2, 300L);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return j(l1Var.b()) == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z4 = i10 > this.d.size();
        ArrayList arrayList = z4 ? this.e : this.d;
        if (z4) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) l1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        j8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z4);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        o70 o70Var = this.r;
        org.telegram.ui.ActionBar.f6 resourceProvider = o70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            j8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder l10 = e2.c.l(str3);
            l10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(l10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.f10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            j8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o70Var.r;
        j8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : o70Var.b0(o70Var.v) != null ? o70Var.b0(o70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.j8 j8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            o70 o70Var = this.r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, i11, 21, 0, 0, false, false, o70Var.getResourceProvider());
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(o70Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            mqVar.w = true;
            l4Var.setBackground(mqVar);
            l4Var.setText(LocaleController.getString(o70Var.K ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            j8Var = l4Var;
        } else {
            org.telegram.ui.Cells.j8 j8Var2 = new org.telegram.ui.Cells.j8(context, 3);
            j8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            j8Var = j8Var2;
        }
        j8Var.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.dl0(j8Var);
    }
}
