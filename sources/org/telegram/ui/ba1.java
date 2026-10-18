package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ba1 implements oh0 {
    public final sn A;
    public final LinearGradient B;
    public final float C;
    public final AnimationNotificationsLocker D;
    public final MessageObject.TextLayoutBlock E;
    public final NinePatchDrawable F;
    public final hk G;
    public final org.telegram.ui.Components.w5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.d6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
    public float a;
    public final Paint b;
    public final boolean c;
    public final ValueAnimator d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final MessageObject k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final StaticLayout p;
    public final StaticLayout q;
    public final org.telegram.ui.Cells.u1 r;
    public final org.telegram.ui.Components.im0 s;
    public final org.telegram.ui.Components.si t;
    public final Matrix u;
    public final Paint v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    /* JADX WARN: Removed duplicated region for block: B:112:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ba1(org.telegram.ui.Cells.u1 u1Var, sn snVar, org.telegram.ui.Components.im0 im0Var, org.telegram.ui.Components.si siVar, org.telegram.ui.ActionBar.d6 d6Var) {
        float f7;
        boolean z10;
        int[] iArr;
        int i10;
        int lineCount;
        int i11;
        float f10;
        StaticLayout staticLayout;
        double h;
        int i12;
        float f11;
        int i13;
        int i14;
        boolean z11;
        StaticLayout staticLayout2;
        org.telegram.ui.ActionBar.f5 y22;
        int i15;
        Paint paint = new Paint(1);
        this.b = paint;
        this.D = new AnimationNotificationsLocker();
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = d6Var;
        if (u1Var.getMessageObject().textLayoutBlocks == null || u1Var.getMessageObject().textLayoutBlocks.size() > 1 || u1Var.getMessageObject().textLayoutBlocks.isEmpty() || u1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.r = u1Var;
        this.s = im0Var;
        this.t = siVar;
        this.A = snVar;
        hk hkVar = snVar.Y;
        this.G = hkVar;
        if (hkVar == null || hkVar.getEditField() == null || hkVar.getEditField().getLayout() == null) {
            return;
        }
        hkVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = u1Var.getMessageObject();
        if (!u1Var.getTransitionParams().v0) {
            u1Var.draw(new Canvas());
        }
        u1Var.setEnterTransitionInProgress(true);
        Editable editText = hkVar.getEditText();
        CharSequence charSequence = u1Var.getMessageObject().messageText;
        this.n = false;
        hkVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.h6.o2;
        AndroidUtilities.dp(20.0f);
        if (u1Var.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z12 = u1Var.getMessageObject().emojiOnlyCount == u1Var.getMessageObject().animatedEmojiCount;
            switch (Math.max(u1Var.getMessageObject().emojiOnlyCount, u1Var.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[2];
                        break;
                    }
                case 3:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[3];
                        break;
                    }
                case 4:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[4];
                        break;
                    }
                case 5:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[5];
                        break;
                    }
                case 6:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.h6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.h6.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                AndroidUtilities.dp(4.0f);
            }
        }
        if (charSequence instanceof Spannable) {
            f7 = 4.0f;
            Object[] spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class);
            if (spans != null && spans.length > 0) {
                z10 = true;
                if (editText.length() == charSequence.length() || z10) {
                    this.n = true;
                    iArr = new int[1];
                    CharSequence trim = AndroidUtilities.trim(editText, iArr);
                    if (iArr[0] <= 0) {
                        i10 = hkVar.getEditField().getLayout().getLineTop(hkVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        hkVar.getEditField().getLayout().getLineBottom(hkVar.getEditField().getLayout().getLineForOffset(trim.length() + iArr[0]));
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.a6.cloneSpans(charSequence);
                    charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
                } else {
                    i10 = 0;
                }
                float textSize = hkVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                lineCount = hkVar.getEditField().getLayout().getLineCount();
                int width = (int) (hkVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT < 24) {
                    this.p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.a6.update(2, (View) null, this.H, this.p);
                ih.j.b(hkVar.getEditField(), snVar.X0, pointF);
                float f12 = pointF.y;
                this.y = pointF.x;
                this.z = ((AndroidUtilities.dp(10.0f) + f12) - hkVar.getEditField().getScrollY()) + i10;
                float f13 = 0.0f;
                this.l = 0.0f;
                f10 = Float.MAX_VALUE;
                float f14 = Float.MAX_VALUE;
                for (i11 = 0; i11 < this.p.getLineCount(); i11++) {
                    float lineLeft = this.p.getLineLeft(i11);
                    if (lineLeft < f10) {
                        f10 = lineLeft;
                    }
                }
                if (f10 != Float.MAX_VALUE) {
                    this.l = f10;
                }
                this.p.getHeight();
                float dp = AndroidUtilities.dp(f7) + f12;
                this.j = dp;
                if (this.G.x0()) {
                    this.j = dp - AndroidUtilities.dp(12.0f);
                }
                this.x = f12 + hkVar.getEditField().getMeasuredHeight();
                MessageObject.TextLayoutBlock textLayoutBlock = u1Var.getMessageObject().textLayoutBlocks.get(0);
                this.E = textLayoutBlock;
                staticLayout = textLayoutBlock.textLayout;
                int i16 = org.telegram.ui.ActionBar.h6.fc;
                h = i0.a.h(org.telegram.ui.ActionBar.h6.w0(i16, this.N));
                i12 = org.telegram.ui.ActionBar.h6.Ud;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.h6.w0(i12, this.N))) > 0.20000000298023224d) {
                    this.n = true;
                    this.o = true;
                }
                this.L = org.telegram.ui.ActionBar.h6.w0(i12, this.N);
                this.M = org.telegram.ui.ActionBar.h6.w0(i16, this.N);
                if (staticLayout.getLineCount() != this.p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i17 = 0;
                    i13 = 0;
                    i14 = 0;
                    while (true) {
                        if (i17 < lineCount) {
                            StaticLayout staticLayout3 = this.p;
                            f11 = f13;
                            if (staticLayout3.getLineRight(i17) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i17) == f11) {
                                i13++;
                            } else {
                                i14++;
                            }
                            if (staticLayout.getLineEnd(i17) != this.p.getLineEnd(i17)) {
                                this.n = true;
                            } else {
                                i17++;
                                f13 = f11;
                            }
                        } else {
                            f11 = f13;
                        }
                    }
                } else {
                    f11 = 0.0f;
                    this.n = true;
                    i13 = 0;
                    i14 = 0;
                }
                if (!this.n && i14 > 0 && i13 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    for (i15 = 0; i15 < lineCount; i15++) {
                        StaticLayout staticLayout4 = this.p;
                        if (staticLayout4.getLineRight(i15) != staticLayout4.getWidth() || staticLayout4.getLineLeft(i15) == f11) {
                            spannableString2.setSpan(new org.telegram.ui.Components.uz(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                        } else {
                            spannableString.setSpan(new org.telegram.ui.Components.uz(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                            float lineLeft2 = this.p.getLineLeft(i15);
                            if (lineLeft2 < f14) {
                                f14 = lineLeft2;
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.p = hyphenationFrequency.setAlignment(alignment).build();
                        this.q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.m = this.p.getWidth() - u1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
                z11 = u1Var.getMessageObject().getReplyMsgId() == 0 && u1Var.C9 != null;
                this.c = z11;
                if (z11) {
                    org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.ap[]) snVar.a0.b)[0].c;
                    ih.j.b(j5Var, snVar.X0, this.O);
                    PointF pointF2 = this.O;
                    this.e = pointF2.x;
                    this.g = pointF2.y;
                    this.f = ((View) j5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.j5 j5Var2 = ((org.telegram.ui.Components.ap[]) snVar.a0.b)[0].d;
                    ih.j.b(j5Var2, snVar.X0, this.O);
                    float f15 = this.O.y;
                    this.h = j5Var.getTextColor();
                    this.i = j5Var2.getTextColor();
                    this.j -= AndroidUtilities.dp(46.0f);
                }
                this.S = im0Var.getPaddingBottom() - (snVar.sc - AndroidUtilities.dp(44.0f));
                this.u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.w = u1Var.getMessageObject().stableId;
                float f16 = f11;
                hkVar.getEditField().setAlpha(f16);
                hkVar.setTextTransitionIsRunning(true);
                staticLayout2 = u1Var.C9;
                if (staticLayout2 != null && staticLayout2.getText().length() > 1 && u1Var.C9.getPrimaryHorizontal(0) != f16) {
                    this.K = u1Var.C9.getWidth() - u1Var.C9.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new kw0(this, hkVar, siVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) siVar.c).add(this);
                siVar.a();
                ((ViewGroup) siVar.d).invalidate();
                this.D.lock();
                ofFloat.addListener(new org.telegram.ui.Components.b30(this, siVar, u1Var, hkVar, snVar));
                if (SharedConfig.getDevicePerformanceClass() == 2 || (y22 = u1Var.y2(true)) == null) {
                }
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, this.N);
                Rect rect = y22.o;
                if (y22.F == null) {
                    Bitmap createBitmap = Bitmap.createBitmap(y22.b(50.0f), y22.b(40.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rect.set(y22.getBounds());
                    Paint paint3 = new Paint(1);
                    paint3.setColor(-1);
                    y22.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    y22.c(canvas, paint3);
                    y22.F = new NinePatchDrawable(createBitmap, v7.v7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                    y22.setBounds(rect);
                }
                if (y22.G != w02) {
                    y22.G = w02;
                    y22.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                this.F = y22.F;
                return;
            }
        } else {
            f7 = 4.0f;
        }
        z10 = false;
        if (editText.length() == charSequence.length()) {
        }
        this.n = true;
        iArr = new int[1];
        CharSequence trim2 = AndroidUtilities.trim(editText, iArr);
        if (iArr[0] <= 0) {
        }
        org.telegram.ui.Components.a6.cloneSpans(charSequence);
        charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        float textSize2 = hkVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize2;
        lineCount = hkVar.getEditField().getLayout().getLineCount();
        int width2 = (int) (hkVar.getEditField().getLayout().getWidth() / textSize2);
        if (Build.VERSION.SDK_INT < 24) {
        }
        this.H = org.telegram.ui.Components.a6.update(2, (View) null, this.H, this.p);
        ih.j.b(hkVar.getEditField(), snVar.X0, pointF);
        float f122 = pointF.y;
        this.y = pointF.x;
        this.z = ((AndroidUtilities.dp(10.0f) + f122) - hkVar.getEditField().getScrollY()) + i10;
        float f132 = 0.0f;
        this.l = 0.0f;
        f10 = Float.MAX_VALUE;
        float f142 = Float.MAX_VALUE;
        while (i11 < this.p.getLineCount()) {
        }
        if (f10 != Float.MAX_VALUE) {
        }
        this.p.getHeight();
        float dp2 = AndroidUtilities.dp(f7) + f122;
        this.j = dp2;
        if (this.G.x0()) {
        }
        this.x = f122 + hkVar.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock2 = u1Var.getMessageObject().textLayoutBlocks.get(0);
        this.E = textLayoutBlock2;
        staticLayout = textLayoutBlock2.textLayout;
        int i162 = org.telegram.ui.ActionBar.h6.fc;
        h = i0.a.h(org.telegram.ui.ActionBar.h6.w0(i162, this.N));
        i12 = org.telegram.ui.ActionBar.h6.Ud;
        if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.h6.w0(i12, this.N))) > 0.20000000298023224d) {
        }
        this.L = org.telegram.ui.ActionBar.h6.w0(i12, this.N);
        this.M = org.telegram.ui.ActionBar.h6.w0(i162, this.N);
        if (staticLayout.getLineCount() != this.p.getLineCount()) {
        }
        if (!this.n) {
            SpannableString spannableString3 = new SpannableString(charSequence);
            SpannableString spannableString22 = new SpannableString(charSequence);
            while (i15 < lineCount) {
            }
            if (Build.VERSION.SDK_INT < 24) {
            }
        }
        this.m = this.p.getWidth() - u1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
        if (u1Var.getMessageObject().getReplyMsgId() == 0) {
        }
        this.c = z11;
        if (z11) {
        }
        this.S = im0Var.getPaddingBottom() - (snVar.sc - AndroidUtilities.dp(44.0f));
        this.u = new Matrix();
        Paint paint22 = new Paint(1);
        this.v = paint22;
        paint22.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient2;
        paint22.setShader(linearGradient2);
        this.w = u1Var.getMessageObject().stableId;
        float f162 = f11;
        hkVar.getEditField().setAlpha(f162);
        hkVar.setTextTransitionIsRunning(true);
        staticLayout2 = u1Var.C9;
        if (staticLayout2 != null) {
            this.K = u1Var.C9.getWidth() - u1Var.C9.getLineWidth(0);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat2;
        ofFloat2.addUpdateListener(new kw0(this, hkVar, siVar, 1));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(250L);
        ((ArrayList) siVar.c).add(this);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        this.D.lock();
        ofFloat2.addListener(new org.telegram.ui.Components.b30(this, siVar, u1Var, hkVar, snVar));
        if (SharedConfig.getDevicePerformanceClass() == 2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x03cf, code lost:
    
        if (android.text.TextUtils.isEmpty(r8.caption) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03e7, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r5.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x043b, code lost:
    
        if (android.text.TextUtils.isEmpty(r11.caption) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0453, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r5.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06da  */
    @Override // org.telegram.ui.oh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Canvas canvas2;
        float f18;
        sn snVar;
        ImageReceiver imageReceiver;
        float f19;
        float f20;
        float f21;
        MessageObject messageObject;
        float f22;
        int i11;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        sn snVar2;
        float f31;
        ba1 ba1Var;
        float f32;
        float f33;
        float f34;
        boolean z10;
        int i12;
        float f35;
        float f36;
        org.telegram.ui.Cells.u1 u1Var;
        boolean z11;
        float f37;
        float f38;
        float f39;
        float f40;
        MessageObject.TextLayoutBlock textLayoutBlock;
        org.telegram.ui.Cells.t1 t1Var;
        float f41;
        Canvas canvas3;
        float f42;
        float f43;
        int i13;
        float f44;
        ba1 ba1Var2;
        float f45;
        boolean z12;
        int w02;
        int i14;
        float f46;
        MessageObject messageObject2;
        int w03;
        float f47;
        float f48;
        float f49;
        float f50;
        float f51;
        float f52;
        RectF rectF;
        float f53;
        int i15;
        StaticLayout staticLayout;
        int i16;
        float f54;
        int i17;
        float f55;
        org.telegram.ui.Components.im0 im0Var = this.s;
        float y3 = im0Var.getY();
        org.telegram.ui.Components.si siVar = this.t;
        float y10 = (y3 - siVar.getY()) + im0Var.getMeasuredHeight();
        float x10 = this.y - siVar.getX();
        float y11 = this.z - siVar.getY();
        org.telegram.ui.Cells.u1 u1Var2 = this.r;
        int textX = u1Var2.getTextX();
        org.telegram.ui.Cells.t1 t1Var2 = u1Var2.Zc;
        ImageReceiver imageReceiver2 = u1Var2.F9;
        ArrayList arrayList = u1Var2.Ld;
        this.I = textX;
        this.J = u1Var2.getTextY();
        if (u1Var2.getMessageObject().stableId != this.w) {
            return;
        }
        float x11 = (im0Var.getX() + u1Var2.getX()) - siVar.getX();
        float top = ((im0Var.getTop() + (u1Var2.getPaddingTop() + u1Var2.getTop())) - siVar.getY()) - (this.S - im0Var.getPaddingBottom());
        float interpolation = li.m.V.getInterpolation(this.a);
        float f56 = this.a;
        float f57 = f56 > 0.4f ? 1.0f : f56 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.bs.g.getInterpolation(org.telegram.ui.Components.bs.h.getInterpolation(f56));
        float f58 = this.I + x11;
        float f59 = this.J + top;
        float f60 = f57;
        float f61 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y10 * interpolation2) + (siVar.getMeasuredHeight() * f61));
        boolean z13 = u1Var2.getBottom() - AndroidUtilities.dp(4.0f) > im0Var.getMeasuredHeight() && (((float) u1Var2.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && siVar.getMeasuredHeight() > 0;
        if (z13) {
            i10 = measuredHeight;
            f11 = interpolation2;
            f14 = interpolation;
            f15 = f59;
            f16 = f60;
            f17 = x11;
            f12 = f61;
            f13 = f58;
            f7 = top;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), siVar.getMeasuredWidth(), siVar.getMeasuredHeight(), 255, 31);
        } else {
            i10 = measuredHeight;
            f7 = top;
            f10 = 0.0f;
            f11 = interpolation2;
            f12 = f61;
            f13 = f58;
            f14 = interpolation;
            f15 = f59;
            f16 = f60;
            f17 = x11;
            canvas2 = canvas;
        }
        canvas2.save();
        float y12 = im0Var.getY();
        sn snVar3 = this.A;
        canvas2.clipRect(f10, ((snVar3.s9 + y12) - siVar.getY()) - AndroidUtilities.dp(3.0f), siVar.getMeasuredWidth(), siVar.getMeasuredHeight());
        canvas2.save();
        float f62 = f17;
        float f63 = this.l;
        float f64 = f13;
        float backgroundDrawableLeft = u1Var2.getBackgroundDrawableLeft() + f62 + ((x10 - (f64 - f63)) * f12);
        float f65 = f7;
        float backgroundDrawableTop = u1Var2.getBackgroundDrawableTop() + f65;
        float y13 = this.j - siVar.getY();
        float f66 = f14;
        float f67 = 1.0f - f66;
        float f68 = (backgroundDrawableTop * f66) + (y13 * f67);
        float b10 = org.telegram.messenger.kk.b(backgroundDrawableTop, u1Var2.getBackgroundDrawableBottom() - u1Var2.getBackgroundDrawableTop(), f66, (this.x - siVar.getY()) * f67);
        int dp = (int) ((AndroidUtilities.dp(4.0f) * f12) + u1Var2.getBackgroundDrawableRight() + f62);
        MessageObject messageObject3 = this.k;
        org.telegram.ui.ActionBar.f5 y22 = !messageObject3.isAnimatedEmojiStickers() ? u1Var2.y2(true) : null;
        if (y22 != null) {
            imageReceiver = imageReceiver2;
            u1Var2.setBackgroundTopY(siVar.getTop() - im0Var.getTop());
            Drawable j10 = y22.j();
            f18 = f62;
            f20 = f16;
            if (f20 != 1.0f) {
                f19 = f66;
                NinePatchDrawable ninePatchDrawable = this.F;
                messageObject = messageObject3;
                if (ninePatchDrawable != null) {
                    snVar = snVar3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) f68, dp, (int) b10);
                    ninePatchDrawable.draw(canvas2);
                } else {
                    snVar = snVar3;
                }
            } else {
                messageObject = messageObject3;
                snVar = snVar3;
                f19 = f66;
            }
            f21 = f11;
            if (j10 != null) {
                j10.setAlpha((int) (f21 * 255.0f));
                j10.setBounds((int) backgroundDrawableLeft, (int) f68, dp, (int) b10);
                j10.draw(canvas2);
                j10.setAlpha(255);
            }
            y22.setAlpha((int) (f20 * 255.0f));
            y22.setBounds((int) backgroundDrawableLeft, (int) f68, dp, (int) b10);
            y22.I = true;
            y22.draw(canvas2);
            y22.I = false;
            y22.setAlpha(255);
        } else {
            f18 = f62;
            snVar = snVar3;
            imageReceiver = imageReceiver2;
            f19 = f66;
            f20 = f16;
            f21 = f11;
            messageObject = messageObject3;
        }
        canvas2.restore();
        canvas2.save();
        if (y22 != null) {
            if (messageObject.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f68, dp - AndroidUtilities.dp(10.0f), b10 - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f68, dp - AndroidUtilities.dp(4.0f), b10 - AndroidUtilities.dp(4.0f));
            }
        }
        float x12 = (im0Var.getX() + u1Var2.getLeft()) - siVar.getX();
        float f69 = f15;
        float y14 = com.google.android.gms.internal.play_billing.k3.y(y11, f69, f67, f65);
        canvas2.translate(x12, y14);
        u1Var2.m2(f20, canvas2, false);
        u1Var2.W1(canvas2, f20);
        u1Var2.M1(canvas2, f20);
        u1Var2.I1(f20, canvas2, false);
        u1Var2.d2(canvas2, f20, null);
        u1Var2.N1(canvas2, f20);
        u1Var2.T1(canvas2, f20);
        canvas2.restore();
        if (this.c) {
            sn snVar4 = snVar;
            ((org.telegram.ui.Components.ap[]) snVar4.a0.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.ap[]) snVar4.a0.b)[0].d.setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), u1Var2.I9, f21);
            int dp2 = AndroidUtilities.dp(10.0f);
            float x13 = this.e - siVar.getX();
            float y15 = this.g - siVar.getY();
            f31 = backgroundDrawableLeft;
            float f70 = f18 + u1Var2.G9;
            float f71 = f20;
            float f72 = u1Var2.H9 + f65;
            if (u1Var2.ba == null) {
                u1Var2.ba = new org.telegram.ui.Components.pm0(u1Var2);
            }
            i11 = dp;
            u1Var2.ba.a(u1Var2.getMessageObject(), u1Var2.getCurrentUser(), u1Var2.getCurrentChat(), this.N, 0);
            boolean shouldDrawWithoutBackground = messageObject.shouldDrawWithoutBackground();
            org.telegram.ui.ActionBar.d6 d6Var = this.N;
            if (shouldDrawWithoutBackground) {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xc, d6Var);
                b(org.telegram.ui.ActionBar.h6.Vc);
            } else {
                org.telegram.ui.Components.pm0 pm0Var = u1Var2.ba;
                if (pm0Var != null) {
                    i14 = pm0Var.I.c;
                    if (!messageObject.shouldDrawWithoutBackground()) {
                        f46 = x13;
                        f24 = f68;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f23 = f69;
                        org.telegram.ui.Components.pm0 pm0Var2 = u1Var2.ba;
                        if (pm0Var2 != null) {
                            w03 = pm0Var2.I.c;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject4 = messageObject2.replyMessageObject;
                                if (messageObject4.type == 0 || !TextUtils.isEmpty(messageObject4.caption)) {
                                    TLRPC.MessageMedia messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.db, d6Var);
                                    }
                                }
                            }
                            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.eb, d6Var);
                        }
                    } else if (!messageObject.isOutOwner()) {
                        f46 = x13;
                        f24 = f68;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f23 = f69;
                        if (!messageObject2.isReplyToStory()) {
                            int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yc, d6Var);
                            if (!messageObject2.forceAvatar) {
                                if (messageObject2.hasValidReplyMessageObject()) {
                                    MessageObject messageObject5 = messageObject2.replyMessageObject;
                                    if (messageObject5.type != 0) {
                                    }
                                    if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!u1Var2.z9) {
                                    i16 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Zc, d6Var);
                                    f54 = 0.6f;
                                    w03 = i0.a.f(f54, i16, org.telegram.ui.ActionBar.h6.c(i16, i14));
                                }
                            }
                            i16 = w04;
                            f54 = 0.0f;
                            w03 = i0.a.f(f54, i16, org.telegram.ui.ActionBar.h6.c(i16, i14));
                        }
                        w03 = i14;
                    } else if (messageObject.isReplyToStory()) {
                        f46 = x13;
                        f24 = f68;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f23 = f69;
                        w03 = i14;
                    } else {
                        f46 = x13;
                        int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.db, d6Var);
                        messageObject2 = messageObject;
                        f23 = f69;
                        if (messageObject2.forceAvatar) {
                            f24 = f68;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject6 = messageObject2.replyMessageObject;
                                f24 = f68;
                                if (messageObject6.type != 0) {
                                }
                                if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            } else {
                                f24 = f68;
                            }
                            if (!u1Var2.z9) {
                                i17 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.eb, d6Var);
                                f55 = 0.6f;
                                f25 = y11;
                                w03 = i0.a.f(f55, i17, org.telegram.ui.ActionBar.h6.c(i17, i14));
                            }
                        }
                        i17 = w05;
                        f55 = 0.0f;
                        f25 = y11;
                        w03 = i0.a.f(f55, i17, org.telegram.ui.ActionBar.h6.c(i17, i14));
                    }
                    f26 = f67;
                    f29 = f19;
                    org.telegram.ui.ActionBar.h6.Z2.setColor(i0.a.f(f29, this.i, w03));
                    org.telegram.ui.ActionBar.h6.Y2.setColor(i0.a.f(f29, this.h, i14));
                    float dp3 = !u1Var2.P9 ? f46 - AndroidUtilities.dp(44.0f) : f46;
                    float lerp = AndroidUtilities.lerp(dp3, f70, f21);
                    float lerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f29) + y15, f72, f29);
                    if (this.R != null) {
                        this.R = new float[]{r12, r12, 0.0f, 0.0f, 0.0f, 0.0f, r12, r12};
                        f47 = 12.0f;
                        float dp4 = AndroidUtilities.dp(4.0f);
                        float[] fArr = this.R;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    } else {
                        f47 = 12.0f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp3, y15, this.f + dp3, AndroidUtilities.dp(35.0f) + y15);
                    rectF2.offset(0.0f, AndroidUtilities.dp(f47) * f29);
                    RectF rectF3 = u1Var2.Bc;
                    RectF rectF4 = this.Q;
                    rectF4.set(rectF3);
                    rectF4.offset(f18, y14);
                    RectF rectF5 = this.P;
                    AndroidUtilities.lerp(rectF2, rectF4, f21, rectF5);
                    MessageObject messageObject7 = messageObject2;
                    f27 = f63;
                    f28 = f64;
                    f33 = b10;
                    u1Var2.ba.d(canvas, rectF5, f71, u1Var2.z9, u1Var2.getMessageObject().shouldDrawWithoutBackground());
                    canvas2 = canvas;
                    u1Var2.ba.e(canvas2, rectF5, f71);
                    if (u1Var2.P9) {
                        f48 = f71;
                        f49 = 0.0f;
                    } else {
                        canvas2.save();
                        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(rectF5.height() - AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.Z2.getTextSize() + org.telegram.ui.ActionBar.h6.Y2.getTextSize() + AndroidUtilities.dp(u1Var2.z9 ? 3.0f : 7.0f)), f21);
                        float lerp4 = AndroidUtilities.lerp(lerp, rectF5.left + AndroidUtilities.dp(8.0f), f21);
                        float f73 = rectF5.top;
                        if (!u1Var2.z9 || (staticLayout = u1Var2.D9) == null) {
                            f48 = f71;
                        } else {
                            f48 = f71;
                            if (staticLayout.getLineCount() <= 1) {
                                i15 = 2;
                                float lerp5 = AndroidUtilities.lerp(lerp2, f73 + AndroidUtilities.dp(i15 + 5), f21);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.setImageCoords(lerp4, lerp5, lerp3, lerp3);
                                imageReceiver3.draw(canvas2);
                                canvas2.restore();
                                f49 = lerp3;
                            }
                        }
                        i15 = 0;
                        float lerp52 = AndroidUtilities.lerp(lerp2, f73 + AndroidUtilities.dp(i15 + 5), f21);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.setImageCoords(lerp4, lerp52, lerp3, lerp3);
                        imageReceiver32.draw(canvas2);
                        canvas2.restore();
                        f49 = lerp3;
                    }
                    canvas2.save();
                    f50 = dp2 * f21;
                    canvas2.translate(f50, 0.0f);
                    float f74 = -(!messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
                    float dp5 = !messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
                    float f75 = u1Var2.N9;
                    float f76 = (f70 - f75) + f74;
                    float f77 = (f70 - this.K) + f74;
                    AndroidUtilities.lerp(dp3 - f75, f76, f21);
                    float lerp6 = AndroidUtilities.lerp(dp3, f77, f21) + (!u1Var2.P9 ? AndroidUtilities.dp(3.0f) + f49 : 0.0f);
                    if (u1Var2.C9 == null) {
                        canvas2.save();
                        canvas2.translate(lerp6, (dp5 * f21) + lerp2);
                        int alpha = org.telegram.ui.ActionBar.h6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.h6.Y2.setAlpha((int) (alpha * f21));
                        u1Var2.C9.draw(canvas2);
                        org.telegram.ui.ActionBar.h6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.ap[]) snVar4.a0.b)[0].c;
                        f52 = dp3;
                        rectF = rectF5;
                        f22 = f48;
                        snVar2 = snVar4;
                        f51 = f76;
                        f53 = f49;
                        ba1Var = this;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, j5Var.getWidth(), j5Var.getHeight(), (int) (f12 * 255.0f), 31);
                        j5Var.setAlpha(1.0f);
                        j5Var.draw(canvas2);
                        j5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        snVar2 = snVar4;
                        f51 = f76;
                        f52 = dp3;
                        f22 = f48;
                        rectF = rectF5;
                        f53 = f49;
                        ba1Var = this;
                    }
                    if (u1Var2.z9 && u1Var2.v9 != null) {
                        if (u1Var2.ba.h() != u1Var2.s9) {
                            Drawable drawable = u1Var2.v9;
                            int h = u1Var2.ba.h();
                            u1Var2.s9 = h;
                            drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
                        }
                        u1Var2.v9.setBounds((int) (((rectF.right - f50) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)) - u1Var2.v9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f50) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2) + u1Var2.v9.getIntrinsicHeight()));
                        u1Var2.v9.setAlpha((int) (f21 * 255.0f));
                        u1Var2.v9.draw(canvas2);
                    }
                    if (u1Var2.D9 == null) {
                        canvas2.save();
                        float lerp7 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), org.telegram.ui.ActionBar.h6.Y2.getTextSize() + AndroidUtilities.dp(4.0f) + dp5, f21) + lerp2;
                        float dp6 = (u1Var2.z9 && u1Var2.P9) ? f51 - AndroidUtilities.dp(2.0f) : f51;
                        if (u1Var2.P9 && (!u1Var2.z9 || u1Var2.O9)) {
                            dp6 += f53 + AndroidUtilities.dp(3.0f);
                        }
                        if (u1Var2.A9 && u1Var2.B9 != null) {
                            float lerp8 = AndroidUtilities.lerp(f52 - u1Var2.N9, dp6, f21);
                            u1Var2.B9.e((int) lerp8, AndroidUtilities.dp(2.0f) + ((int) lerp7), AndroidUtilities.dp(f47), AndroidUtilities.dp(f47));
                            org.telegram.ui.ActionBar.h6.X1.setColor(org.telegram.ui.ActionBar.h6.w0(messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.h6.Ta : org.telegram.ui.ActionBar.h6.Ac, d6Var));
                            canvas2.drawCircle(lerp8 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + lerp7, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.X1);
                            u1Var2.B9.h(-1, messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.h6.zb : org.telegram.ui.ActionBar.h6.xd, org.telegram.ui.ActionBar.h6.k7);
                            CheckBoxBase checkBoxBase = u1Var2.B9;
                            if (checkBoxBase.h != f29) {
                                checkBoxBase.h = f29;
                                checkBoxBase.b();
                            }
                            u1Var2.B9.a(canvas2);
                        }
                        if (u1Var2.A9) {
                            dp6 += AndroidUtilities.dp(16.0f);
                        }
                        if (u1Var2.O9 && u1Var2.N9 > 0) {
                            dp6 = ((rectF.right - AndroidUtilities.dp(8.0f)) - u1Var2.D9.getWidth()) - f50;
                        }
                        canvas2.translate(AndroidUtilities.lerp(f52 - u1Var2.N9, dp6, f21), lerp7);
                        canvas2.save();
                        wh.g.d(canvas2, arrayList);
                        f32 = y14;
                        f30 = f12;
                        org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas2, u1Var2.D9, u1Var2.qc, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                        u1Var2.D9.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj = arrayList.get(i18);
                            i18++;
                            wh.g gVar = (wh.g) obj;
                            boolean z14 = gVar.p;
                            gVar.p = false;
                            if (z14) {
                                gVar.h(u1Var2.D9.getPaint().getColor());
                            }
                            gVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        f32 = y14;
                        f30 = f12;
                    }
                    canvas2.restore();
                } else if (messageObject.isOutOwner()) {
                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cb, d6Var);
                    b(org.telegram.ui.ActionBar.h6.ab);
                } else {
                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wc, d6Var);
                    b(org.telegram.ui.ActionBar.h6.Uc);
                }
            }
            i14 = w02;
            if (!messageObject.shouldDrawWithoutBackground()) {
            }
            f26 = f67;
            f29 = f19;
            org.telegram.ui.ActionBar.h6.Z2.setColor(i0.a.f(f29, this.i, w03));
            org.telegram.ui.ActionBar.h6.Y2.setColor(i0.a.f(f29, this.h, i14));
            if (!u1Var2.P9) {
            }
            float lerp9 = AndroidUtilities.lerp(dp3, f70, f21);
            float lerp22 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f29) + y15, f72, f29);
            if (this.R != null) {
            }
            RectF rectF22 = AndroidUtilities.rectTmp;
            rectF22.set(dp3, y15, this.f + dp3, AndroidUtilities.dp(35.0f) + y15);
            rectF22.offset(0.0f, AndroidUtilities.dp(f47) * f29);
            RectF rectF32 = u1Var2.Bc;
            RectF rectF42 = this.Q;
            rectF42.set(rectF32);
            rectF42.offset(f18, y14);
            RectF rectF52 = this.P;
            AndroidUtilities.lerp(rectF22, rectF42, f21, rectF52);
            MessageObject messageObject72 = messageObject2;
            f27 = f63;
            f28 = f64;
            f33 = b10;
            u1Var2.ba.d(canvas, rectF52, f71, u1Var2.z9, u1Var2.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            u1Var2.ba.e(canvas2, rectF52, f71);
            if (u1Var2.P9) {
            }
            canvas2.save();
            f50 = dp2 * f21;
            canvas2.translate(f50, 0.0f);
            float f742 = -(!messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
            float dp52 = !messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
            float f752 = u1Var2.N9;
            float f762 = (f70 - f752) + f742;
            float f772 = (f70 - this.K) + f742;
            AndroidUtilities.lerp(dp3 - f752, f762, f21);
            float lerp62 = AndroidUtilities.lerp(dp3, f772, f21) + (!u1Var2.P9 ? AndroidUtilities.dp(3.0f) + f49 : 0.0f);
            if (u1Var2.C9 == null) {
            }
            if (u1Var2.z9) {
                if (u1Var2.ba.h() != u1Var2.s9) {
                }
                u1Var2.v9.setBounds((int) (((rectF.right - f50) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)) - u1Var2.v9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f50) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2) + u1Var2.v9.getIntrinsicHeight()));
                u1Var2.v9.setAlpha((int) (f21 * 255.0f));
                u1Var2.v9.draw(canvas2);
            }
            if (u1Var2.D9 == null) {
            }
            canvas2.restore();
        } else {
            f22 = f20;
            i11 = dp;
            f23 = f69;
            f24 = f68;
            f25 = y11;
            f26 = f67;
            f27 = f63;
            f28 = f64;
            f29 = f19;
            f30 = f12;
            snVar2 = snVar;
            f31 = backgroundDrawableLeft;
            ba1Var = this;
            f32 = y14;
            f33 = b10;
        }
        canvas2.save();
        if (u1Var2.getMessageObject() == null || u1Var2.getMessageObject().type != 19) {
            canvas2.clipRect(f31 + AndroidUtilities.dp(4.0f), f24 + AndroidUtilities.dp(4.0f), i11 - AndroidUtilities.dp(4.0f), f33 - AndroidUtilities.dp(4.0f));
        }
        float f78 = (ba1Var.C * f30) + f21;
        canvas2.save();
        float f79 = x10 * f30;
        float f80 = f28;
        float y16 = com.google.android.gms.internal.play_billing.k3.y(f80, f27, f21, f79);
        float f81 = f25 * f26;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = u1Var2.getMessageObject().textLayoutBlocks;
        MessageObject.TextLayoutBlock textLayoutBlock2 = ba1Var.E;
        canvas2.translate(y16, ((textLayoutBlock2.textYOffset(arrayList2, t1Var2) + f23) * f29) + f81);
        float f82 = f78 * 1.0f;
        canvas2.scale(f78, f82, 0.0f, 0.0f);
        boolean z15 = ba1Var.o;
        int i19 = ba1Var.M;
        boolean z16 = ba1Var.n;
        StaticLayout staticLayout2 = ba1Var.p;
        if (z16 && z15) {
            int color = staticLayout2.getPaint().getColor();
            float f83 = f22;
            staticLayout2.getPaint().setColor(i0.a.f(f83, ba1Var.L, i19));
            float f84 = 1.0f - f83;
            z10 = z15;
            f34 = f30;
            f36 = f29;
            i12 = i19;
            f38 = f22;
            t1Var = t1Var2;
            f35 = f32;
            z11 = z16;
            textLayoutBlock = textLayoutBlock2;
            u1Var = u1Var2;
            f39 = f80;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f84 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f37 = f78;
            f40 = f82;
            f41 = f79;
            org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas, ba1Var.p, ba1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f84);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            f34 = f30;
            z10 = z15;
            i12 = i19;
            f35 = f32;
            f36 = f29;
            u1Var = u1Var2;
            z11 = z16;
            f37 = f78;
            f38 = f22;
            f39 = f80;
            f40 = f82;
            textLayoutBlock = textLayoutBlock2;
            t1Var = t1Var2;
            f41 = f79;
            if (z11) {
                float f85 = 1.0f - f38;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f85 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas3, ba1Var.p, ba1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f85);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.a6.drawAnimatedEmojis(canvas3, ba1Var.p, ba1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = ba1Var.q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(com.google.android.gms.internal.play_billing.k3.y(f39, ba1Var.m, f21, f41), ((textLayoutBlock.textYOffset(u1Var.getMessageObject().textLayoutBlocks, t1Var) + f23) * f36) + f81);
            f42 = f40;
            f44 = f37;
            canvas3.scale(f44, f42, 0.0f, 0.0f);
            if (z11 && z10) {
                int color2 = staticLayout3.getPaint().getColor();
                f43 = f38;
                i13 = i12;
                staticLayout3.getPaint().setColor(i0.a.o(i0.a.f(f43, ba1Var.L, i13), (int) ((1.0f - f43) * Color.alpha(color2))));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color2);
            } else {
                f43 = f38;
                i13 = i12;
                if (z11) {
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) ((1.0f - f43) * alpha2));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha2);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f42 = f40;
            f43 = f38;
            i13 = i12;
            f44 = f37;
        }
        if (z11) {
            canvas3.save();
            canvas3.translate(com.google.android.gms.internal.play_billing.k3.y(x10, f39, f34, (im0Var.getX() + u1Var.getLeft()) - siVar.getX()), f35);
            canvas3.scale(f44, f42, u1Var.getTextX(), u1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.h6.o2.getColor();
            org.telegram.ui.ActionBar.h6.o2.setColor(i13);
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = u1Var.getMessageObject().textLayoutBlocks;
            org.telegram.ui.Cells.u1 u1Var3 = u1Var;
            float f86 = u1Var3.r0;
            org.telegram.ui.Cells.t1 t1Var3 = u1Var3.Zc;
            if (t1Var3.l2) {
                float f87 = t1Var3.n2;
                float f88 = t1Var3.K1;
                f86 = (f86 * f88) + ((1.0f - f88) * f87);
            }
            float f89 = u1Var3.n0;
            MessageObject messageObject8 = u1Var3.y7;
            float f90 = f86;
            Canvas canvas4 = canvas3;
            ba1Var2 = this;
            f45 = 0.0f;
            z12 = false;
            u1Var3.U1(f89, f90, canvas4, arrayList3, messageObject8 == null ? 0.0f : messageObject8.textXOffset, true, f43, false, true, false, false);
            canvas3 = canvas4;
            u1Var3.A1(canvas3, f43);
            if (org.telegram.ui.ActionBar.h6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.h6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            ba1Var2 = ba1Var;
            f45 = 0.0f;
            z12 = false;
        }
        canvas3.restore();
        if (z13) {
            float f91 = i10;
            ba1Var2.u.setTranslate(f45, f91);
            ba1Var2.B.setLocalMatrix(ba1Var2.u);
            canvas3.drawRect(0.0f, f91, siVar.getMeasuredWidth(), siVar.getMeasuredHeight(), ba1Var2.v);
            canvas3.restore();
        }
        float f92 = ba1Var2.a;
        float f93 = f92 > 0.4f ? 1.0f : f92 / 0.4f;
        hk hkVar = ba1Var2.G;
        if (f93 == 1.0f) {
            hkVar.setTextTransitionIsRunning(z12);
        }
        if (hkVar.getSendButton().getVisibility() != 0 || f93 >= 1.0f) {
            return;
        }
        View sendButton = hkVar.getSendButton();
        lm lmVar = snVar2.X0;
        PointF pointF = ba1Var2.O;
        ih.j.b(sendButton, lmVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - siVar.getX(), pointF.y - siVar.getY());
        View sendButton2 = hkVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f93) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.N);
    }
}
