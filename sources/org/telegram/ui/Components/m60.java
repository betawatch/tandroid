package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c b;
    public final /* synthetic */ int c;

    public /* synthetic */ m60(org.telegram.messenger.c cVar, int i7, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(this.b.a).cancelRequest(this.c, true);
                break;
            default:
                ConnectionsManager.getInstance(this.b.a).cancelRequest(this.c, true);
                break;
        }
    }
}
