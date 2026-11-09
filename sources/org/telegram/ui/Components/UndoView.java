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
import org.telegram.ui.w71;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int i0 = 0;
    public final TextPaint D;
    public final Paint E;
    public final RectF F;
    public long G;
    public int H;
    public String I;
    public int J;
    public int K;
    public ArrayList L;
    public Runnable M;
    public Runnable N;
    public long O;
    public float P;
    public boolean Q;
    public final boolean R;
    public CharSequence S;
    public int T;
    public final ShapeDrawable U;
    public final org.telegram.ui.ActionBar.g6 V;
    public boolean W;
    public int a;
    public final ArrayList a0;
    public final org.telegram.ui.Cells.b2 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public int d0;
    public final ImageView e;
    public StaticLayout e0;
    public final dh0 f;
    public StaticLayout f0;
    public float g0;
    public final l9 h;
    public float h0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.f2 s;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.tj));
    }

    public final boolean c() {
        int i7;
        Object obj;
        int i10 = this.K;
        if (i10 == 11 || i10 == 24 || i10 == 6 || i10 == 3 || i10 == 5 || i10 == 13 || i10 == 14 || i10 == 74) {
            return true;
        }
        if ((i10 == 7 && org.telegram.messenger.qp.s1(this.y).P0.isEmpty()) || (i7 = this.K) == 83 || i7 == 85) {
            return true;
        }
        return i7 == 88 && (obj = this.x) != null && ((Integer) obj).intValue() > 0;
    }

    public void d(int i7, boolean z9) {
        if (getVisibility() == 0 && this.Q) {
            this.w = null;
            this.x = null;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z9) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z9) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i10 = this.K;
            if (i10 == 0 || i10 == 1 || i10 == 95 || i10 == 26 || i10 == 27) {
                for (int i11 = 0; i11 < this.L.size(); i11++) {
                    long longValue = ((Long) this.L.get(i11)).longValue();
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.y);
                    int i12 = this.K;
                    boolean z10 = i12 == 0 || i12 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) s12.Q.f(longValue);
                    if (dialog != null) {
                        if (z10) {
                            s12.E0.l(longValue);
                        } else {
                            s12.D0.l(longValue);
                            if (!z9) {
                                s12.y.add(dialog);
                                s12.T4(null);
                            }
                        }
                        if (!z9) {
                            s12.getNotificationCenter().k(org.telegram.messenger.qs.s, Boolean.TRUE);
                        }
                    }
                    g(this.K, longValue);
                }
            }
            boolean z11 = this.R;
            if (i7 == 0) {
                setEnterOffset((z11 ? -1.0f : 1.0f) * (this.d0 + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int i13 = 3;
            if (i7 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.d0 + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new g11(this, i13));
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.P == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.h0) + org.telegram.messenger.g0.L(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public final boolean e() {
        int i7 = this.K;
        return i7 == 12 || i7 == 15 || i7 == 24 || i7 == 74 || i7 == 83;
    }

    public final boolean f() {
        int i7 = this.K;
        return i7 == 6 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 8 || i7 == 87 || i7 == 9 || i7 == 10 || i7 == 13 || i7 == 14 || i7 == 19 || i7 == 20 || i7 == 21 || i7 == 22 || i7 == 23 || i7 == 30 || i7 == 31 || i7 == 32 || i7 == 102 || i7 == 33 || i7 == 34 || i7 == 35 || i7 == 36 || i7 == 74 || i7 == 37 || i7 == 38 || i7 == 39 || i7 == 40 || i7 == 42 || i7 == 43 || i7 == 77 || i7 == 44 || i7 == 78 || i7 == 79 || i7 == 100 || i7 == 101 || i7 == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.U;
    }

    public Object getCurrentInfoObject() {
        return this.w;
    }

    public float getEnterOffset() {
        return this.h0;
    }

    public View getUndoButton() {
        return this.n;
    }

    public final void h(int i7, int i10) {
        this.W = true;
        org.telegram.ui.ActionBar.l6.C1(-115203550, this.U);
        org.telegram.ui.Cells.b2 b2Var = this.b;
        org.telegram.ui.ActionBar.s6.q(b2Var);
        int i11 = org.telegram.ui.ActionBar.l6.uj;
        org.telegram.ui.ActionBar.g6 g6Var = this.V;
        org.telegram.ui.ActionBar.s6.G(b2Var, i11, g6Var);
        TextView textView = this.c;
        org.telegram.ui.ActionBar.s6.q(textView);
        org.telegram.ui.ActionBar.s6.G(textView, i11, g6Var);
        b2Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.a0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.c0;
        ArrayList arrayList3 = this.b0;
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
        dh0 dh0Var = this.f;
        dh0Var.h(-14540254, "info1");
        dh0Var.h(-14540254, "info2");
    }

    public final void i(int i7, String str, boolean z9) {
        ArrayList arrayList = this.a0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.c0;
        ArrayList arrayList3 = this.b0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i7));
            arrayList2.set(indexOf, Boolean.valueOf(z9));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i7));
            arrayList2.add(Boolean.valueOf(z9));
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.V;
        this.f.h(z9 ? org.telegram.ui.ActionBar.l6.w0(i7, g6Var) | (-16777216) : org.telegram.ui.ActionBar.l6.w0(i7, g6Var), str);
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
    /* JADX WARN: Removed duplicated region for block: B:596:0x174f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x17cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        MovementMethod movementMethod;
        boolean z9;
        long j3;
        int i11;
        int L;
        int i12;
        CharSequence X2;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        int i15;
        CharSequence charSequence;
        SpannableStringBuilder W2;
        SpannableStringBuilder W22;
        String L0;
        String str;
        String L02;
        String L03;
        String str2;
        int i16;
        int i17;
        LinearLayout linearLayout = this.n;
        l9 l9Var = this.h;
        int i18 = this.y;
        TextView textView = this.d;
        TextView textView2 = this.c;
        dh0 dh0Var = this.f;
        org.telegram.ui.Cells.b2 b2Var = this.b;
        if (org.telegram.messenger.g0.I3()) {
            i10 = i18;
        } else {
            int i19 = this.K;
            i10 = i18;
            if (i19 == 52 || i19 == 56 || i19 == 57 || i19 == 58 || i19 == 59 || i19 == 60 || i19 == 80 || i19 == 33) {
                return;
            }
        }
        Runnable runnable3 = this.M;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.Q = true;
        this.M = runnable;
        this.N = runnable2;
        this.L = arrayList;
        Long l10 = (Long) arrayList.get(0);
        long longValue = l10.longValue();
        this.K = i7;
        this.G = 5000L;
        this.w = obj;
        this.x = obj2;
        this.O = SystemClock.elapsedRealtime();
        textView.setText(org.telegram.messenger.id.L0(2131743885));
        this.e.setVisibility(0);
        dh0Var.setPadding(0, 0, 0, 0);
        dh0Var.setScaleX(1.0f);
        dh0Var.setScaleY(1.0f);
        b2Var.setTextSize(1, 15.0f);
        l9Var.setVisibility(8);
        b2Var.setGravity(51);
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
        layoutParams.bottomMargin = 0;
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) dh0Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(3.0f);
        layoutParams2.width = org.telegram.messenger.g0.L(54.0f);
        layoutParams2.height = -2;
        b2Var.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i7 == 83) {
            setOnClickListener(new g41(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new ei.b(27));
            movementMethod = null;
        }
        b2Var.setMovementMethod(movementMethod);
        boolean f10 = f();
        int i20 = R.raw.voip_invite;
        int i21 = 36;
        if (f10) {
            if (i7 == 83) {
                textView2.setSingleLine(false);
                X2 = org.telegram.messenger.id.L0(2131745282);
                charSequence = org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(2131745281), runnable);
                this.M = null;
                this.G = 4000L;
                i15 = R.raw.sound_download;
            } else if (i7 == 74) {
                textView2.setSingleLine(false);
                X2 = org.telegram.messenger.id.L0(2131746222);
                charSequence = org.telegram.messenger.id.Y(2131746207, "ReportSentInfo", new Object[0]);
                this.G = 4000L;
                i15 = R.raw.ic_admin;
            } else {
                if (i7 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder X22 = org.telegram.messenger.t3.W((TLRPC.Chat) obj2) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743479, "VoipChannelInvitedUser", org.telegram.messenger.t10.i(user))) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743371, "VoipGroupInvitedUser", org.telegram.messenger.t10.i(user)));
                    w8 w8Var = new w8();
                    w8Var.u(org.telegram.messenger.g0.L(12.0f));
                    w8Var.r(user);
                    l9Var.e(user, w8Var);
                    l9Var.setVisibility(0);
                    this.G = 3000L;
                    X2 = X22;
                } else if (i7 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        X2 = org.telegram.messenger.t3.W(chat) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131743450, org.telegram.messenger.t10.i(user2))) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131743427, org.telegram.messenger.t10.i(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        X2 = org.telegram.messenger.t3.W(chat) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131743487, chat2.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131743444, chat2.title));
                    } else {
                        X2 = "";
                    }
                    w8 w8Var2 = new w8();
                    w8Var2.u(org.telegram.messenger.g0.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    w8Var2.p(tLObject);
                    l9Var.e(tLObject, w8Var2);
                    l9Var.setVisibility(0);
                    this.G = 3000L;
                } else if (i7 == 37) {
                    w8 w8Var3 = new w8();
                    w8Var3.u(org.telegram.messenger.g0.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        w8Var3.r(user3);
                        l9Var.e(user3, w8Var3);
                        str2 = org.telegram.messenger.g5.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        w8Var3.q(chat3);
                        l9Var.e(chat3, w8Var3);
                        str2 = chat3.title;
                    }
                    if (org.telegram.messenger.t3.W((TLRPC.Chat) obj2)) {
                        i16 = 0;
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743451, "VoipChannelUserChanged", str2));
                    } else {
                        i16 = 0;
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743312, "VoipGroupUserChanged", str2));
                    }
                    l9Var.setVisibility(i16);
                    this.G = 3000L;
                } else {
                    if (i7 == 33) {
                        X2 = org.telegram.messenger.id.L0(2131743389);
                        this.G = 3000L;
                        i15 = R.raw.voip_invite;
                    } else {
                        if (i7 == 77) {
                            X2 = (CharSequence) obj;
                            this.G = 5000L;
                            if (this.s != null && (obj2 instanceof TLRPC.Message)) {
                                setOnTouchListener(null);
                                b2Var.setMovementMethod(null);
                                setOnClickListener(new lk(29, this, (TLRPC.Message) obj2));
                            }
                            i13 = R.raw.payment_success;
                        } else {
                            if (i7 == 30) {
                                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743314, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.t10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.G = 3000L;
                            } else if (i7 == 35) {
                                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743313, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.t10.i((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.G = 3000L;
                            } else {
                                if (i7 == 31) {
                                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743316, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.t10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.G = 3000L;
                                } else if (i7 == 38) {
                                    X2 = obj instanceof TLRPC.Chat ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743304, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131743305));
                                    this.G = 3000L;
                                    i13 = R.raw.voip_allow_talk;
                                } else if (i7 == 42) {
                                    X2 = org.telegram.messenger.t3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131743460)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131743335));
                                    this.G = 3000L;
                                    charSequence = null;
                                    i15 = R.raw.ic_mute;
                                } else if (i7 == 43) {
                                    X2 = org.telegram.messenger.t3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131743459)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131743334));
                                    this.G = 3000L;
                                    charSequence = null;
                                    i15 = R.raw.ic_unmute;
                                } else {
                                    int i22 = this.K;
                                    if (i22 == 39 || i22 == 100) {
                                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(i22 == 39 ? 2131743397 : 2131743308));
                                        this.G = 3000L;
                                        i13 = R.raw.voip_record_start;
                                    } else {
                                        if (i22 == 40 || i22 == 101) {
                                            String L04 = org.telegram.messenger.id.L0(i22 == 40 ? 2131743398 : 2131743309);
                                            this.G = 4000L;
                                            b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
                                            spannableStringBuilder = new SpannableStringBuilder(L04);
                                            int indexOf = L04.indexOf("**");
                                            int lastIndexOf = L04.lastIndexOf("**");
                                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new c41("tg://openmessage?user_id=" + org.telegram.messenger.p10.i(i10).e()), indexOf, lastIndexOf - 2, 33);
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.f(e10);
                                                }
                                            }
                                            i14 = R.raw.voip_record_saved;
                                        } else if (i7 == 36) {
                                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131743315, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.t10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            this.G = 3000L;
                                        } else if (i7 == 32 || i7 == 102) {
                                            String i23 = obj instanceof TLRPC.User ? org.telegram.messenger.t10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                            X2 = i7 == 102 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131743424, i23)) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.Z(2131743344, i23));
                                            this.G = 3000L;
                                            i13 = R.raw.ic_ban;
                                        } else {
                                            if (i7 == 9 || i7 == 10) {
                                                TLRPC.User user4 = (TLRPC.User) obj;
                                                X2 = i7 == 9 ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131751295, "EditAdminTransferChannelToast", org.telegram.messenger.t10.i(user4))) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131751294, "EditAdminTransferGroupToast", org.telegram.messenger.t10.i(user4)));
                                            } else if (i7 == 8) {
                                                X2 = org.telegram.messenger.id.Y(2131747834, "NowInContacts", org.telegram.messenger.t10.i((TLRPC.User) obj));
                                            } else if (i7 == 87) {
                                                X2 = org.telegram.messenger.id.Z(2131746610, new Object[0]);
                                            } else if (i7 == 22) {
                                                if (org.telegram.messenger.m5.E(longValue)) {
                                                    X2 = obj == null ? org.telegram.messenger.id.L0(2131748710) : org.telegram.messenger.id.L0(2131748709);
                                                } else {
                                                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(-longValue));
                                                    X2 = (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? obj == null ? org.telegram.messenger.id.L0(2131748712) : org.telegram.messenger.id.L0(2131748711) : obj == null ? org.telegram.messenger.id.L0(2131748714) : org.telegram.messenger.id.L0(2131748713);
                                                }
                                            } else if (i7 == 23) {
                                                X2 = org.telegram.messenger.id.L0(2131752195);
                                            } else if (i7 == 6) {
                                                X2 = org.telegram.messenger.id.L0(2131754169);
                                                String L05 = org.telegram.messenger.id.L0(2131754168);
                                                i15 = R.raw.chats_swipearchive;
                                                charSequence = L05;
                                                i21 = 48;
                                            } else {
                                                if (i22 == 13) {
                                                    L02 = org.telegram.messenger.id.L0(2131746444);
                                                    L03 = org.telegram.messenger.id.L0(2131746443);
                                                    i15 = R.raw.wallet_congrats;
                                                } else if (i22 == 14) {
                                                    L02 = org.telegram.messenger.id.L0(2131746442);
                                                    L03 = org.telegram.messenger.id.L0(2131746441);
                                                    i15 = R.raw.wallet_science;
                                                } else {
                                                    if (i7 == 7) {
                                                        X2 = org.telegram.messenger.id.L0(2131754152);
                                                        if (org.telegram.messenger.qp.s1(i10).P0.isEmpty()) {
                                                            L0 = org.telegram.messenger.id.L0(2131754151);
                                                            str = L0;
                                                        }
                                                        str = null;
                                                    } else if (i7 == 20 || i7 == 21) {
                                                        org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) obj2;
                                                        Spannable z52 = org.telegram.messenger.ij.z5(b2Var.getPaint().getFontMetricsInt(), org.telegram.messenger.i6.l(voVar.b, b2Var.getPaint().getFontMetricsInt(), false), voVar.c);
                                                        this.a = voVar.n ? 26 : 0;
                                                        if (longValue != 0) {
                                                            long j10 = org.telegram.messenger.m5.C(longValue) ? org.telegram.messenger.qp.s1(i10).a1(Integer.valueOf(org.telegram.messenger.m5.h(longValue))).user_id : longValue;
                                                            if (org.telegram.messenger.m5.E(j10)) {
                                                                TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(j10));
                                                                String i24 = org.telegram.messenger.t10.i(a22);
                                                                if (org.telegram.messenger.t10.B(a22)) {
                                                                    i24 = org.telegram.messenger.id.L0(2131745901);
                                                                } else if (org.telegram.messenger.t10.z(a22)) {
                                                                    i24 = org.telegram.messenger.id.L0(2131746266);
                                                                }
                                                                W22 = i7 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.id.U(2131750698, i24, z52)) : org.telegram.messenger.g0.W2(org.telegram.messenger.id.U(2131750697, i24, z52));
                                                            } else {
                                                                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-j10));
                                                                W22 = i7 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.id.U(2131750799, M02.title, z52)) : org.telegram.messenger.g0.W2(org.telegram.messenger.id.U(2131750798, M02.title, z52));
                                                            }
                                                            W2 = W22;
                                                        } else {
                                                            W2 = i7 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.id.U(2131750795, org.telegram.messenger.id.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52)) : org.telegram.messenger.g0.W2(org.telegram.messenger.id.U(2131750794, org.telegram.messenger.id.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), z52));
                                                        }
                                                        i14 = i7 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        spannableStringBuilder = W2;
                                                    } else if (i7 == 19) {
                                                        X2 = this.S;
                                                        i13 = R.raw.ic_delete;
                                                    } else if (i7 == 82) {
                                                        X2 = org.telegram.messenger.id.L0(((org.telegram.messenger.gf) obj).b ? 2131753954 : 2131753959);
                                                    } else if (i7 == 78 || i7 == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        X2 = i7 == 78 ? org.telegram.messenger.id.G(intValue, "PinnedDialogsCount", new Object[0]) : org.telegram.messenger.id.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i13 = this.K == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.G = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        X2 = i7 == 3 ? org.telegram.messenger.id.L0(2131752246) : org.telegram.messenger.id.L0(2131752181);
                                                        if (org.telegram.messenger.qp.s1(i10).P0.isEmpty()) {
                                                            L0 = org.telegram.messenger.id.L0(2131752245);
                                                            str = L0;
                                                        }
                                                        str = null;
                                                    }
                                                    charSequence = str;
                                                    i15 = R.raw.chats_infotip;
                                                }
                                                String str3 = L03;
                                                i21 = 44;
                                                X2 = L02;
                                                charSequence = str3;
                                            }
                                            charSequence = null;
                                            i15 = R.raw.contact_check;
                                        }
                                        i15 = i14;
                                        X2 = spannableStringBuilder;
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
            b2Var.setText(X2);
            if (i15 != 0) {
                dh0Var.e(i15, i21, i21);
                ah0 animatedDrawable = dh0Var.getAnimatedDrawable();
                animatedDrawable.h = false;
                animatedDrawable.P(animatedDrawable.s());
                dh0Var.setVisibility(0);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
            } else {
                dh0Var.setVisibility(8);
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
                i17 = 8;
            } else {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                i17 = 8;
                textView2.setVisibility(8);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
            }
            linearLayout.setVisibility(i17);
        } else {
            int i25 = this.K;
            if (i25 == 45 || i25 == 46 || i25 == 47 || i25 == 52 || i25 == 53 || i25 == 54 || i25 == 55 || i25 == 56 || i25 == 57 || i25 == 58 || i25 == 59 || i25 == 60 || i25 == 71 || i25 == 70 || i25 == 75 || i25 == 76 || i25 == 41 || i25 == 78 || i25 == 79 || i25 == 61 || i25 == 80) {
                this.e.setVisibility(8);
                dh0Var.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                int i26 = this.K;
                long j11 = -1;
                if (i26 == 76) {
                    b2Var.setText(org.telegram.messenger.id.L0(2131752881));
                    dh0Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    b2Var.setTextSize(1, 14.0f);
                    z9 = true;
                } else if (i26 == 75) {
                    b2Var.setText(org.telegram.messenger.id.L0(2131749559));
                    dh0Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    z9 = true;
                    b2Var.setTextSize(1, 14.0f);
                } else {
                    if (i7 != 70) {
                        if (i26 == 71) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131753855));
                            dh0Var.e(R.raw.fire_off, 36, 36);
                            b2Var.setTextSize(1, 14.0f);
                            this.G = 3000L;
                            dh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        } else if (i26 == 45) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131749244));
                            dh0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            z9 = true;
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i26 == 46) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131749243));
                            dh0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i26 == 47) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131749221));
                            dh0Var.e(R.raw.imported, 36, 36);
                            dh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(5.0f));
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i26 == 52 || i26 == 56 || i26 == 57 || i26 == 58 || i26 == 59 || i26 == 60 || i26 == 80) {
                            if (!org.telegram.messenger.g0.I3()) {
                                return;
                            }
                            int i27 = this.K;
                            if (i27 == 80) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131751203));
                            } else if (i27 == 60) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131747295));
                            } else if (i27 == 56) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131743665));
                            } else if (i27 == 57) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131749362));
                            } else if (i27 == 52) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131748589));
                            } else if (i27 == 59) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131748921));
                                dh0Var.e(i20, 30, 30);
                                this.G = 3000L;
                                b2Var.setTextSize(1, 15.0f);
                            } else {
                                b2Var.setText(org.telegram.messenger.id.L0(2131744194));
                            }
                            i20 = R.raw.copy;
                            dh0Var.e(i20, 30, 30);
                            this.G = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i26 == 54) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131752338));
                            dh0Var.e(R.raw.silent_unmute, 30, 30);
                            this.G = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i26 == 55) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131752339));
                            dh0Var.e(R.raw.silent_mute, 30, 30);
                            this.G = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i26 == 41) {
                            if (obj2 != null) {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131749187, "InvLinkToChats", org.telegram.messenger.id.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                            } else if (longValue == org.telegram.messenger.p10.i(i10).n) {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131749185)));
                            } else if (org.telegram.messenger.m5.z(longValue)) {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131749186, "InvLinkToGroup", org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-longValue)).title)));
                            } else {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131749184, "InvLinkToUser", org.telegram.messenger.t10.i(org.telegram.messenger.qp.s1(i10).a2(l10)))));
                            }
                            dh0Var.e(R.raw.contact_check, 36, 36);
                            this.G = 3000L;
                        } else if (i26 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                int intValue2 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(intValue2, "FwdMessageToManyChats", new Object[0])));
                                } else {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(intValue2, "FwdMessagesToManyChats", new Object[0])));
                                }
                                dh0Var.e(R.raw.forward, 30, 30);
                            } else if (longValue == org.telegram.messenger.p10.i(i10).n) {
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(2131750498), new vs(10)));
                                } else {
                                    b2Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.L0(2131750491), new vs(10)));
                                }
                                dh0Var.e(R.raw.saved_messages, 30, 30);
                                this.G = 3000L;
                            } else {
                                if (org.telegram.messenger.m5.z(longValue)) {
                                    TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-longValue));
                                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                    String i28 = org.telegram.messenger.t3.p0(M03) ? qg.d.i(i10, M03, false) : null;
                                    if (num.intValue() == 1) {
                                        if (i28 == null) {
                                            i28 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131750502, "FwdMessageToGroup", i28)));
                                    } else {
                                        if (i28 == null) {
                                            i28 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131750495, "FwdMessagesToGroup", i28)));
                                    }
                                } else {
                                    TLRPC.User a23 = org.telegram.messenger.qp.s1(i10).a2(l10);
                                    if (num.intValue() == 1) {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131750497, "FwdMessageToUser", org.telegram.messenger.t10.i(a23))));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131750490, "FwdMessagesToUser", org.telegram.messenger.t10.i(a23))));
                                    }
                                }
                                dh0Var.e(R.raw.forward, 30, 30);
                            }
                            j11 = 300;
                            this.G = 3000L;
                        } else {
                            int i29 = i10;
                            if (i26 == 61) {
                                if (obj2 != null) {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131753737, "BackgroundToChats", org.telegram.messenger.id.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    dh0Var.e(R.raw.forward, 30, 30);
                                } else if (longValue == org.telegram.messenger.p10.i(i29).n) {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131753735)));
                                    dh0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (org.telegram.messenger.m5.z(longValue)) {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131753736, "BackgroundToGroup", org.telegram.messenger.qp.s1(i29).M0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131753734, "BackgroundToUser", org.telegram.messenger.t10.i(org.telegram.messenger.qp.s1(i29).a2(l10)))));
                                    }
                                    dh0Var.e(R.raw.forward, 30, 30);
                                }
                                this.G = 3000L;
                            }
                        }
                        j3 = j11;
                        i11 = 8;
                        z9 = false;
                        textView2.setVisibility(i11);
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.uj, this.V);
                        linearLayout.setVisibility(i11);
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                        dh0Var.setProgress(0.0f);
                        dh0Var.d();
                        if (j3 > 0) {
                            dh0Var.postDelayed(new kr0(this, 26), j3);
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
                            measureChildWithMargins(textView2, org.telegram.messenger.camera.q.c(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            this.r = org.telegram.messenger.g0.L(37.0f) + textView2.getMeasuredHeight();
                        } else if (c()) {
                            this.r = org.telegram.messenger.g0.L(52.0f);
                        } else if (getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                            if (measuredWidth2 <= 0) {
                                measuredWidth2 = org.telegram.messenger.g0.q.x;
                            }
                            measureChildWithMargins(b2Var, org.telegram.messenger.camera.q.c(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            int measuredHeight = b2Var.getMeasuredHeight();
                            int i30 = this.K;
                            int L2 = org.telegram.messenger.g0.L((i30 == 16 || i30 == 17 || i30 == 18 || i30 == 84 || i30 == 86) ? 14.0f : 28.0f) + measuredHeight;
                            this.r = L2;
                            int i31 = this.K;
                            if (i31 == 18) {
                                this.r = Math.max(L2, org.telegram.messenger.g0.L(52.0f));
                            } else if (i31 == 25) {
                                this.r = Math.max(L2, org.telegram.messenger.g0.L(50.0f));
                            } else if (z9) {
                                this.r = L2 - org.telegram.messenger.g0.L(8.0f);
                            }
                        }
                        if (getVisibility() == 0) {
                            setVisibility(0);
                            setEnterOffset((this.R ? -1.0f : 1.0f) * (this.d0 + this.r));
                            AnimatorSet animatorSet = new AnimatorSet();
                            boolean z10 = this.R;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z10 ? -1.0f : 1.0f) * (this.d0 + this.r), z10 ? 1.0f : -1.0f));
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                            return;
                        }
                        return;
                    }
                    int intValue3 = ((Integer) obj2).intValue();
                    textView2.setSingleLine(false);
                    b2Var.setText(org.telegram.messenger.id.Y(2131753854, "AutoDeleteHintOnText", org.telegram.messenger.id.c0(intValue3)));
                    dh0Var.e(R.raw.fire_on, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    this.G = 4000L;
                    dh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    j3 = -1;
                    i11 = 8;
                    z9 = true;
                    textView2.setVisibility(i11);
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.uj, this.V);
                    linearLayout.setVisibility(i11);
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    dh0Var.setProgress(0.0f);
                    dh0Var.d();
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
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.uj, this.V);
                linearLayout.setVisibility(i11);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
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
            } else if (i25 == 24 || i25 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                this.e.setVisibility(8);
                dh0Var.setVisibility(0);
                if (intValue4 != 0) {
                    b2Var.setTypeface(org.telegram.messenger.g0.o());
                    b2Var.setTextSize(1, 14.0f);
                    dh0Var.a.clear();
                    int i32 = org.telegram.ui.ActionBar.l6.vj;
                    i(i32, "BODY", false);
                    i(i32, "Wibe Big", false);
                    i(i32, "Wibe Big 3", false);
                    i(i32, "Wibe Small", false);
                    b2Var.setText(org.telegram.messenger.id.L0(2131746616));
                    dh0Var.e(R.raw.ic_unmute, 28, 28);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(3);
                    if (user5 != null) {
                        textView2.setText(org.telegram.messenger.id.Y(2131746614, "ProximityAlertSetInfoUser", org.telegram.messenger.t10.i(user5), org.telegram.messenger.id.y(intValue4, 2, null)));
                    } else {
                        textView2.setText(org.telegram.messenger.id.Y(2131746615, "ProximityAlertSetInfoGroup2", org.telegram.messenger.id.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                } else {
                    b2Var.setTypeface(Typeface.DEFAULT);
                    b2Var.setTextSize(1, 15.0f);
                    dh0Var.a.clear();
                    int i33 = org.telegram.ui.ActionBar.l6.vj;
                    i(i33, "Body Main", false);
                    i(i33, "Body Top", false);
                    i(i33, "Line", false);
                    i(i33, "Curve Big", false);
                    i(i33, "Curve Small", false);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    b2Var.setText(org.telegram.messenger.id.L0(2131746617));
                    dh0Var.e(R.raw.ic_mute, 28, 28);
                    textView2.setVisibility(8);
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.uj, this.V);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
            } else if (i25 == 11) {
                b2Var.setText(org.telegram.messenger.id.L0(2131753886));
                dh0Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                textView2.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.p7, this.V);
                this.e.setVisibility(8);
                linearLayout.setVisibility(0);
                dh0Var.setVisibility(0);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
            } else if (i25 == 15) {
                this.G = 10000L;
                textView.setText(org.telegram.messenger.id.L0(2131747817));
                b2Var.setText(org.telegram.messenger.id.L0(2131750802));
                dh0Var.e(R.raw.filter_new, 36, 36);
                int L3 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = L3;
                String L06 = org.telegram.messenger.id.L0(2131750803);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L06);
                int indexOf2 = L06.indexOf(42);
                int lastIndexOf2 = L06.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new c41("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
                dh0Var.setVisibility(0);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
            } else if (i25 == 16 || i25 == 17) {
                this.G = 4000L;
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setMinHeight(org.telegram.messenger.g0.L(30.0f));
                String str4 = (String) obj;
                if ("🎲".equals(str4)) {
                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131751450)));
                    dh0Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str4)) {
                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131751678)));
                    } else {
                        String i34 = rf.b.i("DiceEmojiInfo_", str4);
                        String b10 = org.telegram.messenger.id.E0().Y.b(i34);
                        if (b10 == null) {
                            org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
                            E0.i();
                            b10 = E0.W.b(i34);
                        }
                        if (TextUtils.isEmpty(b10)) {
                            b2Var.setText(org.telegram.messenger.i6.l(org.telegram.messenger.id.Y(2131751451, "DiceEmojiInfo", str4), b2Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            b2Var.setText(org.telegram.messenger.i6.l(b10, b2Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    dh0Var.setImageDrawable(org.telegram.messenger.i6.g(str4));
                    dh0Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.width = org.telegram.messenger.g0.L(26.0f);
                    layoutParams2.height = org.telegram.messenger.g0.L(26.0f);
                }
                textView.setText(org.telegram.messenger.id.L0(2131745627));
                if (this.K == 16) {
                    L = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                    textView.setVisibility(0);
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.uj, this.V);
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
                dh0Var.setVisibility(0);
            } else if (i25 == 18) {
                this.G = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
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
                dh0Var.setVisibility(0);
                dh0Var.e(R.raw.chats_infotip, 36, 36);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
                b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
            } else if (i25 == 12) {
                b2Var.setText(org.telegram.messenger.id.L0(2131752010));
                dh0Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(48.0f);
                String L07 = org.telegram.messenger.id.L0(2131752009);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L07);
                int indexOf3 = L07.indexOf(42);
                int lastIndexOf3 = L07.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new c41("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView2.setText(spannableStringBuilder3);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                textView.setVisibility(8);
                linearLayout.setVisibility(0);
                dh0Var.setVisibility(0);
            } else if (i25 == 84) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.L0(2131743855)));
                dh0Var.setVisibility(0);
                dh0Var.e(R.raw.voice_to_text, 36, 36);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
                textView.setText(org.telegram.messenger.id.L0(2131747033));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                int L5 = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                l9Var.setVisibility(8);
                textView2.setVisibility(8);
                textView.setVisibility(0);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
            } else if (i25 == 85) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                b2Var.setText(org.telegram.messenger.id.L0(2131744306));
                dh0Var.setVisibility(0);
                dh0Var.e(R.raw.hint_swipe_reply, 64, 64);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
                textView2.setVisibility(0);
                textView2.setText(org.telegram.messenger.id.L0(2131744305));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.height = -2;
                l9Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i25 == 90 || i25 == 91 || i25 == 92 || i25 == 93 || i25 == 94) {
                switch (i25) {
                    case org.telegram.messenger.qs.b1 /* 90 */:
                        b2Var.setText(org.telegram.messenger.id.G((int) wg.r.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.qs.c1 /* 91 */:
                        b2Var.setText(org.telegram.messenger.id.L0(2131753272));
                        break;
                    case org.telegram.messenger.qs.d1 /* 92 */:
                        b2Var.setText(org.telegram.messenger.id.G((int) org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).p0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.qs.e1 /* 93 */:
                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).r0, "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case org.telegram.messenger.qs.f1 /* 94 */:
                        b2Var.setText(org.telegram.messenger.id.L0(2131753333));
                        break;
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                dh0Var.setVisibility(0);
                dh0Var.e(R.raw.chats_infotip, 36, 36);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
            } else {
                if (i25 == 2) {
                    i12 = 2;
                } else if (i25 == 4) {
                    i12 = 2;
                } else if (i7 == 82) {
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    b2Var.setText(org.telegram.messenger.id.L0(gfVar.b ? 2131753954 : 2131753959));
                    linearLayout.setVisibility(0);
                    b2Var.setTextSize(1, 15.0f);
                    b2Var.setTypeface(Typeface.DEFAULT);
                    textView2.setVisibility(8);
                    l9Var.setVisibility(0);
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                    String str5 = gfVar.c;
                    if (str5 != null) {
                        l9Var.h(str5, null, org.telegram.ui.ActionBar.l6.R4);
                    } else if (gfVar.I != null) {
                        l9Var.s(gfVar.J, gfVar.K, true);
                        if (gfVar.b) {
                            l9Var.h("vthumb://" + gfVar.C + ":" + gfVar.I, null, org.telegram.ui.ActionBar.l6.R4);
                        } else {
                            l9Var.h("thumb://" + gfVar.C + ":" + gfVar.I, null, org.telegram.ui.ActionBar.l6.R4);
                        }
                    } else {
                        l9Var.setImageDrawable(org.telegram.ui.ActionBar.l6.R4);
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
                    dh0Var.setVisibility(8);
                    int i35 = this.K;
                    if (i35 == 88) {
                        String str6 = (String) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (intValue5 > 0) {
                            int L6 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                            layoutParams.leftMargin = org.telegram.messenger.g0.L(48.0f);
                            layoutParams.rightMargin = L6;
                            layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                            layoutParams3.leftMargin = org.telegram.messenger.g0.L(48.0f);
                            layoutParams3.rightMargin = L6;
                            b2Var.setText(org.telegram.messenger.id.Y(2131750663, "FolderLinkDeletedTitle", str6));
                            b2Var.setTypeface(org.telegram.messenger.g0.o());
                            textView2.setVisibility(0);
                            textView2.setText(org.telegram.messenger.id.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                        } else {
                            b2Var.setTypeface(typeface);
                            if (str6 == null) {
                                str6 = "";
                            }
                            b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.Y(2131750667, "FolderLinkDeleted", str6.replace('*', (char) 10033))));
                        }
                    } else if (i35 == 81 || i35 == 0 || i35 == 26) {
                        b2Var.setText(org.telegram.messenger.id.L0(2131749293));
                    } else if (i35 == 27) {
                        b2Var.setText(org.telegram.messenger.id.L0(2131752180));
                    } else if (i35 == 95) {
                        if (org.telegram.messenger.m5.z(longValue)) {
                            TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-longValue));
                            if (org.telegram.messenger.t3.p0(M04)) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131748349));
                            } else if (!org.telegram.messenger.t3.T(M04) || M04.megagroup) {
                                b2Var.setText(org.telegram.messenger.id.L0(2131749430));
                            } else {
                                b2Var.setText(org.telegram.messenger.id.L0(2131752388));
                            }
                        } else {
                            b2Var.setText(org.telegram.messenger.id.L0(2131752242));
                        }
                    } else if (org.telegram.messenger.m5.z(longValue)) {
                        TLRPC.Chat M05 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-longValue));
                        if (org.telegram.messenger.t3.p0(M05)) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131748349));
                        } else if (!org.telegram.messenger.t3.T(M05) || M05.megagroup) {
                            b2Var.setText(org.telegram.messenger.id.L0(2131749449));
                        } else {
                            b2Var.setText(org.telegram.messenger.id.L0(2131752417));
                        }
                    } else {
                        b2Var.setText(org.telegram.messenger.id.L0(2131752242));
                    }
                    if (this.K != 81) {
                        for (int i36 = 0; i36 < arrayList.size(); i36++) {
                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                            long longValue2 = ((Long) arrayList.get(i36)).longValue();
                            int i37 = this.K;
                            s12.c(longValue2, i37 == 0 || i37 == 26);
                        }
                    }
                }
                if (i7 == i12) {
                    b2Var.setText(org.telegram.messenger.id.L0(2131752246));
                } else {
                    b2Var.setText(org.telegram.messenger.id.L0(2131752181));
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = 0;
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                dh0Var.setVisibility(0);
                dh0Var.e(R.raw.chats_archived, 36, 36);
                dh0Var.setProgress(0.0f);
                dh0Var.d();
            }
        }
        z9 = false;
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
        float f10 = this.P;
        ShapeDrawable shapeDrawable = this.U;
        if (f10 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.h0) + this.d0 + org.telegram.messenger.g0.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i7 = this.K;
        if (i7 == 1 || i7 == 95 || i7 == 0 || i7 == 27 || i7 == 26 || i7 == 81 || i7 == 88) {
            int ceil = this.G > 0 ? (int) Math.ceil(r10 / 1000.0f) : 0;
            int i10 = this.H;
            TextPaint textPaint = this.D;
            if (i10 != ceil) {
                this.H = ceil;
                this.I = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.e0;
                if (staticLayout != null) {
                    this.f0 = staticLayout;
                    this.g0 = 0.0f;
                }
                this.J = (int) Math.ceil(textPaint.measureText(r2));
                this.e0 = new StaticLayout(this.I, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f11 = this.g0;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.g0 = f12;
                if (f12 > 1.0f) {
                    this.g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f13 = this.g0;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (org.telegram.messenger.g0.L(10.0f) * this.g0) + org.telegram.messenger.g0.L(17.2f));
                    this.f0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.e0 != null) {
                float f14 = this.g0;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), com.google.android.recaptcha.internal.a.v(1.0f, this.g0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(17.2f)));
                this.e0.draw(canvas);
                if (this.g0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.G / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.G - (elapsedRealtime - this.O);
        this.G = j3;
        this.O = elapsedRealtime;
        if (j3 <= 0) {
            d(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.P != f10) {
            this.P = f10;
            setTranslationY(((this.h0 - this.d0) + org.telegram.messenger.g0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.h0 != f10) {
            this.h0 = f10;
            setTranslationY(((f10 - this.d0) + org.telegram.messenger.g0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i7) {
        this.d0 = i7;
    }

    public void setHideAnimationType(int i7) {
        this.T = i7;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var;
        ArrayList arrayList = this.a0;
        try {
            if (this.W) {
                return;
            }
            int i7 = 0;
            while (true) {
                int size = arrayList.size();
                g6Var = this.V;
                if (i7 >= size) {
                    break;
                }
                int w02 = org.telegram.ui.ActionBar.l6.w0(((Integer) this.b0.get(i7)).intValue(), g6Var);
                dh0 dh0Var = this.f;
                String str = (String) arrayList.get(i7);
                if (((Boolean) this.c0.get(i7)).booleanValue()) {
                    w02 |= -16777216;
                }
                dh0Var.h(w02, str);
                i7++;
            }
            Paint paint = this.E;
            int i10 = org.telegram.ui.ActionBar.l6.vj;
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
            this.D.setColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
            org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, g6Var), this.U);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                org.telegram.ui.ActionBar.l6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.uj, g6Var) & 587202559, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, w71 w71Var) {
        this(context, w71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 0;
        this.y = org.telegram.messenger.p10.s0;
        this.K = -1;
        this.T = 1;
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = org.telegram.messenger.g0.L(8.0f);
        this.g0 = 1.0f;
        this.V = g6Var;
        this.s = f2Var;
        this.R = z9;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, g6Var);
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.l6.vj;
        org.telegram.ui.ActionBar.s6.U(b2Var, i7, g6Var);
        int i10 = org.telegram.ui.ActionBar.l6.uj;
        org.telegram.ui.ActionBar.s6.G(b2Var, i10, g6Var);
        b2Var.setMovementMethod(new h41(this));
        addView(b2Var, c8.ha.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        org.telegram.ui.ActionBar.s6.G(textView, i10, g6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, c8.ha.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        dh0 dh0Var = new dh0(context);
        this.f = dh0Var;
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.l6.tj;
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
        addView(dh0Var, c8.ha.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        l9 l9Var = new l9(context);
        this.h = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(l9Var, c8.ha.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i10, g6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new g41(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, c8.ha.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        com.google.android.recaptcha.internal.a.q(textView2, 1, 14.0f);
        org.telegram.messenger.camera.q.o(textView2, i10, g6Var, null, 2131743885);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        setOnTouchListener(new ei.b(26));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i7, long j3) {
    }
}
