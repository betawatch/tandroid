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
import android.view.animation.OvershootInterpolator;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a61 extends View {
    public Drawable B;
    public Rect C;
    public float D;
    public boolean E;
    public ValueAnimator F;
    public z51 G;
    public Emoji.EmojiDrawable H;
    public boolean I;
    public boolean J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public final p50 R;
    public final /* synthetic */ r61 S;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.u5 e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique v;
    public Integer w;
    public ng.q0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(r61 r61Var, Context context) {
        super(context);
        this.S = r61Var;
        this.a = false;
        this.b = false;
        this.f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.n = imageReceiver;
        this.Q = 1.0f;
        this.R = new p50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.E) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        z51 z51Var = this.G;
        if (z51Var != null) {
            z51Var.h = false;
            z51Var.n = -1;
            if (z51Var.a != 2 || (paint = z51Var.x) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
            return;
        }
        Context context = getContext();
        int i10 = fg.r1.I;
        this.G = new z51(this, context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30);
        this.G.measure(makeMeasureSpec, makeMeasureSpec);
        z51 z51Var2 = this.G;
        z51Var2.layout(0, 0, z51Var2.getMeasuredWidth(), this.G.getMeasuredHeight());
    }

    public final void c(TLRPC.Document document, t51 t51Var) {
        this.d = document;
        a(t51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.m6, 0.2f);
        if (this.S.T == 6) {
            this.h.setImage(ImageLocation.getForDocument(document), !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? "34_34_firstframe" : "34_34", null, null, svgThumb, document.size, null, document, 0);
        } else {
            this.h.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
        }
        this.N = true;
        this.e = null;
    }

    public final void d(boolean z4, boolean z10) {
        if (this.I != z4) {
            this.I = z4;
            if (z10) {
                return;
            }
            this.O = z4 ? 1.0f : 0.0f;
            this.P = z4 ? 1.0f : 0.0f;
        }
    }

    public final void e(boolean z4, boolean z10) {
        if (this.I || !z4 || !z10 || this.S.T == 14) {
            this.J = false;
            d(z4, z10);
            return;
        }
        this.J = true;
        this.P = 1.0f;
        this.O = 1.0f;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.6f, 0.7f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x51(this, 2));
        this.F.addListener(new y51(this, 2));
        this.F.setInterpolator(new LinearInterpolator());
        this.F.setDuration(200L);
        this.F.start();
    }

    public final void f() {
        if (!this.I || this.S.T == 14) {
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F.cancel();
        }
        this.K = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x51(this, 1));
        this.F.addListener(new y51(this, 1));
        this.F.setInterpolator(new OvershootInterpolator(5.0f));
        this.F.setDuration(350L);
        this.F.start();
        d(false, true);
    }

    public float getAnimatedScale() {
        return this.Q;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ng.g0.b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            return;
        }
        this.E = true;
        Drawable drawable = this.B;
        if (drawable instanceof org.telegram.ui.Components.l5) {
            ((org.telegram.ui.Components.l5) drawable).b(this.R);
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
        if (this.E) {
            this.E = false;
            Drawable drawable = this.B;
            if (drawable instanceof org.telegram.ui.Components.l5) {
                ((org.telegram.ui.Components.l5) drawable).p(this.R);
                oh.z2 z2Var = ((org.telegram.ui.Components.l5) this.B).k;
                if (z2Var != null) {
                    z2Var.setEmojiPaused(false);
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
        org.telegram.ui.Components.u5 u5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a) {
            findAnimatedEmojiEmoticon = LocaleController.getString(R.string.RemoveStatus);
        } else {
            ng.q0 q0Var = this.x;
            if (q0Var == null || (findAnimatedEmojiEmoticon = q0Var.f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (u5Var = this.e) != null && (document = u5Var.document) == null) {
                    document = org.telegram.ui.Components.l5.f(this.S.S, u5Var.getDocumentId());
                }
                findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document, null) : null;
            }
        }
        if (findAnimatedEmojiEmoticon != null) {
            accessibilityNodeInfo.setContentDescription(findAnimatedEmojiEmoticon);
        }
        accessibilityNodeInfo.setSelected(this.I);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setAnimatedScale(float f10) {
        this.Q = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            boolean z4 = this.E;
            p50 p50Var = this.R;
            if (z4 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.l5)) {
                ((org.telegram.ui.Components.l5) drawable2).p(p50Var);
            }
            this.B = drawable;
            if (this.E && (drawable instanceof org.telegram.ui.Components.l5)) {
                ((org.telegram.ui.Components.l5) drawable).b(p50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.H = null;
        } else {
            this.H = Emoji.getEmojiDrawable(str);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            if (z4 && (valueAnimator = this.F) != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            if (z4) {
                return;
            }
            float f10 = this.K;
            if (f10 == 0.0f || this.S.T == 14) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new x51(this, 0));
            this.F.addListener(new y51(this, 0));
            this.F.setInterpolator(new OvershootInterpolator(5.0f));
            this.F.setDuration(350L);
            this.F.start();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ng.g0.b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
