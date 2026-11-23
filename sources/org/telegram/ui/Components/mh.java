package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ mh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.v10
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
