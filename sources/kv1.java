// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kv1 extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ yv1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv1(yv1 yv1Var, Context context) {
        super(context);
        this.c = yv1Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        yv1 yv1Var = this.c;
        arrayList.add(yv1Var.Z1);
        arrayList.add(yv1Var.A0);
        arrayList.add(yv1Var.Z);
        arrayList.add(yv1Var.Z3);
        arrayList.add(yv1Var.X1);
        arrayList.add(yv1Var.m3);
        arrayList.add(yv1Var.a0);
        arrayList.add(yv1Var.y1);
        arrayList.add(yv1Var.U);
        arrayList.add(yv1Var.g2);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yv1 yv1Var = this.c;
        yv1Var.kd = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        yv1Var.kd = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        yv1 yv1Var = this.c;
        yv1Var.kd = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.b.add(view);
            }
        }
        yv1Var.kd = false;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        a();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f);
            }
        }
    }
}
