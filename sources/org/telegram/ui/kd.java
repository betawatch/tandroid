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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kd extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40 {
    public TLRPC.FileLocation D;
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.p4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.bi0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.j80 Q;
    public org.telegram.ui.Cells.l6 R;
    public org.telegram.ui.Cells.l6 S;
    public org.telegram.ui.Cells.b9 T;
    public TextView U;
    public org.telegram.ui.Cells.b2 V;
    public org.telegram.ui.Cells.p4 W;
    public int X;
    public String Y;
    public h0 Z;
    public org.telegram.ui.ActionBar.t0 a;
    public boolean a0;
    public org.telegram.ui.Components.fr b;
    public boolean b0;
    public org.telegram.ui.Components.kp c;
    public boolean c0;
    public org.telegram.ui.Components.wt d;
    public TLRPC.TL_chatInviteExported d0;
    public org.telegram.ui.Cells.c7 e;
    public boolean e0;
    public ag.d2 f;
    public org.telegram.ui.Cells.b9 f0;
    public final ArrayList g0;
    public kg.f0 h;
    public org.telegram.ui.Cells.v4 h0;
    public final int i0;
    public final long j0;
    public boolean k0;
    public final Boolean l0;
    public TLRPC.InputFile m0;
    public hd n;
    public TLRPC.InputFile n0;
    public TLRPC.VideoSize o0;
    public String p0;
    public double q0;
    public AnimatorSet r;
    public boolean r0;
    public id s;
    public boolean s0;
    public Integer t0;
    public org.telegram.messenger.j20 u0;
    public org.telegram.ui.ActionBar.x1 v0;
    public final org.telegram.ui.Components.r8 w;
    public final ad w0;
    public final org.telegram.ui.Components.b40 x;
    public ValueAnimator x0;
    public EditTextBoldCursor y;
    public int y0;

    public kd(Bundle bundle) {
        super(bundle);
        this.g0 = new ArrayList();
        this.k0 = true;
        this.w0 = new ad(this, 0);
        int i10 = bundle.getInt("step", 0);
        this.i0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.w = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            this.x = new org.telegram.ui.Components.b40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new bd(this, 1));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.k0 = z10;
            this.b0 = !z10;
            if (!z10 && !this.e0) {
                this.e0 = true;
                m0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new bd(this, 0));
            }
        }
        this.j0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void Y(kd kdVar, org.telegram.ui.ActionBar.x1 x1Var) {
        kdVar.s0 = false;
        kdVar.r0 = false;
        if (kdVar.t0 != null) {
            ConnectionsManager.getInstance(kdVar.currentAccount).cancelRequest(kdVar.t0.intValue(), true);
            kdVar.t0 = null;
        }
        kdVar.l0(false);
        x1Var.dismiss();
    }

    public static /* synthetic */ void Z(kd kdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.vp.h1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(kdVar.currentAccount).sendRequest(tL_channels_updateUsername, new bd(kdVar, 2), 64);
    }

    public static /* synthetic */ void a0(kd kdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.vp.r1(kdVar.currentAccount).g1(kdVar.j0);
        kdVar.X = ConnectionsManager.getInstance(kdVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(kdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void b0(kd kdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.m) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kdVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        if (currentChannel.megagroup) {
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("RevokeLinkAlert", null, 2131746039, org.telegram.messenger.vp.r1(kdVar.currentAccount).U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
        } else {
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("RevokeLinkAlertChannel", null, 2131746038, org.telegram.messenger.vp.r1(kdVar.currentAccount).U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new ng.d(7, kdVar, currentChannel));
        kdVar.showDialog(x1Var);
    }

    public static void c0(kd kdVar) {
        if (kdVar.v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kdVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131744850, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131744851, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743239, null), null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131744859, null), new y0(kdVar, 14));
        kdVar.v0 = alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.a40
    public final void H(float f7) {
        id idVar = this.s;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
        id idVar = this.s;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10;
        final kd kdVar = this;
        org.telegram.ui.Components.wt wtVar = kdVar.d;
        if (wtVar != null) {
            wtVar.o();
        }
        kdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 1;
        kdVar.actionBar.setAllowOverlayTitle(true);
        kdVar.actionBar.setActionBarMenuOnItemClick(new ag.e(kdVar, 24));
        org.telegram.ui.ActionBar.y p5 = kdVar.actionBar.p();
        Drawable f7 = i0.a.f(context, R.drawable.ic_ab_done);
        int i12 = org.telegram.ui.ActionBar.t6.v8;
        final int i13 = 0;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        f7.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        kdVar.c = kpVar;
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(f7, kpVar);
        kdVar.b = frVar;
        int L = org.telegram.messenger.i0.L(56.0f);
        String L0 = org.telegram.messenger.cd.L0(2131751355, null);
        org.telegram.ui.ActionBar.l lVar = p5.b;
        org.telegram.ui.ActionBar.t0 b10 = p5.b(1, 0, null, p5.c ? lVar.q0 : lVar.p0, frVar, L, L0, null);
        kdVar.a = b10;
        org.telegram.ui.ActionBar.a7.y(b10, f7, i12, null, mode);
        int i14 = 2;
        int i15 = kdVar.i0;
        if (i15 == 0) {
            kdVar.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748300, null));
            gd gdVar = new gd(i13, context, kdVar);
            gdVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
            kdVar.fragmentView = gdVar;
            int i16 = org.telegram.ui.ActionBar.t6.d6;
            gdVar.setTag(Integer.valueOf(i16));
            org.telegram.ui.ActionBar.a7.i(i16, kdVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            kdVar.L = linearLayout;
            linearLayout.setOrientation(1);
            gdVar.addView(kdVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            kdVar.L.addView(frameLayout, w7.b6.o(-1, -2));
            ag.d2 d2Var = new ag.d2(kdVar, context, 4);
            kdVar.f = d2Var;
            d2Var.setRoundRadius(org.telegram.messenger.i0.L(32.0f));
            org.telegram.ui.Components.r8 r8Var = kdVar.w;
            r8Var.k(5L, null, null, null);
            kdVar.f.setImageDrawable(r8Var);
            ag.d2 d2Var2 = kdVar.f;
            boolean z10 = org.telegram.messenger.cd.X;
            frameLayout.addView(d2Var2, w7.b6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            kg.f0 f0Var = new kg.f0(kdVar, context, paint, i14);
            kdVar.h = f0Var;
            f0Var.setContentDescription(org.telegram.messenger.cd.L0(2131752212, null));
            kg.f0 f0Var2 = kdVar.h;
            boolean z11 = org.telegram.messenger.cd.X;
            frameLayout.addView(f0Var2, w7.b6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            kdVar.h.setOnClickListener(new cd(kdVar, i11));
            kdVar.K = new org.telegram.ui.Components.bi0(R.raw.camera, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null);
            hd hdVar = new hd(kdVar, context, 0);
            kdVar.n = hdVar;
            hdVar.setScaleType(ImageView.ScaleType.CENTER);
            kdVar.n.setAnimation(kdVar.K);
            kdVar.n.setEnabled(false);
            kdVar.n.setClickable(false);
            kdVar.n.setPadding(org.telegram.messenger.i0.L(0.0f), 0, 0, org.telegram.messenger.i0.L(1.0f));
            hd hdVar2 = kdVar.n;
            boolean z12 = org.telegram.messenger.cd.X;
            frameLayout.addView(hdVar2, w7.b6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            id idVar = new id(kdVar, context, i13);
            kdVar.s = idVar;
            idVar.setSize(org.telegram.messenger.i0.L(30.0f));
            kdVar.s.setProgressColor(-1);
            kdVar.s.setNoProgress(false);
            id idVar2 = kdVar.s;
            boolean z13 = org.telegram.messenger.cd.X;
            frameLayout.addView(idVar2, w7.b6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            kdVar.j0(false, false);
            org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, gdVar, kdVar, 0, false, null);
            kdVar = kdVar;
            kdVar.d = wtVar2;
            wtVar2.setHint(org.telegram.messenger.cd.L0(2131751125, null));
            String str = kdVar.F;
            if (str != null) {
                kdVar.d.setText(str);
                kdVar.F = null;
            }
            kdVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            kdVar.d.getEditText().setSingleLine(true);
            kdVar.d.getEditText().setImeOptions(5);
            kdVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(kdVar) { // from class: org.telegram.ui.dd
                public final /* synthetic */ kd b;

                {
                    this.b = kdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (i13) {
                        case 0:
                            kd kdVar2 = this.b;
                            if (i17 != 5) {
                                kdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(kdVar2.d.getEditText().getText())) {
                                kdVar2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i17 == 6 && (t0Var = this.b.a) != null) {
                                t0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.wt wtVar3 = kdVar.d;
            boolean z14 = org.telegram.messenger.cd.X;
            frameLayout.addView(wtVar3, w7.b6.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            kdVar.y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.a7.E(kdVar.y, org.telegram.ui.ActionBar.t6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = kdVar.y;
            int i17 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor2, i17, null);
            kdVar.y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.a7.G(kdVar.y, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, kdVar.getResourceProvider());
            kdVar.y.setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
            kdVar.y.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            kdVar.y.setInputType(180225);
            kdVar.y.setImeOptions(6);
            kdVar.y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            kdVar.y.setHint(org.telegram.messenger.cd.L0(2131751460, null));
            org.telegram.ui.ActionBar.a7.w(kdVar.y, i17, null);
            kdVar.y.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            kdVar.y.setCursorWidth(1.5f);
            kdVar.L.addView(kdVar.y, w7.b6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            kdVar.y.setOnEditorActionListener(new TextView.OnEditorActionListener(kdVar) { // from class: org.telegram.ui.dd
                public final /* synthetic */ kd b;

                {
                    this.b = kdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (i11) {
                        case 0:
                            kd kdVar2 = this.b;
                            if (i172 != 5) {
                                kdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(kdVar2.d.getEditText().getText())) {
                                kdVar2.y.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i172 == 6 && (t0Var = this.b.a) != null) {
                                t0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            kdVar.y.addTextChangedListener(new jd(0));
            TextView textView = new TextView(context);
            kdVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(kdVar.U, org.telegram.ui.ActionBar.t6.F6, null);
            kdVar.U.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            kdVar.U.setText(org.telegram.messenger.cd.L0(2131751463, null));
            kdVar.L.addView(kdVar.U, w7.b6.t(-2, -2, org.telegram.messenger.cd.X ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            kdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            kdVar.L = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(kdVar.L, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.vp messagesController = kdVar.getMessagesController();
            long j10 = kdVar.j0;
            TLRPC.Chat L02 = messagesController.L0(Long.valueOf(j10));
            boolean z15 = L02 != null && (!org.telegram.messenger.w3.T(L02) || org.telegram.messenger.w3.n0(L02));
            kdVar.J = z15;
            kdVar.actionBar.setTitle(org.telegram.messenger.cd.L0(z15 ? 2131749409 : 2131752297, null));
            View view = kdVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.t6.a7;
            view.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.a7.i(i18, kdVar.fragmentView, null);
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
            kdVar.H = p4Var;
            p4Var.setHeight(46);
            org.telegram.ui.Cells.p4 p4Var2 = kdVar.H;
            int i19 = org.telegram.ui.ActionBar.t6.d6;
            org.telegram.ui.ActionBar.a7.i(i19, p4Var2, null);
            kdVar.H.setText(org.telegram.messenger.cd.L0(kdVar.J ? 2131749400 : 2131752275, null));
            kdVar.L.addView(kdVar.H);
            LinearLayout linearLayout3 = new LinearLayout(context);
            kdVar.G = linearLayout3;
            linearLayout3.setOrientation(1);
            org.telegram.ui.ActionBar.a7.i(i19, kdVar.G, null);
            kdVar.L.addView(kdVar.G, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, false);
            kdVar.R = l6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(false);
            int i20 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i20);
            l6Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(l6Var, N0, null, N, null);
            Boolean bool = kdVar.l0;
            if (bool != null && !bool.booleanValue()) {
                kdVar.b0 = true;
            }
            if (kdVar.J) {
                i10 = 1;
                kdVar.R.b(org.telegram.messenger.cd.L0(2131748653, null), org.telegram.messenger.cd.L0(2131748652, null), false, !kdVar.b0);
            } else {
                i10 = 1;
                kdVar.R.b(org.telegram.messenger.cd.L0(2131752318, null), org.telegram.messenger.cd.L0(2131752315, null), false, !kdVar.b0);
            }
            kdVar.R.setOnClickListener(new cd(kdVar, i14));
            if (bool == null || bool.booleanValue()) {
                kdVar.G.addView(kdVar.R, w7.b6.o(-1, -2));
            }
            org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, false);
            kdVar.S = l6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(false);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i20);
            l6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.a7.k(l6Var2, N02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                kdVar.b0 = false;
            }
            if (kdVar.J) {
                kdVar.S.b(org.telegram.messenger.cd.L0(2131748656, null), org.telegram.messenger.cd.L0(2131748655, null), false, kdVar.b0);
            } else {
                kdVar.S.b(org.telegram.messenger.cd.L0(2131752329, null), org.telegram.messenger.cd.L0(2131752328, null), false, kdVar.b0);
            }
            kdVar.S.setOnClickListener(new cd(kdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                kdVar.G.addView(kdVar.S, w7.b6.o(-1, -2));
            }
            org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            kdVar.e = c7Var;
            kdVar.L.addView(c7Var, w7.b6.o(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            kdVar.N = linearLayout4;
            linearLayout4.setOrientation(i10);
            org.telegram.ui.ActionBar.a7.i(i19, kdVar.N, null);
            kdVar.L.addView(kdVar.N, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context);
            kdVar.W = p4Var3;
            kdVar.N.addView(p4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            kdVar.O = linearLayout5;
            linearLayout5.setOrientation(0);
            kdVar.N.addView(kdVar.O, w7.b6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            kdVar.I = editTextBoldCursor3;
            editTextBoldCursor3.setText(org.telegram.messenger.vp.r1(kdVar.currentAccount).U2 + "/");
            kdVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = kdVar.I;
            int i21 = org.telegram.ui.ActionBar.t6.H6;
            org.telegram.ui.ActionBar.a7.E(editTextBoldCursor4, i21, null);
            EditTextBoldCursor editTextBoldCursor5 = kdVar.I;
            int i22 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor5, i22, null);
            kdVar.I.setMaxLines(1);
            kdVar.I.setLines(1);
            kdVar.I.setEnabled(false);
            kdVar.I.setBackgroundDrawable(null);
            kdVar.I.setPadding(0, 0, 0, 0);
            kdVar.I.setSingleLine(true);
            kdVar.I.setInputType(163840);
            kdVar.I.setImeOptions(6);
            kdVar.O.addView(kdVar.I, w7.b6.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            kdVar.y = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.a7.E(kdVar.y, i21, null);
            org.telegram.ui.ActionBar.a7.V(kdVar.y, i22, null);
            kdVar.y.setMaxLines(1);
            kdVar.y.setLines(1);
            kdVar.y.setBackgroundDrawable(null);
            kdVar.y.setPadding(0, 0, 0, 0);
            kdVar.y.setSingleLine(true);
            kdVar.y.setInputType(163872);
            kdVar.y.setImeOptions(6);
            kdVar.y.setHint(org.telegram.messenger.cd.L0(2131752266, null));
            org.telegram.ui.ActionBar.a7.w(kdVar.y, i22, null);
            kdVar.y.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            kdVar.y.setCursorWidth(1.5f);
            kdVar.O.addView(kdVar.y, w7.b6.o(-1, 36));
            kdVar.y.addTextChangedListener(new n0(kdVar, i14));
            LinearLayout linearLayout6 = new LinearLayout(context);
            kdVar.P = linearLayout6;
            linearLayout6.setOrientation(1);
            kdVar.N.addView(kdVar.P, w7.b6.o(-1, -2));
            org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, kdVar, null, true, org.telegram.messenger.w3.T(kdVar.getMessagesController().L0(Long.valueOf(j10))));
            kdVar.Q = j80Var;
            j80Var.b(true);
            kdVar.Q.d(0, null, false);
            kdVar.P.addView(kdVar.Q);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(kdVar, context, 3);
            kdVar.V = b2Var;
            org.telegram.ui.ActionBar.a7.H(b2Var, org.telegram.ui.ActionBar.t6.J6, null);
            org.telegram.ui.ActionBar.a7.D(kdVar.V, org.telegram.ui.ActionBar.t6.K6, null);
            kdVar.V.setTextSize(1, 15.0f);
            kdVar.V.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            kdVar.V.setVisibility(8);
            kdVar.V.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
            kdVar.N.addView(kdVar.V, w7.b6.t(-2, -2, org.telegram.messenger.cd.X ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            kdVar.T = b9Var;
            int i23 = org.telegram.ui.ActionBar.t6.b7;
            org.telegram.ui.ActionBar.a7.a0(b9Var, context, R.drawable.greydivider_bottom, i23);
            kdVar.L.addView(kdVar.T, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
            kdVar.h0 = v4Var;
            kdVar.L.addView(v4Var, w7.b6.o(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            kdVar.M = linearLayout7;
            org.telegram.ui.ActionBar.a7.i(i19, linearLayout7, null);
            kdVar.M.setOrientation(1);
            kdVar.L.addView(kdVar.M, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            kdVar.f0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, R.drawable.greydivider_bottom, i23);
            kdVar.L.addView(kdVar.f0, w7.b6.o(-1, -2));
            kdVar.m0();
        }
        return kdVar.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.S) {
            org.telegram.ui.ActionBar.x1 x1Var = this.v0;
            if (x1Var != null) {
                try {
                    x1Var.dismiss();
                    this.v0 = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            l0(false);
            this.s0 = false;
            return;
        }
        if (i10 == org.telegram.messenger.zs.R) {
            org.telegram.ui.ActionBar.x1 x1Var2 = this.v0;
            if (x1Var2 != null) {
                try {
                    x1Var2.dismiss();
                    this.v0 = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
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
                org.telegram.messenger.vp.r1(this.currentAccount).B(longValue, null, this.m0, this.n0, this.o0, this.q0, this.p0, this.D, this.E, null);
            }
            kd kdVar = new kd(bundle);
            kdVar.u0 = this.u0;
            presentFragment(kdVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var == null || !b40Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.b40 b40Var = this.x;
        return (b40Var == null || dialog != b40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.wt wtVar = this.d;
        int i10 = org.telegram.ui.ActionBar.t6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(wtVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.Components.wt wtVar2 = this.d;
        int i11 = org.telegram.ui.ActionBar.t6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(wtVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.b7));
        LinearLayout linearLayout = this.P;
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h0, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.R, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        return arrayList;
    }

    public final void h0() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U7, false) + ((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false) + ((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S7, false) + ((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false) + ((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Q7, false) + ((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P7, false) + ((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O7, false) + (org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x02 == this.y0) {
            return;
        }
        this.y0 = x02;
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.M.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.m) {
                    org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) childAt;
                    mVar.d.q(mVar.f);
                    mVar.a.invalidate();
                }
            }
        }
    }

    public final boolean i0(String str) {
        if (str == null || str.length() <= 0) {
            this.V.setVisibility(8);
        } else {
            this.V.setVisibility(0);
        }
        h0 h0Var = this.Z;
        if (h0Var != null) {
            org.telegram.messenger.i0.r(h0Var);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.a0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.V.setText(org.telegram.messenger.cd.L0(2131748919, null));
                org.telegram.ui.Cells.b2 b2Var = this.V;
                int i10 = org.telegram.ui.ActionBar.t6.p7;
                b2Var.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.a7.V(this.V, i10, null);
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.V.setText(org.telegram.messenger.cd.L0(2131748915, null));
                    org.telegram.ui.Cells.b2 b2Var2 = this.V;
                    int i12 = org.telegram.ui.ActionBar.t6.p7;
                    b2Var2.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.a7.V(this.V, i12, null);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.V.setText(org.telegram.messenger.cd.L0(2131748919, null));
                    org.telegram.ui.Cells.b2 b2Var3 = this.V;
                    int i13 = org.telegram.ui.ActionBar.t6.p7;
                    b2Var3.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.a7.V(this.V, i13, null);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.V.setText(org.telegram.messenger.cd.L0(2131748917, null));
            org.telegram.ui.Cells.b2 b2Var4 = this.V;
            int i14 = org.telegram.ui.ActionBar.t6.p7;
            b2Var4.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.a7.V(this.V, i14, null);
            return false;
        }
        if (str.length() > 32) {
            this.V.setText(org.telegram.messenger.cd.L0(2131748918, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.V;
            int i15 = org.telegram.ui.ActionBar.t6.p7;
            b2Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.a7.V(this.V, i15, null);
            return false;
        }
        this.V.setText(org.telegram.messenger.cd.L0(2131748932, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.V;
        int i16 = org.telegram.ui.ActionBar.t6.F6;
        b2Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.a7.V(this.V, i16, null);
        this.Y = str;
        h0 h0Var2 = new h0(19, this, str);
        this.Z = h0Var2;
        org.telegram.messenger.i0.h3(h0Var2, 300L);
        return true;
    }

    public final void j0(boolean z10, boolean z11) {
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
            hd hdVar = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hdVar, (Property<hd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<id, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            hd hdVar2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(hdVar2, (Property<hd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<id, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new eg.m(13, this, z10));
        this.r.start();
    }

    public final void k0() {
        if (getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(2, this.currentAccount, getParentActivity(), this, null);
        q0Var.n2 = true;
        q0Var.z2 = new ad(this, 1);
        showDialog(q0Var);
    }

    public final void l0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.w0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z10 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 3));
            this.x0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.x0.setInterpolator(org.telegram.ui.Components.gr.f);
            this.x0.start();
        }
    }

    public final void m0() {
        if (this.e == null) {
            return;
        }
        int i10 = 8;
        if (this.b0 || this.k0) {
            org.telegram.ui.Cells.b9 b9Var = this.T;
            int i11 = org.telegram.ui.ActionBar.t6.B6;
            b9Var.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.a7.V(this.T.getTextView(), i11, null);
            this.e.setVisibility(0);
            this.f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.b9 b9Var2 = this.T;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, b9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
            this.N.setVisibility(0);
            this.h0.setVisibility(8);
            if (this.J) {
                this.T.setText(org.telegram.messenger.cd.L0(this.b0 ? 2131748654 : 2131748651, null));
                this.W.setText(this.b0 ? org.telegram.messenger.cd.L0(2131752403, null) : org.telegram.messenger.cd.L0(2131752385, null));
            } else {
                this.T.setText(org.telegram.messenger.cd.L0(this.b0 ? 2131752327 : 2131752267, null));
                this.W.setText(this.b0 ? org.telegram.messenger.cd.L0(2131752403, null) : org.telegram.messenger.cd.L0(2131752385, null));
            }
            this.O.setVisibility(this.b0 ? 8 : 0);
            this.P.setVisibility(this.b0 ? 0 : 8);
            this.N.setPadding(0, 0, 0, this.b0 ? 0 : org.telegram.messenger.i0.L(7.0f));
            org.telegram.ui.Components.j80 j80Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.d0;
            j80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.b2 b2Var = this.V;
            if (!this.b0 && b2Var.length() != 0) {
                i10 = 0;
            }
            b2Var.setVisibility(i10);
        } else {
            this.T.setText(org.telegram.messenger.cd.L0(2131752533, null));
            org.telegram.ui.Cells.b9 b9Var3 = this.T;
            int i12 = org.telegram.ui.ActionBar.t6.p7;
            b9Var3.setTag(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.a7.V(this.T.getTextView(), i12, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var4 = this.T;
                org.telegram.ui.ActionBar.a7.a0(b9Var4, b9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                this.f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.b9 b9Var5 = this.T;
                org.telegram.ui.ActionBar.a7.a0(b9Var5, b9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
                this.h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f0.setVisibility(0);
            }
        }
        this.R.a(!this.b0);
        this.S.a(this.b0);
        this.y.clearFocus();
        org.telegram.messenger.i0.v1(this.y);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var != null) {
            b40Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
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

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.R);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.S);
        if (this.i0 == 1 && !this.c0 && this.d0 == null) {
            org.telegram.messenger.vp messagesController = getMessagesController();
            long j10 = this.j0;
            TLRPC.ChatFull M0 = messagesController.M0(j10);
            if (M0 != null) {
                this.d0 = M0.exported_invite;
            }
            if (this.d0 == null) {
                this.c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new bd(this, 3));
            }
        }
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var != null) {
            b40Var.a = this;
            b40Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.t0.intValue(), true);
            this.t0 = null;
        }
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.R);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.S);
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var != null) {
            b40Var.d();
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.r();
        }
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var != null) {
            b40Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var != null) {
            b40Var.j(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.b40 b40Var = this.x;
        if (b40Var != null) {
            b40Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.Components.kp kpVar = this.c;
            if (kpVar != null) {
                kpVar.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.v8, false));
            }
            org.telegram.ui.Cells.v4 v4Var = this.h0;
            if (v4Var == null || v4Var.getChildCount() <= 0 || !(this.h0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.i0 == 1) {
            return;
        }
        this.d.requestFocus();
        org.telegram.ui.Components.rt rtVar = this.d.a;
        rtVar.requestFocus();
        org.telegram.messenger.i0.J3(rtVar);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.i0 == 0) {
            org.telegram.ui.Components.b40 b40Var = this.x;
            if (b40Var != null) {
                b40Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.wt wtVar = this.d;
                if (wtVar != null) {
                    wtVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.i0 == 0) {
            org.telegram.ui.Components.b40 b40Var = this.x;
            if (b40Var != null && (str = b40Var.f) != null) {
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

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void T() {
    }
}
