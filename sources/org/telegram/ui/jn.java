package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jn extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ wn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(wn wnVar, Context context) {
        super(context);
        this.c = wnVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        wn wnVar = this.c;
        arrayList.add(wnVar.W1);
        arrayList.add(wnVar.x0);
        arrayList.add(wnVar.X);
        arrayList.add(wnVar.W3);
        arrayList.add(wnVar.U1);
        arrayList.add(wnVar.j3);
        arrayList.add(wnVar.Y);
        arrayList.add(wnVar.v1);
        arrayList.add(wnVar.S);
        arrayList.add(wnVar.d2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wn wnVar = this.c;
        wnVar.Sc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wnVar.Sc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wn wnVar = this.c;
        wnVar.Sc = true;
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
        wnVar.Sc = false;
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
