package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jf0 {
    public final /* synthetic */ mf0 a;

    public jf0(mf0 mf0Var) {
        this.a = mf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        String str;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        kf0 kf0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var3;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        mf0 mf0Var = this.a;
        ArrayList arrayList = mf0Var.L;
        ArrayList arrayList2 = mf0Var.M;
        boolean z11 = i10 != 0;
        if (z11) {
            kf0 kf0Var2 = new kf0(context);
            TextView textView = new TextView(context);
            kf0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            g6Var3 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            boolean z12 = mf0Var.J;
            org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var3);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            int i15 = (z13 ? 5 : 3) | 48;
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
            kf0Var2.addView(textView, w7.z5.d(-1, -1.0f, i15, f7, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            kf0Var2.b = textView2;
            int i16 = org.telegram.ui.ActionBar.k6.z6;
            g6Var4 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView2, i16, g6Var4);
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
            kf0Var2.addView(textView2, w7.z5.d(-2, -2.0f, i17, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            kf0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i18 = org.telegram.ui.ActionBar.k6.m6;
            g6Var5 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.t(imageView, i18, g6Var5, PorterDuff.Mode.MULTIPLY);
            boolean z15 = LocaleController.isRTL;
            kf0Var2.addView(imageView, w7.z5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            kf0Var = kf0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                kf0Var2.d = r92;
                int i19 = org.telegram.ui.ActionBar.k6.M6;
                int i20 = org.telegram.ui.ActionBar.k6.N6;
                int i21 = org.telegram.ui.ActionBar.k6.d6;
                r92.d(i19, i20, i21, i21);
                kf0Var2.addView(r92, w7.z5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                kf0Var = kf0Var2;
            }
        } else {
            ?? lf0Var = new lf0(context);
            lf0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = mf0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.h3) mf0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z10 = true;
                }
            }
            h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
            h9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.h3) mf0Var).currentAccount;
            h9Var.m(i12, tL_userContact_old2);
            w9 w9Var = new w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            w9Var.e(tL_userContact_old2, h9Var);
            lf0Var.addView(w9Var, w7.z5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.sl.k(17.0f, 1, textView3);
            int i22 = org.telegram.ui.ActionBar.k6.j5;
            g6Var = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView3, i22, g6Var);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            lf0Var.addView(textView3, w7.z5.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            kf0Var = lf0Var;
            if (str != null) {
                TextView g10 = org.telegram.messenger.v0.g(context, 1, 14.0f);
                int i23 = org.telegram.ui.ActionBar.k6.r5;
                g6Var2 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
                org.telegram.ui.ActionBar.r6.W(g10, i23, g6Var2);
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                lf0Var.addView(g10, w7.z5.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                kf0Var = lf0Var;
            }
        }
        if (z11) {
            kf0 kf0Var3 = kf0Var;
            int i24 = mf0Var.F;
            if (i10 < i24 || i10 >= mf0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - mf0Var.H);
                int i25 = vcardItem.type;
                i13 = i25 == 1 ? R.drawable.msg_mention : i25 == 2 ? R.drawable.msg_location : i25 == 3 ? R.drawable.msg_link : i25 == 4 ? R.drawable.msg_info : i25 == 5 ? R.drawable.msg_calendar2 : i25 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i25 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i24);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != mf0Var.E - 1;
            ImageView imageView2 = kf0Var3.c;
            kf0Var3.a.setText(vcardItem.getValue(true));
            kf0Var3.b.setText(vcardItem.getType());
            Switch r82 = kf0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            kf0Var3.e = z16;
            kf0Var3.setWillNotDraw(!z16);
        }
        return kf0Var;
    }
}
