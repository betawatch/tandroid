package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lj extends om {
    public int U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int a3;
    public int b3;
    public int c3;
    public long d3;
    public float e3;
    public float f3;
    public boolean g3;
    public final float h3;
    public final Paint i3;
    public final Paint j3;
    public final ib.a k3;
    public final o1.k l3;
    public final ib.a m3;
    public final o1.k n3;
    public final ib.a o3;
    public final o1.k p3;
    public boolean q3;
    public final Path r3;
    public boolean s3;
    public int t3;
    public final /* synthetic */ tn u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(tn tnVar, Context context, rn rnVar) {
        super(tnVar, context, rnVar);
        this.u3 = tnVar;
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList(10);
        this.h3 = 2000.0f;
        Paint paint = new Paint(1);
        this.i3 = paint;
        Paint paint2 = new Paint(1);
        this.j3 = paint2;
        ib.a aVar = new ib.a(0.0f);
        this.k3 = aVar;
        o1.k kVar = new o1.k(aVar);
        kVar.h = 0.0f;
        kVar.g = 2000.0f;
        kVar.u = th.l(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        kVar.b(new o1.h(this) { // from class: org.telegram.ui.jj
            public final /* synthetic */ lj b;

            {
                this.b = this;
            }

            @Override // o1.h
            public final void a(o1.i iVar, float f9, float f10) {
                switch (i10) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.l3 = kVar;
        ib.a aVar2 = new ib.a(0.0f);
        this.m3 = aVar2;
        o1.k kVar2 = new o1.k(aVar2);
        kVar2.h = 0.0f;
        kVar2.u = th.l(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        kVar2.b(new o1.h(this) { // from class: org.telegram.ui.jj
            public final /* synthetic */ lj b;

            {
                this.b = this;
            }

            @Override // o1.h
            public final void a(o1.i iVar, float f9, float f10) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.n3 = kVar2;
        ib.a aVar3 = new ib.a(0.0f);
        this.o3 = aVar3;
        o1.k kVar3 = new o1.k(aVar3);
        kVar3.h = 0.0f;
        kVar3.u = th.l(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        kVar3.b(new o1.h(this) { // from class: org.telegram.ui.jj
            public final /* synthetic */ lj b;

            {
                this.b = this;
            }

            @Override // o1.h
            public final void a(o1.i iVar, float f9, float f10) {
                switch (i12) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.p3 = kVar3;
        this.r3 = new Path();
        this.t3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.u3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tn tnVar = this.u3;
        tnVar.q8 = null;
        canvas.save();
        if (tnVar.R9 != null && tnVar.N9) {
            boolean z10 = tnVar.O9;
        }
        this.C1.setEmpty();
        if (tnVar.J9 != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-tnVar.J9) - (tnVar.Q9 != 0.0f ? (tnVar.t0.getMeasuredHeight() - tnVar.J9) * tnVar.Q9 : 0.0f);
            tnVar.ua = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.J6) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        boolean z10;
        float f9;
        int i11;
        int dp;
        int i12;
        org.telegram.ui.ActionBar.d5 d5Var;
        float f10;
        org.telegram.ui.ActionBar.d5 d5Var2;
        boolean z11;
        in inVar;
        int i13;
        float f11;
        float f12;
        boolean z12;
        tn tnVar = this.u3;
        ArrayList arrayList3 = tnVar.q6;
        ColorMatrix colorMatrix = tnVar.N6;
        m.f3 f3Var = tnVar.O6;
        org.telegram.ui.ActionBar.d5 d5Var3 = tnVar.P6;
        Paint paint = tnVar.X6;
        Paint paint2 = tnVar.L6;
        ArrayList arrayList4 = tnVar.K6;
        Paint paint3 = tnVar.M6;
        long j10 = tnVar.J6 != 0 ? 200L : 200L;
        if (!AndroidUtilities.isTablet() && !tnVar.c4 && tnVar.f == null) {
            TLRPC.Chat chat = tnVar.e;
            boolean z13 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && tnVar.N3 != 7;
            if (tnVar.J9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -tnVar.J9);
            }
            int i14 = org.telegram.ui.ActionBar.g6.d6;
            org.telegram.ui.ActionBar.c6 c6Var = this.l2;
            boolean z14 = i0.a.f(org.telegram.ui.ActionBar.g6.v0(i14, c6Var)) <= 0.699999988079071d;
            int i15 = org.telegram.ui.ActionBar.g6.i6;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
            if (z14) {
                arrayList = arrayList3;
                i10 = 33;
            } else {
                arrayList = arrayList3;
                i10 = 3;
            }
            boolean z15 = z13;
            int d = i0.a.d(z14 ? 0.9f : 0.5f, v02, Color.argb(i10, 255, 255, 255));
            int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(i15, c6Var), z14 ? 24 : tn.Dc);
            if (tnVar.W6 != k9 || tnVar.V6 != d) {
                tnVar.V6 = d;
                tnVar.W6 = k9;
                int dp2 = AndroidUtilities.dp(200.0f);
                tnVar.R6 = dp2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{k9, d, d, k9}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                tnVar.U6 = linearGradient;
                tnVar.S6 = (-tnVar.R6) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z14 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, tnVar.R6, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                tnVar.Z6 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.d5 d5Var4 = d5Var3;
            long j11 = tnVar.Q6;
            Matrix matrix = tnVar.Y6;
            m.f3 f3Var2 = f3Var;
            Matrix matrix2 = tnVar.T6;
            long abs = Math.abs(j11 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j12 = abs < 4 ? 0L : abs;
            int width = getWidth();
            tnVar.Q6 = elapsedRealtime;
            int i16 = (int) (tnVar.S6 + ((width * j12) / 400.0f));
            tnVar.S6 = i16;
            if (i16 >= width * 2) {
                tnVar.S6 = (-tnVar.R6) * 2;
            }
            matrix2.setTranslate(tnVar.S6, 0.0f);
            LinearGradient linearGradient3 = tnVar.U6;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(tnVar.S6, 0.0f);
            LinearGradient linearGradient4 = tnVar.Z6;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - tnVar.wa) - ((int) (tnVar.W8(org.telegram.ui.Components.i21.c) + tnVar.v.c()))) - AndroidUtilities.dp(57.0f);
            int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                int top = getChildAt(i18).getTop();
                if (top < i17) {
                    i17 = top;
                }
            }
            if (tnVar.J6 == 0 && i17 <= 0) {
                z12 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
                tnVar.L6(z12);
            }
            Paint X0 = X0("paintChatActionBackground");
            if (paint3.getColor() != X0.getColor()) {
                paint3.setColor(X0.getColor());
            }
            if (paint3.getShader() != X0.getShader()) {
                paint3.setShader(X0.getShader());
                colorMatrix.setSaturation(tn.Ec);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i19 = 0;
            while (i19 < getChildCount()) {
                View childAt = getChildAt(i19);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + s1Var.y2(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f11 = 1.0f;
                        f12 = r13.top + currentMessagesGroup.transitionParams.offsetTop;
                    } else {
                        f11 = 1.0f;
                        f12 = 0.0f;
                    }
                    int i20 = (int) (top2 + f12);
                    i13 = i19;
                    if (tnVar.J6 == 0 && tnVar.D9()) {
                        i20 = AndroidUtilities.lerp(height, i20, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f11) {
                        i20 = height;
                    }
                    if (i20 < height) {
                        height = i20;
                    }
                } else {
                    i13 = i19;
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        int lerp = (tnVar.J6 == 0 && tnVar.D9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (lerp < height) {
                            height = lerp;
                        }
                    }
                }
                i19 = i13 + 1;
            }
            if (tnVar.D9()) {
                boolean z16 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.g6.a1();
                int i21 = org.telegram.ui.ActionBar.g6.d6;
                boolean z17 = i0.a.f(org.telegram.ui.ActionBar.g6.v0(i21, c6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.g6.a1();
                boolean z18 = i0.a.f(org.telegram.ui.ActionBar.g6.v0(i21, c6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.g6.a1();
                if (z16) {
                    org.telegram.ui.ActionBar.g6.q(0.0f, getY() - tnVar.s9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.g6.h2.getAlpha();
                if (z18) {
                    org.telegram.ui.ActionBar.g6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (tnVar.J6 != 0) {
                    z10 = z17;
                    f9 = 1.0f - ((System.currentTimeMillis() - tnVar.J6) / 200.0f);
                } else {
                    z10 = z17;
                    f9 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                rn rnVar = tnVar.aa;
                float f13 = (rnVar == null || !rnVar.C || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f9 * f13));
                float f14 = alpha2;
                paint2.setAlpha((int) (f9 * f13 * f14));
                paint.setAlpha((int) (f9 * f14));
                int i22 = 0;
                while (height > tnVar.va) {
                    int dp3 = height - AndroidUtilities.dp(3.0f);
                    if (i22 >= arrayList4.size()) {
                        inVar = new in();
                        d5Var2 = d5Var4;
                        TLRPC.Chat chat2 = tnVar.e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            z11 = z16;
                            inVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            z11 = z16;
                            inVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        inVar.a = (int) Math.min((tnVar.t0.getWidth() * 0.8f) - (z15 ? 0 : AndroidUtilities.dp(42.0f)), (((Utilities.fastRandom.nextFloat() * 0.35f) + 0.4f) * tnVar.t0.getWidth()) + AndroidUtilities.dp(42.0f));
                        arrayList4.add(inVar);
                    } else {
                        d5Var2 = d5Var4;
                        z11 = z16;
                        inVar = (in) arrayList4.get(i22);
                    }
                    boolean z19 = z10;
                    inVar.c = tnVar.J6 != 0 ? arrayList.size() <= 2 ? Math.min(inVar.c, dp3) : inVar.c : dp3;
                    height = dp3 - inVar.b;
                    i22++;
                    z10 = z19;
                    z16 = z11;
                    d5Var4 = d5Var2;
                }
                org.telegram.ui.ActionBar.d5 d5Var5 = d5Var4;
                boolean z20 = z16;
                boolean z21 = z10;
                if (arrayList4.isEmpty()) {
                    dp = getHeight() - tnVar.wa;
                    i11 = 0;
                } else {
                    i11 = 0;
                    dp = ((in) arrayList4.get(0)).c + AndroidUtilities.dp(3.0f);
                }
                int dp4 = AndroidUtilities.dp(z15 ? 3.0f : 51.0f);
                if (tnVar.C9()) {
                    dp4 = AndroidUtilities.lerp(dp4, AndroidUtilities.dp(71.0f), tnVar.Q8());
                }
                while (i11 < arrayList4.size() && dp > tnVar.va) {
                    int dp5 = dp - AndroidUtilities.dp(3.0f);
                    in inVar2 = (in) arrayList4.get(i11);
                    int i23 = inVar2.c;
                    ArrayList arrayList5 = arrayList4;
                    boolean z22 = z21;
                    org.telegram.ui.ActionBar.d5 d5Var6 = d5Var5;
                    d5Var6.setBounds(dp4, i23 - inVar2.b, inVar2.a, i23);
                    m.f3 f3Var3 = f3Var2;
                    if (z20) {
                        d5Var6.d(canvas, f3Var3, paint3);
                    }
                    d5Var6.d(canvas, f3Var3, paint2);
                    if (z22) {
                        d5Var6.d(canvas, f3Var3, org.telegram.ui.ActionBar.g6.h2);
                    }
                    d5Var6.d(canvas, f3Var3, paint);
                    if (z15) {
                        f3Var2 = f3Var3;
                        i12 = dp4;
                        d5Var = d5Var6;
                    } else {
                        if (z20) {
                            f10 = 27.0f;
                            f3Var2 = f3Var3;
                            i12 = dp4;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            f3Var2 = f3Var3;
                            i12 = dp4;
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z22) {
                            d5Var = d5Var6;
                            canvas.drawCircle(AndroidUtilities.dp(f10), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.g6.h2);
                        } else {
                            d5Var = d5Var6;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    dp = dp5 - inVar2.b;
                    i11++;
                    arrayList4 = arrayList5;
                    z21 = z22;
                    dp4 = i12;
                    d5Var5 = d5Var;
                }
                arrayList2 = arrayList4;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.g6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList2 = arrayList4;
                if (System.currentTimeMillis() - tnVar.J6 > j10) {
                    arrayList2.clear();
                }
            }
            arrayList2.size();
            arrayList.size();
            if (tnVar.J9 != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028a, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.m4] */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var2;
        int i10;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        float f9;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        boolean z13;
        boolean z14;
        int paddingTop;
        float f12;
        float checkBoxTranslation;
        int i12;
        float f13;
        int b10;
        int b11;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject;
        tn tnVar = this.u3;
        if (tnVar.D9()) {
            invalidate();
        }
        boolean z15 = view == tnVar.F8;
        boolean z16 = view instanceof org.telegram.ui.Cells.s1;
        if (z16) {
            s1Var = (org.telegram.ui.Cells.s1) view;
            z10 = s1Var.Vc.w0;
        } else {
            s1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.hv0.r0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z15 = true;
        }
        if (z16) {
            s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (tnVar.j6.contains(s1Var2)) {
                z15 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = s1Var2.getCurrentPosition();
            groupedMessages = s1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i16 = currentPosition.pw;
                int i17 = currentPosition.spanSize;
                if (i16 != i17 && i17 == 1000 && currentPosition.siblingHeights == null && groupedMessages.hasSibling) {
                    i10 = s1Var2.getBackgroundDrawableLeft();
                    i14 = 0;
                    i15 = s1Var2.G1;
                    if (i15 != 7) {
                    }
                    tnVar.q8 = s1Var2;
                    if (!z15) {
                    }
                    if (z15) {
                    }
                    i11 = i14;
                    v0Var = null;
                } else if (currentPosition.siblingHeights != null) {
                    i14 = view.getBottom() - AndroidUtilities.dp((s1Var2.m3() ? 1 : 0) + 1);
                    i10 = 0;
                    i15 = s1Var2.G1;
                    if ((i15 != 7 || i15 == 4) && (messageObject = s1Var2.u7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(s1Var2.u7)) {
                        tnVar.q8 = s1Var2;
                    }
                    if (!z15) {
                        View view2 = tnVar.F8;
                        if (view2 instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) view2;
                            if (s1Var3.getCurrentMessagesGroup() != null && s1Var3.getCurrentMessagesGroup() == groupedMessages) {
                                z15 = true;
                            }
                        }
                    }
                    if (z15) {
                        s1Var2.getPhotoImage().skipDraw();
                    }
                    i11 = i14;
                    v0Var = null;
                }
            }
            i10 = 0;
            i14 = 0;
            i15 = s1Var2.G1;
            if (i15 != 7) {
            }
            tnVar.q8 = s1Var2;
            if (!z15) {
            }
            if (z15) {
            }
            i11 = i14;
            v0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.v0) {
                v0Var = (org.telegram.ui.Cells.v0) view;
                s1Var2 = null;
                i10 = 0;
            } else {
                s1Var2 = null;
                i10 = 0;
                v0Var = null;
            }
            groupedMessages = null;
            i11 = 0;
        }
        if (i10 != 0) {
            canvas.save();
        } else if (i11 != 0) {
            canvas.save();
        }
        if (z15) {
            z15 = false;
        }
        if (z15) {
            f9 = 0.0f;
            z11 = false;
        } else {
            boolean z17 = (s1Var2 == null || s1Var2.Vc.v1 || groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) ? false : true;
            if (z17) {
                canvas.save();
                float E2 = s1Var2.E2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                float f14 = transitionParams.right + E2;
                f9 = 0.0f;
                canvas.clipRect(transitionParams.left + E2 + transitionParams.offsetLeft + AndroidUtilities.dp(4.0f), transitionParams.top + transitionParams.offsetTop + AndroidUtilities.dp(4.0f), (f14 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                f9 = 0.0f;
            }
            if (s1Var2 != null) {
                org.telegram.ui.Cells.r1 r1Var = s1Var2.Vc;
                if (r1Var.v1) {
                    canvas.save();
                    canvas.translate(s1Var2.getX(), s1Var2.getY());
                    s1Var2.S1(canvas);
                    canvas.restore();
                    z11 = r1Var.g;
                    if (z17) {
                        canvas.restore();
                    }
                    if (s1Var2 == null && s1Var2.U2()) {
                        canvas.save();
                        canvas.translate(s1Var2.getX(), s1Var2.getPaddingTopAnimated() + s1Var2.getY());
                        s1Var2.X1(canvas);
                        canvas.restore();
                    } else if (v0Var != null) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY());
                        v0Var.A(canvas);
                        canvas.restore();
                    }
                }
            }
            z11 = (s1Var2 == null || !z17) ? super.drawChild(canvas, view, j10) : super.drawChild(canvas, view, j10);
            if (z17) {
            }
            if (s1Var2 == null) {
            }
            if (v0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f9) {
            canvas.save();
            f10 = 0.0f;
            canvas.translate(0.0f, view.getTranslationY());
        } else {
            f10 = 0.0f;
        }
        if (s1Var2 != null) {
            s1Var2.K1(canvas);
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            canvas.translate(f10, view.getTranslationY());
        }
        if (s1Var2 != null) {
            MessageObject messageObject2 = s1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = s1Var2.getCurrentPosition();
            if (!z15) {
                if (currentPosition2 != null || s1Var2.getTransitionParams().w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.V2.add(s1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && s1Var2.T2()) {
                            this.W2.add(s1Var2);
                        }
                    }
                    if (currentPosition2 != null || s1Var2.getTransitionParams().C0 || s1Var2.getTransitionParams().w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & s1Var2.t0()) != 0) {
                            this.X2.add(s1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i18 = currentPosition2.flags;
                            if ((i18 & 8) != 0) {
                            }
                        }
                        this.Y2.add(s1Var2);
                    }
                }
                if (tnVar.p8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    float x4 = s1Var2.getX() + photoImage.getImageX();
                    float y8 = (tnVar.t0.getY() + (photoImage.getImageY() + (s1Var2.getY() + s1Var2.getPaddingTop()))) - tnVar.p8.getTop();
                    if (tnVar.p8.getTranslationX() != x4 || tnVar.p8.getTranslationY() != y8) {
                        tnVar.p8.setTranslationX(x4);
                        tnVar.p8.setTranslationY(y8);
                        tnVar.fragmentView.invalidate();
                        tnVar.p8.invalidate();
                    }
                }
            }
        }
        if (s1Var != null) {
            MessageObject messageObject3 = s1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = s1Var.getCurrentPosition();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null && tnVar.Q8() < 1.0f) {
                MessageObject.GroupedMessages X8 = tnVar.X8(messageObject3);
                if (!s1Var.getMessageObject().deleted) {
                    tnVar.t0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z13 = true;
                        z14 = !tnVar.t0.T1 || (X8 != null && X8.transitionParams.backgroundChangeBounds);
                        paddingTop = view.getPaddingTop() + (!z14 ? view.getTop() : (int) view.getY());
                        if (s1Var.j()) {
                            if (s1Var.kc) {
                                b11 = ((SparseArray) tnVar.S8.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) tnVar.S8.j).keyAt(b11);
                                }
                            } else {
                                b11 = tnVar.t0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (X8 == null || currentPosition3 == null) {
                                    z12 = z11;
                                    f12 = 1.0f;
                                    i13 = b11 - 1;
                                } else {
                                    int indexOf = X8.posArray.indexOf(currentPosition3);
                                    f12 = 1.0f;
                                    int size = X8.posArray.size();
                                    if ((currentPosition3.flags & 8) != 0) {
                                        i13 = (b11 - size) + indexOf;
                                    } else {
                                        i13 = b11 - 1;
                                        int i19 = indexOf + 1;
                                        while (i19 < size) {
                                            z12 = z11;
                                            if (X8.posArray.get(i19).minY > currentPosition3.maxY) {
                                                break;
                                            }
                                            i13--;
                                            i19++;
                                            z11 = z12;
                                        }
                                    }
                                    z12 = z11;
                                }
                                if (s1Var.kc) {
                                    if (((View) ((SparseArray) tnVar.S8.j).get(i13)) != null) {
                                        if (view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        avatarImage.setVisible(false, false);
                                        return z12;
                                    }
                                } else if (tnVar.t0.K(i13) != null) {
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.restore();
                                    }
                                    avatarImage.setVisible(false, false);
                                    return z12;
                                }
                                checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                                int layoutHeight = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z14 ? view.getTop() : view.getY()))))));
                                int measuredHeight = tnVar.t0.getMeasuredHeight() - tnVar.t0.getPaddingBottom();
                                boolean z18 = (!s1Var.i1 || s1Var.j1) && checkBoxTranslation == 0.0f;
                                if (!s1Var.o3() || s1Var.getTransitionParams().k2) {
                                    if (s1Var.getTransitionParams().k2) {
                                        float f15 = s1Var.getTransitionParams().K1;
                                        if (!s1Var.o3()) {
                                            f15 = f12 - f15;
                                        }
                                        layoutHeight = (int) com.google.android.recaptcha.internal.a.z(1.0f, f15, Math.min(layoutHeight, measuredHeight), layoutHeight * f15);
                                    }
                                } else if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (!z14 && view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                if (s1Var.h()) {
                                    if (s1Var.kc) {
                                        b10 = ((SparseArray) tnVar.S8.j).indexOfValue(view);
                                        if (b10 >= 0) {
                                            b10 = ((SparseArray) tnVar.S8.j).keyAt(b10);
                                        }
                                    } else {
                                        b10 = tnVar.t0.T(view).b();
                                    }
                                    if (b10 >= 0) {
                                        float f16 = checkBoxTranslation;
                                        ?? r11 = s1Var;
                                        int i20 = b10;
                                        int i21 = 0;
                                        while (i21 < 20) {
                                            i21++;
                                            if (X8 == null || currentPosition3 == null) {
                                                i12 = layoutHeight;
                                                i20++;
                                            } else {
                                                int indexOf2 = X8.posArray.indexOf(currentPosition3);
                                                if (indexOf2 < 0) {
                                                    break;
                                                }
                                                i12 = layoutHeight;
                                                X8.posArray.size();
                                                if ((currentPosition3.flags & 4) != 0) {
                                                    i20 = i20 + indexOf2 + 1;
                                                } else {
                                                    i20++;
                                                    for (int i22 = indexOf2 - 1; i22 >= 0 && X8.posArray.get(i22).maxY >= currentPosition3.minY; i22--) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            if (!r11.i()) {
                                                f2.n1 K = tnVar.t0.K(i20);
                                                if (K == null) {
                                                    break;
                                                }
                                                ?? r02 = K.a;
                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                if (!(r02 instanceof org.telegram.ui.Cells.s1)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.m4) r02;
                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z18 && checkBoxTranslation2 > 0.0f) {
                                                    f16 = checkBoxTranslation2;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            } else {
                                                ?? r03 = (View) ((SparseArray) tnVar.S8.j).get(i20);
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                if (!(r03 instanceof org.telegram.ui.Cells.m4)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.m4) r03;
                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z18 && checkBoxTranslation3 > 0.0f) {
                                                    f16 = checkBoxTranslation3;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            }
                                            int dp = i12 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i12;
                                            if (!s1Var.j()) {
                                                int bottom = z14 ? view.getBottom() : (int) (s1Var.getDeltaBottom() + s1Var.getY() + s1Var.getMeasuredHeight());
                                                if (dp > bottom) {
                                                    dp = bottom;
                                                }
                                            }
                                            canvas.save();
                                            if (checkBoxTranslation != 0.0f) {
                                                canvas.translate(checkBoxTranslation, 0.0f);
                                            }
                                            if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                                org.telegram.ui.Cells.s1 s1Var4 = s1Var;
                                                if (s1Var4.getCurrentMessagesGroup() != null && s1Var4.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                                                    dp = (int) (dp - s1Var4.getTranslationY());
                                                }
                                            }
                                            if (z13) {
                                                avatarImage.setImageY(dp - AndroidUtilities.dp(44.0f));
                                            }
                                            if (s1Var.a()) {
                                                avatarImage.setAlpha(s1Var.getAlpha() * (1.0f - tnVar.Q8()));
                                                canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
                                                f13 = 1.0f;
                                            } else {
                                                f13 = 1.0f;
                                                avatarImage.setAlpha(1.0f - tnVar.Q8());
                                            }
                                            if (z13) {
                                                avatarImage.setVisible(true, false);
                                            }
                                            if (tnVar.Q8() > 0.0f) {
                                                canvas.scale(f13 - tnVar.Q8(), f13 - tnVar.Q8(), avatarImage.getImageX2(), avatarImage.getImageY2());
                                                f11 = 0.0f;
                                                canvas.translate(tnVar.Q8() * AndroidUtilities.dp(24.0f), 0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            avatarImage.draw(canvas);
                                            canvas.restore();
                                            if (!z14 && view.getTranslationY() != f11) {
                                                canvas.save();
                                            }
                                            if (view.getTranslationY() != f11) {
                                                canvas.restore();
                                            }
                                            return z12;
                                        }
                                        i12 = layoutHeight;
                                        s1Var = r11;
                                        checkBoxTranslation = f16;
                                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                        }
                                        if (!s1Var.j()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                        }
                                        if (z13) {
                                        }
                                        if (s1Var.a()) {
                                        }
                                        if (z13) {
                                        }
                                        if (tnVar.Q8() > 0.0f) {
                                        }
                                        avatarImage.draw(canvas);
                                        canvas.restore();
                                        if (!z14) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f11) {
                                        }
                                        return z12;
                                    }
                                }
                                i12 = layoutHeight;
                                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                }
                                if (!s1Var.j()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                }
                                if (z13) {
                                }
                                if (s1Var.a()) {
                                }
                                if (z13) {
                                }
                                if (tnVar.Q8() > 0.0f) {
                                }
                                avatarImage.draw(canvas);
                                canvas.restore();
                                if (!z14) {
                                }
                                if (view.getTranslationY() != f11) {
                                }
                                return z12;
                            }
                        }
                        z12 = z11;
                        f12 = 1.0f;
                        checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                        int layoutHeight2 = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z14 ? view.getTop() : view.getY()))))));
                        int measuredHeight2 = tnVar.t0.getMeasuredHeight() - tnVar.t0.getPaddingBottom();
                        if (s1Var.i1) {
                        }
                        if (s1Var.o3()) {
                        }
                        if (s1Var.getTransitionParams().k2) {
                        }
                        if (!z14) {
                            canvas.restore();
                        }
                        if (s1Var.h()) {
                        }
                        i12 = layoutHeight2;
                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                        }
                        if (!s1Var.j()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (s1Var instanceof org.telegram.ui.Cells.s1) {
                        }
                        if (z13) {
                        }
                        if (s1Var.a()) {
                        }
                        if (z13) {
                        }
                        if (tnVar.Q8() > 0.0f) {
                        }
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (!z14) {
                        }
                        if (view.getTranslationY() != f11) {
                        }
                        return z12;
                    }
                }
                z13 = false;
                if (tnVar.t0.T1) {
                }
                paddingTop = view.getPaddingTop() + (!z14 ? view.getTop() : (int) view.getY());
                if (s1Var.j()) {
                }
                z12 = z11;
                f12 = 1.0f;
                checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                int layoutHeight22 = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z14 ? view.getTop() : view.getY()))))));
                int measuredHeight22 = tnVar.t0.getMeasuredHeight() - tnVar.t0.getPaddingBottom();
                if (s1Var.i1) {
                }
                if (s1Var.o3()) {
                }
                if (s1Var.getTransitionParams().k2) {
                }
                if (!z14) {
                }
                if (s1Var.h()) {
                }
                i12 = layoutHeight22;
                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                }
                if (!s1Var.j()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                }
                if (z13) {
                }
                if (s1Var.a()) {
                }
                if (z13) {
                }
                if (tnVar.Q8() > 0.0f) {
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z14) {
                }
                if (view.getTranslationY() != f11) {
                }
                return z12;
            }
        }
        z12 = z11;
        f11 = 0.0f;
        if (view.getTranslationY() != f11) {
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void h1(View view, float f9, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f9, f10, z10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject.isMusic() || messageObject.isDocument() || (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        s1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f9;
        float f10;
        np npVar;
        int i10;
        float f11;
        int i11;
        String string;
        String string2;
        String string3;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i13;
        Paint paint;
        Paint paint2;
        int i14;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        Paint paint4;
        Paint paint5;
        float f18;
        float f19;
        float f20;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i15;
        float f21;
        float f22;
        super.onDraw(canvas);
        tn tnVar = this.u3;
        org.telegram.ui.Cells.s1 s1Var = tnVar.Z8;
        if (s1Var != null) {
            float slidingOffsetX = com.google.android.recaptcha.internal.a.u(s1Var) ? s1Var.getSlidingOffsetX() : 0.0f;
            if (!tnVar.a9 && !tnVar.b9 && this.f3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f23 = ((currentTimeMillis - this.d3) / 180.0f) + this.e3;
                this.e3 = f23;
                if (f23 > 1.0f) {
                    this.e3 = 1.0f;
                }
                this.d3 = currentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.e3)) * this.f3;
                if (interpolation == 0.0f) {
                    this.f3 = 0.0f;
                }
                org.telegram.ui.Cells.s1 s1Var2 = tnVar.Z8;
                if (com.google.android.recaptcha.internal.a.u(s1Var2)) {
                    z1(s1Var2, interpolation);
                }
                tn.V1(tnVar, interpolation);
                MessageObject T1 = tn.T1(tnVar);
                if (T1 != null && (T1.isRoundVideo() || T1.isVideo())) {
                    tnVar.Mc(false, false);
                }
                float f24 = this.e3;
                if (f24 == 1.0f || f24 == 0.0f) {
                    tn.V1(tnVar, 0.0f);
                    tnVar.Z8 = null;
                }
                invalidate();
            }
            if (tnVar.Z8 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.g6.h2;
                Paint paint7 = this.i3;
                if (paint7.getColor() != X0.getColor()) {
                    paint7.setColor(X0.getColor());
                }
                Paint paint8 = this.j3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != X0.getShader()) {
                    paint7.setShader(X0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                ib.a aVar = this.m3;
                float f25 = aVar.a;
                float f26 = this.h3;
                float f27 = f25 / f26;
                f9 = 255.0f;
                int color = paint8.getColor();
                if (f27 > 1.0f) {
                    this.q3 = true;
                }
                f10 = 2.0f;
                org.telegram.ui.Cells.s1 s1Var3 = tnVar.Z8;
                float E2 = com.google.android.recaptcha.internal.a.u(s1Var3) ? s1Var3.E2(false) : 0.0f;
                ib.a aVar2 = this.k3;
                float f28 = aVar2.a;
                ib.a aVar3 = this.o3;
                o1.k kVar = this.p3;
                o1.k kVar2 = this.n3;
                if (f28 == 0.0f) {
                    kVar2.c();
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                    double d = 0.0f;
                    kVar2.u.i = d;
                    aVar.a = 0.0f;
                    kVar.c();
                    kVar.u.i = d;
                    aVar3.a = 0.0f;
                    this.q3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) kVar2.u.i) != f26) {
                    f12 = 1.0f;
                    f13 = i7.w.a(((-E2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f12 = 1.0f;
                    f13 = 1.0f;
                }
                if (f13 == f12) {
                    o1.l lVar = kVar2.u;
                    f14 = f27;
                    f15 = 20.0f;
                    if (((float) lVar.i) != f26) {
                        double d10 = f26;
                        lVar.i = d10;
                        kVar2.f();
                        kVar.u.i = d10;
                        kVar.f();
                    }
                } else {
                    f14 = f27;
                    f15 = 20.0f;
                }
                float f29 = E2 <= ((float) (-AndroidUtilities.dp(f15))) ? f26 : 0.0f;
                o1.k kVar3 = this.l3;
                o1.l lVar2 = kVar3.u;
                if (f29 != ((float) lVar2.i)) {
                    lVar2.i = f29;
                    if (!kVar3.f) {
                        kVar3.f();
                    }
                }
                float f30 = aVar2.a / f26;
                MessageObject T12 = tn.T1(tnVar);
                float measuredWidth = (E2 * ((T12 == null || !T12.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (tnVar.Z8.getMeasuredHeight() / 2.0f) + tnVar.Z8.getTop();
                boolean z10 = this.q3;
                float f31 = z10 ? f14 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f14;
                int i16 = org.telegram.ui.ActionBar.g6.d6;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.l2;
                boolean z11 = i0.a.f(org.telegram.ui.ActionBar.g6.v0(i16, c6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f18 = f26;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f31))), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f14 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        Paint paint9 = paint2;
                        paint9.setAlpha((int) (alpha * f30));
                        float f33 = f13 * 360.0f;
                        f16 = f13;
                        f19 = f30;
                        paint3 = paint;
                        c6Var = c6Var2;
                        f17 = measuredWidth;
                        f20 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (tnVar.aa.l0()) {
                            int alpha2 = paint8.getAlpha();
                            paint5 = paint8;
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha2 * f19));
                            paint4 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f33, false, paint5);
                        } else {
                            paint4 = paint9;
                            paint5 = paint8;
                            canvas2 = canvas;
                        }
                    } else {
                        Paint paint10 = paint2;
                        f16 = f13;
                        paint3 = paint;
                        f17 = measuredWidth;
                        paint4 = paint10;
                        canvas2 = canvas;
                        f19 = f30;
                        c6Var = c6Var2;
                        paint5 = paint8;
                        f20 = measuredHeight;
                    }
                } else {
                    Paint paint11 = paint2;
                    f16 = f13;
                    paint3 = paint;
                    f17 = measuredWidth;
                    paint4 = paint11;
                    canvas2 = canvas;
                    paint5 = paint8;
                    f18 = f26;
                    f19 = f30;
                    f20 = measuredHeight;
                    c6Var = c6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f31)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f31)), (int) ((AndroidUtilities.dp(16.0f) * f31) + f17), (int) ((AndroidUtilities.dp(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.r3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f31, AndroidUtilities.dp(16.0f) * f31, direction);
                int alpha3 = X0.getAlpha();
                float f34 = 0.6f * f19 * f16;
                X0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha3);
                if (tnVar.aa.l0()) {
                    int alpha4 = org.telegram.ui.ActionBar.g6.h2.getAlpha();
                    if (z11) {
                        f22 = f34;
                        org.telegram.ui.ActionBar.g6.h2.setColor(-1);
                    } else {
                        f22 = f34;
                    }
                    org.telegram.ui.ActionBar.g6.h2.setAlpha((int) (alpha4 * f22));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.h2);
                    org.telegram.ui.ActionBar.g6.h2.setAlpha(alpha4);
                }
                int i17 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                if (i17 != 0) {
                    i15 = i17;
                    f21 = f31;
                    rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f32)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f32)), (int) ((AndroidUtilities.dp(16.0f) * f32) + f17), (int) ((AndroidUtilities.dp(16.0f) * f32) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i15 = i17;
                    f21 = f31;
                }
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f21)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f21)), (int) ((AndroidUtilities.dp(16.0f) * f21) + f17), (int) ((AndroidUtilities.dp(16.0f) * f21) + f20));
                org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f21, AndroidUtilities.dp(16.0f) * f21, direction);
                int alpha5 = X0.getAlpha();
                float f35 = 0.4f * f19;
                X0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha5);
                if (tnVar.aa.l0()) {
                    int alpha6 = org.telegram.ui.ActionBar.g6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.g6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.g6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.h2);
                    org.telegram.ui.ActionBar.g6.h2.setAlpha(alpha6);
                }
                if (i15 != 0) {
                    canvas2.restore();
                }
                float f36 = aVar3.a / f18;
                if (f36 != 0.0f && f36 != 1.0f) {
                    float f37 = f36 + 1.0f;
                    float strokeWidth = paint4.getStrokeWidth();
                    float f38 = (1.0f - f36) * strokeWidth;
                    if (f38 != 0.0f) {
                        rectF2.set((int) ((f17 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) ((f20 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f17) - f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f20) - f38));
                        org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint4.getAlpha();
                        paint4.setAlpha((int) (alpha7 * f19));
                        paint4.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint4);
                        paint4.setStrokeWidth(strokeWidth);
                        paint4.setAlpha(alpha7);
                        if (tnVar.aa.l0()) {
                            int alpha8 = paint5.getAlpha();
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha8 * f19));
                            paint5.setStrokeWidth(f38);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint5);
                            paint5.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i18 = (int) (f19 * 255.0f);
                Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.g6.O0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f17 - ((drawable.getIntrinsicWidth() / 2) * f21)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f21)), (int) (((drawable.getIntrinsicWidth() / 2) * f21) + f17), (int) (((drawable.getIntrinsicHeight() / 2) * f21) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                int i19 = i14;
                paint5.setColor(i19);
                paint3.setColor(i19);
                if (tnVar.J9 != 0.0f || tnVar.isInPreviewMode() || tnVar.Ka || (i10 = tnVar.N3) == 3 || i10 == 1) {
                    npVar = tnVar.L9;
                    if (npVar == null) {
                        npVar.K = 0.0f;
                        npVar.J = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (tnVar.Q9 != 0.0f) {
                    float measuredHeight2 = tnVar.t0.getMeasuredHeight() - tnVar.J9;
                    tn tnVar2 = tnVar.P9;
                    f11 = (measuredHeight2 + (tnVar2 == null ? 0.0f : tnVar2.K9)) * tnVar.Q9;
                } else {
                    f11 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - tnVar.wa) - f11);
                if (tnVar.L9 == null) {
                    i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    np npVar2 = new np(i13, tnVar.fragmentView, tnVar.P5, tnVar.qa, tnVar.ra, tnVar.b(), tnVar.aa);
                    tnVar.L9 = npVar2;
                    npVar2.O = tnVar.qc.e;
                    ArrayList arrayList = tnVar.bb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        tnVar.L9.i((TLRPC.Chat) tnVar.bb.get(0));
                    } else if (tnVar.d4) {
                        tnVar.L9.j();
                    } else {
                        tnVar.L9.h();
                    }
                    tnVar.L9.f();
                }
                np npVar3 = tnVar.L9;
                int measuredWidth2 = getMeasuredWidth() - (tnVar.C9() ? AndroidUtilities.dp(71.0f) : 0);
                ImageReceiver imageReceiver = npVar3.B;
                TextPaint textPaint = npVar3.f;
                TextPaint textPaint2 = npVar3.h;
                boolean z12 = npVar3.T;
                if (measuredWidth2 != npVar3.c || (z12 && (tL_forumTopic = npVar3.D) != null && npVar3.E != tL_forumTopic.id)) {
                    npVar3.d = AndroidUtilities.dp(56.0f) / f10;
                    npVar3.c = measuredWidth2;
                    TLRPC.Chat chat = npVar3.C;
                    if (chat != null) {
                        string = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = npVar3.D;
                        if (tL_forumTopic2 != null) {
                            string = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(npVar3.a0).getChat(Long.valueOf(-npVar3.e0)).title);
                            } else {
                                i11 = 0;
                                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                            npVar3.x = measureText;
                            int min = Math.min(measureText, npVar3.c - AndroidUtilities.dp(60.0f));
                            npVar3.x = min;
                            npVar3.s = org.telegram.ui.Components.bw0.c(string, textPaint, min, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, min, 1, true);
                            if (!npVar3.R) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                            } else if (z12) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                            } else {
                                boolean z13 = npVar3.S;
                                if (z13 && (i12 = npVar3.a) != npVar3.b0 && i12 != 0) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
                                } else if (z13) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                                } else {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(string2);
                            npVar3.y = measureText2;
                            npVar3.y = Math.min(measureText2, npVar3.c - AndroidUtilities.dp(60.0f));
                            int i20 = npVar3.y;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            npVar3.v = new StaticLayout(string2, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(string3);
                            npVar3.A = measureText3;
                            npVar3.A = Math.min(measureText3, npVar3.c - AndroidUtilities.dp(60.0f));
                            npVar3.w = new StaticLayout(string3, textPaint2, npVar3.A, alignment, 1.0f, 0.0f, false);
                            imageReceiver.setImageCoords((npVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + npVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                            npVar3.Y.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                            if (z12) {
                                npVar3.E = npVar3.D == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                    npVar3.x = measureText4;
                    int min2 = Math.min(measureText4, npVar3.c - AndroidUtilities.dp(60.0f));
                    npVar3.x = min2;
                    npVar3.s = org.telegram.ui.Components.bw0.c(string, textPaint, min2, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, min2, 1, true);
                    if (!npVar3.R) {
                    }
                    int measureText22 = (int) textPaint2.measureText(string2);
                    npVar3.y = measureText22;
                    npVar3.y = Math.min(measureText22, npVar3.c - AndroidUtilities.dp(60.0f));
                    int i202 = npVar3.y;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    npVar3.v = new StaticLayout(string2, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(string3);
                    npVar3.A = measureText32;
                    npVar3.A = Math.min(measureText32, npVar3.c - AndroidUtilities.dp(60.0f));
                    npVar3.w = new StaticLayout(string3, textPaint2, npVar3.A, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.setImageCoords((npVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + npVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                    npVar3.Y.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                    if (z12) {
                    }
                }
                float min3 = Math.min(1.0f, tnVar.J9 / AndroidUtilities.dp(110.0f));
                canvas2.translate(tnVar.C9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), tnVar.Q8()) : 0.0f, -(tnVar.W8(org.telegram.ui.Components.i21.c) + tnVar.O.getInputBubbleHeight() + tnVar.v.c() + AndroidUtilities.dp(10.0f)));
                tnVar.L9.a(canvas2, tnVar.t0, min3, 1.0f - tnVar.Q9);
                canvas2.restore();
                if (tnVar.P9 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.t0.getMeasuredWidth(), tnVar.P9.t0.getMeasuredHeight(), (int) (tnVar.Q9 * f9), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - tnVar.J9) - f11);
                    tnVar.P9.t0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f9 = 255.0f;
        f10 = 2.0f;
        if (tnVar.J9 != 0.0f) {
        }
        npVar = tnVar.L9;
        if (npVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.u3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fh.k kVar;
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.u3;
        lm lmVar = tnVar.Y8;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(lmVar.g0);
            lmVar.z = false;
        }
        if (this.T1 || ((kVar = tnVar.T9) != null && kVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (!lVar.s() && !tnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.U2;
        int i15 = i12 - i10;
        tn tnVar = this.u3;
        if (i14 != i15) {
            if (i14 != 0) {
                tnVar.h9(false);
            }
            this.U2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.t3 != measuredHeight) {
            this.s3 = true;
            nj njVar = tnVar.u0;
            if (njVar != null) {
                njVar.g();
            }
            tnVar.S8.a();
            this.s3 = false;
            this.t3 = measuredHeight;
        }
        tnVar.N5 = false;
        lm lmVar = tnVar.Y8;
        if (lmVar != null && lmVar.y()) {
            tnVar.Y8.x();
        }
        tnVar.p9();
        tnVar.D9();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        np npVar;
        tn tnVar = this.u3;
        vd.a aVar = tnVar.qc;
        lm lmVar = tnVar.Y8;
        lmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(lmVar.g0);
            lmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            tnVar.oa = true;
        }
        if (tnVar.J9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, tnVar.J9 / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (npVar = tnVar.L9) == null || npVar.N) {
                np npVar2 = tnVar.L9;
                if (npVar2 != null && npVar2.N) {
                    long currentTimeMillis = System.currentTimeMillis();
                    np npVar3 = tnVar.L9;
                    if (currentTimeMillis - npVar3.Q < 500 && npVar3.I) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        tnVar.M9 = animatorSet;
                        if (tnVar.L9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(tnVar.J9, AndroidUtilities.dp(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kj
                            public final /* synthetic */ lj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        tn tnVar2 = this.b.u3;
                                        tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar2.t0.invalidate();
                                        break;
                                    case 1:
                                        tn tnVar3 = this.b.u3;
                                        tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar3.t0.invalidate();
                                        break;
                                    case 2:
                                        tn tnVar4 = this.b.u3;
                                        tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar4.t0.invalidate();
                                        break;
                                    default:
                                        tn tnVar5 = this.b.u3;
                                        tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar5.t0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.jr.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kj
                            public final /* synthetic */ lj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        tn tnVar2 = this.b.u3;
                                        tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar2.t0.invalidate();
                                        break;
                                    case 1:
                                        tn tnVar3 = this.b.u3;
                                        tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar3.t0.invalidate();
                                        break;
                                    case 2:
                                        tn tnVar4 = this.b.u3;
                                        tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar4.t0.invalidate();
                                        break;
                                    default:
                                        tn tnVar5 = this.b.u3;
                                        tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar5.t0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(uh.m.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(tnVar.J9, 0.0f);
                tnVar.M9 = ofFloat3;
                if (tnVar.L9 != null) {
                    aVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kj
                    public final /* synthetic */ lj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                tn tnVar2 = this.b.u3;
                                tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar2.t0.invalidate();
                                break;
                            case 1:
                                tn tnVar3 = this.b.u3;
                                tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar3.t0.invalidate();
                                break;
                            case 2:
                                tn tnVar4 = this.b.u3;
                                tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar4.t0.invalidate();
                                break;
                            default:
                                tn tnVar5 = this.b.u3;
                                tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar5.t0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(uh.m.V);
                ofFloat3.start();
            } else if (npVar.G != 1.0f) {
                float f9 = tnVar.J9;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f9, AndroidUtilities.dp(8.0f) + f9);
                tnVar.M9 = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kj
                    public final /* synthetic */ lj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                tn tnVar2 = this.b.u3;
                                tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar2.t0.invalidate();
                                break;
                            case 1:
                                tn tnVar3 = this.b.u3;
                                tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar3.t0.invalidate();
                                break;
                            case 2:
                                tn tnVar4 = this.b.u3;
                                tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar4.t0.invalidate();
                                break;
                            default:
                                tn tnVar5 = this.b.u3;
                                tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar5.t0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
                ofFloat4.setInterpolator(jrVar);
                ofFloat4.start();
                final np npVar4 = tnVar.L9;
                ui uiVar = new ui(this, i12);
                AnimatorSet animatorSet2 = npVar4.F;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    npVar4.F.cancel();
                }
                npVar4.U = uiVar;
                npVar4.F = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(npVar4.G, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                np npVar5 = npVar4;
                                npVar5.getClass();
                                npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                npVar5.P.invalidate();
                                View view = npVar5.W;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                np npVar6 = npVar4;
                                npVar6.getClass();
                                npVar6.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = npVar6.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(npVar4.H, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                np npVar5 = npVar4;
                                npVar5.getClass();
                                npVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                npVar5.P.invalidate();
                                View view = npVar5.W;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                np npVar6 = npVar4;
                                npVar6.getClass();
                                npVar6.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = npVar6.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                npVar4.F.addListener(new bm(npVar4, i12));
                npVar4.F.playTogether(ofFloat5, ofFloat6);
                npVar4.F.setDuration(120L);
                npVar4.F.setInterpolator(jrVar);
                npVar4.F.start();
            } else {
                tn.X1(tnVar);
            }
        }
        if (!this.T1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (lVar.s() || tnVar.A9()) {
                return onTouchEvent;
            }
            y1(motionEvent);
            if (tnVar.b9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.u3.M8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.u3.Z8 != null) {
            y1(null);
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s3) {
            return;
        }
        sg.a aVar = this.u3.Mb;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(f2.u0 u0Var) {
        if (this.T1) {
            return;
        }
        super.setItemAnimator(u0Var);
    }

    @Override // org.telegram.ui.Components.jl0, android.view.View
    public final void setTranslationY(float f9) {
        if (f9 != getTranslationY()) {
            super.setTranslationY(f9);
            tn tnVar = this.u3;
            tnVar.o9();
            tnVar.r9();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03bf, code lost:
    
        if (r2.messages.size() != 1) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f9;
        float f10;
        tn tnVar;
        float f11;
        int i12;
        float f12;
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i13;
        org.telegram.ui.ActionBar.l lVar;
        int measuredHeight;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.l lVar2;
        int measuredHeight2;
        lj ljVar = this;
        Canvas canvas2 = canvas;
        int childCount = ljVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i16 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f9 = 0.0f;
            f10 = 2.0f;
            tnVar = ljVar.u3;
            if (i16 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = ljVar.getChildAt(i16);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!tn.d2(tnVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.t1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (tnVar.w0.n && (childAt instanceof org.telegram.ui.Cells.h0)) {
                        float measuredHeight3 = ((((ljVar.getMeasuredHeight() - tnVar.o9) - tnVar.wa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + tnVar.o9;
                        if (!((org.telegram.ui.Cells.h0) childAt).E && !tnVar.t0.T1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.ua) {
                        float measuredHeight4 = ((((ljVar.getMeasuredHeight() - tnVar.o9) - tnVar.wa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + tnVar.o9;
                        if (!((org.telegram.ui.Cells.ua) childAt).J && !tnVar.t0.T1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = s1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                                MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                                org.telegram.ui.Components.ma0 backgroundDrawable = s1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || s1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z11 = s1Var.b8;
                                    org.telegram.ui.ActionBar.c6 c6Var = ljVar.l2;
                                    if (z11 || s1Var.c8) {
                                        i13 = i16;
                                        if (currentPosition == null) {
                                            Paint X0 = ljVar.X0("paintChatMessageBackgroundSelected");
                                            rn rnVar = tnVar.aa;
                                            if ((rnVar == null || !rnVar.C) && X0 != null) {
                                                if (tnVar.x9()) {
                                                    measuredHeight = tnVar.t0.getTop();
                                                } else {
                                                    lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                                    measuredHeight = lVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - tnVar.T0.getBackgroundTranslationY();
                                                int backgroundSizeY = tnVar.T0.getBackgroundSizeY();
                                                rn rnVar2 = tnVar.aa;
                                                if (rnVar2 != null) {
                                                    rnVar2.l(s1Var.getX(), backgroundTranslationY, ljVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.g6.q(s1Var.getX(), backgroundTranslationY, ljVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                X0 = org.telegram.ui.ActionBar.g6.a2;
                                                X0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hc, c6Var));
                                            }
                                            Paint paint = X0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, s1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (s1Var.getAlpha() * s1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, s1Var.getTop(), ljVar.getMeasuredWidth(), s1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y8 = (int) s1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i14 = s1Var.getMeasuredHeight();
                                            i13 = i16;
                                        } else {
                                            int measuredHeight5 = s1Var.getMeasuredHeight() + y8;
                                            long j10 = 0;
                                            int i17 = 0;
                                            float f13 = 0.0f;
                                            while (i17 < childCount) {
                                                View childAt2 = ljVar.getChildAt(i17);
                                                int i18 = i16;
                                                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt2;
                                                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.ma0 backgroundDrawable2 = s1Var2.getBackgroundDrawable();
                                                        i15 = i17;
                                                        y8 = Math.min(y8, (int) s1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, s1Var2.getMeasuredHeight() + ((int) s1Var2.getY()));
                                                        long j11 = backgroundDrawable2.l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            f9 = s1Var2.getX() + backgroundDrawable2.h;
                                                            f13 = s1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i17 = i15 + 1;
                                                        i16 = i18;
                                                    }
                                                }
                                                i15 = i17;
                                                i17 = i15 + 1;
                                                i16 = i18;
                                            }
                                            i13 = i16;
                                            backgroundDrawable.j = f9;
                                            backgroundDrawable.k = f13 - y8;
                                            i14 = measuredHeight5 - y8;
                                        }
                                        int i19 = i14 + y8;
                                        canvas2.clipRect(0, y8, ljVar.getMeasuredWidth(), i19);
                                        Paint X02 = ljVar.X0("paintChatMessageBackgroundSelected");
                                        rn rnVar3 = tnVar.aa;
                                        if (rnVar3 == null || rnVar3.C || X02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hc, c6Var));
                                        } else {
                                            backgroundDrawable.b = X02;
                                            if (tnVar.x9()) {
                                                measuredHeight2 = tnVar.t0.getTop();
                                            } else {
                                                lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                                                measuredHeight2 = lVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - tnVar.T0.getBackgroundTranslationY();
                                            int backgroundSizeY2 = tnVar.T0.getBackgroundSizeY();
                                            rn rnVar4 = tnVar.aa;
                                            if (rnVar4 != null) {
                                                rnVar4.l(s1Var.getX(), backgroundTranslationY2, ljVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.g6.q(s1Var.getX(), backgroundTranslationY2, ljVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y8, ljVar.getMeasuredWidth(), i19);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i13 = i16;
                                }
                                groupedMessages = currentMessagesGroup2;
                            } else {
                                i13 = i16;
                            }
                            if (tnVar.F8 != s1Var && currentMessagesGroup2 == null && s1Var.C1()) {
                                canvas2.save();
                                canvas2.translate(s1Var.getX(), s1Var.getY() + s1Var.getPaddingTop());
                                if (s1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX(), s1Var.getHeight() >> 1);
                                }
                                s1Var.D1(canvas2, true, false);
                                canvas2.restore();
                            }
                        } else {
                            i13 = i16;
                            if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                if (v0Var.I()) {
                                    canvas2.save();
                                    canvas2.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                                    canvas2.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(tnVar.R8() / 2.0f, 0.0f);
                                    v0Var.y(canvas2, true);
                                    v0Var.B(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i16 = i13 + 1;
                    }
                }
            }
            i13 = i16;
            i16 = i13 + 1;
        }
        View view = tnVar.F8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getCurrentMessagesGroup() : null;
        int i20 = 0;
        while (i20 < 3) {
            ArrayList arrayList = ljVar.Z2;
            arrayList.clear();
            if (i20 != i11 || tnVar.t0.T1) {
                int i21 = 0;
                while (i21 < childCount) {
                    View childAt3 = tnVar.t0.getChildAt(i21);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= tnVar.t0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f9 && s1Var3.getVisibility() != i10 && (currentMessagesGroup = s1Var3.getCurrentMessagesGroup()) != null) {
                            int i22 = i20 == 0 ? 1 : 1;
                            if ((i20 != i22 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i20 != 0 || !s1Var3.getMessageObject().deleted) && ((i20 != 1 || s1Var3.getMessageObject().deleted) && ((i20 != i11 || s1Var3.kc) && (i20 == i11 || !s1Var3.kc))))) {
                                if (!arrayList.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                    transitionParams.left = 0;
                                    transitionParams.top = 0;
                                    transitionParams.right = 0;
                                    transitionParams.bottom = 0;
                                    transitionParams.pinnedBotton = false;
                                    transitionParams.pinnedTop = false;
                                    transitionParams.cell = s1Var3;
                                    arrayList.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = s1Var3.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var3.m3();
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if ((s1Var3.getCurrentPosition().flags & 4) == 0) {
                                    backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                }
                                int i23 = backgroundDrawableTop;
                                if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                    backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                }
                                int i24 = backgroundDrawableBottom;
                                if (s1Var3.kc) {
                                    currentMessagesGroup.transitionParams.cell = s1Var3;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                int i25 = transitionParams2.top;
                                if (i25 == 0 || i23 < i25) {
                                    transitionParams2.top = i23;
                                }
                                int i26 = transitionParams2.bottom;
                                if (i26 == 0 || i24 > i26) {
                                    transitionParams2.bottom = i24;
                                }
                                int i27 = transitionParams2.left;
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    transitionParams2.left = backgroundDrawableLeft;
                                }
                                int i28 = transitionParams2.right;
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    transitionParams2.right = backgroundDrawableRight;
                                }
                                i21++;
                                i10 = 8;
                                i11 = 2;
                                f9 = 0.0f;
                            }
                        }
                    }
                    i21++;
                    i10 = 8;
                    i11 = 2;
                    f9 = 0.0f;
                }
                int i29 = 0;
                while (i29 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i29);
                    float E2 = groupedMessages2.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f14 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f15 = transitionParams3.top + transitionParams3.offsetTop;
                    float f16 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f17 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f15 += transitionParams3.cell.getTranslationY();
                        f17 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > AndroidUtilities.dp(20.0f) + tnVar.t0.getMeasuredHeight()) {
                        f17 = AndroidUtilities.dp(20.0f) + tnVar.t0.getMeasuredHeight();
                    }
                    float f19 = f17;
                    boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == f11 && groupedMessages2.transitionParams.cell.getScaleY() == f11) ? false : true;
                    if (z12) {
                        canvas2.save();
                        i12 = i20;
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f16, f14, f10, f14), com.google.android.recaptcha.internal.a.A(f19, f18, f10, f18));
                    } else {
                        i12 = i20;
                    }
                    int size = groupedMessages2.messages.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 >= size) {
                            f12 = f19;
                            z10 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i30);
                        f12 = f19;
                        if (tnVar.S5[messageObject.getDialogId() == tnVar.P5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i30++;
                            f19 = f12;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f20 = f12;
                    tn tnVar2 = tnVar;
                    transitionParams4.cell.B1(canvas, (int) f14, (int) f18, (int) f16, (int) f20, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z10, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z12) {
                        canvas.restore();
                        for (int i31 = 0; i31 < childCount; i31++) {
                            View childAt4 = tnVar2.t0.getChildAt(i31);
                            if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = s1Var4.getLeft();
                                    int top = s1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f20 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i29++;
                    canvas2 = canvas;
                    tnVar = tnVar2;
                    i20 = i12;
                    f10 = 2.0f;
                }
            }
            canvas2 = canvas;
            tnVar = tnVar;
            i10 = 8;
            i11 = 2;
            f9 = 0.0f;
            f10 = 2.0f;
            i20++;
            ljVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x1(Canvas canvas, RectF rectF) {
        float f9;
        ArrayList arrayList;
        ArrayList arrayList2 = this.V2;
        int size = arrayList2.size();
        tn tnVar = this.u3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList2.get(i10);
                if (!tn.d2(tnVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.E2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    s1Var.m2(s1Var.a() ? s1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.W2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList3.get(i11);
                if (!tn.d2(tnVar, s1Var2, rectF)) {
                    float E2 = s1Var2.E2(false) + s1Var2.getLeft();
                    float y8 = s1Var2.getY() + s1Var2.getPaddingTop();
                    float alpha = s1Var2.a() ? s1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(E2, y8);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.W1(canvas, alpha);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.X2;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList4.get(i12);
                if (tn.d2(tnVar, s1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = s1Var3.getCurrentPosition() != null && (s1Var3.getCurrentPosition().flags & z10) == 0;
                    float alpha2 = s1Var3.a() ? s1Var3.getAlpha() : 1.0f;
                    float E22 = s1Var3.E2(z11) + s1Var3.getLeft();
                    float y10 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        arrayList = arrayList4;
                    } else if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float E23 = s1Var3.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f10 = transitionParams.left + E23 + transitionParams.offsetLeft;
                        arrayList = arrayList4;
                        float f11 = transitionParams.top + transitionParams.offsetTop;
                        float f12 = transitionParams.right + E23 + transitionParams.offsetRight;
                        float f13 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            f11 += s1Var3.getTranslationY();
                            f13 += s1Var3.getTranslationY();
                        }
                        canvas.clipRect(f10 + AndroidUtilities.dp(8.0f), f11 + AndroidUtilities.dp(8.0f), f12 - AndroidUtilities.dp(8.0f), f13 - AndroidUtilities.dp(8.0f));
                    } else {
                        arrayList = arrayList4;
                    }
                    if (s1Var3.getTransitionParams().v0) {
                        canvas.translate(E22, y10);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.I1(alpha2, canvas, z12);
                        s1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f9 = 8.0f;
            arrayList4.clear();
        } else {
            f9 = 8.0f;
        }
        ArrayList arrayList5 = this.Y2;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList5.get(i13);
                if (!tn.d2(tnVar, s1Var4, rectF)) {
                    boolean z13 = s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = s1Var4.a() ? s1Var4.getAlpha() : 1.0f;
                    float E24 = s1Var4.E2(false) + s1Var4.getLeft();
                    float y11 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = s1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f14 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f15 = transitionParams2.top + transitionParams2.offsetTop;
                        float f16 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f17 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f15 += s1Var4.getTranslationY();
                            f17 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f14 + AndroidUtilities.dp(f9), f15 + AndroidUtilities.dp(f9), f16 - AndroidUtilities.dp(f9), f17 - AndroidUtilities.dp(f9));
                    }
                    if (!z13 && s1Var4.getTransitionParams().v0) {
                        canvas.translate(E24, y11);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.d2(canvas, alpha3, null);
                        s1Var4.N1(canvas, alpha3);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void y1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        tn tnVar = this.u3;
        if (motionEvent != null) {
            tnVar.z4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !tnVar.b9 && !tnVar.a9 && tnVar.Z8 == null) {
            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.s1) {
                    if (tnVar.Z8 != null) {
                        tn.V1(tnVar, 0.0f);
                    }
                    tnVar.Z8 = (org.telegram.ui.Cells.s1) pressedChildView;
                    MessageObject T1 = tn.T1(tnVar);
                    boolean F6 = tnVar.F6(T1);
                    int i10 = tnVar.N3;
                    if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || tnVar.Z3 != tnVar.getUserConfig().getClientUserId())) || (((arrayList = tnVar.W3) != null && arrayList.contains(T1)) || ((tnVar.E8(T1) == 1 && (T1.getDialogId() == tnVar.H6 || T1.needDrawBluredPreview())) || ((tnVar.h == null && T1.getId() < 0) || (((chat2 = tnVar.e) != null && ChatObject.isForum(chat2) && !F6) || tnVar.b9() || (T1.isEphemeral() && T1.isOut())))))) {
                        tn.V1(tnVar, 0.0f);
                        tnVar.Z8 = null;
                        return;
                    } else {
                        this.c3 = motionEvent.getPointerId(0);
                        tnVar.a9 = true;
                        this.a3 = (int) motionEvent.getX();
                        this.b3 = (int) motionEvent.getY();
                        return;
                    }
                }
                return;
            }
        }
        if (tnVar.Z8 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.c3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.a3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.b3);
            if (getScrollState() == 0 && tnVar.a9 && !tnVar.b9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                tnVar.Z8.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                tnVar.v0.R = false;
                tnVar.a9 = false;
                tnVar.b9 = true;
                this.a3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (tnVar.b9) {
                if (Math.abs(max) < AndroidUtilities.dp(50.0f)) {
                    this.g3 = false;
                } else if (!this.g3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.g3 = true;
                }
                float f9 = max;
                tn.V1(tnVar, f9);
                MessageObject T12 = tn.T1(tnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    tnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.s1 s1Var = tnVar.Z8;
                if (com.google.android.recaptcha.internal.a.u(s1Var)) {
                    z1(s1Var, f9);
                }
                invalidate();
                return;
            }
            return;
        }
        if (tnVar.Z8 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.c3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.s1 s1Var2 = tnVar.Z8;
                if (Math.abs(com.google.android.recaptcha.internal.a.u(s1Var2) ? s1Var2.E2(false) : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = tn.T1(tnVar);
                    boolean F62 = tnVar.F6(T13);
                    ik ikVar = tnVar.K0;
                    if ((ikVar == null || ikVar.getVisibility() != 0 || ((tnVar.E0 && F62) || T13.wasJustSent)) && ((chat = tnVar.e) == null || ((!ChatObject.isNotInChat(chat) || tnVar.F9()) && ((!ChatObject.isChannel(tnVar.e) || ChatObject.canPost(tnVar.e) || tnVar.e.megagroup) && ChatObject.canSendMessages(tnVar.e))))) {
                        tnVar.Bb(tn.T1(tnVar));
                    } else {
                        if (T13.getGroupId() != 0 && (y8 = tnVar.y8(T13.getGroupId())) != null && (messageObject = y8.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        tnVar.j5 = T13;
                        Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
                        e10.putBoolean("quote", true);
                        e10.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != tnVar.a() && peerDialogId != tnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            e10.putLong("reply_to_author", peerDialogId);
                        }
                        e10.putInt("messagesCount", 1);
                        e10.putBoolean("canSelectTopics", true);
                        fy fyVar = new fy(e10);
                        fyVar.y2 = tnVar;
                        tnVar.presentFragment(fyVar);
                    }
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = tnVar.Z8;
            float slidingOffsetX = com.google.android.recaptcha.internal.a.u(s1Var3) ? s1Var3.getSlidingOffsetX() : 0.0f;
            this.f3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                tnVar.Z8 = null;
            }
            this.d3 = System.currentTimeMillis();
            this.e3 = 0.0f;
            invalidate();
            tnVar.a9 = false;
            tnVar.b9 = false;
            tnVar.v0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f9) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != s1Var && (childAt instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    s1Var2.setSlidingOffset(f9);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
