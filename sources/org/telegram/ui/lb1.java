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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lb1 implements di0 {
    public final zn A;
    public final LinearGradient B;
    public final float C;
    public final AnimationNotificationsLocker D;
    public final MessageObject.TextLayoutBlock E;
    public final NinePatchDrawable F;
    public final ok G;
    public final org.telegram.ui.Components.x5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.e6 N;
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
    public final org.telegram.ui.Components.qm0 s;
    public final org.telegram.ui.Components.xi t;
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
    public lb1(org.telegram.ui.Cells.u1 u1Var, zn znVar, org.telegram.ui.Components.qm0 qm0Var, org.telegram.ui.Components.xi xiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        float f7;
        boolean z10;
        int[] iArr;
        int i10;
        int lineCount;
        int i11;
        float f10;
        StaticLayout staticLayout;
        double f11;
        int i12;
        float f12;
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
        this.N = e6Var;
        if (u1Var.getMessageObject().textLayoutBlocks == null || u1Var.getMessageObject().textLayoutBlocks.size() > 1 || u1Var.getMessageObject().textLayoutBlocks.isEmpty() || u1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.r = u1Var;
        this.s = qm0Var;
        this.t = xiVar;
        this.A = znVar;
        ok okVar = znVar.Y;
        this.G = okVar;
        if (okVar == null || okVar.getEditField() == null || okVar.getEditField().getLayout() == null) {
            return;
        }
        okVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = u1Var.getMessageObject();
        if (!u1Var.getTransitionParams().v0) {
            u1Var.draw(new Canvas());
        }
        u1Var.setEnterTransitionInProgress(true);
        Editable editText = okVar.getEditText();
        CharSequence charSequence = u1Var.getMessageObject().messageText;
        this.n = false;
        okVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.o2;
        AndroidUtilities.dp(20.0f);
        if (u1Var.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z12 = u1Var.getMessageObject().emojiOnlyCount == u1Var.getMessageObject().animatedEmojiCount;
            switch (Math.max(u1Var.getMessageObject().emojiOnlyCount, u1Var.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[2];
                        break;
                    }
                case 3:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[3];
                        break;
                    }
                case 4:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[4];
                        break;
                    }
                case 5:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[5];
                        break;
                    }
                case 6:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.i6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.i6.y2[5];
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
                        i10 = okVar.getEditField().getLayout().getLineTop(okVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        okVar.getEditField().getLayout().getLineBottom(okVar.getEditField().getLayout().getLineForOffset(trim.length() + iArr[0]));
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.b6.cloneSpans(charSequence);
                    charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
                } else {
                    i10 = 0;
                }
                float textSize = okVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                lineCount = okVar.getEditField().getLayout().getLineCount();
                int width = (int) (okVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT < 24) {
                    this.p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.b6.update(2, (View) null, this.H, this.p);
                hh.j.b(okVar.getEditField(), znVar.X0, pointF);
                float f13 = pointF.y;
                this.y = pointF.x;
                this.z = ((AndroidUtilities.dp(10.0f) + f13) - okVar.getEditField().getScrollY()) + i10;
                float f14 = 0.0f;
                this.l = 0.0f;
                f10 = Float.MAX_VALUE;
                float f15 = Float.MAX_VALUE;
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
                float dp = AndroidUtilities.dp(f7) + f13;
                this.j = dp;
                if (this.G.x0()) {
                    this.j = dp - AndroidUtilities.dp(12.0f);
                }
                this.x = f13 + okVar.getEditField().getMeasuredHeight();
                MessageObject.TextLayoutBlock textLayoutBlock = u1Var.getMessageObject().textLayoutBlocks.get(0);
                this.E = textLayoutBlock;
                staticLayout = textLayoutBlock.textLayout;
                int i16 = org.telegram.ui.ActionBar.i6.fc;
                f11 = i0.a.f(org.telegram.ui.ActionBar.i6.w0(i16, this.N));
                i12 = org.telegram.ui.ActionBar.i6.Ud;
                if (Math.abs(f11 - i0.a.f(org.telegram.ui.ActionBar.i6.w0(i12, this.N))) > 0.20000000298023224d) {
                    this.n = true;
                    this.o = true;
                }
                this.L = org.telegram.ui.ActionBar.i6.w0(i12, this.N);
                this.M = org.telegram.ui.ActionBar.i6.w0(i16, this.N);
                if (staticLayout.getLineCount() != this.p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i17 = 0;
                    i13 = 0;
                    i14 = 0;
                    while (true) {
                        if (i17 < lineCount) {
                            StaticLayout staticLayout3 = this.p;
                            f12 = f14;
                            if (staticLayout3.getLineRight(i17) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i17) == f12) {
                                i13++;
                            } else {
                                i14++;
                            }
                            if (staticLayout.getLineEnd(i17) != this.p.getLineEnd(i17)) {
                                this.n = true;
                            } else {
                                i17++;
                                f14 = f12;
                            }
                        } else {
                            f12 = f14;
                        }
                    }
                } else {
                    f12 = 0.0f;
                    this.n = true;
                    i13 = 0;
                    i14 = 0;
                }
                if (!this.n && i14 > 0 && i13 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    for (i15 = 0; i15 < lineCount; i15++) {
                        StaticLayout staticLayout4 = this.p;
                        if (staticLayout4.getLineRight(i15) != staticLayout4.getWidth() || staticLayout4.getLineLeft(i15) == f12) {
                            spannableString2.setSpan(new org.telegram.ui.Components.b00(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                        } else {
                            spannableString.setSpan(new org.telegram.ui.Components.b00(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                            float lineLeft2 = this.p.getLineLeft(i15);
                            if (lineLeft2 < f15) {
                                f15 = lineLeft2;
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
                    org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.gp[]) znVar.a0.b)[0].c;
                    hh.j.b(j5Var, znVar.X0, this.O);
                    PointF pointF2 = this.O;
                    this.e = pointF2.x;
                    this.g = pointF2.y;
                    this.f = ((View) j5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.j5 j5Var2 = ((org.telegram.ui.Components.gp[]) znVar.a0.b)[0].d;
                    hh.j.b(j5Var2, znVar.X0, this.O);
                    float f16 = this.O.y;
                    this.h = j5Var.getTextColor();
                    this.i = j5Var2.getTextColor();
                    this.j -= AndroidUtilities.dp(46.0f);
                }
                this.S = qm0Var.getPaddingBottom() - (znVar.sc - AndroidUtilities.dp(44.0f));
                this.u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.w = u1Var.getMessageObject().stableId;
                float f17 = f12;
                okVar.getEditField().setAlpha(f17);
                okVar.setTextTransitionIsRunning(true);
                staticLayout2 = u1Var.C9;
                if (staticLayout2 != null && staticLayout2.getText().length() > 1 && u1Var.C9.getPrimaryHorizontal(0) != f17) {
                    this.K = u1Var.C9.getWidth() - u1Var.C9.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new ex0(this, okVar, xiVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) xiVar.c).add(this);
                xiVar.a();
                ((ViewGroup) xiVar.d).invalidate();
                this.D.lock();
                ofFloat.addListener(new org.telegram.ui.Components.k30(this, xiVar, u1Var, okVar, znVar));
                if (SharedConfig.getDevicePerformanceClass() == 2 || (y22 = u1Var.y2(true)) == null) {
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sd, this.N);
                Rect rect = y22.o;
                if (y22.F == null) {
                    Bitmap createBitmap = Bitmap.createBitmap(y22.b(50.0f), y22.b(40.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rect.set(y22.getBounds());
                    Paint paint3 = new Paint(1);
                    paint3.setColor(-1);
                    y22.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    y22.c(canvas, paint3);
                    y22.F = new NinePatchDrawable(createBitmap, v7.r7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
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
        org.telegram.ui.Components.b6.cloneSpans(charSequence);
        charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        float textSize2 = okVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize2;
        lineCount = okVar.getEditField().getLayout().getLineCount();
        int width2 = (int) (okVar.getEditField().getLayout().getWidth() / textSize2);
        if (Build.VERSION.SDK_INT < 24) {
        }
        this.H = org.telegram.ui.Components.b6.update(2, (View) null, this.H, this.p);
        hh.j.b(okVar.getEditField(), znVar.X0, pointF);
        float f132 = pointF.y;
        this.y = pointF.x;
        this.z = ((AndroidUtilities.dp(10.0f) + f132) - okVar.getEditField().getScrollY()) + i10;
        float f142 = 0.0f;
        this.l = 0.0f;
        f10 = Float.MAX_VALUE;
        float f152 = Float.MAX_VALUE;
        while (i11 < this.p.getLineCount()) {
        }
        if (f10 != Float.MAX_VALUE) {
        }
        this.p.getHeight();
        float dp2 = AndroidUtilities.dp(f7) + f132;
        this.j = dp2;
        if (this.G.x0()) {
        }
        this.x = f132 + okVar.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock2 = u1Var.getMessageObject().textLayoutBlocks.get(0);
        this.E = textLayoutBlock2;
        staticLayout = textLayoutBlock2.textLayout;
        int i162 = org.telegram.ui.ActionBar.i6.fc;
        f11 = i0.a.f(org.telegram.ui.ActionBar.i6.w0(i162, this.N));
        i12 = org.telegram.ui.ActionBar.i6.Ud;
        if (Math.abs(f11 - i0.a.f(org.telegram.ui.ActionBar.i6.w0(i12, this.N))) > 0.20000000298023224d) {
        }
        this.L = org.telegram.ui.ActionBar.i6.w0(i12, this.N);
        this.M = org.telegram.ui.ActionBar.i6.w0(i162, this.N);
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
        this.S = qm0Var.getPaddingBottom() - (znVar.sc - AndroidUtilities.dp(44.0f));
        this.u = new Matrix();
        Paint paint22 = new Paint(1);
        this.v = paint22;
        paint22.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient2;
        paint22.setShader(linearGradient2);
        this.w = u1Var.getMessageObject().stableId;
        float f172 = f12;
        okVar.getEditField().setAlpha(f172);
        okVar.setTextTransitionIsRunning(true);
        staticLayout2 = u1Var.C9;
        if (staticLayout2 != null) {
            this.K = u1Var.C9.getWidth() - u1Var.C9.getLineWidth(0);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat2;
        ofFloat2.addUpdateListener(new ex0(this, okVar, xiVar, 1));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(250L);
        ((ArrayList) xiVar.c).add(this);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        this.D.lock();
        ofFloat2.addListener(new org.telegram.ui.Components.k30(this, xiVar, u1Var, okVar, znVar));
        if (SharedConfig.getDevicePerformanceClass() == 2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x03d6, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.caption) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03ee, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r11.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0442, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.caption) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x045a, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r11.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x074d  */
    @Override // org.telegram.ui.di0
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
        zn znVar;
        ImageReceiver imageReceiver;
        float f19;
        float f20;
        float f21;
        MessageObject messageObject;
        float f22;
        float f23;
        int i11;
        lb1 lb1Var;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        zn znVar2;
        float f31;
        float f32;
        float f33;
        boolean z10;
        int i12;
        float f34;
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
        float f45;
        boolean z12;
        int w02;
        int i14;
        MessageObject messageObject2;
        int w03;
        float f46;
        float f47;
        float f48;
        RectF rectF;
        float f49;
        int i15;
        StaticLayout staticLayout;
        int i16;
        float f50;
        int i17;
        float f51;
        org.telegram.ui.Components.qm0 qm0Var = this.s;
        float y3 = qm0Var.getY();
        org.telegram.ui.Components.xi xiVar = this.t;
        float y10 = (y3 - xiVar.getY()) + qm0Var.getMeasuredHeight();
        float x10 = this.y - xiVar.getX();
        float y11 = this.z - xiVar.getY();
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
        float x11 = (qm0Var.getX() + u1Var2.getX()) - xiVar.getX();
        float top = ((qm0Var.getTop() + (u1Var2.getPaddingTop() + u1Var2.getTop())) - xiVar.getY()) - (this.S - qm0Var.getPaddingBottom());
        float interpolation = ji.n.V.getInterpolation(this.a);
        float f52 = this.a;
        float f53 = f52 > 0.4f ? 1.0f : f52 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.hs.g.getInterpolation(org.telegram.ui.Components.hs.h.getInterpolation(f52));
        float f54 = this.I + x11;
        float f55 = this.J + top;
        float f56 = f53;
        float f57 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y10 * interpolation2) + (xiVar.getMeasuredHeight() * f57));
        boolean z13 = u1Var2.getBottom() - AndroidUtilities.dp(4.0f) > qm0Var.getMeasuredHeight() && (((float) u1Var2.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && xiVar.getMeasuredHeight() > 0;
        if (z13) {
            i10 = measuredHeight;
            f11 = interpolation2;
            f14 = interpolation;
            f15 = f55;
            f16 = f56;
            f17 = x11;
            f12 = f57;
            f13 = f54;
            f7 = top;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), xiVar.getMeasuredWidth(), xiVar.getMeasuredHeight(), 255, 31);
        } else {
            i10 = measuredHeight;
            f7 = top;
            f10 = 0.0f;
            f11 = interpolation2;
            f12 = f57;
            f13 = f54;
            f14 = interpolation;
            f15 = f55;
            f16 = f56;
            f17 = x11;
            canvas2 = canvas;
        }
        canvas2.save();
        float y12 = qm0Var.getY();
        zn znVar3 = this.A;
        canvas2.clipRect(f10, ((znVar3.s9 + y12) - xiVar.getY()) - AndroidUtilities.dp(3.0f), xiVar.getMeasuredWidth(), xiVar.getMeasuredHeight());
        canvas2.save();
        float f58 = f17;
        float f59 = this.l;
        float f60 = f13;
        float backgroundDrawableLeft = u1Var2.getBackgroundDrawableLeft() + f58 + ((x10 - (f60 - f59)) * f12);
        float f61 = f7;
        float backgroundDrawableTop = u1Var2.getBackgroundDrawableTop() + f61;
        float y13 = this.j - xiVar.getY();
        float f62 = f14;
        float f63 = 1.0f - f62;
        float f64 = (backgroundDrawableTop * f62) + (y13 * f63);
        float y14 = ((this.x - xiVar.getY()) * f63) + ((backgroundDrawableTop + (u1Var2.getBackgroundDrawableBottom() - u1Var2.getBackgroundDrawableTop())) * f62);
        int dp = (int) ((AndroidUtilities.dp(4.0f) * f12) + u1Var2.getBackgroundDrawableRight() + f58);
        MessageObject messageObject3 = this.k;
        org.telegram.ui.ActionBar.f5 y22 = !messageObject3.isAnimatedEmojiStickers() ? u1Var2.y2(true) : null;
        if (y22 != null) {
            imageReceiver = imageReceiver2;
            u1Var2.setBackgroundTopY(xiVar.getTop() - qm0Var.getTop());
            Drawable j3 = y22.j();
            f18 = f58;
            f20 = f16;
            if (f20 != 1.0f) {
                f19 = f62;
                NinePatchDrawable ninePatchDrawable = this.F;
                if (ninePatchDrawable != null) {
                    messageObject = messageObject3;
                    znVar = znVar3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y14);
                    ninePatchDrawable.draw(canvas2);
                    f21 = f11;
                    if (j3 != null) {
                        j3.setAlpha((int) (f21 * 255.0f));
                        j3.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y14);
                        j3.draw(canvas2);
                        j3.setAlpha(255);
                    }
                    y22.setAlpha((int) (f20 * 255.0f));
                    y22.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y14);
                    y22.I = true;
                    y22.draw(canvas2);
                    y22.I = false;
                    y22.setAlpha(255);
                } else {
                    znVar = znVar3;
                }
            } else {
                znVar = znVar3;
                f19 = f62;
            }
            messageObject = messageObject3;
            f21 = f11;
            if (j3 != null) {
            }
            y22.setAlpha((int) (f20 * 255.0f));
            y22.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y14);
            y22.I = true;
            y22.draw(canvas2);
            y22.I = false;
            y22.setAlpha(255);
        } else {
            f18 = f58;
            znVar = znVar3;
            imageReceiver = imageReceiver2;
            f19 = f62;
            f20 = f16;
            f21 = f11;
            messageObject = messageObject3;
        }
        canvas2.restore();
        canvas2.save();
        if (y22 != null) {
            if (messageObject.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f64, dp - AndroidUtilities.dp(10.0f), y14 - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f64, dp - AndroidUtilities.dp(4.0f), y14 - AndroidUtilities.dp(4.0f));
            }
        }
        float x12 = (qm0Var.getX() + u1Var2.getLeft()) - xiVar.getX();
        float f65 = f15;
        float y15 = com.google.android.gms.internal.vision.e2.y(y11, f65, f63, f61);
        canvas2.translate(x12, y15);
        u1Var2.m2(f20, canvas2, false);
        u1Var2.W1(canvas2, f20);
        u1Var2.M1(canvas2, f20);
        u1Var2.I1(f20, canvas2, false);
        u1Var2.d2(canvas2, f20, null);
        u1Var2.N1(canvas2, f20);
        u1Var2.T1(canvas2, f20);
        canvas2.restore();
        if (this.c) {
            zn znVar4 = znVar;
            ((org.telegram.ui.Components.gp[]) znVar4.a0.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.gp[]) znVar4.a0.b)[0].d.setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), u1Var2.I9, f21);
            int dp2 = AndroidUtilities.dp(10.0f);
            float x13 = this.e - xiVar.getX();
            float y16 = this.g - xiVar.getY();
            f31 = backgroundDrawableLeft;
            float f66 = f18 + u1Var2.G9;
            float f67 = f20;
            float f68 = u1Var2.H9 + f61;
            if (u1Var2.ba == null) {
                u1Var2.ba = new org.telegram.ui.Components.xm0(u1Var2);
            }
            f23 = y14;
            u1Var2.ba.a(u1Var2.getMessageObject(), u1Var2.getCurrentUser(), u1Var2.getCurrentChat(), this.N, 0);
            boolean shouldDrawWithoutBackground = messageObject.shouldDrawWithoutBackground();
            org.telegram.ui.ActionBar.e6 e6Var = this.N;
            if (shouldDrawWithoutBackground) {
                w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xc, e6Var);
                b(org.telegram.ui.ActionBar.i6.Vc);
            } else {
                org.telegram.ui.Components.xm0 xm0Var = u1Var2.ba;
                if (xm0Var != null) {
                    i14 = xm0Var.I.c;
                    if (!messageObject.shouldDrawWithoutBackground()) {
                        i11 = dp;
                        f24 = f64;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f26 = f63;
                        org.telegram.ui.Components.xm0 xm0Var2 = u1Var2.ba;
                        if (xm0Var2 != null) {
                            w03 = xm0Var2.I.c;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject4 = messageObject2.replyMessageObject;
                                if (messageObject4.type == 0 || !TextUtils.isEmpty(messageObject4.caption)) {
                                    TLRPC.MessageMedia messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.db, e6Var);
                                    }
                                }
                            }
                            w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.eb, e6Var);
                        }
                    } else if (!messageObject.isOutOwner()) {
                        i11 = dp;
                        f24 = f64;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f26 = f63;
                        if (!messageObject2.isReplyToStory()) {
                            int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Yc, e6Var);
                            if (!messageObject2.forceAvatar) {
                                if (messageObject2.hasValidReplyMessageObject()) {
                                    MessageObject messageObject5 = messageObject2.replyMessageObject;
                                    if (messageObject5.type != 0) {
                                    }
                                    if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!u1Var2.z9) {
                                    i16 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Zc, e6Var);
                                    f50 = 0.6f;
                                    w03 = i0.a.d(f50, i16, org.telegram.ui.ActionBar.i6.c(i16, i14));
                                }
                            }
                            i16 = w04;
                            f50 = 0.0f;
                            w03 = i0.a.d(f50, i16, org.telegram.ui.ActionBar.i6.c(i16, i14));
                        }
                        w03 = i14;
                    } else if (messageObject.isReplyToStory()) {
                        i11 = dp;
                        f24 = f64;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f26 = f63;
                        w03 = i14;
                    } else {
                        i11 = dp;
                        int w05 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.db, e6Var);
                        f24 = f64;
                        messageObject2 = messageObject;
                        if (messageObject2.forceAvatar) {
                            f25 = y11;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject6 = messageObject2.replyMessageObject;
                                f25 = y11;
                                if (messageObject6.type != 0) {
                                }
                                if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            } else {
                                f25 = y11;
                            }
                            if (!u1Var2.z9) {
                                i17 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.eb, e6Var);
                                f51 = 0.6f;
                                f26 = f63;
                                w03 = i0.a.d(f51, i17, org.telegram.ui.ActionBar.i6.c(i17, i14));
                            }
                        }
                        i17 = w05;
                        f51 = 0.0f;
                        f26 = f63;
                        w03 = i0.a.d(f51, i17, org.telegram.ui.ActionBar.i6.c(i17, i14));
                    }
                    MessageObject messageObject7 = messageObject2;
                    f29 = f19;
                    org.telegram.ui.ActionBar.i6.Z2.setColor(i0.a.d(f29, this.i, w03));
                    org.telegram.ui.ActionBar.i6.Y2.setColor(i0.a.d(f29, this.h, i14));
                    float dp3 = !u1Var2.P9 ? x13 - AndroidUtilities.dp(44.0f) : x13;
                    float lerp = AndroidUtilities.lerp(dp3, f66, f21);
                    float lerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f29) + y16, f68, f29);
                    if (this.R == null) {
                        this.R = new float[]{r5, r5, 0.0f, 0.0f, 0.0f, 0.0f, r5, r5};
                        float dp4 = AndroidUtilities.dp(4.0f);
                        float[] fArr = this.R;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp3, y16, this.f + dp3, AndroidUtilities.dp(35.0f) + y16);
                    rectF2.offset(0.0f, AndroidUtilities.dp(12.0f) * f29);
                    RectF rectF3 = u1Var2.Bc;
                    RectF rectF4 = this.Q;
                    rectF4.set(rectF3);
                    rectF4.offset(f18, y15);
                    RectF rectF5 = this.P;
                    AndroidUtilities.lerp(rectF2, rectF4, f21, rectF5);
                    f27 = f59;
                    f28 = f60;
                    f33 = f65;
                    u1Var2.ba.d(canvas, rectF5, f67, u1Var2.z9, u1Var2.getMessageObject().shouldDrawWithoutBackground());
                    canvas2 = canvas;
                    u1Var2.ba.e(canvas2, rectF5, f67);
                    if (u1Var2.P9) {
                        f46 = f67;
                        f47 = 0.0f;
                    } else {
                        canvas2.save();
                        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(rectF5.height() - AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.Z2.getTextSize() + org.telegram.ui.ActionBar.i6.Y2.getTextSize() + AndroidUtilities.dp(u1Var2.z9 ? 3.0f : 7.0f)), f21);
                        float lerp4 = AndroidUtilities.lerp(lerp, rectF5.left + AndroidUtilities.dp(8.0f), f21);
                        float f69 = rectF5.top;
                        if (!u1Var2.z9 || (staticLayout = u1Var2.D9) == null) {
                            f46 = f67;
                        } else {
                            f46 = f67;
                            if (staticLayout.getLineCount() <= 1) {
                                i15 = 2;
                                float lerp5 = AndroidUtilities.lerp(lerp2, f69 + AndroidUtilities.dp(i15 + 5), f21);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.setImageCoords(lerp4, lerp5, lerp3, lerp3);
                                imageReceiver3.draw(canvas2);
                                canvas2.restore();
                                f47 = lerp3;
                            }
                        }
                        i15 = 0;
                        float lerp52 = AndroidUtilities.lerp(lerp2, f69 + AndroidUtilities.dp(i15 + 5), f21);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.setImageCoords(lerp4, lerp52, lerp3, lerp3);
                        imageReceiver32.draw(canvas2);
                        canvas2.restore();
                        f47 = lerp3;
                    }
                    canvas2.save();
                    float f70 = dp2 * f21;
                    canvas2.translate(f70, 0.0f);
                    float f71 = -(!messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
                    float dp5 = !messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
                    float f72 = u1Var2.N9;
                    float f73 = (f66 - f72) + f71;
                    float f74 = (f66 - this.K) + f71;
                    AndroidUtilities.lerp(dp3 - f72, f73, f21);
                    float lerp6 = AndroidUtilities.lerp(dp3, f74, f21) + (!u1Var2.P9 ? AndroidUtilities.dp(3.0f) + f47 : 0.0f);
                    if (u1Var2.C9 == null) {
                        canvas2.save();
                        canvas2.translate(lerp6, (dp5 * f21) + lerp2);
                        int alpha = org.telegram.ui.ActionBar.i6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.i6.Y2.setAlpha((int) (alpha * f21));
                        u1Var2.C9.draw(canvas2);
                        org.telegram.ui.ActionBar.i6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.gp[]) znVar4.a0.b)[0].c;
                        f48 = f70;
                        f22 = f46;
                        znVar2 = znVar4;
                        rectF = rectF5;
                        f49 = f73;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, j5Var.getWidth(), j5Var.getHeight(), (int) (f12 * 255.0f), 31);
                        j5Var.setAlpha(1.0f);
                        j5Var.draw(canvas2);
                        j5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        znVar2 = znVar4;
                        f48 = f70;
                        rectF = rectF5;
                        f22 = f46;
                        f49 = f73;
                    }
                    if (u1Var2.z9 && u1Var2.v9 != null) {
                        if (u1Var2.ba.h() != u1Var2.s9) {
                            Drawable drawable = u1Var2.v9;
                            int h = u1Var2.ba.h();
                            u1Var2.s9 = h;
                            drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
                        }
                        u1Var2.v9.setBounds((int) (((rectF.right - f48) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)) - u1Var2.v9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f48) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2) + u1Var2.v9.getIntrinsicHeight()));
                        u1Var2.v9.setAlpha((int) (f21 * 255.0f));
                        u1Var2.v9.draw(canvas2);
                    }
                    if (u1Var2.D9 == null) {
                        canvas2.save();
                        float lerp7 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), org.telegram.ui.ActionBar.i6.Y2.getTextSize() + AndroidUtilities.dp(4.0f) + dp5, f21) + lerp2;
                        float dp6 = (u1Var2.z9 && u1Var2.P9) ? f49 - AndroidUtilities.dp(2.0f) : f49;
                        if (u1Var2.P9 && (!u1Var2.z9 || u1Var2.O9)) {
                            dp6 += f47 + AndroidUtilities.dp(3.0f);
                        }
                        if (u1Var2.A9 && u1Var2.B9 != null) {
                            float lerp8 = AndroidUtilities.lerp(dp3 - u1Var2.N9, dp6, f21);
                            u1Var2.B9.e((int) lerp8, AndroidUtilities.dp(2.0f) + ((int) lerp7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                            org.telegram.ui.ActionBar.i6.X1.setColor(org.telegram.ui.ActionBar.i6.w0(messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.i6.Ta : org.telegram.ui.ActionBar.i6.Ac, e6Var));
                            canvas2.drawCircle(lerp8 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + lerp7, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.i6.X1);
                            u1Var2.B9.h(-1, messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.i6.zb : org.telegram.ui.ActionBar.i6.xd, org.telegram.ui.ActionBar.i6.k7);
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
                            dp6 = ((rectF.right - AndroidUtilities.dp(8.0f)) - u1Var2.D9.getWidth()) - f48;
                        }
                        canvas2.translate(AndroidUtilities.lerp(dp3 - u1Var2.N9, dp6, f21), lerp7);
                        canvas2.save();
                        vh.g.d(canvas2, arrayList);
                        lb1Var = this;
                        f32 = y15;
                        f30 = f12;
                        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas2, u1Var2.D9, u1Var2.qc, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                        u1Var2.D9.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj = arrayList.get(i18);
                            i18++;
                            vh.g gVar = (vh.g) obj;
                            boolean z14 = gVar.p;
                            gVar.p = false;
                            if (z14) {
                                gVar.h(u1Var2.D9.getPaint().getColor());
                            }
                            gVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        lb1Var = this;
                        f32 = y15;
                        f30 = f12;
                    }
                    canvas2.restore();
                } else if (messageObject.isOutOwner()) {
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cb, e6Var);
                    b(org.telegram.ui.ActionBar.i6.ab);
                } else {
                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wc, e6Var);
                    b(org.telegram.ui.ActionBar.i6.Uc);
                }
            }
            i14 = w02;
            if (!messageObject.shouldDrawWithoutBackground()) {
            }
            MessageObject messageObject72 = messageObject2;
            f29 = f19;
            org.telegram.ui.ActionBar.i6.Z2.setColor(i0.a.d(f29, this.i, w03));
            org.telegram.ui.ActionBar.i6.Y2.setColor(i0.a.d(f29, this.h, i14));
            if (!u1Var2.P9) {
            }
            float lerp9 = AndroidUtilities.lerp(dp3, f66, f21);
            float lerp22 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f29) + y16, f68, f29);
            if (this.R == null) {
            }
            RectF rectF22 = AndroidUtilities.rectTmp;
            rectF22.set(dp3, y16, this.f + dp3, AndroidUtilities.dp(35.0f) + y16);
            rectF22.offset(0.0f, AndroidUtilities.dp(12.0f) * f29);
            RectF rectF32 = u1Var2.Bc;
            RectF rectF42 = this.Q;
            rectF42.set(rectF32);
            rectF42.offset(f18, y15);
            RectF rectF52 = this.P;
            AndroidUtilities.lerp(rectF22, rectF42, f21, rectF52);
            f27 = f59;
            f28 = f60;
            f33 = f65;
            u1Var2.ba.d(canvas, rectF52, f67, u1Var2.z9, u1Var2.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            u1Var2.ba.e(canvas2, rectF52, f67);
            if (u1Var2.P9) {
            }
            canvas2.save();
            float f702 = dp2 * f21;
            canvas2.translate(f702, 0.0f);
            float f712 = -(!messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
            float dp52 = !messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
            float f722 = u1Var2.N9;
            float f732 = (f66 - f722) + f712;
            float f742 = (f66 - this.K) + f712;
            AndroidUtilities.lerp(dp3 - f722, f732, f21);
            float lerp62 = AndroidUtilities.lerp(dp3, f742, f21) + (!u1Var2.P9 ? AndroidUtilities.dp(3.0f) + f47 : 0.0f);
            if (u1Var2.C9 == null) {
            }
            if (u1Var2.z9) {
                if (u1Var2.ba.h() != u1Var2.s9) {
                }
                u1Var2.v9.setBounds((int) (((rectF.right - f48) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)) - u1Var2.v9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f48) - AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!u1Var2.I ? 1 : 0) + 2) + u1Var2.v9.getIntrinsicHeight()));
                u1Var2.v9.setAlpha((int) (f21 * 255.0f));
                u1Var2.v9.draw(canvas2);
            }
            if (u1Var2.D9 == null) {
            }
            canvas2.restore();
        } else {
            f22 = f20;
            f23 = y14;
            i11 = dp;
            lb1Var = this;
            f24 = f64;
            f25 = y11;
            f26 = f63;
            f27 = f59;
            f28 = f60;
            f29 = f19;
            f30 = f12;
            znVar2 = znVar;
            f31 = backgroundDrawableLeft;
            f32 = y15;
            f33 = f65;
        }
        canvas2.save();
        if (u1Var2.getMessageObject() == null || u1Var2.getMessageObject().type != 19) {
            canvas2.clipRect(f31 + AndroidUtilities.dp(4.0f), f24 + AndroidUtilities.dp(4.0f), i11 - AndroidUtilities.dp(4.0f), f23 - AndroidUtilities.dp(4.0f));
        }
        float f75 = (lb1Var.C * f30) + f21;
        canvas2.save();
        float f76 = x10 * f30;
        float f77 = f28;
        float y17 = com.google.android.gms.internal.vision.e2.y(f77, f27, f21, f76);
        float f78 = f25 * f26;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = u1Var2.getMessageObject().textLayoutBlocks;
        MessageObject.TextLayoutBlock textLayoutBlock2 = lb1Var.E;
        canvas2.translate(y17, ((textLayoutBlock2.textYOffset(arrayList2, t1Var2) + f33) * f29) + f78);
        float f79 = f75 * 1.0f;
        canvas2.scale(f75, f79, 0.0f, 0.0f);
        boolean z15 = lb1Var.o;
        int i19 = lb1Var.M;
        boolean z16 = lb1Var.n;
        StaticLayout staticLayout2 = lb1Var.p;
        if (z16 && z15) {
            int color = staticLayout2.getPaint().getColor();
            float f80 = f22;
            staticLayout2.getPaint().setColor(i0.a.d(f80, lb1Var.L, i19));
            float f81 = 1.0f - f80;
            f38 = f80;
            z10 = z15;
            f34 = f29;
            f35 = f30;
            i12 = i19;
            t1Var = t1Var2;
            f36 = f32;
            z11 = z16;
            textLayoutBlock = textLayoutBlock2;
            u1Var = u1Var2;
            f39 = f77;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f81 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f37 = f75;
            f40 = f79;
            f41 = f76;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, lb1Var.p, lb1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f81);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            z10 = z15;
            i12 = i19;
            f34 = f29;
            f35 = f30;
            f36 = f32;
            u1Var = u1Var2;
            z11 = z16;
            f37 = f75;
            f38 = f22;
            f39 = f77;
            f40 = f79;
            textLayoutBlock = textLayoutBlock2;
            t1Var = t1Var2;
            f41 = f76;
            if (z11) {
                float f82 = 1.0f - f38;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f82 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, lb1Var.p, lb1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f82);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas3, lb1Var.p, lb1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = lb1Var.q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(com.google.android.gms.internal.vision.e2.y(f39, lb1Var.m, f21, f41), ((textLayoutBlock.textYOffset(u1Var.getMessageObject().textLayoutBlocks, t1Var) + f33) * f34) + f78);
            f42 = f40;
            f44 = f37;
            canvas3.scale(f44, f42, 0.0f, 0.0f);
            if (z11 && z10) {
                int color2 = staticLayout3.getPaint().getColor();
                f43 = f38;
                i13 = i12;
                staticLayout3.getPaint().setColor(i0.a.k(i0.a.d(f43, lb1Var.L, i13), (int) ((1.0f - f43) * Color.alpha(color2))));
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
            canvas3.translate(com.google.android.gms.internal.vision.e2.y(x10, f39, f35, (qm0Var.getX() + u1Var.getLeft()) - xiVar.getX()), f36);
            canvas3.scale(f44, f42, u1Var.getTextX(), u1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.i6.o2.getColor();
            org.telegram.ui.ActionBar.i6.o2.setColor(i13);
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = u1Var.getMessageObject().textLayoutBlocks;
            org.telegram.ui.Cells.u1 u1Var3 = u1Var;
            float f83 = u1Var3.r0;
            org.telegram.ui.Cells.t1 t1Var3 = u1Var3.Zc;
            if (t1Var3.l2) {
                float f84 = t1Var3.n2;
                float f85 = t1Var3.K1;
                f83 = (f83 * f85) + ((1.0f - f85) * f84);
            }
            float f86 = u1Var3.n0;
            MessageObject messageObject8 = u1Var3.y7;
            f45 = 0.0f;
            z12 = false;
            Canvas canvas4 = canvas3;
            u1Var3.U1(f86, f83, canvas4, arrayList3, messageObject8 == null ? 0.0f : messageObject8.textXOffset, true, f43, false, true, false, false);
            canvas3 = canvas4;
            u1Var3.A1(canvas3, f43);
            if (org.telegram.ui.ActionBar.i6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.i6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            f45 = 0.0f;
            z12 = false;
        }
        canvas3.restore();
        if (z13) {
            float f87 = i10;
            lb1Var.u.setTranslate(f45, f87);
            lb1Var.B.setLocalMatrix(lb1Var.u);
            canvas3.drawRect(0.0f, f87, xiVar.getMeasuredWidth(), xiVar.getMeasuredHeight(), lb1Var.v);
            canvas3.restore();
        }
        float f88 = lb1Var.a;
        float f89 = f88 > 0.4f ? 1.0f : f88 / 0.4f;
        ok okVar = lb1Var.G;
        if (f89 == 1.0f) {
            okVar.setTextTransitionIsRunning(z12);
        }
        if (okVar.getSendButton().getVisibility() != 0 || f89 >= 1.0f) {
            return;
        }
        View sendButton = okVar.getSendButton();
        sm smVar = znVar2.X0;
        PointF pointF = lb1Var.O;
        hh.j.b(sendButton, smVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - xiVar.getX(), pointF.y - xiVar.getY());
        View sendButton2 = okVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f89) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.i6.w0(i10, this.N);
    }
}
