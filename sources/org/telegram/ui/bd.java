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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bd extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public TLRPC.FileLocation D;
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.n4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.zg0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.q70 Q;
    public org.telegram.ui.Cells.h6 R;
    public org.telegram.ui.Cells.h6 S;
    public org.telegram.ui.Cells.z8 T;
    public TextView U;
    public org.telegram.ui.Cells.b2 V;
    public org.telegram.ui.Cells.n4 W;
    public int X;
    public String Y;
    public org.telegram.ui.ActionBar.c Z;
    public org.telegram.ui.ActionBar.r0 a;
    public boolean a0;
    public org.telegram.ui.Components.vq b;
    public boolean b0;
    public org.telegram.ui.Components.cp c;
    public boolean c0;
    public org.telegram.ui.Components.kt d;
    public TLRPC.TL_chatInviteExported d0;
    public org.telegram.ui.Cells.y6 e;
    public boolean e0;
    public di.d4 f;
    public org.telegram.ui.Cells.z8 f0;
    public final ArrayList g0;
    public fi.p5 h;
    public org.telegram.ui.Cells.t4 h0;
    public final int i0;
    public final long j0;
    public boolean k0;
    public final Boolean l0;
    public TLRPC.InputFile m0;
    public yc n;
    public TLRPC.InputFile n0;
    public TLRPC.VideoSize o0;
    public String p0;
    public double q0;
    public AnimatorSet r;
    public boolean r0;
    public zc s;
    public boolean s0;
    public Integer t0;
    public org.telegram.messenger.v10 u0;
    public org.telegram.ui.ActionBar.u1 v0;
    public final org.telegram.ui.Components.v8 w;
    public final sc w0;
    public final org.telegram.ui.Components.j30 x;
    public ValueAnimator x0;
    public EditTextBoldCursor y;
    public int y0;

    public bd(Bundle bundle) {
        super(bundle);
        this.g0 = new ArrayList();
        this.k0 = true;
        this.w0 = new sc(this, 0);
        int i7 = bundle.getInt("step", 0);
        this.i0 = i7;
        if (bundle.containsKey("forcePublic")) {
            this.l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i7 == 0) {
            this.w = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            this.x = new org.telegram.ui.Components.j30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new tc(this, 1));
            return;
        }
        if (i7 == 1) {
            boolean z9 = bundle.getBoolean("canCreatePublic", true);
            this.k0 = z9;
            this.b0 = !z9;
            if (!z9 && !this.e0) {
                this.e0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new tc(this, 0));
            }
        }
        this.j0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void Z(bd bdVar, org.telegram.ui.ActionBar.u1 u1Var) {
        bdVar.s0 = false;
        bdVar.r0 = false;
        if (bdVar.t0 != null) {
            ConnectionsManager.getInstance(bdVar.currentAccount).cancelRequest(bdVar.t0.intValue(), true);
            bdVar.t0 = null;
        }
        bdVar.m0(false);
        u1Var.dismiss();
    }

    public static /* synthetic */ void a0(bd bdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.qp.i1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(bdVar.currentAccount).sendRequest(tL_channels_updateUsername, new tc(bdVar, 2), 64);
    }

    public static /* synthetic */ void b0(bd bdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.qp.s1(bdVar.currentAccount).h1(bdVar.j0);
        bdVar.X = ConnectionsManager.getInstance(bdVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(bdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(bd bdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        if (currentChannel.megagroup) {
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlert", null, 2131746022, org.telegram.messenger.qp.s1(bdVar.currentAccount).U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        } else {
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlertChannel", null, 2131746021, org.telegram.messenger.qp.s1(bdVar.currentAccount).U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new ni.c(7, bdVar, currentChannel));
        bdVar.showDialog(u1Var);
    }

    public static void d0(bd bdVar) {
        if (bdVar.v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131744832, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131744833, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743213, null), null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131744841, null), new w0(bdVar, 14));
        bdVar.v0 = alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        zc zcVar = this.s;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        zc zcVar = this.s;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7;
        final bd bdVar = this;
        org.telegram.ui.Components.kt ktVar = bdVar.d;
        if (ktVar != null) {
            ktVar.o();
        }
        bdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        bdVar.actionBar.setAllowOverlayTitle(true);
        bdVar.actionBar.setActionBarMenuOnItemClick(new w9(bdVar, 4));
        org.telegram.ui.ActionBar.y s5 = bdVar.actionBar.s();
        Drawable h = jg.g.h(context, R.drawable.ic_ab_done);
        int i11 = org.telegram.ui.ActionBar.m6.v8;
        final int i12 = 0;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        h.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        bdVar.c = cpVar;
        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(h, cpVar);
        bdVar.b = vqVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String M0 = org.telegram.messenger.id.M0(2131751354, null);
        org.telegram.ui.ActionBar.l lVar = s5.b;
        org.telegram.ui.ActionBar.r0 b10 = s5.b(1, 0, null, s5.c ? lVar.q0 : lVar.p0, vqVar, L, M0, null);
        bdVar.a = b10;
        org.telegram.ui.ActionBar.t6.x(b10, h, i11, null, mode);
        int i13 = 2;
        int i14 = 3;
        int i15 = 5;
        int i16 = bdVar.i0;
        if (i16 == 0) {
            bdVar.actionBar.setTitle(org.telegram.messenger.id.M0(2131748286, null));
            xc xcVar = new xc(i12, context, bdVar);
            xcVar.setOnTouchListener(new ei.b(i13));
            bdVar.fragmentView = xcVar;
            int i17 = org.telegram.ui.ActionBar.m6.d6;
            xcVar.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.t6.h(i17, bdVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            bdVar.L = linearLayout;
            linearLayout.setOrientation(1);
            xcVar.addView(bdVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            bdVar.L.addView(frameLayout, c8.ha.o(-1, -2));
            di.d4 d4Var = new di.d4(i15, context, bdVar);
            bdVar.f = d4Var;
            d4Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.v8 v8Var = bdVar.w;
            v8Var.k(5L, null, null, null);
            bdVar.f.setImageDrawable(v8Var);
            di.d4 d4Var2 = bdVar.f;
            boolean z9 = org.telegram.messenger.id.a0;
            frameLayout.addView(d4Var2, c8.ha.d(64, 64.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 16.0f, 12.0f, z9 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fi.p5 p5Var = new fi.p5(bdVar, context, paint, i14);
            bdVar.h = p5Var;
            p5Var.setContentDescription(org.telegram.messenger.id.M0(2131752212, null));
            fi.p5 p5Var2 = bdVar.h;
            boolean z10 = org.telegram.messenger.id.a0;
            frameLayout.addView(p5Var2, c8.ha.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            bdVar.h.setOnClickListener(new uc(bdVar, i10));
            bdVar.K = new org.telegram.ui.Components.zg0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            yc ycVar = new yc(i12, context, bdVar);
            bdVar.n = ycVar;
            ycVar.setScaleType(ImageView.ScaleType.CENTER);
            bdVar.n.setAnimation(bdVar.K);
            bdVar.n.setEnabled(false);
            bdVar.n.setClickable(false);
            bdVar.n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            yc ycVar2 = bdVar.n;
            boolean z11 = org.telegram.messenger.id.a0;
            frameLayout.addView(ycVar2, c8.ha.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 12.0f));
            zc zcVar = new zc(bdVar, context, i12);
            bdVar.s = zcVar;
            zcVar.setSize(org.telegram.messenger.g0.L(30.0f));
            bdVar.s.setProgressColor(-1);
            bdVar.s.setNoProgress(false);
            zc zcVar2 = bdVar.s;
            boolean z12 = org.telegram.messenger.id.a0;
            frameLayout.addView(zcVar2, c8.ha.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 12.0f));
            bdVar.k0(false, false);
            org.telegram.ui.Components.kt ktVar2 = new org.telegram.ui.Components.kt(context, xcVar, bdVar, 0, false, null);
            bdVar = bdVar;
            bdVar.d = ktVar2;
            ktVar2.setHint(org.telegram.messenger.id.M0(2131751124, null));
            String str = bdVar.F;
            if (str != null) {
                bdVar.d.setText(str);
                bdVar.F = null;
            }
            bdVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            bdVar.d.getEditText().setSingleLine(true);
            bdVar.d.getEditText().setImeOptions(5);
            bdVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(bdVar) { // from class: org.telegram.ui.vc
                public final /* synthetic */ bd b;

                {
                    this.b = bdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (i12) {
                        case 0:
                            bd bdVar2 = this.b;
                            if (i18 != 5) {
                                bdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(bdVar2.d.getEditText().getText())) {
                                bdVar2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i18 == 6 && (r0Var = this.b.a) != null) {
                                r0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.kt ktVar3 = bdVar.d;
            boolean z13 = org.telegram.messenger.id.a0;
            frameLayout.addView(ktVar3, c8.ha.d(-1, -2.0f, 16, z13 ? 5.0f : 96.0f, 0.0f, z13 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            bdVar.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.t6.D(bdVar.y, org.telegram.ui.ActionBar.m6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = bdVar.y;
            int i18 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor2, i18, null);
            bdVar.y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.t6.F(bdVar.y, org.telegram.ui.ActionBar.m6.k6, org.telegram.ui.ActionBar.m6.l6, org.telegram.ui.ActionBar.m6.p7, bdVar.getResourceProvider());
            bdVar.y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            bdVar.y.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            bdVar.y.setInputType(180225);
            bdVar.y.setImeOptions(6);
            bdVar.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            bdVar.y.setHint(org.telegram.messenger.id.M0(2131751459, null));
            org.telegram.ui.ActionBar.t6.v(bdVar.y, i18, null);
            bdVar.y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            bdVar.y.setCursorWidth(1.5f);
            bdVar.L.addView(bdVar.y, c8.ha.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            bdVar.y.setOnEditorActionListener(new TextView.OnEditorActionListener(bdVar) { // from class: org.telegram.ui.vc
                public final /* synthetic */ bd b;

                {
                    this.b = bdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i182, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (i10) {
                        case 0:
                            bd bdVar2 = this.b;
                            if (i182 != 5) {
                                bdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(bdVar2.d.getEditText().getText())) {
                                bdVar2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i182 == 6 && (r0Var = this.b.a) != null) {
                                r0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            bdVar.y.addTextChangedListener(new ad(0));
            TextView textView = new TextView(context);
            bdVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(bdVar.U, org.telegram.ui.ActionBar.m6.F6, null);
            bdVar.U.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            bdVar.U.setText(org.telegram.messenger.id.M0(2131751462, null));
            bdVar.L.addView(bdVar.U, c8.ha.t(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3, 24, 10, 24, 20));
        } else if (i16 == 1) {
            ScrollView scrollView = new ScrollView(context);
            bdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            bdVar.L = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(bdVar.L, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.qp messagesController = bdVar.getMessagesController();
            long j3 = bdVar.j0;
            TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j3));
            boolean z14 = M02 != null && (!org.telegram.messenger.t3.T(M02) || org.telegram.messenger.t3.n0(M02));
            bdVar.J = z14;
            bdVar.actionBar.setTitle(org.telegram.messenger.id.M0(z14 ? 2131749400 : 2131752297, null));
            View view = bdVar.fragmentView;
            int i19 = org.telegram.ui.ActionBar.m6.a7;
            view.setTag(Integer.valueOf(i19));
            org.telegram.ui.ActionBar.t6.h(i19, bdVar.fragmentView, null);
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
            bdVar.H = n4Var;
            n4Var.setHeight(46);
            org.telegram.ui.Cells.n4 n4Var2 = bdVar.H;
            int i20 = org.telegram.ui.ActionBar.m6.d6;
            org.telegram.ui.ActionBar.t6.h(i20, n4Var2, null);
            bdVar.H.setText(org.telegram.messenger.id.M0(bdVar.J ? 2131749391 : 2131752275, null));
            bdVar.L.addView(bdVar.H);
            LinearLayout linearLayout3 = new LinearLayout(context);
            bdVar.G = linearLayout3;
            linearLayout3.setOrientation(1);
            org.telegram.ui.ActionBar.t6.h(i20, bdVar.G, null);
            bdVar.L.addView(bdVar.G, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
            bdVar.R = h6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(false);
            int i21 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i21);
            h6Var.setBackground(N0);
            org.telegram.ui.ActionBar.t6.j(h6Var, N0, null, M, null);
            Boolean bool = bdVar.l0;
            if (bool != null && !bool.booleanValue()) {
                bdVar.b0 = true;
            }
            if (bdVar.J) {
                i7 = 1;
                bdVar.R.b(org.telegram.messenger.id.M0(2131748638, null), org.telegram.messenger.id.M0(2131748637, null), false, !bdVar.b0);
            } else {
                i7 = 1;
                bdVar.R.b(org.telegram.messenger.id.M0(2131752318, null), org.telegram.messenger.id.M0(2131752315, null), false, !bdVar.b0);
            }
            bdVar.R.setOnClickListener(new uc(bdVar, i13));
            if (bool == null || bool.booleanValue()) {
                bdVar.G.addView(bdVar.R, c8.ha.o(-1, -2));
            }
            org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
            bdVar.S = h6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.m6.N0(false);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i21);
            h6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.t6.j(h6Var2, N02, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                bdVar.b0 = false;
            }
            if (bdVar.J) {
                bdVar.S.b(org.telegram.messenger.id.M0(2131748641, null), org.telegram.messenger.id.M0(2131748640, null), false, bdVar.b0);
            } else {
                bdVar.S.b(org.telegram.messenger.id.M0(2131752329, null), org.telegram.messenger.id.M0(2131752328, null), false, bdVar.b0);
            }
            bdVar.S.setOnClickListener(new uc(bdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                bdVar.G.addView(bdVar.S, c8.ha.o(-1, -2));
            }
            org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            bdVar.e = y6Var;
            bdVar.L.addView(y6Var, c8.ha.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            bdVar.N = linearLayout4;
            linearLayout4.setOrientation(i7);
            org.telegram.ui.ActionBar.t6.h(i20, bdVar.N, null);
            bdVar.L.addView(bdVar.N, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
            bdVar.W = n4Var3;
            bdVar.N.addView(n4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            bdVar.O = linearLayout5;
            linearLayout5.setOrientation(0);
            bdVar.N.addView(bdVar.O, c8.ha.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            bdVar.I = editTextBoldCursor3;
            editTextBoldCursor3.setText(org.telegram.messenger.qp.s1(bdVar.currentAccount).U2 + "/");
            bdVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = bdVar.I;
            int i22 = org.telegram.ui.ActionBar.m6.H6;
            org.telegram.ui.ActionBar.t6.D(editTextBoldCursor4, i22, null);
            EditTextBoldCursor editTextBoldCursor5 = bdVar.I;
            int i23 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor5, i23, null);
            bdVar.I.setMaxLines(1);
            bdVar.I.setLines(1);
            bdVar.I.setEnabled(false);
            bdVar.I.setBackgroundDrawable(null);
            bdVar.I.setPadding(0, 0, 0, 0);
            bdVar.I.setSingleLine(true);
            bdVar.I.setInputType(163840);
            bdVar.I.setImeOptions(6);
            bdVar.O.addView(bdVar.I, c8.ha.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            bdVar.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.t6.D(bdVar.y, i22, null);
            org.telegram.ui.ActionBar.t6.U(bdVar.y, i23, null);
            bdVar.y.setMaxLines(1);
            bdVar.y.setLines(1);
            bdVar.y.setBackgroundDrawable(null);
            bdVar.y.setPadding(0, 0, 0, 0);
            bdVar.y.setSingleLine(true);
            bdVar.y.setInputType(163872);
            bdVar.y.setImeOptions(6);
            bdVar.y.setHint(org.telegram.messenger.id.M0(2131752266, null));
            org.telegram.ui.ActionBar.t6.v(bdVar.y, i23, null);
            bdVar.y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            bdVar.y.setCursorWidth(1.5f);
            bdVar.O.addView(bdVar.y, c8.ha.o(-1, 36));
            bdVar.y.addTextChangedListener(new m0(bdVar, i13));
            LinearLayout linearLayout6 = new LinearLayout(context);
            bdVar.P = linearLayout6;
            linearLayout6.setOrientation(1);
            bdVar.N.addView(bdVar.P, c8.ha.o(-1, -2));
            org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, bdVar, null, true, org.telegram.messenger.t3.T(bdVar.getMessagesController().M0(Long.valueOf(j3))));
            bdVar.Q = q70Var;
            q70Var.b(true);
            bdVar.Q.d(0, null, false);
            bdVar.P.addView(bdVar.Q);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(3, context, bdVar);
            bdVar.V = b2Var;
            org.telegram.ui.ActionBar.t6.G(b2Var, org.telegram.ui.ActionBar.m6.J6, null);
            org.telegram.ui.ActionBar.t6.C(bdVar.V, org.telegram.ui.ActionBar.m6.K6, null);
            bdVar.V.setTextSize(1, 15.0f);
            bdVar.V.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            bdVar.V.setVisibility(8);
            bdVar.V.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            bdVar.N.addView(bdVar.V, c8.ha.t(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            bdVar.T = z8Var;
            int i24 = org.telegram.ui.ActionBar.m6.b7;
            org.telegram.ui.ActionBar.t6.Z(z8Var, context, R.drawable.greydivider_bottom, i24);
            bdVar.L.addView(bdVar.T, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
            bdVar.h0 = t4Var;
            bdVar.L.addView(t4Var, c8.ha.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            bdVar.M = linearLayout7;
            org.telegram.ui.ActionBar.t6.h(i20, linearLayout7, null);
            bdVar.M.setOrientation(1);
            bdVar.L.addView(bdVar.M, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            bdVar.f0 = z8Var2;
            org.telegram.ui.ActionBar.t6.Z(z8Var2, context, R.drawable.greydivider_bottom, i24);
            bdVar.L.addView(bdVar.f0, c8.ha.o(-1, -2));
            bdVar.n0();
        }
        return bdVar.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.S) {
            org.telegram.ui.ActionBar.u1 u1Var = this.v0;
            if (u1Var != null) {
                try {
                    u1Var.dismiss();
                    this.v0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.s0 = false;
            return;
        }
        if (i7 == org.telegram.messenger.qs.R) {
            org.telegram.ui.ActionBar.u1 u1Var2 = this.v0;
            if (u1Var2 != null) {
                try {
                    u1Var2.dismiss();
                    this.v0 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.k0);
            Boolean bool = this.l0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.m0 != null || this.n0 != null || this.o0 != null) {
                org.telegram.messenger.qp.s1(this.currentAccount).B(longValue, null, this.m0, this.n0, this.o0, this.q0, this.p0, this.D, this.E, null);
            }
            bd bdVar = new bd(bundle);
            bdVar.u0 = this.u0;
            presentFragment(bdVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var == null || !j30Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j30 j30Var = this.x;
        return (j30Var == null || dialog != j30Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ zq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.kt ktVar = this.d;
        int i7 = org.telegram.ui.ActionBar.m6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ktVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.Components.kt ktVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.m6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ktVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.b7));
        LinearLayout linearLayout = this.P;
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U7, false) + ((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false) + ((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S7, false) + ((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.R7, false) + ((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Q7, false) + ((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P7, false) + ((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O7, false) + (org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x02 == this.y0) {
            return;
        }
        this.y0 = x02;
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.M.getChildAt(i7);
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
            this.V.setVisibility(8);
        } else {
            this.V.setVisibility(0);
        }
        org.telegram.ui.ActionBar.c cVar = this.Z;
        if (cVar != null) {
            org.telegram.messenger.g0.r(cVar);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.a0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.V.setText(org.telegram.messenger.id.M0(2131748909, null));
                org.telegram.ui.Cells.b2 b2Var = this.V;
                int i7 = org.telegram.ui.ActionBar.m6.p7;
                b2Var.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.t6.U(this.V, i7, null);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    this.V.setText(org.telegram.messenger.id.M0(2131748905, null));
                    org.telegram.ui.Cells.b2 b2Var2 = this.V;
                    int i11 = org.telegram.ui.ActionBar.m6.p7;
                    b2Var2.setTag(Integer.valueOf(i11));
                    org.telegram.ui.ActionBar.t6.U(this.V, i11, null);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.V.setText(org.telegram.messenger.id.M0(2131748909, null));
                    org.telegram.ui.Cells.b2 b2Var3 = this.V;
                    int i12 = org.telegram.ui.ActionBar.m6.p7;
                    b2Var3.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.t6.U(this.V, i12, null);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.V.setText(org.telegram.messenger.id.M0(2131748907, null));
            org.telegram.ui.Cells.b2 b2Var4 = this.V;
            int i13 = org.telegram.ui.ActionBar.m6.p7;
            b2Var4.setTag(Integer.valueOf(i13));
            org.telegram.ui.ActionBar.t6.U(this.V, i13, null);
            return false;
        }
        if (str.length() > 32) {
            this.V.setText(org.telegram.messenger.id.M0(2131748908, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.V;
            int i14 = org.telegram.ui.ActionBar.m6.p7;
            b2Var5.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.t6.U(this.V, i14, null);
            return false;
        }
        this.V.setText(org.telegram.messenger.id.M0(2131748922, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.V;
        int i15 = org.telegram.ui.ActionBar.m6.F6;
        b2Var6.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.t6.U(this.V, i15, null);
        this.Y = str;
        org.telegram.ui.ActionBar.c cVar2 = new org.telegram.ui.ActionBar.c(26, this, str);
        this.Z = cVar2;
        org.telegram.messenger.g0.i3(cVar2, 300L);
        return true;
    }

    public final void k0(boolean z9, boolean z10) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.r.cancel();
            this.r = null;
        }
        if (!z10) {
            if (z9) {
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
        if (z9) {
            this.s.setVisibility(0);
            AnimatorSet animatorSet2 = this.r;
            yc ycVar = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ycVar, (Property<yc, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<zc, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            yc ycVar2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(ycVar2, (Property<yc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<zc, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new ch.y(27, this, z9));
        this.r.start();
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.q2 = true;
        i0Var.C2 = new sc(this, 1);
        showDialog(i0Var);
    }

    public final void m0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.w0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z9 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 3));
            this.x0.setDuration((long) (Math.abs(this.b.c - (z9 ? 1.0f : 0.0f)) * 200.0f));
            this.x0.setInterpolator(org.telegram.ui.Components.wq.f);
            this.x0.start();
        }
    }

    public final void n0() {
        if (this.e == null) {
            return;
        }
        int i7 = 8;
        if (this.b0 || this.k0) {
            org.telegram.ui.Cells.z8 z8Var = this.T;
            int i10 = org.telegram.ui.ActionBar.m6.B6;
            z8Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.t6.U(this.T.getTextView(), i10, null);
            this.e.setVisibility(0);
            this.f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.z8 z8Var2 = this.T;
            org.telegram.ui.ActionBar.t6.Z(z8Var2, z8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
            this.N.setVisibility(0);
            this.h0.setVisibility(8);
            if (this.J) {
                this.T.setText(org.telegram.messenger.id.M0(this.b0 ? 2131748639 : 2131748636, null));
                this.W.setText(this.b0 ? org.telegram.messenger.id.M0(2131752403, null) : org.telegram.messenger.id.M0(2131752385, null));
            } else {
                this.T.setText(org.telegram.messenger.id.M0(this.b0 ? 2131752327 : 2131752267, null));
                this.W.setText(this.b0 ? org.telegram.messenger.id.M0(2131752403, null) : org.telegram.messenger.id.M0(2131752385, null));
            }
            this.O.setVisibility(this.b0 ? 8 : 0);
            this.P.setVisibility(this.b0 ? 0 : 8);
            this.N.setPadding(0, 0, 0, this.b0 ? 0 : org.telegram.messenger.g0.L(7.0f));
            org.telegram.ui.Components.q70 q70Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.d0;
            q70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.b2 b2Var = this.V;
            if (!this.b0 && b2Var.length() != 0) {
                i7 = 0;
            }
            b2Var.setVisibility(i7);
        } else {
            this.T.setText(org.telegram.messenger.id.M0(2131752533, null));
            org.telegram.ui.Cells.z8 z8Var3 = this.T;
            int i11 = org.telegram.ui.ActionBar.m6.p7;
            z8Var3.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.t6.U(this.T.getTextView(), i11, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var4 = this.T;
                org.telegram.ui.ActionBar.t6.Z(z8Var4, z8Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                this.f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.z8 z8Var5 = this.T;
                org.telegram.ui.ActionBar.t6.Z(z8Var5, z8Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7);
                this.h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f0.setVisibility(0);
            }
        }
        this.R.a(!this.b0);
        this.S.a(this.b0);
        this.y.clearFocus();
        org.telegram.messenger.g0.v1(this.y);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var != null) {
            j30Var.h(i7, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar == null || !ktVar.e) {
            return true;
        }
        if (!z9) {
            return false;
        }
        ktVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.S);
        if (this.i0 == 1 && !this.c0 && this.d0 == null) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.j0;
            TLRPC.ChatFull N0 = messagesController.N0(j3);
            if (N0 != null) {
                this.d0 = N0.exported_invite;
            }
            if (this.d0 == null) {
                this.c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new tc(this, 3));
            }
        }
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var != null) {
            j30Var.a = this;
            j30Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.t0.intValue(), true);
            this.t0 = null;
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.S);
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var != null) {
            j30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar != null) {
            ktVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar != null) {
            ktVar.r();
        }
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var != null) {
            j30Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var != null) {
            j30Var.j(i7, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar != null) {
            ktVar.s();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.j30 j30Var = this.x;
        if (j30Var != null) {
            j30Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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
                cpVar.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.v8, false));
            }
            org.telegram.ui.Cells.t4 t4Var = this.h0;
            if (t4Var == null || t4Var.getChildCount() <= 0 || !(this.h0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h6, false));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 || this.i0 == 1) {
            return;
        }
        this.d.requestFocus();
        org.telegram.ui.Components.et etVar = this.d.a;
        etVar.requestFocus();
        org.telegram.messenger.g0.K3(etVar);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.i0 == 0) {
            org.telegram.ui.Components.j30 j30Var = this.x;
            if (j30Var != null) {
                j30Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.kt ktVar = this.d;
                if (ktVar != null) {
                    ktVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.i0 == 0) {
            org.telegram.ui.Components.j30 j30Var = this.x;
            if (j30Var != null && (str = j30Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.kt ktVar = this.d;
            if (ktVar != null) {
                String obj = ktVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }
}
