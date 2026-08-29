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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b70 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public x60 f;
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
        x60 x60Var = b70Var.f;
        if (x60Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x60Var);
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
        x60 x60Var2 = new x60(1, b70Var, str);
        b70Var.f = x60Var2;
        AndroidUtilities.runOnUIThread(x60Var2, 300L);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return j(n1Var.b()) == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) n1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        i8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
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
            spannableString.setSpan(new org.telegram.ui.Components.a10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            i8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
            n10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(n10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.a10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            i8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = c70Var.r;
        i8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : c70Var.b0(c70Var.v) != null ? c70Var.b0(c70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i8 i8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            c70 c70Var = this.r;
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(this.c, i11, 21, 0, 0, false, false, c70Var.getResourceProvider());
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(c70Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            jqVar.w = true;
            k4Var.setBackground(jqVar);
            k4Var.setText(LocaleController.getString(c70Var.J ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            i8Var = k4Var;
        } else {
            org.telegram.ui.Cells.i8 i8Var2 = new org.telegram.ui.Cells.i8(context, 3);
            i8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            i8Var = i8Var2;
        }
        i8Var.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.vk0(i8Var);
    }
}
