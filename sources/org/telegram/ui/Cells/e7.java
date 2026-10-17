package org.telegram.ui.Cells;

import ai.ld;
import ai.ud;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class e7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.f6 E;
    public boolean F;
    public final org.telegram.ui.Components.f6 G;
    public long H;
    public sg.z0 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public d11 M;
    public final org.telegram.ui.Components.w9 a;
    public final ud b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final xp d;
    public final c7 e;
    public d7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.d6 y;

    public e7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        bs bsVar = bs.h;
        this.E = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.G = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.K = new Paint();
        this.y = d6Var;
        this.e = new c7(this, d6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(w9Var, w7.z5.a(48.0f, 0.0f, 7.0f, 0.0f, 0.0f, 48, 49));
        } else {
            addView(w9Var, w7.z5.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        }
        ud udVar = new ud(context, 8);
        this.b = udVar;
        NotificationCenter.listenEmojiLoading(udVar);
        udVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(this.F ? org.telegram.ui.ActionBar.h6.C6 : org.telegram.ui.ActionBar.h6.j5, d6Var));
        udVar.setTextSize(1, 12.0f);
        udVar.setMaxLines(2);
        udVar.setGravity(49);
        udVar.setLines(2);
        udVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(udVar, w7.z5.a(-2.0f, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(j5Var, w7.z5.a(-2.0f, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f, -1, 51));
        xp xpVar = new xp(context, 21, d6Var);
        this.d = xpVar;
        xpVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.h5, org.telegram.ui.ActionBar.h6.C5);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(4);
        xpVar.setProgressDelegate(new ia(this, 5));
        addView(xpVar, w7.z5.a(24.0f, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f, 24, 49));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        c7 c7Var = this.e;
        c7Var.p = 1.0f;
        org.telegram.ui.ActionBar.d6 d6Var = this.y;
        org.telegram.ui.Components.w9 w9Var = this.a;
        ud udVar = this.b;
        if (j10 == Long.MAX_VALUE) {
            udVar.setText(a());
            if (this.f == null) {
                this.f = new d7(getContext(), w9Var, true, d6Var);
            }
            w9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.f6 f6Var = this.G;
            org.telegram.ui.Components.f6 f6Var2 = this.E;
            int i10 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j10);
                this.F = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.H = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                udVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(this.F ? org.telegram.ui.ActionBar.h6.C6 : org.telegram.ui.ActionBar.h6.j5, d6Var));
                f6Var2.a(this.F);
                f6Var.a(this.H > 0);
                invalidate();
                c7Var.m(i10, this.h);
                int i11 = this.n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    udVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    c7Var.g(12);
                    w9Var.h(null, null, c7Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        udVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            udVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            udVar.setText("");
                        }
                    }
                    w9Var.e(this.h, c7Var);
                } else {
                    udVar.setText(LocaleController.getString(R.string.SavedMessages));
                    c7Var.g(1);
                    w9Var.h(null, null, c7Var, this.h);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.F = false;
                f6Var2.d(0.0f, true);
                this.H = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
                f6Var.getClass();
                f6Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    udVar.setText(charSequence);
                } else if (chat == null) {
                    udVar.setText("");
                } else if (chat.monoforum) {
                    udVar.setText(og.d.i(chat, i10, false));
                } else {
                    udVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    og.d.o(i10, chat, c7Var, w9Var);
                } else {
                    c7Var.k(i10, chat);
                    w9Var.e(chat, c7Var);
                }
                w9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
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
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        o1.k kVar = (o1.k) j5Var.getTag(i10);
        if (kVar != null) {
            kVar.c();
        }
        if (z13) {
            if (z10) {
                j5Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                j5Var.l(og.d.j(tL_forumTopic, j5Var.getTextPaint(), null), false);
            }
            j5Var.requestLayout();
        }
        if (z11) {
            o1.k kVar2 = new o1.k(new o1.j(z13 ? 0.0f : 1000.0f));
            o1.l lVar = new o1.l(z13 ? 1000.0f : 0.0f);
            lVar.b(1500.0f);
            lVar.a(1.0f);
            kVar2.u = lVar;
            kVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.a7
                @Override // o1.g
                public final void a(o1.h hVar, float f7, float f10) {
                    float f11 = f7 / 1000.0f;
                    e7 e7Var = e7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = e7Var.c;
                    j5Var2.setAlpha(f11);
                    ud udVar = e7Var.b;
                    float f12 = 1.0f - f11;
                    udVar.setAlpha(f12);
                    j5Var2.setTranslationX(f12 * (-AndroidUtilities.dp(10.0f)));
                    udVar.setTranslationX(f11 * AndroidUtilities.dp(10.0f));
                }
            });
            kVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.b7
                @Override // o1.f
                public final void a(o1.h hVar, boolean z14, float f7, float f10) {
                    e7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            j5Var.setTag(R.id.spring_tag, kVar2);
            kVar2.h();
        } else {
            ud udVar = this.b;
            if (z13) {
                j5Var.setAlpha(1.0f);
                udVar.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                udVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                udVar.setAlpha(1.0f);
                j5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                udVar.setTranslationX(0.0f);
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
            this.b.setTextColor(org.telegram.ui.ActionBar.h6.w0(isPremiumBlocked ? org.telegram.ui.ActionBar.h6.C6 : org.telegram.ui.ActionBar.h6.j5, this.y));
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
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        d11 d11Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.w9 w9Var = this.a;
        if (view == w9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float e = this.G.e(this.H > 0);
            org.telegram.ui.ActionBar.d6 d6Var2 = this.y;
            if (e > 0.0f) {
                float measuredWidth = (w9Var.getMeasuredWidth() / 2.0f) + w9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((w9Var.getMeasuredHeight() / 2.0f) + w9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.M != null) {
                    f7 = 0.0f;
                    f11 = 5.0f;
                    long j13 = this.L;
                    f12 = measuredWidth;
                    long j14 = this.H;
                    if (j13 == j14 || j14 <= 0) {
                        d11 d11Var2 = this.M;
                        float dp = (d11Var2 != null ? f7 : d11Var2.c) + AndroidUtilities.dp(10.0f);
                        float dp2 = AndroidUtilities.dp(14.33f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f13 = dp / 2.0f;
                        float f14 = f12 - f13;
                        float f15 = dp2 / 2.0f;
                        rectF.set(f14, measuredHeight - f15, f12 + f13, f15 + measuredHeight);
                        rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var2);
                        Paint paint = this.K;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B5, d6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        d11Var = this.M;
                        if (d11Var == null) {
                            float dp3 = AndroidUtilities.dp(f11) + f14;
                            d6Var = d6Var2;
                            f10 = 9.33f;
                            d11Var.c(dp3, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            d6Var = d6Var2;
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
                this.M = new d11(ld.S0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                d11 d11Var22 = this.M;
                float dp4 = (d11Var22 != null ? f7 : d11Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f132 = dp4 / 2.0f;
                float f142 = f12 - f132;
                float f152 = dp22 / 2.0f;
                rectF2.set(f142, measuredHeight - f152, f12 + f132, f152 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int w022 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var2);
                Paint paint2 = this.K;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B5, d6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                d11Var = this.M;
                if (d11Var == null) {
                }
            } else {
                d6Var = d6Var2;
                f7 = 0.0f;
                f10 = 9.33f;
                f11 = 5.0f;
            }
            float e7 = this.E.e(this.F);
            if (e7 > f7) {
                int bottom = w9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = w9Var.getRight() - AndroidUtilities.dp(f10);
                canvas.save();
                org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                float f16 = right;
                float f17 = bottom;
                canvas.drawCircle(f16, f17, AndroidUtilities.dp(12.0f) * e7, org.telegram.ui.ActionBar.h6.t0);
                if (this.I == null) {
                    this.I = new sg.z0(org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, -1, -1, this.y);
                }
                this.I.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f16, f17, AndroidUtilities.dp(10.0f) * e7, this.I.f);
                if (this.J == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.J = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds((int) (f16 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e7)), (int) (f17 - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * e7)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * e7) + f16), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * e7) + f17));
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
                            org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
                            float f18 = right2;
                            float f19 = bottom2;
                            float f20 = 1.0f - e7;
                            float f21 = 1.0f - e;
                            canvas.drawCircle(f18, f19, AndroidUtilities.dp(7.0f) * this.r * f20 * f21, org.telegram.ui.ActionBar.h6.t0);
                            org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.T8, d6Var));
                            canvas.drawCircle(f18, f19, com.google.android.gms.internal.cast.a6.C(AndroidUtilities.dp(f11), this.r, f20, f21), org.telegram.ui.ActionBar.h6.t0);
                            if (z10) {
                                float f22 = this.r;
                                if (f22 > f7) {
                                    float f23 = f22 - (j12 / 150.0f);
                                    this.r = f23;
                                    if (f23 < f7) {
                                        this.r = f7;
                                    }
                                    w9Var.invalidate();
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
            org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            float f182 = right22;
            float f192 = bottom22;
            float f202 = 1.0f - e7;
            float f212 = 1.0f - e;
            canvas.drawCircle(f182, f192, AndroidUtilities.dp(7.0f) * this.r * f202 * f212, org.telegram.ui.ActionBar.h6.t0);
            org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.T8, d6Var));
            canvas.drawCircle(f182, f192, com.google.android.gms.internal.cast.a6.C(AndroidUtilities.dp(f11), this.r, f202, f212), org.telegram.ui.ActionBar.h6.t0);
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
        org.telegram.ui.ActionBar.h6.o0.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B5, this.y));
        org.telegram.ui.ActionBar.h6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, w9Var.getRoundRadius()[0], w9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.h6.o0);
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
