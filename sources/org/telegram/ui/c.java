package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ c(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                gVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                g gVar2 = this.b;
                gVar2.getClass();
                ig0 ig0Var = new ig0();
                ig0Var.F = 2;
                gVar2.presentFragment(ig0Var, true);
                break;
        }
    }
}
