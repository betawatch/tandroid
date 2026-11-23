package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements org.telegram.messenger.t10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ lh(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.t10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.b;
                CharSequence charSequence = (CharSequence) obj;
                wh whVar = tiVar.C2;
                whVar.setText(charSequence);
                whVar.w(charSequence.length(), charSequence.length());
                tiVar.o1();
                break;
            case 1:
                ti tiVar2 = (ti) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                yh yhVar = tiVar2.N2;
                yhVar.setText(charSequence2);
                yhVar.w(charSequence2.length(), charSequence2.length());
                tiVar2.o1();
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
