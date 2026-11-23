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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ad extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public org.telegram.ui.Cells.o4 I;
    public EditTextBoldCursor J;
    public boolean K;
    public org.telegram.ui.Components.nh0 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public org.telegram.ui.Components.d80 R;
    public org.telegram.ui.Cells.h6 S;
    public org.telegram.ui.Cells.h6 T;
    public org.telegram.ui.Cells.z8 U;
    public TextView V;
    public org.telegram.ui.Cells.c2 W;
    public org.telegram.ui.Cells.o4 X;
    public int Y;
    public String Z;
    public org.telegram.ui.ActionBar.q0 a;
    public u5 a0;
    public org.telegram.ui.Components.jr b;
    public boolean b0;
    public org.telegram.ui.Components.rp c;
    public boolean c0;
    public org.telegram.ui.Components.wt d;
    public boolean d0;
    public org.telegram.ui.Cells.y6 e;
    public TLRPC.TL_chatInviteExported e0;
    public fi.t3 f;
    public boolean f0;
    public org.telegram.ui.Cells.z8 g0;
    public hi.w5 h;
    public final ArrayList h0;
    public org.telegram.ui.Cells.u4 i0;
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
    public org.telegram.messenger.p10 v0;
    public final org.telegram.ui.Components.a9 w;
    public org.telegram.ui.ActionBar.t1 w0;
    public final org.telegram.ui.Components.u30 x;
    public final rc x0;
    public EditTextBoldCursor y;
    public ValueAnimator y0;
    public int z0;

    public ad(Bundle bundle) {
        super(bundle);
        this.h0 = new ArrayList();
        this.l0 = true;
        this.x0 = new rc(this, 0);
        int i7 = bundle.getInt("step", 0);
        this.j0 = i7;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i7 == 0) {
            this.w = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            this.x = new org.telegram.ui.Components.u30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new sc(this, 1));
            return;
        }
        if (i7 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.l0 = z10;
            this.c0 = !z10;
            if (!z10 && !this.f0) {
                this.f0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sc(this, 0));
            }
        }
        this.k0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void Z(ad adVar, org.telegram.ui.ActionBar.t1 t1Var) {
        adVar.t0 = false;
        adVar.s0 = false;
        if (adVar.u0 != null) {
            ConnectionsManager.getInstance(adVar.currentAccount).cancelRequest(adVar.u0.intValue(), true);
            adVar.u0 = null;
        }
        adVar.m0(false);
        t1Var.dismiss();
    }

    public static /* synthetic */ void a0(ad adVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.mp.k1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_updateUsername, new sc(adVar, 2), 64);
    }

    public static /* synthetic */ void b0(ad adVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.mp.u1(adVar.currentAccount).j1(adVar.k0);
        adVar.Y = ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(adVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(ad adVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        if (currentChannel.megagroup) {
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlert", null, 2131745826, org.telegram.messenger.mp.u1(adVar.currentAccount).X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
        } else {
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlertChannel", null, 2131745825, org.telegram.messenger.mp.u1(adVar.currentAccount).X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745828, null), new oi.f0(9, adVar, currentChannel));
        adVar.showDialog(t1Var);
    }

    public static void d0(ad adVar) {
        if (adVar.w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131744591, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131744592, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131742963, null), null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131744600, null), new w0(adVar, 14));
        adVar.w0 = alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.t30
    public final void H(float f10) {
        yc ycVar = this.s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.t30
    public final void P(boolean z10, boolean z11) {
        yc ycVar = this.s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7;
        final ad adVar = this;
        org.telegram.ui.Components.wt wtVar = adVar.d;
        if (wtVar != null) {
            wtVar.o();
        }
        adVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        adVar.actionBar.setAllowOverlayTitle(true);
        adVar.actionBar.setActionBarMenuOnItemClick(new y7(adVar, 7));
        org.telegram.ui.ActionBar.y s5 = adVar.actionBar.s();
        Drawable g10 = i5.c.g(context, R.drawable.ic_ab_done);
        int i11 = org.telegram.ui.ActionBar.n6.v8;
        final int i12 = 0;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        g10.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        adVar.c = rpVar;
        org.telegram.ui.Components.jr jrVar = new org.telegram.ui.Components.jr(g10, rpVar);
        adVar.b = jrVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String N0 = org.telegram.messenger.gd.N0(2131751342, null);
        org.telegram.ui.ActionBar.k kVar = s5.b;
        org.telegram.ui.ActionBar.q0 b10 = s5.b(1, 0, null, s5.c ? kVar.r0 : kVar.q0, jrVar, L, N0, null);
        adVar.a = b10;
        org.telegram.ui.ActionBar.u6.x(b10, g10, i11, null, mode);
        int i13 = 2;
        int i14 = 3;
        int i15 = 5;
        int i16 = adVar.j0;
        if (i16 == 0) {
            adVar.actionBar.setTitle(org.telegram.messenger.gd.N0(2131748093, null));
            wc wcVar = new wc(i12, context, adVar);
            wcVar.setOnTouchListener(new gi.a(i13));
            adVar.fragmentView = wcVar;
            int i17 = org.telegram.ui.ActionBar.n6.d6;
            wcVar.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.u6.h(i17, adVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            adVar.M = linearLayout;
            linearLayout.setOrientation(1);
            wcVar.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            adVar.M.addView(frameLayout, c8.na.o(-1, -2));
            fi.t3 t3Var = new fi.t3(i15, context, adVar);
            adVar.f = t3Var;
            t3Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.a9 a9Var = adVar.w;
            a9Var.k(5L, null, null, null);
            adVar.f.setImageDrawable(a9Var);
            fi.t3 t3Var2 = adVar.f;
            boolean z10 = org.telegram.messenger.gd.a0;
            frameLayout.addView(t3Var2, c8.na.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            hi.w5 w5Var = new hi.w5(adVar, context, paint, i14);
            adVar.h = w5Var;
            w5Var.setContentDescription(org.telegram.messenger.gd.N0(2131752200, null));
            hi.w5 w5Var2 = adVar.h;
            boolean z11 = org.telegram.messenger.gd.a0;
            frameLayout.addView(w5Var2, c8.na.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            adVar.h.setOnClickListener(new tc(adVar, i10));
            adVar.L = new org.telegram.ui.Components.nh0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            xc xcVar = new xc(i12, context, adVar);
            adVar.n = xcVar;
            xcVar.setScaleType(ImageView.ScaleType.CENTER);
            adVar.n.setAnimation(adVar.L);
            adVar.n.setEnabled(false);
            adVar.n.setClickable(false);
            adVar.n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            xc xcVar2 = adVar.n;
            boolean z12 = org.telegram.messenger.gd.a0;
            frameLayout.addView(xcVar2, c8.na.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            yc ycVar = new yc(adVar, context, i12);
            adVar.s = ycVar;
            ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
            adVar.s.setProgressColor(-1);
            adVar.s.setNoProgress(false);
            yc ycVar2 = adVar.s;
            boolean z13 = org.telegram.messenger.gd.a0;
            frameLayout.addView(ycVar2, c8.na.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            adVar.k0(false, false);
            org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, wcVar, adVar, 0, false, null);
            adVar = adVar;
            adVar.d = wtVar2;
            wtVar2.setHint(org.telegram.messenger.gd.N0(2131751112, null));
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
                    switch (i12) {
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
            org.telegram.ui.Components.wt wtVar3 = adVar.d;
            boolean z14 = org.telegram.messenger.gd.a0;
            frameLayout.addView(wtVar3, c8.na.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            adVar.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.u6.D(adVar.y, org.telegram.ui.ActionBar.n6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = adVar.y;
            int i18 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor2, i18, null);
            adVar.y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.u6.F(adVar.y, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, adVar.getResourceProvider());
            adVar.y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            adVar.y.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
            adVar.y.setInputType(180225);
            adVar.y.setImeOptions(6);
            adVar.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            adVar.y.setHint(org.telegram.messenger.gd.N0(2131751447, null));
            org.telegram.ui.ActionBar.u6.v(adVar.y, i18, null);
            adVar.y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.y.setCursorWidth(1.5f);
            adVar.M.addView(adVar.y, c8.na.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
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
            org.telegram.ui.ActionBar.u6.U(adVar.V, org.telegram.ui.ActionBar.n6.F6, null);
            adVar.V.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
            adVar.V.setText(org.telegram.messenger.gd.N0(2131751450, null));
            adVar.M.addView(adVar.V, c8.na.t(-2, -2, org.telegram.messenger.gd.a0 ? 5 : 3, 24, 10, 24, 20));
        } else if (i16 == 1) {
            ScrollView scrollView = new ScrollView(context);
            adVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            adVar.M = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.mp messagesController = adVar.getMessagesController();
            long j3 = adVar.k0;
            TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
            boolean z15 = O0 != null && (!org.telegram.messenger.v3.T(O0) || org.telegram.messenger.v3.n0(O0));
            adVar.K = z15;
            adVar.actionBar.setTitle(org.telegram.messenger.gd.N0(z15 ? 2131749207 : 2131752285, null));
            View view = adVar.fragmentView;
            int i19 = org.telegram.ui.ActionBar.n6.a7;
            view.setTag(Integer.valueOf(i19));
            org.telegram.ui.ActionBar.u6.h(i19, adVar.fragmentView, null);
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
            adVar.I = o4Var;
            o4Var.setHeight(46);
            org.telegram.ui.Cells.o4 o4Var2 = adVar.I;
            int i20 = org.telegram.ui.ActionBar.n6.d6;
            org.telegram.ui.ActionBar.u6.h(i20, o4Var2, null);
            adVar.I.setText(org.telegram.messenger.gd.N0(adVar.K ? 2131749198 : 2131752263, null));
            adVar.M.addView(adVar.I);
            LinearLayout linearLayout3 = new LinearLayout(context);
            adVar.H = linearLayout3;
            linearLayout3.setOrientation(1);
            org.telegram.ui.ActionBar.u6.h(i20, adVar.H, null);
            adVar.M.addView(adVar.H, c8.na.o(-1, -2));
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
            adVar.S = h6Var;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(false);
            int i21 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i21);
            h6Var.setBackground(N02);
            org.telegram.ui.ActionBar.u6.j(h6Var, N02, null, M, null);
            Boolean bool = adVar.m0;
            if (bool != null && !bool.booleanValue()) {
                adVar.c0 = true;
            }
            if (adVar.K) {
                i7 = 1;
                adVar.S.b(org.telegram.messenger.gd.N0(2131748445, null), org.telegram.messenger.gd.N0(2131748444, null), false, !adVar.c0);
            } else {
                i7 = 1;
                adVar.S.b(org.telegram.messenger.gd.N0(2131752306, null), org.telegram.messenger.gd.N0(2131752303, null), false, !adVar.c0);
            }
            adVar.S.setOnClickListener(new tc(adVar, i13));
            if (bool == null || bool.booleanValue()) {
                adVar.H.addView(adVar.S, c8.na.o(-1, -2));
            }
            org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
            adVar.T = h6Var2;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.n6.N0(false);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i21);
            h6Var2.setBackground(N03);
            org.telegram.ui.ActionBar.u6.j(h6Var2, N03, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                adVar.c0 = false;
            }
            if (adVar.K) {
                adVar.T.b(org.telegram.messenger.gd.N0(2131748448, null), org.telegram.messenger.gd.N0(2131748447, null), false, adVar.c0);
            } else {
                adVar.T.b(org.telegram.messenger.gd.N0(2131752317, null), org.telegram.messenger.gd.N0(2131752316, null), false, adVar.c0);
            }
            adVar.T.setOnClickListener(new tc(adVar, 3));
            if (bool == null || !bool.booleanValue()) {
                adVar.H.addView(adVar.T, c8.na.o(-1, -2));
            }
            org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
            adVar.e = y6Var;
            adVar.M.addView(y6Var, c8.na.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            adVar.O = linearLayout4;
            linearLayout4.setOrientation(i7);
            org.telegram.ui.ActionBar.u6.h(i20, adVar.O, null);
            adVar.M.addView(adVar.O, c8.na.o(-1, -2));
            org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context);
            adVar.X = o4Var3;
            adVar.O.addView(o4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            adVar.P = linearLayout5;
            linearLayout5.setOrientation(0);
            adVar.O.addView(adVar.P, c8.na.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            adVar.J = editTextBoldCursor3;
            editTextBoldCursor3.setText(org.telegram.messenger.mp.u1(adVar.currentAccount).X2 + "/");
            adVar.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = adVar.J;
            int i22 = org.telegram.ui.ActionBar.n6.H6;
            org.telegram.ui.ActionBar.u6.D(editTextBoldCursor4, i22, null);
            EditTextBoldCursor editTextBoldCursor5 = adVar.J;
            int i23 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor5, i23, null);
            adVar.J.setMaxLines(1);
            adVar.J.setLines(1);
            adVar.J.setEnabled(false);
            adVar.J.setBackgroundDrawable(null);
            adVar.J.setPadding(0, 0, 0, 0);
            adVar.J.setSingleLine(true);
            adVar.J.setInputType(163840);
            adVar.J.setImeOptions(6);
            adVar.P.addView(adVar.J, c8.na.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            adVar.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.u6.D(adVar.y, i22, null);
            org.telegram.ui.ActionBar.u6.U(adVar.y, i23, null);
            adVar.y.setMaxLines(1);
            adVar.y.setLines(1);
            adVar.y.setBackgroundDrawable(null);
            adVar.y.setPadding(0, 0, 0, 0);
            adVar.y.setSingleLine(true);
            adVar.y.setInputType(163872);
            adVar.y.setImeOptions(6);
            adVar.y.setHint(org.telegram.messenger.gd.N0(2131752254, null));
            org.telegram.ui.ActionBar.u6.v(adVar.y, i23, null);
            adVar.y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.y.setCursorWidth(1.5f);
            adVar.P.addView(adVar.y, c8.na.o(-1, 36));
            adVar.y.addTextChangedListener(new m0(adVar, i13));
            LinearLayout linearLayout6 = new LinearLayout(context);
            adVar.Q = linearLayout6;
            linearLayout6.setOrientation(1);
            adVar.O.addView(adVar.Q, c8.na.o(-1, -2));
            org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(context, adVar, null, true, org.telegram.messenger.v3.T(adVar.getMessagesController().O0(Long.valueOf(j3))));
            adVar.R = d80Var;
            d80Var.b(true);
            adVar.R.d(0, null, false);
            adVar.Q.addView(adVar.R);
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(3, context, adVar);
            adVar.W = c2Var;
            org.telegram.ui.ActionBar.u6.G(c2Var, org.telegram.ui.ActionBar.n6.J6, null);
            org.telegram.ui.ActionBar.u6.C(adVar.W, org.telegram.ui.ActionBar.n6.K6, null);
            adVar.W.setTextSize(1, 15.0f);
            adVar.W.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
            adVar.W.setVisibility(8);
            adVar.W.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            adVar.O.addView(adVar.W, c8.na.t(-2, -2, org.telegram.messenger.gd.a0 ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            adVar.U = z8Var;
            int i24 = org.telegram.ui.ActionBar.n6.b7;
            org.telegram.ui.ActionBar.u6.Z(z8Var, context, R.drawable.greydivider_bottom, i24);
            adVar.M.addView(adVar.U, c8.na.o(-1, -2));
            org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
            adVar.i0 = u4Var;
            adVar.M.addView(u4Var, c8.na.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            adVar.N = linearLayout7;
            org.telegram.ui.ActionBar.u6.h(i20, linearLayout7, null);
            adVar.N.setOrientation(1);
            adVar.M.addView(adVar.N, c8.na.o(-1, -2));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            adVar.g0 = z8Var2;
            org.telegram.ui.ActionBar.u6.Z(z8Var2, context, R.drawable.greydivider_bottom, i24);
            adVar.M.addView(adVar.g0, c8.na.o(-1, -2));
            adVar.n0();
        }
        return adVar.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.S) {
            org.telegram.ui.ActionBar.t1 t1Var = this.w0;
            if (t1Var != null) {
                try {
                    t1Var.dismiss();
                    this.w0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.t0 = false;
            return;
        }
        if (i7 == org.telegram.messenger.ks.R) {
            org.telegram.ui.ActionBar.t1 t1Var2 = this.w0;
            if (t1Var2 != null) {
                try {
                    t1Var2.dismiss();
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
                org.telegram.messenger.mp.u1(this.currentAccount).B(longValue, null, this.n0, this.o0, this.p0, this.r0, this.q0, this.E, this.F, null);
            }
            ad adVar = new ad(bundle);
            adVar.v0 = this.v0;
            presentFragment(adVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var == null || !u30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.u30 u30Var = this.x;
        return (u30Var == null || dialog != u30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.wt wtVar = this.d;
        int i7 = org.telegram.ui.ActionBar.n6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(wtVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.Components.wt wtVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.n6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(wtVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.b7));
        LinearLayout linearLayout = this.Q;
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.i0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U7, false) + ((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false) + ((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S7, false) + ((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.R7, false) + ((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Q7, false) + ((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P7, false) + ((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O7, false) + (org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x02 == this.z0) {
            return;
        }
        this.z0 = x02;
        LinearLayout linearLayout = this.N;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.N.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                    nVar.d.q(nVar.f);
                    nVar.a.invalidate();
                }
            }
        }
    }

    public final boolean j0(String str) {
        if (str == null || str.length() <= 0) {
            this.W.setVisibility(8);
        } else {
            this.W.setVisibility(0);
        }
        u5 u5Var = this.a0;
        if (u5Var != null) {
            org.telegram.messenger.g0.r(u5Var);
            this.a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.b0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.W.setText(org.telegram.messenger.gd.N0(2131748716, null));
                org.telegram.ui.Cells.c2 c2Var = this.W;
                int i7 = org.telegram.ui.ActionBar.n6.p7;
                c2Var.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.u6.U(this.W, i7, null);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    this.W.setText(org.telegram.messenger.gd.N0(2131748712, null));
                    org.telegram.ui.Cells.c2 c2Var2 = this.W;
                    int i11 = org.telegram.ui.ActionBar.n6.p7;
                    c2Var2.setTag(Integer.valueOf(i11));
                    org.telegram.ui.ActionBar.u6.U(this.W, i11, null);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.W.setText(org.telegram.messenger.gd.N0(2131748716, null));
                    org.telegram.ui.Cells.c2 c2Var3 = this.W;
                    int i12 = org.telegram.ui.ActionBar.n6.p7;
                    c2Var3.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.u6.U(this.W, i12, null);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.W.setText(org.telegram.messenger.gd.N0(2131748714, null));
            org.telegram.ui.Cells.c2 c2Var4 = this.W;
            int i13 = org.telegram.ui.ActionBar.n6.p7;
            c2Var4.setTag(Integer.valueOf(i13));
            org.telegram.ui.ActionBar.u6.U(this.W, i13, null);
            return false;
        }
        if (str.length() > 32) {
            this.W.setText(org.telegram.messenger.gd.N0(2131748715, null));
            org.telegram.ui.Cells.c2 c2Var5 = this.W;
            int i14 = org.telegram.ui.ActionBar.n6.p7;
            c2Var5.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.u6.U(this.W, i14, null);
            return false;
        }
        this.W.setText(org.telegram.messenger.gd.N0(2131748729, null));
        org.telegram.ui.Cells.c2 c2Var6 = this.W;
        int i15 = org.telegram.ui.ActionBar.n6.F6;
        c2Var6.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.u6.U(this.W, i15, null);
        this.Z = str;
        u5 u5Var2 = new u5(14, this, str);
        this.a0 = u5Var2;
        org.telegram.messenger.g0.h3(u5Var2, 300L);
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
        this.r.addListener(new bi.j7(28, this, z10));
        this.r.start();
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.r2 = true;
        k0Var.D2 = new rc(this, 1);
        showDialog(k0Var);
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
            ofFloat.addUpdateListener(new a3(this, 3));
            this.y0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.y0.setInterpolator(org.telegram.ui.Components.kr.f);
            this.y0.start();
        }
    }

    public final void n0() {
        if (this.e == null) {
            return;
        }
        int i7 = 8;
        if (this.c0 || this.l0) {
            org.telegram.ui.Cells.z8 z8Var = this.U;
            int i10 = org.telegram.ui.ActionBar.n6.B6;
            z8Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.u6.U(this.U.getTextView(), i10, null);
            this.e.setVisibility(0);
            this.g0.setVisibility(8);
            this.N.setVisibility(8);
            org.telegram.ui.Cells.z8 z8Var2 = this.U;
            org.telegram.ui.ActionBar.u6.Z(z8Var2, z8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7);
            this.O.setVisibility(0);
            this.i0.setVisibility(8);
            if (this.K) {
                this.U.setText(org.telegram.messenger.gd.N0(this.c0 ? 2131748446 : 2131748443, null));
                this.X.setText(this.c0 ? org.telegram.messenger.gd.N0(2131752391, null) : org.telegram.messenger.gd.N0(2131752373, null));
            } else {
                this.U.setText(org.telegram.messenger.gd.N0(this.c0 ? 2131752315 : 2131752255, null));
                this.X.setText(this.c0 ? org.telegram.messenger.gd.N0(2131752391, null) : org.telegram.messenger.gd.N0(2131752373, null));
            }
            this.P.setVisibility(this.c0 ? 8 : 0);
            this.Q.setVisibility(this.c0 ? 0 : 8);
            this.O.setPadding(0, 0, 0, this.c0 ? 0 : org.telegram.messenger.g0.L(7.0f));
            org.telegram.ui.Components.d80 d80Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e0;
            d80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.c2 c2Var = this.W;
            if (!this.c0 && c2Var.length() != 0) {
                i7 = 0;
            }
            c2Var.setVisibility(i7);
        } else {
            this.U.setText(org.telegram.messenger.gd.N0(2131752521, null));
            org.telegram.ui.Cells.z8 z8Var3 = this.U;
            int i11 = org.telegram.ui.ActionBar.n6.p7;
            z8Var3.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.u6.U(this.U.getTextView(), i11, null);
            this.O.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f0) {
                this.i0.setVisibility(0);
                this.N.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = this.U;
                org.telegram.ui.ActionBar.u6.Z(z8Var4, z8Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7);
                this.g0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.z8 z8Var5 = this.U;
                org.telegram.ui.ActionBar.u6.Z(z8Var5, z8Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7);
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var != null) {
            u30Var.h(i7, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar == null || !wtVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.R);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.S);
        if (this.j0 == 1 && !this.d0 && this.e0 == null) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j3 = this.k0;
            TLRPC.ChatFull P0 = messagesController.P0(j3);
            if (P0 != null) {
                this.e0 = P0.exported_invite;
            }
            if (this.e0 == null) {
                this.d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new sc(this, 3));
            }
        }
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var != null) {
            u30Var.a = this;
            u30Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.u0.intValue(), true);
            this.u0 = null;
        }
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.R);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.S);
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var != null) {
            u30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.r();
        }
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var != null) {
            u30Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var != null) {
            u30Var.j(i7, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.u30 u30Var = this.x;
        if (u30Var != null) {
            u30Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            i0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.rp rpVar = this.c;
            if (rpVar != null) {
                rpVar.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.v8, false));
            }
            org.telegram.ui.Cells.u4 u4Var = this.i0;
            if (u4Var == null || u4Var.getChildCount() <= 0 || !(this.i0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.i0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h6, false));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.j0 == 1) {
            return;
        }
        this.d.requestFocus();
        org.telegram.ui.Components.rt rtVar = this.d.a;
        rtVar.requestFocus();
        org.telegram.messenger.g0.I3(rtVar);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.j0 == 0) {
            org.telegram.ui.Components.u30 u30Var = this.x;
            if (u30Var != null) {
                u30Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.wt wtVar = this.d;
                if (wtVar != null) {
                    wtVar.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.j0 == 0) {
            org.telegram.ui.Components.u30 u30Var = this.x;
            if (u30Var != null && (str = u30Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.wt wtVar = this.d;
            if (wtVar != null) {
                String obj = wtVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ void U() {
    }
}
