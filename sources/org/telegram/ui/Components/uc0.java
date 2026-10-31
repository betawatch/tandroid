package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uc0 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(zc0 zc0Var, Context context) {
        super(context);
        this.h = zc0Var;
        this.b = new ArrayList(4);
        this.c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(org.telegram.messenger.i0.L(25.0f));
            textView.setPivotY(org.telegram.messenger.i0.L(25.0f));
            addView(textView, w7.b6.e(50, 50, 51));
            ((ArrayList) this.b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(org.telegram.messenger.i0.L(25.0f));
            textView2.setPivotY(org.telegram.messenger.i0.L(25.0f));
            addView(textView2, w7.b6.e(50, 50, 51));
            ((ArrayList) this.c).add(textView2);
        }
    }

    public static void a(uc0 uc0Var, boolean z10) {
        ArrayList arrayList = (ArrayList) uc0Var.c;
        ArrayList arrayList2 = (ArrayList) uc0Var.b;
        StringBuilder sb2 = (StringBuilder) uc0Var.d;
        if (sb2.length() == 0) {
            return;
        }
        le leVar = (le) uc0Var.f;
        if (leVar != null) {
            org.telegram.messenger.i0.r(leVar);
            uc0Var.f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) uc0Var.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            uc0Var.e = null;
        }
        sb2.delete(0, sb2.length());
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                TextView textView = (TextView) arrayList2.get(i10);
                float alpha = textView.getAlpha();
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (alpha != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i10);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            uc0Var.e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) uc0Var.e).playTogether(arrayList3);
            ((AnimatorSet) uc0Var.e).addListener(new tc0(uc0Var, 2));
            ((AnimatorSet) uc0Var.e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        zc0.a((zc0) uc0Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb2 = (StringBuilder) this.d;
        if (sb2.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb2.length();
        sb2.append(str);
        TextView textView = (TextView) arrayList2.get(length);
        textView.setText(str);
        textView.setTranslationX(c(length));
        int i10 = 2;
        Property property = View.SCALE_X;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f, 1.0f));
        Property property3 = View.ALPHA;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f, 1.0f));
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, org.telegram.messenger.i0.L(20.0f), 0.0f));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, org.telegram.messenger.i0.L(20.0f), 0.0f));
        for (int i11 = length + 1; i11 < 4; i11++) {
            TextView textView3 = (TextView) arrayList2.get(i11);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i11);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, 0.0f));
            }
        }
        le leVar = (le) this.f;
        if (leVar != null) {
            org.telegram.messenger.i0.r(leVar);
        }
        le leVar2 = new le(this, length, i10);
        this.f = leVar2;
        org.telegram.messenger.i0.h3(leVar2, 1500L);
        for (int i12 = 0; i12 < length; i12++) {
            TextView textView5 = (TextView) arrayList2.get(i12);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, c(i12)));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i12);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property5, c(i12)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.e).playTogether(arrayList3);
        ((AnimatorSet) this.e).addListener(new tc0(this, 0));
        ((AnimatorSet) this.e).start();
        zc0.a((zc0) this.h);
    }

    public int c(int i10) {
        return org.telegram.messenger.m5.D(30.0f, i10, (getMeasuredWidth() - (org.telegram.messenger.i0.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - org.telegram.messenger.i0.L(10.0f);
    }

    public void d(boolean z10) {
        ((ImageView) this.c).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z11 = org.telegram.messenger.cd.X;
        textView.setLayoutParams(w7.b6.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f;
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, (org.telegram.ui.ActionBar.p6) this.b));
                canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.i0.f1(), getWidth(), getHeight(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public void e(String str) {
        ((TextView) this.d).setText(str);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                le leVar = (le) this.f;
                if (leVar != null) {
                    org.telegram.messenger.i0.r(leVar);
                    this.f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.e = null;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (i14 < ((StringBuilder) this.d).length()) {
                        TextView textView = (TextView) arrayList2.get(i14);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i14));
                        TextView textView2 = (TextView) arrayList.get(i14);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i14));
                    } else {
                        ((TextView) arrayList2.get(i14)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i14)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public uc0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f = new Paint(1);
        this.b = p6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.z20.n(textView, 1, 20.0f);
        textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.e = c2Var;
        imageView.setImageDrawable(c2Var);
        c2Var.a(-1);
        c2Var.b(-1);
        c2Var.k = 220.0f;
        addView(imageView, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new rh.s(this, 22));
    }
}
