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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.hj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.f90 P;
    public org.telegram.ui.Cells.k6 Q;
    public org.telegram.ui.Cells.k6 R;
    public org.telegram.ui.Cells.f9 S;
    public TextView T;
    public org.telegram.ui.Cells.x1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public n Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.w0 a;
    public boolean a0;
    public org.telegram.ui.Components.vr b;
    public boolean b0;
    public org.telegram.ui.Components.nu c;
    public TLRPC.TL_chatInviteExported c0;
    public org.telegram.ui.Cells.c7 d;
    public boolean d0;
    public gg.i1 e;
    public org.telegram.ui.Cells.f9 e0;
    public bi.s7 f;
    public final ArrayList f0;
    public org.telegram.ui.Cells.s4 g0;
    public kd h;
    public final int h0;
    public final long i0;
    public boolean j0;
    public final Boolean k0;
    public TLRPC.InputFile l0;
    public TLRPC.InputFile m0;
    public AnimatorSet n;
    public TLRPC.VideoSize n0;
    public String o0;
    public double p0;
    public boolean q0;
    public ld r;
    public boolean r0;
    public final org.telegram.ui.Components.g9 s;
    public Integer s0;
    public Utilities.Callback2 t0;
    public org.telegram.ui.ActionBar.d2 u0;
    public final org.telegram.ui.Components.e50 v;
    public final ed v0;
    public EditTextBoldCursor w;
    public ValueAnimator w0;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public nd(Bundle bundle) {
        super(bundle);
        this.f0 = new ArrayList();
        this.j0 = true;
        this.v0 = new ed(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            this.v = new org.telegram.ui.Components.e50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.j0 = z10;
            this.a0 = !z10;
            if (!z10 && !this.d0) {
                this.d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.i0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(nd ndVar, org.telegram.ui.ActionBar.d2 d2Var) {
        ndVar.r0 = false;
        ndVar.q0 = false;
        if (ndVar.s0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.s0.intValue(), true);
            ndVar.s0 = null;
        }
        ndVar.g0(false);
        d2Var.dismiss();
    }

    public static /* synthetic */ void V(nd ndVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(ndVar, 1), 64);
    }

    public static /* synthetic */ void W(nd ndVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.i0);
        ndVar.W = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.R = string;
        if (currentChannel.megagroup) {
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bi.cb(29, ndVar, currentChannel));
        ndVar.showDialog(d2Var);
    }

    public static void Y(nd ndVar) {
        if (ndVar.u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new a1(ndVar, 12));
        ndVar.u0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.d50
    public final void C(float f7) {
        ld ldVar = this.r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        ld ldVar = this.r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ei.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        final nd ndVar = this;
        org.telegram.ui.Components.nu nuVar = ndVar.c;
        if (nuVar != null) {
            nuVar.o();
        }
        ndVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        ndVar.actionBar.setAllowOverlayTitle(true);
        ndVar.actionBar.setActionBarMenuOnItemClick(new id(ndVar));
        org.telegram.ui.ActionBar.z n10 = ndVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(mutate, new org.telegram.ui.Components.zp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        ndVar.b = vrVar;
        ndVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), vrVar);
        int i13 = 2;
        int i14 = ndVar.h0;
        if (i14 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(i12, context, ndVar);
            jdVar.setOnTouchListener(new ai.h(i13));
            ndVar.fragmentView = jdVar;
            int i15 = org.telegram.ui.ActionBar.j6.d6;
            jdVar.setTag(Integer.valueOf(i15));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.K = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.K.addView(frameLayout, w7.a6.n(-1, -2));
            gg.i1 i1Var = new gg.i1(ndVar, context, 4);
            ndVar.e = i1Var;
            i1Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.g9 g9Var = ndVar.s;
            g9Var.n(5L, null, null);
            ndVar.e.setImageDrawable(g9Var);
            gg.i1 i1Var2 = ndVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(i1Var2, w7.a6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            bi.s7 s7Var = new bi.s7(ndVar, context, paint, i13);
            ndVar.f = s7Var;
            s7Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            bi.s7 s7Var2 = ndVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(s7Var2, w7.a6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            ndVar.f.setOnClickListener(new fd(ndVar, i10));
            ndVar.J = new org.telegram.ui.Components.hj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            kd kdVar = new kd(ndVar, context, 0);
            ndVar.h = kdVar;
            kdVar.setScaleType(ImageView.ScaleType.CENTER);
            ndVar.h.setAnimation(ndVar.J);
            ndVar.h.setEnabled(false);
            ndVar.h.setClickable(false);
            ndVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            kd kdVar2 = ndVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(kdVar2, w7.a6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            ld ldVar = new ld(ndVar, context, i12);
            ndVar.r = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.r.setProgressColor(-1);
            ndVar.r.setNoProgress(false);
            ld ldVar2 = ndVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(ldVar2, w7.a6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            ndVar.e0(false, false);
            org.telegram.ui.Components.nu nuVar2 = new org.telegram.ui.Components.nu(context, jdVar, ndVar, 0, false, null);
            ndVar = ndVar;
            ndVar.c = nuVar2;
            nuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.E;
            if (str != null) {
                ndVar.c.setText(str);
                ndVar.E = null;
            }
            ndVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ndVar.c.getEditText().setSingleLine(true);
            ndVar.c.getEditText().setImeOptions(5);
            ndVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) { // from class: org.telegram.ui.gd
                public final /* synthetic */ nd b;

                {
                    this.b = ndVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i12) {
                        case 0:
                            nd ndVar2 = this.b;
                            if (i16 != 5) {
                                ndVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(ndVar2.c.getEditText().getText())) {
                                ndVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i16 == 6 && (w0Var = this.b.a) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.nu nuVar3 = ndVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(nuVar3, w7.a6.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ndVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ndVar.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ndVar.w;
            int i16 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            ndVar.w.setBackgroundDrawable(null);
            ndVar.w.setLineColors(ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.k6), ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.l6), ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            ndVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            ndVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.w.setInputType(180225);
            ndVar.w.setImeOptions(6);
            ndVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ndVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ndVar.w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            ndVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.w.setCursorWidth(1.5f);
            ndVar.K.addView(ndVar.w, w7.a6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ndVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) { // from class: org.telegram.ui.gd
                public final /* synthetic */ nd b;

                {
                    this.b = ndVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i162, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i10) {
                        case 0:
                            nd ndVar2 = this.b;
                            if (i162 != 5) {
                                ndVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(ndVar2.c.getEditText().getText())) {
                                ndVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i162 == 6 && (w0Var = this.b.a) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            ndVar.w.addTextChangedListener(new md(0));
            TextView textView = new TextView(context);
            ndVar.T = textView;
            textView.setTextSize(1, 15.0f);
            ndVar.T.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
            ndVar.T.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            ndVar.K.addView(ndVar.T, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i14 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            ndVar.K = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(ndVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j3 = ndVar.i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            ndVar.I = z15;
            ndVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = ndVar.fragmentView;
            int i17 = org.telegram.ui.ActionBar.j6.a7;
            view.setTag(Integer.valueOf(i17));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ndVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ndVar.G;
            int i18 = org.telegram.ui.ActionBar.j6.d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.G.setText(LocaleController.getString(ndVar.I ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            ndVar.K.addView(ndVar.G);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.F = linearLayout3;
            linearLayout3.setOrientation(1);
            ndVar.F.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.K.addView(ndVar.F, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, false);
            ndVar.Q = k6Var;
            k6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            Boolean bool = ndVar.k0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.a0 = true;
            }
            if (ndVar.I) {
                ndVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.a0);
            } else {
                ndVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.a0);
            }
            ndVar.Q.setOnClickListener(new fd(ndVar, i13));
            if (bool == null || bool.booleanValue()) {
                ndVar.F.addView(ndVar.Q, w7.a6.n(-1, -2));
            }
            org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, false);
            ndVar.R = k6Var2;
            k6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ndVar.a0 = false;
            }
            if (ndVar.I) {
                ndVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.a0);
            } else {
                ndVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.a0);
            }
            ndVar.R.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.F.addView(ndVar.R, w7.a6.n(-1, -2));
            }
            org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            ndVar.d = c7Var;
            ndVar.K.addView(c7Var, w7.a6.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            ndVar.M = linearLayout4;
            linearLayout4.setOrientation(1);
            ndVar.M.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.K.addView(ndVar.M, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
            ndVar.V = m4Var3;
            ndVar.M.addView(m4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.N = linearLayout5;
            linearLayout5.setOrientation(0);
            ndVar.M.addView(ndVar.N, w7.a6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            ndVar.H = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = ndVar.H;
            int i19 = org.telegram.ui.ActionBar.j6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            EditTextBoldCursor editTextBoldCursor5 = ndVar.H;
            int i20 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            ndVar.H.setMaxLines(1);
            ndVar.H.setLines(1);
            ndVar.H.setEnabled(false);
            ndVar.H.setBackgroundDrawable(null);
            ndVar.H.setPadding(0, 0, 0, 0);
            ndVar.H.setSingleLine(true);
            ndVar.H.setInputType(163840);
            ndVar.H.setImeOptions(6);
            ndVar.N.addView(ndVar.H, w7.a6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            ndVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            ndVar.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            ndVar.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            ndVar.w.setMaxLines(1);
            ndVar.w.setLines(1);
            ndVar.w.setBackgroundDrawable(null);
            ndVar.w.setPadding(0, 0, 0, 0);
            ndVar.w.setSingleLine(true);
            ndVar.w.setInputType(163872);
            ndVar.w.setImeOptions(6);
            ndVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ndVar.w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            ndVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.w.setCursorWidth(1.5f);
            ndVar.N.addView(ndVar.w, w7.a6.n(-1, 36));
            ndVar.w.addTextChangedListener(new m0(ndVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.O = linearLayout6;
            linearLayout6.setOrientation(1);
            ndVar.M.addView(ndVar.O, w7.a6.n(-1, -2));
            org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j3))));
            ndVar.P = f90Var;
            f90Var.b(true);
            ndVar.P.d(0, null, false);
            ndVar.O.addView(ndVar.P);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(ndVar, context, 3);
            ndVar.U = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            ndVar.U.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
            ndVar.U.setTextSize(1, 15.0f);
            ndVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.U.setVisibility(8);
            ndVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            ndVar.M.addView(ndVar.U, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            ndVar.S = f9Var;
            int i21 = R.drawable.greydivider_bottom;
            int i22 = org.telegram.ui.ActionBar.j6.b7;
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i21, i22));
            ndVar.K.addView(ndVar.S, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ndVar.g0 = s4Var;
            ndVar.K.addView(s4Var, w7.a6.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.L = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.L.setOrientation(1);
            ndVar.K.addView(ndVar.L, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
            ndVar.e0 = f9Var2;
            f9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i22));
            ndVar.K.addView(ndVar.e0, w7.a6.n(-1, -2));
            ndVar.h0();
        }
        return ndVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.U.setVisibility(8);
        } else {
            this.U.setVisibility(0);
        }
        n nVar = this.Y;
        if (nVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nVar);
            this.Y = null;
            this.X = null;
            if (this.W != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
            }
        }
        this.Z = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var = this.U;
                int i10 = org.telegram.ui.ActionBar.j6.p7;
                x1Var.setTag(Integer.valueOf(i10));
                this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.x1 x1Var2 = this.U;
                    int i12 = org.telegram.ui.ActionBar.j6.p7;
                    x1Var2.setTag(Integer.valueOf(i12));
                    this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.x1 x1Var3 = this.U;
                    int i13 = org.telegram.ui.ActionBar.j6.p7;
                    x1Var3.setTag(Integer.valueOf(i13));
                    this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.x1 x1Var4 = this.U;
            int i14 = org.telegram.ui.ActionBar.j6.p7;
            x1Var4.setTag(Integer.valueOf(i14));
            this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.x1 x1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.j6.p7;
            x1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            return false;
        }
        this.U.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.x1 x1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.j6.F6;
        x1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.X = str;
        n nVar2 = new n(19, this, str);
        this.Y = nVar2;
        AndroidUtilities.runOnUIThread(nVar2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.d2 d2Var = this.u0;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                    this.u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.r0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.d2 d2Var2 = this.u0;
            if (d2Var2 != null) {
                try {
                    d2Var2.dismiss();
                    this.u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.j0);
            Boolean bool = this.k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.l0 != null || this.m0 != null || this.n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.l0, this.m0, this.n0, this.p0, this.o0, this.x, this.y, null);
            }
            nd ndVar = new nd(bundle);
            ndVar.t0 = this.t0;
            presentFragment(ndVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var == null || !e50Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        return (e50Var == null || dialog != e50Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        if (!z11) {
            if (z10) {
                this.h.setAlpha(1.0f);
                this.h.setVisibility(4);
                this.r.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            }
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.r.setAlpha(0.0f);
            this.r.setVisibility(4);
            return;
        }
        this.n = new AnimatorSet();
        if (z10) {
            this.r.setVisibility(0);
            AnimatorSet animatorSet2 = this.n;
            kd kdVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<ld, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            kd kdVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, (Property<kd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<ld, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new ai.e(23, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        qg.k0 k0Var = new qg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.v0 = true;
        k0Var.H0 = new ed(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.v0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 4));
            this.w0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.w0.setInterpolator(org.telegram.ui.Components.wr.f);
            this.w0.start();
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ ev0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        org.telegram.ui.Components.nu nuVar = this.c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.nu nuVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.nu nuVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.nu nuVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.j6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.c7 c7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(c7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.x1 x1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(x1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.a0 || this.j0) {
            org.telegram.ui.Cells.f9 f9Var = this.S;
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            f9Var.setTag(Integer.valueOf(i11));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.f9 f9Var2 = this.S;
            f9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            this.M.setVisibility(0);
            this.g0.setVisibility(8);
            if (this.I) {
                this.S.setText(LocaleController.getString(this.a0 ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.V.setText(LocaleController.getString(this.a0 ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.S.setText(LocaleController.getString(this.a0 ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.V.setText(LocaleController.getString(this.a0 ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.N.setVisibility(this.a0 ? 8 : 0);
            this.O.setVisibility(this.a0 ? 0 : 8);
            this.M.setPadding(0, 0, 0, this.a0 ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.f90 f90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c0;
            f90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.x1 x1Var = this.U;
            if (!this.a0 && x1Var.length() != 0) {
                i10 = 0;
            }
            x1Var.setVisibility(i10);
        } else {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var3 = this.S;
            int i12 = org.telegram.ui.ActionBar.j6.p7;
            f9Var3.setTag(Integer.valueOf(i12));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.f9 f9Var4 = this.S;
                f9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                this.e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.f9 f9Var5 = this.S;
                f9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                this.g0.setVisibility(8);
                this.L.setVisibility(0);
                this.e0.setVisibility(0);
            }
        }
        this.Q.a(!this.a0);
        this.R.a(this.a0);
        this.w.clearFocus();
        AndroidUtilities.hideKeyboard(this.w);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.nu nuVar = this.c;
        if (nuVar == null || !nuVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        nuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.h0 == 1 && !this.b0 && this.c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.c0 = chatFull.exported_invite;
            }
            if (this.c0 == null) {
                this.b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.a = this;
            e50Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.s0.intValue(), true);
            this.s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.nu nuVar = this.c;
        if (nuVar != null) {
            nuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.nu nuVar = this.c;
        if (nuVar != null) {
            nuVar.r();
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.k(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.nu nuVar = this.c;
        if (nuVar != null) {
            nuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.h0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.iu iuVar = this.c.a;
        iuVar.requestFocus();
        AndroidUtilities.showKeyboard(iuVar);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null) {
                e50Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.nu nuVar = this.c;
                if (nuVar != null) {
                    nuVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null && (str = e50Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.nu nuVar = this.c;
            if (nuVar != null) {
                String obj = nuVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
