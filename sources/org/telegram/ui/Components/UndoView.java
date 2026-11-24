package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
@Deprecated
/* loaded from: classes2.dex */
public class UndoView extends FrameLayout implements vlb {
    public static final /* synthetic */ int j0 = 0;
    public final TextPaint E;
    public final Paint F;
    public final RectF G;
    public long H;
    public int I;
    public String J;
    public int K;
    public int L;
    public ArrayList M;
    public Runnable N;
    public Runnable O;
    public long P;
    public float Q;
    public boolean R;
    public final boolean S;
    public CharSequence T;
    public int U;
    public final ShapeDrawable V;
    public final ylb W;
    public byte a;
    public boolean a0;
    public final sf1 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public final ArrayList d0;
    public final ImageView e;
    public int e0;
    public final s09 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final bf0 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.d s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context, org.telegram.ui.ActionBar.d dVar, boolean z, ylb ylbVar) {
        super(context);
        this.a = (byte) 0;
        this.y = z8c.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = gm.L(8.0f);
        this.h0 = 1.0f;
        this.W = ylbVar;
        this.s = dVar;
        this.S = z;
        sf1 sf1Var = new sf1(this, context, ylbVar);
        this.b = sf1Var;
        sf1Var.setTextSize(1, 15.0f);
        int i = cmb.xj;
        anb.X(sf1Var, i, ylbVar);
        int i2 = cmb.wj;
        anb.G(sf1Var, i2, ylbVar);
        sf1Var.setMovementMethod(new d7c(this));
        addView(sf1Var, qoe.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        anb.X(textView, i, ylbVar);
        anb.G(textView, i2, ylbVar);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new cm((byte) 0));
        addView(textView, qoe.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        s09 s09Var = new s09(context);
        this.f = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = cmb.vj;
        i(i3, "info1", true);
        i(i3, "info2", true);
        i(i, "luc12", false);
        i(i, "luc11", false);
        i(i, "luc10", false);
        i(i, "luc9", false);
        i(i, "luc8", false);
        i(i, "luc7", false);
        i(i, "luc6", false);
        i(i, "luc5", false);
        i(i, "luc4", false);
        i(i, "luc3", false);
        i(i, "luc2", false);
        i(i, "luc1", false);
        i(i, "Oval", false);
        addView(s09Var, qoe.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.h = bf0Var;
        bf0Var.setRoundRadius(gm.L(15.0f));
        addView(bf0Var, qoe.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(cmb.Y(cmb.v0(i2, ylbVar) & 587202559, gm.L(2.0f), gm.L(2.0f)));
        addView(linearLayout, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new c7c(this, (byte) 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        anb.s(imageView, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, qoe.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        ts2.s(textView2, 1, 14.0f);
        wi8.x(textView2, i2, ylbVar, null, 2131743572);
        linearLayout.addView(textView2, qoe.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(gm.L(15.0f), gm.L(15.0f), gm.L(33.0f), gm.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(cmb.v0(i, ylbVar));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setTypeface(gm.o());
        textPaint.setColor(cmb.v0(i, ylbVar));
        setWillNotDraw(false);
        this.V = cmb.b0(gm.L(10.0f), cmb.v0(i3, ylbVar));
        setOnTouchListener(new xob((byte) 4));
        setVisibility(4);
    }

    public boolean a() {
        return true;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.vj));
    }

    public final boolean c() {
        int i;
        Object obj;
        int i2 = this.L;
        if (i2 == 11 || i2 == 24 || i2 == 6 || i2 == 3 || i2 == 5 || i2 == 13 || i2 == 14 || i2 == 74) {
            return true;
        }
        if ((i2 == 7 && oc7.r1(this.y).G0.isEmpty()) || (i = this.L) == 83 || i == 85) {
            return true;
        }
        return i == 88 && (obj = this.x) != null && ((Integer) obj).intValue() > 0;
    }

    public void d(int i, boolean z) {
        if (getVisibility() == 0 && this.R) {
            this.w = null;
            this.x = null;
            this.R = false;
            Runnable runnable = this.N;
            if (runnable != null) {
                if (z) {
                    runnable.run();
                }
                this.N = null;
            }
            Runnable runnable2 = this.O;
            if (runnable2 != null) {
                if (!z) {
                    runnable2.run();
                }
                this.O = null;
            }
            int i2 = this.L;
            if (i2 == 0 || i2 == 1 || i2 == 95 || i2 == 26 || i2 == 27) {
                for (int i3 = 0; i3 < this.M.size(); i3++) {
                    long longValue = ((Long) this.M.get(i3)).longValue();
                    oc7 r1 = oc7.r1(this.y);
                    int i4 = this.L;
                    boolean z2 = i4 == 0 || i4 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) r1.R.f(longValue);
                    if (dialog != null) {
                        if (z2) {
                            r1.v0.l(longValue);
                        } else {
                            r1.u0.l(longValue);
                            if (!z) {
                                r1.y.add(dialog);
                                r1.b5(null);
                            }
                        }
                        if (!z) {
                            r1.getNotificationCenter().k(nm7.r, Boolean.TRUE);
                        }
                    }
                    g(this.L, longValue);
                }
            }
            boolean z3 = this.S;
            if (i == 0) {
                setEnterOffset((z3 ? -1.0f : 1.0f) * (this.e0 + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z3 ? -1.0f : 1.0f) * (this.e0 + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new q7b(this, (byte) 14));
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.Q == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.i0) + gm.L(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public final boolean e() {
        int i = this.L;
        return i == 12 || i == 15 || i == 24 || i == 74 || i == 83;
    }

    public final boolean f() {
        int i = this.L;
        return i == 6 || i == 3 || i == 5 || i == 7 || i == 8 || i == 87 || i == 9 || i == 10 || i == 13 || i == 14 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23 || i == 30 || i == 31 || i == 32 || i == 102 || i == 33 || i == 34 || i == 35 || i == 36 || i == 74 || i == 37 || i == 38 || i == 39 || i == 40 || i == 42 || i == 43 || i == 77 || i == 44 || i == 78 || i == 79 || i == 100 || i == 101 || i == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.V;
    }

    public Object getCurrentInfoObject() {
        return this.w;
    }

    public float getEnterOffset() {
        return this.i0;
    }

    public View getUndoButton() {
        return this.n;
    }

    public final void h(int i, int i2) {
        this.a0 = true;
        cmb.A1(-115203550, this.V);
        sf1 sf1Var = this.b;
        anb.q(sf1Var);
        int i3 = cmb.wj;
        ylb ylbVar = this.W;
        anb.G(sf1Var, i3, ylbVar);
        TextView textView = this.c;
        anb.q(textView);
        anb.G(textView, i3, ylbVar);
        sf1Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.b0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.d0;
        ArrayList arrayList3 = this.c0;
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            arrayList3.remove(indexOf);
            arrayList2.remove(indexOf);
        }
        int indexOf2 = arrayList.indexOf("info2");
        if (indexOf2 >= 0) {
            arrayList.remove(indexOf2);
            arrayList3.remove(indexOf2);
            arrayList2.remove(indexOf2);
        }
        s09 s09Var = this.f;
        s09Var.h(-14540254, "info1");
        s09Var.h(-14540254, "info2");
    }

    public final void i(int i, String str, boolean z) {
        ArrayList arrayList = this.b0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.d0;
        ArrayList arrayList3 = this.c0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i));
            arrayList2.set(indexOf, Boolean.valueOf(z));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i));
            arrayList2.add(Boolean.valueOf(z));
        }
        int v0 = cmb.v0(i, this.W);
        if (z) {
            v0 |= -16777216;
        }
        this.f.h(v0, str);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i, long j, Runnable runnable) {
        k(j, i, null, null, runnable, null);
    }

    public void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        n(arrayList, i, obj, obj2, runnable, runnable2);
    }

    public final void l(long j, int i, Runnable runnable, Runnable runnable2) {
        k(j, i, null, null, runnable, runnable2);
    }

    public final void m(Object obj, int i, long j) {
        k(j, i, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x1735  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1757  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1839  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x1719  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1792  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        sf1 sf1Var;
        TextView textView;
        int i2;
        boolean z;
        long j;
        int i3;
        int L;
        CharSequence S2;
        int i4;
        SpannableStringBuilder R2;
        SpannableStringBuilder R22;
        CharSequence L0;
        String str;
        int i5;
        int i6;
        int i7;
        if (!gm.C3() && ((i7 = this.L) == 52 || i7 == 56 || i7 == 57 || i7 == 58 || i7 == 59 || i7 == 60 || i7 == 80 || i7 == 33)) {
            return;
        }
        Runnable runnable3 = this.N;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.R = true;
        this.N = runnable;
        this.O = runnable2;
        this.M = arrayList;
        Long l = (Long) arrayList.get(0);
        long longValue = l.longValue();
        this.L = i;
        this.H = 5000L;
        this.w = obj;
        this.x = obj2;
        this.P = SystemClock.elapsedRealtime();
        String L02 = jb6.L0(2131743572);
        TextView textView2 = this.d;
        textView2.setText(L02);
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        s09 s09Var = this.f;
        s09Var.setPadding(0, 0, 0, 0);
        s09Var.setScaleX(1.0f);
        s09Var.setScaleY(1.0f);
        sf1 sf1Var2 = this.b;
        sf1Var2.setTextSize(1, 15.0f);
        bf0 bf0Var = this.h;
        bf0Var.setVisibility(8);
        sf1Var2.setGravity(51);
        TextView textView3 = this.c;
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = gm.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sf1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = gm.L(13.0f);
        layoutParams.bottomMargin = 0;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s09Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = gm.L(3.0f);
        layoutParams2.width = gm.L(54.0f);
        layoutParams2.height = -2;
        sf1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i == 83) {
            setOnClickListener(new c7c(this, (byte) 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new xob((byte) 5));
            movementMethod = null;
        }
        sf1Var2.setMovementMethod(movementMethod);
        boolean f = f();
        LinearLayout linearLayout = this.n;
        int i8 = this.y;
        int i9 = 36;
        if (f) {
            if (i == 83) {
                textView3.setSingleLine(false);
                S2 = jb6.L0(2131745016);
                CharSequence P2 = gm.P2(jb6.L0(2131745015), runnable);
                this.N = null;
                this.H = 4000L;
                L0 = P2;
                i4 = R.raw.sound_download;
            } else if (i == 74) {
                textView3.setSingleLine(false);
                S2 = jb6.L0(2131745955);
                L0 = jb6.Y(2131745940, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i4 = R.raw.ic_admin;
            } else {
                if (i == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder S22 = sd2.W((TLRPC.Chat) obj2) ? gm.S2(jb6.Y(2131743163, "VoipChannelInvitedUser", m9c.j(user))) : gm.S2(jb6.Y(2131743055, "VoipGroupInvitedUser", m9c.j(user)));
                    pc0 pc0Var = new pc0();
                    pc0Var.s(gm.L(12.0f));
                    pc0Var.q(user);
                    bf0Var.f(user, pc0Var);
                    bf0Var.setVisibility(0);
                    this.H = 3000L;
                    S2 = S22;
                } else if (i == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        S2 = sd2.W(chat) ? gm.S2(jb6.Z(2131743134, m9c.j(user2))) : gm.S2(jb6.Z(2131743111, m9c.j(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        boolean W = sd2.W(chat);
                        String str2 = ((TLRPC.Chat) obj).title;
                        S2 = W ? gm.S2(jb6.Z(2131743171, str2)) : gm.S2(jb6.Z(2131743128, str2));
                    } else {
                        S2 = "";
                    }
                    pc0 pc0Var2 = new pc0();
                    pc0Var2.s(gm.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    pc0Var2.o(tLObject);
                    bf0Var.f(tLObject, pc0Var2);
                    bf0Var.setVisibility(0);
                    this.H = 3000L;
                } else if (i == 37) {
                    pc0 pc0Var3 = new pc0();
                    pc0Var3.s(gm.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        pc0Var3.q(user3);
                        bf0Var.f(user3, pc0Var3);
                        str = bw2.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        pc0Var3.p(chat2);
                        bf0Var.f(chat2, pc0Var3);
                        str = chat2.title;
                    }
                    if (sd2.W((TLRPC.Chat) obj2)) {
                        i5 = 0;
                        S2 = gm.S2(jb6.Y(2131743135, "VoipChannelUserChanged", str));
                    } else {
                        i5 = 0;
                        S2 = gm.S2(jb6.Y(2131742996, "VoipGroupUserChanged", str));
                    }
                    bf0Var.setVisibility(i5);
                    this.H = 3000L;
                } else {
                    if (i == 33) {
                        S2 = jb6.L0(2131743073);
                        this.H = 3000L;
                        sf1Var = sf1Var2;
                        i4 = R.raw.voip_invite;
                    } else if (i == 77) {
                        S2 = (CharSequence) obj;
                        this.H = 5000L;
                        if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                            sf1Var = sf1Var2;
                        } else {
                            setOnTouchListener(null);
                            sf1Var = sf1Var2;
                            sf1Var.setMovementMethod(null);
                            setOnClickListener(new fyb(this, (TLRPC.Message) obj2, (byte) 5));
                        }
                        i4 = R.raw.payment_success;
                    } else {
                        sf1Var = sf1Var2;
                        if (i == 30) {
                            S2 = gm.S2(jb6.Y(2131742998, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? m9c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                            this.H = 3000L;
                        } else if (i == 35) {
                            S2 = gm.S2(jb6.Y(2131742997, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? m9c.j((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                            this.H = 3000L;
                        } else {
                            if (i == 31) {
                                S2 = gm.S2(jb6.Y(2131743000, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? m9c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i == 38) {
                                S2 = obj instanceof TLRPC.Chat ? gm.S2(jb6.Y(2131742988, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : gm.S2(jb6.L0(2131742989));
                                this.H = 3000L;
                                i4 = R.raw.voip_allow_talk;
                            } else if (i == 42) {
                                S2 = sd2.W((TLRPC.Chat) obj) ? gm.S2(jb6.L0(2131743144)) : gm.S2(jb6.L0(2131743019));
                                this.H = 3000L;
                                i4 = R.raw.ic_mute;
                            } else if (i == 43) {
                                S2 = sd2.W((TLRPC.Chat) obj) ? gm.S2(jb6.L0(2131743143)) : gm.S2(jb6.L0(2131743018));
                                this.H = 3000L;
                                i4 = R.raw.ic_unmute;
                            } else {
                                int i10 = this.L;
                                if (i10 == 39 || i10 == 100) {
                                    S2 = gm.S2(jb6.L0(i10 == 39 ? 2131743081 : 2131742992));
                                    this.H = 3000L;
                                    i4 = R.raw.voip_record_start;
                                } else if (i10 == 40 || i10 == 101) {
                                    String L03 = jb6.L0(i10 == 40 ? 2131743082 : 2131742993);
                                    this.H = 4000L;
                                    sf1Var.setMovementMethod(new cm((byte) 0));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L03);
                                    int indexOf = L03.indexOf("**");
                                    int lastIndexOf = L03.lastIndexOf("**");
                                    if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                        spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                        try {
                                            spannableStringBuilder.setSpan(new g6c("tg://openmessage?user_id=" + z8c.h(i8).e()), indexOf, lastIndexOf - 2, 33);
                                        } catch (Exception e) {
                                            fc4.f(e);
                                        }
                                    }
                                    i4 = R.raw.voip_record_saved;
                                    S2 = spannableStringBuilder;
                                } else if (i == 36) {
                                    S2 = gm.S2(jb6.Y(2131742999, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? m9c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i == 32 || i == 102) {
                                    String j2 = obj instanceof TLRPC.User ? m9c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                    S2 = i == 102 ? gm.S2(jb6.Z(2131743108, j2)) : gm.S2(jb6.Z(2131743028, j2));
                                    this.H = 3000L;
                                    i4 = R.raw.ic_ban;
                                } else {
                                    if (i == 9 || i == 10) {
                                        TLRPC.User user4 = (TLRPC.User) obj;
                                        S2 = i == 9 ? gm.S2(jb6.Y(2131751232, "EditAdminTransferChannelToast", m9c.j(user4))) : gm.S2(jb6.Y(2131751231, "EditAdminTransferGroupToast", m9c.j(user4)));
                                    } else if (i == 8) {
                                        S2 = jb6.Y(2131747567, "NowInContacts", m9c.j((TLRPC.User) obj));
                                    } else if (i == 87) {
                                        S2 = jb6.Z(2131746343, new Object[0]);
                                    } else if (i == 22) {
                                        if (pg3.D(longValue)) {
                                            S2 = obj == null ? jb6.L0(2131748467) : jb6.L0(2131748466);
                                        } else {
                                            TLRPC.Chat L04 = oc7.r1(z8c.t0).L0(Long.valueOf(-longValue));
                                            S2 = (!sd2.T(L04) || L04.megagroup) ? obj == null ? jb6.L0(2131748469) : jb6.L0(2131748468) : obj == null ? jb6.L0(2131748471) : jb6.L0(2131748470);
                                        }
                                    } else if (i == 23) {
                                        S2 = jb6.L0(2131752132);
                                    } else {
                                        if (i == 6) {
                                            S2 = jb6.L0(2131754134);
                                            L0 = jb6.L0(2131754133);
                                            i4 = R.raw.chats_swipearchive;
                                            i9 = 48;
                                        } else {
                                            if (i10 == 13) {
                                                S2 = jb6.L0(2131746177);
                                                L0 = jb6.L0(2131746176);
                                                i4 = R.raw.wallet_congrats;
                                            } else {
                                                if (i10 != 14) {
                                                    if (i == 7) {
                                                        S2 = jb6.L0(2131754117);
                                                        if (oc7.r1(i8).G0.isEmpty()) {
                                                            L0 = jb6.L0(2131754116);
                                                            i4 = R.raw.chats_infotip;
                                                        }
                                                        L0 = null;
                                                        i4 = R.raw.chats_infotip;
                                                    } else if (i == 20 || i == 21) {
                                                        ub7 ub7Var = (ub7) obj2;
                                                        Spannable y5 = k47.y5(sf1Var.getPaint().getFontMetricsInt(), gw3.l(ub7Var.b, sf1Var.getPaint().getFontMetricsInt(), false), ub7Var.c);
                                                        this.a = ub7Var.n ? (byte) 26 : (byte) 0;
                                                        if (longValue != 0) {
                                                            if (pg3.B(longValue)) {
                                                                longValue = oc7.r1(i8).Z0(Integer.valueOf(pg3.h(longValue))).user_id;
                                                            }
                                                            if (pg3.D(longValue)) {
                                                                TLRPC.User W1 = oc7.r1(i8).W1(Long.valueOf(longValue));
                                                                String j3 = m9c.j(W1);
                                                                if (m9c.D(W1)) {
                                                                    j3 = jb6.L0(2131745635);
                                                                } else if (m9c.B(W1)) {
                                                                    j3 = jb6.L0(2131745999);
                                                                }
                                                                R22 = i == 20 ? gm.R2(jb6.U(2131750630, j3, y5)) : gm.R2(jb6.U(2131750629, j3, y5));
                                                            } else {
                                                                TLRPC.Chat L05 = oc7.r1(i8).L0(Long.valueOf(-longValue));
                                                                R22 = i == 20 ? gm.R2(jb6.U(2131750736, L05.title, y5)) : gm.R2(jb6.U(2131750735, L05.title, y5));
                                                            }
                                                            R2 = R22;
                                                        } else {
                                                            R2 = i == 20 ? gm.R2(jb6.U(2131750732, jb6.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y5)) : gm.R2(jb6.U(2131750731, jb6.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y5));
                                                        }
                                                        i4 = i == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        S2 = R2;
                                                    } else if (i == 19) {
                                                        S2 = this.T;
                                                        i4 = R.raw.ic_delete;
                                                    } else if (i == 82) {
                                                        S2 = jb6.L0(((jo6) obj).b ? 2131753919 : 2131753924);
                                                        i4 = 0;
                                                    } else if (i == 78 || i == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        S2 = i == 78 ? jb6.G(intValue, "PinnedDialogsCount", new Object[0]) : jb6.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i4 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.H = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        S2 = i == 3 ? jb6.L0(2131752183) : jb6.L0(2131752118);
                                                        if (oc7.r1(i8).G0.isEmpty()) {
                                                            L0 = jb6.L0(2131752182);
                                                            i4 = R.raw.chats_infotip;
                                                        }
                                                        L0 = null;
                                                        i4 = R.raw.chats_infotip;
                                                    }
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append((Object) sf1Var.getText());
                                                    sb.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                                                    gm.g2(sb.toString());
                                                    if (!e()) {
                                                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                                                        if (measuredWidth == 0) {
                                                            measuredWidth = gm.q.x;
                                                        }
                                                        measureChildWithMargins(textView3, wi8.f(16.0f, measuredWidth, TLObject.FLAG_30), 0, 0, 0);
                                                        this.r = gm.L(37.0f) + textView3.getMeasuredHeight();
                                                    } else if (c()) {
                                                        this.r = gm.L(52.0f);
                                                    } else if (getParent() instanceof ViewGroup) {
                                                        ViewGroup viewGroup = (ViewGroup) getParent();
                                                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                                                        if (measuredWidth2 <= 0) {
                                                            measuredWidth2 = gm.q.x;
                                                        }
                                                        View view = sf1Var;
                                                        measureChildWithMargins(view, wi8.f(16.0f, measuredWidth2, TLObject.FLAG_30), 0, 0, 0);
                                                        int measuredHeight = view.getMeasuredHeight();
                                                        int i11 = this.L;
                                                        int L2 = gm.L((i11 == 16 || i11 == 17 || i11 == 18 || i11 == 84 || i11 == 86) ? 14.0f : 28.0f) + measuredHeight;
                                                        this.r = L2;
                                                        int i12 = this.L;
                                                        if (i12 == 18) {
                                                            this.r = Math.max(L2, gm.L(52.0f));
                                                        } else if (i12 == 25) {
                                                            this.r = Math.max(L2, gm.L(50.0f));
                                                        } else if (z) {
                                                            this.r = L2 - gm.L(8.0f);
                                                        }
                                                    }
                                                    if (getVisibility() == 0) {
                                                        setVisibility(0);
                                                        setEnterOffset((this.S ? -1.0f : 1.0f) * (this.e0 + this.r));
                                                        AnimatorSet animatorSet = new AnimatorSet();
                                                        boolean z2 = this.S;
                                                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z2 ? -1.0f : 1.0f) * (this.e0 + this.r), z2 ? 1.0f : -1.0f));
                                                        animatorSet.setInterpolator(new DecelerateInterpolator());
                                                        animatorSet.setDuration(180L);
                                                        animatorSet.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                S2 = jb6.L0(2131746175);
                                                L0 = jb6.L0(2131746174);
                                                i4 = R.raw.wallet_science;
                                            }
                                            i9 = 44;
                                        }
                                        sf1Var.setText(S2);
                                        if (i4 == 0) {
                                            s09Var.e(i4, i9, i9);
                                            p09 animatedDrawable = s09Var.getAnimatedDrawable();
                                            animatedDrawable.h = false;
                                            animatedDrawable.K(animatedDrawable.n());
                                            s09Var.setVisibility(0);
                                            s09Var.setProgress(0.0f);
                                            s09Var.d();
                                        } else {
                                            s09Var.setVisibility(8);
                                        }
                                        if (L0 == null) {
                                            layoutParams.leftMargin = gm.L(58.0f);
                                            layoutParams.topMargin = gm.L(6.0f);
                                            layoutParams.rightMargin = gm.L(8.0f);
                                            ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = gm.L(8.0f);
                                            textView3.setText(L0);
                                            textView3.setVisibility(0);
                                            sf1Var.setTextSize(1, 14.0f);
                                            sf1Var.setTypeface(gm.o());
                                            i6 = 8;
                                        } else {
                                            layoutParams.leftMargin = gm.L(58.0f);
                                            layoutParams.topMargin = gm.L(13.0f);
                                            layoutParams.rightMargin = gm.L(8.0f);
                                            i6 = 8;
                                            textView3.setVisibility(8);
                                            sf1Var.setTextSize(1, 15.0f);
                                            sf1Var.setTypeface(Typeface.DEFAULT);
                                        }
                                        linearLayout.setVisibility(i6);
                                    }
                                    i4 = R.raw.contact_check;
                                }
                            }
                            i4 = R.raw.voip_unmuted;
                        }
                        i4 = R.raw.voip_muted;
                    }
                    L0 = null;
                    sf1Var.setText(S2);
                    if (i4 == 0) {
                    }
                    if (L0 == null) {
                    }
                    linearLayout.setVisibility(i6);
                }
                sf1Var = sf1Var2;
                i4 = 0;
                L0 = null;
                sf1Var.setText(S2);
                if (i4 == 0) {
                }
                if (L0 == null) {
                }
                linearLayout.setVisibility(i6);
            }
            sf1Var = sf1Var2;
            sf1Var.setText(S2);
            if (i4 == 0) {
            }
            if (L0 == null) {
            }
            linearLayout.setVisibility(i6);
        } else {
            sf1Var = sf1Var2;
            int i13 = this.L;
            ylb ylbVar = this.W;
            if (i13 == 45 || i13 == 46 || i13 == 47 || i13 == 52 || i13 == 53 || i13 == 54 || i13 == 55 || i13 == 56 || i13 == 57 || i13 == 58 || i13 == 59 || i13 == 60 || i13 == 71 || i13 == 70 || i13 == 75 || i13 == 76 || i13 == 41 || i13 == 78 || i13 == 79 || i13 == 61 || i13 == 80) {
                imageView.setVisibility(8);
                s09Var.setVisibility(0);
                sf1Var.setTypeface(Typeface.DEFAULT);
                int i14 = this.L;
                long j4 = -1;
                if (i14 == 76) {
                    sf1Var.setText(jb6.L0(2131752834));
                    s09Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = gm.L(9.0f);
                    z = true;
                    sf1Var.setTextSize(1, 14.0f);
                } else if (i14 == 75) {
                    sf1Var.setText(jb6.L0(2131749333));
                    s09Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = gm.L(9.0f);
                    sf1Var.setTextSize(1, 14.0f);
                    z = true;
                } else {
                    if (i == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        textView3.setSingleLine(false);
                        sf1Var.setText(jb6.Y(2131753819, "AutoDeleteHintOnText", jb6.c0(intValue2)));
                        s09Var.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = gm.L(9.0f);
                        this.H = 4000L;
                        s09Var.setPadding(0, 0, 0, gm.L(3.0f));
                    } else {
                        if (i14 == 71) {
                            sf1Var.setText(jb6.L0(2131753820));
                            s09Var.e(R.raw.fire_off, 36, 36);
                            sf1Var.setTextSize(1, 14.0f);
                            this.H = 3000L;
                            s09Var.setPadding(0, 0, 0, gm.L(4.0f));
                        } else if (i14 == 45) {
                            sf1Var.setText(jb6.L0(2131749001));
                            s09Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = gm.L(9.0f);
                            sf1Var.setTextSize(1, 14.0f);
                            z = true;
                        } else if (i14 == 46) {
                            sf1Var.setText(jb6.L0(2131749000));
                            s09Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = gm.L(9.0f);
                            sf1Var.setTextSize(1, 14.0f);
                        } else if (i14 == 47) {
                            sf1Var.setText(jb6.L0(2131748978));
                            s09Var.e(R.raw.imported, 36, 36);
                            s09Var.setPadding(0, 0, 0, gm.L(5.0f));
                            layoutParams.topMargin = gm.L(9.0f);
                            sf1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i14 == 52 || i14 == 56 || i14 == 57 || i14 == 58 || i14 == 59 || i14 == 60 || i14 == 80) {
                                textView = textView2;
                                if (!gm.C3()) {
                                    return;
                                }
                                int i15 = this.L;
                                if (i15 == 80) {
                                    sf1Var.setText(jb6.L0(2131751140));
                                } else if (i15 == 60) {
                                    sf1Var.setText(jb6.L0(2131747028));
                                } else if (i15 == 56) {
                                    sf1Var.setText(jb6.L0(2131743352));
                                } else if (i15 == 57) {
                                    sf1Var.setText(jb6.L0(2131749119));
                                } else if (i15 == 52) {
                                    sf1Var.setText(jb6.L0(2131748346));
                                } else if (i15 == 59) {
                                    sf1Var.setText(jb6.L0(2131748678));
                                    i2 = R.raw.voip_invite;
                                    s09Var.e(i2, 30, 30);
                                    this.H = 3000L;
                                    sf1Var.setTextSize(1, 15.0f);
                                } else {
                                    sf1Var.setText(jb6.L0(2131743879));
                                }
                                i2 = R.raw.copy;
                                s09Var.e(i2, 30, 30);
                                this.H = 3000L;
                                sf1Var.setTextSize(1, 15.0f);
                            } else if (i14 == 54) {
                                sf1Var.setText(jb6.L0(2131752280));
                                s09Var.e(R.raw.silent_unmute, 30, 30);
                                this.H = 3000L;
                                sf1Var.setTextSize(1, 15.0f);
                            } else {
                                textView = textView2;
                                if (i14 == 55) {
                                    sf1Var.setText(jb6.L0(2131752281));
                                    s09Var.e(R.raw.silent_mute, 30, 30);
                                    this.H = 3000L;
                                    sf1Var.setTextSize(1, 15.0f);
                                } else if (i14 == 41) {
                                    if (obj2 != null) {
                                        sf1Var.setText(gm.S2(jb6.Y(2131748944, "InvLinkToChats", jb6.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    } else if (longValue == z8c.h(i8).n) {
                                        sf1Var.setText(gm.S2(jb6.L0(2131748942)));
                                    } else if (pg3.y(longValue)) {
                                        sf1Var.setText(gm.S2(jb6.Y(2131748943, "InvLinkToGroup", oc7.r1(i8).L0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        sf1Var.setText(gm.S2(jb6.Y(2131748941, "InvLinkToUser", m9c.j(oc7.r1(i8).W1(l)))));
                                    }
                                    s09Var.e(R.raw.contact_check, 36, 36);
                                    this.H = 3000L;
                                } else if (i14 == 53) {
                                    Integer num = (Integer) obj;
                                    if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                        int intValue3 = ((Integer) obj2).intValue();
                                        if (num.intValue() == 1) {
                                            sf1Var.setText(gm.S2(jb6.G(intValue3, "FwdMessageToManyChats", new Object[0])));
                                        } else {
                                            sf1Var.setText(gm.S2(jb6.G(intValue3, "FwdMessagesToManyChats", new Object[0])));
                                        }
                                        s09Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == z8c.h(i8).n) {
                                        if (num.intValue() == 1) {
                                            sf1Var.setText(gm.P2(jb6.L0(2131750431), new jd((byte) 14)));
                                        } else {
                                            sf1Var.setText(gm.P2(jb6.L0(2131750424), new jd((byte) 14)));
                                        }
                                        s09Var.e(R.raw.saved_messages, 30, 30);
                                        this.H = 3000L;
                                    } else {
                                        if (pg3.y(longValue)) {
                                            TLRPC.Chat L06 = oc7.r1(i8).L0(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String j5 = sd2.p0(L06) ? no4.j(i8, L06, false) : null;
                                            if (num.intValue() == 1) {
                                                if (j5 == null) {
                                                    j5 = tL_forumTopic != null ? tL_forumTopic.title : L06.title;
                                                }
                                                sf1Var.setText(gm.S2(jb6.Y(2131750435, "FwdMessageToGroup", j5)));
                                            } else {
                                                if (j5 == null) {
                                                    j5 = tL_forumTopic != null ? tL_forumTopic.title : L06.title;
                                                }
                                                sf1Var.setText(gm.S2(jb6.Y(2131750428, "FwdMessagesToGroup", j5)));
                                            }
                                        } else {
                                            TLRPC.User W12 = oc7.r1(i8).W1(l);
                                            if (num.intValue() == 1) {
                                                sf1Var.setText(gm.S2(jb6.Y(2131750430, "FwdMessageToUser", m9c.j(W12))));
                                            } else {
                                                sf1Var.setText(gm.S2(jb6.Y(2131750423, "FwdMessagesToUser", m9c.j(W12))));
                                            }
                                        }
                                        s09Var.e(R.raw.forward, 30, 30);
                                    }
                                    j4 = 300;
                                    this.H = 3000L;
                                } else if (i14 == 61) {
                                    if (obj2 != null) {
                                        sf1Var.setText(gm.S2(jb6.Y(2131753702, "BackgroundToChats", jb6.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                        s09Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == z8c.h(i8).n) {
                                        sf1Var = sf1Var;
                                        sf1Var.setText(gm.S2(jb6.L0(2131753700)));
                                        s09Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        sf1Var = sf1Var;
                                        if (pg3.y(longValue)) {
                                            sf1Var.setText(gm.S2(jb6.Y(2131753701, "BackgroundToGroup", oc7.r1(i8).L0(Long.valueOf(-longValue)).title)));
                                        } else {
                                            sf1Var.setText(gm.S2(jb6.Y(2131753699, "BackgroundToUser", m9c.j(oc7.r1(i8).W1(l)))));
                                        }
                                        s09Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.H = 3000L;
                                }
                            }
                            j = j4;
                            i3 = 8;
                            z = false;
                            textView3.setVisibility(i3);
                            anb.X(textView, cmb.wj, ylbVar);
                            linearLayout.setVisibility(i3);
                            layoutParams.leftMargin = gm.L(58.0f);
                            layoutParams.rightMargin = gm.L(8.0f);
                            s09Var.setProgress(0.0f);
                            s09Var.d();
                            if (j > 0) {
                                s09Var.postDelayed(new zcb(this, (byte) 29), j);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) sf1Var.getText());
                            if (textView3.getVisibility() == 0) {
                            }
                            sb2.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                            gm.g2(sb2.toString());
                            if (!e()) {
                            }
                            if (getVisibility() == 0) {
                            }
                        }
                        textView = textView2;
                        j = j4;
                        i3 = 8;
                        z = false;
                        textView3.setVisibility(i3);
                        anb.X(textView, cmb.wj, ylbVar);
                        linearLayout.setVisibility(i3);
                        layoutParams.leftMargin = gm.L(58.0f);
                        layoutParams.rightMargin = gm.L(8.0f);
                        s09Var.setProgress(0.0f);
                        s09Var.d();
                        if (j > 0) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append((Object) sf1Var.getText());
                        if (textView3.getVisibility() == 0) {
                        }
                        sb22.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                        gm.g2(sb22.toString());
                        if (!e()) {
                        }
                        if (getVisibility() == 0) {
                        }
                    }
                    textView = textView2;
                    j = -1;
                    i3 = 8;
                    z = true;
                    textView3.setVisibility(i3);
                    anb.X(textView, cmb.wj, ylbVar);
                    linearLayout.setVisibility(i3);
                    layoutParams.leftMargin = gm.L(58.0f);
                    layoutParams.rightMargin = gm.L(8.0f);
                    s09Var.setProgress(0.0f);
                    s09Var.d();
                    if (j > 0) {
                    }
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append((Object) sf1Var.getText());
                    if (textView3.getVisibility() == 0) {
                    }
                    sb222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                    gm.g2(sb222.toString());
                    if (!e()) {
                    }
                    if (getVisibility() == 0) {
                    }
                }
                textView = textView2;
                j = -1;
                i3 = 8;
                textView3.setVisibility(i3);
                anb.X(textView, cmb.wj, ylbVar);
                linearLayout.setVisibility(i3);
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = gm.L(8.0f);
                s09Var.setProgress(0.0f);
                s09Var.d();
                if (j > 0) {
                }
                StringBuilder sb2222 = new StringBuilder();
                sb2222.append((Object) sf1Var.getText());
                if (textView3.getVisibility() == 0) {
                }
                sb2222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                gm.g2(sb2222.toString());
                if (!e()) {
                }
                if (getVisibility() == 0) {
                }
            } else if (i13 == 24 || i13 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                imageView.setVisibility(8);
                s09Var.setVisibility(0);
                if (intValue4 != 0) {
                    sf1Var.setTypeface(gm.o());
                    sf1Var.setTextSize(1, 14.0f);
                    s09Var.a.clear();
                    int i16 = cmb.xj;
                    i(i16, "BODY", false);
                    i(i16, "Wibe Big", false);
                    i(i16, "Wibe Big 3", false);
                    i(i16, "Wibe Small", false);
                    sf1Var.setText(jb6.L0(2131746349));
                    s09Var.e(R.raw.ic_unmute, 28, 28);
                    textView3.setVisibility(0);
                    textView3.setSingleLine(false);
                    textView3.setMaxLines(3);
                    if (user5 != null) {
                        textView3.setText(jb6.Y(2131746347, "ProximityAlertSetInfoUser", m9c.j(user5), jb6.y(intValue4, 2, null)));
                    } else {
                        textView3.setText(jb6.Y(2131746348, "ProximityAlertSetInfoGroup2", jb6.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = gm.L(6.0f);
                } else {
                    sf1Var.setTypeface(Typeface.DEFAULT);
                    sf1Var.setTextSize(1, 15.0f);
                    s09Var.a.clear();
                    int i17 = cmb.xj;
                    i(i17, "Body Main", false);
                    i(i17, "Body Top", false);
                    i(i17, "Line", false);
                    i(i17, "Curve Big", false);
                    i(i17, "Curve Small", false);
                    layoutParams.topMargin = gm.L(14.0f);
                    sf1Var.setText(jb6.L0(2131746350));
                    s09Var.e(R.raw.ic_mute, 28, 28);
                    textView3.setVisibility(8);
                    anb.X(textView2, cmb.wj, ylbVar);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = gm.L(58.0f);
                s09Var.setProgress(0.0f);
                s09Var.d();
            } else if (i13 == 11) {
                sf1Var.setText(jb6.L0(2131753851));
                s09Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.topMargin = gm.L(6.0f);
                textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                textView3.setVisibility(0);
                sf1Var.setTextSize(1, 14.0f);
                sf1Var.setTypeface(gm.o());
                anb.X(textView2, cmb.o7, ylbVar);
                imageView.setVisibility(8);
                linearLayout.setVisibility(0);
                s09Var.setVisibility(0);
                s09Var.setProgress(0.0f);
                s09Var.d();
            } else if (i13 == 15) {
                this.H = 10000L;
                textView2.setText(jb6.L0(2131747550));
                sf1Var.setText(jb6.L0(2131750739));
                s09Var.e(R.raw.filter_new, 36, 36);
                int L3 = gm.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = gm.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = L3;
                String L07 = jb6.L0(2131750740);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L07);
                int indexOf2 = L07.indexOf(42);
                int lastIndexOf2 = L07.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new g6c("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView3.setText(spannableStringBuilder2);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
                s09Var.setVisibility(0);
                s09Var.setProgress(0.0f);
                s09Var.d();
            } else if (i13 == 16 || i13 == 17) {
                this.H = 4000L;
                sf1Var.setTextSize(1, 14.0f);
                sf1Var.setGravity(16);
                sf1Var.setMinHeight(gm.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    sf1Var.setText(gm.S2(jb6.L0(2131751387)));
                    s09Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        sf1Var.setText(gm.S2(jb6.L0(2131751615)));
                    } else {
                        String K0 = jb6.K0("DiceEmojiInfo_" + str3);
                        if (TextUtils.isEmpty(K0)) {
                            sf1Var.setText(gw3.l(jb6.Y(2131751388, "DiceEmojiInfo", str3), sf1Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            sf1Var.setText(gw3.l(K0, sf1Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    s09Var.setImageDrawable(gw3.g(str3));
                    s09Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = gm.L(14.0f);
                    layoutParams.bottomMargin = gm.L(14.0f);
                    layoutParams2.leftMargin = gm.L(14.0f);
                    layoutParams2.width = gm.L(26.0f);
                    layoutParams2.height = gm.L(26.0f);
                }
                textView2.setText(jb6.L0(2131745361));
                if (this.L == 16) {
                    L = gm.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    textView2.setVisibility(0);
                    anb.X(textView2, cmb.wj, ylbVar);
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    L = gm.L(8.0f);
                    textView2.setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = gm.L(6.0f);
                layoutParams.bottomMargin = gm.L(7.0f);
                layoutParams.height = -1;
                textView3.setVisibility(8);
                s09Var.setVisibility(0);
            } else if (i13 == 18) {
                this.H = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                sf1Var.setTextSize(1, 14.0f);
                sf1Var.setGravity(16);
                sf1Var.setText((CharSequence) obj);
                textView2.setVisibility(8);
                linearLayout.setVisibility(8);
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = gm.L(8.0f);
                layoutParams.topMargin = gm.L(6.0f);
                layoutParams.bottomMargin = gm.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L4 = gm.L(8.0f);
                layoutParams2.bottomMargin = L4;
                layoutParams2.topMargin = L4;
                s09Var.setVisibility(0);
                s09Var.e(R.raw.chats_infotip, 36, 36);
                s09Var.setProgress(0.0f);
                s09Var.d();
                sf1Var.setMovementMethod(new cm((byte) 0));
            } else if (i13 == 12) {
                sf1Var.setText(jb6.L0(2131751947));
                s09Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = gm.L(48.0f);
                layoutParams.topMargin = gm.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = gm.L(48.0f);
                String L08 = jb6.L0(2131751946);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L08);
                int indexOf3 = L08.indexOf(42);
                int lastIndexOf3 = L08.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new g6c("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView3.setText(spannableStringBuilder3);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                textView2.setVisibility(8);
                linearLayout.setVisibility(0);
                s09Var.setVisibility(0);
            } else if (i13 == 84) {
                sf1Var.setVisibility(0);
                sf1Var.setTextSize(1, 15.0f);
                sf1Var.setTypeface(Typeface.DEFAULT);
                sf1Var.setText(gm.S2(jb6.L0(2131743542)));
                s09Var.setVisibility(0);
                s09Var.e(R.raw.voice_to_text, 36, 36);
                s09Var.setProgress(0.0f);
                s09Var.d();
                textView2.setText(jb6.L0(2131746768));
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = gm.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                int L5 = gm.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                bf0Var.setVisibility(8);
                textView3.setVisibility(8);
                textView2.setVisibility(0);
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
            } else if (i13 == 85) {
                sf1Var.setVisibility(0);
                sf1Var.setTextSize(1, 15.0f);
                sf1Var.setTypeface(gm.o());
                sf1Var.setText(jb6.L0(2131743991));
                s09Var.setVisibility(0);
                s09Var.e(R.raw.hint_swipe_reply, 64, 64);
                s09Var.setProgress(0.0f);
                s09Var.d();
                textView3.setVisibility(0);
                textView3.setText(jb6.L0(2131743990));
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = gm.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.topMargin = gm.L(6.0f);
                layoutParams.height = -2;
                bf0Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i13 == 90 || i13 == 91 || i13 == 92 || i13 == 93 || i13 == 94) {
                switch (i13) {
                    case nm7.a1 /* 90 */:
                        sf1Var.setText(jb6.G((int) oo0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case nm7.b1 /* 91 */:
                        sf1Var.setText(jb6.L0(2131753237));
                        break;
                    case nm7.c1 /* 92 */:
                        sf1Var.setText(jb6.G((int) oo0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case nm7.d1 /* 93 */:
                        sf1Var.setText(gm.S2(jb6.G(oo0.b(), "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case nm7.e1 /* 94 */:
                        sf1Var.setText(jb6.L0(2131753298));
                        break;
                }
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.rightMargin = gm.L(8.0f);
                sf1Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                sf1Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                s09Var.setVisibility(0);
                s09Var.e(R.raw.chats_infotip, 36, 36);
                s09Var.setProgress(0.0f);
                s09Var.d();
            } else {
                int i18 = 2;
                if (i13 != 2) {
                    if (i13 == 4) {
                        i18 = 2;
                    } else if (i == 82) {
                        layoutParams.leftMargin = gm.L(58.0f);
                        jo6 jo6Var = (jo6) obj;
                        sf1Var.setText(jb6.L0(jo6Var.b ? 2131753919 : 2131753924));
                        linearLayout.setVisibility(0);
                        sf1Var.setTextSize(1, 15.0f);
                        sf1Var.setTypeface(Typeface.DEFAULT);
                        textView3.setVisibility(8);
                        bf0Var.setVisibility(0);
                        bf0Var.setRoundRadius(gm.L(2.0f));
                        String str4 = jo6Var.c;
                        if (str4 != null) {
                            bf0Var.o(str4, null, cmb.Q4);
                        } else if (jo6Var.I != null) {
                            bf0Var.r(jo6Var.J, jo6Var.K, true);
                            boolean z3 = jo6Var.b;
                            int i19 = jo6Var.C;
                            if (z3) {
                                StringBuilder l2 = hg9.l(i19, "vthumb://", ":");
                                l2.append(jo6Var.I);
                                bf0Var.o(l2.toString(), null, cmb.Q4);
                            } else {
                                StringBuilder l3 = hg9.l(i19, "thumb://", ":");
                                l3.append(jo6Var.I);
                                bf0Var.o(l3.toString(), null, cmb.Q4);
                            }
                        } else {
                            bf0Var.setImageDrawable(cmb.Q4);
                        }
                    } else {
                        layoutParams.leftMargin = gm.L(45.0f);
                        layoutParams.topMargin = gm.L(13.0f);
                        layoutParams.rightMargin = 0;
                        sf1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        sf1Var.setTypeface(typeface);
                        textView3.setVisibility(8);
                        s09Var.setVisibility(8);
                        int i20 = this.L;
                        if (i20 == 88) {
                            String str5 = (String) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            if (intValue5 > 0) {
                                int L6 = gm.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                layoutParams.leftMargin = gm.L(48.0f);
                                layoutParams.rightMargin = L6;
                                layoutParams.topMargin = gm.L(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                layoutParams3.leftMargin = gm.L(48.0f);
                                layoutParams3.rightMargin = L6;
                                sf1Var.setText(jb6.Y(2131750595, "FolderLinkDeletedTitle", str5));
                                sf1Var.setTypeface(gm.o());
                                textView3.setVisibility(0);
                                textView3.setText(jb6.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                            } else {
                                sf1Var.setTypeface(typeface);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                sf1Var.setText(gm.S2(jb6.Y(2131750599, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                            }
                        } else if (i20 == 81 || i20 == 0 || i20 == 26) {
                            sf1Var.setText(jb6.L0(2131749050));
                        } else if (i20 == 27) {
                            sf1Var.setText(jb6.L0(2131752117));
                        } else if (i20 == 95) {
                            if (pg3.y(longValue)) {
                                TLRPC.Chat L09 = oc7.r1(i8).L0(Long.valueOf(-longValue));
                                if (sd2.p0(L09)) {
                                    sf1Var.setText(jb6.L0(2131748106));
                                } else if (!sd2.T(L09) || L09.megagroup) {
                                    sf1Var.setText(jb6.L0(2131749187));
                                } else {
                                    sf1Var.setText(jb6.L0(2131752332));
                                }
                            } else {
                                sf1Var.setText(jb6.L0(2131752179));
                            }
                        } else if (pg3.y(longValue)) {
                            TLRPC.Chat L010 = oc7.r1(i8).L0(Long.valueOf(-longValue));
                            if (sd2.p0(L010)) {
                                sf1Var.setText(jb6.L0(2131748106));
                            } else if (!sd2.T(L010) || L010.megagroup) {
                                sf1Var.setText(jb6.L0(2131749206));
                            } else {
                                sf1Var.setText(jb6.L0(2131752363));
                            }
                        } else {
                            sf1Var.setText(jb6.L0(2131752179));
                        }
                        if (this.L != 81) {
                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                oc7 r1 = oc7.r1(i8);
                                long longValue2 = ((Long) arrayList.get(i21)).longValue();
                                int i22 = this.L;
                                r1.a(longValue2, i22 == 0 || i22 == 26);
                            }
                        }
                    }
                }
                if (i == i18) {
                    sf1Var.setText(jb6.L0(2131752183));
                } else {
                    sf1Var.setText(jb6.L0(2131752118));
                }
                layoutParams.leftMargin = gm.L(58.0f);
                layoutParams.topMargin = gm.L(13.0f);
                layoutParams.rightMargin = 0;
                sf1Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                sf1Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                s09Var.setVisibility(0);
                s09Var.e(R.raw.chats_archived, 36, 36);
                s09Var.setProgress(0.0f);
                s09Var.d();
            }
        }
        z = false;
        StringBuilder sb22222 = new StringBuilder();
        sb22222.append((Object) sf1Var.getText());
        if (textView3.getVisibility() == 0) {
        }
        sb22222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
        gm.g2(sb22222.toString());
        if (!e()) {
        }
        if (getVisibility() == 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.Q;
        ShapeDrawable shapeDrawable = this.V;
        if (f != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.i0) + this.e0 + gm.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i = this.L;
        if (i == 1 || i == 95 || i == 0 || i == 27 || i == 26 || i == 81 || i == 88) {
            int ceil = this.H > 0 ? (int) Math.ceil(r10 / 1000.0f) : 0;
            int i2 = this.I;
            TextPaint textPaint = this.E;
            if (i2 != ceil) {
                this.I = ceil;
                this.J = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.f0;
                if (staticLayout != null) {
                    this.g0 = staticLayout;
                    this.h0 = 0.0f;
                }
                this.K = (int) Math.ceil(textPaint.measureText(r2));
                this.f0 = new StaticLayout(this.J, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f2 = this.h0;
            if (f2 < 1.0f) {
                float f3 = f2 + 0.10666667f;
                this.h0 = f3;
                if (f3 > 1.0f) {
                    this.h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.g0;
            RectF rectF = this.G;
            if (staticLayout2 != null) {
                float f4 = this.h0;
                if (f4 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f4) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.K / 2), (gm.L(10.0f) * this.h0) + gm.L(17.2f));
                    this.g0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f0 != null) {
                float f5 = this.h0;
                if (f5 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f5));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.K / 2), kt6.B(1.0f, this.h0, gm.L(10.0f), gm.L(17.2f)));
                this.f0.draw(canvas);
                if (this.h0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.H / 5000.0f) * (-360.0f), false, this.F);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.H - (elapsedRealtime - this.P);
        this.H = j;
        this.P = elapsedRealtime;
        if (j <= 0) {
            d(this.U, true);
        }
        if (this.L != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.V.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f) {
        if (this.Q != f) {
            this.Q = f;
            setTranslationY(((this.i0 - this.e0) + gm.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            setTranslationY(((f - this.e0) + gm.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i) {
        this.e0 = i;
    }

    public void setHideAnimationType(int i) {
        this.U = i;
    }

    public void setInfoText(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar;
        ArrayList arrayList = this.b0;
        try {
            if (this.a0) {
                return;
            }
            int i = 0;
            while (true) {
                int size = arrayList.size();
                ylbVar = this.W;
                if (i >= size) {
                    break;
                }
                int v0 = cmb.v0(((Integer) this.c0.get(i)).intValue(), ylbVar);
                s09 s09Var = this.f;
                String str = (String) arrayList.get(i);
                if (((Boolean) this.d0.get(i)).booleanValue()) {
                    v0 |= -16777216;
                }
                s09Var.h(v0, str);
                i++;
            }
            Paint paint = this.F;
            int i2 = cmb.xj;
            paint.setColor(cmb.v0(i2, ylbVar));
            this.E.setColor(cmb.v0(i2, ylbVar));
            cmb.A1(cmb.v0(cmb.vj, ylbVar), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                cmb.F1(linearLayout.getBackground(), cmb.v0(cmb.wj, ylbVar) & 587202559, true);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i, long j) {
    }

    public UndoView(rob robVar, Context context) {
        this(context, robVar, false, null);
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }
}
