package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx b;
    public final /* synthetic */ View c;

    public /* synthetic */ gx(hx hxVar, View view, int i10) {
        this.a = i10;
        this.b = hxVar;
        this.c = view;
    }

    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                View view = this.c;
                if (view instanceof oh.o) {
                    this.b.L0.B0.i((oh.o) view, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(20), 500L);
                        break;
                    }
                }
                break;
            default:
                View view2 = this.c;
                if (view2 instanceof oh.o) {
                    this.b.L0.B0.i((oh.o) view2, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(20), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
