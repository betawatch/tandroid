package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n4 extends FrameLayout {
    public boolean B;
    public final org.telegram.ui.Components.z5 C;
    public long D;
    public int E;
    public fg.p1 F;
    public Drawable G;
    public final org.telegram.ui.Components.p9 a;
    public final hg.q b;
    public final org.telegram.ui.Components.z8 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final wq s;
    public final np v;
    public final boolean w;
    public boolean x;
    public final org.telegram.ui.Components.z5 y;

    public n4(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        pr prVar = pr.h;
        this.y = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.C = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.E = org.telegram.ui.ActionBar.k6.d6;
        this.w = z4;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(p9Var, k7.c6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        hg.q qVar = new hg.q(context, 4);
        this.b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(1);
        qVar.setGravity(49);
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, k7.c6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        wq wqVar = new wq(context, g6Var);
        this.s = wqVar;
        addView(wqVar, k7.c6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.W8;
        int i11 = org.telegram.ui.ActionBar.k6.U8;
        vq vqVar = wqVar.a;
        vqVar.v = i10;
        vqVar.w = i11;
        wqVar.setGravity(5);
        if (z4) {
            np npVar = new np(context, 21, g6Var);
            this.v = npVar;
            npVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.C5);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(4);
            npVar.setProgressDelegate(new ha(this, 4));
            addView(npVar, k7.c6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            npVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f != j10) {
            this.r = false;
            invalidate();
        }
        this.f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.p9 p9Var = this.a;
        org.telegram.ui.Components.z8 z8Var = this.c;
        int i10 = this.h;
        hg.q qVar = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e = user;
            if (str != null) {
                qVar.setText(str);
            } else if (user != null) {
                qVar.setText(UserObject.getFirstName(user));
            } else {
                qVar.setText("");
            }
            z8Var.m(i10, this.e);
            p9Var.e(this.e, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                qVar.setText(str);
            } else if (chat != null) {
                qVar.setText(chat.title);
            } else {
                qVar.setText("");
            }
            z8Var.k(i10, chat);
            this.e = null;
            p9Var.e(chat, z8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i10 != 0 && (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) == 0 && (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f);
        wq wqVar = this.s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            wqVar.a.c(0, this.r);
        } else if (this.d != i11) {
            this.d = i11;
            wqVar.a.c(i11, this.r);
        }
    }

    public final void c(boolean z4) {
        TL_account.RequirementToContact isUserContactBlocked = (!this.x || this.e == null) ? null : MessagesController.getInstance(this.h).isUserContactBlocked(this.e.id);
        if (this.B == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.D == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.B = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.D = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z4) {
            this.y.f(this.B, true);
            this.C.f(this.D > 0, true);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        float e6;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.a) {
            if (!this.B && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i10 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.e.id))) {
                    z4 = true;
                    if (!this.r) {
                        this.n = z4 ? 1.0f : 0.0f;
                    }
                    if (z4) {
                        float f10 = this.n;
                        if (f10 != 1.0f) {
                            float f11 = f10 + 0.10666667f;
                            this.n = f11;
                            if (f11 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            e6 = this.y.e(this.B);
                            if (e6 > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, this.E, false));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e6, org.telegram.ui.ActionBar.k6.t0);
                                if (this.F == null) {
                                    this.F = new fg.p1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, null);
                                }
                                this.F.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e6, this.F.f);
                                if (this.G == null) {
                                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                    this.G = mutate;
                                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                this.G.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * e6)), (int) (height - (((this.G.getIntrinsicHeight() / 2.0f) * 0.875f) * e6)), (int) (((this.G.getIntrinsicWidth() / 2.0f) * 0.875f * e6) + width), (int) (((this.G.getIntrinsicHeight() / 2.0f) * 0.875f * e6) + height));
                                this.G.setAlpha((int) (e6 * 255.0f));
                                this.G.draw(canvas);
                                canvas.restore();
                            } else if (this.n != 0.0f) {
                                int dp = AndroidUtilities.dp(53.0f);
                                int dp2 = AndroidUtilities.dp(59.0f);
                                canvas.save();
                                float f12 = this.n;
                                float f13 = dp2;
                                float f14 = dp;
                                canvas.scale(f12, f12, f13, f14);
                                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, this.E, false));
                                canvas.drawCircle(f13, f14, AndroidUtilities.dp(7.0f), org.telegram.ui.ActionBar.k6.t0);
                                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.T8, false));
                                canvas.drawCircle(f13, f14, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.k6.t0);
                                canvas.restore();
                            }
                            this.r = true;
                        }
                    }
                    if (!z4) {
                        float f15 = this.n;
                        if (f15 != 0.0f) {
                            float f16 = f15 - 0.10666667f;
                            this.n = f16;
                            if (f16 < 0.0f) {
                                this.n = 0.0f;
                            }
                            invalidate();
                        }
                    }
                    e6 = this.y.e(this.B);
                    if (e6 > 0.0f) {
                    }
                    this.r = true;
                }
            }
            z4 = false;
            if (!this.r) {
            }
            if (z4) {
            }
            if (!z4) {
            }
            e6 = this.y.e(this.B);
            if (e6 > 0.0f) {
            }
            this.r = true;
        }
        return drawChild;
    }

    public long getDialogId() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w) {
            org.telegram.ui.Components.p9 p9Var = this.a;
            int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
            int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
            org.telegram.ui.ActionBar.k6.o0.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B5, false));
            org.telegram.ui.ActionBar.k6.o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
        this.s.a.E = AndroidUtilities.dp(13.0f);
    }
}
