package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                iVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    iVar.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                i iVar2 = this.b;
                iVar2.getClass();
                og0 og0Var = new og0();
                og0Var.C = 2;
                iVar2.presentFragment(og0Var, true);
                break;
        }
    }
}
