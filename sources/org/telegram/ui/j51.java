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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j51 extends View {
    public Drawable A;
    public Rect B;
    public float C;
    public boolean D;
    public ValueAnimator E;
    public i51 F;
    public Emoji.EmojiDrawable G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public int L;
    public boolean M;
    public float N;
    public float O;
    public float P;
    public final d50 Q;
    public final /* synthetic */ a61 R;
    public boolean a;
    public boolean b;
    public int c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.t5 e;
    public final ImageReceiver.BackgroundThreadDrawHolder[] f;
    public ImageReceiver h;
    public final ImageReceiver n;
    public ImageReceiver r;
    public boolean s;
    public TL_stars.TL_starGiftUnique v;
    public Integer w;
    public ig.q0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(a61 a61Var, Context context) {
        super(context);
        this.R = a61Var;
        this.a = false;
        this.b = false;
        this.f = new ImageReceiver.BackgroundThreadDrawHolder[2];
        ImageReceiver imageReceiver = new ImageReceiver();
        this.n = imageReceiver;
        this.P = 1.0f;
        this.Q = new d50(this, 1);
        imageReceiver.ignoreNotifications = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.setLayerNum(7);
            if (this.D) {
                this.h.onAttachedToWindow();
            }
            this.h.setAspectFit(true);
        }
    }

    public final void b() {
        Paint paint;
        i51 i51Var = this.F;
        if (i51Var != null) {
            i51Var.h = false;
            i51Var.n = -1;
            if (i51Var.a != 2 || (paint = i51Var.x) == null) {
                return;
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
            return;
        }
        Context context = getContext();
        int i10 = ag.k2.H;
        this.F = new i51(this, context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), TLObject.FLAG_30);
        this.F.measure(makeMeasureSpec, makeMeasureSpec);
        i51 i51Var2 = this.F;
        i51Var2.layout(0, 0, i51Var2.getMeasuredWidth(), this.F.getMeasuredHeight());
    }

    public final void c(TLRPC.Document document, c51 c51Var) {
        this.d = document;
        a(c51Var);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.m6, 0.2f);
        if (this.R.S == 6) {
            this.h.setImage(ImageLocation.getForDocument(document), !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) ? "34_34_firstframe" : "34_34", null, null, svgThumb, document.size, null, document, 0);
        } else {
            this.h.setImage(ImageLocation.getForDocument(document), "100_100_firstframe", null, null, svgThumb, 0L, "tgs", document, 0);
        }
        this.M = true;
        this.e = null;
    }

    public final void d(boolean z10, boolean z11) {
        if (this.H != z10) {
            this.H = z10;
            if (z11) {
                return;
            }
            this.N = z10 ? 1.0f : 0.0f;
            this.O = z10 ? 1.0f : 0.0f;
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (this.H || !z10 || !z11 || this.R.S == 14) {
            this.I = false;
            d(z10, z11);
            return;
        }
        this.I = true;
        this.O = 1.0f;
        this.N = 1.0f;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, 1.6f, 0.7f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new g51(this, 2));
        this.E.addListener(new h51(this, 2));
        this.E.setInterpolator(new LinearInterpolator());
        this.E.setDuration(200L);
        this.E.start();
    }

    public final void f() {
        if (!this.H || this.R.S == 14) {
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        this.J = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new g51(this, 1));
        this.E.addListener(new h51(this, 1));
        this.E.setInterpolator(new OvershootInterpolator(5.0f));
        this.E.setDuration(350L);
        this.E.start();
        d(false, true);
    }

    public float getAnimatedScale() {
        return this.P;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ig.g0.b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D) {
            return;
        }
        this.D = true;
        Drawable drawable = this.A;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).b(this.Q);
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
        if (this.D) {
            this.D = false;
            Drawable drawable = this.A;
            if (drawable instanceof org.telegram.ui.Components.k5) {
                ((org.telegram.ui.Components.k5) drawable).p(this.Q);
                jh.y2 y2Var = ((org.telegram.ui.Components.k5) this.A).k;
                if (y2Var != null) {
                    y2Var.setEmojiPaused(false);
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
        org.telegram.ui.Components.t5 t5Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a) {
            findAnimatedEmojiEmoticon = LocaleController.getString(R.string.RemoveStatus);
        } else {
            ig.q0 q0Var = this.x;
            if (q0Var == null || (findAnimatedEmojiEmoticon = q0Var.f) == null) {
                TLRPC.Document document = this.d;
                if (document == null && (t5Var = this.e) != null && (document = t5Var.document) == null) {
                    document = org.telegram.ui.Components.k5.f(this.R.R, t5Var.getDocumentId());
                }
                findAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document, null) : null;
            }
        }
        if (findAnimatedEmojiEmoticon != null) {
            accessibilityNodeInfo.setContentDescription(findAnimatedEmojiEmoticon);
        }
        accessibilityNodeInfo.setSelected(this.H);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setAnimatedScale(float f10) {
        this.P = f10;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != drawable) {
            boolean z10 = this.D;
            d50 d50Var = this.Q;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.k5)) {
                ((org.telegram.ui.Components.k5) drawable2).p(d50Var);
            }
            this.A = drawable;
            if (this.D && (drawable instanceof org.telegram.ui.Components.k5)) {
                ((org.telegram.ui.Components.k5) drawable).b(d50Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.G = null;
        } else {
            this.G = Emoji.getEmojiDrawable(str);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.E) != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.J;
            if (f10 == 0.0f || this.R.S == 14) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new g51(this, 0));
            this.E.addListener(new h51(this, 0));
            this.E.setInterpolator(new OvershootInterpolator(5.0f));
            this.E.setDuration(350L);
            this.E.start();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ig.g0.b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
