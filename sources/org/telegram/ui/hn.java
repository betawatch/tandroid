package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hn extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ un c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(un unVar, Context context) {
        super(context);
        this.c = unVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        un unVar = this.c;
        arrayList.add(unVar.Y1);
        arrayList.add(unVar.z0);
        arrayList.add(unVar.Y);
        arrayList.add(unVar.Y3);
        arrayList.add(unVar.W1);
        arrayList.add(unVar.l3);
        arrayList.add(unVar.Z);
        arrayList.add(unVar.x1);
        arrayList.add(unVar.T);
        arrayList.add(unVar.f2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        un unVar = this.c;
        unVar.Nc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        unVar.Nc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        un unVar = this.c;
        unVar.Nc = true;
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
        unVar.Nc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
