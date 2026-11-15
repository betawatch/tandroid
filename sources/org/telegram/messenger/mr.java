package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ mr(vr vrVar, long j3, ArrayList arrayList, boolean z10, int i7, int i10) {
        this.f = vrVar;
        this.e = j3;
        this.h = arrayList;
        this.b = z10;
        this.c = i7;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((vr) this.f).Q0(this.c, this.d, this.e, (ArrayList) this.h, this.b);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.g0 = null;
                chatActivityEnterView.C0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.M(charSequence, this.b, this.c, this.d, this.e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mr(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        this.f = chatActivityEnterView;
        this.h = charSequence;
        this.b = z10;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }
}
