package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
