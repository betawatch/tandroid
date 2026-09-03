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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class jo0 extends FrameLayout {
    public static float[] g0;
    public static Path h0;
    public final org.telegram.ui.Cells.z B;
    public float C;
    public final int[] D;
    public float E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final ho0 K;
    public boolean L;
    public float M;
    public float N;
    public int O;
    public ArrayList P;
    public CharSequence Q;
    public long R;
    public float S;
    public int T;
    public StaticLayout[] U;
    public TextPaint V;
    public float W;
    public final org.telegram.ui.Cells.e1 a;
    public int a0;
    public final Paint b;
    public long b0;
    public final Paint c;
    public float c0;
    public final int d;
    public final RectF d0;
    public final int e;
    public int e0;
    public int f;
    public int f0;
    public final z5 h;
    public int n;
    public float r;
    public float s;
    public boolean v;
    public io0 w;
    public boolean x;
    public float y;

    public jo0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10 = this.e;
        return (int) (Math.abs(((i10 / 2.0f) + (this.R > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (i10 / 2.0f)) - (this.R > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.e0 != i10) {
            this.e0 = i10;
            if (i10 < 0 || i10 >= this.P.size()) {
                return;
            }
            this.K.setText((CharSequence) ((Pair) this.P.get(this.e0)).second);
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
        char c3;
        float floatValue;
        char c10;
        char c11;
        jo0 jo0Var = this;
        float dp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = jo0Var.P;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint);
            return;
        }
        float f10 = rectF.bottom;
        int i11 = jo0Var.e;
        float f11 = i11 / 2.0f;
        float measuredWidth = jo0Var.getMeasuredWidth() - (i11 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(jo0Var.S * 1.0f) / 2.0f;
        if (h0 == null) {
            h0 = new Path();
        }
        h0.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f11);
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= jo0Var.P.size()) {
                i12 = -1;
                break;
            } else if (((Float) ((Pair) jo0Var.P.get(i12)).first).floatValue() >= dp3) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            i12 = 0;
        }
        int size = jo0Var.P.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) jo0Var.P.get(size)).first).floatValue() >= dp3) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        if (i10 < 0) {
            i10 = jo0Var.P.size();
        }
        int i13 = i12;
        while (i13 <= i10) {
            if (i13 == i12) {
                floatValue = 0.0f;
                c3 = 0;
            } else {
                c3 = 0;
                floatValue = ((Float) ((Pair) jo0Var.P.get(i13 - 1)).first).floatValue();
            }
            float floatValue2 = i13 == i10 ? 1.0f : ((Float) ((Pair) jo0Var.P.get(i13)).first).floatValue();
            while (i13 != i10 && i13 != 0) {
                c10 = 1;
                if (i13 >= jo0Var.P.size() - 1 || ((Float) ((Pair) jo0Var.P.get(i13)).first).floatValue() - floatValue > dp3) {
                    break;
                }
                i13++;
                floatValue2 = ((Float) ((Pair) jo0Var.P.get(i13)).first).floatValue();
            }
            c10 = 1;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f11, measuredWidth, floatValue) + (i13 > 0 ? dp2 : 0.0f);
            float lerp = AndroidUtilities.lerp(f11, measuredWidth, floatValue2) - (i13 < i10 ? dp2 : 0.0f);
            rectF2.right = lerp;
            float f12 = rectF.right;
            boolean z4 = lerp > f12;
            if (z4) {
                rectF2.right = f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF.left;
            if (f13 >= f14) {
                if (rectF2.left < f14) {
                    rectF2.left = f14;
                }
                if (g0 == null) {
                    g0 = new float[8];
                }
                if (i13 != i12) {
                    if (z4) {
                        c11 = 4;
                    } else {
                        c11 = 4;
                    }
                    if (i13 >= i10) {
                        float[] fArr = g0;
                        float f15 = 0.7f * dp * jo0Var.S;
                        fArr[7] = f15;
                        fArr[6] = f15;
                        fArr[c10] = f15;
                        fArr[c3] = f15;
                        fArr[5] = dp;
                        fArr[c11] = dp;
                        fArr[3] = dp;
                        fArr[2] = dp;
                    } else {
                        float[] fArr2 = g0;
                        float f16 = 0.7f * dp * jo0Var.S;
                        fArr2[5] = f16;
                        fArr2[c11] = f16;
                        fArr2[3] = f16;
                        fArr2[2] = f16;
                        fArr2[7] = f16;
                        fArr2[6] = f16;
                        fArr2[c10] = f16;
                        fArr2[c3] = f16;
                    }
                    h0.addRoundRect(rectF2, g0, Path.Direction.CW);
                    if (!z4) {
                        break;
                    }
                } else {
                    c11 = 4;
                }
                float[] fArr3 = g0;
                fArr3[7] = dp;
                fArr3[6] = dp;
                fArr3[c10] = dp;
                fArr3[c3] = dp;
                float f17 = 0.7f * dp * jo0Var.S;
                fArr3[5] = f17;
                fArr3[c11] = f17;
                fArr3[3] = f17;
                fArr3[2] = f17;
                h0.addRoundRect(rectF2, g0, Path.Direction.CW);
                if (!z4) {
                }
            }
            i13++;
            jo0Var = this;
        }
        canvas.drawPath(h0, paint);
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        if (this.V == null) {
            TextPaint textPaint = new TextPaint(1);
            this.V = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.V.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, this.J));
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.V, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.V, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final int c() {
        return Math.max((int) (this.s * (getMeasuredWidth() - this.e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.M = motionEvent.getX();
            this.N = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.B;
        int i10 = this.d;
        int i11 = this.e;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.L = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.N) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
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
                    if (this.I) {
                        float measuredWidth = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.f;
                        if (f10 >= measuredWidth) {
                            f((f10 - measuredWidth) / measuredWidth, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)), false);
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
                AndroidUtilities.runOnUIThread(new dc0(this, 25), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.L) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.N) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.M) > viewConfiguration.getScaledTouchSlop()) {
                    this.L = true;
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
                            zVar.setState(this.D);
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
                    if (this.I) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f11 = this.f;
                        if (f11 >= measuredWidth2) {
                            f((f11 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)), false);
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

    public final void e(float f10, boolean z4) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.r = f10;
            return;
        }
        this.r = -100.0f;
        boolean z10 = this.I;
        int i10 = this.e;
        if (z10) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            ceil = f10 < 0.0f ? Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f10 * measuredWidth) + measuredWidth);
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f10);
        }
        int i11 = (int) ceil;
        int i12 = this.f;
        if (i12 != i11) {
            if (z4) {
                this.F = i12;
                this.E = 0.0f;
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

    public final void f(float f10, boolean z4) {
        io0 io0Var = this.w;
        if (io0Var != null) {
            io0Var.Y(f10, z4);
        }
        if (this.G > 1) {
            int round = Math.round((r0 - 1) * f10);
            if (!z4 && round != this.O) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.O = round;
        }
    }

    public final void g(MessageObject messageObject) {
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.P = null;
            this.T = -1;
            this.S = 0.0f;
            StaticLayout[] staticLayoutArr = this.U;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.Q = null;
            this.R = -1L;
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
        boolean z4 = charSequence != this.Q;
        if (z4 || this.R != valueOf.longValue()) {
            this.Q = charSequence;
            this.R = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.P = null;
                this.T = -1;
                this.S = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.U;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                m51[] m51VarArr = (m51[]) spanned.getSpans(0, spanned.length(), m51.class);
                this.P = new ArrayList();
                if (z4) {
                    this.S = 0.0f;
                }
                if (this.V == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.V = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.V.setColor(-1);
                }
                for (m51 m51Var : m51VarArr) {
                    if (m51Var != null && m51Var.getURL() != null && m51Var.d != null && m51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) m51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m51Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.V.getFontMetricsInt(), false);
                        this.P.add(new Pair(Float.valueOf((parseInt.intValue() * 1000) / valueOf.longValue()), spannableStringBuilder));
                    }
                }
                Collections.sort(this.P, new nh.e4(26));
            } catch (Exception e) {
                FileLog.e(e);
                this.P = null;
                this.T = -1;
                this.S = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.U;
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

    public go0 getSeekBarAccessibilityDelegate() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z4;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        int i10 = this.f;
        boolean z10 = this.I;
        int i11 = this.e;
        if (!z10 && this.G > 1) {
            i10 = (int) this.h.d(Math.round(i10 / r3) * ((getMeasuredWidth() - i11) / (this.G - 1.0f)), false);
        }
        int i12 = i10;
        int measuredHeight = getMeasuredHeight();
        int i13 = this.d;
        int i14 = (measuredHeight - i13) / 2;
        int i15 = org.telegram.ui.ActionBar.j6.Ti;
        org.telegram.ui.ActionBar.f6 f6Var = this.J;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        Paint paint = this.b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i11 / 2.0f;
        int i16 = i11 / 2;
        float measuredWidth = getMeasuredWidth() - i16;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.H) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.H) / 2.0f) + measuredHeight2;
        RectF rectF = this.d0;
        rectF.set(f15, dp, measuredWidth, dp2);
        a(canvas2, rectF, paint);
        if (this.y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ui, f6Var));
            f10 = 0.0f;
            rectF.set(f15, dp, (this.y * (getMeasuredWidth() - i11)) + f15, dp2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = this.I;
        Paint paint2 = this.c;
        if (z11) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i12 > (getMeasuredWidth() - i11) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i16 + i12, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i16 + i12, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f15 = f15;
        } else {
            float f16 = this.s;
            if (f16 >= f10) {
                float f17 = measuredWidth - f15;
                rectF.set((f16 * f17) + f15, dp, i12 + f15, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, dp, (this.s * f17) + f15, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, dp, i12 + f15, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.B;
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
        float f18 = this.C;
        float f19 = dp5;
        if (f18 != f19) {
            if (f18 < f19) {
                f11 = 16.0f;
                f12 = 8.0f;
                float c3 = vh.w2.c(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f18);
                this.C = c3;
                if (c3 > f19) {
                    this.C = f19;
                }
            } else {
                f11 = 16.0f;
                f12 = 8.0f;
                float A = org.telegram.messenger.y3.A(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f18);
                this.C = A;
                if (A < f19) {
                    this.C = f19;
                }
            }
            z4 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z4 = false;
        }
        float f20 = this.E;
        if (f20 < 1.0f) {
            float f21 = (elapsedRealtime / 225.0f) + f20;
            this.E = f21;
            if (f21 < 1.0f) {
                z4 = true;
            } else {
                this.E = 1.0f;
            }
        }
        float f22 = this.E;
        if (f22 < 1.0f) {
            float interpolation = 1.0f - ft.c.getInterpolation(Math.min(1.0f, f22 * 3.0f));
            float interpolation2 = ft.d.getInterpolation(this.E);
            if (interpolation > f10) {
                canvas2.drawCircle(i16 + this.F, (i13 / 2) + i14, this.C * interpolation, paint2);
            }
            canvas2.drawCircle(i16 + i12, (i13 / 2) + i14, this.C * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i16 + i12, (i13 / 2) + i14, this.C, paint2);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.P.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((Float) ((Pair) this.P.get(size)).first).floatValue() - 0.001f <= progress) {
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.U == null) {
                this.U = new StaticLayout[2];
            }
            float dp6 = (this.R > 600000 ? AndroidUtilities.dp(42.0f) : 0) + f15;
            float abs = Math.abs(dp6 - ((getMeasuredWidth() - f15) - (this.R > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
            float f23 = this.c0;
            if (f23 > f10 && Math.abs(f23 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.U;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.U;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.c0 = abs;
            if (size != this.T) {
                StaticLayout[] staticLayoutArr3 = this.U;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size < 0 || size >= this.P.size()) {
                    this.U[0] = null;
                } else {
                    CharSequence charSequence = (CharSequence) ((Pair) this.P.get(size)).second;
                    if (charSequence == null) {
                        this.U[0] = null;
                    } else {
                        this.U[0] = b((int) abs, charSequence);
                    }
                }
                this.W = 0.0f;
                if (size == -1) {
                    this.a0 = -1;
                } else {
                    int i17 = this.T;
                    if (i17 == -1) {
                        this.a0 = 1;
                    } else if (size < i17) {
                        this.a0 = -1;
                    } else if (size > i17) {
                        this.a0 = 1;
                    }
                }
                this.T = size;
            }
            if (this.W < 1.0f) {
                this.W = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.b0)) / (this.P.size() > 8 ? 160.0f : 220.0f)) + this.W, 1.0f);
                invalidate();
                this.b0 = SystemClock.elapsedRealtime();
            }
            if (this.S < 1.0f) {
                this.S = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.b0)) / 200.0f) + this.S, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = mr.f.getInterpolation(this.W);
            canvas2.save();
            canvas2.translate(dp6 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.V.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, f6Var));
            if (this.U[1] != null) {
                canvas2.save();
                if (this.a0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f11) * (-this.a0) * interpolation3) + AndroidUtilities.dp(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.U[1].getHeight()) / 2.0f);
                this.V.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.S));
                canvas2.restore();
            }
            if (this.U[0] != null) {
                canvas2.save();
                if (this.a0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(e2.c.w(1.0f, interpolation3, AndroidUtilities.dp(f11) * this.a0, AndroidUtilities.dp(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.U[0].getHeight()) / 2.0f);
                this.V.setAlpha((int) (interpolation3 * 255.0f * this.S));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z4) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        ho0 ho0Var = this.K;
        int measuredHeight = (ho0Var.getMeasuredHeight() / 2) + dp;
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + (this.e / 2) + (this.R > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        ho0Var.layout(dp2, measuredHeight - ho0Var.getMeasuredHeight(), ho0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f0 = timestampLabelWidth;
        this.K.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, TLObject.FLAG_30), 0);
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

    public void setDelegate(io0 io0Var) {
        this.w = io0Var;
    }

    public void setInnerColor(int i10) {
        this.b.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.H = i10;
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

    public void setOuterColor(int i10) {
        this.c.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.B;
        if (zVar != null) {
            org.telegram.ui.ActionBar.j6.B1(zVar, i0.a.k(i10, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(f10, false);
    }

    public void setReportChanges(boolean z4) {
        this.x = z4;
    }

    public void setSeparatorsCount(int i10) {
        this.G = i10;
    }

    public void setTwoSided(boolean z4) {
        this.I = z4;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public jo0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.h = new z5(this, 0L, 60L, mr.g);
        this.r = -100.0f;
        this.s = -1.0f;
        this.D = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.E = 1.0f;
        this.H = 3;
        this.S = 0.0f;
        this.T = -1;
        this.W = 1.0f;
        this.c0 = -1.0f;
        this.d0 = new RectF();
        this.e0 = -1;
        this.J = f6Var;
        setWillNotDraw(false);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        int i10 = org.telegram.ui.ActionBar.j6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.C = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.B = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        ho0 ho0Var = new ho0(this, context, context, 0);
        this.K = ho0Var;
        ho0Var.x = true;
        addView(ho0Var, k7.b6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(this, z4);
        this.a = e1Var;
        setAccessibilityDelegate(e1Var);
    }
}
