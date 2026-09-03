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
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class c8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, bg.d {
    public static final AccelerateInterpolator K = new AccelerateInterpolator(0.5f);
    public final int B;
    public final boolean C;
    public boolean D;
    public final float E;
    public boolean F;
    public final ImageView G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final b8 a;
    public final eg.s1 b;
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

    public c8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.n = 1.0f;
        this.B = UserConfig.selectedAccount;
        this.E = 1.0f;
        this.J = f6Var;
        this.C = z4;
        b8 b8Var = new b8(this, f6Var);
        this.a = b8Var;
        b8Var.setAspectFit(true);
        b8Var.setAllowLoadingOnAttachedOnly(true);
        b8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        eg.s1 s1Var = new eg.s1(context, 1, null);
        this.b = s1Var;
        s1Var.setImageReceiver(b8Var);
        s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        s1Var.setImageReceiver(b8Var);
        addView(s1Var, k7.b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.G = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, f6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, k7.b6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z4) {
        ImageView imageView = this.G;
        if (z4) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(mr.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z4;
        boolean z10 = this.r;
        float f10 = this.E;
        b8 b8Var = this.a;
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
                b8Var.setAlpha(this.n * f10);
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
        b8Var.setImageCoords(measuredWidth - f15, measuredHeight - f15, f14, f14);
        b8Var.setAlpha(this.n * f10);
        if (this.w == 1.0f) {
            b8Var.draw(canvas);
            return;
        }
        canvas.save();
        float f16 = this.w;
        canvas.scale(f16, f16, measuredWidth, measuredHeight);
        b8Var.draw(canvas);
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(mr.f).start();
        }
    }

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z4, boolean z10) {
        boolean z11;
        TextView textView;
        int i10;
        this.f = str;
        this.D = MessageObject.isPremiumSticker(document);
        this.I = false;
        b8 b8Var = this.a;
        b8Var.setColorFilter(null);
        this.H = 0;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false)));
        if (z10) {
            c(false);
        } else {
            a(false);
        }
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
            eg.s1 s1Var = this.b;
            s1Var.setColor(w02);
            s1Var.E = true;
            s1Var.F = false;
            s1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                textView = textView2;
                i10 = 4;
                z11 = true;
                b8Var.setImage(ImageLocation.getForPath(importingSticker.path), "80_80", null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            } else {
                textView = textView2;
                i10 = 4;
                z11 = true;
                b8Var.setImage(null, null, null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
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
                int i11 = z12 ? org.telegram.ui.ActionBar.j6.c7 : org.telegram.ui.ActionBar.j6.a7;
                float f10 = z12 ? 0.2f : 1.0f;
                org.telegram.ui.ActionBar.f6 f6Var = this.J;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i11, f10, 1.0f, f6Var);
                String str2 = z12 ? "66_66_pcache_compress" : "66_66";
                if (MessageObject.isTextColorEmoji(document)) {
                    b8Var.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z12) {
                        this.I = true;
                    }
                    if (svgThumb != null) {
                        b8Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        b8Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.e, 1);
                    } else {
                        b8Var.setImage(ImageLocation.getForDocument(document), str2, null, null, this.e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        b8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, svgThumb, "webp", this.e, 1);
                    } else {
                        b8Var.setImage(ImageLocation.getForDocument(document), str2, svgThumb, "webp", this.e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    b8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, null, "webp", this.e, 1);
                } else {
                    b8Var.setImage(ImageLocation.getForDocument(document), str2, null, "webp", this.e, 1);
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
        b8Var.setAlpha(this.n * this.E);
        if (!this.I) {
            b8Var.setParentView(this);
        } else {
            b8Var.setInvalidateAll(z11);
            b8Var.setParentView((View) getParent());
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
        eg.s1 s1Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s1Var.getLayoutParams();
        if (UserConfig.getInstance(this.B).isPremium()) {
            int dp = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            s1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        } else {
            int dp2 = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            s1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        s1Var.setLocked(!UserConfig.getInstance(r4).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(s1Var, this.F, 0.9f, z4);
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
        b8 b8Var = this.a;
        if (!b8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        getLocationInWindow(new int[2]);
        sendAnimationData.x = b8Var.getCenterX() + r2[0];
        sendAnimationData.y = b8Var.getCenterY() + r2[1];
        sendAnimationData.width = b8Var.getImageWidth();
        sendAnimationData.height = b8Var.getImageHeight();
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
        b8 b8Var = this.a;
        if (z4) {
            b8Var.setInvalidateAll(true);
            b8Var.setParentView((View) getParent());
        } else {
            b8Var.setParentView(this);
        }
        b8Var.onAttachedToWindow();
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
