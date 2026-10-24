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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class wj extends FrameLayout {
    public final w9 a;
    public final ci.k4 b;
    public final org.telegram.ui.ActionBar.n5 c;
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

    public wj(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        this.e = new h9(g6Var);
        w9 w9Var = new w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        addView(w9Var, w7.z5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        ci.k4 k4Var = new ci.k4(context, 4);
        this.b = k4Var;
        NotificationCenter.listenEmojiLoading(k4Var);
        org.telegram.ui.ActionBar.r6.Z(k4Var, org.telegram.ui.ActionBar.k6.j5, g6Var);
        k4Var.setTypeface(AndroidUtilities.bold());
        k4Var.setTextSize(16);
        k4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(k4Var, w7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.q5, g6Var);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(n5Var, w7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        xp xpVar = new xp(context, 21, g6Var);
        this.d = xpVar;
        xpVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        addView(xpVar, w7.z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, vj vjVar, boolean z10) {
        w9 w9Var = this.a;
        ci.k4 k4Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            k4Var.l("", false);
            this.c.l("", false);
            w9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z10;
            setWillNotDraw(!z10);
            h9 h9Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                h9Var.m(this.x, user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    h9Var.n(this.h, charSequence2.toString(), null);
                } else {
                    h9Var.n(this.h, "#", null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.w = null;
                k4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.w = UserObject.getUserName(user3);
                } else {
                    this.w = "";
                }
                k4Var.l(this.w, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                w9Var.e(user4, h9Var);
            } else {
                w9Var.setImageDrawable(h9Var);
            }
        }
        Utilities.globalQueue.postRunnable(new ee(10, this, vjVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
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
