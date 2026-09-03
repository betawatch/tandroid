package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ uf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z4, int i10, int i11) {
        this.f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.b = z4;
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
                chatActivityEnterView.c0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.C(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z4;
        this.c = i10;
        this.d = i11;
        this.e = j10;
    }
}
