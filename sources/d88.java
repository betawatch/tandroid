// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d88 extends FrameLayout {
    public static final Rect c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public no6 I;
    public ro6 J;
    public final Paint K;
    public AnimatorSet L;
    public final vnb M;
    public npa N;
    public mpa O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public b88 W;
    public final z78 a;
    public SpannableString a0;
    public final d26 b;
    public SpannableString b0;
    public final FrameLayout c;
    public final og2 d;
    public final ImageView e;
    public final TextView f;
    public final a88 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public final x38 w;
    public boolean x;
    public c88 y;

    public d88(Context context, vnb vnbVar) {
        super(context);
        this.w = new x38(this, (byte) 4);
        this.H = true;
        this.K = new Paint();
        this.V = 1.0f;
        this.M = vnbVar;
        setWillNotDraw(false);
        d26 d26Var = new d26((byte) 8, context, this);
        this.b = d26Var;
        addView(d26Var, tre.c(80.0f, 80));
        z78 z78Var = new z78(this, context);
        this.a = z78Var;
        z78Var.setBlurAllowed(true);
        d26Var.addView(z78Var, tre.c(-1.0f, -1));
        a88 a88Var = new a88(context, (byte) 0);
        a88Var.b = new RectF();
        this.h = a88Var;
        a88Var.setWillNotDraw(false);
        a88Var.setPadding(hl.L(5.0f), 0, hl.L(5.0f), 0);
        d26Var.addView(a88Var, tre.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        a88Var.addView(imageView, tre.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        a88Var.addView(textView, tre.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        og2 og2Var = new og2(24, vnbVar, context);
        this.d = og2Var;
        og2Var.setDrawBackgroundAsArc(7);
        og2Var.b(aob.W9, aob.X9, aob.V9);
        addView(og2Var, tre.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        og2Var.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, tre.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = hl.L(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i, boolean z, boolean z2) {
        this.d.a.f(i, z, z2);
        boolean z3 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            d26 d26Var = this.b;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(d26Var, (Property<d26, Float>) View.SCALE_X, z ? 0.787f : 1.0f), ObjectAnimator.ofFloat(d26Var, (Property<d26, Float>) View.SCALE_Y, z ? 0.787f : 1.0f));
                this.L.setDuration(200L);
                this.L.addListener(new gf4((byte) 20, this, z));
                this.L.start();
            } else {
                d26Var.setScaleX(z ? 0.787f : 1.0f);
                d26Var.setScaleY(z ? 0.787f : 1.0f);
            }
        }
        no6 no6Var = this.I;
        if (no6Var != null && no6Var.c() && a()) {
            z3 = true;
        }
        setHighQuality(z3);
    }

    public final void c(boolean z, Float f) {
        if (this.P != z) {
            boolean isLaidOut = isLaidOut();
            Bitmap bitmap = this.T;
            z78 z78Var = this.a;
            if (isLaidOut) {
                this.T = hl.H3(z78Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.V = 0.0f;
            } else {
                if (bitmap != null) {
                    bitmap.recycle();
                    this.T = null;
                }
                this.V = 1.0f;
            }
            this.P = z;
            this.U = f;
            z78Var.setHasBlur(z);
            z78Var.invalidate();
            if (z) {
                h(z);
            }
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
            og2 og2Var = this.d;
            float f = og2Var.a.q ? 0.787f : 1.0f;
            d26 d26Var = this.b;
            d26Var.setScaleX(f);
            d26Var.setScaleY(og2Var.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(no6 no6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.x = false;
        this.I = no6Var;
        this.r = z3;
        this.s = z4;
        if (z4) {
            no6Var.k(this.w);
        }
        no6 no6Var2 = this.I;
        boolean z6 = no6Var2.b;
        ImageView imageView = this.e;
        TextView textView = this.f;
        a88 a88Var = this.h;
        z78 z78Var = this.a;
        if (z6 && !no6Var2.d()) {
            z78Var.q();
            a88Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = hl.L(13.0f);
            textView.setText(hl.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            a88Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = hl.L(0.0f);
            textView.setText(ob6.M0(2131745093, null));
        } else {
            imageView.setVisibility(8);
            a88Var.setVisibility(4);
        }
        no6 no6Var3 = this.I;
        String str = no6Var3.g;
        if (str != null) {
            z78Var.o(str, null, aob.R4);
        } else {
            String str2 = no6Var3.c;
            if (str2 != null) {
                z78Var.o(str2, null, aob.R4);
            } else if (no6Var3.I == null) {
                z78Var.setImageDrawable(aob.R4);
            } else if (!no6Var3.b || no6Var3.d()) {
                no6 no6Var4 = this.I;
                z78Var.r(no6Var4.J, no6Var4.K, true);
                z78Var.o("thumb://" + this.I.C + ":" + this.I.I, null, aob.R4);
            } else {
                z78Var.o("vthumb://" + this.I.C + ":" + this.I.I, null, aob.R4);
            }
        }
        boolean z7 = z2 && PhotoViewer.Q0(this.I.I);
        z78Var.getImageReceiver().v0(!z7, true);
        this.d.setAlpha(z7 ? 0.0f : 1.0f);
        a88Var.setAlpha(z7 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(no6Var.M);
        if (no6Var.c() && a()) {
            z5 = true;
        }
        setHighQuality(z5);
        f(no6Var.N, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ro6 ro6Var) {
        z78 z78Var;
        this.x = false;
        this.J = ro6Var;
        this.r = false;
        Drawable drawable = this.H ? aob.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = ro6Var.M;
        z78 z78Var2 = this.a;
        if (photoSize != null) {
            z78Var2.m(jn5.i(photoSize, ro6Var.K), null, drawable, ro6Var);
        } else {
            TLRPC.PhotoSize photoSize2 = ro6Var.L;
            if (photoSize2 != null) {
                z78Var2.m(jn5.i(photoSize2, ro6Var.K), "80_80", drawable, ro6Var);
            } else {
                String str = ro6Var.c;
                if (str != null) {
                    z78Var2.o(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(ro6Var.D)) {
                        TLRPC.Document document = ro6Var.J;
                        if (document != null) {
                            r47.J0(document);
                            TLRPC.VideoSize J0 = r47.J0(ro6Var.J);
                            TLRPC.Document document2 = ro6Var.J;
                            if (J0 != null) {
                                z78Var2.g(1, -1L, jn5.d(J0, ro6Var.J), jn5.c(xb4.w(document2.thumbs, 90, false, null, false), ro6Var.J), ro6Var, null, "52_52", null);
                                z78Var = z78Var2;
                            } else {
                                z78Var = z78Var2;
                                z78Var.m(jn5.c(xb4.w(document2.thumbs, jn7.q5, false, null, false), ro6Var.J), null, drawable, ro6Var);
                            }
                        } else {
                            z78Var = z78Var2;
                            z78Var.setImageDrawable(drawable);
                        }
                        boolean Q0 = PhotoViewer.Q0(ro6Var.g());
                        z78Var.getImageReceiver().v0(!Q0, true);
                        this.d.setAlpha(!Q0 ? 0.0f : 1.0f);
                        this.h.setAlpha(Q0 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    jn5 g = jn5.g(ro6Var.D);
                    if (ro6Var.H && ro6Var.D.endsWith("mp4")) {
                        g.p = (byte) 2;
                    }
                    z78Var2.m(g, null, drawable, ro6Var);
                }
            }
        }
        z78Var = z78Var2;
        boolean Q02 = PhotoViewer.Q0(ro6Var.g());
        z78Var.getImageReceiver().v0(!Q02, true);
        this.d.setAlpha(!Q02 ? 0.0f : 1.0f);
        this.h.setAlpha(Q02 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (z == this.S && j == this.R) {
            return;
        }
        this.R = j;
        this.S = z;
        if (j > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.a0 == null) {
                this.a0 = new SpannableString("⭐");
                wm2 wm2Var = new wm2(R.drawable.star_small_inner, 0);
                wm2Var.I = 0.7f;
                wm2Var.J = 0.7f;
                SpannableString spannableString = this.a0;
                spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z) {
                if (this.b0 == null) {
                    this.b0 = new SpannableString("l");
                    wm2 wm2Var2 = new wm2(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.b0;
                    spannableString2.setSpan(wm2Var2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j));
            }
        } else {
            spannableStringBuilder = null;
        }
        z78 z78Var = this.a;
        z78Var.setBlurredText(spannableStringBuilder);
        z78Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z) {
        og2 og2Var = this.d;
        float alpha = og2Var.getAlpha();
        if (z) {
            if (alpha == 1.0f) {
                return;
            }
        } else if (alpha == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        this.n.setDuration(180L);
        AnimatorSet animatorSet3 = this.n;
        float[] fArr = {z ? 1.0f : 0.0f};
        a88 a88Var = this.h;
        Property property = View.ALPHA;
        animatorSet3.playTogether(ObjectAnimator.ofFloat(a88Var, (Property<a88, Float>) property, fArr), ObjectAnimator.ofFloat(og2Var, (Property<og2, Float>) property, z ? 1.0f : 0.0f));
        this.n.addListener(new ad5(this, (byte) 29));
        this.n.start();
    }

    public og2 getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public de0 getImageView() {
        return this.a;
    }

    public no6 getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z) {
        z78 z78Var;
        d26 d26Var = this.b;
        if (d26Var == null || (z78Var = this.a) == null || z78Var.getMeasuredHeight() <= 0 || z78Var.getMeasuredWidth() <= 0) {
            return;
        }
        mpa mpaVar = this.O;
        if (z) {
            if (mpaVar == null) {
                this.O = mpa.e(d26Var);
            }
        } else if (mpaVar != null) {
            mpaVar.b(this);
            this.O = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mpa mpaVar = this.O;
        if (mpaVar != null) {
            if (mpaVar.i) {
                this.O = mpa.e(this);
            } else {
                mpaVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mpa mpaVar = this.O;
        if (mpaVar != null) {
            mpaVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        no6 no6Var;
        ro6 ro6Var;
        boolean z = this.d.a.q;
        z78 z78Var = this.a;
        if (!z && this.b.getScaleX() == 1.0f && z78Var.getImageReceiver().E() && z78Var.getImageReceiver().i1 == 1.0f && (((no6Var = this.I) == null || !PhotoViewer.Q0(no6Var.I)) && ((ro6Var = this.J) == null || !PhotoViewer.Q0(ro6Var.g())))) {
            return;
        }
        int v0 = aob.v0(aob.X9, this.M);
        Paint paint = this.K;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, z78Var.getMeasuredWidth(), z78Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        no6 no6Var = this.I;
        if (no6Var != null && no6Var.i() && this.I.d()) {
            sb.append(ob6.M0(2131753955, null));
        } else {
            no6 no6Var2 = this.I;
            if (no6Var2 == null || !no6Var2.b) {
                sb.append(ob6.M0(2131753941, null));
            } else {
                sb.append(ob6.M0(2131753926, null) + ", " + ob6.z(this.I.E));
            }
        }
        if (this.I != null) {
            sb.append(". ");
            sb.append(ob6.D0().y0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, ob6.M0(2131747544, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, TLObject.FLAG_30), ik8.E(2.0f, this.F, TLObject.FLAG_30));
            return;
        }
        if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), TLObject.FLAG_30));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.c;
        Rect rect = c0;
        frameLayout.getHitRect(rect);
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = true;
                invalidate();
                return z ? super.onTouchEvent(motionEvent) : z;
            }
        } else if (this.x) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.x = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.y.c(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.x = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = false;
                invalidate();
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setDelegate(c88 c88Var) {
        this.y = c88Var;
    }

    public void setFastScrollDelegate(b88 b88Var) {
        this.W = b88Var;
    }

    public void setHasSpoiler(boolean z) {
        c(z, null);
    }

    public void setHighQuality(boolean z) {
        boolean z2 = z && a();
        if (this.Q != z2) {
            this.Q = z2;
            no6 no6Var = this.I;
            if (no6Var != null) {
                boolean z3 = no6Var.b;
                ImageView imageView = this.e;
                a88 a88Var = this.h;
                TextView textView = this.f;
                if (z3 && !no6Var.d()) {
                    this.a.q();
                    a88Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = hl.L(13.0f);
                    textView.setText(hl.g0(this.I.E, false, false));
                    return;
                }
                if (!this.I.c()) {
                    imageView.setVisibility(8);
                    a88Var.setVisibility(4);
                } else {
                    a88Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = hl.L(0.0f);
                    textView.setText(ob6.M0(2131745093, null));
                }
            }
        }
    }

    public void setIsVertical(boolean z) {
        this.G = z;
    }

    public void setItemSize(int i) {
        this.F = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i2 = this.F;
        layoutParams.height = i2;
        layoutParams.width = i2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        og2 og2Var = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) og2Var.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = hl.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        og2Var.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i) {
        this.d.setNum(i);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
