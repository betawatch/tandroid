package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gj;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ua extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int K = 0;
    public final z A;
    public final uc B;
    public final org.telegram.ui.Components.g9 C;
    public final Drawable D;
    public MessagesController.CommonChatsList E;
    public float F;
    public float G;
    public float H;
    public int I;
    public boolean J;
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public long c;
    public zz0 d;
    public zz0 e;
    public zz0 f;
    public final ArrayList h;
    public ta n;
    public float r;
    public float s;
    public float v;
    public final RectF w;
    public final uc x;
    public final RectF y;

    public ua(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = new ArrayList();
        this.w = new RectF();
        this.x = new uc(this);
        this.y = new RectF();
        this.B = new uc(this);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this, false);
        this.C = g9Var;
        this.a = i10;
        this.b = c6Var;
        z Y = org.telegram.ui.ActionBar.g6.Y(822083583, 8, 8);
        this.A = Y;
        Y.setCallback(this);
        g9Var.p = AndroidUtilities.dp(50.0f);
        g9Var.o = AndroidUtilities.dp(13.0f);
        g9Var.x = false;
        g9Var.s = AndroidUtilities.dp(13.0f);
        g9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.D = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ta a(CharSequence charSequence, String str, boolean z10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.F += AndroidUtilities.dp(7.0f);
        }
        ta taVar = new ta(str, charSequence, z10);
        arrayList.add(taVar);
        this.F += AndroidUtilities.dp(14.0f);
        this.s = Math.max(this.s, taVar.a.c);
        this.v = Math.max(this.v, taVar.b.c + (z10 ? AndroidUtilities.dp(38.0f) : 0));
        return taVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        TL_bots.botVerification botverification;
        this.c = j10;
        this.G = 0.0f;
        this.F = 0.0f;
        this.s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.F += AndroidUtilities.dp(14.0f);
        zz0 zz0Var = new zz0(DialogObject.getName(j10), 14.0f, AndroidUtilities.bold());
        this.d = zz0Var;
        this.F = zz0Var.j() + AndroidUtilities.dp(3.0f) + this.F;
        int i11 = this.a;
        zz0 zz0Var2 = new zz0(LocaleController.getString(ContactsController.getInstance(i11).isContact(j10) ? R.string.ContactInfoIsContact : R.string.ContactInfoIsNotContact), 14.0f, null);
        this.e = zz0Var2;
        this.F = zz0Var2.j() + AndroidUtilities.dp(11.0f) + this.F;
        if (peerSettings != null && peerSettings.phone_country != null) {
            a(LocaleController.getCountryWithFlag(peerSettings.phone_country, 12, R.string.ContactInfoPhoneFragment), LocaleController.getString(R.string.ContactInfoPhone), false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String string = LocaleController.getString(R.string.ContactInfoRegistration);
            String str = peerSettings.registration_month;
            String[] split = str.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str = LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true);
            }
            a(str, string, false);
        }
        TLRPC.User user = j10 < 0 ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = j10 < 0 ? null : MessagesController.getInstance(i11).getUserFull(j10);
        if (userFull == null && j10 > 0) {
            MessagesController.getInstance(i11).loadUserInfo(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i11).getCommonChats(j10);
            this.E = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.g9 g9Var = this.C;
                g9Var.k(min);
                for (int i12 = 0; i12 < Math.min(3, this.E.chats.size()); i12++) {
                    g9Var.l(i12, this.E.chats.get(i12), i11);
                }
                g9Var.b(true, true);
            } else {
                this.E = null;
                this.n = null;
            }
        } else {
            this.E = null;
            this.n = null;
        }
        this.r = this.s + AndroidUtilities.dp(7.66f) + this.v;
        if (user == null || user.verified || UserObject.isService(user.id)) {
            this.f = null;
            this.F += AndroidUtilities.dp(14.0f);
        } else if (user.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
            iq iqVar = new iq(R.drawable.filled_info, 0);
            iqVar.setScale(0.55f, -0.55f);
            iqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
            this.f = new zz0(spannableStringBuilder, 12.0f, null);
            this.F = this.f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
        } else if (userFull == null || (botverification = userFull.bot_verification) == null) {
            this.f = null;
            this.F += AndroidUtilities.dp(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            this.f = new zz0(spannableStringBuilder2, 12.0f, null);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(botverification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) botverification.description);
            zz0 zz0Var3 = new zz0(spannableStringBuilder2, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            zz0Var3.a();
            zz0Var3.n(5);
            Point point = AndroidUtilities.displaySize;
            zz0Var3.q(Math.min(point.x, point.y) * 0.5f);
            zz0Var3.s(this);
            this.f = zz0Var3;
            this.F = this.f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
        }
        float max2 = Math.max(this.G, this.d.l());
        this.G = max2;
        float max3 = Math.max(max2, this.e.l());
        this.G = max3;
        float max4 = Math.max(max3, this.r);
        this.G = max4;
        this.G = Math.min(max4 + AndroidUtilities.dp(32.0f), i10);
    }

    public final void c(float f9, int i10) {
        if (Math.abs(this.H - f9) > 0.01f || i10 != this.I) {
            invalidate();
        }
        this.I = i10;
        this.H = f9;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.userInfoDidLoad;
        int i13 = this.a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.c;
            if (longValue == j10) {
                b(j10, MessagesController.getInstance(i13).getPeerSettings(this.c));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.c);
            this.E = commonChats;
            int count = commonChats.getCount();
            ta taVar = this.n;
            if (taVar == null || count <= 0) {
                b(this.c, MessagesController.getInstance(i13).getPeerSettings(this.c));
                requestLayout();
            } else {
                taVar.b = new zz0(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.g9 g9Var = this.C;
                g9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.E.chats.size()); i14++) {
                    g9Var.l(i14, this.E.chats.get(i14), i13);
                }
                g9Var.b(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f9 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.G) / 2.0f;
        float height = (getHeight() - this.F) / 2.0f;
        float width3 = (getWidth() + this.G) / 2.0f;
        float height2 = (getHeight() + this.F) / 2.0f;
        RectF rectF = this.w;
        rectF.set(width2, height, width3, height2);
        float f10 = 0.025f;
        float a2 = this.x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.I;
        float x4 = getX();
        float f11 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        if (c6Var != null) {
            c6Var.l(x4, f11, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.g6.q(x4, f11, measuredWidth, i10);
        }
        float f12 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var));
        if (c6Var != null ? c6Var.l0() : org.telegram.ui.ActionBar.g6.a1()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var));
        }
        float f13 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.F) / 2.0f);
        float A = com.google.android.recaptcha.internal.a.A(getHeight(), this.F, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = A + AndroidUtilities.dp(14.0f);
        zz0 zz0Var = this.d;
        zz0Var.p = this.G - AndroidUtilities.dp(32.0f);
        zz0Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j10 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        zz0 zz0Var2 = this.e;
        zz0Var2.p = this.G - AndroidUtilities.dp(32.0f);
        zz0Var2.c(width - (this.e.l() / 2.0f), this.e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.e.j() + AndroidUtilities.dp(11.0f));
        float j11 = this.e.j() + AndroidUtilities.dp(11.0f) + j10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f13, AndroidUtilities.dp(7.0f));
                j11 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            ta taVar = (ta) arrayList.get(i11);
            float dp2 = (width - (this.G / f9)) + AndroidUtilities.dp(f12) + this.s;
            float f14 = j11;
            zz0 zz0Var3 = taVar.a;
            boolean z10 = taVar.c;
            RectF rectF2 = taVar.d;
            float f15 = dp2 - zz0Var3.c;
            float dp3 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f);
            zz0Var3.p = (dp3 - f15) - AndroidUtilities.dp(7.66f);
            zz0Var3.c(f15, zz0Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f) + taVar.b.c;
            org.telegram.ui.Components.g9 g9Var = this.C;
            Drawable drawable = this.D;
            rectF2.set(dp4, f14, dp5 + (z10 ? g9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) : 0.0f), taVar.b.j() + f14);
            if (this.n == taVar) {
                RectF rectF3 = this.y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.B.a(f10);
                canvas.scale(a10, a10, rectF3.centerX(), taVar.b.j() / 2.0f);
                z zVar = this.A;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f14), (int) rectF3.right, (int) (rectF3.bottom - f14));
                    zVar.draw(canvas);
                }
            }
            zz0 zz0Var4 = taVar.b;
            zz0Var4.p = (((this.G / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            zz0Var4.c(dp3, taVar.b.j() / 2.0f, 1.0f, -1, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f) + taVar.b.c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                g9Var.i(canvas);
                canvas.translate(g9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j11 = AndroidUtilities.dp(14.0f) + f14;
            i11++;
            f9 = 2.0f;
            f10 = 0.025f;
            f13 = 0.0f;
            f12 = 16.0f;
        }
        if (this.f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            zz0 zz0Var5 = this.f;
            if (zz0Var5.f > 1) {
                zz0Var5.c(width - (zz0Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                zz0Var5.p = this.G - AndroidUtilities.dp(32.0f);
                zz0Var5.c(width - (this.f.l() / 2.0f), this.f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.x3.b(16.0f, (int) this.F, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gj gjVar;
        boolean z10 = this.n != null && this.y.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = !z10 && this.w.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        z zVar = this.A;
        uc ucVar = this.B;
        uc ucVar2 = this.x;
        if (action == 0) {
            ucVar2.c(z11);
            ucVar.c(z10);
            zVar.setState(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (ucVar2.h) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if ((U instanceof tn) && (gjVar = ((tn) U).W0) != null) {
                    gjVar.e(true, false);
                }
            } else if (ucVar.h) {
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.c;
                    if (j10 >= 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putBoolean("open_common", true);
                    U2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            ucVar.c(false);
            ucVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
            ucVar2.c(false);
            zVar.setState(new int[0]);
        }
        return ucVar.h || ucVar2.h;
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A || super.verifyDrawable(drawable);
    }
}
