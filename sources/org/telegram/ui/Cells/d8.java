package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class d8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, cg.d {
    public static final AccelerateInterpolator K = new AccelerateInterpolator(0.5f);
    public final int B;
    public final boolean C;
    public boolean D;
    public final float E;
    public boolean F;
    public final ImageView G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final c8 a;
    public final fg.r1 b;
    public TLRPC.Document c;
    public SendMessagesHelper.ImportingSticker d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean v;
    public float w;
    public long x;
    public boolean y;

    public d8(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.n = 1.0f;
        this.B = UserConfig.selectedAccount;
        this.E = 1.0f;
        this.J = g6Var;
        this.C = z4;
        c8 c8Var = new c8(this, g6Var);
        this.a = c8Var;
        c8Var.setAspectFit(true);
        c8Var.setAllowLoadingOnAttachedOnly(true);
        c8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        fg.r1 r1Var = new fg.r1(context, 1, null);
        this.b = r1Var;
        r1Var.setImageReceiver(c8Var);
        r1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        r1Var.setImageReceiver(c8Var);
        addView(r1Var, k7.c6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q5, g6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, k7.c6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(pr.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z4;
        boolean z10 = this.r;
        float f10 = this.E;
        c8 c8Var = this.a;
        if (z10 || (((z4 = this.v) && this.w != 0.8f) || (!z4 && this.w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.s;
            this.s = currentTimeMillis;
            if (this.r) {
                long j11 = this.x + j10;
                this.x = j11;
                if (j11 > 1050) {
                    this.x = 1050L;
                }
                float interpolation = (K.getInterpolation(this.x / 150.0f) * 0.5f) + 0.5f;
                this.n = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = false;
                    this.n = 1.0f;
                }
                c8Var.setAlpha(this.n * f10);
            } else {
                if (this.v) {
                    float f11 = this.w;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (j10 / 400.0f);
                        this.w = f12;
                        if (f12 < 0.8f) {
                            this.w = 0.8f;
                        }
                    }
                }
                float f13 = (j10 / 400.0f) + this.w;
                this.w = f13;
                if (f13 > 1.0f) {
                    this.w = 1.0f;
                }
            }
            view.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        c8Var.setImageCoords(measuredWidth - f15, measuredHeight - f15, f14, f14);
        c8Var.setAlpha(this.n * f10);
        if (this.w == 1.0f) {
            c8Var.draw(canvas);
            return;
        }
        canvas.save();
        float f16 = this.w;
        canvas.scale(f16, f16, measuredWidth, measuredHeight);
        c8Var.draw(canvas);
        canvas.restore();
    }

    public final void c(boolean z4) {
        ImageView imageView = this.G;
        if (!z4) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(pr.f).start();
        }
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z4, boolean z10) {
        boolean z11;
        TextView textView;
        int i10;
        this.f = str;
        this.D = MessageObject.isPremiumSticker(document);
        this.I = false;
        c8 c8Var = this.a;
        c8Var.setColorFilter(null);
        this.H = 0;
        this.G.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q5, false)));
        if (z10) {
            c(false);
        } else {
            a(false);
        }
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false);
            fg.r1 r1Var = this.b;
            r1Var.setColor(w02);
            r1Var.E = true;
            r1Var.F = false;
            r1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                textView = textView2;
                i10 = 4;
                z11 = true;
                c8Var.setImage(ImageLocation.getForPath(importingSticker.path), "80_80", null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.k6.i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            } else {
                textView = textView2;
                i10 = 4;
                z11 = true;
                c8Var.setImage(null, null, null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.k6.i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i10);
            }
        } else {
            z11 = true;
            if (document != null) {
                this.c = document;
                this.e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z12 = this.C;
                int i11 = z12 ? org.telegram.ui.ActionBar.k6.c7 : org.telegram.ui.ActionBar.k6.a7;
                float f10 = z12 ? 0.2f : 1.0f;
                org.telegram.ui.ActionBar.g6 g6Var = this.J;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i11, f10, 1.0f, g6Var);
                String str2 = z12 ? "66_66_pcache_compress" : "66_66";
                if (MessageObject.isTextColorEmoji(document)) {
                    c8Var.setColorFilter(org.telegram.ui.ActionBar.k6.n0(g6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z12) {
                        this.I = true;
                    }
                    if (svgThumb != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str2, null, null, this.e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, svgThumb, "webp", this.e, 1);
                    } else {
                        c8Var.setImage(ImageLocation.getForDocument(document), str2, svgThumb, "webp", this.e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    c8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, null, "webp", this.e, 1);
                } else {
                    c8Var.setImage(ImageLocation.getForDocument(document), str2, null, "webp", this.e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z4) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            String str3 = documentAttribute.alt;
                            if (str3 != null && str3.length() > 0) {
                                textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                            }
                        } else {
                            i12++;
                        }
                    }
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.B).getEmojiForSticker(this.c.id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        c8Var.setAlpha(this.n * this.E);
        if (!this.I) {
            c8Var.setParentView(this);
        } else {
            c8Var.setInvalidateAll(z11);
            c8Var.setParentView((View) getParent());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.I) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4) {
        if (this.D) {
            this.F = true;
        } else {
            this.F = false;
        }
        fg.r1 r1Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r1Var.getLayoutParams();
        if (UserConfig.getInstance(this.B).isPremium()) {
            int dp = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            r1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        } else {
            int dp2 = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            r1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        r1Var.setLocked(!UserConfig.getInstance(r4).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(r1Var, this.F, 0.9f, z4);
        invalidate();
    }

    public String getEmoji() {
        return this.f;
    }

    public ImageReceiver getImageView() {
        return this.a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        c8 c8Var = this.a;
        if (!c8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        getLocationInWindow(new int[2]);
        sendAnimationData.x = c8Var.getCenterX() + r2[0];
        sendAnimationData.y = c8Var.getCenterY() + r2[1];
        sendAnimationData.width = c8Var.getImageWidth();
        sendAnimationData.height = c8Var.getImageHeight();
        return sendAnimationData;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public SendMessagesHelper.ImportingSticker getStickerPath() {
        SendMessagesHelper.ImportingSticker importingSticker = this.d;
        if (importingSticker == null || !importingSticker.validated) {
            return null;
        }
        return importingSticker;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.I && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z4 = this.I;
        c8 c8Var = this.a;
        if (z4) {
            c8Var.setInvalidateAll(true);
            c8Var.setParentView((View) getParent());
        } else {
            c8Var.setParentView(this);
        }
        c8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.B).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String string = LocaleController.getString(R.string.AttachSticker);
        if (this.c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                        string = android.support.v4.media.a.p(documentAttribute.alt, " ", string, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z4) {
        this.y = z4;
    }

    public void setScaled(boolean z4) {
        this.v = z4;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        String str = importingSticker.emoji;
        d(null, importingSticker, null, str, str != null, false);
    }
}
