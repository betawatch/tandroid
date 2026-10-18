package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ol extends bu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ sn c;

    public ol(sn snVar, ArrayList arrayList, boolean[] zArr) {
        this.c = snVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.ib(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
