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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class td0 {
    public final /* synthetic */ wd0 a;

    public td0(wd0 wd0Var) {
        this.a = wd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i9) {
        String str;
        boolean z10;
        int i10;
        int i11;
        ud0 ud0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        wd0 wd0Var = this.a;
        ArrayList arrayList = wd0Var.H;
        ArrayList arrayList2 = wd0Var.I;
        boolean z11 = i9 != 0;
        if (z11) {
            ud0 ud0Var2 = new ud0(context);
            TextView textView = new TextView(context);
            ud0Var2.a = textView;
            int i13 = org.telegram.ui.ActionBar.f6.G6;
            int i14 = wd0.K;
            int themedColor = wd0Var.getThemedColor(i13);
            boolean z12 = wd0Var.F;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            int i15 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f10 = z12 ? 17 : 64;
            } else {
                f10 = 72.0f;
            }
            if (z13) {
                f11 = 72.0f;
            } else {
                f11 = z12 ? 17 : 64;
            }
            ud0Var2.addView(textView, g7.e6.d(-1, -1.0f, i15, f10, 10.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            ud0Var2.b = textView2;
            textView2.setTextColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z14 = LocaleController.isRTL;
            int i16 = z14 ? 5 : 3;
            if (z14) {
                f12 = z12 ? 17 : 64;
            } else {
                f12 = 72.0f;
            }
            if (z14) {
                f13 = 72.0f;
            } else {
                f13 = z12 ? 17 : 64;
            }
            ud0Var2.addView(textView2, g7.e6.d(-2, -2.0f, i16, f12, 35.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            ud0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            ud0Var2.addView(imageView, g7.e6.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            ud0Var = ud0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                ud0Var2.d = r92;
                int i17 = org.telegram.ui.ActionBar.f6.M6;
                int i18 = org.telegram.ui.ActionBar.f6.N6;
                int i19 = org.telegram.ui.ActionBar.f6.d6;
                r92.d(i17, i18, i19, i19);
                ud0Var2.addView(r92, g7.e6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                ud0Var = ud0Var2;
            }
        } else {
            ?? vd0Var = new vd0(context);
            vd0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = wd0Var.J;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    str = null;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f3) wd0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i10, tL_userContact_old2);
                }
                z10 = true;
            }
            z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.u(AndroidUtilities.dp(30.0f));
            i11 = ((org.telegram.ui.ActionBar.f3) wd0Var).currentAccount;
            z8Var.m(i11, tL_userContact_old2);
            o9 o9Var = new o9(context);
            o9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            o9Var.e(tL_userContact_old2, z8Var);
            vd0Var.addView(o9Var, g7.e6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.ll.k(17.0f, 1, textView3);
            textView3.setTextColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            vd0Var.addView(textView3, g7.e6.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            ud0Var = vd0Var;
            if (str != null) {
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 14.0f);
                g10.setTextColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.r5));
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                vd0Var.addView(g10, g7.e6.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                ud0Var = vd0Var;
            }
        }
        if (z11) {
            ud0 ud0Var3 = ud0Var;
            int i20 = wd0Var.B;
            if (i9 < i20 || i9 >= wd0Var.C) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i9 - wd0Var.D);
                int i21 = vcardItem.type;
                i12 = i21 == 1 ? R.drawable.msg_mention : i21 == 2 ? R.drawable.msg_location : i21 == 3 ? R.drawable.msg_link : i21 == 4 ? R.drawable.msg_info : i21 == 5 ? R.drawable.msg_calendar2 : i21 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i21 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i9 - i20);
                i12 = R.drawable.msg_calls;
            }
            boolean z16 = i9 != wd0Var.A - 1;
            ImageView imageView2 = ud0Var3.c;
            ud0Var3.a.setText(vcardItem.getValue(true));
            ud0Var3.b.setText(vcardItem.getType());
            Switch r82 = ud0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i12 != 0) {
                imageView2.setImageResource(i12);
            } else {
                imageView2.setImageDrawable(null);
            }
            ud0Var3.e = z16;
            ud0Var3.setWillNotDraw(!z16);
        }
        return ud0Var;
    }
}
