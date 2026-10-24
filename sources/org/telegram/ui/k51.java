package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class k51 extends View {
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public j51 J;
    public Emoji.EmojiDrawable K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public final g50 U;
    public final /* synthetic */ b61 V;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.a6 e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique v;
    public Integer w;
    public ah.i1 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(b61 b61Var, Context context) {
        super(context);
        this.V = b61Var;
        this.a = false;
        this.b = false;
        this.f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.n = imageReceiver;
        this.T = 1.0f;
        this.U = new g50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.H) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        j51 j51Var = this.J;
        if (j51Var != null) {
            j51Var.h = false;
            j51Var.n = -1;
            if (j51Var.a != 2 || (paint = j51Var.x) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            return;
        }
        Context context = getContext();
        int i10 = sg.c1.L;
        this.J = new j51(this, context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30);
        this.J.measure(makeMeasureSpec, makeMeasureSpec);
        j51 j51Var2 = this.J;
        j51Var2.layout(0, 0, j51Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
    }

    public final void c(TLRPC.Document document, d51 d51Var) {
        this.d = document;
        a(d51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.m6, 0.2f);
        if (this.V.W == 6) {
            this.h.setImage(ImageLocation.getForDocument(document), !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? "34_34_firstframe" : "34_34", null, null, svgThumb, document.size, null, document, 0);
        } else {
            this.h.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
        }
        this.Q = true;
        this.e = null;
    }

    public final void d(boolean z10, boolean z11) {
        if (this.L != z10) {
            this.L = z10;
            if (z11) {
                return;
            }
            this.R = z10 ? 1.0f : 0.0f;
            this.S = z10 ? 1.0f : 0.0f;
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.L || !z10 || !z11 || this.V.W == 14) {
            this.M = false;
            d(z10, z11);
            return;
        }
        this.M = true;
        this.S = 1.0f;
        this.R = 1.0f;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.6f, 0.7f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new h51(this, 2));
        this.I.addListener(new i51(this, 2));
        this.I.setInterpolator(new LinearInterpolator());
        this.I.setDuration(200L);
        this.I.start();
    }

    public final void f() {
        if (!this.L || this.V.W == 14) {
            return;
        }
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
        }
        this.N = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new h51(this, 1));
        this.I.addListener(new i51(this, 1));
        org.telegram.messenger.sl.l(5.0f, this.I);
        this.I.setDuration(350L);
        this.I.start();
        d(false, true);
    }

    public float getAnimatedScale() {
        return this.T;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.x0.b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H) {
            return;
        }
        this.H = true;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.r5) {
            ((org.telegram.ui.Components.r5) drawable).b(this.U);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.setParentView((View) getParent());
            this.h.onAttachedToWindow();
        }
        this.n.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.H) {
            this.H = false;
            Drawable drawable = this.E;
            if (drawable instanceof org.telegram.ui.Components.r5) {
                ((org.telegram.ui.Components.r5) drawable).p(this.U);
                ci.f3 f3Var = ((org.telegram.ui.Components.r5) this.E).k;
                if (f3Var != null) {
                    f3Var.setEmojiPaused(false);
                }
            }
            ImageReceiver imageReceiver = this.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.h.setEmojiPaused(false);
            }
            this.n.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String findAnimatedEmojiEmoticon;
        org.telegram.ui.Components.a6 a6Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a) {
            findAnimatedEmojiEmoticon = LocaleController.getString(R.string.RemoveStatus);
        } else {
            ah.i1 i1Var = this.x;
            if (i1Var == null || (findAnimatedEmojiEmoticon = i1Var.f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (a6Var = this.e) != null && (document = a6Var.document) == null) {
                    document = org.telegram.ui.Components.r5.f(this.V.V, a6Var.getDocumentId());
                }
                findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document, null) : null;
            }
        }
        if (findAnimatedEmojiEmoticon != null) {
            accessibilityNodeInfo.setContentDescription(findAnimatedEmojiEmoticon);
        }
        accessibilityNodeInfo.setSelected(this.L);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setAnimatedScale(float f7) {
        this.T = f7;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            boolean z10 = this.H;
            g50 g50Var = this.U;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.r5)) {
                ((org.telegram.ui.Components.r5) drawable2).p(g50Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.r5)) {
                ((org.telegram.ui.Components.r5) drawable).b(g50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.K = null;
        } else {
            this.K = Emoji.getEmojiDrawable(str);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (z10) {
                return;
            }
            float f7 = this.N;
            if (f7 == 0.0f || this.V.W == 14) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new h51(this, 0));
            this.I.addListener(new i51(this, 0));
            org.telegram.messenger.sl.l(5.0f, this.I);
            this.I.setDuration(350L);
            this.I.start();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
