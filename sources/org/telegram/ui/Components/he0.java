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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class he0 {
    public final /* synthetic */ ke0 a;

    public he0(ke0 ke0Var) {
        this.a = ke0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        String str;
        boolean z10;
        int i11;
        int i12;
        ie0 ie0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        float f9;
        float f10;
        float f11;
        float f12;
        ke0 ke0Var = this.a;
        ArrayList arrayList = ke0Var.H;
        ArrayList arrayList2 = ke0Var.I;
        boolean z11 = i10 != 0;
        if (z11) {
            ie0 ie0Var2 = new ie0(context);
            TextView textView = new TextView(context);
            ie0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            int i15 = ke0.K;
            int themedColor = ke0Var.getThemedColor(i14);
            boolean z12 = ke0Var.F;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            int i16 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f9 = z12 ? 17 : 64;
            } else {
                f9 = 72.0f;
            }
            if (z13) {
                f10 = 72.0f;
            } else {
                f10 = z12 ? 17 : 64;
            }
            ie0Var2.addView(textView, i7.f6.d(-1, -1.0f, i16, f9, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            ie0Var2.b = textView2;
            textView2.setTextColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.z6));
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
            ie0Var2.addView(textView2, i7.f6.d(-2, -2.0f, i17, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            ie0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            ie0Var2.addView(imageView, i7.f6.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            ie0Var = ie0Var2;
            if (!z12) {
                Switch r9 = new Switch(context, null);
                ie0Var2.d = r9;
                int i18 = org.telegram.ui.ActionBar.g6.M6;
                int i19 = org.telegram.ui.ActionBar.g6.N6;
                int i20 = org.telegram.ui.ActionBar.g6.d6;
                r9.d(i18, i19, i20, i20);
                ie0Var2.addView(r9, i7.f6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                ie0Var = ie0Var2;
            }
        } else {
            ?? je0Var = new je0(context);
            je0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = ke0Var.J;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.f3) ke0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                }
                z10 = true;
            }
            e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.f3) ke0Var).currentAccount;
            e9Var.m(i12, tL_userContact_old2);
            t9 t9Var = new t9(context);
            t9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            t9Var.e(tL_userContact_old2, e9Var);
            je0Var.addView(t9Var, i7.f6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.ui.b.g(17.0f, 1, textView3);
            textView3.setTextColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            je0Var.addView(textView3, i7.f6.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            ie0Var = je0Var;
            if (str != null) {
                TextView h = org.telegram.messenger.x3.h(context, 1, 14.0f);
                h.setTextColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.r5));
                h.setSingleLine(true);
                h.setEllipsize(truncateAt);
                h.setText(str);
                je0Var.addView(h, i7.f6.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                ie0Var = je0Var;
            }
        }
        if (z11) {
            ie0 ie0Var3 = ie0Var;
            int i21 = ke0Var.B;
            if (i10 < i21 || i10 >= ke0Var.C) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - ke0Var.D);
                int i22 = vcardItem.type;
                i13 = i22 == 1 ? R.drawable.msg_mention : i22 == 2 ? R.drawable.msg_location : i22 == 3 ? R.drawable.msg_link : i22 == 4 ? R.drawable.msg_info : i22 == 5 ? R.drawable.msg_calendar2 : i22 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i22 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i21);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != ke0Var.A - 1;
            ImageView imageView2 = ie0Var3.c;
            ie0Var3.a.setText(vcardItem.getValue(true));
            ie0Var3.b.setText(vcardItem.getType());
            Switch r82 = ie0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            ie0Var3.e = z16;
            ie0Var3.setWillNotDraw(!z16);
        }
        return ie0Var;
    }
}
