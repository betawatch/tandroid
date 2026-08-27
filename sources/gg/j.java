package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k c;

    public /* synthetic */ j(k kVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = kVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    k kVar = this.c;
                    if (i10 >= size) {
                        kVar.getClass();
                        kVar.h.clear();
                        kVar.b = null;
                        kVar.c = false;
                        ((l) kVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        kVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    k kVar2 = this.c;
                    if (i11 >= size2) {
                        kVar2.h.clear();
                        kVar2.b = null;
                        kVar2.c = false;
                        ((l) kVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        kVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
