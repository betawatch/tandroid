package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga1 implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ ga1(ThemeActivity themeActivity, int i9) {
        this.a = i9;
        this.b = themeActivity;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
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

    @Override // org.telegram.ui.Components.jk0
    public int run() {
        int i9;
        i9 = this.b.sensitiveContentRow;
        return i9;
    }
}
