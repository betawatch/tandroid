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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h11 {
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final boolean d;
    public nz0 e;
    public final ImageReceiver g;
    public k5 h;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public final Paint n;
    public final Path o;
    public final RectF p;
    public final pc q;
    public Runnable r;
    public long s;
    public final z8 f = new z8((org.telegram.ui.ActionBar.b6) null);
    public final Path i = new Path();

    public h11(int i9, View view, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.n = paint;
        Path path = new Path();
        this.o = path;
        this.p = new RectF();
        this.a = i9;
        this.b = view;
        this.c = b6Var;
        this.d = z10;
        this.q = new pc(view);
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
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.a(this.b);
        }
    }

    public final void b() {
        this.g.onDetachedFromWindow();
        k5 k5Var = this.h;
        if (k5Var != null) {
            k5Var.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i9, float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        nz0 nz0Var = this.e;
        if (nz0Var == null) {
            return;
        }
        nz0Var.p = i9 - AndroidUtilities.dp(144.66f);
        float l10 = this.e.l() + AndroidUtilities.dp(48.66f);
        float f16 = i9;
        float f17 = (f16 - l10) / 2.0f;
        int i10 = this.k;
        int i11 = (int) l10;
        boolean z11 = this.d;
        Path path = this.i;
        if (i10 == i11 && this.j == i9 && this.m == z10 && this.l == z11) {
            f15 = l10;
            f14 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            f14 = 2.0f;
            rectF.set(f17, AndroidUtilities.dp(4.5f), f17 + l10, AndroidUtilities.dp(28.5f));
            if (z10) {
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (z11) {
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
            this.k = i11;
            this.j = i9;
            this.l = z11;
            this.m = z10;
        }
        canvas.save();
        float f20 = f10 / f14;
        canvas.translate(f20, f11);
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var);
        int alpha = T0.getAlpha();
        T0.setAlpha((int) (alpha * f13 * f12));
        canvas.drawPath(path, T0);
        T0.setAlpha(alpha);
        if (b6Var != null ? b6Var.t0() : org.telegram.ui.ActionBar.f6.a1()) {
            Paint T02 = org.telegram.ui.ActionBar.f6.T0("paintChatActionBackgroundDarken", b6Var);
            int alpha2 = T02.getAlpha();
            T02.setAlpha((int) (alpha2 * f13 * f12));
            canvas.drawPath(path, T02);
            T02.setAlpha(alpha2);
        }
        canvas.restore();
        float f21 = f20 + f17;
        float f22 = f21 + f15;
        this.p.set(f21 - AndroidUtilities.dp(4.0f), f11 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, AndroidUtilities.dp(32.0f) + f11);
        if (z10) {
            k5 k5Var = this.h;
            if (k5Var != null) {
                k5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f21), (int) (AndroidUtilities.dp(6.5f) + f11), (int) (AndroidUtilities.dp(22.66f) + f21), (int) (AndroidUtilities.dp(26.5f) + f11));
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
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ic, b6Var);
            this.e.c(f21 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f11, f13, v02, canvas);
            canvas.save();
            canvas.translate(f22 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f11);
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.75f * f13, v02);
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
    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        int action;
        Runnable runnable;
        if (this.e != null) {
            if (this.p.contains(motionEvent.getX(), motionEvent.getY() - (z10 ? this.b.getPaddingTop() : 0))) {
                z11 = true;
                action = motionEvent.getAction();
                pc pcVar = this.q;
                if (action != 0) {
                    pcVar.c(z11);
                } else if (motionEvent.getAction() == 2) {
                    if (pcVar.h && !z11) {
                        pcVar.c(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (pcVar.h && (runnable = this.r) != null) {
                        runnable.run();
                    }
                    pcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    pcVar.c(false);
                }
                return pcVar.h;
            }
        }
        z11 = false;
        action = motionEvent.getAction();
        pc pcVar2 = this.q;
        if (action != 0) {
        }
        return pcVar2.h;
    }

    public final void e(org.telegram.ui.Cells.b1 b1Var) {
        this.r = b1Var;
    }

    public final boolean f(MessageObject messageObject) {
        k5 k5Var = this.h;
        View view = this.b;
        if (k5Var != null) {
            k5Var.o(view);
            this.h = null;
        }
        this.k = 0;
        this.s = 0L;
        if (messageObject == null) {
            this.e = null;
            this.s = 0L;
        } else {
            int i9 = this.a;
            boolean isMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i9).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.g;
            if (isMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(monoForumTopicId);
                this.s = monoForumTopicId;
                if (userOrChat == null) {
                    this.e = null;
                    return false;
                }
                z8 z8Var = this.f;
                z8Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, z8Var);
                this.e = new nz0(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.s = topicId;
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i9).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.e = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(vf.c.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, this.c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new k5(0, i9, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(vf.c.e(findTopic));
                }
                this.e = new nz0(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        return this.e != null;
    }
}
