package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nl extends cu0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ sn c;

    public nl(sn snVar, ArrayList arrayList, boolean[] zArr) {
        this.c = snVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.kb(arrayList, i11, z10, z11);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean x(int i10) {
        return this.b[i10];
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
