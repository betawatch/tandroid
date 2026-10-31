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
import org.telegram.ui.m91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
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
    public final org.telegram.ui.ActionBar.p6 V;
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
    public final ei0 f;
    public StaticLayout f0;
    public float g0;
    public final g9 h;
    public float h0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.k2 s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
    }

    public final boolean c() {
        int i10;
        Object obj;
        int i11 = this.K;
        if (i11 == 11 || i11 == 24 || i11 == 6 || i11 == 3 || i11 == 5 || i11 == 13 || i11 == 14 || i11 == 74) {
            return true;
        }
        if ((i11 == 7 && org.telegram.messenger.vp.r1(this.y).P0.isEmpty()) || (i10 = this.K) == 83 || i10 == 85) {
            return true;
        }
        return i10 == 88 && (obj = this.x) != null && ((Integer) obj).intValue() > 0;
    }

    public void d(int i10, boolean z10) {
        if (getVisibility() == 0 && this.Q) {
            this.w = null;
            this.x = null;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i11 = this.K;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.L.size(); i12++) {
                    long longValue = ((Long) this.L.get(i12)).longValue();
                    org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.y);
                    int i13 = this.K;
                    boolean z11 = i13 == 0 || i13 == 26;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) r12.Q.f(longValue);
                    if (dialog != null) {
                        if (z11) {
                            r12.E0.l(longValue);
                        } else {
                            r12.D0.l(longValue);
                            if (!z10) {
                                r12.y.add(dialog);
                                r12.Q4(null);
                            }
                        }
                        if (!z10) {
                            r12.getNotificationCenter().k(org.telegram.messenger.zs.s, Boolean.TRUE);
                        }
                    }
                    g(this.K, longValue);
                }
            }
            int i14 = 4;
            boolean z12 = this.R;
            if (i10 == 0) {
                setEnterOffset((z12 ? -1.0f : 1.0f) * (this.d0 + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i10 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z12 ? -1.0f : 1.0f) * (this.d0 + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new p11(this, i14));
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
        float measuredHeight = (getMeasuredHeight() - this.h0) + org.telegram.messenger.i0.L(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public final boolean e() {
        int i10 = this.K;
        return i10 == 12 || i10 == 15 || i10 == 24 || i10 == 74 || i10 == 83;
    }

    public final boolean f() {
        int i10 = this.K;
        return i10 == 6 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 87 || i10 == 9 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 19 || i10 == 20 || i10 == 21 || i10 == 22 || i10 == 23 || i10 == 30 || i10 == 31 || i10 == 32 || i10 == 102 || i10 == 33 || i10 == 34 || i10 == 35 || i10 == 36 || i10 == 74 || i10 == 37 || i10 == 38 || i10 == 39 || i10 == 40 || i10 == 42 || i10 == 43 || i10 == 77 || i10 == 44 || i10 == 78 || i10 == 79 || i10 == 100 || i10 == 101 || i10 == 83;
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

    public final void h(int i10, int i11) {
        this.W = true;
        org.telegram.ui.ActionBar.t6.C1(-115203550, this.U);
        org.telegram.ui.Cells.b2 b2Var = this.b;
        org.telegram.ui.ActionBar.a7.r(b2Var);
        int i12 = org.telegram.ui.ActionBar.t6.uj;
        org.telegram.ui.ActionBar.p6 p6Var = this.V;
        org.telegram.ui.ActionBar.a7.H(b2Var, i12, p6Var);
        TextView textView = this.c;
        org.telegram.ui.ActionBar.a7.r(textView);
        org.telegram.ui.ActionBar.a7.H(textView, i12, p6Var);
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
        ei0 ei0Var = this.f;
        ei0Var.h(-14540254, "info1");
        ei0Var.h(-14540254, "info2");
    }

    public final void i(int i10, String str, boolean z10) {
        ArrayList arrayList = this.a0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.c0;
        ArrayList arrayList3 = this.b0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i10));
            arrayList2.set(indexOf, Boolean.valueOf(z10));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i10));
            arrayList2.add(Boolean.valueOf(z10));
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.V;
        this.f.h(z10 ? org.telegram.ui.ActionBar.t6.w0(i10, p6Var) | (-16777216) : org.telegram.ui.ActionBar.t6.w0(i10, p6Var), str);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i10, long j10, Runnable runnable) {
        k(j10, i10, null, null, runnable, null);
    }

    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i10, Runnable runnable, Runnable runnable2) {
        k(j10, i10, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i10) {
        k(j10, i10, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x1764  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1786  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x1873  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x1749  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x17c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        MovementMethod movementMethod;
        boolean z10;
        long j10;
        int i12;
        int L;
        int i13;
        CharSequence W2;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int i16;
        CharSequence charSequence;
        SpannableStringBuilder V2;
        SpannableStringBuilder V22;
        String K0;
        String str;
        String str2;
        int i17;
        int i18;
        LinearLayout linearLayout = this.n;
        g9 g9Var = this.h;
        int i19 = this.y;
        TextView textView = this.d;
        TextView textView2 = this.c;
        ei0 ei0Var = this.f;
        org.telegram.ui.Cells.b2 b2Var = this.b;
        if (org.telegram.messenger.i0.H3()) {
            i11 = i19;
        } else {
            int i20 = this.K;
            i11 = i19;
            if (i20 == 52 || i20 == 56 || i20 == 57 || i20 == 58 || i20 == 59 || i20 == 60 || i20 == 80 || i20 == 33) {
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
        Long l4 = (Long) arrayList.get(0);
        long longValue = l4.longValue();
        this.K = i10;
        this.G = 5000L;
        this.w = obj;
        this.x = obj2;
        this.O = SystemClock.elapsedRealtime();
        textView.setText(org.telegram.messenger.cd.K0(2131743910));
        this.e.setVisibility(0);
        ei0Var.setPadding(0, 0, 0, 0);
        ei0Var.setScaleX(1.0f);
        ei0Var.setScaleY(1.0f);
        b2Var.setTextSize(1, 15.0f);
        g9Var.setVisibility(8);
        b2Var.setGravity(51);
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.i0.L(13.0f);
        layoutParams.bottomMargin = 0;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ei0Var.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = org.telegram.messenger.i0.L(3.0f);
        layoutParams2.width = org.telegram.messenger.i0.L(54.0f);
        layoutParams2.height = -2;
        b2Var.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i10 == 83) {
            setOnClickListener(new i51(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new org.telegram.ui.ActionBar.n2(26));
            movementMethod = null;
        }
        b2Var.setMovementMethod(movementMethod);
        boolean f7 = f();
        int i21 = R.raw.voip_invite;
        int i22 = 36;
        if (f7) {
            if (i10 == 83) {
                textView2.setSingleLine(false);
                W2 = org.telegram.messenger.cd.K0(2131745300);
                charSequence = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.K0(2131745299), runnable);
                this.M = null;
                this.G = 4000L;
                i16 = R.raw.sound_download;
            } else if (i10 == 74) {
                textView2.setSingleLine(false);
                W2 = org.telegram.messenger.cd.K0(2131746239);
                charSequence = org.telegram.messenger.cd.Y(2131746224, "ReportSentInfo", new Object[0]);
                this.G = 4000L;
                i16 = R.raw.ic_admin;
            } else {
                if (i10 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    SpannableStringBuilder W22 = org.telegram.messenger.w3.W((TLRPC.Chat) obj2) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743505, "VoipChannelInvitedUser", org.telegram.messenger.h20.i(user))) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743397, "VoipGroupInvitedUser", org.telegram.messenger.h20.i(user)));
                    r8 r8Var = new r8();
                    r8Var.u(org.telegram.messenger.i0.L(12.0f));
                    r8Var.r(user);
                    g9Var.e(user, r8Var);
                    g9Var.setVisibility(0);
                    this.G = 3000L;
                    W2 = W22;
                } else if (i10 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        W2 = org.telegram.messenger.w3.W(chat) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131743476, org.telegram.messenger.h20.i(user2))) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131743453, org.telegram.messenger.h20.i(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        W2 = org.telegram.messenger.w3.W(chat) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131743513, chat2.title)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131743470, chat2.title));
                    } else {
                        W2 = "";
                    }
                    r8 r8Var2 = new r8();
                    r8Var2.u(org.telegram.messenger.i0.L(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    r8Var2.p(tLObject);
                    g9Var.e(tLObject, r8Var2);
                    g9Var.setVisibility(0);
                    this.G = 3000L;
                } else if (i10 == 37) {
                    r8 r8Var3 = new r8();
                    r8Var3.u(org.telegram.messenger.i0.L(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        r8Var3.r(user3);
                        g9Var.e(user3, r8Var3);
                        str2 = org.telegram.messenger.i5.n(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        r8Var3.q(chat3);
                        g9Var.e(chat3, r8Var3);
                        str2 = chat3.title;
                    }
                    if (org.telegram.messenger.w3.W((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743477, "VoipChannelUserChanged", str2));
                    } else {
                        i17 = 0;
                        W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743338, "VoipGroupUserChanged", str2));
                    }
                    g9Var.setVisibility(i17);
                    this.G = 3000L;
                } else {
                    if (i10 == 33) {
                        W2 = org.telegram.messenger.cd.K0(2131743415);
                        this.G = 3000L;
                        i16 = R.raw.voip_invite;
                    } else {
                        int i23 = 22;
                        if (i10 == 77) {
                            W2 = (CharSequence) obj;
                            this.G = 5000L;
                            if (this.s != null && (obj2 instanceof TLRPC.Message)) {
                                setOnTouchListener(null);
                                b2Var.setMovementMethod(null);
                                setOnClickListener(new sr(i23, this, (TLRPC.Message) obj2));
                            }
                            i14 = R.raw.payment_success;
                        } else {
                            if (i10 == 30) {
                                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743340, "VoipGroupUserCantNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.h20.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                this.G = 3000L;
                            } else if (i10 == 35) {
                                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743339, "VoipGroupUserCantNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.h20.i((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                this.G = 3000L;
                            } else {
                                if (i10 == 31) {
                                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743342, "VoipGroupUserCanNowSpeak", obj instanceof TLRPC.User ? org.telegram.messenger.h20.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                    this.G = 3000L;
                                } else if (i10 == 38) {
                                    W2 = obj instanceof TLRPC.Chat ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743330, "VoipGroupYouCanNowSpeakIn", ((TLRPC.Chat) obj).title)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131743331));
                                    this.G = 3000L;
                                    i14 = R.raw.voip_allow_talk;
                                } else if (i10 == 42) {
                                    W2 = org.telegram.messenger.w3.W((TLRPC.Chat) obj) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131743486)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131743361));
                                    this.G = 3000L;
                                    charSequence = null;
                                    i16 = R.raw.ic_mute;
                                } else if (i10 == 43) {
                                    W2 = org.telegram.messenger.w3.W((TLRPC.Chat) obj) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131743485)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131743360));
                                    this.G = 3000L;
                                    charSequence = null;
                                    i16 = R.raw.ic_unmute;
                                } else {
                                    int i24 = this.K;
                                    if (i24 == 39 || i24 == 100) {
                                        W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(i24 == 39 ? 2131743423 : 2131743334));
                                        this.G = 3000L;
                                        i14 = R.raw.voip_record_start;
                                    } else {
                                        if (i24 == 40 || i24 == 101) {
                                            String K02 = org.telegram.messenger.cd.K0(i24 == 40 ? 2131743424 : 2131743335);
                                            this.G = 4000L;
                                            b2Var.setMovementMethod(new org.telegram.messenger.e0(0));
                                            spannableStringBuilder = new SpannableStringBuilder(K02);
                                            int indexOf = K02.indexOf("**");
                                            int lastIndexOf = K02.lastIndexOf("**");
                                            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                                try {
                                                    spannableStringBuilder.setSpan(new e51("tg://openmessage?user_id=" + org.telegram.messenger.d20.i(i11).e()), indexOf, lastIndexOf - 2, 33);
                                                } catch (Exception e) {
                                                    org.telegram.messenger.f8.f(e);
                                                }
                                            }
                                            i15 = R.raw.voip_record_saved;
                                        } else if (i10 == 36) {
                                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131743341, "VoipGroupUserCanNowSpeakForYou", obj instanceof TLRPC.User ? org.telegram.messenger.h20.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                            this.G = 3000L;
                                        } else if (i10 == 32 || i10 == 102) {
                                            String i25 = obj instanceof TLRPC.User ? org.telegram.messenger.h20.i((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                            W2 = i10 == 102 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131743450, i25)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Z(2131743370, i25));
                                            this.G = 3000L;
                                            i14 = R.raw.ic_ban;
                                        } else {
                                            if (i10 == 9 || i10 == 10) {
                                                TLRPC.User user4 = (TLRPC.User) obj;
                                                W2 = i10 == 9 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131751296, "EditAdminTransferChannelToast", org.telegram.messenger.h20.i(user4))) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131751295, "EditAdminTransferGroupToast", org.telegram.messenger.h20.i(user4)));
                                            } else if (i10 == 8) {
                                                W2 = org.telegram.messenger.cd.Y(2131747850, "NowInContacts", org.telegram.messenger.h20.i((TLRPC.User) obj));
                                            } else if (i10 == 87) {
                                                W2 = org.telegram.messenger.cd.Z(2131746625, new Object[0]);
                                            } else if (i10 == 22) {
                                                if (org.telegram.messenger.o5.E(longValue)) {
                                                    W2 = obj == null ? org.telegram.messenger.cd.K0(2131748721) : org.telegram.messenger.cd.K0(2131748720);
                                                } else {
                                                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(-longValue));
                                                    W2 = (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? obj == null ? org.telegram.messenger.cd.K0(2131748723) : org.telegram.messenger.cd.K0(2131748722) : obj == null ? org.telegram.messenger.cd.K0(2131748725) : org.telegram.messenger.cd.K0(2131748724);
                                                }
                                            } else if (i10 == 23) {
                                                W2 = org.telegram.messenger.cd.K0(2131752195);
                                            } else if (i10 == 6) {
                                                W2 = org.telegram.messenger.cd.K0(2131754169);
                                                charSequence = org.telegram.messenger.cd.K0(2131754168);
                                                i16 = R.raw.chats_swipearchive;
                                                i22 = 48;
                                            } else {
                                                if (i24 == 13) {
                                                    W2 = org.telegram.messenger.cd.K0(2131746459);
                                                    charSequence = org.telegram.messenger.cd.K0(2131746458);
                                                    i16 = R.raw.wallet_congrats;
                                                } else if (i24 == 14) {
                                                    W2 = org.telegram.messenger.cd.K0(2131746457);
                                                    charSequence = org.telegram.messenger.cd.K0(2131746456);
                                                    i16 = R.raw.wallet_science;
                                                } else {
                                                    if (i10 == 7) {
                                                        W2 = org.telegram.messenger.cd.K0(2131754152);
                                                        if (org.telegram.messenger.vp.r1(i11).P0.isEmpty()) {
                                                            K0 = org.telegram.messenger.cd.K0(2131754151);
                                                            str = K0;
                                                        }
                                                        str = null;
                                                    } else if (i10 == 20 || i10 == 21) {
                                                        org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) obj2;
                                                        Spannable y52 = org.telegram.messenger.jj.y5(b2Var.getPaint().getFontMetricsInt(), org.telegram.messenger.k6.l(apVar.b, b2Var.getPaint().getFontMetricsInt(), false), apVar.c);
                                                        this.a = apVar.n ? 26 : 0;
                                                        if (longValue != 0) {
                                                            long j11 = org.telegram.messenger.o5.C(longValue) ? org.telegram.messenger.vp.r1(i11).Z0(Integer.valueOf(org.telegram.messenger.o5.h(longValue))).user_id : longValue;
                                                            if (org.telegram.messenger.o5.E(j11)) {
                                                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(j11));
                                                                String i26 = org.telegram.messenger.h20.i(Z1);
                                                                if (org.telegram.messenger.h20.B(Z1)) {
                                                                    i26 = org.telegram.messenger.cd.K0(2131745918);
                                                                } else if (org.telegram.messenger.h20.z(Z1)) {
                                                                    i26 = org.telegram.messenger.cd.K0(2131746281);
                                                                }
                                                                V22 = i10 == 20 ? org.telegram.messenger.i0.V2(org.telegram.messenger.cd.U(2131750699, i26, y52)) : org.telegram.messenger.i0.V2(org.telegram.messenger.cd.U(2131750698, i26, y52));
                                                            } else {
                                                                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-j11));
                                                                V22 = i10 == 20 ? org.telegram.messenger.i0.V2(org.telegram.messenger.cd.U(2131750800, L02.title, y52)) : org.telegram.messenger.i0.V2(org.telegram.messenger.cd.U(2131750799, L02.title, y52));
                                                            }
                                                            V2 = V22;
                                                        } else {
                                                            V2 = i10 == 20 ? org.telegram.messenger.i0.V2(org.telegram.messenger.cd.U(2131750796, org.telegram.messenger.cd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y52)) : org.telegram.messenger.i0.V2(org.telegram.messenger.cd.U(2131750795, org.telegram.messenger.cd.G(((Integer) obj).intValue(), "ChatsSelected", new Object[0]), y52));
                                                        }
                                                        i15 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                        spannableStringBuilder = V2;
                                                    } else if (i10 == 19) {
                                                        W2 = this.S;
                                                        i14 = R.raw.ic_delete;
                                                    } else if (i10 == 82) {
                                                        W2 = org.telegram.messenger.cd.K0(((org.telegram.messenger.ef) obj).b ? 2131753954 : 2131753959);
                                                    } else if (i10 == 78 || i10 == 79) {
                                                        int intValue = ((Integer) obj).intValue();
                                                        W2 = i10 == 78 ? org.telegram.messenger.cd.G(intValue, "PinnedDialogsCount", new Object[0]) : org.telegram.messenger.cd.G(intValue, "UnpinnedDialogsCount", new Object[0]);
                                                        i14 = this.K == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                        if (obj2 instanceof Integer) {
                                                            this.G = ((Integer) obj2).intValue();
                                                        }
                                                    } else {
                                                        W2 = i10 == 3 ? org.telegram.messenger.cd.K0(2131752246) : org.telegram.messenger.cd.K0(2131752181);
                                                        if (org.telegram.messenger.vp.r1(i11).P0.isEmpty()) {
                                                            K0 = org.telegram.messenger.cd.K0(2131752245);
                                                            str = K0;
                                                        }
                                                        str = null;
                                                    }
                                                    charSequence = str;
                                                    i16 = R.raw.chats_infotip;
                                                }
                                                i22 = 44;
                                            }
                                            charSequence = null;
                                            i16 = R.raw.contact_check;
                                        }
                                        i16 = i15;
                                        W2 = spannableStringBuilder;
                                    }
                                }
                                i16 = R.raw.voip_unmuted;
                            }
                            i16 = R.raw.voip_muted;
                        }
                        i16 = i14;
                    }
                    charSequence = null;
                }
                charSequence = null;
                i16 = 0;
            }
            b2Var.setText(W2);
            if (i16 != 0) {
                ei0Var.e(i16, i22, i22);
                bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
                animatedDrawable.h = false;
                animatedDrawable.P(animatedDrawable.s());
                ei0Var.setVisibility(0);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
            } else {
                ei0Var.setVisibility(8);
            }
            if (charSequence != null) {
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(8.0f);
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.i0.o());
                i18 = 8;
            } else {
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.i0.L(13.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                i18 = 8;
                textView2.setVisibility(8);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
            }
            linearLayout.setVisibility(i18);
        } else {
            int i27 = this.K;
            if (i27 == 45 || i27 == 46 || i27 == 47 || i27 == 52 || i27 == 53 || i27 == 54 || i27 == 55 || i27 == 56 || i27 == 57 || i27 == 58 || i27 == 59 || i27 == 60 || i27 == 71 || i27 == 70 || i27 == 75 || i27 == 76 || i27 == 41 || i27 == 78 || i27 == 79 || i27 == 61 || i27 == 80) {
                this.e.setVisibility(8);
                ei0Var.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                int i28 = this.K;
                long j12 = -1;
                if (i28 == 76) {
                    b2Var.setText(org.telegram.messenger.cd.K0(2131752881));
                    ei0Var.e(R.raw.gigagroup_convert, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f);
                    b2Var.setTextSize(1, 14.0f);
                    z10 = true;
                } else if (i28 == 75) {
                    b2Var.setText(org.telegram.messenger.cd.K0(2131749568));
                    ei0Var.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f);
                    z10 = true;
                    b2Var.setTextSize(1, 14.0f);
                } else {
                    if (i10 != 70) {
                        if (i28 == 71) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131753855));
                            ei0Var.e(R.raw.fire_off, 36, 36);
                            b2Var.setTextSize(1, 14.0f);
                            this.G = 3000L;
                            ei0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(4.0f));
                        } else if (i28 == 45) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131749253));
                            ei0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f);
                            z10 = true;
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i28 == 46) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131749252));
                            ei0Var.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i28 == 47) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131749230));
                            ei0Var.e(R.raw.imported, 36, 36);
                            ei0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(5.0f));
                            layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f);
                            b2Var.setTextSize(1, 14.0f);
                        } else if (i28 == 52 || i28 == 56 || i28 == 57 || i28 == 58 || i28 == 59 || i28 == 60 || i28 == 80) {
                            if (!org.telegram.messenger.i0.H3()) {
                                return;
                            }
                            int i29 = this.K;
                            if (i29 == 80) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131751204));
                            } else if (i29 == 60) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131747311));
                            } else if (i29 == 56) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131743691));
                            } else if (i29 == 57) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131749371));
                            } else if (i29 == 52) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131748604));
                            } else if (i29 == 59) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131748931));
                                ei0Var.e(i21, 30, 30);
                                this.G = 3000L;
                                b2Var.setTextSize(1, 15.0f);
                            } else {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131744219));
                            }
                            i21 = R.raw.copy;
                            ei0Var.e(i21, 30, 30);
                            this.G = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i28 == 54) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131752338));
                            ei0Var.e(R.raw.silent_unmute, 30, 30);
                            this.G = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i28 == 55) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131752339));
                            ei0Var.e(R.raw.silent_mute, 30, 30);
                            this.G = 3000L;
                            b2Var.setTextSize(1, 15.0f);
                        } else if (i28 == 41) {
                            if (obj2 != null) {
                                b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131749197, "InvLinkToChats", org.telegram.messenger.cd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                            } else if (longValue == org.telegram.messenger.d20.i(i11).n) {
                                b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131749195)));
                            } else if (org.telegram.messenger.o5.z(longValue)) {
                                b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131749196, "InvLinkToGroup", org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-longValue)).title)));
                            } else {
                                b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131749194, "InvLinkToUser", org.telegram.messenger.h20.i(org.telegram.messenger.vp.r1(i11).Z1(l4)))));
                            }
                            ei0Var.e(R.raw.contact_check, 36, 36);
                            this.G = 3000L;
                        } else if (i28 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                int intValue2 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(intValue2, "FwdMessageToManyChats", new Object[0])));
                                } else {
                                    b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(intValue2, "FwdMessagesToManyChats", new Object[0])));
                                }
                                ei0Var.e(R.raw.forward, 30, 30);
                            } else if (longValue == org.telegram.messenger.d20.i(i11).n) {
                                if (num.intValue() == 1) {
                                    b2Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.K0(2131750507), new org.telegram.messenger.rz(29)));
                                } else {
                                    b2Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.K0(2131750500), new org.telegram.messenger.rz(29)));
                                }
                                ei0Var.e(R.raw.saved_messages, 30, 30);
                                this.G = 3000L;
                            } else {
                                if (org.telegram.messenger.o5.z(longValue)) {
                                    TLRPC.Chat L03 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-longValue));
                                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                    String i30 = org.telegram.messenger.w3.p0(L03) ? gg.e.i(i11, L03, false) : null;
                                    if (num.intValue() == 1) {
                                        if (i30 == null) {
                                            i30 = tL_forumTopic != null ? tL_forumTopic.title : L03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131750511, "FwdMessageToGroup", i30)));
                                    } else {
                                        if (i30 == null) {
                                            i30 = tL_forumTopic != null ? tL_forumTopic.title : L03.title;
                                        }
                                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131750504, "FwdMessagesToGroup", i30)));
                                    }
                                } else {
                                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(i11).Z1(l4);
                                    if (num.intValue() == 1) {
                                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131750506, "FwdMessageToUser", org.telegram.messenger.h20.i(Z12))));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131750499, "FwdMessagesToUser", org.telegram.messenger.h20.i(Z12))));
                                    }
                                }
                                ei0Var.e(R.raw.forward, 30, 30);
                            }
                            j12 = 300;
                            this.G = 3000L;
                        } else {
                            int i31 = i11;
                            if (i28 == 61) {
                                if (obj2 != null) {
                                    b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131753737, "BackgroundToChats", org.telegram.messenger.cd.G(((Integer) obj2).intValue(), "Chats", new Object[0]))));
                                    ei0Var.e(R.raw.forward, 30, 30);
                                } else if (longValue == org.telegram.messenger.d20.i(i31).n) {
                                    b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131753735)));
                                    ei0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (org.telegram.messenger.o5.z(longValue)) {
                                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131753736, "BackgroundToGroup", org.telegram.messenger.vp.r1(i31).L0(Long.valueOf(-longValue)).title)));
                                    } else {
                                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131753734, "BackgroundToUser", org.telegram.messenger.h20.i(org.telegram.messenger.vp.r1(i31).Z1(l4)))));
                                    }
                                    ei0Var.e(R.raw.forward, 30, 30);
                                }
                                this.G = 3000L;
                            }
                        }
                        j10 = j12;
                        i12 = 8;
                        z10 = false;
                        textView2.setVisibility(i12);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.uj, this.V);
                        linearLayout.setVisibility(i12);
                        layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                        ei0Var.setProgress(0.0f);
                        ei0Var.d();
                        if (j10 > 0) {
                            ei0Var.postDelayed(new j51(this, 0), j10);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) b2Var.getText());
                        sb2.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
                        org.telegram.messenger.i0.i2(sb2.toString());
                        if (!e()) {
                            int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                            if (measuredWidth == 0) {
                                measuredWidth = org.telegram.messenger.i0.q.x;
                            }
                            measureChildWithMargins(textView2, org.telegram.messenger.z20.c(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            this.r = org.telegram.messenger.i0.L(37.0f) + textView2.getMeasuredHeight();
                        } else if (c()) {
                            this.r = org.telegram.messenger.i0.L(52.0f);
                        } else if (getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                            if (measuredWidth2 <= 0) {
                                measuredWidth2 = org.telegram.messenger.i0.q.x;
                            }
                            measureChildWithMargins(b2Var, org.telegram.messenger.z20.c(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            int measuredHeight = b2Var.getMeasuredHeight();
                            int i32 = this.K;
                            int L2 = org.telegram.messenger.i0.L((i32 == 16 || i32 == 17 || i32 == 18 || i32 == 84 || i32 == 86) ? 14.0f : 28.0f) + measuredHeight;
                            this.r = L2;
                            int i33 = this.K;
                            if (i33 == 18) {
                                this.r = Math.max(L2, org.telegram.messenger.i0.L(52.0f));
                            } else if (i33 == 25) {
                                this.r = Math.max(L2, org.telegram.messenger.i0.L(50.0f));
                            } else if (z10) {
                                this.r = L2 - org.telegram.messenger.i0.L(8.0f);
                            }
                        }
                        if (getVisibility() == 0) {
                            setVisibility(0);
                            setEnterOffset((this.R ? -1.0f : 1.0f) * (this.d0 + this.r));
                            AnimatorSet animatorSet = new AnimatorSet();
                            boolean z11 = this.R;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.d0 + this.r), z11 ? 1.0f : -1.0f));
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                            return;
                        }
                        return;
                    }
                    int intValue3 = ((Integer) obj2).intValue();
                    textView2.setSingleLine(false);
                    b2Var.setText(org.telegram.messenger.cd.Y(2131753854, "AutoDeleteHintOnText", org.telegram.messenger.cd.c0(intValue3)));
                    ei0Var.e(R.raw.fire_on, 36, 36);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f);
                    this.G = 4000L;
                    ei0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
                    j10 = -1;
                    i12 = 8;
                    z10 = true;
                    textView2.setVisibility(i12);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.uj, this.V);
                    linearLayout.setVisibility(i12);
                    layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                    layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                    ei0Var.setProgress(0.0f);
                    ei0Var.d();
                    if (j10 > 0) {
                    }
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append((Object) b2Var.getText());
                    if (textView2.getVisibility() == 0) {
                    }
                    sb22.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
                    org.telegram.messenger.i0.i2(sb22.toString());
                    if (!e()) {
                    }
                    if (getVisibility() == 0) {
                    }
                }
                j10 = -1;
                i12 = 8;
                textView2.setVisibility(i12);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.uj, this.V);
                linearLayout.setVisibility(i12);
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
                if (j10 > 0) {
                }
                StringBuilder sb222 = new StringBuilder();
                sb222.append((Object) b2Var.getText());
                if (textView2.getVisibility() == 0) {
                }
                sb222.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
                org.telegram.messenger.i0.i2(sb222.toString());
                if (!e()) {
                }
                if (getVisibility() == 0) {
                }
            } else if (i27 == 24 || i27 == 25) {
                int intValue4 = ((Integer) obj).intValue();
                TLRPC.User user5 = (TLRPC.User) obj2;
                this.e.setVisibility(8);
                ei0Var.setVisibility(0);
                if (intValue4 != 0) {
                    b2Var.setTypeface(org.telegram.messenger.i0.o());
                    b2Var.setTextSize(1, 14.0f);
                    ei0Var.a.clear();
                    int i34 = org.telegram.ui.ActionBar.t6.vj;
                    i(i34, "BODY", false);
                    i(i34, "Wibe Big", false);
                    i(i34, "Wibe Big 3", false);
                    i(i34, "Wibe Small", false);
                    b2Var.setText(org.telegram.messenger.cd.K0(2131746631));
                    ei0Var.e(R.raw.ic_unmute, 28, 28);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(3);
                    if (user5 != null) {
                        textView2.setText(org.telegram.messenger.cd.Y(2131746629, "ProximityAlertSetInfoUser", org.telegram.messenger.h20.i(user5), org.telegram.messenger.cd.y(intValue4, 2, null)));
                    } else {
                        textView2.setText(org.telegram.messenger.cd.Y(2131746630, "ProximityAlertSetInfoGroup2", org.telegram.messenger.cd.y(intValue4, 2, null)));
                    }
                    linearLayout.setVisibility(8);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                } else {
                    b2Var.setTypeface(Typeface.DEFAULT);
                    b2Var.setTextSize(1, 15.0f);
                    ei0Var.a.clear();
                    int i35 = org.telegram.ui.ActionBar.t6.vj;
                    i(i35, "Body Main", false);
                    i(i35, "Body Top", false);
                    i(i35, "Line", false);
                    i(i35, "Curve Big", false);
                    i(i35, "Curve Small", false);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(14.0f);
                    b2Var.setText(org.telegram.messenger.cd.K0(2131746632));
                    ei0Var.e(R.raw.ic_mute, 28, 28);
                    textView2.setVisibility(8);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.uj, this.V);
                    linearLayout.setVisibility(0);
                }
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
            } else if (i27 == 11) {
                b2Var.setText(org.telegram.messenger.cd.K0(2131753886));
                ei0Var.e(R.raw.contact_check, 36, 36);
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                textView2.setVisibility(0);
                b2Var.setTextSize(1, 14.0f);
                b2Var.setTypeface(org.telegram.messenger.i0.o());
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.p7, this.V);
                this.e.setVisibility(8);
                linearLayout.setVisibility(0);
                ei0Var.setVisibility(0);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
            } else if (i27 == 15) {
                this.G = 10000L;
                textView.setText(org.telegram.messenger.cd.K0(2131747833));
                b2Var.setText(org.telegram.messenger.cd.K0(2131750803));
                ei0Var.e(R.raw.filter_new, 36, 36);
                int L3 = org.telegram.messenger.i0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = L3;
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = L3;
                String K03 = org.telegram.messenger.cd.K0(2131750804);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K03);
                int indexOf2 = K03.indexOf(42);
                int lastIndexOf2 = K03.lastIndexOf(42);
                if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                    spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder2.setSpan(new e51("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
                ei0Var.setVisibility(0);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
            } else if (i27 == 16 || i27 == 17) {
                this.G = 4000L;
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setMinHeight(org.telegram.messenger.i0.L(30.0f));
                String str3 = (String) obj;
                if ("🎲".equals(str3)) {
                    b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131751451)));
                    ei0Var.setImageResource(R.drawable.dice);
                } else {
                    if ("🎯".equals(str3)) {
                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131751679)));
                    } else {
                        String h = sc.e.h("DiceEmojiInfo_", str3);
                        String b10 = org.telegram.messenger.cd.D0().V.b(h);
                        if (b10 == null) {
                            org.telegram.messenger.cd D0 = org.telegram.messenger.cd.D0();
                            D0.i();
                            b10 = D0.T.b(h);
                        }
                        if (TextUtils.isEmpty(b10)) {
                            b2Var.setText(org.telegram.messenger.k6.l(org.telegram.messenger.cd.Y(2131751452, "DiceEmojiInfo", str3), b2Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            b2Var.setText(org.telegram.messenger.k6.l(b10, b2Var.getPaint().getFontMetricsInt(), false));
                        }
                    }
                    ei0Var.setImageDrawable(org.telegram.messenger.k6.g(str3));
                    ei0Var.setScaleType(ImageView.ScaleType.FIT_XY);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(14.0f);
                    layoutParams.bottomMargin = org.telegram.messenger.i0.L(14.0f);
                    layoutParams2.leftMargin = org.telegram.messenger.i0.L(14.0f);
                    layoutParams2.width = org.telegram.messenger.i0.L(26.0f);
                    layoutParams2.height = org.telegram.messenger.i0.L(26.0f);
                }
                textView.setText(org.telegram.messenger.cd.K0(2131745644));
                if (this.K == 16) {
                    L = org.telegram.messenger.i0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                    textView.setVisibility(0);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.uj, this.V);
                    this.e.setVisibility(8);
                    linearLayout.setVisibility(0);
                } else {
                    L = org.telegram.messenger.i0.L(8.0f);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(8);
                }
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = L;
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.i0.L(7.0f);
                layoutParams.height = -1;
                textView2.setVisibility(8);
                ei0Var.setVisibility(0);
            } else if (i27 == 18) {
                this.G = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                b2Var.setTextSize(1, 14.0f);
                b2Var.setGravity(16);
                b2Var.setText((CharSequence) obj);
                textView.setVisibility(8);
                linearLayout.setVisibility(8);
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                layoutParams.bottomMargin = org.telegram.messenger.i0.L(7.0f);
                layoutParams.height = -1;
                layoutParams2.gravity = 51;
                int L4 = org.telegram.messenger.i0.L(8.0f);
                layoutParams2.bottomMargin = L4;
                layoutParams2.topMargin = L4;
                ei0Var.setVisibility(0);
                ei0Var.e(R.raw.chats_infotip, 36, 36);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
                b2Var.setMovementMethod(new org.telegram.messenger.e0(0));
            } else if (i27 == 12) {
                b2Var.setText(org.telegram.messenger.cd.K0(2131752010));
                ei0Var.setImageResource(R.drawable.toast_pallete);
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(48.0f);
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(48.0f);
                String K04 = org.telegram.messenger.cd.K0(2131752009);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(K04);
                int indexOf3 = K04.indexOf(42);
                int lastIndexOf3 = K04.lastIndexOf(42);
                if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                    spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                    spannableStringBuilder3.setSpan(new e51("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                }
                textView2.setText(spannableStringBuilder3);
                textView2.setVisibility(0);
                textView2.setSingleLine(false);
                textView2.setMaxLines(2);
                textView.setVisibility(8);
                linearLayout.setVisibility(0);
                ei0Var.setVisibility(0);
            } else if (i27 == 84) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(Typeface.DEFAULT);
                b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.K0(2131743880)));
                ei0Var.setVisibility(0);
                ei0Var.e(R.raw.voice_to_text, 36, 36);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
                textView.setText(org.telegram.messenger.cd.K0(2131747048));
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                int L5 = org.telegram.messenger.i0.L(6.0f);
                layoutParams.bottomMargin = L5;
                layoutParams.topMargin = L5;
                layoutParams.height = -2;
                g9Var.setVisibility(8);
                textView2.setVisibility(8);
                textView.setVisibility(0);
                linearLayout.setVisibility(0);
                this.e.setVisibility(8);
            } else if (i27 == 85) {
                b2Var.setVisibility(0);
                b2Var.setTextSize(1, 15.0f);
                b2Var.setTypeface(org.telegram.messenger.i0.o());
                b2Var.setText(org.telegram.messenger.cd.K0(2131744332));
                ei0Var.setVisibility(0);
                ei0Var.e(R.raw.hint_swipe_reply, 64, 64);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
                textView2.setVisibility(0);
                textView2.setText(org.telegram.messenger.cd.K0(2131744331));
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                layoutParams.height = -2;
                g9Var.setVisibility(8);
                linearLayout.setVisibility(8);
            } else if (i27 == 90 || i27 == 91 || i27 == 92 || i27 == 93 || i27 == 94) {
                switch (i27) {
                    case org.telegram.messenger.zs.b1 /* 90 */:
                        b2Var.setText(org.telegram.messenger.cd.G((int) mg.k0.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.zs.c1 /* 91 */:
                        b2Var.setText(org.telegram.messenger.cd.K0(2131753272));
                        break;
                    case org.telegram.messenger.zs.d1 /* 92 */:
                        b2Var.setText(org.telegram.messenger.cd.G((int) org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).p0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]));
                        break;
                    case org.telegram.messenger.zs.e1 /* 93 */:
                        b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G((int) org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).r0, "BoostingWaitWarningPlural", new Object[0])));
                        break;
                    case org.telegram.messenger.zs.f1 /* 94 */:
                        b2Var.setText(org.telegram.messenger.cd.K0(2131753333));
                        break;
                }
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(8);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                ei0Var.setVisibility(0);
                ei0Var.e(R.raw.chats_infotip, 36, 36);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
            } else {
                if (i27 == 2) {
                    i13 = 2;
                } else if (i27 == 4) {
                    i13 = 2;
                } else if (i10 == 82) {
                    layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    b2Var.setText(org.telegram.messenger.cd.K0(efVar.b ? 2131753954 : 2131753959));
                    linearLayout.setVisibility(0);
                    b2Var.setTextSize(1, 15.0f);
                    b2Var.setTypeface(Typeface.DEFAULT);
                    textView2.setVisibility(8);
                    g9Var.setVisibility(0);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(2.0f));
                    String str4 = efVar.c;
                    if (str4 != null) {
                        g9Var.h(str4, null, org.telegram.ui.ActionBar.t6.R4);
                    } else if (efVar.I != null) {
                        g9Var.s(efVar.J, efVar.K, true);
                        if (efVar.b) {
                            g9Var.h("vthumb://" + efVar.C + ":" + efVar.I, null, org.telegram.ui.ActionBar.t6.R4);
                        } else {
                            g9Var.h("thumb://" + efVar.C + ":" + efVar.I, null, org.telegram.ui.ActionBar.t6.R4);
                        }
                    } else {
                        g9Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
                    }
                } else {
                    layoutParams.leftMargin = org.telegram.messenger.i0.L(45.0f);
                    layoutParams.topMargin = org.telegram.messenger.i0.L(13.0f);
                    layoutParams.rightMargin = 0;
                    b2Var.setTextSize(1, 15.0f);
                    linearLayout.setVisibility(0);
                    Typeface typeface = Typeface.DEFAULT;
                    b2Var.setTypeface(typeface);
                    textView2.setVisibility(8);
                    ei0Var.setVisibility(8);
                    int i36 = this.K;
                    if (i36 == 88) {
                        String str5 = (String) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (intValue5 > 0) {
                            int L6 = org.telegram.messenger.i0.L(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                            layoutParams.leftMargin = org.telegram.messenger.i0.L(48.0f);
                            layoutParams.rightMargin = L6;
                            layoutParams.topMargin = org.telegram.messenger.i0.L(6.0f);
                            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                            layoutParams3.leftMargin = org.telegram.messenger.i0.L(48.0f);
                            layoutParams3.rightMargin = L6;
                            b2Var.setText(org.telegram.messenger.cd.Y(2131750664, "FolderLinkDeletedTitle", str5));
                            b2Var.setTypeface(org.telegram.messenger.i0.o());
                            textView2.setVisibility(0);
                            textView2.setText(org.telegram.messenger.cd.G(intValue5, "FolderLinkDeletedSubtitle", new Object[0]));
                        } else {
                            b2Var.setTypeface(typeface);
                            if (str5 == null) {
                                str5 = "";
                            }
                            b2Var.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.Y(2131750668, "FolderLinkDeleted", str5.replace('*', (char) 10033))));
                        }
                    } else if (i36 == 81 || i36 == 0 || i36 == 26) {
                        b2Var.setText(org.telegram.messenger.cd.K0(2131749302));
                    } else if (i36 == 27) {
                        b2Var.setText(org.telegram.messenger.cd.K0(2131752180));
                    } else if (i36 == 95) {
                        if (org.telegram.messenger.o5.z(longValue)) {
                            TLRPC.Chat L04 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-longValue));
                            if (org.telegram.messenger.w3.p0(L04)) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131748364));
                            } else if (!org.telegram.messenger.w3.T(L04) || L04.megagroup) {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131749439));
                            } else {
                                b2Var.setText(org.telegram.messenger.cd.K0(2131752388));
                            }
                        } else {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131752242));
                        }
                    } else if (org.telegram.messenger.o5.z(longValue)) {
                        TLRPC.Chat L05 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-longValue));
                        if (org.telegram.messenger.w3.p0(L05)) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131748364));
                        } else if (!org.telegram.messenger.w3.T(L05) || L05.megagroup) {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131749458));
                        } else {
                            b2Var.setText(org.telegram.messenger.cd.K0(2131752417));
                        }
                    } else {
                        b2Var.setText(org.telegram.messenger.cd.K0(2131752242));
                    }
                    if (this.K != 81) {
                        for (int i37 = 0; i37 < arrayList.size(); i37++) {
                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
                            long longValue2 = ((Long) arrayList.get(i37)).longValue();
                            int i38 = this.K;
                            r12.c(longValue2, i38 == 0 || i38 == 26);
                        }
                    }
                }
                if (i10 == i13) {
                    b2Var.setText(org.telegram.messenger.cd.K0(2131752246));
                } else {
                    b2Var.setText(org.telegram.messenger.cd.K0(2131752181));
                }
                layoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
                layoutParams.topMargin = org.telegram.messenger.i0.L(13.0f);
                layoutParams.rightMargin = 0;
                b2Var.setTextSize(1, 15.0f);
                linearLayout.setVisibility(0);
                b2Var.setTypeface(Typeface.DEFAULT);
                textView2.setVisibility(8);
                ei0Var.setVisibility(0);
                ei0Var.e(R.raw.chats_archived, 36, 36);
                ei0Var.setProgress(0.0f);
                ei0Var.d();
            }
        }
        z10 = false;
        StringBuilder sb2222 = new StringBuilder();
        sb2222.append((Object) b2Var.getText());
        if (textView2.getVisibility() == 0) {
        }
        sb2222.append(textView2.getVisibility() == 0 ? ". " + ((Object) textView2.getText()) : "");
        org.telegram.messenger.i0.i2(sb2222.toString());
        if (!e()) {
        }
        if (getVisibility() == 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = this.P;
        ShapeDrawable shapeDrawable = this.U;
        if (f7 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.h0) + this.d0 + org.telegram.messenger.i0.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i10 = this.K;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            int ceil = this.G > 0 ? (int) Math.ceil(r10 / 1000.0f) : 0;
            int i11 = this.H;
            TextPaint textPaint = this.D;
            if (i11 != ceil) {
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
            float f10 = this.g0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.g0 = f11;
                if (f11 > 1.0f) {
                    this.g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f12 = this.g0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (org.telegram.messenger.i0.L(10.0f) * this.g0) + org.telegram.messenger.i0.L(17.2f));
                    this.f0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.e0 != null) {
                float f13 = this.g0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), sc.e.z(1.0f, this.g0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(17.2f)));
                this.e0.draw(canvas);
                if (this.g0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.G / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.G - (elapsedRealtime - this.O);
        this.G = j10;
        this.O = elapsedRealtime;
        if (j10 <= 0) {
            d(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f7) {
        if (this.P != f7) {
            this.P = f7;
            setTranslationY(((this.h0 - this.d0) + org.telegram.messenger.i0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f7) {
        if (this.h0 != f7) {
            this.h0 = f7;
            setTranslationY(((f7 - this.d0) + org.telegram.messenger.i0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.d0 = i10;
    }

    public void setHideAnimationType(int i10) {
        this.T = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var;
        ArrayList arrayList = this.a0;
        try {
            if (this.W) {
                return;
            }
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                p6Var = this.V;
                if (i10 >= size) {
                    break;
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(((Integer) this.b0.get(i10)).intValue(), p6Var);
                ei0 ei0Var = this.f;
                String str = (String) arrayList.get(i10);
                if (((Boolean) this.c0.get(i10)).booleanValue()) {
                    w02 |= -16777216;
                }
                ei0Var.h(w02, str);
                i10++;
            }
            Paint paint = this.E;
            int i11 = org.telegram.ui.ActionBar.t6.vj;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            this.D.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, p6Var), this.U);
            invalidate();
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                org.telegram.ui.ActionBar.t6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var) & 587202559, true);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public UndoView(Context context, m91 m91Var) {
        this(context, m91Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = 0;
        this.y = org.telegram.messenger.d20.s0;
        this.K = -1;
        this.T = 1;
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = org.telegram.messenger.i0.L(8.0f);
        this.g0 = 1.0f;
        this.V = p6Var;
        this.s = k2Var;
        this.R = z10;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, p6Var);
        this.b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        org.telegram.ui.ActionBar.a7.V(b2Var, i10, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.uj;
        org.telegram.ui.ActionBar.a7.H(b2Var, i11, p6Var);
        b2Var.setMovementMethod(new k51(this));
        addView(b2Var, w7.b6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(textView, i11, p6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.e0(false));
        addView(textView, w7.b6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ei0 ei0Var = new ei0(context);
        this.f = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.t6.tj;
        i(i12, "info1", true);
        i(i12, "info2", true);
        i(i10, "luc12", false);
        i(i10, "luc11", false);
        i(i10, "luc10", false);
        i(i10, "luc9", false);
        i(i10, "luc8", false);
        i(i10, "luc7", false);
        i(i10, "luc6", false);
        i(i10, "luc5", false);
        i(i10, "luc4", false);
        i(i10, "luc3", false);
        i(i10, "luc2", false);
        i(i10, "luc1", false);
        i(i10, "Oval", false);
        addView(ei0Var, w7.b6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.h = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(15.0f));
        addView(g9Var, w7.b6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var) & 587202559, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f)));
        addView(linearLayout, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new i51(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, w7.b6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        sc.e.t(textView2, 1, 14.0f);
        org.telegram.messenger.z20.p(textView2, i11, p6Var, null, 2131743910);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(10.0f), org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i10, long j10) {
    }
}
