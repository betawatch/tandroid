package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ k90(LaunchActivity launchActivity, int i9) {
        this.a = i9;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.o2 lastFragment;
        int i9 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i9) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.m0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.m0.getLastFragment()) != null && !(lastFragment instanceof sb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(lastFragment);
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.f6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    l80 l80Var = new l80(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.b6 b6Var = a02.c;
                    org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(W, b6Var);
                    dcVar.a.setImageDrawable(q9Var);
                    dcVar.b.setText(string);
                    dcVar.c.setText(formatString);
                    org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(a02.W(), b6Var, true);
                    ecVar.e(string2);
                    ecVar.a = l80Var;
                    dcVar.setButton(ecVar);
                    org.telegram.ui.Components.gc b10 = a02.b(dcVar, 2750);
                    b10.j = 5000;
                    b10.j();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                MessagesController.getInstance(launchActivity.K).openApp((TLRPC.User) obj, 0);
                break;
        }
    }
}
