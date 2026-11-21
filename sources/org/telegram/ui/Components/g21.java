package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g21 implements org.telegram.messenger.fs {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.ks b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public g21(String str, org.telegram.messenger.ks ksVar, org.telegram.messenger.fj fjVar) {
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
                    j21.x(fjVar, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            j21.m(fjVar);
        }
    }
}
