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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class da1 implements kh0 {
    public final tn A;
    public final LinearGradient B;
    public final float C;
    public final AnimationNotificationsLocker D;
    public final MessageObject.TextLayoutBlock E;
    public final NinePatchDrawable F;
    public final dk G;
    public final org.telegram.ui.Components.u5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.c6 N;
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
    public final org.telegram.ui.Cells.s1 r;
    public final org.telegram.ui.Components.jl0 s;
    public final org.telegram.ui.Components.mi t;
    public final Matrix u;
    public final Paint v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    /* JADX WARN: Removed duplicated region for block: B:112:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public da1(org.telegram.ui.Cells.s1 s1Var, tn tnVar, org.telegram.ui.Components.jl0 jl0Var, org.telegram.ui.Components.mi miVar, org.telegram.ui.ActionBar.c6 c6Var) {
        float f9;
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
        org.telegram.ui.ActionBar.d5 y22;
        int i15;
        Paint paint = new Paint(1);
        this.b = paint;
        this.D = new AnimationNotificationsLocker();
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = c6Var;
        if (s1Var.getMessageObject().textLayoutBlocks == null || s1Var.getMessageObject().textLayoutBlocks.size() > 1 || s1Var.getMessageObject().textLayoutBlocks.isEmpty() || s1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.r = s1Var;
        this.s = jl0Var;
        this.t = miVar;
        this.A = tnVar;
        dk dkVar = tnVar.U;
        this.G = dkVar;
        if (dkVar == null || dkVar.getEditField() == null || dkVar.getEditField().getLayout() == null) {
            return;
        }
        dkVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = s1Var.getMessageObject();
        if (!s1Var.getTransitionParams().v0) {
            s1Var.draw(new Canvas());
        }
        s1Var.setEnterTransitionInProgress(true);
        Editable editText = dkVar.getEditText();
        CharSequence charSequence = s1Var.getMessageObject().messageText;
        this.n = false;
        dkVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.o2;
        AndroidUtilities.dp(20.0f);
        if (s1Var.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z12 = s1Var.getMessageObject().emojiOnlyCount == s1Var.getMessageObject().animatedEmojiCount;
            switch (Math.max(s1Var.getMessageObject().emojiOnlyCount, s1Var.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[2];
                        break;
                    }
                case 3:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[3];
                        break;
                    }
                case 4:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[4];
                        break;
                    }
                case 5:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[5];
                        break;
                    }
                case 6:
                    if (z12) {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.g6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.g6.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                AndroidUtilities.dp(4.0f);
            }
        }
        if (charSequence instanceof Spannable) {
            f9 = 4.0f;
            Object[] spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class);
            if (spans != null && spans.length > 0) {
                z10 = true;
                if (editText.length() == charSequence.length() || z10) {
                    this.n = true;
                    iArr = new int[1];
                    CharSequence trim = AndroidUtilities.trim(editText, iArr);
                    if (iArr[0] <= 0) {
                        i10 = dkVar.getEditField().getLayout().getLineTop(dkVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        dkVar.getEditField().getLayout().getLineBottom(dkVar.getEditField().getLayout().getLineForOffset(trim.length() + iArr[0]));
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.y5.cloneSpans(charSequence);
                    charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
                } else {
                    i10 = 0;
                }
                float textSize = dkVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                lineCount = dkVar.getEditField().getLayout().getLineCount();
                int width = (int) (dkVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT < 24) {
                    this.p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.y5.update(2, (View) null, this.H, this.p);
                sg.i.b(dkVar.getEditField(), tnVar.T0, pointF);
                float f13 = pointF.y;
                this.y = pointF.x;
                this.z = ((AndroidUtilities.dp(10.0f) + f13) - dkVar.getEditField().getScrollY()) + i10;
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
                float dp = AndroidUtilities.dp(f9) + f13;
                this.j = dp;
                if (this.G.z0()) {
                    this.j = dp - AndroidUtilities.dp(12.0f);
                }
                this.x = f13 + dkVar.getEditField().getMeasuredHeight();
                MessageObject.TextLayoutBlock textLayoutBlock = s1Var.getMessageObject().textLayoutBlocks.get(0);
                this.E = textLayoutBlock;
                staticLayout = textLayoutBlock.textLayout;
                int i16 = org.telegram.ui.ActionBar.g6.fc;
                f11 = i0.a.f(org.telegram.ui.ActionBar.g6.v0(i16, this.N));
                i12 = org.telegram.ui.ActionBar.g6.Ud;
                if (Math.abs(f11 - i0.a.f(org.telegram.ui.ActionBar.g6.v0(i12, this.N))) > 0.20000000298023224d) {
                    this.n = true;
                    this.o = true;
                }
                this.L = org.telegram.ui.ActionBar.g6.v0(i12, this.N);
                this.M = org.telegram.ui.ActionBar.g6.v0(i16, this.N);
                if (staticLayout.getLineCount() != this.p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i17 = 0;
                    i13 = 0;
                    i14 = 0;
                    while (true) {
                        if (i17 < lineCount) {
                            StaticLayout staticLayout3 = this.p;
                            f12 = 0.0f;
                            if (staticLayout3.getLineRight(i17) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i17) == 0.0f) {
                                i13++;
                            } else {
                                i14++;
                            }
                            if (staticLayout.getLineEnd(i17) != this.p.getLineEnd(i17)) {
                                this.n = true;
                            } else {
                                i17++;
                            }
                        } else {
                            f12 = 0.0f;
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
                            spannableString2.setSpan(new org.telegram.ui.Components.gz(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                        } else {
                            spannableString.setSpan(new org.telegram.ui.Components.gz(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
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
                this.m = this.p.getWidth() - s1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
                z11 = s1Var.getMessageObject().getReplyMsgId() == 0 && s1Var.y9 != null;
                this.c = z11;
                if (z11) {
                    org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.ko[]) tnVar.W.b)[0].c;
                    sg.i.b(h5Var, tnVar.T0, this.O);
                    PointF pointF2 = this.O;
                    this.e = pointF2.x;
                    this.g = pointF2.y;
                    this.f = ((View) h5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.h5 h5Var2 = ((org.telegram.ui.Components.ko[]) tnVar.W.b)[0].d;
                    sg.i.b(h5Var2, tnVar.T0, this.O);
                    float f15 = this.O.y;
                    this.h = h5Var.getTextColor();
                    this.i = h5Var2.getTextColor();
                    this.j -= AndroidUtilities.dp(46.0f);
                }
                this.S = jl0Var.getPaddingBottom() - (tnVar.oc - AndroidUtilities.dp(44.0f));
                this.u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.w = s1Var.getMessageObject().stableId;
                dkVar.getEditField().setAlpha(0.0f);
                dkVar.setTextTransitionIsRunning(true);
                staticLayout2 = s1Var.y9;
                if (staticLayout2 != null && staticLayout2.getText().length() > 1 && s1Var.y9.getPrimaryHorizontal(0) != 0.0f) {
                    this.K = s1Var.y9.getWidth() - s1Var.y9.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new zv0(this, dkVar, miVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) miVar.c).add(this);
                miVar.a();
                ((ViewGroup) miVar.d).invalidate();
                this.D.lock();
                ofFloat.addListener(new org.telegram.ui.Components.p20(this, miVar, s1Var, dkVar, tnVar));
                if (SharedConfig.getDevicePerformanceClass() == 2 || (y22 = s1Var.y2(true)) == null) {
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.N);
                Rect rect = y22.o;
                if (y22.D == null) {
                    Bitmap createBitmap = Bitmap.createBitmap(y22.b(50.0f), y22.b(40.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rect.set(y22.getBounds());
                    Paint paint3 = new Paint(1);
                    paint3.setColor(-1);
                    y22.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    y22.c(canvas, paint3);
                    y22.D = new NinePatchDrawable(createBitmap, i7.n7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                    y22.setBounds(rect);
                }
                if (y22.E != v02) {
                    y22.E = v02;
                    y22.D.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
                this.F = y22.D;
                return;
            }
        } else {
            f9 = 4.0f;
        }
        z10 = false;
        if (editText.length() == charSequence.length()) {
        }
        this.n = true;
        iArr = new int[1];
        CharSequence trim2 = AndroidUtilities.trim(editText, iArr);
        if (iArr[0] <= 0) {
        }
        org.telegram.ui.Components.y5.cloneSpans(charSequence);
        charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        float textSize2 = dkVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize2;
        lineCount = dkVar.getEditField().getLayout().getLineCount();
        int width2 = (int) (dkVar.getEditField().getLayout().getWidth() / textSize2);
        if (Build.VERSION.SDK_INT < 24) {
        }
        this.H = org.telegram.ui.Components.y5.update(2, (View) null, this.H, this.p);
        sg.i.b(dkVar.getEditField(), tnVar.T0, pointF);
        float f132 = pointF.y;
        this.y = pointF.x;
        this.z = ((AndroidUtilities.dp(10.0f) + f132) - dkVar.getEditField().getScrollY()) + i10;
        this.l = 0.0f;
        f10 = Float.MAX_VALUE;
        float f142 = Float.MAX_VALUE;
        while (i11 < this.p.getLineCount()) {
        }
        if (f10 != Float.MAX_VALUE) {
        }
        this.p.getHeight();
        float dp2 = AndroidUtilities.dp(f9) + f132;
        this.j = dp2;
        if (this.G.z0()) {
        }
        this.x = f132 + dkVar.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock2 = s1Var.getMessageObject().textLayoutBlocks.get(0);
        this.E = textLayoutBlock2;
        staticLayout = textLayoutBlock2.textLayout;
        int i162 = org.telegram.ui.ActionBar.g6.fc;
        f11 = i0.a.f(org.telegram.ui.ActionBar.g6.v0(i162, this.N));
        i12 = org.telegram.ui.ActionBar.g6.Ud;
        if (Math.abs(f11 - i0.a.f(org.telegram.ui.ActionBar.g6.v0(i12, this.N))) > 0.20000000298023224d) {
        }
        this.L = org.telegram.ui.ActionBar.g6.v0(i12, this.N);
        this.M = org.telegram.ui.ActionBar.g6.v0(i162, this.N);
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
        this.m = this.p.getWidth() - s1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
        if (s1Var.getMessageObject().getReplyMsgId() == 0) {
        }
        this.c = z11;
        if (z11) {
        }
        this.S = jl0Var.getPaddingBottom() - (tnVar.oc - AndroidUtilities.dp(44.0f));
        this.u = new Matrix();
        Paint paint22 = new Paint(1);
        this.v = paint22;
        paint22.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient2;
        paint22.setShader(linearGradient2);
        this.w = s1Var.getMessageObject().stableId;
        dkVar.getEditField().setAlpha(0.0f);
        dkVar.setTextTransitionIsRunning(true);
        staticLayout2 = s1Var.y9;
        if (staticLayout2 != null) {
            this.K = s1Var.y9.getWidth() - s1Var.y9.getLineWidth(0);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat2;
        ofFloat2.addUpdateListener(new zv0(this, dkVar, miVar, 1));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(250L);
        ((ArrayList) miVar.c).add(this);
        miVar.a();
        ((ViewGroup) miVar.d).invalidate();
        this.D.lock();
        ofFloat2.addListener(new org.telegram.ui.Components.p20(this, miVar, s1Var, dkVar, tnVar));
        if (SharedConfig.getDevicePerformanceClass() == 2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x03d9, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.caption) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03f1, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r11.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0446, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.caption) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x045e, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r11.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0755  */
    @Override // org.telegram.ui.kh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        int i10;
        float f9;
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
        tn tnVar;
        ImageReceiver imageReceiver;
        float f19;
        float f20;
        float f21;
        MessageObject messageObject;
        float f22;
        float f23;
        int i11;
        da1 da1Var;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        tn tnVar2;
        float f31;
        float f32;
        float f33;
        boolean z10;
        int i12;
        float f34;
        float f35;
        float f36;
        org.telegram.ui.Cells.s1 s1Var;
        boolean z11;
        float f37;
        float f38;
        float f39;
        float f40;
        MessageObject.TextLayoutBlock textLayoutBlock;
        org.telegram.ui.Cells.r1 r1Var;
        float f41;
        Canvas canvas3;
        float f42;
        float f43;
        int i13;
        float f44;
        float f45;
        boolean z12;
        int v02;
        int i14;
        MessageObject messageObject2;
        int v03;
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
        org.telegram.ui.Components.jl0 jl0Var = this.s;
        float y8 = jl0Var.getY();
        org.telegram.ui.Components.mi miVar = this.t;
        float y10 = (y8 - miVar.getY()) + jl0Var.getMeasuredHeight();
        float x4 = this.y - miVar.getX();
        float y11 = this.z - miVar.getY();
        org.telegram.ui.Cells.s1 s1Var2 = this.r;
        int textX = s1Var2.getTextX();
        org.telegram.ui.Cells.r1 r1Var2 = s1Var2.Vc;
        ImageReceiver imageReceiver2 = s1Var2.B9;
        ArrayList arrayList = s1Var2.Hd;
        this.I = textX;
        this.J = s1Var2.getTextY();
        if (s1Var2.getMessageObject().stableId != this.w) {
            return;
        }
        float x10 = (jl0Var.getX() + s1Var2.getX()) - miVar.getX();
        float top = ((jl0Var.getTop() + (s1Var2.getPaddingTop() + s1Var2.getTop())) - miVar.getY()) - (this.S - jl0Var.getPaddingBottom());
        float interpolation = uh.m.V.getInterpolation(this.a);
        float f52 = this.a;
        float f53 = f52 > 0.4f ? 1.0f : f52 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.jr.g.getInterpolation(org.telegram.ui.Components.jr.h.getInterpolation(f52));
        float f54 = this.I + x10;
        float f55 = this.J + top;
        float f56 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y10 * interpolation2) + (miVar.getMeasuredHeight() * f56));
        boolean z13 = s1Var2.getBottom() - AndroidUtilities.dp(4.0f) > jl0Var.getMeasuredHeight() && (((float) s1Var2.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && miVar.getMeasuredHeight() > 0;
        if (z13) {
            i10 = measuredHeight;
            f10 = interpolation2;
            f13 = interpolation;
            f14 = f55;
            f15 = f54;
            f16 = x10;
            f11 = f56;
            f12 = f53;
            f9 = top;
            f17 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), miVar.getMeasuredWidth(), miVar.getMeasuredHeight(), 255, 31);
        } else {
            i10 = measuredHeight;
            f9 = top;
            f10 = interpolation2;
            f11 = f56;
            f12 = f53;
            f13 = interpolation;
            f14 = f55;
            f15 = f54;
            f16 = x10;
            f17 = 0.0f;
            canvas2 = canvas;
        }
        canvas2.save();
        float y12 = jl0Var.getY();
        tn tnVar3 = this.A;
        canvas2.clipRect(f17, ((tnVar3.o9 + y12) - miVar.getY()) - AndroidUtilities.dp(3.0f), miVar.getMeasuredWidth(), miVar.getMeasuredHeight());
        canvas2.save();
        float f57 = f16;
        float f58 = this.l;
        float f59 = f15;
        float backgroundDrawableLeft = s1Var2.getBackgroundDrawableLeft() + f57 + ((x4 - (f59 - f58)) * f11);
        float f60 = f9;
        float backgroundDrawableTop = s1Var2.getBackgroundDrawableTop() + f60;
        float y13 = this.j - miVar.getY();
        float f61 = f13;
        float f62 = 1.0f - f61;
        float f63 = (backgroundDrawableTop * f61) + (y13 * f62);
        float y14 = ((this.x - miVar.getY()) * f62) + ((backgroundDrawableTop + (s1Var2.getBackgroundDrawableBottom() - s1Var2.getBackgroundDrawableTop())) * f61);
        int dp = (int) ((AndroidUtilities.dp(4.0f) * f11) + s1Var2.getBackgroundDrawableRight() + f57);
        MessageObject messageObject3 = this.k;
        org.telegram.ui.ActionBar.d5 y22 = !messageObject3.isAnimatedEmojiStickers() ? s1Var2.y2(true) : null;
        if (y22 != null) {
            imageReceiver = imageReceiver2;
            s1Var2.setBackgroundTopY(miVar.getTop() - jl0Var.getTop());
            Drawable j10 = y22.j();
            f18 = f57;
            f20 = f12;
            if (f20 != 1.0f) {
                f19 = f61;
                NinePatchDrawable ninePatchDrawable = this.F;
                if (ninePatchDrawable != null) {
                    messageObject = messageObject3;
                    tnVar = tnVar3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) f63, dp, (int) y14);
                    ninePatchDrawable.draw(canvas2);
                    f21 = f10;
                    if (j10 != null) {
                        j10.setAlpha((int) (f21 * 255.0f));
                        j10.setBounds((int) backgroundDrawableLeft, (int) f63, dp, (int) y14);
                        j10.draw(canvas2);
                        j10.setAlpha(255);
                    }
                    y22.setAlpha((int) (f20 * 255.0f));
                    y22.setBounds((int) backgroundDrawableLeft, (int) f63, dp, (int) y14);
                    y22.G = true;
                    y22.draw(canvas2);
                    y22.G = false;
                    y22.setAlpha(255);
                } else {
                    tnVar = tnVar3;
                }
            } else {
                tnVar = tnVar3;
                f19 = f61;
            }
            messageObject = messageObject3;
            f21 = f10;
            if (j10 != null) {
            }
            y22.setAlpha((int) (f20 * 255.0f));
            y22.setBounds((int) backgroundDrawableLeft, (int) f63, dp, (int) y14);
            y22.G = true;
            y22.draw(canvas2);
            y22.G = false;
            y22.setAlpha(255);
        } else {
            f18 = f57;
            tnVar = tnVar3;
            imageReceiver = imageReceiver2;
            f19 = f61;
            f20 = f12;
            f21 = f10;
            messageObject = messageObject3;
        }
        canvas2.restore();
        canvas2.save();
        if (y22 != null) {
            if (messageObject.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f63, dp - AndroidUtilities.dp(10.0f), y14 - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f63, dp - AndroidUtilities.dp(4.0f), y14 - AndroidUtilities.dp(4.0f));
            }
        }
        float x11 = (jl0Var.getX() + s1Var2.getLeft()) - miVar.getX();
        float f64 = f14;
        float z14 = com.google.android.recaptcha.internal.a.z(y11, f64, f62, f60);
        canvas2.translate(x11, z14);
        s1Var2.m2(f20, canvas2, false);
        s1Var2.W1(canvas2, f20);
        s1Var2.M1(canvas2, f20);
        s1Var2.I1(f20, canvas2, false);
        s1Var2.d2(canvas2, f20, null);
        s1Var2.N1(canvas2, f20);
        s1Var2.T1(canvas2, f20);
        canvas2.restore();
        if (this.c) {
            tn tnVar4 = tnVar;
            ((org.telegram.ui.Components.ko[]) tnVar4.W.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.ko[]) tnVar4.W.b)[0].d.setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), s1Var2.E9, f21);
            int dp2 = AndroidUtilities.dp(10.0f);
            float x12 = this.e - miVar.getX();
            float y15 = this.g - miVar.getY();
            f31 = backgroundDrawableLeft;
            float f65 = f18 + s1Var2.C9;
            float f66 = f20;
            float f67 = s1Var2.D9 + f60;
            if (s1Var2.X9 == null) {
                s1Var2.X9 = new org.telegram.ui.Components.ql0(s1Var2);
            }
            f23 = y14;
            s1Var2.X9.a(s1Var2.getMessageObject(), s1Var2.getCurrentUser(), s1Var2.getCurrentChat(), this.N, 0);
            boolean shouldDrawWithoutBackground = messageObject.shouldDrawWithoutBackground();
            org.telegram.ui.ActionBar.c6 c6Var = this.N;
            if (shouldDrawWithoutBackground) {
                v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xc, c6Var);
                b(org.telegram.ui.ActionBar.g6.Vc);
            } else {
                org.telegram.ui.Components.ql0 ql0Var = s1Var2.X9;
                if (ql0Var != null) {
                    i14 = ql0Var.I.c;
                    if (!messageObject.shouldDrawWithoutBackground()) {
                        i11 = dp;
                        f24 = f63;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f26 = f62;
                        org.telegram.ui.Components.ql0 ql0Var2 = s1Var2.X9;
                        if (ql0Var2 != null) {
                            v03 = ql0Var2.I.c;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject4 = messageObject2.replyMessageObject;
                                if (messageObject4.type == 0 || !TextUtils.isEmpty(messageObject4.caption)) {
                                    TLRPC.MessageMedia messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.db, c6Var);
                                    }
                                }
                            }
                            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.eb, c6Var);
                        }
                    } else if (!messageObject.isOutOwner()) {
                        i11 = dp;
                        f24 = f63;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f26 = f62;
                        if (!messageObject2.isReplyToStory()) {
                            int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yc, c6Var);
                            if (!messageObject2.forceAvatar) {
                                if (messageObject2.hasValidReplyMessageObject()) {
                                    MessageObject messageObject5 = messageObject2.replyMessageObject;
                                    if (messageObject5.type != 0) {
                                    }
                                    if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!s1Var2.v9) {
                                    i16 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Zc, c6Var);
                                    f50 = 0.6f;
                                    v03 = i0.a.d(f50, i16, org.telegram.ui.ActionBar.g6.c(i16, i14));
                                }
                            }
                            i16 = v04;
                            f50 = 0.0f;
                            v03 = i0.a.d(f50, i16, org.telegram.ui.ActionBar.g6.c(i16, i14));
                        }
                        v03 = i14;
                    } else if (messageObject.isReplyToStory()) {
                        i11 = dp;
                        f24 = f63;
                        f25 = y11;
                        messageObject2 = messageObject;
                        f26 = f62;
                        v03 = i14;
                    } else {
                        i11 = dp;
                        int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.db, c6Var);
                        f24 = f63;
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
                            if (!s1Var2.v9) {
                                i17 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.eb, c6Var);
                                f51 = 0.6f;
                                f26 = f62;
                                v03 = i0.a.d(f51, i17, org.telegram.ui.ActionBar.g6.c(i17, i14));
                            }
                        }
                        i17 = v05;
                        f51 = 0.0f;
                        f26 = f62;
                        v03 = i0.a.d(f51, i17, org.telegram.ui.ActionBar.g6.c(i17, i14));
                    }
                    MessageObject messageObject7 = messageObject2;
                    f29 = f19;
                    org.telegram.ui.ActionBar.g6.Z2.setColor(i0.a.d(f29, this.i, v03));
                    org.telegram.ui.ActionBar.g6.Y2.setColor(i0.a.d(f29, this.h, i14));
                    float dp3 = !s1Var2.L9 ? x12 - AndroidUtilities.dp(44.0f) : x12;
                    float lerp = AndroidUtilities.lerp(dp3, f65, f21);
                    float lerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f29) + y15, f67, f29);
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
                    rectF2.set(dp3, y15, this.f + dp3, AndroidUtilities.dp(35.0f) + y15);
                    rectF2.offset(0.0f, AndroidUtilities.dp(12.0f) * f29);
                    RectF rectF3 = s1Var2.xc;
                    RectF rectF4 = this.Q;
                    rectF4.set(rectF3);
                    rectF4.offset(f18, z14);
                    RectF rectF5 = this.P;
                    AndroidUtilities.lerp(rectF2, rectF4, f21, rectF5);
                    f27 = f59;
                    f28 = f58;
                    f33 = f64;
                    s1Var2.X9.d(canvas, rectF5, f66, s1Var2.v9, s1Var2.getMessageObject().shouldDrawWithoutBackground());
                    canvas2 = canvas;
                    s1Var2.X9.e(canvas2, rectF5, f66);
                    if (s1Var2.L9) {
                        f46 = f66;
                        f47 = 0.0f;
                    } else {
                        canvas2.save();
                        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(rectF5.height() - AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.Z2.getTextSize() + org.telegram.ui.ActionBar.g6.Y2.getTextSize() + AndroidUtilities.dp(s1Var2.v9 ? 3.0f : 7.0f)), f21);
                        float lerp4 = AndroidUtilities.lerp(lerp, rectF5.left + AndroidUtilities.dp(8.0f), f21);
                        float f68 = rectF5.top;
                        if (!s1Var2.v9 || (staticLayout = s1Var2.z9) == null) {
                            f46 = f66;
                        } else {
                            f46 = f66;
                            if (staticLayout.getLineCount() <= 1) {
                                i15 = 2;
                                float lerp5 = AndroidUtilities.lerp(lerp2, f68 + AndroidUtilities.dp(i15 + 5), f21);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.setImageCoords(lerp4, lerp5, lerp3, lerp3);
                                imageReceiver3.draw(canvas2);
                                canvas2.restore();
                                f47 = lerp3;
                            }
                        }
                        i15 = 0;
                        float lerp52 = AndroidUtilities.lerp(lerp2, f68 + AndroidUtilities.dp(i15 + 5), f21);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.setImageCoords(lerp4, lerp52, lerp3, lerp3);
                        imageReceiver32.draw(canvas2);
                        canvas2.restore();
                        f47 = lerp3;
                    }
                    canvas2.save();
                    float f69 = dp2 * f21;
                    canvas2.translate(f69, 0.0f);
                    float f70 = -(!messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
                    float dp5 = !messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
                    float f71 = s1Var2.J9;
                    float f72 = (f65 - f71) + f70;
                    float f73 = (f65 - this.K) + f70;
                    AndroidUtilities.lerp(dp3 - f71, f72, f21);
                    float lerp6 = AndroidUtilities.lerp(dp3, f73, f21) + (!s1Var2.L9 ? AndroidUtilities.dp(3.0f) + f47 : 0.0f);
                    if (s1Var2.y9 == null) {
                        canvas2.save();
                        canvas2.translate(lerp6, (dp5 * f21) + lerp2);
                        int alpha = org.telegram.ui.ActionBar.g6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.g6.Y2.setAlpha((int) (alpha * f21));
                        s1Var2.y9.draw(canvas2);
                        org.telegram.ui.ActionBar.g6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.ko[]) tnVar4.W.b)[0].c;
                        f48 = f69;
                        tnVar2 = tnVar4;
                        rectF = rectF5;
                        f22 = f46;
                        f49 = f72;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, h5Var.getWidth(), h5Var.getHeight(), (int) (f11 * 255.0f), 31);
                        h5Var.setAlpha(1.0f);
                        h5Var.draw(canvas2);
                        h5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        tnVar2 = tnVar4;
                        f48 = f69;
                        rectF = rectF5;
                        f49 = f72;
                        f22 = f46;
                    }
                    if (s1Var2.v9 && s1Var2.r9 != null) {
                        if (s1Var2.X9.h() != s1Var2.o9) {
                            Drawable drawable = s1Var2.r9;
                            int h = s1Var2.X9.h();
                            s1Var2.o9 = h;
                            drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
                        }
                        s1Var2.r9.setBounds((int) (((rectF.right - f48) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)) - s1Var2.r9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) ((rectF.right - f48) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2) + s1Var2.r9.getIntrinsicHeight()));
                        s1Var2.r9.setAlpha((int) (f21 * 255.0f));
                        s1Var2.r9.draw(canvas2);
                    }
                    if (s1Var2.z9 == null) {
                        canvas2.save();
                        float lerp7 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), org.telegram.ui.ActionBar.g6.Y2.getTextSize() + AndroidUtilities.dp(4.0f) + dp5, f21) + lerp2;
                        float dp6 = (s1Var2.v9 && s1Var2.L9) ? f49 - AndroidUtilities.dp(2.0f) : f49;
                        if (s1Var2.L9 && (!s1Var2.v9 || s1Var2.K9)) {
                            dp6 += f47 + AndroidUtilities.dp(3.0f);
                        }
                        if (s1Var2.w9 && s1Var2.x9 != null) {
                            float lerp8 = AndroidUtilities.lerp(dp3 - s1Var2.J9, dp6, f21);
                            s1Var2.x9.e((int) lerp8, AndroidUtilities.dp(2.0f) + ((int) lerp7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                            org.telegram.ui.ActionBar.g6.X1.setColor(org.telegram.ui.ActionBar.g6.v0(messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.g6.Ta : org.telegram.ui.ActionBar.g6.Ac, c6Var));
                            canvas2.drawCircle(lerp8 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + lerp7, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.X1);
                            s1Var2.x9.h(-1, messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.g6.zb : org.telegram.ui.ActionBar.g6.xd, org.telegram.ui.ActionBar.g6.k7);
                            CheckBoxBase checkBoxBase = s1Var2.x9;
                            if (checkBoxBase.h != f29) {
                                checkBoxBase.h = f29;
                                checkBoxBase.b();
                            }
                            s1Var2.x9.a(canvas2);
                        }
                        if (s1Var2.w9) {
                            dp6 += AndroidUtilities.dp(16.0f);
                        }
                        if (s1Var2.K9 && s1Var2.J9 > 0) {
                            dp6 = ((rectF.right - AndroidUtilities.dp(8.0f)) - s1Var2.z9.getWidth()) - f48;
                        }
                        canvas2.translate(AndroidUtilities.lerp(dp3 - s1Var2.J9, dp6, f21), lerp7);
                        canvas2.save();
                        gh.k.d(canvas2, arrayList);
                        da1Var = this;
                        f32 = z14;
                        f30 = f11;
                        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, s1Var2.z9, s1Var2.mc, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                        s1Var2.z9.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj = arrayList.get(i18);
                            i18++;
                            gh.k kVar = (gh.k) obj;
                            boolean z15 = kVar.p;
                            kVar.p = false;
                            if (z15) {
                                kVar.h(s1Var2.z9.getPaint().getColor());
                            }
                            kVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        da1Var = this;
                        f32 = z14;
                        f30 = f11;
                    }
                    canvas2.restore();
                } else if (messageObject.isOutOwner()) {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cb, c6Var);
                    b(org.telegram.ui.ActionBar.g6.ab);
                } else {
                    v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
                    b(org.telegram.ui.ActionBar.g6.Uc);
                }
            }
            i14 = v02;
            if (!messageObject.shouldDrawWithoutBackground()) {
            }
            MessageObject messageObject72 = messageObject2;
            f29 = f19;
            org.telegram.ui.ActionBar.g6.Z2.setColor(i0.a.d(f29, this.i, v03));
            org.telegram.ui.ActionBar.g6.Y2.setColor(i0.a.d(f29, this.h, i14));
            if (!s1Var2.L9) {
            }
            float lerp9 = AndroidUtilities.lerp(dp3, f65, f21);
            float lerp22 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f29) + y15, f67, f29);
            if (this.R == null) {
            }
            RectF rectF22 = AndroidUtilities.rectTmp;
            rectF22.set(dp3, y15, this.f + dp3, AndroidUtilities.dp(35.0f) + y15);
            rectF22.offset(0.0f, AndroidUtilities.dp(12.0f) * f29);
            RectF rectF32 = s1Var2.xc;
            RectF rectF42 = this.Q;
            rectF42.set(rectF32);
            rectF42.offset(f18, z14);
            RectF rectF52 = this.P;
            AndroidUtilities.lerp(rectF22, rectF42, f21, rectF52);
            f27 = f59;
            f28 = f58;
            f33 = f64;
            s1Var2.X9.d(canvas, rectF52, f66, s1Var2.v9, s1Var2.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            s1Var2.X9.e(canvas2, rectF52, f66);
            if (s1Var2.L9) {
            }
            canvas2.save();
            float f692 = dp2 * f21;
            canvas2.translate(f692, 0.0f);
            float f702 = -(!messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
            float dp52 = !messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
            float f712 = s1Var2.J9;
            float f722 = (f65 - f712) + f702;
            float f732 = (f65 - this.K) + f702;
            AndroidUtilities.lerp(dp3 - f712, f722, f21);
            float lerp62 = AndroidUtilities.lerp(dp3, f732, f21) + (!s1Var2.L9 ? AndroidUtilities.dp(3.0f) + f47 : 0.0f);
            if (s1Var2.y9 == null) {
            }
            if (s1Var2.v9) {
                if (s1Var2.X9.h() != s1Var2.o9) {
                }
                s1Var2.r9.setBounds((int) (((rectF.right - f48) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)) - s1Var2.r9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) ((rectF.right - f48) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2) + s1Var2.r9.getIntrinsicHeight()));
                s1Var2.r9.setAlpha((int) (f21 * 255.0f));
                s1Var2.r9.draw(canvas2);
            }
            if (s1Var2.z9 == null) {
            }
            canvas2.restore();
        } else {
            f22 = f20;
            f23 = y14;
            i11 = dp;
            da1Var = this;
            f24 = f63;
            f25 = y11;
            f26 = f62;
            f27 = f59;
            f28 = f58;
            f29 = f19;
            f30 = f11;
            tnVar2 = tnVar;
            f31 = backgroundDrawableLeft;
            f32 = z14;
            f33 = f64;
        }
        canvas2.save();
        if (s1Var2.getMessageObject() == null || s1Var2.getMessageObject().type != 19) {
            canvas2.clipRect(f31 + AndroidUtilities.dp(4.0f), f24 + AndroidUtilities.dp(4.0f), i11 - AndroidUtilities.dp(4.0f), f23 - AndroidUtilities.dp(4.0f));
        }
        float f74 = (da1Var.C * f30) + f21;
        canvas2.save();
        float f75 = x4 * f30;
        float f76 = f27;
        float z16 = com.google.android.recaptcha.internal.a.z(f76, f28, f21, f75);
        float f77 = f25 * f26;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = s1Var2.getMessageObject().textLayoutBlocks;
        MessageObject.TextLayoutBlock textLayoutBlock2 = da1Var.E;
        canvas2.translate(z16, ((textLayoutBlock2.textYOffset(arrayList2, r1Var2) + f33) * f29) + f77);
        float f78 = f74 * 1.0f;
        canvas2.scale(f74, f78, 0.0f, 0.0f);
        boolean z17 = da1Var.o;
        int i19 = da1Var.M;
        boolean z18 = da1Var.n;
        StaticLayout staticLayout2 = da1Var.p;
        if (z18 && z17) {
            int color = staticLayout2.getPaint().getColor();
            float f79 = f22;
            staticLayout2.getPaint().setColor(i0.a.d(f79, da1Var.L, i19));
            float f80 = 1.0f - f79;
            f34 = f29;
            f35 = f30;
            i12 = i19;
            f38 = f79;
            z10 = z17;
            r1Var = r1Var2;
            z11 = z18;
            textLayoutBlock = textLayoutBlock2;
            f36 = f32;
            s1Var = s1Var2;
            f39 = f76;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f80 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f37 = f74;
            f40 = f78;
            f41 = f75;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, da1Var.p, da1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f80);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            z10 = z17;
            i12 = i19;
            f34 = f29;
            f35 = f30;
            f36 = f32;
            s1Var = s1Var2;
            z11 = z18;
            f37 = f74;
            f38 = f22;
            f39 = f76;
            f40 = f78;
            textLayoutBlock = textLayoutBlock2;
            r1Var = r1Var2;
            f41 = f75;
            if (z11) {
                float f81 = 1.0f - f38;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f81 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas3, da1Var.p, da1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f81);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas3, da1Var.p, da1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = da1Var.q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(com.google.android.recaptcha.internal.a.z(f39, da1Var.m, f21, f41), ((textLayoutBlock.textYOffset(s1Var.getMessageObject().textLayoutBlocks, r1Var) + f33) * f34) + f77);
            f42 = f40;
            f44 = f37;
            canvas3.scale(f44, f42, 0.0f, 0.0f);
            if (z11 && z10) {
                int color2 = staticLayout3.getPaint().getColor();
                f43 = f38;
                i13 = i12;
                staticLayout3.getPaint().setColor(i0.a.k(i0.a.d(f43, da1Var.L, i13), (int) ((1.0f - f43) * Color.alpha(color2))));
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
            canvas3.translate(com.google.android.recaptcha.internal.a.z(x4, f39, f35, (jl0Var.getX() + s1Var.getLeft()) - miVar.getX()), f36);
            canvas3.scale(f44, f42, s1Var.getTextX(), s1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.g6.o2.getColor();
            org.telegram.ui.ActionBar.g6.o2.setColor(i13);
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var.getMessageObject().textLayoutBlocks;
            org.telegram.ui.Cells.s1 s1Var3 = s1Var;
            float f82 = s1Var3.n0;
            org.telegram.ui.Cells.r1 r1Var3 = s1Var3.Vc;
            if (r1Var3.l2) {
                float f83 = r1Var3.n2;
                float f84 = r1Var3.K1;
                f82 = (f82 * f84) + ((1.0f - f84) * f83);
            }
            float f85 = s1Var3.j0;
            MessageObject messageObject8 = s1Var3.u7;
            Canvas canvas4 = canvas3;
            f45 = 0.0f;
            z12 = false;
            s1Var3.U1(f85, f82, canvas4, arrayList3, messageObject8 == null ? 0.0f : messageObject8.textXOffset, true, f43, false, true, false, false);
            canvas3 = canvas4;
            s1Var3.A1(canvas3, f43);
            if (org.telegram.ui.ActionBar.g6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.g6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            f45 = 0.0f;
            z12 = false;
        }
        canvas3.restore();
        if (z13) {
            float f86 = i10;
            da1Var.u.setTranslate(f45, f86);
            da1Var.B.setLocalMatrix(da1Var.u);
            canvas3.drawRect(0.0f, f86, miVar.getMeasuredWidth(), miVar.getMeasuredHeight(), da1Var.v);
            canvas3.restore();
        }
        float f87 = da1Var.a;
        float f88 = f87 > 0.4f ? 1.0f : f87 / 0.4f;
        dk dkVar = da1Var.G;
        if (f88 == 1.0f) {
            dkVar.setTextTransitionIsRunning(z12);
        }
        if (dkVar.getSendButton().getVisibility() != 0 || f88 >= 1.0f) {
            return;
        }
        View sendButton = dkVar.getSendButton();
        km kmVar = tnVar2.T0;
        PointF pointF = da1Var.O;
        sg.i.b(sendButton, kmVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - miVar.getX(), pointF.y - miVar.getY());
        View sendButton2 = dkVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f88) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.N);
    }
}
