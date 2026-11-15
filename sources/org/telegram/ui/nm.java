package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nm extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ an c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(an anVar, Context context) {
        super(context);
        this.c = anVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        an anVar = this.c;
        arrayList.add(anVar.Z1);
        arrayList.add(anVar.A0);
        arrayList.add(anVar.Z);
        arrayList.add(anVar.Z3);
        arrayList.add(anVar.X1);
        arrayList.add(anVar.m3);
        arrayList.add(anVar.a0);
        arrayList.add(anVar.y1);
        arrayList.add(anVar.U);
        arrayList.add(anVar.g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        an anVar = this.c;
        anVar.Yc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        anVar.Yc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        an anVar = this.c;
        anVar.Yc = true;
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
        anVar.Yc = false;
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
