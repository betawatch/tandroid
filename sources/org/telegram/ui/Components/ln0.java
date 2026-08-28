package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ln0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float a;
    public int f;
    public int g;
    public kn0 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean p;
    public float q;
    public float r;
    public View s;
    public ArrayList u;
    public CharSequence v;
    public long w;
    public StaticLayout[] z;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF n = new RectF();
    public final int o = AndroidUtilities.dp(2.0f);
    public float t = 1.0f;
    public float x = 0.0f;
    public int y = -1;
    public float B = 1.0f;

    public ln0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.s = view;
        E = AndroidUtilities.dp(24.0f);
        this.r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.u = null;
        this.y = -1;
        this.x = 0.0f;
        StaticLayout[] staticLayoutArr = this.z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        float f10 = this.t;
        if (f10 <= 0.0f) {
            return;
        }
        if (f10 < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, this.f, this.g, (int) (f10 * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        int i9 = E / 2;
        int i10 = this.g / 2;
        int i11 = this.o / 2;
        RectF rectF = this.n;
        rectF.set(i9, i10 - i11, this.f - i9, i10 + i11);
        D.setColor(this.p ? this.m : this.i);
        c(canvas2, rectF, D);
        if (this.q > 0.0f) {
            D.setColor(this.p ? this.m : this.j);
            float f11 = E / 2;
            int i12 = this.g / 2;
            rectF.set(f11, i12 - i11, (this.q * (this.f - r12)) + f11, i12 + i11);
            c(canvas2, rectF, D);
        }
        float f12 = E / 2;
        int i13 = this.g / 2;
        rectF.set(f12, i13 - i11, r12 + (this.e ? this.c : this.b), i11 + i13);
        D.setColor(this.l);
        c(canvas2, rectF, D);
        D.setColor(this.k);
        float dp = AndroidUtilities.dp(this.e ? 8.0f : 6.0f);
        if (this.r != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > 18) {
                elapsedRealtime = 16;
            }
            float f13 = this.r;
            if (f13 < dp) {
                float b10 = org.telegram.ui.Cells.j2.b(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f13);
                this.r = b10;
                if (b10 > dp) {
                    this.r = dp;
                }
            } else {
                float c10 = org.telegram.messenger.ll.c(elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f13);
                this.r = c10;
                if (c10 < dp) {
                    this.r = dp;
                }
            }
            View view = this.s;
            if (view != null) {
                view.invalidate();
            }
        }
        canvas2.drawCircle((E / 2) + (this.e ? this.c : this.b), this.g / 2, this.r, D);
        if (this.t < 1.0f) {
            canvas2.restore();
        }
        ArrayList arrayList = this.u;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f14 = (this.e ? this.c : this.b) / (this.f - E);
        int size = this.u.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.u.get(size)).first).floatValue() - 0.001f <= f14) {
                break;
            } else {
                size--;
            }
        }
        if (this.z == null) {
            this.z = new StaticLayout[2];
        }
        float f15 = E / 2.0f;
        Math.abs(f15 - (this.f - f15));
        AndroidUtilities.dp(66.0f);
        if (size != this.y) {
            if (this.e) {
                AndroidUtilities.vibrateCursor(this.s);
            }
            this.y = size;
            if (size >= 0 && size < this.u.size()) {
                e((p41) ((Pair) this.u.get(this.y)).second);
            }
        }
        if (this.B < 1.0f) {
            this.B = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / (this.u.size() > 8 ? 160.0f : 220.0f)) + this.B, 1.0f);
            View view2 = this.s;
            if (view2 != null) {
                view2.invalidate();
            }
            this.C = SystemClock.elapsedRealtime();
        }
        if (this.x < 1.0f) {
            this.x = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / 200.0f) + this.x, 1.0f);
            View view3 = this.s;
            if (view3 != null) {
                view3.invalidate();
            }
            SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        if (r14.left >= r27.left) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8 A[EDGE_INSN: B:70:0x01d8->B:71:0x01d8 BREAK  A[LOOP:2: B:27:0x00a6->B:75:0x01cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, RectF rectF, Paint paint) {
        int i9;
        char c10;
        float floatValue;
        char c11;
        char c12;
        ln0 ln0Var = this;
        float f10 = E / 2.0f;
        ArrayList arrayList = ln0Var.u;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        float f11 = rectF.bottom;
        int i10 = E;
        float f12 = i10 / 2.0f;
        float f13 = ln0Var.f - (i10 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float dp = AndroidUtilities.dp(ln0Var.x * 1.0f) / 2.0f;
        if (G == null) {
            G = new Path();
        }
        G.reset();
        float dp2 = AndroidUtilities.dp(4.0f) / (f13 - f12);
        int i11 = 0;
        while (true) {
            i9 = -1;
            if (i11 >= ln0Var.u.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) ln0Var.u.get(i11)).first).floatValue() >= dp2) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int size = ln0Var.u.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) ln0Var.u.get(size)).first).floatValue() >= dp2) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        if (i9 < 0) {
            i9 = ln0Var.u.size();
        }
        int i12 = i11;
        while (i12 <= i9) {
            if (i12 == i11) {
                floatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                floatValue = ((Float) ((Pair) ln0Var.u.get(i12 - 1)).first).floatValue();
            }
            float floatValue2 = i12 == i9 ? 1.0f : ((Float) ((Pair) ln0Var.u.get(i12)).first).floatValue();
            while (i12 != i9 && i12 != 0) {
                c11 = 1;
                if (i12 >= ln0Var.u.size() - 1 || ((Float) ((Pair) ln0Var.u.get(i12)).first).floatValue() - floatValue > dp2) {
                    break;
                }
                i12++;
                floatValue2 = ((Float) ((Pair) ln0Var.u.get(i12)).first).floatValue();
            }
            c11 = 1;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f12, f13, floatValue) + (i12 > 0 ? dp : 0.0f);
            float lerp = AndroidUtilities.lerp(f12, f13, floatValue2) - (i12 < i9 ? dp : 0.0f);
            rectF2.right = lerp;
            float f14 = rectF.right;
            boolean z10 = lerp > f14;
            if (z10) {
                rectF2.right = f14;
            }
            float f15 = rectF2.right;
            float f16 = rectF.left;
            if (f15 >= f16) {
                if (rectF2.left < f16) {
                    rectF2.left = f16;
                }
                if (F == null) {
                    F = new float[8];
                }
                if (i12 != i11) {
                    if (z10) {
                        c12 = 4;
                    } else {
                        c12 = 4;
                    }
                    if (i12 >= i9) {
                        float[] fArr = F;
                        float f17 = 0.7f * f10 * ln0Var.x;
                        fArr[7] = f17;
                        fArr[6] = f17;
                        fArr[c11] = f17;
                        fArr[c10] = f17;
                        fArr[5] = f10;
                        fArr[c12] = f10;
                        fArr[3] = f10;
                        fArr[2] = f10;
                    } else {
                        float[] fArr2 = F;
                        float f18 = 0.7f * f10 * ln0Var.x;
                        fArr2[5] = f18;
                        fArr2[c12] = f18;
                        fArr2[3] = f18;
                        fArr2[2] = f18;
                        fArr2[7] = f18;
                        fArr2[6] = f18;
                        fArr2[c11] = f18;
                        fArr2[c10] = f18;
                    }
                    G.addRoundRect(rectF2, F, Path.Direction.CW);
                    if (!z10) {
                        break;
                    }
                } else {
                    c12 = 4;
                }
                float[] fArr3 = F;
                fArr3[7] = f10;
                fArr3[6] = f10;
                fArr3[c11] = f10;
                fArr3[c10] = f10;
                float f19 = 0.7f * f10 * ln0Var.x;
                fArr3[5] = f19;
                fArr3[c12] = f19;
                fArr3[3] = f19;
                fArr3[2] = f19;
                G.addRoundRect(rectF2, F, Path.Direction.CW);
                if (!z10) {
                }
            }
            i12++;
            ln0Var = this;
        }
        canvas.drawPath(G, paint);
    }

    public final int d() {
        return this.f - E;
    }

    public final boolean f(float f10, float f11, int i9) {
        kn0 kn0Var;
        if (i9 == 0) {
            int i10 = this.g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.b = i15;
                        if (i15 < 0) {
                            this.b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.b = i16;
                            }
                        }
                    }
                    this.e = true;
                    int i17 = this.b;
                    this.c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i9 == 1 || i9 == 3) {
            if (this.e) {
                int i18 = this.c;
                this.b = i18;
                if (i9 == 1 && (kn0Var = this.h) != null) {
                    kn0Var.b(i18 / (this.f - E));
                }
                this.e = false;
                return true;
            }
        } else if (i9 == 2 && this.e) {
            int i19 = (int) (f10 - this.d);
            this.c = i19;
            if (i19 < 0) {
                this.c = 0;
            } else {
                int i20 = this.f - E;
                if (i19 > i20) {
                    this.c = i20;
                }
            }
            kn0 kn0Var2 = this.h;
            if (kn0Var2 != null) {
                kn0Var2.e(this.c / (this.f - E));
            }
            return true;
        }
        return false;
    }

    public final void g(float f10) {
        this.t = f10;
    }

    public final void h(int i9, int i10, int i11, int i12, int i13) {
        this.i = i9;
        this.j = i10;
        this.k = i12;
        this.l = i11;
        this.m = i13;
    }

    public final void i(float f10) {
        this.a = f10;
        int ceil = (int) Math.ceil((this.f - E) * f10);
        this.b = ceil;
        if (ceil < 0) {
            this.b = 0;
            return;
        }
        int i9 = this.f;
        int i10 = E;
        if (ceil > i9 - i10) {
            this.b = i9 - i10;
        }
    }

    public final void j(int i9, int i10) {
        if (this.f == i9 && this.g == i10) {
            return;
        }
        this.f = i9;
        this.g = i10;
        i(this.a);
    }

    public final void k(MessageObject messageObject) {
        Integer parseInt;
        String str;
        if (messageObject == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
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
        if (charSequence == this.v && this.w == valueOf.longValue()) {
            return;
        }
        this.v = charSequence;
        this.w = valueOf.longValue();
        if (!(charSequence instanceof Spanned)) {
            this.u = null;
            this.y = -1;
            this.x = 0.0f;
            StaticLayout[] staticLayoutArr = this.z;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
                return;
            }
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        try {
            p41[] p41VarArr = (p41[]) spanned.getSpans(0, spanned.length(), p41.class);
            this.u = new ArrayList();
            this.x = 0.0f;
            if (this.A == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                this.A.setColor(-1);
            }
            for (p41 p41Var : p41VarArr) {
                try {
                    if (p41Var != null && p41Var.getURL() != null && p41Var.d != null && p41Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) p41Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        Emoji.replaceEmoji(new SpannableStringBuilder(p41Var.d), this.A.getFontMetricsInt(), false);
                        this.u.add(new Pair(Float.valueOf((parseInt.intValue() * 1000) / valueOf.longValue()), p41Var));
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            Collections.sort(this.u, new jn0(0));
        } catch (Exception e11) {
            FileLog.e(e11);
            this.u = null;
            this.y = -1;
            this.x = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.z;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
        }
    }

    public void e(p41 p41Var) {
    }
}
