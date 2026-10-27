package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class mp0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static float[] k0;
    public static Path l0;
    public float E;
    public final org.telegram.ui.Cells.y F;
    public float G;
    public final int[] H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.u6 N;
    public final d8 O;
    public boolean P;
    public float Q;
    public float R;
    public int S;
    public ArrayList T;
    public CharSequence U;
    public long V;
    public float W;
    public int a;
    public int a0;
    public final org.telegram.ui.Cells.e1 b;
    public StaticLayout[] b0;
    public final Paint c;
    public TextPaint c0;
    public final Paint d;
    public float d0;
    public final int e;
    public int e0;
    public final int f;
    public long f0;
    public float g0;
    public int h;
    public final RectF h0;
    public int i0;
    public int j0;
    public final h6 n;
    public int r;
    public float s;
    public float v;
    public boolean w;
    public lp0 x;
    public boolean y;

    public mp0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10 = this.f;
        return (int) (Math.abs(((i10 / 2.0f) + (this.V > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (i10 / 2.0f)) - (this.V > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.i0 != i10) {
            this.i0 = i10;
            if (i10 < 0 || i10 >= this.T.size()) {
                return;
            }
            this.O.setText((CharSequence) ((Pair) this.T.get(this.i0)).second);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0175, code lost:
    
        if (r14.left >= r27.left) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de A[EDGE_INSN: B:70:0x01de->B:71:0x01de BREAK  A[LOOP:2: B:27:0x00a8->B:75:0x01d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        int i10;
        char c10;
        float floatValue;
        ?? r17;
        char c11;
        mp0 mp0Var = this;
        float dp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = mp0Var.T;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f7 = rectF.bottom;
        int i11 = mp0Var.f;
        float f10 = i11 / 2.0f;
        float measuredWidth = mp0Var.getMeasuredWidth() - (i11 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(mp0Var.W * 1.0f) / 2.0f;
        if (l0 == null) {
            l0 = new Path();
        }
        l0.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f10);
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= mp0Var.T.size()) {
                i12 = -1;
                break;
            } else if (((Float) ((Pair) mp0Var.T.get(i12)).first).floatValue() >= dp3) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            i12 = 0;
        }
        boolean z10 = true;
        int size = mp0Var.T.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) mp0Var.T.get(size)).first).floatValue() >= dp3) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        if (i10 < 0) {
            i10 = mp0Var.T.size();
        }
        int i13 = i12;
        while (i13 <= i10) {
            if (i13 == i12) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) mp0Var.T.get(i13 - 1)).first).floatValue();
            }
            float floatValue2 = i13 == i10 ? 1.0f : ((Float) ((Pair) mp0Var.T.get(i13)).first).floatValue();
            while (i13 != i10 && i13 != 0) {
                r17 = z10;
                if (i13 >= mp0Var.T.size() - 1 || ((Float) ((Pair) mp0Var.T.get(i13)).first).floatValue() - floatValue > dp3) {
                    break;
                }
                i13++;
                floatValue2 = ((Float) ((Pair) mp0Var.T.get(i13)).first).floatValue();
                z10 = r17 == true ? 1 : 0;
            }
            r17 = z10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f10, measuredWidth, floatValue) + (i13 > 0 ? dp2 : 0.0f);
            float lerp = AndroidUtilities.lerp(f10, measuredWidth, floatValue2) - (i13 < i10 ? dp2 : 0.0f);
            rectF2.right = lerp;
            float f11 = rectF.right;
            char c12 = lerp > f11 ? r17 : c10;
            if (c12 != 0) {
                rectF2.right = f11;
            }
            float f12 = rectF2.right;
            float f13 = rectF.left;
            if (f12 >= f13) {
                if (rectF2.left < f13) {
                    rectF2.left = f13;
                }
                if (k0 == null) {
                    k0 = new float[8];
                }
                if (i13 != i12) {
                    if (c12 != 0) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i13 >= i10) {
                        float[] fArr = k0;
                        float f14 = 0.7f * dp * mp0Var.W;
                        fArr[7] = f14;
                        fArr[6] = f14;
                        fArr[r17] = f14;
                        fArr[c10] = f14;
                        fArr[5] = dp;
                        fArr[c11] = dp;
                        fArr[3] = dp;
                        fArr[2] = dp;
                    } else {
                        float[] fArr2 = k0;
                        float f15 = 0.7f * dp * mp0Var.W;
                        fArr2[5] = f15;
                        fArr2[c11] = f15;
                        fArr2[3] = f15;
                        fArr2[2] = f15;
                        fArr2[7] = f15;
                        fArr2[6] = f15;
                        fArr2[r17] = f15;
                        fArr2[c10] = f15;
                    }
                    l0.addRoundRect(rectF2, k0, Path.Direction.CW);
                    if (c12 == 0) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = k0;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[r17] = dp;
                fArr3[c10] = dp;
                float f16 = 0.7f * dp * mp0Var.W;
                fArr3[5] = f16;
                fArr3[c11] = f16;
                fArr3[3] = f16;
                fArr3[2] = f16;
                l0.addRoundRect(rectF2, k0, Path.Direction.CW);
                if (c12 == 0) {
                }
            }
            i13++;
            mp0Var = this;
            z10 = r17;
        }
        canvas.drawPath(l0, paint);
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        if (this.c0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.c0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.c0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Si, this.N));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.c0, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
    }

    public final int c() {
        return Math.max((int) (this.v * (getMeasuredWidth() - this.f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.F;
        int i10 = this.e;
        int i11 = this.f;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.P = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.R) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i10) / 2;
                    if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i10 + measuredHeight) {
                        int x9 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.h = x9;
                        if (x9 < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i11) {
                            this.h = getMeasuredWidth() - i11;
                        }
                    }
                    this.r = (int) (motionEvent.getX() - this.h);
                    this.w = true;
                }
            }
            if (this.w) {
                if (motionEvent.getAction() == 1) {
                    if (this.M) {
                        float measuredWidth = (getMeasuredWidth() - i11) / 2;
                        float f7 = this.h;
                        if (f7 >= measuredWidth) {
                            f((f7 - measuredWidth) / measuredWidth, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth - f7) / measuredWidth)), false);
                        }
                    } else {
                        f(this.h / (getMeasuredWidth() - i11), true);
                    }
                }
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
                this.x.y();
                this.w = false;
                AndroidUtilities.runOnUIThread(new xa0(this, 29), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.P) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.R) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.Q) > viewConfiguration.getScaledTouchSlop()) {
                    this.P = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i10 + measuredHeight2) {
                            int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                            this.h = x10;
                            if (x10 < c()) {
                                this.h = c();
                            } else if (this.h > getMeasuredWidth() - i11) {
                                this.h = getMeasuredWidth() - i11;
                            }
                        }
                        this.r = (int) (motionEvent.getX() - this.h);
                        this.w = true;
                        this.x.y();
                        if (yVar != null) {
                            yVar.setState(this.H);
                            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.w) {
                int x11 = (int) (motionEvent.getX() - this.r);
                this.h = x11;
                if (x11 < c()) {
                    this.h = c();
                } else if (this.h > getMeasuredWidth() - i11) {
                    this.h = getMeasuredWidth() - i11;
                }
                if (this.y) {
                    if (this.M) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.h;
                        if (f10 >= measuredWidth2) {
                            f((f10 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f10) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.h / (getMeasuredWidth() - i11), false);
                    }
                }
                if (yVar != null) {
                    yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f7, boolean z10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.s = f7;
            return;
        }
        this.s = -100.0f;
        boolean z11 = this.M;
        int i10 = this.f;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            ceil = f7 < 0.0f ? Math.ceil(((-(f7 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f7 * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f7);
        }
        int i11 = (int) ceil;
        int i12 = this.h;
        if (i12 != i11) {
            if (z10) {
                this.J = i12;
                this.I = 0.0f;
            }
            this.h = i11;
            if (i11 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i10) {
                this.h = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        lp0 lp0Var = this.x;
        if (lp0Var != null) {
            lp0Var.U(f7, z10);
        }
        if (this.K > 1) {
            int round = Math.round((r0 - 1) * f7);
            if (!z10 && round != this.S) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.S = round;
        }
    }

    public final void g(MessageObject messageObject) {
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.T = null;
            this.a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr = this.b0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        CharSequence charSequence = messageObject.caption;
        if (messageObject.isYouTubeVideo()) {
            if (messageObject.youtubeDescription == null && (str = messageObject.messageOwner.media.webpage.description) != null) {
                messageObject.youtubeDescription = SpannableString.valueOf(str);
                MessageObject.addUrlsByPattern(messageObject.isOut(), messageObject.youtubeDescription, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = messageObject.youtubeDescription;
        }
        boolean z10 = charSequence != this.U;
        if (z10 || this.V != valueOf.longValue()) {
            this.U = charSequence;
            this.V = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.j0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.T = null;
                this.a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.b0;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                y61[] y61VarArr = (y61[]) spanned.getSpans(0, spanned.length(), y61.class);
                this.T = new ArrayList();
                if (z10) {
                    this.W = 0.0f;
                }
                if (this.c0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.c0 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.c0.setColor(-1);
                }
                for (y61 y61Var : y61VarArr) {
                    if (y61Var != null && y61Var.getURL() != null && y61Var.d != null && y61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) y61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y61Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.c0.getFontMetricsInt(), false);
                        this.T.add(new Pair(Float.valueOf((parseInt.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                    }
                }
                Collections.sort(this.T, new org.telegram.ui.ActionBar.n4(22));
            } catch (Exception e) {
                FileLog.e(e);
                this.T = null;
                this.a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.b0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        return getMeasuredWidth() == 0 ? this.s : this.h / (getMeasuredWidth() - this.f);
    }

    public kp0 getSeekBarAccessibilityDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        int i10 = this.h;
        boolean z11 = this.M;
        int i11 = this.f;
        if (!z11 && this.K > 1) {
            i10 = (int) this.n.d(Math.round(i10 / r3) * ((getMeasuredWidth() - i11) / (this.K - 1.0f)), false);
        }
        int i12 = i10;
        int measuredHeight = getMeasuredHeight();
        int i13 = this.e;
        int i14 = (measuredHeight - i13) / 2;
        int i15 = org.telegram.ui.ActionBar.y6.Ti;
        org.telegram.ui.ActionBar.u6 u6Var = this.N;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
        Paint paint = this.c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f14 = i11 / 2.0f;
        int i16 = i11 / 2;
        float measuredWidth = getMeasuredWidth() - i16;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.L) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.L) / 2.0f) + measuredHeight2;
        RectF rectF = this.h0;
        rectF.set(f14, dp, measuredWidth, dp2);
        a(canvas2, rectF, paint);
        if (this.E > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ui, u6Var));
            f7 = 0.0f;
            rectF.set(f14, dp, (this.E * (getMeasuredWidth() - i11)) + f14, dp2);
            a(canvas2, rectF, paint);
        } else {
            f7 = 0.0f;
        }
        boolean z12 = this.M;
        Paint paint2 = this.d;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i12 > (getMeasuredWidth() - i11) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i16 + i12, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i16 + i12, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f14 = f14;
        } else {
            float f15 = this.v;
            if (f15 >= f7) {
                float f16 = measuredWidth - f14;
                rectF.set((f15 * f16) + f14, dp, i12 + f14, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f14, dp, (this.v * f16) + f14, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f14, dp, i12 + f14, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            int dp3 = (i16 + i12) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i13 / 2) + i14) - AndroidUtilities.dp(16.0f);
            yVar.setBounds(dp3, dp4, AndroidUtilities.dp(32.0f) + dp3, AndroidUtilities.dp(32.0f) + dp4);
            yVar.draw(canvas2);
        }
        int dp5 = AndroidUtilities.dp(this.w ? 8.0f : 6.0f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f17 = this.G;
        float f18 = dp5;
        if (f17 != f18) {
            f10 = 16.0f;
            if (f17 < f18) {
                f11 = 8.0f;
                float c10 = a1.g.c(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f17);
                this.G = c10;
                if (c10 > f18) {
                    this.G = f18;
                }
            } else {
                f11 = 8.0f;
                float w10 = org.telegram.messenger.wh.w(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f17);
                this.G = w10;
                if (w10 < f18) {
                    this.G = f18;
                }
            }
            z10 = true;
        } else {
            f10 = 16.0f;
            f11 = 8.0f;
            z10 = false;
        }
        float f19 = this.I;
        if (f19 < 1.0f) {
            float f20 = (elapsedRealtime / 225.0f) + f19;
            this.I = f20;
            if (f20 < 1.0f) {
                z10 = true;
            } else {
                this.I = 1.0f;
            }
        }
        float f21 = this.I;
        if (f21 < 1.0f) {
            float interpolation = 1.0f - ut.c.getInterpolation(Math.min(1.0f, f21 * 3.0f));
            float interpolation2 = ut.d.getInterpolation(this.I);
            if (interpolation > f7) {
                canvas2.drawCircle(i16 + this.J, (i13 / 2) + i14, this.G * interpolation, paint2);
            }
            canvas2.drawCircle(i16 + i12, (i13 / 2) + i14, this.G * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i16 + i12, (i13 / 2) + i14, this.G, paint2);
        }
        ArrayList arrayList = this.T;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.T.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.T.get(size)).first).floatValue() - 0.001f <= progress) {
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.b0 == null) {
                this.b0 = new StaticLayout[2];
            }
            float dp6 = (this.V > 600000 ? AndroidUtilities.dp(42.0f) : 0) + f14;
            float abs = Math.abs(dp6 - ((getMeasuredWidth() - f14) - (this.V > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
            float f22 = this.g0;
            if (f22 > f7 && Math.abs(f22 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.b0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.b0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.g0 = abs;
            if (size != this.a0) {
                StaticLayout[] staticLayoutArr3 = this.b0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.w) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size < 0 || size >= this.T.size()) {
                    this.b0[0] = null;
                } else {
                    CharSequence charSequence = (CharSequence) ((Pair) this.T.get(size)).second;
                    if (charSequence == null) {
                        this.b0[0] = null;
                    } else {
                        this.b0[0] = b((int) abs, charSequence);
                    }
                }
                this.d0 = f7;
                if (size == -1) {
                    this.e0 = -1;
                } else {
                    int i17 = this.a0;
                    if (i17 == -1) {
                        this.e0 = 1;
                    } else if (size < i17) {
                        this.e0 = -1;
                    } else if (size > i17) {
                        this.e0 = 1;
                    }
                }
                this.a0 = size;
            }
            if (this.d0 < 1.0f) {
                this.d0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f0)) / (this.T.size() > 8 ? 160.0f : 220.0f)) + this.d0, 1.0f);
                invalidate();
                this.f0 = SystemClock.elapsedRealtime();
            }
            if (this.W < 1.0f) {
                this.W = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f0)) / 200.0f) + this.W, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = ds.f.getInterpolation(this.d0);
            canvas2.save();
            canvas2.translate(dp6 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.c0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Si, u6Var));
            if (this.b0[1] != null) {
                canvas2.save();
                if (this.e0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f10) * (-this.e0) * interpolation3) + AndroidUtilities.dp(f11), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.b0[1].getHeight()) / 2.0f);
                this.c0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.W));
                canvas2.restore();
            }
            if (this.b0[0] != null) {
                canvas2.save();
                if (this.e0 != 0) {
                    f12 = 0.0f;
                    canvas2.translate(c3.h0.z(1.0f, interpolation3, AndroidUtilities.dp(f10) * this.e0, AndroidUtilities.dp(f11)), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(f12, (-this.b0[0].getHeight()) / 2.0f);
                this.c0.setAlpha((int) (interpolation3 * 255.0f * this.W));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        d8 d8Var = this.O;
        int measuredHeight = (d8Var.getMeasuredHeight() / 2) + dp;
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + (this.f / 2) + (this.V > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        d8Var.layout(dp2, measuredHeight - d8Var.getMeasuredHeight(), d8Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.j0 = timestampLabelWidth;
        this.O.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
        if (this.s == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.s);
        this.s = -100.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f7) {
        this.E = f7;
        invalidate();
    }

    public void setDelegate(lp0 lp0Var) {
        this.x = lp0Var;
    }

    public void setInnerColor(int i10) {
        this.c.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.L = i10;
    }

    public void setMinProgress(float f7) {
        this.v = f7;
        float progress = getProgress();
        float f10 = this.v;
        if (progress < f10) {
            e(f10, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.d.setColor(i10);
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            org.telegram.ui.ActionBar.y6.E1(yVar, i0.a.o(i10, 40), true);
        }
    }

    public void setProgress(float f7) {
        e(f7, false);
    }

    public void setReportChanges(boolean z10) {
        this.y = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.K = i10;
    }

    public void setTwoSided(boolean z10) {
        this.M = z10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint == null || paint.getColor() != this.a || (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Vi, this.N)) == this.a) {
                return;
            }
            this.a = w02;
            setOuterColor(w02);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.F;
    }

    public mp0(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        this.n = new h6(this, 0L, 60L, ds.g);
        this.s = -100.0f;
        this.v = -1.0f;
        this.H = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.I = 1.0f;
        this.L = 3;
        this.W = 0.0f;
        this.a0 = -1;
        this.d0 = 1.0f;
        this.g0 = -1.0f;
        this.h0 = new RectF();
        this.i0 = -1;
        this.N = u6Var;
        setWillNotDraw(false);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i10 = org.telegram.ui.ActionBar.y6.Vi;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.a = w02;
        paint.setColor(w02);
        this.f = AndroidUtilities.dp(32.0f);
        this.e = AndroidUtilities.dp(24.0f);
        this.G = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(i0.a.o(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.F = g02;
        g02.setCallback(this);
        g02.setVisible(true, false);
        d8 d8Var = new d8(this, context, context, 2);
        this.O = d8Var;
        d8Var.x = true;
        addView(d8Var, kb1.g(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(this, z10);
        this.b = e1Var;
        setAccessibilityDelegate(e1Var);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
