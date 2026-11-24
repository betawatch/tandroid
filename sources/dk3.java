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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dk3 extends FrameLayout implements tjb {
    public final LinearLayout a;
    public final LinearLayout b;
    public final fm c;
    public final l46 d;
    public final ImageView e;
    public final ImageView f;
    public final be0 h;
    public final hc0 n;
    public boolean r;

    public dk3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(gl.L(9.0f), gl.L(5.0f), gl.L(9.0f), gl.L(7.0f));
        hc0 hc0Var = new hc0(context, false);
        this.n = hc0Var;
        hc0Var.setStepFactor(0.56790125f);
        hc0Var.setVisibility(8);
        hc0Var.setCount(0);
        be0 be0Var = new be0(context);
        this.h = be0Var;
        be0Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(k96.a0 ? gl.L(24.0f) : 0, 0, k96.a0 ? 0 : gl.L(24.0f), 0);
        fm fmVar = new fm(context);
        this.c = fmVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fmVar.setEllipsize(truncateAt);
        fmVar.setTextSize(1, 14.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setMaxLines(5);
        linearLayout.addView(fmVar, nme.p(-2, -2, 0.0f, (k96.a0 ? 5 : 3) | 48));
        l46 l46Var = new l46(context, null);
        this.d = l46Var;
        l46Var.setTextSize(1, 13.0f);
        l46Var.setEllipsize(truncateAt);
        l46Var.setMaxLines(5);
        linearLayout.addView(l46Var, nme.p(-1, -2, 0.0f, 48));
        kk7.i(fmVar);
        kk7.i(l46Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (k96.a0) {
            linearLayout2.addView(linearLayout, nme.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(hc0Var, nme.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(be0Var, nme.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(be0Var, nme.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(hc0Var, nme.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, nme.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, nme.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, nme.d(16, 16.0f, (k96.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        addView(imageView2, nme.d(36, 36.0f, (k96.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        hc0 hc0Var = this.n;
        boolean z = min != hc0Var.a.n;
        if (min <= 1) {
            hc0Var.setAvatarsTextSize(gl.L(22.0f));
            hc0Var.setSize(gl.L(36.0f));
        } else {
            hc0Var.setAvatarsTextSize(gl.L(20.0f));
            hc0Var.setSize(gl.L(30.0f));
        }
        hc0Var.setCount(min);
        hc0Var.setVisibility(min <= 0 ? 8 : 0);
        hc0Var.getLayoutParams().width = min <= 1 ? gl.L(36.0f) : gl.L(oo1.h(min, 1, 18, 30));
        if (z) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i2 = 0;
            while (i2 < 3) {
                hc0Var.b(i2, i, i2 >= arrayList.size() ? null : (TLObject) arrayList.get(i2));
                i2++;
            }
        }
        hc0Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        int i;
        this.r = z2;
        int i2 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        fm fmVar = this.c;
        fmVar.setVisibility(i2);
        fmVar.setText(charSequence);
        fmVar.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z ? 0 : 8);
        this.f.setVisibility(8);
        int L = z ? gl.L(24.0f) : 0;
        if (k96.a0) {
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
        Point point = gl.q;
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
        super.setOnClickListener(new xf3((Object) this, (Object) onClickListener, (byte) 5));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // tjb
    public final void updateColors() {
        this.c.setTextColor(bkb.w0(null, this.r ? bkb.p7 : bkb.F6, false));
        int i = bkb.x6;
        int w0 = bkb.w0(null, i, false);
        l46 l46Var = this.d;
        l46Var.setTextColor(w0);
        l46Var.setLinkTextColor(bkb.w0(null, bkb.Wc, false));
        int w02 = bkb.w0(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w02, mode);
        int w03 = bkb.w0(null, i, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(w03, mode);
        imageView.setBackground(sjb.c(null, sjb.b(bkb.w0(null, sjb.a, false))));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z) {
    }
}
