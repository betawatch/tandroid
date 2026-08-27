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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k4 extends FrameLayout {
    public boolean A;
    public final org.telegram.ui.Components.y5 B;
    public long C;
    public int D;
    public ag.i2 E;
    public Drawable F;
    public final org.telegram.ui.Components.n9 a;
    public final cg.q b;
    public final org.telegram.ui.Components.y8 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final kq s;
    public final bp v;
    public final boolean w;
    public boolean x;
    public final org.telegram.ui.Components.y5 y;

    public k4(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        er erVar = er.h;
        this.y = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.B = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.D = org.telegram.ui.ActionBar.g6.d6;
        this.w = z10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(n9Var, h7.z5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        cg.q qVar = new cg.q(context, 6);
        this.b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(1);
        qVar.setGravity(49);
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, h7.z5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        kq kqVar = new kq(context, c6Var);
        this.s = kqVar;
        addView(kqVar, h7.z5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.W8;
        int i11 = org.telegram.ui.ActionBar.g6.U8;
        jq jqVar = kqVar.a;
        jqVar.v = i10;
        jqVar.w = i11;
        kqVar.setGravity(5);
        if (z10) {
            bp bpVar = new bp(context, 21, c6Var);
            this.v = bpVar;
            bpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.h5, org.telegram.ui.ActionBar.g6.C5);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(4);
            bpVar.setProgressDelegate(new ea(this, 4));
            addView(bpVar, h7.z5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            bpVar.a(false, false);
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
        org.telegram.ui.Components.n9 n9Var = this.a;
        org.telegram.ui.Components.y8 y8Var = this.c;
        int i10 = this.h;
        cg.q qVar = this.b;
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
            y8Var.m(i10, this.e);
            n9Var.e(this.e, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                qVar.setText(str);
            } else if (chat != null) {
                qVar.setText(chat.title);
            } else {
                qVar.setText("");
            }
            y8Var.k(i10, chat);
            this.e = null;
            n9Var.e(chat, y8Var);
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
        kq kqVar = this.s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            kqVar.a.c(0, this.r);
        } else if (this.d != i11) {
            this.d = i11;
            kqVar.a.c(i11, this.r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact isUserContactBlocked = (!this.x || this.e == null) ? null : MessagesController.getInstance(this.h).isUserContactBlocked(this.e.id);
        if (this.A == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.C == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.A = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.C = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z10) {
            this.y.f(this.A, true);
            this.B.f(this.C > 0, true);
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
        boolean z10;
        float e9;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.a) {
            if (!this.A && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i10 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.e.id))) {
                    z10 = true;
                    if (!this.r) {
                        this.n = z10 ? 1.0f : 0.0f;
                    }
                    if (z10) {
                        float f10 = this.n;
                        if (f10 != 1.0f) {
                            float f11 = f10 + 0.10666667f;
                            this.n = f11;
                            if (f11 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            e9 = this.y.e(this.A);
                            if (e9 > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.D, false));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e9, org.telegram.ui.ActionBar.g6.t0);
                                if (this.E == null) {
                                    this.E = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, null);
                                }
                                this.E.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e9, this.E.f);
                                if (this.F == null) {
                                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                    this.F = mutate;
                                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                this.F.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * e9)), (int) (height - (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f) * e9)), (int) (((this.F.getIntrinsicWidth() / 2.0f) * 0.875f * e9) + width), (int) (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f * e9) + height));
                                this.F.setAlpha((int) (e9 * 255.0f));
                                this.F.draw(canvas);
                                canvas.restore();
                            } else if (this.n != 0.0f) {
                                int dp = AndroidUtilities.dp(53.0f);
                                int dp2 = AndroidUtilities.dp(59.0f);
                                canvas.save();
                                float f12 = this.n;
                                float f13 = dp2;
                                float f14 = dp;
                                canvas.scale(f12, f12, f13, f14);
                                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.D, false));
                                canvas.drawCircle(f13, f14, AndroidUtilities.dp(7.0f), org.telegram.ui.ActionBar.g6.t0);
                                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T8, false));
                                canvas.drawCircle(f13, f14, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.t0);
                                canvas.restore();
                            }
                            this.r = true;
                        }
                    }
                    if (!z10) {
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
                    e9 = this.y.e(this.A);
                    if (e9 > 0.0f) {
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
            e9 = this.y.e(this.A);
            if (e9 > 0.0f) {
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
            org.telegram.ui.Components.n9 n9Var = this.a;
            int measuredWidth = (n9Var.getMeasuredWidth() / 2) + n9Var.getLeft();
            int measuredHeight = (n9Var.getMeasuredHeight() / 2) + n9Var.getTop();
            org.telegram.ui.ActionBar.g6.o0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
            org.telegram.ui.ActionBar.g6.o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
        this.s.a.E = AndroidUtilities.dp(13.0f);
    }
}
