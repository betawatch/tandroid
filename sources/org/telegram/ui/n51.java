package org.telegram.ui;

import android.content.Intent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements org.telegram.ui.Components.nj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ n51(ThemeActivity themeActivity, int i7) {
        this.a = i7;
        this.b = themeActivity;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
                org.telegram.ui.Components.c5.T(themeActivity2, 0, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nj0
    public int run() {
        int i7;
        i7 = this.b.sensitiveContentRow;
        return i7;
    }
}
