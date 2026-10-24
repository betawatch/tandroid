package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j4 extends org.telegram.ui.ActionBar.h3 {
    public j4(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, (Context) activity, g6Var, false);
        this.behindKeyboardColorKey = org.telegram.ui.ActionBar.k6.a7;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            setBackgroundColor(themedColor);
            if (this.navBarColor != themedColor) {
                fixNavigationBar(themedColor);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
