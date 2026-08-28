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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.y5 A;
    public boolean B;
    public final org.telegram.ui.Components.y5 C;
    public long D;
    public zf.z0 E;
    public Drawable F;
    public final Paint G;
    public long H;
    public nz0 I;
    public final org.telegram.ui.Components.o9 a;
    public final bg.t b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final dp d;
    public final c7 e;
    public d7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long v;
    public boolean w;
    public final int x;
    public final org.telegram.ui.ActionBar.b6 y;

    public e7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        gr grVar = gr.h;
        this.A = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.C = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.G = new Paint();
        this.y = b6Var;
        this.e = new c7(this, b6Var, 0);
        setWillNotDraw(false);
        this.n = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i9 == 2) {
            addView(o9Var, g7.e6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(o9Var, g7.e6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        bg.t tVar = new bg.t(context, 8);
        this.b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(this.B ? org.telegram.ui.ActionBar.f6.C6 : org.telegram.ui.ActionBar.f6.j5, b6Var));
        tVar.setTextSize(1, 12.0f);
        tVar.setMaxLines(2);
        tVar.setGravity(49);
        tVar.setLines(2);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(tVar, g7.e6.d(-1, -2.0f, 51, 6.0f, i9 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(h5Var, g7.e6.d(-1, -2.0f, 51, 6.0f, i9 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        dp dpVar = new dp(context, 21, b6Var);
        this.d = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.B5, org.telegram.ui.ActionBar.f6.h5, org.telegram.ui.ActionBar.f6.C5);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(4);
        dpVar.setProgressDelegate(new ia(this, 5));
        addView(dpVar, g7.e6.d(24, 24.0f, 49, 19.0f, i9 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        org.telegram.ui.ActionBar.b6 b6Var = this.y;
        org.telegram.ui.Components.o9 o9Var = this.a;
        bg.t tVar = this.b;
        if (j10 == Long.MAX_VALUE) {
            tVar.setText(a());
            if (this.f == null) {
                this.f = new d7(getContext(), o9Var, true, b6Var);
            }
            o9Var.h(null, null, this.f, null);
        } else {
            boolean isUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.y5 y5Var = this.C;
            org.telegram.ui.Components.y5 y5Var2 = this.A;
            int i9 = this.x;
            if (isUserDialog) {
                this.h = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(i9).isUserContactBlocked(j10);
                this.B = DialogObject.isPremiumBlocked(isUserContactBlocked);
                this.D = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(this.B ? org.telegram.ui.ActionBar.f6.C6 : org.telegram.ui.ActionBar.f6.j5, b6Var));
                y5Var2.a(this.B);
                y5Var.a(this.D > 0);
                invalidate();
                c7Var.m(i9, this.h);
                int i10 = this.n;
                if (i10 != 2 && UserObject.isReplyUser(this.h)) {
                    tVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    c7Var.g(12);
                    o9Var.h(null, null, c7Var, this.h);
                } else if (i10 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        tVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            tVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            tVar.setText("");
                        }
                    }
                    o9Var.e(this.h, c7Var);
                } else {
                    tVar.setText(LocaleController.getString(R.string.SavedMessages));
                    c7Var.g(1);
                    o9Var.h(null, null, c7Var, this.h);
                }
                o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.B = false;
                y5Var2.d(0.0f, true);
                this.D = MessagesController.getInstance(i9).getSendPaidMessagesStars(j10);
                y5Var.getClass();
                y5Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    tVar.setText(charSequence);
                } else if (chat == null) {
                    tVar.setText("");
                } else if (chat.monoforum) {
                    tVar.setText(vf.c.i(chat, i9, false));
                } else {
                    tVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    vf.c.o(i9, chat, c7Var, o9Var);
                } else {
                    c7Var.k(i9, chat);
                    o9Var.e(chat, c7Var);
                }
                o9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
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
        int i9 = R.id.spring_tag;
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        o1.j jVar = (o1.j) h5Var.getTag(i9);
        if (jVar != null) {
            jVar.c();
        }
        if (z13) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(vf.c.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
            }
            h5Var.requestLayout();
        }
        if (z11) {
            o1.j jVar2 = new o1.j(new gb.a(z13 ? 0.0f : 1000.0f));
            o1.k kVar = new o1.k(z13 ? 1000.0f : 0.0f);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            jVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.a7
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    e7 e7Var = e7.this;
                    org.telegram.ui.ActionBar.h5 h5Var2 = e7Var.c;
                    h5Var2.setAlpha(f12);
                    bg.t tVar = e7Var.b;
                    float f13 = 1.0f - f12;
                    tVar.setAlpha(f13);
                    h5Var2.setTranslationX(f13 * (-AndroidUtilities.dp(10.0f)));
                    tVar.setTranslationX(f12 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.b7
                @Override // o1.f
                public final void a(o1.h hVar, boolean z14, float f10, float f11) {
                    e7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, jVar2);
            jVar2.f();
        } else {
            bg.t tVar = this.b;
            if (z13) {
                h5Var.setAlpha(1.0f);
                tVar.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                tVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                tVar.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                tVar.setTranslationX(0.0f);
            }
        }
        this.w = z13;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i11 = this.x;
            TL_account.RequirementToContact isUserContactBlocked = user != null ? MessagesController.getInstance(i11).isUserContactBlocked(this.h.id) : null;
            long sendPaidMessagesStars = this.v < 0 ? MessagesController.getInstance(i11).getSendPaidMessagesStars(this.v) : DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            if (this.B == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.D == sendPaidMessagesStars) {
                return;
            }
            boolean isPremiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
            this.B = isPremiumBlocked;
            this.D = sendPaidMessagesStars;
            this.b.setTextColor(org.telegram.ui.ActionBar.f6.v0(isPremiumBlocked ? org.telegram.ui.ActionBar.f6.C6 : org.telegram.ui.ActionBar.f6.j5, this.y));
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
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        float f11;
        boolean z10;
        nz0 nz0Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.o9 o9Var = this.a;
        if (view == o9Var && this.n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float e10 = this.C.e(this.D > 0);
            org.telegram.ui.ActionBar.b6 b6Var2 = this.y;
            if (e10 > 0.0f) {
                float measuredWidth = (o9Var.getMeasuredWidth() / 2.0f) + o9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((o9Var.getMeasuredHeight() / 2.0f) + o9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.I != null) {
                    long j13 = this.H;
                    f11 = 5.0f;
                    long j14 = this.D;
                    if (j13 != j14) {
                    }
                    nz0 nz0Var2 = this.I;
                    float dp = (nz0Var2 != null ? 0.0f : nz0Var2.c) + AndroidUtilities.dp(10.0f);
                    float dp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = dp / 2.0f;
                    float f13 = measuredWidth - f12;
                    float f14 = dp2 / 2.0f;
                    rectF.set(f13, measuredHeight - f14, measuredWidth + f12, f14 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var2);
                    Paint paint = this.G;
                    paint.setColor(v02);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B5, b6Var2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    nz0Var = this.I;
                    if (nz0Var == null) {
                        b6Var = b6Var2;
                        f10 = 0.0f;
                        nz0Var.c(f13 + AndroidUtilities.dp(f11), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        b6Var = b6Var2;
                        f10 = 0.0f;
                    }
                } else {
                    f11 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j15 = this.D;
                this.H = j15;
                sb2.append(AndroidUtilities.formatWholeNumber((int) j15, 0));
                this.I = new nz0(gh.oa.R0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                nz0 nz0Var22 = this.I;
                float dp3 = (nz0Var22 != null ? 0.0f : nz0Var22.c) + AndroidUtilities.dp(10.0f);
                float dp22 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f122 = dp3 / 2.0f;
                float f132 = measuredWidth - f122;
                float f142 = dp22 / 2.0f;
                rectF2.set(f132, measuredHeight - f142, measuredWidth + f122, f142 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int v022 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var2);
                Paint paint2 = this.G;
                paint2.setColor(v022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B5, b6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                nz0Var = this.I;
                if (nz0Var == null) {
                }
            } else {
                b6Var = b6Var2;
                f10 = 0.0f;
                f11 = 5.0f;
            }
            float e11 = this.A.e(this.B);
            if (e11 > f10) {
                int bottom = o9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = o9Var.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                float f15 = right;
                float f16 = bottom;
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(12.0f) * e11, org.telegram.ui.ActionBar.f6.t0);
                if (this.E == null) {
                    this.E = new zf.z0(org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, -1, -1, this.y);
                }
                this.E.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(10.0f) * e11, this.E.f);
                if (this.F == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.F = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.F.setBounds((int) (f15 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * e11)), (int) (f16 - (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f) * e11)), (int) (((this.F.getIntrinsicWidth() / 2.0f) * 0.875f * e11) + f15), (int) (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f * e11) + f16));
                this.F.setAlpha((int) (255.0f * e11));
                this.F.draw(canvas);
                canvas.restore();
            }
            if (!this.B) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i9 = this.x;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i9).getCurrentTime()) || MessagesController.getInstance(i9).onlinePrivacy.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f10) {
                            int bottom2 = o9Var.getBottom() - AndroidUtilities.dp(6.0f);
                            int right2 = o9Var.getRight() - AndroidUtilities.dp(10.0f);
                            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                            float f17 = right2;
                            float f18 = bottom2;
                            float f19 = 1.0f - e11;
                            float f20 = 1.0f - e10;
                            canvas.drawCircle(f17, f18, AndroidUtilities.dp(7.0f) * this.r * f19 * f20, org.telegram.ui.ActionBar.f6.t0);
                            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.T8, b6Var));
                            canvas.drawCircle(f17, f18, e2.c.C(AndroidUtilities.dp(f11), this.r, f19, f20), org.telegram.ui.ActionBar.f6.t0);
                            if (z10) {
                                float f21 = this.r;
                                if (f21 > f10) {
                                    float f22 = f21 - (j12 / 150.0f);
                                    this.r = f22;
                                    if (f22 < f10) {
                                        this.r = f10;
                                    }
                                    o9Var.invalidate();
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
                                    o9Var.invalidate();
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
            int bottom22 = o9Var.getBottom() - AndroidUtilities.dp(6.0f);
            int right22 = o9Var.getRight() - AndroidUtilities.dp(10.0f);
            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
            float f172 = right22;
            float f182 = bottom22;
            float f192 = 1.0f - e11;
            float f202 = 1.0f - e10;
            canvas.drawCircle(f172, f182, AndroidUtilities.dp(7.0f) * this.r * f192 * f202, org.telegram.ui.ActionBar.f6.t0);
            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.T8, b6Var));
            canvas.drawCircle(f172, f182, e2.c.C(AndroidUtilities.dp(f11), this.r, f192, f202), org.telegram.ui.ActionBar.f6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.o9 getImageView() {
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
        org.telegram.ui.Components.o9 o9Var = this.a;
        int measuredWidth = (o9Var.getMeasuredWidth() / 2) + o9Var.getLeft();
        int measuredHeight = (o9Var.getMeasuredHeight() / 2) + o9Var.getTop();
        org.telegram.ui.ActionBar.f6.o0.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B5, this.y));
        org.telegram.ui.ActionBar.f6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int dp = AndroidUtilities.dp(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - dp, measuredHeight - dp, measuredWidth + dp, measuredHeight + dp);
        canvas.drawRoundRect(rectF, o9Var.getRoundRadius()[0], o9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.f6.o0);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
