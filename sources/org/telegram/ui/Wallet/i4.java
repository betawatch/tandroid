package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i4 extends org.telegram.ui.ActionBar.k3 {
    public i4(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, (Context) activity, u6Var, false);
        this.behindKeyboardColorKey = org.telegram.ui.ActionBar.y6.a7;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
            setBackgroundColor(themedColor);
            if (this.navBarColor != themedColor) {
                fixNavigationBar(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
