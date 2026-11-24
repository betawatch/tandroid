// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class le implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ d c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ le(TLRPC.User user, d dVar, AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = user;
        this.c = dVar;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.d;
        d dVar = this.c;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                if (dVar.getMessagesController().A(bundle, dVar, null, null)) {
                    dVar.presentFragment(new ProfileActivity(bundle, null));
                }
                alertDialog$Builder.a.M0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                if (dVar.getMessagesController().A(bundle2, dVar, null, null)) {
                    dVar.presentFragment(new ProfileActivity(bundle2, null));
                }
                alertDialog$Builder.a.M0.run();
                break;
        }
    }
}
