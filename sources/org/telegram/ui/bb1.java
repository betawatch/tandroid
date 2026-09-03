package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb1 implements org.telegram.ui.Components.fl0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ bb1(ThemeActivity themeActivity, int i10) {
        this.a = i10;
        this.b = themeActivity;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                ThemeActivity themeActivity = this.b;
                themeActivity.getClass();
                org.telegram.ui.Components.z4.W(themeActivity, 0, null, null);
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

    @Override // org.telegram.ui.Components.fl0
    public int run() {
        int i10;
        i10 = this.b.sensitiveContentRow;
        return i10;
    }
}
