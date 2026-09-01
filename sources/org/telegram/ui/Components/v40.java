package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.au0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ y40 b;

    public v40(y40 y40Var, ArrayList arrayList) {
        this.b = y40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        x40 x40Var = this.b.b;
        if (x40Var == null) {
            return null;
        }
        return x40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean z() {
        return false;
    }
}
