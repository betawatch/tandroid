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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class c7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d6 A;
    public boolean B;
    public final org.telegram.ui.Components.d6 C;
    public long D;
    public cg.r1 E;
    public Drawable F;
    public final Paint G;
    public long H;
    public zz0 I;
    public final org.telegram.ui.Components.t9 a;
    public final eg.r b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final hp d;
    public final a7 e;
    public b7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.c6 y;

    public c7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        jr jrVar = jr.h;
        this.A = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.C = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.G = new Paint();
        this.y = c6Var;
        this.e = new a7(this, c6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(t9Var, i7.f6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(t9Var, i7.f6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        eg.r rVar = new eg.r(context, 6);
        this.b = rVar;
        NotificationCenter.listenEmojiLoading(rVar);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.B ? org.telegram.ui.ActionBar.g6.C6 : org.telegram.ui.ActionBar.g6.j5, c6Var));
        rVar.setTextSize(1, 12.0f);
        rVar.setMaxLines(2);
        rVar.setGravity(49);
        rVar.setLines(2);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(rVar, i7.f6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(h5Var, i7.f6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        hp hpVar = new hp(context, 21, c6Var);
        this.d = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.h5, org.telegram.ui.ActionBar.g6.C5);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(4);
        hpVar.setProgressDelegate(new fa(this, 5));
        addView(hpVar, i7.f6.d(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        a7 a7Var = this.e;
        a7Var.p = 1.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.y;
        org.telegram.ui.Components.t9 t9Var = this.a;
        eg.r rVar = this.b;
        if (j10 == Long.MAX_VALUE) {
            rVar.setText(a());
            if (this.f == null) {
                this.f = new b7(getContext(), t9Var, true, c6Var);
            }
            t9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.d6 d6Var = this.C;
            org.telegram.ui.Components.d6 d6Var2 = this.A;
            int i10 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j10);
                this.B = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.D = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.B ? org.telegram.ui.ActionBar.g6.C6 : org.telegram.ui.ActionBar.g6.j5, c6Var));
                d6Var2.a(this.B);
                d6Var.a(this.D > 0);
                invalidate();
                a7Var.m(i10, this.h);
                int i11 = this.n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    rVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    a7Var.g(12);
                    t9Var.h(null, null, a7Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        rVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            rVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            rVar.setText("");
                        }
                    }
                    t9Var.e(this.h, a7Var);
                } else {
                    rVar.setText(LocaleController.getString(R.string.SavedMessages));
                    a7Var.g(1);
                    t9Var.h(null, null, a7Var, this.h);
                }
                t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.B = false;
                d6Var2.d(0.0f, true);
                this.D = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
                d6Var.getClass();
                d6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    rVar.setText(charSequence);
                } else if (chat == null) {
                    rVar.setText("");
                } else if (chat.monoforum) {
                    rVar.setText(yf.d.i(chat, i10, false));
                } else {
                    rVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    yf.d.o(i10, chat, a7Var, t9Var);
                } else {
                    a7Var.k(i10, chat);
                    t9Var.e(chat, a7Var);
                }
                t9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
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
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        o1.k kVar = (o1.k) h5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z13) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(yf.d.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
            }
            h5Var.requestLayout();
        }
        if (z11) {
            o1.k kVar2 = new o1.k(new ib.a(z13 ? 0.0f : 1000.0f));
            o1.l lVar = new o1.l(z13 ? 1000.0f : 0.0f);
            lVar.b(1500.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            kVar2.b(new o1.h() { // from class: org.telegram.ui.Cells.y6
                @Override // o1.h
                public final void a(o1.i iVar, float f9, float f10) {
                    float f11 = f9 / 1000.0f;
                    c7 c7Var = c7.this;
                    org.telegram.ui.ActionBar.h5 h5Var2 = c7Var.c;
                    h5Var2.setAlpha(f11);
                    eg.r rVar = c7Var.b;
                    float f12 = 1.0f - f11;
                    rVar.setAlpha(f12);
                    h5Var2.setTranslationX(f12 * (-AndroidUtilities.dp(10.0f)));
                    rVar.setTranslationX(f11 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.g() { // from class: org.telegram.ui.Cells.z6
                @Override // o1.g
                public final void a(o1.i iVar, boolean z14, float f9, float f10) {
                    c7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            eg.r rVar = this.b;
            if (z13) {
                h5Var.setAlpha(1.0f);
                rVar.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                rVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                rVar.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                rVar.setTranslationX(0.0f);
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
            if (this.B == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.D == sendPaidMessagesStars) {
                return;
            }
            boolean isPremiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.B = isPremiumBlocked;
            this.D = sendPaidMessagesStars;
            this.b.setTextColor(org.telegram.ui.ActionBar.g6.v0(isPremiumBlocked ? org.telegram.ui.ActionBar.g6.C6 : org.telegram.ui.ActionBar.g6.j5, this.y));
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
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        float f10;
        boolean z10;
        zz0 zz0Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.t9 t9Var = this.a;
        if (view == t9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float e10 = this.C.e(this.D > 0);
            org.telegram.ui.ActionBar.c6 c6Var2 = this.y;
            if (e10 > 0.0f) {
                float measuredWidth = (t9Var.getMeasuredWidth() / 2.0f) + t9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((t9Var.getMeasuredHeight() / 2.0f) + t9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.I != null) {
                    long j13 = this.H;
                    f10 = 5.0f;
                    long j14 = this.D;
                    if (j13 != j14) {
                    }
                    zz0 zz0Var2 = this.I;
                    float dp = (zz0Var2 != null ? 0.0f : zz0Var2.c) + AndroidUtilities.dp(10.0f);
                    float dp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp / 2.0f;
                    float f12 = measuredWidth - f11;
                    float f13 = dp2 / 2.0f;
                    rectF.set(f12, measuredHeight - f13, measuredWidth + f11, f13 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var2);
                    Paint paint = this.G;
                    paint.setColor(v02);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, c6Var2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    zz0Var = this.I;
                    if (zz0Var == null) {
                        c6Var = c6Var2;
                        f9 = 0.0f;
                        zz0Var.c(f12 + AndroidUtilities.dp(f10), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        c6Var = c6Var2;
                        f9 = 0.0f;
                    }
                } else {
                    f10 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j15 = this.D;
                this.H = j15;
                sb2.append(AndroidUtilities.formatWholeNumber((int) j15, 0));
                this.I = new zz0(jh.ia.R0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                zz0 zz0Var22 = this.I;
                float dp3 = (zz0Var22 != null ? 0.0f : zz0Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f112 = dp3 / 2.0f;
                float f122 = measuredWidth - f112;
                float f132 = dp22 / 2.0f;
                rectF2.set(f122, measuredHeight - f132, measuredWidth + f112, f132 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int v022 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var2);
                Paint paint2 = this.G;
                paint2.setColor(v022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, c6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                zz0Var = this.I;
                if (zz0Var == null) {
                }
            } else {
                c6Var = c6Var2;
                f9 = 0.0f;
                f10 = 5.0f;
            }
            float e11 = this.A.e(this.B);
            if (e11 > f9) {
                int bottom = t9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = t9Var.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                float f14 = right;
                float f15 = bottom;
                canvas.drawCircle(f14, f15, AndroidUtilities.dp(12.0f) * e11, org.telegram.ui.ActionBar.g6.t0);
                if (this.E == null) {
                    this.E = new cg.r1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.y);
                }
                this.E.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f14, f15, AndroidUtilities.dp(10.0f) * e11, this.E.f);
                if (this.F == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.F = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.F.setBounds((int) (f14 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e11)), (int) (f15 - (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f) * e11)), (int) (((this.F.getIntrinsicWidth() / 2.0f) * 0.875f * e11) + f14), (int) (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f * e11) + f15));
                this.F.setAlpha((int) (255.0f * e11));
                this.F.draw(canvas);
                canvas.restore();
            }
            if (!this.B) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i10 = this.x;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f9) {
                            int bottom2 = t9Var.getBottom() - AndroidUtilities.dp(6.0f);
                            int right2 = t9Var.getRight() - AndroidUtilities.dp(10.0f);
                            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
                            float f16 = right2;
                            float f17 = bottom2;
                            float f18 = 1.0f - e11;
                            float f19 = 1.0f - e10;
                            canvas.drawCircle(f16, f17, AndroidUtilities.dp(7.0f) * this.r * f18 * f19, org.telegram.ui.ActionBar.g6.t0);
                            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.T8, c6Var));
                            canvas.drawCircle(f16, f17, com.google.android.recaptcha.internal.a.C(AndroidUtilities.dp(f10), this.r, f18, f19), org.telegram.ui.ActionBar.g6.t0);
                            if (z10) {
                                float f20 = this.r;
                                if (f20 > f9) {
                                    float f21 = f20 - (j12 / 150.0f);
                                    this.r = f21;
                                    if (f21 < f9) {
                                        this.r = f9;
                                    }
                                    t9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f22 = this.r;
                                if (f22 < 1.0f) {
                                    float f23 = (j12 / 150.0f) + f22;
                                    this.r = f23;
                                    if (f23 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    t9Var.invalidate();
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
            int bottom22 = t9Var.getBottom() - AndroidUtilities.dp(6.0f);
            int right22 = t9Var.getRight() - AndroidUtilities.dp(10.0f);
            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            float f162 = right22;
            float f172 = bottom22;
            float f182 = 1.0f - e11;
            float f192 = 1.0f - e10;
            canvas.drawCircle(f162, f172, AndroidUtilities.dp(7.0f) * this.r * f182 * f192, org.telegram.ui.ActionBar.g6.t0);
            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.T8, c6Var));
            canvas.drawCircle(f162, f172, com.google.android.recaptcha.internal.a.C(AndroidUtilities.dp(f10), this.r, f182, f192), org.telegram.ui.ActionBar.g6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.t9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.D;
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
        org.telegram.ui.Components.t9 t9Var = this.a;
        int measuredWidth = (t9Var.getMeasuredWidth() / 2) + t9Var.getLeft();
        int measuredHeight = (t9Var.getMeasuredHeight() / 2) + t9Var.getTop();
        org.telegram.ui.ActionBar.g6.o0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, this.y));
        org.telegram.ui.ActionBar.g6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, t9Var.getRoundRadius()[0], t9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.g6.o0);
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
