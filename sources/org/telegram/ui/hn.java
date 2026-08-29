package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hn extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ tn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(tn tnVar, Context context) {
        super(context);
        this.c = tnVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        tn tnVar = this.c;
        arrayList.add(tnVar.G1);
        arrayList.add(tnVar.t0);
        arrayList.add(tnVar.T);
        arrayList.add(tnVar.G3);
        arrayList.add(tnVar.E1);
        arrayList.add(tnVar.T2);
        arrayList.add(tnVar.U);
        arrayList.add(tnVar.f1);
        arrayList.add(tnVar.O);
        arrayList.add(tnVar.N1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tn tnVar = this.c;
        tnVar.nc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        tnVar.nc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        tn tnVar = this.c;
        tnVar.nc = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        tnVar.nc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f9) {
        super.setTranslationX(f9);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f9);
            }
        }
    }
}
