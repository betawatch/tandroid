package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class np implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final ImageReceiver F;
    public TLRPC.Chat G;
    public TLRPC.TL_forumTopic H;
    public long I;
    public AnimatorSet J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public float Q;
    public boolean R;
    public float S;
    public final View T;
    public long U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public ti Y;
    public long Z;
    public int a;
    public View a0;
    public int b;
    public boolean b0;
    public int c;
    public final org.telegram.ui.Components.er c0;
    public float d;
    public final int[] d0;
    public final Paint e;
    public final int e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final long h0;
    public final long i0;
    public final org.telegram.ui.ActionBar.g6 j0;
    public org.telegram.ui.Components.r5 k0;
    public og.c l0;
    public int m0;
    public final Paint n;
    public int n0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout v;
    public StaticLayout w;
    public int x;
    public int y;

    public np(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.r = new Path();
        this.I = 0L;
        this.b0 = true;
        org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(null, true, null);
        this.c0 = erVar;
        this.d0 = new int[3];
        this.T = view;
        this.e0 = i10;
        this.i0 = j10;
        this.f0 = i11;
        this.g0 = i12;
        this.h0 = j11;
        this.X = MessagesController.getInstance(i10).isForum(j10);
        this.j0 = g6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        erVar.z = 3;
        erVar.I = 1;
        erVar.g = true;
        erVar.d = d("paintChatActionBackground");
        erVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j11;
        int i12;
        int[] iArr2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
            iArr[2] = i11;
        }
        if (i11 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i11);
            if (dialogFilter == null) {
                return null;
            }
            dialogs = dialogFilter.dialogs;
        } else {
            dialogs = messagesController.getDialogs(i10);
        }
        if (dialogs == null) {
            return null;
        }
        for (int i13 = 0; i13 < dialogs.size(); i13++) {
            TLRPC.Dialog dialog = dialogs.get(i13);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.id));
            if (chat != null && dialog.id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                return dialog;
            }
        }
        if (!z10) {
            return null;
        }
        if (i11 != 0) {
            int i14 = 0;
            while (i14 < messagesController.dialogFilters.size()) {
                int i15 = messagesController.dialogFilters.get(i14).id;
                if (i11 != i15) {
                    long j12 = j10;
                    int i16 = i10;
                    int[] iArr3 = iArr;
                    TLRPC.Dialog c11 = c(j12, i16, i15, false, iArr3);
                    j11 = j12;
                    i12 = i16;
                    iArr2 = iArr3;
                    if (c11 != null) {
                        if (iArr2 != null) {
                            iArr2[0] = 1;
                        }
                        return c11;
                    }
                } else {
                    j11 = j10;
                    i12 = i10;
                    iArr2 = iArr;
                }
                i14++;
                i10 = i12;
                j10 = j11;
                iArr = iArr2;
            }
        }
        long j13 = j10;
        int i17 = i10;
        int[] iArr4 = iArr;
        for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
            int keyAt = messagesController.dialogsByFolder.keyAt(i18);
            if (i17 != keyAt && (c10 = c(j13, keyAt, 0, false, iArr4)) != null) {
                if (iArr4 != null) {
                    iArr4[0] = 1;
                }
                return c10;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x054b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, nj njVar, float f7, float f10) {
        float f11;
        TextPaint textPaint;
        Paint paint;
        int alpha;
        int alpha2;
        int i10;
        int i11;
        int i12;
        RectF rectF;
        int i13;
        float f12;
        float f13;
        float f14;
        float f15;
        int i14;
        float f16;
        float f17;
        int i15;
        org.telegram.ui.Components.er erVar;
        float f18;
        float f19;
        float f20;
        int i16;
        TextPaint textPaint2;
        float f21;
        float f22;
        Paint paint2;
        org.telegram.ui.Components.r5 r5Var;
        ImageReceiver imageReceiver;
        float f23;
        float f24;
        RectF rectF2;
        float y3;
        int w02;
        TLRPC.TL_forumTopic tL_forumTopic;
        int w03;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.g6 g6Var = this.j0;
        if (this.a0 != njVar) {
            this.a0 = njVar;
            org.telegram.ui.Components.r5 r5Var2 = this.k0;
            if (r5Var2 != null) {
                r5Var2.a(njVar);
            }
        }
        org.telegram.ui.Components.er erVar2 = this.c0;
        erVar2.H = njVar;
        RectF rectF3 = erVar2.f;
        float dp = AndroidUtilities.dp(110.0f) * f7;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        float f25 = f7 < 0.2f ? 5.0f * f7 * f10 : f10;
        org.telegram.ui.ActionBar.k6.q(0.0f, njVar.getMeasuredHeight() - dp, this.c, njVar.getMeasuredHeight());
        try {
            if (this.l0 != null && (tL_forumTopic = this.H) != null && tL_forumTopic.id == 1 && (w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ac, g6Var)) != this.m0) {
                this.m0 = w03;
                this.l0.a(w03);
            }
            if (this.k0 == null || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ic, g6Var)) == this.n0) {
                f11 = 0.2f;
            } else {
                this.n0 = w02;
                f11 = 0.2f;
                try {
                    this.k0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    int i17 = org.telegram.ui.ActionBar.k6.ic;
                    int w04 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
                    textPaint = this.f;
                    textPaint.setColor(w04);
                    int w05 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
                    paint = this.e;
                    paint.setColor(w05);
                    this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vd, g6Var));
                    alpha = d("paintChatActionBackground").getAlpha();
                    alpha2 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                    int alpha3 = textPaint.getAlpha();
                    int alpha4 = paint.getAlpha();
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha2 * f25));
                    int i18 = (int) (alpha * f25);
                    d("paintChatActionBackground").setAlpha(i18);
                    i10 = (int) (alpha3 * f25);
                    textPaint.setAlpha(i10);
                    if (f7 >= 1.0f) {
                    }
                    i11 = i10;
                    i12 = alpha;
                    rectF = rectF3;
                    i13 = alpha2;
                    if (f7 != 1.0f) {
                    }
                    if (f7 != 1.0f) {
                        this.M = false;
                        g(njVar, false);
                    }
                    f12 = this.c / 2.0f;
                    f13 = this.L * (-AndroidUtilities.dp(4.0f));
                    if (!this.R) {
                    }
                    float f26 = f14 / 2.0f;
                    float max = Math.max(0.0f, Math.min(this.d, (f26 - (AndroidUtilities.dp(16.0f) * f7)) - AndroidUtilities.dp(4.0f)));
                    float max2 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f26 - (AndroidUtilities.dp(8.0f) * f7))) * 2.0f) - AndroidUtilities.dp2(16.0f));
                    float dp2 = AndroidUtilities.dp(56.0f);
                    f15 = this.K;
                    float f27 = max2 + (dp2 * f15);
                    if (f15 >= 1.0f) {
                    }
                    float f28 = -f14;
                    float f29 = f14;
                    float dp3 = (this.K * (AndroidUtilities.dp(56.0f) + f28)) + ((1.0f - this.K) * (-AndroidUtilities.dp(8.0f)));
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    i14 = i12;
                    rectF4.set(f12 - max, f28, f12 + max, dp3);
                    if (this.K > 0.0f) {
                    }
                    f16 = 1.0f;
                    if (this.W) {
                    }
                    float y10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, AndroidUtilities.dp(8.0f), f17 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.K);
                    canvas2.save();
                    rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    canvas2.clipRect(rectF4);
                    f20 = this.K;
                    if (f20 > 0.0f) {
                    }
                    canvas2.save();
                    float dp4 = (AndroidUtilities.dp(24.0f) * f7) / AndroidUtilities.dpf2(24.0f);
                    canvas2.scale(dp4, dp4, f12, y10 - AndroidUtilities.dp(20.0f));
                    canvas2.translate(f12 - AndroidUtilities.dp2(12.0f), y10 - AndroidUtilities.dp(12.0f));
                    i16 = i11;
                    textPaint2 = textPaint;
                    f21 = f13;
                    f22 = f29;
                    canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint);
                    canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint);
                    canvas2 = canvas;
                    canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint);
                    canvas2.restore();
                    if (this.R) {
                    }
                    canvas2.restore();
                    if (this.s != null) {
                        d("paintChatActionBackground").setAlpha(i15);
                        textPaint2.setAlpha(i16);
                        float dp5 = (((1.0f - this.K) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(36.0f) * this.K)) + f21;
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        float f30 = (r5 - this.x) / 2.0f;
                        rectF5.set(f30, dp5, this.c - f30, this.s.getHeight() + dp5);
                        rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
                        if (g6Var == null ? g6Var.f() : org.telegram.ui.ActionBar.k6.c1()) {
                        }
                        canvas2.save();
                        canvas2.translate((this.c - this.x) / 2.0f, dp5);
                        this.s.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!this.R) {
                        float c10 = si.o0.c((-f22) + AndroidUtilities.dp(4.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f18), f21);
                        r5Var = this.k0;
                        if (r5Var != null) {
                        }
                        ImageReceiver imageReceiver2 = this.F;
                        imageReceiver = imageReceiver2;
                        imageReceiver.setAlpha(f19);
                        float f31 = f18 / 2.0f;
                        imageReceiver.setRoundRadius((int) f31);
                        float f32 = f18;
                        imageReceiver.setImageCoords(f12 - f31, c10, f32, f32);
                        if (this.X) {
                            ((org.telegram.ui.Components.g90) ((org.telegram.ui.Components.yq) imageReceiver.getDrawable()).b).i = f7;
                        }
                        if (this.K > 0.0f) {
                        }
                        imageReceiver.draw(canvas2);
                        imageReceiver.setAlpha(1.0f);
                    }
                    d("paintChatActionBackground").setAlpha(i14);
                    org.telegram.ui.ActionBar.k6.h2.setAlpha(i13);
                    textPaint2.setAlpha(alpha3);
                    paint2.setAlpha(alpha4);
                }
            }
        } catch (Exception e7) {
            e = e7;
            f11 = 0.2f;
        }
        int i172 = org.telegram.ui.ActionBar.k6.ic;
        int w042 = org.telegram.ui.ActionBar.k6.w0(i172, g6Var);
        textPaint = this.f;
        textPaint.setColor(w042);
        int w052 = org.telegram.ui.ActionBar.k6.w0(i172, g6Var);
        paint = this.e;
        paint.setColor(w052);
        this.h.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vd, g6Var));
        alpha = d("paintChatActionBackground").getAlpha();
        alpha2 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
        int alpha32 = textPaint.getAlpha();
        int alpha42 = paint.getAlpha();
        org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha2 * f25));
        int i182 = (int) (alpha * f25);
        d("paintChatActionBackground").setAlpha(i182);
        i10 = (int) (alpha32 * f25);
        textPaint.setAlpha(i10);
        if ((f7 >= 1.0f || this.Q >= 1.0f) && (f7 >= 1.0f || this.Q != 1.0f)) {
            i11 = i10;
            i12 = alpha;
            rectF = rectF3;
            i13 = alpha2;
        } else {
            i11 = i10;
            i12 = alpha;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i13 = alpha2;
            if (currentTimeMillis - this.P > 100) {
                try {
                    njVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.P = currentTimeMillis;
            }
            this.Q = f7;
        }
        if (f7 != 1.0f && !this.M) {
            this.M = true;
            this.N = true;
            g(njVar, true);
            this.U = System.currentTimeMillis();
        } else if (f7 != 1.0f && this.M) {
            this.M = false;
            g(njVar, false);
        }
        f12 = this.c / 2.0f;
        f13 = this.L * (-AndroidUtilities.dp(4.0f));
        f14 = !this.R ? dp - f13 : dp;
        float f262 = f14 / 2.0f;
        float max3 = Math.max(0.0f, Math.min(this.d, (f262 - (AndroidUtilities.dp(16.0f) * f7)) - AndroidUtilities.dp(4.0f)));
        float max22 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f262 - (AndroidUtilities.dp(8.0f) * f7))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float dp22 = AndroidUtilities.dp(56.0f);
        f15 = this.K;
        float f272 = max22 + (dp22 * f15);
        if (f15 >= 1.0f || this.R) {
            float f282 = -f14;
            float f292 = f14;
            float dp32 = (this.K * (AndroidUtilities.dp(56.0f) + f282)) + ((1.0f - this.K) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF42 = AndroidUtilities.rectTmp;
            i14 = i12;
            rectF42.set(f12 - max3, f282, f12 + max3, dp32);
            if (this.K > 0.0f || this.R) {
                f16 = 1.0f;
            } else {
                float dp6 = AndroidUtilities.dp(16.0f) * this.K;
                rectF42.inset(dp6, dp6);
                f16 = 1.0f - this.K;
            }
            if (this.W) {
                f17 = f282;
                i15 = i182;
                erVar = erVar2;
                f18 = f272;
                f19 = f25;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f16));
                float f33 = this.d;
                canvas2.drawRoundRect(rectF42, f33, f33, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (g6Var != null ? g6Var.f() : org.telegram.ui.ActionBar.k6.c1()) {
                    int alpha6 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha6 * f16));
                    float f34 = this.d;
                    canvas2.drawRoundRect(rectF42, f34, f34, org.telegram.ui.ActionBar.k6.h2);
                    org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha6);
                }
            } else {
                Path path = this.r;
                path.reset();
                float width = rectF42.width() * f11;
                float width2 = rectF42.width() * 0.1f;
                float width3 = rectF42.width() * 0.03f;
                f17 = f282;
                float f35 = width2 / 2.0f;
                float height = rectF42.height() - width2;
                erVar = erVar2;
                f18 = f272;
                path.moveTo(rectF42.right, rectF42.top + width + width2);
                float f36 = -width;
                path.rQuadTo(0.0f, f36, f36, f36);
                float f37 = width * 2.0f;
                float f38 = f35 * 2.0f;
                f19 = f25;
                path.rLineTo((((-(rectF42.width() - f37)) / 2.0f) + f38) - width3, 0.0f);
                float f39 = -f35;
                float f40 = f39 / 2.0f;
                float f41 = f39 * 2.0f;
                i15 = i182;
                float f42 = (-width2) / 2.0f;
                path.rQuadTo(f40, 0.0f, f41, f42);
                path.rQuadTo(f40, f42, f41, f42);
                path.rLineTo(((-(rectF42.width() - f37)) / 2.0f) + f38 + width3, 0.0f);
                path.rQuadTo(f36, 0.0f, f36, width);
                path.rLineTo(0.0f, (height + width2) - f37);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF42.width() - f37, 0.0f);
                path.rQuadTo(width, 0.0f, width, f36);
                path.rLineTo(0.0f, -(height - f37));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (g6Var != null ? g6Var.f() : org.telegram.ui.ActionBar.k6.c1()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                }
            }
            float y102 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, AndroidUtilities.dp(8.0f), f17 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.K);
            canvas2.save();
            rectF42.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF42);
            f20 = this.K;
            if (f20 > 0.0f) {
                paint.setAlpha((int) ((1.0f - f20) * 255.0f));
            }
            canvas2.save();
            float dp42 = (AndroidUtilities.dp(24.0f) * f7) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp42, dp42, f12, y102 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f12 - AndroidUtilities.dp2(12.0f), y102 - AndroidUtilities.dp(12.0f));
            i16 = i11;
            textPaint2 = textPaint;
            f21 = f13;
            f22 = f292;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint);
            canvas2.restore();
            if (this.R) {
                paint2 = paint;
            } else {
                float c11 = si.o0.c(f17 - AndroidUtilities.dp(2.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f18), f21);
                paint.setAlpha(alpha42);
                canvas2.save();
                canvas2.scale(f7, f7, f12, AndroidUtilities.dp(28.0f) + c11);
                float dp7 = c11 + AndroidUtilities.dp(28.0f);
                if (this.N) {
                    float f43 = this.O;
                    if (f43 < 1.0f) {
                        float f44 = f43 + 0.07272727f;
                        this.O = f44;
                        if (f44 > 1.0f) {
                            this.O = 1.0f;
                        }
                    }
                    float f45 = this.O;
                    float f46 = f45 > 0.5f ? 1.0f : f45 / 0.5f;
                    float f47 = f45 < 0.5f ? 0.0f : (f45 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF42);
                    canvas2.translate(f12 - AndroidUtilities.dp(24.0f), dp7 - AndroidUtilities.dp(24.0f));
                    float dp8 = AndroidUtilities.dp(16.0f);
                    float dp9 = AndroidUtilities.dp(26.0f);
                    float dp10 = AndroidUtilities.dp(22.0f);
                    float dp11 = AndroidUtilities.dp(32.0f);
                    float dp12 = AndroidUtilities.dp(32.0f);
                    float dp13 = AndroidUtilities.dp(20.0f);
                    float f48 = 1.0f - f46;
                    canvas.drawLine(dp8, dp9, (dp10 * f46) + (dp8 * f48), (f46 * dp11) + (f48 * dp9), paint);
                    if (f47 > 0.0f) {
                        float f49 = 1.0f - f47;
                        float f50 = (dp12 * f47) + (dp10 * f49);
                        float f51 = (dp13 * f47) + (f49 * dp11);
                        canvas2 = canvas;
                        canvas2.drawLine(dp10, dp11, f50, f51, paint);
                    } else {
                        canvas2 = canvas;
                    }
                    paint2 = paint;
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i15 = i182;
            erVar = erVar2;
            f18 = f272;
            f19 = f25;
            i14 = i12;
            i16 = i11;
            f21 = f13;
            f22 = f14;
            textPaint2 = textPaint;
            paint2 = paint;
        }
        if (this.s != null && this.K > 0.0f) {
            d("paintChatActionBackground").setAlpha(i15);
            textPaint2.setAlpha(i16);
            float dp52 = (((1.0f - this.K) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(36.0f) * this.K)) + f21;
            RectF rectF52 = AndroidUtilities.rectTmp;
            float f302 = (r5 - this.x) / 2.0f;
            rectF52.set(f302, dp52, this.c - f302, this.s.getHeight() + dp52);
            rectF52.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF52, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (g6Var == null ? g6Var.f() : org.telegram.ui.ActionBar.k6.c1()) {
                canvas2.drawRoundRect(rectF52, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.k6.h2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.x) / 2.0f, dp52);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.R && f18 > 0.0f) {
            float c102 = si.o0.c((-f22) + AndroidUtilities.dp(4.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f18), f21);
            r5Var = this.k0;
            if (r5Var != null || (imageReceiver2 = r5Var.k) == null) {
                ImageReceiver imageReceiver22 = this.F;
            }
            imageReceiver = imageReceiver22;
            imageReceiver.setAlpha(f19);
            float f312 = f18 / 2.0f;
            imageReceiver.setRoundRadius((int) f312);
            float f322 = f18;
            imageReceiver.setImageCoords(f12 - f312, c102, f322, f322);
            if (this.X && imageReceiver.getDrawable() != null && (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.yq) && (((org.telegram.ui.Components.yq) imageReceiver.getDrawable()).b instanceof org.telegram.ui.Components.g90)) {
                ((org.telegram.ui.Components.g90) ((org.telegram.ui.Components.yq) imageReceiver.getDrawable()).b).i = f7;
            }
            if (this.K > 0.0f || !this.b0) {
                imageReceiver.draw(canvas2);
            } else {
                canvas2.saveLayerAlpha(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), 255, 31);
                imageReceiver.draw(canvas2);
                float f52 = this.K;
                org.telegram.ui.Components.er erVar3 = erVar;
                erVar3.e(erVar3.s);
                canvas2.scale(f52, f52, (erVar3.s / 2.0f) + erVar3.A + AndroidUtilities.dp(12.0f) + f12, (c102 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f12, c102 - AndroidUtilities.dp(6.0f));
                float f53 = erVar3.C;
                float f54 = erVar3.l;
                if (f54 != 1.0f) {
                    int i19 = erVar3.c;
                    f23 = 6.0f;
                    if (i19 == 0 || i19 == 1) {
                        f24 = 14.0f;
                        rectF2 = rectF;
                        erVar3.e(erVar3.s);
                        float dp14 = (erVar3.x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        float f55 = erVar3.B;
                        rectF2.set(f55, dp14, erVar3.s + f55 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f56 = f54 * 2.0f;
                        if (f56 > 1.0f) {
                            f56 = 1.0f;
                        }
                        float dp15 = (erVar3.x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        int i20 = erVar3.s;
                        int i21 = erVar3.r;
                        if (i20 == i21) {
                            y3 = i20;
                            f24 = 14.0f;
                        } else {
                            f24 = 14.0f;
                            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f56, i21, i20 * f56);
                        }
                        erVar3.e(y3);
                        float f57 = erVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f57, dp15, y3 + f57 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    f23 = 6.0f;
                    f24 = 14.0f;
                    rectF2 = rectF;
                    erVar3.e(erVar3.s);
                    float dp16 = (erVar3.x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                    float f58 = erVar3.B;
                    rectF2.set(f58, dp16, erVar3.s + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f59 = this.K;
                erVar3.e(erVar3.s);
                canvas2.scale(f59, f59, (erVar3.s / 2.0f) + erVar3.A + AndroidUtilities.dp(12.0f) + f12, (c102 - AndroidUtilities.dp(f23)) + AndroidUtilities.dp(f24));
                canvas2.translate(f12 + AndroidUtilities.dp(12.0f), c102 - AndroidUtilities.dp(f23));
                erVar3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i14);
        org.telegram.ui.ActionBar.k6.h2.setAlpha(i13);
        textPaint2.setAlpha(alpha32);
        paint2.setAlpha(alpha42);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xk, this.j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.v != null) {
            float f7 = this.K;
            if (f7 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f7) * alpha2 * this.S));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.c - this.y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.w != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float dp = ((1.0f - this.K) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.c - this.E) / 2.0f, dp);
                this.w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        org.telegram.ui.ActionBar.g6 g6Var = this.j0;
        Paint d = g6Var != null ? g6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.k6.U0(str);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.e0).dialogs_dict.f(this.Z)) == null) {
            return;
        }
        int i12 = dialog.unread_count;
        this.c0.c(i12, true);
        this.b0 = i12 > 0;
        View view = this.a0;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean e() {
        return this.S > 0.0f && !this.R;
    }

    public final void f() {
        View view;
        this.F.onAttachedToWindow();
        org.telegram.ui.Components.r5 r5Var = this.k0;
        if (r5Var != null && (view = this.a0) != null) {
            r5Var.a(view);
        }
        NotificationCenter.getInstance(this.e0).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        final int i10 = 1;
        final int i11 = 0;
        final int i12 = 2;
        if (!z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            final int i13 = 4;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lp
                public final /* synthetic */ np b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i13) {
                        case 0:
                            np npVar = this.b;
                            npVar.getClass();
                            npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            npVar.T.invalidate();
                            break;
                        case 1:
                            np npVar2 = this.b;
                            npVar2.getClass();
                            npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 2:
                            np npVar3 = this.b;
                            npVar3.getClass();
                            npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 3:
                            np npVar4 = this.b;
                            npVar4.getClass();
                            npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        default:
                            np npVar5 = this.b;
                            npVar5.getClass();
                            npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            npVar5.T.invalidate();
                            view.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ np b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        np npVar = this.b;
                        npVar.getClass();
                        npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        npVar.T.invalidate();
                        break;
                    case 1:
                        np npVar2 = this.b;
                        npVar2.getClass();
                        npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        np npVar3 = this.b;
                        npVar3.getClass();
                        npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        np npVar4 = this.b;
                        npVar4.getClass();
                        npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        np npVar5 = this.b;
                        npVar5.getClass();
                        npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        npVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat2.setDuration(250L);
        this.L = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ np b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        np npVar = this.b;
                        npVar.getClass();
                        npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        npVar.T.invalidate();
                        break;
                    case 1:
                        np npVar2 = this.b;
                        npVar2.getClass();
                        npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        np npVar3 = this.b;
                        npVar3.getClass();
                        npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        np npVar4 = this.b;
                        npVar4.getClass();
                        npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        np npVar5 = this.b;
                        npVar5.getClass();
                        npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        npVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.j;
        ofFloat3.setInterpolator(bsVar);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ np b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        np npVar = this.b;
                        npVar.getClass();
                        npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        npVar.T.invalidate();
                        break;
                    case 1:
                        np npVar2 = this.b;
                        npVar2.getClass();
                        npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        np npVar3 = this.b;
                        npVar3.getClass();
                        npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        np npVar4 = this.b;
                        npVar4.getClass();
                        npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        np npVar5 = this.b;
                        npVar5.getClass();
                        npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        npVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(bsVar);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final int i14 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ np b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        np npVar = this.b;
                        npVar.getClass();
                        npVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        npVar.T.invalidate();
                        break;
                    case 1:
                        np npVar2 = this.b;
                        npVar2.getClass();
                        npVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        np npVar3 = this.b;
                        npVar3.getClass();
                        npVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        np npVar4 = this.b;
                        npVar4.getClass();
                        npVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        np npVar5 = this.b;
                        npVar5.getClass();
                        npVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        npVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(bsVar);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.J = animatorSet3;
        animatorSet3.addListener(new ai.ne(16, this, view));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ofFloat3, ofFloat4, ofFloat5);
        this.J.playTogether(ofFloat2, animatorSet4);
        this.J.start();
    }

    public final void h() {
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.i0, this.f0, this.g0, true, this.d0);
        if (c10 == null) {
            this.G = null;
            this.W = false;
            this.R = true;
            return;
        }
        this.Z = c10.id;
        int[] iArr = this.d0;
        this.W = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.R = false;
        int i10 = this.e0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.id));
        this.G = chat;
        if (chat == null) {
            this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.id));
        }
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.k(i10, this.G);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", h9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i10).ensureMessagesLoaded(c10.id, 0, null);
        int i11 = c10.unread_count;
        this.c0.c(i11, false);
        this.b0 = i11 > 0;
    }

    public final void i(TLRPC.Chat chat) {
        if (chat == null) {
            h();
            return;
        }
        this.Z = -chat.id;
        int[] iArr = this.d0;
        this.W = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat2 = this.G;
        int i10 = this.e0;
        h9Var.k(i10, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", h9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i10).ensureMessagesLoaded(-chat.id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i10).getDialog(-chat.id);
        int i11 = dialog == null ? 0 : dialog.unread_count;
        this.c0.c(i11, false);
        this.b0 = i11 > 0;
        this.V = true;
        this.H = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.r5 r5Var;
        View view;
        View view2;
        org.telegram.ui.Components.r5 r5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.V = false;
        this.W = false;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        long j10 = -this.i0;
        int i10 = this.e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(j10);
        if (topics == null || topics.size() <= 1) {
            tL_forumTopic = null;
        } else {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.id != this.h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        }
        if (tL_forumTopic == null) {
            this.H = null;
            this.R = true;
            return;
        }
        this.R = false;
        this.H = tL_forumTopic;
        int i12 = tL_forumTopic.id;
        org.telegram.ui.ActionBar.g6 g6Var = this.j0;
        if (i12 == 1) {
            View view3 = this.a0;
            if (view3 != null && (r5Var2 = this.k0) != null) {
                r5Var2.o(view3);
            }
            this.k0 = null;
            Context context = this.T.getContext();
            int i13 = org.telegram.ui.ActionBar.k6.Ac;
            og.c c10 = og.d.c(context, 1.0f, org.telegram.ui.ActionBar.k6.w0(i13, g6Var), true);
            this.l0 = c10 != null ? c10 : null;
            this.m0 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
            imageReceiver.setImageBitmap(c10);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            org.telegram.ui.Components.r5 r5Var3 = this.k0;
            if (r5Var3 == null || r5Var3.i() != tL_forumTopic.icon_emoji_id) {
                org.telegram.ui.Components.r5 r5Var4 = this.k0;
                if (r5Var4 != null && (view = this.a0) != null) {
                    r5Var4.o(view);
                }
                org.telegram.ui.Components.r5 r5Var5 = new org.telegram.ui.Components.r5(22, i10, tL_forumTopic.icon_emoji_id);
                this.k0 = r5Var5;
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ic, g6Var);
                this.n0 = w02;
                r5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.r5 r5Var6 = this.k0;
            if (r5Var6 != null && (view2 = this.a0) != null) {
                r5Var6.a(view2);
            }
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            View view4 = this.a0;
            if (view4 != null && (r5Var = this.k0) != null) {
                r5Var.o(view4);
            }
            this.k0 = null;
            imageReceiver.setImageBitmap(og.d.e(tL_forumTopic));
        }
        int i14 = tL_forumTopic.unread_count;
        this.c0.c(i14, false);
        this.b0 = i14 > 0;
    }
}
