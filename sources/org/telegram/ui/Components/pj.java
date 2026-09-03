package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pj extends FrameLayout {
    public final p9 a;
    public final ig.c b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final kp d;
    public final z8 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String v;
    public String w;
    public final int x;
    public boolean y;

    public pj(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        this.e = new z8(f6Var);
        p9 p9Var = new p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z4 = LocaleController.isRTL;
        addView(p9Var, k7.b6.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 14.0f, 9.0f, z4 ? 14.0f : 0.0f, 0.0f));
        ig.c cVar = new ig.c(context, 5);
        this.b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z10 = LocaleController.isRTL;
        addView(cVar, k7.b6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 28.0f : 72.0f, 12.0f, z10 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q5, f6Var));
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(k5Var, k7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 36.0f, z11 ? 72.0f : 28.0f, 0.0f));
        kp kpVar = new kp(context, 21, f6Var);
        this.d = kpVar;
        kpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        kpVar.setDrawUnchecked(false);
        kpVar.setDrawBackgroundAsArc(3);
        boolean z12 = LocaleController.isRTL;
        addView(kpVar, k7.b6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 44.0f, 37.0f, z12 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, oj ojVar, boolean z4) {
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            this.b.l("", false);
            this.c.l("", false);
            this.a.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z4;
            setWillNotDraw(!z4);
            b();
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.np(23, this, ojVar));
    }

    public final void b() {
        TLRPC.User user = this.f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        z8 z8Var = this.e;
        if (user != null) {
            z8Var.m(this.x, user);
            TLRPC.UserStatus userStatus = this.f.status;
        } else {
            CharSequence charSequence = this.n;
            if (charSequence != null) {
                z8Var.n(this.h, charSequence.toString(), null);
            } else {
                z8Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.n;
        ig.c cVar = this.b;
        if (charSequence2 != null) {
            this.w = null;
            cVar.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                this.w = UserObject.getUserName(user2);
            } else {
                this.w = "";
            }
            cVar.l(this.w, false);
        }
        setStatus(this.r);
        TLRPC.User user3 = this.f;
        p9 p9Var = this.a;
        if (user3 != null) {
            p9Var.e(user3, z8Var);
        } else {
            p9Var.setImageDrawable(z8Var);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.y ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.r = charSequence;
        if (charSequence != null) {
            this.c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.s != this.f && (str = this.v) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.globalQueue.postRunnable(new nj(this, 0));
            }
        }
    }
}
