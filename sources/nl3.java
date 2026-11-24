// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nl3 extends FrameLayout implements vlb {
    public final LinearLayout a;
    public final LinearLayout b;
    public final fn c;
    public final l66 d;
    public final ImageView e;
    public final ImageView f;
    public final bf0 h;
    public final hd0 n;
    public boolean r;

    public nl3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(gm.L(9.0f), gm.L(5.0f), gm.L(9.0f), gm.L(7.0f));
        hd0 hd0Var = new hd0(context, false);
        this.n = hd0Var;
        hd0Var.setStepFactor(0.56790125f);
        hd0Var.setVisibility(8);
        hd0Var.setCount(0);
        bf0 bf0Var = new bf0(context);
        this.h = bf0Var;
        bf0Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(jb6.a0 ? gm.L(24.0f) : 0, 0, jb6.a0 ? 0 : gm.L(24.0f), 0);
        fn fnVar = new fn(context);
        this.c = fnVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fnVar.setEllipsize(truncateAt);
        fnVar.setTextSize(1, 14.0f);
        fnVar.setTypeface(gm.o());
        fnVar.setMaxLines(5);
        linearLayout.addView(fnVar, qoe.p(-2, -2, 0.0f, (jb6.a0 ? 5 : 3) | 48));
        l66 l66Var = new l66(context, null);
        this.d = l66Var;
        l66Var.setTextSize(1, 13.0f);
        l66Var.setEllipsize(truncateAt);
        l66Var.setMaxLines(5);
        linearLayout.addView(l66Var, qoe.p(-1, -2, 0.0f, 48));
        nm7.i(fnVar);
        nm7.i(l66Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (jb6.a0) {
            linearLayout2.addView(linearLayout, qoe.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(hd0Var, qoe.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(bf0Var, qoe.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(bf0Var, qoe.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(hd0Var, qoe.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, qoe.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, qoe.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, qoe.d(16, 16.0f, (jb6.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f));
        addView(imageView2, qoe.d(36, 36.0f, (jb6.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        hd0 hd0Var = this.n;
        boolean z = min != hd0Var.a.n;
        if (min <= 1) {
            hd0Var.setAvatarsTextSize(gm.L(22.0f));
            hd0Var.setSize(gm.L(36.0f));
        } else {
            hd0Var.setAvatarsTextSize(gm.L(20.0f));
            hd0Var.setSize(gm.L(30.0f));
        }
        hd0Var.setCount(min);
        hd0Var.setVisibility(min <= 0 ? 8 : 0);
        hd0Var.getLayoutParams().width = min <= 1 ? gm.L(36.0f) : gm.L(aq1.h(min, 1, 18, 30));
        if (z) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i2 = 0;
            while (i2 < 3) {
                hd0Var.b(i2, i, i2 >= arrayList.size() ? null : (TLObject) arrayList.get(i2));
                i2++;
            }
        }
        hd0Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        int i;
        this.r = z2;
        int i2 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        fn fnVar = this.c;
        fnVar.setVisibility(i2);
        fnVar.setText(charSequence);
        fnVar.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z ? 0 : 8);
        this.f.setVisibility(8);
        int L = z ? gm.L(24.0f) : 0;
        if (jb6.a0) {
            i = L;
            L = 0;
        } else {
            i = 0;
        }
        this.b.setPadding(i, 0, L, 0);
        updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Point point = gm.q;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), TLObject.FLAG_30));
        this.f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new tf3(this, onClickListener, (byte) 6));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // vlb
    public final void updateColors() {
        this.c.setTextColor(cmb.w0(null, this.r ? cmb.p7 : cmb.F6, false));
        int i = cmb.x6;
        int w0 = cmb.w0(null, i, false);
        l66 l66Var = this.d;
        l66Var.setTextColor(w0);
        l66Var.setLinkTextColor(cmb.w0(null, cmb.Wc, false));
        int w02 = cmb.w0(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w02, mode);
        int w03 = cmb.w0(null, i, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(w03, mode);
        imageView.setBackground(ulb.c(null, ulb.b(cmb.w0(null, ulb.a, false))));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z) {
    }
}
