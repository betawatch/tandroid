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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hd extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.r40 {
    public String A;
    public LinearLayout B;
    public org.telegram.ui.Cells.k4 C;
    public EditTextBoldCursor D;
    public boolean E;
    public org.telegram.ui.Components.xi0 F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public org.telegram.ui.Components.r80 L;
    public org.telegram.ui.Cells.g6 M;
    public org.telegram.ui.Cells.g6 N;
    public org.telegram.ui.Cells.y8 O;
    public TextView P;
    public org.telegram.ui.Cells.w1 Q;
    public org.telegram.ui.Cells.k4 R;
    public int S;
    public String T;
    public org.telegram.ui.ActionBar.c U;
    public boolean V;
    public boolean W;
    public boolean X;
    public TLRPC.TL_chatInviteExported Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.y8 a0;
    public org.telegram.ui.Components.ir b;
    public final ArrayList b0;
    public org.telegram.ui.Components.au c;
    public org.telegram.ui.Cells.q4 c0;
    public org.telegram.ui.Cells.x6 d;
    public final int d0;
    public lh.y3 e;
    public final long e0;
    public cg.i0 f;
    public boolean f0;
    public final Boolean g0;
    public ed h;
    public TLRPC.InputFile h0;
    public TLRPC.InputFile i0;
    public TLRPC.VideoSize j0;
    public String k0;
    public double l0;
    public boolean m0;
    public AnimatorSet n;
    public boolean n0;
    public Integer o0;
    public Utilities.Callback2 p0;
    public org.telegram.ui.ActionBar.c2 q0;
    public fd r;
    public final yc r0;
    public final org.telegram.ui.Components.e9 s;
    public ValueAnimator s0;
    public final org.telegram.ui.Components.s40 v;
    public EditTextBoldCursor w;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public hd(Bundle bundle) {
        super(bundle);
        this.b0 = new ArrayList();
        this.f0 = true;
        this.r0 = new yc(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.d0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.g0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            this.v = new org.telegram.ui.Components.s40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new xc(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f0 = z10;
            this.W = !z10;
            if (!z10 && !this.Z) {
                this.Z = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new xc(this, 0));
            }
        }
        this.e0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(hd hdVar, org.telegram.ui.ActionBar.c2 c2Var) {
        hdVar.n0 = false;
        hdVar.m0 = false;
        if (hdVar.o0 != null) {
            ConnectionsManager.getInstance(hdVar.currentAccount).cancelRequest(hdVar.o0.intValue(), true);
            hdVar.o0 = null;
        }
        hdVar.g0(false);
        c2Var.dismiss();
    }

    public static /* synthetic */ void V(hd hdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(hdVar.currentAccount).sendRequest(tL_channels_updateUsername, new xc(hdVar, 1), 64);
    }

    public static /* synthetic */ void W(hd hdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(hdVar.currentAccount).getInputChannel(hdVar.e0);
        hdVar.S = ConnectionsManager.getInstance(hdVar.currentAccount).sendRequest(tL_channels_checkUsername, new x9(hdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(hd hdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        if (currentChannel.megagroup) {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(hdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(hdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new kg.w(13, hdVar, currentChannel));
        hdVar.showDialog(c2Var);
    }

    public static void Y(hd hdVar) {
        if (hdVar.q0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hdVar.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new c1(hdVar, 12));
        hdVar.q0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.r40
    public final void D(float f9) {
        fd fdVar = this.r;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(f9);
    }

    @Override // org.telegram.ui.Components.r40
    public final void K(boolean z10, boolean z11) {
        fd fdVar = this.r;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.r40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        final hd hdVar = this;
        org.telegram.ui.Components.au auVar = hdVar.c;
        if (auVar != null) {
            auVar.o();
        }
        hdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        hdVar.actionBar.setAllowOverlayTitle(true);
        hdVar.actionBar.setActionBarMenuOnItemClick(new cd(hdVar));
        org.telegram.ui.ActionBar.a0 n10 = hdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        hdVar.b = irVar;
        hdVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), irVar);
        int i13 = 2;
        int i14 = hdVar.d0;
        if (i14 == 0) {
            hdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            dd ddVar = new dd(i12, context, hdVar);
            ddVar.setOnTouchListener(new mh.d(i13));
            hdVar.fragmentView = ddVar;
            int i15 = org.telegram.ui.ActionBar.g6.d6;
            ddVar.setTag(Integer.valueOf(i15));
            hdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            LinearLayout linearLayout = new LinearLayout(context);
            hdVar.G = linearLayout;
            linearLayout.setOrientation(1);
            ddVar.addView(hdVar.G, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            hdVar.G.addView(frameLayout, i7.f6.n(-1, -2));
            lh.y3 y3Var = new lh.y3(hdVar, context, 4);
            hdVar.e = y3Var;
            y3Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.e9 e9Var = hdVar.s;
            e9Var.n(5L, null, null);
            hdVar.e.setImageDrawable(e9Var);
            lh.y3 y3Var2 = hdVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(y3Var2, i7.f6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            cg.i0 i0Var = new cg.i0(hdVar, context, paint, i13);
            hdVar.f = i0Var;
            i0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            cg.i0 i0Var2 = hdVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(i0Var2, i7.f6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            hdVar.f.setOnClickListener(new zc(hdVar, i10));
            hdVar.F = new org.telegram.ui.Components.xi0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            ed edVar = new ed(hdVar, context, 0);
            hdVar.h = edVar;
            edVar.setScaleType(ImageView.ScaleType.CENTER);
            hdVar.h.setAnimation(hdVar.F);
            hdVar.h.setEnabled(false);
            hdVar.h.setClickable(false);
            hdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            ed edVar2 = hdVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(edVar2, i7.f6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            fd fdVar = new fd(hdVar, context, i12);
            hdVar.r = fdVar;
            fdVar.setSize(AndroidUtilities.dp(30.0f));
            hdVar.r.setProgressColor(-1);
            hdVar.r.setNoProgress(false);
            fd fdVar2 = hdVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(fdVar2, i7.f6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            hdVar.e0(false, false);
            org.telegram.ui.Components.au auVar2 = new org.telegram.ui.Components.au(context, ddVar, hdVar, 0, false, null);
            hdVar = hdVar;
            hdVar.c = auVar2;
            auVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = hdVar.A;
            if (str != null) {
                hdVar.c.setText(str);
                hdVar.A = null;
            }
            hdVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            hdVar.c.getEditText().setSingleLine(true);
            hdVar.c.getEditText().setImeOptions(5);
            hdVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(hdVar) { // from class: org.telegram.ui.ad
                public final /* synthetic */ hd b;

                {
                    this.b = hdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i12) {
                        case 0:
                            hd hdVar2 = this.b;
                            if (i16 != 5) {
                                hdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(hdVar2.c.getEditText().getText())) {
                                hdVar2.w.requestFocus();
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
            org.telegram.ui.Components.au auVar3 = hdVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(auVar3, i7.f6.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            hdVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            hdVar.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = hdVar.w;
            int i16 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            hdVar.w.setBackgroundDrawable(null);
            hdVar.w.setLineColors(hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.k6), hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.l6), hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
            hdVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            hdVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            hdVar.w.setInputType(180225);
            hdVar.w.setImeOptions(6);
            hdVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            hdVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            hdVar.w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            hdVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            hdVar.w.setCursorWidth(1.5f);
            hdVar.G.addView(hdVar.w, i7.f6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            hdVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(hdVar) { // from class: org.telegram.ui.ad
                public final /* synthetic */ hd b;

                {
                    this.b = hdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i162, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i10) {
                        case 0:
                            hd hdVar2 = this.b;
                            if (i162 != 5) {
                                hdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(hdVar2.c.getEditText().getText())) {
                                hdVar2.w.requestFocus();
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
            hdVar.w.addTextChangedListener(new gd(0));
            TextView textView = new TextView(context);
            hdVar.P = textView;
            textView.setTextSize(1, 15.0f);
            hdVar.P.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F6, false));
            hdVar.P.setGravity(LocaleController.isRTL ? 5 : 3);
            hdVar.P.setText(LocaleController.getString(R.string.DescriptionInfo));
            hdVar.G.addView(hdVar.P, i7.f6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i14 == 1) {
            ScrollView scrollView = new ScrollView(context);
            hdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            hdVar.G = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(hdVar.G, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = hdVar.getMessagesController();
            long j10 = hdVar.e0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            hdVar.E = z15;
            hdVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = hdVar.fragmentView;
            int i17 = org.telegram.ui.ActionBar.g6.a7;
            view.setTag(Integer.valueOf(i17));
            hdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 23);
            hdVar.C = k4Var;
            k4Var.setHeight(46);
            org.telegram.ui.Cells.k4 k4Var2 = hdVar.C;
            int i18 = org.telegram.ui.ActionBar.g6.d6;
            k4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            hdVar.C.setText(LocaleController.getString(hdVar.E ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            hdVar.G.addView(hdVar.C);
            LinearLayout linearLayout3 = new LinearLayout(context);
            hdVar.B = linearLayout3;
            linearLayout3.setOrientation(1);
            hdVar.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            hdVar.G.addView(hdVar.B, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
            hdVar.M = g6Var;
            g6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            Boolean bool = hdVar.g0;
            if (bool != null && !bool.booleanValue()) {
                hdVar.W = true;
            }
            if (hdVar.E) {
                hdVar.M.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !hdVar.W);
            } else {
                hdVar.M.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !hdVar.W);
            }
            hdVar.M.setOnClickListener(new zc(hdVar, i13));
            if (bool == null || bool.booleanValue()) {
                hdVar.B.addView(hdVar.M, i7.f6.n(-1, -2));
            }
            org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
            hdVar.N = g6Var2;
            g6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (bool != null && bool.booleanValue()) {
                hdVar.W = false;
            }
            if (hdVar.E) {
                hdVar.N.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, hdVar.W);
            } else {
                hdVar.N.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, hdVar.W);
            }
            hdVar.N.setOnClickListener(new zc(hdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                hdVar.B.addView(hdVar.N, i7.f6.n(-1, -2));
            }
            org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
            hdVar.d = x6Var;
            hdVar.G.addView(x6Var, i7.f6.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            hdVar.I = linearLayout4;
            linearLayout4.setOrientation(1);
            hdVar.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            hdVar.G.addView(hdVar.I, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.k4 k4Var3 = new org.telegram.ui.Cells.k4(context);
            hdVar.R = k4Var3;
            hdVar.I.addView(k4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            hdVar.J = linearLayout5;
            linearLayout5.setOrientation(0);
            hdVar.I.addView(hdVar.J, i7.f6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            hdVar.D = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(hdVar.currentAccount).linkPrefix + "/");
            hdVar.D.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = hdVar.D;
            int i19 = org.telegram.ui.ActionBar.g6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            EditTextBoldCursor editTextBoldCursor5 = hdVar.D;
            int i20 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            hdVar.D.setMaxLines(1);
            hdVar.D.setLines(1);
            hdVar.D.setEnabled(false);
            hdVar.D.setBackgroundDrawable(null);
            hdVar.D.setPadding(0, 0, 0, 0);
            hdVar.D.setSingleLine(true);
            hdVar.D.setInputType(163840);
            hdVar.D.setImeOptions(6);
            hdVar.J.addView(hdVar.D, i7.f6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            hdVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            hdVar.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            hdVar.w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            hdVar.w.setMaxLines(1);
            hdVar.w.setLines(1);
            hdVar.w.setBackgroundDrawable(null);
            hdVar.w.setPadding(0, 0, 0, 0);
            hdVar.w.setSingleLine(true);
            hdVar.w.setInputType(163872);
            hdVar.w.setImeOptions(6);
            hdVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            hdVar.w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            hdVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            hdVar.w.setCursorWidth(1.5f);
            hdVar.J.addView(hdVar.w, i7.f6.n(-1, 36));
            hdVar.w.addTextChangedListener(new p0(hdVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            hdVar.K = linearLayout6;
            linearLayout6.setOrientation(1);
            hdVar.I.addView(hdVar.K, i7.f6.n(-1, -2));
            org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(context, hdVar, null, true, ChatObject.isChannel(hdVar.getMessagesController().getChat(Long.valueOf(j10))));
            hdVar.L = r80Var;
            r80Var.b(true);
            hdVar.L.d(0, null, false);
            hdVar.K.addView(hdVar.L);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(hdVar, context, 3);
            hdVar.Q = w1Var;
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            hdVar.Q.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
            hdVar.Q.setTextSize(1, 15.0f);
            hdVar.Q.setGravity(LocaleController.isRTL ? 5 : 3);
            hdVar.Q.setVisibility(8);
            hdVar.Q.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            hdVar.I.addView(hdVar.Q, i7.f6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            hdVar.O = y8Var;
            int i21 = R.drawable.greydivider_bottom;
            int i22 = org.telegram.ui.ActionBar.g6.b7;
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i21, i22));
            hdVar.G.addView(hdVar.O, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
            hdVar.c0 = q4Var;
            hdVar.G.addView(q4Var, i7.f6.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            hdVar.H = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            hdVar.H.setOrientation(1);
            hdVar.G.addView(hdVar.H, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            hdVar.a0 = y8Var2;
            y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i22));
            hdVar.G.addView(hdVar.a0, i7.f6.n(-1, -2));
            hdVar.h0();
        }
        return hdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setVisibility(0);
        }
        org.telegram.ui.ActionBar.c cVar = this.U;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.U = null;
            this.T = null;
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.S, true);
            }
        }
        this.V = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.w1 w1Var = this.Q;
                int i10 = org.telegram.ui.ActionBar.g6.p7;
                w1Var.setTag(Integer.valueOf(i10));
                this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.Q.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.w1 w1Var2 = this.Q;
                    int i12 = org.telegram.ui.ActionBar.g6.p7;
                    w1Var2.setTag(Integer.valueOf(i12));
                    this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.w1 w1Var3 = this.Q;
                    int i13 = org.telegram.ui.ActionBar.g6.p7;
                    w1Var3.setTag(Integer.valueOf(i13));
                    this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.Q.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.w1 w1Var4 = this.Q;
            int i14 = org.telegram.ui.ActionBar.g6.p7;
            w1Var4.setTag(Integer.valueOf(i14));
            this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.Q.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.w1 w1Var5 = this.Q;
            int i15 = org.telegram.ui.ActionBar.g6.p7;
            w1Var5.setTag(Integer.valueOf(i15));
            this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            return false;
        }
        this.Q.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.w1 w1Var6 = this.Q;
        int i16 = org.telegram.ui.ActionBar.g6.F6;
        w1Var6.setTag(Integer.valueOf(i16));
        this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.T = str;
        org.telegram.ui.ActionBar.c cVar2 = new org.telegram.ui.ActionBar.c(25, this, str);
        this.U = cVar2;
        AndroidUtilities.runOnUIThread(cVar2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.c2 c2Var = this.q0;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
                    this.q0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            g0(false);
            this.n0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.c2 c2Var2 = this.q0;
            if (c2Var2 != null) {
                try {
                    c2Var2.dismiss();
                    this.q0 = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f0);
            Boolean bool = this.g0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.h0 != null || this.i0 != null || this.j0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.h0, this.i0, this.j0, this.l0, this.k0, this.x, this.y, null);
            }
            hd hdVar = new hd(bundle);
            hdVar.p0 = this.p0;
            presentFragment(hdVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var == null || !s40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.s40 s40Var = this.v;
        return (s40Var == null || dialog != s40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.r40
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
            ed edVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(edVar, (Property<ed, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<fd, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            ed edVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(edVar2, (Property<ed, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<fd, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new bg.z2(27, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.r0 = true;
        v0Var.D0 = new yc(this, 0);
        showDialog(v0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.r0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z10 ? 1.0f : 0.0f);
            this.s0 = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 4));
            this.s0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.s0.setInterpolator(org.telegram.ui.Components.jr.f);
            this.s0.start();
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        org.telegram.ui.Components.au auVar = this.c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.au auVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.au auVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.g6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.au auVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.g6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.P;
        int i15 = org.telegram.ui.ActionBar.g6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.x6 x6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.w1 w1Var = this.Q;
        int i18 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.K;
        int i19 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c0, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.g6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.W || this.f0) {
            org.telegram.ui.Cells.y8 y8Var = this.O;
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            y8Var.setTag(Integer.valueOf(i11));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.a0.setVisibility(8);
            this.H.setVisibility(8);
            org.telegram.ui.Cells.y8 y8Var2 = this.O;
            y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(y8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            this.I.setVisibility(0);
            this.c0.setVisibility(8);
            if (this.E) {
                this.O.setText(LocaleController.getString(this.W ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.R.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.O.setText(LocaleController.getString(this.W ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.R.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.J.setVisibility(this.W ? 8 : 0);
            this.K.setVisibility(this.W ? 0 : 8);
            this.I.setPadding(0, 0, 0, this.W ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.r80 r80Var = this.L;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Y;
            r80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.w1 w1Var = this.Q;
            if (!this.W && w1Var.length() != 0) {
                i10 = 0;
            }
            w1Var.setVisibility(i10);
        } else {
            this.O.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.y8 y8Var3 = this.O;
            int i12 = org.telegram.ui.ActionBar.g6.p7;
            y8Var3.setTag(Integer.valueOf(i12));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.I.setVisibility(8);
            this.d.setVisibility(8);
            if (this.Z) {
                this.c0.setVisibility(0);
                this.H.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = this.O;
                y8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(y8Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                this.a0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.y8 y8Var5 = this.O;
                y8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(y8Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                this.c0.setVisibility(8);
                this.H.setVisibility(0);
                this.a0.setVisibility(0);
            }
        }
        this.M.a(!this.W);
        this.N.a(this.W);
        this.w.clearFocus();
        AndroidUtilities.hideKeyboard(this.w);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar == null || !auVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        auVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.d0 == 1 && !this.X && this.Y == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.e0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.Y = chatFull.exported_invite;
            }
            if (this.Y == null) {
                this.X = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new xc(this, 3));
            }
        }
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.a = this;
            s40Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.o0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.o0.intValue(), true);
            this.o0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.r();
        }
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.k(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.au auVar = this.c;
        if (auVar != null) {
            auVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.d0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.vt vtVar = this.c.a;
        vtVar.requestFocus();
        AndroidUtilities.showKeyboard(vtVar);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.d0 == 0) {
            org.telegram.ui.Components.s40 s40Var = this.v;
            if (s40Var != null) {
                s40Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.au auVar = this.c;
                if (auVar != null) {
                    auVar.setText(string);
                } else {
                    this.A = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.d0 == 0) {
            org.telegram.ui.Components.s40 s40Var = this.v;
            if (s40Var != null && (str = s40Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.au auVar = this.c;
            if (auVar != null) {
                String obj = auVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ void P() {
    }
}
