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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xj extends FrameLayout {
    public final u9 a;
    public final ai.a6 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final np d;
    public final f9 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String v;
    public String w;
    public final int x;
    public boolean y;

    public xj(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        this.e = new f9(e6Var);
        u9 u9Var = new u9(context);
        this.a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        addView(u9Var, w7.x5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 14.0f, 9.0f, z10 ? 14.0f : 0.0f, 0.0f));
        ai.a6 a6Var = new ai.a6(context, 4);
        this.b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextSize(16);
        a6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(a6Var, w7.x5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 12.0f, z11 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q5, e6Var));
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(j5Var, w7.x5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 28.0f : 72.0f, 36.0f, z12 ? 72.0f : 28.0f, 0.0f));
        np npVar = new np(context, 21, e6Var);
        this.d = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        addView(npVar, w7.x5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 44.0f, 37.0f, z13 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, wj wjVar, boolean z10) {
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
        Utilities.globalQueue.postRunnable(new oh(6, this, wjVar));
    }

    public final void b() {
        TLRPC.User user = this.f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        f9 f9Var = this.e;
        if (user != null) {
            f9Var.m(this.x, user);
            TLRPC.UserStatus userStatus = this.f.status;
        } else {
            CharSequence charSequence = this.n;
            if (charSequence != null) {
                f9Var.n(this.h, charSequence.toString(), null);
            } else {
                f9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.n;
        ai.a6 a6Var = this.b;
        if (charSequence2 != null) {
            this.w = null;
            a6Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                this.w = UserObject.getUserName(user2);
            } else {
                this.w = "";
            }
            a6Var.l(this.w, false);
        }
        setStatus(this.r);
        TLRPC.User user3 = this.f;
        u9 u9Var = this.a;
        if (user3 != null) {
            u9Var.e(user3, f9Var);
        } else {
            u9Var.setImageDrawable(f9Var);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
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
                Utilities.globalQueue.postRunnable(new vj(this, 0));
            }
        }
    }
}
