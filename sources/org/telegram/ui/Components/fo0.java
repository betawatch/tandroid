package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class fo0 extends FrameLayout {
    public static float[] j0;
    public static Path k0;
    public final org.telegram.ui.Cells.z E;
    public float F;
    public final int[] G;
    public float H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final do0 N;
    public boolean O;
    public float P;
    public float Q;
    public int R;
    public ArrayList S;
    public CharSequence T;
    public long U;
    public float V;
    public int W;
    public final org.telegram.ui.Cells.f1 a;
    public StaticLayout[] a0;
    public final Paint b;
    public TextPaint b0;
    public final Paint c;
    public float c0;
    public final int d;
    public int d0;
    public final int e;
    public long e0;
    public int f;
    public float f0;
    public final RectF g0;
    public final e6 h;
    public int h0;
    public int i0;
    public int n;
    public float r;
    public float s;
    public boolean v;
    public eo0 w;
    public boolean x;
    public float y;

    public fo0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10 = this.e;
        return (int) (Math.abs(((i10 / 2.0f) + (this.U > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (i10 / 2.0f)) - (this.U > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.h0 != i10) {
            this.h0 = i10;
            if (i10 < 0 || i10 >= this.S.size()) {
                return;
            }
            this.N.setText((CharSequence) ((Pair) this.S.get(this.h0)).second);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        if (r14.left >= r27.left) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db A[EDGE_INSN: B:70:0x01db->B:71:0x01db BREAK  A[LOOP:2: B:27:0x00a9->B:75:0x01d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        int i10;
        char c10;
        float floatValue;
        char c11;
        char c12;
        fo0 fo0Var = this;
        float dp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = fo0Var.S;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f7 = rectF.bottom;
        int i11 = fo0Var.e;
        float f10 = i11 / 2.0f;
        float measuredWidth = fo0Var.getMeasuredWidth() - (i11 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(fo0Var.V * 1.0f) / 2.0f;
        if (k0 == null) {
            k0 = new Path();
        }
        k0.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f10);
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= fo0Var.S.size()) {
                i12 = -1;
                break;
            } else if (((Float) ((Pair) fo0Var.S.get(i12)).first).floatValue() >= dp3) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            i12 = 0;
        }
        int size = fo0Var.S.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) fo0Var.S.get(size)).first).floatValue() >= dp3) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        if (i10 < 0) {
            i10 = fo0Var.S.size();
        }
        int i13 = i12;
        while (i13 <= i10) {
            if (i13 == i12) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) fo0Var.S.get(i13 - 1)).first).floatValue();
            }
            float floatValue2 = i13 == i10 ? 1.0f : ((Float) ((Pair) fo0Var.S.get(i13)).first).floatValue();
            while (i13 != i10 && i13 != 0) {
                c11 = 1;
                if (i13 >= fo0Var.S.size() - 1 || ((Float) ((Pair) fo0Var.S.get(i13)).first).floatValue() - floatValue > dp3) {
                    break;
                }
                i13++;
                floatValue2 = ((Float) ((Pair) fo0Var.S.get(i13)).first).floatValue();
            }
            c11 = 1;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f10, measuredWidth, floatValue) + (i13 > 0 ? dp2 : 0.0f);
            float lerp = AndroidUtilities.lerp(f10, measuredWidth, floatValue2) - (i13 < i10 ? dp2 : 0.0f);
            rectF2.right = lerp;
            float f11 = rectF.right;
            boolean z10 = lerp > f11;
            if (z10) {
                rectF2.right = f11;
            }
            float f12 = rectF2.right;
            float f13 = rectF.left;
            if (f12 >= f13) {
                if (rectF2.left < f13) {
                    rectF2.left = f13;
                }
                if (j0 == null) {
                    j0 = new float[8];
                }
                if (i13 != i12) {
                    if (z10) {
                        c12 = 4;
                    } else {
                        c12 = 4;
                    }
                    if (i13 >= i10) {
                        float[] fArr = j0;
                        float f14 = 0.7f * dp * fo0Var.V;
                        fArr[7] = f14;
                        fArr[6] = f14;
                        fArr[c11] = f14;
                        fArr[c10] = f14;
                        fArr[5] = dp;
                        fArr[c12] = dp;
                        fArr[3] = dp;
                        fArr[2] = dp;
                    } else {
                        float[] fArr2 = j0;
                        float f15 = 0.7f * dp * fo0Var.V;
                        fArr2[5] = f15;
                        fArr2[c12] = f15;
                        fArr2[3] = f15;
                        fArr2[2] = f15;
                        fArr2[7] = f15;
                        fArr2[6] = f15;
                        fArr2[c11] = f15;
                        fArr2[c10] = f15;
                    }
                    k0.addRoundRect(rectF2, j0, Path.Direction.CW);
                    if (!z10) {
                        break;
                    }
                } else {
                    c12 = 4;
                }
                float[] fArr3 = j0;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[c11] = dp;
                fArr3[c10] = dp;
                float f16 = 0.7f * dp * fo0Var.V;
                fArr3[5] = f16;
                fArr3[c12] = f16;
                fArr3[3] = f16;
                fArr3[2] = f16;
                k0.addRoundRect(rectF2, j0, Path.Direction.CW);
                if (!z10) {
                }
            }
            i13++;
            fo0Var = this;
        }
        canvas.drawPath(k0, paint);
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        if (this.b0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, this.M));
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.b0, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.b0, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final int c() {
        return Math.max((int) (this.s * (getMeasuredWidth() - this.e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.E;
        int i10 = this.d;
        int i11 = this.e;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.O = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.Q) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i10) / 2;
                    if (this.f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f + i10 + measuredHeight) {
                        int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.f = x10;
                        if (x10 < c()) {
                            this.f = c();
                        } else if (this.f > getMeasuredWidth() - i11) {
                            this.f = getMeasuredWidth() - i11;
                        }
                    }
                    this.n = (int) (motionEvent.getX() - this.f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.L) {
                        float measuredWidth = (getMeasuredWidth() - i11) / 2;
                        float f7 = this.f;
                        if (f7 >= measuredWidth) {
                            f((f7 - measuredWidth) / measuredWidth, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth - f7) / measuredWidth)), false);
                        }
                    } else {
                        f(this.f / (getMeasuredWidth() - i11), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.w.B();
                this.v = false;
                AndroidUtilities.runOnUIThread(new cc0(this, 25), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.O) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.Q) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.P) > viewConfiguration.getScaledTouchSlop()) {
                    this.O = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f + i10 + measuredHeight2) {
                            int x11 = ((int) motionEvent.getX()) - (i10 / 2);
                            this.f = x11;
                            if (x11 < c()) {
                                this.f = c();
                            } else if (this.f > getMeasuredWidth() - i11) {
                                this.f = getMeasuredWidth() - i11;
                            }
                        }
                        this.n = (int) (motionEvent.getX() - this.f);
                        this.v = true;
                        this.w.B();
                        if (zVar != null) {
                            zVar.setState(this.G);
                            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.v) {
                int x12 = (int) (motionEvent.getX() - this.n);
                this.f = x12;
                if (x12 < c()) {
                    this.f = c();
                } else if (this.f > getMeasuredWidth() - i11) {
                    this.f = getMeasuredWidth() - i11;
                }
                if (this.x) {
                    if (this.L) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.f;
                        if (f10 >= measuredWidth2) {
                            f((f10 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f10) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f / (getMeasuredWidth() - i11), false);
                    }
                }
                if (zVar != null) {
                    zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
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
            this.r = f7;
            return;
        }
        this.r = -100.0f;
        boolean z11 = this.L;
        int i10 = this.e;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            ceil = f7 < 0.0f ? Math.ceil(((-(f7 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f7 * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f7);
        }
        int i11 = (int) ceil;
        int i12 = this.f;
        if (i12 != i11) {
            if (z10) {
                this.I = i12;
                this.H = 0.0f;
            }
            this.f = i11;
            if (i11 < c()) {
                this.f = c();
            } else if (this.f > getMeasuredWidth() - i10) {
                this.f = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        eo0 eo0Var = this.w;
        if (eo0Var != null) {
            eo0Var.X(f7, z10);
        }
        if (this.J > 1) {
            int round = Math.round((r0 - 1) * f7);
            if (!z10 && round != this.R) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.R = round;
        }
    }

    public final void g(MessageObject messageObject) {
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.S = null;
            this.W = -1;
            this.V = 0.0f;
            StaticLayout[] staticLayoutArr = this.a0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.T = null;
            this.U = -1L;
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
        boolean z10 = charSequence != this.T;
        if (z10 || this.U != valueOf.longValue()) {
            this.T = charSequence;
            this.U = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.i0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.S = null;
                this.W = -1;
                this.V = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.a0;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                l51[] l51VarArr = (l51[]) spanned.getSpans(0, spanned.length(), l51.class);
                this.S = new ArrayList();
                if (z10) {
                    this.V = 0.0f;
                }
                if (this.b0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.b0 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.b0.setColor(-1);
                }
                for (l51 l51Var : l51VarArr) {
                    if (l51Var != null && l51Var.getURL() != null && l51Var.d != null && l51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) l51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l51Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.b0.getFontMetricsInt(), false);
                        this.S.add(new Pair(Float.valueOf((parseInt.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                    }
                }
                Collections.sort(this.S, new org.telegram.ui.f6(17));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.S = null;
                this.W = -1;
                this.V = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.a0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        return getMeasuredWidth() == 0 ? this.r : this.f / (getMeasuredWidth() - this.e);
    }

    public co0 getSeekBarAccessibilityDelegate() {
        return this.a;
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
        int i10 = this.f;
        boolean z11 = this.L;
        int i11 = this.e;
        if (!z11 && this.J > 1) {
            i10 = (int) this.h.d(Math.round(i10 / r3) * ((getMeasuredWidth() - i11) / (this.J - 1.0f)), false);
        }
        int i12 = i10;
        int measuredHeight = getMeasuredHeight();
        int i13 = this.d;
        int i14 = (measuredHeight - i13) / 2;
        int i15 = org.telegram.ui.ActionBar.j6.Ti;
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        Paint paint = this.b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f14 = i11 / 2.0f;
        int i16 = i11 / 2;
        float measuredWidth = getMeasuredWidth() - i16;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.K) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.K) / 2.0f) + measuredHeight2;
        RectF rectF = this.g0;
        rectF.set(f14, dp, measuredWidth, dp2);
        a(canvas2, rectF, paint);
        if (this.y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ui, f6Var));
            f7 = 0.0f;
            rectF.set(f14, dp, (this.y * (getMeasuredWidth() - i11)) + f14, dp2);
            a(canvas2, rectF, paint);
        } else {
            f7 = 0.0f;
        }
        boolean z12 = this.L;
        Paint paint2 = this.c;
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
            float f15 = this.s;
            if (f15 >= f7) {
                float f16 = measuredWidth - f14;
                rectF.set((f15 * f16) + f14, dp, i12 + f14, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f14, dp, (this.s * f16) + f14, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f14, dp, i12 + f14, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            int dp3 = (i16 + i12) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i13 / 2) + i14) - AndroidUtilities.dp(16.0f);
            zVar.setBounds(dp3, dp4, AndroidUtilities.dp(32.0f) + dp3, AndroidUtilities.dp(32.0f) + dp4);
            zVar.draw(canvas2);
        }
        int dp5 = AndroidUtilities.dp(this.v ? 8.0f : 6.0f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f17 = this.F;
        float f18 = dp5;
        if (f17 != f18) {
            if (f17 < f18) {
                f10 = 16.0f;
                f11 = 8.0f;
                float e7 = a4.a.e(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f17);
                this.F = e7;
                if (e7 > f18) {
                    this.F = f18;
                }
            } else {
                f10 = 16.0f;
                f11 = 8.0f;
                float c10 = org.telegram.messenger.wl.c(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f17);
                this.F = c10;
                if (c10 < f18) {
                    this.F = f18;
                }
            }
            z10 = true;
        } else {
            f10 = 16.0f;
            f11 = 8.0f;
            z10 = false;
        }
        float f19 = this.H;
        if (f19 < 1.0f) {
            float f20 = (elapsedRealtime / 225.0f) + f19;
            this.H = f20;
            if (f20 < 1.0f) {
                z10 = true;
            } else {
                this.H = 1.0f;
            }
        }
        float f21 = this.H;
        if (f21 < 1.0f) {
            float interpolation = 1.0f - jt.c.getInterpolation(Math.min(1.0f, f21 * 3.0f));
            float interpolation2 = jt.d.getInterpolation(this.H);
            if (interpolation > f7) {
                canvas2.drawCircle(i16 + this.I, (i13 / 2) + i14, this.F * interpolation, paint2);
            }
            canvas2.drawCircle(i16 + i12, (i13 / 2) + i14, this.F * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i16 + i12, (i13 / 2) + i14, this.F, paint2);
        }
        ArrayList arrayList = this.S;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.S.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.S.get(size)).first).floatValue() - 0.001f <= progress) {
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.a0 == null) {
                this.a0 = new StaticLayout[2];
            }
            float dp6 = (this.U > 600000 ? AndroidUtilities.dp(42.0f) : 0) + f14;
            float abs = Math.abs(dp6 - ((getMeasuredWidth() - f14) - (this.U > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
            float f22 = this.f0;
            if (f22 > f7 && Math.abs(f22 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.a0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.a0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f0 = abs;
            if (size != this.W) {
                StaticLayout[] staticLayoutArr3 = this.a0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size < 0 || size >= this.S.size()) {
                    this.a0[0] = null;
                } else {
                    CharSequence charSequence = (CharSequence) ((Pair) this.S.get(size)).second;
                    if (charSequence == null) {
                        this.a0[0] = null;
                    } else {
                        this.a0[0] = b((int) abs, charSequence);
                    }
                }
                this.c0 = 0.0f;
                if (size == -1) {
                    this.d0 = -1;
                } else {
                    int i17 = this.W;
                    if (i17 == -1) {
                        this.d0 = 1;
                    } else if (size < i17) {
                        this.d0 = -1;
                    } else if (size > i17) {
                        this.d0 = 1;
                    }
                }
                this.W = size;
            }
            if (this.c0 < 1.0f) {
                this.c0 = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.e0)) / (this.S.size() > 8 ? 160.0f : 220.0f)) + this.c0, 1.0f);
                invalidate();
                this.e0 = SystemClock.elapsedRealtime();
            }
            if (this.V < 1.0f) {
                this.V = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.e0)) / 200.0f) + this.V, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = pr.f.getInterpolation(this.c0);
            canvas2.save();
            canvas2.translate(dp6 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, f6Var));
            if (this.a0[1] != null) {
                canvas2.save();
                if (this.d0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f10) * (-this.d0) * interpolation3) + AndroidUtilities.dp(f11), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.a0[1].getHeight()) / 2.0f);
                this.b0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.V));
                canvas2.restore();
            }
            if (this.a0[0] != null) {
                canvas2.save();
                if (this.d0 != 0) {
                    f12 = 0.0f;
                    canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, interpolation3, AndroidUtilities.dp(f10) * this.d0, AndroidUtilities.dp(f11)), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(f12, (-this.a0[0].getHeight()) / 2.0f);
                this.b0.setAlpha((int) (interpolation3 * 255.0f * this.V));
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
        do0 do0Var = this.N;
        int measuredHeight = (do0Var.getMeasuredHeight() / 2) + dp;
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + (this.e / 2) + (this.U > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        do0Var.layout(dp2, measuredHeight - do0Var.getMeasuredHeight(), do0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.i0 = timestampLabelWidth;
        this.N.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
        if (this.r == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.r);
        this.r = -100.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f7) {
        this.y = f7;
        invalidate();
    }

    public void setDelegate(eo0 eo0Var) {
        this.w = eo0Var;
    }

    public void setInnerColor(int i10) {
        this.b.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.K = i10;
    }

    public void setMinProgress(float f7) {
        this.s = f7;
        float progress = getProgress();
        float f10 = this.s;
        if (progress < f10) {
            e(f10, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.c.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            org.telegram.ui.ActionBar.j6.B1(zVar, i0.a.k(i10, 40), true);
        }
    }

    public void setProgress(float f7) {
        e(f7, false);
    }

    public void setReportChanges(boolean z10) {
        this.x = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.J = i10;
    }

    public void setTwoSided(boolean z10) {
        this.L = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }

    public fo0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.h = new e6(this, 0L, 60L, pr.g);
        this.r = -100.0f;
        this.s = -1.0f;
        this.G = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.H = 1.0f;
        this.K = 3;
        this.V = 0.0f;
        this.W = -1;
        this.c0 = 1.0f;
        this.f0 = -1.0f;
        this.g0 = new RectF();
        this.h0 = -1;
        this.M = f6Var;
        setWillNotDraw(false);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        int i10 = org.telegram.ui.ActionBar.j6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.F = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.E = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        do0 do0Var = new do0(this, context, context, 0);
        this.N = do0Var;
        do0Var.x = true;
        addView(do0Var, w7.x5.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, z10);
        this.a = f1Var;
        setAccessibilityDelegate(f1Var);
    }
}
