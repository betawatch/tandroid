package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class s40 extends org.telegram.ui.mu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ v40 b;

    public s40(v40 v40Var, ArrayList arrayList) {
        this.b = v40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final org.telegram.ui.wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u40 u40Var = this.b.b;
        if (u40Var == null) {
            return null;
        }
        return u40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean z() {
        return false;
    }
}
