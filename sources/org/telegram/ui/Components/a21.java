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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a21 {
    public final int a;
    public final View b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final boolean d;
    public f01 e;
    public final ImageReceiver g;
    public q5 h;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public final Paint n;
    public final Path o;
    public final RectF p;
    public final zc q;
    public Runnable r;
    public long s;
    public final i9 f = new i9((org.telegram.ui.ActionBar.f6) null);
    public final Path i = new Path();

    public a21(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.n = paint;
        Path path = new Path();
        this.o = path;
        this.p = new RectF();
        this.a = i10;
        this.b = view;
        this.c = f6Var;
        this.d = z10;
        this.q = new zc(view);
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
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.a(this.b);
        }
    }

    public final void b() {
        this.g.onDetachedFromWindow();
        q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.o(this.b);
        }
    }

    public final void c(Canvas canvas, int i10, float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        f01 f01Var = this.e;
        if (f01Var == null) {
            return;
        }
        f01Var.p = i10 - AndroidUtilities.dp(144.66f);
        float l4 = this.e.l() + AndroidUtilities.dp(48.66f);
        float f15 = i10;
        float f16 = (f15 - l4) / 2.0f;
        int i11 = this.k;
        int i12 = (int) l4;
        boolean z11 = this.d;
        Path path = this.i;
        if (i11 == i12 && this.j == i10 && this.m == z10 && this.l == z11) {
            f14 = l4;
            f13 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            f13 = 2.0f;
            rectF.set(f16, AndroidUtilities.dp(4.5f), f16 + l4, AndroidUtilities.dp(28.5f));
            if (z10) {
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (z11) {
                float f17 = f15 / 2.0f;
                float dp = f17 - AndroidUtilities.dp(1.833f);
                while (dp > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), dp, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    dp -= AndroidUtilities.dp(8.33f);
                    f15 = f15;
                    l4 = l4;
                }
                float f18 = f15;
                f14 = l4;
                int dp2 = AndroidUtilities.dp(1.833f);
                while (true) {
                    f17 += dp2;
                    if (f17 >= f18) {
                        break;
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f17, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f17, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    dp2 = AndroidUtilities.dp(8.33f);
                }
            } else {
                f14 = l4;
            }
            this.k = i12;
            this.j = i10;
            this.l = z11;
            this.m = z10;
        }
        canvas.save();
        float f19 = f7 / f13;
        canvas.translate(f19, f10);
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var);
        int alpha = T0.getAlpha();
        T0.setAlpha((int) (alpha * f12 * f11));
        canvas.drawPath(path, T0);
        T0.setAlpha(alpha);
        if (f6Var != null ? f6Var.o0() : org.telegram.ui.ActionBar.j6.a1()) {
            Paint T02 = org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", f6Var);
            int alpha2 = T02.getAlpha();
            T02.setAlpha((int) (alpha2 * f12 * f11));
            canvas.drawPath(path, T02);
            T02.setAlpha(alpha2);
        }
        canvas.restore();
        float f20 = f19 + f16;
        float f21 = f20 + f14;
        this.p.set(f20 - AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, AndroidUtilities.dp(32.0f) + f10);
        if (z10) {
            q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.setBounds((int) (AndroidUtilities.dp(2.66f) + f20), (int) (AndroidUtilities.dp(6.5f) + f10), (int) (AndroidUtilities.dp(22.66f) + f20), (int) (AndroidUtilities.dp(26.5f) + f10));
                this.h.setAlpha((int) (255.0f * f12));
                this.h.draw(canvas);
            } else {
                float dp3 = AndroidUtilities.dp(20.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                ImageReceiver imageReceiver = this.g;
                imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f20, AndroidUtilities.dp(6.5f) + f10, dp3, dp4);
                imageReceiver.setAlpha(f12);
                imageReceiver.draw(canvas);
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, f6Var);
            this.e.c(f20 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f10, f12, v02, canvas);
            canvas.save();
            canvas.translate(f21 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f10);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.75f * f12, v02);
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
                zc zcVar = this.q;
                if (action != 0) {
                    zcVar.c(z11);
                } else if (motionEvent.getAction() == 2) {
                    if (zcVar.h && !z11) {
                        zcVar.c(false);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (zcVar.h && (runnable = this.r) != null) {
                        runnable.run();
                    }
                    zcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    zcVar.c(false);
                }
                return zcVar.h;
            }
        }
        z11 = false;
        action = motionEvent.getAction();
        zc zcVar2 = this.q;
        if (action != 0) {
        }
        return zcVar2.h;
    }

    public final void e(org.telegram.ui.Cells.b1 b1Var) {
        this.r = b1Var;
    }

    public final boolean f(MessageObject messageObject) {
        q5 q5Var = this.h;
        View view = this.b;
        if (q5Var != null) {
            q5Var.o(view);
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
                i9 i9Var = this.f;
                i9Var.p(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, i9Var);
                this.e = new f01(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
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
                    imageReceiver.setImageBitmap(og.d.c(view.getContext(), 0.75f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, this.c), false));
                } else if (findTopic.icon_emoji_id != 0) {
                    this.h = new q5(0, i10, findTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(og.d.e(findTopic));
                }
                this.e = new f01(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        return this.e != null;
    }
}
