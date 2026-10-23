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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class md extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.l4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.r90 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.j6 S;
    public org.telegram.ui.Cells.e9 T;
    public TextView U;
    public org.telegram.ui.Cells.x1 V;
    public org.telegram.ui.Cells.l4 W;
    public int X;
    public String Y;
    public h0 Z;
    public org.telegram.ui.ActionBar.u0 a;
    public boolean a0;
    public org.telegram.ui.Components.as b;
    public boolean b0;
    public org.telegram.ui.Components.eq c;
    public boolean c0;
    public org.telegram.ui.Components.qu d;
    public TLRPC.TL_chatInviteExported d0;
    public org.telegram.ui.Cells.b7 e;
    public boolean e0;
    public ci.j4 f;
    public org.telegram.ui.Cells.e9 f0;
    public final ArrayList g0;
    public ei.g6 h;
    public org.telegram.ui.Cells.r4 h0;
    public final int i0;
    public final long j0;
    public boolean k0;
    public final Boolean l0;
    public TLRPC.InputFile m0;
    public jd n;
    public TLRPC.InputFile n0;
    public TLRPC.VideoSize o0;
    public String p0;
    public double q0;
    public AnimatorSet r;
    public boolean r0;
    public kd s;
    public boolean s0;
    public Integer t0;
    public Utilities.Callback2 u0;
    public final org.telegram.ui.Components.h9 v;
    public org.telegram.ui.ActionBar.c2 v0;
    public final org.telegram.ui.Components.e50 w;
    public final cd w0;
    public EditTextBoldCursor x;
    public ValueAnimator x0;
    public TLRPC.FileLocation y;
    public int y0;

    public md(Bundle bundle) {
        super(bundle);
        this.g0 = new ArrayList();
        this.k0 = true;
        this.w0 = new cd(this, 0);
        int i10 = bundle.getInt("step", 0);
        this.i0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.v = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
            this.w = new org.telegram.ui.Components.e50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 1));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.k0 = z10;
            this.b0 = !z10;
            if (!z10 && !this.e0) {
                this.e0 = true;
                i0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.j0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(md mdVar, org.telegram.ui.ActionBar.c2 c2Var) {
        mdVar.s0 = false;
        mdVar.r0 = false;
        if (mdVar.t0 != null) {
            ConnectionsManager.getInstance(mdVar.currentAccount).cancelRequest(mdVar.t0.intValue(), true);
            mdVar.t0 = null;
        }
        mdVar.h0(false);
        c2Var.dismiss();
    }

    public static /* synthetic */ void V(md mdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(mdVar, 2), 64);
    }

    public static /* synthetic */ void W(md mdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(mdVar.currentAccount).getInputChannel(mdVar.j0);
        mdVar.X = ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_checkUsername, new ca(mdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(md mdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        if (currentChannel.megagroup) {
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(10, mdVar, currentChannel));
        mdVar.showDialog(c2Var);
    }

    public static void Y(md mdVar) {
        if (mdVar.v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new a1(mdVar, 12));
        mdVar.v0 = alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        kd kdVar = this.s;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        kd kdVar = this.s;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10;
        final md mdVar = this;
        org.telegram.ui.Components.qu quVar = mdVar.d;
        if (quVar != null) {
            quVar.o();
        }
        mdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 1;
        mdVar.actionBar.setAllowOverlayTitle(true);
        mdVar.actionBar.setActionBarMenuOnItemClick(new hd(mdVar));
        org.telegram.ui.ActionBar.y m10 = mdVar.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = org.telegram.ui.ActionBar.k6.v8;
        final int i13 = 0;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        mdVar.c = eqVar;
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, eqVar);
        mdVar.b = asVar;
        org.telegram.ui.ActionBar.u0 i14 = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        mdVar.a = i14;
        org.telegram.ui.ActionBar.r6.z(i14, mutate, i12, null, mode);
        int i15 = 2;
        int i16 = 5;
        int i17 = mdVar.i0;
        if (i17 == 0) {
            mdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            id idVar = new id(i13, context, mdVar);
            idVar.setOnTouchListener(new di.d(i15));
            mdVar.fragmentView = idVar;
            int i18 = org.telegram.ui.ActionBar.k6.d6;
            idVar.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.r6.i(i18, mdVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            mdVar.L = linearLayout;
            linearLayout.setOrientation(1);
            idVar.addView(mdVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            mdVar.L.addView(frameLayout, w7.z5.n(-1, -2));
            ci.j4 j4Var = new ci.j4(mdVar, context, i16);
            mdVar.f = j4Var;
            j4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = mdVar.v;
            h9Var.n(5L, null, null);
            mdVar.f.setImageDrawable(h9Var);
            ci.j4 j4Var2 = mdVar.f;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(j4Var2, w7.z5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(mdVar, context, paint, i15);
            mdVar.h = g6Var;
            g6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ei.g6 g6Var2 = mdVar.h;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(g6Var2, w7.z5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            mdVar.h.setOnClickListener(new ed(mdVar, i11));
            mdVar.K = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            jd jdVar = new jd(mdVar, context, 0);
            mdVar.n = jdVar;
            jdVar.setScaleType(ImageView.ScaleType.CENTER);
            mdVar.n.setAnimation(mdVar.K);
            mdVar.n.setEnabled(false);
            mdVar.n.setClickable(false);
            mdVar.n.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            jd jdVar2 = mdVar.n;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(jdVar2, w7.z5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            kd kdVar = new kd(mdVar, context, i13);
            mdVar.s = kdVar;
            kdVar.setSize(AndroidUtilities.dp(30.0f));
            mdVar.s.setProgressColor(-1);
            mdVar.s.setNoProgress(false);
            kd kdVar2 = mdVar.s;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(kdVar2, w7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            mdVar.f0(false, false);
            org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, idVar, this, 0, false, null);
            mdVar = this;
            mdVar.d = quVar2;
            quVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = mdVar.F;
            if (str != null) {
                mdVar.d.setText(str);
                mdVar.F = null;
            }
            mdVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            mdVar.d.getEditText().setSingleLine(true);
            mdVar.d.getEditText().setImeOptions(5);
            mdVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) { // from class: org.telegram.ui.fd
                public final /* synthetic */ md b;

                {
                    this.b = mdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i19, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i13) {
                        case 0:
                            md mdVar2 = this.b;
                            if (i19 != 5) {
                                mdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(mdVar2.d.getEditText().getText())) {
                                mdVar2.x.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i19 == 6 && (u0Var = this.b.a) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.qu quVar3 = mdVar.d;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(quVar3, w7.z5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            mdVar.x = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.F(mdVar.x, org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = mdVar.x;
            int i19 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor2, i19, null);
            mdVar.x.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.H(mdVar.x, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, mdVar.getResourceProvider());
            mdVar.x.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            mdVar.x.setGravity(LocaleController.isRTL ? 5 : 3);
            mdVar.x.setInputType(180225);
            mdVar.x.setImeOptions(6);
            mdVar.x.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            mdVar.x.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            org.telegram.ui.ActionBar.r6.x(mdVar.x, i19, null);
            mdVar.x.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.x.setCursorWidth(1.5f);
            mdVar.L.addView(mdVar.x, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            mdVar.x.setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) { // from class: org.telegram.ui.fd
                public final /* synthetic */ md b;

                {
                    this.b = mdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i192, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i11) {
                        case 0:
                            md mdVar2 = this.b;
                            if (i192 != 5) {
                                mdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(mdVar2.d.getEditText().getText())) {
                                mdVar2.x.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i192 == 6 && (u0Var = this.b.a) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            mdVar.x.addTextChangedListener(new ld(0));
            TextView textView = new TextView(context);
            mdVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(mdVar.U, org.telegram.ui.ActionBar.k6.F6, null);
            mdVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            mdVar.U.setText(LocaleController.getString(R.string.DescriptionInfo));
            mdVar.L.addView(mdVar.U, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i17 == 1) {
            ScrollView scrollView = new ScrollView(context);
            mdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            mdVar.L = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(mdVar.L, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = mdVar.getMessagesController();
            long j10 = mdVar.j0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            mdVar.J = z15;
            mdVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = mdVar.fragmentView;
            int i20 = org.telegram.ui.ActionBar.k6.a7;
            view.setTag(Integer.valueOf(i20));
            org.telegram.ui.ActionBar.r6.i(i20, mdVar.fragmentView, null);
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            mdVar.H = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = mdVar.H;
            int i21 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i21, l4Var2, null);
            mdVar.H.setText(LocaleController.getString(mdVar.J ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            mdVar.L.addView(mdVar.H);
            LinearLayout linearLayout3 = new LinearLayout(context);
            mdVar.G = linearLayout3;
            linearLayout3.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(i21, mdVar.G, null);
            mdVar.L.addView(mdVar.G, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            mdVar.R = j6Var;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(false);
            int i22 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i22);
            j6Var.setBackground(M0);
            org.telegram.ui.ActionBar.r6.k(j6Var, M0, null, O, null);
            Boolean bool = mdVar.l0;
            if (bool != null && !bool.booleanValue()) {
                mdVar.b0 = true;
            }
            if (mdVar.J) {
                i10 = 1;
                mdVar.R.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !mdVar.b0);
            } else {
                i10 = 1;
                mdVar.R.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !mdVar.b0);
            }
            mdVar.R.setOnClickListener(new ed(mdVar, i15));
            if (bool == null || bool.booleanValue()) {
                mdVar.G.addView(mdVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            mdVar.S = j6Var2;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(false);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i22);
            j6Var2.setBackground(M02);
            org.telegram.ui.ActionBar.r6.k(j6Var2, M02, null, O2, null);
            if (bool != null && bool.booleanValue()) {
                mdVar.b0 = false;
            }
            if (mdVar.J) {
                mdVar.S.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, mdVar.b0);
            } else {
                mdVar.S.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, mdVar.b0);
            }
            mdVar.S.setOnClickListener(new ed(mdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                mdVar.G.addView(mdVar.S, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            mdVar.e = b7Var;
            mdVar.L.addView(b7Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            mdVar.N = linearLayout4;
            linearLayout4.setOrientation(i10);
            org.telegram.ui.ActionBar.r6.i(i21, mdVar.N, null);
            mdVar.L.addView(mdVar.N, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
            mdVar.W = l4Var3;
            mdVar.N.addView(l4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            mdVar.O = linearLayout5;
            linearLayout5.setOrientation(0);
            mdVar.N.addView(mdVar.O, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            mdVar.I = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/");
            mdVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = mdVar.I;
            int i23 = org.telegram.ui.ActionBar.k6.H6;
            org.telegram.ui.ActionBar.r6.F(editTextBoldCursor4, i23, null);
            EditTextBoldCursor editTextBoldCursor5 = mdVar.I;
            int i24 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor5, i24, null);
            mdVar.I.setMaxLines(1);
            mdVar.I.setLines(1);
            mdVar.I.setEnabled(false);
            mdVar.I.setBackgroundDrawable(null);
            mdVar.I.setPadding(0, 0, 0, 0);
            mdVar.I.setSingleLine(true);
            mdVar.I.setInputType(163840);
            mdVar.I.setImeOptions(6);
            mdVar.O.addView(mdVar.I, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            mdVar.x = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.F(mdVar.x, i23, null);
            org.telegram.ui.ActionBar.r6.W(mdVar.x, i24, null);
            mdVar.x.setMaxLines(1);
            mdVar.x.setLines(1);
            mdVar.x.setBackgroundDrawable(null);
            mdVar.x.setPadding(0, 0, 0, 0);
            mdVar.x.setSingleLine(true);
            mdVar.x.setInputType(163872);
            mdVar.x.setImeOptions(6);
            mdVar.x.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            org.telegram.ui.ActionBar.r6.x(mdVar.x, i24, null);
            mdVar.x.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.x.setCursorWidth(1.5f);
            mdVar.O.addView(mdVar.x, w7.z5.n(-1, 36));
            mdVar.x.addTextChangedListener(new n0(mdVar, 1));
            LinearLayout linearLayout6 = new LinearLayout(context);
            mdVar.P = linearLayout6;
            linearLayout6.setOrientation(1);
            mdVar.N.addView(mdVar.P, w7.z5.n(-1, -2));
            org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, mdVar, null, true, ChatObject.isChannel(mdVar.getMessagesController().getChat(Long.valueOf(j10))));
            mdVar.Q = r90Var;
            r90Var.b(true);
            mdVar.Q.d(0, null, false);
            mdVar.P.addView(mdVar.Q);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(mdVar, context, 3);
            mdVar.V = x1Var;
            org.telegram.ui.ActionBar.r6.I(x1Var, org.telegram.ui.ActionBar.k6.J6, null);
            org.telegram.ui.ActionBar.r6.E(mdVar.V, org.telegram.ui.ActionBar.k6.K6, null);
            mdVar.V.setTextSize(1, 15.0f);
            mdVar.V.setGravity(LocaleController.isRTL ? 5 : 3);
            mdVar.V.setVisibility(8);
            mdVar.V.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            mdVar.N.addView(mdVar.V, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            mdVar.T = e9Var;
            int i25 = R.drawable.greydivider_bottom;
            int i26 = org.telegram.ui.ActionBar.k6.b7;
            org.telegram.ui.ActionBar.r6.b0(i25, i26, context, e9Var, null);
            mdVar.L.addView(mdVar.T, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            mdVar.h0 = r4Var;
            mdVar.L.addView(r4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            mdVar.M = linearLayout7;
            org.telegram.ui.ActionBar.r6.i(i21, linearLayout7, null);
            mdVar.M.setOrientation(1);
            mdVar.L.addView(mdVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            mdVar.f0 = e9Var2;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i26, context, e9Var2, null);
            mdVar.L.addView(mdVar.f0, w7.z5.n(-1, -2));
            mdVar.i0();
        }
        return mdVar.fragmentView;
    }

    public final void d0() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false) + ((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false) + (org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x02 == this.y0) {
            return;
        }
        this.y0 = x02;
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.M.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                    nVar.d.k(nVar.n, nVar.f);
                    nVar.a.invalidate();
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.c2 c2Var = this.v0;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
                    this.v0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            h0(false);
            this.s0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.c2 c2Var2 = this.v0;
            if (c2Var2 != null) {
                try {
                    c2Var2.dismiss();
                    this.v0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.m0, this.n0, this.o0, this.q0, this.p0, this.y, this.E, null);
            }
            md mdVar = new md(bundle);
            mdVar.u0 = this.u0;
            presentFragment(mdVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var == null || !e50Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.w;
        return (e50Var == null || dialog != e50Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(String str) {
        if (str == null || str.length() <= 0) {
            this.V.setVisibility(8);
        } else {
            this.V.setVisibility(0);
        }
        h0 h0Var = this.Z;
        if (h0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.a0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var = this.V;
                int i10 = org.telegram.ui.ActionBar.k6.p7;
                x1Var.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.r6.W(this.V, i10, null);
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.V.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.x1 x1Var2 = this.V;
                    int i12 = org.telegram.ui.ActionBar.k6.p7;
                    x1Var2.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.r6.W(this.V, i12, null);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.x1 x1Var3 = this.V;
                    int i13 = org.telegram.ui.ActionBar.k6.p7;
                    x1Var3.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.r6.W(this.V, i13, null);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.V.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.x1 x1Var4 = this.V;
            int i14 = org.telegram.ui.ActionBar.k6.p7;
            x1Var4.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.r6.W(this.V, i14, null);
            return false;
        }
        if (str.length() > 32) {
            this.V.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.x1 x1Var5 = this.V;
            int i15 = org.telegram.ui.ActionBar.k6.p7;
            x1Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.r6.W(this.V, i15, null);
            return false;
        }
        this.V.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.x1 x1Var6 = this.V;
        int i16 = org.telegram.ui.ActionBar.k6.F6;
        x1Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.W(this.V, i16, null);
        this.Y = str;
        h0 h0Var2 = new h0(18, this, str);
        this.Z = h0Var2;
        AndroidUtilities.runOnUIThread(h0Var2, 300L);
        return true;
    }

    public final void f0(boolean z10, boolean z11) {
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
            jd jdVar = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, (Property<jd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<kd, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            jd jdVar2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, (Property<jd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<kd, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new ah.p0(28, this, z10));
        this.r.start();
    }

    public final void g0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = true;
        j0Var.H0 = new cd(this, 1);
        showDialog(j0Var);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ mu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.qu quVar = this.d;
        int i10 = org.telegram.ui.ActionBar.k6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(quVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Components.qu quVar2 = this.d;
        int i11 = org.telegram.ui.ActionBar.k6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(quVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.x, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.x, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.b7));
        LinearLayout linearLayout = this.P;
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        return arrayList;
    }

    public final void h0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.w0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z10 ? 1.0f : 0.0f);
            this.x0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 4));
            this.x0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.x0.setInterpolator(org.telegram.ui.Components.bs.f);
            this.x0.start();
        }
    }

    public final void i0() {
        if (this.e == null) {
            return;
        }
        int i10 = 8;
        if (this.b0 || this.k0) {
            org.telegram.ui.Cells.e9 e9Var = this.T;
            int i11 = org.telegram.ui.ActionBar.k6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.r6.W(this.T.getTextView(), i11, null);
            this.e.setVisibility(0);
            this.f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var2 = this.T;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, e9Var2.getContext(), e9Var2, null);
            this.N.setVisibility(0);
            this.h0.setVisibility(8);
            if (this.J) {
                this.T.setText(LocaleController.getString(this.b0 ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.W.setText(LocaleController.getString(this.b0 ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.T.setText(LocaleController.getString(this.b0 ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.W.setText(LocaleController.getString(this.b0 ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.O.setVisibility(this.b0 ? 8 : 0);
            this.P.setVisibility(this.b0 ? 0 : 8);
            this.N.setPadding(0, 0, 0, this.b0 ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.r90 r90Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.d0;
            r90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.x1 x1Var = this.V;
            if (!this.b0 && x1Var.length() != 0) {
                i10 = 0;
            }
            x1Var.setVisibility(i10);
        } else {
            this.T.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var3 = this.T;
            int i12 = org.telegram.ui.ActionBar.k6.p7;
            e9Var3.setTag(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.r6.W(this.T.getTextView(), i12, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = this.T;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, e9Var4.getContext(), e9Var4, null);
                this.f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var5 = this.T;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7, e9Var5.getContext(), e9Var5, null);
                this.h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f0.setVisibility(0);
            }
        }
        this.R.a(!this.b0);
        this.S.a(this.b0);
        this.x.clearFocus();
        AndroidUtilities.hideKeyboard(this.x);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var != null) {
            e50Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.d;
        if (quVar == null || !quVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        quVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.i0 == 1 && !this.c0 && this.d0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.j0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.d0 = chatFull.exported_invite;
            }
            if (this.d0 == null) {
                this.c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var != null) {
            e50Var.a = this;
            e50Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.t0.intValue(), true);
            this.t0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var != null) {
            e50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.qu quVar = this.d;
        if (quVar != null) {
            quVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qu quVar = this.d;
        if (quVar != null) {
            quVar.r();
        }
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var != null) {
            e50Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var != null) {
            e50Var.j(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.qu quVar = this.d;
        if (quVar != null) {
            quVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.e50 e50Var = this.w;
        if (e50Var != null) {
            e50Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.Components.eq eqVar = this.c;
            if (eqVar != null) {
                eqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v8, false));
            }
            org.telegram.ui.Cells.r4 r4Var = this.h0;
            if (r4Var == null || r4Var.getChildCount() <= 0 || !(this.h0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.i0 == 1) {
            return;
        }
        this.d.requestFocus();
        org.telegram.ui.Components.lu luVar = this.d.a;
        luVar.requestFocus();
        AndroidUtilities.showKeyboard(luVar);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.i0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.w;
            if (e50Var != null) {
                e50Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.qu quVar = this.d;
                if (quVar != null) {
                    quVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.i0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.w;
            if (e50Var != null && (str = e50Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.qu quVar = this.d;
            if (quVar != null) {
                String obj = quVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
