package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.ui.tu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ u40 b;

    public r40(u40 u40Var, ArrayList arrayList) {
        this.b = u40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        t40 t40Var = this.b.b;
        if (t40Var == null) {
            return null;
        }
        return t40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean z() {
        return false;
    }
}
