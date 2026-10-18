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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class wj extends FrameLayout {
    public final w9 a;
    public final ci.l4 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final xp d;
    public final h9 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String v;
    public String w;
    public final int x;
    public boolean y;

    public wj(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        this.e = new h9(d6Var);
        w9 w9Var = new w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        addView(w9Var, w7.z5.a(46.0f, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f, 46, (z10 ? 5 : 3) | 48));
        ci.l4 l4Var = new ci.l4(context, 4);
        this.b = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        l4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setTextSize(16);
        l4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(l4Var, w7.z5.a(20.0f, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f, -1, (z11 ? 5 : 3) | 48));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q5, d6Var));
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(j5Var, w7.z5.a(20.0f, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f, -1, (z12 ? 5 : 3) | 48));
        xp xpVar = new xp(context, 21, d6Var);
        this.d = xpVar;
        xpVar.b(-1, org.telegram.ui.ActionBar.h6.d6, org.telegram.ui.ActionBar.h6.k7);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        addView(xpVar, w7.z5.a(24.0f, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f, 24, (z13 ? 5 : 3) | 48));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, vj vjVar, boolean z10) {
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
            this.y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new ee(10, this, vjVar));
    }

    public final void b() {
        TLRPC.User user = this.f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        h9 h9Var = this.e;
        if (user != null) {
            h9Var.m(this.x, user);
            TLRPC.UserStatus userStatus = this.f.status;
        } else {
            CharSequence charSequence = this.n;
            if (charSequence != null) {
                h9Var.n(this.h, charSequence.toString(), null);
            } else {
                h9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.n;
        ci.l4 l4Var = this.b;
        if (charSequence2 != null) {
            this.w = null;
            l4Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                this.w = UserObject.getUserName(user2);
            } else {
                this.w = "";
            }
            l4Var.l(this.w, false);
        }
        setStatus(this.r);
        TLRPC.User user3 = this.f;
        w9 w9Var = this.a;
        if (user3 != null) {
            w9Var.e(user3, h9Var);
        } else {
            w9Var.setImageDrawable(h9Var);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.k0);
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
                Utilities.globalQueue.postRunnable(new uj(this, 0));
            }
        }
    }
}
