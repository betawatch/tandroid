package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class h0 extends View {
    public final ImageReceiver A;
    public boolean B;
    public boolean C;
    public final int D;
    public boolean E;
    public final z F;
    public int G;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public m80 r;
    public final i80 s;
    public f0 v;
    public final int w;
    public final org.telegram.ui.ActionBar.b6 x;
    public int y;

    public h0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.s = new i80(this);
        this.D = AndroidUtilities.dp(4.0f);
        this.w = i9;
        this.x = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var);
        int i10 = SharedConfig.bubbleRadius;
        this.G = i10;
        z Y = org.telegram.ui.ActionBar.f6.Y(v02, i10, i10);
        this.F = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.r != null) {
            this.r = null;
        }
        this.s.d(true);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10, long j10, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        char c10;
        float f10;
        float f11;
        int min;
        boolean z11;
        boolean z12 = tLObject != null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z12) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.b) && TextUtils.equals(this.c, str2) && this.B == z12) {
            return;
        }
        boolean z13 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j10 != 0;
        boolean z14 = z12 || z13;
        this.B = z14;
        this.C = !isEmpty || z13;
        ImageReceiver imageReceiver = this.A;
        if (z13) {
            if (!Objects.equals(this.d, "setup")) {
                this.d = "setup";
                imageReceiver.setImageBitmap(new up(new g0(getContext())));
                int dp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
                int dp2 = AndroidUtilities.dp(4.0f);
                if (!this.C) {
                    dp2 = dp;
                }
                imageReceiver.setRoundRadius(dp, dp, dp2, dp2);
            }
        } else if (z14) {
            String keyForParentObject = FileRefController.getKeyForParentObject(botInfo);
            if (!Objects.equals(this.d, keyForParentObject)) {
                this.d = keyForParentObject;
                if (tLObject instanceof TLRPC.TL_photo) {
                    TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                    imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 400), photo), "400_400", null, "jpg", botInfo, 0);
                } else if (tLObject instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) tLObject;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 400);
                    BitmapDrawable bitmapDrawable = null;
                    if (SharedConfig.getDevicePerformanceClass() != 0) {
                        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                        int size = arrayList.size();
                        int i9 = 0;
                        c10 = 1;
                        while (i9 < size) {
                            TLRPC.PhotoSize photoSize = arrayList.get(i9);
                            i9++;
                            TLRPC.PhotoSize photoSize2 = photoSize;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable = new BitmapDrawable(getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize2.bytes, "b"));
                            }
                        }
                    } else {
                        c10 = 1;
                    }
                    f10 = 2.0f;
                    f11 = 4.0f;
                    imageReceiver.setImage(ImageLocation.getForDocument(document), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForDocument(MessageObject.getDocumentVideoThumb(document), document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                    int dp3 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f10);
                    int dp4 = AndroidUtilities.dp(f11);
                    if (!this.C) {
                        dp4 = dp3;
                    }
                    imageReceiver.setRoundRadius(dp3, dp3, dp4, dp4);
                    this.b = AndroidUtilities.getSafeString(str3);
                    this.c = str2;
                    setVisibility(0);
                    if (AndroidUtilities.isTablet()) {
                        min = AndroidUtilities.getMinTabletSide();
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.min(point.x, point.y);
                    }
                    int i10 = (int) (min * 0.7f);
                    if (this.C) {
                        String[] split = str3.split("\n");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (z13) {
                            int i11 = R.string.ManagedBotChatInfo;
                            Object[] objArr = new Object[2];
                            objArr[0] = DialogObject.getName(this.w, j10);
                            objArr[c10] = str2;
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i11, objArr)));
                            z11 = false;
                        } else {
                            String string = LocaleController.getString(R.string.BotInfoTitle);
                            if (z10) {
                                spannableStringBuilder.append((CharSequence) string);
                                spannableStringBuilder.append((CharSequence) "\n\n");
                            }
                            for (int i12 = 0; i12 < split.length; i12++) {
                                spannableStringBuilder.append((CharSequence) split[i12].trim());
                                if (i12 != split.length - 1) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                }
                            }
                            z11 = false;
                            MessageObject.addLinks(false, spannableStringBuilder);
                            if (z10) {
                                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, string.length(), 33);
                            }
                        }
                        Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt(), z11);
                        try {
                            StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.f6.o2, i10 - (this.B ? AndroidUtilities.dp(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.a = staticLayout;
                            this.e = 0;
                            this.f = staticLayout.getHeight() + AndroidUtilities.dp(22.0f);
                            int lineCount = this.a.getLineCount();
                            for (int i13 = 0; i13 < lineCount; i13++) {
                                this.e = (int) Math.ceil(Math.max(this.e, this.a.getLineWidth(i13) + this.a.getLineLeft(i13)));
                            }
                            if (this.e > i10 || this.B) {
                                this.e = i10;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    } else if (this.B) {
                        this.e = i10;
                    }
                    int dp5 = AndroidUtilities.dp(22.0f) + this.e;
                    this.e = dp5;
                    if (this.B) {
                        int i14 = this.f;
                        int i15 = (int) (dp5 * 0.5625d);
                        this.y = i15;
                        this.f = org.telegram.messenger.l0.C(4.0f, i15, i14);
                        return;
                    }
                    return;
                }
                f10 = 2.0f;
                c10 = 1;
                f11 = 4.0f;
                int dp32 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f10);
                int dp42 = AndroidUtilities.dp(f11);
                if (!this.C) {
                }
                imageReceiver.setRoundRadius(dp32, dp32, dp42, dp42);
                this.b = AndroidUtilities.getSafeString(str3);
                this.c = str2;
                setVisibility(0);
                if (AndroidUtilities.isTablet()) {
                }
                int i102 = (int) (min * 0.7f);
                if (this.C) {
                }
                int dp52 = AndroidUtilities.dp(22.0f) + this.e;
                this.e = dp52;
                if (this.B) {
                }
            }
        }
        c10 = 1;
        this.b = AndroidUtilities.getSafeString(str3);
        this.c = str2;
        setVisibility(0);
        if (AndroidUtilities.isTablet()) {
        }
        int i1022 = (int) (min * 0.7f);
        if (this.C) {
        }
        int dp522 = AndroidUtilities.dp(22.0f) + this.e;
        this.e = dp522;
        if (this.B) {
        }
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.y;
        Drawable j10 = org.telegram.ui.ActionBar.f6.q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.e + width, this.f + dp);
            j10.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int i9 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i9 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.x;
        Drawable drawable = b6Var != null ? b6Var.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.f6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) drawable;
        d5Var.n((int) getY(), i9, i10);
        d5Var.setBounds(width, 0, this.e + width, this.f);
        d5Var.draw(canvas);
        z zVar = this.F;
        if (zVar != null) {
            int i11 = this.G;
            int i12 = SharedConfig.bubbleRadius;
            if (i11 != i12) {
                this.G = i12;
                org.telegram.ui.ActionBar.f6.A1(zVar, i12, i12);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.e + width) - AndroidUtilities.dp(2.0f), this.f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i13 = this.D;
        float f10 = width + i13;
        float f11 = i13;
        float f12 = this.e - (i13 * 2);
        float f13 = this.y - i13;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setImageCoords(f10, f11, f12, f13);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.f6.o2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ec, b6Var));
        org.telegram.ui.ActionBar.f6.o2.linkColor = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var);
        canvas.save();
        int dp2 = AndroidUtilities.dp(this.B ? 14.0f : 11.0f) + width;
        this.h = dp2;
        float f14 = dp2;
        int dp3 = AndroidUtilities.dp(11.0f) + dp;
        this.n = dp3;
        canvas.translate(f14, dp3);
        if (this.s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), AndroidUtilities.dp(8.0f) + this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        z zVar;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.a != null) {
            if (motionEvent.getAction() == 0 || (this.r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i9 = (int) (y10 - this.n);
                        int lineForVertical = this.a.getLineForVertical(i9);
                        float f10 = (int) (x10 - this.h);
                        int offsetForHorizontal = this.a.getOffsetForHorizontal(lineForVertical, f10);
                        float lineLeft = this.a.getLineLeft(lineForVertical);
                        if (lineLeft > f10 || lineLeft + this.a.getLineWidth(lineForVertical) < f10) {
                            a();
                        } else {
                            Spannable spannable = (Spannable) this.a.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                a();
                                this.r = new m80(clickableSpanArr[0], this.x, f10, i9, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        f80 b10 = this.r.b();
                                        b10.d(this.a, spanStart, 0.0f);
                                        this.a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), b10);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    this.s.a(this.r, null);
                                    invalidate();
                                    z10 = true;
                                } catch (Exception e11) {
                                    e = e11;
                                    z11 = true;
                                    a();
                                    FileLog.e(e);
                                    z10 = z11;
                                    zVar = this.F;
                                    if (zVar != null) {
                                    }
                                    if (z10) {
                                    }
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z11 = false;
                    }
                } else {
                    m80 m80Var = this.r;
                    if (m80Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) m80Var.i;
                            if (clickableSpan instanceof p41) {
                                String url = ((p41) clickableSpan).getURL();
                                if (!url.startsWith("@")) {
                                    if (!url.startsWith("#")) {
                                        if (!url.startsWith("/")) {
                                            if (url.startsWith("$")) {
                                            }
                                        }
                                    }
                                }
                                f0 f0Var = this.v;
                                if (f0Var != null) {
                                    ((org.telegram.ui.b1) f0Var).k(url);
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                f0 f0Var2 = this.v;
                                if (f0Var2 != null) {
                                    ((org.telegram.ui.b1) f0Var2).k(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e13) {
                            FileLog.e(e13);
                        }
                        a();
                        z10 = true;
                    }
                }
                zVar = this.F;
                if (zVar != null) {
                    if (!z10 && y10 > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                        zVar.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                        zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        invalidate();
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        zVar.setState(new int[0]);
                        invalidate();
                        if (!z10 && motionEvent.getAction() == 1) {
                            performClick();
                        }
                    }
                    z10 = true;
                }
                return !z10 || super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 3) {
                a();
            }
        }
        z10 = false;
        zVar = this.F;
        if (zVar != null) {
        }
        if (z10) {
            return true;
        }
    }

    public void setAnimating(boolean z10) {
        this.E = z10;
    }

    public void setDelegate(f0 f0Var) {
        this.v = f0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }
}
