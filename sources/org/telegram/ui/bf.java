package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, bo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ bf(int i9, Runnable runnable) {
        this.a = i9;
        this.b = runnable;
    }

    @Override // org.telegram.ui.bo0
    public void b(int i9) {
        int i10 = this.a;
        Runnable runnable = this.b;
        switch (i10) {
            case 9:
                Pattern pattern = LaunchActivity.x1;
                if (i9 == 1) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (i9 == 1) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
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
