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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class pn0 extends FrameLayout {
    public static float[] f0;
    public static Path g0;
    public final org.telegram.ui.Cells.z A;
    public float B;
    public final int[] C;
    public float D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final org.telegram.ui.ActionBar.b6 I;
    public final nn0 J;
    public boolean K;
    public float L;
    public float M;
    public int N;
    public ArrayList O;
    public CharSequence P;
    public long Q;
    public float R;
    public int S;
    public StaticLayout[] T;
    public TextPaint U;
    public float V;
    public int W;
    public final org.telegram.ui.Cells.f1 a;
    public long a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public final RectF c0;
    public final int d;
    public int d0;
    public final int e;
    public int e0;
    public int f;
    public final y5 h;
    public int n;
    public float r;
    public float s;
    public boolean v;
    public on0 w;
    public boolean x;
    public float y;

    public pn0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i9 = this.e;
        return (int) (Math.abs(((i9 / 2.0f) + (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (i9 / 2.0f)) - (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i9) {
        if (this.d0 != i9) {
            this.d0 = i9;
            if (i9 < 0 || i9 >= this.O.size()) {
                return;
            }
            this.J.setText((CharSequence) ((Pair) this.O.get(this.d0)).second);
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
        int i9;
        char c10;
        float floatValue;
        char c11;
        char c12;
        pn0 pn0Var = this;
        float dp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = pn0Var.O;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f10 = rectF.bottom;
        int i10 = pn0Var.e;
        float f11 = i10 / 2.0f;
        float measuredWidth = pn0Var.getMeasuredWidth() - (i10 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(pn0Var.R * 1.0f) / 2.0f;
        if (g0 == null) {
            g0 = new Path();
        }
        g0.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f11);
        int i11 = 0;
        while (true) {
            i9 = -1;
            if (i11 >= pn0Var.O.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) pn0Var.O.get(i11)).first).floatValue() >= dp3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int size = pn0Var.O.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) pn0Var.O.get(size)).first).floatValue() >= dp3) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        if (i9 < 0) {
            i9 = pn0Var.O.size();
        }
        int i12 = i11;
        while (i12 <= i9) {
            if (i12 == i11) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) pn0Var.O.get(i12 - 1)).first).floatValue();
            }
            float floatValue2 = i12 == i9 ? 1.0f : ((Float) ((Pair) pn0Var.O.get(i12)).first).floatValue();
            while (i12 != i9 && i12 != 0) {
                c11 = 1;
                if (i12 >= pn0Var.O.size() - 1 || ((Float) ((Pair) pn0Var.O.get(i12)).first).floatValue() - floatValue > dp3) {
                    break;
                }
                i12++;
                floatValue2 = ((Float) ((Pair) pn0Var.O.get(i12)).first).floatValue();
            }
            c11 = 1;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f11, measuredWidth, floatValue) + (i12 > 0 ? dp2 : 0.0f);
            float lerp = AndroidUtilities.lerp(f11, measuredWidth, floatValue2) - (i12 < i9 ? dp2 : 0.0f);
            rectF2.right = lerp;
            float f12 = rectF.right;
            boolean z10 = lerp > f12;
            if (z10) {
                rectF2.right = f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF.left;
            if (f13 >= f14) {
                if (rectF2.left < f14) {
                    rectF2.left = f14;
                }
                if (f0 == null) {
                    f0 = new float[8];
                }
                if (i12 != i11) {
                    if (z10) {
                        c12 = 4;
                    } else {
                        c12 = 4;
                    }
                    if (i12 >= i9) {
                        float[] fArr = f0;
                        float f15 = 0.7f * dp * pn0Var.R;
                        fArr[7] = f15;
                        fArr[6] = f15;
                        fArr[c11] = f15;
                        fArr[c10] = f15;
                        fArr[5] = dp;
                        fArr[c12] = dp;
                        fArr[3] = dp;
                        fArr[2] = dp;
                    } else {
                        float[] fArr2 = f0;
                        float f16 = 0.7f * dp * pn0Var.R;
                        fArr2[5] = f16;
                        fArr2[c12] = f16;
                        fArr2[3] = f16;
                        fArr2[2] = f16;
                        fArr2[7] = f16;
                        fArr2[6] = f16;
                        fArr2[c11] = f16;
                        fArr2[c10] = f16;
                    }
                    g0.addRoundRect(rectF2, f0, Path.Direction.CW);
                    if (!z10) {
                        break;
                    }
                } else {
                    c12 = 4;
                }
                float[] fArr3 = f0;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[c11] = dp;
                fArr3[c10] = dp;
                float f17 = 0.7f * dp * pn0Var.R;
                fArr3[5] = f17;
                fArr3[c12] = f17;
                fArr3[3] = f17;
                fArr3[2] = f17;
                g0.addRoundRect(rectF2, f0, Path.Direction.CW);
                if (!z10) {
                }
            }
            i12++;
            pn0Var = this;
        }
        canvas.drawPath(g0, paint);
    }

    public final StaticLayout b(int i9, CharSequence charSequence) {
        if (this.U == null) {
            TextPaint textPaint = new TextPaint(1);
            this.U = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.U.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Si, this.I));
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.U, i9).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i9)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.U, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i9));
    }

    public final int c() {
        return Math.max((int) (this.s * (getMeasuredWidth() - this.e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.L = motionEvent.getX();
            this.M = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.A;
        int i9 = this.d;
        int i10 = this.e;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.K = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.M) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i9) / 2;
                    if (this.f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f + i9 + measuredHeight) {
                        int x10 = ((int) motionEvent.getX()) - (i9 / 2);
                        this.f = x10;
                        if (x10 < c()) {
                            this.f = c();
                        } else if (this.f > getMeasuredWidth() - i10) {
                            this.f = getMeasuredWidth() - i10;
                        }
                    }
                    this.n = (int) (motionEvent.getX() - this.f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.H) {
                        float measuredWidth = (getMeasuredWidth() - i10) / 2;
                        float f10 = this.f;
                        if (f10 >= measuredWidth) {
                            f((f10 - measuredWidth) / measuredWidth, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)), false);
                        }
                    } else {
                        f(this.f / (getMeasuredWidth() - i10), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.w.n();
                this.v = false;
                AndroidUtilities.runOnUIThread(new ib0(this, 25), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.K) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.M) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.L) > viewConfiguration.getScaledTouchSlop()) {
                    this.K = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i9) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f + i9 + measuredHeight2) {
                            int x11 = ((int) motionEvent.getX()) - (i9 / 2);
                            this.f = x11;
                            if (x11 < c()) {
                                this.f = c();
                            } else if (this.f > getMeasuredWidth() - i10) {
                                this.f = getMeasuredWidth() - i10;
                            }
                        }
                        this.n = (int) (motionEvent.getX() - this.f);
                        this.v = true;
                        this.w.n();
                        if (zVar != null) {
                            zVar.setState(this.C);
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
                } else if (this.f > getMeasuredWidth() - i10) {
                    this.f = getMeasuredWidth() - i10;
                }
                if (this.x) {
                    if (this.H) {
                        float measuredWidth2 = (getMeasuredWidth() - i10) / 2;
                        float f11 = this.f;
                        if (f11 >= measuredWidth2) {
                            f((f11 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f / (getMeasuredWidth() - i10), false);
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

    public final void e(float f10, boolean z10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.r = f10;
            return;
        }
        this.r = -100.0f;
        boolean z11 = this.H;
        int i9 = this.e;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i9) / 2;
            ceil = f10 < 0.0f ? Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f10 * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i9) * f10);
        }
        int i10 = (int) ceil;
        int i11 = this.f;
        if (i11 != i10) {
            if (z10) {
                this.E = i11;
                this.D = 0.0f;
            }
            this.f = i10;
            if (i10 < c()) {
                this.f = c();
            } else if (this.f > getMeasuredWidth() - i9) {
                this.f = getMeasuredWidth() - i9;
            }
            invalidate();
        }
    }

    public final void f(float f10, boolean z10) {
        on0 on0Var = this.w;
        if (on0Var != null) {
            on0Var.Q(f10, z10);
        }
        if (this.F > 1) {
            int round = Math.round((r0 - 1) * f10);
            if (!z10 && round != this.N) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.N = round;
        }
    }

    public final void g(MessageObject messageObject) {
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.O = null;
            this.S = -1;
            this.R = 0.0f;
            StaticLayout[] staticLayoutArr = this.T;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.P = null;
            this.Q = -1L;
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
        boolean z10 = charSequence != this.P;
        if (z10 || this.Q != valueOf.longValue()) {
            this.P = charSequence;
            this.Q = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.e0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.O = null;
                this.S = -1;
                this.R = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.T;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                p41[] p41VarArr = (p41[]) spanned.getSpans(0, spanned.length(), p41.class);
                this.O = new ArrayList();
                if (z10) {
                    this.R = 0.0f;
                }
                if (this.U == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.U = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.U.setColor(-1);
                }
                for (p41 p41Var : p41VarArr) {
                    if (p41Var != null && p41Var.getURL() != null && p41Var.d != null && p41Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) p41Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p41Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.U.getFontMetricsInt(), false);
                        this.O.add(new Pair(Float.valueOf((parseInt.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                    }
                }
                Collections.sort(this.O, new jn0(1));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.O = null;
                this.S = -1;
                this.R = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.T;
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

    public mn0 getSeekBarAccessibilityDelegate() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        int i9 = this.f;
        boolean z11 = this.H;
        int i10 = this.e;
        if (!z11 && this.F > 1) {
            i9 = (int) this.h.d(Math.round(i9 / r3) * ((getMeasuredWidth() - i10) / (this.F - 1.0f)), false);
        }
        int i11 = i9;
        int measuredHeight = getMeasuredHeight();
        int i12 = this.d;
        int i13 = (measuredHeight - i12) / 2;
        int i14 = org.telegram.ui.ActionBar.f6.Ti;
        org.telegram.ui.ActionBar.b6 b6Var = this.I;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i14, b6Var);
        Paint paint = this.b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i10 / 2.0f;
        int i15 = i10 / 2;
        float measuredWidth = getMeasuredWidth() - i15;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.G) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.G) / 2.0f) + measuredHeight2;
        RectF rectF = this.c0;
        rectF.set(f15, dp, measuredWidth, dp2);
        a(canvas2, rectF, paint);
        if (this.y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ui, b6Var));
            f10 = 0.0f;
            rectF.set(f15, dp, (this.y * (getMeasuredWidth() - i10)) + f15, dp2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z12 = this.H;
        Paint paint2 = this.c;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i11 > (getMeasuredWidth() - i10) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i15 + i11, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i15 + i11, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f15 = f15;
        } else {
            float f16 = this.s;
            if (f16 >= f10) {
                float f17 = measuredWidth - f15;
                rectF.set((f16 * f17) + f15, dp, i11 + f15, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, dp, (this.s * f17) + f15, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, dp, i11 + f15, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            int dp3 = (i15 + i11) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i12 / 2) + i13) - AndroidUtilities.dp(16.0f);
            zVar.setBounds(dp3, dp4, AndroidUtilities.dp(32.0f) + dp3, AndroidUtilities.dp(32.0f) + dp4);
            zVar.draw(canvas2);
        }
        int dp5 = AndroidUtilities.dp(this.v ? 8.0f : 6.0f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f18 = this.B;
        float f19 = dp5;
        if (f18 != f19) {
            if (f18 < f19) {
                f11 = 16.0f;
                f12 = 8.0f;
                float b10 = org.telegram.ui.Cells.j2.b(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f18);
                this.B = b10;
                if (b10 > f19) {
                    this.B = f19;
                }
            } else {
                f11 = 16.0f;
                f12 = 8.0f;
                float c10 = org.telegram.messenger.ll.c(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f18);
                this.B = c10;
                if (c10 < f19) {
                    this.B = f19;
                }
            }
            z10 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z10 = false;
        }
        float f20 = this.D;
        if (f20 < 1.0f) {
            float f21 = (elapsedRealtime / 225.0f) + f20;
            this.D = f21;
            if (f21 < 1.0f) {
                z10 = true;
            } else {
                this.D = 1.0f;
            }
        }
        float f22 = this.D;
        if (f22 < 1.0f) {
            float interpolation = 1.0f - xs.c.getInterpolation(Math.min(1.0f, f22 * 3.0f));
            float interpolation2 = xs.d.getInterpolation(this.D);
            if (interpolation > f10) {
                canvas2.drawCircle(i15 + this.E, (i12 / 2) + i13, this.B * interpolation, paint2);
            }
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.B * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.B, paint2);
        }
        ArrayList arrayList = this.O;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.O.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.O.get(size)).first).floatValue() - 0.001f <= progress) {
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.T == null) {
                this.T = new StaticLayout[2];
            }
            float dp6 = (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0) + f15;
            float abs = Math.abs(dp6 - ((getMeasuredWidth() - f15) - (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
            float f23 = this.b0;
            if (f23 > f10 && Math.abs(f23 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.T;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.T;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.b0 = abs;
            if (size != this.S) {
                StaticLayout[] staticLayoutArr3 = this.T;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size < 0 || size >= this.O.size()) {
                    this.T[0] = null;
                } else {
                    CharSequence charSequence = (CharSequence) ((Pair) this.O.get(size)).second;
                    if (charSequence == null) {
                        this.T[0] = null;
                    } else {
                        this.T[0] = b((int) abs, charSequence);
                    }
                }
                this.V = 0.0f;
                if (size == -1) {
                    this.W = -1;
                } else {
                    int i16 = this.S;
                    if (i16 == -1) {
                        this.W = 1;
                    } else if (size < i16) {
                        this.W = -1;
                    } else if (size > i16) {
                        this.W = 1;
                    }
                }
                this.S = size;
            }
            if (this.V < 1.0f) {
                this.V = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.a0)) / (this.O.size() > 8 ? 160.0f : 220.0f)) + this.V, 1.0f);
                invalidate();
                this.a0 = SystemClock.elapsedRealtime();
            }
            if (this.R < 1.0f) {
                this.R = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.a0)) / 200.0f) + this.R, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = gr.f.getInterpolation(this.V);
            canvas2.save();
            canvas2.translate(dp6 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.U.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Si, b6Var));
            if (this.T[1] != null) {
                canvas2.save();
                if (this.W != 0) {
                    f14 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f11) * (-this.W) * interpolation3) + AndroidUtilities.dp(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.T[1].getHeight()) / 2.0f);
                this.U.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.R));
                canvas2.restore();
            }
            if (this.T[0] != null) {
                canvas2.save();
                if (this.W != 0) {
                    f13 = 0.0f;
                    canvas2.translate(e2.c.z(1.0f, interpolation3, AndroidUtilities.dp(f11) * this.W, AndroidUtilities.dp(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.T[0].getHeight()) / 2.0f);
                this.U.setAlpha((int) (interpolation3 * 255.0f * this.R));
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        nn0 nn0Var = this.J;
        int measuredHeight = (nn0Var.getMeasuredHeight() / 2) + dp;
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + (this.e / 2) + (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        nn0Var.layout(dp2, measuredHeight - nn0Var.getMeasuredHeight(), nn0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.e0 = timestampLabelWidth;
        this.J.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
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

    public void setBufferedProgress(float f10) {
        this.y = f10;
        invalidate();
    }

    public void setDelegate(on0 on0Var) {
        this.w = on0Var;
    }

    public void setInnerColor(int i9) {
        this.b.setColor(i9);
    }

    public void setLineWidth(int i9) {
        this.G = i9;
    }

    public void setMinProgress(float f10) {
        this.s = f10;
        float progress = getProgress();
        float f11 = this.s;
        if (progress < f11) {
            e(f11, false);
        }
        invalidate();
    }

    public void setOuterColor(int i9) {
        this.c.setColor(i9);
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            org.telegram.ui.ActionBar.f6.B1(zVar, i0.a.k(i9, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(f10, false);
    }

    public void setReportChanges(boolean z10) {
        this.x = z10;
    }

    public void setSeparatorsCount(int i9) {
        this.F = i9;
    }

    public void setTwoSided(boolean z10) {
        this.H = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A;
    }

    public pn0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.h = new y5(this, 0L, 60L, gr.g);
        this.r = -100.0f;
        this.s = -1.0f;
        this.C = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.D = 1.0f;
        this.G = 3;
        this.R = 0.0f;
        this.S = -1;
        this.V = 1.0f;
        this.b0 = -1.0f;
        this.c0 = new RectF();
        this.d0 = -1;
        this.I = b6Var;
        setWillNotDraw(false);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        int i9 = org.telegram.ui.ActionBar.f6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.B = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.f6.f0(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.A = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        nn0 nn0Var = new nn0(this, context, context, 0);
        this.J = nn0Var;
        nn0Var.x = true;
        addView(nn0Var, g7.e6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, z10);
        this.a = f1Var;
        setAccessibilityDelegate(f1Var);
    }
}
