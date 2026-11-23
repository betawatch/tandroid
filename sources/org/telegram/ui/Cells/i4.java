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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public boolean F;
    public final int G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final org.telegram.ui.ActionBar.h6 N;
    public final org.telegram.ui.Components.d6 O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public ug.a1 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final org.telegram.ui.Components.q9 a;
    public final fi.u3 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final op d;
    public final org.telegram.ui.Components.b9 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final int w;
    public final int x;
    public String y;

    public i4(Context context, int i7, int i10, boolean z10) {
        this(i7, i10, context, null, z10, false);
    }

    public static org.telegram.ui.Components.b9 a(boolean z10) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.g(8);
        b9Var.p = z10 ? 0.8f : 1.1f;
        b9Var.i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a8, false));
        return b9Var;
    }

    public static oq b(Context context, boolean z10) {
        oq oqVar = new oq(new hi.k3(new ug.a1(org.telegram.ui.ActionBar.m6.Dk, org.telegram.ui.ActionBar.m6.Ck, -1, -1, null), 5), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z10) {
            int L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(18.0f);
            oqVar.e = L;
            oqVar.f = L2;
        }
        return oqVar;
    }

    public final void c(boolean z10, boolean z11) {
        op opVar = this.d;
        if (opVar != null) {
            opVar.a(z10, z11);
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
            this.H.addListener(new ki.m3(this, 24));
            this.H.setDuration(180L);
            this.H.setInterpolator(nr.g);
            this.H.start();
        } else {
            float f10 = this.I ? 0.82f : 1.0f;
            org.telegram.ui.Components.q9 q9Var = this.a;
            q9Var.setScaleX(f10);
            q9Var.setScaleY(this.I ? 0.82f : 1.0f);
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
            org.telegram.ui.Components.q9 q9Var = this.a;
            float height = (q9Var.getHeight() / 2.0f) + q9Var.getY() + org.telegram.messenger.g0.L(18.0f);
            float width = (q9Var.getWidth() / 2.0f) + q9Var.getX() + org.telegram.messenger.g0.L(18.0f);
            canvas.save();
            Paint paint2 = org.telegram.ui.ActionBar.m6.t0;
            int i7 = org.telegram.ui.ActionBar.m6.d6;
            org.telegram.ui.ActionBar.h6 h6Var = this.N;
            paint2.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.m6.t0);
            if (this.R == null) {
                if (this.T == null) {
                    this.T = new ug.a1(org.telegram.ui.ActionBar.m6.Ck, org.telegram.ui.ActionBar.m6.Dk, -1, -1, this.N);
                }
                this.T.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                paint = this.T.f;
            } else {
                if (this.V == null) {
                    this.V = new Paint();
                }
                this.V.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.c8, h6Var));
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
        boolean z10 = obj instanceof String;
        org.telegram.ui.ActionBar.h6 h6Var = this.N;
        boolean z11 = this.L;
        op opVar = this.d;
        org.telegram.ui.Components.q9 q9Var = this.a;
        fi.u3 u3Var = this.b;
        org.telegram.ui.Components.b9 b9Var = this.e;
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        if (z10) {
            ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(15.0f);
            ViewGroup.LayoutParams layoutParams = q9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = q9Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (opVar != null) {
                ((FrameLayout.LayoutParams) opVar.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(25.0f);
                if (hd.a0) {
                    ((FrameLayout.LayoutParams) opVar.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) opVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(32.0f);
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
                    b9Var.g(11);
                    break;
                case 1:
                    b9Var.g(6);
                    break;
                case 2:
                    b9Var.g(5);
                    break;
                case 3:
                    b9Var.g(4);
                    break;
                case 4:
                    b9Var.g(24);
                    break;
                case 5:
                    b9Var.g(8);
                    break;
                case 6:
                    b9Var.g(10);
                    break;
                case 7:
                    b9Var.g(9);
                    break;
                case '\b':
                    b9Var.g(23);
                    break;
                case '\t':
                    b9Var.g(7);
                    break;
            }
            this.y = null;
            u3Var.l(this.h, true);
            m5Var.l(null, false);
            q9Var.h(null, "50_50", b9Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = q9Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = q9Var.getLayoutParams();
            int L2 = org.telegram.messenger.g0.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (opVar != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) opVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(29.0f);
                int i10 = this.G;
                layoutParams5.topMargin = L3 + i10;
                if (hd.a0) {
                    ((FrameLayout.LayoutParams) opVar.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(40.0f) + i10;
                } else {
                    ((FrameLayout.LayoutParams) opVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(40.0f) + i10;
                }
            }
            Object obj2 = this.f;
            if (!(obj2 instanceof TLRPC.User)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i7 != 0) {
                    int i11 = np.I8;
                    boolean z12 = ((i7 & 2) == 0 || fileLocation == null) ? false : true;
                    if (z12 || this.h != null || (str2 = this.y) == null || (i7 & 1) == 0) {
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
                b9Var.q(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    u3Var.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    u3Var.l(str, false);
                }
                if (this.n == null) {
                    int i12 = org.telegram.ui.ActionBar.m6.y6;
                    m5Var.setTag(Integer.valueOf(i12));
                    if (z11) {
                        i12 = org.telegram.ui.ActionBar.m6.fh;
                    }
                    org.telegram.ui.ActionBar.t6.X(m5Var, i12, null);
                    m5Var.setEmojiColor(m5Var.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!org.telegram.messenger.v3.T(chat2) || chat2.megagroup) {
                            m5Var.l(hd.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            m5Var.l(hd.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        m5Var.l(hd.N0(2131748449, null), false);
                    } else if (org.telegram.messenger.v3.t0(chat2)) {
                        if (!org.telegram.messenger.v3.T(chat2) || chat2.megagroup) {
                            m5Var.l(hd.N0(2131748445, null), false);
                        } else {
                            m5Var.l(hd.N0(2131752306, null), false);
                        }
                    } else if (!org.telegram.messenger.v3.T(chat2) || chat2.megagroup) {
                        m5Var.l(hd.N0(2131748448, null), false);
                    } else {
                        m5Var.l(hd.N0(2131752317, null), false);
                    }
                }
                q9Var.f(chat2, b9Var);
                chat = chat2;
                q9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    m5Var.l(charSequence, true);
                    int i13 = org.telegram.ui.ActionBar.m6.y6;
                    m5Var.setTag(Integer.valueOf(i13));
                    if (z11) {
                        i13 = org.telegram.ui.ActionBar.m6.fh;
                    }
                    org.telegram.ui.ActionBar.t6.X(m5Var, i13, h6Var);
                    m5Var.setEmojiColor(m5Var.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.M && p10.C(user)) {
                u3Var.l(hd.N0(2131745705, null), true);
                m5Var.l(null, false);
                b9Var.g(1);
                q9Var.j(null, "50_50", b9Var, user);
                ((FrameLayout.LayoutParams) u3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i7 != 0) {
                int i14 = np.I8;
                boolean z13 = ((i7 & 2) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z13 && (i7 & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.E) {
                        z13 = true;
                    }
                }
                if (z13 || this.h != null || this.y == null || (i7 & 1) == 0) {
                    str3 = null;
                } else {
                    str3 = p10.q(user);
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
            b9Var.r(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.E = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                u3Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = p10.q(user);
                }
                this.y = str3;
                u3Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i15 = org.telegram.ui.ActionBar.m6.y6;
                    m5Var.setTag(Integer.valueOf(i15));
                    if (z11) {
                        i15 = org.telegram.ui.ActionBar.m6.fh;
                    }
                    org.telegram.ui.ActionBar.t6.X(m5Var, i15, h6Var);
                    m5Var.l(hd.N0(2131753153, null), false);
                } else {
                    long j3 = user.id;
                    int i16 = this.x;
                    if (j3 == k10.i(i16).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i16).getCurrentTime()) || np.u1(i16).a0.containsKey(Long.valueOf(user.id)))) {
                        int i17 = org.telegram.ui.ActionBar.m6.n6;
                        m5Var.setTag(Integer.valueOf(i17));
                        if (z11) {
                            i17 = org.telegram.ui.ActionBar.m6.gh;
                        }
                        org.telegram.ui.ActionBar.t6.X(m5Var, i17, h6Var);
                        m5Var.l(hd.N0(2131747632, null), false);
                    } else {
                        int i18 = org.telegram.ui.ActionBar.m6.y6;
                        m5Var.setTag(Integer.valueOf(i18));
                        if (z11) {
                            i18 = org.telegram.ui.ActionBar.m6.fh;
                        }
                        org.telegram.ui.ActionBar.t6.X(m5Var, i18, h6Var);
                        m5Var.l(hd.d0(i16, user, null, null), false);
                    }
                }
                m5Var.setEmojiColor(m5Var.getTextColor());
            }
            q9Var.f(user, b9Var);
        }
        chat = null;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L((chat == null && chat.forum) ? 14.0f : 24.0f));
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
                requirementToContact = np.u1(this.x).P2(((TLRPC.User) this.f).id);
            }
        }
        boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z10 && this.Q == org.telegram.messenger.n5.k(requirementToContact)) {
            return;
        }
        this.P = z10;
        this.Q = org.telegram.messenger.n5.k(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public op getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public org.telegram.ui.ActionBar.m5 getStatusTextView() {
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
        org.telegram.ui.ActionBar.h6 h6Var = this.N;
        if (d <= 0.0f && this.w == 2 && (this.I || this.J > 0.0f)) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W6, h6Var);
            Paint paint = this.K;
            paint.setColor(w02);
            org.telegram.ui.Components.q9 q9Var = this.a;
            canvas.drawCircle((q9Var.getMeasuredWidth() / 2) + q9Var.getLeft(), (q9Var.getMeasuredHeight() / 2) + q9Var.getTop(), (org.telegram.messenger.g0.L(4.0f) * this.J) + org.telegram.messenger.g0.L(18.0f), paint);
        }
        if (this.F) {
            boolean z10 = hd.a0;
            int i7 = this.G;
            int L = org.telegram.messenger.g0.L(z10 ? 0.0f : i7 + 72);
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(hd.a0 ? i7 + 72 : 0.0f);
            if (!this.L) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.W0("paintDivider", h6Var));
            } else {
                org.telegram.ui.ActionBar.m6.l0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xg, h6Var));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.l0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        op opVar = this.d;
        if (opVar != null ? opVar.a.q : this.I) {
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

    public void setCheckBoxEnabled(boolean z10) {
        op opVar = this.d;
        if (opVar != null) {
            opVar.setEnabled(z10);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setForbiddenCheck(boolean z10) {
        this.d.setForbidden(z10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int textColor;
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        if (m5Var != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = m5Var.getTextColor()) != this.W) {
                    this.W = textColor;
                    m5Var.setEmojiColor(textColor);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.a;
        if (q9Var != null) {
            q9Var.invalidate();
        }
        try {
            if (this.s && q9Var != null) {
                Drawable t6 = q9Var.getImageReceiver().t();
                if (t6 instanceof org.telegram.ui.Components.b9) {
                    ((org.telegram.ui.Components.b9) t6).i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.a8, false));
                    q9Var.invalidate();
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public i4(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        this.x = k10.t0;
        this.O = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        this.N = h6Var;
        this.w = i7;
        this.L = z11;
        this.F = false;
        this.G = i10;
        this.M = z10;
        this.e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z12 = hd.a0;
        addView(q9Var, c8.ma.d(46, 46.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 13, 6.0f, z12 ? i10 + 13 : 0.0f, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 1);
        this.b = u3Var;
        ls.i(u3Var);
        org.telegram.ui.ActionBar.t6.X(u3Var, z11 ? org.telegram.ui.ActionBar.m6.eh : org.telegram.ui.ActionBar.m6.G6, h6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        u3Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z13 = hd.a0;
        addView(u3Var, c8.ma.d(-1, 20.0f, (z13 ? 5 : 3) | 48, (z13 ? 28 : 72) + i10, 10.0f, (z13 ? 72 : 28) + i10, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var;
        m5Var.setTextSize(14);
        m5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z14 = hd.a0;
        addView(m5Var, c8.ma.d(-1, 20.0f, (z14 ? 5 : 3) | 48, (z14 ? 28 : 72) + i10, 32.0f, (z14 ? 72 : 28) + i10, 0.0f));
        if (i7 == 1) {
            op opVar = new op(21, context, h6Var);
            this.d = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z15 = hd.a0;
            addView(opVar, c8.ma.d(24, 24.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : i10 + 40, 33.0f, z15 ? i10 + 39 : 0.0f, 0.0f));
        } else if (i7 == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
