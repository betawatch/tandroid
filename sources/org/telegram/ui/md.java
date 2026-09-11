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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class md extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t40 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.l4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.xi0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.w80 P;
    public org.telegram.ui.Cells.i6 Q;
    public org.telegram.ui.Cells.i6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.x1 U;
    public org.telegram.ui.Cells.l4 V;
    public int W;
    public String X;
    public org.telegram.ui.ActionBar.c6 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.v0 a;
    public boolean a0;
    public org.telegram.ui.Components.or b;
    public boolean b0;
    public org.telegram.ui.Components.hu c;
    public TLRPC.TL_chatInviteExported c0;
    public org.telegram.ui.Cells.a7 d;
    public boolean d0;
    public bi.i5 e;
    public org.telegram.ui.Cells.e9 e0;
    public di.r6 f;
    public final ArrayList f0;
    public org.telegram.ui.Cells.r4 g0;
    public jd h;
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
    public kd r;
    public boolean r0;
    public final org.telegram.ui.Components.i9 s;
    public Integer s0;
    public Utilities.Callback2 t0;
    public org.telegram.ui.ActionBar.b2 u0;
    public final org.telegram.ui.Components.u40 v;
    public final dd v0;
    public EditTextBoldCursor w;
    public ValueAnimator w0;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public md(Bundle bundle) {
        super(bundle);
        this.f0 = new ArrayList();
        this.j0 = true;
        this.v0 = new dd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            this.v = new org.telegram.ui.Components.u40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new cd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.j0 = z10;
            this.a0 = !z10;
            if (!z10 && !this.d0) {
                this.d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new cd(this, 0));
            }
        }
        this.i0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(md mdVar, org.telegram.ui.ActionBar.b2 b2Var) {
        mdVar.r0 = false;
        mdVar.q0 = false;
        if (mdVar.s0 != null) {
            ConnectionsManager.getInstance(mdVar.currentAccount).cancelRequest(mdVar.s0.intValue(), true);
            mdVar.s0 = null;
        }
        mdVar.g0(false);
        b2Var.dismiss();
    }

    public static /* synthetic */ void V(md mdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_updateUsername, new cd(mdVar, 1), 64);
    }

    public static /* synthetic */ void W(md mdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(mdVar.currentAccount).getInputChannel(mdVar.i0);
        mdVar.W = ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(mdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(md mdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4(4, mdVar, currentChannel));
        mdVar.showDialog(b2Var);
    }

    public static void Y(md mdVar) {
        if (mdVar.u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new z0(mdVar, 12));
        mdVar.u0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.t40
    public final void C(float f7) {
        kd kdVar = this.r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
        kd kdVar = this.r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        final md mdVar = this;
        org.telegram.ui.Components.hu huVar = mdVar.c;
        if (huVar != null) {
            huVar.o();
        }
        mdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        mdVar.actionBar.setAllowOverlayTitle(true);
        mdVar.actionBar.setActionBarMenuOnItemClick(new hd(mdVar));
        org.telegram.ui.ActionBar.z n10 = mdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.sp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        mdVar.b = orVar;
        mdVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        int i13 = 2;
        int i14 = 5;
        int i15 = mdVar.h0;
        if (i15 == 0) {
            mdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            id idVar = new id(i12, context, mdVar);
            idVar.setOnTouchListener(new ci.d(i13));
            mdVar.fragmentView = idVar;
            int i16 = org.telegram.ui.ActionBar.j6.d6;
            idVar.setTag(Integer.valueOf(i16));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            LinearLayout linearLayout = new LinearLayout(context);
            mdVar.K = linearLayout;
            linearLayout.setOrientation(1);
            idVar.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            mdVar.K.addView(frameLayout, w7.x5.n(-1, -2));
            bi.i5 i5Var = new bi.i5(mdVar, context, i14);
            mdVar.e = i5Var;
            i5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.i9 i9Var = mdVar.s;
            i9Var.n(5L, null, null);
            mdVar.e.setImageDrawable(i9Var);
            bi.i5 i5Var2 = mdVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(i5Var2, w7.x5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            di.r6 r6Var = new di.r6(mdVar, context, paint, i13);
            mdVar.f = r6Var;
            r6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            di.r6 r6Var2 = mdVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(r6Var2, w7.x5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            mdVar.f.setOnClickListener(new ed(mdVar, i10));
            mdVar.J = new org.telegram.ui.Components.xi0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            jd jdVar = new jd(mdVar, context, 0);
            mdVar.h = jdVar;
            jdVar.setScaleType(ImageView.ScaleType.CENTER);
            mdVar.h.setAnimation(mdVar.J);
            mdVar.h.setEnabled(false);
            mdVar.h.setClickable(false);
            mdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            jd jdVar2 = mdVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(jdVar2, w7.x5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            kd kdVar = new kd(mdVar, context, i12);
            mdVar.r = kdVar;
            kdVar.setSize(AndroidUtilities.dp(30.0f));
            mdVar.r.setProgressColor(-1);
            mdVar.r.setNoProgress(false);
            kd kdVar2 = mdVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(kdVar2, w7.x5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            mdVar.e0(false, false);
            org.telegram.ui.Components.hu huVar2 = new org.telegram.ui.Components.hu(context, idVar, this, 0, false, null);
            mdVar = this;
            mdVar.c = huVar2;
            huVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = mdVar.E;
            if (str != null) {
                mdVar.c.setText(str);
                mdVar.E = null;
            }
            mdVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            mdVar.c.getEditText().setSingleLine(true);
            mdVar.c.getEditText().setImeOptions(5);
            mdVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) { // from class: org.telegram.ui.fd
                public final /* synthetic */ md b;

                {
                    this.b = mdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i12) {
                        case 0:
                            md mdVar2 = this.b;
                            if (i17 != 5) {
                                mdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(mdVar2.c.getEditText().getText())) {
                                mdVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i17 == 6 && (v0Var = this.b.a) != null) {
                                v0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.hu huVar3 = mdVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(huVar3, w7.x5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            mdVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            mdVar.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = mdVar.w;
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            mdVar.w.setBackgroundDrawable(null);
            mdVar.w.setLineColors(mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.k6), mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.l6), mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            mdVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            mdVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            mdVar.w.setInputType(180225);
            mdVar.w.setImeOptions(6);
            mdVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            mdVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            mdVar.w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            mdVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.w.setCursorWidth(1.5f);
            mdVar.K.addView(mdVar.w, w7.x5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            mdVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) { // from class: org.telegram.ui.fd
                public final /* synthetic */ md b;

                {
                    this.b = mdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i10) {
                        case 0:
                            md mdVar2 = this.b;
                            if (i172 != 5) {
                                mdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(mdVar2.c.getEditText().getText())) {
                                mdVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i172 == 6 && (v0Var = this.b.a) != null) {
                                v0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            mdVar.w.addTextChangedListener(new ld(0));
            TextView textView = new TextView(context);
            mdVar.T = textView;
            textView.setTextSize(1, 15.0f);
            mdVar.T.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
            mdVar.T.setGravity(LocaleController.isRTL ? 5 : 3);
            mdVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            mdVar.K.addView(mdVar.T, w7.x5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            mdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            mdVar.K = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = mdVar.getMessagesController();
            long j3 = mdVar.i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            mdVar.I = z15;
            mdVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = mdVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.j6.a7;
            view.setTag(Integer.valueOf(i18));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            mdVar.G = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = mdVar.G;
            int i19 = org.telegram.ui.ActionBar.j6.d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            mdVar.G.setText(LocaleController.getString(mdVar.I ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            mdVar.K.addView(mdVar.G);
            LinearLayout linearLayout3 = new LinearLayout(context);
            mdVar.F = linearLayout3;
            linearLayout3.setOrientation(1);
            mdVar.F.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            mdVar.K.addView(mdVar.F, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            mdVar.Q = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            Boolean bool = mdVar.k0;
            if (bool != null && !bool.booleanValue()) {
                mdVar.a0 = true;
            }
            if (mdVar.I) {
                mdVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !mdVar.a0);
            } else {
                mdVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !mdVar.a0);
            }
            mdVar.Q.setOnClickListener(new ed(mdVar, i13));
            if (bool == null || bool.booleanValue()) {
                mdVar.F.addView(mdVar.Q, w7.x5.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            mdVar.R = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (bool != null && bool.booleanValue()) {
                mdVar.a0 = false;
            }
            if (mdVar.I) {
                mdVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, mdVar.a0);
            } else {
                mdVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, mdVar.a0);
            }
            mdVar.R.setOnClickListener(new ed(mdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                mdVar.F.addView(mdVar.R, w7.x5.n(-1, -2));
            }
            org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            mdVar.d = a7Var;
            mdVar.K.addView(a7Var, w7.x5.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            mdVar.M = linearLayout4;
            linearLayout4.setOrientation(1);
            mdVar.M.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            mdVar.K.addView(mdVar.M, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
            mdVar.V = l4Var3;
            mdVar.M.addView(l4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            mdVar.N = linearLayout5;
            linearLayout5.setOrientation(0);
            mdVar.M.addView(mdVar.N, w7.x5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            mdVar.H = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/");
            mdVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = mdVar.H;
            int i20 = org.telegram.ui.ActionBar.j6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            EditTextBoldCursor editTextBoldCursor5 = mdVar.H;
            int i21 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            mdVar.H.setMaxLines(1);
            mdVar.H.setLines(1);
            mdVar.H.setEnabled(false);
            mdVar.H.setBackgroundDrawable(null);
            mdVar.H.setPadding(0, 0, 0, 0);
            mdVar.H.setSingleLine(true);
            mdVar.H.setInputType(163840);
            mdVar.H.setImeOptions(6);
            mdVar.N.addView(mdVar.H, w7.x5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            mdVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            mdVar.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            mdVar.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            mdVar.w.setMaxLines(1);
            mdVar.w.setLines(1);
            mdVar.w.setBackgroundDrawable(null);
            mdVar.w.setPadding(0, 0, 0, 0);
            mdVar.w.setSingleLine(true);
            mdVar.w.setInputType(163872);
            mdVar.w.setImeOptions(6);
            mdVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            mdVar.w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            mdVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.w.setCursorWidth(1.5f);
            mdVar.N.addView(mdVar.w, w7.x5.n(-1, 36));
            mdVar.w.addTextChangedListener(new l0(mdVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            mdVar.O = linearLayout6;
            linearLayout6.setOrientation(1);
            mdVar.M.addView(mdVar.O, w7.x5.n(-1, -2));
            org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context, mdVar, null, true, ChatObject.isChannel(mdVar.getMessagesController().getChat(Long.valueOf(j3))));
            mdVar.P = w80Var;
            w80Var.b(true);
            mdVar.P.d(0, null, false);
            mdVar.O.addView(mdVar.P);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(mdVar, context, 3);
            mdVar.U = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            mdVar.U.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
            mdVar.U.setTextSize(1, 15.0f);
            mdVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            mdVar.U.setVisibility(8);
            mdVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            mdVar.M.addView(mdVar.U, w7.x5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            mdVar.S = e9Var;
            int i22 = R.drawable.greydivider_bottom;
            int i23 = org.telegram.ui.ActionBar.j6.b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i22, i23));
            mdVar.K.addView(mdVar.S, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            mdVar.g0 = r4Var;
            mdVar.K.addView(r4Var, w7.x5.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            mdVar.L = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            mdVar.L.setOrientation(1);
            mdVar.K.addView(mdVar.L, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            mdVar.e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i23));
            mdVar.K.addView(mdVar.e0, w7.x5.n(-1, -2));
            mdVar.h0();
        }
        return mdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.U.setVisibility(8);
        } else {
            this.U.setVisibility(0);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.Y;
        if (c6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c6Var);
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
        org.telegram.ui.ActionBar.c6 c6Var2 = new org.telegram.ui.ActionBar.c6(22, this, str);
        this.Y = c6Var2;
        AndroidUtilities.runOnUIThread(c6Var2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            g0(false);
            this.r0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.u0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            md mdVar = new md(bundle);
            mdVar.t0 = this.t0;
            presentFragment(mdVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var == null || !u40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.u40 u40Var = this.v;
        return (u40Var == null || dialog != u40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.t40
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
            jd jdVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, (Property<jd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<kd, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            jd jdVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, (Property<jd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<kd, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new ah.q0(28, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.v0 = true;
        k0Var.H0 = new dd(this, 0);
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
            ofFloat.addUpdateListener(new c3(this, 4));
            this.w0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.w0.setInterpolator(org.telegram.ui.Components.pr.f);
            this.w0.start();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ cv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        org.telegram.ui.Components.hu huVar = this.c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(huVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.hu huVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(huVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.hu huVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(huVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.hu huVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(huVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.j6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.a7 a7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(a7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.x1 x1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(x1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
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
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var2 = this.S;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
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
            org.telegram.ui.Components.w80 w80Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c0;
            w80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.x1 x1Var = this.U;
            if (!this.a0 && x1Var.length() != 0) {
                i10 = 0;
            }
            x1Var.setVisibility(i10);
        } else {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var3 = this.S;
            int i12 = org.telegram.ui.ActionBar.j6.p7;
            e9Var3.setTag(Integer.valueOf(i12));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = this.S;
                e9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(e9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                this.e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var5 = this.S;
                e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(e9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.hu huVar = this.c;
        if (huVar == null || !huVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        huVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new cd(this, 3));
            }
        }
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.a = this;
            u40Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.s0.intValue(), true);
            this.s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.hu huVar = this.c;
        if (huVar != null) {
            huVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.hu huVar = this.c;
        if (huVar != null) {
            huVar.r();
        }
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.k(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.hu huVar = this.c;
        if (huVar != null) {
            huVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.h0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.cu cuVar = this.c.a;
        cuVar.requestFocus();
        AndroidUtilities.showKeyboard(cuVar);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.h0 == 0) {
            org.telegram.ui.Components.u40 u40Var = this.v;
            if (u40Var != null) {
                u40Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.hu huVar = this.c;
                if (huVar != null) {
                    huVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.h0 == 0) {
            org.telegram.ui.Components.u40 u40Var = this.v;
            if (u40Var != null && (str = u40Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.hu huVar = this.c;
            if (huVar != null) {
                String obj = huVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }
}
