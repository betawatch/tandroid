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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class f7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.c6 E;
    public boolean F;
    public final org.telegram.ui.Components.c6 G;
    public long H;
    public rg.z0 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public g01 M;
    public final org.telegram.ui.Components.u9 a;
    public final ai.p4 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final np d;
    public final d7 e;
    public e7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.e6 y;

    public f7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        qr qrVar = qr.h;
        this.E = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
        this.K = new Paint();
        this.y = e6Var;
        this.e = new d7(this, e6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(u9Var, w7.x5.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(u9Var, w7.x5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        ai.p4 p4Var = new ai.p4(context, 7);
        this.b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(this.F ? org.telegram.ui.ActionBar.i6.C6 : org.telegram.ui.ActionBar.i6.j5, e6Var));
        p4Var.setTextSize(1, 12.0f);
        p4Var.setMaxLines(2);
        p4Var.setGravity(49);
        p4Var.setLines(2);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p4Var, w7.x5.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(j5Var, w7.x5.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        np npVar = new np(context, 21, e6Var);
        this.d = npVar;
        npVar.b(org.telegram.ui.ActionBar.i6.B5, org.telegram.ui.ActionBar.i6.h5, org.telegram.ui.ActionBar.i6.C5);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(4);
        npVar.setProgressDelegate(new ma(this, 5));
        addView(npVar, w7.x5.d(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, e6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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

    public final void c(long j3, boolean z10, CharSequence charSequence) {
        d7 d7Var = this.e;
        d7Var.p = 1.0f;
        org.telegram.ui.ActionBar.e6 e6Var = this.y;
        org.telegram.ui.Components.u9 u9Var = this.a;
        ai.p4 p4Var = this.b;
        if (j3 == Long.MAX_VALUE) {
            p4Var.setText(a());
            if (this.f == null) {
                this.f = new e7(getContext(), u9Var, true, e6Var);
            }
            u9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j3);
            org.telegram.ui.Components.c6 c6Var = this.G;
            org.telegram.ui.Components.c6 c6Var2 = this.E;
            int i10 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j3);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(this.F ? org.telegram.ui.ActionBar.i6.C6 : org.telegram.ui.ActionBar.i6.j5, e6Var));
                c6Var2.a(this.F);
                c6Var.a(this.H > 0);
                invalidate();
                d7Var.m(i10, this.h);
                int i11 = this.n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    p4Var.setText(LocaleController.getString(R.string.RepliesTitle));
                    d7Var.g(12);
                    u9Var.h(null, null, d7Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        p4Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            p4Var.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            p4Var.setText("");
                        }
                    }
                    u9Var.e(this.h, d7Var);
                } else {
                    p4Var.setText(LocaleController.getString(R.string.SavedMessages));
                    d7Var.g(1);
                    u9Var.h(null, null, d7Var, this.h);
                }
                u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                c6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
                c6Var.getClass();
                c6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (charSequence != null) {
                    p4Var.setText(charSequence);
                } else if (chat == null) {
                    p4Var.setText("");
                } else if (chat.monoforum) {
                    p4Var.setText(ng.d.i(chat, i10, false));
                } else {
                    p4Var.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    ng.d.o(i10, chat, d7Var, u9Var);
                } else {
                    d7Var.k(i10, chat);
                    u9Var.e(chat, d7Var);
                }
                u9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
            }
        }
        this.v = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12 = this.w;
        boolean z13 = tL_forumTopic != null;
        if (z12 == z13 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        o1.k kVar = (o1.k) j5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z13) {
            if (z10) {
                j5Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                j5Var.l(ng.d.j(tL_forumTopic, j5Var.getTextPaint(), null), false);
            }
            j5Var.requestLayout();
        }
        if (z11) {
            o1.k kVar2 = new o1.k(new o1.j(z13 ? 0.0f : 1000.0f));
            o1.l lVar = new o1.l(z13 ? 1000.0f : 0.0f);
            lVar.b(1500.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            kVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.b7
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    float f11 = f7 / 1000.0f;
                    f7 f7Var = f7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = f7Var.c;
                    j5Var2.setAlpha(f11);
                    ai.p4 p4Var = f7Var.b;
                    float f12 = 1.0f - f11;
                    p4Var.setAlpha(f12);
                    j5Var2.setTranslationX(f12 * (-AndroidUtilities.dp(10.0f)));
                    p4Var.setTranslationX(f11 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.c7
                @Override // o1.f
                public final void a(o1.h hVar, boolean z14, float f7, float f10) {
                    f7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            j5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            ai.p4 p4Var = this.b;
            if (z13) {
                j5Var.setAlpha(1.0f);
                p4Var.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                p4Var.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                p4Var.setAlpha(1.0f);
                j5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                p4Var.setTranslationX(0.0f);
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
            this.b.setTextColor(org.telegram.ui.ActionBar.i6.v0(isPremiumBlocked ? org.telegram.ui.ActionBar.i6.C6 : org.telegram.ui.ActionBar.i6.j5, this.y));
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r14 > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        float f10;
        boolean z10;
        g01 g01Var;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.u9 u9Var = this.a;
        if (view == u9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.s;
            long j11 = j10 <= 17 ? j10 : 17L;
            this.s = elapsedRealtime;
            float e = this.G.e(this.H > 0);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.y;
            if (e > 0.0f) {
                float measuredWidth = (u9Var.getMeasuredWidth() / 2.0f) + u9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((u9Var.getMeasuredHeight() / 2.0f) + u9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.M != null) {
                    long j12 = this.L;
                    f10 = 5.0f;
                    long j13 = this.H;
                    if (j12 != j13) {
                    }
                    g01 g01Var2 = this.M;
                    float dp = (g01Var2 != null ? 0.0f : g01Var2.c) + AndroidUtilities.dp(10.0f);
                    float dp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp / 2.0f;
                    float f12 = measuredWidth - f11;
                    float f13 = dp2 / 2.0f;
                    rectF.set(f12, measuredHeight - f13, measuredWidth + f11, f13 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var2);
                    Paint paint = this.K;
                    paint.setColor(v02);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B5, e6Var2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    g01Var = this.M;
                    if (g01Var == null) {
                        e6Var = e6Var2;
                        f7 = 0.0f;
                        g01Var.c(f12 + AndroidUtilities.dp(f10), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        e6Var = e6Var2;
                        f7 = 0.0f;
                    }
                } else {
                    f10 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j14 = this.H;
                this.L = j14;
                sb2.append(AndroidUtilities.formatWholeNumber((int) j14, 0));
                this.M = new g01(yh.x7.R0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                g01 g01Var22 = this.M;
                float dp3 = (g01Var22 != null ? 0.0f : g01Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f112 = dp3 / 2.0f;
                float f122 = measuredWidth - f112;
                float f132 = dp22 / 2.0f;
                rectF2.set(f122, measuredHeight - f132, measuredWidth + f112, f132 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int v022 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var2);
                Paint paint2 = this.K;
                paint2.setColor(v022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B5, e6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                g01Var = this.M;
                if (g01Var == null) {
                }
            } else {
                e6Var = e6Var2;
                f7 = 0.0f;
                f10 = 5.0f;
            }
            float e7 = this.E.e(this.F);
            if (e7 > f7) {
                int bottom = u9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = u9Var.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, e6Var));
                float f14 = right;
                float f15 = bottom;
                canvas.drawCircle(f14, f15, AndroidUtilities.dp(12.0f) * e7, org.telegram.ui.ActionBar.i6.t0);
                if (this.I == null) {
                    this.I = new rg.z0(org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, -1, -1, this.y);
                }
                this.I.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f14, f15, AndroidUtilities.dp(10.0f) * e7, this.I.f);
                if (this.J == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.J = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds((int) (f14 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e7)), (int) (f15 - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * e7)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * e7) + f14), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * e7) + f15));
                this.J.setAlpha((int) (255.0f * e7));
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
                            int bottom2 = u9Var.getBottom() - AndroidUtilities.dp(6.0f);
                            int right2 = u9Var.getRight() - AndroidUtilities.dp(10.0f);
                            org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, e6Var));
                            float f16 = right2;
                            float f17 = bottom2;
                            float f18 = 1.0f - e7;
                            float f19 = 1.0f - e;
                            canvas.drawCircle(f16, f17, AndroidUtilities.dp(7.0f) * this.r * f18 * f19, org.telegram.ui.ActionBar.i6.t0);
                            org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.T8, e6Var));
                            canvas.drawCircle(f16, f17, com.google.android.gms.internal.vision.e2.C(AndroidUtilities.dp(f10), this.r, f18, f19), org.telegram.ui.ActionBar.i6.t0);
                            if (z10) {
                                float f20 = this.r;
                                if (f20 > f7) {
                                    float f21 = f20 - (j11 / 150.0f);
                                    this.r = f21;
                                    if (f21 < f7) {
                                        this.r = f7;
                                    }
                                    u9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f22 = this.r;
                                if (f22 < 1.0f) {
                                    float f23 = (j11 / 150.0f) + f22;
                                    this.r = f23;
                                    if (f23 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    u9Var.invalidate();
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
            int bottom22 = u9Var.getBottom() - AndroidUtilities.dp(6.0f);
            int right22 = u9Var.getRight() - AndroidUtilities.dp(10.0f);
            org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, e6Var));
            float f162 = right22;
            float f172 = bottom22;
            float f182 = 1.0f - e7;
            float f192 = 1.0f - e;
            canvas.drawCircle(f162, f172, AndroidUtilities.dp(7.0f) * this.r * f182 * f192, org.telegram.ui.ActionBar.i6.t0);
            org.telegram.ui.ActionBar.i6.t0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.T8, e6Var));
            canvas.drawCircle(f162, f172, com.google.android.gms.internal.vision.e2.C(AndroidUtilities.dp(f10), this.r, f182, f192), org.telegram.ui.ActionBar.i6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.u9 getImageView() {
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
        org.telegram.ui.Components.u9 u9Var = this.a;
        int measuredWidth = (u9Var.getMeasuredWidth() / 2) + u9Var.getLeft();
        int measuredHeight = (u9Var.getMeasuredHeight() / 2) + u9Var.getTop();
        org.telegram.ui.ActionBar.i6.o0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B5, this.y));
        org.telegram.ui.ActionBar.i6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, u9Var.getRoundRadius()[0], u9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.i6.o0);
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
