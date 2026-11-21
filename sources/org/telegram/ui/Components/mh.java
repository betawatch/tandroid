package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ mh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.b;
                CharSequence charSequence = (CharSequence) obj;
                xh xhVar = uiVar.C2;
                xhVar.setText(charSequence);
                xhVar.w(charSequence.length(), charSequence.length());
                uiVar.o1();
                break;
            case 1:
                ui uiVar2 = (ui) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                zh zhVar = uiVar2.N2;
                zhVar.setText(charSequence2);
                zhVar.w(charSequence2.length(), charSequence2.length());
                uiVar2.o1();
                break;
            default:
                yc ycVar = (yc) this.b;
                hi.h hVar = ycVar.f;
                hVar.setText((CharSequence) obj);
                hVar.d();
                hVar.k(true);
                hi.f fVar = ycVar.d0;
                org.telegram.messenger.g0.r(fVar);
                fVar.run();
                break;
        }
    }
}
