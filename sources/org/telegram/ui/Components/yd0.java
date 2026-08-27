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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yd0 {
    public final /* synthetic */ be0 a;

    public yd0(be0 be0Var) {
        this.a = be0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        String str;
        boolean z10;
        int i11;
        int i12;
        zd0 zd0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        float f10;
        float f11;
        float f12;
        float f13;
        be0 be0Var = this.a;
        ArrayList arrayList = be0Var.H;
        ArrayList arrayList2 = be0Var.I;
        boolean z11 = i10 != 0;
        if (z11) {
            zd0 zd0Var2 = new zd0(context);
            TextView textView = new TextView(context);
            zd0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            int i15 = be0.K;
            int themedColor = be0Var.getThemedColor(i14);
            boolean z12 = be0Var.F;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            int i16 = (z13 ? 5 : 3) | 48;
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
            zd0Var2.addView(textView, h7.z5.d(-1, -1.0f, i16, f10, 10.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            zd0Var2.b = textView2;
            textView2.setTextColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z14 = LocaleController.isRTL;
            int i17 = z14 ? 5 : 3;
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
            zd0Var2.addView(textView2, h7.z5.d(-2, -2.0f, i17, f12, 35.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            zd0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            zd0Var2.addView(imageView, h7.z5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            zd0Var = zd0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                zd0Var2.d = r92;
                int i18 = org.telegram.ui.ActionBar.g6.M6;
                int i19 = org.telegram.ui.ActionBar.g6.N6;
                int i20 = org.telegram.ui.ActionBar.g6.d6;
                r92.d(i18, i19, i20, i20);
                zd0Var2.addView(r92, h7.z5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                zd0Var = zd0Var2;
            }
        } else {
            ?? ae0Var = new ae0(context);
            ae0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = be0Var.J;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.e3) be0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                }
                z10 = true;
            }
            y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.e3) be0Var).currentAccount;
            y8Var.m(i12, tL_userContact_old2);
            n9 n9Var = new n9(context);
            n9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            n9Var.e(tL_userContact_old2, y8Var);
            ae0Var.addView(n9Var, h7.z5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.rl.h(17.0f, 1, textView3);
            textView3.setTextColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            ae0Var.addView(textView3, h7.z5.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            zd0Var = ae0Var;
            if (str != null) {
                TextView h = org.telegram.messenger.y1.h(context, 1, 14.0f);
                h.setTextColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r5));
                h.setSingleLine(true);
                h.setEllipsize(truncateAt);
                h.setText(str);
                ae0Var.addView(h, h7.z5.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                zd0Var = ae0Var;
            }
        }
        if (z11) {
            zd0 zd0Var3 = zd0Var;
            int i21 = be0Var.B;
            if (i10 < i21 || i10 >= be0Var.C) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - be0Var.D);
                int i22 = vcardItem.type;
                i13 = i22 == 1 ? R.drawable.msg_mention : i22 == 2 ? R.drawable.msg_location : i22 == 3 ? R.drawable.msg_link : i22 == 4 ? R.drawable.msg_info : i22 == 5 ? R.drawable.msg_calendar2 : i22 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i22 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i21);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != be0Var.A - 1;
            ImageView imageView2 = zd0Var3.c;
            zd0Var3.a.setText(vcardItem.getValue(true));
            zd0Var3.b.setText(vcardItem.getType());
            Switch r82 = zd0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            zd0Var3.e = z16;
            zd0Var3.setWillNotDraw(!z16);
        }
        return zd0Var;
    }
}
