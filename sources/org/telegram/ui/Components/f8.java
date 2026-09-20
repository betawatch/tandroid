package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f8(h8 h8Var, String str, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                String str = this.c;
                h8Var.f = null;
                AndroidUtilities.runOnUIThread(new f8(h8Var, str, 1));
                break;
            default:
                h8 h8Var2 = this.b;
                String str2 = this.c;
                h8Var2.getClass();
                Utilities.searchQueue.postRunnable(new g8(h8Var2, str2, new ArrayList(h8Var2.n.x0)));
                break;
        }
    }
}
