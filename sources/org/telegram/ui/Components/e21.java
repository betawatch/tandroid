package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
