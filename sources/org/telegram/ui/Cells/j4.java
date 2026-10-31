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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.p6 M;
    public final org.telegram.ui.Components.t5 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public kg.k1 S;
    public Drawable T;
    public Paint U;
    public int V;
    public final org.telegram.ui.Components.g9 a;
    public final og.c b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final ep d;
    public final org.telegram.ui.Components.r8 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int w;
    public final int x;
    public String y;

    public j4(Context context, int i10, int i11, boolean z10) {
        this(i10, i11, context, null, z10, false);
    }

    public static org.telegram.ui.Components.r8 a(boolean z10) {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.g(8);
        r8Var.p = z10 ? 0.8f : 1.1f;
        r8Var.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a8, false));
        return r8Var;
    }

    public static eq b(Context context, boolean z10) {
        eq eqVar = new eq(new jg.x0(new kg.k1(org.telegram.ui.ActionBar.t6.Ak, org.telegram.ui.ActionBar.t6.zk, -1, -1, null), 5), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.i0.L(18.0f);
            int L2 = org.telegram.messenger.i0.L(18.0f);
            eqVar.e = L;
            eqVar.f = L2;
        }
        return eqVar;
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.d;
        if (epVar != null) {
            epVar.a(z10, z11);
            return;
        }
        if (this.w != 2 || this.H == z10) {
            return;
        }
        this.H = z10;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new r(this, 3));
            this.G.addListener(new org.telegram.ui.s9(this, 4));
            this.G.setDuration(180L);
            this.G.setInterpolator(gr.g);
            this.G.start();
        } else {
            float f7 = this.H ? 0.82f : 1.0f;
            org.telegram.ui.Components.g9 g9Var = this.a;
            g9Var.setScaleX(f7);
            g9Var.setScaleY(this.H ? 0.82f : 1.0f);
            this.I = this.H ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void d(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.f = obj;
        this.n = charSequence2;
        this.h = charSequence;
        this.E = false;
        this.r = false;
        this.s = false;
        f(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float d = this.N.d(this.O);
        if (d > 0.0f) {
            org.telegram.ui.Components.g9 g9Var = this.a;
            float height = (g9Var.getHeight() / 2.0f) + g9Var.getY() + org.telegram.messenger.i0.L(18.0f);
            float width = (g9Var.getWidth() / 2.0f) + g9Var.getX() + org.telegram.messenger.i0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.t6.t0;
            int i10 = org.telegram.ui.ActionBar.t6.d6;
            org.telegram.ui.ActionBar.p6 p6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.i0.L(11.33f) * d, org.telegram.ui.ActionBar.t6.t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, this.M);
                }
                this.S.d((int) (width - org.telegram.messenger.i0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.i0.L(10.0f)), (int) (org.telegram.messenger.i0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.i0.L(10.0f) + height));
                paint = this.S.f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.c8, p6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.i0.L(10.0f) * d, paint);
            if (this.T == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.T = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.T.setBounds((int) (width - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.T.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.T.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
            this.T.setAlpha((int) (d * 255.0f));
            this.T.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(TLObject tLObject, String str, String str2, boolean z10) {
        d(tLObject, str, str2);
        this.E = z10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10) {
        String str;
        TLRPC.Chat chat;
        String str2;
        String str3;
        TLRPC.UserStatus userStatus;
        CharSequence charSequence;
        char c10;
        Object obj = this.f;
        if (obj == null || this.r || this.s) {
            return;
        }
        boolean z10 = obj instanceof String;
        org.telegram.ui.ActionBar.p6 p6Var = this.M;
        boolean z11 = this.K;
        ep epVar = this.d;
        org.telegram.ui.Components.g9 g9Var = this.a;
        og.c cVar = this.b;
        org.telegram.ui.Components.r8 r8Var = this.e;
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        if (z10) {
            ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(15.0f);
            ViewGroup.LayoutParams layoutParams = g9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = g9Var.getLayoutParams();
            int L = org.telegram.messenger.i0.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (epVar != null) {
                ((FrameLayout.LayoutParams) epVar.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(25.0f);
                if (cd.X) {
                    ((FrameLayout.LayoutParams) epVar.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) epVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            char c11 = 65535;
            switch (str4.hashCode()) {
                case -1716307998:
                    if (str4.equals("archived")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str4.equals("groups")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str4.equals("non_contacts")) {
                        c10 = 2;
                        c11 = c10;
                        break;
                    }
                    break;
                case -567451565:
                    if (str4.equals("contacts")) {
                        c10 = 3;
                        c11 = c10;
                        break;
                    }
                    break;
                case -268161860:
                    if (str4.equals("new_chats")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str4.equals("bots")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str4.equals("read")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str4.equals("muted")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str4.equals("existing_chats")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str4.equals("channels")) {
                        c11 = '\t';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    r8Var.g(11);
                    break;
                case 1:
                    r8Var.g(6);
                    break;
                case 2:
                    r8Var.g(5);
                    break;
                case 3:
                    r8Var.g(4);
                    break;
                case 4:
                    r8Var.g(24);
                    break;
                case 5:
                    r8Var.g(8);
                    break;
                case 6:
                    r8Var.g(10);
                    break;
                case 7:
                    r8Var.g(9);
                    break;
                case '\b':
                    r8Var.g(23);
                    break;
                case '\t':
                    r8Var.g(7);
                    break;
            }
            this.y = null;
            cVar.l(this.h, true);
            u5Var.l(null, false);
            g9Var.h(null, "50_50", r8Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = g9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = g9Var.getLayoutParams();
            int L2 = org.telegram.messenger.i0.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (epVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) epVar.getLayoutParams();
                int L3 = org.telegram.messenger.i0.L(29.0f);
                int i11 = this.F;
                layoutParams5.topMargin = L3 + i11;
                if (cd.X) {
                    ((FrameLayout.LayoutParams) epVar.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(40.0f) + i11;
                } else {
                    ((FrameLayout.LayoutParams) epVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(40.0f) + i11;
                }
            }
            Object obj2 = this.f;
            if (!(obj2 instanceof TLRPC.User)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i10 != 0) {
                    int i12 = vp.D8;
                    boolean z12 = ((i10 & 2) == 0 || fileLocation == null) ? false : true;
                    if (z12 || this.h != null || (str2 = this.y) == null || (i10 & 1) == 0) {
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
                r8Var.q(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    cVar.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    cVar.l(str, false);
                }
                if (this.n == null) {
                    int i13 = org.telegram.ui.ActionBar.t6.y6;
                    u5Var.setTag(Integer.valueOf(i13));
                    if (z11) {
                        i13 = org.telegram.ui.ActionBar.t6.ch;
                    }
                    org.telegram.ui.ActionBar.a7.Y(u5Var, i13, null);
                    u5Var.setEmojiColor(u5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!org.telegram.messenger.w3.T(chat2) || chat2.megagroup) {
                            u5Var.l(cd.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            u5Var.l(cd.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        u5Var.l(cd.L0(2131748657, null), false);
                    } else if (org.telegram.messenger.w3.t0(chat2)) {
                        if (!org.telegram.messenger.w3.T(chat2) || chat2.megagroup) {
                            u5Var.l(cd.L0(2131748653, null), false);
                        } else {
                            u5Var.l(cd.L0(2131752318, null), false);
                        }
                    } else if (!org.telegram.messenger.w3.T(chat2) || chat2.megagroup) {
                        u5Var.l(cd.L0(2131748656, null), false);
                    } else {
                        u5Var.l(cd.L0(2131752329, null), false);
                    }
                }
                g9Var.e(chat2, r8Var);
                chat = chat2;
                g9Var.setRoundRadius(org.telegram.messenger.i0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    u5Var.l(charSequence, true);
                    int i14 = org.telegram.ui.ActionBar.t6.y6;
                    u5Var.setTag(Integer.valueOf(i14));
                    if (z11) {
                        i14 = org.telegram.ui.ActionBar.t6.ch;
                    }
                    org.telegram.ui.ActionBar.a7.Y(u5Var, i14, p6Var);
                    u5Var.setEmojiColor(u5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.L && h20.B(user)) {
                cVar.l(cd.L0(2131745918, null), true);
                u5Var.l(null, false);
                r8Var.g(1);
                g9Var.j(null, "50_50", r8Var, user);
                ((FrameLayout.LayoutParams) cVar.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i10 != 0) {
                int i15 = vp.D8;
                boolean z13 = ((i10 & 2) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z13 && (i10 & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.D) {
                        z13 = true;
                    }
                }
                if (z13 || this.h != null || this.y == null || (i10 & 1) == 0) {
                    str3 = null;
                } else {
                    str3 = h20.p(user);
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
            r8Var.r(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.D = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                cVar.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = h20.p(user);
                }
                this.y = str3;
                cVar.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i16 = org.telegram.ui.ActionBar.t6.y6;
                    u5Var.setTag(Integer.valueOf(i16));
                    if (z11) {
                        i16 = org.telegram.ui.ActionBar.t6.ch;
                    }
                    org.telegram.ui.ActionBar.a7.Y(u5Var, i16, p6Var);
                    u5Var.l(cd.L0(2131753156, null), false);
                } else {
                    long j10 = user.id;
                    int i17 = this.x;
                    if (j10 == d20.i(i17).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i17).getCurrentTime()) || vp.r1(i17).Z.containsKey(Long.valueOf(user.id)))) {
                        int i18 = org.telegram.ui.ActionBar.t6.n6;
                        u5Var.setTag(Integer.valueOf(i18));
                        if (z11) {
                            i18 = org.telegram.ui.ActionBar.t6.dh;
                        }
                        org.telegram.ui.ActionBar.a7.Y(u5Var, i18, p6Var);
                        u5Var.l(cd.L0(2131747842, null), false);
                    } else {
                        int i19 = org.telegram.ui.ActionBar.t6.y6;
                        u5Var.setTag(Integer.valueOf(i19));
                        if (z11) {
                            i19 = org.telegram.ui.ActionBar.t6.ch;
                        }
                        org.telegram.ui.ActionBar.a7.Y(u5Var, i19, p6Var);
                        u5Var.l(cd.d0(i17, user, null, null), false);
                    }
                }
                u5Var.setEmojiColor(u5Var.getTextColor());
            }
            g9Var.e(user, r8Var);
        }
        chat = null;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
        charSequence = this.n;
        if (charSequence != null) {
        }
        g();
    }

    public final void g() {
        TL_account.RequirementToContact requirementToContact = null;
        if (this.R) {
            TL_account.requirementToContactPremium requirementtocontactpremium = this.Q;
            if (requirementtocontactpremium != null) {
                requirementToContact = requirementtocontactpremium;
            } else if (this.f instanceof TLRPC.User) {
                requirementToContact = vp.r1(this.x).H2(((TLRPC.User) this.f).id);
            }
        }
        boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.O == z10 && this.P == org.telegram.messenger.o5.k(requirementToContact)) {
            return;
        }
        this.O = z10;
        this.P = org.telegram.messenger.o5.k(requirementToContact);
        this.N.f(this.O, true);
        invalidate();
    }

    public ep getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public org.telegram.ui.ActionBar.u5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.N.d(this.O);
        org.telegram.ui.ActionBar.p6 p6Var = this.M;
        if (d <= 0.0f && this.w == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W6, p6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.g9 g9Var = this.a;
            canvas.drawCircle((g9Var.getMeasuredWidth() / 2) + g9Var.getLeft(), (g9Var.getMeasuredHeight() / 2) + g9Var.getTop(), (org.telegram.messenger.i0.L(4.0f) * this.I) + org.telegram.messenger.i0.L(18.0f), paint);
        }
        if (this.E) {
            boolean z10 = cd.X;
            int i10 = this.F;
            int L = org.telegram.messenger.i0.L(z10 ? 0.0f : i10 + 72);
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(cd.X ? i10 + 72 : 0.0f);
            if (!this.K) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            } else {
                org.telegram.ui.ActionBar.t6.l0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ug, p6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ep epVar = this.d;
        if (epVar != null ? epVar.a.q : this.H) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z10) {
        ep epVar = this.d;
        if (epVar != null) {
            epVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        if (u5Var != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = u5Var.getTextColor()) != this.V) {
                    this.V = textColor;
                    u5Var.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.a;
        if (g9Var != null) {
            g9Var.invalidate();
        }
        try {
            if (this.s && g9Var != null) {
                Drawable t10 = g9Var.getImageReceiver().t();
                if (t10 instanceof org.telegram.ui.Components.r8) {
                    ((org.telegram.ui.Components.r8) t10).i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a8, false));
                    g9Var.invalidate();
                }
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public j4(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.x = d20.s0;
        this.N = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.M = p6Var;
        this.w = i10;
        this.K = z11;
        this.E = false;
        this.F = i11;
        this.L = z10;
        this.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z12 = cd.X;
        addView(g9Var, w7.b6.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i11 + 13, 6.0f, z12 ? i11 + 13 : 0.0f, 0.0f));
        og.c cVar = new og.c(context, 1);
        this.b = cVar;
        zs.i(cVar);
        org.telegram.ui.ActionBar.a7.Y(cVar, z11 ? org.telegram.ui.ActionBar.t6.bh : org.telegram.ui.ActionBar.t6.G6, p6Var);
        cVar.setTypeface(org.telegram.messenger.i0.o());
        cVar.setTextSize(16);
        cVar.setGravity((cd.X ? 5 : 3) | 48);
        boolean z13 = cd.X;
        addView(cVar, w7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i11, 10.0f, (z13 ? 72 : 28) + i11, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        u5Var.setTextSize(14);
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        boolean z14 = cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i11, 32.0f, (z14 ? 72 : 28) + i11, 0.0f));
        if (i10 == 1) {
            ep epVar = new ep(21, context, p6Var);
            this.d = epVar;
            epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z15 = cd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i11 + 40, 33.0f, z15 ? i11 + 39 : 0.0f, 0.0f));
        } else if (i10 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
