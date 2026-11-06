package fi;

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
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.qe;
import org.telegram.ui.Components.zb0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a8 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(ec0 ec0Var, Context context) {
        super(context);
        this.h = ec0Var;
        this.b = new ArrayList(4);
        this.c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i7 = 0; i7 < 4; i7++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView, c8.ha.e(50, 50, 51));
            ((ArrayList) this.b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView2.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView2, c8.ha.e(50, 50, 51));
            ((ArrayList) this.c).add(textView2);
        }
    }

    public static void a(a8 a8Var, boolean z9) {
        ArrayList arrayList = (ArrayList) a8Var.c;
        ArrayList arrayList2 = (ArrayList) a8Var.b;
        StringBuilder sb2 = (StringBuilder) a8Var.d;
        if (sb2.length() == 0) {
            return;
        }
        qe qeVar = (qe) a8Var.f;
        if (qeVar != null) {
            org.telegram.messenger.g0.r(qeVar);
            a8Var.f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) a8Var.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            a8Var.e = null;
        }
        sb2.delete(0, sb2.length());
        if (z9) {
            ArrayList arrayList3 = new ArrayList();
            for (int i7 = 0; i7 < 4; i7++) {
                TextView textView = (TextView) arrayList2.get(i7);
                float alpha = textView.getAlpha();
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (alpha != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i7);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            a8Var.e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) a8Var.e).playTogether(arrayList3);
            ((AnimatorSet) a8Var.e).addListener(new zb0(a8Var, 2));
            ((AnimatorSet) a8Var.e).start();
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                ((TextView) arrayList2.get(i10)).setAlpha(0.0f);
                ((TextView) arrayList.get(i10)).setAlpha(0.0f);
            }
        }
        ec0.a((ec0) a8Var.h);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb2.length();
        sb2.append(str);
        TextView textView = (TextView) arrayList2.get(length);
        textView.setText(str);
        textView.setTranslationX(c(length));
        int i7 = 2;
        Property property = View.SCALE_X;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f, 1.0f));
        Property property3 = View.ALPHA;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f, 1.0f));
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, org.telegram.messenger.g0.L(20.0f), 0.0f));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, org.telegram.messenger.g0.L(20.0f), 0.0f));
        for (int i10 = length + 1; i10 < 4; i10++) {
            TextView textView3 = (TextView) arrayList2.get(i10);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i10);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, 0.0f));
            }
        }
        qe qeVar = (qe) this.f;
        if (qeVar != null) {
            org.telegram.messenger.g0.r(qeVar);
        }
        qe qeVar2 = new qe(this, length, i7);
        this.f = qeVar2;
        org.telegram.messenger.g0.i3(qeVar2, 1500L);
        for (int i11 = 0; i11 < length; i11++) {
            TextView textView5 = (TextView) arrayList2.get(i11);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, c(i11)));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i11);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property5, c(i11)));
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
        ((AnimatorSet) this.e).addListener(new zb0(this, 0));
        ((AnimatorSet) this.e).start();
        ec0.a((ec0) this.h);
    }

    public int c(int i7) {
        return org.telegram.messenger.k5.D(30.0f, i7, (getMeasuredWidth() - (org.telegram.messenger.g0.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - org.telegram.messenger.g0.L(10.0f);
    }

    public void d(boolean z9) {
        ((ImageView) this.c).setVisibility(z9 ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z10 = hd.a0;
        textView.setLayoutParams(c8.ha.d(-1, -2.0f, 23, (z10 || !z9) ? 22.0f : 53.0f, 0.0f, (z10 && z9) ? 53.0f : 22.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, (org.telegram.ui.ActionBar.f6) this.b));
                canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.f1(), getWidth(), getHeight(), paint);
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                qe qeVar = (qe) this.f;
                if (qeVar != null) {
                    org.telegram.messenger.g0.r(qeVar);
                    this.f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.e = null;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (i13 < ((StringBuilder) this.d).length()) {
                        TextView textView = (TextView) arrayList2.get(i13);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i13));
                        TextView textView2 = (TextView) arrayList.get(i13);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i13));
                    } else {
                        ((TextView) arrayList2.get(i13)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i13)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    public a8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = new Paint(1);
        this.b = f6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        textView.setGravity(hd.a0 ? 5 : 3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
        boolean z9 = hd.a0;
        addView(textView, c8.ha.d(-1, -2.0f, 23, z9 ? 16.0f : 53.0f, 0.0f, z9 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.e = y1Var;
        imageView.setImageDrawable(y1Var);
        y1Var.a(-1);
        y1Var.b(-1);
        y1Var.k = 220.0f;
        addView(imageView, c8.ha.d(24, 24.0f, (hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ah.d(this, 25));
    }
}
