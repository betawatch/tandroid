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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v01 extends FrameLayout implements org.telegram.messenger.is {
    public static final /* synthetic */ int n0 = 0;
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
    public hh0 P;
    public final org.telegram.ui.b61 Q;
    public final di.i4 R;
    public final ArrayList S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public final int a;
    public float a0;
    public final long b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final boolean d;
    public float d0;
    public final org.telegram.ui.ActionBar.e6 e;
    public VelocityTracker e0;
    public final org.telegram.ui.dk f;
    public boolean f0;
    public ValueAnimator g0;
    public final bi.v1 h;
    public final TextPaint h0;
    public final HashMap i0;
    public final TextPaint j0;
    public final TextPaint k0;
    public final TextPaint l0;
    public final TextPaint m0;
    public final ImageView n;
    public final uj0 r;
    public final q01 s;
    public final EditText w;
    public final Paint x;
    public float y;

    public v01(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, final org.telegram.ui.dk dkVar) {
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
        this.S = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.h0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.i0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.j0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.k0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.l0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.m0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.a = i7;
        this.b = j3;
        this.e = e6Var;
        this.f = dkVar;
        TLRPC.Chat M02 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.t3.p0(M02);
        this.c = p02;
        boolean z12 = j3 == org.telegram.messenger.m10.i(i7).e();
        this.d = z12;
        setWillNotDraw(false);
        bi.v1 v1Var = new bi.v1(activity, 24);
        this.h = v1Var;
        v1Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        v1Var.setOutlineProvider(new bg.p0(16));
        v1Var.setClipToOutline(true);
        v1Var.setOnTouchListener(new gi.a(26));
        addView(v1Var, c8.ja.e(org.telegram.messenger.ns.L4, -1, 53));
        int i11 = org.telegram.messenger.g0.m;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        i9 i9Var = new i9(activity);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        if (z12) {
            t8Var.g(1);
            t8Var.p = 0.75f;
            i9Var.setImageDrawable(t8Var);
            String M03 = org.telegram.messenger.hd.M0(2131745901, null);
            i10 = i11;
            M0 = org.telegram.messenger.hd.G(s12.G1().j.size(), "Chats", new Object[0]);
            z10 = p02;
            z11 = z12;
            str = M03;
        } else {
            i10 = i11;
            if (p02) {
                z10 = p02;
                z11 = z12;
                TLRPC.Chat M04 = M02 != null ? s12.M0(Long.valueOf(M02.linked_monoforum_id)) : null;
                M04 = M04 == null ? M02 : M04;
                if (M04 != null) {
                    t8Var.q(M04);
                    i9Var.f(M04, t8Var);
                    str = M04.title;
                } else {
                    str = "";
                }
                M0 = org.telegram.messenger.hd.M0(2131743983, null);
            } else {
                z10 = p02;
                z11 = z12;
                if (M02 != null) {
                    t8Var.q(M02);
                    i9Var.f(M02, t8Var);
                    str = M02.title;
                    TLRPC.ChatFull N0 = s12.N0(M02.id);
                    int i12 = (N0 == null || (i12 = N0.participants_count) <= 0) ? M02.participants_count : i12;
                    M0 = i12 > 0 ? org.telegram.messenger.hd.H(',', "Members", i12) : org.telegram.messenger.hd.M0(2131743994, null);
                } else {
                    TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                    if (a22 != null) {
                        t8Var.r(a22);
                        i9Var.f(a22, t8Var);
                        str = org.telegram.messenger.q10.p(a22);
                    } else {
                        str = "";
                    }
                    M0 = org.telegram.messenger.hd.M0(2131743994, null);
                }
            }
        }
        m01 m01Var = new m01(activity, 0);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        boolean z13 = z10;
        boolean z14 = z11;
        m01Var.setBackground(org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)), 24, 24));
        final int i14 = 0;
        m01Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i15) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.a;
                        anVar.n0.d();
                        if (anVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new y80(bundle, null));
                            break;
                        } else if (org.telegram.messenger.t3.p0(anVar.e)) {
                            anVar.presentFragment(ProfileActivity.C4(-anVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = anVar.e;
                            if (chat != null) {
                                anVar.presentFragment(ProfileActivity.C4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = anVar.f;
                                if (user != null) {
                                    anVar.presentFragment(ProfileActivity.C4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.a;
                        org.telegram.ui.ActionBar.q0 q0Var = anVar2.j0;
                        if (q0Var != null && anVar2.n0 != null) {
                            q0Var.z();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.j0.getPopupLayout();
                            m60 I = m60.I(anVar2, view);
                            boolean z15 = true;
                            for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                View childAt = popupLayout.M.getChildAt(i16);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z15) {
                                            I.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable ch0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new ch0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.o0 o0Var = anVar2.t1;
                                        if (o0Var == null || z0Var != o0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = ch0Var;
                                                I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.oe(anVar2, intValue, 4));
                                                if (drawable2 instanceof ch0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof fh0) {
                                                            fh0 fh0Var = (fh0) z0Var2.getImageView();
                                                            fh0Var.setAnimation((ch0) drawable2);
                                                            fh0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(z0Var.getIconResId(), ch0Var, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                            }
                                        } else if (anVar2.getMessagesController().r2(anVar2.k6, anVar2.b(), null)) {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.ye(anVar2, 16), false);
                                        } else {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.u5(19, anVar2, I), false);
                                        }
                                        z15 = false;
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
        v1Var.addView(m01Var, c8.ja.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        m01Var.addView(i9Var, c8.ja.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        final int i15 = 1;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.k01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                org.telegram.ui.dk dkVar2 = dkVar;
                switch (i152) {
                    case 0:
                        org.telegram.ui.an anVar = dkVar2.a;
                        anVar.n0.d();
                        if (anVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", anVar.getUserConfig().e());
                            anVar.presentFragment(new y80(bundle, null));
                            break;
                        } else if (org.telegram.messenger.t3.p0(anVar.e)) {
                            anVar.presentFragment(ProfileActivity.C4(-anVar.e.linked_monoforum_id));
                            break;
                        } else {
                            TLRPC.Chat chat = anVar.e;
                            if (chat != null) {
                                anVar.presentFragment(ProfileActivity.C4(-chat.id));
                                break;
                            } else {
                                TLRPC.User user = anVar.f;
                                if (user != null) {
                                    anVar.presentFragment(ProfileActivity.C4(user.id));
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        org.telegram.ui.an anVar2 = dkVar2.a;
                        org.telegram.ui.ActionBar.q0 q0Var = anVar2.j0;
                        if (q0Var != null && anVar2.n0 != null) {
                            q0Var.z();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = anVar2.j0.getPopupLayout();
                            m60 I = m60.I(anVar2, view);
                            boolean z15 = true;
                            for (int i16 = 0; i16 < popupLayout.getItemsCount(); i16++) {
                                View childAt = popupLayout.M.getChildAt(i16);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z15) {
                                            I.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.z0) {
                                        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) childAt;
                                        CharSequence text = z0Var.getTextView().getText();
                                        Drawable drawable = z0Var.getIconResId() == 0 ? z0Var.getImageView().getDrawable() : null;
                                        Drawable ch0Var = ((z0Var.getTag() instanceof Integer) && ((Integer) z0Var.getTag()).intValue() == 29) ? new ch0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)) : (drawable == null || drawable.getConstantState() == null) ? null : drawable.getConstantState().newDrawable().mutate();
                                        org.telegram.ui.ActionBar.o0 o0Var = anVar2.t1;
                                        if (o0Var == null || z0Var != o0Var.j) {
                                            if (z0Var.getTag() instanceof Integer) {
                                                int intValue = ((Integer) z0Var.getTag()).intValue();
                                                Drawable drawable2 = ch0Var;
                                                I.b(z0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.oe(anVar2, intValue, 4));
                                                if (drawable2 instanceof ch0) {
                                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) I.A;
                                                    View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                    if (childAt2 instanceof org.telegram.ui.ActionBar.z0) {
                                                        org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) childAt2;
                                                        if (z0Var2.getImageView() instanceof fh0) {
                                                            fh0 fh0Var = (fh0) z0Var2.getImageView();
                                                            fh0Var.setAnimation((ch0) drawable2);
                                                            fh0Var.d();
                                                        }
                                                    }
                                                }
                                            } else {
                                                I.b(z0Var.getIconResId(), ch0Var, text, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.fq0(z0Var, 26));
                                            }
                                        } else if (anVar2.getMessagesController().r2(anVar2.k6, anVar2.b(), null)) {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.ye(anVar2, 16), false);
                                        } else {
                                            I.c(z0Var.getIconResId(), text, new org.telegram.ui.u5(19, anVar2, I), false);
                                        }
                                        z15 = false;
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
        v1Var.addView(imageView, c8.ja.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        m01Var.addView(textView, c8.ja.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i16 = org.telegram.ui.ActionBar.j6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
        textView2.setText(M0);
        textView2.setIncludeFontPadding(false);
        m01Var.addView(textView2, c8.ja.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new n01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.outline_header_search);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i16, e6Var), mode));
        frameLayout.addView(imageView2, c8.ja.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        editText.addTextChangedListener(new ah.j(this, 27));
        frameLayout.addView(editText, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 48.0f, 0.0f, 12.0f, 0.0f));
        v1Var.addView(frameLayout, c8.ja.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        uj0 uj0Var = new uj0(activity, e6Var);
        this.r = uj0Var;
        uj0Var.setLayoutManager(new v4.b0());
        uj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        uj0Var.setClipToPadding(false);
        uj0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        er erVar = er.h;
        kVar.i = erVar;
        kVar.n(350L);
        kVar.d = 160L;
        uj0Var.setItemAnimator(kVar);
        uj0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        uj0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i13, e6Var)));
        q01 q01Var = new q01(this);
        this.s = q01Var;
        uj0Var.setAdapter(q01Var);
        uj0Var.setOnItemClickListener(new fi.i4(14, this, dkVar));
        uj0Var.setOnItemLongClickListener((ij0) new f1(23, this, dkVar));
        uj0Var.j(new o01(this, i7, j3));
        v1Var.addView(uj0Var, c8.ja.f(-1.0f, -1, org.telegram.messenger.ns.E1, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(7, activity, e6Var);
        this.Q = b61Var;
        b61Var.setLayoutManager(new v4.b0(0, false));
        b61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        b61Var.setClipToPadding(false);
        b61Var.setHorizontalScrollBarEnabled(false);
        b61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(erVar);
        kVar2.n(320L);
        b61Var.setItemAnimator(kVar2);
        di.i4 i4Var = new di.i4(this, 5);
        this.R = i4Var;
        b61Var.setAdapter(i4Var);
        b61Var.setOnItemClickListener(new j(this, 19));
        b61Var.setVisibility(8);
        v1Var.addView(b61Var, c8.ja.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i17 = org.telegram.ui.ActionBar.j6.d6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        v1Var.addView(view, c8.ja.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        v1Var.addView(view2, c8.ja.e(-1, 24, 87));
        this.F = view;
        i();
        TLRPC.User a23 = j3 > 0 ? org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3)) : null;
        if (!z13 && !z14 && ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.q10.v(a23))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable.setColor(i0.a.o(w03, org.telegram.messenger.ns.B3));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i18 = org.telegram.ui.ActionBar.j6.Ji;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(i18, e6Var));
            textView3.setText(org.telegram.messenger.hd.M0(2131748251, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(R.drawable.filled_topic_new_24).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i18, e6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var)));
            c8.na.a(textView3);
            textView3.setOnClickListener(new vv0(3, this, dkVar));
            frameLayout2.addView(textView3, c8.ja.c(44.0f, -2));
            v1Var.addView(frameLayout2, c8.ja.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        v1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(i17, e6Var));
        setProgress(0.0f);
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    private void setTagsShown(boolean z10) {
        if (this.f0 == z10) {
            return;
        }
        this.f0 = z10;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, z10 ? 1.0f : 0.0f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new j01(this, 1));
        this.U.addListener(new l01(this, 0));
        this.U.setDuration(320L);
        this.U.setInterpolator(er.h);
        this.U.start();
    }

    public final void a(float f10, float f11) {
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
        ofFloat.addUpdateListener(new j01(this, 2));
        this.K.addListener(new l01(this, 2));
        this.K.setDuration(Math.abs(f11) > ((float) org.telegram.messenger.g0.L(300.0f)) ? (long) Math.max(150.0f, Math.min(320.0f, ((Math.abs(f10 - this.y) * getPanelWidth()) / Math.abs(f11)) * 1000.0f * 2.0f)) : 320L);
        this.K.setInterpolator(er.h);
        this.K.start();
    }

    public final void b(float f10) {
        org.telegram.ui.b61 b61Var = this.Q;
        int childCount = b61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = b61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void c() {
        hh0 hh0Var = this.P;
        if (hh0Var != null) {
            org.telegram.messenger.g0.r(hh0Var);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    public final void d() {
        a(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.w);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.q5) {
            if (((Long) objArr[0]).longValue() == (-this.b)) {
                h();
            }
        } else {
            if (i7 == org.telegram.messenger.ns.r) {
                h();
                return;
            }
            if (i7 == org.telegram.messenger.ns.g3) {
                if (this.d) {
                    h();
                }
            } else if (i7 == org.telegram.messenger.ns.i4) {
                org.telegram.messenger.g0.d0(this.r, new pg.c(0));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.j6.r1(this.y, 687865856);
        Paint paint = this.x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.dk dkVar = this.f;
        if (dkVar != null && this.y > 0.0f) {
            org.telegram.ui.an.N2(dkVar.a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        this.V = false;
        setVisibility(this.y <= 0.0f ? 8 : 0);
        return dispatchTouchEvent;
    }

    public final TLObject e(s01 s01Var) {
        long o4;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.a);
        org.telegram.messenger.sv svVar = s01Var.b;
        if (svVar != null) {
            o4 = svVar.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = s01Var.a;
            if (tL_forumTopic == null || !this.c) {
                return null;
            }
            o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return o4 >= 0 ? s12.a2(Long.valueOf(o4)) : s12.M0(Long.valueOf(-o4));
    }

    public final String f(long j3) {
        int i7 = this.a;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        if (j3 == org.telegram.messenger.m10.i(i7).e()) {
            return org.telegram.messenger.hd.M0(2131748303, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.hd.M0(2131754252, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.q10.p(s12.a2(Long.valueOf(j3)));
        }
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        return M0 != null ? M0.title : "";
    }

    public final boolean g(s01 s01Var) {
        String str;
        org.telegram.messenger.sv svVar = s01Var.b;
        String str2 = "";
        if (svVar != null) {
            String f10 = f(svVar.a);
            if (f10 != null) {
                str2 = f10.toString();
            }
        } else {
            TLObject e10 = e(s01Var);
            if (e10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.q10.p((TLRPC.User) e10);
            } else if (e10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) e10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = s01Var.a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.y;
    }

    public final void h() {
        String str;
        int visibility = getVisibility();
        q01 q01Var = this.s;
        if (visibility == 0 || this.y > 0.0f || q01Var.c.size() <= 0) {
            ArrayList arrayList = q01Var.c;
            String str2 = q01Var.d;
            v01 v01Var = q01Var.e;
            String str3 = v01Var.M;
            int i7 = v01Var.a;
            boolean z10 = v01Var.d;
            int i10 = 0;
            boolean z11 = TextUtils.equals(str2, str3) && v01Var.y > 0.0f && !arrayList.isEmpty();
            q01Var.d = v01Var.M;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            ArrayList l10 = z10 ? null : org.telegram.messenger.np.s1(i7).r7.l(-v01Var.b);
            if (z10) {
                str = null;
            } else {
                di.i4 i4Var = v01Var.R;
                ArrayList arrayList3 = v01Var.S;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (l10 != null) {
                    boolean z12 = org.telegram.messenger.r2.a;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((r01) it.next()).getClass();
                }
                str = null;
                if (arrayList4.size() < 2) {
                    arrayList4.clear();
                }
                Collections.sort(arrayList4, new org.telegram.ui.me(18));
                if (arrayList4.size() > 0) {
                    ((r01) arrayList4.get(0)).getClass();
                    throw null;
                }
                ArrayList arrayList5 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                if (arrayList5.isEmpty() || arrayList4.isEmpty() || v01Var.T <= 0.0f) {
                    i4Var.f();
                } else {
                    v4.o.c(new p01(arrayList5, arrayList4), true).c(i4Var);
                }
                v01Var.setTagsShown(!arrayList3.isEmpty());
            }
            if (TextUtils.isEmpty(v01Var.M)) {
                arrayList.add(new s01(v01Var));
            }
            if (z10) {
                ArrayList arrayList6 = org.telegram.messenger.np.s1(i7).G1().j;
                int size = arrayList6.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList6.get(i11);
                    i11++;
                    s01 s01Var = new s01(v01Var);
                    s01Var.b = (org.telegram.messenger.sv) obj;
                    if (!TextUtils.isEmpty(v01Var.M) && !v01Var.g(s01Var)) {
                        TLObject e10 = v01Var.e(s01Var);
                        String n10 = e10 instanceof TLRPC.User ? org.telegram.messenger.q10.n((TLRPC.User) e10) : e10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e10, false) : str;
                        if (n10 != null && n10.toLowerCase().contains(v01Var.M)) {
                        }
                    }
                    arrayList.add(s01Var);
                }
                if (z11) {
                    v4.o.c(new jg.g(q01Var, arrayList2, 3), true).c(q01Var);
                } else {
                    q01Var.f();
                }
            } else {
                HashSet hashSet = new HashSet();
                if (l10 != null) {
                    int size2 = l10.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = l10.get(i12);
                        i12++;
                        s01 s01Var2 = new s01(v01Var);
                        s01Var2.a = (TLRPC.TL_forumTopic) obj2;
                        if (!TextUtils.isEmpty(v01Var.M) && !v01Var.g(s01Var2)) {
                            TLObject e11 = v01Var.e(s01Var2);
                            String n11 = e11 instanceof TLRPC.User ? org.telegram.messenger.q10.n((TLRPC.User) e11) : e11 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e11, false) : str;
                            if (n11 != null && n11.toLowerCase().contains(v01Var.M)) {
                            }
                        }
                        arrayList.add(s01Var2);
                        hashSet.add(Long.valueOf(s01Var2.a()));
                    }
                }
                if (!TextUtils.isEmpty(v01Var.M)) {
                    ArrayList arrayList7 = v01Var.N;
                    int size3 = arrayList7.size();
                    while (i10 < size3) {
                        Object obj3 = arrayList7.get(i10);
                        i10++;
                        s01 s01Var3 = new s01(v01Var);
                        s01Var3.a = (TLRPC.TL_forumTopic) obj3;
                        if (hashSet.add(Long.valueOf(s01Var3.a()))) {
                            arrayList.add(s01Var3);
                        }
                    }
                }
                if (z11) {
                    v4.o.c(new jg.g(q01Var, arrayList2, 3), true).c(q01Var);
                } else {
                    q01Var.f();
                }
            }
            this.r.post(new ro0(this, 20));
        }
    }

    public final void i() {
        View view;
        View view2 = this.F;
        if (view2 == null || (view = this.G) == null) {
            return;
        }
        uj0 uj0Var = this.r;
        view2.setAlpha(Utilities.i(uj0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        if (this.E != null) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(Utilities.i(((uj0Var.computeVerticalScrollRange() - uj0Var.computeVerticalScrollOffset()) - uj0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.q5);
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.r);
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.g3);
        org.telegram.messenger.ns.e().b(this, org.telegram.messenger.ns.i4);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.q5);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.r);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.g3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        c();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
            this.b0 = false;
            this.c0 = true;
            this.d0 = this.y;
            VelocityTracker velocityTracker = this.e0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.e0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.c0) {
            VelocityTracker velocityTracker2 = this.e0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.W;
            float y10 = motionEvent.getY() - this.a0;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.b0 = true;
                this.W = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i13 = a10 != null ? a10.a.f(2).d : 0;
        if (i13 != this.H) {
            this.H = i13;
            uj0 uj0Var = this.r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                uj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                uj0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.an anVar;
        org.telegram.ui.ActionBar.q0 o92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a10 = r0.b0.a(this);
        int i11 = 0;
        int i12 = a10 != null ? org.telegram.messenger.g0.I0(a10, false).c : 0;
        int i13 = this.I;
        bi.v1 v1Var = this.h;
        if (i12 != i13) {
            this.I = i12;
            v1Var.getLayoutParams().width = getPanelWidth();
            v1Var.setPadding(0, 0, i12, 0);
            v1Var.setTranslationX((1.0f - this.y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.dk dkVar = this.f;
        if (dkVar != null && (o92 = (anVar = dkVar.a).o9()) != null) {
            View view = (View) o92.getParent();
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            i11 = (int) ((kVar.getWidth() - ((o92.getWidth() / 2.0f) + (o92.getX() + view.getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.I) - i11));
        if (max != this.J) {
            this.J = max;
            v1Var.getLayoutParams().width = getPanelWidth();
            v1Var.setTranslationX((1.0f - this.y) * getPanelWidth());
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
        if (this.e0 == null) {
            this.e0 = VelocityTracker.obtain();
        }
        this.e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.W = motionEvent.getX();
            this.a0 = motionEvent.getY();
            this.b0 = false;
            this.d0 = this.y;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x10 = motionEvent.getX() - this.W;
                if (!this.b0 && Math.abs(x10) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    this.b0 = true;
                    this.W = motionEvent.getX();
                    this.d0 = this.y;
                }
                if (this.b0) {
                    ValueAnimator valueAnimator = this.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.K = null;
                    }
                    setProgress(this.d0 - ((motionEvent.getX() - this.W) / this.J));
                }
            }
            return true;
        }
        if (this.b0) {
            this.e0.computeCurrentVelocity(1000);
            settle(this.e0.getXVelocity());
        } else if (motionEvent.getActionMasked() == 1 && motionEvent.getX() < getWidth() - (getPanelWidth() * this.y)) {
            d();
        }
        this.b0 = false;
        this.c0 = false;
        this.e0.recycle();
        this.e0 = null;
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
        if (z10 && this.Q != null) {
            ValueAnimator valueAnimator = this.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f0 && this.U == null) {
                b(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.g0 = ofFloat;
                ofFloat.addUpdateListener(new j01(this, i7));
                this.g0.addListener(new l01(this, 1));
                this.g0.setDuration(320L);
                this.g0.setInterpolator(er.h);
                this.g0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.y) * getPanelWidth());
        if (this.y <= 0.0f && !this.V) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.dk dkVar = this.f;
        if (dkVar != null) {
            dkVar.a.m1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z10 = false;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.y > 0.5f : f10 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            h();
        }
        a(z10 ? 1.0f : 0.0f, f10);
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.v1(this.w);
    }
}
