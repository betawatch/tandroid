package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class xp implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ xp(is isVar, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f = isVar;
        this.e = j10;
        this.h = arrayList;
        this.b = z10;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((is) this.f).Q0(this.c, this.d, this.e, (ArrayList) this.h, this.b);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f0 = null;
                chatActivityEnterView.m0(true);
                org.telegram.ui.Components.se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.setText("");
                }
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.E(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z10;
        this.c = i10;
        this.d = i11;
        this.e = j10;
    }
}
