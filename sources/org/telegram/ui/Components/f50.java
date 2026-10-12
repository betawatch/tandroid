package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.av0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ i50 b;

    public f50(i50 i50Var, ArrayList arrayList) {
        this.b = i50Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final org.telegram.ui.kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        h50 h50Var = this.b.b;
        if (h50Var == null) {
            return null;
        }
        return h50Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((MediaController.PhotoEntry) this.a.get(0));
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean z() {
        return false;
    }
}
