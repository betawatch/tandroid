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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mp implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final ImageReceiver B;
    public TLRPC.Chat C;
    public TLRPC.TL_forumTopic D;
    public long E;
    public AnimatorSet F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public float K;
    public long L;
    public float M;
    public boolean N;
    public float O;
    public final View P;
    public long Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public ti U;
    public long V;
    public View W;
    public boolean X;
    public final org.telegram.ui.Components.jq Y;
    public final int[] Z;
    public int a;
    public final int a0;
    public int b;
    public final int b0;
    public int c;
    public final int c0;
    public float d;
    public final long d0;
    public final Paint e;
    public final long e0;
    public final TextPaint f;
    public final org.telegram.ui.ActionBar.c6 f0;
    public org.telegram.ui.Components.k5 g0;
    public final TextPaint h;
    public final Paint n;
    public final Path r;
    public StaticLayout s;
    public StaticLayout v;
    public StaticLayout w;
    public int x;
    public int y;

    public mp(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.r = new Path();
        this.E = 0L;
        this.X = true;
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(null, true, null);
        this.Y = jqVar;
        this.Z = new int[3];
        this.P = view;
        this.a0 = i10;
        this.e0 = j10;
        this.b0 = i11;
        this.c0 = i12;
        this.d0 = j11;
        this.T = MessagesController.getInstance(i10).isForum(j10);
        this.f0 = c6Var;
        this.B = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        jqVar.z = 3;
        jqVar.I = 1;
        jqVar.g = true;
        jqVar.d = d("paintChatActionBackground");
        jqVar.e = textPaint;
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

    public final void a(Canvas canvas, kj kjVar, float f10, float f11) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f12;
        float f13;
        float f14;
        org.telegram.ui.Components.jq jqVar;
        float f15;
        float f16;
        TextPaint textPaint;
        float f17;
        int i13;
        float f18;
        float f19;
        int i14;
        int i15;
        Paint paint;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        RectF rectF2;
        float f20;
        float f21;
        float z10;
        Canvas canvas2 = canvas;
        if (this.W != kjVar) {
            this.W = kjVar;
            org.telegram.ui.Components.k5 k5Var = this.g0;
            if (k5Var != null) {
                k5Var.a(kjVar);
            }
        }
        org.telegram.ui.Components.jq jqVar2 = this.Y;
        jqVar2.H = kjVar;
        RectF rectF3 = jqVar2.f;
        float dp = AndroidUtilities.dp(110.0f) * f10;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        float f22 = f10 < 0.2f ? 5.0f * f10 * f11 : f11;
        org.telegram.ui.ActionBar.g6.q(0.0f, kjVar.getMeasuredHeight() - dp, this.c, kjVar.getMeasuredHeight());
        int i16 = org.telegram.ui.ActionBar.g6.ic;
        org.telegram.ui.ActionBar.c6 c6Var = this.f0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i16, c6Var);
        TextPaint textPaint3 = this.f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.g6.v0(i16, c6Var);
        Paint paint2 = this.e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, c6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.g6.h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.g6.h2.setAlpha((int) (alpha2 * f22));
        int i17 = (int) (alpha * f22);
        d("paintChatActionBackground").setAlpha(i17);
        int i18 = (int) (alpha3 * f22);
        textPaint3.setAlpha(i18);
        if ((f10 < 1.0f || this.M >= 1.0f) && (f10 >= 1.0f || this.M != 1.0f)) {
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
            if (currentTimeMillis - this.L > 100) {
                try {
                    kjVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.L = currentTimeMillis;
            }
            this.M = f10;
        }
        if (f10 == 1.0f && !this.I) {
            this.I = true;
            this.J = true;
            g(kjVar, true);
            this.Q = System.currentTimeMillis();
        } else if (f10 != 1.0f && this.I) {
            this.I = false;
            g(kjVar, false);
        }
        float f23 = this.c / 2.0f;
        float f24 = this.H * (-AndroidUtilities.dp(4.0f));
        float f25 = this.N ? dp - f24 : dp;
        float f26 = f25 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f26 - (AndroidUtilities.dp(16.0f) * f10)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.G) * ((Math.max(0.0f, Math.min(this.d * f10, f26 - (AndroidUtilities.dp(8.0f) * f10))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float dp2 = AndroidUtilities.dp(56.0f);
        float f27 = this.G;
        float f28 = (dp2 * f27) + max2;
        if (f27 < 1.0f || this.N) {
            f12 = 36.0f;
            float f29 = -f25;
            float f30 = f25;
            float dp3 = (this.G * (AndroidUtilities.dp(56.0f) + f29)) + ((1.0f - this.G) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i19 = i11;
            rectF4.set(f23 - max, f29, f23 + max, dp3);
            if (this.G <= 0.0f || this.N) {
                f13 = 1.0f;
            } else {
                float dp4 = AndroidUtilities.dp(16.0f) * this.G;
                rectF4.inset(dp4, dp4);
                f13 = 1.0f - this.G;
            }
            if (this.S) {
                Path path = this.r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f14 = f29;
                float f31 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                jqVar = jqVar2;
                f15 = f28;
                path.moveTo(rectF4.right, rectF4.top + width + width2);
                float f32 = -width;
                path.rQuadTo(0.0f, f32, f32, f32);
                float f33 = width * 2.0f;
                float f34 = f31 * 2.0f;
                f16 = f22;
                path.rLineTo((((-(rectF4.width() - f33)) / 2.0f) + f34) - width3, 0.0f);
                float f35 = -f31;
                float f36 = f35 / 2.0f;
                float f37 = f35 * 2.0f;
                textPaint = textPaint3;
                float f38 = (-width2) / 2.0f;
                path.rQuadTo(f36, 0.0f, f37, f38);
                path.rQuadTo(f36, f38, f37, f38);
                path.rLineTo(((-(rectF4.width() - f33)) / 2.0f) + f34 + width3, 0.0f);
                path.rQuadTo(f32, 0.0f, f32, width);
                path.rLineTo(0.0f, (height + width2) - f33);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF4.width() - f33, 0.0f);
                path.rQuadTo(width, 0.0f, width, f32);
                path.rLineTo(0.0f, -(height - f33));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.h2);
                }
            } else {
                f14 = f29;
                jqVar = jqVar2;
                f15 = f28;
                f16 = f22;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f13));
                float f39 = this.d;
                canvas2.drawRoundRect(rectF4, f39, f39, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
                    int alpha6 = org.telegram.ui.ActionBar.g6.h2.getAlpha();
                    org.telegram.ui.ActionBar.g6.h2.setAlpha((int) (alpha6 * f13));
                    float f40 = this.d;
                    canvas2.drawRoundRect(rectF4, f40, f40, org.telegram.ui.ActionBar.g6.h2);
                    org.telegram.ui.ActionBar.g6.h2.setAlpha(alpha6);
                }
            }
            float z11 = com.google.android.recaptcha.internal.a.z(1.0f, f10, AndroidUtilities.dp(8.0f), f14 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.G);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f41 = this.G;
            if (f41 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f41) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f10) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f23, z11 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f23 - AndroidUtilities.dp2(12.0f), z11 - AndroidUtilities.dp(12.0f));
            f17 = f23;
            i13 = i10;
            f18 = f24;
            f19 = f30;
            i14 = i19;
            i15 = alpha;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.N) {
                float d = com.google.android.recaptcha.internal.a.d(f14 - AndroidUtilities.dp(2.0f), this.G, (1.0f - this.G) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f10)) - f15), f18);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f10, f10, f17, AndroidUtilities.dp(28.0f) + d);
                float dp6 = d + AndroidUtilities.dp(28.0f);
                if (this.J) {
                    float f42 = this.K;
                    if (f42 < 1.0f) {
                        float f43 = f42 + 0.07272727f;
                        this.K = f43;
                        if (f43 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                    float f44 = this.K;
                    float f45 = f44 > 0.5f ? 1.0f : f44 / 0.5f;
                    float f46 = f44 < 0.5f ? 0.0f : (f44 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF4);
                    canvas2.translate(f17 - AndroidUtilities.dp(24.0f), dp6 - AndroidUtilities.dp(24.0f));
                    float dp7 = AndroidUtilities.dp(16.0f);
                    float dp8 = AndroidUtilities.dp(26.0f);
                    float dp9 = AndroidUtilities.dp(22.0f);
                    float dp10 = AndroidUtilities.dp(32.0f);
                    float dp11 = AndroidUtilities.dp(32.0f);
                    float dp12 = AndroidUtilities.dp(20.0f);
                    float f47 = 1.0f - f45;
                    canvas.drawLine(dp7, dp8, (dp9 * f45) + (dp7 * f47), (f45 * dp10) + (f47 * dp8), paint2);
                    if (f46 > 0.0f) {
                        float f48 = 1.0f - f46;
                        float f49 = (dp11 * f46) + (dp9 * f48);
                        float f50 = (dp12 * f46) + (f48 * dp10);
                        canvas2 = canvas;
                        canvas2.drawLine(dp9, dp10, f49, f50, paint2);
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
            jqVar = jqVar2;
            f15 = f28;
            f16 = f22;
            textPaint = textPaint3;
            i13 = i10;
            f18 = f24;
            f12 = 36.0f;
            f17 = f23;
            i15 = alpha;
            i14 = i11;
            f19 = f25;
        }
        if (this.s == null || this.G <= 0.0f) {
            textPaint2 = textPaint;
        } else {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.G) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f12) * this.G)) + f18;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f51 = (r4 - this.x) / 2.0f;
            rectF5.set(f51, dp13, this.c - f51, this.s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.g6.h2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.x) / 2.0f, dp13);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.N && f15 > 0.0f) {
            float d10 = com.google.android.recaptcha.internal.a.d((-f19) + AndroidUtilities.dp(4.0f), this.G, (1.0f - this.G) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f10)) - f15), f18);
            org.telegram.ui.Components.k5 k5Var2 = this.g0;
            if (k5Var2 == null || (imageReceiver = k5Var2.k) == null) {
                imageReceiver = this.B;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f16);
            float f52 = f15 / 2.0f;
            imageReceiver2.setRoundRadius((int) f52);
            float f53 = f15;
            imageReceiver2.setImageCoords(f17 - f52, d10, f53, f53);
            if (this.T && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.dq) && (((org.telegram.ui.Components.dq) imageReceiver2.getDrawable()).b instanceof org.telegram.ui.Components.y70)) {
                ((org.telegram.ui.Components.y70) ((org.telegram.ui.Components.dq) imageReceiver2.getDrawable()).b).i = f10;
            }
            if (this.G <= 0.0f || !this.X) {
                imageReceiver2.draw(canvas2);
            } else {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f54 = this.G;
                org.telegram.ui.Components.jq jqVar3 = jqVar;
                jqVar3.e(jqVar3.s);
                canvas2.scale(f54, f54, (jqVar3.s / 2.0f) + jqVar3.A + AndroidUtilities.dp(12.0f) + f17, (d10 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f17, d10 - AndroidUtilities.dp(6.0f));
                float f55 = jqVar3.C;
                float f56 = jqVar3.l;
                if (f56 != 1.0f) {
                    f20 = 6.0f;
                    int i20 = jqVar3.c;
                    if (i20 == 0 || i20 == 1) {
                        rectF2 = rectF;
                        f21 = 14.0f;
                        jqVar3.e(jqVar3.s);
                        float dp14 = (jqVar3.x - AndroidUtilities.dp(f55 * 2.0f)) / 2.0f;
                        float f57 = jqVar3.B;
                        rectF2.set(f57, dp14, jqVar3.s + f57 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f58 = f56 * 2.0f;
                        if (f58 > 1.0f) {
                            f58 = 1.0f;
                        }
                        float dp15 = (jqVar3.x - AndroidUtilities.dp(f55 * 2.0f)) / 2.0f;
                        int i21 = jqVar3.s;
                        int i22 = jqVar3.r;
                        if (i21 == i22) {
                            z10 = i21;
                            f21 = 14.0f;
                        } else {
                            f21 = 14.0f;
                            z10 = com.google.android.recaptcha.internal.a.z(1.0f, f58, i22, i21 * f58);
                        }
                        jqVar3.e(z10);
                        float f59 = jqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f59, dp15, z10 + f59 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f20 = 6.0f;
                    f21 = 14.0f;
                    jqVar3.e(jqVar3.s);
                    float dp16 = (jqVar3.x - AndroidUtilities.dp(f55 * 2.0f)) / 2.0f;
                    float f60 = jqVar3.B;
                    rectF2.set(f60, dp16, jqVar3.s + f60 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f61 = this.G;
                jqVar3.e(jqVar3.s);
                canvas2.scale(f61, f61, (jqVar3.s / 2.0f) + jqVar3.A + AndroidUtilities.dp(12.0f) + f17, (d10 - AndroidUtilities.dp(f20)) + AndroidUtilities.dp(f21));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f17, d10 - AndroidUtilities.dp(f20));
                jqVar3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.g6.h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xk, this.f0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.O));
        if (this.v != null) {
            float f10 = this.G;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.O));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.G);
                canvas.save();
                canvas.translate((this.c - this.y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.w != null) {
            float f11 = this.G;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.O));
                float dp = ((1.0f - this.G) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.c - this.A) / 2.0f, dp);
                this.w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f0;
        Paint N = c6Var != null ? c6Var.N(str) : null;
        return N != null ? N : org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.V == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.a0).dialogs_dict.f(this.V)) == null) {
            return;
        }
        int i12 = dialog.unread_count;
        this.Y.c(i12, true);
        this.X = i12 > 0;
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean e() {
        return this.O > 0.0f && !this.N;
    }

    public final void f() {
        View view;
        this.B.onAttachedToWindow();
        org.telegram.ui.Components.k5 k5Var = this.g0;
        if (k5Var != null && (view = this.W) != null) {
            k5Var.a(view);
        }
        NotificationCenter.getInstance(this.a0).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z10) {
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.F.cancel();
        }
        final int i10 = 1;
        final int i11 = 0;
        final int i12 = 2;
        if (!z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            final int i13 = 4;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kp
                public final /* synthetic */ mp b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i13) {
                        case 0:
                            mp mpVar = this.b;
                            mpVar.getClass();
                            mpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            mpVar.P.invalidate();
                            break;
                        case 1:
                            mp mpVar2 = this.b;
                            mpVar2.getClass();
                            mpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 2:
                            mp mpVar3 = this.b;
                            mpVar3.getClass();
                            mpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 3:
                            mp mpVar4 = this.b;
                            mpVar4.getClass();
                            mpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        default:
                            mp mpVar5 = this.b;
                            mpVar5.getClass();
                            mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            mpVar5.P.invalidate();
                            view.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.er.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.F = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.F.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.G, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kp
            public final /* synthetic */ mp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        mp mpVar = this.b;
                        mpVar.getClass();
                        mpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        mpVar.P.invalidate();
                        break;
                    case 1:
                        mp mpVar2 = this.b;
                        mpVar2.getClass();
                        mpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        mp mpVar3 = this.b;
                        mpVar3.getClass();
                        mpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        mp mpVar4 = this.b;
                        mpVar4.getClass();
                        mpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        mp mpVar5 = this.b;
                        mpVar5.getClass();
                        mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        mpVar5.P.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat2.setDuration(250L);
        this.H = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kp
            public final /* synthetic */ mp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        mp mpVar = this.b;
                        mpVar.getClass();
                        mpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        mpVar.P.invalidate();
                        break;
                    case 1:
                        mp mpVar2 = this.b;
                        mpVar2.getClass();
                        mpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        mp mpVar3 = this.b;
                        mpVar3.getClass();
                        mpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        mp mpVar4 = this.b;
                        mpVar4.getClass();
                        mpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        mp mpVar5 = this.b;
                        mpVar5.getClass();
                        mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        mpVar5.P.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.j;
        ofFloat3.setInterpolator(erVar);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kp
            public final /* synthetic */ mp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        mp mpVar = this.b;
                        mpVar.getClass();
                        mpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        mpVar.P.invalidate();
                        break;
                    case 1:
                        mp mpVar2 = this.b;
                        mpVar2.getClass();
                        mpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        mp mpVar3 = this.b;
                        mpVar3.getClass();
                        mpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        mp mpVar4 = this.b;
                        mpVar4.getClass();
                        mpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        mp mpVar5 = this.b;
                        mpVar5.getClass();
                        mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        mpVar5.P.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(erVar);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final int i14 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kp
            public final /* synthetic */ mp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        mp mpVar = this.b;
                        mpVar.getClass();
                        mpVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        mpVar.P.invalidate();
                        break;
                    case 1:
                        mp mpVar2 = this.b;
                        mpVar2.getClass();
                        mpVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        mp mpVar3 = this.b;
                        mpVar3.getClass();
                        mpVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        mp mpVar4 = this.b;
                        mpVar4.getClass();
                        mpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        mp mpVar5 = this.b;
                        mpVar5.getClass();
                        mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        mpVar5.P.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(erVar);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.F = animatorSet3;
        animatorSet3.addListener(new ag.x1(15, this, view));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ofFloat3, ofFloat4, ofFloat5);
        this.F.playTogether(ofFloat2, animatorSet4);
        this.F.start();
    }

    public final void h() {
        this.R = false;
        this.D = null;
        TLRPC.Dialog c10 = c(this.e0, this.b0, this.c0, true, this.Z);
        if (c10 == null) {
            this.C = null;
            this.S = false;
            this.N = true;
            return;
        }
        this.V = c10.id;
        int[] iArr = this.Z;
        this.S = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.N = false;
        int i10 = this.a0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.id));
        this.C = chat;
        if (chat == null) {
            this.C = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.id));
        }
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.k(i10, this.C);
        this.B.setImage(ImageLocation.getForChat(this.C, 1), "50_50", y8Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i10).ensureMessagesLoaded(c10.id, 0, null);
        int i11 = c10.unread_count;
        this.Y.c(i11, false);
        this.X = i11 > 0;
    }

    public final void i(TLRPC.Chat chat) {
        if (chat == null) {
            h();
            return;
        }
        this.V = -chat.id;
        int[] iArr = this.Z;
        this.S = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.N = false;
        this.C = chat;
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        TLRPC.Chat chat2 = this.C;
        int i10 = this.a0;
        y8Var.k(i10, chat2);
        this.B.setImage(ImageLocation.getForChat(this.C, 1), "50_50", y8Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i10).ensureMessagesLoaded(-chat.id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i10).getDialog(-chat.id);
        int i11 = dialog == null ? 0 : dialog.unread_count;
        this.Y.c(i11, false);
        this.X = i11 > 0;
        this.R = true;
        this.D = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.k5 k5Var;
        View view;
        View view2;
        org.telegram.ui.Components.k5 k5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.R = false;
        this.S = false;
        this.C = null;
        this.V = 0L;
        ImageReceiver imageReceiver = this.B;
        imageReceiver.clearImage();
        long j10 = -this.e0;
        int i10 = this.a0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(j10);
        if (topics == null || topics.size() <= 1) {
            tL_forumTopic = null;
        } else {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.id != this.d0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        }
        if (tL_forumTopic == null) {
            this.D = null;
            this.N = true;
            return;
        }
        this.N = false;
        this.D = tL_forumTopic;
        int i12 = tL_forumTopic.id;
        org.telegram.ui.ActionBar.c6 c6Var = this.f0;
        if (i12 == 1) {
            View view3 = this.W;
            if (view3 != null && (k5Var2 = this.g0) != null) {
                k5Var2.o(view3);
            }
            this.g0 = null;
            imageReceiver.setImageBitmap(wf.c.c(this.P.getContext(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ac, c6Var), true));
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            org.telegram.ui.Components.k5 k5Var3 = this.g0;
            if (k5Var3 == null || k5Var3.i() != tL_forumTopic.icon_emoji_id) {
                org.telegram.ui.Components.k5 k5Var4 = this.g0;
                if (k5Var4 != null && (view = this.W) != null) {
                    k5Var4.o(view);
                }
                org.telegram.ui.Components.k5 k5Var5 = new org.telegram.ui.Components.k5(22, i10, tL_forumTopic.icon_emoji_id);
                this.g0 = k5Var5;
                k5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ic, c6Var), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.k5 k5Var6 = this.g0;
            if (k5Var6 != null && (view2 = this.W) != null) {
                k5Var6.a(view2);
            }
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            View view4 = this.W;
            if (view4 != null && (k5Var = this.g0) != null) {
                k5Var.o(view4);
            }
            this.g0 = null;
            imageReceiver.setImageBitmap(wf.c.e(tL_forumTopic));
        }
        int i13 = tL_forumTopic.unread_count;
        this.Y.c(i13, false);
        this.X = i13 > 0;
    }
}
