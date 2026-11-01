package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d71 implements org.telegram.ui.Components.ek0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ d71(ThemeActivity themeActivity, int i10) {
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

    @Override // org.telegram.ui.Components.ek0
    public int run() {
        int i10;
        i10 = this.b.sensitiveContentRow;
        return i10;
    }
}
