package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ bh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ki kiVar = (ki) this.b;
                CharSequence charSequence = (CharSequence) obj;
                nh nhVar = kiVar.C2;
                nhVar.setText(charSequence);
                nhVar.w(charSequence.length(), charSequence.length());
                kiVar.n1();
                break;
            case 1:
                ki kiVar2 = (ki) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                ph phVar = kiVar2.N2;
                phVar.setText(charSequence2);
                phVar.w(charSequence2.length(), charSequence2.length());
                kiVar2.n1();
                break;
            default:
                pc pcVar = (pc) this.b;
                hi.g gVar = pcVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                hi.e eVar = pcVar.d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                break;
        }
    }
}
