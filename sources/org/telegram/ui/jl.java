package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jl implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ fo a;

    public jl(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            fo foVar = this.a;
            if (foVar.H6 && longValue == foVar.T5) {
                return true;
            }
        }
        return false;
    }
}
