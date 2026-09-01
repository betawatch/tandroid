package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e21 {
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final boolean d;
    public l01 e;
    public final ImageReceiver g;
    public l5 h;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public final Paint n;
    public final Path o;
    public final RectF p;
    public final rc q;
    public Runnable r;
    public long s;
    public final z8 f = new z8((org.telegram.ui.ActionBar.g6) null);
    public final Path i = new Path();

    public e21(int i10, View view, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        Paint paint = new Paint(1);
        this.n = paint;
        Path path = new Path();
        this.o = path;
        this.p = new RectF();
        this.a = i10;
        this.b = view;
        this.c = g6Var;
        this.d = z4;
        this.q = new rc(view);
        this.g = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a() {
        this.g.onAttachedToWindow();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.a(this.b);
        }
    }

    public final void b() {
        this.g.onDetachedFromWindow();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i10, float f10, float f11, float f12, float f13, boolean z4) {
        float f14;
        float f15;
        l01 l01Var = this.e;
        if (l01Var == null) {
            return;
        }
        l01Var.p = i10 - AndroidUtilities.dp(144.66f);
        float l10 = this.e.l() + AndroidUtilities.dp(48.66f);
        float f16 = i10;
        float f17 = (f16 - l10) / 2.0f;
        int i11 = this.k;
        int i12 = (int) l10;
        boolean z10 = this.d;
        Path path = this.i;
        if (i11 == i12 && this.j == i10 && this.m == z4 && this.l == z10) {
            f15 = l10;
            f14 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            f14 = 2.0f;
            rectF.set(f17, AndroidUtilities.dp(4.5f), f17 + l10, AndroidUtilities.dp(28.5f));
            if (z4) {
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (z10) {
                float f18 = f16 / 2.0f;
                float dp = f18 - AndroidUtilities.dp(1.833f);
                while (dp > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), dp, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    dp -= AndroidUtilities.dp(8.33f);
                    f16 = f16;
                    l10 = l10;
                }
                float f19 = f16;
                f15 = l10;
                int dp2 = AndroidUtilities.dp(1.833f);
                while (true) {
                    f18 += dp2;
                    if (f18 >= f19) {
                        break;
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f18, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f18, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    dp2 = AndroidUtilities.dp(8.33f);
                }
            } else {
                f15 = l10;
            }
            this.k = i12;
            this.j = i10;
            this.l = z10;
            this.m = z4;
        }
        canvas.save();
        float f20 = f10 / f14;
        canvas.translate(f20, f11);
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        Paint T0 = org.telegram.ui.ActionBar.k6.T0("paintChatActionBackground", g6Var);
        int alpha = T0.getAlpha();
        T0.setAlpha((int) (alpha * f13 * f12));
        canvas.drawPath(path, T0);
        T0.setAlpha(alpha);
        if (g6Var != null ? g6Var.o0() : org.telegram.ui.ActionBar.k6.a1()) {
            Paint T02 = org.telegram.ui.ActionBar.k6.T0("paintChatActionBackgroundDarken", g6Var);
            int alpha2 = T02.getAlpha();
            T02.setAlpha((int) (alpha2 * f13 * f12));
            canvas.drawPath(path, T02);
            T02.setAlpha(alpha2);
        }
        canvas.restore();
        float f21 = f20 + f17;
        float f22 = f21 + f15;
        this.p.set(f21 - AndroidUtilities.dp(4.0f), f11 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f11);
        if (z4) {
            l5 l5Var = this.h;
            if (l5Var != null) {
                l5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f11), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f11));
                this.h.setAlpha((int) (255.0f * f13));
                this.h.draw(canvas);
            } else {
                float dp3 = AndroidUtilities.dp(20.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                ImageReceiver imageReceiver = this.g;
                imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f21, AndroidUtilities.dp(6.5f) + f11, dp3, dp4);
                imageReceiver.setAlpha(f13);
                imageReceiver.draw(canvas);
            }
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ic, g6Var);
            this.e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f11, f13, v02, canvas);
            canvas.save();
            canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f11);
            int l1 = org.telegram.ui.ActionBar.k6.l1(0.75f * f13, v02);
            Paint paint = this.n;
            paint.setColor(l1);
            paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
            canvas.drawPath(this.o, paint);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(MotionEvent motionEvent, boolean z4) {
        boolean z10;
        int action;
        Runnable runnable;
        if (this.e != null) {
            if (this.p.contains(motionEvent.getX(), motionEvent.getY() - (z4 ? this.b.getPaddingTop() : 0))) {
                z10 = true;
                action = motionEvent.getAction();
                rc rcVar = this.q;
                if (action != 0) {
                    rcVar.c(z10);
                } else if (motionEvent.getAction() == 2) {
                    if (rcVar.h && !z10) {
                        rcVar.c(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (rcVar.h && (runnable = this.r) != null) {
                        runnable.run();
                    }
                    rcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    rcVar.c(false);
                }
                return rcVar.h;
            }
        }
        z10 = false;
        action = motionEvent.getAction();
        rc rcVar2 = this.q;
        if (action != 0) {
        }
        return rcVar2.h;
    }

    public final void e(org.telegram.ui.Cells.a1 a1Var) {
        this.r = a1Var;
    }

    public final boolean f(MessageObject messageObject) {
        l5 l5Var = this.h;
        View view = this.b;
        if (l5Var != null) {
            l5Var.o(view);
            this.h = null;
        }
        this.k = 0;
        this.s = 0L;
        if (messageObject == null) {
            this.e = null;
            this.s = 0L;
        } else {
            int i10 = this.a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i10).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(monoForumTopicId);
                this.s = monoForumTopicId;
                if (userOrChat == null) {
                    this.e = null;
                    return false;
                }
                z8 z8Var = this.f;
                z8Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, z8Var);
                this.e = new l01(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(bg.e.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.v8, this.c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new l5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(bg.e.e(findTopic));
                }
                this.e = new l01(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        return this.e != null;
    }
}
