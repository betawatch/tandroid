// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class no4 extends FrameLayout implements x74, tjb {
    public Runnable E;
    public final on F;
    public final ArrayList G;
    public final pkb H;
    public mo4 I;
    public int J;
    public final fm0 a;
    public final fm0 b;
    public final y74 c;
    public final wjb d;
    public final ImageView e;
    public final ImageView f;
    public final LinearLayout h;
    public boolean n;
    public final l7 r;
    public il0 s;
    public Drawable w;
    public boolean x;
    public boolean y;

    public no4(Context context, wjb wjbVar) {
        super(context);
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 380L, false);
        this.b = new fm0(1, this, s33Var, 380L, true);
        this.c = new y74(2, this, tn.a, 280L);
        this.F = new on(null);
        this.G = new ArrayList();
        this.d = wjbVar;
        l7 l7Var = new l7((byte) 3, context, this);
        this.r = l7Var;
        l7Var.setTextSize(1, 15.0f);
        l7Var.setCursorWidth(1.5f);
        l7Var.setInputType(l7Var.getInputType() | kk7.F2);
        l7Var.setSingleLine(true);
        l7Var.setBackground(null);
        l7Var.setVerticalScrollBarEnabled(false);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setPadding(gl.L(48.0f), 0, gl.L(48.0f), 0);
        l7Var.setClipToPadding(true);
        l7Var.setImeOptions(268435459);
        l7Var.setGravity((k96.a0 ? 5 : 3) | 16);
        l7Var.addTextChangedListener(new b7(this, (byte) 24));
        if (Build.VERSION.SDK_INT >= 35) {
            l7Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(l7Var, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new yj3(this, (byte) 18));
        addView(imageView2, nme.d(24, 24.0f, (k96.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        pkb pkbVar = new pkb((byte) 7, getContext(), this);
        this.H = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setVisibility(0);
        addView(pkbVar, nme.d(-2, 32.0f, (k96.a0 ? (byte) 5 : (byte) 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    public final void a(r7 r7Var) {
        this.h.addView(r7Var);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.Oi));
    }

    public final void b() {
        int max = Math.max(gl.L(6.0f) + ((int) this.c.f), gl.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + gl.L(48.0f);
        if (!k96.a0) {
            measuredWidth = max;
            max = measuredWidth;
        }
        Rect rect = gl.Q;
        l7 l7Var = this.r;
        rect.set(measuredWidth, 0, l7Var.getMeasuredWidth() - max, l7Var.getMeasuredHeight());
        l7Var.setClipBounds(rect);
        l7Var.setPadding(measuredWidth, 0, max, 0);
    }

    public final void c() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i >= arrayList.size()) {
                e();
                return;
            }
            if (((rf4) arrayList.get(i)).h) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((rf4) arrayList.get(i)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.w.draw(canvas);
        }
        il0 il0Var = this.s;
        if (il0Var != null) {
            il0Var.setBounds(getPaddingLeft() - gl.L(4.0f), getPaddingTop() - gl.L(4.0f), gl.L(4.0f) + (getWidth() - getPaddingRight()), gl.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        byte b = 1;
        this.b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new h7(b).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) s33.g);
        transitionSet.addListener((Transition.TransitionListener) new i7(this, b));
        pkb pkbVar = this.H;
        TransitionManager.beginDelayedTransition(pkbVar, transitionSet);
        int i = 0;
        while (i < pkbVar.getChildCount()) {
            if (!arrayList2.remove(((q7) pkbVar.getChildAt(i)).getFilter())) {
                pkbVar.removeViewAt(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            rf4 rf4Var = (rf4) arrayList2.get(i2);
            rf4Var.getClass();
            q7 q7Var = new q7(getContext(), this.d);
            q7Var.r = true;
            q7Var.updateColors();
            q7Var.setData(rf4Var);
            q7Var.setOnClickListener(new xf3((Object) this, (Object) q7Var, (byte) 11));
            boolean z = k96.a0;
            pkbVar.addView(q7Var, nme.t(-2, -1, 0, z ? 6 : 0, 0, z ? 0 : 6, 0));
        }
        int i3 = 0;
        while (i3 < pkbVar.getChildCount()) {
            ((q7) pkbVar.getChildAt(i3)).setExpanded(i3 == this.J);
            i3++;
        }
        pkbVar.setTag(!isEmpty ? 1 : null);
    }

    public final void f(rf4 rf4Var) {
        hi3 hi3Var;
        if (rf4Var.h) {
            this.G.remove(rf4Var);
            int i = this.J;
            if (i < 0 || i > r0.size() - 1) {
                this.J = r0.size() - 1;
            }
            e();
            mo4 mo4Var = this.I;
            if (mo4Var == null || (hi3Var = ((di3) mo4Var).a.D0) == null) {
                return;
            }
            hi3Var.R(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            ImageView imageView = this.f;
            un4.d(imageView, f);
            imageView.setRotation((1.0f - f) * 90.0f);
        } else if (i == 1) {
            un4.d(this.e, f);
        } else if (i == 2) {
            b();
        }
    }

    public void setBlurredBackgroundVisibility(float f) {
        boolean z;
        int i;
        int i2 = (int) (f * 255.0f);
        il0 il0Var = this.s;
        boolean z2 = true;
        if (il0Var == null || il0Var.c == i2) {
            z = false;
        } else {
            il0Var.setAlpha(i2);
            z = true;
        }
        Drawable drawable = this.w;
        if (drawable == null || drawable.getAlpha() == (i = 255 - i2)) {
            z2 = z;
        } else {
            this.w.setAlpha(i);
        }
        if (z2) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setCloseButtonVisible(boolean z) {
        this.n = z;
        this.a.a(z || this.r.length() > 0, true);
    }

    public void setSearchFiltersListener(mo4 mo4Var) {
        this.I = mo4Var;
    }

    public void setupBlurredBackground(il0 il0Var) {
        ug8.r(il0Var, gl.L(20.0f), 4.0f);
        this.s = il0Var;
    }

    @Override // tjb
    public final void updateColors() {
        int p1;
        Drawable b0;
        wjb wjbVar = this.d;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        if (this.x) {
            b0 = bkb.d0(gl.L(20.0f), bkb.v0(bkb.c6, wjbVar));
        } else {
            int L = gl.L(20.0f);
            if (this.y) {
                p1 = bkb.v0(bkb.c6, wjbVar);
            } else {
                p1 = bkb.p1(a ? 0.07f : 0.05f, bkb.v0(bkb.F6, wjbVar));
            }
            b0 = bkb.b0(L, p1);
        }
        this.w = b0;
        int i = bkb.F6;
        int p12 = bkb.p1(0.6f, bkb.v0(i, wjbVar));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(p12, mode);
        int p13 = bkb.p1(0.6f, bkb.v0(i, wjbVar));
        ImageView imageView = this.f;
        imageView.setColorFilter(p13, mode);
        imageView.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), 1, gl.L(17.0f)));
        int p14 = bkb.p1(0.5f, bkb.v0(i, wjbVar));
        l7 l7Var = this.r;
        l7Var.setHintTextColor(p14);
        l7Var.setTextColor(bkb.v0(i, wjbVar));
        l7Var.setCursorColor(bkb.v0(bkb.Oi, wjbVar));
        il0 il0Var = this.s;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.getIconView() != null) {
                    r7Var.getIconView().setColorFilter(bkb.p1(0.6f, bkb.v0(bkb.F6, wjbVar)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(bkb.f0(bkb.v0(bkb.h6, wjbVar), 1, gl.L(17.0f)));
            }
        }
        pkb pkbVar = this.H;
        int childCount2 = pkbVar.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            if (pkbVar.getChildAt(i3) instanceof q7) {
                ((q7) pkbVar.getChildAt(i3)).updateColors();
            }
        }
        invalidate();
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
