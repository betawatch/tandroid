package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ tg(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.b;
                CharSequence charSequence = (CharSequence) obj;
                dh dhVar = biVar.z2;
                dhVar.setText(charSequence);
                dhVar.w(charSequence.length(), charSequence.length());
                biVar.n1();
                break;
            case 1:
                bi biVar2 = (bi) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                fh fhVar = biVar2.K2;
                fhVar.setText(charSequence2);
                fhVar.w(charSequence2.length(), charSequence2.length());
                biVar2.n1();
                break;
            default:
                sc scVar = (sc) this.b;
                gi.g gVar = scVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                gi.e eVar = scVar.d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                break;
        }
    }
}
