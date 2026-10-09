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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nf0 {
    public final /* synthetic */ qf0 a;

    public nf0(qf0 qf0Var) {
        this.a = qf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        String str;
        int i11;
        int i12;
        of0 of0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        float f7;
        float f10;
        float f11;
        float f12;
        qf0 qf0Var = this.a;
        ArrayList arrayList = qf0Var.L;
        ArrayList arrayList2 = qf0Var.M;
        boolean z11 = i10 != 0;
        if (z11) {
            of0 of0Var2 = new of0(context);
            TextView textView = new TextView(context);
            of0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.i6.G6;
            int i15 = qf0.O;
            int themedColor = qf0Var.getThemedColor(i14);
            boolean z12 = qf0Var.J;
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
            of0Var2.addView(textView, w7.x5.a(-1.0f, f7, 10.0f, f10, 0.0f, -1, i16));
            TextView textView2 = new TextView(context);
            of0Var2.b = textView2;
            textView2.setTextColor(qf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.z6));
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
            of0Var2.addView(textView2, w7.x5.a(-2.0f, f11, 35.0f, f12, 0.0f, -2, i17));
            ImageView imageView = new ImageView(context);
            of0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(qf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            of0Var2.addView(imageView, w7.x5.a(-2.0f, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f, -2, (z15 ? 5 : 3) | 48));
            of0Var = of0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                of0Var2.d = r92;
                int i18 = org.telegram.ui.ActionBar.i6.M6;
                int i19 = org.telegram.ui.ActionBar.i6.N6;
                int i20 = org.telegram.ui.ActionBar.i6.d6;
                r92.d(i18, i19, i20, i20);
                of0Var2.addView(r92, w7.x5.a(40.0f, 22.0f, 0.0f, 22.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 16));
                of0Var = of0Var2;
            }
        } else {
            ?? pf0Var = new pf0(context);
            pf0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = qf0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.f3) qf0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z10 = true;
                }
            }
            j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.f3) qf0Var).currentAccount;
            j9Var.m(i12, tL_userContact_old2);
            y9 y9Var = new y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            y9Var.e(tL_userContact_old2, j9Var);
            pf0Var.addView(y9Var, w7.x5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.bi.k(17.0f, 1, textView3);
            textView3.setTextColor(qf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            pf0Var.addView(textView3, w7.x5.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            of0Var = pf0Var;
            if (str != null) {
                TextView f13 = org.telegram.messenger.q.f(context, 1, 14.0f);
                f13.setTextColor(qf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.r5));
                f13.setSingleLine(true);
                f13.setEllipsize(truncateAt);
                f13.setText(str);
                pf0Var.addView(f13, w7.x5.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                of0Var = pf0Var;
            }
        }
        if (z11) {
            of0 of0Var3 = of0Var;
            int i21 = qf0Var.F;
            if (i10 < i21 || i10 >= qf0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - qf0Var.H);
                int i22 = vcardItem.type;
                i13 = i22 == 1 ? R.drawable.msg_mention : i22 == 2 ? R.drawable.msg_location : i22 == 3 ? R.drawable.msg_link : i22 == 4 ? R.drawable.msg_info : i22 == 5 ? R.drawable.msg_calendar2 : i22 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i22 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i21);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != qf0Var.E - 1;
            ImageView imageView2 = of0Var3.c;
            of0Var3.a.setText(vcardItem.getValue(true));
            of0Var3.b.setText(vcardItem.getType());
            Switch r82 = of0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            of0Var3.e = z16;
            of0Var3.setWillNotDraw(!z16);
        }
        return of0Var;
    }
}
