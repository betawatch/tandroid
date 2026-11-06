package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ rp(yr yrVar, long j3, ArrayList arrayList, boolean z9, int i7, int i10) {
        this.f = yrVar;
        this.e = j3;
        this.h = arrayList;
        this.b = z9;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((yr) this.f).Q0(this.c, this.d, this.e, (ArrayList) this.h, this.b);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.F(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z9;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }
}
