package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class kn extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ wn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(wn wnVar, Context context) {
        super(context);
        this.c = wnVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        wn wnVar = this.c;
        arrayList.add(wnVar.K1);
        arrayList.add(wnVar.x0);
        arrayList.add(wnVar.X);
        arrayList.add(wnVar.K3);
        arrayList.add(wnVar.I1);
        arrayList.add(wnVar.X2);
        arrayList.add(wnVar.Y);
        arrayList.add(wnVar.j1);
        arrayList.add(wnVar.S);
        arrayList.add(wnVar.R1);
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
        wnVar.qc = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        wnVar.qc = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        wn wnVar = this.c;
        wnVar.qc = true;
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
        wnVar.qc = false;
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
