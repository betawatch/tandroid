// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h1a extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ i1a c;

    public /* synthetic */ h1a(i1a i1aVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = i1aVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i1a i1aVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    i1aVar.removeView((View) arrayList.get(i));
                }
                i1aVar.getClass();
                i1aVar.h.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                ((j1a) i1aVar.n).b.setAllowDrawCursor(true);
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    i1aVar.removeView((View) arrayList.get(i2));
                }
                i1aVar.h.clear();
                i1aVar.b = null;
                i1aVar.c = false;
                ((j1a) i1aVar.n).b.setAllowDrawCursor(true);
                break;
        }
    }
}
