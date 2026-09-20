package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class r80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s80 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r80(s80 s80Var, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = s80Var;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r80(this.b, this.c, this.d, 1));
                break;
            default:
                s80 s80Var = this.b;
                s80Var.setJoinRequest(this.c);
                s80Var.setJoinToSend(this.d);
                break;
        }
    }
}
