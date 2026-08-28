package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b40 extends org.telegram.ui.rt0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ e40 b;

    public b40(e40 e40Var, ArrayList arrayList) {
        this.b = e40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        d40 d40Var = this.b.b;
        if (d40Var == null) {
            return null;
        }
        return d40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        this.b.t((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean z() {
        return false;
    }
}
