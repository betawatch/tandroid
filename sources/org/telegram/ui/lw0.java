package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ lw0(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        yw0 yw0Var = (yw0) obj;
        yw0 yw0Var2 = (yw0) obj2;
        switch (this.a) {
            case 0:
                MessagesController messagesController = this.b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(yw0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController.businessFeaturesTypesToPosition.get(yw0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                MessagesController messagesController2 = this.b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(yw0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(yw0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
