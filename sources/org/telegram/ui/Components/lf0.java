package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lf0 {
    public final /* synthetic */ of0 a;

    public lf0(of0 of0Var) {
        this.a = of0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        String str;
        int i11;
        int i12;
        mf0 mf0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        float f7;
        float f10;
        float f11;
        float f12;
        of0 of0Var = this.a;
        ArrayList arrayList = of0Var.L;
        ArrayList arrayList2 = of0Var.M;
        boolean z11 = i10 != 0;
        if (z11) {
            mf0 mf0Var2 = new mf0(context);
            TextView textView = new TextView(context);
            mf0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            int i15 = of0.O;
            int themedColor = of0Var.getThemedColor(i14);
            boolean z12 = of0Var.J;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            int i16 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f7 = z12 ? 17 : 64;
            } else {
                f7 = 72.0f;
            }
            if (z13) {
                f10 = 72.0f;
            } else {
                f10 = z12 ? 17 : 64;
            }
            mf0Var2.addView(textView, w7.a6.a(-1.0f, f7, 10.0f, f10, 0.0f, -1, i16));
            TextView textView2 = new TextView(context);
            mf0Var2.b = textView2;
            textView2.setTextColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z14 = LocaleController.isRTL;
            int i17 = z14 ? 5 : 3;
            if (z14) {
                f11 = z12 ? 17 : 64;
            } else {
                f11 = 72.0f;
            }
            if (z14) {
                f12 = 72.0f;
            } else {
                f12 = z12 ? 17 : 64;
            }
            mf0Var2.addView(textView2, w7.a6.a(-2.0f, f11, 35.0f, f12, 0.0f, -2, i17));
            ImageView imageView = new ImageView(context);
            mf0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            mf0Var2.addView(imageView, w7.a6.a(-2.0f, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f, -2, (z15 ? 5 : 3) | 48));
            mf0Var = mf0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                mf0Var2.d = r92;
                int i18 = org.telegram.ui.ActionBar.g6.M6;
                int i19 = org.telegram.ui.ActionBar.g6.N6;
                int i20 = org.telegram.ui.ActionBar.g6.d6;
                r92.d(i18, i19, i20, i20);
                mf0Var2.addView(r92, w7.a6.a(40.0f, 22.0f, 0.0f, 22.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 16));
                mf0Var = mf0Var2;
            }
        } else {
            ?? nf0Var = new nf0(context);
            nf0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = of0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.e3) of0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z10 = true;
                }
            }
            k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.e3) of0Var).currentAccount;
            k9Var.m(i12, tL_userContact_old2);
            z9 z9Var = new z9(context);
            z9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            z9Var.e(tL_userContact_old2, k9Var);
            nf0Var.addView(z9Var, w7.a6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.yh.k(17.0f, 1, textView3);
            textView3.setTextColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            nf0Var.addView(textView3, w7.a6.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            mf0Var = nf0Var;
            if (str != null) {
                TextView g10 = org.telegram.messenger.q.g(context, 1, 14.0f);
                g10.setTextColor(of0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r5));
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                nf0Var.addView(g10, w7.a6.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                mf0Var = nf0Var;
            }
        }
        if (z11) {
            mf0 mf0Var3 = mf0Var;
            int i21 = of0Var.F;
            if (i10 < i21 || i10 >= of0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - of0Var.H);
                int i22 = vcardItem.type;
                i13 = i22 == 1 ? R.drawable.msg_mention : i22 == 2 ? R.drawable.msg_location : i22 == 3 ? R.drawable.msg_link : i22 == 4 ? R.drawable.msg_info : i22 == 5 ? R.drawable.msg_calendar2 : i22 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i22 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i21);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != of0Var.E - 1;
            ImageView imageView2 = mf0Var3.c;
            mf0Var3.a.setText(vcardItem.getValue(true));
            mf0Var3.b.setText(vcardItem.getType());
            Switch r82 = mf0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            mf0Var3.e = z16;
            mf0Var3.setWillNotDraw(!z16);
        }
        return mf0Var;
    }
}
