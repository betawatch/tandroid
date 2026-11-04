package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ip implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ip(qr qrVar, long j10, ArrayList arrayList, boolean z10, int i3, int i10) {
        this.f = qrVar;
        this.e = j10;
        this.h = arrayList;
        this.b = z10;
        this.c = i3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((qr) this.f).Q0(this.c, this.d, this.e, (ArrayList) this.h, this.b);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.g0 = null;
                chatActivityEnterView.n0(true);
                org.telegram.ui.Components.ve veVar = chatActivityEnterView.F0;
                if (veVar != null) {
                    veVar.setText("");
                }
                org.telegram.ui.Components.uf ufVar = chatActivityEnterView.a3;
                if (ufVar != null) {
                    ufVar.G(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ip(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z10;
        this.c = i3;
        this.d = i10;
        this.e = j10;
    }
}
