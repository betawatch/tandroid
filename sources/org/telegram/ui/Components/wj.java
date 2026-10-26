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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wj extends FrameLayout {
    public final y9 a;
    public final di.l4 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final zp d;
    public final j9 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String v;
    public String w;
    public final int x;
    public boolean y;

    public wj(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        this.e = new j9(u6Var);
        y9 y9Var = new y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        addView(y9Var, gb1.h(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        di.l4 l4Var = new di.l4(context, 4);
        this.b = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        org.telegram.ui.ActionBar.f7.Y(l4Var, org.telegram.ui.ActionBar.y6.j5, u6Var);
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setTextSize(16);
        l4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(l4Var, gb1.h(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.c = b6Var;
        b6Var.setTextSize(13);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.q5, u6Var);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(b6Var, gb1.h(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        zp zpVar = new zp(context, 21, u6Var);
        this.d = zpVar;
        zpVar.b(-1, org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.k7);
        zpVar.setDrawUnchecked(false);
        zpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        addView(zpVar, gb1.h(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, vj vjVar, boolean z10) {
        y9 y9Var = this.a;
        di.l4 l4Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            l4Var.l("", false);
            this.c.l("", false);
            y9Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.y = z10;
            setWillNotDraw(!z10);
            j9 j9Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                j9Var.m(this.x, user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                if (charSequence2 != null) {
                    j9Var.n(this.h, charSequence2.toString(), null);
                } else {
                    j9Var.n(this.h, "#", null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                this.w = null;
                l4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                if (user3 != null) {
                    this.w = UserObject.getUserName(user3);
                } else {
                    this.w = "";
                }
                l4Var.l(this.w, false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                y9Var.f(user4, j9Var);
            } else {
                y9Var.setImageDrawable(j9Var);
            }
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.ip(20, this, vjVar));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
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
