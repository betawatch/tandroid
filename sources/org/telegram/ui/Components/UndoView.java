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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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
    public final org.telegram.ui.ActionBar.i6 W;
    public int a;
    public boolean a0;
    public final org.telegram.ui.Cells.b2 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public final ArrayList d0;
    public final ImageView e;
    public int e0;
    public final ph0 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final q9 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.h2 s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
    }

    public final boolean c() {
        int i7;
        Object obj;
        int i10 = this.L;
        if (i10 == 11 || i10 == 24 || i10 == 6 || i10 == 3 || i10 == 5 || i10 == 13 || i10 == 14 || i10 == 74) {
            return true;
        }
        if ((i10 == 7 && org.telegram.messenger.mp.u1(this.y).Q0.isEmpty()) || (i7 = this.L) == 83 || i7 == 85) {
            return true;
        }
        return i7 == 88 && (obj = this.x) != null && ((Integer) obj).intValue() > 0;
    }

    public void d(int i7, boolean z10) {
        if (getVisibility() == 0 && this.R) {
            this.w = null;
            this.x = null;
            this.R = false;
            Runnable runnable = this.N;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.N = null;
            }
            Runnable runnable2 = this.O;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.O = null;
            }
            int i10 = this.L;
            if (i10 == 0 || i10 == 1 || i10 == 95 || i10 == 26 || i10 == 27) {
                for (int i11 = 0; i11 < this.M.size(); i11++) {
                    long longValue = ((Long) this.M.get(i11)).longValue();
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.y);
                    int i12 = this.L;
                    boolean z11 = i12 == 0 || i12 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) u12.R.f(longValue);
                    if (dialog != null) {
                        if (z11) {
                            u12.F0.l(longValue);
                        } else {
                            u12.E0.l(longValue);
                            if (!z10) {
                                u12.y.add(dialog);
                                u12.f5(null);
                            }
                        }
                        if (!z10) {
                            u12.getNotificationCenter().k(org.telegram.messenger.ks.s, Boolean.TRUE);
                        }
                    }
                    g(this.L, longValue);
                }
            }
            boolean z12 = this.S;
            if (i7 == 0) {
                setEnterOffset((z12 ? -1.0f : 1.0f) * (this.e0 + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int i13 = 3;
            if (i7 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z12 ? -1.0f : 1.0f) * (this.e0 + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new s11(this, i13));
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
        float measuredHeight = (getMeasuredHeight() - this.i0) + org.telegram.messenger.g0.L(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public final boolean e() {
        int i7 = this.L;
        return i7 == 12 || i7 == 15 || i7 == 24 || i7 == 74 || i7 == 83;
    }

    public final boolean f() {
        int i7 = this.L;
        return i7 == 6 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 8 || i7 == 87 || i7 == 9 || i7 == 10 || i7 == 13 || i7 == 14 || i7 == 19 || i7 == 20 || i7 == 21 || i7 == 22 || i7 == 23 || i7 == 30 || i7 == 31 || i7 == 32 || i7 == 102 || i7 == 33 || i7 == 34 || i7 == 35 || i7 == 36 || i7 == 74 || i7 == 37 || i7 == 38 || i7 == 39 || i7 == 40 || i7 == 42 || i7 == 43 || i7 == 77 || i7 == 44 || i7 == 78 || i7 == 79 || i7 == 100 || i7 == 101 || i7 == 83;
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

    public final void h(int i7, int i10) {
        this.a0 = true;
        org.telegram.ui.ActionBar.n6.C1(-115203550, this.V);
        org.telegram.ui.Cells.b2 b2Var = this.b;
        org.telegram.ui.ActionBar.u6.q(b2Var);
        int i11 = org.telegram.ui.ActionBar.n6.xj;
        org.telegram.ui.ActionBar.i6 i6Var = this.W;
        org.telegram.ui.ActionBar.u6.G(b2Var, i11, i6Var);
        TextView textView = this.c;
        org.telegram.ui.ActionBar.u6.q(textView);
        org.telegram.ui.ActionBar.u6.G(textView, i11, i6Var);
        b2Var.setTextColor(-1);
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
        ph0 ph0Var = this.f;
        ph0Var.h(-14540254, "info1");
        ph0Var.h(-14540254, "info2");
    }

    public final void i(int i7, String str, boolean z10) {
        ArrayList arrayList = this.b0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.d0;
        ArrayList arrayList3 = this.c0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i7));
            arrayList2.set(indexOf, Boolean.valueOf(z10));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i7));
            arrayList2.add(Boolean.valueOf(z10));
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.W;
        this.f.h(z10 ? org.telegram.ui.ActionBar.n6.w0(i7, i6Var) | (-16777216) : org.telegram.ui.ActionBar.n6.w0(i7, i6Var), str);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i7, long j3, Runnable runnable) {
        k(j3, i7, null, null, runnable, null);
    }

    public void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        n(arrayList, i7, obj, obj2, runnable, runnable2);
    }

    public final void l(long j3, int i7, Runnable runnable, Runnable runnable2) {
        k(j3, i7, null, null, runnable, runnable2);
    }

    public final void m(long j3, Object obj, int i7) {
        k(j3, i7, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x176b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x178d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x187a  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x174f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x17cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        MovementMethod movementMethod;
        boolean z10;
        long j3;
        int i11;
        int L;
        int i12;
        CharSequence W2;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        int i15;
        CharSequence charSequence;
        SpannableStringBuilder V2;
        SpannableStringBuilder V22;
        String L0;
        String str;
        String L02;
        String L03;
        int i16;
        String str2;
        int i17;
        int i18;
        LinearLayout linearLayout = this.n;
        q9 q9Var = this.h;
        int i19 = this.y;
        TextView textView = this.d;
        TextView textView2 = this.c;
        ph0 ph0Var = this.f;
        org.telegram.ui.Cells.b2 b2Var = this.b;
        if (org.telegram.messenger.g0.G3()) {
            i10 = i19;
        } else {
            int i20 = this.L;
            i10 = i19;
            if (i20 == 52 || i20 == 56 || i20 == 57 || i20 == 58 || i20 == 59 || i20 == 60 || i20 == 80 || i20 == 33) {
                return;
            }
        }
        Runnable runnable3 = this.N;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.R = true;
        this.N = runnable;
        this.O = runnable2;
        this.M = arrayList;
        Long l10 = (Long) arrayList.get(0);
        long longValue = l10.longValue();
        this.L = i7;
        this.H = 5000L;
        this.w = obj;
        this.x = obj2;
        this.P = SystemClock.elapsedRealtime();
        textView.setText(org.telegram.messenger.gd.L0(2131743648));
        this.e.setVisibility(0);
        ph0Var.setPadding(0, 0, 0, 0);
        ph0Var.setScaleX(1.0f);
        ph0Var.setScaleY(1.0f);
        b2Var.setTextSize(1, 15.0f);
        q9Var.setVisibility(8);
        b2Var.setGravity(51);
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
        layoutParams.bottomMargin = 0;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ph0Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(3.0f);
        layoutParams2.width = org.telegram.messenger.g0.L(54.0f);
        layoutParams2.height = -2;
        b2Var.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i7 == 83) {
            setOnClickListener(new t41(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new gi.a(28));
            movementMethod = null;
        }
        b2Var.setMovementMethod(movementMethod);
        boolean f10 = f();
        int i21 = R.raw.voip_invite;
        int i22 = 36;
        if (f10) {
            if (i7 == 83) {
                textView2.setSingleLine(false);
                W2 = org.telegram.messenger.gd.L0(2131745087);
                charSequence = org.telegram.messenger.g0.T2(org.telegram.messenger.gd.L0(2131745086), runnable);
                this.N = null;
                this.H = 4000L;
                i15 = R.raw.sound_download;
            } else if (i7 == 74) {
                textView2.setSingleLine(false);
                W2 = org.telegram.messenger.gd.L0(2131746027);
                charSequence = org.telegram.messenger.gd.Y(2131746012, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i15 = R.raw.ic_admin;
            } else {
                if (i7 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder W22 = org.telegram.messenger.v3.W((TLRPC.Chat) obj2) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743242, "VoipChannelInvitedUser", org.telegram.messenger.o10.j(user))) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743134, "VoipGroupInvitedUser", org.telegram.messenger.o10.j(user)));
                    b9 b9Var = new b9();
                    b9Var.u(org.telegram.messenger.g0.L(12.0f));
                    b9Var.r(user);
                    q9Var.f(user, b9Var);
                    q9Var.setVisibility(0);
                    this.H = 3000L;
                    W2 = W22;
                } else if (i7 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        W2 = org.telegram.messenger.v3.W(chat) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131743213, org.telegram.messenger.o10.j(user2))) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131743190, org.telegram.messenger.o10.j(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        W2 = org.telegram.messenger.v3.W(chat) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131743250, chat2.title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131743207, chat2.title));
                    } else {
                        W2 = "";
                    }
                    b9 b9Var2 = new b9();
                    b9Var2.u(org.telegram.messenger.g0.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    b9Var2.p(tLObject);
                    q9Var.f(tLObject, b9Var2);
                    q9Var.setVisibility(0);
                    this.H = 3000L;
                } else if (i7 == 37) {
                    b9 b9Var3 = new b9();
                    b9Var3.u(org.telegram.messenger.g0.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        b9Var3.r(user3);
                        q9Var.f(user3, b9Var3);
                        str2 = org.telegram.messenger.i5.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        b9Var3.q(chat3);
                        q9Var.f(chat3, b9Var3);
                        str2 = chat3.title;
                    }
                    if (org.telegram.messenger.v3.W((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743214, "VoipChannelUserChanged", str2));
                    } else {
                        i17 = 0;
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743075, "VoipGroupUserChanged", str2));
                    }
                    q9Var.setVisibility(i17);
                    this.H = 3000L;
                } else {
                    if (i7 == 33) {
                        W2 = org.telegram.messenger.gd.L0(2131743152);
                        this.H = 3000L;
                        i15 = R.raw.voip_invite;
                    } else {
                        if (i7 == 77) {
                            W2 = (CharSequence) obj;
                            this.H = 5000L;
                            if (this.s != null && (obj2 instanceof TLRPC.Message)) {
                                setOnTouchListener(null);
                                b2Var.setMovementMethod(null);
                                setOnClickListener(new c31(3, this, (TLRPC.Message) obj2));
                            }
                            i13 = R.raw.payment_success;
                        } else {
                            if (i7 == 30) {
                                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743077, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.o10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i7 == 35) {
                                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743076, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.o10.j((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.H = 3000L;
                            } else {
                                if (i7 == 31) {
                                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743079, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.o10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i7 == 38) {
                                    W2 = obj instanceof TLRPC.Chat ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743067, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131743068));
                                    this.H = 3000L;
                                    i13 = R.raw.voip_allow_talk;
                                } else if (i7 == 42) {
                                    W2 = org.telegram.messenger.v3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131743223)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131743098));
                                    this.H = 3000L;
                                    charSequence = null;
                                    i15 = R.raw.ic_mute;
                                } else if (i7 == 43) {
                                    W2 = org.telegram.messenger.v3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131743222)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131743097));
                                    this.H = 3000L;
                                    i13 = R.raw.ic_unmute;
                                } else {
                                    int i23 = this.L;
                                    if (i23 == 39 || i23 == 100) {
                                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(i23 == 39 ? 2131743160 : 2131743071));
                                        this.H = 3000L;
                                        i13 = R.raw.voip_record_start;
                                    } else {
                                        if (i23 == 40 || i23 == 101) {
                                            String L04 = org.telegram.messenger.gd.L0(i23 == 40 ? 2131743161 : 2131743072);
                                            this.H = 4000L;
                                            b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
                                            spannableStringBuilder = new SpannableStringBuilder(L04);
                                            int indexOf = L04.indexOf("**");
                                            int lastIndexOf = L04.lastIndexOf("**");
                                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new p41("tg://openmessage?user_id=" + org.telegram.messenger.j10.i(i10).e()), indexOf, lastIndexOf - 2, 33);
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.f(e10);
                                                }
                                            }
                                            i14 = R.raw.voip_record_saved;
                                        } else if (i7 == 36) {
                                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131743078, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.o10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            this.H = 3000L;
                                        } else if (i7 == 32 || i7 == 102) {
                                            String j10 = obj instanceof TLRPC.User ? org.telegram.messenger.o10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                            W2 = i7 == 102 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131743187, j10)) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Z(2131743107, j10));
                                            this.H = 3000L;
                                            i13 = R.raw.ic_ban;
                                        } else {
                                            if (i7 == 9 || i7 == 10) {
                                                TLRPC.User user4 = (TLRPC.User) obj;
                                                W2 = i7 == 9 ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131751284, "EditAdminTransferChannelToast", org.telegram.messenger.o10.j(user4))) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131751283, "EditAdminTransferGroupToast", org.telegram.messenger.o10.j(user4)));
                                            } else if (i7 == 8) {
                                                W2 = org.telegram.messenger.gd.Y(2131747641, "NowInContacts", org.telegram.messenger.o10.j((TLRPC.User) obj));
                                            } else if (i7 == 87) {
                                                W2 = org.telegram.messenger.gd.Z(2131746415, new Object[0]);
                                            } else if (i7 == 22) {
                                                if (org.telegram.messenger.n5.E(longValue)) {
                                                    W2 = obj == null ? org.telegram.messenger.gd.L0(2131748518) : org.telegram.messenger.gd.L0(2131748517);
                                                } else {
                                                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).O0(Long.valueOf(-longValue));
                                                    W2 = (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? obj == null ? org.telegram.messenger.gd.L0(2131748520) : org.telegram.messenger.gd.L0(2131748519) : obj == null ? org.telegram.messenger.gd.L0(2131748522) : org.telegram.messenger.gd.L0(2131748521);
                                                }
                                            } else if (i7 == 23) {
                                                W2 = org.telegram.messenger.gd.L0(2131752184);
                                            } else if (i7 == 6) {
                                                W2 = org.telegram.messenger.gd.L0(2131754167);
                                                charSequence = org.telegram.messenger.gd.L0(2131754166);
                                                i15 = R.raw.chats_swipearchive;
                                                i22 = 48;
                                            } else {
                                                if (i23 == 13) {
                                                    L02 = org.telegram.messenger.gd.L0(2131746249);
                                                    L03 = org.telegram.messenger.gd.L0(2131746248);
                                                    i16 = R.raw.wallet_congrats;
                                                } else if (i23 == 14) {
                                                    L02 = org.telegram.messenger.gd.L0(2131746247);
                                                    L03 = org.telegram.messenger.gd.L0(2131746246);
                                                    i16 = R.raw.wallet_science;
                                                } else {
                                                    if (i7 == 7) {
                                                        W2 = org.telegram.messenger.gd.L0(2131754150);
                                                        if (org.telegram.messenger.mp.u1(i10).Q0.isEmpty()) {
                                                            L0 = org.telegram.messenger.gd.L0(2131754149);
                                                            str = L0;
                                                        }
                                                        str = null;
                                                    } else if (i7 == 20 || i7 == 21) {
                                                        org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) obj2;
                                                        Spannable z52 = org.telegram.messenger.fj.z5(b2Var.getPaint().getFontMetricsInt(), org.telegram.messenger.j6.l(roVar.b, b2Var.getPaint().getFontMetricsInt(), false), roVar.c);
                                                        this.a = roVar.n ? 26 : 0;
                                                        if (longValue != 0) {
                                                            long j11 = org.telegram.messenger.n5.C(longValue) ? org.telegram.messenger.mp.u1(i10).c1(Integer.valueOf(org.telegram.messenger.n5.h(longValue))).user_id : longValue;
                                                            if (org.telegram.messenger.n5.E(j11)) {
                                                                TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(j11));
                                                                String j12 = org.telegram.messenger.o10.j(c22);
                                                                if (org.telegram.messenger.o10.C(c22)) {
                                                                    j12 = org.telegram.messenger.gd.L0(2131745706);
                                                                } else if (org.telegram.messenger.o10.A(c22)) {
                                                                    j12 = org.telegram.messenger.gd.L0(2131746071);
                                                                }
                                                                V22 = i7 == 20 ? org.telegram.messenger.g0.V2(org.telegram.messenger.gd.U(2131750682, j12, z52)) : org.telegram.messenger.g0.V2(org.telegram.messenger.gd.U(2131750681, j12, z52));
                                                            } else {
                                                                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-j11));
                                                                V22 = i7 == 20 ? org.telegram.messenger.g0.V2(org.telegram.messenger.gd.U(2131750788, O02.title, z52)) : org.telegram.messenger.g0.V2(org.telegram.messenger.gd.U(2131750787, O02.title, z52));
                                                            }
                                                            V2 = V22;
                                                        } else {
                                                            V2 = i7 == 20 ? org.telegram.messenger.g0.V2(org.telegram.messenger.gd.U(2131750784, org.telegram.messenger.gd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52)) : org.telegram.messenger.g0.V2(org.telegram.messenger.gd.U(2131750783, org.telegram.messenger.gd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52));
                                                        }
                                                        i14 = i7 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        spannableStringBuilder = V2;
                                                    } else if (i7 == 19) {
                                                        W2 = this.T;
                                                        i13 = R.raw.ic_delete;
                                                    } else if (i7 == 82) {
                                                        W2 = org.telegram.messenger.gd.L0(((org.telegram.messenger.ef) obj).b ? 2131753952 : 2131753957);
                                                    } else if (i7 == 78 || i7 == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        W2 = i7 == 78 ? org.telegram.messenger.gd.G(intValue, "PinnedDialogsCount", new Object[0]) : org.telegram.messenger.gd.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i13 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.H = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        W2 = i7 == 3 ? org.telegram.messenger.gd.L0(2131752235) : org.telegram.messenger.gd.L0(2131752170);
                                                        if (org.telegram.messenger.mp.u1(i10).Q0.isEmpty()) {
                                                            L0 = org.telegram.messenger.gd.L0(2131752234);
                                                            str = L0;
                                                        }
                                                        str = null;
                                                    }
                                                    charSequence = str;
                                                    i15 = R.raw.chats_infotip;
                                                }
                                                i22 = 44;
                                                W2 = L02;
                                                charSequence = L03;
                                                i15 = i16;
                                            }
                                            charSequence = null;
                                            i15 = R.raw.contact_check;
                                        }
                                        i15 = i14;
                                        W2 = spannableStringBuilder;
                                    }
                                }
                                i15 = R.raw.voip_unmuted;
                            }
                            i15 = R.raw.voip_muted;
                        }
                        i15 = i13;
                    }
                    charSequence = null;
                }
                charSequence = null;
                i15 = 0;
            }
            b2Var.setText(W2);
            if (i15 != 0) {
                ph0Var.e(i15, i22, i22);
                mh0 animatedDrawable = ph0Var.getAnimatedDrawable();
                animatedDrawable.h = false;
                animatedDrawable.P(animatedDrawable.s());
                ph0Var.setVisibility(0);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
            } else {
                ph0Var.setVisibility(8);
            }
            if (charSequence != null) {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(8.0f);
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                i18 = 8;
            } else {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                i18 = 8;
                textView2.setVisibility(8);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
            }
            linearLayout.setVisibility(i18);
        } else {
            int i24 = this.L;
            if (i24 == 45 || i24 == 46 || i24 == 47 || i24 == 52 || i24 == 53 || i24 == 54 || i24 == 55 || i24 == 56 || i24 == 57 || i24 == 58 || i24 == 59 || i24 == 60 || i24 == 71 || i24 == 70 || i24 == 75 || i24 == 76 || i24 == 41 || i24 == 78 || i24 == 79 || i24 == 61 || i24 == 80) {
                this.e.setVisibility(8);
                ph0Var.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                int i25 = this.L;
                long j13 = -1;
                if (i25 == 76) {
                    b2Var.setText(org.telegram.messenger.gd.L0(2131752870));
                    ph0Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    b2Var.setTextSize(1, 14.0f);
                    z10 = true;
                } else if (i25 == 75) {
                    b2Var.setText(org.telegram.messenger.gd.L0(2131749384));
                    ph0Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    z10 = true;
                    b2Var.setTextSize(1, 14.0f);
                } else {
                    if (i7 != 70) {
                        if (i25 == 71) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131753853));
                            ph0Var.e(R.raw.fire_off, 36, 36);
                            b2Var.setTextSize(1, 14.0f);
                            this.H = 3000L;
                            ph0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        } else if (i25 == 45) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131749052));
                            ph0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            z10 = true;
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i25 == 46) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131749051));
                            ph0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i25 == 47) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131749029));
                            ph0Var.e(R.raw.imported, 36, 36);
                            ph0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(5.0f));
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i25 == 52 || i25 == 56 || i25 == 57 || i25 == 58 || i25 == 59 || i25 == 60 || i25 == 80) {
                            if (!org.telegram.messenger.g0.G3()) {
                                return;
                            }
                            int i26 = this.L;
                            if (i26 == 80) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131751192));
                            } else if (i26 == 60) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131747102));
                            } else if (i26 == 56) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131743428));
                            } else if (i26 == 57) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131749170));
                            } else if (i26 == 52) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131748397));
                            } else if (i26 == 59) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131748729));
                                ph0Var.e(i21, 30, 30);
                                this.H = 3000L;
                                b2Var.setTextSize(1, 15.0f);
                            } else {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131743959));
                            }
                            i21 = R.raw.copy;
                            ph0Var.e(i21, 30, 30);
                            this.H = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i25 == 54) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131752327));
                            ph0Var.e(R.raw.silent_unmute, 30, 30);
                            this.H = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i25 == 55) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131752328));
                            ph0Var.e(R.raw.silent_mute, 30, 30);
                            this.H = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i25 == 41) {
                            if (obj2 != null) {
                                b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131748995, "InvLinkToChats", org.telegram.messenger.gd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                            } else if (longValue == org.telegram.messenger.j10.i(i10).n) {
                                b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131748993)));
                            } else if (org.telegram.messenger.n5.z(longValue)) {
                                b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131748994, "InvLinkToGroup", org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-longValue)).title)));
                            } else {
                                b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131748992, "InvLinkToUser", org.telegram.messenger.o10.j(org.telegram.messenger.mp.u1(i10).c2(l10)))));
                            }
                            ph0Var.e(R.raw.contact_check, 36, 36);
                            this.H = 3000L;
                        } else if (i25 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                int intValue2 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(intValue2, "FwdMessageToManyChats", new Object[0])));
                                } else {
                                    b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(intValue2, "FwdMessagesToManyChats", new Object[0])));
                                }
                                ph0Var.e(R.raw.forward, 30, 30);
                            } else if (longValue == org.telegram.messenger.j10.i(i10).n) {
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.L0(2131750482), new me(16)));
                                } else {
                                    b2Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.L0(2131750475), new me(16)));
                                }
                                ph0Var.e(R.raw.saved_messages, 30, 30);
                                this.H = 3000L;
                            } else {
                                if (org.telegram.messenger.n5.z(longValue)) {
                                    TLRPC.Chat O03 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-longValue));
                                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                    String j14 = org.telegram.messenger.v3.p0(O03) ? qg.c.j(i10, O03, false) : null;
                                    if (num.intValue() == 1) {
                                        if (j14 == null) {
                                            j14 = tL_forumTopic != null ? tL_forumTopic.title : O03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131750486, "FwdMessageToGroup", j14)));
                                    } else {
                                        if (j14 == null) {
                                            j14 = tL_forumTopic != null ? tL_forumTopic.title : O03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131750479, "FwdMessagesToGroup", j14)));
                                    }
                                } else {
                                    TLRPC.User c23 = org.telegram.messenger.mp.u1(i10).c2(l10);
                                    if (num.intValue() == 1) {
                                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131750481, "FwdMessageToUser", org.telegram.messenger.o10.j(c23))));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131750474, "FwdMessagesToUser", org.telegram.messenger.o10.j(c23))));
                                    }
                                }
                                ph0Var.e(R.raw.forward, 30, 30);
                            }
                            j13 = 300;
                            this.H = 3000L;
                        } else {
                            int i27 = i10;
                            if (i25 == 61) {
                                if (obj2 != null) {
                                    b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131753735, "BackgroundToChats", org.telegram.messenger.gd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    ph0Var.e(R.raw.forward, 30, 30);
                                } else if (longValue == org.telegram.messenger.j10.i(i27).n) {
                                    b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131753733)));
                                    ph0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (org.telegram.messenger.n5.z(longValue)) {
                                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131753734, "BackgroundToGroup", org.telegram.messenger.mp.u1(i27).O0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131753732, "BackgroundToUser", org.telegram.messenger.o10.j(org.telegram.messenger.mp.u1(i27).c2(l10)))));
                                    }
                                    ph0Var.e(R.raw.forward, 30, 30);
                                }
                                this.H = 3000L;
                            }
                        }
                        j3 = j13;
                        i11 = 8;
                        z10 = false;
                        textView2.setVisibility(i11);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.xj, this.W);
                        linearLayout.setVisibility(i11);
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                        ph0Var.setProgress(0.0f);
                        ph0Var.d();
                        if (j3 > 0) {
                            ph0Var.postDelayed(new ap0(this, 28), j3);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) b2Var.getText());
                        sb2.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
                        org.telegram.messenger.g0.i2(sb2.toString());
                        if (!e()) {
                            int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                            if (measuredWidth == 0) {
                                measuredWidth = org.telegram.messenger.g0.q.x;
                            }
                            measureChildWithMargins(textView2, org.telegram.messenger.n10.c(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            this.r = org.telegram.messenger.g0.L(37.0f) + textView2.getMeasuredHeight();
                        } else if (c()) {
                            this.r = org.telegram.messenger.g0.L(52.0f);
                        } else if (getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                            if (measuredWidth2 <= 0) {
                                measuredWidth2 = org.telegram.messenger.g0.q.x;
                            }
                            measureChildWithMargins(b2Var, org.telegram.messenger.n10.c(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            int measuredHeight = b2Var.getMeasuredHeight();
                            int i28 = this.L;
                            int L2 = org.telegram.messenger.g0.L((i28 == 16 || i28 == 17 || i28 == 18 || i28 == 84 || i28 == 86) ? 14.0f : 28.0f) + measuredHeight;
                            this.r = L2;
                            int i29 = this.L;
                            if (i29 == 18) {
                                this.r = Math.max(L2, org.telegram.messenger.g0.L(52.0f));
                            } else if (i29 == 25) {
                                this.r = Math.max(L2, org.telegram.messenger.g0.L(50.0f));
                            } else if (z10) {
                                this.r = L2 - org.telegram.messenger.g0.L(8.0f);
                            }
                        }
                        if (getVisibility() == 0) {
                            setVisibility(0);
                            setEnterOffset((this.S ? -1.0f : 1.0f) * (this.e0 + this.r));
                            AnimatorSet animatorSet = new AnimatorSet();
                            boolean z11 = this.S;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.e0 + this.r), z11 ? 1.0f : -1.0f));
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                            return;
                        }
                        return;
                    }
                    int intValue3 = ((Integer) obj2).intValue();
                    textView2.setSingleLine(false);
                    b2Var.setText(org.telegram.messenger.gd.Y(2131753852, "AutoDeleteHintOnText", org.telegram.messenger.gd.c0(intValue3)));
                    ph0Var.e(R.raw.fire_on, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    this.H = 4000L;
                    ph0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    j3 = -1;
                    i11 = 8;
                    z10 = true;
                    textView2.setVisibility(i11);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.xj, this.W);
                    linearLayout.setVisibility(i11);
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
                    if (j3 > 0) {
                    }
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append((Object) b2Var.getText());
                    if (textView2.getVisibility() == 0) {
                    }
                    sb22.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
                    org.telegram.messenger.g0.i2(sb22.toString());
                    if (!e()) {
                    }
                    if (getVisibility() == 0) {
                    }
                }
                j3 = -1;
                i11 = 8;
                textView2.setVisibility(i11);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.xj, this.W);
                linearLayout.setVisibility(i11);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
                if (j3 > 0) {
                }
                StringBuilder sb222 = new StringBuilder();
                sb222.append((Object) b2Var.getText());
                if (textView2.getVisibility() == 0) {
                }
                sb222.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
                org.telegram.messenger.g0.i2(sb222.toString());
                if (!e()) {
                }
                if (getVisibility() == 0) {
                }
            } else if (i24 == 24 || i24 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                this.e.setVisibility(8);
                ph0Var.setVisibility(0);
                if (intValue4 != 0) {
                    b2Var.setTypeface(org.telegram.messenger.g0.o());
                    b2Var.setTextSize(1, 14.0f);
                    ph0Var.a.clear();
                    int i30 = org.telegram.ui.ActionBar.n6.yj;
                    i(i30, "BODY", false);
                    i(i30, "Wibe Big", false);
                    i(i30, "Wibe Big 3", false);
                    i(i30, "Wibe Small", false);
                    b2Var.setText(org.telegram.messenger.gd.L0(2131746421));
                    ph0Var.e(R.raw.ic_unmute, 28, 28);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(3);
                    if (user5 != null) {
                        textView2.setText(org.telegram.messenger.gd.Y(2131746419, "ProximityAlertSetInfoUser", org.telegram.messenger.o10.j(user5), org.telegram.messenger.gd.y(intValue4, 2, null)));
                    } else {
                        textView2.setText(org.telegram.messenger.gd.Y(2131746420, "ProximityAlertSetInfoGroup2", org.telegram.messenger.gd.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                } else {
                    b2Var.setTypeface(Typeface.DEFAULT);
                    b2Var.setTextSize(1, 15.0f);
                    ph0Var.a.clear();
                    int i31 = org.telegram.ui.ActionBar.n6.yj;
                    i(i31, "Body Main", false);
                    i(i31, "Body Top", false);
                    i(i31, "Line", false);
                    i(i31, "Curve Big", false);
                    i(i31, "Curve Small", false);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    b2Var.setText(org.telegram.messenger.gd.L0(2131746422));
                    ph0Var.e(R.raw.ic_mute, 28, 28);
                    textView2.setVisibility(8);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.xj, this.W);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
            } else if (i24 == 11) {
                b2Var.setText(org.telegram.messenger.gd.L0(2131753884));
                ph0Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                textView2.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.p7, this.W);
                this.e.setVisibility(8);
                linearLayout.setVisibility(0);
                ph0Var.setVisibility(0);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
            } else if (i24 == 15) {
                this.H = 10000L;
                textView.setText(org.telegram.messenger.gd.L0(2131747624));
                b2Var.setText(org.telegram.messenger.gd.L0(2131750791));
                ph0Var.e(R.raw.filter_new, 36, 36);
                int L3 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = L3;
                String L05 = org.telegram.messenger.gd.L0(2131750792);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L05);
                int indexOf2 = L05.indexOf(42);
                int lastIndexOf2 = L05.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new p41("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
                ph0Var.setVisibility(0);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
            } else if (i24 == 16 || i24 == 17) {
                this.H = 4000L;
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setMinHeight(org.telegram.messenger.g0.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131751439)));
                    ph0Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131751667)));
                    } else {
                        String k10 = p5.c.k("DiceEmojiInfo_", str3);
                        String b10 = org.telegram.messenger.gd.E0().Y.b(k10);
                        if (b10 == null) {
                            org.telegram.messenger.gd E0 = org.telegram.messenger.gd.E0();
                            E0.i();
                            b10 = E0.W.b(k10);
                        }
                        if (TextUtils.isEmpty(b10)) {
                            b2Var.setText(org.telegram.messenger.j6.l(org.telegram.messenger.gd.Y(2131751440, "DiceEmojiInfo", str3), b2Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            b2Var.setText(org.telegram.messenger.j6.l(b10, b2Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    ph0Var.setImageDrawable(org.telegram.messenger.j6.g(str3));
                    ph0Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.width = org.telegram.messenger.g0.L(26.0f);
                    layoutParams2.height = org.telegram.messenger.g0.L(26.0f);
                }
                textView.setText(org.telegram.messenger.gd.L0(2131745432));
                if (this.L == 16) {
                    L = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                    textView.setVisibility(0);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.xj, this.W);
                    this.e.setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(7.0f);
                layoutParams.height = -1;
                textView2.setVisibility(8);
                ph0Var.setVisibility(0);
            } else if (i24 == 18) {
                this.H = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setText((CharSequence) obj);
                textView.setVisibility(8);
                linearLayout.setVisibility(8);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L4 = org.telegram.messenger.g0.L(8.0f);
                layoutParams2.bottomMargin = L4;
                layoutParams2.topMargin = L4;
                ph0Var.setVisibility(0);
                ph0Var.e(R.raw.chats_infotip, 36, 36);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
                b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
            } else if (i24 == 12) {
                b2Var.setText(org.telegram.messenger.gd.L0(2131751999));
                ph0Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(48.0f);
                String L06 = org.telegram.messenger.gd.L0(2131751998);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L06);
                int indexOf3 = L06.indexOf(42);
                int lastIndexOf3 = L06.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new p41("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView2.setText(spannableStringBuilder3);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                textView.setVisibility(8);
                linearLayout.setVisibility(0);
                ph0Var.setVisibility(0);
            } else if (i24 == 84) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
                b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.L0(2131743618)));
                ph0Var.setVisibility(0);
                ph0Var.e(R.raw.voice_to_text, 36, 36);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
                textView.setText(org.telegram.messenger.gd.L0(2131746840));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                int L5 = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                q9Var.setVisibility(8);
                textView2.setVisibility(8);
                textView.setVisibility(0);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
            } else if (i24 == 85) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                b2Var.setText(org.telegram.messenger.gd.L0(2131744071));
                ph0Var.setVisibility(0);
                ph0Var.e(R.raw.hint_swipe_reply, 64, 64);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
                textView2.setVisibility(0);
                textView2.setText(org.telegram.messenger.gd.L0(2131744070));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.height = -2;
                q9Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i24 == 90 || i24 == 91 || i24 == 92 || i24 == 93 || i24 == 94) {
                switch (i24) {
                    case org.telegram.messenger.ks.b1 /* 90 */:
                        b2Var.setText(org.telegram.messenger.gd.G((int) wg.s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.ks.c1 /* 91 */:
                        b2Var.setText(org.telegram.messenger.gd.L0(2131753270));
                        break;
                    case org.telegram.messenger.ks.d1 /* 92 */:
                        b2Var.setText(org.telegram.messenger.gd.G((int) org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.ks.e1 /* 93 */:
                        b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G((int) org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).s0, "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case org.telegram.messenger.ks.f1 /* 94 */:
                        b2Var.setText(org.telegram.messenger.gd.L0(2131753331));
                        break;
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                ph0Var.setVisibility(0);
                ph0Var.e(R.raw.chats_infotip, 36, 36);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
            } else {
                if (i24 == 2) {
                    i12 = 2;
                } else if (i24 == 4) {
                    i12 = 2;
                } else if (i7 == 82) {
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    b2Var.setText(org.telegram.messenger.gd.L0(efVar.b ? 2131753952 : 2131753957));
                    linearLayout.setVisibility(0);
                    b2Var.setTextSize(1, 15.0f);
                    b2Var.setTypeface(Typeface.DEFAULT);
                    textView2.setVisibility(8);
                    q9Var.setVisibility(0);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                    String str4 = efVar.c;
                    if (str4 != null) {
                        q9Var.h(str4, null, org.telegram.ui.ActionBar.n6.R4);
                    } else if (efVar.I != null) {
                        q9Var.s(efVar.J, efVar.K, true);
                        if (efVar.b) {
                            q9Var.h("vthumb://" + efVar.C + ":" + efVar.I, null, org.telegram.ui.ActionBar.n6.R4);
                        } else {
                            q9Var.h("thumb://" + efVar.C + ":" + efVar.I, null, org.telegram.ui.ActionBar.n6.R4);
                        }
                    } else {
                        q9Var.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
                    }
                } else {
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(45.0f);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                    layoutParams.rightMargin = 0;
                    b2Var.setTextSize(1, 15.0f);
                    linearLayout.setVisibility(0);
                    Typeface typeface = Typeface.DEFAULT;
                    b2Var.setTypeface(typeface);
                    textView2.setVisibility(8);
                    ph0Var.setVisibility(8);
                    int i32 = this.L;
                    if (i32 == 88) {
                        String str5 = (String) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (intValue5 > 0) {
                            int L6 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                            layoutParams.leftMargin = org.telegram.messenger.g0.L(48.0f);
                            layoutParams.rightMargin = L6;
                            layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                            layoutParams3.leftMargin = org.telegram.messenger.g0.L(48.0f);
                            layoutParams3.rightMargin = L6;
                            b2Var.setText(org.telegram.messenger.gd.Y(2131750647, "FolderLinkDeletedTitle", str5));
                            b2Var.setTypeface(org.telegram.messenger.g0.o());
                            textView2.setVisibility(0);
                            textView2.setText(org.telegram.messenger.gd.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                        } else {
                            b2Var.setTypeface(typeface);
                            if (str5 == null) {
                                str5 = "";
                            }
                            b2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.Y(2131750651, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                        }
                    } else if (i32 == 81 || i32 == 0 || i32 == 26) {
                        b2Var.setText(org.telegram.messenger.gd.L0(2131749101));
                    } else if (i32 == 27) {
                        b2Var.setText(org.telegram.messenger.gd.L0(2131752169));
                    } else if (i32 == 95) {
                        if (org.telegram.messenger.n5.z(longValue)) {
                            TLRPC.Chat O04 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-longValue));
                            if (org.telegram.messenger.v3.p0(O04)) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131748157));
                            } else if (!org.telegram.messenger.v3.T(O04) || O04.megagroup) {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131749238));
                            } else {
                                b2Var.setText(org.telegram.messenger.gd.L0(2131752377));
                            }
                        } else {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131752231));
                        }
                    } else if (org.telegram.messenger.n5.z(longValue)) {
                        TLRPC.Chat O05 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-longValue));
                        if (org.telegram.messenger.v3.p0(O05)) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131748157));
                        } else if (!org.telegram.messenger.v3.T(O05) || O05.megagroup) {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131749257));
                        } else {
                            b2Var.setText(org.telegram.messenger.gd.L0(2131752406));
                        }
                    } else {
                        b2Var.setText(org.telegram.messenger.gd.L0(2131752231));
                    }
                    if (this.L != 81) {
                        for (int i33 = 0; i33 < arrayList.size(); i33++) {
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
                            long longValue2 = ((Long) arrayList.get(i33)).longValue();
                            int i34 = this.L;
                            u12.c(longValue2, i34 == 0 || i34 == 26);
                        }
                    }
                }
                if (i7 == i12) {
                    b2Var.setText(org.telegram.messenger.gd.L0(2131752235));
                } else {
                    b2Var.setText(org.telegram.messenger.gd.L0(2131752170));
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = 0;
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                ph0Var.setVisibility(0);
                ph0Var.e(R.raw.chats_archived, 36, 36);
                ph0Var.setProgress(0.0f);
                ph0Var.d();
            }
        }
        z10 = false;
        StringBuilder sb2222 = new StringBuilder();
        sb2222.append((Object) b2Var.getText());
        if (textView2.getVisibility() == 0) {
        }
        sb2222.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
        org.telegram.messenger.g0.i2(sb2222.toString());
        if (!e()) {
        }
        if (getVisibility() == 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = this.Q;
        ShapeDrawable shapeDrawable = this.V;
        if (f10 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.i0) + this.e0 + org.telegram.messenger.g0.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i7 = this.L;
        if (i7 == 1 || i7 == 95 || i7 == 0 || i7 == 27 || i7 == 26 || i7 == 81 || i7 == 88) {
            int ceil = this.H > 0 ? (int) Math.ceil(r10 / 1000.0f) : 0;
            int i10 = this.I;
            TextPaint textPaint = this.E;
            if (i10 != ceil) {
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
            float f11 = this.h0;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.h0 = f12;
                if (f12 > 1.0f) {
                    this.h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.g0;
            RectF rectF = this.G;
            if (staticLayout2 != null) {
                float f13 = this.h0;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.K / 2), (org.telegram.messenger.g0.L(10.0f) * this.h0) + org.telegram.messenger.g0.L(17.2f));
                    this.g0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f0 != null) {
                float f14 = this.h0;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.K / 2), com.google.android.gms.internal.vision.e2.t(1.0f, this.h0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(17.2f)));
                this.f0.draw(canvas);
                if (this.h0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.H / 5000.0f) * (-360.0f), false, this.F);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.H - (elapsedRealtime - this.P);
        this.H = j3;
        this.P = elapsedRealtime;
        if (j3 <= 0) {
            d(this.U, true);
        }
        if (this.L != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.V.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            setTranslationY(((this.i0 - this.e0) + org.telegram.messenger.g0.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.i0 != f10) {
            this.i0 = f10;
            setTranslationY(((f10 - this.e0) + org.telegram.messenger.g0.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i7) {
        this.e0 = i7;
    }

    public void setHideAnimationType(int i7) {
        this.U = i7;
    }

    public void setInfoText(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var;
        ArrayList arrayList = this.b0;
        try {
            if (this.a0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int size = arrayList.size();
                i6Var = this.W;
                if (i7 >= size) {
                    break;
                }
                int w02 = org.telegram.ui.ActionBar.n6.w0(((Integer) this.c0.get(i7)).intValue(), i6Var);
                ph0 ph0Var = this.f;
                String str = (String) arrayList.get(i7);
                if (((Boolean) this.d0.get(i7)).booleanValue()) {
                    w02 |= -16777216;
                }
                ph0Var.h(w02, str);
                i7++;
            }
            Paint paint = this.F;
            int i10 = org.telegram.ui.ActionBar.n6.yj;
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            this.E.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, i6Var), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                org.telegram.ui.ActionBar.n6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var) & 587202559, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, org.telegram.ui.x71 x71Var) {
        this(context, x71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = 0;
        this.y = org.telegram.messenger.j10.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = org.telegram.messenger.g0.L(8.0f);
        this.h0 = 1.0f;
        this.W = i6Var;
        this.s = h2Var;
        this.S = z10;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, i6Var);
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        org.telegram.ui.ActionBar.u6.U(b2Var, i7, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        org.telegram.ui.ActionBar.u6.G(b2Var, i10, i6Var);
        b2Var.setMovementMethod(new u41(this));
        addView(b2Var, c8.ma.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(textView, i10, i6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, c8.ma.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ph0 ph0Var = new ph0(context);
        this.f = ph0Var;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.n6.wj;
        i(i11, "info1", true);
        i(i11, "info2", true);
        i(i7, "luc12", false);
        i(i7, "luc11", false);
        i(i7, "luc10", false);
        i(i7, "luc9", false);
        i(i7, "luc8", false);
        i(i7, "luc7", false);
        i(i7, "luc6", false);
        i(i7, "luc5", false);
        i(i7, "luc4", false);
        i(i7, "luc3", false);
        i(i7, "luc2", false);
        i(i7, "luc1", false);
        i(i7, "Oval", false);
        addView(ph0Var, c8.ma.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.h = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(q9Var, c8.ma.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new t41(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ma.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        i5.c.x(textView2, 1, 14.0f);
        org.telegram.messenger.n10.r(textView2, i10, i6Var, null, 2131743648);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        setWillNotDraw(false);
        this.V = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        setOnTouchListener(new gi.a(27));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i7, long j3) {
    }
}
