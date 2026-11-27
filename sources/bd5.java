// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bd5 extends FrameLayout implements snb {
    public int E;
    public boolean F;
    public final byte G;
    public ValueAnimator H;
    public boolean I;
    public float J;
    public final Paint K;
    public final boolean L;
    public final boolean M;
    public final vnb N;
    public final mm O;
    public boolean P;
    public long Q;
    public TL_account.requirementToContactPremium R;
    public boolean S;
    public al8 T;
    public Drawable U;
    public Paint V;
    public int W;
    public final de0 a;
    public final ff0 b;
    public final ema c;
    public final og2 d;
    public final rb0 e;
    public Object f;
    public CharSequence h;
    public CharSequence n;
    public boolean r;
    public boolean s;
    public final byte w;
    public final int x;
    public String y;

    /* JADX WARN: Multi-variable type inference failed */
    public bd5(int i, int i2, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.x = yac.t0;
        this.O = new mm(this, 0L, 350L, k43.h);
        this.N = vnbVar;
        this.w = i;
        this.L = z2;
        this.F = false;
        this.G = i2;
        this.M = z;
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z3 = ob6.a0;
        addView(de0Var, tre.d(46, 46.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i2 + 13, 6.0f, z3 ? i2 + 13 : 0.0f, 0.0f));
        ff0 ff0Var = new ff0(context, (byte) 2);
        this.b = ff0Var;
        jn7.i(ff0Var);
        yob.W(ff0Var, z2 ? aob.eh : aob.G6, vnbVar);
        ff0Var.setTypeface(hl.o());
        ff0Var.setTextSize(16);
        ff0Var.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z4 = ob6.a0;
        addView(ff0Var, tre.d(-1, 20.0f, (z4 ? 5 : 3) | 48, (z4 ? 28 : 72) + i2, 10.0f, (z4 ? 72 : 28) + i2, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        emaVar.setTextSize(14);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z5 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z5 ? 5 : 3) | 48, (z5 ? 28 : 72) + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.d = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            boolean z6 = ob6.a0;
            addView(og2Var, tre.d(24, 24.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : i2 + 40, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(2.0f));
        }
        setWillNotDraw(false);
    }

    public static rb0 a(boolean z) {
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.f(8);
        rb0Var.p = z ? 0.8f : 1.1f;
        rb0Var.h(aob.w0(null, aob.T7, false), aob.w0(null, aob.a8, false));
        return rb0Var;
    }

    public static zm2 b(Context context, boolean z) {
        zm2 zm2Var = new zm2(new g6(new al8(aob.Dk, aob.Ck, -1, -1, null), (byte) 3), context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z) {
            int L = hl.L(18.0f);
            int L2 = hl.L(18.0f);
            zm2Var.e = L;
            zm2Var.f = L2;
        }
        return zm2Var;
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.d;
        if (og2Var != null) {
            og2Var.a(z, z2);
            return;
        }
        if (this.w != 2 || this.I == z) {
            return;
        }
        this.I = z;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new ch4(this, (byte) 10));
            this.H.addListener(new ad5(this, (byte) 0));
            this.H.setDuration(180L);
            this.H.setInterpolator(k43.g);
            this.H.start();
        } else {
            float f = this.I ? 0.82f : 1.0f;
            de0 de0Var = this.a;
            de0Var.setScaleX(f);
            de0Var.setScaleY(this.I ? 0.82f : 1.0f);
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
        al8 al8Var;
        super.dispatchDraw(canvas);
        float d = this.O.d(this.P);
        if (d > 0.0f) {
            de0 de0Var = this.a;
            float height = (de0Var.getHeight() / 2.0f) + de0Var.getY() + hl.L(18.0f);
            float width = (de0Var.getWidth() / 2.0f) + de0Var.getX() + hl.L(18.0f);
            canvas.save();
            Paint paint2 = aob.s0;
            int i = aob.d6;
            vnb vnbVar = this.N;
            paint2.setColor(aob.v0(i, vnbVar));
            canvas.drawCircle(width, height, hl.L(11.33f) * d, aob.s0);
            if (this.R == null) {
                al8 al8Var2 = this.T;
                if (al8Var2 == null) {
                    al8 al8Var3 = new al8(aob.Ck, aob.Dk, -1, -1, this.N);
                    this.T = al8Var3;
                    al8Var = al8Var3;
                } else {
                    al8Var = al8Var2;
                }
                al8Var.d((int) (width - hl.L(10.0f)), 0.0f, (int) (height - hl.L(10.0f)), (int) (hl.L(10.0f) + width), 0.0f, (int) (hl.L(10.0f) + height));
                paint = this.T.f;
            } else {
                Paint paint3 = this.V;
                if (paint3 == null) {
                    paint3 = new Paint();
                    this.V = paint3;
                }
                paint3.setColor(aob.v0(aob.c8, vnbVar));
                paint = this.V;
            }
            canvas.drawCircle(width, height, hl.L(10.0f) * d, paint);
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

    public final void e(TLObject tLObject, String str, String str2, boolean z) {
        d(tLObject, str, str2);
        this.F = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i) {
        String str;
        TLRPC.Chat chat;
        String str2;
        String str3;
        TLRPC.UserStatus userStatus;
        CharSequence charSequence;
        char c;
        Object obj = this.f;
        if (obj == null || this.r || this.s) {
            return;
        }
        boolean z = obj instanceof String;
        vnb vnbVar = this.N;
        og2 og2Var = this.d;
        boolean z2 = this.L;
        de0 de0Var = this.a;
        ff0 ff0Var = this.b;
        rb0 rb0Var = this.e;
        ema emaVar = this.c;
        if (z) {
            ((FrameLayout.LayoutParams) ff0Var.getLayoutParams()).topMargin = hl.L(15.0f);
            ViewGroup.LayoutParams layoutParams = de0Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = de0Var.getLayoutParams();
            int L = hl.L(38.0f);
            layoutParams2.height = L;
            layoutParams.width = L;
            if (og2Var != null) {
                ((FrameLayout.LayoutParams) og2Var.getLayoutParams()).topMargin = hl.L(25.0f);
                if (ob6.a0) {
                    ((FrameLayout.LayoutParams) og2Var.getLayoutParams()).rightMargin = hl.L(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) og2Var.getLayoutParams()).leftMargin = hl.L(32.0f);
                }
            }
            String str4 = (String) this.f;
            str4.getClass();
            char c2 = 65535;
            switch (str4.hashCode()) {
                case -1716307998:
                    if (str4.equals("archived")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str4.equals("groups")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str4.equals("non_contacts")) {
                        c = 2;
                        c2 = c;
                        break;
                    }
                    break;
                case -567451565:
                    if (str4.equals("contacts")) {
                        c = 3;
                        c2 = c;
                        break;
                    }
                    break;
                case -268161860:
                    if (str4.equals("new_chats")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str4.equals("bots")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str4.equals("read")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str4.equals("muted")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str4.equals("existing_chats")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str4.equals("channels")) {
                        c2 = '\t';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    rb0Var.f(11);
                    break;
                case 1:
                    rb0Var.f(6);
                    break;
                case 2:
                    rb0Var.f(5);
                    break;
                case 3:
                    rb0Var.f(4);
                    break;
                case 4:
                    rb0Var.f(24);
                    break;
                case 5:
                    rb0Var.f(8);
                    break;
                case 6:
                    rb0Var.f(10);
                    break;
                case 7:
                    rb0Var.f(9);
                    break;
                case '\b':
                    rb0Var.f(23);
                    break;
                case '\t':
                    rb0Var.f(7);
                    break;
            }
            this.y = null;
            ff0Var.l(this.h, true);
            emaVar.l(null, false);
            de0Var.o(null, "50_50", rb0Var);
        } else {
            CharSequence charSequence2 = this.n;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) ff0Var.getLayoutParams()).topMargin = hl.L(10.0f);
            } else {
                ((FrameLayout.LayoutParams) ff0Var.getLayoutParams()).topMargin = hl.L(19.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = de0Var.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = de0Var.getLayoutParams();
            int L2 = hl.L(46.0f);
            layoutParams4.height = L2;
            layoutParams3.width = L2;
            if (og2Var != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) og2Var.getLayoutParams();
                int L3 = hl.L(29.0f);
                byte b = this.G;
                layoutParams5.topMargin = L3 + b;
                if (ob6.a0) {
                    ((FrameLayout.LayoutParams) og2Var.getLayoutParams()).rightMargin = hl.L(40.0f) + b;
                } else {
                    ((FrameLayout.LayoutParams) og2Var.getLayoutParams()).leftMargin = hl.L(40.0f) + b;
                }
            }
            Object obj2 = this.f;
            if (!(obj2 instanceof TLRPC.User)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i != 0) {
                    int i2 = uc7.r5;
                    boolean z3 = ((i & 2) == 0 || fileLocation == null) ? false : true;
                    if (z3 || this.h != null || (str2 = this.y) == null || (i & 1) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        return;
                    }
                } else {
                    str = null;
                }
                rb0Var.p(chat2);
                CharSequence charSequence3 = this.h;
                if (charSequence3 != null) {
                    this.y = null;
                    ff0Var.l(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.y = str;
                    ff0Var.l(str, false);
                }
                if (this.n == null) {
                    int i3 = aob.y6;
                    emaVar.setTag(Integer.valueOf(i3));
                    if (z2) {
                        i3 = aob.fh;
                    }
                    yob.W(emaVar, i3, null);
                    emaVar.setEmojiColor(emaVar.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!xc2.T(chat2) || chat2.megagroup) {
                            emaVar.l(ob6.G(chat2.participants_count, "Members", new Object[0]), false);
                        } else {
                            emaVar.l(ob6.G(chat2.participants_count, "Subscribers", new Object[0]), false);
                        }
                    } else if (chat2.has_geo) {
                        emaVar.l(ob6.M0(2131748396, null), false);
                    } else if (xc2.t0(chat2)) {
                        if (!xc2.T(chat2) || chat2.megagroup) {
                            emaVar.l(ob6.M0(2131748392, null), false);
                        } else {
                            emaVar.l(ob6.M0(2131752288, null), false);
                        }
                    } else if (!xc2.T(chat2) || chat2.megagroup) {
                        emaVar.l(ob6.M0(2131748395, null), false);
                    } else {
                        emaVar.l(ob6.M0(2131752299, null), false);
                    }
                }
                de0Var.f(chat2, rb0Var);
                chat = chat2;
                de0Var.setRoundRadius(hl.L((chat == null && chat.forum) ? 14.0f : 24.0f));
                charSequence = this.n;
                if (charSequence != null) {
                    emaVar.l(charSequence, true);
                    int i4 = aob.y6;
                    emaVar.setTag(Integer.valueOf(i4));
                    if (z2) {
                        i4 = aob.fh;
                    }
                    yob.W(emaVar, i4, vnbVar);
                    emaVar.setEmojiColor(emaVar.getTextColor());
                }
                g();
            }
            TLRPC.User user = (TLRPC.User) obj2;
            if (this.M && lbc.D(user)) {
                ff0Var.l(ob6.M0(2131745629, null), true);
                emaVar.l(null, false);
                rb0Var.f(1);
                de0Var.m(null, "50_50", rb0Var, user);
                ((FrameLayout.LayoutParams) ff0Var.getLayoutParams()).topMargin = hl.L(19.0f);
                return;
            }
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.FileLocation fileLocation2 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
            if (i != 0) {
                int i5 = uc7.r5;
                boolean z4 = ((i & 2) == 0 || fileLocation2 == null) ? false : true;
                if (this.n == null && !z4 && (i & 4) != 0) {
                    TLRPC.UserStatus userStatus2 = user.status;
                    if ((userStatus2 != null ? userStatus2.expires : 0) != this.E) {
                        z4 = true;
                    }
                }
                if (z4 || this.h != null || this.y == null || (i & 1) == 0) {
                    str3 = null;
                } else {
                    str3 = lbc.r(user);
                    if (!str3.equals(this.y)) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    return;
                }
            } else {
                str3 = null;
            }
            rb0Var.q(user);
            TLRPC.UserStatus userStatus3 = user.status;
            this.E = userStatus3 != null ? userStatus3.expires : 0;
            CharSequence charSequence4 = this.h;
            if (charSequence4 != null) {
                this.y = null;
                ff0Var.l(charSequence4, true);
            } else {
                if (str3 == null) {
                    str3 = lbc.r(user);
                }
                this.y = str3;
                ff0Var.l(str3, false);
            }
            if (this.n == null) {
                if (user.bot) {
                    int i6 = aob.y6;
                    emaVar.setTag(Integer.valueOf(i6));
                    if (z2) {
                        i6 = aob.fh;
                    }
                    yob.W(emaVar, i6, vnbVar);
                    emaVar.l(ob6.M0(2131753149, null), false);
                } else {
                    long j = user.id;
                    int i7 = this.x;
                    if (j == yac.h(i7).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || uc7.s1(i7).a0.containsKey(Long.valueOf(user.id)))) {
                        int i8 = aob.n6;
                        emaVar.setTag(Integer.valueOf(i8));
                        if (z2) {
                            i8 = aob.gh;
                        }
                        yob.W(emaVar, i8, vnbVar);
                        emaVar.l(ob6.M0(2131747553, null), false);
                    } else {
                        int i9 = aob.y6;
                        emaVar.setTag(Integer.valueOf(i9));
                        if (z2) {
                            i9 = aob.fh;
                        }
                        yob.W(emaVar, i9, vnbVar);
                        emaVar.l(ob6.d0(i7, user, null, null), false);
                    }
                }
                emaVar.setEmojiColor(emaVar.getTextColor());
            }
            de0Var.f(user, rb0Var);
        }
        chat = null;
        de0Var.setRoundRadius(hl.L((chat == null && chat.forum) ? 14.0f : 24.0f));
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
                requirementToContact = uc7.s1(this.x).P2(((TLRPC.User) this.f).id);
            }
        }
        boolean z = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.P == z && this.Q == wf3.j(requirementToContact)) {
            return;
        }
        this.P = z;
        this.Q = wf3.j(requirementToContact);
        this.O.f(this.P, true);
        invalidate();
    }

    public og2 getCheckBox() {
        return this.d;
    }

    public Object getObject() {
        return this.f;
    }

    public ema getStatusTextView() {
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
        vnb vnbVar = this.N;
        if (d <= 0.0f && this.w == 2 && (this.I || this.J > 0.0f)) {
            int v0 = aob.v0(aob.W6, vnbVar);
            Paint paint = this.K;
            paint.setColor(v0);
            de0 de0Var = this.a;
            canvas.drawCircle((de0Var.getMeasuredWidth() / 2) + de0Var.getLeft(), (de0Var.getMeasuredHeight() / 2) + de0Var.getTop(), (hl.L(4.0f) * this.J) + hl.L(18.0f), paint);
        }
        if (this.F) {
            boolean z = ob6.a0;
            byte b = this.G;
            int L = hl.L(z ? 0.0f : b + 72);
            int measuredWidth = getMeasuredWidth() - hl.L(ob6.a0 ? b + 72 : 0.0f);
            if (!this.L) {
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), aob.U0("paintDivider", vnbVar));
            } else {
                aob.k0.setColor(aob.v0(aob.Xg, vnbVar));
                canvas.drawRect(L, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), aob.k0);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.d;
        if (og2Var != null ? og2Var.a.q : this.I) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        Object obj = this.f;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.f)) ? 58.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setCheckBoxEnabled(boolean z) {
        og2 og2Var = this.d;
        if (og2Var != null) {
            og2Var.setEnabled(z);
        }
    }

    public void setDrawDivider(boolean z) {
        this.F = z;
        invalidate();
    }

    public void setForbiddenCheck(boolean z) {
        this.d.setForbidden(z);
    }

    @Override // snb
    public final void updateColors() {
        int textColor;
        ema emaVar = this.c;
        if (emaVar != null) {
            try {
                if (this.f != null && !this.r && !this.s && (textColor = emaVar.getTextColor()) != this.W) {
                    this.W = textColor;
                    emaVar.setEmojiColor(textColor);
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        de0 de0Var = this.a;
        if (de0Var != null) {
            de0Var.invalidate();
        }
        try {
            if (!this.s || de0Var == null) {
                return;
            }
            Drawable t = de0Var.getImageReceiver().t();
            if (t instanceof rb0) {
                ((rb0) t).h(aob.w0(null, aob.T7, false), aob.w0(null, aob.a8, false));
                de0Var.invalidate();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public bd5(Context context, int i, int i2, boolean z) {
        this(i, i2, null, context, z, false);
    }
}
