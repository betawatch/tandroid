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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rj extends FrameLayout {
    public final p9 a;
    public final jg.c b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final np d;
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

    public rj(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.x = UserConfig.selectedAccount;
        this.e = new z8(g6Var);
        p9 p9Var = new p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z4 = LocaleController.isRTL;
        addView(p9Var, k7.c6.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 14.0f, 9.0f, z4 ? 14.0f : 0.0f, 0.0f));
        jg.c cVar = new jg.c(context, 5);
        this.b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        cVar.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z10 = LocaleController.isRTL;
        addView(cVar, k7.c6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 28.0f : 72.0f, 12.0f, z10 ? 72.0f : 28.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q5, g6Var));
        l5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(l5Var, k7.c6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 28.0f : 72.0f, 36.0f, z11 ? 72.0f : 28.0f, 0.0f));
        np npVar = new np(context, 21, g6Var);
        this.d = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        boolean z12 = LocaleController.isRTL;
        addView(npVar, k7.c6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 44.0f, 37.0f, z12 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, qj qjVar, boolean z4) {
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
        Utilities.globalQueue.postRunnable(new org.telegram.ui.mp(23, this, qjVar));
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
        jg.c cVar = this.b;
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
                Utilities.globalQueue.postRunnable(new pj(this, 0));
            }
        }
    }
}
