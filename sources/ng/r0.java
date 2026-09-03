package ng;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import mh.m2;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.pm;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r0 {
    public static int Z;
    public MessageObject A;
    public g6 B;
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
    public o0 S;
    public boolean T;
    public m2 U;
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
    public static final n0 a0 = new n0();
    public static int b0 = 1;
    public static final e5.f c0 = new e5.f(23);
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int n = UserConfig.selectedAccount;

    public r0(org.telegram.ui.Cells.a0 a0Var) {
        this.z = a0Var;
        o(this.B);
        this.t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, AndroidUtilities.dp(12.0f) + f10, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f11 = rectF.height() > ((float) AndroidUtilities.dp(26.0f)) ? 1.4f : 0.0f;
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f11) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f11) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f12 = 10.263f + f11;
        float dpf212 = AndroidUtilities.dpf2(f12) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f12);
        float f13 = f11 + 11.333f;
        float dpf214 = AndroidUtilities.dpf2(f13) + rectF.top;
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f13);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f14 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f14, dpf22, f14);
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

    public static void o(g6 g6Var) {
        V.setColor(k6.v0(k6.ie, g6Var));
        int v02 = k6.v0(k6.Sh, g6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        c9 c9Var;
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
            ((o0) arrayList.get(i12)).b();
            i12++;
        }
        arrayList.clear();
        hashMap.putAll(this.x);
        int i13 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i13 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i13);
            String str = o0Var.o;
            vq vqVar = o0Var.F;
            o0 o0Var2 = (o0) hashMap.get(str);
            if (o0Var2 != null && o0Var.b != o0Var2.b) {
                o0Var2 = null;
            }
            if (o0Var2 != null) {
                hashMap.remove(o0Var.o);
                int i14 = o0Var.x;
                int i15 = o0Var2.x;
                if (i14 == i15 && o0Var.y == o0Var2.y && o0Var.A == o0Var2.A && o0Var.w == o0Var2.w && o0Var.p == o0Var2.p && o0Var.T == null && o0Var2.T == null) {
                    o0Var.c = 0;
                    i13++;
                } else {
                    o0Var.d = i15;
                    o0Var.e = o0Var2.y;
                    o0Var.f = o0Var2.A;
                    o0Var.i = o0Var2.N;
                    o0Var.g = o0Var2.O;
                    o0Var.h = o0Var2.P;
                    o0Var.c = 3;
                    int i16 = o0Var.w;
                    int i17 = o0Var2.w;
                    if (i16 != i17 && vqVar != null) {
                        vqVar.c(i17, false);
                        vqVar.c(o0Var.w, true);
                    }
                    c9 c9Var2 = o0Var.T;
                    if (c9Var2 != null || o0Var2.T != null) {
                        if (c9Var2 == null) {
                            o0Var.p(new ArrayList());
                        }
                        if (o0Var2.T == null) {
                            o0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = o0Var2.U;
                        ArrayList arrayList4 = o0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            while (i11 < arrayList3.size()) {
                                TLObject tLObject = (TLObject) arrayList3.get(i11);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i11);
                                i11 = (tLObject == null || tLObject2 == null || k(tLObject) != k(tLObject2)) ? 0 : i11 + 1;
                            }
                        }
                        c9 c9Var3 = o0Var.T;
                        if (c9Var3 != null && (c9Var = o0Var2.T) != null) {
                            ValueAnimator valueAnimator = c9Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (c9Var3.w) {
                                    c9Var3.w = false;
                                    c9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = c9Var3.b[i18].h;
                                c9Var3.l(i18, c9Var.b[i18].h, i10);
                                i18++;
                            }
                            c9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                c9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            c9Var3.d = true;
                            c9Var3.b(true, false);
                        }
                    }
                }
            } else {
                o0Var.c = 1;
            }
            z4 = true;
            i13++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((o0) arrayList.get(i20)).l = ((o0) arrayList.get(i20)).n;
                ((o0) arrayList.get(i20)).a();
            }
            z4 = true;
        }
        if (this.i) {
            float f10 = this.g;
            if (f10 != this.c || this.h != this.d) {
                this.j = true;
                this.e = f10;
                this.f = this.h;
                z4 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.q) {
            this.k = true;
            this.r = i21;
            z4 = true;
        }
        int i22 = this.I;
        if (i22 == this.p) {
            return z4;
        }
        this.l = true;
        this.J = i22;
        return true;
    }

    public final void b(q0 q0Var) {
        int i10 = 0;
        if (q0Var.g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(q0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.n).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(q0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || q0Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (q0Var.f(((o0) arrayList.get(i10)).r)) {
                ((o0) arrayList.get(i10)).q();
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
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.z;
        if (e2.c.s(a0Var)) {
            y10 -= a0Var.getPaddingTop();
            if (a0Var instanceof v0) {
                x10 -= ((v0) a0Var).g0 / 2.0f;
            }
        }
        float f10 = x10 - this.c;
        float f11 = y10 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (f10 <= ((o0) arrayList.get(i10)).x || f10 >= ((o0) arrayList.get(i10)).x + ((o0) arrayList.get(i10)).A || f11 <= ((o0) arrayList.get(i10)).y || f11 >= ((o0) arrayList.get(i10)).y + ((o0) arrayList.get(i10)).B) {
                    i10++;
                } else {
                    this.Q = motionEvent.getX();
                    this.R = y10;
                    this.S = (o0) arrayList.get(i10);
                    m2 m2Var = this.U;
                    if (m2Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(m2Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    m2 m2Var2 = new m2(21, this, this.S);
                    this.U = m2Var2;
                    AndroidUtilities.runOnUIThread(m2Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z4 = this.T;
            float f12 = this.t;
            if ((z4 && Math.abs(motionEvent.getX() - this.Q) > f12) || Math.abs(y10 - this.R) > f12) {
                this.T = false;
                o0 o0Var = this.S;
                if (o0Var != null) {
                    o0Var.Y.c(false);
                }
                this.S = null;
                m2 m2Var3 = this.U;
                if (m2Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m2 m2Var4 = this.U;
            if (m2Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(m2Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.a;
                float x11 = motionEvent.getX();
                if (e2.c.s(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y10);
                }
            }
            this.T = false;
            o0 o0Var2 = this.S;
            if (o0Var2 != null) {
                o0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f10, Integer num) {
        float f11;
        Canvas canvas2 = canvas;
        boolean z4 = this.s;
        ArrayList arrayList = this.w;
        if (z4 && arrayList.isEmpty()) {
            return;
        }
        float f12 = this.c;
        float f13 = this.d;
        if (this.s) {
            f12 = this.g;
            f13 = this.h;
        } else if (this.j) {
            float f14 = 1.0f - f10;
            f12 = (f12 * f10) + (this.e * f14);
            f13 = (f13 * f10) + (this.f * f14);
        }
        float f15 = f12;
        float f16 = f13;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i11 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i11);
            if (this.C == null && num == null && this.D < 0.5f) {
                o0Var.c();
            }
            if (!Integer.valueOf(o0Var.r.hashCode()).equals(this.C) && (num == null || o0Var.r.hashCode() == num.intValue())) {
                canvas2.save();
                float f17 = o0Var.x;
                float f18 = o0Var.y;
                if (f10 != 1.0f && o0Var.c == 3) {
                    float f19 = 1.0f - f10;
                    f17 = (f17 * f10) + (o0Var.d * f19);
                    f18 = (f18 * f10) + (o0Var.e * f19);
                }
                if (f10 == 1.0f || o0Var.c != 1) {
                    f11 = 1.0f;
                } else {
                    float f20 = (f10 * 0.5f) + 0.5f;
                    canvas2.scale(f20, f20, (o0Var.A / 2.0f) + f15 + f17, (o0Var.B / 2.0f) + f16 + f18);
                    f11 = f10;
                }
                o0Var.d(canvas2, f17 + f15, f18 + f16, o0Var.c == 3 ? f10 : 1.0f, f11, num != null, this.E, this.D);
                canvas2.restore();
            }
            i11++;
        }
        while (i10 < arrayList.size()) {
            o0 o0Var2 = (o0) arrayList.get(i10);
            float f21 = 1.0f - f10;
            float f22 = (f21 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f22, f22, (o0Var2.A / 2.0f) + o0Var2.x + f15, (o0Var2.B / 2.0f) + o0Var2.y + f16);
            ((o0) arrayList.get(i10)).d(canvas2, o0Var2.x + f15, o0Var2.y + f16, 1.0f, f21, false, this.E, this.D);
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
    public final void e(Canvas canvas, float f10) {
        boolean z4 = this.s;
        ArrayList arrayList = this.w;
        if (z4 && arrayList.isEmpty()) {
            return;
        }
        float f11 = this.c;
        float f12 = this.d;
        float f13 = 1.0f;
        if (this.s) {
            f11 = this.g;
            f12 = this.h;
        } else if (this.j) {
            float f14 = 1.0f - f10;
            f11 = (f11 * f10) + (this.e * f14);
            f12 = (f12 * f10) + (this.f * f14);
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i10 >= arrayList2.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList2.get(i10);
            if (o0Var.m) {
                canvas.save();
                float f15 = o0Var.x;
                float f16 = o0Var.y;
                if (f10 != f13 && o0Var.c == 3) {
                    float f17 = 1.0f - f10;
                    f15 = (f15 * f10) + (o0Var.d * f17);
                    f16 = (f16 * f10) + (o0Var.e * f17);
                }
                z10 = z10 || o0Var.g(canvas, f15 + f11, f16 + f12);
                canvas.restore();
            }
            i10++;
            f13 = 1.0f;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o0 o0Var2 = (o0) arrayList.get(i11);
            if (o0Var2.m) {
                float f18 = ((1.0f - f10) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f18, f18, (o0Var2.A / 2.0f) + o0Var2.x + f11, (o0Var2.B / 2.0f) + o0Var2.y + f12);
                boolean z11 = z10 || ((o0) arrayList.get(i11)).g(canvas, ((float) o0Var2.x) + f11, ((float) o0Var2.y) + f12);
                canvas.restore();
                z10 = z11;
            }
        }
    }

    public final void f(pm pmVar, Canvas canvas, int i10, Integer num) {
        if (this.s && this.w.isEmpty()) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return;
            }
            o0 o0Var = (o0) arrayList.get(i11);
            if ((num == null || o0Var.r.hashCode() == num.intValue()) && num != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(o0Var.t);
                float dp = AndroidUtilities.dp(140.0f);
                float dp2 = AndroidUtilities.dp(14.0f);
                float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), ((this.z instanceof t1 ? ((t1) r8).getParentWidth() : AndroidUtilities.displaySize.x) - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                float f10 = rectF.top - dp2;
                float f11 = i10;
                float f12 = f10 + f11;
                RectF rectF2 = this.O;
                rectF2.set(clamp, (f10 - dp) + f11, dp + clamp, f12);
                float interpolation = pr.h.getInterpolation(this.D);
                AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                int i12 = o0Var.V;
                q0 q0Var = o0Var.s;
                View view = o0Var.W;
                if (o0Var.f0 == null && o0Var.g0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (o0Var.r != null && !q0Var.a) {
                        if (q0Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(q0Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, k6.a7, 1.0f);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                o0Var.f0 = imageReceiver;
                                imageReceiver.setLayerNum(7);
                                o0Var.f0.onAttachedToWindow();
                                o0Var.f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                o0Var.f0.setAllowStartLottieAnimation(true);
                                o0Var.f0.setAllowStartAnimation(true);
                                o0Var.f0.setAutoRepeat(1);
                                o0Var.f0.setAllowDecodeSingleFrame(true);
                                o0Var.f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                            }
                        } else if (q0Var.g != 0) {
                            l5 l5Var = new l5(24, i12, q0Var.g);
                            o0Var.g0 = l5Var;
                            l5Var.a(view);
                        }
                    }
                }
                this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver2 = o0Var.f0;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rectF2);
                        o0Var.f0.setAlpha(interpolation);
                        o0Var.f0.draw(canvas);
                    } else {
                        l5 l5Var2 = o0Var.g0;
                        if (l5Var2 != null) {
                            l5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            o0Var.g0.setAlpha((int) (interpolation * 255.0f));
                            o0Var.g0.draw(canvas);
                        }
                    }
                    pmVar.invalidate();
                }
            }
            i11++;
        }
    }

    public final float i(float f10) {
        if (!this.l) {
            return this.p;
        }
        return (this.p * f10) + ((1.0f - f10) * this.J);
    }

    public final float j(float f10) {
        if (!this.k) {
            return this.q;
        }
        return (this.q * f10) + ((1.0f - f10) * this.r);
    }

    public final o0 l(String str) {
        boolean z4 = this.b;
        HashMap hashMap = this.x;
        if (z4) {
            o0 o0Var = (o0) hashMap.get(str + "_");
            if (o0Var != null) {
                return o0Var;
            }
        }
        return (o0) hashMap.get(str);
    }

    public final o0 m(q0 q0Var) {
        String l10;
        if (q0Var.a) {
            l10 = "stars";
        } else {
            String str = q0Var.f;
            l10 = str != null ? str : Long.toString(q0Var.g);
        }
        return l(l10);
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
            o0 o0Var = (o0) arrayList.get(i12);
            boolean z4 = o0Var.b;
            j6 j6Var = o0Var.G;
            vq vqVar = o0Var.F;
            if (z4) {
                o0Var.A = AndroidUtilities.dp(14.0f);
                o0Var.B = AndroidUtilities.dp(14.0f);
            } else if (o0Var.S) {
                o0Var.A = AndroidUtilities.dp(42.0f);
                o0Var.B = AndroidUtilities.dp(26.0f);
                if (o0Var.u) {
                    o0Var.A = (int) (j6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (vqVar != null && o0Var.w > 1) {
                    o0Var.A = y3.C(8.0f, (int) Math.ceil(vqVar.m), o0Var.A);
                }
            } else {
                o0Var.A = AndroidUtilities.dp(o0Var.D != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (o0Var.T != null && o0Var.U.size() > 0) {
                    o0Var.U.size();
                    o0Var.A = (int) ((AndroidUtilities.dp(20.0f) * (o0Var.U.size() > 1 ? o0Var.U.size() - 1 : 0) * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + o0Var.A);
                    o0Var.T.o = AndroidUtilities.dp(26.0f);
                } else if (o0Var.u) {
                    o0Var.A = (int) (j6Var.d + AndroidUtilities.dp(8.0f) + o0Var.A);
                } else if (((int) Math.ceil(vqVar.m)) > 0) {
                    o0Var.A = y3.C(8.0f, (int) Math.ceil(vqVar.m), o0Var.A);
                } else {
                    o0Var.A -= AndroidUtilities.dp(1.0f);
                }
                o0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (o0Var.A + i13 > i10) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = y3.C(4.0f, o0Var.B, i15);
                i16++;
                i13 = 0;
            }
            o0Var.x = i13;
            o0Var.y = i15;
            o0Var.z = i16;
            i13 = y3.C(4.0f, o0Var.A, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i17 = ((o0) arrayList.get(0)).y;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((o0) arrayList.get(i19)).y != i17) {
                    int i20 = i19 - 1;
                    int i21 = i10 - (((o0) arrayList.get(i20)).x + ((o0) arrayList.get(i20)).A);
                    while (i18 < i19) {
                        ((o0) arrayList.get(i18)).x += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i10 - (((o0) arrayList.get(size)).x + ((o0) arrayList.get(size)).A);
            while (i18 <= size) {
                ((o0) arrayList.get(i18)).x += i22;
                i18++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                o0 o0Var2 = (o0) arrayList.get(i23);
                int i24 = o0Var2.z;
                o0Var2.x = (int) e2.c.x(i10, (i24 < 0 || i24 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(o0Var2.z)).intValue(), 2.0f, o0Var2.x);
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
            ((o0) arrayList.get(i10)).b();
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
            hashMap.put(((o0) arrayList.get(i10)).o, (o0) arrayList.get(i10));
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
    public final void s(MessageObject messageObject, boolean z4, boolean z10, g6 g6Var) {
        boolean z11;
        int i10;
        TLRPC.ReactionCount reactionCount;
        o0 o0Var;
        int i11;
        int i12;
        r0 r0Var = this;
        boolean z12 = z4;
        boolean z13 = z10;
        r0Var.B = g6Var;
        r0Var.b = z12;
        r0Var.M = z13;
        r0Var.A = messageObject;
        ArrayList arrayList = r0Var.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r92 = 0;
        r0Var.K = false;
        r0Var.L = false;
        arrayList.clear();
        if (messageObject != null) {
            long dialogId = messageObject.getDialogId();
            n0 n0Var = a0;
            n0Var.a = dialogId;
            TLRPC.TL_messageReactions tL_messageReactions = messageObject.messageOwner.reactions;
            if (tL_messageReactions != null && tL_messageReactions.results != null) {
                int i13 = 0;
                for (int i14 = 0; i14 < messageObject.messageOwner.reactions.results.size(); i14++) {
                    i13 += messageObject.messageOwner.reactions.results.get(i14).count;
                }
                int i15 = r0Var.n;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i15).getChatFull(-messageObject.getDialogId());
                if (!z12 && !messageObject.messageOwner.reactions.results.isEmpty() && chatFull != null && chatFull.paid_reactions_available) {
                    boolean z14 = false;
                    for (int i16 = 0; i16 < messageObject.messageOwner.reactions.results.size(); i16++) {
                        TLRPC.Reaction reaction = messageObject.messageOwner.reactions.results.get(i16).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z14 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z14) {
                        z11 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z11) {
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
                                    o0Var = null;
                                    break;
                                }
                                o0Var = (o0) arrayList2.get(i17);
                                if (o0Var.r.equals(reactionCount2.reaction)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            p0 p0Var = new p0(r0Var, o0Var, reactionCount2, z12, z13);
                            p0Var.R = messageObject.hasValidGroupId();
                            arrayList.add(p0Var);
                            r0Var.L = r0Var.L || p0Var.m;
                            if (!z4 && !z10 && messageObject.messageOwner.reactions.recent_reactions != null) {
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
                                    p0Var.p(arrayList4);
                                    if (!arrayList4.isEmpty()) {
                                        p0Var.w = 0;
                                        p0Var.F.c(0, false);
                                    }
                                } else if (reactionCount2.count <= 3 && i13 <= 3) {
                                    ArrayList arrayList5 = null;
                                    int i18 = 0;
                                    while (i18 < messageObject.messageOwner.reactions.recent_reactions.size()) {
                                        TLRPC.MessagePeerReaction messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i18);
                                        q0 d = q0.d(messagePeerReaction.reaction);
                                        q0 d10 = q0.d(reactionCount2.reaction);
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
                                    p0Var.p(arrayList5);
                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                        p0Var.w = 0;
                                        p0Var.F.c(0, false);
                                    }
                                    if (z4) {
                                        if (reactionCount2.count > 1) {
                                            if (reactionCount2.chosen) {
                                                r0Var = this;
                                                p0 p0Var2 = new p0(r0Var, null, reactionCount2, z4, z10);
                                                p0Var2.R = messageObject.hasValidGroupId();
                                                arrayList.add(p0Var2);
                                                ((o0) arrayList.get(0)).Q = false;
                                                ((o0) arrayList.get(1)).Q = true;
                                                ((o0) arrayList.get(0)).j = 1;
                                                ((o0) arrayList.get(1)).j = 1;
                                                ((o0) arrayList.get(1)).o = android.support.v4.media.a.r(new StringBuilder(), ((o0) arrayList.get(1)).o, "_");
                                                break;
                                            }
                                        }
                                        r0Var = this;
                                        if (!z4 && i10 == 2) {
                                            break;
                                        }
                                        if (r0Var.G) {
                                            p0Var.a();
                                        }
                                        i10++;
                                        z12 = z4;
                                        z13 = z10;
                                        i13 = i11;
                                        i15 = i12;
                                        r92 = 0;
                                    }
                                    r0Var = this;
                                    if (!z4) {
                                    }
                                    if (r0Var.G) {
                                    }
                                    i10++;
                                    z12 = z4;
                                    z13 = z10;
                                    i13 = i11;
                                    i15 = i12;
                                    r92 = 0;
                                }
                            }
                            i11 = i13;
                            i12 = i15;
                            if (z4) {
                            }
                            r0Var = this;
                            if (!z4) {
                            }
                            if (r0Var.G) {
                            }
                            i10++;
                            z12 = z4;
                            z13 = z10;
                            i13 = i11;
                            i15 = i12;
                            r92 = 0;
                        }
                    }
                }
                z11 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z11) {
                }
                i10 = -arrayList32.size();
                while (i10 < messageObject.messageOwner.reactions.results.size()) {
                }
            }
            if (!z4 && !arrayList.isEmpty()) {
                Collections.sort(arrayList, n0Var);
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    TLRPC.ReactionCount reactionCount3 = ((o0) arrayList.get(i21)).a;
                    int i22 = b0;
                    b0 = i22 + 1;
                    reactionCount3.lastDrawnPosition = i22;
                }
            }
            r0Var.K = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        }
        for (int i23 = 0; i23 < arrayList2.size(); i23++) {
            ((o0) arrayList2.get(i23)).b();
        }
        r0Var.s = arrayList.isEmpty();
    }
}
