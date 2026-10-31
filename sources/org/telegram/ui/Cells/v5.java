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
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.hf;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v5 extends FrameLayout {
    public static final Rect a0 = new Rect();
    public int D;
    public boolean E;
    public final boolean F;
    public ef G;
    public hf H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.p6 K;
    public nh.i L;
    public nh.h M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public t5 U;
    public SpannableString V;
    public SpannableString W;
    public final r5 a;
    public final jg.l0 b;
    public final FrameLayout c;
    public final ep d;
    public final ImageView e;
    public final TextView f;
    public final s5 h;
    public AnimatorSet n;
    public boolean r;
    public boolean s;
    public boolean w;
    public u5 x;
    public boolean y;

    public v5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = p6Var;
        setWillNotDraw(false);
        jg.l0 l0Var = new jg.l0(this, context, 9);
        this.b = l0Var;
        addView(l0Var, w7.b6.c(80.0f, 80));
        r5 r5Var = new r5(this, context);
        this.a = r5Var;
        r5Var.setBlurAllowed(true);
        l0Var.addView(r5Var, w7.b6.c(-1.0f, -1));
        s5 s5Var = new s5(context, 0);
        s5Var.b = new RectF();
        this.h = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f), 0);
        l0Var.addView(s5Var, w7.b6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        s5Var.addView(imageView, w7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        s5Var.addView(textView, w7.b6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        ep epVar = new ep(24, context, p6Var);
        this.d = epVar;
        epVar.setDrawBackgroundAsArc(7);
        epVar.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
        addView(epVar, w7.b6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        epVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, w7.b6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.D = org.telegram.messenger.i0.L(80.0f);
    }

    public final boolean a() {
        return this.d.a.q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        this.d.a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.y) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            jg.l0 l0Var = this.b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(l0Var, (Property<jg.l0, Float>) View.SCALE_X, z10 ? 0.787f : 1.0f), ObjectAnimator.ofFloat(l0Var, (Property<jg.l0, Float>) View.SCALE_Y, z10 ? 0.787f : 1.0f));
                this.J.setDuration(200L);
                this.J.addListener(new eg.m(9, this, z10));
                this.J.start();
            } else {
                l0Var.setScaleX(z10 ? 0.787f : 1.0f);
                l0Var.setScaleY(z10 ? 0.787f : 1.0f);
            }
        }
        ef efVar = this.G;
        if (efVar != null && efVar.c() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f7) {
        if (this.N != z10) {
            boolean isLaidOut = isLaidOut();
            r5 r5Var = this.a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = org.telegram.messenger.i0.M3(r5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.T = 0.0f;
            } else {
                Bitmap bitmap2 = this.R;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.R = null;
                }
                this.T = 1.0f;
            }
            this.N = z10;
            this.S = f7;
            r5Var.setHasBlur(z10);
            r5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J = null;
            ep epVar = this.d;
            float f7 = epVar.a.q ? 0.787f : 1.0f;
            jg.l0 l0Var = this.b;
            l0Var.setScaleX(f7);
            l0Var.setScaleY(epVar.a.q ? 0.787f : 1.0f);
        }
    }

    public final void d(ef efVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        this.w = false;
        this.G = efVar;
        this.r = z12;
        this.s = z13;
        boolean z15 = efVar.b;
        ImageView imageView = this.e;
        TextView textView = this.f;
        s5 s5Var = this.h;
        r5 r5Var = this.a;
        if (z15 && !efVar.d()) {
            r5Var.r();
            s5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(13.0f);
            textView.setText(org.telegram.messenger.i0.g0(this.G.E, false, false));
        } else if (this.G.c() && a()) {
            s5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(0.0f);
            textView.setText(cd.L0(2131745383, null));
        } else {
            imageView.setVisibility(8);
            s5Var.setVisibility(4);
        }
        ef efVar2 = this.G;
        String str = efVar2.g;
        if (str != null) {
            r5Var.h(str, null, org.telegram.ui.ActionBar.t6.R4);
        } else {
            String str2 = efVar2.c;
            if (str2 != null) {
                r5Var.h(str2, null, org.telegram.ui.ActionBar.t6.R4);
            } else if (efVar2.I == null) {
                r5Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
            } else if (!efVar2.b || efVar2.d()) {
                ef efVar3 = this.G;
                r5Var.s(efVar3.J, efVar3.K, true);
                r5Var.h("thumb://" + this.G.C + ":" + this.G.I, null, org.telegram.ui.ActionBar.t6.R4);
            } else {
                r5Var.h("vthumb://" + this.G.C + ":" + this.G.I, null, org.telegram.ui.ActionBar.t6.R4);
            }
        }
        boolean z16 = z11 && PhotoViewer.P1(this.G.I);
        r5Var.getImageReceiver().O0(!z16, true);
        this.d.setAlpha(z16 ? 0.0f : 1.0f);
        s5Var.setAlpha(z16 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(efVar.M);
        if (efVar.c() && a()) {
            z14 = true;
        }
        setHighQuality(z14);
        f(efVar.N, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(hf hfVar) {
        r5 r5Var;
        this.w = false;
        this.H = hfVar;
        this.r = false;
        Drawable drawable = this.F ? org.telegram.ui.ActionBar.t6.R4 : getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = hfVar.M;
        r5 r5Var2 = this.a;
        if (photoSize != null) {
            r5Var2.j(ic.i(photoSize, hfVar.K), null, drawable, hfVar);
        } else {
            TLRPC.PhotoSize photoSize2 = hfVar.L;
            if (photoSize2 != null) {
                r5Var2.j(ic.i(photoSize2, hfVar.K), "80_80", drawable, hfVar);
            } else {
                String str = hfVar.c;
                if (str != null) {
                    r5Var2.h(str, null, drawable);
                } else {
                    if (TextUtils.isEmpty(hfVar.D)) {
                        TLRPC.Document document = hfVar.J;
                        if (document != null) {
                            jj.J0(document);
                            TLRPC.VideoSize J0 = jj.J0(hfVar.J);
                            if (J0 != null) {
                                r5Var2.g(1, -1L, hfVar, null, "52_52", null, ic.d(J0, hfVar.J), ic.c(org.telegram.messenger.b8.w(hfVar.J.thumbs, 90, false, null, false), hfVar.J));
                                r5Var = r5Var2;
                            } else {
                                r5Var = r5Var2;
                                r5Var.j(ic.c(org.telegram.messenger.b8.w(hfVar.J.thumbs, zs.r5, false, null, false), hfVar.J), null, drawable, hfVar);
                            }
                        } else {
                            r5Var = r5Var2;
                            r5Var.setImageDrawable(drawable);
                        }
                        boolean P1 = PhotoViewer.P1(hfVar.g());
                        r5Var.getImageReceiver().O0(!P1, true);
                        this.d.setAlpha(!P1 ? 0.0f : 1.0f);
                        this.h.setAlpha(P1 ? 0.0f : 1.0f);
                        requestLayout();
                        setHasSpoiler(false);
                        setHighQuality(false);
                        f(0L, false);
                    }
                    ic g10 = ic.g(hfVar.D);
                    if (hfVar.H == 1 && hfVar.D.endsWith("mp4")) {
                        g10.p = 2;
                    }
                    r5Var2.j(g10, null, drawable, hfVar);
                }
            }
        }
        r5Var = r5Var2;
        boolean P12 = PhotoViewer.P1(hfVar.g());
        r5Var.getImageReceiver().O0(!P12, true);
        this.d.setAlpha(!P12 ? 0.0f : 1.0f);
        this.h.setAlpha(P12 ? 0.0f : 1.0f);
        requestLayout();
        setHasSpoiler(false);
        setHighQuality(false);
        f(0L, false);
    }

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j10 == this.P) {
            return;
        }
        this.P = j10;
        this.Q = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                dq dqVar = new dq(R.drawable.star_small_inner, 0);
                dqVar.H = 0.7f;
                dqVar.I = 0.7f;
                SpannableString spannableString = this.V;
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    dq dqVar2 = new dq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        r5 r5Var = this.a;
        r5Var.setBlurredText(spannableStringBuilder);
        r5Var.invalidate();
        this.b.invalidate();
    }

    public final void g(boolean z10) {
        ep epVar = this.d;
        if (z10 && epVar.getAlpha() == 1.0f) {
            return;
        }
        if (z10 || epVar.getAlpha() != 0.0f) {
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
            s5 s5Var = this.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s5Var, (Property<s5, Float>) property, fArr), ObjectAnimator.ofFloat(epVar, (Property<ep, Float>) property, z10 ? 1.0f : 0.0f));
            this.n.addListener(new org.telegram.ui.s9(this, 5));
            this.n.start();
        }
    }

    public ep getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.c;
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.a;
    }

    public ef getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        r5 r5Var;
        jg.l0 l0Var = this.b;
        if (l0Var == null || (r5Var = this.a) == null || r5Var.getMeasuredHeight() <= 0 || r5Var.getMeasuredWidth() <= 0) {
            return;
        }
        if (z10) {
            if (this.M == null) {
                this.M = nh.h.e(l0Var);
            }
        } else {
            nh.h hVar = this.M;
            if (hVar != null) {
                hVar.b(this);
                this.M = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nh.h hVar = this.M;
        if (hVar != null) {
            if (hVar.i) {
                this.M = nh.h.e(this);
            } else {
                hVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nh.h hVar = this.M;
        if (hVar != null) {
            hVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ef efVar;
        hf hfVar;
        boolean z10 = this.d.a.q;
        r5 r5Var = this.a;
        if (!z10 && this.b.getScaleX() == 1.0f && r5Var.getImageReceiver().L() && r5Var.getImageReceiver().h1 == 1.0f && (((efVar = this.G) == null || !PhotoViewer.P1(efVar.I)) && ((hfVar = this.H) == null || !PhotoViewer.P1(hfVar.g())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, r5Var.getMeasuredWidth(), r5Var.getMeasuredHeight(), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        ef efVar = this.G;
        if (efVar == null || !efVar.d()) {
            ef efVar2 = this.G;
            if (efVar2 == null || !efVar2.b) {
                sb2.append(cd.L0(2131753948, null));
            } else {
                StringBuilder sb3 = new StringBuilder();
                z20.q(null, 2131753933, sb3, ", ");
                sb3.append(cd.z(this.G.E));
                sb2.append(sb3.toString());
            }
        } else {
            sb2.append(cd.L0(2131753962, null));
        }
        if (this.G != null) {
            sb2.append(". ");
            sb2.append(cd.D0().y0().format(this.G.D * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, cd.L0(2131747833, null)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.y) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.D, TLObject.FLAG_30), z20.B(2.0f, this.D, TLObject.FLAG_30));
            return;
        }
        if (this.E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((this.r ? 0 : 6) + 80), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30));
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
        Rect rect = a0;
        frameLayout.getHitRect(rect);
        boolean z10 = true;
        if (motionEvent.getAction() == 0) {
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.w = true;
                invalidate();
                return z10 ? super.onTouchEvent(motionEvent) : z10;
            }
        } else if (this.w) {
            if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.w = false;
                playSoundEffect(0);
                sendAccessibilityEvent(1);
                this.x.d(this);
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.w = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.w = false;
                invalidate();
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setDelegate(u5 u5Var) {
        this.x = u5Var;
    }

    public void setFastScrollDelegate(t5 t5Var) {
        this.U = t5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11 = z10 && a();
        if (this.O != z11) {
            this.O = z11;
            ef efVar = this.G;
            if (efVar != null) {
                boolean z12 = efVar.b;
                ImageView imageView = this.e;
                s5 s5Var = this.h;
                TextView textView = this.f;
                if (z12 && !efVar.d()) {
                    this.a.r();
                    s5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(13.0f);
                    textView.setText(org.telegram.messenger.i0.g0(this.G.E, false, false));
                    return;
                }
                if (!this.G.c()) {
                    imageView.setVisibility(8);
                    s5Var.setVisibility(4);
                } else {
                    s5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(0.0f);
                    textView.setText(cd.L0(2131745383, null));
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.D = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        int i11 = this.D;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        ep epVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) epVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int L = org.telegram.messenger.i0.L(5.0f);
        layoutParams3.topMargin = L;
        layoutParams3.rightMargin = L;
        epVar.setDrawBackgroundAsArc(6);
        this.y = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
