package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.uu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ m50 b;

    public j50(m50 m50Var, ArrayList arrayList) {
        this.b = m50Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        l50 l50Var = this.b.b;
        if (l50Var == null) {
            return null;
        }
        return l50Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean z() {
        return false;
    }
}
