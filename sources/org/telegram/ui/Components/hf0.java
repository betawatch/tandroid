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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hf0 {
    public final /* synthetic */ kf0 a;

    public hf0(kf0 kf0Var) {
        this.a = kf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        String str;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        if0 if0Var;
        AndroidUtilities.VcardItem vcardItem;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var3;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.u6 u6Var4;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.u6 u6Var5;
        kf0 kf0Var = this.a;
        ArrayList arrayList = kf0Var.L;
        ArrayList arrayList2 = kf0Var.M;
        boolean z11 = i10 != 0;
        if (z11) {
            if0 if0Var2 = new if0(context);
            TextView textView = new TextView(context);
            if0Var2.a = textView;
            int i14 = org.telegram.ui.ActionBar.y6.G6;
            u6Var3 = ((org.telegram.ui.ActionBar.k3) kf0Var).resourcesProvider;
            boolean z12 = kf0Var.J;
            org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var3);
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
            if0Var2.addView(textView, kb1.h(-1, -1.0f, i15, f7, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            if0Var2.b = textView2;
            int i16 = org.telegram.ui.ActionBar.y6.z6;
            u6Var4 = ((org.telegram.ui.ActionBar.k3) kf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView2, i16, u6Var4);
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
            if0Var2.addView(textView2, kb1.h(-2, -2.0f, i17, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            if0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i18 = org.telegram.ui.ActionBar.y6.m6;
            u6Var5 = ((org.telegram.ui.ActionBar.k3) kf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.t(imageView, i18, u6Var5, PorterDuff.Mode.MULTIPLY);
            boolean z15 = LocaleController.isRTL;
            if0Var2.addView(imageView, kb1.h(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            if0Var = if0Var2;
            if (!z12) {
                Switch r92 = new Switch(context, null);
                if0Var2.d = r92;
                int i19 = org.telegram.ui.ActionBar.y6.M6;
                int i20 = org.telegram.ui.ActionBar.y6.N6;
                int i21 = org.telegram.ui.ActionBar.y6.d6;
                r92.d(i19, i20, i21, i21);
                if0Var2.addView(r92, kb1.h(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                if0Var = if0Var2;
            }
        } else {
            ?? jf0Var = new jf0(context);
            jf0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = kf0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z10 = true;
                    str = null;
                } else {
                    i11 = ((org.telegram.ui.ActionBar.k3) kf0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z10 = true;
                }
            }
            j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.k3) kf0Var).currentAccount;
            j9Var.m(i12, tL_userContact_old2);
            y9 y9Var = new y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            y9Var.f(tL_userContact_old2, j9Var);
            jf0Var.addView(y9Var, kb1.x(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.wh.j(17.0f, 1, textView3);
            int i22 = org.telegram.ui.ActionBar.y6.j5;
            u6Var = ((org.telegram.ui.ActionBar.k3) kf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView3, i22, u6Var);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            jf0Var.addView(textView3, kb1.x(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            if0Var = jf0Var;
            if (str != null) {
                TextView g7 = org.telegram.messenger.t.g(context, 1, 14.0f);
                int i23 = org.telegram.ui.ActionBar.y6.r5;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) kf0Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(g7, i23, u6Var2);
                g7.setSingleLine(true);
                g7.setEllipsize(truncateAt);
                g7.setText(str);
                jf0Var.addView(g7, kb1.x(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                if0Var = jf0Var;
            }
        }
        if (z11) {
            if0 if0Var3 = if0Var;
            int i24 = kf0Var.F;
            if (i10 < i24 || i10 >= kf0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - kf0Var.H);
                int i25 = vcardItem.type;
                i13 = i25 == 1 ? R.drawable.msg_mention : i25 == 2 ? R.drawable.msg_location : i25 == 3 ? R.drawable.msg_link : i25 == 4 ? R.drawable.msg_info : i25 == 5 ? R.drawable.msg_calendar2 : i25 == 6 ? "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle : i25 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i24);
                i13 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != kf0Var.E - 1;
            ImageView imageView2 = if0Var3.c;
            if0Var3.a.setText(vcardItem.getValue(true));
            if0Var3.b.setText(vcardItem.getType());
            Switch r82 = if0Var3.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i13 != 0) {
                imageView2.setImageResource(i13);
            } else {
                imageView2.setImageDrawable(null);
            }
            if0Var3.e = z16;
            if0Var3.setWillNotDraw(!z16);
        }
        return if0Var;
    }
}
