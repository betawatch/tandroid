package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class an implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ an(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.run(new eh.e((String) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                boolean z4 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z4 = true;
                }
                this.b.run(Boolean.valueOf(z4));
                break;
        }
    }
}
