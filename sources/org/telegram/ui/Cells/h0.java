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
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class h0 extends View {
    public final ImageReceiver B;
    public boolean C;
    public boolean D;
    public final int E;
    public boolean F;
    public final z G;
    public int H;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public f90 r;
    public final b90 s;
    public f0 v;
    public final int w;
    public final org.telegram.ui.ActionBar.f6 x;
    public int y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.s = new b90(this);
        this.E = AndroidUtilities.dp(4.0f);
        this.w = i10;
        this.x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.B = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.H = i11;
        z Y = org.telegram.ui.ActionBar.j6.Y(v02, i11, i11);
        this.G = Y;
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
    public final void b(boolean z4, long j10, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        char c3;
        float f10;
        float f11;
        int min;
        boolean z10;
        boolean z11 = tLObject != null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z11) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.b) && TextUtils.equals(this.c, str2) && this.C == z11) {
            return;
        }
        boolean z12 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j10 != 0;
        boolean z13 = z11 || z12;
        this.C = z13;
        this.D = !isEmpty || z12;
        ImageReceiver imageReceiver = this.B;
        if (z12) {
            if (!Objects.equals(this.d, "setup")) {
                this.d = "setup";
                imageReceiver.setImageBitmap(new cq(new g0(getContext())));
                int dp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
                int dp2 = AndroidUtilities.dp(4.0f);
                if (!this.D) {
                    dp2 = dp;
                }
                imageReceiver.setRoundRadius(dp, dp, dp2, dp2);
            }
        } else if (z13) {
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
                        int i10 = 0;
                        c3 = 1;
                        while (i10 < size) {
                            TLRPC.PhotoSize photoSize = arrayList.get(i10);
                            i10++;
                            TLRPC.PhotoSize photoSize2 = photoSize;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable = new BitmapDrawable(getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize2.bytes, "b"));
                            }
                        }
                    } else {
                        c3 = 1;
                    }
                    f10 = 2.0f;
                    f11 = 4.0f;
                    imageReceiver.setImage(ImageLocation.getForDocument(document), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForDocument(MessageObject.getDocumentVideoThumb(document), document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                    int dp3 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f10);
                    int dp4 = AndroidUtilities.dp(f11);
                    if (!this.D) {
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
                    int i11 = (int) (min * 0.7f);
                    if (this.D) {
                        String[] split = str3.split("\n");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (z12) {
                            int i12 = R.string.ManagedBotChatInfo;
                            Object[] objArr = new Object[2];
                            objArr[0] = DialogObject.getName(this.w, j10);
                            objArr[c3] = str2;
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i12, objArr)));
                            z10 = false;
                        } else {
                            String string = LocaleController.getString(R.string.BotInfoTitle);
                            if (z4) {
                                spannableStringBuilder.append((CharSequence) string);
                                spannableStringBuilder.append((CharSequence) "\n\n");
                            }
                            for (int i13 = 0; i13 < split.length; i13++) {
                                spannableStringBuilder.append((CharSequence) split[i13].trim());
                                if (i13 != split.length - 1) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                }
                            }
                            z10 = false;
                            MessageObject.addLinks(false, spannableStringBuilder);
                            if (z4) {
                                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, string.length(), 33);
                            }
                        }
                        Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), z10);
                        try {
                            StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.j6.o2, i11 - (this.C ? AndroidUtilities.dp(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.a = staticLayout;
                            this.e = 0;
                            this.f = staticLayout.getHeight() + AndroidUtilities.dp(22.0f);
                            int lineCount = this.a.getLineCount();
                            for (int i14 = 0; i14 < lineCount; i14++) {
                                this.e = (int) Math.ceil(Math.max(this.e, this.a.getLineWidth(i14) + this.a.getLineLeft(i14)));
                            }
                            if (this.e > i11 || this.C) {
                                this.e = i11;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    } else if (this.C) {
                        this.e = i11;
                    }
                    int dp5 = AndroidUtilities.dp(22.0f) + this.e;
                    this.e = dp5;
                    if (this.C) {
                        int i15 = this.f;
                        int i16 = (int) (dp5 * 0.5625d);
                        this.y = i16;
                        this.f = org.telegram.messenger.y3.C(4.0f, i16, i15);
                        return;
                    }
                    return;
                }
                f10 = 2.0f;
                c3 = 1;
                f11 = 4.0f;
                int dp32 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f10);
                int dp42 = AndroidUtilities.dp(f11);
                if (!this.D) {
                }
                imageReceiver.setRoundRadius(dp32, dp32, dp42, dp42);
                this.b = AndroidUtilities.getSafeString(str3);
                this.c = str2;
                setVisibility(0);
                if (AndroidUtilities.isTablet()) {
                }
                int i112 = (int) (min * 0.7f);
                if (this.D) {
                }
                int dp52 = AndroidUtilities.dp(22.0f) + this.e;
                this.e = dp52;
                if (this.C) {
                }
            }
        }
        c3 = 1;
        this.b = AndroidUtilities.getSafeString(str3);
        this.c = str2;
        setVisibility(0);
        if (AndroidUtilities.isTablet()) {
        }
        int i1122 = (int) (min * 0.7f);
        if (this.D) {
        }
        int dp522 = AndroidUtilities.dp(22.0f) + this.e;
        this.e = dp522;
        if (this.C) {
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
        this.B.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.y;
        Drawable j10 = org.telegram.ui.ActionBar.j6.q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.e + width, this.f + dp);
            j10.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x;
        int i11 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i10 = view.getMeasuredWidth();
            i11 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.j6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) drawable;
        g5Var.n((int) getY(), i10, i11);
        g5Var.setBounds(width, 0, this.e + width, this.f);
        g5Var.draw(canvas);
        z zVar = this.G;
        if (zVar != null) {
            int i12 = this.H;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.H = i13;
                org.telegram.ui.ActionBar.j6.A1(zVar, i13, i13);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.e + width) - AndroidUtilities.dp(2.0f), this.f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i14 = this.E;
        float f10 = width + i14;
        float f11 = i14;
        float f12 = this.e - (i14 * 2);
        float f13 = this.y - i14;
        ImageReceiver imageReceiver = this.B;
        imageReceiver.setImageCoords(f10, f11, f12, f13);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.j6.o2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ec, f6Var));
        org.telegram.ui.ActionBar.j6.o2.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var);
        canvas.save();
        int dp2 = AndroidUtilities.dp(this.C ? 14.0f : 11.0f) + width;
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
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), AndroidUtilities.dp(8.0f) + this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        z zVar;
        boolean z10;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.a != null) {
            if (motionEvent.getAction() == 0 || (this.r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i10 = (int) (y10 - this.n);
                        int lineForVertical = this.a.getLineForVertical(i10);
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
                                this.r = new f90(clickableSpanArr[0], this.x, f10, i10, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        y80 b10 = this.r.b();
                                        b10.d(this.a, spanStart, 0.0f);
                                        this.a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), b10);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    this.s.a(this.r, null);
                                    invalidate();
                                    z4 = true;
                                } catch (Exception e6) {
                                    e = e6;
                                    z10 = true;
                                    a();
                                    FileLog.e(e);
                                    z4 = z10;
                                    zVar = this.G;
                                    if (zVar != null) {
                                    }
                                    if (z4) {
                                    }
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z10 = false;
                    }
                } else {
                    f90 f90Var = this.r;
                    if (f90Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) f90Var.i;
                            if (clickableSpan instanceof m51) {
                                String url = ((m51) clickableSpan).getURL();
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
                                    ((org.telegram.ui.a1) f0Var).k(url);
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                f0 f0Var2 = this.v;
                                if (f0Var2 != null) {
                                    ((org.telegram.ui.a1) f0Var2).k(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        a();
                        z4 = true;
                    }
                }
                zVar = this.G;
                if (zVar != null) {
                    if (!z4 && y10 > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                        zVar.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                        zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        invalidate();
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        zVar.setState(new int[0]);
                        invalidate();
                        if (!z4 && motionEvent.getAction() == 1) {
                            performClick();
                        }
                    }
                    z4 = true;
                }
                return !z4 || super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 3) {
                a();
            }
        }
        z4 = false;
        zVar = this.G;
        if (zVar != null) {
        }
        if (z4) {
            return true;
        }
    }

    public void setAnimating(boolean z4) {
        this.F = z4;
    }

    public void setDelegate(f0 f0Var) {
        this.v = f0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.G || super.verifyDrawable(drawable);
    }
}
