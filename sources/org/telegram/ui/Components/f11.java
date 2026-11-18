package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f11 extends FrameLayout implements org.telegram.messenger.fs {
    public static final /* synthetic */ int r0 = 0;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public int I;
    public int J;
    public ValueAnimator K;
    public long L;
    public String M;
    public final ArrayList N;
    public int O;
    public s01 P;
    public org.telegram.messenger.d00 Q;
    public boolean R;
    public final org.telegram.ui.f61 S;
    public final di.l4 T;
    public final ArrayList U;
    public long V;
    public Boolean W;
    public final int a;
    public float a0;
    public final long b;
    public ValueAnimator b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public float d0;
    public final org.telegram.ui.ActionBar.i6 e;
    public float e0;
    public final org.telegram.ui.ek f;
    public boolean f0;
    public boolean g0;
    public final bi.p2 h;
    public float h0;
    public VelocityTracker i0;
    public boolean j0;
    public ValueAnimator k0;
    public final TextPaint l0;
    public final HashMap m0;
    public final ImageView n;
    public final TextPaint n0;
    public final TextPaint o0;
    public final TextPaint p0;
    public final TextPaint q0;
    public final ck0 r;
    public final a11 s;
    public final EditText w;
    public final Paint x;
    public float y;

    public f11(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, final org.telegram.ui.ek ekVar) {
        super(activity);
        int i10;
        boolean z10;
        boolean z11;
        String str;
        String M0;
        this.x = new Paint();
        this.H = -1;
        this.J = org.telegram.messenger.g0.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.U = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.l0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.m0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.n0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.o0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.p0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.q0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.a = i7;
        this.b = j3;
        this.e = i6Var;
        this.f = ekVar;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.v3.p0(O0);
        this.c = p02;
        boolean z12 = j3 == org.telegram.messenger.j10.i(i7).e();
        this.d = z12;
        setWillNotDraw(false);
        bi.p2 p2Var = new bi.p2(activity, 24);
        this.h = p2Var;
        p2Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        p2Var.setOutlineProvider(new bg.q0(16));
        p2Var.setClipToOutline(true);
        p2Var.setOnTouchListener(new gi.a(26));
        addView(p2Var, c8.ma.e(org.telegram.messenger.ks.L4, -1, 53));
        int i11 = org.telegram.messenger.g0.m;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
        if (z12) {
            b9Var.g(1);
            b9Var.p = 0.75f;
            q9Var.setImageDrawable(b9Var);
            String M02 = org.telegram.messenger.gd.M0(2131745706, null);
            i10 = i11;
            M0 = org.telegram.messenger.gd.G(u12.I1().j.size(), "Chats", new Object[0]);
            z10 = p02;
            z11 = z12;
            str = M02;
        } else {
            i10 = i11;
            if (p02) {
                z10 = p02;
                z11 = z12;
                TLRPC.Chat O02 = O0 != null ? u12.O0(Long.valueOf(O0.linked_monoforum_id)) : null;
                O02 = O02 == null ? O0 : O02;
                if (O02 != null) {
                    b9Var.q(O02);
                    q9Var.f(O02, b9Var);
                    str = O02.title;
                } else {
                    str = "";
                }
                M0 = org.telegram.messenger.gd.M0(2131743746, null);
            } else {
                z10 = p02;
                z11 = z12;
                if (O0 != null) {
                    b9Var.q(O0);
                    q9Var.f(O0, b9Var);
                    str = O0.title;
                    TLRPC.ChatFull P0 = u12.P0(O0.id);
                    int i12 = (P0 == null || (i12 = P0.participants_count) <= 0) ? O0.participants_count : i12;
                    M0 = i12 > 0 ? org.telegram.messenger.gd.H(',', "Members", i12) : org.telegram.messenger.gd.M0(2131743759, null);
                } else {
                    TLRPC.User c22 = u12.c2(Long.valueOf(j3));
                    if (c22 != null) {
                        b9Var.r(c22);
                        q9Var.f(c22, b9Var);
                        str = org.telegram.messenger.o10.q(c22);
                    } else {
                        str = "";
                    }
                    M0 = org.telegram.messenger.gd.M0(2131743759, null);
                }
            }
        }
        w01 w01Var = new w01(activity, 0);
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        boolean z13 = z10;
        boolean z14 = z11;
        w01Var.setBackground(org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i13, i6Var)), 24, 24));
        final int i14 = 0;
        w01Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.u01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                org.telegram.ui.ek ekVar2 = ekVar;
                switch (i15) {
                    case 0:
                        org.telegram.ui.bn bnVar = ekVar2.a;
                        bnVar.n0.e();
                        if (bnVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", bnVar.getUserConfig().e());
                            bnVar.presentFragment(new i90(bundle, null));
                            break;
                        } else if (org.telegram.messenger.v3.p0(bnVar.e)) {
                            bnVar.presentFragment(ProfileActivity.D4(-bnVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = bnVar.e;
                            if (chat != null) {
                                bnVar.presentFragment(ProfileActivity.D4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = bnVar.f;
                                if (user != null) {
                                    bnVar.presentFragment(ProfileActivity.D4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.bn bnVar2 = ekVar2.a;
                        org.telegram.ui.ActionBar.r0 r0Var = bnVar2.j0;
                        if (r0Var != null && bnVar2.n0 != null) {
                            r0Var.z();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.R;
                            if (o0Var != null) {
                                o0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = bnVar2.j0.getPopupLayout();
                            y60 J = y60.J(bnVar2, view);
                            boolean z15 = true;
                            for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                View childAt = popupLayout.M.getChildAt(i16);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                        if (!z15) {
                                            J.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable mh0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new mh0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.p0 p0Var = bnVar2.t1;
                                        if (p0Var == null || z0Var != p0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = mh0Var;
                                                J.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.re(bnVar2, intValue, 4));
                                                if (drawable2 instanceof mh0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof ph0) {
                                                            ph0 ph0Var = (ph0) z0Var2.getImageView();
                                                            ph0Var.setAnimation((mh0) drawable2);
                                                            ph0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                J.b(z0Var.getIconResId(), mh0Var, text, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.hq0(z0Var, 26));
                                            }
                                        } else if (bnVar2.getMessagesController().u2(bnVar2.l6, bnVar2.d(), null)) {
                                            J.c(z0Var.getIconResId(), text, new org.telegram.ui.af(bnVar2, 16), false);
                                        } else {
                                            J.c(z0Var.getIconResId(), text, new org.telegram.ui.k9(15, bnVar2, J), false);
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            J.W(5);
                            J.b0(0.0f, -view.getHeight());
                            J.a0();
                            break;
                        }
                        break;
                }
            }
        });
        p2Var.addView(w01Var, c8.ma.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        w01Var.addView(q9Var, c8.ma.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = org.telegram.ui.ActionBar.n6.w0(i13, i6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        final int i15 = 1;
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i13, i6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.u01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                org.telegram.ui.ek ekVar2 = ekVar;
                switch (i152) {
                    case 0:
                        org.telegram.ui.bn bnVar = ekVar2.a;
                        bnVar.n0.e();
                        if (bnVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", bnVar.getUserConfig().e());
                            bnVar.presentFragment(new i90(bundle, null));
                            break;
                        } else if (org.telegram.messenger.v3.p0(bnVar.e)) {
                            bnVar.presentFragment(ProfileActivity.D4(-bnVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = bnVar.e;
                            if (chat != null) {
                                bnVar.presentFragment(ProfileActivity.D4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = bnVar.f;
                                if (user != null) {
                                    bnVar.presentFragment(ProfileActivity.D4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.bn bnVar2 = ekVar2.a;
                        org.telegram.ui.ActionBar.r0 r0Var = bnVar2.j0;
                        if (r0Var != null && bnVar2.n0 != null) {
                            r0Var.z();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.R;
                            if (o0Var != null) {
                                o0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = bnVar2.j0.getPopupLayout();
                            y60 J = y60.J(bnVar2, view);
                            boolean z15 = true;
                            for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                View childAt = popupLayout.M.getChildAt(i16);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                        if (!z15) {
                                            J.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable mh0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new mh0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.p0 p0Var = bnVar2.t1;
                                        if (p0Var == null || z0Var != p0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = mh0Var;
                                                J.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.re(bnVar2, intValue, 4));
                                                if (drawable2 instanceof mh0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof ph0) {
                                                            ph0 ph0Var = (ph0) z0Var2.getImageView();
                                                            ph0Var.setAnimation((mh0) drawable2);
                                                            ph0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                J.b(z0Var.getIconResId(), mh0Var, text, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.hq0(z0Var, 26));
                                            }
                                        } else if (bnVar2.getMessagesController().u2(bnVar2.l6, bnVar2.d(), null)) {
                                            J.c(z0Var.getIconResId(), text, new org.telegram.ui.af(bnVar2, 16), false);
                                        } else {
                                            J.c(z0Var.getIconResId(), text, new org.telegram.ui.k9(15, bnVar2, J), false);
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            J.W(5);
                            J.b0(0.0f, -view.getHeight());
                            J.a0();
                            break;
                        }
                        break;
                }
            }
        });
        p2Var.addView(imageView, c8.ma.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        w01Var.addView(textView, c8.ma.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i16 = org.telegram.ui.ActionBar.n6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.w0(i16, i6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        w01Var.addView(textView2, c8.ma.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new x01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.outline_header_search);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i16, i6Var), mode));
        frameLayout.addView(imageView2, c8.ma.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.gd.M0(2131745641, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.n6.w0(i16, i6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        editText.addTextChangedListener(new ah.j(this, 28));
        frameLayout.addView(editText, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        p2Var.addView(frameLayout, c8.ma.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        ck0 ck0Var = new ck0(activity, i6Var);
        this.r = ck0Var;
        ck0Var.setLayoutManager(new v4.c0());
        ck0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ck0Var.setClipToPadding(false);
        ck0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        lr lrVar = lr.h;
        kVar.i = lrVar;
        kVar.n(350L);
        kVar.d = 160L;
        ck0Var.setItemAnimator(kVar);
        ck0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        ck0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i13, i6Var)));
        a11 a11Var = new a11(this);
        this.s = a11Var;
        ck0Var.setAdapter(a11Var);
        ck0Var.setOnItemClickListener(new fi.g4(14, this, ekVar));
        ck0Var.setOnItemLongClickListener((qj0) new g2(22, this, ekVar));
        ck0Var.j(new y01(this, i7, j3));
        p2Var.addView(ck0Var, c8.ma.f(-1.0f, -1, org.telegram.messenger.ks.E1, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(7, activity, i6Var);
        this.S = f61Var;
        f61Var.setLayoutManager(new v4.c0(0, false));
        f61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setHorizontalScrollBarEnabled(false);
        f61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(lrVar);
        kVar2.n(320L);
        f61Var.setItemAnimator(kVar2);
        di.l4 l4Var = new di.l4(this, 5);
        this.T = l4Var;
        f61Var.setAdapter(l4Var);
        f61Var.setOnItemClickListener(new n(this, 19));
        f61Var.setVisibility(8);
        p2Var.addView(f61Var, c8.ma.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i17 = org.telegram.ui.ActionBar.n6.d6;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i17, i6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        p2Var.addView(view, c8.ma.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        p2Var.addView(view2, c8.ma.e(-1, 24, 87));
        this.F = view;
        o();
        TLRPC.User c23 = j3 > 0 ? org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)) : null;
        if (!z13 && !z14 && ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c23))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable.setColor(i0.a.o(w03, org.telegram.messenger.ks.B3));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i18 = org.telegram.ui.ActionBar.n6.Ji;
            textView3.setTextColor(org.telegram.ui.ActionBar.n6.w0(i18, i6Var));
            textView3.setText(org.telegram.messenger.gd.M0(2131748059, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i18, i6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var)));
            c8.ra.a(textView3);
            textView3.setOnClickListener(new y7(29, this, ekVar));
            frameLayout2.addView(textView3, c8.ma.c(44.0f, -2));
            p2Var.addView(frameLayout2, c8.ma.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        p2Var.setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(i17, i6Var));
        setProgress(0.0f);
    }

    public static boolean a(f11 f11Var, b11 b11Var) {
        if (!f11Var.i()) {
            return true;
        }
        TLRPC.TL_forumTopic tL_forumTopic = b11Var.a;
        if (tL_forumTopic == null) {
            return false;
        }
        long j3 = f11Var.V;
        if (j3 != 0 && tL_forumTopic.icon_emoji_id != j3) {
            return false;
        }
        Boolean bool = f11Var.W;
        return bool == null || tL_forumTopic.closed == bool.booleanValue();
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    private void setTagsShown(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 1.0f : 0.0f);
        this.b0 = ofFloat;
        ofFloat.addUpdateListener(new r01(this, 1));
        this.b0.addListener(new v01(this, 0));
        this.b0.setDuration(320L);
        this.b0.setInterpolator(lr.h);
        this.b0.start();
    }

    public final void b(float f10, float f11) {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f12 = this.y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new r01(this, 2));
        this.K.addListener(new v01(this, 2));
        this.K.setDuration(Math.abs(f11) > ((float) org.telegram.messenger.g0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f10 - this.y) * getPanelWidth()) / Math.abs(f11)) * 1000.0f * 2.0f)) : 320L);
        this.K.setInterpolator(lr.h);
        this.K.start();
    }

    public final void c(float f10) {
        org.telegram.ui.f61 f61Var = this.S;
        int childCount = f61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = f61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void d() {
        s01 s01Var = this.P;
        if (s01Var != null) {
            org.telegram.messenger.g0.r(s01Var);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.t5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                n();
            }
        } else {
            if (i7 == org.telegram.messenger.ks.r) {
                n();
                return;
            }
            if (i7 == org.telegram.messenger.ks.i3) {
                if (this.d) {
                    n();
                }
            } else if (i7 == org.telegram.messenger.ks.l4) {
                org.telegram.messenger.g0.d0(this.r, new pg.c(0));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.n6.r1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.ek ekVar = this.f;
        if (ekVar != null && this.y > 0.0f) {
            org.telegram.ui.bn.N2(ekVar.a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c0 = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.c0 = false;
        setVisibility(this.y <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final void e() {
        b(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.w);
    }

    public final TLObject f(b11 b11Var) {
        long o4;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.a);
        org.telegram.messenger.ov ovVar = b11Var.b;
        if (ovVar != null) {
            o4 = ovVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = b11Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        }
        return o4 >= 0 ? u12.c2(Long.valueOf(o4)) : u12.O0(Long.valueOf(-o4));
    }

    public final String g(long j3) {
        int i7 = this.a;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        if (j3 == org.telegram.messenger.j10.i(i7).e()) {
            return org.telegram.messenger.gd.M0(2131748111, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.gd.M0(2131754250, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.o10.q(u12.c2(Long.valueOf(j3)));
        }
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        return O0 != null ? O0.title : "";
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.y;
    }

    public final boolean h() {
        return (this.d || this.c || this.b >= 0) ? false : true;
    }

    public final boolean i() {
        return (this.V == 0 && this.W == null) ? false : true;
    }

    public final boolean j() {
        if (this.d || this.c) {
            return false;
        }
        return !TextUtils.isEmpty(this.M) || i();
    }

    public final void k() {
        if (this.P == null && this.O == 0 && !this.R && j()) {
            String str = this.M;
            long j3 = this.V;
            Boolean bool = this.W;
            org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(this.a).t7;
            long j10 = -this.b;
            org.telegram.messenger.d00 d00Var = this.Q;
            t01 t01Var = new t01(this, str, j3, bool);
            e00Var.getClass();
            TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = e00Var.getMessagesController().l1(-j10);
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            tL_messages_getForumTopics.q = str;
            tL_messages_getForumTopics.icon_emoji_id = j3 != 0 ? Long.valueOf(j3) : null;
            tL_messages_getForumTopics.closed = bool;
            if (d00Var != null) {
                tL_messages_getForumTopics.offset_date = d00Var.a;
                tL_messages_getForumTopics.offset_id = d00Var.b;
                tL_messages_getForumTopics.offset_topic = d00Var.c;
            }
            tL_messages_getForumTopics.limit = 50;
            this.O = e00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.go(e00Var, j10, t01Var, 10));
        }
    }

    public final void l(boolean z10) {
        d();
        this.N.clear();
        this.Q = null;
        this.R = false;
        if (j()) {
            s01 s01Var = new s01(this, 0);
            this.P = s01Var;
            org.telegram.messenger.g0.h3(s01Var, z10 ? 350L : 0L);
        }
    }

    public final boolean m(b11 b11Var) {
        String str;
        org.telegram.messenger.ov ovVar = b11Var.b;
        String str2 = "";
        if (ovVar != null) {
            String g10 = g(ovVar.a);
            if (g10 != null) {
                str2 = g10.toString();
            }
        } else {
            TLObject f10 = f(b11Var);
            if (f10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.o10.q((TLRPC.User) f10);
            } else if (f10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) f10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = b11Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public final void n() {
        float f10;
        boolean z10;
        ArrayList l10;
        boolean z11;
        String str;
        float f11;
        ArrayList arrayList;
        boolean z12;
        int visibility = getVisibility();
        a11 a11Var = this.s;
        if (visibility == 0 || this.y > 0.0f || a11Var.c.size() <= 0) {
            ArrayList arrayList2 = a11Var.c;
            String str2 = a11Var.d;
            f11 f11Var = a11Var.e;
            long j3 = f11Var.b;
            int i7 = f11Var.a;
            String str3 = f11Var.M;
            boolean z13 = f11Var.d;
            boolean z14 = TextUtils.equals(str2, str3) && f11Var.y > 0.0f && !arrayList2.isEmpty();
            a11Var.d = f11Var.M;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList2.clear();
            if (z13) {
                f10 = 0.0f;
                z10 = z14;
                l10 = null;
            } else {
                f10 = 0.0f;
                z10 = z14;
                l10 = org.telegram.messenger.mp.u1(i7).t7.l(-j3);
            }
            if (z13) {
                z11 = z13;
                str = null;
            } else {
                di.l4 l4Var = f11Var.T;
                ArrayList arrayList4 = f11Var.U;
                if (f11Var.h()) {
                    f11 = f10;
                    arrayList = (ArrayList) org.telegram.messenger.mp.u1(i7).t7.f.f(-j3);
                } else {
                    f11 = f10;
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList();
                z11 = z13;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        long longValue = ((Long) obj).longValue();
                        if (longValue != 0) {
                            ArrayList arrayList6 = arrayList;
                            c11 c11Var = new c11();
                            c11Var.a = longValue;
                            arrayList5.add(c11Var);
                            arrayList = arrayList6;
                        }
                    }
                }
                if (f11Var.h()) {
                    boolean[] zArr = {false, true};
                    for (int i11 = 0; i11 < 2; i11++) {
                        boolean z15 = zArr[i11];
                        c11 c11Var2 = new c11();
                        c11Var2.b = Boolean.valueOf(z15);
                        arrayList5.add(c11Var2);
                    }
                }
                if (arrayList5.isEmpty() && f11Var.i()) {
                    f11Var.V = 0L;
                    str = null;
                    f11Var.W = null;
                    f11Var.l(false);
                } else {
                    str = null;
                }
                ArrayList arrayList7 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList4.addAll(arrayList5);
                if (arrayList7.isEmpty() || arrayList5.isEmpty() || f11Var.a0 <= f11) {
                    z12 = true;
                    l4Var.f();
                } else {
                    z01 z01Var = new z01(arrayList7, arrayList5);
                    z12 = true;
                    v4.o.c(z01Var, true).c(l4Var);
                }
                f11Var.setTagsShown(arrayList4.isEmpty() ^ z12);
            }
            if (TextUtils.isEmpty(f11Var.M) && !f11Var.i()) {
                arrayList2.add(new b11(f11Var));
            }
            if (z11) {
                ArrayList arrayList8 = org.telegram.messenger.mp.u1(i7).I1().j;
                int size2 = arrayList8.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList8.get(i12);
                    i12++;
                    b11 b11Var = new b11(f11Var);
                    b11Var.b = (org.telegram.messenger.ov) obj2;
                    if (!TextUtils.isEmpty(f11Var.M) && !f11Var.m(b11Var)) {
                        TLObject f12 = f11Var.f(b11Var);
                        String o4 = f12 instanceof TLRPC.User ? org.telegram.messenger.o10.o((TLRPC.User) f12) : f12 instanceof TLRPC.Chat ? org.telegram.messenger.v3.K((TLRPC.Chat) f12, false) : str;
                        if (o4 != null && o4.toLowerCase().contains(f11Var.M)) {
                        }
                    }
                    arrayList2.add(b11Var);
                }
                a11Var.E(arrayList3, z10);
            } else {
                boolean z16 = z10;
                HashSet hashSet = new HashSet();
                if (l10 != null) {
                    int size3 = l10.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = l10.get(i13);
                        i13++;
                        b11 b11Var2 = new b11(f11Var);
                        b11Var2.a = (TLRPC.TL_forumTopic) obj3;
                        if (!TextUtils.isEmpty(f11Var.M) && !f11Var.m(b11Var2)) {
                            TLObject f13 = f11Var.f(b11Var2);
                            String o10 = f13 instanceof TLRPC.User ? org.telegram.messenger.o10.o((TLRPC.User) f13) : f13 instanceof TLRPC.Chat ? org.telegram.messenger.v3.K((TLRPC.Chat) f13, false) : str;
                            if (o10 != null && o10.toLowerCase().contains(f11Var.M)) {
                            }
                        }
                        if (a(f11Var, b11Var2)) {
                            arrayList2.add(b11Var2);
                            hashSet.add(Long.valueOf(b11Var2.a()));
                        }
                    }
                }
                if (f11Var.j()) {
                    ArrayList arrayList9 = f11Var.N;
                    int size4 = arrayList9.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj4 = arrayList9.get(i14);
                        i14++;
                        b11 b11Var3 = new b11(f11Var);
                        b11Var3.a = (TLRPC.TL_forumTopic) obj4;
                        if (a(f11Var, b11Var3) && hashSet.add(Long.valueOf(b11Var3.a()))) {
                            arrayList2.add(b11Var3);
                        }
                    }
                }
                a11Var.E(arrayList3, z16);
            }
            this.r.post(new s01(this, 1));
        }
    }

    public final void o() {
        View view;
        View view2 = this.F;
        if (view2 == null || (view = this.G) == null) {
            return;
        }
        ck0 ck0Var = this.r;
        view2.setAlpha(Utilities.i(ck0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        if (this.E != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((ck0Var.computeVerticalScrollRange() - ck0Var.computeVerticalScrollOffset()) - ck0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.t5);
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.r);
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.i3);
        org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.l4);
        if (h()) {
            org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i7).t7;
            long j3 = -this.b;
            LongSparseIntArray longSparseIntArray = e00Var.n;
            long j10 = -j3;
            if (!e00Var.getMessagesController().E2(j10) && longSparseIntArray.get(j3, 0) == 0 && System.currentTimeMillis() - e00Var.h.get(j3, 0L) >= 300000) {
                longSparseIntArray.put(j3, 1);
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = e00Var.getMessagesController().l1(j10);
                tL_messages_getForumTopics.limit = 1;
                e00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.x4(e00Var, j3, 5));
            }
        }
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.t5);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.r);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.i3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        d();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.d0 = motionEvent.getX();
            this.e0 = motionEvent.getY();
            this.f0 = false;
            this.g0 = true;
            this.h0 = this.y;
            VelocityTracker velocityTracker = this.i0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.i0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.g0) {
            VelocityTracker velocityTracker2 = this.i0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.d0;
            float y10 = motionEvent.getY() - this.e0;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.f0 = true;
                this.d0 = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a10 = r0.b0.a(this);
        int i13 = a10 != null ? a10.a.f(2).d : 0;
        if (i13 != this.H) {
            this.H = i13;
            ck0 ck0Var = this.r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                ck0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                ck0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.bn bnVar;
        org.telegram.ui.ActionBar.r0 o92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.l1 a10 = r0.b0.a(this);
        int i11 = 0;
        int i12 = a10 != null ? org.telegram.messenger.g0.I0(a10, false).c : 0;
        int i13 = this.I;
        bi.p2 p2Var = this.h;
        if (i12 != i13) {
            this.I = i12;
            p2Var.getLayoutParams().width = getPanelWidth();
            p2Var.setPadding(0, 0, i12, 0);
            p2Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.ek ekVar = this.f;
        if (ekVar != null && (o92 = (bnVar = ekVar.a).o9()) != null) {
            View view = (View) o92.getParent();
            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            i11 = (int) ((kVar.getWidth() - ((o92.getWidth() / 2.0f) + (o92.getX() + view.getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.I) - i11));
        if (max != this.J) {
            this.J = max;
            p2Var.getLayoutParams().width = getPanelWidth();
            p2Var.setTranslationX((1.0f - this.y) * getPanelWidth());
            this.s.f();
        }
        super.onMeasure(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y <= 0.0f) {
            return false;
        }
        if (this.i0 == null) {
            this.i0 = VelocityTracker.obtain();
        }
        this.i0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d0 = motionEvent.getX();
            this.e0 = motionEvent.getY();
            this.f0 = false;
            this.h0 = this.y;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x10 = motionEvent.getX() - this.d0;
                if (!this.f0 && Math.abs(x10) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.f0 = true;
                    this.d0 = motionEvent.getX();
                    this.h0 = this.y;
                }
                if (this.f0) {
                    ValueAnimator valueAnimator = this.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.K = null;
                    }
                    setProgress(this.h0 - ((motionEvent.getX() - this.d0) / this.J));
                }
            }
            return true;
        }
        if (this.f0) {
            this.i0.computeCurrentVelocity(1000);
            settle(this.i0.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (getPanelWidth() * this.y)) {
            e();
        }
        this.f0 = false;
        this.g0 = false;
        this.i0.recycle();
        this.i0 = null;
        return true;
    }

    public void setCurrentTopic(long j3) {
        this.L = j3;
        this.s.f();
    }

    public void setMenuAvailable(boolean z10) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setProgress(float f10) {
        int i7 = 0;
        boolean z10 = this.y <= 0.0f && f10 > 0.0f;
        this.y = Utilities.l(f10);
        if (z10 && this.S != null) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.j0 && this.b0 == null) {
                c(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.k0 = ofFloat;
                ofFloat.addUpdateListener(new r01(this, i7));
                this.k0.addListener(new v01(this, 1));
                this.k0.setDuration(320L);
                this.k0.setInterpolator(lr.h);
                this.k0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        if (this.y <= 0.0f && !this.c0) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.ek ekVar = this.f;
        if (ekVar != null) {
            ekVar.a.m1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z10 = false;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.y > 0.5f : f10 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            n();
        }
        b(z10 ? 1.0f : 0.0f, f10);
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.v1(this.w);
    }
}
