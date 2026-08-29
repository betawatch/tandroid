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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l4 extends FrameLayout {
    public boolean A;
    public final org.telegram.ui.Components.d6 B;
    public long C;
    public int D;
    public cg.r1 E;
    public Drawable F;
    public final org.telegram.ui.Components.t9 a;
    public final eg.r b;
    public final org.telegram.ui.Components.e9 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final qq s;
    public final hp v;
    public final boolean w;
    public boolean x;
    public final org.telegram.ui.Components.d6 y;

    public l4(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        jr jrVar = jr.h;
        this.y = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.B = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.D = org.telegram.ui.ActionBar.g6.d6;
        this.w = z10;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(t9Var, i7.f6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        eg.r rVar = new eg.r(context, 4);
        this.b = rVar;
        NotificationCenter.listenEmojiLoading(rVar);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        rVar.setTextSize(1, 12.0f);
        rVar.setMaxLines(1);
        rVar.setGravity(49);
        rVar.setLines(1);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(rVar, i7.f6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        qq qqVar = new qq(context, c6Var);
        this.s = qqVar;
        addView(qqVar, i7.f6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.W8;
        int i11 = org.telegram.ui.ActionBar.g6.U8;
        pq pqVar = qqVar.a;
        pqVar.v = i10;
        pqVar.w = i11;
        qqVar.setGravity(5);
        if (z10) {
            hp hpVar = new hp(context, 21, c6Var);
            this.v = hpVar;
            hpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.h5, org.telegram.ui.ActionBar.g6.C5);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(4);
            hpVar.setProgressDelegate(new fa(this, 4));
            addView(hpVar, i7.f6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            hpVar.a(false, false);
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
        org.telegram.ui.Components.t9 t9Var = this.a;
        org.telegram.ui.Components.e9 e9Var = this.c;
        int i10 = this.h;
        eg.r rVar = this.b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e = user;
            if (str != null) {
                rVar.setText(str);
            } else if (user != null) {
                rVar.setText(UserObject.getFirstName(user));
            } else {
                rVar.setText("");
            }
            e9Var.m(i10, this.e);
            t9Var.e(this.e, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                rVar.setText(str);
            } else if (chat != null) {
                rVar.setText(chat.title);
            } else {
                rVar.setText("");
            }
            e9Var.k(i10, chat);
            this.e = null;
            t9Var.e(chat, e9Var);
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
        qq qqVar = this.s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            qqVar.a.c(0, this.r);
        } else if (this.d != i11) {
            this.d = i11;
            qqVar.a.c(i11, this.r);
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
        float e10;
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
                        float f9 = this.n;
                        if (f9 != 1.0f) {
                            float f10 = f9 + 0.10666667f;
                            this.n = f10;
                            if (f10 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            e10 = this.y.e(this.A);
                            if (e10 > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.D, false));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * e10, org.telegram.ui.ActionBar.g6.t0);
                                if (this.E == null) {
                                    this.E = new cg.r1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, null);
                                }
                                this.E.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * e10, this.E.f);
                                if (this.F == null) {
                                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                    this.F = mutate;
                                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                this.F.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * e10)), (int) (height - (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f) * e10)), (int) (((this.F.getIntrinsicWidth() / 2.0f) * 0.875f * e10) + width), (int) (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f * e10) + height));
                                this.F.setAlpha((int) (e10 * 255.0f));
                                this.F.draw(canvas);
                                canvas.restore();
                            } else if (this.n != 0.0f) {
                                int dp = AndroidUtilities.dp(53.0f);
                                int dp2 = AndroidUtilities.dp(59.0f);
                                canvas.save();
                                float f11 = this.n;
                                float f12 = dp2;
                                float f13 = dp;
                                canvas.scale(f11, f11, f12, f13);
                                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.D, false));
                                canvas.drawCircle(f12, f13, AndroidUtilities.dp(7.0f), org.telegram.ui.ActionBar.g6.t0);
                                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T8, false));
                                canvas.drawCircle(f12, f13, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.t0);
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
                    e10 = this.y.e(this.A);
                    if (e10 > 0.0f) {
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
            e10 = this.y.e(this.A);
            if (e10 > 0.0f) {
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
            org.telegram.ui.Components.t9 t9Var = this.a;
            int measuredWidth = (t9Var.getMeasuredWidth() / 2) + t9Var.getLeft();
            int measuredHeight = (t9Var.getMeasuredHeight() / 2) + t9Var.getTop();
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
