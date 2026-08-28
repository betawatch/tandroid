package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, dj0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.dj0
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.b).lambda$onDrawFaded$0((View) this.c, canvas);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.b, (dl) this.c, c2Var, i9);
                break;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.b, (org.telegram.ui.ActionBar.o2) this.c, c2Var, i9);
                break;
        }
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$103((TLRPC.Message) this.c);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.b, (TLRPC.User) this.c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
