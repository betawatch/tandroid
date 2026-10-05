package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ c(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                hVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    hVar.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                h hVar2 = this.b;
                hVar2.getClass();
                ug0 ug0Var = new ug0();
                ug0Var.F = 2;
                hVar2.presentFragment(ug0Var, true);
                break;
        }
    }
}
