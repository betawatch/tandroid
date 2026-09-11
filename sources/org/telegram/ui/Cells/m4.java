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
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class m4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.e6 F;
    public long G;
    public int H;
    public sg.c1 I;
    public Drawable J;
    public final org.telegram.ui.Components.x9 a;
    public final bi.c4 b;
    public final org.telegram.ui.Components.i9 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final vq s;
    public final mp v;
    public final boolean w;
    public boolean x;
    public final org.telegram.ui.Components.e6 y;

    public m4(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        pr prVar = pr.h;
        this.y = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.F = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.H = org.telegram.ui.ActionBar.j6.d6;
        this.w = z10;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(x9Var, w7.x5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        bi.c4 c4Var = new bi.c4(context, 5);
        this.b = c4Var;
        NotificationCenter.listenEmojiLoading(c4Var);
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        c4Var.setTextSize(1, 12.0f);
        c4Var.setMaxLines(1);
        c4Var.setGravity(49);
        c4Var.setLines(1);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(c4Var, w7.x5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        vq vqVar = new vq(context, f6Var);
        this.s = vqVar;
        addView(vqVar, w7.x5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.W8;
        int i11 = org.telegram.ui.ActionBar.j6.U8;
        uq uqVar = vqVar.a;
        uqVar.v = i10;
        uqVar.w = i11;
        vqVar.setGravity(5);
        if (z10) {
            mp mpVar = new mp(context, 21, f6Var);
            this.v = mpVar;
            mpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.h5, org.telegram.ui.ActionBar.j6.C5);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(4);
            mpVar.setProgressDelegate(new la(this, 4));
            addView(mpVar, w7.x5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            mpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f != j3) {
            this.r = false;
            invalidate();
        }
        this.f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.x9 x9Var = this.a;
        org.telegram.ui.Components.i9 i9Var = this.c;
        int i10 = this.h;
        bi.c4 c4Var = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e = user;
            if (str != null) {
                c4Var.setText(str);
            } else if (user != null) {
                c4Var.setText(UserObject.getFirstName(user));
            } else {
                c4Var.setText("");
            }
            i9Var.m(i10, this.e);
            x9Var.e(this.e, i9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                c4Var.setText(str);
            } else if (chat != null) {
                c4Var.setText(chat.title);
            } else {
                c4Var.setText("");
            }
            i9Var.k(i10, chat);
            this.e = null;
            x9Var.e(chat, i9Var);
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
        vq vqVar = this.s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            vqVar.a.c(0, this.r);
        } else if (this.d != i11) {
            this.d = i11;
            vqVar.a.c(i11, this.r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact isUserContactBlocked = (!this.x || this.e == null) ? null : MessagesController.getInstance(this.h).isUserContactBlocked(this.e.id);
        if (this.E == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.G == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.G = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z10) {
            this.y.f(this.E, true);
            this.F.f(this.G > 0, true);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        float e7;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.a) {
            if (!this.E && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i10 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.e.id))) {
                    z10 = true;
                    if (!this.r) {
                        this.n = z10 ? 1.0f : 0.0f;
                    }
                    if (z10) {
                        float f7 = this.n;
                        if (f7 != 1.0f) {
                            float f10 = f7 + 0.10666667f;
                            this.n = f10;
                            if (f10 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            e7 = this.y.e(this.E);
                            if (e7 > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, this.H, false));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e7, org.telegram.ui.ActionBar.j6.t0);
                                if (this.I == null) {
                                    this.I = new sg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, null);
                                }
                                this.I.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e7, this.I.f);
                                if (this.J == null) {
                                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                    this.J = mutate;
                                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                this.J.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * e7)), (int) (height - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * e7)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * e7) + width), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * e7) + height));
                                this.J.setAlpha((int) (e7 * 255.0f));
                                this.J.draw(canvas);
                                canvas.restore();
                            } else if (this.n != 0.0f) {
                                int dp = AndroidUtilities.dp(53.0f);
                                int dp2 = AndroidUtilities.dp(59.0f);
                                canvas.save();
                                float f11 = this.n;
                                float f12 = dp2;
                                float f13 = dp;
                                canvas.scale(f11, f11, f12, f13);
                                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, this.H, false));
                                canvas.drawCircle(f12, f13, AndroidUtilities.dp(7.0f), org.telegram.ui.ActionBar.j6.t0);
                                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T8, false));
                                canvas.drawCircle(f12, f13, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.j6.t0);
                                canvas.restore();
                            }
                            this.r = true;
                        }
                    }
                    if (!z10) {
                        float f14 = this.n;
                        if (f14 != 0.0f) {
                            float f15 = f14 - 0.10666667f;
                            this.n = f15;
                            if (f15 < 0.0f) {
                                this.n = 0.0f;
                            }
                            invalidate();
                        }
                    }
                    e7 = this.y.e(this.E);
                    if (e7 > 0.0f) {
                    }
                    this.r = true;
                }
            }
            z10 = false;
            if (!this.r) {
            }
            if (z10) {
            }
            if (!z10) {
            }
            e7 = this.y.e(this.E);
            if (e7 > 0.0f) {
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
            org.telegram.ui.Components.x9 x9Var = this.a;
            int measuredWidth = (x9Var.getMeasuredWidth() / 2) + x9Var.getLeft();
            int measuredHeight = (x9Var.getMeasuredHeight() / 2) + x9Var.getTop();
            org.telegram.ui.ActionBar.j6.o0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
            org.telegram.ui.ActionBar.j6.o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
        this.s.a.E = AndroidUtilities.dp(13.0f);
    }
}
