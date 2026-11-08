package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ n51(ThemeActivity themeActivity, int i7) {
        this.a = i7;
        this.b = themeActivity;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                org.telegram.ui.Components.v4.T(themeActivity2, 0, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        int i7;
        i7 = this.b.sensitiveContentRow;
        return i7;
    }
}
