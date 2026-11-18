package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e21 implements org.telegram.messenger.fs {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.ks b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public e21(String str, org.telegram.messenger.ks ksVar, org.telegram.messenger.fj fjVar) {
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
                    g21.w(fjVar, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            g21.m(fjVar);
        }
    }
}
