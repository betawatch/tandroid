package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea1 implements org.telegram.ui.Components.mk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ ea1(ThemeActivity themeActivity, int i10) {
        this.a = i10;
        this.b = themeActivity;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                ThemeActivity themeActivity = this.b;
                themeActivity.getClass();
                org.telegram.ui.Components.y4.W(themeActivity, 0, null, null);
                break;
            default:
                ThemeActivity themeActivity2 = this.b;
                if (themeActivity2.getParentActivity() != null) {
                    try {
                        themeActivity2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mk0
    public int run() {
        int i10;
        i10 = this.b.sensitiveContentRow;
        return i10;
    }
}
