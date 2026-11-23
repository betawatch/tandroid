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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
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
    public final org.telegram.ui.ActionBar.h6 W;
    public int a;
    public boolean a0;
    public final org.telegram.ui.Cells.c2 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public final ArrayList d0;
    public final ImageView e;
    public int e0;
    public final rh0 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final q9 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.g2 s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wj));
    }

    public final boolean c() {
        int i7;
        Object obj;
        int i10 = this.L;
        if (i10 == 11 || i10 == 24 || i10 == 6 || i10 == 3 || i10 == 5 || i10 == 13 || i10 == 14 || i10 == 74) {
            return true;
        }
        if ((i10 == 7 && org.telegram.messenger.np.u1(this.y).Q0.isEmpty()) || (i7 = this.L) == 83 || i7 == 85) {
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
                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.y);
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
                            u12.getNotificationCenter().k(org.telegram.messenger.ls.s, Boolean.TRUE);
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
            animatorSet.addListener(new t11(this, i13));
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
        org.telegram.ui.ActionBar.m6.C1(-115203550, this.V);
        org.telegram.ui.Cells.c2 c2Var = this.b;
        org.telegram.ui.ActionBar.t6.q(c2Var);
        int i11 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.h6 h6Var = this.W;
        org.telegram.ui.ActionBar.t6.G(c2Var, i11, h6Var);
        TextView textView = this.c;
        org.telegram.ui.ActionBar.t6.q(textView);
        org.telegram.ui.ActionBar.t6.G(textView, i11, h6Var);
        c2Var.setTextColor(-1);
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
        rh0 rh0Var = this.f;
        rh0Var.h(-14540254, "info1");
        rh0Var.h(-14540254, "info2");
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
        org.telegram.ui.ActionBar.h6 h6Var = this.W;
        this.f.h(z10 ? org.telegram.ui.ActionBar.m6.w0(i7, h6Var) | (-16777216) : org.telegram.ui.ActionBar.m6.w0(i7, h6Var), str);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x177c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x1798  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x17ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x18a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x17f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x08f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        org.telegram.ui.Cells.c2 c2Var;
        int i10;
        ImageView imageView;
        TextView textView;
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.h6 h6Var;
        long j3;
        int i12;
        int L;
        int i13;
        CharSequence W2;
        int i14;
        CharSequence charSequence;
        SpannableStringBuilder V2;
        SpannableStringBuilder V22;
        String M0;
        String M02;
        int i15;
        int i16;
        String str;
        int i17;
        int i18;
        int i19;
        if (!org.telegram.messenger.g0.G3() && ((i19 = this.L) == 52 || i19 == 56 || i19 == 57 || i19 == 58 || i19 == 59 || i19 == 60 || i19 == 80 || i19 == 33)) {
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
        Long l10 = (Long) arrayList.get(0);
        long longValue = l10.longValue();
        this.L = i7;
        this.H = 5000L;
        this.w = obj;
        this.x = obj2;
        this.P = SystemClock.elapsedRealtime();
        String M03 = org.telegram.messenger.hd.M0(2131743640);
        TextView textView2 = this.d;
        textView2.setText(M03);
        ImageView imageView2 = this.e;
        imageView2.setVisibility(0);
        rh0 rh0Var = this.f;
        rh0Var.setPadding(0, 0, 0, 0);
        rh0Var.setScaleX(1.0f);
        rh0Var.setScaleY(1.0f);
        org.telegram.ui.Cells.c2 c2Var2 = this.b;
        c2Var2.setTextSize(1, 15.0f);
        q9 q9Var = this.h;
        q9Var.setVisibility(8);
        c2Var2.setGravity(51);
        TextView textView3 = this.c;
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
        layoutParams.bottomMargin = 0;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rh0Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(3.0f);
        layoutParams2.width = org.telegram.messenger.g0.L(54.0f);
        layoutParams2.height = -2;
        c2Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i7 == 83) {
            setOnClickListener(new w41(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new gi.a(28));
            movementMethod = null;
        }
        c2Var2.setMovementMethod(movementMethod);
        boolean f10 = f();
        int i20 = R.raw.voip_invite;
        LinearLayout linearLayout = this.n;
        int i21 = this.y;
        if (f10) {
            if (i7 == 83) {
                textView3.setSingleLine(false);
                W2 = org.telegram.messenger.hd.M0(2131745086);
                charSequence = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.M0(2131745085), runnable);
                this.N = null;
                this.H = 4000L;
                i13 = R.raw.sound_download;
            } else if (i7 == 74) {
                textView3.setSingleLine(false);
                W2 = org.telegram.messenger.hd.M0(2131746026);
                String Y = org.telegram.messenger.hd.Y(2131746011, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i13 = R.raw.ic_admin;
                charSequence = Y;
            } else {
                if (i7 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder W22 = org.telegram.messenger.v3.W((TLRPC.Chat) obj2) ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743234, "VoipChannelInvitedUser", org.telegram.messenger.p10.j(user))) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743126, "VoipGroupInvitedUser", org.telegram.messenger.p10.j(user)));
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
                        W2 = org.telegram.messenger.v3.W(chat) ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Z(2131743205, org.telegram.messenger.p10.j(user2))) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Z(2131743182, org.telegram.messenger.p10.j(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        W2 = org.telegram.messenger.v3.W(chat) ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Z(2131743242, chat2.title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Z(2131743199, chat2.title));
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
                        str = org.telegram.messenger.i5.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        b9Var3.q(chat3);
                        q9Var.f(chat3, b9Var3);
                        str = chat3.title;
                    }
                    if (org.telegram.messenger.v3.W((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743206, "VoipChannelUserChanged", str));
                    } else {
                        i17 = 0;
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743067, "VoipGroupUserChanged", str));
                    }
                    q9Var.setVisibility(i17);
                    this.H = 3000L;
                } else {
                    if (i7 == 33) {
                        W2 = org.telegram.messenger.hd.M0(2131743144);
                        this.H = 3000L;
                        i13 = R.raw.voip_invite;
                        c2Var = c2Var2;
                    } else {
                        if (i7 == 77) {
                            W2 = (CharSequence) obj;
                            this.H = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                c2Var = c2Var2;
                            } else {
                                setOnTouchListener(null);
                                c2Var = c2Var2;
                                c2Var.setMovementMethod(null);
                                setOnClickListener(new q31(1, this, (TLRPC.Message) obj2));
                            }
                            i14 = R.raw.payment_success;
                        } else {
                            c2Var = c2Var2;
                            i13 = R.raw.voip_muted;
                            if (i7 == 30) {
                                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743069, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.p10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i7 == 35) {
                                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743068, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.p10.j((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.H = 3000L;
                            } else {
                                if (i7 == 31) {
                                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743071, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.p10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i7 == 38) {
                                    W2 = obj instanceof TLRPC.Chat ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743059, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131743060));
                                    this.H = 3000L;
                                    i14 = R.raw.voip_allow_talk;
                                } else {
                                    if (i7 == 42) {
                                        W2 = org.telegram.messenger.v3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131743215)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131743090));
                                        this.H = 3000L;
                                        charSequence = null;
                                        i13 = R.raw.ic_mute;
                                    } else if (i7 == 43) {
                                        W2 = org.telegram.messenger.v3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131743214)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131743089));
                                        this.H = 3000L;
                                        i14 = R.raw.ic_unmute;
                                    } else {
                                        int i22 = this.L;
                                        if (i22 == 39 || i22 == 100) {
                                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(i22 == 39 ? 2131743152 : 2131743063));
                                            this.H = 3000L;
                                            i14 = R.raw.voip_record_start;
                                        } else if (i22 == 40 || i22 == 101) {
                                            String M04 = org.telegram.messenger.hd.M0(i22 == 40 ? 2131743153 : 2131743064);
                                            this.H = 4000L;
                                            c2Var.setMovementMethod(new org.telegram.messenger.c0(0));
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M04);
                                            int indexOf = M04.indexOf("**");
                                            int lastIndexOf = M04.lastIndexOf("**");
                                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new s41("tg://openmessage?user_id=" + org.telegram.messenger.k10.i(i21).e()), indexOf, lastIndexOf - 2, 33);
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.f(e10);
                                                }
                                            }
                                            i13 = R.raw.voip_record_saved;
                                            W2 = spannableStringBuilder;
                                        } else if (i7 == 36) {
                                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131743070, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.p10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            this.H = 3000L;
                                        } else if (i7 == 32 || i7 == 102) {
                                            String j10 = obj instanceof TLRPC.User ? org.telegram.messenger.p10.j((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                            W2 = i7 == 102 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Z(2131743179, j10)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Z(2131743099, j10));
                                            this.H = 3000L;
                                            i14 = R.raw.ic_ban;
                                        } else {
                                            if (i7 == 9 || i7 == 10) {
                                                TLRPC.User user4 = (TLRPC.User) obj;
                                                W2 = i7 == 9 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131751283, "EditAdminTransferChannelToast", org.telegram.messenger.p10.j(user4))) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131751282, "EditAdminTransferGroupToast", org.telegram.messenger.p10.j(user4)));
                                            } else if (i7 == 8) {
                                                W2 = org.telegram.messenger.hd.Y(2131747640, "NowInContacts", org.telegram.messenger.p10.j((TLRPC.User) obj));
                                            } else if (i7 == 87) {
                                                W2 = org.telegram.messenger.hd.Z(2131746414, new Object[0]);
                                            } else if (i7 == 22) {
                                                if (org.telegram.messenger.n5.E(longValue)) {
                                                    W2 = obj == null ? org.telegram.messenger.hd.M0(2131748517) : org.telegram.messenger.hd.M0(2131748516);
                                                } else {
                                                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(-longValue));
                                                    W2 = (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? obj == null ? org.telegram.messenger.hd.M0(2131748519) : org.telegram.messenger.hd.M0(2131748518) : obj == null ? org.telegram.messenger.hd.M0(2131748521) : org.telegram.messenger.hd.M0(2131748520);
                                                }
                                            } else if (i7 == 23) {
                                                W2 = org.telegram.messenger.hd.M0(2131752183);
                                            } else {
                                                if (i7 == 6) {
                                                    W2 = org.telegram.messenger.hd.M0(2131754166);
                                                    String M05 = org.telegram.messenger.hd.M0(2131754165);
                                                    i13 = R.raw.chats_swipearchive;
                                                    charSequence = M05;
                                                    i16 = 48;
                                                } else {
                                                    if (i22 == 13) {
                                                        W2 = org.telegram.messenger.hd.M0(2131746248);
                                                        M02 = org.telegram.messenger.hd.M0(2131746247);
                                                        i15 = R.raw.wallet_congrats;
                                                    } else if (i22 == 14) {
                                                        W2 = org.telegram.messenger.hd.M0(2131746246);
                                                        M02 = org.telegram.messenger.hd.M0(2131746245);
                                                        i15 = R.raw.wallet_science;
                                                    } else if (i7 == 7) {
                                                        W2 = org.telegram.messenger.hd.M0(2131754149);
                                                        if (org.telegram.messenger.np.u1(i21).Q0.isEmpty()) {
                                                            M0 = org.telegram.messenger.hd.M0(2131754148);
                                                            charSequence = M0;
                                                            i13 = R.raw.chats_infotip;
                                                        }
                                                        M0 = null;
                                                        charSequence = M0;
                                                        i13 = R.raw.chats_infotip;
                                                    } else if (i7 == 20 || i7 == 21) {
                                                        org.telegram.messenger.so soVar = (org.telegram.messenger.so) obj2;
                                                        Spannable z52 = org.telegram.messenger.gj.z5(c2Var.getPaint().getFontMetricsInt(), org.telegram.messenger.j6.l(soVar.b, c2Var.getPaint().getFontMetricsInt(), false), soVar.c);
                                                        this.a = soVar.n ? 26 : 0;
                                                        if (longValue != 0) {
                                                            if (org.telegram.messenger.n5.C(longValue)) {
                                                                longValue = org.telegram.messenger.np.u1(i21).c1(Integer.valueOf(org.telegram.messenger.n5.h(longValue))).user_id;
                                                            }
                                                            if (org.telegram.messenger.n5.E(longValue)) {
                                                                TLRPC.User c22 = org.telegram.messenger.np.u1(i21).c2(Long.valueOf(longValue));
                                                                String j11 = org.telegram.messenger.p10.j(c22);
                                                                if (org.telegram.messenger.p10.C(c22)) {
                                                                    j11 = org.telegram.messenger.hd.M0(2131745705);
                                                                } else if (org.telegram.messenger.p10.A(c22)) {
                                                                    j11 = org.telegram.messenger.hd.M0(2131746070);
                                                                }
                                                                V22 = i7 == 20 ? org.telegram.messenger.g0.V2(org.telegram.messenger.hd.U(2131750681, j11, z52)) : org.telegram.messenger.g0.V2(org.telegram.messenger.hd.U(2131750680, j11, z52));
                                                            } else {
                                                                TLRPC.Chat O02 = org.telegram.messenger.np.u1(i21).O0(Long.valueOf(-longValue));
                                                                V22 = i7 == 20 ? org.telegram.messenger.g0.V2(org.telegram.messenger.hd.U(2131750787, O02.title, z52)) : org.telegram.messenger.g0.V2(org.telegram.messenger.hd.U(2131750786, O02.title, z52));
                                                            }
                                                            V2 = V22;
                                                        } else {
                                                            V2 = i7 == 20 ? org.telegram.messenger.g0.V2(org.telegram.messenger.hd.U(2131750783, org.telegram.messenger.hd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52)) : org.telegram.messenger.g0.V2(org.telegram.messenger.hd.U(2131750782, org.telegram.messenger.hd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52));
                                                        }
                                                        i13 = i7 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        W2 = V2;
                                                    } else if (i7 == 19) {
                                                        W2 = this.T;
                                                        i14 = R.raw.ic_delete;
                                                    } else if (i7 == 82) {
                                                        W2 = org.telegram.messenger.hd.M0(((org.telegram.messenger.ff) obj).b ? 2131753951 : 2131753956);
                                                        charSequence = null;
                                                        i13 = 0;
                                                    } else if (i7 == 78 || i7 == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        W2 = i7 == 78 ? org.telegram.messenger.hd.G(intValue, "PinnedDialogsCount", new Object[0]) : org.telegram.messenger.hd.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i14 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.H = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        W2 = i7 == 3 ? org.telegram.messenger.hd.M0(2131752234) : org.telegram.messenger.hd.M0(2131752169);
                                                        if (org.telegram.messenger.np.u1(i21).Q0.isEmpty()) {
                                                            M0 = org.telegram.messenger.hd.M0(2131752233);
                                                            charSequence = M0;
                                                            i13 = R.raw.chats_infotip;
                                                        }
                                                        M0 = null;
                                                        charSequence = M0;
                                                        i13 = R.raw.chats_infotip;
                                                    }
                                                    i13 = i15;
                                                    charSequence = M02;
                                                    i16 = 44;
                                                }
                                                c2Var.setText(W2);
                                                if (i13 == 0) {
                                                    rh0Var.e(i13, i16, i16);
                                                    oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
                                                    animatedDrawable.h = false;
                                                    animatedDrawable.P(animatedDrawable.s());
                                                    rh0Var.setVisibility(0);
                                                    rh0Var.setProgress(0.0f);
                                                    rh0Var.d();
                                                } else {
                                                    rh0Var.setVisibility(8);
                                                }
                                                if (charSequence == null) {
                                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                                                    layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                                                    ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(8.0f);
                                                    textView3.setText(charSequence);
                                                    textView3.setVisibility(0);
                                                    c2Var.setTextSize(1, 14.0f);
                                                    c2Var.setTypeface(org.telegram.messenger.g0.o());
                                                    i18 = 8;
                                                } else {
                                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                                                    layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                                                    i18 = 8;
                                                    textView3.setVisibility(8);
                                                    c2Var.setTextSize(1, 15.0f);
                                                    c2Var.setTypeface(Typeface.DEFAULT);
                                                }
                                                linearLayout.setVisibility(i18);
                                            }
                                            charSequence = null;
                                            i13 = R.raw.contact_check;
                                        }
                                    }
                                    i16 = 36;
                                    c2Var.setText(W2);
                                    if (i13 == 0) {
                                    }
                                    if (charSequence == null) {
                                    }
                                    linearLayout.setVisibility(i18);
                                }
                                charSequence = null;
                                i13 = R.raw.voip_unmuted;
                                i16 = 36;
                                c2Var.setText(W2);
                                if (i13 == 0) {
                                }
                                if (charSequence == null) {
                                }
                                linearLayout.setVisibility(i18);
                            }
                        }
                        i13 = i14;
                    }
                    charSequence = null;
                    i16 = 36;
                    c2Var.setText(W2);
                    if (i13 == 0) {
                    }
                    if (charSequence == null) {
                    }
                    linearLayout.setVisibility(i18);
                }
                c2Var = c2Var2;
                charSequence = null;
                i13 = 0;
                i16 = 36;
                c2Var.setText(W2);
                if (i13 == 0) {
                }
                if (charSequence == null) {
                }
                linearLayout.setVisibility(i18);
            }
            c2Var = c2Var2;
            i16 = 36;
            c2Var.setText(W2);
            if (i13 == 0) {
            }
            if (charSequence == null) {
            }
            linearLayout.setVisibility(i18);
        } else {
            c2Var = c2Var2;
            int i23 = this.L;
            org.telegram.ui.ActionBar.h6 h6Var2 = this.W;
            if (i23 == 45 || i23 == 46 || i23 == 47 || i23 == 52 || i23 == 53 || i23 == 54 || i23 == 55 || i23 == 56 || i23 == 57 || i23 == 58 || i23 == 59 || i23 == 60 || i23 == 71 || i23 == 70 || i23 == 75 || i23 == 76 || i23 == 41 || i23 == 78 || i23 == 79 || i23 == 61) {
                i10 = i21;
                imageView = imageView2;
                textView = textView2;
                i11 = 8;
            } else if (i23 == 80) {
                i10 = i21;
                imageView = imageView2;
                textView = textView2;
                i11 = 8;
            } else if (i23 == 24 || i23 == 25) {
                int intValue2 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                imageView2.setVisibility(8);
                rh0Var.setVisibility(0);
                if (intValue2 != 0) {
                    c2Var.setTypeface(org.telegram.messenger.g0.o());
                    c2Var.setTextSize(1, 14.0f);
                    rh0Var.a.clear();
                    int i24 = org.telegram.ui.ActionBar.m6.yj;
                    i(i24, "BODY", false);
                    i(i24, "Wibe Big", false);
                    i(i24, "Wibe Big 3", false);
                    i(i24, "Wibe Small", false);
                    c2Var.setText(org.telegram.messenger.hd.M0(2131746420));
                    rh0Var.e(R.raw.ic_unmute, 28, 28);
                    textView3.setVisibility(0);
                    textView3.setSingleLine(false);
                    textView3.setMaxLines(3);
                    if (user5 != null) {
                        textView3.setText(org.telegram.messenger.hd.Y(2131746418, "ProximityAlertSetInfoUser", org.telegram.messenger.p10.j(user5), org.telegram.messenger.hd.y(intValue2, 2, null)));
                    } else {
                        textView3.setText(org.telegram.messenger.hd.Y(2131746419, "ProximityAlertSetInfoGroup2", org.telegram.messenger.hd.y(intValue2, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                } else {
                    c2Var.setTypeface(Typeface.DEFAULT);
                    c2Var.setTextSize(1, 15.0f);
                    rh0Var.a.clear();
                    int i25 = org.telegram.ui.ActionBar.m6.yj;
                    i(i25, "Body Main", false);
                    i(i25, "Body Top", false);
                    i(i25, "Line", false);
                    i(i25, "Curve Big", false);
                    i(i25, "Curve Small", false);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    c2Var.setText(org.telegram.messenger.hd.M0(2131746421));
                    rh0Var.e(R.raw.ic_mute, 28, 28);
                    textView3.setVisibility(8);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.xj, h6Var2);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
            } else if (i23 == 11) {
                c2Var.setText(org.telegram.messenger.hd.M0(2131753883));
                rh0Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                textView3.setVisibility(0);
                c2Var.setTextSize(1, 14.0f);
                c2Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.p7, h6Var2);
                imageView2.setVisibility(8);
                linearLayout.setVisibility(0);
                rh0Var.setVisibility(0);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
            } else if (i23 == 15) {
                this.H = 10000L;
                textView2.setText(org.telegram.messenger.hd.M0(2131747623));
                c2Var.setText(org.telegram.messenger.hd.M0(2131750790));
                rh0Var.e(R.raw.filter_new, 36, 36);
                int L2 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L2;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = L2;
                String M06 = org.telegram.messenger.hd.M0(2131750791);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M06);
                int indexOf2 = M06.indexOf(42);
                int lastIndexOf2 = M06.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new s41("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView3.setText(spannableStringBuilder2);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                linearLayout.setVisibility(0);
                imageView2.setVisibility(8);
                rh0Var.setVisibility(0);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
            } else if (i23 == 16 || i23 == 17) {
                this.H = 4000L;
                c2Var.setTextSize(1, 14.0f);
                c2Var.setGravity(16);
                c2Var.setMinHeight(org.telegram.messenger.g0.L(30.0f));
                String str2 = (String) obj;
                if ("🎲".equals(str2)) {
                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131751438)));
                    rh0Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str2)) {
                        c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131751666)));
                    } else {
                        String L0 = org.telegram.messenger.hd.L0("DiceEmojiInfo_" + str2);
                        if (TextUtils.isEmpty(L0)) {
                            c2Var.setText(org.telegram.messenger.j6.l(org.telegram.messenger.hd.Y(2131751439, "DiceEmojiInfo", str2), c2Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            c2Var.setText(org.telegram.messenger.j6.l(L0, c2Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    rh0Var.setImageDrawable(org.telegram.messenger.j6.g(str2));
                    rh0Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.width = org.telegram.messenger.g0.L(26.0f);
                    layoutParams2.height = org.telegram.messenger.g0.L(26.0f);
                }
                textView2.setText(org.telegram.messenger.hd.M0(2131745431));
                if (this.L == 16) {
                    L = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.xj, h6Var2);
                    imageView2.setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                    textView2.setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(7.0f);
                layoutParams.height = -1;
                textView3.setVisibility(8);
                rh0Var.setVisibility(0);
            } else if (i23 == 18) {
                this.H = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                c2Var.setTextSize(1, 14.0f);
                c2Var.setGravity(16);
                c2Var.setText((CharSequence) obj);
                textView2.setVisibility(8);
                linearLayout.setVisibility(8);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L3 = org.telegram.messenger.g0.L(8.0f);
                layoutParams2.bottomMargin = L3;
                layoutParams2.topMargin = L3;
                rh0Var.setVisibility(0);
                rh0Var.e(R.raw.chats_infotip, 36, 36);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
                c2Var.setMovementMethod(new org.telegram.messenger.c0(0));
            } else if (i23 == 12) {
                c2Var.setText(org.telegram.messenger.hd.M0(2131751998));
                rh0Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(48.0f);
                String M07 = org.telegram.messenger.hd.M0(2131751997);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(M07);
                int indexOf3 = M07.indexOf(42);
                int lastIndexOf3 = M07.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new s41("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView3.setText(spannableStringBuilder3);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                textView2.setVisibility(8);
                linearLayout.setVisibility(0);
                rh0Var.setVisibility(0);
            } else if (i23 == 84) {
                c2Var.setVisibility(0);
                c2Var.setTextSize(1, 15.0f);
                c2Var.setTypeface(Typeface.DEFAULT);
                c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131743610)));
                rh0Var.setVisibility(0);
                rh0Var.e(R.raw.voice_to_text, 36, 36);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
                textView2.setText(org.telegram.messenger.hd.M0(2131746839));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                int L4 = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = L4;
                layoutParams.topMargin = L4;
                layoutParams.height = -2;
                q9Var.setVisibility(8);
                textView3.setVisibility(8);
                textView2.setVisibility(0);
                linearLayout.setVisibility(0);
                imageView2.setVisibility(8);
            } else if (i23 == 85) {
                c2Var.setVisibility(0);
                c2Var.setTextSize(1, 15.0f);
                c2Var.setTypeface(org.telegram.messenger.g0.o());
                c2Var.setText(org.telegram.messenger.hd.M0(2131744063));
                rh0Var.setVisibility(0);
                rh0Var.e(R.raw.hint_swipe_reply, 64, 64);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
                textView3.setVisibility(0);
                textView3.setText(org.telegram.messenger.hd.M0(2131744062));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.height = -2;
                q9Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i23 == 90 || i23 == 91 || i23 == 92 || i23 == 93 || i23 == 94) {
                switch (i23) {
                    case org.telegram.messenger.ls.b1 /* 90 */:
                        c2Var.setText(org.telegram.messenger.hd.G((int) wg.s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.ls.c1 /* 91 */:
                        c2Var.setText(org.telegram.messenger.hd.M0(2131753269));
                        break;
                    case org.telegram.messenger.ls.d1 /* 92 */:
                        c2Var.setText(org.telegram.messenger.hd.G((int) org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.ls.e1 /* 93 */:
                        c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G((int) org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).s0, "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case org.telegram.messenger.ls.f1 /* 94 */:
                        c2Var.setText(org.telegram.messenger.hd.M0(2131753330));
                        break;
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                c2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                c2Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                rh0Var.setVisibility(0);
                rh0Var.e(R.raw.chats_infotip, 36, 36);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
            } else {
                int i26 = 2;
                if (i23 != 2) {
                    if (i23 == 4) {
                        i26 = 2;
                    } else if (i7 == 82) {
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                        c2Var.setText(org.telegram.messenger.hd.M0(ffVar.b ? 2131753951 : 2131753956));
                        linearLayout.setVisibility(0);
                        c2Var.setTextSize(1, 15.0f);
                        c2Var.setTypeface(Typeface.DEFAULT);
                        textView3.setVisibility(8);
                        q9Var.setVisibility(0);
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                        String str3 = ffVar.c;
                        if (str3 != null) {
                            q9Var.h(str3, null, org.telegram.ui.ActionBar.m6.R4);
                        } else if (ffVar.I != null) {
                            q9Var.s(ffVar.J, ffVar.K, true);
                            if (ffVar.b) {
                                q9Var.h("vthumb://" + ffVar.C + ":" + ffVar.I, null, org.telegram.ui.ActionBar.m6.R4);
                            } else {
                                q9Var.h("thumb://" + ffVar.C + ":" + ffVar.I, null, org.telegram.ui.ActionBar.m6.R4);
                            }
                        } else {
                            q9Var.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
                        }
                    } else {
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(45.0f);
                        layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                        layoutParams.rightMargin = 0;
                        c2Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        c2Var.setTypeface(typeface);
                        textView3.setVisibility(8);
                        rh0Var.setVisibility(8);
                        int i27 = this.L;
                        if (i27 == 88) {
                            String str4 = (String) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if (intValue3 > 0) {
                                int L5 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                layoutParams.leftMargin = org.telegram.messenger.g0.L(48.0f);
                                layoutParams.rightMargin = L5;
                                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                layoutParams3.leftMargin = org.telegram.messenger.g0.L(48.0f);
                                layoutParams3.rightMargin = L5;
                                c2Var.setText(org.telegram.messenger.hd.Y(2131750646, "FolderLinkDeletedTitle", str4));
                                c2Var.setTypeface(org.telegram.messenger.g0.o());
                                textView3.setVisibility(0);
                                textView3.setText(org.telegram.messenger.hd.G(intValue3, "FolderLinkDeletedSubtitle", new Object[0]));
                            } else {
                                c2Var.setTypeface(typeface);
                                if (str4 == null) {
                                    str4 = "";
                                }
                                c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131750650, "FolderLinkDeleted", str4.replace('*', (char) 10033))));
                            }
                        } else if (i27 == 81 || i27 == 0 || i27 == 26) {
                            c2Var.setText(org.telegram.messenger.hd.M0(2131749100));
                        } else if (i27 == 27) {
                            c2Var.setText(org.telegram.messenger.hd.M0(2131752168));
                        } else if (i27 == 95) {
                            if (org.telegram.messenger.n5.z(longValue)) {
                                TLRPC.Chat O03 = org.telegram.messenger.np.u1(i21).O0(Long.valueOf(-longValue));
                                if (org.telegram.messenger.v3.p0(O03)) {
                                    c2Var.setText(org.telegram.messenger.hd.M0(2131748156));
                                } else if (!org.telegram.messenger.v3.T(O03) || O03.megagroup) {
                                    c2Var.setText(org.telegram.messenger.hd.M0(2131749237));
                                } else {
                                    c2Var.setText(org.telegram.messenger.hd.M0(2131752376));
                                }
                            } else {
                                c2Var.setText(org.telegram.messenger.hd.M0(2131752230));
                            }
                        } else if (org.telegram.messenger.n5.z(longValue)) {
                            TLRPC.Chat O04 = org.telegram.messenger.np.u1(i21).O0(Long.valueOf(-longValue));
                            if (org.telegram.messenger.v3.p0(O04)) {
                                c2Var.setText(org.telegram.messenger.hd.M0(2131748156));
                            } else if (!org.telegram.messenger.v3.T(O04) || O04.megagroup) {
                                c2Var.setText(org.telegram.messenger.hd.M0(2131749256));
                            } else {
                                c2Var.setText(org.telegram.messenger.hd.M0(2131752405));
                            }
                        } else {
                            c2Var.setText(org.telegram.messenger.hd.M0(2131752230));
                        }
                        if (this.L != 81) {
                            for (int i28 = 0; i28 < arrayList.size(); i28++) {
                                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i21);
                                long longValue2 = ((Long) arrayList.get(i28)).longValue();
                                int i29 = this.L;
                                u12.c(longValue2, i29 == 0 || i29 == 26);
                            }
                        }
                    }
                }
                if (i7 == i26) {
                    c2Var.setText(org.telegram.messenger.hd.M0(2131752234));
                } else {
                    c2Var.setText(org.telegram.messenger.hd.M0(2131752169));
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = 0;
                c2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                c2Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                rh0Var.setVisibility(0);
                rh0Var.e(R.raw.chats_archived, 36, 36);
                rh0Var.setProgress(0.0f);
                rh0Var.d();
            }
            imageView.setVisibility(i11);
            rh0Var.setVisibility(0);
            c2Var.setTypeface(Typeface.DEFAULT);
            int i30 = this.L;
            long j12 = -1;
            if (i30 == 76) {
                c2Var.setText(org.telegram.messenger.hd.M0(2131752869));
                rh0Var.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                c2Var.setTextSize(1, 14.0f);
                h6Var = h6Var2;
                z10 = true;
            } else {
                z10 = true;
                if (i30 == 75) {
                    c2Var.setText(org.telegram.messenger.hd.M0(2131749383));
                    rh0Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    c2Var.setTextSize(1, 14.0f);
                } else {
                    if (i7 == 70) {
                        int intValue4 = ((Integer) obj2).intValue();
                        textView3.setSingleLine(false);
                        c2Var.setText(org.telegram.messenger.hd.Y(2131753851, "AutoDeleteHintOnText", org.telegram.messenger.hd.c0(intValue4)));
                        rh0Var.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                        this.H = 4000L;
                        rh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    } else {
                        if (i30 == 71) {
                            c2Var.setText(org.telegram.messenger.hd.M0(2131753852));
                            rh0Var.e(R.raw.fire_off, 36, 36);
                            c2Var.setTextSize(1, 14.0f);
                            this.H = 3000L;
                            rh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        } else if (i30 == 45) {
                            c2Var.setText(org.telegram.messenger.hd.M0(2131749051));
                            rh0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            z10 = true;
                            c2Var.setTextSize(1, 14.0f);
                        } else if (i30 == 46) {
                            c2Var.setText(org.telegram.messenger.hd.M0(2131749050));
                            rh0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            c2Var.setTextSize(1, 14.0f);
                        } else {
                            if (i30 != 47) {
                                if (i30 == 52 || i30 == 56 || i30 == 57 || i30 == 58 || i30 == 59 || i30 == 60 || i30 == 80) {
                                    h6Var = h6Var2;
                                    if (!org.telegram.messenger.g0.G3()) {
                                        return;
                                    }
                                    int i31 = this.L;
                                    if (i31 == 80) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131751191));
                                    } else if (i31 == 60) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131747101));
                                    } else if (i31 == 56) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131743420));
                                    } else if (i31 == 57) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131749169));
                                    } else if (i31 == 52) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131748396));
                                    } else if (i31 == 59) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131748728));
                                        rh0Var.e(i20, 30, 30);
                                        this.H = 3000L;
                                        c2Var.setTextSize(1, 15.0f);
                                    } else {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131743951));
                                    }
                                    i20 = R.raw.copy;
                                    rh0Var.e(i20, 30, 30);
                                    this.H = 3000L;
                                    c2Var.setTextSize(1, 15.0f);
                                } else if (i30 == 54) {
                                    c2Var.setText(org.telegram.messenger.hd.M0(2131752326));
                                    rh0Var.e(R.raw.silent_unmute, 30, 30);
                                    this.H = 3000L;
                                    c2Var.setTextSize(1, 15.0f);
                                } else {
                                    h6Var = h6Var2;
                                    if (i30 == 55) {
                                        c2Var.setText(org.telegram.messenger.hd.M0(2131752327));
                                        rh0Var.e(R.raw.silent_mute, 30, 30);
                                        this.H = 3000L;
                                        c2Var.setTextSize(1, 15.0f);
                                    } else if (i30 == 41) {
                                        if (obj2 != null) {
                                            c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131748994, "InvLinkToChats", org.telegram.messenger.hd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                        } else if (longValue == org.telegram.messenger.k10.i(i10).n) {
                                            c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131748992)));
                                        } else if (org.telegram.messenger.n5.z(longValue)) {
                                            c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131748993, "InvLinkToGroup", org.telegram.messenger.np.u1(i10).O0(Long.valueOf(-longValue)).title)));
                                        } else {
                                            c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131748991, "InvLinkToUser", org.telegram.messenger.p10.j(org.telegram.messenger.np.u1(i10).c2(l10)))));
                                        }
                                        rh0Var.e(R.raw.contact_check, 36, 36);
                                        this.H = 3000L;
                                    } else if (i30 == 53) {
                                        Integer num = (Integer) obj;
                                        if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                            int intValue5 = ((Integer) obj2).intValue();
                                            if (num.intValue() == 1) {
                                                c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(intValue5, "FwdMessageToManyChats", new Object[0])));
                                            } else {
                                                c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(intValue5, "FwdMessagesToManyChats", new Object[0])));
                                            }
                                            rh0Var.e(R.raw.forward, 30, 30);
                                        } else if (longValue == org.telegram.messenger.k10.i(i10).n) {
                                            if (num.intValue() == 1) {
                                                c2Var = c2Var;
                                                c2Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.M0(2131750481), new me(16)));
                                            } else {
                                                c2Var = c2Var;
                                                c2Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.M0(2131750474), new me(16)));
                                            }
                                            rh0Var.e(R.raw.saved_messages, 30, 30);
                                            this.H = 3000L;
                                        } else {
                                            c2Var = c2Var;
                                            if (org.telegram.messenger.n5.z(longValue)) {
                                                TLRPC.Chat O05 = org.telegram.messenger.np.u1(i10).O0(Long.valueOf(-longValue));
                                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                                String j13 = org.telegram.messenger.v3.p0(O05) ? qg.c.j(i10, O05, false) : null;
                                                if (num.intValue() == 1) {
                                                    if (j13 == null) {
                                                        j13 = tL_forumTopic != null ? tL_forumTopic.title : O05.title;
                                                    }
                                                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131750485, "FwdMessageToGroup", j13)));
                                                } else {
                                                    if (j13 == null) {
                                                        j13 = tL_forumTopic != null ? tL_forumTopic.title : O05.title;
                                                    }
                                                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131750478, "FwdMessagesToGroup", j13)));
                                                }
                                            } else {
                                                TLRPC.User c23 = org.telegram.messenger.np.u1(i10).c2(l10);
                                                if (num.intValue() == 1) {
                                                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131750480, "FwdMessageToUser", org.telegram.messenger.p10.j(c23))));
                                                } else {
                                                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131750473, "FwdMessagesToUser", org.telegram.messenger.p10.j(c23))));
                                                }
                                            }
                                            rh0Var.e(R.raw.forward, 30, 30);
                                        }
                                        j12 = 300;
                                        this.H = 3000L;
                                    } else {
                                        int i32 = i10;
                                        if (i30 == 61) {
                                            if (obj2 != null) {
                                                c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131753734, "BackgroundToChats", org.telegram.messenger.hd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                                rh0Var.e(R.raw.forward, 30, 30);
                                            } else if (longValue == org.telegram.messenger.k10.i(i32).n) {
                                                c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.M0(2131753732)));
                                                rh0Var.e(R.raw.saved_messages, 30, 30);
                                            } else {
                                                if (org.telegram.messenger.n5.z(longValue)) {
                                                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131753733, "BackgroundToGroup", org.telegram.messenger.np.u1(i32).O0(Long.valueOf(-longValue)).title)));
                                                } else {
                                                    c2Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.Y(2131753731, "BackgroundToUser", org.telegram.messenger.p10.j(org.telegram.messenger.np.u1(i32).c2(l10)))));
                                                }
                                                rh0Var.e(R.raw.forward, 30, 30);
                                            }
                                            this.H = 3000L;
                                        }
                                    }
                                }
                                j3 = j12;
                                i12 = 8;
                                z10 = false;
                                textView3.setVisibility(i12);
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.xj, h6Var);
                                linearLayout.setVisibility(i12);
                                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                                rh0Var.setProgress(0.0f);
                                rh0Var.d();
                                if (j3 > 0) {
                                    rh0Var.postDelayed(new cp0(this, 28), j3);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((Object) c2Var.getText());
                                sb2.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                                org.telegram.messenger.g0.i2(sb2.toString());
                                if (e()) {
                                    int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                                    if (measuredWidth == 0) {
                                        measuredWidth = org.telegram.messenger.g0.q.x;
                                    }
                                    measureChildWithMargins(textView3, org.telegram.messenger.o10.c(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                                    this.r = org.telegram.messenger.g0.L(37.0f) + textView3.getMeasuredHeight();
                                } else if (c()) {
                                    this.r = org.telegram.messenger.g0.L(52.0f);
                                } else if (getParent() instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) getParent();
                                    int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                                    if (measuredWidth2 <= 0) {
                                        measuredWidth2 = org.telegram.messenger.g0.q.x;
                                    }
                                    View view = c2Var;
                                    measureChildWithMargins(view, org.telegram.messenger.o10.c(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                                    int measuredHeight = view.getMeasuredHeight();
                                    int i33 = this.L;
                                    int L6 = org.telegram.messenger.g0.L((i33 == 16 || i33 == 17 || i33 == 18 || i33 == 84 || i33 == 86) ? 14.0f : 28.0f) + measuredHeight;
                                    this.r = L6;
                                    int i34 = this.L;
                                    if (i34 == 18) {
                                        this.r = Math.max(L6, org.telegram.messenger.g0.L(52.0f));
                                    } else if (i34 == 25) {
                                        this.r = Math.max(L6, org.telegram.messenger.g0.L(50.0f));
                                    } else if (z10) {
                                        this.r = L6 - org.telegram.messenger.g0.L(8.0f);
                                    }
                                }
                                if (getVisibility() != 0) {
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
                            c2Var.setText(org.telegram.messenger.hd.M0(2131749028));
                            rh0Var.e(R.raw.imported, 36, 36);
                            rh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(5.0f));
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            c2Var.setTextSize(1, 14.0f);
                        }
                        h6Var = h6Var2;
                        j3 = j12;
                        i12 = 8;
                        z10 = false;
                        textView3.setVisibility(i12);
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.xj, h6Var);
                        linearLayout.setVisibility(i12);
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                        rh0Var.setProgress(0.0f);
                        rh0Var.d();
                        if (j3 > 0) {
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append((Object) c2Var.getText());
                        if (textView3.getVisibility() == 0) {
                        }
                        sb22.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                        org.telegram.messenger.g0.i2(sb22.toString());
                        if (e()) {
                        }
                        if (getVisibility() != 0) {
                        }
                    }
                    h6Var = h6Var2;
                    j3 = -1;
                    i12 = 8;
                    z10 = true;
                    textView3.setVisibility(i12);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.xj, h6Var);
                    linearLayout.setVisibility(i12);
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    rh0Var.setProgress(0.0f);
                    rh0Var.d();
                    if (j3 > 0) {
                    }
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append((Object) c2Var.getText());
                    if (textView3.getVisibility() == 0) {
                    }
                    sb222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                    org.telegram.messenger.g0.i2(sb222.toString());
                    if (e()) {
                    }
                    if (getVisibility() != 0) {
                    }
                }
                h6Var = h6Var2;
            }
            j3 = -1;
            i12 = 8;
            textView3.setVisibility(i12);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.xj, h6Var);
            linearLayout.setVisibility(i12);
            layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            rh0Var.setProgress(0.0f);
            rh0Var.d();
            if (j3 > 0) {
            }
            StringBuilder sb2222 = new StringBuilder();
            sb2222.append((Object) c2Var.getText());
            if (textView3.getVisibility() == 0) {
            }
            sb2222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
            org.telegram.messenger.g0.i2(sb2222.toString());
            if (e()) {
            }
            if (getVisibility() != 0) {
            }
        }
        z10 = false;
        StringBuilder sb22222 = new StringBuilder();
        sb22222.append((Object) c2Var.getText());
        if (textView3.getVisibility() == 0) {
        }
        sb22222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
        org.telegram.messenger.g0.i2(sb22222.toString());
        if (e()) {
        }
        if (getVisibility() != 0) {
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var;
        ArrayList arrayList = this.b0;
        try {
            if (this.a0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int size = arrayList.size();
                h6Var = this.W;
                if (i7 >= size) {
                    break;
                }
                int w02 = org.telegram.ui.ActionBar.m6.w0(((Integer) this.c0.get(i7)).intValue(), h6Var);
                rh0 rh0Var = this.f;
                String str = (String) arrayList.get(i7);
                if (((Boolean) this.d0.get(i7)).booleanValue()) {
                    w02 |= -16777216;
                }
                rh0Var.h(w02, str);
                i7++;
            }
            Paint paint = this.F;
            int i10 = org.telegram.ui.ActionBar.m6.yj;
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            this.E.setColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, h6Var), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                org.telegram.ui.ActionBar.m6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var) & 587202559, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, org.telegram.ui.x71 x71Var) {
        this(context, x71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 0;
        this.y = org.telegram.messenger.k10.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = org.telegram.messenger.g0.L(8.0f);
        this.h0 = 1.0f;
        this.W = h6Var;
        this.s = g2Var;
        this.S = z10;
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this, context, h6Var);
        this.b = c2Var;
        c2Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        org.telegram.ui.ActionBar.t6.U(c2Var, i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.t6.G(c2Var, i10, h6Var);
        c2Var.setMovementMethod(new x41(this));
        addView(c2Var, c8.ma.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(textView, i10, h6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, c8.ma.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        rh0 rh0Var = new rh0(context);
        this.f = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.m6.wj;
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
        addView(rh0Var, c8.ma.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.h = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(q9Var, c8.ma.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new w41(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ma.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        i5.c.x(textView2, 1, 14.0f);
        org.telegram.messenger.o10.r(textView2, i10, h6Var, null, 2131743640);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        setWillNotDraw(false);
        this.V = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        setOnTouchListener(new gi.a(27));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i7, long j3) {
    }
}
