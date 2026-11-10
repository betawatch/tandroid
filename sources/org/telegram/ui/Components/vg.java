package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ vg(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ci ciVar = (ci) this.b;
                CharSequence charSequence = (CharSequence) obj;
                fh fhVar = ciVar.B2;
                fhVar.setText(charSequence);
                fhVar.w(charSequence.length(), charSequence.length());
                ciVar.n1();
                break;
            case 1:
                ci ciVar2 = (ci) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                hh hhVar = ciVar2.M2;
                hhVar.setText(charSequence2);
                hhVar.w(charSequence2.length(), charSequence2.length());
                ciVar2.n1();
                break;
            default:
                tc tcVar = (tc) this.b;
                fi.g gVar = tcVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                fi.e eVar = tcVar.c0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                break;
        }
    }
}
