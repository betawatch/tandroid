package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ kh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                si siVar = (si) this.b;
                CharSequence charSequence = (CharSequence) obj;
                vh vhVar = siVar.C2;
                vhVar.setText(charSequence);
                vhVar.w(charSequence.length(), charSequence.length());
                siVar.o1();
                break;
            case 1:
                si siVar2 = (si) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                xh xhVar = siVar2.N2;
                xhVar.setText(charSequence2);
                xhVar.w(charSequence2.length(), charSequence2.length());
                siVar2.o1();
                break;
            default:
                yc ycVar = (yc) this.b;
                hi.g gVar = ycVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                hi.e eVar = ycVar.d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                break;
        }
    }
}
