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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class f8 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pg.c {
    public static final AccelerateInterpolator N = new AccelerateInterpolator(0.5f);
    public final int E;
    public final boolean F;
    public boolean G;
    public final float H;
    public boolean I;
    public final ImageView J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final e8 a;
    public final sg.e1 b;
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

    public f8(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.n = 1.0f;
        this.E = UserConfig.selectedAccount;
        this.H = 1.0f;
        this.M = f6Var;
        this.F = z10;
        e8 e8Var = new e8(this, f6Var);
        this.a = e8Var;
        e8Var.setAspectFit(true);
        e8Var.setAllowLoadingOnAttachedOnly(true);
        e8Var.setLayerNum(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        sg.e1 e1Var = new sg.e1(context, 1, null);
        this.b = e1Var;
        e1Var.setImageReceiver(e8Var);
        e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        e1Var.setImageReceiver(e8Var);
        addView(e1Var, w7.x5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, f6Var)));
        imageView.setAlpha(0.0f);
        addView(imageView, w7.x5.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(pr.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, View view) {
        boolean z10;
        boolean z11 = this.r;
        float f7 = this.H;
        e8 e8Var = this.a;
        if (z11 || (((z10 = this.v) && this.w != 0.8f) || (!z10 && this.w != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.s;
            this.s = currentTimeMillis;
            if (this.r) {
                long j10 = this.x + j3;
                this.x = j10;
                if (j10 > 1050) {
                    this.x = 1050L;
                }
                float interpolation = (N.getInterpolation(this.x / 150.0f) * 0.5f) + 0.5f;
                this.n = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = false;
                    this.n = 1.0f;
                }
                e8Var.setAlpha(this.n * f7);
            } else {
                if (this.v) {
                    float f10 = this.w;
                    if (f10 != 0.8f) {
                        float f11 = f10 - (j3 / 400.0f);
                        this.w = f11;
                        if (f11 < 0.8f) {
                            this.w = 0.8f;
                        }
                    }
                }
                float f12 = (j3 / 400.0f) + this.w;
                this.w = f12;
                if (f12 > 1.0f) {
                    this.w = 1.0f;
                }
            }
            view.invalidate();
        }
        int min = Math.min(AndroidUtilities.dp(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f13 = min;
        float f14 = f13 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        e8Var.setImageCoords(measuredWidth - f14, measuredHeight - f14, f13, f13);
        e8Var.setAlpha(this.n * f7);
        if (this.w == 1.0f) {
            e8Var.draw(canvas);
            return;
        }
        canvas.save();
        float f15 = this.w;
        canvas.scale(f15, f15, measuredWidth, measuredHeight);
        e8Var.draw(canvas);
        canvas.restore();
    }

    public final void c(boolean z10) {
        ImageView imageView = this.J;
        if (!z10) {
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

    public final void d(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        TextView textView;
        int i10;
        this.f = str;
        this.G = MessageObject.isPremiumSticker(document);
        this.L = false;
        e8 e8Var = this.a;
        e8Var.setColorFilter(null);
        this.K = 0;
        this.J.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q5, false)));
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.G) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
            sg.e1 e1Var = this.b;
            e1Var.setColor(w02);
            e1Var.H = true;
            e1Var.I = false;
            e1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (importingSticker != null) {
            this.d = importingSticker;
            if (importingSticker.validated) {
                textView = textView2;
                i10 = 4;
                z12 = true;
                e8Var.setImage(ImageLocation.getForPath(importingSticker.path), "80_80", null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            } else {
                textView = textView2;
                i10 = 4;
                z12 = true;
                e8Var.setImage(null, null, null, null, DocumentObject.getSvgRectThumb(org.telegram.ui.ActionBar.j6.i5, 1.0f), 0L, importingSticker.animated ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i10);
            }
        } else {
            z12 = true;
            if (document != null) {
                this.c = document;
                this.e = obj;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                boolean z13 = this.F;
                int i11 = z13 ? org.telegram.ui.ActionBar.j6.c7 : org.telegram.ui.ActionBar.j6.a7;
                float f7 = z13 ? 0.2f : 1.0f;
                org.telegram.ui.ActionBar.f6 f6Var = this.M;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, i11, f7, 1.0f, f6Var);
                String str2 = z13 ? "66_66_pcache_compress" : "66_66";
                if (MessageObject.isTextColorEmoji(document)) {
                    e8Var.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                }
                if (MessageObject.canAutoplayAnimatedSticker(document)) {
                    if (z13) {
                        this.L = true;
                    }
                    if (svgThumb != null) {
                        e8Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, null, svgThumb, 0L, null, this.e, 1);
                    } else if (closestPhotoSizeWithSize != null) {
                        e8Var.setImage(ImageLocation.getForDocument(document), str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, (String) null, this.e, 1);
                    } else {
                        e8Var.setImage(ImageLocation.getForDocument(document), str2, null, null, this.e, 1);
                    }
                } else if (svgThumb != null) {
                    if (closestPhotoSizeWithSize != null) {
                        e8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, svgThumb, "webp", this.e, 1);
                    } else {
                        e8Var.setImage(ImageLocation.getForDocument(document), str2, svgThumb, "webp", this.e, 1);
                    }
                } else if (closestPhotoSizeWithSize != null) {
                    e8Var.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str2, null, "webp", this.e, 1);
                } else {
                    e8Var.setImage(ImageLocation.getForDocument(document), str2, null, "webp", this.e, 1);
                }
                if (str != null) {
                    textView2.setText(Emoji.replaceEmoji(str, textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else if (z10) {
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
                    textView2.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.E).getEmojiForSticker(this.c.id), textView2.getPaint().getFontMetricsInt(), false));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
            }
        }
        e(false);
        e8Var.setAlpha(this.n * this.H);
        if (!this.L) {
            e8Var.setParentView(this);
        } else {
            e8Var.setInvalidateAll(z12);
            e8Var.setParentView((View) getParent());
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
        if (!this.L) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.G) {
            this.I = true;
        } else {
            this.I = false;
        }
        sg.e1 e1Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
        if (UserConfig.getInstance(this.E).isPremium()) {
            int dp = AndroidUtilities.dp(16.0f);
            layoutParams.width = dp;
            layoutParams.height = dp;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            e1Var.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        } else {
            int dp2 = AndroidUtilities.dp(24.0f);
            layoutParams.width = dp2;
            layoutParams.height = dp2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
            e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        e1Var.setLocked(!UserConfig.getInstance(r4).isPremium());
        AndroidUtilities.updateViewVisibilityAnimated(e1Var, this.I, 0.9f, z10);
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
        e8 e8Var = this.a;
        if (!e8Var.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        getLocationInWindow(new int[2]);
        sendAnimationData.x = e8Var.getCenterX() + r2[0];
        sendAnimationData.y = e8Var.getCenterY() + r2[1];
        sendAnimationData.width = e8Var.getImageWidth();
        sendAnimationData.height = e8Var.getImageHeight();
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
        if (this.L && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.L;
        e8 e8Var = this.a;
        if (z10) {
            e8Var.setInvalidateAll(true);
            e8Var.setParentView((View) getParent());
        } else {
            e8Var.setParentView(this);
        }
        e8Var.onAttachedToWindow();
        NotificationCenter.getInstance(this.E).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
                        string = a4.a.q(documentAttribute.alt, " ", string, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(string);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.y = z10;
    }

    public void setScaled(boolean z10) {
        this.v = z10;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        String str = importingSticker.emoji;
        d(null, importingSticker, null, str, str != null, false);
    }
}
