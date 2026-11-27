// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class lg5 extends FrameLayout {
    public final xb a;
    public final ImageView b;
    public View c;
    public AnimatorSet d;
    public Runnable e;
    public final byte f;
    public final boolean h;
    public float n;
    public float r;
    public int s;
    public long w;
    public boolean x;

    /* JADX WARN: Multi-variable type inference failed */
    public lg5(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        int i2;
        this.w = 2000L;
        this.f = i;
        this.h = z;
        xb xbVar = new xb(context, (byte) 18);
        this.a = xbVar;
        int i3 = aob.gg;
        yob.X(xbVar, i3, vnbVar);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setMaxLines(2);
        if (i == 7 || i == 8 || i == 9) {
            xbVar.setMaxWidth(hl.L(310.0f));
        } else if (i == 4) {
            xbVar.setMaxWidth(hl.L(280.0f));
        } else {
            xbVar.setMaxWidth(hl.L(250.0f));
        }
        if (i == 3) {
            xbVar.setGravity(19);
            int L = hl.L(5.0f);
            i2 = aob.hg;
            ShapeDrawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
            uob M = yob.M(i2);
            xbVar.setBackground(b0);
            yob.j(xbVar, b0, M, null, vnbVar);
            xbVar.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            addView(xbVar, tre.d(-2, 30.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        } else {
            xbVar.setGravity(51);
            int L2 = hl.L(10.0f);
            i2 = aob.hg;
            ShapeDrawable b02 = aob.b0(L2, aob.v0(i2, vnbVar));
            uob M2 = yob.M(i2);
            xbVar.setBackground(b02);
            yob.j(xbVar, b02, M2, null, vnbVar);
            xbVar.setPadding(hl.L(i == 0 ? 54.0f : 12.0f), hl.L(9.0f), hl.L(12.0f), hl.L(10.0f));
            addView(xbVar, tre.d(-2, -2.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        }
        if (i == 0) {
            xbVar.setText(ob6.M0(2131753755, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.tooltip_sound);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            yob.s(imageView, i3, vnbVar, PorterDuff.Mode.MULTIPLY);
            addView(imageView, tre.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        imageView2.setImageResource(z ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        yob.s(imageView2, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, tre.d(14, 6.0f, (z ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.e;
        if (runnable != null) {
            hl.r(runnable);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z = this.x;
        byte b = 1;
        Property property = View.ALPHA;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<lg5, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<lg5, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<lg5, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(k43.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<lg5, Float>) property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new ig5(this, b));
        this.d.start();
    }

    public final void b() {
        xb xbVar = this.a;
        yob.q(xbVar);
        ImageView imageView = this.b;
        yob.q(imageView);
        xbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        byte b = this.f;
        xbVar.setBackground(aob.b0(hl.L((b == 7 || b == 8) ? 6.0f : 3.0f), -366530760));
    }

    public final void c(View view) {
        if (this.c == view || getTag() != null) {
            if (getTag() != null) {
                d(view);
                return;
            }
            return;
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            hl.r(runnable);
            this.e = null;
        }
        d(view);
        this.c = view;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        setTag(1);
        byte b = 0;
        setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z = this.x;
        Property property = View.ALPHA;
        if (z) {
            ImageView imageView = this.b;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.d.playTogether(ObjectAnimator.ofFloat(this, (Property<lg5, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<lg5, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<lg5, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.d.setDuration(350L);
            this.d.setInterpolator(k43.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<lg5, Float>) property, 0.0f, 1.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new ig5(this, b));
        this.d.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        if (r3 < 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0151, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r3 >= 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view) {
        int measuredWidth;
        int i;
        int i2;
        int measuredWidth2;
        Point point = hl.q;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int L = iArr[1] - hl.L(4.0f);
        boolean z = this.h;
        byte b = this.f;
        if (b == 4) {
            L += hl.L(4.0f);
        } else if (b == 6 && z) {
            L = uh9.w(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        } else {
            if (b != 7) {
                if (b == 8) {
                    if (!z) {
                        L -= hl.L(10.0f);
                    }
                }
            }
            L = uh9.w(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), L);
        }
        int i3 = 0;
        if (b != 8 || !z) {
            measuredWidth = b == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof ema) {
            ema emaVar = (ema) view;
            Drawable rightDrawable = emaVar.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : emaVar.getTextWidth() / 2)) - hl.L(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - hl.L(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i4 = measuredWidth - iArr[0];
        int i5 = (L - iArr[1]) - this.s;
        int measuredWidth3 = view2.getMeasuredWidth();
        if (!z || b == 6 || b == 7 || b == 8) {
            float f = this.r;
            float measuredHeight = i5 - getMeasuredHeight();
            this.n = measuredHeight;
            setTranslationY(f + measuredHeight);
        } else {
            float f2 = this.r;
            float L2 = hl.L(44.0f);
            this.n = L2;
            setTranslationY(f2 + L2);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i = 0;
            i2 = 0;
        }
        ImageView imageView = this.b;
        if (b == 8 && !z) {
            i3 = (((measuredWidth3 - i) - i2) - getMeasuredWidth()) / 2;
        } else if (i4 > view2.getMeasuredWidth() / 2) {
            if (b == 3) {
                measuredWidth2 = (int) (measuredWidth3 - (getMeasuredWidth() * 1.5f));
            } else {
                i3 = (measuredWidth3 - getMeasuredWidth()) - (i2 + i);
            }
        } else if (b == 3) {
            measuredWidth2 = (i4 - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth();
        }
        setTranslationX(i3);
        float measuredWidth4 = (i4 - (i + i3)) - (imageView.getMeasuredWidth() / 2.0f);
        if (b == 7) {
            measuredWidth4 += hl.L(2.0f);
        }
        imageView.setTranslationX(measuredWidth4);
        if (i4 > view2.getMeasuredWidth() / 2) {
            if (measuredWidth4 < hl.L(10.0f)) {
                float L3 = measuredWidth4 - hl.L(10.0f);
                setTranslationX(getTranslationX() + L3);
                imageView.setTranslationX(measuredWidth4 - L3);
                return;
            }
            return;
        }
        if (measuredWidth4 > getMeasuredWidth() - hl.L(24.0f)) {
            float measuredWidth5 = (measuredWidth4 - getMeasuredWidth()) + hl.L(24.0f);
            setTranslationX(measuredWidth5);
            imageView.setTranslationX(measuredWidth4 - measuredWidth5);
        } else if (measuredWidth4 < hl.L(10.0f)) {
            float L4 = measuredWidth4 - hl.L(10.0f);
            setTranslationX(getTranslationX() + L4);
            imageView.setTranslationX(measuredWidth4 - L4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.n;
    }

    public wb2 getMessageCell() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setBottomOffset(int i) {
        this.s = i;
    }

    public void setExtraTranslationY(float f) {
        this.r = f;
        setTranslationY(f + this.n);
    }

    public void setOverrideText(String str) {
        this.a.setText(str);
    }

    public void setShowingDuration(long j) {
        this.w = j;
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setUseScale(boolean z) {
        this.x = z;
    }

    public void setVisibleListener(jg5 jg5Var) {
    }

    public lg5(Context context, int i) {
        this(i, null, context, false);
    }
}
