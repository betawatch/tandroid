package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import bi.dd;
import bi.md;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class k7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.h6 E;
    public boolean F;
    public final org.telegram.ui.Components.h6 G;
    public long H;
    public tg.a1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public q11 M;
    public final org.telegram.ui.Components.y9 a;
    public final md b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final zp d;
    public final i7 e;
    public j7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.u6 y;

    public k7(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        ds dsVar = ds.h;
        this.E = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.G = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.K = new Paint();
        this.y = u6Var;
        this.e = new i7(this, u6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(y9Var, gb1.h(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(y9Var, gb1.h(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        md mdVar = new md(context, 8);
        this.b = mdVar;
        NotificationCenter.listenEmojiLoading(mdVar);
        org.telegram.ui.ActionBar.f7.V(mdVar, this.F ? org.telegram.ui.ActionBar.y6.C6 : org.telegram.ui.ActionBar.y6.j5, u6Var);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setMaxLines(2);
        mdVar.setGravity(49);
        mdVar.setLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(mdVar, gb1.h(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.c = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.j5, u6Var);
        b6Var.setTextSize(12);
        b6Var.setMaxLines(2);
        b6Var.setGravity(49);
        b6Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(b6Var, gb1.h(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        zp zpVar = new zp(context, 21, u6Var);
        this.d = zpVar;
        zpVar.b(org.telegram.ui.ActionBar.y6.B5, org.telegram.ui.ActionBar.y6.h5, org.telegram.ui.ActionBar.y6.C5);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(4);
        zpVar.setProgressDelegate(new na(this, 5));
        addView(zpVar, gb1.h(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.y6.i6;
        Drawable Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, u6Var);
    }

    public String a() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (z10) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        i7 i7Var = this.e;
        i7Var.p = 1.0f;
        org.telegram.ui.ActionBar.u6 u6Var = this.y;
        org.telegram.ui.Components.y9 y9Var = this.a;
        md mdVar = this.b;
        if (j10 == Long.MAX_VALUE) {
            mdVar.setText(a());
            if (this.f == null) {
                this.f = new j7(getContext(), y9Var, true, u6Var);
            }
            y9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.h6 h6Var = this.G;
            org.telegram.ui.Components.h6 h6Var2 = this.E;
            int i10 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j10);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                org.telegram.ui.ActionBar.f7.V(mdVar, this.F ? org.telegram.ui.ActionBar.y6.C6 : org.telegram.ui.ActionBar.y6.j5, u6Var);
                h6Var2.a(this.F);
                h6Var.a(this.H > 0);
                invalidate();
                i7Var.m(i10, this.h);
                int i11 = this.n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    mdVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    i7Var.g(12);
                    y9Var.h(null, null, i7Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        mdVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            mdVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            mdVar.setText("");
                        }
                    }
                    y9Var.f(this.h, i7Var);
                } else {
                    mdVar.setText(LocaleController.getString(R.string.SavedMessages));
                    i7Var.g(1);
                    y9Var.h(null, null, i7Var, this.h);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                h6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
                h6Var.getClass();
                h6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    mdVar.setText(charSequence);
                } else if (chat == null) {
                    mdVar.setText("");
                } else if (chat.monoforum) {
                    mdVar.setText(pg.d.i(chat, i10, false));
                } else {
                    mdVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    pg.d.o(i10, chat, i7Var, y9Var);
                } else {
                    i7Var.k(i10, chat);
                    y9Var.f(chat, i7Var);
                }
                y9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12 = this.w;
        boolean z13 = tL_forumTopic != null;
        if (z12 == z13 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        o1.j jVar = (o1.j) b6Var.getTag(i10);
        if (jVar != null) {
            jVar.c();
        }
        if (z13) {
            if (z10) {
                b6Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                b6Var.l(pg.d.j(tL_forumTopic, b6Var.getTextPaint(), null), false);
            }
            b6Var.requestLayout();
        }
        if (z11) {
            o1.j jVar2 = new o1.j(new ac.a(z13 ? 0.0f : 1000.0f));
            o1.k kVar = new o1.k(z13 ? 1000.0f : 0.0f);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            jVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.g7
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    float f11 = f7 / 1000.0f;
                    k7 k7Var = k7.this;
                    org.telegram.ui.ActionBar.b6 b6Var2 = k7Var.c;
                    b6Var2.setAlpha(f11);
                    md mdVar = k7Var.b;
                    float f12 = 1.0f - f11;
                    mdVar.setAlpha(f12);
                    b6Var2.setTranslationX(f12 * (-AndroidUtilities.dp(10.0f)));
                    mdVar.setTranslationX(f11 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.h7
                @Override // o1.f
                public final void a(o1.h hVar, boolean z14, float f7, float f10) {
                    k7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            b6Var.setTag(R.id.spring_tag, jVar2);
            jVar2.h();
        } else {
            md mdVar = this.b;
            if (z13) {
                b6Var.setAlpha(1.0f);
                mdVar.setAlpha(0.0f);
                b6Var.setTranslationX(0.0f);
                mdVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                b6Var.setAlpha(0.0f);
                mdVar.setAlpha(1.0f);
                b6Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                mdVar.setTranslationX(0.0f);
            }
        }
        this.w = z13;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i12 = this.x;
            TL_account.RequirementToContact isUserContactBlocked = user != null ? MessagesController.getInstance(i12).isUserContactBlocked(this.h.id) : null;
            long sendPaidMessagesStars = this.v < 0 ? MessagesController.getInstance(i12).getSendPaidMessagesStars(this.v) : DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            if (this.F == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.H == sendPaidMessagesStars) {
                return;
            }
            boolean isPremiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.F = isPremiumBlocked;
            this.H = sendPaidMessagesStars;
            org.telegram.ui.ActionBar.f7.V(this.b, isPremiumBlocked ? org.telegram.ui.ActionBar.y6.C6 : org.telegram.ui.ActionBar.y6.j5, this.y);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.u6 u6Var;
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        q11 q11Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.y9 y9Var = this.a;
        if (view == y9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float e = this.G.e(this.H > 0);
            org.telegram.ui.ActionBar.u6 u6Var2 = this.y;
            if (e > 0.0f) {
                float measuredWidth = (y9Var.getMeasuredWidth() / 2.0f) + y9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((y9Var.getMeasuredHeight() / 2.0f) + y9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.M != null) {
                    f7 = 0.0f;
                    f11 = 5.0f;
                    long j13 = this.L;
                    f12 = measuredWidth;
                    long j14 = this.H;
                    if (j13 == j14 || j14 <= 0) {
                        q11 q11Var2 = this.M;
                        float dp = (q11Var2 != null ? f7 : q11Var2.c) + AndroidUtilities.dp(10.0f);
                        float dp2 = AndroidUtilities.dp(14.33f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f13 = dp / 2.0f;
                        float f14 = f12 - f13;
                        float f15 = dp2 / 2.0f;
                        rectF.set(f14, measuredHeight - f15, f12 + f13, f15 + measuredHeight);
                        rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, u6Var2);
                        Paint paint = this.K;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B5, u6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        q11Var = this.M;
                        if (q11Var == null) {
                            float dp3 = AndroidUtilities.dp(f11) + f14;
                            u6Var = u6Var2;
                            f10 = 9.33f;
                            q11Var.c(dp3, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            u6Var = u6Var2;
                            f10 = 9.33f;
                        }
                    }
                } else {
                    f12 = measuredWidth;
                    f7 = 0.0f;
                    f11 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j15 = this.H;
                this.L = j15;
                sb2.append(AndroidUtilities.formatWholeNumber((int) j15, 0));
                this.M = new q11(dd.Q0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                q11 q11Var22 = this.M;
                float dp4 = (q11Var22 != null ? f7 : q11Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f132 = dp4 / 2.0f;
                float f142 = f12 - f132;
                float f152 = dp22 / 2.0f;
                rectF2.set(f142, measuredHeight - f152, f12 + f132, f152 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int w022 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, u6Var2);
                Paint paint2 = this.K;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B5, u6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                q11Var = this.M;
                if (q11Var == null) {
                }
            } else {
                u6Var = u6Var2;
                f7 = 0.0f;
                f10 = 9.33f;
                f11 = 5.0f;
            }
            float e10 = this.E.e(this.F);
            if (e10 > f7) {
                int bottom = y9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = y9Var.getRight() - AndroidUtilities.dp(f10);
                canvas.save();
                org.telegram.ui.ActionBar.y6.t0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
                float f16 = right;
                float f17 = bottom;
                canvas.drawCircle(f16, f17, AndroidUtilities.dp(12.0f) * e10, org.telegram.ui.ActionBar.y6.t0);
                if (this.I == null) {
                    this.I = new tg.a1(org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, -1, -1, this.y);
                }
                this.I.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f16, f17, AndroidUtilities.dp(10.0f) * e10, this.I.f);
                if (this.J == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.J = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds((int) (f16 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e10)), (int) (f17 - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * e10)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * e10) + f16), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * e10) + f17));
                this.J.setAlpha((int) (255.0f * e10));
                this.J.draw(canvas);
                canvas.restore();
            }
            if (!this.F) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i10 = this.x;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f7) {
                            int bottom2 = y9Var.getBottom() - AndroidUtilities.dp(6.0f);
                            int right2 = y9Var.getRight() - AndroidUtilities.dp(10.0f);
                            org.telegram.ui.ActionBar.y6.t0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
                            float f18 = right2;
                            float f19 = bottom2;
                            float f20 = 1.0f - e10;
                            float f21 = 1.0f - e;
                            canvas.drawCircle(f18, f19, AndroidUtilities.dp(7.0f) * this.r * f20 * f21, org.telegram.ui.ActionBar.y6.t0);
                            org.telegram.ui.ActionBar.y6.t0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.T8, u6Var));
                            canvas.drawCircle(f18, f19, c3.h0.E(AndroidUtilities.dp(f11), this.r, f20, f21), org.telegram.ui.ActionBar.y6.t0);
                            if (z10) {
                                float f22 = this.r;
                                if (f22 > f7) {
                                    float f23 = f22 - (j12 / 150.0f);
                                    this.r = f23;
                                    if (f23 < f7) {
                                        this.r = f7;
                                    }
                                    y9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f24 = this.r;
                                if (f24 < 1.0f) {
                                    float f25 = (j12 / 150.0f) + f24;
                                    this.r = f25;
                                    if (f25 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    y9Var.invalidate();
                                    invalidate();
                                    return drawChild;
                                }
                            }
                        }
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
            int bottom22 = y9Var.getBottom() - AndroidUtilities.dp(6.0f);
            int right22 = y9Var.getRight() - AndroidUtilities.dp(10.0f);
            org.telegram.ui.ActionBar.y6.t0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
            float f182 = right22;
            float f192 = bottom22;
            float f202 = 1.0f - e10;
            float f212 = 1.0f - e;
            canvas.drawCircle(f182, f192, AndroidUtilities.dp(7.0f) * this.r * f202 * f212, org.telegram.ui.ActionBar.y6.t0);
            org.telegram.ui.ActionBar.y6.t0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.T8, u6Var));
            canvas.drawCircle(f182, f192, c3.h0.E(AndroidUtilities.dp(f11), this.r, f202, f212), org.telegram.ui.ActionBar.y6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.y9 y9Var = this.a;
        int measuredWidth = (y9Var.getMeasuredWidth() / 2) + y9Var.getLeft();
        int measuredHeight = (y9Var.getMeasuredHeight() / 2) + y9Var.getTop();
        org.telegram.ui.ActionBar.y6.o0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B5, this.y));
        org.telegram.ui.ActionBar.y6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, y9Var.getRoundRadius()[0], y9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.y6.o0);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
