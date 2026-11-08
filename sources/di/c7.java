package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ab;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c7 extends FrameLayout {
    public final ArrayList a;
    public ValueAnimator b;
    public int c;
    public int d;
    public final ab e;

    public c7(Context context, d9 d9Var) {
        super(context);
        this.c = -1;
        int i7 = 0;
        this.d = 0;
        this.e = new ab(this, 27);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(id.M0(2131744766, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, ha.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(id.M0(2131744763, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, ha.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.a = arrayList;
        arrayList.add(new b7(context, R.raw.stories_intro_go_forward, id.M0(2131744770, null), id.M0(2131744769, null)));
        arrayList.add(new b7(context, R.raw.stories_intro_pause, id.M0(2131744765, null), id.M0(2131744764, null)));
        arrayList.add(new b7(context, R.raw.stories_intro_go_back, id.M0(2131744772, null), id.M0(2131744771, null)));
        arrayList.add(new b7(context, R.raw.stories_intro_go_to_next, id.M0(2131744768, null), id.M0(2131744767, null)));
        int measuredWidth = d9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(100.0f);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b7 b7Var = (b7) obj;
            TextPaint textPaint = b7Var.e;
            String str = b7Var.a;
            int length = str.length();
            Rect rect = b7Var.r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = b7Var.f;
            String str2 = b7Var.b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(8.0f) + measuredWidth > d9Var.getMeasuredWidth() ? d9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f) : measuredWidth, org.telegram.messenger.g0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            linearLayout.addView((b7) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(id.M0(2131744773, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, ha.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, ha.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.g0.j2(12.0f, 10, d9Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new a7(this, textView3, d9Var, textView2));
    }

    public final void a(boolean z9) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = ofFloat;
        if (z9) {
            ofFloat.setStartDelay(50L);
        }
        this.b.setDuration(350L);
        this.b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.b.getCurrentPlayTime();
        this.b.addListener(new bi.t5(this, 14));
        this.b.addUpdateListener(new ah.h(this, 22));
        this.b.start();
        org.telegram.messenger.g0.i3(this.e, (((b7) this.a.get(this.d)).c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.g0.r(this.e);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        int i7 = this.c;
        ArrayList arrayList = this.a;
        if (i7 != -1) {
            b7 b7Var = (b7) arrayList.get(i7);
            zg0 zg0Var = b7Var.c;
            zg0Var.M(0);
            zg0Var.stop();
            b7Var.n = 0.0f;
            b7Var.invalidate();
        }
        b7 b7Var2 = (b7) arrayList.get(this.d);
        zg0 zg0Var2 = b7Var2.c;
        zg0Var2.M(0);
        zg0Var2.stop();
        b7Var2.n = 0.0f;
        b7Var2.invalidate();
        c();
    }

    public final void c() {
        int i7 = this.d + 1;
        this.d = i7;
        ArrayList arrayList = this.a;
        if (i7 >= arrayList.size()) {
            this.d = 0;
        }
        int i10 = this.c + 1;
        this.c = i10;
        if (i10 >= arrayList.size()) {
            this.c = 0;
        }
    }
}
