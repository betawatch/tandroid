package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ ga0(LaunchActivity launchActivity, int i10) {
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
                if (launchActivity.q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.q0.getLastFragment()) != null && !(lastFragment instanceof pc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                    org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    g90 g90Var = new g90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.c;
                    org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(W, f6Var);
                    mcVar.a.setImageDrawable(x9Var);
                    mcVar.b.setText(string);
                    mcVar.c.setText(formatString);
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(a02.W(), f6Var, true);
                    ncVar.e(string2);
                    ncVar.a = g90Var;
                    mcVar.setButton(ncVar);
                    org.telegram.ui.Components.pc b10 = a02.b(mcVar, 2750);
                    b10.j = 5000;
                    b10.j();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity.O).openApp((TLRPC.User) obj, 0);
                break;
        }
    }
}
