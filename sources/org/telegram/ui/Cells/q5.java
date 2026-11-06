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
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.kf;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout {
    public static final Rect b0 = new Rect();
    public boolean D;
    public int E;
    public boolean F;
    public final boolean G;
    public gf H;
    public kf I;
    public final Paint J;
    public AnimatorSet K;
    public final org.telegram.ui.ActionBar.f6 L;
    public xh.f M;
    public xh.e N;
    public boolean O;
    public boolean P;
    public long Q;
    public boolean R;
    public Bitmap S;
    public Float T;
    public float U;
    public o5 V;
    public SpannableString W;
    public final m5 a;
    public SpannableString a0;
    public final bi.e5 b;
    public final FrameLayout c;
    public final wo d;
    public final ImageView e;
    public final TextView f;
    public final n5 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public final f w;
    public boolean x;
    public p5 y;

    public q5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.w = new f(this, 5);
        this.G = true;
        this.J = new Paint();
        new Path();
        this.U = 1.0f;
        this.L = f6Var;
        setWillNotDraw(false);
        bi.e5 e5Var = new bi.e5(11, context, this);
        this.b = e5Var;
        addView(e5Var, c8.ha.c(80.0f, 80));
        m5 m5Var = new m5(this, context);
        this.a = m5Var;
        m5Var.setBlurAllowed(true);
        e5Var.addView(m5Var, c8.ha.c(-1.0f, -1));
        n5 n5Var = new n5(context, 0);
        n5Var.b = new RectF();
        this.h = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        e5Var.addView(n5Var, c8.ha.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, c8.ha.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, c8.ha.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        wo woVar = new wo(24, context, f6Var);
        this.d = woVar;
        woVar.setDrawBackgroundAsArc(7);
        woVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        addView(woVar, c8.ha.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        woVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, c8.ha.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.E = org.telegram.messenger.g0.L(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i7, boolean z9, boolean z10) {
        this.d.a.f(i7, z9, z10);
        boolean z11 = false;
        if (this.D) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.K = null;
            }
            bi.e5 e5Var = this.b;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.K = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) View.SCALE_X, z9 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(e5Var, (Property<bi.e5, Float>) View.SCALE_Y, z9 ? 0.787f : 1.0f));
                this.K.setDuration(200L);
                this.K.addListener(new ch.y(23, this, z9));
                this.K.start();
            } else {
                e5Var.setScaleX(z9 ? 0.787f : 1.0f);
                e5Var.setScaleY(z9 ? 0.787f : 1.0f);
            }
        }
        gf gfVar = this.H;
        if (gfVar != null && gfVar.c() && a()) {
            z11 = true;
        }
        setHighQuality(z11);
    }

    public final void c(boolean z9, Float f10) {
        if (this.O != z9) {
            boolean isLaidOut = isLaidOut();
            m5 m5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.S;
                this.S = org.telegram.messenger.g0.N3(m5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.U = 0.0f;
            } else {
                Bitmap bitmap2 = this.S;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.S = null;
                }
                this.U = 1.0f;
            }
            this.O = z9;
            this.T = f10;
            m5Var.setHasBlur(z9);
            m5Var.invalidate();
            if (z9) {
                h(z9);
            }
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.K = null;
            wo woVar = this.d;
            float f10 = woVar.a.q ? 0.787f : 1.0f;
            bi.e5 e5Var = this.b;
            e5Var.setScaleX(f10);
            e5Var.setScaleY(woVar.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(gf gfVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        this.x = false;
        this.H = gfVar;
        this.r = z11;
        this.s = z12;
        if (z12) {
            gfVar.k(this.w);
        }
        gf gfVar2 = this.H;
        boolean z14 = gfVar2.b;
        ImageView imageView = this.e;
        TextView textView = this.f;
        n5 n5Var = this.h;
        m5 m5Var = this.a;
        if (z14 && !gfVar2.d()) {
            m5Var.r();
            n5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
            textView.setText(org.telegram.messenger.g0.g0(this.H.E, false, false));
        } else if (this.H.c() && a()) {
            n5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
            textView.setText(hd.M0(2131745366, null));
        } else {
            imageView.setVisibility(8);
            n5Var.setVisibility(4);
        }
        gf gfVar3 = this.H;
        String str = gfVar3.g;
        if (str != null) {
            m5Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            String str2 = gfVar3.c;
            if (str2 != null) {
                m5Var.h(str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else if (gfVar3.I == null) {
                m5Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            } else if (!gfVar3.b || gfVar3.d()) {
                gf gfVar4 = this.H;
                m5Var.s(gfVar4.J, gfVar4.K, true);
                m5Var.h("thumb://" + this.H.C + ":" + this.H.I, null, org.telegram.ui.ActionBar.k6.R4);
            } else {
                m5Var.h("vthumb://" + this.H.C + ":" + this.H.I, null, org.telegram.ui.ActionBar.k6.R4);
            }
        }
        boolean z15 = z10 && PhotoViewer.K1(this.H.I);
        m5Var.getImageReceiver().O0(!z15, true);
        this.d.setAlpha(z15 ? 0.0f : 1.0f);
        n5Var.setAlpha(z15 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(gfVar.M);
        if (gfVar.c() && a()) {
            z13 = true;
        }
        setHighQuality(z13);
        f(gfVar.N, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(kf kfVar) {
        m5 m5Var;
        this.x = false;
        this.I = kfVar;
        this.r = false;
        Drawable drawable = this.G ? org.telegram.ui.ActionBar.k6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = kfVar.M;
        m5 m5Var2 = this.a;
        if (photoSize != null) {
            m5Var2.j(hc.i(photoSize, kfVar.K), null, drawable, kfVar);
        } else {
            TLRPC.PhotoSize photoSize2 = kfVar.L;
            if (photoSize2 != null) {
                m5Var2.j(hc.i(photoSize2, kfVar.K), "80_80", drawable, kfVar);
            } else {
                String str = kfVar.c;
                if (str != null) {
                    m5Var2.h(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(kfVar.D)) {
                        TLRPC.Document document = kfVar.J;
                        if (document != null) {
                            ij.J0(document);
                            TLRPC.VideoSize J0 = ij.J0(kfVar.J);
                            if (J0 != null) {
                                m5Var2.g(1, -1L, kfVar, null, "52_52", null, hc.d(J0, kfVar.J), hc.c(org.telegram.messenger.w7.w(kfVar.J.thumbs, 90, false, null, false), kfVar.J));
                                m5Var = m5Var2;
                            } else {
                                m5Var = m5Var2;
                                m5Var.j(hc.c(org.telegram.messenger.w7.w(kfVar.J.thumbs, qs.r5, false, null, false), kfVar.J), null, drawable, kfVar);
                            }
                        } else {
                            m5Var = m5Var2;
                            m5Var.setImageDrawable(drawable);
                        }
                        boolean K1 = PhotoViewer.K1(kfVar.g());
                        m5Var.getImageReceiver().O0(!K1, true);
                        this.d.setAlpha(!K1 ? 0.0f : 1.0f);
                        this.h.setAlpha(K1 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    hc g10 = hc.g(kfVar.D);
                    if (kfVar.H == 1 && kfVar.D.endsWith("mp4")) {
                        g10.p = 2;
                    }
                    m5Var2.j(g10, null, drawable, kfVar);
                }
            }
        }
        m5Var = m5Var2;
        boolean K12 = PhotoViewer.K1(kfVar.g());
        m5Var.getImageReceiver().O0(!K12, true);
        this.d.setAlpha(!K12 ? 0.0f : 1.0f);
        this.h.setAlpha(K12 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j3, boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        if (z9 == this.R && j3 == this.Q) {
            return;
        }
        this.Q = j3;
        this.R = z9;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.W == null) {
                this.W = new SpannableString("⭐");
                wp wpVar = new wp(R.drawable.star_small_inner, 0);
                wpVar.H = 0.7f;
                wpVar.I = 0.7f;
                SpannableString spannableString = this.W;
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.W);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z9) {
                if (this.a0 == null) {
                    this.a0 = new SpannableString("l");
                    wp wpVar2 = new wp(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.a0;
                    spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.a0);
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

    public final void g(boolean z9) {
        wo woVar = this.d;
        if (z9 && woVar.getAlpha() == 1.0f) {
            return;
        }
        if (z9 || woVar.getAlpha() != 0.0f) {
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
            float[] fArr = {z9 ? 1.0f : 0.0f};
            n5 n5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(n5Var, (Property<n5, Float>) property, fArr), ObjectAnimator.ofFloat(woVar, (Property<wo, Float>) property, z9 ? 1.0f : 0.0f));
            this.n.addListener(new m.a(this, 24));
            this.n.start();
        }
    }

    public wo getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.a;
    }

    public gf getPhotoEntry() {
        return this.H;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z9) {
        m5 m5Var;
        bi.e5 e5Var = this.b;
        if (e5Var == null || (m5Var = this.a) == null || m5Var.getMeasuredHeight() <= 0 || m5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z9) {
            if (this.N == null) {
                this.N = xh.e.e(e5Var);
            }
        } else {
            xh.e eVar = this.N;
            if (eVar != null) {
                eVar.b(this);
                this.N = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xh.e eVar = this.N;
        if (eVar != null) {
            if (eVar.i) {
                this.N = xh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xh.e eVar = this.N;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gf gfVar;
        kf kfVar;
        boolean z9 = this.d.a.q;
        m5 m5Var = this.a;
        if (!z9 && this.b.getScaleX() == 1.0f && m5Var.getImageReceiver().L() && m5Var.getImageReceiver().h1 == 1.0f && (((gfVar = this.H) == null || !PhotoViewer.K1(gfVar.I)) && ((kfVar = this.I) == null || !PhotoViewer.K1(kfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X9, this.L);
        Paint paint = this.J;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        gf gfVar = this.H;
        if (gfVar != null && gfVar.i() && this.H.d()) {
            sb2.append(hd.M0(2131753962, null));
        } else {
            gf gfVar2 = this.H;
            if (gfVar2 == null || !gfVar2.b) {
                sb2.append(hd.M0(2131753948, null));
            } else {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753933, sb3, ", ");
                sb3.append(hd.z(this.H.E));
                sb2.append(sb3.toString());
            }
        }
        if (this.H != null) {
            sb2.append(". ");
            sb2.append(hd.E0().z0().format(this.H.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, hd.M0(2131747816, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.D) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.E, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(2.0f, this.E, TLObject.FLAG_30));
            return;
        }
        if (this.F) {
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
        Rect rect = b0;
        frameLayout.getHitRect(rect);
        boolean z9 = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.x = true;
                invalidate();
                return z9 ? super.onTouchEvent(motionEvent) : z9;
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
        z9 = false;
        if (z9) {
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
        this.V = o5Var;
    }

    public void setHasSpoiler(boolean z9) {
        c(z9, null);
    }

    public void setHighQuality(boolean z9) {
        boolean z10 = z9 && a();
        if (this.P != z10) {
            this.P = z10;
            gf gfVar = this.H;
            if (gfVar != null) {
                boolean z11 = gfVar.b;
                ImageView imageView = this.e;
                n5 n5Var = this.h;
                TextView textView = this.f;
                if (z11 && !gfVar.d()) {
                    this.a.r();
                    n5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(13.0f);
                    textView.setText(org.telegram.messenger.g0.g0(this.H.E, false, false));
                    return;
                }
                if (!this.H.c()) {
                    imageView.setVisibility(8);
                    n5Var.setVisibility(4);
                } else {
                    n5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(0.0f);
                    textView.setText(hd.M0(2131745366, null));
                }
            }
        }
    }

    public void setIsVertical(boolean z9) {
        this.F = z9;
    }

    public void setItemSize(int i7) {
        this.E = i7;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i10 = this.E;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        wo woVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.g0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        woVar.setDrawBackgroundAsArc(6);
        this.D = true;
    }

    public void setNum(int i7) {
        this.d.setNum(i7);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
