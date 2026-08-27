package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.m0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.m0.getLastFragment()) != null && !(lastFragment instanceof xb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.mc a02 = org.telegram.ui.Components.mc.a0(lastFragment);
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.g6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    p80 p80Var = new p80(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.c6 c6Var = a02.c;
                    org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(W, c6Var);
                    bcVar.a.setImageDrawable(p9Var);
                    bcVar.b.setText(string);
                    bcVar.c.setText(formatString);
                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(a02.W(), c6Var, true);
                    ccVar.e(string2);
                    ccVar.a = p80Var;
                    bcVar.setButton(ccVar);
                    org.telegram.ui.Components.ec b10 = a02.b(bcVar, 2750);
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
