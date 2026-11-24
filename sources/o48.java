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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o48 extends FrameLayout {
    public static final Rect c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public jm6 I;
    public nm6 J;
    public final Paint K;
    public AnimatorSet L;
    public final wjb M;
    public qla N;
    public pla O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public m48 W;
    public final j48 a;
    public SpannableString a0;
    public final oc6 b;
    public SpannableString b0;
    public final FrameLayout c;
    public final wf2 d;
    public final ImageView e;
    public final TextView f;
    public final k48 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public final oq7 w;
    public boolean x;
    public n48 y;

    public o48(Context context, wjb wjbVar) {
        super(context);
        this.w = new oq7(this, (byte) 19);
        this.H = true;
        this.K = new Paint();
        this.V = 1.0f;
        this.M = wjbVar;
        setWillNotDraw(false);
        oc6 oc6Var = new oc6((byte) 6, context, this);
        this.b = oc6Var;
        addView(oc6Var, nme.c(80.0f, 80));
        j48 j48Var = new j48(this, context);
        this.a = j48Var;
        j48Var.setBlurAllowed(true);
        oc6Var.addView(j48Var, nme.c(-1.0f, -1));
        k48 k48Var = new k48(context, (byte) 0);
        k48Var.b = new RectF();
        this.h = k48Var;
        k48Var.setWillNotDraw(false);
        k48Var.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        oc6Var.addView(k48Var, nme.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        k48Var.addView(imageView, nme.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        k48Var.addView(textView, nme.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        wf2 wf2Var = new wf2(24, wjbVar, context);
        this.d = wf2Var;
        wf2Var.setDrawBackgroundAsArc(7);
        wf2Var.b(bkb.V9, bkb.W9, bkb.U9);
        addView(wf2Var, nme.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        wf2Var.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, nme.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = gl.L(80.0f);
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
            oc6 oc6Var = this.b;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) View.SCALE_X, z ? 0.787f : 1.0f), ObjectAnimator.ofFloat(oc6Var, (Property<oc6, Float>) View.SCALE_Y, z ? 0.787f : 1.0f));
                this.L.setDuration(200L);
                this.L.addListener(new id4((byte) 20, this, z));
                this.L.start();
            } else {
                oc6Var.setScaleX(z ? 0.787f : 1.0f);
                oc6Var.setScaleY(z ? 0.787f : 1.0f);
            }
        }
        jm6 jm6Var = this.I;
        if (jm6Var != null && jm6Var.c() && a()) {
            z3 = true;
        }
        setHighQuality(z3);
    }

    public final void c(boolean z, Float f) {
        if (this.P != z) {
            boolean isLaidOut = isLaidOut();
            Bitmap bitmap = this.T;
            j48 j48Var = this.a;
            if (isLaidOut) {
                this.T = gl.H3(j48Var);
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
            j48Var.setHasBlur(z);
            j48Var.invalidate();
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
            wf2 wf2Var = this.d;
            float f = wf2Var.a.q ? 0.787f : 1.0f;
            oc6 oc6Var = this.b;
            oc6Var.setScaleX(f);
            oc6Var.setScaleY(wf2Var.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(jm6 jm6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        this.x = false;
        this.I = jm6Var;
        this.r = z3;
        this.s = z4;
        if (z4) {
            jm6Var.k(this.w);
        }
        jm6 jm6Var2 = this.I;
        boolean z6 = jm6Var2.b;
        ImageView imageView = this.e;
        TextView textView = this.f;
        k48 k48Var = this.h;
        j48 j48Var = this.a;
        if (z6 && !jm6Var2.d()) {
            j48Var.q();
            k48Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gl.L(13.0f);
            textView.setText(gl.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            k48Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gl.L(0.0f);
            textView.setText(k96.M0(2131745173, null));
        } else {
            imageView.setVisibility(8);
            k48Var.setVisibility(4);
        }
        jm6 jm6Var3 = this.I;
        String str = jm6Var3.g;
        if (str != null) {
            j48Var.o(str, null, bkb.Q4);
        } else {
            String str2 = jm6Var3.c;
            if (str2 != null) {
                j48Var.o(str2, null, bkb.Q4);
            } else if (jm6Var3.I == null) {
                j48Var.setImageDrawable(bkb.Q4);
            } else if (!jm6Var3.b || jm6Var3.d()) {
                jm6 jm6Var4 = this.I;
                j48Var.r(jm6Var4.J, jm6Var4.K, true);
                j48Var.o("thumb://" + this.I.C + ":" + this.I.I, null, bkb.Q4);
            } else {
                j48Var.o("vthumb://" + this.I.C + ":" + this.I.I, null, bkb.Q4);
            }
        }
        boolean z7 = z2 && PhotoViewer.Q0(this.I.I);
        j48Var.getImageReceiver().v0(!z7, true);
        this.d.setAlpha(z7 ? 0.0f : 1.0f);
        k48Var.setAlpha(z7 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(jm6Var.M);
        if (jm6Var.c() && a()) {
            z5 = true;
        }
        setHighQuality(z5);
        f(jm6Var.N, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(nm6 nm6Var) {
        j48 j48Var;
        this.x = false;
        this.J = nm6Var;
        this.r = false;
        Drawable drawable = this.H ? bkb.Q4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = nm6Var.M;
        j48 j48Var2 = this.a;
        if (photoSize != null) {
            j48Var2.m(gl5.i(photoSize, nm6Var.K), null, drawable, nm6Var);
        } else {
            TLRPC.PhotoSize photoSize2 = nm6Var.L;
            if (photoSize2 != null) {
                j48Var2.m(gl5.i(photoSize2, nm6Var.K), "80_80", drawable, nm6Var);
            } else {
                String str = nm6Var.c;
                if (str != null) {
                    j48Var2.o(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(nm6Var.D)) {
                        TLRPC.Document document = nm6Var.J;
                        if (document != null) {
                            k27.J0(document);
                            TLRPC.VideoSize J0 = k27.J0(nm6Var.J);
                            TLRPC.Document document2 = nm6Var.J;
                            if (J0 != null) {
                                j48Var2.g(1, -1L, gl5.d(J0, nm6Var.J), gl5.c(ba4.w(document2.thumbs, 90, false, null, false), nm6Var.J), nm6Var, null, "52_52", null);
                                j48Var = j48Var2;
                            } else {
                                j48Var = j48Var2;
                                j48Var.m(gl5.c(ba4.w(document2.thumbs, kk7.q5, false, null, false), nm6Var.J), null, drawable, nm6Var);
                            }
                        } else {
                            j48Var = j48Var2;
                            j48Var.setImageDrawable(drawable);
                        }
                        boolean Q0 = PhotoViewer.Q0(nm6Var.g());
                        j48Var.getImageReceiver().v0(!Q0, true);
                        this.d.setAlpha(!Q0 ? 0.0f : 1.0f);
                        this.h.setAlpha(Q0 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    gl5 g = gl5.g(nm6Var.D);
                    if (nm6Var.H && nm6Var.D.endsWith("mp4")) {
                        g.p = (byte) 2;
                    }
                    j48Var2.m(g, null, drawable, nm6Var);
                }
            }
        }
        j48Var = j48Var2;
        boolean Q02 = PhotoViewer.Q0(nm6Var.g());
        j48Var.getImageReceiver().v0(!Q02, true);
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
                cm2 cm2Var = new cm2(R.drawable.star_small_inner, 0);
                cm2Var.I = 0.7f;
                cm2Var.J = 0.7f;
                SpannableString spannableString = this.a0;
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z) {
                if (this.b0 == null) {
                    this.b0 = new SpannableString("l");
                    cm2 cm2Var2 = new cm2(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.b0;
                    spannableString2.setSpan(cm2Var2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j));
            }
        } else {
            spannableStringBuilder = null;
        }
        j48 j48Var = this.a;
        j48Var.setBlurredText(spannableStringBuilder);
        j48Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z) {
        wf2 wf2Var = this.d;
        float alpha = wf2Var.getAlpha();
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
        byte b = 0;
        float[] fArr = {z ? 1.0f : 0.0f};
        k48 k48Var = this.h;
        Property property = View.ALPHA;
        animatorSet3.playTogether(ObjectAnimator.ofFloat(k48Var, (Property<k48, Float>) property, fArr), ObjectAnimator.ofFloat(wf2Var, (Property<wf2, Float>) property, z ? 1.0f : 0.0f));
        this.n.addListener(new l48(this, b));
        this.n.start();
    }

    public wf2 getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public be0 getImageView() {
        return this.a;
    }

    public jm6 getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z) {
        j48 j48Var;
        oc6 oc6Var = this.b;
        if (oc6Var == null || (j48Var = this.a) == null || j48Var.getMeasuredHeight() <= 0 || j48Var.getMeasuredWidth() <= 0) {
            return;
        }
        pla plaVar = this.O;
        if (z) {
            if (plaVar == null) {
                this.O = pla.e(oc6Var);
            }
        } else if (plaVar != null) {
            plaVar.b(this);
            this.O = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pla plaVar = this.O;
        if (plaVar != null) {
            if (plaVar.i) {
                this.O = pla.e(this);
            } else {
                plaVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pla plaVar = this.O;
        if (plaVar != null) {
            plaVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jm6 jm6Var;
        nm6 nm6Var;
        boolean z = this.d.a.q;
        j48 j48Var = this.a;
        if (!z && this.b.getScaleX() == 1.0f && j48Var.getImageReceiver().E() && j48Var.getImageReceiver().i1 == 1.0f && (((jm6Var = this.I) == null || !PhotoViewer.Q0(jm6Var.I)) && ((nm6Var = this.J) == null || !PhotoViewer.Q0(nm6Var.g())))) {
            return;
        }
        int v0 = bkb.v0(bkb.W9, this.M);
        Paint paint = this.K;
        paint.setColor(v0);
        canvas.drawRect(0.0f, 0.0f, j48Var.getMeasuredWidth(), j48Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        jm6 jm6Var = this.I;
        if (jm6Var != null && jm6Var.i() && this.I.d()) {
            sb.append(k96.M0(2131753959, null));
        } else {
            jm6 jm6Var2 = this.I;
            if (jm6Var2 == null || !jm6Var2.b) {
                sb.append(k96.M0(2131753945, null));
            } else {
                sb.append(k96.M0(2131753930, null) + ", " + k96.z(this.I.E));
            }
        }
        if (this.I != null) {
            sb.append(". ");
            sb.append(k96.D0().y0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, k96.M0(2131747624, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, TLObject.FLAG_30), ug8.E(2.0f, this.F, TLObject.FLAG_30));
            return;
        }
        if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30));
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

    public void setDelegate(n48 n48Var) {
        this.y = n48Var;
    }

    public void setFastScrollDelegate(m48 m48Var) {
        this.W = m48Var;
    }

    public void setHasSpoiler(boolean z) {
        c(z, null);
    }

    public void setHighQuality(boolean z) {
        boolean z2 = z && a();
        if (this.Q != z2) {
            this.Q = z2;
            jm6 jm6Var = this.I;
            if (jm6Var != null) {
                boolean z3 = jm6Var.b;
                ImageView imageView = this.e;
                k48 k48Var = this.h;
                TextView textView = this.f;
                if (z3 && !jm6Var.d()) {
                    this.a.q();
                    k48Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gl.L(13.0f);
                    textView.setText(gl.g0(this.I.E, false, false));
                    return;
                }
                if (!this.I.c()) {
                    imageView.setVisibility(8);
                    k48Var.setVisibility(4);
                } else {
                    k48Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = gl.L(0.0f);
                    textView.setText(k96.M0(2131745173, null));
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
        wf2 wf2Var = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) wf2Var.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = gl.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        wf2Var.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i) {
        this.d.setNum(i);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
