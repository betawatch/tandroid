package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f71 implements org.telegram.ui.Components.dk0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ f71(ThemeActivity themeActivity, int i10) {
        this.a = i10;
        this.b = themeActivity;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                ThemeActivity themeActivity = this.b;
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                ThemeActivity themeActivity2 = this.b;
                themeActivity2.getClass();
                org.telegram.ui.Components.s4.V(themeActivity2, 0, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public int run() {
        int i10;
        i10 = this.b.sensitiveContentRow;
        return i10;
    }
}
