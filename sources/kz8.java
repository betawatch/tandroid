// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kz8 implements fd {
    public final /* synthetic */ rz8 a;

    public /* synthetic */ kz8(rz8 rz8Var) {
        this.a = rz8Var;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        rz8 rz8Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            rz8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
