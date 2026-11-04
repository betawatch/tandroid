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
import org.telegram.ui.l71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final k9 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.d2 s;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
    }

    public final boolean c() {
        int i3;
        Object obj;
        int i10 = this.L;
        if (i10 == 11 || i10 == 24 || i10 == 6 || i10 == 3 || i10 == 5 || i10 == 13 || i10 == 14 || i10 == 74) {
            return true;
        }
        if ((i10 == 7 && org.telegram.messenger.hp.s1(this.y).Q0.isEmpty()) || (i3 = this.L) == 83 || i3 == 85) {
            return true;
        }
        return i3 == 88 && (obj = this.x) != null && ((Integer) obj).intValue() > 0;
    }

    public void d(int i3, boolean z10) {
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
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.y);
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
                                s12.T4(null);
                            }
                        }
                        if (!z10) {
                            s12.getNotificationCenter().k(org.telegram.messenger.hs.s, Boolean.TRUE);
                        }
                    }
                    g(this.L, longValue);
                }
            }
            int i13 = 4;
            boolean z12 = this.S;
            if (i3 == 0) {
                setEnterOffset((z12 ? -1.0f : 1.0f) * (this.e0 + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i3 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z12 ? -1.0f : 1.0f) * (this.e0 + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new j01(this, i13));
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
        int i3 = this.L;
        return i3 == 12 || i3 == 15 || i3 == 24 || i3 == 74 || i3 == 83;
    }

    public final boolean f() {
        int i3 = this.L;
        return i3 == 6 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 8 || i3 == 87 || i3 == 9 || i3 == 10 || i3 == 13 || i3 == 14 || i3 == 19 || i3 == 20 || i3 == 21 || i3 == 22 || i3 == 23 || i3 == 30 || i3 == 31 || i3 == 32 || i3 == 102 || i3 == 33 || i3 == 34 || i3 == 35 || i3 == 36 || i3 == 74 || i3 == 37 || i3 == 38 || i3 == 39 || i3 == 40 || i3 == 42 || i3 == 43 || i3 == 77 || i3 == 44 || i3 == 78 || i3 == 79 || i3 == 100 || i3 == 101 || i3 == 83;
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

    public final void h(int i3, int i10) {
        this.a0 = true;
        org.telegram.ui.ActionBar.k6.C1(-115203550, this.V);
        org.telegram.ui.Cells.b2 b2Var = this.b;
        org.telegram.ui.ActionBar.r6.r(b2Var);
        int i11 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.e6 e6Var = this.W;
        org.telegram.ui.ActionBar.r6.H(b2Var, i11, e6Var);
        TextView textView = this.c;
        org.telegram.ui.ActionBar.r6.r(textView);
        org.telegram.ui.ActionBar.r6.H(textView, i11, e6Var);
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

    public final void i(int i3, String str, boolean z10) {
        ArrayList arrayList = this.b0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.d0;
        ArrayList arrayList3 = this.c0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i3));
            arrayList2.set(indexOf, Boolean.valueOf(z10));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i3));
            arrayList2.add(Boolean.valueOf(z10));
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.W;
        this.f.h(z10 ? org.telegram.ui.ActionBar.k6.w0(i3, e6Var) | (-16777216) : org.telegram.ui.ActionBar.k6.w0(i3, e6Var), str);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i3, long j10, Runnable runnable) {
        k(j10, i3, null, null, runnable, null);
    }

    public void k(long j10, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i3, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i3, Runnable runnable, Runnable runnable2) {
        k(j10, i3, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i3) {
        k(j10, i3, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x176d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x178f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x187c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x1751  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x17ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        MovementMethod movementMethod;
        boolean z10;
        long j10;
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
        int i16;
        String str2;
        int i17;
        int i18;
        LinearLayout linearLayout = this.n;
        k9 k9Var = this.h;
        int i19 = this.y;
        TextView textView = this.d;
        TextView textView2 = this.c;
        fh0 fh0Var = this.f;
        org.telegram.ui.Cells.b2 b2Var = this.b;
        if (org.telegram.messenger.g0.I3()) {
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
        this.L = i3;
        this.H = 5000L;
        this.w = obj;
        this.x = obj2;
        this.P = SystemClock.elapsedRealtime();
        textView.setText(org.telegram.messenger.bd.L0(2131743895));
        this.e.setVisibility(0);
        fh0Var.setPadding(0, 0, 0, 0);
        fh0Var.setScaleX(1.0f);
        fh0Var.setScaleY(1.0f);
        b2Var.setTextSize(1, 15.0f);
        k9Var.setVisibility(8);
        b2Var.setGravity(51);
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(58.0f);
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
        if ((runnable == null && runnable2 == null) || i3 == 83) {
            setOnClickListener(new z31(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new fi.a(27));
            movementMethod = null;
        }
        b2Var.setMovementMethod(movementMethod);
        boolean f10 = f();
        int i21 = R.raw.voip_invite;
        int i22 = 36;
        if (f10) {
            if (i3 == 83) {
                textView2.setSingleLine(false);
                X2 = org.telegram.messenger.bd.L0(2131745292);
                charSequence = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.L0(2131745291), runnable);
                this.N = null;
                this.H = 4000L;
                i15 = R.raw.sound_download;
            } else if (i3 == 74) {
                textView2.setSingleLine(false);
                X2 = org.telegram.messenger.bd.L0(2131746232);
                charSequence = org.telegram.messenger.bd.Y(2131746217, "ReportSentInfo", new Object[0]);
                this.H = 4000L;
                i15 = R.raw.ic_admin;
            } else {
                if (i3 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder X22 = org.telegram.messenger.t3.W((TLRPC.Chat) obj2) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743489, "VoipChannelInvitedUser", org.telegram.messenger.l10.i(user))) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743381, "VoipGroupInvitedUser", org.telegram.messenger.l10.i(user)));
                    u8 u8Var = new u8();
                    u8Var.u(org.telegram.messenger.g0.L(12.0f));
                    u8Var.r(user);
                    k9Var.e(user, u8Var);
                    k9Var.setVisibility(0);
                    this.H = 3000L;
                    X2 = X22;
                } else if (i3 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        X2 = org.telegram.messenger.t3.W(chat) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131743460, org.telegram.messenger.l10.i(user2))) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131743437, org.telegram.messenger.l10.i(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        X2 = org.telegram.messenger.t3.W(chat) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131743497, chat2.title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131743454, chat2.title));
                    } else {
                        X2 = "";
                    }
                    u8 u8Var2 = new u8();
                    u8Var2.u(org.telegram.messenger.g0.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    u8Var2.p(tLObject);
                    k9Var.e(tLObject, u8Var2);
                    k9Var.setVisibility(0);
                    this.H = 3000L;
                } else if (i3 == 37) {
                    u8 u8Var3 = new u8();
                    u8Var3.u(org.telegram.messenger.g0.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        u8Var3.r(user3);
                        k9Var.e(user3, u8Var3);
                        str2 = org.telegram.messenger.g5.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        u8Var3.q(chat3);
                        k9Var.e(chat3, u8Var3);
                        str2 = chat3.title;
                    }
                    if (org.telegram.messenger.t3.W((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743461, "VoipChannelUserChanged", str2));
                    } else {
                        i17 = 0;
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743322, "VoipGroupUserChanged", str2));
                    }
                    k9Var.setVisibility(i17);
                    this.H = 3000L;
                } else {
                    if (i3 == 33) {
                        X2 = org.telegram.messenger.bd.L0(2131743399);
                        this.H = 3000L;
                        i15 = R.raw.voip_invite;
                    } else {
                        if (i3 == 77) {
                            X2 = (CharSequence) obj;
                            this.H = 5000L;
                            if (this.s != null && (obj2 instanceof TLRPC.Message)) {
                                setOnTouchListener(null);
                                b2Var.setMovementMethod(null);
                                setOnClickListener(new ux0(5, (Object) this, obj2));
                            }
                            i13 = R.raw.payment_success;
                        } else {
                            if (i3 == 30) {
                                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743324, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.l10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.H = 3000L;
                            } else if (i3 == 35) {
                                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743323, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.l10.i((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.H = 3000L;
                            } else {
                                if (i3 == 31) {
                                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743326, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.l10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.H = 3000L;
                                } else if (i3 == 38) {
                                    X2 = obj instanceof TLRPC.Chat ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743314, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131743315));
                                    this.H = 3000L;
                                    i13 = R.raw.voip_allow_talk;
                                } else if (i3 == 42) {
                                    X2 = org.telegram.messenger.t3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131743470)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131743345));
                                    this.H = 3000L;
                                    charSequence = null;
                                    i15 = R.raw.ic_mute;
                                } else if (i3 == 43) {
                                    X2 = org.telegram.messenger.t3.W((TLRPC.Chat) obj) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131743469)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131743344));
                                    this.H = 3000L;
                                    charSequence = null;
                                    i15 = R.raw.ic_unmute;
                                } else {
                                    int i23 = this.L;
                                    if (i23 == 39 || i23 == 100) {
                                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(i23 == 39 ? 2131743407 : 2131743318));
                                        this.H = 3000L;
                                        i13 = R.raw.voip_record_start;
                                    } else {
                                        if (i23 == 40 || i23 == 101) {
                                            String L04 = org.telegram.messenger.bd.L0(i23 == 40 ? 2131743408 : 2131743319);
                                            this.H = 4000L;
                                            b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
                                            spannableStringBuilder = new SpannableStringBuilder(L04);
                                            int indexOf = L04.indexOf("**");
                                            int lastIndexOf = L04.lastIndexOf("**");
                                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new v31("tg://openmessage?user_id=" + org.telegram.messenger.h10.i(i10).e()), indexOf, lastIndexOf - 2, 33);
                                                } catch (Exception e10) {
                                                    org.telegram.messenger.a8.f(e10);
                                                }
                                            }
                                            i14 = R.raw.voip_record_saved;
                                        } else if (i3 == 36) {
                                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131743325, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.l10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            this.H = 3000L;
                                        } else if (i3 == 32 || i3 == 102) {
                                            String i24 = obj instanceof TLRPC.User ? org.telegram.messenger.l10.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                            X2 = i3 == 102 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131743434, i24)) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Z(2131743354, i24));
                                            this.H = 3000L;
                                            i13 = R.raw.ic_ban;
                                        } else {
                                            if (i3 == 9 || i3 == 10) {
                                                TLRPC.User user4 = (TLRPC.User) obj;
                                                X2 = i3 == 9 ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131751296, "EditAdminTransferChannelToast", org.telegram.messenger.l10.i(user4))) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131751295, "EditAdminTransferGroupToast", org.telegram.messenger.l10.i(user4)));
                                            } else if (i3 == 8) {
                                                X2 = org.telegram.messenger.bd.Y(2131747842, "NowInContacts", org.telegram.messenger.l10.i((TLRPC.User) obj));
                                            } else if (i3 == 87) {
                                                X2 = org.telegram.messenger.bd.Z(2131746618, new Object[0]);
                                            } else if (i3 == 22) {
                                                if (org.telegram.messenger.m5.E(longValue)) {
                                                    X2 = obj == null ? org.telegram.messenger.bd.L0(2131748718) : org.telegram.messenger.bd.L0(2131748717);
                                                } else {
                                                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(-longValue));
                                                    X2 = (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? obj == null ? org.telegram.messenger.bd.L0(2131748720) : org.telegram.messenger.bd.L0(2131748719) : obj == null ? org.telegram.messenger.bd.L0(2131748722) : org.telegram.messenger.bd.L0(2131748721);
                                                }
                                            } else if (i3 == 23) {
                                                X2 = org.telegram.messenger.bd.L0(2131752195);
                                            } else if (i3 == 6) {
                                                X2 = org.telegram.messenger.bd.L0(2131754169);
                                                charSequence = org.telegram.messenger.bd.L0(2131754168);
                                                i15 = R.raw.chats_swipearchive;
                                                i22 = 48;
                                            } else {
                                                if (i23 == 13) {
                                                    L02 = org.telegram.messenger.bd.L0(2131746452);
                                                    L03 = org.telegram.messenger.bd.L0(2131746451);
                                                    i16 = R.raw.wallet_congrats;
                                                } else if (i23 == 14) {
                                                    L02 = org.telegram.messenger.bd.L0(2131746450);
                                                    L03 = org.telegram.messenger.bd.L0(2131746449);
                                                    i16 = R.raw.wallet_science;
                                                } else {
                                                    if (i3 == 7) {
                                                        X2 = org.telegram.messenger.bd.L0(2131754152);
                                                        if (org.telegram.messenger.hp.s1(i10).Q0.isEmpty()) {
                                                            L0 = org.telegram.messenger.bd.L0(2131754151);
                                                            str = L0;
                                                        }
                                                        str = null;
                                                    } else if (i3 == 20 || i3 == 21) {
                                                        org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) obj2;
                                                        Spannable A5 = org.telegram.messenger.zi.A5(b2Var.getPaint().getFontMetricsInt(), org.telegram.messenger.i6.l(moVar.b, b2Var.getPaint().getFontMetricsInt(), false), moVar.c);
                                                        this.a = moVar.n ? 26 : 0;
                                                        if (longValue != 0) {
                                                            long j11 = org.telegram.messenger.m5.C(longValue) ? org.telegram.messenger.hp.s1(i10).a1(Integer.valueOf(org.telegram.messenger.m5.h(longValue))).user_id : longValue;
                                                            if (org.telegram.messenger.m5.E(j11)) {
                                                                TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(j11));
                                                                String i25 = org.telegram.messenger.l10.i(a22);
                                                                if (org.telegram.messenger.l10.B(a22)) {
                                                                    i25 = org.telegram.messenger.bd.L0(2131745911);
                                                                } else if (org.telegram.messenger.l10.z(a22)) {
                                                                    i25 = org.telegram.messenger.bd.L0(2131746274);
                                                                }
                                                                W22 = i3 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.bd.U(2131750699, i25, A5)) : org.telegram.messenger.g0.W2(org.telegram.messenger.bd.U(2131750698, i25, A5));
                                                            } else {
                                                                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-j11));
                                                                W22 = i3 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.bd.U(2131750800, M02.title, A5)) : org.telegram.messenger.g0.W2(org.telegram.messenger.bd.U(2131750799, M02.title, A5));
                                                            }
                                                            W2 = W22;
                                                        } else {
                                                            W2 = i3 == 20 ? org.telegram.messenger.g0.W2(org.telegram.messenger.bd.U(2131750796, org.telegram.messenger.bd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), A5)) : org.telegram.messenger.g0.W2(org.telegram.messenger.bd.U(2131750795, org.telegram.messenger.bd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), A5));
                                                        }
                                                        i14 = i3 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        spannableStringBuilder = W2;
                                                    } else if (i3 == 19) {
                                                        X2 = this.T;
                                                        i13 = R.raw.ic_delete;
                                                    } else if (i3 == 82) {
                                                        X2 = org.telegram.messenger.bd.L0(((org.telegram.messenger.ye) obj).b ? 2131753954 : 2131753959);
                                                    } else if (i3 == 78 || i3 == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        X2 = i3 == 78 ? org.telegram.messenger.bd.G(intValue, "PinnedDialogsCount", new Object[0]) : org.telegram.messenger.bd.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i13 = this.L == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.H = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        X2 = i3 == 3 ? org.telegram.messenger.bd.L0(2131752246) : org.telegram.messenger.bd.L0(2131752181);
                                                        if (org.telegram.messenger.hp.s1(i10).Q0.isEmpty()) {
                                                            L0 = org.telegram.messenger.bd.L0(2131752245);
                                                            str = L0;
                                                        }
                                                        str = null;
                                                    }
                                                    charSequence = str;
                                                    i15 = R.raw.chats_infotip;
                                                }
                                                i22 = 44;
                                                X2 = L02;
                                                charSequence = L03;
                                                i15 = i16;
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
                fh0Var.e(i15, i22, i22);
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
            int i26 = this.L;
            if (i26 == 45 || i26 == 46 || i26 == 47 || i26 == 52 || i26 == 53 || i26 == 54 || i26 == 55 || i26 == 56 || i26 == 57 || i26 == 58 || i26 == 59 || i26 == 60 || i26 == 71 || i26 == 70 || i26 == 75 || i26 == 76 || i26 == 41 || i26 == 78 || i26 == 79 || i26 == 61 || i26 == 80) {
                this.e.setVisibility(8);
                fh0Var.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                int i27 = this.L;
                long j12 = -1;
                if (i27 == 76) {
                    b2Var.setText(org.telegram.messenger.bd.L0(2131752881));
                    fh0Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    b2Var.setTextSize(1, 14.0f);
                    z10 = true;
                } else if (i27 == 75) {
                    b2Var.setText(org.telegram.messenger.bd.L0(2131749567));
                    fh0Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    z10 = true;
                    b2Var.setTextSize(1, 14.0f);
                } else {
                    if (i3 != 70) {
                        if (i27 == 71) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131753855));
                            fh0Var.e(R.raw.fire_off, 36, 36);
                            b2Var.setTextSize(1, 14.0f);
                            this.H = 3000L;
                            fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(4.0f));
                        } else if (i27 == 45) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131749252));
                            fh0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            z10 = true;
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i27 == 46) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131749251));
                            fh0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i27 == 47) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131749229));
                            fh0Var.e(R.raw.imported, 36, 36);
                            fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(5.0f));
                            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i27 == 52 || i27 == 56 || i27 == 57 || i27 == 58 || i27 == 59 || i27 == 60 || i27 == 80) {
                            if (!org.telegram.messenger.g0.I3()) {
                                return;
                            }
                            int i28 = this.L;
                            if (i28 == 80) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131751204));
                            } else if (i28 == 60) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131747303));
                            } else if (i28 == 56) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131743675));
                            } else if (i28 == 57) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131749370));
                            } else if (i28 == 52) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131748597));
                            } else if (i28 == 59) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131748929));
                                fh0Var.e(i21, 30, 30);
                                this.H = 3000L;
                                b2Var.setTextSize(1, 15.0f);
                            } else {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131744204));
                            }
                            i21 = R.raw.copy;
                            fh0Var.e(i21, 30, 30);
                            this.H = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i27 == 54) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131752338));
                            fh0Var.e(R.raw.silent_unmute, 30, 30);
                            this.H = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i27 == 55) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131752339));
                            fh0Var.e(R.raw.silent_mute, 30, 30);
                            this.H = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i27 == 41) {
                            if (obj2 != null) {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131749195, "InvLinkToChats", org.telegram.messenger.bd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                            } else if (longValue == org.telegram.messenger.h10.i(i10).n) {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131749193)));
                            } else if (org.telegram.messenger.m5.z(longValue)) {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131749194, "InvLinkToGroup", org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-longValue)).title)));
                            } else {
                                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131749192, "InvLinkToUser", org.telegram.messenger.l10.i(org.telegram.messenger.hp.s1(i10).a2(l10)))));
                            }
                            fh0Var.e(R.raw.contact_check, 36, 36);
                            this.H = 3000L;
                        } else if (i27 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                int intValue2 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(intValue2, "FwdMessageToManyChats", new Object[0])));
                                } else {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(intValue2, "FwdMessagesToManyChats", new Object[0])));
                                }
                                fh0Var.e(R.raw.forward, 30, 30);
                            } else if (longValue == org.telegram.messenger.h10.i(i10).n) {
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.L0(2131750506), new go(12)));
                                } else {
                                    b2Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.L0(2131750499), new go(12)));
                                }
                                fh0Var.e(R.raw.saved_messages, 30, 30);
                                this.H = 3000L;
                            } else {
                                if (org.telegram.messenger.m5.z(longValue)) {
                                    TLRPC.Chat M03 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-longValue));
                                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                    String i29 = org.telegram.messenger.t3.p0(M03) ? rg.c.i(i10, M03, false) : null;
                                    if (num.intValue() == 1) {
                                        if (i29 == null) {
                                            i29 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131750510, "FwdMessageToGroup", i29)));
                                    } else {
                                        if (i29 == null) {
                                            i29 = tL_forumTopic != null ? tL_forumTopic.title : M03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131750503, "FwdMessagesToGroup", i29)));
                                    }
                                } else {
                                    TLRPC.User a23 = org.telegram.messenger.hp.s1(i10).a2(l10);
                                    if (num.intValue() == 1) {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131750505, "FwdMessageToUser", org.telegram.messenger.l10.i(a23))));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131750498, "FwdMessagesToUser", org.telegram.messenger.l10.i(a23))));
                                    }
                                }
                                fh0Var.e(R.raw.forward, 30, 30);
                            }
                            j12 = 300;
                            this.H = 3000L;
                        } else {
                            int i30 = i10;
                            if (i27 == 61) {
                                if (obj2 != null) {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131753737, "BackgroundToChats", org.telegram.messenger.bd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    fh0Var.e(R.raw.forward, 30, 30);
                                } else if (longValue == org.telegram.messenger.h10.i(i30).n) {
                                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131753735)));
                                    fh0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (org.telegram.messenger.m5.z(longValue)) {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131753736, "BackgroundToGroup", org.telegram.messenger.hp.s1(i30).M0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131753734, "BackgroundToUser", org.telegram.messenger.l10.i(org.telegram.messenger.hp.s1(i30).a2(l10)))));
                                    }
                                    fh0Var.e(R.raw.forward, 30, 30);
                                }
                                this.H = 3000L;
                            }
                        }
                        j10 = j12;
                        i11 = 8;
                        z10 = false;
                        textView2.setVisibility(i11);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.uj, this.W);
                        linearLayout.setVisibility(i11);
                        layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                        fh0Var.setProgress(0.0f);
                        fh0Var.d();
                        if (j10 > 0) {
                            fh0Var.postDelayed(new sp0(this, 27), j10);
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
                            int i31 = this.L;
                            int L2 = org.telegram.messenger.g0.L((i31 == 16 || i31 == 17 || i31 == 18 || i31 == 84 || i31 == 86) ? 14.0f : 28.0f) + measuredHeight;
                            this.r = L2;
                            int i32 = this.L;
                            if (i32 == 18) {
                                this.r = Math.max(L2, org.telegram.messenger.g0.L(52.0f));
                            } else if (i32 == 25) {
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
                    b2Var.setText(org.telegram.messenger.bd.Y(2131753854, "AutoDeleteHintOnText", org.telegram.messenger.bd.c0(intValue3)));
                    fh0Var.e(R.raw.fire_on, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f);
                    this.H = 4000L;
                    fh0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    j10 = -1;
                    i11 = 8;
                    z10 = true;
                    textView2.setVisibility(i11);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.uj, this.W);
                    linearLayout.setVisibility(i11);
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
                    if (j10 > 0) {
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
                j10 = -1;
                i11 = 8;
                textView2.setVisibility(i11);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.uj, this.W);
                linearLayout.setVisibility(i11);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                if (j10 > 0) {
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
            } else if (i26 == 24 || i26 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                this.e.setVisibility(8);
                fh0Var.setVisibility(0);
                if (intValue4 != 0) {
                    b2Var.setTypeface(org.telegram.messenger.g0.o());
                    b2Var.setTextSize(1, 14.0f);
                    fh0Var.a.clear();
                    int i33 = org.telegram.ui.ActionBar.k6.vj;
                    i(i33, "BODY", false);
                    i(i33, "Wibe Big", false);
                    i(i33, "Wibe Big 3", false);
                    i(i33, "Wibe Small", false);
                    b2Var.setText(org.telegram.messenger.bd.L0(2131746624));
                    fh0Var.e(R.raw.ic_unmute, 28, 28);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(3);
                    if (user5 != null) {
                        textView2.setText(org.telegram.messenger.bd.Y(2131746622, "ProximityAlertSetInfoUser", org.telegram.messenger.l10.i(user5), org.telegram.messenger.bd.y(intValue4, 2, null)));
                    } else {
                        textView2.setText(org.telegram.messenger.bd.Y(2131746623, "ProximityAlertSetInfoGroup2", org.telegram.messenger.bd.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                } else {
                    b2Var.setTypeface(Typeface.DEFAULT);
                    b2Var.setTextSize(1, 15.0f);
                    fh0Var.a.clear();
                    int i34 = org.telegram.ui.ActionBar.k6.vj;
                    i(i34, "Body Main", false);
                    i(i34, "Body Top", false);
                    i(i34, "Line", false);
                    i(i34, "Curve Big", false);
                    i(i34, "Curve Small", false);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    b2Var.setText(org.telegram.messenger.bd.L0(2131746625));
                    fh0Var.e(R.raw.ic_mute, 28, 28);
                    textView2.setVisibility(8);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.uj, this.W);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else if (i26 == 11) {
                b2Var.setText(org.telegram.messenger.bd.L0(2131753886));
                fh0Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                textView2.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, this.W);
                this.e.setVisibility(8);
                linearLayout.setVisibility(0);
                fh0Var.setVisibility(0);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else if (i26 == 15) {
                this.H = 10000L;
                textView.setText(org.telegram.messenger.bd.L0(2131747825));
                b2Var.setText(org.telegram.messenger.bd.L0(2131750803));
                fh0Var.e(R.raw.filter_new, 36, 36);
                int L3 = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = L3;
                String L05 = org.telegram.messenger.bd.L0(2131750804);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L05);
                int indexOf2 = L05.indexOf(42);
                int lastIndexOf2 = L05.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new v31("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
                fh0Var.setVisibility(0);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else if (i26 == 16 || i26 == 17) {
                this.H = 4000L;
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setMinHeight(org.telegram.messenger.g0.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131751451)));
                    fh0Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131751679)));
                    } else {
                        String f11 = t4.c.f("DiceEmojiInfo_", str3);
                        String b10 = org.telegram.messenger.bd.E0().Y.b(f11);
                        if (b10 == null) {
                            org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
                            E0.i();
                            b10 = E0.W.b(f11);
                        }
                        if (TextUtils.isEmpty(b10)) {
                            b2Var.setText(org.telegram.messenger.i6.l(org.telegram.messenger.bd.Y(2131751452, "DiceEmojiInfo", str3), b2Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            b2Var.setText(org.telegram.messenger.i6.l(b10, b2Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    fh0Var.setImageDrawable(org.telegram.messenger.i6.g(str3));
                    fh0Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(14.0f);
                    layoutParams2.width = org.telegram.messenger.g0.L(26.0f);
                    layoutParams2.height = org.telegram.messenger.g0.L(26.0f);
                }
                textView.setText(org.telegram.messenger.bd.L0(2131745637));
                if (this.L == 16) {
                    L = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                    textView.setVisibility(0);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.uj, this.W);
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
                fh0Var.setVisibility(0);
            } else if (i26 == 18) {
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
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.chats_infotip, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                b2Var.setMovementMethod(new org.telegram.messenger.c0(0));
            } else if (i26 == 12) {
                b2Var.setText(org.telegram.messenger.bd.L0(2131752010));
                fh0Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(48.0f);
                String L06 = org.telegram.messenger.bd.L0(2131752009);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L06);
                int indexOf3 = L06.indexOf(42);
                int lastIndexOf3 = L06.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new v31("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView2.setText(spannableStringBuilder3);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                textView.setVisibility(8);
                linearLayout.setVisibility(0);
                fh0Var.setVisibility(0);
            } else if (i26 == 84) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
                b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.L0(2131743865)));
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.voice_to_text, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                textView.setText(org.telegram.messenger.bd.L0(2131747041));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                int L5 = org.telegram.messenger.g0.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                k9Var.setVisibility(8);
                textView2.setVisibility(8);
                textView.setVisibility(0);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
            } else if (i26 == 85) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(org.telegram.messenger.g0.o());
                b2Var.setText(org.telegram.messenger.bd.L0(2131744316));
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.hint_swipe_reply, 64, 64);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
                textView2.setVisibility(0);
                textView2.setText(org.telegram.messenger.bd.L0(2131744315));
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.topMargin = org.telegram.messenger.g0.L(6.0f);
                layoutParams.height = -2;
                k9Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i26 == 90 || i26 == 91 || i26 == 92 || i26 == 93 || i26 == 94) {
                switch (i26) {
                    case org.telegram.messenger.hs.b1 /* 90 */:
                        b2Var.setText(org.telegram.messenger.bd.G((int) xg.s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.hs.c1 /* 91 */:
                        b2Var.setText(org.telegram.messenger.bd.L0(2131753272));
                        break;
                    case org.telegram.messenger.hs.d1 /* 92 */:
                        b2Var.setText(org.telegram.messenger.bd.G((int) org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.hs.e1 /* 93 */:
                        b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G((int) org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).s0, "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case org.telegram.messenger.hs.f1 /* 94 */:
                        b2Var.setText(org.telegram.messenger.bd.L0(2131753333));
                        break;
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.chats_infotip, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
            } else {
                if (i26 == 2) {
                    i12 = 2;
                } else if (i26 == 4) {
                    i12 = 2;
                } else if (i3 == 82) {
                    layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    b2Var.setText(org.telegram.messenger.bd.L0(yeVar.b ? 2131753954 : 2131753959));
                    linearLayout.setVisibility(0);
                    b2Var.setTextSize(1, 15.0f);
                    b2Var.setTypeface(Typeface.DEFAULT);
                    textView2.setVisibility(8);
                    k9Var.setVisibility(0);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                    String str4 = yeVar.c;
                    if (str4 != null) {
                        k9Var.h(str4, null, org.telegram.ui.ActionBar.k6.R4);
                    } else if (yeVar.I != null) {
                        k9Var.s(yeVar.J, yeVar.K, true);
                        if (yeVar.b) {
                            k9Var.h("vthumb://" + yeVar.C + ":" + yeVar.I, null, org.telegram.ui.ActionBar.k6.R4);
                        } else {
                            k9Var.h("thumb://" + yeVar.C + ":" + yeVar.I, null, org.telegram.ui.ActionBar.k6.R4);
                        }
                    } else {
                        k9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
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
                    fh0Var.setVisibility(8);
                    int i35 = this.L;
                    if (i35 == 88) {
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
                            b2Var.setText(org.telegram.messenger.bd.Y(2131750664, "FolderLinkDeletedTitle", str5));
                            b2Var.setTypeface(org.telegram.messenger.g0.o());
                            textView2.setVisibility(0);
                            textView2.setText(org.telegram.messenger.bd.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                        } else {
                            b2Var.setTypeface(typeface);
                            if (str5 == null) {
                                str5 = "";
                            }
                            b2Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.Y(2131750668, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                        }
                    } else if (i35 == 81 || i35 == 0 || i35 == 26) {
                        b2Var.setText(org.telegram.messenger.bd.L0(2131749301));
                    } else if (i35 == 27) {
                        b2Var.setText(org.telegram.messenger.bd.L0(2131752180));
                    } else if (i35 == 95) {
                        if (org.telegram.messenger.m5.z(longValue)) {
                            TLRPC.Chat M04 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-longValue));
                            if (org.telegram.messenger.t3.p0(M04)) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131748357));
                            } else if (!org.telegram.messenger.t3.T(M04) || M04.megagroup) {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131749438));
                            } else {
                                b2Var.setText(org.telegram.messenger.bd.L0(2131752388));
                            }
                        } else {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131752242));
                        }
                    } else if (org.telegram.messenger.m5.z(longValue)) {
                        TLRPC.Chat M05 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-longValue));
                        if (org.telegram.messenger.t3.p0(M05)) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131748357));
                        } else if (!org.telegram.messenger.t3.T(M05) || M05.megagroup) {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131749457));
                        } else {
                            b2Var.setText(org.telegram.messenger.bd.L0(2131752417));
                        }
                    } else {
                        b2Var.setText(org.telegram.messenger.bd.L0(2131752242));
                    }
                    if (this.L != 81) {
                        for (int i36 = 0; i36 < arrayList.size(); i36++) {
                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
                            long longValue2 = ((Long) arrayList.get(i36)).longValue();
                            int i37 = this.L;
                            s12.c(longValue2, i37 == 0 || i37 == 26);
                        }
                    }
                }
                if (i3 == i12) {
                    b2Var.setText(org.telegram.messenger.bd.L0(2131752246));
                } else {
                    b2Var.setText(org.telegram.messenger.bd.L0(2131752181));
                }
                layoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.g0.L(13.0f);
                layoutParams.rightMargin = 0;
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                fh0Var.setVisibility(0);
                fh0Var.e(R.raw.chats_archived, 36, 36);
                fh0Var.setProgress(0.0f);
                fh0Var.d();
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
        int i3 = this.L;
        if (i3 == 1 || i3 == 95 || i3 == 0 || i3 == 27 || i3 == 26 || i3 == 81 || i3 == 88) {
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
                canvas.translate(rectF.centerX() - (this.K / 2), a1.g.D(1.0f, this.h0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(17.2f)));
                this.f0.draw(canvas);
                if (this.h0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.H / 5000.0f) * (-360.0f), false, this.F);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.H - (elapsedRealtime - this.P);
        this.H = j10;
        this.P = elapsedRealtime;
        if (j10 <= 0) {
            d(this.U, true);
        }
        if (this.L != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
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

    public void setEnterOffsetMargin(int i3) {
        this.e0 = i3;
    }

    public void setHideAnimationType(int i3) {
        this.U = i3;
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
            int i3 = 0;
            while (true) {
                int size = arrayList.size();
                e6Var = this.W;
                if (i3 >= size) {
                    break;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) this.c0.get(i3)).intValue(), e6Var);
                fh0 fh0Var = this.f;
                String str = (String) arrayList.get(i3);
                if (((Boolean) this.d0.get(i3)).booleanValue()) {
                    w02 |= -16777216;
                }
                fh0Var.h(w02, str);
                i3++;
            }
            Paint paint = this.F;
            int i10 = org.telegram.ui.ActionBar.k6.vj;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            this.E.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, e6Var), this.V);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                org.telegram.ui.ActionBar.k6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var) & 587202559, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, l71 l71Var) {
        this(context, l71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 0;
        this.y = org.telegram.messenger.h10.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = org.telegram.messenger.g0.L(8.0f);
        this.h0 = 1.0f;
        this.W = e6Var;
        this.s = d2Var;
        this.S = z10;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, e6Var);
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        org.telegram.ui.ActionBar.r6.V(b2Var, i3, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.r6.H(b2Var, i10, e6Var);
        b2Var.setMovementMethod(new a41(this));
        addView(b2Var, b8.mf.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(textView, i10, e6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, b8.mf.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        fh0 fh0Var = new fh0(context);
        this.f = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.k6.tj;
        i(i11, "info1", true);
        i(i11, "info2", true);
        i(i3, "luc12", false);
        i(i3, "luc11", false);
        i(i3, "luc10", false);
        i(i3, "luc9", false);
        i(i3, "luc8", false);
        i(i3, "luc7", false);
        i(i3, "luc6", false);
        i(i3, "luc5", false);
        i(i3, "luc4", false);
        i(i3, "luc3", false);
        i(i3, "luc2", false);
        i(i3, "luc1", false);
        i(i3, "Oval", false);
        addView(fh0Var, b8.mf.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.h = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(k9Var, b8.mf.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new z31(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, b8.mf.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        k2.p1.t(textView2, 1, 14.0f);
        org.telegram.messenger.camera.q.o(textView2, i10, e6Var, null, 2131743895);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        setWillNotDraw(false);
        this.V = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        setOnTouchListener(new fi.a(26));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i3, long j10) {
    }
}
