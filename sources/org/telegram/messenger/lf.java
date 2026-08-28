package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ lf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i9, int i10) {
        this.f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.b = z10;
        this.c = i9;
        this.d = i10;
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
                chatActivityEnterView.b0 = null;
                chatActivityEnterView.p0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.y(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z10;
        this.c = i9;
        this.d = i10;
        this.e = j10;
    }
}
