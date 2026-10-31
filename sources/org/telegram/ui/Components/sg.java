package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements org.telegram.messenger.n20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ sg(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.n20
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                dh dhVar = biVar.y2;
                dhVar.setText(charSequence);
                dhVar.w(charSequence.length(), charSequence.length());
                biVar.m1();
                break;
            case 1:
                bi biVar2 = (bi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                fh fhVar = biVar2.J2;
                fhVar.setText(charSequence2);
                fhVar.w(charSequence2.length(), charSequence2.length());
                biVar2.m1();
                break;
            default:
                nc ncVar = (nc) this.b;
                vh.f fVar = ncVar.f;
                fVar.setText((CharSequence) obj);
                fVar.d();
                fVar.k(true);
                vh.e eVar = ncVar.c0;
                org.telegram.messenger.i0.r(eVar);
                eVar.run();
                break;
        }
    }
}
