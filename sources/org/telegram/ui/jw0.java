package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ jw0(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ww0 ww0Var = (ww0) obj;
        ww0 ww0Var2 = (ww0) obj2;
        switch (this.a) {
            case 0:
                MessagesController messagesController = this.b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ww0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ww0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                MessagesController messagesController2 = this.b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
