package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jl extends rt0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ qn c;

    public jl(qn qnVar, ArrayList arrayList, boolean[] zArr) {
        this.c = qnVar;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.eb(arrayList, i10, z10, z11);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean x(int i9) {
        return this.b[i9];
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        return i9;
    }
}
