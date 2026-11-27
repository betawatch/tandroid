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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
@Deprecated
/* loaded from: classes2.dex */
public class UndoView extends FrameLayout implements snb {
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
    public final vnb W;
    public byte a;
    public boolean a0;
    public final te1 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public final ArrayList d0;
    public final ImageView e;
    public int e0;
    public final e29 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final de0 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.e s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context, org.telegram.ui.ActionBar.e eVar, boolean z, vnb vnbVar) {
        super(context);
        this.a = (byte) 0;
        this.y = yac.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = hl.L(8.0f);
        this.h0 = 1.0f;
        this.W = vnbVar;
        this.s = eVar;
        this.S = z;
        te1 te1Var = new te1(this, context, vnbVar);
        this.b = te1Var;
        te1Var.setTextSize(1, 15.0f);
        int i = aob.yj;
        yob.X(te1Var, i, vnbVar);
        int i2 = aob.xj;
        yob.G(te1Var, i2, vnbVar);
        te1Var.setMovementMethod(new c9c(this));
        addView(te1Var, tre.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        yob.X(textView, i, vnbVar);
        yob.G(textView, i2, vnbVar);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new dl((byte) 0));
        addView(textView, tre.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        e29 e29Var = new e29(context);
        this.f = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = aob.wj;
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
        addView(e29Var, tre.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.h = de0Var;
        de0Var.setRoundRadius(hl.L(15.0f));
        addView(de0Var, tre.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(aob.Y(aob.v0(i2, vnbVar) & 587202559, hl.L(2.0f), hl.L(2.0f)));
        addView(linearLayout, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new b9c(this, (byte) 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, tre.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        bs2.t(textView2, 1, 14.0f);
        ik8.x(textView2, i2, vnbVar, null, 2131743540);
        linearLayout.addView(textView2, tre.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(hl.L(15.0f), hl.L(15.0f), hl.L(33.0f), hl.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(aob.v0(i, vnbVar));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTypeface(hl.o());
        textPaint.setColor(aob.v0(i, vnbVar));
        setWillNotDraw(false);
        this.V = aob.b0(hl.L(10.0f), aob.v0(i3, vnbVar));
        setOnTouchListener(new vqb((byte) 4));
        setVisibility(4);
    }

    public boolean a() {
        return true;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.wj));
    }

    public final boolean c() {
        int i;
        Object obj;
        int i2 = this.L;
        if (i2 == 11 || i2 == 24 || i2 == 6 || i2 == 3 || i2 == 5 || i2 == 13 || i2 == 14 || i2 == 74) {
            return true;
        }
        if ((i2 == 7 && uc7.s1(this.y).G0.isEmpty()) || (i = this.L) == 83 || i == 85) {
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
                    uc7 s1 = uc7.s1(this.y);
                    int i4 = this.L;
                    boolean z2 = i4 == 0 || i4 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) s1.R.f(longValue);
                    if (dialog != null) {
                        if (z2) {
                            s1.v0.l(longValue);
                        } else {
                            s1.u0.l(longValue);
                            if (!z) {
                                s1.y.add(dialog);
                                s1.h5(null);
                            }
                        }
                        if (!z) {
                            s1.getNotificationCenter().k(jn7.r, Boolean.TRUE);
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
            animatorSet.addListener(new omb(this, (byte) 11));
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
        float measuredHeight = (getMeasuredHeight() - this.i0) + hl.L(9.0f);
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
        aob.A1(-115203550, this.V);
        te1 te1Var = this.b;
        yob.q(te1Var);
        int i3 = aob.xj;
        vnb vnbVar = this.W;
        yob.G(te1Var, i3, vnbVar);
        TextView textView = this.c;
        yob.q(textView);
        yob.G(textView, i3, vnbVar);
        te1Var.setTextColor(-1);
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
        e29 e29Var = this.f;
        e29Var.h(-14540254, "info1");
        e29Var.h(-14540254, "info2");
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
        int v0 = aob.v0(i, this.W);
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

    public final void m(long j, Object obj, int i) {
        k(j, i, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x1731  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1753  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1835  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x1717  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x178e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        te1 te1Var;
        TextView textView;
        int i2;
        boolean z;
        long j;
        byte b;
        int L;
        CharSequence S2;
        int i3;
        SpannableStringBuilder R2;
        SpannableStringBuilder R22;
        CharSequence L0;
        String str;
        int i4;
        int i5;
        int i6;
        if (!hl.C3() && ((i6 = this.L) == 52 || i6 == 56 || i6 == 57 || i6 == 58 || i6 == 59 || i6 == 60 || i6 == 80 || i6 == 33)) {
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
        String L02 = ob6.L0(2131743540);
        TextView textView2 = this.d;
        textView2.setText(L02);
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        e29 e29Var = this.f;
        e29Var.setPadding(0, 0, 0, 0);
        e29Var.setScaleX(1.0f);
        e29Var.setScaleY(1.0f);
        te1 te1Var2 = this.b;
        te1Var2.setTextSize(1, 15.0f);
        de0 de0Var = this.h;
        de0Var.setVisibility(8);
        te1Var2.setGravity(51);
        TextView textView3 = this.c;
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = hl.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) te1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = hl.L(13.0f);
        layoutParams.bottomMargin = 0;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e29Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = hl.L(3.0f);
        layoutParams2.width = hl.L(54.0f);
        layoutParams2.height = -2;
        te1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i == 83) {
            setOnClickListener(new b9c(this, (byte) 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new vqb((byte) 5));
            movementMethod = null;
        }
        te1Var2.setMovementMethod(movementMethod);
        boolean f = f();
        LinearLayout linearLayout = this.n;
        int i7 = this.y;
        int i8 = 36;
        if (f) {
            if (i == 83) {
                textView3.setSingleLine(false);
                S2 = ob6.L0(2131745010);
                CharSequence P2 = hl.P2(ob6.L0(2131745009), runnable);
                this.N = null;
                this.H = 4000L;
                L0 = P2;
                i3 = R.raw.sound_download;
            } else if (i == 74) {
                textView3.setSingleLine(false);
                S2 = ob6.L0(2131745949);
                L0 = ob6.Y(2131745934, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i3 = R.raw.ic_admin;
            } else {
                if (i == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder S22 = xc2.W((TLRPC.Chat) obj2) ? hl.S2(ob6.Y(2131743131, "VoipChannelInvitedUser", lbc.j(user))) : hl.S2(ob6.Y(2131743023, "VoipGroupInvitedUser", lbc.j(user)));
                    rb0 rb0Var = new rb0();
                    rb0Var.s(hl.L(12.0f));
                    rb0Var.q(user);
                    de0Var.f(user, rb0Var);
                    de0Var.setVisibility(0);
                    this.H = 3000L;
                    S2 = S22;
                } else if (i == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        S2 = xc2.W(chat) ? hl.S2(ob6.Z(2131743102, lbc.j(user2))) : hl.S2(ob6.Z(2131743079, lbc.j(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        boolean W = xc2.W(chat);
                        String str2 = ((TLRPC.Chat) obj).title;
                        S2 = W ? hl.S2(ob6.Z(2131743139, str2)) : hl.S2(ob6.Z(2131743096, str2));
                    } else {
                        S2 = "";
                    }
                    rb0 rb0Var2 = new rb0();
                    rb0Var2.s(hl.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    rb0Var2.o(tLObject);
                    de0Var.f(tLObject, rb0Var2);
                    de0Var.setVisibility(0);
                    this.H = 3000L;
                } else if (i == 37) {
                    rb0 rb0Var3 = new rb0();
                    rb0Var3.s(hl.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        rb0Var3.q(user3);
                        de0Var.f(user3, rb0Var3);
                        str = lv2.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        rb0Var3.p(chat2);
                        de0Var.f(chat2, rb0Var3);
                        str = chat2.title;
                    }
                    if (xc2.W((TLRPC.Chat) obj2)) {
                        i4 = 0;
                        S2 = hl.S2(ob6.Y(2131743103, "VoipChannelUserChanged", str));
                    } else {
                        i4 = 0;
                        S2 = hl.S2(ob6.Y(2131742964, "VoipGroupUserChanged", str));
                    }
                    de0Var.setVisibility(i4);
                    this.H = 3000L;
                } else {
                    if (i == 33) {
                        S2 = ob6.L0(2131743041);
                        this.H = 3000L;
                        te1Var = te1Var2;
                        i3 = R.raw.voip_invite;
                    } else {
                        byte b2 = 7;
                        if (i == 77) {
                            S2 = (CharSequence) obj;
                            this.H = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                te1Var = te1Var2;
                            } else {
                                setOnTouchListener(null);
                                te1Var = te1Var2;
                                te1Var.setMovementMethod(null);
                                setOnClickListener(new jjb(this, (TLRPC.Message) obj2, b2));
                            }
                            i3 = R.raw.payment_success;
                        } else {
                            te1Var = te1Var2;
                            if (i == 30) {
                                S2 = hl.S2(ob6.Y(2131742966, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? lbc.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i == 35) {
                                S2 = hl.S2(ob6.Y(2131742965, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? lbc.j((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.H = 3000L;
                            } else {
                                if (i == 31) {
                                    S2 = hl.S2(ob6.Y(2131742968, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? lbc.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i == 38) {
                                    S2 = obj instanceof TLRPC.Chat ? hl.S2(ob6.Y(2131742956, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : hl.S2(ob6.L0(2131742957));
                                    this.H = 3000L;
                                    i3 = R.raw.voip_allow_talk;
                                } else if (i == 42) {
                                    S2 = xc2.W((TLRPC.Chat) obj) ? hl.S2(ob6.L0(2131743112)) : hl.S2(ob6.L0(2131742987));
                                    this.H = 3000L;
                                    i3 = R.raw.ic_mute;
                                } else if (i == 43) {
                                    S2 = xc2.W((TLRPC.Chat) obj) ? hl.S2(ob6.L0(2131743111)) : hl.S2(ob6.L0(2131742986));
                                    this.H = 3000L;
                                    i3 = R.raw.ic_unmute;
                                } else {
                                    int i9 = this.L;
                                    if (i9 == 39 || i9 == 100) {
                                        S2 = hl.S2(ob6.L0(i9 == 39 ? 2131743049 : 2131742960));
                                        this.H = 3000L;
                                        i3 = R.raw.voip_record_start;
                                    } else if (i9 == 40 || i9 == 101) {
                                        String L03 = ob6.L0(i9 == 40 ? 2131743050 : 2131742961);
                                        this.H = 4000L;
                                        te1Var.setMovementMethod(new dl((byte) 0));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L03);
                                        int indexOf = L03.indexOf("**");
                                        int lastIndexOf = L03.lastIndexOf("**");
                                        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                            try {
                                                spannableStringBuilder.setSpan(new f8c("tg://openmessage?user_id=" + yac.h(i7).e()), indexOf, lastIndexOf - 2, 33);
                                            } catch (Exception e) {
                                                cc4.f(e);
                                            }
                                        }
                                        i3 = R.raw.voip_record_saved;
                                        S2 = spannableStringBuilder;
                                    } else if (i == 36) {
                                        S2 = hl.S2(ob6.Y(2131742967, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? lbc.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                        this.H = 3000L;
                                    } else if (i == 32 || i == 102) {
                                        String j2 = obj instanceof TLRPC.User ? lbc.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                        S2 = i == 102 ? hl.S2(ob6.Z(2131743076, j2)) : hl.S2(ob6.Z(2131742996, j2));
                                        this.H = 3000L;
                                        i3 = R.raw.ic_ban;
                                    } else {
                                        if (i == 9 || i == 10) {
                                            TLRPC.User user4 = (TLRPC.User) obj;
                                            S2 = i == 9 ? hl.S2(ob6.Y(2131751260, "EditAdminTransferChannelToast", lbc.j(user4))) : hl.S2(ob6.Y(2131751259, "EditAdminTransferGroupToast", lbc.j(user4)));
                                        } else if (i == 8) {
                                            S2 = ob6.Y(2131747561, "NowInContacts", lbc.j((TLRPC.User) obj));
                                        } else if (i == 87) {
                                            S2 = ob6.Z(2131746337, new Object[0]);
                                        } else if (i == 22) {
                                            if (wf3.D(longValue)) {
                                                S2 = obj == null ? ob6.L0(2131748464) : ob6.L0(2131748463);
                                            } else {
                                                TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-longValue));
                                                S2 = (!xc2.T(M0) || M0.megagroup) ? obj == null ? ob6.L0(2131748466) : ob6.L0(2131748465) : obj == null ? ob6.L0(2131748468) : ob6.L0(2131748467);
                                            }
                                        } else if (i == 23) {
                                            S2 = ob6.L0(2131752160);
                                        } else {
                                            if (i == 6) {
                                                S2 = ob6.L0(2131754162);
                                                L0 = ob6.L0(2131754161);
                                                i3 = R.raw.chats_swipearchive;
                                                i8 = 48;
                                            } else {
                                                if (i9 == 13) {
                                                    S2 = ob6.L0(2131746171);
                                                    L0 = ob6.L0(2131746170);
                                                    i3 = R.raw.wallet_congrats;
                                                } else {
                                                    if (i9 != 14) {
                                                        if (i == 7) {
                                                            S2 = ob6.L0(2131754145);
                                                            if (uc7.s1(i7).G0.isEmpty()) {
                                                                L0 = ob6.L0(2131754144);
                                                                i3 = R.raw.chats_infotip;
                                                            }
                                                            L0 = null;
                                                            i3 = R.raw.chats_infotip;
                                                        } else if (i == 20 || i == 21) {
                                                            ac7 ac7Var = (ac7) obj2;
                                                            Spannable y5 = r47.y5(te1Var.getPaint().getFontMetricsInt(), pv3.l(ac7Var.b, te1Var.getPaint().getFontMetricsInt(), false), ac7Var.c);
                                                            this.a = ac7Var.n ? (byte) 26 : (byte) 0;
                                                            if (longValue != 0) {
                                                                if (wf3.B(longValue)) {
                                                                    longValue = uc7.s1(i7).a1(Integer.valueOf(wf3.h(longValue))).user_id;
                                                                }
                                                                if (wf3.D(longValue)) {
                                                                    TLRPC.User X1 = uc7.s1(i7).X1(Long.valueOf(longValue));
                                                                    String j3 = lbc.j(X1);
                                                                    if (lbc.D(X1)) {
                                                                        j3 = ob6.L0(2131745629);
                                                                    } else if (lbc.B(X1)) {
                                                                        j3 = ob6.L0(2131745993);
                                                                    }
                                                                    R22 = i == 20 ? hl.R2(ob6.U(2131750658, j3, y5)) : hl.R2(ob6.U(2131750657, j3, y5));
                                                                } else {
                                                                    TLRPC.Chat M02 = uc7.s1(i7).M0(Long.valueOf(-longValue));
                                                                    R22 = i == 20 ? hl.R2(ob6.U(2131750764, M02.title, y5)) : hl.R2(ob6.U(2131750763, M02.title, y5));
                                                                }
                                                                R2 = R22;
                                                            } else {
                                                                R2 = i == 20 ? hl.R2(ob6.U(2131750760, ob6.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y5)) : hl.R2(ob6.U(2131750759, ob6.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y5));
                                                            }
                                                            i3 = i == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                            S2 = R2;
                                                        } else if (i == 19) {
                                                            S2 = this.T;
                                                            i3 = R.raw.ic_delete;
                                                        } else if (i == 82) {
                                                            S2 = ob6.L0(((no6) obj).b ? 2131753947 : 2131753952);
                                                            i3 = 0;
                                                        } else if (i == 78 || i == 79) {
                                                            int intValue = ((Integer) obj).intValue();
                                                            S2 = i == 78 ? ob6.G(intValue, "PinnedDialogsCount", new Object[0]) : ob6.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                            i3 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                            if (obj2 instanceof Integer) {
                                                                this.H = ((Integer) obj2).intValue();
                                                            }
                                                        } else {
                                                            S2 = i == 3 ? ob6.L0(2131752211) : ob6.L0(2131752146);
                                                            if (uc7.s1(i7).G0.isEmpty()) {
                                                                L0 = ob6.L0(2131752210);
                                                                i3 = R.raw.chats_infotip;
                                                            }
                                                            L0 = null;
                                                            i3 = R.raw.chats_infotip;
                                                        }
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append((Object) te1Var.getText());
                                                        sb.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                                                        hl.g2(sb.toString());
                                                        if (!e()) {
                                                            int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                                                            if (measuredWidth == 0) {
                                                                measuredWidth = hl.q.x;
                                                            }
                                                            measureChildWithMargins(textView3, ik8.f(16.0f, measuredWidth, TLObject.FLAG_30), 0, 0, 0);
                                                            this.r = hl.L(37.0f) + textView3.getMeasuredHeight();
                                                        } else if (c()) {
                                                            this.r = hl.L(52.0f);
                                                        } else if (getParent() instanceof ViewGroup) {
                                                            ViewGroup viewGroup = (ViewGroup) getParent();
                                                            int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                                                            if (measuredWidth2 <= 0) {
                                                                measuredWidth2 = hl.q.x;
                                                            }
                                                            View view = te1Var;
                                                            measureChildWithMargins(view, ik8.f(16.0f, measuredWidth2, TLObject.FLAG_30), 0, 0, 0);
                                                            int measuredHeight = view.getMeasuredHeight();
                                                            int i10 = this.L;
                                                            int L2 = hl.L((i10 == 16 || i10 == 17 || i10 == 18 || i10 == 84 || i10 == 86) ? 14.0f : 28.0f) + measuredHeight;
                                                            this.r = L2;
                                                            int i11 = this.L;
                                                            if (i11 == 18) {
                                                                this.r = Math.max(L2, hl.L(52.0f));
                                                            } else if (i11 == 25) {
                                                                this.r = Math.max(L2, hl.L(50.0f));
                                                            } else if (z) {
                                                                this.r = L2 - hl.L(8.0f);
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
                                                    S2 = ob6.L0(2131746169);
                                                    L0 = ob6.L0(2131746168);
                                                    i3 = R.raw.wallet_science;
                                                }
                                                i8 = 44;
                                            }
                                            te1Var.setText(S2);
                                            if (i3 == 0) {
                                                e29Var.e(i3, i8, i8);
                                                b29 animatedDrawable = e29Var.getAnimatedDrawable();
                                                animatedDrawable.h = false;
                                                animatedDrawable.K(animatedDrawable.n());
                                                e29Var.setVisibility(0);
                                                e29Var.setProgress(0.0f);
                                                e29Var.d();
                                            } else {
                                                e29Var.setVisibility(8);
                                            }
                                            if (L0 == null) {
                                                layoutParams.leftMargin = hl.L(58.0f);
                                                layoutParams.topMargin = hl.L(6.0f);
                                                layoutParams.rightMargin = hl.L(8.0f);
                                                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = hl.L(8.0f);
                                                textView3.setText(L0);
                                                textView3.setVisibility(0);
                                                te1Var.setTextSize(1, 14.0f);
                                                te1Var.setTypeface(hl.o());
                                                i5 = 8;
                                            } else {
                                                layoutParams.leftMargin = hl.L(58.0f);
                                                layoutParams.topMargin = hl.L(13.0f);
                                                layoutParams.rightMargin = hl.L(8.0f);
                                                i5 = 8;
                                                textView3.setVisibility(8);
                                                te1Var.setTextSize(1, 15.0f);
                                                te1Var.setTypeface(Typeface.DEFAULT);
                                            }
                                            linearLayout.setVisibility(i5);
                                        }
                                        i3 = R.raw.contact_check;
                                    }
                                }
                                i3 = R.raw.voip_unmuted;
                            }
                            i3 = R.raw.voip_muted;
                        }
                    }
                    L0 = null;
                    te1Var.setText(S2);
                    if (i3 == 0) {
                    }
                    if (L0 == null) {
                    }
                    linearLayout.setVisibility(i5);
                }
                te1Var = te1Var2;
                i3 = 0;
                L0 = null;
                te1Var.setText(S2);
                if (i3 == 0) {
                }
                if (L0 == null) {
                }
                linearLayout.setVisibility(i5);
            }
            te1Var = te1Var2;
            te1Var.setText(S2);
            if (i3 == 0) {
            }
            if (L0 == null) {
            }
            linearLayout.setVisibility(i5);
        } else {
            te1Var = te1Var2;
            int i12 = this.L;
            vnb vnbVar = this.W;
            if (i12 == 45 || i12 == 46 || i12 == 47 || i12 == 52 || i12 == 53 || i12 == 54 || i12 == 55 || i12 == 56 || i12 == 57 || i12 == 58 || i12 == 59 || i12 == 60 || i12 == 71 || i12 == 70 || i12 == 75 || i12 == 76 || i12 == 41 || i12 == 78 || i12 == 79 || i12 == 61 || i12 == 80) {
                imageView.setVisibility(8);
                e29Var.setVisibility(0);
                te1Var.setTypeface(Typeface.DEFAULT);
                int i13 = this.L;
                long j4 = -1;
                if (i13 == 76) {
                    te1Var.setText(ob6.L0(2131752862));
                    e29Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = hl.L(9.0f);
                    z = true;
                    te1Var.setTextSize(1, 14.0f);
                } else if (i13 == 75) {
                    te1Var.setText(ob6.L0(2131749330));
                    e29Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = hl.L(9.0f);
                    te1Var.setTextSize(1, 14.0f);
                    z = true;
                } else {
                    if (i == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        textView3.setSingleLine(false);
                        te1Var.setText(ob6.Y(2131753847, "AutoDeleteHintOnText", ob6.c0(intValue2)));
                        e29Var.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = hl.L(9.0f);
                        this.H = 4000L;
                        e29Var.setPadding(0, 0, 0, hl.L(3.0f));
                    } else {
                        if (i13 == 71) {
                            te1Var.setText(ob6.L0(2131753848));
                            e29Var.e(R.raw.fire_off, 36, 36);
                            te1Var.setTextSize(1, 14.0f);
                            this.H = 3000L;
                            e29Var.setPadding(0, 0, 0, hl.L(4.0f));
                        } else if (i13 == 45) {
                            te1Var.setText(ob6.L0(2131748998));
                            e29Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = hl.L(9.0f);
                            te1Var.setTextSize(1, 14.0f);
                            z = true;
                        } else if (i13 == 46) {
                            te1Var.setText(ob6.L0(2131748997));
                            e29Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = hl.L(9.0f);
                            te1Var.setTextSize(1, 14.0f);
                        } else if (i13 == 47) {
                            te1Var.setText(ob6.L0(2131748975));
                            e29Var.e(R.raw.imported, 36, 36);
                            e29Var.setPadding(0, 0, 0, hl.L(5.0f));
                            layoutParams.topMargin = hl.L(9.0f);
                            te1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i13 == 52 || i13 == 56 || i13 == 57 || i13 == 58 || i13 == 59 || i13 == 60 || i13 == 80) {
                                textView = textView2;
                                if (!hl.C3()) {
                                    return;
                                }
                                int i14 = this.L;
                                if (i14 == 80) {
                                    te1Var.setText(ob6.L0(2131751168));
                                } else if (i14 == 60) {
                                    te1Var.setText(ob6.L0(2131747022));
                                } else if (i14 == 56) {
                                    te1Var.setText(ob6.L0(2131743320));
                                } else if (i14 == 57) {
                                    te1Var.setText(ob6.L0(2131749116));
                                } else if (i14 == 52) {
                                    te1Var.setText(ob6.L0(2131748343));
                                } else if (i14 == 59) {
                                    te1Var.setText(ob6.L0(2131748675));
                                    i2 = R.raw.voip_invite;
                                    e29Var.e(i2, 30, 30);
                                    this.H = 3000L;
                                    te1Var.setTextSize(1, 15.0f);
                                } else {
                                    te1Var.setText(ob6.L0(2131743847));
                                }
                                i2 = R.raw.copy;
                                e29Var.e(i2, 30, 30);
                                this.H = 3000L;
                                te1Var.setTextSize(1, 15.0f);
                            } else if (i13 == 54) {
                                te1Var.setText(ob6.L0(2131752308));
                                e29Var.e(R.raw.silent_unmute, 30, 30);
                                this.H = 3000L;
                                te1Var.setTextSize(1, 15.0f);
                            } else {
                                textView = textView2;
                                if (i13 == 55) {
                                    te1Var.setText(ob6.L0(2131752309));
                                    e29Var.e(R.raw.silent_mute, 30, 30);
                                    this.H = 3000L;
                                    te1Var.setTextSize(1, 15.0f);
                                } else if (i13 == 41) {
                                    if (obj2 != null) {
                                        te1Var.setText(hl.S2(ob6.Y(2131748941, "InvLinkToChats", ob6.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    } else if (longValue == yac.h(i7).n) {
                                        te1Var.setText(hl.S2(ob6.L0(2131748939)));
                                    } else if (wf3.y(longValue)) {
                                        te1Var.setText(hl.S2(ob6.Y(2131748940, "InvLinkToGroup", uc7.s1(i7).M0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        te1Var.setText(hl.S2(ob6.Y(2131748938, "InvLinkToUser", lbc.j(uc7.s1(i7).X1(l)))));
                                    }
                                    e29Var.e(R.raw.contact_check, 36, 36);
                                    this.H = 3000L;
                                } else if (i13 == 53) {
                                    Integer num = (Integer) obj;
                                    if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                        int intValue3 = ((Integer) obj2).intValue();
                                        if (num.intValue() == 1) {
                                            te1Var.setText(hl.S2(ob6.G(intValue3, "FwdMessageToManyChats", new Object[0])));
                                        } else {
                                            te1Var.setText(hl.S2(ob6.G(intValue3, "FwdMessagesToManyChats", new Object[0])));
                                        }
                                        e29Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == yac.h(i7).n) {
                                        if (num.intValue() == 1) {
                                            te1Var.setText(hl.P2(ob6.L0(2131750459), new kc((byte) 15)));
                                        } else {
                                            te1Var.setText(hl.P2(ob6.L0(2131750452), new kc((byte) 15)));
                                        }
                                        e29Var.e(R.raw.saved_messages, 30, 30);
                                        this.H = 3000L;
                                    } else {
                                        if (wf3.y(longValue)) {
                                            TLRPC.Chat M03 = uc7.s1(i7).M0(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String j5 = xc2.p0(M03) ? ro4.j(i7, M03, false) : null;
                                            if (num.intValue() == 1) {
                                                if (j5 == null) {
                                                    j5 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                                }
                                                te1Var.setText(hl.S2(ob6.Y(2131750463, "FwdMessageToGroup", j5)));
                                            } else {
                                                if (j5 == null) {
                                                    j5 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                                }
                                                te1Var.setText(hl.S2(ob6.Y(2131750456, "FwdMessagesToGroup", j5)));
                                            }
                                        } else {
                                            TLRPC.User X12 = uc7.s1(i7).X1(l);
                                            if (num.intValue() == 1) {
                                                te1Var.setText(hl.S2(ob6.Y(2131750458, "FwdMessageToUser", lbc.j(X12))));
                                            } else {
                                                te1Var.setText(hl.S2(ob6.Y(2131750451, "FwdMessagesToUser", lbc.j(X12))));
                                            }
                                        }
                                        e29Var.e(R.raw.forward, 30, 30);
                                    }
                                    j4 = 300;
                                    this.H = 3000L;
                                } else if (i13 == 61) {
                                    if (obj2 != null) {
                                        te1Var.setText(hl.S2(ob6.Y(2131753730, "BackgroundToChats", ob6.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                        e29Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == yac.h(i7).n) {
                                        te1Var = te1Var;
                                        te1Var.setText(hl.S2(ob6.L0(2131753728)));
                                        e29Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        te1Var = te1Var;
                                        if (wf3.y(longValue)) {
                                            te1Var.setText(hl.S2(ob6.Y(2131753729, "BackgroundToGroup", uc7.s1(i7).M0(Long.valueOf(-longValue)).title)));
                                        } else {
                                            te1Var.setText(hl.S2(ob6.Y(2131753727, "BackgroundToUser", lbc.j(uc7.s1(i7).X1(l)))));
                                        }
                                        e29Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.H = 3000L;
                                }
                            }
                            j = j4;
                            b = 8;
                            z = false;
                            textView3.setVisibility(b);
                            yob.X(textView, aob.xj, vnbVar);
                            linearLayout.setVisibility(b);
                            layoutParams.leftMargin = hl.L(58.0f);
                            layoutParams.rightMargin = hl.L(8.0f);
                            e29Var.setProgress(0.0f);
                            e29Var.d();
                            if (j > 0) {
                                e29Var.postDelayed(new azb(this, b), j);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) te1Var.getText());
                            if (textView3.getVisibility() == 0) {
                            }
                            sb2.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                            hl.g2(sb2.toString());
                            if (!e()) {
                            }
                            if (getVisibility() == 0) {
                            }
                        }
                        textView = textView2;
                        j = j4;
                        b = 8;
                        z = false;
                        textView3.setVisibility(b);
                        yob.X(textView, aob.xj, vnbVar);
                        linearLayout.setVisibility(b);
                        layoutParams.leftMargin = hl.L(58.0f);
                        layoutParams.rightMargin = hl.L(8.0f);
                        e29Var.setProgress(0.0f);
                        e29Var.d();
                        if (j > 0) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append((Object) te1Var.getText());
                        if (textView3.getVisibility() == 0) {
                        }
                        sb22.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                        hl.g2(sb22.toString());
                        if (!e()) {
                        }
                        if (getVisibility() == 0) {
                        }
                    }
                    textView = textView2;
                    j = -1;
                    b = 8;
                    z = true;
                    textView3.setVisibility(b);
                    yob.X(textView, aob.xj, vnbVar);
                    linearLayout.setVisibility(b);
                    layoutParams.leftMargin = hl.L(58.0f);
                    layoutParams.rightMargin = hl.L(8.0f);
                    e29Var.setProgress(0.0f);
                    e29Var.d();
                    if (j > 0) {
                    }
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append((Object) te1Var.getText());
                    if (textView3.getVisibility() == 0) {
                    }
                    sb222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                    hl.g2(sb222.toString());
                    if (!e()) {
                    }
                    if (getVisibility() == 0) {
                    }
                }
                textView = textView2;
                j = -1;
                b = 8;
                textView3.setVisibility(b);
                yob.X(textView, aob.xj, vnbVar);
                linearLayout.setVisibility(b);
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = hl.L(8.0f);
                e29Var.setProgress(0.0f);
                e29Var.d();
                if (j > 0) {
                }
                StringBuilder sb2222 = new StringBuilder();
                sb2222.append((Object) te1Var.getText());
                if (textView3.getVisibility() == 0) {
                }
                sb2222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                hl.g2(sb2222.toString());
                if (!e()) {
                }
                if (getVisibility() == 0) {
                }
            } else if (i12 == 24 || i12 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                imageView.setVisibility(8);
                e29Var.setVisibility(0);
                if (intValue4 != 0) {
                    te1Var.setTypeface(hl.o());
                    te1Var.setTextSize(1, 14.0f);
                    e29Var.a.clear();
                    int i15 = aob.yj;
                    i(i15, "BODY", false);
                    i(i15, "Wibe Big", false);
                    i(i15, "Wibe Big 3", false);
                    i(i15, "Wibe Small", false);
                    te1Var.setText(ob6.L0(2131746343));
                    e29Var.e(R.raw.ic_unmute, 28, 28);
                    textView3.setVisibility(0);
                    textView3.setSingleLine(false);
                    textView3.setMaxLines(3);
                    if (user5 != null) {
                        textView3.setText(ob6.Y(2131746341, "ProximityAlertSetInfoUser", lbc.j(user5), ob6.y(intValue4, 2, null)));
                    } else {
                        textView3.setText(ob6.Y(2131746342, "ProximityAlertSetInfoGroup2", ob6.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = hl.L(6.0f);
                } else {
                    te1Var.setTypeface(Typeface.DEFAULT);
                    te1Var.setTextSize(1, 15.0f);
                    e29Var.a.clear();
                    int i16 = aob.yj;
                    i(i16, "Body Main", false);
                    i(i16, "Body Top", false);
                    i(i16, "Line", false);
                    i(i16, "Curve Big", false);
                    i(i16, "Curve Small", false);
                    layoutParams.topMargin = hl.L(14.0f);
                    te1Var.setText(ob6.L0(2131746344));
                    e29Var.e(R.raw.ic_mute, 28, 28);
                    textView3.setVisibility(8);
                    yob.X(textView2, aob.xj, vnbVar);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = hl.L(58.0f);
                e29Var.setProgress(0.0f);
                e29Var.d();
            } else if (i12 == 11) {
                te1Var.setText(ob6.L0(2131753879));
                e29Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.topMargin = hl.L(6.0f);
                textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                textView3.setVisibility(0);
                te1Var.setTextSize(1, 14.0f);
                te1Var.setTypeface(hl.o());
                yob.X(textView2, aob.p7, vnbVar);
                imageView.setVisibility(8);
                linearLayout.setVisibility(0);
                e29Var.setVisibility(0);
                e29Var.setProgress(0.0f);
                e29Var.d();
            } else if (i12 == 15) {
                this.H = 10000L;
                textView2.setText(ob6.L0(2131747544));
                te1Var.setText(ob6.L0(2131750767));
                e29Var.e(R.raw.filter_new, 36, 36);
                int L3 = hl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = hl.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = L3;
                String L04 = ob6.L0(2131750768);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L04);
                int indexOf2 = L04.indexOf(42);
                int lastIndexOf2 = L04.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new f8c("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView3.setText(spannableStringBuilder2);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
                e29Var.setVisibility(0);
                e29Var.setProgress(0.0f);
                e29Var.d();
            } else if (i12 == 16 || i12 == 17) {
                this.H = 4000L;
                te1Var.setTextSize(1, 14.0f);
                te1Var.setGravity(16);
                te1Var.setMinHeight(hl.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    te1Var.setText(hl.S2(ob6.L0(2131751415)));
                    e29Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        te1Var.setText(hl.S2(ob6.L0(2131751643)));
                    } else {
                        String K0 = ob6.K0("DiceEmojiInfo_" + str3);
                        if (TextUtils.isEmpty(K0)) {
                            te1Var.setText(pv3.l(ob6.Y(2131751416, "DiceEmojiInfo", str3), te1Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            te1Var.setText(pv3.l(K0, te1Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    e29Var.setImageDrawable(pv3.g(str3));
                    e29Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = hl.L(14.0f);
                    layoutParams.bottomMargin = hl.L(14.0f);
                    layoutParams2.leftMargin = hl.L(14.0f);
                    layoutParams2.width = hl.L(26.0f);
                    layoutParams2.height = hl.L(26.0f);
                }
                textView2.setText(ob6.L0(2131745355));
                if (this.L == 16) {
                    L = hl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    textView2.setVisibility(0);
                    yob.X(textView2, aob.xj, vnbVar);
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    L = hl.L(8.0f);
                    textView2.setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = hl.L(6.0f);
                layoutParams.bottomMargin = hl.L(7.0f);
                layoutParams.height = -1;
                textView3.setVisibility(8);
                e29Var.setVisibility(0);
            } else if (i12 == 18) {
                this.H = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                te1Var.setTextSize(1, 14.0f);
                te1Var.setGravity(16);
                te1Var.setText((CharSequence) obj);
                textView2.setVisibility(8);
                linearLayout.setVisibility(8);
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = hl.L(8.0f);
                layoutParams.topMargin = hl.L(6.0f);
                layoutParams.bottomMargin = hl.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L4 = hl.L(8.0f);
                layoutParams2.bottomMargin = L4;
                layoutParams2.topMargin = L4;
                e29Var.setVisibility(0);
                e29Var.e(R.raw.chats_infotip, 36, 36);
                e29Var.setProgress(0.0f);
                e29Var.d();
                te1Var.setMovementMethod(new dl((byte) 0));
            } else if (i12 == 12) {
                te1Var.setText(ob6.L0(2131751975));
                e29Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = hl.L(48.0f);
                layoutParams.topMargin = hl.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = hl.L(48.0f);
                String L05 = ob6.L0(2131751974);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L05);
                int indexOf3 = L05.indexOf(42);
                int lastIndexOf3 = L05.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new f8c("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView3.setText(spannableStringBuilder3);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                textView2.setVisibility(8);
                linearLayout.setVisibility(0);
                e29Var.setVisibility(0);
            } else if (i12 == 84) {
                te1Var.setVisibility(0);
                te1Var.setTextSize(1, 15.0f);
                te1Var.setTypeface(Typeface.DEFAULT);
                te1Var.setText(hl.S2(ob6.L0(2131743510)));
                e29Var.setVisibility(0);
                e29Var.e(R.raw.voice_to_text, 36, 36);
                e29Var.setProgress(0.0f);
                e29Var.d();
                textView2.setText(ob6.L0(2131746762));
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = hl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                int L5 = hl.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                de0Var.setVisibility(8);
                textView3.setVisibility(8);
                textView2.setVisibility(0);
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
            } else if (i12 == 85) {
                te1Var.setVisibility(0);
                te1Var.setTextSize(1, 15.0f);
                te1Var.setTypeface(hl.o());
                te1Var.setText(ob6.L0(2131743959));
                e29Var.setVisibility(0);
                e29Var.e(R.raw.hint_swipe_reply, 64, 64);
                e29Var.setProgress(0.0f);
                e29Var.d();
                textView3.setVisibility(0);
                textView3.setText(ob6.L0(2131743958));
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = hl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.topMargin = hl.L(6.0f);
                layoutParams.height = -2;
                de0Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i12 == 90 || i12 == 91 || i12 == 92 || i12 == 93 || i12 == 94) {
                switch (i12) {
                    case jn7.a1 /* 90 */:
                        te1Var.setText(ob6.G((int) on0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case jn7.b1 /* 91 */:
                        te1Var.setText(ob6.L0(2131753265));
                        break;
                    case jn7.c1 /* 92 */:
                        te1Var.setText(ob6.G((int) on0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case jn7.d1 /* 93 */:
                        te1Var.setText(hl.S2(ob6.G(on0.b(), "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case jn7.e1 /* 94 */:
                        te1Var.setText(ob6.L0(2131753326));
                        break;
                }
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.rightMargin = hl.L(8.0f);
                te1Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                te1Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                e29Var.setVisibility(0);
                e29Var.e(R.raw.chats_infotip, 36, 36);
                e29Var.setProgress(0.0f);
                e29Var.d();
            } else {
                int i17 = 2;
                if (i12 != 2) {
                    if (i12 == 4) {
                        i17 = 2;
                    } else if (i == 82) {
                        layoutParams.leftMargin = hl.L(58.0f);
                        no6 no6Var = (no6) obj;
                        te1Var.setText(ob6.L0(no6Var.b ? 2131753947 : 2131753952));
                        linearLayout.setVisibility(0);
                        te1Var.setTextSize(1, 15.0f);
                        te1Var.setTypeface(Typeface.DEFAULT);
                        textView3.setVisibility(8);
                        de0Var.setVisibility(0);
                        de0Var.setRoundRadius(hl.L(2.0f));
                        String str4 = no6Var.c;
                        if (str4 != null) {
                            de0Var.o(str4, null, aob.R4);
                        } else if (no6Var.I != null) {
                            de0Var.r(no6Var.J, no6Var.K, true);
                            boolean z3 = no6Var.b;
                            int i18 = no6Var.C;
                            if (z3) {
                                StringBuilder m = uh9.m(i18, "vthumb://", ":");
                                m.append(no6Var.I);
                                de0Var.o(m.toString(), null, aob.R4);
                            } else {
                                StringBuilder m2 = uh9.m(i18, "thumb://", ":");
                                m2.append(no6Var.I);
                                de0Var.o(m2.toString(), null, aob.R4);
                            }
                        } else {
                            de0Var.setImageDrawable(aob.R4);
                        }
                    } else {
                        layoutParams.leftMargin = hl.L(45.0f);
                        layoutParams.topMargin = hl.L(13.0f);
                        layoutParams.rightMargin = 0;
                        te1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        te1Var.setTypeface(typeface);
                        textView3.setVisibility(8);
                        e29Var.setVisibility(8);
                        int i19 = this.L;
                        if (i19 == 88) {
                            String str5 = (String) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            if (intValue5 > 0) {
                                int L6 = hl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                layoutParams.leftMargin = hl.L(48.0f);
                                layoutParams.rightMargin = L6;
                                layoutParams.topMargin = hl.L(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                layoutParams3.leftMargin = hl.L(48.0f);
                                layoutParams3.rightMargin = L6;
                                te1Var.setText(ob6.Y(2131750623, "FolderLinkDeletedTitle", str5));
                                te1Var.setTypeface(hl.o());
                                textView3.setVisibility(0);
                                textView3.setText(ob6.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                            } else {
                                te1Var.setTypeface(typeface);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                te1Var.setText(hl.S2(ob6.Y(2131750627, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                            }
                        } else if (i19 == 81 || i19 == 0 || i19 == 26) {
                            te1Var.setText(ob6.L0(2131749047));
                        } else if (i19 == 27) {
                            te1Var.setText(ob6.L0(2131752145));
                        } else if (i19 == 95) {
                            if (wf3.y(longValue)) {
                                TLRPC.Chat M04 = uc7.s1(i7).M0(Long.valueOf(-longValue));
                                if (xc2.p0(M04)) {
                                    te1Var.setText(ob6.L0(2131748103));
                                } else if (!xc2.T(M04) || M04.megagroup) {
                                    te1Var.setText(ob6.L0(2131749184));
                                } else {
                                    te1Var.setText(ob6.L0(2131752360));
                                }
                            } else {
                                te1Var.setText(ob6.L0(2131752207));
                            }
                        } else if (wf3.y(longValue)) {
                            TLRPC.Chat M05 = uc7.s1(i7).M0(Long.valueOf(-longValue));
                            if (xc2.p0(M05)) {
                                te1Var.setText(ob6.L0(2131748103));
                            } else if (!xc2.T(M05) || M05.megagroup) {
                                te1Var.setText(ob6.L0(2131749203));
                            } else {
                                te1Var.setText(ob6.L0(2131752391));
                            }
                        } else {
                            te1Var.setText(ob6.L0(2131752207));
                        }
                        if (this.L != 81) {
                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                uc7 s1 = uc7.s1(i7);
                                long longValue2 = ((Long) arrayList.get(i20)).longValue();
                                int i21 = this.L;
                                s1.a(longValue2, i21 == 0 || i21 == 26);
                            }
                        }
                    }
                }
                if (i == i17) {
                    te1Var.setText(ob6.L0(2131752211));
                } else {
                    te1Var.setText(ob6.L0(2131752146));
                }
                layoutParams.leftMargin = hl.L(58.0f);
                layoutParams.topMargin = hl.L(13.0f);
                layoutParams.rightMargin = 0;
                te1Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                te1Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                e29Var.setVisibility(0);
                e29Var.e(R.raw.chats_archived, 36, 36);
                e29Var.setProgress(0.0f);
                e29Var.d();
            }
        }
        z = false;
        StringBuilder sb22222 = new StringBuilder();
        sb22222.append((Object) te1Var.getText());
        if (textView3.getVisibility() == 0) {
        }
        sb22222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
        hl.g2(sb22222.toString());
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
            float measuredHeight = (getMeasuredHeight() - this.i0) + this.e0 + hl.L(1.0f);
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
                    canvas.translate(rectF.centerX() - (this.K / 2), (hl.L(10.0f) * this.h0) + hl.L(17.2f));
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
                canvas.translate(rectF.centerX() - (this.K / 2), qu6.B(1.0f, this.h0, hl.L(10.0f), hl.L(17.2f)));
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
            setTranslationY(((this.i0 - this.e0) + hl.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            setTranslationY(((f - this.e0) + hl.L(8.0f)) - this.Q);
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

    @Override // snb
    public final void updateColors() {
        vnb vnbVar;
        ArrayList arrayList = this.b0;
        try {
            if (this.a0) {
                return;
            }
            int i = 0;
            while (true) {
                int size = arrayList.size();
                vnbVar = this.W;
                if (i >= size) {
                    break;
                }
                int v0 = aob.v0(((Integer) this.c0.get(i)).intValue(), vnbVar);
                e29 e29Var = this.f;
                String str = (String) arrayList.get(i);
                if (((Boolean) this.d0.get(i)).booleanValue()) {
                    v0 |= -16777216;
                }
                e29Var.h(v0, str);
                i++;
            }
            Paint paint = this.F;
            int i2 = aob.yj;
            paint.setColor(aob.v0(i2, vnbVar));
            this.E.setColor(aob.v0(i2, vnbVar));
            aob.A1(aob.v0(aob.wj, vnbVar), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                aob.F1(linearLayout.getBackground(), aob.v0(aob.xj, vnbVar) & 587202559, true);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i, long j) {
    }

    public UndoView(pqb pqbVar, Context context) {
        this(context, pqbVar, false, null);
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }
}
