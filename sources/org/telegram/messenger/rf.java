package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ rf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.b = z10;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesStorage) this.f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.b, this.c, this.d);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f0 = null;
                chatActivityEnterView.r0(true);
                org.telegram.ui.Components.of ofVar = chatActivityEnterView.E0;
                if (ofVar != null) {
                    ofVar.setText("");
                }
                org.telegram.ui.Components.mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.H(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z10;
        this.c = i10;
        this.d = i11;
        this.e = j3;
    }
}
