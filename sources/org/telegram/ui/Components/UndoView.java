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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
@Deprecated
/* loaded from: classes2.dex */
public class UndoView extends FrameLayout implements tjb {
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
    public final wjb W;
    public byte a;
    public boolean a0;
    public final ke1 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public final ArrayList d0;
    public final ImageView e;
    public int e0;
    public final ry8 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final be0 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.d s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context, org.telegram.ui.ActionBar.d dVar, boolean z, wjb wjbVar) {
        super(context);
        this.a = (byte) 0;
        this.y = y6c.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = gl.L(8.0f);
        this.h0 = 1.0f;
        this.W = wjbVar;
        this.s = dVar;
        this.S = z;
        ke1 ke1Var = new ke1(this, context, wjbVar);
        this.b = ke1Var;
        ke1Var.setTextSize(1, 15.0f);
        int i = bkb.xj;
        zkb.X(ke1Var, i, wjbVar);
        int i2 = bkb.wj;
        zkb.G(ke1Var, i2, wjbVar);
        ke1Var.setMovementMethod(new d5c(this));
        addView(ke1Var, nme.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        zkb.X(textView, i, wjbVar);
        zkb.G(textView, i2, wjbVar);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new cl((byte) 0));
        addView(textView, nme.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ry8 ry8Var = new ry8(context);
        this.f = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = bkb.vj;
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
        addView(ry8Var, nme.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.h = be0Var;
        be0Var.setRoundRadius(gl.L(15.0f));
        addView(be0Var, nme.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(bkb.Y(bkb.v0(i2, wjbVar) & 587202559, gl.L(2.0f), gl.L(2.0f)));
        addView(linearLayout, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new c5c(this, (byte) 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, nme.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        ir2.t(textView2, 1, 14.0f);
        ug8.x(textView2, i2, wjbVar, null, 2131743646);
        linearLayout.addView(textView2, nme.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(gl.L(15.0f), gl.L(15.0f), gl.L(33.0f), gl.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(bkb.v0(i, wjbVar));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setTypeface(gl.o());
        textPaint.setColor(bkb.v0(i, wjbVar));
        setWillNotDraw(false);
        this.V = bkb.b0(gl.L(10.0f), bkb.v0(i3, wjbVar));
        setOnTouchListener(new wmb((byte) 4));
        setVisibility(4);
    }

    public boolean a() {
        return true;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.vj));
    }

    public final boolean c() {
        int i;
        Object obj;
        int i2 = this.L;
        if (i2 == 11 || i2 == 24 || i2 == 6 || i2 == 3 || i2 == 5 || i2 == 13 || i2 == 14 || i2 == 74) {
            return true;
        }
        if ((i2 == 7 && na7.q1(this.y).G0.isEmpty()) || (i = this.L) == 83 || i == 85) {
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
                    na7 q1 = na7.q1(this.y);
                    int i4 = this.L;
                    boolean z2 = i4 == 0 || i4 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) q1.R.f(longValue);
                    if (dialog != null) {
                        if (z2) {
                            q1.v0.l(longValue);
                        } else {
                            q1.u0.l(longValue);
                            if (!z) {
                                q1.y.add(dialog);
                                q1.Z4(null);
                            }
                        }
                        if (!z) {
                            q1.getNotificationCenter().k(kk7.r, Boolean.TRUE);
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
            animatorSet.addListener(new iab(this, (byte) 12));
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
        float measuredHeight = (getMeasuredHeight() - this.i0) + gl.L(9.0f);
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
        bkb.A1(-115203550, this.V);
        ke1 ke1Var = this.b;
        zkb.q(ke1Var);
        int i3 = bkb.wj;
        wjb wjbVar = this.W;
        zkb.G(ke1Var, i3, wjbVar);
        TextView textView = this.c;
        zkb.q(textView);
        zkb.G(textView, i3, wjbVar);
        ke1Var.setTextColor(-1);
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
        ry8 ry8Var = this.f;
        ry8Var.h(-14540254, "info1");
        ry8Var.h(-14540254, "info2");
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
        int v0 = bkb.v0(i, this.W);
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x1736  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1758  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x183a  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x171a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1793  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        ke1 ke1Var;
        TextView textView;
        boolean z;
        long j;
        int i2;
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
        if (!gl.C3() && ((i6 = this.L) == 52 || i6 == 56 || i6 == 57 || i6 == 58 || i6 == 59 || i6 == 60 || i6 == 80 || i6 == 33)) {
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
        String L02 = k96.L0(2131743646);
        TextView textView2 = this.d;
        textView2.setText(L02);
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        ry8 ry8Var = this.f;
        ry8Var.setPadding(0, 0, 0, 0);
        ry8Var.setScaleX(1.0f);
        ry8Var.setScaleY(1.0f);
        ke1 ke1Var2 = this.b;
        ke1Var2.setTextSize(1, 15.0f);
        be0 be0Var = this.h;
        be0Var.setVisibility(8);
        ke1Var2.setGravity(51);
        TextView textView3 = this.c;
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = gl.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ke1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = gl.L(13.0f);
        layoutParams.bottomMargin = 0;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ry8Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = gl.L(3.0f);
        layoutParams2.width = gl.L(54.0f);
        layoutParams2.height = -2;
        ke1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i == 83) {
            setOnClickListener(new c5c(this, (byte) 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new wmb((byte) 5));
            movementMethod = null;
        }
        ke1Var2.setMovementMethod(movementMethod);
        boolean f = f();
        int i7 = R.raw.voip_invite;
        LinearLayout linearLayout = this.n;
        int i8 = this.y;
        int i9 = 36;
        if (f) {
            if (i == 83) {
                textView3.setSingleLine(false);
                S2 = k96.L0(2131745090);
                CharSequence P2 = gl.P2(k96.L0(2131745089), runnable);
                this.N = null;
                this.H = 4000L;
                L0 = P2;
                i3 = R.raw.sound_download;
            } else if (i == 74) {
                textView3.setSingleLine(false);
                S2 = k96.L0(2131746029);
                L0 = k96.Y(2131746014, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i3 = R.raw.ic_admin;
            } else {
                if (i == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder S22 = hc2.W((TLRPC.Chat) obj2) ? gl.S2(k96.Y(2131743237, "VoipChannelInvitedUser", l7c.j(user))) : gl.S2(k96.Y(2131743129, "VoipGroupInvitedUser", l7c.j(user)));
                    pb0 pb0Var = new pb0();
                    pb0Var.s(gl.L(12.0f));
                    pb0Var.q(user);
                    be0Var.f(user, pb0Var);
                    be0Var.setVisibility(0);
                    this.H = 3000L;
                    S2 = S22;
                } else if (i == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        S2 = hc2.W(chat) ? gl.S2(k96.Z(2131743208, l7c.j(user2))) : gl.S2(k96.Z(2131743185, l7c.j(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        boolean W = hc2.W(chat);
                        String str2 = ((TLRPC.Chat) obj).title;
                        S2 = W ? gl.S2(k96.Z(2131743245, str2)) : gl.S2(k96.Z(2131743202, str2));
                    } else {
                        S2 = "";
                    }
                    pb0 pb0Var2 = new pb0();
                    pb0Var2.s(gl.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    pb0Var2.o(tLObject);
                    be0Var.f(tLObject, pb0Var2);
                    be0Var.setVisibility(0);
                    this.H = 3000L;
                } else if (i == 37) {
                    pb0 pb0Var3 = new pb0();
                    pb0Var3.s(gl.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        pb0Var3.q(user3);
                        be0Var.f(user3, pb0Var3);
                        str = qu2.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        pb0Var3.p(chat2);
                        be0Var.f(chat2, pb0Var3);
                        str = chat2.title;
                    }
                    if (hc2.W((TLRPC.Chat) obj2)) {
                        i4 = 0;
                        S2 = gl.S2(k96.Y(2131743209, "VoipChannelUserChanged", str));
                    } else {
                        i4 = 0;
                        S2 = gl.S2(k96.Y(2131743070, "VoipGroupUserChanged", str));
                    }
                    be0Var.setVisibility(i4);
                    this.H = 3000L;
                } else {
                    if (i == 33) {
                        S2 = k96.L0(2131743147);
                        this.H = 3000L;
                        i3 = R.raw.voip_invite;
                        ke1Var = ke1Var2;
                    } else if (i == 77) {
                        S2 = (CharSequence) obj;
                        this.H = 5000L;
                        if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                            ke1Var = ke1Var2;
                        } else {
                            setOnTouchListener(null);
                            ke1Var = ke1Var2;
                            ke1Var.setMovementMethod(null);
                            setOnClickListener(new vzb(this, (TLRPC.Message) obj2, (byte) 4));
                        }
                        i3 = R.raw.payment_success;
                    } else {
                        ke1Var = ke1Var2;
                        if (i == 30) {
                            S2 = gl.S2(k96.Y(2131743072, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? l7c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                            this.H = 3000L;
                        } else if (i == 35) {
                            S2 = gl.S2(k96.Y(2131743071, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? l7c.j((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                            this.H = 3000L;
                        } else {
                            if (i == 31) {
                                S2 = gl.S2(k96.Y(2131743074, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? l7c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i == 38) {
                                S2 = obj instanceof TLRPC.Chat ? gl.S2(k96.Y(2131743062, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : gl.S2(k96.L0(2131743063));
                                this.H = 3000L;
                                i3 = R.raw.voip_allow_talk;
                            } else if (i == 42) {
                                S2 = hc2.W((TLRPC.Chat) obj) ? gl.S2(k96.L0(2131743218)) : gl.S2(k96.L0(2131743093));
                                this.H = 3000L;
                                i3 = R.raw.ic_mute;
                            } else if (i == 43) {
                                S2 = hc2.W((TLRPC.Chat) obj) ? gl.S2(k96.L0(2131743217)) : gl.S2(k96.L0(2131743092));
                                this.H = 3000L;
                                i3 = R.raw.ic_unmute;
                            } else {
                                int i10 = this.L;
                                if (i10 == 39 || i10 == 100) {
                                    S2 = gl.S2(k96.L0(i10 == 39 ? 2131743155 : 2131743066));
                                    this.H = 3000L;
                                    i3 = R.raw.voip_record_start;
                                } else if (i10 == 40 || i10 == 101) {
                                    String L03 = k96.L0(i10 == 40 ? 2131743156 : 2131743067);
                                    this.H = 4000L;
                                    ke1Var.setMovementMethod(new cl((byte) 0));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L03);
                                    int indexOf = L03.indexOf("**");
                                    int lastIndexOf = L03.lastIndexOf("**");
                                    if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                        spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                        try {
                                            spannableStringBuilder.setSpan(new g4c("tg://openmessage?user_id=" + y6c.h(i8).e()), indexOf, lastIndexOf - 2, 33);
                                        } catch (Exception e) {
                                            fa4.f(e);
                                        }
                                    }
                                    i3 = R.raw.voip_record_saved;
                                    S2 = spannableStringBuilder;
                                } else if (i == 36) {
                                    S2 = gl.S2(k96.Y(2131743073, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? l7c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i == 32 || i == 102) {
                                    String j2 = obj instanceof TLRPC.User ? l7c.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                    S2 = i == 102 ? gl.S2(k96.Z(2131743182, j2)) : gl.S2(k96.Z(2131743102, j2));
                                    this.H = 3000L;
                                    i3 = R.raw.ic_ban;
                                } else {
                                    if (i == 9 || i == 10) {
                                        TLRPC.User user4 = (TLRPC.User) obj;
                                        S2 = i == 9 ? gl.S2(k96.Y(2131751283, "EditAdminTransferChannelToast", l7c.j(user4))) : gl.S2(k96.Y(2131751282, "EditAdminTransferGroupToast", l7c.j(user4)));
                                    } else if (i == 8) {
                                        S2 = k96.Y(2131747641, "NowInContacts", l7c.j((TLRPC.User) obj));
                                    } else if (i == 87) {
                                        S2 = k96.Z(2131746417, new Object[0]);
                                    } else if (i == 22) {
                                        if (cf3.D(longValue)) {
                                            S2 = obj == null ? k96.L0(2131748518) : k96.L0(2131748517);
                                        } else {
                                            TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-longValue));
                                            S2 = (!hc2.T(K0) || K0.megagroup) ? obj == null ? k96.L0(2131748520) : k96.L0(2131748519) : obj == null ? k96.L0(2131748522) : k96.L0(2131748521);
                                        }
                                    } else if (i == 23) {
                                        S2 = k96.L0(2131752183);
                                    } else {
                                        if (i == 6) {
                                            S2 = k96.L0(2131754166);
                                            L0 = k96.L0(2131754165);
                                            i3 = R.raw.chats_swipearchive;
                                            i9 = 48;
                                        } else {
                                            if (i10 == 13) {
                                                S2 = k96.L0(2131746251);
                                                L0 = k96.L0(2131746250);
                                                i3 = R.raw.wallet_congrats;
                                            } else {
                                                if (i10 != 14) {
                                                    if (i == 7) {
                                                        S2 = k96.L0(2131754149);
                                                        if (na7.q1(i8).G0.isEmpty()) {
                                                            L0 = k96.L0(2131754148);
                                                            i3 = R.raw.chats_infotip;
                                                        }
                                                        L0 = null;
                                                        i3 = R.raw.chats_infotip;
                                                    } else if (i == 20 || i == 21) {
                                                        t97 t97Var = (t97) obj2;
                                                        Spannable y5 = k27.y5(ke1Var.getPaint().getFontMetricsInt(), vu3.l(t97Var.b, ke1Var.getPaint().getFontMetricsInt(), false), t97Var.c);
                                                        this.a = t97Var.n ? (byte) 26 : (byte) 0;
                                                        if (longValue != 0) {
                                                            if (cf3.B(longValue)) {
                                                                longValue = na7.q1(i8).Y0(Integer.valueOf(cf3.h(longValue))).user_id;
                                                            }
                                                            if (cf3.D(longValue)) {
                                                                TLRPC.User V1 = na7.q1(i8).V1(Long.valueOf(longValue));
                                                                String j3 = l7c.j(V1);
                                                                if (l7c.D(V1)) {
                                                                    j3 = k96.L0(2131745709);
                                                                } else if (l7c.B(V1)) {
                                                                    j3 = k96.L0(2131746073);
                                                                }
                                                                R22 = i == 20 ? gl.R2(k96.U(2131750681, j3, y5)) : gl.R2(k96.U(2131750680, j3, y5));
                                                            } else {
                                                                TLRPC.Chat K02 = na7.q1(i8).K0(Long.valueOf(-longValue));
                                                                R22 = i == 20 ? gl.R2(k96.U(2131750787, K02.title, y5)) : gl.R2(k96.U(2131750786, K02.title, y5));
                                                            }
                                                            R2 = R22;
                                                        } else {
                                                            R2 = i == 20 ? gl.R2(k96.U(2131750783, k96.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y5)) : gl.R2(k96.U(2131750782, k96.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y5));
                                                        }
                                                        i3 = i == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        S2 = R2;
                                                    } else if (i == 19) {
                                                        S2 = this.T;
                                                        i3 = R.raw.ic_delete;
                                                    } else if (i == 82) {
                                                        S2 = k96.L0(((jm6) obj).b ? 2131753951 : 2131753956);
                                                        i3 = 0;
                                                    } else if (i == 78 || i == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        S2 = i == 78 ? k96.G(intValue, "PinnedDialogsCount", new Object[0]) : k96.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i3 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.H = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        S2 = i == 3 ? k96.L0(2131752234) : k96.L0(2131752169);
                                                        if (na7.q1(i8).G0.isEmpty()) {
                                                            L0 = k96.L0(2131752233);
                                                            i3 = R.raw.chats_infotip;
                                                        }
                                                        L0 = null;
                                                        i3 = R.raw.chats_infotip;
                                                    }
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append((Object) ke1Var.getText());
                                                    sb.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                                                    gl.g2(sb.toString());
                                                    if (!e()) {
                                                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                                                        if (measuredWidth == 0) {
                                                            measuredWidth = gl.q.x;
                                                        }
                                                        measureChildWithMargins(textView3, ug8.f(16.0f, measuredWidth, TLObject.FLAG_30), 0, 0, 0);
                                                        this.r = gl.L(37.0f) + textView3.getMeasuredHeight();
                                                    } else if (c()) {
                                                        this.r = gl.L(52.0f);
                                                    } else if (getParent() instanceof ViewGroup) {
                                                        ViewGroup viewGroup = (ViewGroup) getParent();
                                                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                                                        if (measuredWidth2 <= 0) {
                                                            measuredWidth2 = gl.q.x;
                                                        }
                                                        View view = ke1Var;
                                                        measureChildWithMargins(view, ug8.f(16.0f, measuredWidth2, TLObject.FLAG_30), 0, 0, 0);
                                                        int measuredHeight = view.getMeasuredHeight();
                                                        int i11 = this.L;
                                                        int L2 = gl.L((i11 == 16 || i11 == 17 || i11 == 18 || i11 == 84 || i11 == 86) ? 14.0f : 28.0f) + measuredHeight;
                                                        this.r = L2;
                                                        int i12 = this.L;
                                                        if (i12 == 18) {
                                                            this.r = Math.max(L2, gl.L(52.0f));
                                                        } else if (i12 == 25) {
                                                            this.r = Math.max(L2, gl.L(50.0f));
                                                        } else if (z) {
                                                            this.r = L2 - gl.L(8.0f);
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
                                                S2 = k96.L0(2131746249);
                                                L0 = k96.L0(2131746248);
                                                i3 = R.raw.wallet_science;
                                            }
                                            i9 = 44;
                                        }
                                        ke1Var.setText(S2);
                                        if (i3 == 0) {
                                            ry8Var.e(i3, i9, i9);
                                            oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
                                            animatedDrawable.h = false;
                                            animatedDrawable.K(animatedDrawable.n());
                                            ry8Var.setVisibility(0);
                                            ry8Var.setProgress(0.0f);
                                            ry8Var.d();
                                        } else {
                                            ry8Var.setVisibility(8);
                                        }
                                        if (L0 == null) {
                                            layoutParams.leftMargin = gl.L(58.0f);
                                            layoutParams.topMargin = gl.L(6.0f);
                                            layoutParams.rightMargin = gl.L(8.0f);
                                            ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = gl.L(8.0f);
                                            textView3.setText(L0);
                                            textView3.setVisibility(0);
                                            ke1Var.setTextSize(1, 14.0f);
                                            ke1Var.setTypeface(gl.o());
                                            i5 = 8;
                                        } else {
                                            layoutParams.leftMargin = gl.L(58.0f);
                                            layoutParams.topMargin = gl.L(13.0f);
                                            layoutParams.rightMargin = gl.L(8.0f);
                                            i5 = 8;
                                            textView3.setVisibility(8);
                                            ke1Var.setTextSize(1, 15.0f);
                                            ke1Var.setTypeface(Typeface.DEFAULT);
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
                    L0 = null;
                    ke1Var.setText(S2);
                    if (i3 == 0) {
                    }
                    if (L0 == null) {
                    }
                    linearLayout.setVisibility(i5);
                }
                ke1Var = ke1Var2;
                i3 = 0;
                L0 = null;
                ke1Var.setText(S2);
                if (i3 == 0) {
                }
                if (L0 == null) {
                }
                linearLayout.setVisibility(i5);
            }
            ke1Var = ke1Var2;
            ke1Var.setText(S2);
            if (i3 == 0) {
            }
            if (L0 == null) {
            }
            linearLayout.setVisibility(i5);
        } else {
            ke1Var = ke1Var2;
            int i13 = this.L;
            wjb wjbVar = this.W;
            if (i13 == 45 || i13 == 46 || i13 == 47 || i13 == 52 || i13 == 53 || i13 == 54 || i13 == 55 || i13 == 56 || i13 == 57 || i13 == 58 || i13 == 59 || i13 == 60 || i13 == 71 || i13 == 70 || i13 == 75 || i13 == 76 || i13 == 41 || i13 == 78 || i13 == 79 || i13 == 61 || i13 == 80) {
                imageView.setVisibility(8);
                ry8Var.setVisibility(0);
                ke1Var.setTypeface(Typeface.DEFAULT);
                int i14 = this.L;
                long j4 = -1;
                if (i14 == 76) {
                    ke1Var.setText(k96.L0(2131752869));
                    ry8Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = gl.L(9.0f);
                    z = true;
                    ke1Var.setTextSize(1, 14.0f);
                } else if (i14 == 75) {
                    ke1Var.setText(k96.L0(2131749384));
                    ry8Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = gl.L(9.0f);
                    ke1Var.setTextSize(1, 14.0f);
                    z = true;
                } else {
                    if (i == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        textView3.setSingleLine(false);
                        ke1Var.setText(k96.Y(2131753851, "AutoDeleteHintOnText", k96.c0(intValue2)));
                        ry8Var.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = gl.L(9.0f);
                        this.H = 4000L;
                        ry8Var.setPadding(0, 0, 0, gl.L(3.0f));
                    } else {
                        if (i14 == 71) {
                            ke1Var.setText(k96.L0(2131753852));
                            ry8Var.e(R.raw.fire_off, 36, 36);
                            ke1Var.setTextSize(1, 14.0f);
                            this.H = 3000L;
                            ry8Var.setPadding(0, 0, 0, gl.L(4.0f));
                        } else if (i14 == 45) {
                            ke1Var.setText(k96.L0(2131749052));
                            ry8Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = gl.L(9.0f);
                            ke1Var.setTextSize(1, 14.0f);
                            z = true;
                        } else if (i14 == 46) {
                            ke1Var.setText(k96.L0(2131749051));
                            ry8Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = gl.L(9.0f);
                            ke1Var.setTextSize(1, 14.0f);
                        } else if (i14 == 47) {
                            ke1Var.setText(k96.L0(2131749029));
                            ry8Var.e(R.raw.imported, 36, 36);
                            ry8Var.setPadding(0, 0, 0, gl.L(5.0f));
                            layoutParams.topMargin = gl.L(9.0f);
                            ke1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i14 == 52 || i14 == 56 || i14 == 57 || i14 == 58 || i14 == 59 || i14 == 60 || i14 == 80) {
                                textView = textView2;
                                if (!gl.C3()) {
                                    return;
                                }
                                int i15 = this.L;
                                if (i15 == 80) {
                                    ke1Var.setText(k96.L0(2131751191));
                                } else if (i15 == 60) {
                                    ke1Var.setText(k96.L0(2131747102));
                                } else if (i15 == 56) {
                                    ke1Var.setText(k96.L0(2131743426));
                                } else if (i15 == 57) {
                                    ke1Var.setText(k96.L0(2131749170));
                                } else if (i15 == 52) {
                                    ke1Var.setText(k96.L0(2131748397));
                                } else if (i15 == 59) {
                                    ke1Var.setText(k96.L0(2131748729));
                                    ry8Var.e(i7, 30, 30);
                                    this.H = 3000L;
                                    ke1Var.setTextSize(1, 15.0f);
                                } else {
                                    ke1Var.setText(k96.L0(2131743953));
                                }
                                i7 = R.raw.copy;
                                ry8Var.e(i7, 30, 30);
                                this.H = 3000L;
                                ke1Var.setTextSize(1, 15.0f);
                            } else if (i14 == 54) {
                                ke1Var.setText(k96.L0(2131752326));
                                ry8Var.e(R.raw.silent_unmute, 30, 30);
                                this.H = 3000L;
                                ke1Var.setTextSize(1, 15.0f);
                            } else {
                                textView = textView2;
                                if (i14 == 55) {
                                    ke1Var.setText(k96.L0(2131752327));
                                    ry8Var.e(R.raw.silent_mute, 30, 30);
                                    this.H = 3000L;
                                    ke1Var.setTextSize(1, 15.0f);
                                } else if (i14 == 41) {
                                    if (obj2 != null) {
                                        ke1Var.setText(gl.S2(k96.Y(2131748995, "InvLinkToChats", k96.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    } else if (longValue == y6c.h(i8).n) {
                                        ke1Var.setText(gl.S2(k96.L0(2131748993)));
                                    } else if (cf3.y(longValue)) {
                                        ke1Var.setText(gl.S2(k96.Y(2131748994, "InvLinkToGroup", na7.q1(i8).K0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        ke1Var.setText(gl.S2(k96.Y(2131748992, "InvLinkToUser", l7c.j(na7.q1(i8).V1(l)))));
                                    }
                                    ry8Var.e(R.raw.contact_check, 36, 36);
                                    this.H = 3000L;
                                } else if (i14 == 53) {
                                    Integer num = (Integer) obj;
                                    if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                        int intValue3 = ((Integer) obj2).intValue();
                                        if (num.intValue() == 1) {
                                            ke1Var.setText(gl.S2(k96.G(intValue3, "FwdMessageToManyChats", new Object[0])));
                                        } else {
                                            ke1Var.setText(gl.S2(k96.G(intValue3, "FwdMessagesToManyChats", new Object[0])));
                                        }
                                        ry8Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == y6c.h(i8).n) {
                                        if (num.intValue() == 1) {
                                            ke1Var.setText(gl.P2(k96.L0(2131750482), new jc((byte) 14)));
                                        } else {
                                            ke1Var.setText(gl.P2(k96.L0(2131750475), new jc((byte) 14)));
                                        }
                                        ry8Var.e(R.raw.saved_messages, 30, 30);
                                        this.H = 3000L;
                                    } else {
                                        if (cf3.y(longValue)) {
                                            TLRPC.Chat K03 = na7.q1(i8).K0(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String j5 = hc2.p0(K03) ? mm4.j(i8, K03, false) : null;
                                            if (num.intValue() == 1) {
                                                if (j5 == null) {
                                                    j5 = tL_forumTopic != null ? tL_forumTopic.title : K03.title;
                                                }
                                                ke1Var.setText(gl.S2(k96.Y(2131750486, "FwdMessageToGroup", j5)));
                                            } else {
                                                if (j5 == null) {
                                                    j5 = tL_forumTopic != null ? tL_forumTopic.title : K03.title;
                                                }
                                                ke1Var.setText(gl.S2(k96.Y(2131750479, "FwdMessagesToGroup", j5)));
                                            }
                                        } else {
                                            TLRPC.User V12 = na7.q1(i8).V1(l);
                                            if (num.intValue() == 1) {
                                                ke1Var.setText(gl.S2(k96.Y(2131750481, "FwdMessageToUser", l7c.j(V12))));
                                            } else {
                                                ke1Var.setText(gl.S2(k96.Y(2131750474, "FwdMessagesToUser", l7c.j(V12))));
                                            }
                                        }
                                        ry8Var.e(R.raw.forward, 30, 30);
                                    }
                                    j4 = 300;
                                    this.H = 3000L;
                                } else if (i14 == 61) {
                                    if (obj2 != null) {
                                        ke1Var.setText(gl.S2(k96.Y(2131753734, "BackgroundToChats", k96.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                        ry8Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == y6c.h(i8).n) {
                                        ke1Var = ke1Var;
                                        ke1Var.setText(gl.S2(k96.L0(2131753732)));
                                        ry8Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        ke1Var = ke1Var;
                                        if (cf3.y(longValue)) {
                                            ke1Var.setText(gl.S2(k96.Y(2131753733, "BackgroundToGroup", na7.q1(i8).K0(Long.valueOf(-longValue)).title)));
                                        } else {
                                            ke1Var.setText(gl.S2(k96.Y(2131753731, "BackgroundToUser", l7c.j(na7.q1(i8).V1(l)))));
                                        }
                                        ry8Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.H = 3000L;
                                }
                            }
                            j = j4;
                            i2 = 8;
                            z = false;
                            textView3.setVisibility(i2);
                            zkb.X(textView, bkb.wj, wjbVar);
                            linearLayout.setVisibility(i2);
                            layoutParams.leftMargin = gl.L(58.0f);
                            layoutParams.rightMargin = gl.L(8.0f);
                            ry8Var.setProgress(0.0f);
                            ry8Var.d();
                            if (j > 0) {
                                ry8Var.postDelayed(new cib(this, (byte) 21), j);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) ke1Var.getText());
                            if (textView3.getVisibility() == 0) {
                            }
                            sb2.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                            gl.g2(sb2.toString());
                            if (!e()) {
                            }
                            if (getVisibility() == 0) {
                            }
                        }
                        textView = textView2;
                        j = j4;
                        i2 = 8;
                        z = false;
                        textView3.setVisibility(i2);
                        zkb.X(textView, bkb.wj, wjbVar);
                        linearLayout.setVisibility(i2);
                        layoutParams.leftMargin = gl.L(58.0f);
                        layoutParams.rightMargin = gl.L(8.0f);
                        ry8Var.setProgress(0.0f);
                        ry8Var.d();
                        if (j > 0) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append((Object) ke1Var.getText());
                        if (textView3.getVisibility() == 0) {
                        }
                        sb22.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                        gl.g2(sb22.toString());
                        if (!e()) {
                        }
                        if (getVisibility() == 0) {
                        }
                    }
                    textView = textView2;
                    j = -1;
                    i2 = 8;
                    z = true;
                    textView3.setVisibility(i2);
                    zkb.X(textView, bkb.wj, wjbVar);
                    linearLayout.setVisibility(i2);
                    layoutParams.leftMargin = gl.L(58.0f);
                    layoutParams.rightMargin = gl.L(8.0f);
                    ry8Var.setProgress(0.0f);
                    ry8Var.d();
                    if (j > 0) {
                    }
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append((Object) ke1Var.getText());
                    if (textView3.getVisibility() == 0) {
                    }
                    sb222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                    gl.g2(sb222.toString());
                    if (!e()) {
                    }
                    if (getVisibility() == 0) {
                    }
                }
                textView = textView2;
                j = -1;
                i2 = 8;
                textView3.setVisibility(i2);
                zkb.X(textView, bkb.wj, wjbVar);
                linearLayout.setVisibility(i2);
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = gl.L(8.0f);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
                if (j > 0) {
                }
                StringBuilder sb2222 = new StringBuilder();
                sb2222.append((Object) ke1Var.getText());
                if (textView3.getVisibility() == 0) {
                }
                sb2222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                gl.g2(sb2222.toString());
                if (!e()) {
                }
                if (getVisibility() == 0) {
                }
            } else if (i13 == 24 || i13 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                imageView.setVisibility(8);
                ry8Var.setVisibility(0);
                if (intValue4 != 0) {
                    ke1Var.setTypeface(gl.o());
                    ke1Var.setTextSize(1, 14.0f);
                    ry8Var.a.clear();
                    int i16 = bkb.xj;
                    i(i16, "BODY", false);
                    i(i16, "Wibe Big", false);
                    i(i16, "Wibe Big 3", false);
                    i(i16, "Wibe Small", false);
                    ke1Var.setText(k96.L0(2131746423));
                    ry8Var.e(R.raw.ic_unmute, 28, 28);
                    textView3.setVisibility(0);
                    textView3.setSingleLine(false);
                    textView3.setMaxLines(3);
                    if (user5 != null) {
                        textView3.setText(k96.Y(2131746421, "ProximityAlertSetInfoUser", l7c.j(user5), k96.y(intValue4, 2, null)));
                    } else {
                        textView3.setText(k96.Y(2131746422, "ProximityAlertSetInfoGroup2", k96.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = gl.L(6.0f);
                } else {
                    ke1Var.setTypeface(Typeface.DEFAULT);
                    ke1Var.setTextSize(1, 15.0f);
                    ry8Var.a.clear();
                    int i17 = bkb.xj;
                    i(i17, "Body Main", false);
                    i(i17, "Body Top", false);
                    i(i17, "Line", false);
                    i(i17, "Curve Big", false);
                    i(i17, "Curve Small", false);
                    layoutParams.topMargin = gl.L(14.0f);
                    ke1Var.setText(k96.L0(2131746424));
                    ry8Var.e(R.raw.ic_mute, 28, 28);
                    textView3.setVisibility(8);
                    zkb.X(textView2, bkb.wj, wjbVar);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = gl.L(58.0f);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
            } else if (i13 == 11) {
                ke1Var.setText(k96.L0(2131753883));
                ry8Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.topMargin = gl.L(6.0f);
                textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                textView3.setVisibility(0);
                ke1Var.setTextSize(1, 14.0f);
                ke1Var.setTypeface(gl.o());
                zkb.X(textView2, bkb.o7, wjbVar);
                imageView.setVisibility(8);
                linearLayout.setVisibility(0);
                ry8Var.setVisibility(0);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
            } else if (i13 == 15) {
                this.H = 10000L;
                textView2.setText(k96.L0(2131747624));
                ke1Var.setText(k96.L0(2131750790));
                ry8Var.e(R.raw.filter_new, 36, 36);
                int L3 = gl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = gl.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = L3;
                String L04 = k96.L0(2131750791);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L04);
                int indexOf2 = L04.indexOf(42);
                int lastIndexOf2 = L04.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new g4c("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView3.setText(spannableStringBuilder2);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
                ry8Var.setVisibility(0);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
            } else if (i13 == 16 || i13 == 17) {
                this.H = 4000L;
                ke1Var.setTextSize(1, 14.0f);
                ke1Var.setGravity(16);
                ke1Var.setMinHeight(gl.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    ke1Var.setText(gl.S2(k96.L0(2131751438)));
                    ry8Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        ke1Var.setText(gl.S2(k96.L0(2131751666)));
                    } else {
                        String K04 = k96.K0("DiceEmojiInfo_" + str3);
                        if (TextUtils.isEmpty(K04)) {
                            ke1Var.setText(vu3.l(k96.Y(2131751439, "DiceEmojiInfo", str3), ke1Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            ke1Var.setText(vu3.l(K04, ke1Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    ry8Var.setImageDrawable(vu3.g(str3));
                    ry8Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = gl.L(14.0f);
                    layoutParams.bottomMargin = gl.L(14.0f);
                    layoutParams2.leftMargin = gl.L(14.0f);
                    layoutParams2.width = gl.L(26.0f);
                    layoutParams2.height = gl.L(26.0f);
                }
                textView2.setText(k96.L0(2131745435));
                if (this.L == 16) {
                    L = gl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    textView2.setVisibility(0);
                    zkb.X(textView2, bkb.wj, wjbVar);
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    L = gl.L(8.0f);
                    textView2.setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = gl.L(6.0f);
                layoutParams.bottomMargin = gl.L(7.0f);
                layoutParams.height = -1;
                textView3.setVisibility(8);
                ry8Var.setVisibility(0);
            } else if (i13 == 18) {
                this.H = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                ke1Var.setTextSize(1, 14.0f);
                ke1Var.setGravity(16);
                ke1Var.setText((CharSequence) obj);
                textView2.setVisibility(8);
                linearLayout.setVisibility(8);
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = gl.L(8.0f);
                layoutParams.topMargin = gl.L(6.0f);
                layoutParams.bottomMargin = gl.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L4 = gl.L(8.0f);
                layoutParams2.bottomMargin = L4;
                layoutParams2.topMargin = L4;
                ry8Var.setVisibility(0);
                ry8Var.e(R.raw.chats_infotip, 36, 36);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
                ke1Var.setMovementMethod(new cl((byte) 0));
            } else if (i13 == 12) {
                ke1Var.setText(k96.L0(2131751998));
                ry8Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = gl.L(48.0f);
                layoutParams.topMargin = gl.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = gl.L(48.0f);
                String L05 = k96.L0(2131751997);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L05);
                int indexOf3 = L05.indexOf(42);
                int lastIndexOf3 = L05.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new g4c("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView3.setText(spannableStringBuilder3);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                textView2.setVisibility(8);
                linearLayout.setVisibility(0);
                ry8Var.setVisibility(0);
            } else if (i13 == 84) {
                ke1Var.setVisibility(0);
                ke1Var.setTextSize(1, 15.0f);
                ke1Var.setTypeface(Typeface.DEFAULT);
                ke1Var.setText(gl.S2(k96.L0(2131743616)));
                ry8Var.setVisibility(0);
                ry8Var.e(R.raw.voice_to_text, 36, 36);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
                textView2.setText(k96.L0(2131746842));
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = gl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                int L5 = gl.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                be0Var.setVisibility(8);
                textView3.setVisibility(8);
                textView2.setVisibility(0);
                linearLayout.setVisibility(0);
                imageView.setVisibility(8);
            } else if (i13 == 85) {
                ke1Var.setVisibility(0);
                ke1Var.setTextSize(1, 15.0f);
                ke1Var.setTypeface(gl.o());
                ke1Var.setText(k96.L0(2131744065));
                ry8Var.setVisibility(0);
                ry8Var.e(R.raw.hint_swipe_reply, 64, 64);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
                textView3.setVisibility(0);
                textView3.setText(k96.L0(2131744064));
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = gl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.topMargin = gl.L(6.0f);
                layoutParams.height = -2;
                be0Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i13 == 90 || i13 == 91 || i13 == 92 || i13 == 93 || i13 == 94) {
                switch (i13) {
                    case kk7.a1 /* 90 */:
                        ke1Var.setText(k96.G((int) on0.g(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case kk7.b1 /* 91 */:
                        ke1Var.setText(k96.L0(2131753269));
                        break;
                    case kk7.c1 /* 92 */:
                        ke1Var.setText(k96.G((int) on0.i(), "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case kk7.d1 /* 93 */:
                        ke1Var.setText(gl.S2(k96.G(on0.b(), "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case kk7.e1 /* 94 */:
                        ke1Var.setText(k96.L0(2131753330));
                        break;
                }
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.rightMargin = gl.L(8.0f);
                ke1Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                ke1Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                ry8Var.setVisibility(0);
                ry8Var.e(R.raw.chats_infotip, 36, 36);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
            } else {
                int i18 = 2;
                if (i13 != 2) {
                    if (i13 == 4) {
                        i18 = 2;
                    } else if (i == 82) {
                        layoutParams.leftMargin = gl.L(58.0f);
                        jm6 jm6Var = (jm6) obj;
                        ke1Var.setText(k96.L0(jm6Var.b ? 2131753951 : 2131753956));
                        linearLayout.setVisibility(0);
                        ke1Var.setTextSize(1, 15.0f);
                        ke1Var.setTypeface(Typeface.DEFAULT);
                        textView3.setVisibility(8);
                        be0Var.setVisibility(0);
                        be0Var.setRoundRadius(gl.L(2.0f));
                        String str4 = jm6Var.c;
                        if (str4 != null) {
                            be0Var.o(str4, null, bkb.Q4);
                        } else if (jm6Var.I != null) {
                            be0Var.r(jm6Var.J, jm6Var.K, true);
                            boolean z3 = jm6Var.b;
                            int i19 = jm6Var.C;
                            if (z3) {
                                StringBuilder m = de9.m(i19, "vthumb://", ":");
                                m.append(jm6Var.I);
                                be0Var.o(m.toString(), null, bkb.Q4);
                            } else {
                                StringBuilder m2 = de9.m(i19, "thumb://", ":");
                                m2.append(jm6Var.I);
                                be0Var.o(m2.toString(), null, bkb.Q4);
                            }
                        } else {
                            be0Var.setImageDrawable(bkb.Q4);
                        }
                    } else {
                        layoutParams.leftMargin = gl.L(45.0f);
                        layoutParams.topMargin = gl.L(13.0f);
                        layoutParams.rightMargin = 0;
                        ke1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        ke1Var.setTypeface(typeface);
                        textView3.setVisibility(8);
                        ry8Var.setVisibility(8);
                        int i20 = this.L;
                        if (i20 == 88) {
                            String str5 = (String) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            if (intValue5 > 0) {
                                int L6 = gl.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                layoutParams.leftMargin = gl.L(48.0f);
                                layoutParams.rightMargin = L6;
                                layoutParams.topMargin = gl.L(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                layoutParams3.leftMargin = gl.L(48.0f);
                                layoutParams3.rightMargin = L6;
                                ke1Var.setText(k96.Y(2131750646, "FolderLinkDeletedTitle", str5));
                                ke1Var.setTypeface(gl.o());
                                textView3.setVisibility(0);
                                textView3.setText(k96.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                            } else {
                                ke1Var.setTypeface(typeface);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                ke1Var.setText(gl.S2(k96.Y(2131750650, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                            }
                        } else if (i20 == 81 || i20 == 0 || i20 == 26) {
                            ke1Var.setText(k96.L0(2131749101));
                        } else if (i20 == 27) {
                            ke1Var.setText(k96.L0(2131752168));
                        } else if (i20 == 95) {
                            if (cf3.y(longValue)) {
                                TLRPC.Chat K05 = na7.q1(i8).K0(Long.valueOf(-longValue));
                                if (hc2.p0(K05)) {
                                    ke1Var.setText(k96.L0(2131748157));
                                } else if (!hc2.T(K05) || K05.megagroup) {
                                    ke1Var.setText(k96.L0(2131749238));
                                } else {
                                    ke1Var.setText(k96.L0(2131752376));
                                }
                            } else {
                                ke1Var.setText(k96.L0(2131752230));
                            }
                        } else if (cf3.y(longValue)) {
                            TLRPC.Chat K06 = na7.q1(i8).K0(Long.valueOf(-longValue));
                            if (hc2.p0(K06)) {
                                ke1Var.setText(k96.L0(2131748157));
                            } else if (!hc2.T(K06) || K06.megagroup) {
                                ke1Var.setText(k96.L0(2131749257));
                            } else {
                                ke1Var.setText(k96.L0(2131752405));
                            }
                        } else {
                            ke1Var.setText(k96.L0(2131752230));
                        }
                        if (this.L != 81) {
                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                na7 q1 = na7.q1(i8);
                                long longValue2 = ((Long) arrayList.get(i21)).longValue();
                                int i22 = this.L;
                                q1.a(longValue2, i22 == 0 || i22 == 26);
                            }
                        }
                    }
                }
                if (i == i18) {
                    ke1Var.setText(k96.L0(2131752234));
                } else {
                    ke1Var.setText(k96.L0(2131752169));
                }
                layoutParams.leftMargin = gl.L(58.0f);
                layoutParams.topMargin = gl.L(13.0f);
                layoutParams.rightMargin = 0;
                ke1Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                ke1Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                ry8Var.setVisibility(0);
                ry8Var.e(R.raw.chats_archived, 36, 36);
                ry8Var.setProgress(0.0f);
                ry8Var.d();
            }
        }
        z = false;
        StringBuilder sb22222 = new StringBuilder();
        sb22222.append((Object) ke1Var.getText());
        if (textView3.getVisibility() == 0) {
        }
        sb22222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
        gl.g2(sb22222.toString());
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
            float measuredHeight = (getMeasuredHeight() - this.i0) + this.e0 + gl.L(1.0f);
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
                    canvas.translate(rectF.centerX() - (this.K / 2), (gl.L(10.0f) * this.h0) + gl.L(17.2f));
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
                canvas.translate(rectF.centerX() - (this.K / 2), ls6.B(1.0f, this.h0, gl.L(10.0f), gl.L(17.2f)));
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
            setTranslationY(((this.i0 - this.e0) + gl.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            setTranslationY(((f - this.e0) + gl.L(8.0f)) - this.Q);
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

    @Override // tjb
    public final void updateColors() {
        wjb wjbVar;
        ArrayList arrayList = this.b0;
        try {
            if (this.a0) {
                return;
            }
            int i = 0;
            while (true) {
                int size = arrayList.size();
                wjbVar = this.W;
                if (i >= size) {
                    break;
                }
                int v0 = bkb.v0(((Integer) this.c0.get(i)).intValue(), wjbVar);
                ry8 ry8Var = this.f;
                String str = (String) arrayList.get(i);
                if (((Boolean) this.d0.get(i)).booleanValue()) {
                    v0 |= -16777216;
                }
                ry8Var.h(v0, str);
                i++;
            }
            Paint paint = this.F;
            int i2 = bkb.xj;
            paint.setColor(bkb.v0(i2, wjbVar));
            this.E.setColor(bkb.v0(i2, wjbVar));
            bkb.A1(bkb.v0(bkb.vj, wjbVar), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                bkb.F1(linearLayout.getBackground(), bkb.v0(bkb.wj, wjbVar) & 587202559, true);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i, long j) {
    }

    public UndoView(qmb qmbVar, Context context) {
        this(context, qmbVar, false, null);
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }
}
