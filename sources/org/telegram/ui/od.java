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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class od extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.l4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.uj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.q90 P;
    public org.telegram.ui.Cells.i6 Q;
    public org.telegram.ui.Cells.i6 R;
    public org.telegram.ui.Cells.d9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.l4 V;
    public int W;
    public String X;
    public i0 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.u0 a;
    public boolean a0;
    public org.telegram.ui.Components.as b;
    public boolean b0;
    public org.telegram.ui.Components.qu c;
    public TLRPC.TL_chatInviteExported c0;
    public org.telegram.ui.Cells.z6 d;
    public boolean d0;
    public ci.k4 e;
    public org.telegram.ui.Cells.d9 e0;
    public ei.g6 f;
    public final ArrayList f0;
    public org.telegram.ui.Cells.r4 g0;
    public ld h;
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
    public md r;
    public boolean r0;
    public final org.telegram.ui.Components.h9 s;
    public Integer s0;
    public Utilities.Callback2 t0;
    public org.telegram.ui.ActionBar.b2 u0;
    public final org.telegram.ui.Components.e50 v;
    public final fd v0;
    public EditTextBoldCursor w;
    public ValueAnimator w0;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public od(Bundle bundle) {
        super(bundle);
        this.f0 = new ArrayList();
        this.j0 = true;
        this.v0 = new fd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            this.v = new org.telegram.ui.Components.e50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new ed(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.j0 = z10;
            this.a0 = !z10;
            if (!z10 && !this.d0) {
                this.d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ed(this, 0));
            }
        }
        this.i0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(od odVar, org.telegram.ui.ActionBar.b2 b2Var) {
        odVar.r0 = false;
        odVar.q0 = false;
        if (odVar.s0 != null) {
            ConnectionsManager.getInstance(odVar.currentAccount).cancelRequest(odVar.s0.intValue(), true);
            odVar.s0 = null;
        }
        odVar.g0(false);
        b2Var.dismiss();
    }

    public static /* synthetic */ void V(od odVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(odVar.currentAccount).sendRequest(tL_channels_updateUsername, new ed(odVar, 1), 64);
    }

    public static /* synthetic */ void W(od odVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(odVar.currentAccount).getInputChannel(odVar.i0);
        odVar.W = ConnectionsManager.getInstance(odVar.currentAccount).sendRequest(tL_channels_checkUsername, new ea(odVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(od odVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(odVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(odVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(odVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(10, odVar, currentChannel));
        odVar.showDialog(b2Var);
    }

    public static void Y(od odVar) {
        if (odVar.u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(odVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new b1(odVar, 12));
        odVar.u0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.d50
    public final void F(float f7) {
        md mdVar = this.r;
        if (mdVar == null) {
            return;
        }
        mdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void J(boolean z10, boolean z11) {
        md mdVar = this.r;
        if (mdVar == null) {
            return;
        }
        mdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        final od odVar = this;
        org.telegram.ui.Components.qu quVar = odVar.c;
        if (quVar != null) {
            quVar.o();
        }
        odVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        odVar.actionBar.setAllowOverlayTitle(true);
        odVar.actionBar.setActionBarMenuOnItemClick(new jd(odVar));
        org.telegram.ui.ActionBar.y n10 = odVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.h6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        odVar.b = asVar;
        odVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        int i13 = 2;
        int i14 = 5;
        int i15 = odVar.h0;
        if (i15 == 0) {
            odVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            kd kdVar = new kd(i12, context, odVar);
            kdVar.setOnTouchListener(new di.d(i13));
            odVar.fragmentView = kdVar;
            int i16 = org.telegram.ui.ActionBar.h6.d6;
            kdVar.setTag(Integer.valueOf(i16));
            odVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            LinearLayout linearLayout = new LinearLayout(context);
            odVar.K = linearLayout;
            linearLayout.setOrientation(1);
            kdVar.addView(odVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            odVar.K.addView(frameLayout, w7.z5.n(-1, -2));
            ci.k4 k4Var = new ci.k4(odVar, context, i14);
            odVar.e = k4Var;
            k4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = odVar.s;
            h9Var.n(5L, null, null);
            odVar.e.setImageDrawable(h9Var);
            ci.k4 k4Var2 = odVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(k4Var2, w7.z5.a(64.0f, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f, 64, (z10 ? 5 : 3) | 48));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(odVar, context, paint, i13);
            odVar.f = g6Var;
            g6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ei.g6 g6Var2 = odVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(g6Var2, w7.z5.a(64.0f, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f, 64, (z11 ? 5 : 3) | 48));
            odVar.f.setOnClickListener(new gd(odVar, i10));
            odVar.J = new org.telegram.ui.Components.uj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            ld ldVar = new ld(odVar, context, 0);
            odVar.h = ldVar;
            ldVar.setScaleType(ImageView.ScaleType.CENTER);
            odVar.h.setAnimation(odVar.J);
            odVar.h.setEnabled(false);
            odVar.h.setClickable(false);
            odVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            ld ldVar2 = odVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(ldVar2, w7.z5.a(64.0f, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f, 64, (z12 ? 5 : 3) | 48));
            md mdVar = new md(odVar, context, i12);
            odVar.r = mdVar;
            mdVar.setSize(AndroidUtilities.dp(30.0f));
            odVar.r.setProgressColor(-1);
            odVar.r.setNoProgress(false);
            md mdVar2 = odVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(mdVar2, w7.z5.a(64.0f, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f, 64, (z13 ? 5 : 3) | 48));
            odVar.e0(false, false);
            org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, kdVar, this, 0, false, null);
            odVar = this;
            odVar.c = quVar2;
            quVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = odVar.E;
            if (str != null) {
                odVar.c.setText(str);
                odVar.E = null;
            }
            odVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            odVar.c.getEditText().setSingleLine(true);
            odVar.c.getEditText().setImeOptions(5);
            odVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(odVar) { // from class: org.telegram.ui.hd
                public final /* synthetic */ od b;

                {
                    this.b = odVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i12) {
                        case 0:
                            od odVar2 = this.b;
                            if (i17 != 5) {
                                odVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(odVar2.c.getEditText().getText())) {
                                odVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i17 == 6 && (u0Var = this.b.a) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.qu quVar3 = odVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(quVar3, w7.z5.a(-2.0f, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f, -1, 16));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            odVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            odVar.w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = odVar.w;
            int i17 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
            odVar.w.setBackgroundDrawable(null);
            odVar.w.setLineColors(odVar.getThemedColor(org.telegram.ui.ActionBar.h6.k6), odVar.getThemedColor(org.telegram.ui.ActionBar.h6.l6), odVar.getThemedColor(org.telegram.ui.ActionBar.h6.p7));
            odVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            odVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            odVar.w.setInputType(180225);
            odVar.w.setImeOptions(6);
            odVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            odVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            odVar.w.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
            odVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            odVar.w.setCursorWidth(1.5f);
            odVar.K.addView(odVar.w, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            odVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(odVar) { // from class: org.telegram.ui.hd
                public final /* synthetic */ od b;

                {
                    this.b = odVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i10) {
                        case 0:
                            od odVar2 = this.b;
                            if (i172 != 5) {
                                odVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(odVar2.c.getEditText().getText())) {
                                odVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i172 == 6 && (u0Var = this.b.a) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            odVar.w.addTextChangedListener(new nd(0));
            TextView textView = new TextView(context);
            odVar.T = textView;
            textView.setTextSize(1, 15.0f);
            odVar.T.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
            odVar.T.setGravity(LocaleController.isRTL ? 5 : 3);
            odVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            odVar.K.addView(odVar.T, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            odVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            odVar.K = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(odVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = odVar.getMessagesController();
            long j10 = odVar.i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            odVar.I = z15;
            odVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = odVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.h6.a7;
            view.setTag(Integer.valueOf(i18));
            odVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            odVar.G = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = odVar.G;
            int i19 = org.telegram.ui.ActionBar.h6.d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
            odVar.G.setText(LocaleController.getString(odVar.I ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            odVar.K.addView(odVar.G);
            LinearLayout linearLayout3 = new LinearLayout(context);
            odVar.F = linearLayout3;
            linearLayout3.setOrientation(1);
            odVar.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
            odVar.K.addView(odVar.F, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            odVar.Q = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            Boolean bool = odVar.k0;
            if (bool != null && !bool.booleanValue()) {
                odVar.a0 = true;
            }
            if (odVar.I) {
                odVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !odVar.a0);
            } else {
                odVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !odVar.a0);
            }
            odVar.Q.setOnClickListener(new gd(odVar, i13));
            if (bool == null || bool.booleanValue()) {
                odVar.F.addView(odVar.Q, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            odVar.R = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            if (bool != null && bool.booleanValue()) {
                odVar.a0 = false;
            }
            if (odVar.I) {
                odVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, odVar.a0);
            } else {
                odVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, odVar.a0);
            }
            odVar.R.setOnClickListener(new gd(odVar, 3));
            if (bool == null || !bool.booleanValue()) {
                odVar.F.addView(odVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            odVar.d = z6Var;
            odVar.K.addView(z6Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            odVar.M = linearLayout4;
            linearLayout4.setOrientation(1);
            odVar.M.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
            odVar.K.addView(odVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
            odVar.V = l4Var3;
            odVar.M.addView(l4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            odVar.N = linearLayout5;
            linearLayout5.setOrientation(0);
            odVar.M.addView(odVar.N, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            odVar.H = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(odVar.currentAccount).linkPrefix + "/");
            odVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = odVar.H;
            int i20 = org.telegram.ui.ActionBar.h6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            EditTextBoldCursor editTextBoldCursor5 = odVar.H;
            int i21 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
            odVar.H.setMaxLines(1);
            odVar.H.setLines(1);
            odVar.H.setEnabled(false);
            odVar.H.setBackgroundDrawable(null);
            odVar.H.setPadding(0, 0, 0, 0);
            odVar.H.setSingleLine(true);
            odVar.H.setInputType(163840);
            odVar.H.setImeOptions(6);
            odVar.N.addView(odVar.H, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            odVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            odVar.w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            odVar.w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
            odVar.w.setMaxLines(1);
            odVar.w.setLines(1);
            odVar.w.setBackgroundDrawable(null);
            odVar.w.setPadding(0, 0, 0, 0);
            odVar.w.setSingleLine(true);
            odVar.w.setInputType(163872);
            odVar.w.setImeOptions(6);
            odVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            odVar.w.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
            odVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            odVar.w.setCursorWidth(1.5f);
            odVar.N.addView(odVar.w, w7.z5.n(-1, 36));
            odVar.w.addTextChangedListener(new o0(odVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            odVar.O = linearLayout6;
            linearLayout6.setOrientation(1);
            odVar.M.addView(odVar.O, w7.z5.n(-1, -2));
            org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, odVar, null, true, ChatObject.isChannel(odVar.getMessagesController().getChat(Long.valueOf(j10))));
            odVar.P = q90Var;
            q90Var.b(true);
            odVar.P.d(0, null, false);
            odVar.O.addView(odVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(odVar, context, 3);
            odVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            odVar.U.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K6, false));
            odVar.U.setTextSize(1, 15.0f);
            odVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            odVar.U.setVisibility(8);
            odVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            odVar.M.addView(odVar.U, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            odVar.S = d9Var;
            int i22 = R.drawable.greydivider_bottom;
            int i23 = org.telegram.ui.ActionBar.h6.b7;
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i22, i23));
            odVar.K.addView(odVar.S, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            odVar.g0 = r4Var;
            odVar.K.addView(r4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            odVar.L = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
            odVar.L.setOrientation(1);
            odVar.K.addView(odVar.L, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            odVar.e0 = d9Var2;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i23));
            odVar.K.addView(odVar.e0, w7.z5.n(-1, -2));
            odVar.h0();
        }
        return odVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.U.setVisibility(8);
        } else {
            this.U.setVisibility(0);
        }
        i0 i0Var = this.Y;
        if (i0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i0Var);
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
                org.telegram.ui.Cells.y1 y1Var = this.U;
                int i10 = org.telegram.ui.ActionBar.h6.p7;
                y1Var.setTag(Integer.valueOf(i10));
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.y1 y1Var2 = this.U;
                    int i12 = org.telegram.ui.ActionBar.h6.p7;
                    y1Var2.setTag(Integer.valueOf(i12));
                    this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.y1 y1Var3 = this.U;
                    int i13 = org.telegram.ui.ActionBar.h6.p7;
                    y1Var3.setTag(Integer.valueOf(i13));
                    this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.y1 y1Var4 = this.U;
            int i14 = org.telegram.ui.ActionBar.h6.p7;
            y1Var4.setTag(Integer.valueOf(i14));
            this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.h6.p7;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            return false;
        }
        this.U.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.h6.F6;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        this.X = str;
        i0 i0Var2 = new i0(18, this, str);
        this.Y = i0Var2;
        AndroidUtilities.runOnUIThread(i0Var2, 300L);
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
                } catch (Exception e) {
                    FileLog.e(e);
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
            od odVar = new od(bundle);
            odVar.t0 = this.t0;
            presentFragment(odVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var == null || !e50Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
            ld ldVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ldVar, (Property<ld, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<md, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            ld ldVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(ldVar2, (Property<ld, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<md, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new ah.p0(28, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = true;
        j0Var.H0 = new fd(this, 0);
        showDialog(j0Var);
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
            ofFloat.addUpdateListener(new e3(this, 4));
            this.w0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.w0.setInterpolator(org.telegram.ui.Components.bs.f);
            this.w0.start();
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ lu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        org.telegram.ui.Components.qu quVar = this.c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.qu quVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.qu quVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.h6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.qu quVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.h6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.h6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.z6 z6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(z6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.h6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e0, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.h6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.h6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.h6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.h6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.a0 || this.j0) {
            org.telegram.ui.Cells.d9 d9Var = this.S;
            int i11 = org.telegram.ui.ActionBar.h6.B6;
            d9Var.setTag(Integer.valueOf(i11));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.d.setVisibility(0);
            this.e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.d9 d9Var2 = this.S;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
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
            org.telegram.ui.Components.q90 q90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c0;
            q90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.a0 && y1Var.length() != 0) {
                i10 = 0;
            }
            y1Var.setVisibility(i10);
        } else {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.d9 d9Var3 = this.S;
            int i12 = org.telegram.ui.ActionBar.h6.p7;
            d9Var3.setTag(Integer.valueOf(i12));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.d9 d9Var4 = this.S;
                d9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                this.e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.d9 d9Var5 = this.S;
                d9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
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
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar == null || !quVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        quVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.h0 == 1 && !this.b0 && this.c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.c0 = chatFull.exported_invite;
            }
            if (this.c0 == null) {
                this.b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new ed(this, 3));
            }
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.a = this;
            e50Var.b = this;
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
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.r();
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.j(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.qu quVar = this.c;
        if (quVar != null) {
            quVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.h0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.lu luVar = this.c.a;
        luVar.requestFocus();
        AndroidUtilities.showKeyboard(luVar);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null) {
                e50Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.qu quVar = this.c;
                if (quVar != null) {
                    quVar.setText(string);
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
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null && (str = e50Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.qu quVar = this.c;
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
