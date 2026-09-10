package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.tu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ e50 b;

    public b50(e50 e50Var, ArrayList arrayList) {
        this.b = e50Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        d50 d50Var = this.b.b;
        if (d50Var == null) {
            return null;
        }
        return d50Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean z() {
        return false;
    }
}
