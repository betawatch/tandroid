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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lj;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xa extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int L = 0;
    public final z B;
    public final rc C;
    public final org.telegram.ui.Components.c9 D;
    public final Drawable E;
    public MessagesController.CommonChatsList F;
    public float G;
    public float H;
    public float I;
    public int J;
    public boolean K;
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public long c;
    public k01 d;
    public k01 e;
    public k01 f;
    public final ArrayList h;
    public wa n;
    public float r;
    public float s;
    public float v;
    public final RectF w;
    public final rc x;
    public final RectF y;

    public xa(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = new ArrayList();
        this.w = new RectF();
        this.x = new rc(this);
        this.y = new RectF();
        this.C = new rc(this);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.D = c9Var;
        this.a = i10;
        this.b = g6Var;
        z Y = org.telegram.ui.ActionBar.k6.Y(822083583, 8, 8);
        this.B = Y;
        Y.setCallback(this);
        c9Var.p = AndroidUtilities.dp(50.0f);
        c9Var.o = AndroidUtilities.dp(13.0f);
        c9Var.x = false;
        c9Var.s = AndroidUtilities.dp(13.0f);
        c9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final wa a(CharSequence charSequence, String str, boolean z4) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.G += AndroidUtilities.dp(7.0f);
        }
        wa waVar = new wa(str, charSequence, z4);
        arrayList.add(waVar);
        this.G += AndroidUtilities.dp(14.0f);
        this.s = Math.max(this.s, waVar.a.c);
        this.v = Math.max(this.v, waVar.b.c + (z4 ? AndroidUtilities.dp(38.0f) : 0));
        return waVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        TL_bots.botVerification botverification;
        this.c = j10;
        this.H = 0.0f;
        this.G = 0.0f;
        this.s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.G += AndroidUtilities.dp(14.0f);
        k01 k01Var = new k01(DialogObject.getName(j10), 14.0f, AndroidUtilities.bold());
        this.d = k01Var;
        this.G = k01Var.j() + AndroidUtilities.dp(3.0f) + this.G;
        int i11 = this.a;
        k01 k01Var2 = new k01(LocaleController.getString(ContactsController.getInstance(i11).isContact(j10) ? R.string.ContactInfoIsContact : R.string.ContactInfoIsNotContact), 14.0f, null);
        this.e = k01Var2;
        this.G = k01Var2.j() + AndroidUtilities.dp(11.0f) + this.G;
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
            this.F = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.F.chats.size());
                org.telegram.ui.Components.c9 c9Var = this.D;
                c9Var.k(min);
                for (int i12 = 0; i12 < Math.min(3, this.F.chats.size()); i12++) {
                    c9Var.l(i12, this.F.chats.get(i12), i11);
                }
                c9Var.b(true, true);
            } else {
                this.F = null;
                this.n = null;
            }
        } else {
            this.F = null;
            this.n = null;
        }
        this.r = this.s + AndroidUtilities.dp(7.66f) + this.v;
        if (user == null || user.verified || UserObject.isService(user.id)) {
            this.f = null;
            this.G += AndroidUtilities.dp(14.0f);
        } else if (user.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
            oq oqVar = new oq(R.drawable.filled_info, 0);
            oqVar.setScale(0.55f, -0.55f);
            oqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
            this.f = new k01(spannableStringBuilder, 12.0f, null);
            this.G = this.f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.G;
        } else if (userFull == null || (botverification = userFull.bot_verification) == null) {
            this.f = null;
            this.G += AndroidUtilities.dp(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            this.f = new k01(spannableStringBuilder2, 12.0f, null);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(botverification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) botverification.description);
            k01 k01Var3 = new k01(spannableStringBuilder2, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            k01Var3.a();
            k01Var3.n(5);
            Point point = AndroidUtilities.displaySize;
            k01Var3.q(Math.min(point.x, point.y) * 0.5f);
            k01Var3.s(this);
            this.f = k01Var3;
            this.G = this.f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.G;
        }
        float max2 = Math.max(this.H, this.d.l());
        this.H = max2;
        float max3 = Math.max(max2, this.e.l());
        this.H = max3;
        float max4 = Math.max(max3, this.r);
        this.H = max4;
        this.H = Math.min(max4 + AndroidUtilities.dp(32.0f), i10);
    }

    public final void c(float f10, int i10) {
        if (Math.abs(this.I - f10) > 0.01f || i10 != this.J) {
            invalidate();
        }
        this.J = i10;
        this.I = f10;
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
            this.F = commonChats;
            int count = commonChats.getCount();
            wa waVar = this.n;
            if (waVar == null || count <= 0) {
                b(this.c, MessagesController.getInstance(i13).getPeerSettings(this.c));
                requestLayout();
            } else {
                waVar.b = new k01(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.F.chats.size());
                org.telegram.ui.Components.c9 c9Var = this.D;
                c9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.F.chats.size()); i14++) {
                    c9Var.l(i14, this.F.chats.get(i14), i13);
                }
                c9Var.b(true, true);
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
        this.D.g();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.D.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.H) / 2.0f;
        float height = (getHeight() - this.G) / 2.0f;
        float width3 = (getWidth() + this.H) / 2.0f;
        float height2 = (getHeight() + this.G) / 2.0f;
        RectF rectF = this.w;
        rectF.set(width2, height, width3, height2);
        float f11 = 0.025f;
        float a2 = this.x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.J;
        float x10 = getX();
        float f12 = this.I;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        if (g6Var != null) {
            g6Var.l(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.k6.q(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.T0("paintChatActionBackground", g6Var));
        if (g6Var != null ? g6Var.o0() : org.telegram.ui.ActionBar.k6.a1()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.T0("paintChatActionBackgroundDarken", g6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.G) / 2.0f);
        float x11 = e2.c.x(getHeight(), this.G, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = x11 + AndroidUtilities.dp(14.0f);
        k01 k01Var = this.d;
        k01Var.p = this.H - AndroidUtilities.dp(32.0f);
        k01Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j10 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        k01 k01Var2 = this.e;
        k01Var2.p = this.H - AndroidUtilities.dp(32.0f);
        k01Var2.c(width - (this.e.l() / 2.0f), this.e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.e.j() + AndroidUtilities.dp(11.0f));
        float j11 = this.e.j() + AndroidUtilities.dp(11.0f) + j10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f14, AndroidUtilities.dp(7.0f));
                j11 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            wa waVar = (wa) arrayList.get(i11);
            float dp2 = (width - (this.H / f10)) + AndroidUtilities.dp(f13) + this.s;
            float f15 = j11;
            k01 k01Var3 = waVar.a;
            boolean z4 = waVar.c;
            RectF rectF2 = waVar.d;
            float f16 = dp2 - k01Var3.c;
            float dp3 = (width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f);
            k01Var3.p = (dp3 - f16) - AndroidUtilities.dp(7.66f);
            k01Var3.c(f16, k01Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f) + waVar.b.c;
            org.telegram.ui.Components.c9 c9Var = this.D;
            Drawable drawable = this.E;
            rectF2.set(dp4, f15, dp5 + (z4 ? c9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) : 0.0f), waVar.b.j() + f15);
            if (this.n == waVar) {
                RectF rectF3 = this.y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.C.a(f11);
                canvas.scale(a10, a10, rectF3.centerX(), waVar.b.j() / 2.0f);
                z zVar = this.B;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f15), (int) rectF3.right, (int) (rectF3.bottom - f15));
                    zVar.draw(canvas);
                }
            }
            k01 k01Var4 = waVar.b;
            k01Var4.p = (((this.H / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            k01Var4.c(dp3, waVar.b.j() / 2.0f, 1.0f, -1, canvas);
            if (z4) {
                canvas.save();
                canvas.translate((width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.s + AndroidUtilities.dp(7.66f) + waVar.b.c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                c9Var.i(canvas);
                canvas.translate(c9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j11 = AndroidUtilities.dp(14.0f) + f15;
            i11++;
            f10 = 2.0f;
            f11 = 0.025f;
            f14 = 0.0f;
            f13 = 16.0f;
        }
        if (this.f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            k01 k01Var5 = this.f;
            if (k01Var5.f > 1) {
                k01Var5.c(width - (k01Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                k01Var5.p = this.H - AndroidUtilities.dp(32.0f);
                k01Var5.c(width - (this.f.l() / 2.0f), this.f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(16.0f, (int) this.G, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lj ljVar;
        boolean z4 = this.n != null && this.y.contains(motionEvent.getX(), motionEvent.getY());
        boolean z10 = !z4 && this.w.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        z zVar = this.B;
        rc rcVar = this.C;
        rc rcVar2 = this.x;
        if (action == 0) {
            rcVar2.c(z10);
            rcVar.c(z4);
            zVar.setState(z4 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (rcVar2.h) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if ((U instanceof xn) && (ljVar = ((xn) U).X0) != null) {
                    ljVar.e(true, false);
                }
            } else if (rcVar.h) {
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
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
            rcVar.c(false);
            rcVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
            rcVar2.c(false);
            zVar.setState(new int[0]);
        }
        return rcVar.h || rcVar2.h;
    }

    public void setAnimating(boolean z4) {
        this.K = z4;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.B || super.verifyDrawable(drawable);
    }
}
