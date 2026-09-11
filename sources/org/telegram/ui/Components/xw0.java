package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class xw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final cc1 a;
    public final x9 b;
    public final RadialProgressView c;
    public final wh.p d;
    public final d90 e;
    public final di.d f;
    public boolean h;
    public final org.telegram.ui.ActionBar.f6 n;
    public int r;
    public final View s;
    public int v;
    public final int w;
    public boolean x;
    public final org.telegram.ui.Cells.l7 y;

    public xw0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i10, boolean z10) {
        if (this.v != i10) {
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.v = i10;
            float dp = (-(i10 >> 1)) + (i10 > 0 ? AndroidUtilities.dp(20.0f) : 0);
            RadialProgressView radialProgressView = this.c;
            cc1 cc1Var = this.a;
            if (!z10) {
                cc1Var.setTranslationY(dp);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(dp);
                    return;
                }
                return;
            }
            ViewPropertyAnimator translationY = cc1Var.animate().translationY(dp);
            pr prVar = pr.f;
            translationY.setInterpolator(prVar).setDuration(250L);
            if (radialProgressView != null) {
                radialProgressView.animate().translationY(dp).setInterpolator(prVar).setDuration(250L);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.r;
        x9 x9Var = this.b;
        if (i11 != 0) {
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.w;
                if (i11 == 16) {
                    document = MediaDataController.getInstance(i12).getEmojiAnimatedSticker("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(i12).getStickerSetByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
                    }
                    if (stickerSetByName != null && (i10 = this.r) >= 0 && i10 < stickerSetByName.documents.size()) {
                        document2 = stickerSetByName.documents.get(this.r);
                    }
                    obj = stickerSetByName;
                    document = document2;
                    str = "130_130";
                }
                if (!LiteMode.isEnabled(3)) {
                    str = org.telegram.ui.Cells.p6.t(str, "_firstframe");
                }
                if (document == null) {
                    MediaDataController.getInstance(i12).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, obj == null);
                    x9Var.getImageReceiver().clearImage();
                    return;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, this.G, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                x9Var.i(ImageLocation.getForDocument(document), str, "tgs", svgThumb, obj);
                int i13 = this.r;
                if (i13 == 9 || i13 == 0) {
                    x9Var.getImageReceiver().setAutoRepeat(1);
                    return;
                } else {
                    x9Var.getImageReceiver().setAutoRepeat(2);
                    return;
                }
            }
        }
        x9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
    }

    public final void d(int i10, boolean z10) {
        boolean z11 = i10 == 0;
        if (this.J != z11) {
            this.J = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
                this.H = ofFloat;
                ofFloat.setDuration(480L);
                this.H.setInterpolator(pr.h);
                this.H.addUpdateListener(new h70(this, 24));
                this.H.start();
            } else {
                this.I = z11 ? 1.0f : 0.0f;
                a();
            }
        }
        int visibility = getVisibility();
        x9 x9Var = this.b;
        RadialProgressView radialProgressView = this.c;
        cc1 cc1Var = this.a;
        View view = this.s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                cc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                cc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new ww0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                x9Var.getImageReceiver().startAnimation();
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.F = 0;
        cc1Var.setAlpha(0.0f);
        cc1Var.setScaleX(0.8f);
        cc1Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new ww0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        x9Var.getImageReceiver().stopAnimation();
        x9Var.getImageReceiver().clearImage();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME.equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() != 0) {
                return;
            }
            RadialProgressView radialProgressView = this.c;
            View view = this.s;
            cc1 cc1Var = this.a;
            if (z11) {
                if (z10) {
                    cc1Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.y.run();
                    return;
                }
                cc1Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new ww0(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.b.getImageReceiver().startAnimation();
                return;
            }
            if (!z10) {
                cc1Var.animate().cancel();
                cc1Var.setAlpha(1.0f);
                cc1Var.setScaleX(1.0f);
                cc1Var.setScaleY(1.0f);
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.setVisibility(8);
                    return;
                } else {
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                    return;
                }
            }
            cc1Var.animate().cancel();
            cc1Var.setAlpha(0.0f);
            cc1Var.setScaleX(0.8f);
            cc1Var.setScaleY(0.8f);
            if (view != null) {
                view.animate().setListener(null).cancel();
                view.setAlpha(1.0f);
                view.setVisibility(0);
            } else {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setScaleX(1.0f);
                radialProgressView.setScaleY(1.0f);
            }
        }
    }

    public float getVisibilityFactor() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        NotificationCenter.getInstance(this.w).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.w).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.x) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            cc1 cc1Var = this.a;
            cc1Var.setTranslationY(cc1Var.getTranslationY() + measuredHeight);
            if (!this.x) {
                cc1Var.animate().translationY(0.0f).setInterpolator(pr.f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.x) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(pr.f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.x = z10;
        if (z10) {
            return;
        }
        this.a.setTranslationY(0.0f);
        RadialProgressView radialProgressView = this.c;
        if (radialProgressView != null) {
            radialProgressView.setTranslationY(0.0f);
        }
    }

    public void setStickerType(int i10) {
        if (this.r != i10) {
            this.r = i10;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (Character.isWhitespace(charSequence.charAt(i11))) {
                i10++;
            }
        }
        if (i10 > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < charSequence.length(); i14++) {
                if (Character.isWhitespace(charSequence.charAt(i14))) {
                    int abs = Math.abs(length - i14);
                    if (i12 == -1 || abs < i13) {
                        i12 = i14;
                        i13 = abs;
                    }
                }
            }
            if (i12 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i12)) + "\n" + ((Object) charSequence.subSequence(i12 + 1, charSequence.length()));
            }
        }
        this.e.setText(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public xw0(Context context, View view, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.w = UserConfig.selectedAccount;
        this.y = new org.telegram.ui.Cells.l7(this, 24);
        this.G = org.telegram.ui.ActionBar.j6.c7;
        this.n = f6Var;
        this.s = view;
        this.r = i10;
        cc1 cc1Var = new cc1(this, context, 10);
        this.a = cc1Var;
        cc1Var.setOrientation(1);
        x9 x9Var = new x9(context);
        this.b = x9Var;
        x9Var.setOnClickListener(new x70(this, 18));
        wh.p pVar = new wh.p(context);
        this.d = pVar;
        pVar.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        pVar.setTag(Integer.valueOf(i11));
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        pVar.setTextSize(1, 20.0f);
        pVar.setGravity(17);
        d90 d90Var = new d90(context, null);
        this.e = d90Var;
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        d90Var.setTag(Integer.valueOf(i12));
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(17);
        di.d dVar = new di.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.f = dVar;
        dVar.setVisibility(8);
        cc1Var.addView(x9Var, w7.x5.q(117, 117, 1));
        cc1Var.addView(pVar, w7.x5.t(-2, -2, 1, 0, 12, 0, 0));
        cc1Var.addView(d90Var, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
        cc1Var.addView(dVar, w7.x5.t(-1, 48, 1, 28, 16, 28, 0));
        addView(cc1Var, w7.x5.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
            this.c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, w7.x5.e(-2, -2, 17));
        }
    }
}
