package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                m8.v(this.b, (MessageObject) obj);
                break;
            default:
                m8.J(this.b);
                break;
        }
    }
}
