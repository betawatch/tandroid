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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class h7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d6 E;
    public boolean F;
    public final org.telegram.ui.Components.d6 G;
    public long H;
    public qg.c1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public t01 M;
    public final org.telegram.ui.Components.w9 a;
    public final di.h b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final tp d;
    public final f7 e;
    public g7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.f6 y;

    public h7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        wr wrVar = wr.h;
        this.E = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.G = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.K = new Paint();
        this.y = f6Var;
        this.e = new f7(this, f6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(w9Var, w7.a6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(w9Var, w7.a6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        di.h hVar = new di.h(context, 6);
        this.b = hVar;
        NotificationCenter.listenEmojiLoading(hVar);
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.F ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, f6Var));
        hVar.setTextSize(1, 12.0f);
        hVar.setMaxLines(2);
        hVar.setGravity(49);
        hVar.setLines(2);
        hVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(hVar, w7.a6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        l5Var.setTextSize(12);
        l5Var.setMaxLines(2);
        l5Var.setGravity(49);
        l5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(l5Var, w7.a6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        tp tpVar = new tp(context, 21, f6Var);
        this.d = tpVar;
        tpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.h5, org.telegram.ui.ActionBar.j6.C5);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(4);
        tpVar.setProgressDelegate(new na(this, 5));
        addView(tpVar, w7.a6.d(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        f7 f7Var = this.e;
        f7Var.p = 1.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        org.telegram.ui.Components.w9 w9Var = this.a;
        di.h hVar = this.b;
        if (j3 == Long.MAX_VALUE) {
            hVar.setText(a());
            if (this.f == null) {
                this.f = new g7(getContext(), w9Var, true, f6Var);
            }
            w9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j3);
            org.telegram.ui.Components.d6 d6Var = this.G;
            org.telegram.ui.Components.d6 d6Var2 = this.E;
            int i10 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j3);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.F ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, f6Var));
                d6Var2.a(this.F);
                d6Var.a(this.H > 0);
                invalidate();
                f7Var.m(i10, this.h);
                int i11 = this.n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    hVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    f7Var.g(12);
                    w9Var.h(null, null, f7Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        hVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            hVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            hVar.setText("");
                        }
                    }
                    w9Var.e(this.h, f7Var);
                } else {
                    hVar.setText(LocaleController.getString(R.string.SavedMessages));
                    f7Var.g(1);
                    w9Var.h(null, null, f7Var, this.h);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                d6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
                d6Var.getClass();
                d6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (charSequence != null) {
                    hVar.setText(charSequence);
                } else if (chat == null) {
                    hVar.setText("");
                } else if (chat.monoforum) {
                    hVar.setText(mg.d.i(chat, i10, false));
                } else {
                    hVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    mg.d.o(i10, chat, f7Var, w9Var);
                } else {
                    f7Var.k(i10, chat);
                    w9Var.e(chat, f7Var);
                }
                w9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
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
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        o1.k kVar = (o1.k) l5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z13) {
            if (z10) {
                l5Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                l5Var.l(mg.d.j(tL_forumTopic, l5Var.getTextPaint(), null), false);
            }
            l5Var.requestLayout();
        }
        if (z11) {
            o1.k kVar2 = new o1.k(new o1.j(z13 ? 0.0f : 1000.0f));
            o1.l lVar = new o1.l(z13 ? 1000.0f : 0.0f);
            lVar.b(1500.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            kVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.d7
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    float f11 = f7 / 1000.0f;
                    h7 h7Var = h7.this;
                    org.telegram.ui.ActionBar.l5 l5Var2 = h7Var.c;
                    l5Var2.setAlpha(f11);
                    di.h hVar2 = h7Var.b;
                    float f12 = 1.0f - f11;
                    hVar2.setAlpha(f12);
                    l5Var2.setTranslationX(f12 * (-AndroidUtilities.dp(10.0f)));
                    hVar2.setTranslationX(f11 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.e7
                @Override // o1.f
                public final void a(o1.h hVar, boolean z14, float f7, float f10) {
                    h7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            l5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.f();
        } else {
            di.h hVar = this.b;
            if (z13) {
                l5Var.setAlpha(1.0f);
                hVar.setAlpha(0.0f);
                l5Var.setTranslationX(0.0f);
                hVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                l5Var.setAlpha(0.0f);
                hVar.setAlpha(1.0f);
                l5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                hVar.setTranslationX(0.0f);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        boolean z10;
        t01 t01Var;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.w9 w9Var = this.a;
        if (view == w9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.s;
            long j11 = j10 <= 17 ? j10 : 17L;
            this.s = elapsedRealtime;
            float e = this.G.e(this.H > 0);
            org.telegram.ui.ActionBar.f6 f6Var2 = this.y;
            if (e > 0.0f) {
                float measuredWidth = (w9Var.getMeasuredWidth() / 2.0f) + w9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((w9Var.getMeasuredHeight() / 2.0f) + w9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.M != null) {
                    long j12 = this.L;
                    f10 = 5.0f;
                    long j13 = this.H;
                    if (j12 != j13) {
                    }
                    t01 t01Var2 = this.M;
                    float dp = (t01Var2 != null ? 0.0f : t01Var2.c) + AndroidUtilities.dp(10.0f);
                    float dp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp / 2.0f;
                    float f12 = measuredWidth - f11;
                    float f13 = dp2 / 2.0f;
                    rectF.set(f12, measuredHeight - f13, measuredWidth + f11, f13 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var2);
                    Paint paint = this.K;
                    paint.setColor(v02);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, f6Var2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    t01Var = this.M;
                    if (t01Var == null) {
                        f6Var = f6Var2;
                        f7 = 0.0f;
                        t01Var.c(f12 + AndroidUtilities.dp(f10), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        f6Var = f6Var2;
                        f7 = 0.0f;
                    }
                } else {
                    f10 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j14 = this.H;
                this.L = j14;
                sb2.append(AndroidUtilities.formatWholeNumber((int) j14, 0));
                this.M = new t01(xh.z7.R0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                t01 t01Var22 = this.M;
                float dp3 = (t01Var22 != null ? 0.0f : t01Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f112 = dp3 / 2.0f;
                float f122 = measuredWidth - f112;
                float f132 = dp22 / 2.0f;
                rectF2.set(f122, measuredHeight - f132, measuredWidth + f112, f132 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int v022 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var2);
                Paint paint2 = this.K;
                paint2.setColor(v022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, f6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                t01Var = this.M;
                if (t01Var == null) {
                }
            } else {
                f6Var = f6Var2;
                f7 = 0.0f;
                f10 = 5.0f;
            }
            float e7 = this.E.e(this.F);
            if (e7 > f7) {
                int bottom = w9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = w9Var.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                float f14 = right;
                float f15 = bottom;
                canvas.drawCircle(f14, f15, AndroidUtilities.dp(12.0f) * e7, org.telegram.ui.ActionBar.j6.t0);
                if (this.I == null) {
                    this.I = new qg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.y);
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
                            int bottom2 = w9Var.getBottom() - AndroidUtilities.dp(6.0f);
                            int right2 = w9Var.getRight() - AndroidUtilities.dp(10.0f);
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                            float f16 = right2;
                            float f17 = bottom2;
                            float f18 = 1.0f - e7;
                            float f19 = 1.0f - e;
                            canvas.drawCircle(f16, f17, AndroidUtilities.dp(7.0f) * this.r * f18 * f19, org.telegram.ui.ActionBar.j6.t0);
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T8, f6Var));
                            canvas.drawCircle(f16, f17, com.google.android.gms.internal.vision.e2.C(AndroidUtilities.dp(f10), this.r, f18, f19), org.telegram.ui.ActionBar.j6.t0);
                            if (z10) {
                                float f20 = this.r;
                                if (f20 > f7) {
                                    float f21 = f20 - (j11 / 150.0f);
                                    this.r = f21;
                                    if (f21 < f7) {
                                        this.r = f7;
                                    }
                                    w9Var.invalidate();
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
                                    w9Var.invalidate();
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
            int bottom22 = w9Var.getBottom() - AndroidUtilities.dp(6.0f);
            int right22 = w9Var.getRight() - AndroidUtilities.dp(10.0f);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            float f162 = right22;
            float f172 = bottom22;
            float f182 = 1.0f - e7;
            float f192 = 1.0f - e;
            canvas.drawCircle(f162, f172, AndroidUtilities.dp(7.0f) * this.r * f182 * f192, org.telegram.ui.ActionBar.j6.t0);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.T8, f6Var));
            canvas.drawCircle(f162, f172, com.google.android.gms.internal.vision.e2.C(AndroidUtilities.dp(f10), this.r, f182, f192), org.telegram.ui.ActionBar.j6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.w9 getImageView() {
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
        org.telegram.ui.Components.w9 w9Var = this.a;
        int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
        int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
        org.telegram.ui.ActionBar.j6.o0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B5, this.y));
        org.telegram.ui.ActionBar.j6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, w9Var.getRoundRadius()[0], w9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.o0);
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
