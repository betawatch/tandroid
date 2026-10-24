package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hj0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements org.telegram.ui.ActionBar.z1, RequestTimeDelegate, MessagesController.ErrorDelegate, hj0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.hj0
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.b).lambda$onDrawFaded$0((View) this.c, canvas);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.b, (org.telegram.ui.ActionBar.o2) this.c, c2Var, i10);
                break;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.b, (g0) this.c, c2Var, i10);
                break;
        }
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$106((TLRPC.Message) this.c);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.b, (org.telegram.ui.Components.zc[]) this.c, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.b, (TLRPC.User) this.c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
