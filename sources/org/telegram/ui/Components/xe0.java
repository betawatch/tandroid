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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xe0 {
    public final /* synthetic */ af0 a;

    public xe0(af0 af0Var) {
        this.a = af0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        String str;
        boolean z10;
        int i11;
        int i12;
        ye0 ye0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        float f7;
        float f10;
        float f11;
        float f12;
        af0 af0Var = this.a;
        ArrayList arrayList = af0Var.L;
        ArrayList arrayList2 = af0Var.M;
        boolean z11 = i10 != 0;
        if (z11) {
            ye0 ye0Var2 = new ye0(context);
            TextView textView = new TextView(context);
            ye0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.j6.G6;
            int i15 = af0.O;
            int themedColor = af0Var.getThemedColor(i14);
            boolean z12 = af0Var.J;
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
            ye0Var2.addView(textView, w7.y5.d(-1, -1.0f, i16, f7, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            ye0Var2.b = textView2;
            textView2.setTextColor(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.z6));
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
            ye0Var2.addView(textView2, w7.y5.d(-2, -2.0f, i17, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            ye0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            ye0Var2.addView(imageView, w7.y5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            ye0Var = ye0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                ye0Var2.d = r92;
                int i18 = org.telegram.ui.ActionBar.j6.M6;
                int i19 = org.telegram.ui.ActionBar.j6.N6;
                int i20 = org.telegram.ui.ActionBar.j6.d6;
                r92.d(i18, i19, i20, i20);
                ye0Var2.addView(r92, w7.y5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                ye0Var = ye0Var2;
            }
        } else {
            ?? ze0Var = new ze0(context);
            ze0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = af0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.f3) af0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                }
                z10 = true;
            }
            g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
            g9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.f3) af0Var).currentAccount;
            g9Var.m(i12, tL_userContact_old2);
            v9 v9Var = new v9(context);
            v9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            v9Var.e(tL_userContact_old2, g9Var);
            ze0Var.addView(v9Var, w7.y5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.rk.k(17.0f, 1, textView3);
            textView3.setTextColor(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            ze0Var.addView(textView3, w7.y5.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            ye0Var = ze0Var;
            if (str != null) {
                TextView f13 = org.telegram.messenger.l0.f(context, 1, 14.0f);
                f13.setTextColor(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.r5));
                f13.setSingleLine(true);
                f13.setEllipsize(truncateAt);
                f13.setText(str);
                ze0Var.addView(f13, w7.y5.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                ye0Var = ze0Var;
            }
        }
        if (z11) {
            ye0 ye0Var3 = ye0Var;
            int i21 = af0Var.F;
            if (i10 < i21 || i10 >= af0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - af0Var.H);
                int i22 = vcardItem.type;
                i13 = i22 == 1 ? R.drawable.msg_mention : i22 == 2 ? R.drawable.msg_location : i22 == 3 ? R.drawable.msg_link : i22 == 4 ? R.drawable.msg_info : i22 == 5 ? R.drawable.msg_calendar2 : i22 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i22 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i21);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != af0Var.E - 1;
            ImageView imageView2 = ye0Var3.c;
            ye0Var3.a.setText(vcardItem.getValue(true));
            ye0Var3.b.setText(vcardItem.getType());
            Switch r82 = ye0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            ye0Var3.e = z16;
            ye0Var3.setWillNotDraw(!z16);
        }
        return ye0Var;
    }
}
