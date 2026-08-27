package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g40 extends org.telegram.ui.st0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ j40 b;

    public g40(j40 j40Var, ArrayList arrayList) {
        this.b = j40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        i40 i40Var = this.b.b;
        if (i40Var == null) {
            return null;
        }
        return i40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean z() {
        return false;
    }
}
