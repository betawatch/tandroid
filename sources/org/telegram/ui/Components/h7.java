package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ h7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m8.w(this.b, (MessageObject) obj);
                break;
            default:
                m8.z(this.b);
                break;
        }
    }
}
