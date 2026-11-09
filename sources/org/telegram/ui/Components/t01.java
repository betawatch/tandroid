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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t01 extends FrameLayout implements org.telegram.messenger.ls {
    public static final /* synthetic */ int m0 = 0;
    public final FrameLayout D;
    public final View E;
    public final View F;
    public int G;
    public int H;
    public int I;
    public ValueAnimator J;
    public long K;
    public String L;
    public final ArrayList M;
    public int N;
    public w80 O;
    public final org.telegram.ui.f61 P;
    public final bi.k5 Q;
    public final ArrayList R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public float V;
    public float W;
    public final int a;
    public boolean a0;
    public final long b;
    public boolean b0;
    public final boolean c;
    public float c0;
    public final boolean d;
    public VelocityTracker d0;
    public final org.telegram.ui.ActionBar.g6 e;
    public boolean e0;
    public final org.telegram.ui.fk f;
    public ValueAnimator f0;
    public final TextPaint g0;
    public final di.b4 h;
    public final HashMap h0;
    public final TextPaint i0;
    public final TextPaint j0;
    public final TextPaint k0;
    public final TextPaint l0;
    public final ImageView n;
    public final qj0 r;
    public final o01 s;
    public final EditText w;
    public final Paint x;
    public float y;

    public t01(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var, final org.telegram.ui.fk fkVar) {
        super(activity);
        int i10;
        boolean z9;
        boolean z10;
        String str;
        String M0;
        this.x = new Paint();
        this.G = -1;
        this.I = org.telegram.messenger.g0.L(288.0f);
        this.L = "";
        this.M = new ArrayList();
        this.R = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.g0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.h0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.i0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.j0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.k0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.l0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.a = i7;
        this.b = j3;
        this.e = g6Var;
        this.f = fkVar;
        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.c = p02;
        boolean z11 = j3 == org.telegram.messenger.p10.i(i7).e();
        this.d = z11;
        setWillNotDraw(false);
        di.b4 b4Var = new di.b4(activity, 22);
        this.h = b4Var;
        b4Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        b4Var.setOutlineProvider(new bg.q0(16));
        b4Var.setClipToOutline(true);
        b4Var.setOnTouchListener(new ei.b(25));
        addView(b4Var, c8.ha.e(org.telegram.messenger.qs.L4, -1, 53));
        int i11 = org.telegram.messenger.g0.m;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
        if (z11) {
            w8Var.g(1);
            w8Var.p = 0.75f;
            l9Var.setImageDrawable(w8Var);
            String M03 = org.telegram.messenger.id.M0(2131745901, null);
            i10 = i11;
            M0 = org.telegram.messenger.id.G(s12.G1().j.size(), "Chats", new Object[0]);
            z9 = p02;
            z10 = z11;
            str = M03;
        } else {
            i10 = i11;
            if (p02) {
                z9 = p02;
                z10 = z11;
                TLRPC.Chat M04 = M02 != null ? s12.M0(Long.valueOf(M02.linked_monoforum_id)) : null;
                M04 = M04 == null ? M02 : M04;
                if (M04 != null) {
                    w8Var.q(M04);
                    l9Var.e(M04, w8Var);
                    str = M04.title;
                } else {
                    str = "";
                }
                M0 = org.telegram.messenger.id.M0(2131743983, null);
            } else {
                z9 = p02;
                z10 = z11;
                if (M02 != null) {
                    w8Var.q(M02);
                    l9Var.e(M02, w8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.id);
                    int i12 = (N0 == null || (i12 = N0.participants_count) <= 0) ? M02.participants_count : i12;
                    M0 = i12 > 0 ? org.telegram.messenger.id.H(',', "Members", i12) : org.telegram.messenger.id.M0(2131743994, null);
                } else {
                    TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                    if (a22 != null) {
                        w8Var.r(a22);
                        l9Var.e(a22, w8Var);
                        str = org.telegram.messenger.t10.p(a22);
                    } else {
                        str = "";
                    }
                    M0 = org.telegram.messenger.id.M0(2131743994, null);
                }
            }
        }
        bi.e5 e5Var = new bi.e5(activity, 29);
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        boolean z12 = z9;
        boolean z13 = z10;
        e5Var.setBackground(org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)), 24, 24));
        final int i14 = 0;
        e5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.j01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                org.telegram.ui.fk fkVar2 = fkVar;
                switch (i15) {
                    case 0:
                        org.telegram.ui.cn cnVar = fkVar2.a;
                        cnVar.m0.d();
                        if (cnVar.Y9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", cnVar.getUserConfig().e());
                            cnVar.presentFragment(new v80(bundle, null));
                            break;
                        } else if (org.telegram.messenger.t3.p0(cnVar.e)) {
                            cnVar.presentFragment(ProfileActivity.D4(-cnVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = cnVar.e;
                            if (chat != null) {
                                cnVar.presentFragment(ProfileActivity.D4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = cnVar.f;
                                if (user != null) {
                                    cnVar.presentFragment(ProfileActivity.D4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.cn cnVar2 = fkVar2.a;
                        org.telegram.ui.ActionBar.r0 r0Var = cnVar2.i0;
                        if (r0Var != null && cnVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = cnVar2.i0.getPopupLayout();
                            l60 I = l60.I(cnVar2, view);
                            int i16 = 0;
                            boolean z14 = true;
                            for (int i17 = 0; i17 < popupLayout.getItemsCount(); i17++) {
                                View childAt = popupLayout.L.getChildAt(i17);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable ah0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new ah0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.p0 p0Var = cnVar2.s1;
                                        if (p0Var == null || z0Var != p0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = ah0Var;
                                                I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.qe(cnVar2, intValue, 4));
                                                if (drawable2 instanceof ah0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof dh0) {
                                                            dh0 dh0Var = (dh0) z0Var2.getImageView();
                                                            dh0Var.setAnimation((ah0) drawable2);
                                                            dh0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(z0Var.getIconResId(), ah0Var, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.iq0(z0Var, 26));
                                            }
                                        } else if (cnVar2.getMessagesController().r2(cnVar2.j6, cnVar2.b(), null)) {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(cnVar2, 16), false);
                                        } else {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.rf(i16, cnVar2, I), false);
                                        }
                                        z14 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view.getHeight());
                            I.Z();
                            break;
                        }
                        break;
                }
            }
        });
        b4Var.addView(e5Var, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        e5Var.addView(l9Var, c8.ha.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = org.telegram.ui.ActionBar.l6.w0(i13, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        final int i15 = 1;
        imageView.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.j01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                org.telegram.ui.fk fkVar2 = fkVar;
                switch (i152) {
                    case 0:
                        org.telegram.ui.cn cnVar = fkVar2.a;
                        cnVar.m0.d();
                        if (cnVar.Y9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", cnVar.getUserConfig().e());
                            cnVar.presentFragment(new v80(bundle, null));
                            break;
                        } else if (org.telegram.messenger.t3.p0(cnVar.e)) {
                            cnVar.presentFragment(ProfileActivity.D4(-cnVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = cnVar.e;
                            if (chat != null) {
                                cnVar.presentFragment(ProfileActivity.D4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = cnVar.f;
                                if (user != null) {
                                    cnVar.presentFragment(ProfileActivity.D4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.cn cnVar2 = fkVar2.a;
                        org.telegram.ui.ActionBar.r0 r0Var = cnVar2.i0;
                        if (r0Var != null && cnVar2.m0 != null) {
                            r0Var.y();
                            org.telegram.ui.ActionBar.o0 o0Var = r0Var.Q;
                            if (o0Var != null) {
                                o0Var.n();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = cnVar2.i0.getPopupLayout();
                            l60 I = l60.I(cnVar2, view);
                            int i16 = 0;
                            boolean z14 = true;
                            for (int i17 = 0; i17 < popupLayout.getItemsCount(); i17++) {
                                View childAt = popupLayout.L.getChildAt(i17);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z14) {
                                            I.k();
                                            z14 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable ah0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new ah0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.p0 p0Var = cnVar2.s1;
                                        if (p0Var == null || z0Var != p0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = ah0Var;
                                                I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.qe(cnVar2, intValue, 4));
                                                if (drawable2 instanceof ah0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof dh0) {
                                                            dh0 dh0Var = (dh0) z0Var2.getImageView();
                                                            dh0Var.setAnimation((ah0) drawable2);
                                                            dh0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(z0Var.getIconResId(), ah0Var, text, org.telegram.ui.ActionBar.l6.F8, org.telegram.ui.ActionBar.l6.E8, new org.telegram.ui.iq0(z0Var, 26));
                                            }
                                        } else if (cnVar2.getMessagesController().r2(cnVar2.j6, cnVar2.b(), null)) {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.af(cnVar2, 16), false);
                                        } else {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.rf(i16, cnVar2, I), false);
                                        }
                                        z14 = false;
                                    }
                                }
                            }
                            I.V(5);
                            I.a0(0.0f, -view.getHeight());
                            I.Z();
                            break;
                        }
                        break;
                }
            }
        });
        b4Var.addView(imageView, c8.ha.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.l6.w0(i13, g6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        e5Var.addView(textView, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i16 = org.telegram.ui.ActionBar.l6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.l6.w0(i16, g6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        e5Var.addView(textView2, c8.ha.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new l01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.outline_header_search);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i16, g6Var), mode));
        frameLayout.addView(imageView2, c8.ha.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.id.M0(2131745836, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.l6.w0(i16, g6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.l6.w0(i13, g6Var));
        editText.addTextChangedListener(new ah.j(this, 25));
        frameLayout.addView(editText, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        b4Var.addView(frameLayout, c8.ha.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        qj0 qj0Var = new qj0(activity, g6Var);
        this.r = qj0Var;
        qj0Var.setLayoutManager(new v4.b0());
        qj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        qj0Var.setClipToPadding(false);
        qj0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        xq xqVar = xq.h;
        kVar.i = xqVar;
        kVar.n(350L);
        kVar.d = 160L;
        qj0Var.setItemAnimator(kVar);
        qj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        qj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i13, g6Var)));
        o01 o01Var = new o01(this);
        this.s = o01Var;
        qj0Var.setAdapter(o01Var);
        qj0Var.setOnItemClickListener(new di.q4(14, this, fkVar));
        int i17 = 19;
        qj0Var.setOnItemLongClickListener((ej0) new f2(i17, this, fkVar));
        qj0Var.j(new m01(this, i7, j3));
        b4Var.addView(qj0Var, c8.ha.f(-1.0f, -1, org.telegram.messenger.qs.E1, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(7, activity, g6Var);
        this.P = f61Var;
        f61Var.setLayoutManager(new v4.b0(0, false));
        f61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setHorizontalScrollBarEnabled(false);
        f61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(xqVar);
        kVar2.n(320L);
        f61Var.setItemAnimator(kVar2);
        bi.k5 k5Var = new bi.k5(this, 5);
        this.Q = k5Var;
        f61Var.setAdapter(k5Var);
        f61Var.setOnItemClickListener(new k(this, i17));
        f61Var.setVisibility(8);
        b4Var.addView(f61Var, c8.ha.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i18 = org.telegram.ui.ActionBar.l6.d6;
        int w03 = org.telegram.ui.ActionBar.l6.w0(i18, g6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        b4Var.addView(view, c8.ha.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.F = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        b4Var.addView(view2, c8.ha.e(-1, 24, 87));
        this.E = view;
        i();
        TLRPC.User a23 = j3 > 0 ? org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)) : null;
        if (!z12 && !z13 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(a23))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable.setColor(i0.a.o(w03, org.telegram.messenger.qs.B3));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i19 = org.telegram.ui.ActionBar.l6.Gi;
            textView3.setTextColor(org.telegram.ui.ActionBar.l6.w0(i19, g6Var));
            textView3.setText(org.telegram.messenger.id.M0(2131748251, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i19, g6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var)));
            c8.ka.a(textView3);
            textView3.setOnClickListener(new lk(25, this, fkVar));
            frameLayout2.addView(textView3, c8.ha.c(44.0f, -2));
            b4Var.addView(frameLayout2, c8.ha.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.D = frameLayout2;
        }
        b4Var.setBackgroundColor(org.telegram.ui.ActionBar.l6.w0(i18, g6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.I + this.H;
    }

    private void setTagsShown(boolean z9) {
        if (this.e0 == z9) {
            return;
        }
        this.e0 = z9;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, z9 ? 1.0f : 0.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new i01(this, 1));
        this.T.addListener(new k01(this, 0));
        this.T.setDuration(320L);
        this.T.setInterpolator(xq.h);
        this.T.start();
    }

    public final void a(float f10, float f11) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        float f12 = this.y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new i01(this, 2));
        this.J.addListener(new k01(this, 2));
        this.J.setDuration(Math.abs(f11) > ((float) org.telegram.messenger.g0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f10 - this.y) * getPanelWidth()) / Math.abs(f11)) * 1000.0f * 2.0f)) : 320L);
        this.J.setInterpolator(xq.h);
        this.J.start();
    }

    public final void b(float f10) {
        org.telegram.ui.f61 f61Var = this.P;
        int childCount = f61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = f61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void c() {
        w80 w80Var = this.O;
        if (w80Var != null) {
            org.telegram.messenger.g0.r(w80Var);
            this.O = null;
        }
        if (this.N != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.N, true);
            this.N = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.w);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.q5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                h();
            }
        } else {
            if (i7 == org.telegram.messenger.qs.r) {
                h();
                return;
            }
            if (i7 == org.telegram.messenger.qs.g3) {
                if (this.d) {
                    h();
                }
            } else if (i7 == org.telegram.messenger.qs.i4) {
                org.telegram.messenger.g0.d0(this.r, new pg.c(0));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.l6.r1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.fk fkVar = this.f;
        if (fkVar != null && this.y > 0.0f) {
            org.telegram.ui.cn.N2(fkVar.a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.U = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.U = false;
        setVisibility(this.y <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final TLObject e(q01 q01Var) {
        long o4;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.a);
        org.telegram.messenger.uv uvVar = q01Var.b;
        if (uvVar != null) {
            o4 = uvVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = q01Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return o4 >= 0 ? s12.a2(Long.valueOf(o4)) : s12.M0(Long.valueOf(-o4));
    }

    public final String f(long j3) {
        int i7 = this.a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (j3 == org.telegram.messenger.p10.i(i7).e()) {
            return org.telegram.messenger.id.M0(2131748303, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.id.M0(2131754252, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.t10.p(s12.a2(Long.valueOf(j3)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        return M0 != null ? M0.title : "";
    }

    public final boolean g(q01 q01Var) {
        String str;
        org.telegram.messenger.uv uvVar = q01Var.b;
        String str2 = "";
        if (uvVar != null) {
            String f10 = f(uvVar.a);
            if (f10 != null) {
                str2 = f10.toString();
            }
        } else {
            TLObject e10 = e(q01Var);
            if (e10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.t10.p((TLRPC.User) e10);
            } else if (e10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = q01Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.L);
    }

    public int getContentWidth() {
        return this.I;
    }

    public float getProgress() {
        return this.y;
    }

    public final void h() {
        String str;
        int visibility = getVisibility();
        o01 o01Var = this.s;
        if (visibility == 0 || this.y > 0.0f || o01Var.c.size() <= 0) {
            ArrayList arrayList = o01Var.c;
            String str2 = o01Var.d;
            t01 t01Var = o01Var.e;
            String str3 = t01Var.L;
            int i7 = t01Var.a;
            boolean z9 = t01Var.d;
            int i10 = 0;
            boolean z10 = TextUtils.equals(str2, str3) && t01Var.y > 0.0f && !arrayList.isEmpty();
            o01Var.d = t01Var.L;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ArrayList l10 = z9 ? null : org.telegram.messenger.qp.s1(i7).q7.l(-t01Var.b);
            if (z9) {
                str = null;
            } else {
                bi.k5 k5Var = t01Var.Q;
                ArrayList arrayList3 = t01Var.R;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (l10 != null) {
                    boolean z11 = org.telegram.messenger.r2.a;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((p01) it.next()).getClass();
                }
                str = null;
                if (arrayList4.size() < 2) {
                    arrayList4.clear();
                }
                Collections.sort(arrayList4, new org.telegram.ui.oe(19));
                if (arrayList4.size() > 0) {
                    ((p01) arrayList4.get(0)).getClass();
                    throw null;
                }
                ArrayList arrayList5 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                if (arrayList5.isEmpty() || arrayList4.isEmpty() || t01Var.S <= 0.0f) {
                    k5Var.f();
                } else {
                    v4.o.c(new n01(arrayList5, arrayList4), true).c(k5Var);
                }
                t01Var.setTagsShown(!arrayList3.isEmpty());
            }
            if (TextUtils.isEmpty(t01Var.L)) {
                arrayList.add(new q01(t01Var));
            }
            if (z9) {
                ArrayList arrayList6 = org.telegram.messenger.qp.s1(i7).G1().j;
                int size = arrayList6.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList6.get(i11);
                    i11++;
                    q01 q01Var = new q01(t01Var);
                    q01Var.b = (org.telegram.messenger.uv) obj;
                    if (!TextUtils.isEmpty(t01Var.L) && !t01Var.g(q01Var)) {
                        TLObject e10 = t01Var.e(q01Var);
                        String n10 = e10 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) e10) : e10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e10, false) : str;
                        if (n10 != null && n10.toLowerCase().contains(t01Var.L)) {
                        }
                    }
                    arrayList.add(q01Var);
                }
                if (z10) {
                    v4.o.c(new jg.h(o01Var, arrayList2, 3), true).c(o01Var);
                } else {
                    o01Var.f();
                }
            } else {
                HashSet hashSet = new HashSet();
                if (l10 != null) {
                    int size2 = l10.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = l10.get(i12);
                        i12++;
                        q01 q01Var2 = new q01(t01Var);
                        q01Var2.a = (TLRPC.TL_forumTopic) obj2;
                        if (!TextUtils.isEmpty(t01Var.L) && !t01Var.g(q01Var2)) {
                            TLObject e11 = t01Var.e(q01Var2);
                            String n11 = e11 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) e11) : e11 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e11, false) : str;
                            if (n11 != null && n11.toLowerCase().contains(t01Var.L)) {
                            }
                        }
                        arrayList.add(q01Var2);
                        hashSet.add(Long.valueOf(q01Var2.a()));
                    }
                }
                if (!TextUtils.isEmpty(t01Var.L)) {
                    ArrayList arrayList7 = t01Var.M;
                    int size3 = arrayList7.size();
                    while (i10 < size3) {
                        Object obj3 = arrayList7.get(i10);
                        i10++;
                        q01 q01Var3 = new q01(t01Var);
                        q01Var3.a = (TLRPC.TL_forumTopic) obj3;
                        if (hashSet.add(Long.valueOf(q01Var3.a()))) {
                            arrayList.add(q01Var3);
                        }
                    }
                }
                if (z10) {
                    v4.o.c(new jg.h(o01Var, arrayList2, 3), true).c(o01Var);
                } else {
                    o01Var.f();
                }
            }
            this.r.post(new kr0(this, 17));
        }
    }

    public final void i() {
        View view;
        View view2 = this.E;
        if (view2 == null || (view = this.F) == null) {
            return;
        }
        qj0 qj0Var = this.r;
        view2.setAlpha(Utilities.i(qj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        if (this.D != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((qj0Var.computeVerticalScrollRange() - qj0Var.computeVerticalScrollOffset()) - qj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.q5);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.g3);
        org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.i4);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.q5);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.g3);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        c();
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.V = motionEvent.getX();
            this.W = motionEvent.getY();
            this.a0 = false;
            this.b0 = true;
            this.c0 = this.y;
            VelocityTracker velocityTracker = this.d0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.d0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.b0) {
            VelocityTracker velocityTracker2 = this.d0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.V;
            float y10 = motionEvent.getY() - this.W;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.a0 = true;
                this.V = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i13 = a10 != null ? a10.a.f(2).d : 0;
        if (i13 != this.G) {
            this.G = i13;
            qj0 qj0Var = this.r;
            View view = this.F;
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                qj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                qj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.cn cnVar;
        org.telegram.ui.ActionBar.r0 n92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i11 = 0;
        int i12 = a10 != null ? org.telegram.messenger.g0.I0(a10, false).c : 0;
        int i13 = this.H;
        di.b4 b4Var = this.h;
        if (i12 != i13) {
            this.H = i12;
            b4Var.getLayoutParams().width = getPanelWidth();
            b4Var.setPadding(0, 0, i12, 0);
            b4Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.fk fkVar = this.f;
        if (fkVar != null && (n92 = (cnVar = fkVar.a).n9()) != null) {
            View view = (View) n92.getParent();
            kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            i11 = (int) ((kVar.getWidth() - ((n92.getWidth() / 2.0f) + (n92.getX() + view.getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.H) - i11));
        if (max != this.I) {
            this.I = max;
            b4Var.getLayoutParams().width = getPanelWidth();
            b4Var.setTranslationX((1.0f - this.y) * getPanelWidth());
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
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = motionEvent.getX();
            this.W = motionEvent.getY();
            this.a0 = false;
            this.c0 = this.y;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x10 = motionEvent.getX() - this.V;
                if (!this.a0 && Math.abs(x10) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.a0 = true;
                    this.V = motionEvent.getX();
                    this.c0 = this.y;
                }
                if (this.a0) {
                    ValueAnimator valueAnimator = this.J;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.J = null;
                    }
                    setProgress(this.c0 - ((motionEvent.getX() - this.V) / this.I));
                }
            }
            return true;
        }
        if (this.a0) {
            this.d0.computeCurrentVelocity(1000);
            settle(this.d0.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (getPanelWidth() * this.y)) {
            d();
        }
        this.a0 = false;
        this.b0 = false;
        this.d0.recycle();
        this.d0 = null;
        return true;
    }

    public void setCurrentTopic(long j3) {
        this.K = j3;
        this.s.f();
    }

    public void setMenuAvailable(boolean z9) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    public void setProgress(float f10) {
        int i7 = 0;
        boolean z9 = this.y <= 0.0f && f10 > 0.0f;
        this.y = Utilities.l(f10);
        if (z9 && this.P != null) {
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.e0 && this.T == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f0 = ofFloat;
                ofFloat.addUpdateListener(new i01(this, i7));
                this.f0.addListener(new k01(this, 1));
                this.f0.setDuration(320L);
                this.f0.setInterpolator(xq.h);
                this.f0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        if (this.y <= 0.0f && !this.U) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.fk fkVar = this.f;
        if (fkVar != null) {
            fkVar.a.l1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z9 = false;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.y > 0.5f : f10 < 0.0f) {
            z9 = true;
        }
        if (z9) {
            h();
        }
        a(z9 ? 1.0f : 0.0f, f10);
        if (z9) {
            return;
        }
        org.telegram.messenger.g0.v1(this.w);
    }
}
