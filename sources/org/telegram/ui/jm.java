package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jm extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ wm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(wm wmVar, Context context) {
        super(context);
        this.c = wmVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        wm wmVar = this.c;
        arrayList.add(wmVar.Z1);
        arrayList.add(wmVar.A0);
        arrayList.add(wmVar.Z);
        arrayList.add(wmVar.Z3);
        arrayList.add(wmVar.X1);
        arrayList.add(wmVar.m3);
        arrayList.add(wmVar.a0);
        arrayList.add(wmVar.y1);
        arrayList.add(wmVar.U);
        arrayList.add(wmVar.g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wm wmVar = this.c;
        wmVar.Wc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wmVar.Wc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wm wmVar = this.c;
        wmVar.Wc = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        wmVar.Wc = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f10);
            }
        }
    }
}
