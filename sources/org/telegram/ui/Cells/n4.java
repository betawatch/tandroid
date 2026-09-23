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
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.e6 F;
    public long G;
    public int H;
    public rg.z0 I;
    public Drawable J;
    public final org.telegram.ui.Components.w9 a;
    public final ai.p4 b;
    public final org.telegram.ui.Components.h9 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final xq s;
    public final op v;
    public final boolean w;
    public boolean x;
    public final org.telegram.ui.Components.e6 y;

    public n4(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        rr rrVar = rr.h;
        this.y = new org.telegram.ui.Components.e6(this, 0L, 350L, rrVar);
        this.F = new org.telegram.ui.Components.e6(this, 0L, 350L, rrVar);
        this.H = org.telegram.ui.ActionBar.h6.d6;
        this.w = z10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(w9Var, w7.x5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ai.p4 p4Var = new ai.p4(context, 5);
        this.b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        p4Var.setTextSize(1, 12.0f);
        p4Var.setMaxLines(1);
        p4Var.setGravity(49);
        p4Var.setLines(1);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p4Var, w7.x5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        xq xqVar = new xq(context, d6Var);
        this.s = xqVar;
        addView(xqVar, w7.x5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.W8;
        int i11 = org.telegram.ui.ActionBar.h6.U8;
        wq wqVar = xqVar.a;
        wqVar.v = i10;
        wqVar.w = i11;
        xqVar.setGravity(5);
        if (z10) {
            op opVar = new op(context, 21, d6Var);
            this.v = opVar;
            opVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.h5, org.telegram.ui.ActionBar.h6.C5);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(4);
            opVar.setProgressDelegate(new na(this, 4));
            addView(opVar, w7.x5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            opVar.a(false, false);
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
        org.telegram.ui.Components.w9 w9Var = this.a;
        org.telegram.ui.Components.h9 h9Var = this.c;
        int i10 = this.h;
        ai.p4 p4Var = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e = user;
            if (str != null) {
                p4Var.setText(str);
            } else if (user != null) {
                p4Var.setText(UserObject.getFirstName(user));
            } else {
                p4Var.setText("");
            }
            h9Var.m(i10, this.e);
            w9Var.e(this.e, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                p4Var.setText(str);
            } else if (chat != null) {
                p4Var.setText(chat.title);
            } else {
                p4Var.setText("");
            }
            h9Var.k(i10, chat);
            this.e = null;
            w9Var.e(chat, h9Var);
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
        xq xqVar = this.s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            xqVar.a.c(0, this.r);
        } else if (this.d != i11) {
            this.d = i11;
            xqVar.a.c(i11, this.r);
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
        float e;
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
                            e = this.y.e(this.E);
                            if (e > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(null, this.H, false));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e, org.telegram.ui.ActionBar.h6.t0);
                                if (this.I == null) {
                                    this.I = new rg.z0(org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, -1, -1, null);
                                }
                                this.I.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e, this.I.f);
                                if (this.J == null) {
                                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                    this.J = mutate;
                                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                this.J.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * e)), (int) (height - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * e)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * e) + width), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * e) + height));
                                this.J.setAlpha((int) (e * 255.0f));
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
                                org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(null, this.H, false));
                                canvas.drawCircle(f12, f13, AndroidUtilities.dp(7.0f), org.telegram.ui.ActionBar.h6.t0);
                                org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.T8, false));
                                canvas.drawCircle(f12, f13, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.t0);
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
                    e = this.y.e(this.E);
                    if (e > 0.0f) {
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
            e = this.y.e(this.E);
            if (e > 0.0f) {
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
            org.telegram.ui.Components.w9 w9Var = this.a;
            int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
            int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
            org.telegram.ui.ActionBar.h6.o0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
            org.telegram.ui.ActionBar.h6.o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
        this.s.a.E = AndroidUtilities.dp(13.0f);
    }
}
