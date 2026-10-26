package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ rs0(aw0 aw0Var, int i10) {
        this.a = i10;
        this.b = aw0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 18;
        aw0 aw0Var = this.b;
        di.a7 a7Var = (di.a7) obj;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new t90(i11, aw0Var, a7Var), 100L);
                break;
            default:
                int[] iArr = aw0.p2;
                AndroidUtilities.runOnUIThread(new t90(i11, aw0Var, a7Var), 100L);
                break;
        }
    }
}
