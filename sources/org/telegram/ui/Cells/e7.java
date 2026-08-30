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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class e7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.z5 B;
    public boolean C;
    public final org.telegram.ui.Components.z5 D;
    public long E;
    public eg.q1 F;
    public Drawable G;
    public final Paint H;
    public long I;
    public k01 J;
    public final org.telegram.ui.Components.p9 a;
    public final gg.q b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final lp d;
    public final c7 e;
    public d7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.f6 y;

    public e7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        nr nrVar = nr.h;
        this.B = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.D = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.H = new Paint();
        this.y = f6Var;
        this.e = new c7(this, f6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(p9Var, k7.b6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(p9Var, k7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        gg.q qVar = new gg.q(context, 6);
        this.b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.C ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, f6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(2);
        qVar.setGravity(49);
        qVar.setLines(2);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, k7.b6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        k5Var.setTextSize(12);
        k5Var.setMaxLines(2);
        k5Var.setGravity(49);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(k5Var, k7.b6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        lp lpVar = new lp(context, 21, f6Var);
        this.d = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.h5, org.telegram.ui.ActionBar.j6.C5);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(4);
        lpVar.setProgressDelegate(new ha(this, 5));
        addView(lpVar, k7.b6.d(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public String a() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public final void b(boolean z4, boolean z10) {
        this.d.a(z4, z10);
        if (z4) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j10, boolean z4, CharSequence charSequence) {
        c7 c7Var = this.e;
        c7Var.p = 1.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        org.telegram.ui.Components.p9 p9Var = this.a;
        gg.q qVar = this.b;
        if (j10 == Long.MAX_VALUE) {
            qVar.setText(a());
            if (this.f == null) {
                this.f = new d7(getContext(), p9Var, true, f6Var);
            }
            p9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.z5 z5Var = this.D;
            org.telegram.ui.Components.z5 z5Var2 = this.B;
            int i10 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j10);
                this.C = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.E = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.C ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, f6Var));
                z5Var2.a(this.C);
                z5Var.a(this.E > 0);
                invalidate();
                c7Var.m(i10, this.h);
                int i11 = this.n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    qVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    c7Var.g(12);
                    p9Var.h(null, null, c7Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        qVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            qVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            qVar.setText("");
                        }
                    }
                    p9Var.e(this.h, c7Var);
                } else {
                    qVar.setText(LocaleController.getString(R.string.SavedMessages));
                    c7Var.g(1);
                    p9Var.h(null, null, c7Var, this.h);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.C = false;
                z5Var2.d(0.0f, true);
                this.E = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
                z5Var.getClass();
                z5Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    qVar.setText(charSequence);
                } else if (chat == null) {
                    qVar.setText("");
                } else if (chat.monoforum) {
                    qVar.setText(ag.f.i(chat, i10, false));
                } else {
                    qVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    ag.f.o(i10, chat, c7Var, p9Var);
                } else {
                    c7Var.k(i10, chat);
                    p9Var.e(chat, c7Var);
                }
                p9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
            }
        }
        this.v = j10;
        this.d.a(z4, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z4, boolean z10) {
        boolean z11 = this.w;
        boolean z12 = tL_forumTopic != null;
        if (z11 == z12 && z10) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        o1.j jVar = (o1.j) k5Var.getTag(i10);
        if (jVar != null) {
            jVar.c();
        }
        if (z12) {
            if (z4) {
                k5Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                k5Var.l(ag.f.j(tL_forumTopic, k5Var.getTextPaint(), null), false);
            }
            k5Var.requestLayout();
        }
        if (z10) {
            o1.j jVar2 = new o1.j(new kb.a(z12 ? 0.0f : 1000.0f));
            o1.k kVar = new o1.k(z12 ? 1000.0f : 0.0f);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            jVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.a7
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    e7 e7Var = e7.this;
                    org.telegram.ui.ActionBar.k5 k5Var2 = e7Var.c;
                    k5Var2.setAlpha(f12);
                    gg.q qVar = e7Var.b;
                    float f13 = 1.0f - f12;
                    qVar.setAlpha(f13);
                    k5Var2.setTranslationX(f13 * (-AndroidUtilities.dp(10.0f)));
                    qVar.setTranslationX(f12 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.b7
                @Override // o1.f
                public final void a(o1.h hVar, boolean z13, float f10, float f11) {
                    e7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            k5Var.setTag(R.id.spring_tag, jVar2);
            jVar2.f();
        } else {
            gg.q qVar = this.b;
            if (z12) {
                k5Var.setAlpha(1.0f);
                qVar.setAlpha(0.0f);
                k5Var.setTranslationX(0.0f);
                qVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                k5Var.setAlpha(0.0f);
                qVar.setAlpha(1.0f);
                k5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                qVar.setTranslationX(0.0f);
            }
        }
        this.w = z12;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i12 = this.x;
            TL_account.RequirementToContact isUserContactBlocked = user != null ? MessagesController.getInstance(i12).isUserContactBlocked(this.h.id) : null;
            long sendPaidMessagesStars = this.v < 0 ? MessagesController.getInstance(i12).getSendPaidMessagesStars(this.v) : DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            if (this.C == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.E == sendPaidMessagesStars) {
                return;
            }
            boolean isPremiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.C = isPremiumBlocked;
            this.E = sendPaidMessagesStars;
            this.b.setTextColor(org.telegram.ui.ActionBar.j6.v0(isPremiumBlocked ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, this.y));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        boolean z4;
        k01 k01Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.p9 p9Var = this.a;
        if (view == p9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float e = this.D.e(this.E > 0);
            org.telegram.ui.ActionBar.f6 f6Var2 = this.y;
            if (e > 0.0f) {
                float measuredWidth = (p9Var.getMeasuredWidth() / 2.0f) + p9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((p9Var.getMeasuredHeight() / 2.0f) + p9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.J != null) {
                    long j13 = this.I;
                    f11 = 5.0f;
                    long j14 = this.E;
                    if (j13 != j14) {
                    }
                    k01 k01Var2 = this.J;
                    float dp = (k01Var2 != null ? 0.0f : k01Var2.c) + AndroidUtilities.dp(10.0f);
                    float dp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = dp / 2.0f;
                    float f13 = measuredWidth - f12;
                    float f14 = dp2 / 2.0f;
                    rectF.set(f13, measuredHeight - f14, measuredWidth + f12, f14 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var2);
                    Paint paint = this.H;
                    paint.setColor(v02);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, f6Var2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    k01Var = this.J;
                    if (k01Var == null) {
                        f6Var = f6Var2;
                        f10 = 0.0f;
                        k01Var.c(f13 + AndroidUtilities.dp(f11), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        f6Var = f6Var2;
                        f10 = 0.0f;
                    }
                } else {
                    f11 = 5.0f;
                }
                StringBuilder sb = new StringBuilder("⭐️");
                long j15 = this.E;
                this.I = j15;
                sb.append(AndroidUtilities.formatWholeNumber((int) j15, 0));
                this.J = new k01(lh.ja.R0(sb.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                k01 k01Var22 = this.J;
                float dp3 = (k01Var22 != null ? 0.0f : k01Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f122 = dp3 / 2.0f;
                float f132 = measuredWidth - f122;
                float f142 = dp22 / 2.0f;
                rectF2.set(f132, measuredHeight - f142, measuredWidth + f122, f142 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int v022 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var2);
                Paint paint2 = this.H;
                paint2.setColor(v022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, f6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                k01Var = this.J;
                if (k01Var == null) {
                }
            } else {
                f6Var = f6Var2;
                f10 = 0.0f;
                f11 = 5.0f;
            }
            float e6 = this.B.e(this.C);
            if (e6 > f10) {
                int bottom = p9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = p9Var.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                float f15 = right;
                float f16 = bottom;
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(12.0f) * e6, org.telegram.ui.ActionBar.j6.t0);
                if (this.F == null) {
                    this.F = new eg.q1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.y);
                }
                this.F.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(10.0f) * e6, this.F.f);
                if (this.G == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.G = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.G.setBounds((int) (f15 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e6)), (int) (f16 - (((this.G.getIntrinsicHeight() / 2.0f) * 0.875f) * e6)), (int) (((this.G.getIntrinsicWidth() / 2.0f) * 0.875f * e6) + f15), (int) (((this.G.getIntrinsicHeight() / 2.0f) * 0.875f * e6) + f16));
                this.G.setAlpha((int) (255.0f * e6));
                this.G.draw(canvas);
                canvas.restore();
            }
            if (!this.C) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i10 = this.x;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.h.id))) {
                        z4 = true;
                        if (!z4 || this.r != f10) {
                            int bottom2 = p9Var.getBottom() - AndroidUtilities.dp(6.0f);
                            int right2 = p9Var.getRight() - AndroidUtilities.dp(10.0f);
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                            float f17 = right2;
                            float f18 = bottom2;
                            float f19 = 1.0f - e6;
                            float f20 = 1.0f - e;
                            canvas.drawCircle(f17, f18, AndroidUtilities.dp(7.0f) * this.r * f19 * f20, org.telegram.ui.ActionBar.j6.t0);
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T8, f6Var));
                            canvas.drawCircle(f17, f18, e2.c.z(AndroidUtilities.dp(f11), this.r, f19, f20), org.telegram.ui.ActionBar.j6.t0);
                            if (z4) {
                                float f21 = this.r;
                                if (f21 > f10) {
                                    float f22 = f21 - (j12 / 150.0f);
                                    this.r = f22;
                                    if (f22 < f10) {
                                        this.r = f10;
                                    }
                                    p9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f23 = this.r;
                                if (f23 < 1.0f) {
                                    float f24 = (j12 / 150.0f) + f23;
                                    this.r = f24;
                                    if (f24 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    p9Var.invalidate();
                                    invalidate();
                                    return drawChild;
                                }
                            }
                        }
                    }
                }
            }
            z4 = false;
            if (!z4) {
            }
            int bottom22 = p9Var.getBottom() - AndroidUtilities.dp(6.0f);
            int right22 = p9Var.getRight() - AndroidUtilities.dp(10.0f);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            float f172 = right22;
            float f182 = bottom22;
            float f192 = 1.0f - e6;
            float f202 = 1.0f - e;
            canvas.drawCircle(f172, f182, AndroidUtilities.dp(7.0f) * this.r * f192 * f202, org.telegram.ui.ActionBar.j6.t0);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T8, f6Var));
            canvas.drawCircle(f172, f182, e2.c.z(AndroidUtilities.dp(f11), this.r, f192, f202), org.telegram.ui.ActionBar.j6.t0);
            if (z4) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.E;
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
        org.telegram.ui.Components.p9 p9Var = this.a;
        int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
        int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
        org.telegram.ui.ActionBar.j6.o0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, this.y));
        org.telegram.ui.ActionBar.j6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, p9Var.getRoundRadius()[0], p9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.o0);
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
