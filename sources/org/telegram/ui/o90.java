package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o90 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ o90(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.o2 lastFragment;
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.m0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.m0.getLastFragment()) != null && !(lastFragment instanceof ub0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(lastFragment);
                    org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.g6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    o80 o80Var = new o80(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.c6 c6Var = a02.c;
                    org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(W, c6Var);
                    jcVar.a.setImageDrawable(v9Var);
                    jcVar.b.setText(string);
                    jcVar.c.setText(formatString);
                    org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(a02.W(), c6Var, true);
                    kcVar.e(string2);
                    kcVar.a = o80Var;
                    jcVar.setButton(kcVar);
                    org.telegram.ui.Components.mc b10 = a02.b(jcVar, 2750);
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
