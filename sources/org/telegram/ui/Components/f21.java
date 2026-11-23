package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f21 implements org.telegram.messenger.fs {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.ks b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public f21(String str, org.telegram.messenger.ks ksVar, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.m1 m1Var) {
        this.a = str;
        this.b = ksVar;
        this.c = fjVar;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.a.equals(objArr[0])) {
            org.telegram.messenger.ks ksVar = this.b;
            int i11 = org.telegram.messenger.ks.Y1;
            ksVar.n(this, i11);
            ksVar.n(this, org.telegram.messenger.ks.Z1);
            org.telegram.messenger.fj fjVar = this.c;
            if (i7 == i11 && objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    i21.y(fjVar, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            i21.n(fjVar);
        }
    }
}
