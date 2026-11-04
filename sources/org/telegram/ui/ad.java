package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ad extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public org.telegram.ui.Cells.n4 I;
    public EditTextBoldCursor J;
    public boolean K;
    public org.telegram.ui.Components.ch0 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public org.telegram.ui.Components.m70 R;
    public org.telegram.ui.Cells.g6 S;
    public org.telegram.ui.Cells.g6 T;
    public org.telegram.ui.Cells.y8 U;
    public TextView V;
    public org.telegram.ui.Cells.b2 W;
    public org.telegram.ui.Cells.n4 X;
    public int Y;
    public String Z;
    public org.telegram.ui.ActionBar.q0 a;
    public sc a0;
    public org.telegram.ui.Components.wq b;
    public boolean b0;
    public org.telegram.ui.Components.cp c;
    public boolean c0;
    public org.telegram.ui.Components.jt d;
    public boolean d0;
    public org.telegram.ui.Cells.x6 e;
    public TLRPC.TL_chatInviteExported e0;
    public ei.d4 f;
    public boolean f0;
    public org.telegram.ui.Cells.y8 g0;
    public gi.n5 h;
    public final ArrayList h0;
    public org.telegram.ui.Cells.t4 i0;
    public final int j0;
    public final long k0;
    public boolean l0;
    public final Boolean m0;
    public xc n;
    public TLRPC.InputFile n0;
    public TLRPC.InputFile o0;
    public TLRPC.VideoSize p0;
    public String q0;
    public AnimatorSet r;
    public double r0;
    public yc s;
    public boolean s0;
    public boolean t0;
    public Integer u0;
    public org.telegram.messenger.n10 v0;
    public final org.telegram.ui.Components.u8 w;
    public org.telegram.ui.ActionBar.s1 w0;
    public final org.telegram.ui.Components.f30 x;
    public final qc x0;
    public EditTextBoldCursor y;
    public ValueAnimator y0;
    public int z0;

    public ad(Bundle bundle) {
        super(bundle);
        this.h0 = new ArrayList();
        this.l0 = true;
        this.x0 = new qc(this, 0);
        int i3 = bundle.getInt("step", 0);
        this.j0 = i3;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i3 == 0) {
            this.w = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            this.x = new org.telegram.ui.Components.f30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new rc(this, 1));
            return;
        }
        if (i3 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.l0 = z10;
            this.c0 = !z10;
            if (!z10 && !this.f0) {
                this.f0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new rc(this, 0));
            }
        }
        this.k0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void Z(ad adVar, org.telegram.ui.ActionBar.s1 s1Var) {
        adVar.t0 = false;
        adVar.s0 = false;
        if (adVar.u0 != null) {
            ConnectionsManager.getInstance(adVar.currentAccount).cancelRequest(adVar.u0.intValue(), true);
            adVar.u0 = null;
        }
        adVar.m0(false);
        s1Var.dismiss();
    }

    public static /* synthetic */ void a0(ad adVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.hp.i1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_updateUsername, new rc(adVar, 2), 64);
    }

    public static /* synthetic */ void b0(ad adVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.hp.s1(adVar.currentAccount).h1(adVar.k0);
        adVar.Y = ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_checkUsername, new y9(adVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(ad adVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        if (currentChannel.megagroup) {
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlert", null, 2131746032, org.telegram.messenger.hp.s1(adVar.currentAccount).V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        } else {
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlertChannel", null, 2131746031, org.telegram.messenger.hp.s1(adVar.currentAccount).V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new mi.d4(17, adVar, currentChannel));
        adVar.showDialog(s1Var);
    }

    public static void d0(ad adVar) {
        if (adVar.w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131744842, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131744843, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743223, null), null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131744851, null), new x0(adVar, 14));
        adVar.w0 = alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        yc ycVar = this.s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
        yc ycVar = this.s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3;
        final ad adVar = this;
        org.telegram.ui.Components.jt jtVar = adVar.d;
        if (jtVar != null) {
            jtVar.o();
        }
        adVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        adVar.actionBar.setAllowOverlayTitle(true);
        int i11 = 5;
        adVar.actionBar.setActionBarMenuOnItemClick(new o9(adVar, i11));
        org.telegram.ui.ActionBar.x q10 = adVar.actionBar.q();
        Drawable g7 = k2.p1.g(context, R.drawable.ic_ab_done);
        int i12 = org.telegram.ui.ActionBar.k6.v8;
        final int i13 = 0;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        g7.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        adVar.c = cpVar;
        org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(g7, cpVar);
        adVar.b = wqVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String M0 = org.telegram.messenger.bd.M0(2131751355, null);
        org.telegram.ui.ActionBar.k kVar = q10.b;
        org.telegram.ui.ActionBar.q0 b10 = q10.b(1, 0, null, q10.c ? kVar.r0 : kVar.q0, wqVar, L, M0, null);
        adVar.a = b10;
        org.telegram.ui.ActionBar.r6.y(b10, g7, i12, null, mode);
        int i14 = 2;
        int i15 = 3;
        int i16 = adVar.j0;
        if (i16 == 0) {
            adVar.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748294, null));
            wc wcVar = new wc(i13, context, adVar);
            wcVar.setOnTouchListener(new fi.a(2));
            adVar.fragmentView = wcVar;
            int i17 = org.telegram.ui.ActionBar.k6.d6;
            wcVar.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.r6.i(i17, adVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            adVar.M = linearLayout;
            linearLayout.setOrientation(1);
            wcVar.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            adVar.M.addView(frameLayout, b8.mf.o(-1, -2));
            ei.d4 d4Var = new ei.d4(i11, context, adVar);
            adVar.f = d4Var;
            d4Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.u8 u8Var = adVar.w;
            u8Var.k(5L, null, null, null);
            adVar.f.setImageDrawable(u8Var);
            ei.d4 d4Var2 = adVar.f;
            boolean z10 = org.telegram.messenger.bd.a0;
            frameLayout.addView(d4Var2, b8.mf.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            gi.n5 n5Var = new gi.n5(adVar, context, paint, i15);
            adVar.h = n5Var;
            n5Var.setContentDescription(org.telegram.messenger.bd.M0(2131752212, null));
            gi.n5 n5Var2 = adVar.h;
            boolean z11 = org.telegram.messenger.bd.a0;
            frameLayout.addView(n5Var2, b8.mf.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            adVar.h.setOnClickListener(new tc(adVar, i10));
            adVar.L = new org.telegram.ui.Components.ch0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            xc xcVar = new xc(0, context, adVar);
            adVar.n = xcVar;
            xcVar.setScaleType(ImageView.ScaleType.CENTER);
            adVar.n.setAnimation(adVar.L);
            adVar.n.setEnabled(false);
            adVar.n.setClickable(false);
            adVar.n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            xc xcVar2 = adVar.n;
            boolean z12 = org.telegram.messenger.bd.a0;
            frameLayout.addView(xcVar2, b8.mf.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            yc ycVar = new yc(adVar, context, i13);
            adVar.s = ycVar;
            ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
            adVar.s.setProgressColor(-1);
            adVar.s.setNoProgress(false);
            yc ycVar2 = adVar.s;
            boolean z13 = org.telegram.messenger.bd.a0;
            frameLayout.addView(ycVar2, b8.mf.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            adVar.k0(false, false);
            org.telegram.ui.Components.jt jtVar2 = new org.telegram.ui.Components.jt(context, wcVar, adVar, 0, false, null);
            adVar = adVar;
            adVar.d = jtVar2;
            jtVar2.setHint(org.telegram.messenger.bd.M0(2131751125, null));
            String str = adVar.G;
            if (str != null) {
                adVar.d.setText(str);
                adVar.G = null;
            }
            adVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            adVar.d.getEditText().setSingleLine(true);
            adVar.d.getEditText().setImeOptions(5);
            adVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) { // from class: org.telegram.ui.uc
                public final /* synthetic */ ad b;

                {
                    this.b = adVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (i13) {
                        case 0:
                            ad adVar2 = this.b;
                            if (i18 != 5) {
                                adVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                adVar2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i18 == 6 && (q0Var = this.b.a) != null) {
                                q0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.jt jtVar3 = adVar.d;
            boolean z14 = org.telegram.messenger.bd.a0;
            frameLayout.addView(jtVar3, b8.mf.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            adVar.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.E(adVar.y, org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = adVar.y;
            int i18 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i18, null);
            adVar.y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.G(adVar.y, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, adVar.getResourceProvider());
            adVar.y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            adVar.y.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            adVar.y.setInputType(180225);
            adVar.y.setImeOptions(6);
            adVar.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            adVar.y.setHint(org.telegram.messenger.bd.M0(2131751460, null));
            org.telegram.ui.ActionBar.r6.w(adVar.y, i18, null);
            adVar.y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.y.setCursorWidth(1.5f);
            adVar.M.addView(adVar.y, b8.mf.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            adVar.y.setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) { // from class: org.telegram.ui.uc
                public final /* synthetic */ ad b;

                {
                    this.b = adVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i182, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (i10) {
                        case 0:
                            ad adVar2 = this.b;
                            if (i182 != 5) {
                                adVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                adVar2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i182 == 6 && (q0Var = this.b.a) != null) {
                                q0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            adVar.y.addTextChangedListener(new zc(0));
            TextView textView = new TextView(context);
            adVar.V = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(adVar.V, org.telegram.ui.ActionBar.k6.F6, null);
            adVar.V.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            adVar.V.setText(org.telegram.messenger.bd.M0(2131751463, null));
            adVar.M.addView(adVar.V, b8.mf.t(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3, 24, 10, 24, 20));
        } else if (i16 == 1) {
            ScrollView scrollView = new ScrollView(context);
            adVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            adVar.M = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.hp messagesController = adVar.getMessagesController();
            long j10 = adVar.k0;
            TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j10));
            boolean z15 = M02 != null && (!org.telegram.messenger.t3.T(M02) || org.telegram.messenger.t3.n0(M02));
            adVar.K = z15;
            adVar.actionBar.setTitle(org.telegram.messenger.bd.M0(z15 ? 2131749408 : 2131752297, null));
            View view = adVar.fragmentView;
            int i19 = org.telegram.ui.ActionBar.k6.a7;
            view.setTag(Integer.valueOf(i19));
            org.telegram.ui.ActionBar.r6.i(i19, adVar.fragmentView, null);
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
            adVar.I = n4Var;
            n4Var.setHeight(46);
            org.telegram.ui.Cells.n4 n4Var2 = adVar.I;
            int i20 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i20, n4Var2, null);
            adVar.I.setText(org.telegram.messenger.bd.M0(adVar.K ? 2131749399 : 2131752275, null));
            adVar.M.addView(adVar.I);
            LinearLayout linearLayout3 = new LinearLayout(context);
            adVar.H = linearLayout3;
            linearLayout3.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(i20, adVar.H, null);
            adVar.M.addView(adVar.H, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
            adVar.S = g6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            int i21 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i21);
            g6Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(g6Var, N0, null, N, null);
            Boolean bool = adVar.m0;
            if (bool != null && !bool.booleanValue()) {
                adVar.c0 = true;
            }
            if (adVar.K) {
                i3 = 1;
                adVar.S.b(org.telegram.messenger.bd.M0(2131748646, null), org.telegram.messenger.bd.M0(2131748645, null), false, !adVar.c0);
            } else {
                i3 = 1;
                adVar.S.b(org.telegram.messenger.bd.M0(2131752318, null), org.telegram.messenger.bd.M0(2131752315, null), false, !adVar.c0);
            }
            adVar.S.setOnClickListener(new tc(adVar, i14));
            if (bool == null || bool.booleanValue()) {
                adVar.H.addView(adVar.S, b8.mf.o(-1, -2));
            }
            org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
            adVar.T = g6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i21);
            g6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(g6Var2, N02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                adVar.c0 = false;
            }
            if (adVar.K) {
                adVar.T.b(org.telegram.messenger.bd.M0(2131748649, null), org.telegram.messenger.bd.M0(2131748648, null), false, adVar.c0);
            } else {
                adVar.T.b(org.telegram.messenger.bd.M0(2131752329, null), org.telegram.messenger.bd.M0(2131752328, null), false, adVar.c0);
            }
            adVar.T.setOnClickListener(new tc(adVar, 3));
            if (bool == null || !bool.booleanValue()) {
                adVar.H.addView(adVar.T, b8.mf.o(-1, -2));
            }
            org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            adVar.e = x6Var;
            adVar.M.addView(x6Var, b8.mf.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            adVar.O = linearLayout4;
            linearLayout4.setOrientation(i3);
            org.telegram.ui.ActionBar.r6.i(i20, adVar.O, null);
            adVar.M.addView(adVar.O, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
            adVar.X = n4Var3;
            adVar.O.addView(n4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            adVar.P = linearLayout5;
            linearLayout5.setOrientation(0);
            adVar.O.addView(adVar.P, b8.mf.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            adVar.J = editTextBoldCursor3;
            editTextBoldCursor3.setText(org.telegram.messenger.hp.s1(adVar.currentAccount).V2 + "/");
            adVar.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = adVar.J;
            int i22 = org.telegram.ui.ActionBar.k6.H6;
            org.telegram.ui.ActionBar.r6.E(editTextBoldCursor4, i22, null);
            EditTextBoldCursor editTextBoldCursor5 = adVar.J;
            int i23 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor5, i23, null);
            adVar.J.setMaxLines(1);
            adVar.J.setLines(1);
            adVar.J.setEnabled(false);
            adVar.J.setBackgroundDrawable(null);
            adVar.J.setPadding(0, 0, 0, 0);
            adVar.J.setSingleLine(true);
            adVar.J.setInputType(163840);
            adVar.J.setImeOptions(6);
            adVar.P.addView(adVar.J, b8.mf.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            adVar.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.E(adVar.y, i22, null);
            org.telegram.ui.ActionBar.r6.V(adVar.y, i23, null);
            adVar.y.setMaxLines(1);
            adVar.y.setLines(1);
            adVar.y.setBackgroundDrawable(null);
            adVar.y.setPadding(0, 0, 0, 0);
            adVar.y.setSingleLine(true);
            adVar.y.setInputType(163872);
            adVar.y.setImeOptions(6);
            adVar.y.setHint(org.telegram.messenger.bd.M0(2131752266, null));
            org.telegram.ui.ActionBar.r6.w(adVar.y, i23, null);
            adVar.y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.y.setCursorWidth(1.5f);
            adVar.P.addView(adVar.y, b8.mf.o(-1, 36));
            adVar.y.addTextChangedListener(new n0(adVar, i14));
            LinearLayout linearLayout6 = new LinearLayout(context);
            adVar.Q = linearLayout6;
            linearLayout6.setOrientation(1);
            adVar.O.addView(adVar.Q, b8.mf.o(-1, -2));
            org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, adVar, null, true, org.telegram.messenger.t3.T(adVar.getMessagesController().M0(Long.valueOf(j10))));
            adVar.R = m70Var;
            m70Var.b(true);
            adVar.R.d(0, null, false);
            adVar.Q.addView(adVar.R);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(3, context, adVar);
            adVar.W = b2Var;
            org.telegram.ui.ActionBar.r6.H(b2Var, org.telegram.ui.ActionBar.k6.J6, null);
            org.telegram.ui.ActionBar.r6.D(adVar.W, org.telegram.ui.ActionBar.k6.K6, null);
            adVar.W.setTextSize(1, 15.0f);
            adVar.W.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            adVar.W.setVisibility(8);
            adVar.W.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            adVar.O.addView(adVar.W, b8.mf.t(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            adVar.U = y8Var;
            int i24 = org.telegram.ui.ActionBar.k6.b7;
            org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_bottom, i24);
            adVar.M.addView(adVar.U, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
            adVar.i0 = t4Var;
            adVar.M.addView(t4Var, b8.mf.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            adVar.N = linearLayout7;
            org.telegram.ui.ActionBar.r6.i(i20, linearLayout7, null);
            adVar.N.setOrientation(1);
            adVar.M.addView(adVar.N, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            adVar.g0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, R.drawable.greydivider_bottom, i24);
            adVar.M.addView(adVar.g0, b8.mf.o(-1, -2));
            adVar.n0();
        }
        return adVar.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.S) {
            org.telegram.ui.ActionBar.s1 s1Var = this.w0;
            if (s1Var != null) {
                try {
                    s1Var.dismiss();
                    this.w0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.t0 = false;
            return;
        }
        if (i3 == org.telegram.messenger.hs.R) {
            org.telegram.ui.ActionBar.s1 s1Var2 = this.w0;
            if (s1Var2 != null) {
                try {
                    s1Var2.dismiss();
                    this.w0 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.n0 != null || this.o0 != null || this.p0 != null) {
                org.telegram.messenger.hp.s1(this.currentAccount).B(longValue, null, this.n0, this.o0, this.p0, this.r0, this.q0, this.E, this.F, null);
            }
            ad adVar = new ad(bundle);
            adVar.v0 = this.v0;
            presentFragment(adVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var == null || !f30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.f30 f30Var = this.x;
        return (f30Var == null || dialog != f30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.jt jtVar = this.d;
        int i3 = org.telegram.ui.ActionBar.k6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jtVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.Components.jt jtVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.k6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jtVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
        LinearLayout linearLayout = this.Q;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.i0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false) + (org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x02 == this.z0) {
            return;
        }
        this.z0 = x02;
        LinearLayout linearLayout = this.N;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.N.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                    nVar.d.q(nVar.f);
                    nVar.a.invalidate();
                }
            }
        }
    }

    public final boolean j0(String str) {
        int i3 = 0;
        if (str == null || str.length() <= 0) {
            this.W.setVisibility(8);
        } else {
            this.W.setVisibility(0);
        }
        sc scVar = this.a0;
        if (scVar != null) {
            org.telegram.messenger.g0.r(scVar);
            this.a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.b0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.W.setText(org.telegram.messenger.bd.M0(2131748917, null));
                org.telegram.ui.Cells.b2 b2Var = this.W;
                int i10 = org.telegram.ui.ActionBar.k6.p7;
                b2Var.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.r6.V(this.W, i10, null);
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.W.setText(org.telegram.messenger.bd.M0(2131748913, null));
                    org.telegram.ui.Cells.b2 b2Var2 = this.W;
                    int i12 = org.telegram.ui.ActionBar.k6.p7;
                    b2Var2.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.r6.V(this.W, i12, null);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.W.setText(org.telegram.messenger.bd.M0(2131748917, null));
                    org.telegram.ui.Cells.b2 b2Var3 = this.W;
                    int i13 = org.telegram.ui.ActionBar.k6.p7;
                    b2Var3.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.r6.V(this.W, i13, null);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.W.setText(org.telegram.messenger.bd.M0(2131748915, null));
            org.telegram.ui.Cells.b2 b2Var4 = this.W;
            int i14 = org.telegram.ui.ActionBar.k6.p7;
            b2Var4.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.r6.V(this.W, i14, null);
            return false;
        }
        if (str.length() > 32) {
            this.W.setText(org.telegram.messenger.bd.M0(2131748916, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.W;
            int i15 = org.telegram.ui.ActionBar.k6.p7;
            b2Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.r6.V(this.W, i15, null);
            return false;
        }
        this.W.setText(org.telegram.messenger.bd.M0(2131748930, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.W;
        int i16 = org.telegram.ui.ActionBar.k6.F6;
        b2Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.V(this.W, i16, null);
        this.Z = str;
        sc scVar2 = new sc(i3, this, str);
        this.a0 = scVar2;
        org.telegram.messenger.g0.i3(scVar2, 300L);
        return true;
    }

    public final void k0(boolean z10, boolean z11) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.r.cancel();
            this.r = null;
        }
        if (!z11) {
            if (z10) {
                this.n.setAlpha(1.0f);
                this.n.setVisibility(4);
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            }
            this.n.setAlpha(1.0f);
            this.n.setVisibility(0);
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            return;
        }
        this.r = new AnimatorSet();
        if (z10) {
            this.s.setVisibility(0);
            AnimatorSet animatorSet2 = this.r;
            xc xcVar = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, (Property<xc, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<yc, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            xc xcVar2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, (Property<xc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<yc, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new dh.x(27, this, z10));
        this.r.start();
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.o2 = true;
        i0Var.A2 = new qc(this, 1);
        showDialog(i0Var);
    }

    public final void m0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.x0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z10 ? 1.0f : 0.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 3));
            this.y0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.y0.setInterpolator(org.telegram.ui.Components.xq.f);
            this.y0.start();
        }
    }

    public final void n0() {
        if (this.e == null) {
            return;
        }
        int i3 = 8;
        if (this.c0 || this.l0) {
            org.telegram.ui.Cells.y8 y8Var = this.U;
            int i10 = org.telegram.ui.ActionBar.k6.B6;
            y8Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.r6.V(this.U.getTextView(), i10, null);
            this.e.setVisibility(0);
            this.g0.setVisibility(8);
            this.N.setVisibility(8);
            org.telegram.ui.Cells.y8 y8Var2 = this.U;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, y8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            this.O.setVisibility(0);
            this.i0.setVisibility(8);
            if (this.K) {
                this.U.setText(org.telegram.messenger.bd.M0(this.c0 ? 2131748647 : 2131748644, null));
                this.X.setText(this.c0 ? org.telegram.messenger.bd.M0(2131752403, null) : org.telegram.messenger.bd.M0(2131752385, null));
            } else {
                this.U.setText(org.telegram.messenger.bd.M0(this.c0 ? 2131752327 : 2131752267, null));
                this.X.setText(this.c0 ? org.telegram.messenger.bd.M0(2131752403, null) : org.telegram.messenger.bd.M0(2131752385, null));
            }
            this.P.setVisibility(this.c0 ? 8 : 0);
            this.Q.setVisibility(this.c0 ? 0 : 8);
            this.O.setPadding(0, 0, 0, this.c0 ? 0 : org.telegram.messenger.g0.L(7.0f));
            org.telegram.ui.Components.m70 m70Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e0;
            m70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.b2 b2Var = this.W;
            if (!this.c0 && b2Var.length() != 0) {
                i3 = 0;
            }
            b2Var.setVisibility(i3);
        } else {
            this.U.setText(org.telegram.messenger.bd.M0(2131752533, null));
            org.telegram.ui.Cells.y8 y8Var3 = this.U;
            int i11 = org.telegram.ui.ActionBar.k6.p7;
            y8Var3.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.r6.V(this.U.getTextView(), i11, null);
            this.O.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f0) {
                this.i0.setVisibility(0);
                this.N.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = this.U;
                org.telegram.ui.ActionBar.r6.a0(y8Var4, y8Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                this.g0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.y8 y8Var5 = this.U;
                org.telegram.ui.ActionBar.r6.a0(y8Var5, y8Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                this.i0.setVisibility(8);
                this.N.setVisibility(0);
                this.g0.setVisibility(0);
            }
        }
        this.S.a(!this.c0);
        this.T.a(this.c0);
        this.y.clearFocus();
        org.telegram.messenger.g0.v1(this.y);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var != null) {
            f30Var.h(i3, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar == null || !jtVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        jtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.S);
        if (this.j0 == 1 && !this.d0 && this.e0 == null) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            long j10 = this.k0;
            TLRPC.ChatFull N0 = messagesController.N0(j10);
            if (N0 != null) {
                this.e0 = N0.exported_invite;
            }
            if (this.e0 == null) {
                this.d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new rc(this, 3));
            }
        }
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var != null) {
            f30Var.a = this;
            f30Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.S);
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var != null) {
            f30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar != null) {
            jtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar != null) {
            jtVar.r();
        }
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var != null) {
            f30Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var != null) {
            f30Var.j(i3, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar != null) {
            jtVar.s();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.f30 f30Var = this.x;
        if (f30Var != null) {
            f30Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            i0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.cp cpVar = this.c;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v8, false));
            }
            org.telegram.ui.Cells.t4 t4Var = this.i0;
            if (t4Var == null || t4Var.getChildCount() <= 0 || !(this.i0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.i0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.j0 == 1) {
            return;
        }
        this.d.requestFocus();
        org.telegram.ui.Components.dt dtVar = this.d.a;
        dtVar.requestFocus();
        org.telegram.messenger.g0.K3(dtVar);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.j0 == 0) {
            org.telegram.ui.Components.f30 f30Var = this.x;
            if (f30Var != null) {
                f30Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.jt jtVar = this.d;
                if (jtVar != null) {
                    jtVar.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.j0 == 0) {
            org.telegram.ui.Components.f30 f30Var = this.x;
            if (f30Var != null && (str = f30Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.jt jtVar = this.d;
            if (jtVar != null) {
                String obj = jtVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }
}
