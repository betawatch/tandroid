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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class db extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int O = 0;
    public final z E;
    public final xc F;
    public final org.telegram.ui.Components.i9 G;
    public final Drawable H;
    public MessagesController.CommonChatsList I;
    public float J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public long c;
    public t01 d;
    public t01 e;
    public t01 f;
    public final ArrayList h;
    public cb n;
    public float r;
    public float s;
    public float v;
    public final RectF w;
    public final xc x;
    public final RectF y;

    public db(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new ArrayList();
        this.w = new RectF();
        this.x = new xc(this);
        this.y = new RectF();
        this.F = new xc(this);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(this, false);
        this.G = i9Var;
        this.a = i10;
        this.b = f6Var;
        z Y = org.telegram.ui.ActionBar.j6.Y(822083583, 8, 8);
        this.E = Y;
        Y.setCallback(this);
        i9Var.p = AndroidUtilities.dp(50.0f);
        i9Var.o = AndroidUtilities.dp(13.0f);
        i9Var.x = false;
        i9Var.s = AndroidUtilities.dp(13.0f);
        i9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final cb a(CharSequence charSequence, String str, boolean z10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.J += AndroidUtilities.dp(7.0f);
        }
        cb cbVar = new cb(str, charSequence, z10);
        arrayList.add(cbVar);
        this.J += AndroidUtilities.dp(14.0f);
        this.s = Math.max(this.s, cbVar.a.c);
        this.v = Math.max(this.v, cbVar.b.c + (z10 ? AndroidUtilities.dp(38.0f) : 0));
        return cbVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        TL_bots.botVerification botverification;
        this.c = j3;
        this.K = 0.0f;
        this.J = 0.0f;
        this.s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.J += AndroidUtilities.dp(14.0f);
        t01 t01Var = new t01(DialogObject.getName(j3), 14.0f, AndroidUtilities.bold());
        this.d = t01Var;
        this.J = t01Var.j() + AndroidUtilities.dp(3.0f) + this.J;
        int i11 = this.a;
        t01 t01Var2 = new t01(LocaleController.getString(ContactsController.getInstance(i11).isContact(j3) ? R.string.ContactInfoIsContact : R.string.ContactInfoIsNotContact), 14.0f, null);
        this.e = t01Var2;
        this.J = t01Var2.j() + AndroidUtilities.dp(11.0f) + this.J;
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
        TLRPC.User user = j3 < 0 ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        TLRPC.UserFull userFull = j3 < 0 ? null : MessagesController.getInstance(i11).getUserFull(j3);
        if (userFull == null && j3 > 0) {
            MessagesController.getInstance(i11).loadUserInfo(MessagesController.getInstance(i11).getUser(Long.valueOf(j3)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i11).getCommonChats(j3);
            this.I = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.i9 i9Var = this.G;
                i9Var.k(min);
                for (int i12 = 0; i12 < Math.min(3, this.I.chats.size()); i12++) {
                    i9Var.l(i12, this.I.chats.get(i12), i11);
                }
                i9Var.b(true, true);
            } else {
                this.I = null;
                this.n = null;
            }
        } else {
            this.I = null;
            this.n = null;
        }
        this.r = this.s + AndroidUtilities.dp(7.66f) + this.v;
        if (user == null || user.verified || UserObject.isService(user.id)) {
            this.f = null;
            this.J += AndroidUtilities.dp(14.0f);
        } else if (user.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
            uq uqVar = new uq(R.drawable.filled_info, 0);
            uqVar.setScale(0.55f, -0.55f);
            uqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
            this.f = new t01(spannableStringBuilder, 12.0f, null);
            this.J = this.f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
        } else if (userFull == null || (botverification = userFull.bot_verification) == null) {
            this.f = null;
            this.J += AndroidUtilities.dp(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            this.f = new t01(spannableStringBuilder2, 12.0f, null);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(botverification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) botverification.description);
            t01 t01Var3 = new t01(spannableStringBuilder2, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            t01Var3.a();
            t01Var3.n(5);
            Point point = AndroidUtilities.displaySize;
            t01Var3.q(Math.min(point.x, point.y) * 0.5f);
            t01Var3.s(this);
            this.f = t01Var3;
            this.J = this.f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
        }
        float max2 = Math.max(this.K, this.d.l());
        this.K = max2;
        float max3 = Math.max(max2, this.e.l());
        this.K = max3;
        float max4 = Math.max(max3, this.r);
        this.K = max4;
        this.K = Math.min(max4 + AndroidUtilities.dp(32.0f), i10);
    }

    public final void c(float f7, int i10) {
        if (Math.abs(this.L - f7) > 0.01f || i10 != this.M) {
            invalidate();
        }
        this.M = i10;
        this.L = f7;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.userInfoDidLoad;
        int i13 = this.a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.c;
            if (longValue == j3) {
                b(j3, MessagesController.getInstance(i13).getPeerSettings(this.c));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.c);
            this.I = commonChats;
            int count = commonChats.getCount();
            cb cbVar = this.n;
            if (cbVar == null || count <= 0) {
                b(this.c, MessagesController.getInstance(i13).getPeerSettings(this.c));
                requestLayout();
            } else {
                cbVar.b = new t01(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.i9 i9Var = this.G;
                i9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    i9Var.l(i14, this.I.chats.get(i14), i13);
                }
                i9Var.b(true, true);
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
        this.G.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.G.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f7 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.K) / 2.0f;
        float height = (getHeight() - this.J) / 2.0f;
        float width3 = (getWidth() + this.K) / 2.0f;
        float height2 = (getHeight() + this.J) / 2.0f;
        RectF rectF = this.w;
        rectF.set(width2, height, width3, height2);
        float f10 = 0.025f;
        float a2 = this.x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.M;
        float x10 = getX();
        float f11 = this.L;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        if (f6Var != null) {
            f6Var.l(x10, f11, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.j6.q(x10, f11, measuredWidth, i10);
        }
        float f12 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var));
        if (f6Var != null ? f6Var.m0() : org.telegram.ui.ActionBar.j6.a1()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", f6Var));
        }
        float f13 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.J) / 2.0f);
        float A = com.google.android.gms.internal.vision.e2.A(getHeight(), this.J, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = A + AndroidUtilities.dp(14.0f);
        t01 t01Var = this.d;
        t01Var.p = this.K - AndroidUtilities.dp(32.0f);
        t01Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j3 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        t01 t01Var2 = this.e;
        t01Var2.p = this.K - AndroidUtilities.dp(32.0f);
        t01Var2.c(width - (this.e.l() / 2.0f), this.e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.e.j() + AndroidUtilities.dp(11.0f));
        float j10 = this.e.j() + AndroidUtilities.dp(11.0f) + j3;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f13, AndroidUtilities.dp(7.0f));
                j10 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            cb cbVar = (cb) arrayList.get(i11);
            float dp2 = (width - (this.K / f7)) + AndroidUtilities.dp(f12) + this.s;
            float f14 = j10;
            t01 t01Var3 = cbVar.a;
            boolean z10 = cbVar.c;
            RectF rectF2 = cbVar.d;
            float f15 = dp2 - t01Var3.c;
            float dp3 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f);
            t01Var3.p = (dp3 - f15) - AndroidUtilities.dp(7.66f);
            t01Var3.c(f15, t01Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f) + cbVar.b.c;
            org.telegram.ui.Components.i9 i9Var = this.G;
            Drawable drawable = this.H;
            rectF2.set(dp4, f14, dp5 + (z10 ? i9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) : 0.0f), cbVar.b.j() + f14);
            if (this.n == cbVar) {
                RectF rectF3 = this.y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.F.a(f10);
                canvas.scale(a10, a10, rectF3.centerX(), cbVar.b.j() / 2.0f);
                z zVar = this.E;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f14), (int) rectF3.right, (int) (rectF3.bottom - f14));
                    zVar.draw(canvas);
                }
            }
            t01 t01Var4 = cbVar.b;
            t01Var4.p = (((this.K / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            t01Var4.c(dp3, cbVar.b.j() / 2.0f, 1.0f, -1, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f) + cbVar.b.c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                i9Var.i(canvas);
                canvas.translate(i9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j10 = AndroidUtilities.dp(14.0f) + f14;
            i11++;
            f7 = 2.0f;
            f10 = 0.025f;
            f13 = 0.0f;
            f12 = 16.0f;
        }
        if (this.f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            t01 t01Var5 = this.f;
            if (t01Var5.f > 1) {
                t01Var5.c(width - (t01Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                t01Var5.p = this.K - AndroidUtilities.dp(32.0f);
                t01Var5.c(width - (this.f.l() / 2.0f), this.f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.a2.b(16.0f, (int) this.J, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rj rjVar;
        boolean z10 = this.n != null && this.y.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = !z10 && this.w.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        z zVar = this.E;
        xc xcVar = this.F;
        xc xcVar2 = this.x;
        if (action == 0) {
            xcVar2.c(z11);
            xcVar.c(z10);
            zVar.setState(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (xcVar2.h) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if ((U instanceof eo) && (rjVar = ((eo) U).a1) != null) {
                    rjVar.e(true, false);
                }
            } else if (xcVar.h) {
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.c;
                    if (j3 >= 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    bundle.putBoolean("open_common", true);
                    U2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            xcVar.c(false);
            xcVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            xcVar.c(false);
            xcVar2.c(false);
            zVar.setState(new int[0]);
        }
        return xcVar.h || xcVar2.h;
    }

    public void setAnimating(boolean z10) {
        this.N = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }
}
