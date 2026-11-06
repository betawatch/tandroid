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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h4 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public boolean E;
    public final int F;
    public ValueAnimator G;
    public boolean H;
    public float I;
    public final Paint J;
    public final boolean K;
    public final boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final org.telegram.ui.Components.w5 N;
    public boolean O;
    public long P;
    public TL_account.requirementToContactPremium Q;
    public boolean R;
    public ug.y0 S;
    public Drawable T;
    public Paint U;
    public int V;
    public final org.telegram.ui.Components.l9 a;
    public final di.d4 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final wo d;
    public final org.telegram.ui.Components.w8 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int w;
    public final int x;
    public String y;

    public h4(Context context, int i7, int i10, boolean z9) {
        this(i7, i10, context, null, z9, false);
    }

    public static org.telegram.ui.Components.w8 a(boolean z9) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.g(8);
        w8Var.p = z9 ? 0.8f : 1.1f;
        w8Var.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a8, false));
        return w8Var;
    }

    public static xp b(Context context, boolean z9) {
        xp xpVar = new xp(new fi.l3(new ug.y0(org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.zk, -1, -1, null), 5), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z9) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            xpVar.e = L;
            xpVar.f = L2;
        }
        return xpVar;
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, z10);
            return;
        }
        if (this.w != 2 || this.H == z9) {
            return;
        }
        this.H = z9;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new r(this, 3));
            this.G.addListener(new m.a(this, 23));
            this.G.setDuration(180L);
            this.G.setInterpolator(xq.g);
            this.G.start();
        } else {
            float f10 = this.H ? 0.82f : 1.0f;
            org.telegram.ui.Components.l9 l9Var = this.a;
            l9Var.setScaleX(f10);
            l9Var.setScaleY(this.H ? 0.82f : 1.0f);
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
            org.telegram.ui.Components.l9 l9Var = this.a;
            float height = (l9Var.getHeight() / 2.0f) + l9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (l9Var.getWidth() / 2.0f) + l9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.k6.t0;
            int i7 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.M;
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.k6.t0);
            if (this.Q == null) {
                if (this.S == null) {
                    this.S = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.M);
                }
                this.S.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.S.f;
            } else {
                if (this.U == null) {
                    this.U = new Paint();
                }
                this.U.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.c8, f6Var));
                paint = this.U;
            }
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, paint);
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

    public final void e(TLObject tLObject, String str, String str2, boolean z9) {
        d(tLObject, str, str2);
        this.E = z9;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i7) {
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
        boolean z9 = obj instanceof String;
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        boolean z10 = this.K;
        wo woVar = this.d;
        org.telegram.ui.Components.l9 l9Var = this.a;
        di.d4 d4Var = this.b;
        org.telegram.ui.Components.w8 w8Var = this.e;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (z9) {
            ((FrameLayout.LayoutParams) d4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(15.0f);
            ViewGroup.LayoutParams layoutParams = l9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = l9Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (woVar != null) {
                ((FrameLayout.LayoutParams) woVar.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(25.0f);
                if (hd.a0) {
                    ((FrameLayout.LayoutParams) woVar.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) woVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(32.0f);
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
                    w8Var.g(11);
                    break;
                case 1:
                    w8Var.g(6);
                    break;
                case 2:
                    w8Var.g(5);
                    break;
                case 3:
                    w8Var.g(4);
                    break;
                case 4:
                    w8Var.g(24);
                    break;
                case 5:
                    w8Var.g(8);
                    break;
                case 6:
                    w8Var.g(10);
                    break;
                case 7:
                    w8Var.g(9);
                    break;
                case '\b':
                    w8Var.g(23);
                    break;
                case '\t':
                    w8Var.g(7);
                    break;
            }
            this.y = null;
            d4Var.l(this.h, true);
            k5Var.l(null, false);
            l9Var.h(null, "50_50", w8Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) d4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) d4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = l9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = l9Var.getLayoutParams();
            int L2 = org.telegram.messenger.g0.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (woVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) woVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(29.0f);
                int i10 = this.F;
                layoutParams5.topMargin = L3 + i10;
                if (hd.a0) {
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
                if (i7 != 0) {
                    int i11 = qp.C8;
                    boolean z11 = ((i7 & 2) == 0 || fileLocation == null) ? false : true;
                    if (z11 || this.h != null || (str2 = this.y) == null || (i7 & 1) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        return;
                    }
                } else {
                    str = null;
                }
                w8Var.q(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    d4Var.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    d4Var.l(str, false);
                }
                if (this.n == null) {
                    int i12 = org.telegram.ui.ActionBar.k6.y6;
                    k5Var.setTag(Integer.valueOf(i12));
                    if (z10) {
                        i12 = org.telegram.ui.ActionBar.k6.ch;
                    }
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i12, null);
                    k5Var.setEmojiColor(k5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!org.telegram.messenger.t3.T(chat2) || chat2.megagroup) {
                            k5Var.l(hd.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            k5Var.l(hd.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        k5Var.l(hd.M0(2131748641, null), false);
                    } else if (org.telegram.messenger.t3.t0(chat2)) {
                        if (!org.telegram.messenger.t3.T(chat2) || chat2.megagroup) {
                            k5Var.l(hd.M0(2131748637, null), false);
                        } else {
                            k5Var.l(hd.M0(2131752318, null), false);
                        }
                    } else if (!org.telegram.messenger.t3.T(chat2) || chat2.megagroup) {
                        k5Var.l(hd.M0(2131748640, null), false);
                    } else {
                        k5Var.l(hd.M0(2131752329, null), false);
                    }
                }
                l9Var.e(chat2, w8Var);
                chat = chat2;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    k5Var.l(charSequence, true);
                    int i13 = org.telegram.ui.ActionBar.k6.y6;
                    k5Var.setTag(Integer.valueOf(i13));
                    if (z10) {
                        i13 = org.telegram.ui.ActionBar.k6.ch;
                    }
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i13, f6Var);
                    k5Var.setEmojiColor(k5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.L && t10.B(user)) {
                d4Var.l(hd.M0(2131745902, null), true);
                k5Var.l(null, false);
                w8Var.g(1);
                l9Var.j(null, "50_50", w8Var, user);
                ((FrameLayout.LayoutParams) d4Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i7 != 0) {
                int i14 = qp.C8;
                boolean z12 = ((i7 & 2) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z12 && (i7 & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.D) {
                        z12 = true;
                    }
                }
                if (z12 || this.h != null || this.y == null || (i7 & 1) == 0) {
                    str3 = null;
                } else {
                    str3 = t10.p(user);
                    if (!str3.equals(this.y)) {
                        z12 = true;
                    }
                }
                if (!z12) {
                    return;
                }
            } else {
                str3 = null;
            }
            w8Var.r(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.D = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                d4Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = t10.p(user);
                }
                this.y = str3;
                d4Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i15 = org.telegram.ui.ActionBar.k6.y6;
                    k5Var.setTag(Integer.valueOf(i15));
                    if (z10) {
                        i15 = org.telegram.ui.ActionBar.k6.ch;
                    }
                    org.telegram.ui.ActionBar.r6.Y(k5Var, i15, f6Var);
                    k5Var.l(hd.M0(2131753156, null), false);
                } else {
                    long j3 = user.id;
                    int i16 = this.x;
                    if (j3 == p10.i(i16).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i16).getCurrentTime()) || qp.s1(i16).Z.containsKey(Long.valueOf(user.id)))) {
                        int i17 = org.telegram.ui.ActionBar.k6.n6;
                        k5Var.setTag(Integer.valueOf(i17));
                        if (z10) {
                            i17 = org.telegram.ui.ActionBar.k6.dh;
                        }
                        org.telegram.ui.ActionBar.r6.Y(k5Var, i17, f6Var);
                        k5Var.l(hd.M0(2131747825, null), false);
                    } else {
                        int i18 = org.telegram.ui.ActionBar.k6.y6;
                        k5Var.setTag(Integer.valueOf(i18));
                        if (z10) {
                            i18 = org.telegram.ui.ActionBar.k6.ch;
                        }
                        org.telegram.ui.ActionBar.r6.Y(k5Var, i18, f6Var);
                        k5Var.l(hd.d0(i16, user, null, null), false);
                    }
                }
                k5Var.setEmojiColor(k5Var.getTextColor());
            }
            l9Var.e(user, w8Var);
        }
        chat = null;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
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
                requirementToContact = qp.s1(this.x).J2(((TLRPC.User) this.f).id);
            }
        }
        boolean z9 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.O == z9 && this.P == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.O = z9;
        this.P = org.telegram.messenger.m5.k(requirementToContact);
        this.N.f(this.O, true);
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
        float d = this.N.d(this.O);
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        if (d <= 0.0f && this.w == 2 && (this.H || this.I > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W6, f6Var);
            Paint paint = this.J;
            paint.setColor(w02);
            org.telegram.ui.Components.l9 l9Var = this.a;
            canvas.drawCircle((l9Var.getMeasuredWidth() / 2) + l9Var.getLeft(), (l9Var.getMeasuredHeight() / 2) + l9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.I) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.E) {
            boolean z9 = hd.a0;
            int i7 = this.F;
            int L = org.telegram.messenger.g0.L(z9 ? 0.0f : i7 + 72);
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(hd.a0 ? i7 + 72 : 0.0f);
            if (!this.K) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.W0("paintDivider", f6Var));
            } else {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ug, f6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.d;
        if (woVar != null ? woVar.a.q : this.H) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z9) {
        wo woVar = this.d;
        if (woVar != null) {
            woVar.setEnabled(z9);
        }
    }

    public void setDrawDivider(boolean z9) {
        this.E = z9;
        invalidate();
    }

    public void setForbiddenCheck(boolean z9) {
        this.d.setForbidden(z9);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = k5Var.getTextColor()) != this.V) {
                    this.V = textColor;
                    k5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.l9 l9Var = this.a;
        if (l9Var != null) {
            l9Var.invalidate();
        }
        try {
            if (this.s && l9Var != null) {
                Drawable t6 = l9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.w8) {
                    ((org.telegram.ui.Components.w8) t6).i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a8, false));
                    l9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public h4(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.x = p10.s0;
        this.N = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.M = f6Var;
        this.w = i7;
        this.K = z10;
        this.E = false;
        this.F = i10;
        this.L = z9;
        this.e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = hd.a0;
        addView(l9Var, c8.ha.d(46, 46.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 13, 6.0f, z11 ? i10 + 13 : 0.0f, 0.0f));
        di.d4 d4Var = new di.d4(context, 1);
        this.b = d4Var;
        qs.i(d4Var);
        org.telegram.ui.ActionBar.r6.Y(d4Var, z10 ? org.telegram.ui.ActionBar.k6.bh : org.telegram.ui.ActionBar.k6.G6, f6Var);
        d4Var.setTypeface(org.telegram.messenger.g0.o());
        d4Var.setTextSize(16);
        d4Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z12 = hd.a0;
        addView(d4Var, c8.ha.d(-1, 20.0f, (z12 ? 5 : 3) | 48, (z12 ? 28 : 72) + i10, 10.0f, (z12 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z13 = hd.a0;
        addView(k5Var, c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 32.0f, (z13 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            wo woVar = new wo(21, context, f6Var);
            this.d = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z14 = hd.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : i10 + 40, 33.0f, z14 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i7 == 2) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
