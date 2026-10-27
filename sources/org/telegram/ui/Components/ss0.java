package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ ss0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 18;
        bw0 bw0Var = this.b;
        di.a7 a7Var = (di.a7) obj;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new u90(i11, bw0Var, a7Var), 100L);
                break;
            default:
                int[] iArr = bw0.p2;
                AndroidUtilities.runOnUIThread(new u90(i11, bw0Var, a7Var), 100L);
                break;
        }
    }
}
