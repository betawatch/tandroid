package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
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
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class aq implements NotificationCenter.NotificationCenterDelegate {
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
    public dj Y;
    public long Z;
    public int a;
    public View a0;
    public int b;
    public boolean b0;
    public int c;
    public final org.telegram.ui.Components.uq c0;
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
    public final org.telegram.ui.ActionBar.f6 j0;
    public org.telegram.ui.Components.q5 k0;
    public final Paint n;
    public final Path r;
    public StaticLayout s;
    public StaticLayout v;
    public StaticLayout w;
    public int x;
    public int y;

    public aq(int i10, View view, long j3, int i11, int i12, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(null, true, null);
        this.c0 = uqVar;
        this.d0 = new int[3];
        this.T = view;
        this.e0 = i10;
        this.i0 = j3;
        this.f0 = i11;
        this.g0 = i12;
        this.h0 = j10;
        this.X = MessagesController.getInstance(i10).isForum(j3);
        this.j0 = f6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        uqVar.z = 3;
        uqVar.I = 1;
        uqVar.g = true;
        uqVar.d = d("paintChatActionBackground");
        uqVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j3, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j10;
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
            if (chat != null && dialog.id != j3 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
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
                    long j11 = j3;
                    int i16 = i10;
                    int[] iArr3 = iArr;
                    TLRPC.Dialog c11 = c(j11, i16, i15, false, iArr3);
                    j10 = j11;
                    i12 = i16;
                    iArr2 = iArr3;
                    if (c11 != null) {
                        if (iArr2 != null) {
                            iArr2[0] = 1;
                        }
                        return c11;
                    }
                } else {
                    j10 = j3;
                    i12 = i10;
                    iArr2 = iArr;
                }
                i14++;
                i10 = i12;
                j3 = j10;
                iArr = iArr2;
            }
        }
        long j12 = j3;
        int i17 = i10;
        int[] iArr4 = iArr;
        for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
            int keyAt = messagesController.dialogsByFolder.keyAt(i18);
            if (i17 != keyAt && (c10 = c(j12, keyAt, 0, false, iArr4)) != null) {
                if (iArr4 != null) {
                    iArr4[0] = 1;
                }
                return c10;
            }
        }
        return null;
    }

    public final void a(Canvas canvas, uj ujVar, float f7, float f10) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f11;
        float f12;
        float f13;
        org.telegram.ui.Components.uq uqVar;
        float f14;
        float f15;
        TextPaint textPaint;
        float f16;
        int i13;
        float f17;
        float f18;
        int i14;
        int i15;
        Paint paint;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        RectF rectF2;
        float f19;
        float f20;
        float z10;
        Canvas canvas2 = canvas;
        if (this.a0 != ujVar) {
            this.a0 = ujVar;
            org.telegram.ui.Components.q5 q5Var = this.k0;
            if (q5Var != null) {
                q5Var.a(ujVar);
            }
        }
        org.telegram.ui.Components.uq uqVar2 = this.c0;
        uqVar2.H = ujVar;
        RectF rectF3 = uqVar2.f;
        float dp = AndroidUtilities.dp(110.0f) * f7;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        float f21 = f7 < 0.2f ? 5.0f * f7 * f10 : f10;
        org.telegram.ui.ActionBar.j6.q(0.0f, ujVar.getMeasuredHeight() - dp, this.c, ujVar.getMeasuredHeight());
        int i16 = org.telegram.ui.ActionBar.j6.ic;
        org.telegram.ui.ActionBar.f6 f6Var = this.j0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
        TextPaint textPaint3 = this.f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
        Paint paint2 = this.e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, f6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha2 * f21));
        int i17 = (int) (alpha * f21);
        d("paintChatActionBackground").setAlpha(i17);
        int i18 = (int) (alpha3 * f21);
        textPaint3.setAlpha(i18);
        if ((f7 < 1.0f || this.Q >= 1.0f) && (f7 >= 1.0f || this.Q != 1.0f)) {
            i10 = i18;
            i11 = i17;
            rectF = rectF3;
            i12 = alpha2;
        } else {
            i10 = i18;
            i11 = i17;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i12 = alpha2;
            if (currentTimeMillis - this.P > 100) {
                try {
                    ujVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.P = currentTimeMillis;
            }
            this.Q = f7;
        }
        if (f7 == 1.0f && !this.M) {
            this.M = true;
            this.N = true;
            g(ujVar, true);
            this.U = System.currentTimeMillis();
        } else if (f7 != 1.0f && this.M) {
            this.M = false;
            g(ujVar, false);
        }
        float f22 = this.c / 2.0f;
        float f23 = this.L * (-AndroidUtilities.dp(4.0f));
        float f24 = this.R ? dp - f23 : dp;
        float f25 = f24 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f25 - (AndroidUtilities.dp(16.0f) * f7)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f25 - (AndroidUtilities.dp(8.0f) * f7))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float dp2 = AndroidUtilities.dp(56.0f);
        float f26 = this.K;
        float f27 = (dp2 * f26) + max2;
        if (f26 < 1.0f || this.R) {
            f11 = 36.0f;
            float f28 = -f24;
            float f29 = f24;
            float dp3 = (this.K * (AndroidUtilities.dp(56.0f) + f28)) + ((1.0f - this.K) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i19 = i11;
            rectF4.set(f22 - max, f28, f22 + max, dp3);
            if (this.K <= 0.0f || this.R) {
                f12 = 1.0f;
            } else {
                float dp4 = AndroidUtilities.dp(16.0f) * this.K;
                rectF4.inset(dp4, dp4);
                f12 = 1.0f - this.K;
            }
            if (this.W) {
                Path path = this.r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f13 = f28;
                float f30 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                uqVar = uqVar2;
                f14 = f27;
                path.moveTo(rectF4.right, rectF4.top + width + width2);
                float f31 = -width;
                path.rQuadTo(0.0f, f31, f31, f31);
                float f32 = width * 2.0f;
                float f33 = f30 * 2.0f;
                f15 = f21;
                path.rLineTo((((-(rectF4.width() - f32)) / 2.0f) + f33) - width3, 0.0f);
                float f34 = -f30;
                float f35 = f34 / 2.0f;
                float f36 = f34 * 2.0f;
                textPaint = textPaint3;
                float f37 = (-width2) / 2.0f;
                path.rQuadTo(f35, 0.0f, f36, f37);
                path.rQuadTo(f35, f37, f36, f37);
                path.rLineTo(((-(rectF4.width() - f32)) / 2.0f) + f33 + width3, 0.0f);
                path.rQuadTo(f31, 0.0f, f31, width);
                path.rLineTo(0.0f, (height + width2) - f32);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF4.width() - f32, 0.0f);
                path.rQuadTo(width, 0.0f, width, f31);
                path.rLineTo(0.0f, -(height - f32));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (f6Var != null ? f6Var.o0() : org.telegram.ui.ActionBar.j6.a1()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                }
            } else {
                f13 = f28;
                uqVar = uqVar2;
                f14 = f27;
                f15 = f21;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f12));
                float f38 = this.d;
                canvas2.drawRoundRect(rectF4, f38, f38, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (f6Var != null ? f6Var.o0() : org.telegram.ui.ActionBar.j6.a1()) {
                    int alpha6 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha6 * f12));
                    float f39 = this.d;
                    canvas2.drawRoundRect(rectF4, f39, f39, org.telegram.ui.ActionBar.j6.h2);
                    org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha6);
                }
            }
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f7, AndroidUtilities.dp(8.0f), f13 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.K);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f40 = this.K;
            if (f40 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f40) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f7) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f22, z11 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f22 - AndroidUtilities.dp2(12.0f), z11 - AndroidUtilities.dp(12.0f));
            f16 = f22;
            i13 = i10;
            f17 = f23;
            f18 = f29;
            i14 = i19;
            i15 = alpha;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.R) {
                float a2 = org.telegram.ui.Cells.p6.a(f13 - AndroidUtilities.dp(2.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f14), f17);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f7, f7, f16, AndroidUtilities.dp(28.0f) + a2);
                float dp6 = a2 + AndroidUtilities.dp(28.0f);
                if (this.N) {
                    float f41 = this.O;
                    if (f41 < 1.0f) {
                        float f42 = f41 + 0.07272727f;
                        this.O = f42;
                        if (f42 > 1.0f) {
                            this.O = 1.0f;
                        }
                    }
                    float f43 = this.O;
                    float f44 = f43 > 0.5f ? 1.0f : f43 / 0.5f;
                    float f45 = f43 < 0.5f ? 0.0f : (f43 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF4);
                    canvas2.translate(f16 - AndroidUtilities.dp(24.0f), dp6 - AndroidUtilities.dp(24.0f));
                    float dp7 = AndroidUtilities.dp(16.0f);
                    float dp8 = AndroidUtilities.dp(26.0f);
                    float dp9 = AndroidUtilities.dp(22.0f);
                    float dp10 = AndroidUtilities.dp(32.0f);
                    float dp11 = AndroidUtilities.dp(32.0f);
                    float dp12 = AndroidUtilities.dp(20.0f);
                    float f46 = 1.0f - f44;
                    canvas.drawLine(dp7, dp8, (dp9 * f44) + (dp7 * f46), (f44 * dp10) + (f46 * dp8), paint2);
                    if (f45 > 0.0f) {
                        float f47 = 1.0f - f45;
                        float f48 = (dp11 * f45) + (dp9 * f47);
                        float f49 = (dp12 * f45) + (f47 * dp10);
                        canvas2 = canvas;
                        canvas2.drawLine(dp9, dp10, f48, f49, paint2);
                    } else {
                        canvas2 = canvas;
                    }
                    paint = paint2;
                    canvas2.restore();
                } else {
                    paint = paint2;
                }
                canvas2.restore();
            } else {
                paint = paint2;
            }
            canvas2.restore();
        } else {
            paint = paint2;
            uqVar = uqVar2;
            f14 = f27;
            f15 = f21;
            textPaint = textPaint3;
            i13 = i10;
            f17 = f23;
            f11 = 36.0f;
            f16 = f22;
            i15 = alpha;
            i14 = i11;
            f18 = f24;
        }
        if (this.s == null || this.K <= 0.0f) {
            textPaint2 = textPaint;
        } else {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.K) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f11) * this.K)) + f17;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f50 = (r4 - this.x) / 2.0f;
            rectF5.set(f50, dp13, this.c - f50, this.s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (f6Var != null ? f6Var.o0() : org.telegram.ui.ActionBar.j6.a1()) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.j6.h2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.x) / 2.0f, dp13);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.R && f14 > 0.0f) {
            float a10 = org.telegram.ui.Cells.p6.a((-f18) + AndroidUtilities.dp(4.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f14), f17);
            org.telegram.ui.Components.q5 q5Var2 = this.k0;
            if (q5Var2 == null || (imageReceiver = q5Var2.k) == null) {
                imageReceiver = this.F;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f15);
            float f51 = f14 / 2.0f;
            imageReceiver2.setRoundRadius((int) f51);
            float f52 = f14;
            imageReceiver2.setImageCoords(f16 - f51, a10, f52, f52);
            if (this.X && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.oq) && (((org.telegram.ui.Components.oq) imageReceiver2.getDrawable()).b instanceof org.telegram.ui.Components.l80)) {
                ((org.telegram.ui.Components.l80) ((org.telegram.ui.Components.oq) imageReceiver2.getDrawable()).b).i = f7;
            }
            if (this.K <= 0.0f || !this.b0) {
                imageReceiver2.draw(canvas2);
            } else {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f53 = this.K;
                org.telegram.ui.Components.uq uqVar3 = uqVar;
                uqVar3.e(uqVar3.s);
                canvas2.scale(f53, f53, (uqVar3.s / 2.0f) + uqVar3.A + AndroidUtilities.dp(12.0f) + f16, (a10 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f16, a10 - AndroidUtilities.dp(6.0f));
                float f54 = uqVar3.C;
                float f55 = uqVar3.l;
                if (f55 != 1.0f) {
                    f19 = 6.0f;
                    int i20 = uqVar3.c;
                    if (i20 == 0 || i20 == 1) {
                        rectF2 = rectF;
                        f20 = 14.0f;
                        uqVar3.e(uqVar3.s);
                        float dp14 = (uqVar3.x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                        float f56 = uqVar3.B;
                        rectF2.set(f56, dp14, uqVar3.s + f56 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f57 = f55 * 2.0f;
                        if (f57 > 1.0f) {
                            f57 = 1.0f;
                        }
                        float dp15 = (uqVar3.x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                        int i21 = uqVar3.s;
                        int i22 = uqVar3.r;
                        if (i21 == i22) {
                            z10 = i21;
                            f20 = 14.0f;
                        } else {
                            f20 = 14.0f;
                            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f57, i22, i21 * f57);
                        }
                        uqVar3.e(z10);
                        float f58 = uqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f58, dp15, z10 + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f19 = 6.0f;
                    f20 = 14.0f;
                    uqVar3.e(uqVar3.s);
                    float dp16 = (uqVar3.x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                    float f59 = uqVar3.B;
                    rectF2.set(f59, dp16, uqVar3.s + f59 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f60 = this.K;
                uqVar3.e(uqVar3.s);
                canvas2.scale(f60, f60, (uqVar3.s / 2.0f) + uqVar3.A + AndroidUtilities.dp(12.0f) + f16, (a10 - AndroidUtilities.dp(f19)) + AndroidUtilities.dp(f20));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f16, a10 - AndroidUtilities.dp(f19));
                uqVar3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.j6.h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xk, this.j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.j0;
        Paint G = f6Var != null ? f6Var.G(str) : null;
        return G != null ? G : org.telegram.ui.ActionBar.j6.S0(str);
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
        org.telegram.ui.Components.q5 q5Var = this.k0;
        if (q5Var != null && (view = this.a0) != null) {
            q5Var.a(view);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yp
                public final /* synthetic */ aq b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i13) {
                        case 0:
                            aq aqVar = this.b;
                            aqVar.getClass();
                            aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            aqVar.T.invalidate();
                            break;
                        case 1:
                            aq aqVar2 = this.b;
                            aqVar2.getClass();
                            aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 2:
                            aq aqVar3 = this.b;
                            aqVar3.getClass();
                            aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 3:
                            aq aqVar4 = this.b;
                            aqVar4.getClass();
                            aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        default:
                            aq aqVar5 = this.b;
                            aqVar5.getClass();
                            aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            aqVar5.T.invalidate();
                            view.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        aq aqVar = this.b;
                        aqVar.getClass();
                        aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        aqVar.T.invalidate();
                        break;
                    case 1:
                        aq aqVar2 = this.b;
                        aqVar2.getClass();
                        aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        aq aqVar3 = this.b;
                        aqVar3.getClass();
                        aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        aq aqVar4 = this.b;
                        aqVar4.getClass();
                        aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        aq aqVar5 = this.b;
                        aqVar5.getClass();
                        aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        aqVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(org.telegram.ui.Components.pr.h);
        ofFloat2.setDuration(250L);
        this.L = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        aq aqVar = this.b;
                        aqVar.getClass();
                        aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        aqVar.T.invalidate();
                        break;
                    case 1:
                        aq aqVar2 = this.b;
                        aqVar2.getClass();
                        aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        aq aqVar3 = this.b;
                        aqVar3.getClass();
                        aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        aq aqVar4 = this.b;
                        aqVar4.getClass();
                        aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        aq aqVar5 = this.b;
                        aqVar5.getClass();
                        aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        aqVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.j;
        ofFloat3.setInterpolator(prVar);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        aq aqVar = this.b;
                        aqVar.getClass();
                        aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        aqVar.T.invalidate();
                        break;
                    case 1:
                        aq aqVar2 = this.b;
                        aqVar2.getClass();
                        aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        aq aqVar3 = this.b;
                        aqVar3.getClass();
                        aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        aq aqVar4 = this.b;
                        aqVar4.getClass();
                        aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        aq aqVar5 = this.b;
                        aqVar5.getClass();
                        aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        aqVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(prVar);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final int i14 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.yp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        aq aqVar = this.b;
                        aqVar.getClass();
                        aqVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        aqVar.T.invalidate();
                        break;
                    case 1:
                        aq aqVar2 = this.b;
                        aqVar2.getClass();
                        aqVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        aq aqVar3 = this.b;
                        aqVar3.getClass();
                        aqVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        aq aqVar4 = this.b;
                        aqVar4.getClass();
                        aqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        aq aqVar5 = this.b;
                        aqVar5.getClass();
                        aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        aqVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(prVar);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.J = animatorSet3;
        animatorSet3.addListener(new bi.t(15, this, view));
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
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.k(i10, this.G);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", i9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
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
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat2 = this.G;
        int i10 = this.e0;
        i9Var.k(i10, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", i9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
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
        org.telegram.ui.Components.q5 q5Var;
        View view;
        View view2;
        org.telegram.ui.Components.q5 q5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.V = false;
        this.W = false;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        long j3 = -this.i0;
        int i10 = this.e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(j3);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.j0;
        if (i12 == 1) {
            View view3 = this.a0;
            if (view3 != null && (q5Var2 = this.k0) != null) {
                q5Var2.o(view3);
            }
            this.k0 = null;
            imageReceiver.setImageBitmap(og.d.c(this.T.getContext(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ac, f6Var), true));
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            org.telegram.ui.Components.q5 q5Var3 = this.k0;
            if (q5Var3 == null || q5Var3.i() != tL_forumTopic.icon_emoji_id) {
                org.telegram.ui.Components.q5 q5Var4 = this.k0;
                if (q5Var4 != null && (view = this.a0) != null) {
                    q5Var4.o(view);
                }
                org.telegram.ui.Components.q5 q5Var5 = new org.telegram.ui.Components.q5(22, i10, tL_forumTopic.icon_emoji_id);
                this.k0 = q5Var5;
                q5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, f6Var), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.q5 q5Var6 = this.k0;
            if (q5Var6 != null && (view2 = this.a0) != null) {
                q5Var6.a(view2);
            }
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            View view4 = this.a0;
            if (view4 != null && (q5Var = this.k0) != null) {
                q5Var.o(view4);
            }
            this.k0 = null;
            imageReceiver.setImageBitmap(og.d.e(tL_forumTopic));
        }
        int i13 = tL_forumTopic.unread_count;
        this.c0.c(i13, false);
        this.b0 = i13 > 0;
    }
}
