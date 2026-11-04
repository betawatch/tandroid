package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public boolean F;
    public final int G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final org.telegram.ui.ActionBar.e6 N;
    public final org.telegram.ui.Components.u5 O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public vg.x0 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final org.telegram.ui.Components.k9 a;
    public final ei.e4 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final wo d;
    public final org.telegram.ui.Components.u8 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int w;
    public final int x;
    public String y;

    public h4(Context context, int i3, int i10, boolean z10) {
        this(i3, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.u8 a(boolean z10) {
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.g(8);
        u8Var.p = z10 ? 0.8f : 1.1f;
        u8Var.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a8, false));
        return u8Var;
    }

    public static xp b(Context context, boolean z10) {
        xp xpVar = new xp(new gi.k3(new vg.x0(org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.zk, -1, -1, null), 5), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            xpVar.e = L;
            xpVar.f = L2;
        }
        return xpVar;
    }

    public final void c(boolean z10, boolean z11) {
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z10, z11);
            return;
        }
        if (this.w != 2 || this.I == z10) {
            return;
        }
        this.I = z10;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new r(this, 3));
            this.H.addListener(new ii.v3(this, 24));
            this.H.setDuration(180L);
            this.H.setInterpolator(xq.g);
            this.H.start();
        } else {
            float f10 = this.I ? 0.82f : 1.0f;
            org.telegram.ui.Components.k9 k9Var = this.a;
            k9Var.setScaleX(f10);
            k9Var.setScaleY(this.I ? 0.82f : 1.0f);
            this.J = this.I ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.F = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            org.telegram.ui.Components.k9 k9Var = this.a;
            float height = (k9Var.getHeight() / 2.0f) + k9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (k9Var.getWidth() / 2.0f) + k9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.k6.t0;
            int i3 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.N;
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.k6.t0);
            if (this.R == null) {
                if (this.T == null) {
                    this.T = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.N);
                }
                this.T.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.T.f;
            } else {
                if (this.V == null) {
                    this.V = new Paint();
                }
                this.V.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c8, e6Var));
                paint = this.V;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
            if (this.U == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.U = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.U.setBounds((int) (width - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.U.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.U.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
            this.U.setAlpha((int) (d * 255.0f));
            this.U.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.F = z10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3) {
        String str;
        TLRPC.Chat chat;
        String str2;
        String str3;
        TLRPC.UserStatus userStatus;
        CharSequence charSequence;
        char c2;
        Object obj = this.f;
        if (obj == null || this.r || this.s) {
            return;
        }
        boolean z10 = obj instanceof String;
        org.telegram.ui.ActionBar.e6 e6Var = this.N;
        boolean z11 = this.L;
        wo woVar = this.d;
        org.telegram.ui.Components.k9 k9Var = this.a;
        ei.e4 e4Var = this.b;
        org.telegram.ui.Components.u8 u8Var = this.e;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (z10) {
            ((FrameLayout.LayoutParams) e4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(15.0f);
            ViewGroup.LayoutParams layoutParams = k9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = k9Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (woVar != null) {
                ((FrameLayout.LayoutParams) woVar.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(25.0f);
                if (bd.a0) {
                    ((FrameLayout.LayoutParams) woVar.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) woVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            char c10 = 65535;
            switch (str4.hashCode()) {
                case -1716307998:
                    if (str4.equals("archived")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str4.equals("groups")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str4.equals("non_contacts")) {
                        c2 = 2;
                        c10 = c2;
                        break;
                    }
                    break;
                case -567451565:
                    if (str4.equals("contacts")) {
                        c2 = 3;
                        c10 = c2;
                        break;
                    }
                    break;
                case -268161860:
                    if (str4.equals("new_chats")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str4.equals("bots")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str4.equals("read")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str4.equals("muted")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str4.equals("existing_chats")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str4.equals("channels")) {
                        c10 = '\t';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    u8Var.g(11);
                    break;
                case 1:
                    u8Var.g(6);
                    break;
                case 2:
                    u8Var.g(5);
                    break;
                case 3:
                    u8Var.g(4);
                    break;
                case 4:
                    u8Var.g(24);
                    break;
                case 5:
                    u8Var.g(8);
                    break;
                case 6:
                    u8Var.g(10);
                    break;
                case 7:
                    u8Var.g(9);
                    break;
                case '\b':
                    u8Var.g(23);
                    break;
                case '\t':
                    u8Var.g(7);
                    break;
            }
            this.y = null;
            e4Var.l(this.h, true);
            k5Var.l(null, false);
            k9Var.h(null, "50_50", u8Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) e4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) e4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = k9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = k9Var.getLayoutParams();
            int L2 = org.telegram.messenger.g0.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (woVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(29.0f);
                int i10 = this.G;
                layoutParams5.topMargin = L3 + i10;
                if (bd.a0) {
                    ((FrameLayout.LayoutParams) woVar.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + i10;
                } else {
                    ((FrameLayout.LayoutParams) woVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(40.0f) + i10;
                }
            }
            Object obj2 = this.f;
            if (!(obj2 instanceof TLRPC.User)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i3 != 0) {
                    int i11 = hp.C8;
                    boolean z12 = ((i3 & 2) == 0 || fileLocation == null) ? false : true;
                    if (z12 || this.h != null || (str2 = this.y) == null || (i3 & 1) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        return;
                    }
                } else {
                    str = null;
                }
                u8Var.q(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    e4Var.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    e4Var.l(str, false);
                }
                if (this.n == null) {
                    int i12 = org.telegram.ui.ActionBar.k6.y6;
                    k5Var.setTag(Integer.valueOf(i12));
                    if (z11) {
                        i12 = org.telegram.ui.ActionBar.k6.ch;
                    }
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i12, null);
                    k5Var.setEmojiColor(k5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!org.telegram.messenger.t3.T(chat2) || chat2.megagroup) {
                            k5Var.l(bd.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            k5Var.l(bd.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        k5Var.l(bd.M0(2131748650, null), false);
                    } else if (org.telegram.messenger.t3.t0(chat2)) {
                        if (!org.telegram.messenger.t3.T(chat2) || chat2.megagroup) {
                            k5Var.l(bd.M0(2131748646, null), false);
                        } else {
                            k5Var.l(bd.M0(2131752318, null), false);
                        }
                    } else if (!org.telegram.messenger.t3.T(chat2) || chat2.megagroup) {
                        k5Var.l(bd.M0(2131748649, null), false);
                    } else {
                        k5Var.l(bd.M0(2131752329, null), false);
                    }
                }
                k9Var.e(chat2, u8Var);
                chat = chat2;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    k5Var.l(charSequence, true);
                    int i13 = org.telegram.ui.ActionBar.k6.y6;
                    k5Var.setTag(Integer.valueOf(i13));
                    if (z11) {
                        i13 = org.telegram.ui.ActionBar.k6.ch;
                    }
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i13, e6Var);
                    k5Var.setEmojiColor(k5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.M && l10.B(user)) {
                e4Var.l(bd.M0(2131745911, null), true);
                k5Var.l(null, false);
                u8Var.g(1);
                k9Var.j(null, "50_50", u8Var, user);
                ((FrameLayout.LayoutParams) e4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i3 != 0) {
                int i14 = hp.C8;
                boolean z13 = ((i3 & 2) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z13 && (i3 & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.E) {
                        z13 = true;
                    }
                }
                if (z13 || this.h != null || this.y == null || (i3 & 1) == 0) {
                    str3 = null;
                } else {
                    str3 = l10.p(user);
                    if (!str3.equals(this.y)) {
                        z13 = true;
                    }
                }
                if (!z13) {
                    return;
                }
            } else {
                str3 = null;
            }
            u8Var.r(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.E = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                e4Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = l10.p(user);
                }
                this.y = str3;
                e4Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i15 = org.telegram.ui.ActionBar.k6.y6;
                    k5Var.setTag(Integer.valueOf(i15));
                    if (z11) {
                        i15 = org.telegram.ui.ActionBar.k6.ch;
                    }
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i15, e6Var);
                    k5Var.l(bd.M0(2131753156, null), false);
                } else {
                    long j10 = user.id;
                    int i16 = this.x;
                    if (j10 == h10.i(i16).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i16).getCurrentTime()) || hp.s1(i16).a0.containsKey(Long.valueOf(user.id)))) {
                        int i17 = org.telegram.ui.ActionBar.k6.n6;
                        k5Var.setTag(Integer.valueOf(i17));
                        if (z11) {
                            i17 = org.telegram.ui.ActionBar.k6.dh;
                        }
                        org.telegram.ui.ActionBar.r6.Y(k5Var, i17, e6Var);
                        k5Var.l(bd.M0(2131747834, null), false);
                    } else {
                        int i18 = org.telegram.ui.ActionBar.k6.y6;
                        k5Var.setTag(Integer.valueOf(i18));
                        if (z11) {
                            i18 = org.telegram.ui.ActionBar.k6.ch;
                        }
                        org.telegram.ui.ActionBar.r6.Y(k5Var, i18, e6Var);
                        k5Var.l(bd.d0(i16, user, null, null), false);
                    }
                }
                k5Var.setEmojiColor(k5Var.getTextColor());
            }
            k9Var.e(user, u8Var);
        }
        chat = null;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
        charSequence = this.n;
        if (charSequence != null) {
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.S) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.R;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = hp.s1(this.x).J2(((TLRPC.User) this.f).id);
            }
        }
        boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z10 && this.Q == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.P = z10;
        this.Q = org.telegram.messenger.m5.k(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public wo getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.O.d(this.P);
        org.telegram.ui.ActionBar.e6 e6Var = this.N;
        if (d <= 0.0f && this.w == 2 && (this.I || this.J > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W6, e6Var);
            Paint paint = this.K;
            paint.setColor(w02);
            org.telegram.ui.Components.k9 k9Var = this.a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.J) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.F) {
            boolean z10 = bd.a0;
            int i3 = this.G;
            int L = org.telegram.messenger.g0.L(z10 ? 0.0f : i3 + 72);
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(bd.a0 ? i3 + 72 : 0.0f);
            if (!this.L) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            } else {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ug, e6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.d;
        if (woVar != null ? woVar.a.q : this.I) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z10) {
        wo woVar = this.d;
        if (woVar != null) {
            woVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = k5Var.getTextColor()) != this.W) {
                    this.W = textColor;
                    k5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.a;
        if (k9Var != null) {
            k9Var.invalidate();
        }
        try {
            if (this.s && k9Var != null) {
                Drawable t10 = k9Var.getImageReceiver().t();
                if (t10 instanceof org.telegram.ui.Components.u8) {
                    ((org.telegram.ui.Components.u8) t10).i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a8, false));
                    k9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.x = h10.t0;
        this.O = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.N = e6Var;
        this.w = i3;
        this.L = z11;
        this.F = false;
        this.G = i10;
        this.M = z10;
        this.e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = bd.a0;
        addView(k9Var, mf.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        ei.e4 e4Var = new ei.e4(context, 1);
        this.b = e4Var;
        hs.i(e4Var);
        org.telegram.ui.ActionBar.r6.Y(e4Var, z11 ? org.telegram.ui.ActionBar.k6.bh : org.telegram.ui.ActionBar.k6.G6, e6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        e4Var.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z13 = bd.a0;
        addView(e4Var, mf.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((bd.a0 ? 5 : 3) | 48);
        boolean z14 = bd.a0;
        addView(k5Var, mf.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i3 == 1) {
            wo woVar = new wo(21, context, e6Var);
            this.d = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z15 = bd.a0;
            addView(woVar, mf.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i3 == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
