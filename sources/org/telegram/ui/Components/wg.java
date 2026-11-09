package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ wg(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                di diVar = (di) this.b;
                CharSequence charSequence = (CharSequence) obj;
                gh ghVar = diVar.y2;
                ghVar.setText(charSequence);
                ghVar.w(charSequence.length(), charSequence.length());
                diVar.n1();
                break;
            case 1:
                di diVar2 = (di) this.b;
                CharSequence charSequence2 = (CharSequence) obj;
                ih ihVar = diVar2.J2;
                ihVar.setText(charSequence2);
                ihVar.w(charSequence2.length(), charSequence2.length());
                diVar2.n1();
                break;
            default:
                uc ucVar = (uc) this.b;
                fi.g gVar = ucVar.f;
                gVar.setText((CharSequence) obj);
                gVar.d();
                gVar.k(true);
                fi.e eVar = ucVar.c0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                break;
        }
    }
}
