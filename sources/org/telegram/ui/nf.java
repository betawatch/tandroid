package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, xo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ nf(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // org.telegram.ui.xo0
    public void a(int i10) {
        int i11 = this.a;
        Runnable runnable = this.b;
        switch (i11) {
            case 9:
                Pattern pattern = LaunchActivity.B1;
                if (i10 == 1) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                this.b.run();
                break;
            default:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 3:
                this.b.run();
                break;
            case 4:
                this.b.run();
                break;
            case 5:
                this.b.run();
                break;
            case 6:
                this.b.run();
                break;
            case 7:
                this.b.run();
                break;
            default:
                this.b.run();
                break;
        }
        return true;
    }
}
