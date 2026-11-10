package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pm extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ cn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(cn cnVar, Context context) {
        super(context);
        this.c = cnVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        cn cnVar = this.c;
        arrayList.add(cnVar.Y1);
        arrayList.add(cnVar.z0);
        arrayList.add(cnVar.Y);
        arrayList.add(cnVar.Y3);
        arrayList.add(cnVar.W1);
        arrayList.add(cnVar.l3);
        arrayList.add(cnVar.Z);
        arrayList.add(cnVar.x1);
        arrayList.add(cnVar.T);
        arrayList.add(cnVar.f2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cn cnVar = this.c;
        cnVar.Xc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        cnVar.Xc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        cn cnVar = this.c;
        cnVar.Xc = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        cnVar.Xc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
