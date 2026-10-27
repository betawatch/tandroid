package ai;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements b2 {
    public final /* synthetic */ z0 a;

    public /* synthetic */ p0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        z0 z0Var = this.a;
        z0Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            z0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
