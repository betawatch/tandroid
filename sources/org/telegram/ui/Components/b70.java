package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c b;
    public final /* synthetic */ int c;

    public /* synthetic */ b70(org.telegram.messenger.c cVar, int i10, int i11) {
        this.a = i11;
        this.b = cVar;
        this.c = i10;
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
