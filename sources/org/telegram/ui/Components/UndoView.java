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
import org.telegram.ui.t71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
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
    public final org.telegram.ui.ActionBar.e6 W;
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
    public final fh0 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final i9 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.e2 s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
    }

    public final boolean c() {
        int i7;
        Object obj;
        int i10 = this.L;
        if (i10 == 11 || i10 == 24 || i10 == 6 || i10 == 3 || i10 == 5 || i10 == 13 || i10 == 14 || i10 == 74) {
            return true;
        }
        if ((i10 == 7 && org.telegram.messenger.np.s1(this.y).Q0.isEmpty()) || (i7 = this.L) == 83 || i7 == 85) {
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
                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.y);
                    int i12 = this.L;
                    boolean z11 = i12 == 0 || i12 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) s12.R.f(longValue);
                    if (dialog != null) {
                        if (z11) {
                            s12.F0.l(longValue);
                        } else {
                            s12.E0.l(longValue);
                            if (!z10) {
                                s12.y.add(dialog);
                                s12.U4(null);
                            }
                        }
                        if (!z10) {
                            s12.getNotificationCenter().k(org.telegram.messenger.ns.s, Boolean.TRUE);
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
            animatorSet.addListener(new i11(this, i13));
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
        org.telegram.ui.ActionBar.j6.C1(-115203550, this.V);
        org.telegram.ui.Cells.b2 b2Var = this.b;
        org.telegram.ui.ActionBar.q6.q(b2Var);
        int i11 = org.telegram.ui.ActionBar.j6.xj;
        org.telegram.ui.ActionBar.e6 e6Var = this.W;
        org.telegram.ui.ActionBar.q6.G(b2Var, i11, e6Var);
        TextView textView = this.c;
        org.telegram.ui.ActionBar.q6.q(textView);
        org.telegram.ui.ActionBar.q6.G(textView, i11, e6Var);
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
        fh0 fh0Var = this.f;
        fh0Var.h(-14540254, "info1");
        fh0Var.h(-14540254, "info2");
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
        org.telegram.ui.ActionBar.e6 e6Var = this.W;
        this.f.h(z10 ? org.telegram.ui.ActionBar.j6.w0(i7, e6Var) | (-16777216) : org.telegram.ui.ActionBar.j6.w0(i7, e6Var), str);
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

    /* JADX WARN: Removed duplicated region for block: B:41:0x179d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x17bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x18aa  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x1781  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x17fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        MovementMethod movementMethod;
        boolean z10;
        TextView textView;
        LinearLayout linearLayout;
        long j3;
        int i11;
        int L;
        CharSequence X2;
        int i12;
        int i13;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        SpannableStringBuilder W2;
        SpannableStringBuilder W22;
        String L0;
        String str;
        String L02;
        String L03;
        int i15;
        int i16;
        String str2;
        int i17;
        int i18;
        LinearLayout linearLayout2 = this.n;
        i9 i9Var = this.h;
        int i19 = this.y;
        TextView textView2 = this.d;
        TextView textView3 = this.c;
        fh0 fh0Var = this.f;
        org.telegram.ui.Cells.b2 b2Var = this.b;
        if (org.telegram.messenger.g0.H3()) {
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
        textView2.setText(org.telegram.messenger.hd.L0(2131743885));
        this.e.setVisibility(0);
        fh0Var.setPadding(0, 0, 0, 0);
        fh0Var.setScaleX(1.0f);
        fh0Var.setScaleY(1.0f);
        b2Var.setTextSize(1, 15.0f);
        i9Var.setVisibility(8);
        b2Var.setGravity(51);
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
        layoutParams.bottomMargin = 0;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fh0Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(3.0f);
        layoutParams2.width = org.telegram.messenger.g0.L(54.0f);
        layoutParams2.height = -2;
        b2Var.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i7 == 83) {
            setOnClickListener(new j41(this, 1));
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
                textView3.setSingleLine(false);
                X2 = org.telegram.messenger.hd.L0(2131745282);
                charSequence = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.L0(2131745281), runnable);
                this.N = null;
                this.H = 4000L;
                i13 = R.raw.sound_download;
            } else if (i7 == 74) {
                textView3.setSingleLine(false);
                X2 = org.telegram.messenger.hd.L0(2131746222);
                charSequence = org.telegram.messenger.hd.Y(2131746207, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i13 = R.raw.ic_admin;
            } else {
                if (i7 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder X22 = org.telegram.messenger.t3.W((TLRPC.Chat) obj2) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743479, "VoipChannelInvitedUser", org.telegram.messenger.q10.i(user))) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743371, "VoipGroupInvitedUser", org.telegram.messenger.q10.i(user)));
                    t8 t8Var = new t8();
                    t8Var.u(org.telegram.messenger.g0.L(12.0f));
                    t8Var.r(user);
                    i9Var.f(user, t8Var);
                    i9Var.setVisibility(0);
                    this.H = 3000L;
                    X2 = X22;
                } else if (i7 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        X2 = org.telegram.messenger.t3.W(chat) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Z(2131743450, org.telegram.messenger.q10.i(user2))) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Z(2131743427, org.telegram.messenger.q10.i(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        X2 = org.telegram.messenger.t3.W(chat) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Z(2131743487, chat2.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Z(2131743444, chat2.title));
                    } else {
                        X2 = "";
                    }
                    t8 t8Var2 = new t8();
                    t8Var2.u(org.telegram.messenger.g0.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    t8Var2.p(tLObject);
                    i9Var.f(tLObject, t8Var2);
                    i9Var.setVisibility(0);
                    this.H = 3000L;
                } else if (i7 == 37) {
                    t8 t8Var3 = new t8();
                    t8Var3.u(org.telegram.messenger.g0.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        t8Var3.r(user3);
                        i9Var.f(user3, t8Var3);
                        str2 = org.telegram.messenger.g5.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        t8Var3.q(chat3);
                        i9Var.f(chat3, t8Var3);
                        str2 = chat3.title;
                    }
                    if (org.telegram.messenger.t3.W((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743451, "VoipChannelUserChanged", str2));
                    } else {
                        i17 = 0;
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743312, "VoipGroupUserChanged", str2));
                    }
                    i9Var.setVisibility(i17);
                    this.H = 3000L;
                } else {
                    if (i7 == 33) {
                        X2 = org.telegram.messenger.hd.L0(2131743389);
                        this.H = 3000L;
                        i13 = R.raw.voip_invite;
                    } else {
                        int i23 = 7;
                        if (i7 == 77) {
                            X2 = (CharSequence) obj;
                            this.H = 5000L;
                            if (this.s != null && (obj2 instanceof TLRPC.Message)) {
                                setOnTouchListener(null);
                                b2Var.setMovementMethod(null);
                                setOnClickListener(new vv0(i23, this, (TLRPC.Message) obj2));
                            }
                            i16 = R.raw.payment_success;
                        } else {
                            if (i7 == 30) {
                                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743314, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.q10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i7 == 35) {
                                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743313, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.q10.i((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.H = 3000L;
                            } else {
                                if (i7 == 31) {
                                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743316, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.q10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i7 == 38) {
                                    X2 = obj instanceof TLRPC.Chat ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743304, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131743305));
                                    this.H = 3000L;
                                    i16 = R.raw.voip_allow_talk;
                                } else if (i7 == 42) {
                                    X2 = org.telegram.messenger.t3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131743460)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131743335));
                                    this.H = 3000L;
                                    charSequence = null;
                                    i13 = R.raw.ic_mute;
                                } else if (i7 == 43) {
                                    X2 = org.telegram.messenger.t3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131743459)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131743334));
                                    this.H = 3000L;
                                    i16 = R.raw.ic_unmute;
                                } else {
                                    int i24 = this.L;
                                    if (i24 == 39 || i24 == 100) {
                                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(i24 == 39 ? 2131743397 : 2131743308));
                                        this.H = 3000L;
                                        i12 = R.raw.voip_record_start;
                                    } else {
                                        if (i24 == 40 || i24 == 101) {
                                            String L04 = org.telegram.messenger.hd.L0(i24 == 40 ? 2131743398 : 2131743309);
                                            this.H = 4000L;
                                            b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
                                            spannableStringBuilder = new SpannableStringBuilder(L04);
                                            int indexOf = L04.indexOf("**");
                                            int lastIndexOf = L04.lastIndexOf("**");
                                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new f41("tg://openmessage?user_id=" + org.telegram.messenger.m10.i(i10).e()), indexOf, lastIndexOf - 2, 33);
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.f(e10);
                                                }
                                            }
                                            i14 = R.raw.voip_record_saved;
                                        } else if (i7 == 36) {
                                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131743315, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.q10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            this.H = 3000L;
                                        } else if (i7 == 32 || i7 == 102) {
                                            String i25 = obj instanceof TLRPC.User ? org.telegram.messenger.q10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                            X2 = i7 == 102 ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Z(2131743424, i25)) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Z(2131743344, i25));
                                            this.H = 3000L;
                                            i12 = R.raw.ic_ban;
                                        } else {
                                            if (i7 == 9 || i7 == 10) {
                                                TLRPC.User user4 = (TLRPC.User) obj;
                                                X2 = i7 == 9 ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131751295, "EditAdminTransferChannelToast", org.telegram.messenger.q10.i(user4))) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131751294, "EditAdminTransferGroupToast", org.telegram.messenger.q10.i(user4)));
                                            } else {
                                                if (i7 == 8) {
                                                    X2 = org.telegram.messenger.hd.Y(2131747834, "NowInContacts", org.telegram.messenger.q10.i((TLRPC.User) obj));
                                                } else if (i7 == 87) {
                                                    X2 = org.telegram.messenger.hd.Z(2131746610, new Object[0]);
                                                } else if (i7 != 22) {
                                                    long j10 = longValue;
                                                    if (i7 == 23) {
                                                        X2 = org.telegram.messenger.hd.L0(2131752195);
                                                    } else if (i7 == 6) {
                                                        X2 = org.telegram.messenger.hd.L0(2131754169);
                                                        charSequence = org.telegram.messenger.hd.L0(2131754168);
                                                        i13 = R.raw.chats_swipearchive;
                                                        i22 = 48;
                                                    } else {
                                                        if (i24 == 13) {
                                                            L02 = org.telegram.messenger.hd.L0(2131746444);
                                                            L03 = org.telegram.messenger.hd.L0(2131746443);
                                                            i15 = R.raw.wallet_congrats;
                                                        } else if (i24 == 14) {
                                                            L02 = org.telegram.messenger.hd.L0(2131746442);
                                                            L03 = org.telegram.messenger.hd.L0(2131746441);
                                                            i15 = R.raw.wallet_science;
                                                        } else {
                                                            if (i7 == 7) {
                                                                X2 = org.telegram.messenger.hd.L0(2131754152);
                                                                if (org.telegram.messenger.np.s1(i10).Q0.isEmpty()) {
                                                                    L0 = org.telegram.messenger.hd.L0(2131754151);
                                                                    str = L0;
                                                                }
                                                                str = null;
                                                            } else if (i7 == 20 || i7 == 21) {
                                                                org.telegram.messenger.so soVar = (org.telegram.messenger.so) obj2;
                                                                Spannable z52 = org.telegram.messenger.gj.z5(b2Var.getPaint().getFontMetricsInt(), org.telegram.messenger.j6.l(soVar.b, b2Var.getPaint().getFontMetricsInt(), false), soVar.c);
                                                                this.a = soVar.n ? 26 : 0;
                                                                if (j10 != 0) {
                                                                    if (org.telegram.messenger.m5.C(j10)) {
                                                                        j10 = org.telegram.messenger.np.s1(i10).a1(Integer.valueOf(org.telegram.messenger.m5.h(j10))).user_id;
                                                                    }
                                                                    if (org.telegram.messenger.m5.E(j10)) {
                                                                        TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(j10));
                                                                        String i26 = org.telegram.messenger.q10.i(a22);
                                                                        if (org.telegram.messenger.q10.B(a22)) {
                                                                            i26 = org.telegram.messenger.hd.L0(2131745901);
                                                                        } else if (org.telegram.messenger.q10.z(a22)) {
                                                                            i26 = org.telegram.messenger.hd.L0(2131746266);
                                                                        }
                                                                        W22 = i7 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.U(2131750698, i26, z52)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.U(2131750697, i26, z52));
                                                                    } else {
                                                                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-j10));
                                                                        W22 = i7 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.U(2131750799, M0.title, z52)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.U(2131750798, M0.title, z52));
                                                                    }
                                                                    W2 = W22;
                                                                } else {
                                                                    W2 = i7 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.hd.U(2131750795, org.telegram.messenger.hd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52)) : org.telegram.messenger.g0.W2(org.telegram.messenger.hd.U(2131750794, org.telegram.messenger.hd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52));
                                                                }
                                                                i14 = i7 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                                spannableStringBuilder = W2;
                                                            } else if (i7 == 19) {
                                                                X2 = this.T;
                                                                i12 = R.raw.ic_delete;
                                                            } else if (i7 == 82) {
                                                                X2 = org.telegram.messenger.hd.L0(((org.telegram.messenger.ff) obj).b ? 2131753954 : 2131753959);
                                                                charSequence = null;
                                                                i13 = 0;
                                                                i22 = 36;
                                                            } else if (i7 == 78 || i7 == 79) {
                                                                int intValue = ((Integer) obj).intValue();
                                                                X2 = i7 == 78 ? org.telegram.messenger.hd.G(intValue, "PinnedDialogsCount", new Object[0]) : org.telegram.messenger.hd.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                                i12 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                                if (obj2 instanceof Integer) {
                                                                    this.H = ((Integer) obj2).intValue();
                                                                }
                                                            } else {
                                                                X2 = i7 == 3 ? org.telegram.messenger.hd.L0(2131752246) : org.telegram.messenger.hd.L0(2131752181);
                                                                if (org.telegram.messenger.np.s1(i10).Q0.isEmpty()) {
                                                                    L0 = org.telegram.messenger.hd.L0(2131752245);
                                                                    str = L0;
                                                                }
                                                                str = null;
                                                            }
                                                            charSequence = str;
                                                            i13 = R.raw.chats_infotip;
                                                            i22 = 36;
                                                        }
                                                        i22 = 44;
                                                        X2 = L02;
                                                        charSequence = L03;
                                                        i13 = i15;
                                                    }
                                                } else if (org.telegram.messenger.m5.E(longValue)) {
                                                    X2 = obj == null ? org.telegram.messenger.hd.L0(2131748710) : org.telegram.messenger.hd.L0(2131748709);
                                                } else {
                                                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(-longValue));
                                                    X2 = (!org.telegram.messenger.t3.T(M02) || M02.megagroup) ? obj == null ? org.telegram.messenger.hd.L0(2131748712) : org.telegram.messenger.hd.L0(2131748711) : obj == null ? org.telegram.messenger.hd.L0(2131748714) : org.telegram.messenger.hd.L0(2131748713);
                                                }
                                                charSequence = null;
                                                i13 = R.raw.contact_check;
                                            }
                                            charSequence = null;
                                            i13 = R.raw.contact_check;
                                            i22 = 36;
                                        }
                                        i13 = i14;
                                        X2 = spannableStringBuilder;
                                        charSequence = null;
                                        i22 = 36;
                                    }
                                    i13 = i12;
                                    charSequence = null;
                                    i22 = 36;
                                }
                                i13 = R.raw.voip_unmuted;
                            }
                            i13 = R.raw.voip_muted;
                        }
                        i13 = i16;
                    }
                    charSequence = null;
                }
                charSequence = null;
                i13 = 0;
            }
            b2Var.setText(X2);
            if (i13 != 0) {
                fh0Var.e(i13, i22, i22);
                ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
                animatedDrawable.h = false;
                animatedDrawable.P(animatedDrawable.s());
                fh0Var.setVisibility(0);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else {
                fh0Var.setVisibility(8);
            }
            if (charSequence != null) {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(8.0f);
                textView3.setText(charSequence);
                textView3.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                i18 = 8;
            } else {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                i18 = 8;
                textView3.setVisibility(8);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
            }
            linearLayout2.setVisibility(i18);
        } else {
            int i27 = this.L;
            if (i27 == 45 || i27 == 46 || i27 == 47 || i27 == 52 || i27 == 53 || i27 == 54 || i27 == 55 || i27 == 56 || i27 == 57 || i27 == 58 || i27 == 59 || i27 == 60 || i27 == 71 || i27 == 70 || i27 == 75 || i27 == 76 || i27 == 41 || i27 == 78 || i27 == 79 || i27 == 61 || i27 == 80) {
                this.e.setVisibility(8);
                fh0Var.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                int i28 = this.L;
                long j11 = -1;
                if (i28 == 76) {
                    b2Var.setText(org.telegram.messenger.hd.L0(2131752881));
                    fh0Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    z10 = true;
                    b2Var.setTextSize(1, 14.0f);
                } else {
                    z10 = true;
                    if (i28 == 75) {
                        b2Var.setText(org.telegram.messenger.hd.L0(2131749559));
                        fh0Var.e(R.raw.chats_infotip, 36, 36);
                        layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                        b2Var.setTextSize(1, 14.0f);
                    } else {
                        if (i7 == 70) {
                            int intValue2 = ((Integer) obj2).intValue();
                            textView3.setSingleLine(false);
                            b2Var.setText(org.telegram.messenger.hd.Y(2131753854, "AutoDeleteHintOnText", org.telegram.messenger.hd.c0(intValue2)));
                            fh0Var.e(R.raw.fire_on, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            this.H = 4000L;
                            fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                        } else {
                            if (i28 == 71) {
                                b2Var.setText(org.telegram.messenger.hd.L0(2131753855));
                                fh0Var.e(R.raw.fire_off, 36, 36);
                                b2Var.setTextSize(1, 14.0f);
                                this.H = 3000L;
                                fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                            } else {
                                if (i28 == 45) {
                                    b2Var.setText(org.telegram.messenger.hd.L0(2131749244));
                                    fh0Var.e(R.raw.error, 36, 36);
                                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                                    b2Var.setTextSize(1, 14.0f);
                                    textView = textView2;
                                    z10 = true;
                                    linearLayout = linearLayout2;
                                    j3 = -1;
                                    i11 = 8;
                                    textView3.setVisibility(i11);
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.xj, this.W);
                                    linearLayout.setVisibility(i11);
                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                                    fh0Var.setProgress(0.0f);
                                    fh0Var.d();
                                    if (j3 > 0) {
                                        fh0Var.postDelayed(new ro0(this, 29), j3);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append((Object) b2Var.getText());
                                    sb2.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                                    org.telegram.messenger.g0.i2(sb2.toString());
                                    if (!e()) {
                                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                                        if (measuredWidth == 0) {
                                            measuredWidth = org.telegram.messenger.g0.q.x;
                                        }
                                        measureChildWithMargins(textView3, org.telegram.messenger.i20.c(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                                        this.r = org.telegram.messenger.g0.L(37.0f) + textView3.getMeasuredHeight();
                                    } else if (c()) {
                                        this.r = org.telegram.messenger.g0.L(52.0f);
                                    } else if (getParent() instanceof ViewGroup) {
                                        ViewGroup viewGroup = (ViewGroup) getParent();
                                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                                        if (measuredWidth2 <= 0) {
                                            measuredWidth2 = org.telegram.messenger.g0.q.x;
                                        }
                                        measureChildWithMargins(b2Var, org.telegram.messenger.i20.c(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                                        int measuredHeight = b2Var.getMeasuredHeight();
                                        int i29 = this.L;
                                        int L2 = org.telegram.messenger.g0.L((i29 == 16 || i29 == 17 || i29 == 18 || i29 == 84 || i29 == 86) ? 14.0f : 28.0f) + measuredHeight;
                                        this.r = L2;
                                        int i30 = this.L;
                                        if (i30 == 18) {
                                            this.r = Math.max(L2, org.telegram.messenger.g0.L(52.0f));
                                        } else if (i30 == 25) {
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
                                if (i28 == 46) {
                                    b2Var.setText(org.telegram.messenger.hd.L0(2131749243));
                                    fh0Var.e(R.raw.error, 36, 36);
                                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                                    b2Var.setTextSize(1, 14.0f);
                                } else if (i28 == 47) {
                                    b2Var.setText(org.telegram.messenger.hd.L0(2131749221));
                                    fh0Var.e(R.raw.imported, 36, 36);
                                    fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(5.0f));
                                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                                    b2Var.setTextSize(1, 14.0f);
                                } else {
                                    if (i28 == 52 || i28 == 56 || i28 == 57 || i28 == 58 || i28 == 59 || i28 == 60 || i28 == 80) {
                                        textView = textView2;
                                        linearLayout = linearLayout2;
                                        if (!org.telegram.messenger.g0.H3()) {
                                            return;
                                        }
                                        int i31 = this.L;
                                        if (i31 == 80) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131751203));
                                        } else if (i31 == 60) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131747295));
                                        } else if (i31 == 56) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131743665));
                                        } else if (i31 == 57) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131749362));
                                        } else if (i31 == 52) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131748589));
                                        } else if (i31 == 59) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131748921));
                                            fh0Var.e(i21, 30, 30);
                                            this.H = 3000L;
                                            b2Var.setTextSize(1, 15.0f);
                                        } else {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131744194));
                                        }
                                        i21 = R.raw.copy;
                                        fh0Var.e(i21, 30, 30);
                                        this.H = 3000L;
                                        b2Var.setTextSize(1, 15.0f);
                                    } else if (i28 == 54) {
                                        b2Var.setText(org.telegram.messenger.hd.L0(2131752338));
                                        fh0Var.e(R.raw.silent_unmute, 30, 30);
                                        this.H = 3000L;
                                        b2Var.setTextSize(1, 15.0f);
                                    } else {
                                        textView = textView2;
                                        if (i28 == 55) {
                                            b2Var.setText(org.telegram.messenger.hd.L0(2131752339));
                                            fh0Var.e(R.raw.silent_mute, 30, 30);
                                            this.H = 3000L;
                                            b2Var.setTextSize(1, 15.0f);
                                        } else if (i28 == 41) {
                                            if (obj2 != null) {
                                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131749187, "InvLinkToChats", org.telegram.messenger.hd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                            } else if (longValue == org.telegram.messenger.m10.i(i10).n) {
                                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131749185)));
                                            } else if (org.telegram.messenger.m5.z(longValue)) {
                                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131749186, "InvLinkToGroup", org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-longValue)).title)));
                                            } else {
                                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131749184, "InvLinkToUser", org.telegram.messenger.q10.i(org.telegram.messenger.np.s1(i10).a2(l10)))));
                                            }
                                            fh0Var.e(R.raw.contact_check, 36, 36);
                                            this.H = 3000L;
                                        } else if (i28 == 53) {
                                            Integer num = (Integer) obj;
                                            if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                                int intValue3 = ((Integer) obj2).intValue();
                                                if (num.intValue() == 1) {
                                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(intValue3, "FwdMessageToManyChats", new Object[0])));
                                                } else {
                                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(intValue3, "FwdMessagesToManyChats", new Object[0])));
                                                }
                                                fh0Var.e(R.raw.forward, 30, 30);
                                            } else if (longValue == org.telegram.messenger.m10.i(i10).n) {
                                                if (num.intValue() == 1) {
                                                    b2Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.L0(2131750498), new ih(14)));
                                                } else {
                                                    b2Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.L0(2131750491), new ih(14)));
                                                }
                                                fh0Var.e(R.raw.saved_messages, 30, 30);
                                                this.H = 3000L;
                                            } else {
                                                if (org.telegram.messenger.m5.z(longValue)) {
                                                    TLRPC.Chat M03 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-longValue));
                                                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                                    String i32 = org.telegram.messenger.t3.p0(M03) ? qg.c.i(i10, M03, false) : null;
                                                    if (num.intValue() == 1) {
                                                        if (i32 == null) {
                                                            i32 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                                        }
                                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131750502, "FwdMessageToGroup", i32)));
                                                    } else {
                                                        if (i32 == null) {
                                                            i32 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                                        }
                                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131750495, "FwdMessagesToGroup", i32)));
                                                    }
                                                } else {
                                                    TLRPC.User a23 = org.telegram.messenger.np.s1(i10).a2(l10);
                                                    if (num.intValue() == 1) {
                                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131750497, "FwdMessageToUser", org.telegram.messenger.q10.i(a23))));
                                                    } else {
                                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131750490, "FwdMessagesToUser", org.telegram.messenger.q10.i(a23))));
                                                    }
                                                }
                                                fh0Var.e(R.raw.forward, 30, 30);
                                            }
                                            j11 = 300;
                                            this.H = 3000L;
                                        } else {
                                            int i33 = i10;
                                            if (i28 == 61) {
                                                if (obj2 == null) {
                                                    linearLayout = linearLayout2;
                                                    if (longValue == org.telegram.messenger.m10.i(i33).n) {
                                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131753735)));
                                                        fh0Var.e(R.raw.saved_messages, 30, 30);
                                                    } else {
                                                        if (org.telegram.messenger.m5.z(longValue)) {
                                                            b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131753736, "BackgroundToGroup", org.telegram.messenger.np.s1(i33).M0(Long.valueOf(-longValue)).title)));
                                                        } else {
                                                            b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131753734, "BackgroundToUser", org.telegram.messenger.q10.i(org.telegram.messenger.np.s1(i33).a2(l10)))));
                                                        }
                                                        fh0Var.e(R.raw.forward, 30, 30);
                                                    }
                                                } else {
                                                    linearLayout = linearLayout2;
                                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131753737, "BackgroundToChats", org.telegram.messenger.hd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                                    fh0Var.e(R.raw.forward, 30, 30);
                                                }
                                                this.H = 3000L;
                                            }
                                        }
                                        linearLayout = linearLayout2;
                                    }
                                    j3 = j11;
                                    i11 = 8;
                                    z10 = false;
                                    textView3.setVisibility(i11);
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.xj, this.W);
                                    linearLayout.setVisibility(i11);
                                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                                    fh0Var.setProgress(0.0f);
                                    fh0Var.d();
                                    if (j3 > 0) {
                                    }
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append((Object) b2Var.getText());
                                    if (textView3.getVisibility() == 0) {
                                    }
                                    sb22.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                                    org.telegram.messenger.g0.i2(sb22.toString());
                                    if (!e()) {
                                    }
                                    if (getVisibility() == 0) {
                                    }
                                }
                            }
                            textView = textView2;
                            linearLayout = linearLayout2;
                            j3 = j11;
                            i11 = 8;
                            z10 = false;
                            textView3.setVisibility(i11);
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.xj, this.W);
                            linearLayout.setVisibility(i11);
                            layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                            fh0Var.setProgress(0.0f);
                            fh0Var.d();
                            if (j3 > 0) {
                            }
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append((Object) b2Var.getText());
                            if (textView3.getVisibility() == 0) {
                            }
                            sb222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                            org.telegram.messenger.g0.i2(sb222.toString());
                            if (!e()) {
                            }
                            if (getVisibility() == 0) {
                            }
                        }
                        textView = textView2;
                        linearLayout = linearLayout2;
                        j3 = -1;
                        i11 = 8;
                        z10 = true;
                        textView3.setVisibility(i11);
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.xj, this.W);
                        linearLayout.setVisibility(i11);
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                        fh0Var.setProgress(0.0f);
                        fh0Var.d();
                        if (j3 > 0) {
                        }
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append((Object) b2Var.getText());
                        if (textView3.getVisibility() == 0) {
                        }
                        sb2222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                        org.telegram.messenger.g0.i2(sb2222.toString());
                        if (!e()) {
                        }
                        if (getVisibility() == 0) {
                        }
                    }
                }
                textView = textView2;
                linearLayout = linearLayout2;
                j3 = -1;
                i11 = 8;
                textView3.setVisibility(i11);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.xj, this.W);
                linearLayout.setVisibility(i11);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                if (j3 > 0) {
                }
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append((Object) b2Var.getText());
                if (textView3.getVisibility() == 0) {
                }
                sb22222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
                org.telegram.messenger.g0.i2(sb22222.toString());
                if (!e()) {
                }
                if (getVisibility() == 0) {
                }
            } else if (i27 == 24 || i27 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                this.e.setVisibility(8);
                fh0Var.setVisibility(0);
                if (intValue4 != 0) {
                    b2Var.setTypeface(org.telegram.messenger.g0.o());
                    b2Var.setTextSize(1, 14.0f);
                    fh0Var.a.clear();
                    int i34 = org.telegram.ui.ActionBar.j6.yj;
                    i(i34, "BODY", false);
                    i(i34, "Wibe Big", false);
                    i(i34, "Wibe Big 3", false);
                    i(i34, "Wibe Small", false);
                    b2Var.setText(org.telegram.messenger.hd.L0(2131746616));
                    fh0Var.e(R.raw.ic_unmute, 28, 28);
                    textView3.setVisibility(0);
                    textView3.setSingleLine(false);
                    textView3.setMaxLines(3);
                    if (user5 != null) {
                        textView3.setText(org.telegram.messenger.hd.Y(2131746614, "ProximityAlertSetInfoUser", org.telegram.messenger.q10.i(user5), org.telegram.messenger.hd.y(intValue4, 2, null)));
                    } else {
                        textView3.setText(org.telegram.messenger.hd.Y(2131746615, "ProximityAlertSetInfoGroup2", org.telegram.messenger.hd.y(intValue4, 2, null)));
                    }
                    linearLayout2.setVisibility(8);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                } else {
                    b2Var.setTypeface(Typeface.DEFAULT);
                    b2Var.setTextSize(1, 15.0f);
                    fh0Var.a.clear();
                    int i35 = org.telegram.ui.ActionBar.j6.yj;
                    i(i35, "Body Main", false);
                    i(i35, "Body Top", false);
                    i(i35, "Line", false);
                    i(i35, "Curve Big", false);
                    i(i35, "Curve Small", false);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    b2Var.setText(org.telegram.messenger.hd.L0(2131746617));
                    fh0Var.e(R.raw.ic_mute, 28, 28);
                    textView3.setVisibility(8);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.xj, this.W);
                    linearLayout2.setVisibility(0);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else if (i27 == 11) {
                b2Var.setText(org.telegram.messenger.hd.L0(2131753886));
                fh0Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                textView3.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.p7, this.W);
                this.e.setVisibility(8);
                linearLayout2.setVisibility(0);
                fh0Var.setVisibility(0);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else if (i27 == 15) {
                this.H = 10000L;
                textView2.setText(org.telegram.messenger.hd.L0(2131747817));
                b2Var.setText(org.telegram.messenger.hd.L0(2131750802));
                fh0Var.e(R.raw.filter_new, 36, 36);
                int L3 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = L3;
                String L05 = org.telegram.messenger.hd.L0(2131750803);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L05);
                int indexOf2 = L05.indexOf(42);
                int lastIndexOf2 = L05.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new f41("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView3.setText(spannableStringBuilder2);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                linearLayout2.setVisibility(0);
                this.e.setVisibility(8);
                fh0Var.setVisibility(0);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else if (i27 == 16 || i27 == 17) {
                this.H = 4000L;
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setMinHeight(org.telegram.messenger.g0.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131751450)));
                    fh0Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131751678)));
                    } else {
                        String k10 = r.b.k("DiceEmojiInfo_", str3);
                        String b10 = org.telegram.messenger.hd.E0().Y.b(k10);
                        if (b10 == null) {
                            org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                            E0.i();
                            b10 = E0.W.b(k10);
                        }
                        if (TextUtils.isEmpty(b10)) {
                            b2Var.setText(org.telegram.messenger.j6.l(org.telegram.messenger.hd.Y(2131751451, "DiceEmojiInfo", str3), b2Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            b2Var.setText(org.telegram.messenger.j6.l(b10, b2Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    fh0Var.setImageDrawable(org.telegram.messenger.j6.g(str3));
                    fh0Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.width = org.telegram.messenger.g0.L(26.0f);
                    layoutParams2.height = org.telegram.messenger.g0.L(26.0f);
                }
                textView2.setText(org.telegram.messenger.hd.L0(2131745627));
                if (this.L == 16) {
                    L = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.xj, this.W);
                    this.e.setVisibility(8);
                    linearLayout2.setVisibility(0);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                    textView2.setVisibility(8);
                    linearLayout2.setVisibility(8);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(7.0f);
                layoutParams.height = -1;
                textView3.setVisibility(8);
                fh0Var.setVisibility(0);
            } else if (i27 == 18) {
                this.H = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setText((CharSequence) obj);
                textView2.setVisibility(8);
                linearLayout2.setVisibility(8);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L4 = org.telegram.messenger.g0.L(8.0f);
                layoutParams2.bottomMargin = L4;
                layoutParams2.topMargin = L4;
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.chats_infotip, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
            } else if (i27 == 12) {
                b2Var.setText(org.telegram.messenger.hd.L0(2131752010));
                fh0Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(48.0f);
                String L06 = org.telegram.messenger.hd.L0(2131752009);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L06);
                int indexOf3 = L06.indexOf(42);
                int lastIndexOf3 = L06.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new f41("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView3.setText(spannableStringBuilder3);
                textView3.setVisibility(0);
                textView3.setSingleLine(false);
                textView3.setMaxLines(2);
                textView2.setVisibility(8);
                linearLayout2.setVisibility(0);
                fh0Var.setVisibility(0);
            } else if (i27 == 84) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.L0(2131743855)));
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.voice_to_text, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                textView2.setText(org.telegram.messenger.hd.L0(2131747033));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                int L5 = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                i9Var.setVisibility(8);
                textView3.setVisibility(8);
                textView2.setVisibility(0);
                linearLayout2.setVisibility(0);
                this.e.setVisibility(8);
            } else if (i27 == 85) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                b2Var.setText(org.telegram.messenger.hd.L0(2131744306));
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.hint_swipe_reply, 64, 64);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                textView3.setVisibility(0);
                textView3.setText(org.telegram.messenger.hd.L0(2131744305));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.height = -2;
                i9Var.setVisibility(8);
                linearLayout2.setVisibility(8);
            } else if (i27 == 90 || i27 == 91 || i27 == 92 || i27 == 93 || i27 == 94) {
                switch (i27) {
                    case org.telegram.messenger.ns.b1 /* 90 */:
                        b2Var.setText(org.telegram.messenger.hd.G((int) wg.q.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.ns.c1 /* 91 */:
                        b2Var.setText(org.telegram.messenger.hd.L0(2131753272));
                        break;
                    case org.telegram.messenger.ns.d1 /* 92 */:
                        b2Var.setText(org.telegram.messenger.hd.G((int) org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.ns.e1 /* 93 */:
                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G((int) org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).s0, "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case org.telegram.messenger.ns.f1 /* 94 */:
                        b2Var.setText(org.telegram.messenger.hd.L0(2131753333));
                        break;
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                b2Var.setTextSize(1, 15.0f);
                linearLayout2.setVisibility(8);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.chats_infotip, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else {
                int i36 = 2;
                if (i27 != 2) {
                    if (i27 == 4) {
                        i36 = 2;
                    } else if (i7 == 82) {
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                        b2Var.setText(org.telegram.messenger.hd.L0(ffVar.b ? 2131753954 : 2131753959));
                        linearLayout2.setVisibility(0);
                        b2Var.setTextSize(1, 15.0f);
                        b2Var.setTypeface(Typeface.DEFAULT);
                        textView3.setVisibility(8);
                        i9Var.setVisibility(0);
                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                        String str4 = ffVar.c;
                        if (str4 != null) {
                            i9Var.h(str4, null, org.telegram.ui.ActionBar.j6.R4);
                        } else if (ffVar.I != null) {
                            i9Var.s(ffVar.J, ffVar.K, true);
                            if (ffVar.b) {
                                i9Var.h("vthumb://" + ffVar.C + ":" + ffVar.I, null, org.telegram.ui.ActionBar.j6.R4);
                            } else {
                                i9Var.h("thumb://" + ffVar.C + ":" + ffVar.I, null, org.telegram.ui.ActionBar.j6.R4);
                            }
                        } else {
                            i9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                        }
                    } else {
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(45.0f);
                        layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                        layoutParams.rightMargin = 0;
                        b2Var.setTextSize(1, 15.0f);
                        linearLayout2.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        b2Var.setTypeface(typeface);
                        textView3.setVisibility(8);
                        fh0Var.setVisibility(8);
                        int i37 = this.L;
                        if (i37 == 88) {
                            String str5 = (String) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            if (intValue5 > 0) {
                                int L6 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                layoutParams.leftMargin = org.telegram.messenger.g0.L(48.0f);
                                layoutParams.rightMargin = L6;
                                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                layoutParams3.leftMargin = org.telegram.messenger.g0.L(48.0f);
                                layoutParams3.rightMargin = L6;
                                b2Var.setText(org.telegram.messenger.hd.Y(2131750663, "FolderLinkDeletedTitle", str5));
                                b2Var.setTypeface(org.telegram.messenger.g0.o());
                                textView3.setVisibility(0);
                                textView3.setText(org.telegram.messenger.hd.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                            } else {
                                b2Var.setTypeface(typeface);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.Y(2131750667, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                            }
                        } else if (i37 == 81 || i37 == 0 || i37 == 26) {
                            b2Var.setText(org.telegram.messenger.hd.L0(2131749293));
                        } else if (i37 == 27) {
                            b2Var.setText(org.telegram.messenger.hd.L0(2131752180));
                        } else if (i37 == 95) {
                            if (org.telegram.messenger.m5.z(longValue)) {
                                TLRPC.Chat M04 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-longValue));
                                if (org.telegram.messenger.t3.p0(M04)) {
                                    b2Var.setText(org.telegram.messenger.hd.L0(2131748349));
                                } else if (!org.telegram.messenger.t3.T(M04) || M04.megagroup) {
                                    b2Var.setText(org.telegram.messenger.hd.L0(2131749430));
                                } else {
                                    b2Var.setText(org.telegram.messenger.hd.L0(2131752388));
                                }
                            } else {
                                b2Var.setText(org.telegram.messenger.hd.L0(2131752242));
                            }
                        } else if (org.telegram.messenger.m5.z(longValue)) {
                            TLRPC.Chat M05 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-longValue));
                            if (org.telegram.messenger.t3.p0(M05)) {
                                b2Var.setText(org.telegram.messenger.hd.L0(2131748349));
                            } else if (!org.telegram.messenger.t3.T(M05) || M05.megagroup) {
                                b2Var.setText(org.telegram.messenger.hd.L0(2131749449));
                            } else {
                                b2Var.setText(org.telegram.messenger.hd.L0(2131752417));
                            }
                        } else {
                            b2Var.setText(org.telegram.messenger.hd.L0(2131752242));
                        }
                        if (this.L != 81) {
                            for (int i38 = 0; i38 < arrayList.size(); i38++) {
                                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
                                long longValue2 = ((Long) arrayList.get(i38)).longValue();
                                int i39 = this.L;
                                s12.c(longValue2, i39 == 0 || i39 == 26);
                            }
                        }
                    }
                }
                if (i7 == i36) {
                    b2Var.setText(org.telegram.messenger.hd.L0(2131752246));
                } else {
                    b2Var.setText(org.telegram.messenger.hd.L0(2131752181));
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = 0;
                b2Var.setTextSize(1, 15.0f);
                linearLayout2.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView3.setVisibility(8);
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.chats_archived, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            }
        }
        z10 = false;
        StringBuilder sb222222 = new StringBuilder();
        sb222222.append((Object) b2Var.getText());
        if (textView3.getVisibility() == 0) {
        }
        sb222222.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : "");
        org.telegram.messenger.g0.i2(sb222222.toString());
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var;
        ArrayList arrayList = this.b0;
        try {
            if (this.a0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int size = arrayList.size();
                e6Var = this.W;
                if (i7 >= size) {
                    break;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(((Integer) this.c0.get(i7)).intValue(), e6Var);
                fh0 fh0Var = this.f;
                String str = (String) arrayList.get(i7);
                if (((Boolean) this.d0.get(i7)).booleanValue()) {
                    w02 |= -16777216;
                }
                fh0Var.h(w02, str);
                i7++;
            }
            Paint paint = this.F;
            int i10 = org.telegram.ui.ActionBar.j6.yj;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            this.E.setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, e6Var), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                org.telegram.ui.ActionBar.j6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var) & 587202559, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, t71 t71Var) {
        this(context, t71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 0;
        this.y = org.telegram.messenger.m10.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = org.telegram.messenger.g0.L(8.0f);
        this.h0 = 1.0f;
        this.W = e6Var;
        this.s = e2Var;
        this.S = z10;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, e6Var);
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        org.telegram.ui.ActionBar.q6.U(b2Var, i7, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.xj;
        org.telegram.ui.ActionBar.q6.G(b2Var, i10, e6Var);
        b2Var.setMovementMethod(new k41(this));
        addView(b2Var, c8.ja.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(textView, i10, e6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, c8.ja.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        fh0 fh0Var = new fh0(context);
        this.f = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.j6.wj;
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
        addView(fh0Var, c8.ja.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        i9 i9Var = new i9(context);
        this.h = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(i9Var, c8.ja.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i10, e6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, c8.ja.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new j41(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ja.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        i5.c.v(textView2, 1, 14.0f);
        org.telegram.messenger.i20.q(textView2, i10, e6Var, null, 2131743885);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        setWillNotDraw(false);
        this.V = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        setOnTouchListener(new gi.a(27));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i7, long j3) {
    }
}
