package ah;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.uq;
import org.telegram.ui.um;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k1 {
    public static int Z;
    public MessageObject A;
    public f6 B;
    public Integer C;
    public float D;
    public boolean E;
    public int F;
    public boolean G;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float Q;
    public float R;
    public h1 S;
    public boolean T;
    public a1.e U;
    public float a;
    public boolean b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final float t;
    public int u;
    public final org.telegram.ui.Cells.a0 z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final f1 a0 = new f1();
    public static int b0 = 1;
    public static final a4.e c0 = new a4.e(1);
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int n = UserConfig.selectedAccount;

    public k1(org.telegram.ui.Cells.a0 a0Var) {
        this.z = a0Var;
        o(this.B);
        this.t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f7 = rectF.left;
        rectF2.set(f7, rectF.top, AndroidUtilities.dp(12.0f) + f7, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f10 = rectF.height() > ((float) AndroidUtilities.dp(26.0f)) ? 1.4f : 0.0f;
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f10) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f10) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f11 = 10.263f + f10;
        float dpf212 = AndroidUtilities.dpf2(f11) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f11);
        float f12 = f10 + 11.333f;
        float dpf214 = AndroidUtilities.dpf2(f12) + rectF.top;
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f12);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f13 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f13, dpf22, f13);
        path.close();
    }

    public static long k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static void o(f6 f6Var) {
        V.setColor(j6.v0(j6.ie, f6Var));
        int v02 = j6.v0(j6.Sh, f6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        k9 k9Var;
        int i10;
        int i11;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.y;
        hashMap.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.w;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((h1) arrayList.get(i12)).b();
            i12++;
        }
        arrayList.clear();
        hashMap.putAll(this.x);
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i13 >= arrayList2.size()) {
                break;
            }
            h1 h1Var = (h1) arrayList2.get(i13);
            String str = h1Var.o;
            uq uqVar = h1Var.F;
            h1 h1Var2 = (h1) hashMap.get(str);
            if (h1Var2 != null && h1Var.b != h1Var2.b) {
                h1Var2 = null;
            }
            if (h1Var2 != null) {
                hashMap.remove(h1Var.o);
                int i14 = h1Var.x;
                int i15 = h1Var2.x;
                if (i14 == i15 && h1Var.y == h1Var2.y && h1Var.A == h1Var2.A && h1Var.w == h1Var2.w && h1Var.p == h1Var2.p && h1Var.T == null && h1Var2.T == null) {
                    h1Var.c = 0;
                    i13++;
                } else {
                    h1Var.d = i15;
                    h1Var.e = h1Var2.y;
                    h1Var.f = h1Var2.A;
                    h1Var.i = h1Var2.N;
                    h1Var.g = h1Var2.O;
                    h1Var.h = h1Var2.P;
                    h1Var.c = 3;
                    int i16 = h1Var.w;
                    int i17 = h1Var2.w;
                    if (i16 != i17 && uqVar != null) {
                        uqVar.c(i17, false);
                        uqVar.c(h1Var.w, true);
                    }
                    k9 k9Var2 = h1Var.T;
                    if (k9Var2 != null || h1Var2.T != null) {
                        if (k9Var2 == null) {
                            h1Var.p(new ArrayList());
                        }
                        if (h1Var2.T == null) {
                            h1Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = h1Var2.U;
                        ArrayList arrayList4 = h1Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            while (i11 < arrayList3.size()) {
                                TLObject tLObject = (TLObject) arrayList3.get(i11);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i11);
                                i11 = (tLObject == null || tLObject2 == null || k(tLObject) != k(tLObject2)) ? 0 : i11 + 1;
                            }
                        }
                        k9 k9Var3 = h1Var.T;
                        if (k9Var3 != null && (k9Var = h1Var2.T) != null) {
                            ValueAnimator valueAnimator = k9Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (k9Var3.w) {
                                    k9Var3.w = false;
                                    k9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = k9Var3.b[i18].h;
                                k9Var3.l(i18, k9Var.b[i18].h, i10);
                                i18++;
                            }
                            k9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                k9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            k9Var3.d = true;
                            k9Var3.b(true, false);
                        }
                    }
                }
            } else {
                h1Var.c = 1;
            }
            z10 = true;
            i13++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((h1) arrayList.get(i20)).l = ((h1) arrayList.get(i20)).n;
                ((h1) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.i) {
            float f7 = this.g;
            if (f7 != this.c || this.h != this.d) {
                this.j = true;
                this.e = f7;
                this.f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.q) {
            this.k = true;
            this.r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 == this.p) {
            return z10;
        }
        this.l = true;
        this.J = i22;
        return true;
    }

    public final void b(j1 j1Var) {
        int i10 = 0;
        if (j1Var.g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(j1Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.n).getReactionsMap().get(j1Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(j1Var, imageReceiver);
                return;
            }
        }
        if (!this.M || j1Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (j1Var.f(((h1) arrayList.get(i10)).r)) {
                ((h1) arrayList.get(i10)).q();
                return;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        int i10 = 0;
        if (this.s || this.b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.z;
        if (e2.u(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof org.telegram.ui.Cells.w0) {
                x10 -= ((org.telegram.ui.Cells.w0) a0Var).j0 / 2.0f;
            }
        }
        float f7 = x10 - this.c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (f7 <= ((h1) arrayList.get(i10)).x || f7 >= ((h1) arrayList.get(i10)).x + ((h1) arrayList.get(i10)).A || f10 <= ((h1) arrayList.get(i10)).y || f10 >= ((h1) arrayList.get(i10)).y + ((h1) arrayList.get(i10)).B) {
                    i10++;
                } else {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (h1) arrayList.get(i10);
                    a1.e eVar = this.U;
                    if (eVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    a1.e eVar2 = new a1.e(10, this, this.S);
                    this.U = eVar2;
                    AndroidUtilities.runOnUIThread(eVar2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                h1 h1Var = this.S;
                if (h1Var != null) {
                    h1Var.Y.c(false);
                }
                this.S = null;
                a1.e eVar3 = this.U;
                if (eVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(eVar3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a1.e eVar4 = this.U;
            if (eVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(eVar4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.a;
                float x11 = motionEvent.getX();
                if (e2.u(a0Var)) {
                    ((n4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            h1 h1Var2 = this.S;
            if (h1Var2 != null) {
                h1Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        Canvas canvas2 = canvas;
        boolean z10 = this.s;
        ArrayList arrayList = this.w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f11 = this.c;
        float f12 = this.d;
        if (this.s) {
            f11 = this.g;
            f12 = this.h;
        } else if (this.j) {
            float f13 = 1.0f - f7;
            f11 = (f11 * f7) + (this.e * f13);
            f12 = (f12 * f7) + (this.f * f13);
        }
        float f14 = f11;
        float f15 = f12;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i11 >= arrayList2.size()) {
                break;
            }
            h1 h1Var = (h1) arrayList2.get(i11);
            if (this.C == null && num == null && this.D < 0.5f) {
                h1Var.c();
            }
            if (!Integer.valueOf(h1Var.r.hashCode()).equals(this.C) && (num == null || h1Var.r.hashCode() == num.intValue())) {
                canvas2.save();
                float f16 = h1Var.x;
                float f17 = h1Var.y;
                if (f7 != 1.0f && h1Var.c == 3) {
                    float f18 = 1.0f - f7;
                    f16 = (f16 * f7) + (h1Var.d * f18);
                    f17 = (f17 * f7) + (h1Var.e * f18);
                }
                if (f7 == 1.0f || h1Var.c != 1) {
                    f10 = 1.0f;
                } else {
                    float f19 = (f7 * 0.5f) + 0.5f;
                    canvas2.scale(f19, f19, (h1Var.A / 2.0f) + f14 + f16, (h1Var.B / 2.0f) + f15 + f17);
                    f10 = f7;
                }
                h1Var.d(canvas2, f16 + f14, f17 + f15, h1Var.c == 3 ? f7 : 1.0f, f10, num != null, this.E, this.D);
                canvas2.restore();
            }
            i11++;
        }
        while (i10 < arrayList.size()) {
            h1 h1Var2 = (h1) arrayList.get(i10);
            float f20 = 1.0f - f7;
            float f21 = (f20 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f21, f21, (h1Var2.A / 2.0f) + h1Var2.x + f14, (h1Var2.B / 2.0f) + h1Var2.y + f15);
            ((h1) arrayList.get(i10)).d(canvas2, h1Var2.x + f14, h1Var2.y + f15, 1.0f, f20, false, this.E, this.D);
            canvas.restore();
            i10++;
            canvas2 = canvas;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r9.c != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r5 = (r19 * 0.5f) + 0.5f;
        r18.scale(r5, r5, (r9.A / 2.0f) + (r2 + r10), (r9.B / 2.0f) + (r4 + r14));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f7) {
        boolean z10 = this.s;
        ArrayList arrayList = this.w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f10 = this.c;
        float f11 = this.d;
        float f12 = 1.0f;
        if (this.s) {
            f10 = this.g;
            f11 = this.h;
        } else if (this.j) {
            float f13 = 1.0f - f7;
            f10 = (f10 * f7) + (this.e * f13);
            f11 = (f11 * f7) + (this.f * f13);
        }
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i10 >= arrayList2.size()) {
                break;
            }
            h1 h1Var = (h1) arrayList2.get(i10);
            if (h1Var.m) {
                canvas.save();
                float f14 = h1Var.x;
                float f15 = h1Var.y;
                if (f7 != f12 && h1Var.c == 3) {
                    float f16 = 1.0f - f7;
                    f14 = (f14 * f7) + (h1Var.d * f16);
                    f15 = (f15 * f7) + (h1Var.e * f16);
                }
                z11 = z11 || h1Var.g(canvas, f14 + f10, f15 + f11);
                canvas.restore();
            }
            i10++;
            f12 = 1.0f;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h1 h1Var2 = (h1) arrayList.get(i11);
            if (h1Var2.m) {
                float f17 = ((1.0f - f7) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f17, f17, (h1Var2.A / 2.0f) + h1Var2.x + f10, (h1Var2.B / 2.0f) + h1Var2.y + f11);
                boolean z12 = z11 || ((h1) arrayList.get(i11)).g(canvas, ((float) h1Var2.x) + f10, ((float) h1Var2.y) + f11);
                canvas.restore();
                z11 = z12;
            }
        }
    }

    public final void f(um umVar, Canvas canvas, int i10, Integer num) {
        if (this.s && this.w.isEmpty()) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return;
            }
            h1 h1Var = (h1) arrayList.get(i11);
            if ((num == null || h1Var.r.hashCode() == num.intValue()) && num != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(h1Var.t);
                float dp = AndroidUtilities.dp(140.0f);
                float dp2 = AndroidUtilities.dp(14.0f);
                float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), ((this.z instanceof t1 ? ((t1) r8).getParentWidth() : AndroidUtilities.displaySize.x) - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                float f7 = rectF.top - dp2;
                float f10 = i10;
                float f11 = f7 + f10;
                RectF rectF2 = this.O;
                rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                float interpolation = pr.h.getInterpolation(this.D);
                AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                int i12 = h1Var.V;
                j1 j1Var = h1Var.s;
                View view = h1Var.W;
                if (h1Var.f0 == null && h1Var.g0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (h1Var.r != null && !j1Var.a) {
                        if (j1Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(j1Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.a7, 1.0f);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                h1Var.f0 = imageReceiver;
                                imageReceiver.setLayerNum(7);
                                h1Var.f0.onAttachedToWindow();
                                h1Var.f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                h1Var.f0.setAllowStartLottieAnimation(true);
                                h1Var.f0.setAllowStartAnimation(true);
                                h1Var.f0.setAutoRepeat(1);
                                h1Var.f0.setAllowDecodeSingleFrame(true);
                                h1Var.f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                            }
                        } else if (j1Var.g != 0) {
                            q5 q5Var = new q5(24, i12, j1Var.g);
                            h1Var.g0 = q5Var;
                            q5Var.a(view);
                        }
                    }
                }
                this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver2 = h1Var.f0;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rectF2);
                        h1Var.f0.setAlpha(interpolation);
                        h1Var.f0.draw(canvas);
                    } else {
                        q5 q5Var2 = h1Var.g0;
                        if (q5Var2 != null) {
                            q5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            h1Var.g0.setAlpha((int) (interpolation * 255.0f));
                            h1Var.g0.draw(canvas);
                        }
                    }
                    umVar.invalidate();
                }
            }
            i11++;
        }
    }

    public final float i(float f7) {
        if (!this.l) {
            return this.p;
        }
        return (this.p * f7) + ((1.0f - f7) * this.J);
    }

    public final float j(float f7) {
        if (!this.k) {
            return this.q;
        }
        return (this.q * f7) + ((1.0f - f7) * this.r);
    }

    public final h1 l(j1 j1Var) {
        String l4;
        if (j1Var.a) {
            l4 = "stars";
        } else {
            String str = j1Var.f;
            l4 = str != null ? str : Long.toString(j1Var.g);
        }
        return m(l4);
    }

    public final h1 m(String str) {
        boolean z10 = this.b;
        HashMap hashMap = this.x;
        if (z10) {
            h1 h1Var = (h1) hashMap.get(str + "_");
            if (h1Var != null) {
                return h1Var;
            }
        }
        return (h1) hashMap.get(str);
    }

    public final boolean n() {
        if (this.L) {
            return !(this.s && this.w.isEmpty()) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072);
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        this.o = 0;
        this.q = 0;
        this.m = 0;
        this.p = 0;
        if (this.s) {
            return;
        }
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.v;
            if (i12 >= arrayList.size()) {
                break;
            }
            h1 h1Var = (h1) arrayList.get(i12);
            boolean z10 = h1Var.b;
            p6 p6Var = h1Var.G;
            uq uqVar = h1Var.F;
            if (z10) {
                h1Var.A = AndroidUtilities.dp(14.0f);
                h1Var.B = AndroidUtilities.dp(14.0f);
            } else if (h1Var.S) {
                h1Var.A = AndroidUtilities.dp(42.0f);
                h1Var.B = AndroidUtilities.dp(26.0f);
                if (h1Var.u) {
                    h1Var.A = (int) (p6Var.d + AndroidUtilities.dp(8.0f) + h1Var.A);
                } else if (uqVar != null && h1Var.w > 1) {
                    h1Var.A = w1.C(8.0f, (int) Math.ceil(uqVar.m), h1Var.A);
                }
            } else {
                h1Var.A = AndroidUtilities.dp(h1Var.D != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (h1Var.T != null && h1Var.U.size() > 0) {
                    h1Var.U.size();
                    h1Var.A = (int) ((AndroidUtilities.dp(20.0f) * (h1Var.U.size() > 1 ? h1Var.U.size() - 1 : 0) * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + h1Var.A);
                    h1Var.T.o = AndroidUtilities.dp(26.0f);
                } else if (h1Var.u) {
                    h1Var.A = (int) (p6Var.d + AndroidUtilities.dp(8.0f) + h1Var.A);
                } else if (((int) Math.ceil(uqVar.m)) > 0) {
                    h1Var.A = w1.C(8.0f, (int) Math.ceil(uqVar.m), h1Var.A);
                } else {
                    h1Var.A -= AndroidUtilities.dp(1.0f);
                }
                h1Var.B = AndroidUtilities.dp(26.0f);
            }
            if (h1Var.A + i13 > i10) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = w1.C(4.0f, h1Var.B, i15);
                i16++;
                i13 = 0;
            }
            h1Var.x = i13;
            h1Var.y = i15;
            h1Var.z = i16;
            i13 = w1.C(4.0f, h1Var.A, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i17 = ((h1) arrayList.get(0)).y;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((h1) arrayList.get(i19)).y != i17) {
                    int i20 = i19 - 1;
                    int i21 = i10 - (((h1) arrayList.get(i20)).x + ((h1) arrayList.get(i20)).A);
                    while (i18 < i19) {
                        ((h1) arrayList.get(i18)).x += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i10 - (((h1) arrayList.get(size)).x + ((h1) arrayList.get(size)).A);
            while (i18 <= size) {
                ((h1) arrayList.get(i18)).x += i22;
                i18++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                h1 h1Var2 = (h1) arrayList.get(i23);
                int i24 = h1Var2.z;
                h1Var2.x = (int) e2.A(i10, (i24 < 0 || i24 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(h1Var2.z)).intValue(), 2.0f, h1Var2.x);
            }
        }
        this.u = i13;
        if (i11 == 5 || i11 == 1) {
            this.q = i10;
        } else {
            this.q = i14;
        }
        this.o = i15 + (arrayList.size() == 0 ? 0 : AndroidUtilities.dp(26.0f));
        this.a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((h1) arrayList.get(i10)).b();
            i10++;
        }
        HashMap hashMap = this.H;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).onDetachedFromWindow();
            }
        }
        hashMap.clear();
    }

    public final void r() {
        HashMap hashMap = this.x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                this.i = !this.s;
                this.g = this.c;
                this.h = this.d;
                this.F = this.q;
                this.I = this.p;
                return;
            }
            hashMap.put(((h1) arrayList.get(i10)).o, (h1) arrayList.get(i10));
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(MessageObject messageObject, boolean z10, boolean z11, f6 f6Var) {
        boolean z12;
        int i10;
        TLRPC.ReactionCount reactionCount;
        h1 h1Var;
        int i11;
        int i12;
        k1 k1Var = this;
        boolean z13 = z10;
        boolean z14 = z11;
        k1Var.B = f6Var;
        k1Var.b = z13;
        k1Var.M = z14;
        k1Var.A = messageObject;
        ArrayList arrayList = k1Var.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r92 = 0;
        k1Var.K = false;
        k1Var.L = false;
        arrayList.clear();
        if (messageObject != null) {
            long dialogId = messageObject.getDialogId();
            f1 f1Var = a0;
            f1Var.a = dialogId;
            TLRPC.TL_messageReactions tL_messageReactions = messageObject.messageOwner.reactions;
            if (tL_messageReactions != null && tL_messageReactions.results != null) {
                int i13 = 0;
                for (int i14 = 0; i14 < messageObject.messageOwner.reactions.results.size(); i14++) {
                    i13 += messageObject.messageOwner.reactions.results.get(i14).count;
                }
                int i15 = k1Var.n;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i15).getChatFull(-messageObject.getDialogId());
                if (!z13 && !messageObject.messageOwner.reactions.results.isEmpty() && chatFull != null && chatFull.paid_reactions_available) {
                    boolean z15 = false;
                    for (int i16 = 0; i16 < messageObject.messageOwner.reactions.results.size(); i16++) {
                        TLRPC.Reaction reaction = messageObject.messageOwner.reactions.results.get(i16).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z15 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z15) {
                        z12 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z12) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i10 = -arrayList3.size();
                        while (i10 < messageObject.messageOwner.reactions.results.size()) {
                            if (i10 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i10);
                                reactionCount.chosen = r92;
                                reactionCount.count = r92;
                            } else {
                                reactionCount = messageObject.messageOwner.reactions.results.get(i10);
                            }
                            TLRPC.ReactionCount reactionCount2 = reactionCount;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= arrayList2.size()) {
                                    h1Var = null;
                                    break;
                                }
                                h1Var = (h1) arrayList2.get(i17);
                                if (h1Var.r.equals(reactionCount2.reaction)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            i1 i1Var = new i1(k1Var, h1Var, reactionCount2, z13, z14);
                            i1Var.R = messageObject.hasValidGroupId();
                            arrayList.add(i1Var);
                            k1Var.L = k1Var.L || i1Var.m;
                            if (!z10 && !z11 && messageObject.messageOwner.reactions.recent_reactions != null) {
                                if (messageObject.getDialogId() > 0 && !UserObject.isReplyUser(messageObject.getDialogId())) {
                                    ArrayList arrayList4 = new ArrayList();
                                    TLRPC.User currentUser = UserConfig.getInstance(i15).getCurrentUser();
                                    TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(messageObject.getDialogId()));
                                    if (reactionCount2.count == 2) {
                                        if (currentUser != null) {
                                            arrayList4.add(currentUser);
                                        }
                                        if (user != null) {
                                            arrayList4.add(user);
                                        }
                                    } else if (reactionCount2.chosen) {
                                        if (currentUser != null) {
                                            arrayList4.add(currentUser);
                                        }
                                    } else if (user != null) {
                                        arrayList4.add(user);
                                    }
                                    i1Var.p(arrayList4);
                                    if (!arrayList4.isEmpty()) {
                                        i1Var.w = 0;
                                        i1Var.F.c(0, false);
                                    }
                                } else if (reactionCount2.count <= 3 && i13 <= 3) {
                                    ArrayList arrayList5 = null;
                                    int i18 = 0;
                                    while (i18 < messageObject.messageOwner.reactions.recent_reactions.size()) {
                                        TLRPC.MessagePeerReaction messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i18);
                                        j1 d = j1.d(messagePeerReaction.reaction);
                                        j1 d10 = j1.d(reactionCount2.reaction);
                                        int i19 = i13;
                                        int i20 = i15;
                                        TLObject userOrChat = MessagesController.getInstance(i15).getUserOrChat(MessageObject.getPeerId(messagePeerReaction.peer_id));
                                        if (d.equals(d10) && userOrChat != null) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(userOrChat);
                                        }
                                        i18++;
                                        i13 = i19;
                                        i15 = i20;
                                    }
                                    i11 = i13;
                                    i12 = i15;
                                    i1Var.p(arrayList5);
                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                        i1Var.w = 0;
                                        i1Var.F.c(0, false);
                                    }
                                    if (z10) {
                                        if (reactionCount2.count > 1) {
                                            if (reactionCount2.chosen) {
                                                k1Var = this;
                                                i1 i1Var2 = new i1(k1Var, null, reactionCount2, z10, z11);
                                                i1Var2.R = messageObject.hasValidGroupId();
                                                arrayList.add(i1Var2);
                                                ((h1) arrayList.get(0)).Q = false;
                                                ((h1) arrayList.get(1)).Q = true;
                                                ((h1) arrayList.get(0)).j = 1;
                                                ((h1) arrayList.get(1)).j = 1;
                                                ((h1) arrayList.get(1)).o = a4.a.s(new StringBuilder(), ((h1) arrayList.get(1)).o, "_");
                                                break;
                                            }
                                        }
                                        k1Var = this;
                                        if (!z10 && i10 == 2) {
                                            break;
                                        }
                                        if (k1Var.G) {
                                            i1Var.a();
                                        }
                                        i10++;
                                        z13 = z10;
                                        z14 = z11;
                                        i13 = i11;
                                        i15 = i12;
                                        r92 = 0;
                                    }
                                    k1Var = this;
                                    if (!z10) {
                                    }
                                    if (k1Var.G) {
                                    }
                                    i10++;
                                    z13 = z10;
                                    z14 = z11;
                                    i13 = i11;
                                    i15 = i12;
                                    r92 = 0;
                                }
                            }
                            i11 = i13;
                            i12 = i15;
                            if (z10) {
                            }
                            k1Var = this;
                            if (!z10) {
                            }
                            if (k1Var.G) {
                            }
                            i10++;
                            z13 = z10;
                            z14 = z11;
                            i13 = i11;
                            i15 = i12;
                            r92 = 0;
                        }
                    }
                }
                z12 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z12) {
                }
                i10 = -arrayList32.size();
                while (i10 < messageObject.messageOwner.reactions.results.size()) {
                }
            }
            if (!z10 && !arrayList.isEmpty()) {
                Collections.sort(arrayList, f1Var);
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    TLRPC.ReactionCount reactionCount3 = ((h1) arrayList.get(i21)).a;
                    int i22 = b0;
                    b0 = i22 + 1;
                    reactionCount3.lastDrawnPosition = i22;
                }
            }
            k1Var.K = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        }
        for (int i23 = 0; i23 < arrayList2.size(); i23++) {
            ((h1) arrayList2.get(i23)).b();
        }
        k1Var.s = arrayList.isEmpty();
    }
}
