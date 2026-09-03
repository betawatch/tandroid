package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dv implements View.OnClickListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;
    public final /* synthetic */ ev c;

    public dv(ev evVar, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.c = evVar;
        this.a = context;
        this.b = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        if (qy.u4) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false);
        qy.u4 = true;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
            String str3 = str2;
            boolean z4 = !q10;
            org.telegram.ui.ActionBar.i6 N0 = q10 ? org.telegram.ui.ActionBar.j6.N0(str3) : org.telegram.ui.ActionBar.j6.N0(str);
            org.telegram.ui.Components.gj0 gj0Var = this.c.d;
            gj0Var.N(q10 ? gj0Var.e[0] - 1 : 0);
            this.c.e.getImageView().d();
            int[] iArr = {(this.c.e.getImageView().getMeasuredWidth() / 2) + r2, org.telegram.messenger.y3.C(3.0f, this.c.e.getImageView().getMeasuredHeight() / 2, r2)};
            this.c.e.getImageView().getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z4), this.c.e.getImageView(), this.c.e, new org.telegram.messenger.b8(this, w02, this.a, w03, z4, this.b));
        }
        str = string;
        boolean q102 = org.telegram.ui.ActionBar.j6.I.q();
        String str32 = str2;
        boolean z42 = !q102;
        org.telegram.ui.ActionBar.i6 N02 = q102 ? org.telegram.ui.ActionBar.j6.N0(str32) : org.telegram.ui.ActionBar.j6.N0(str);
        org.telegram.ui.Components.gj0 gj0Var2 = this.c.d;
        gj0Var2.N(q102 ? gj0Var2.e[0] - 1 : 0);
        this.c.e.getImageView().d();
        int[] iArr2 = {(this.c.e.getImageView().getMeasuredWidth() / 2) + i10, org.telegram.messenger.y3.C(3.0f, this.c.e.getImageView().getMeasuredHeight() / 2, i11)};
        this.c.e.getImageView().getLocationInWindow(iArr2);
        int i102 = iArr2[0];
        int i112 = iArr2[1];
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N02, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z42), this.c.e.getImageView(), this.c.e, new org.telegram.messenger.b8(this, w02, this.a, w03, z42, this.b));
    }
}
