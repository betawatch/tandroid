package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
import org.telegram.messenger.ff;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.jf;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fp;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public static final Rect c0 = new Rect();
    public boolean E;
    public int F;
    public boolean G;
    public final boolean H;
    public ff I;
    public jf J;
    public final Paint K;
    public AnimatorSet L;
    public final org.telegram.ui.ActionBar.e6 M;
    public xh.f N;
    public xh.e O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public Bitmap T;
    public Float U;
    public float V;
    public o5 W;
    public final m5 a;
    public SpannableString a0;
    public final bi.g2 b;
    public SpannableString b0;
    public final FrameLayout c;
    public final fp d;
    public final ImageView e;
    public final TextView f;
    public final n5 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public final f w;
    public boolean x;
    public p5 y;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.w = new f(this, 6);
        this.H = true;
        this.K = new Paint();
        new Path();
        this.V = 1.0f;
        this.M = e6Var;
        setWillNotDraw(false);
        bi.g2 g2Var = new bi.g2(12, context, this);
        this.b = g2Var;
        addView(g2Var, c8.ja.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.a = m5Var;
        m5Var.setBlurAllowed(true);
        g2Var.addView(m5Var, c8.ja.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        g2Var.addView(n5Var, c8.ja.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, c8.ja.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, c8.ja.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        fp fpVar = new fp(24, context, e6Var);
        this.d = fpVar;
        fpVar.setDrawBackgroundAsArc(7);
        fpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(fpVar, c8.ja.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        fpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, c8.ja.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.F = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i7, boolean z10, boolean z11) {
        this.d.a.f(i7, z10, z11);
        boolean z12 = false;
        if (this.E) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            bi.g2 g2Var = this.b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(g2Var, (Property<bi.g2, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.L.setDuration(200L);
                this.L.addListener(new bi.v4(24, this, z10));
                this.L.start();
            } else {
                g2Var.setScaleX(z10 ? 0.787f : 1.0f);
                g2Var.setScaleY(z10 ? 0.787f : 1.0f);
            }
        }
        ff ffVar = this.I;
        if (ffVar != null && ffVar.c() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.P != z10) {
            boolean isLaidOut = isLaidOut();
            m5 m5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.T;
                this.T = org.telegram.messenger.g0.M3(m5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.V = 0.0f;
            } else {
                Bitmap bitmap2 = this.T;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.T = null;
                }
                this.V = 1.0f;
            }
            this.P = z10;
            this.U = f10;
            m5Var.setHasBlur(z10);
            m5Var.invalidate();
            if (z10) {
                h(z10);
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
            fp fpVar = this.d;
            float f10 = fpVar.a.q ? 0.787f : 1.0f;
            bi.g2 g2Var = this.b;
            g2Var.setScaleX(f10);
            g2Var.setScaleY(fpVar.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(ff ffVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        this.x = false;
        this.I = ffVar;
        this.r = z12;
        this.s = z13;
        if (z13) {
            ffVar.k(this.w);
        }
        ff ffVar2 = this.I;
        boolean z15 = ffVar2.b;
        ImageView imageView = this.e;
        TextView textView = this.f;
        n5 n5Var = this.h;
        m5 m5Var = this.a;
        if (z15 && !ffVar2.d()) {
            m5Var.r();
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
        } else if (this.I.c() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(hd.M0(2131745365, null));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        ff ffVar3 = this.I;
        String str = ffVar3.g;
        if (str != null) {
            m5Var.h(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = ffVar3.c;
            if (str2 != null) {
                m5Var.h(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (ffVar3.I == null) {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            } else if (!ffVar3.b || ffVar3.d()) {
                ff ffVar4 = this.I;
                m5Var.s(ffVar4.J, ffVar4.K, true);
                m5Var.h("thumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.j6.R4);
            } else {
                m5Var.h("vthumb://" + this.I.C + ":" + this.I.I, null, org.telegram.ui.ActionBar.j6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.K1(this.I.I);
        m5Var.getImageReceiver().O0(!z16, true);
        this.d.setAlpha(z16 ? 0.0f : 1.0f);
        n5Var.setAlpha(z16 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(ffVar.M);
        if (ffVar.c() && a()) {
            z14 = true;
        }
        setHighQuality(z14);
        f(ffVar.N, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(jf jfVar) {
        m5 m5Var;
        this.x = false;
        this.J = jfVar;
        this.r = false;
        Drawable drawable = this.H ? org.telegram.ui.ActionBar.j6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = jfVar.M;
        m5 m5Var2 = this.a;
        if (photoSize != null) {
            m5Var2.j(gc.i(photoSize, jfVar.K), null, drawable, jfVar);
        } else {
            TLRPC.PhotoSize photoSize2 = jfVar.L;
            if (photoSize2 != null) {
                m5Var2.j(gc.i(photoSize2, jfVar.K), "80_80", drawable, jfVar);
            } else {
                String str = jfVar.c;
                if (str != null) {
                    m5Var2.h(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(jfVar.D)) {
                        TLRPC.Document document = jfVar.J;
                        if (document != null) {
                            gj.J0(document);
                            TLRPC.VideoSize J0 = gj.J0(jfVar.J);
                            if (J0 != null) {
                                m5Var2.g(1, -1L, jfVar, null, "52_52", null, gc.d(J0, jfVar.J), gc.c(org.telegram.messenger.w7.w(jfVar.J.thumbs, 90, false, null, false), jfVar.J));
                                m5Var = m5Var2;
                            } else {
                                m5Var = m5Var2;
                                m5Var.j(gc.c(org.telegram.messenger.w7.w(jfVar.J.thumbs, ns.r5, false, null, false), jfVar.J), null, drawable, jfVar);
                            }
                        } else {
                            m5Var = m5Var2;
                            m5Var.setImageDrawable(drawable);
                        }
                        boolean K1 = PhotoViewer.K1(jfVar.g());
                        m5Var.getImageReceiver().O0(!K1, true);
                        this.d.setAlpha(!K1 ? 0.0f : 1.0f);
                        this.h.setAlpha(K1 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    gc g10 = gc.g(jfVar.D);
                    if (jfVar.H == 1 && jfVar.D.endsWith("mp4")) {
                        g10.p = 2;
                    }
                    m5Var2.j(g10, null, drawable, jfVar);
                }
            }
        }
        m5Var = m5Var2;
        boolean K12 = PhotoViewer.K1(jfVar.g());
        m5Var.getImageReceiver().O0(!K12, true);
        this.d.setAlpha(!K12 ? 0.0f : 1.0f);
        this.h.setAlpha(K12 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j3, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.S && j3 == this.R) {
            return;
        }
        this.R = j3;
        this.S = z10;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.a0 == null) {
                this.a0 = new SpannableString("⭐");
                eq eqVar = new eq(R.drawable.star_small_inner, 0);
                eqVar.I = 0.7f;
                eqVar.J = 0.7f;
                SpannableString spannableString = this.a0;
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.a0);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.b0 == null) {
                    this.b0 = new SpannableString("l");
                    eq eqVar2 = new eq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.b0;
                    spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.b0);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        m5 m5Var = this.a;
        m5Var.setBlurredText(spannableStringBuilder);
        m5Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z10) {
        fp fpVar = this.d;
        if (z10 && fpVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || fpVar.getAlpha() != 0.0f) {
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
            float[] fArr = {z10 ? 1.0f : 0.0f};
            n5 n5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, fArr), ObjectAnimator.ofFloat(fpVar, (Property<fp, Float>) property, z10 ? 1.0f : 0.0f));
            this.n.addListener(new ki.s3(this, 25));
            this.n.start();
        }
    }

    public fp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.i9 getImageView() {
        return this.a;
    }

    public ff getPhotoEntry() {
        return this.I;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        m5 m5Var;
        bi.g2 g2Var = this.b;
        if (g2Var == null || (m5Var = this.a) == null || m5Var.getMeasuredHeight() <= 0 || m5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z10) {
            if (this.O == null) {
                this.O = xh.e.e(g2Var);
            }
        } else {
            xh.e eVar = this.O;
            if (eVar != null) {
                eVar.b(this);
                this.O = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xh.e eVar = this.O;
        if (eVar != null) {
            if (eVar.i) {
                this.O = xh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xh.e eVar = this.O;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ff ffVar;
        jf jfVar;
        boolean z10 = this.d.a.q;
        m5 m5Var = this.a;
        if (!z10 && this.b.getScaleX() == 1.0f && m5Var.getImageReceiver().L() && m5Var.getImageReceiver().i1 == 1.0f && (((ffVar = this.I) == null || !PhotoViewer.K1(ffVar.I)) && ((jfVar = this.J) == null || !PhotoViewer.K1(jfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.X9, this.M);
        Paint paint = this.K;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ff ffVar = this.I;
        if (ffVar != null && ffVar.i() && this.I.d()) {
            sb2.append(hd.M0(2131753962, null));
        } else {
            ff ffVar2 = this.I;
            if (ffVar2 == null || !ffVar2.b) {
                sb2.append(hd.M0(2131753948, null));
            } else {
                StringBuilder sb3 = new StringBuilder();
                y0.r(null, 2131753933, sb3, ", ");
                sb3.append(hd.z(this.I.E));
                sb2.append(sb3.toString());
            }
        }
        if (this.I != null) {
            sb2.append(". ");
            sb2.append(hd.E0().z0().format(this.I.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, hd.M0(2131747817, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.F, TLObject.FLAG_30), i20.B(2.0f, this.F, TLObject.FLAG_30));
            return;
        }
        if (this.G) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
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
        boolean z10 = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = true;
                invalidate();
                return z10 ? super.onTouchEvent(motionEvent) : z10;
            }
        } else if (this.x) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.x = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.y.d(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.x = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = false;
                invalidate();
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (i7 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setDelegate(p5 p5Var) {
        this.y = p5Var;
    }

    public void setFastScrollDelegate(o5 o5Var) {
        this.W = o5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11 = z10 && a();
        if (this.Q != z11) {
            this.Q = z11;
            ff ffVar = this.I;
            if (ffVar != null) {
                boolean z12 = ffVar.b;
                ImageView imageView = this.e;
                n5 n5Var = this.h;
                TextView textView = this.f;
                if (z12 && !ffVar.d()) {
                    this.a.r();
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.I.E, false, false));
                    return;
                }
                if (!this.I.c()) {
                    imageView.setVisibility(8);
                    n5Var.setVisibility(4);
                } else {
                    n5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(hd.M0(2131745365, null));
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.G = z10;
    }

    public void setItemSize(int i7) {
        this.F = i7;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i10 = this.F;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        fp fpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.g0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        fpVar.setDrawBackgroundAsArc(6);
        this.E = true;
    }

    public void setNum(int i7) {
        this.d.setNum(i7);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
