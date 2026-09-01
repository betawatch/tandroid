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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class re0 {
    public final /* synthetic */ ue0 a;

    public re0(ue0 ue0Var) {
        this.a = ue0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        String str;
        boolean z4;
        int i11;
        int i12;
        se0 se0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        float f10;
        float f11;
        float f12;
        float f13;
        ue0 ue0Var = this.a;
        ArrayList arrayList = ue0Var.I;
        ArrayList arrayList2 = ue0Var.J;
        boolean z10 = i10 != 0;
        if (z10) {
            se0 se0Var2 = new se0(context);
            TextView textView = new TextView(context);
            se0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            int i15 = ue0.L;
            int themedColor = ue0Var.getThemedColor(i14);
            boolean z11 = ue0Var.G;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z12 = LocaleController.isRTL;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f10 = z11 ? 17 : 64;
            } else {
                f10 = 72.0f;
            }
            if (z12) {
                f11 = 72.0f;
            } else {
                f11 = z11 ? 17 : 64;
            }
            se0Var2.addView(textView, k7.c6.d(-1, -1.0f, i16, f10, 10.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            se0Var2.b = textView2;
            textView2.setTextColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z13 = LocaleController.isRTL;
            int i17 = z13 ? 5 : 3;
            if (z13) {
                f12 = z11 ? 17 : 64;
            } else {
                f12 = 72.0f;
            }
            if (z13) {
                f13 = 72.0f;
            } else {
                f13 = z11 ? 17 : 64;
            }
            se0Var2.addView(textView2, k7.c6.d(-2, -2.0f, i17, f12, 35.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            se0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z14 = LocaleController.isRTL;
            se0Var2.addView(imageView, k7.c6.d(-2, -2.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 20.0f, 20.0f, z14 ? 20.0f : 0.0f, 0.0f));
            se0Var = se0Var2;
            if (!z11) {
                Switch r92 = new Switch(context, null);
                se0Var2.d = r92;
                int i18 = org.telegram.ui.ActionBar.k6.M6;
                int i19 = org.telegram.ui.ActionBar.k6.N6;
                int i20 = org.telegram.ui.ActionBar.k6.d6;
                r92.d(i18, i19, i20, i20);
                se0Var2.addView(r92, k7.c6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                se0Var = se0Var2;
            }
        } else {
            ?? te0Var = new te0(context);
            te0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = ue0Var.K;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z4 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.h3) ue0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                }
                z4 = true;
            }
            z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
            z8Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.h3) ue0Var).currentAccount;
            z8Var.m(i12, tL_userContact_old2);
            p9 p9Var = new p9(context);
            p9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            p9Var.e(tL_userContact_old2, z8Var);
            te0Var.addView(p9Var, k7.c6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.ui.b.g(17.0f, 1, textView3);
            textView3.setTextColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            te0Var.addView(textView3, k7.c6.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            se0Var = te0Var;
            if (str != null) {
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 14.0f);
                g10.setTextColor(ue0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r5));
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                te0Var.addView(g10, k7.c6.t(-2, -2, 49, 10, 3, 10, z4 ? 27 : 11));
                se0Var = te0Var;
            }
        }
        if (z10) {
            se0 se0Var3 = se0Var;
            int i21 = ue0Var.C;
            if (i10 < i21 || i10 >= ue0Var.D) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - ue0Var.E);
                int i22 = vcardItem.type;
                i13 = i22 == 1 ? R.drawable.msg_mention : i22 == 2 ? R.drawable.msg_location : i22 == 3 ? R.drawable.msg_link : i22 == 4 ? R.drawable.msg_info : i22 == 5 ? R.drawable.msg_calendar2 : i22 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i22 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i21);
                i13 = R.drawable.msg_calls;
            }
            boolean z15 = i10 != ue0Var.B - 1;
            ImageView imageView2 = se0Var3.c;
            se0Var3.a.setText(vcardItem.getValue(true));
            se0Var3.b.setText(vcardItem.getType());
            Switch r82 = se0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            se0Var3.e = z15;
            se0Var3.setWillNotDraw(!z15);
        }
        return se0Var;
    }
}
