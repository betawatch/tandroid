package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class en extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ qn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(qn qnVar, Context context) {
        super(context);
        this.c = qnVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        qn qnVar = this.c;
        arrayList.add(qnVar.G1);
        arrayList.add(qnVar.t0);
        arrayList.add(qnVar.T);
        arrayList.add(qnVar.G3);
        arrayList.add(qnVar.E1);
        arrayList.add(qnVar.T2);
        arrayList.add(qnVar.U);
        arrayList.add(qnVar.f1);
        arrayList.add(qnVar.O);
        arrayList.add(qnVar.N1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qn qnVar = this.c;
        qnVar.nc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        qnVar.nc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        qn qnVar = this.c;
        qnVar.nc = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        qnVar.nc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
