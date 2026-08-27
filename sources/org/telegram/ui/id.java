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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class id extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i40 {
    public String A;
    public LinearLayout B;
    public org.telegram.ui.Cells.j4 C;
    public EditTextBoldCursor D;
    public boolean E;
    public org.telegram.ui.Components.oi0 F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public org.telegram.ui.Components.i80 L;
    public org.telegram.ui.Cells.f6 M;
    public org.telegram.ui.Cells.f6 N;
    public org.telegram.ui.Cells.x8 O;
    public TextView P;
    public org.telegram.ui.Cells.w1 Q;
    public org.telegram.ui.Cells.j4 R;
    public int S;
    public String T;
    public org.telegram.messenger.voip.l0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public TLRPC.TL_chatInviteExported Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.v0 a;
    public org.telegram.ui.Cells.x8 a0;
    public org.telegram.ui.Components.dr b;
    public final ArrayList b0;
    public org.telegram.ui.Components.tt c;
    public org.telegram.ui.Cells.p4 c0;
    public org.telegram.ui.Cells.w6 d;
    public final int d0;
    public jh.z3 e;
    public final long e0;
    public ag.t0 f;
    public boolean f0;
    public final Boolean g0;
    public fd h;
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
    public org.telegram.ui.ActionBar.b2 q0;
    public gd r;
    public final zc r0;
    public final org.telegram.ui.Components.y8 s;
    public ValueAnimator s0;
    public final org.telegram.ui.Components.j40 v;
    public EditTextBoldCursor w;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public id(Bundle bundle) {
        super(bundle);
        this.b0 = new ArrayList();
        this.f0 = true;
        this.r0 = new zc(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.d0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.g0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            this.v = new org.telegram.ui.Components.j40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new yc(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f0 = z10;
            this.W = !z10;
            if (!z10 && !this.Z) {
                this.Z = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yc(this, 0));
            }
        }
        this.e0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(id idVar, org.telegram.ui.ActionBar.b2 b2Var) {
        idVar.n0 = false;
        idVar.m0 = false;
        if (idVar.o0 != null) {
            ConnectionsManager.getInstance(idVar.currentAccount).cancelRequest(idVar.o0.intValue(), true);
            idVar.o0 = null;
        }
        idVar.g0(false);
        b2Var.dismiss();
    }

    public static /* synthetic */ void V(id idVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(idVar.currentAccount).sendRequest(tL_channels_updateUsername, new yc(idVar, 1), 64);
    }

    public static /* synthetic */ void W(id idVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(idVar.currentAccount).getInputChannel(idVar.e0);
        idVar.S = ConnectionsManager.getInstance(idVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(idVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(id idVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.N = string;
        if (currentChannel.megagroup) {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new jh.z1(13, idVar, currentChannel));
        idVar.showDialog(b2Var);
    }

    public static void Y(id idVar) {
        if (idVar.q0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new c1(idVar, 12));
        idVar.q0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.i40
    public final void E(float f10) {
        gd gdVar = this.r;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.i40
    public final void J(boolean z10, boolean z11) {
        gd gdVar = this.r;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.i40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        final id idVar = this;
        org.telegram.ui.Components.tt ttVar = idVar.c;
        if (ttVar != null) {
            ttVar.o();
        }
        idVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        idVar.actionBar.setAllowOverlayTitle(true);
        idVar.actionBar.setActionBarMenuOnItemClick(new dd(idVar));
        org.telegram.ui.ActionBar.z n10 = idVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.dr drVar = new org.telegram.ui.Components.dr(mutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        idVar.b = drVar;
        idVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), drVar);
        int i13 = 2;
        int i14 = 3;
        int i15 = idVar.d0;
        if (i15 == 0) {
            idVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            ed edVar = new ed(i12, context, idVar);
            edVar.setOnTouchListener(new kh.e(i13));
            idVar.fragmentView = edVar;
            int i16 = org.telegram.ui.ActionBar.g6.d6;
            edVar.setTag(Integer.valueOf(i16));
            idVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            LinearLayout linearLayout = new LinearLayout(context);
            idVar.G = linearLayout;
            linearLayout.setOrientation(1);
            edVar.addView(idVar.G, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            idVar.G.addView(frameLayout, h7.z5.n(-1, -2));
            jh.z3 z3Var = new jh.z3(idVar, context, 4);
            idVar.e = z3Var;
            z3Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.y8 y8Var = idVar.s;
            y8Var.n(5L, null, null);
            idVar.e.setImageDrawable(y8Var);
            jh.z3 z3Var2 = idVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(z3Var2, h7.z5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ag.t0 t0Var = new ag.t0(idVar, context, paint, i14);
            idVar.f = t0Var;
            t0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ag.t0 t0Var2 = idVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(t0Var2, h7.z5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            idVar.f.setOnClickListener(new ad(idVar, i10));
            idVar.F = new org.telegram.ui.Components.oi0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            fd fdVar = new fd(idVar, context, 0);
            idVar.h = fdVar;
            fdVar.setScaleType(ImageView.ScaleType.CENTER);
            idVar.h.setAnimation(idVar.F);
            idVar.h.setEnabled(false);
            idVar.h.setClickable(false);
            idVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            fd fdVar2 = idVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(fdVar2, h7.z5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            gd gdVar = new gd(idVar, context, i12);
            idVar.r = gdVar;
            gdVar.setSize(AndroidUtilities.dp(30.0f));
            idVar.r.setProgressColor(-1);
            idVar.r.setNoProgress(false);
            gd gdVar2 = idVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(gdVar2, h7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            idVar.e0(false, false);
            org.telegram.ui.Components.tt ttVar2 = new org.telegram.ui.Components.tt(context, edVar, idVar, 0, false, null);
            idVar = idVar;
            idVar.c = ttVar2;
            ttVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = idVar.A;
            if (str != null) {
                idVar.c.setText(str);
                idVar.A = null;
            }
            idVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            idVar.c.getEditText().setSingleLine(true);
            idVar.c.getEditText().setImeOptions(5);
            idVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(idVar) { // from class: org.telegram.ui.bd
                public final /* synthetic */ id b;

                {
                    this.b = idVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i12) {
                        case 0:
                            id idVar2 = this.b;
                            if (i17 != 5) {
                                idVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(idVar2.c.getEditText().getText())) {
                                idVar2.w.requestFocus();
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
            org.telegram.ui.Components.tt ttVar3 = idVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(ttVar3, h7.z5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            idVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            idVar.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = idVar.w;
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            idVar.w.setBackgroundDrawable(null);
            idVar.w.setLineColors(idVar.getThemedColor(org.telegram.ui.ActionBar.g6.k6), idVar.getThemedColor(org.telegram.ui.ActionBar.g6.l6), idVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
            idVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            idVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            idVar.w.setInputType(180225);
            idVar.w.setImeOptions(6);
            idVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            idVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            idVar.w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            idVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            idVar.w.setCursorWidth(1.5f);
            idVar.G.addView(idVar.w, h7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            idVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(idVar) { // from class: org.telegram.ui.bd
                public final /* synthetic */ id b;

                {
                    this.b = idVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i10) {
                        case 0:
                            id idVar2 = this.b;
                            if (i172 != 5) {
                                idVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(idVar2.c.getEditText().getText())) {
                                idVar2.w.requestFocus();
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
            idVar.w.addTextChangedListener(new hd(0));
            TextView textView = new TextView(context);
            idVar.P = textView;
            textView.setTextSize(1, 15.0f);
            idVar.P.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F6, false));
            idVar.P.setGravity(LocaleController.isRTL ? 5 : 3);
            idVar.P.setText(LocaleController.getString(R.string.DescriptionInfo));
            idVar.G.addView(idVar.P, h7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            idVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            idVar.G = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(idVar.G, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = idVar.getMessagesController();
            long j10 = idVar.e0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            idVar.E = z15;
            idVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = idVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.g6.a7;
            view.setTag(Integer.valueOf(i18));
            idVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 23);
            idVar.C = j4Var;
            j4Var.setHeight(46);
            org.telegram.ui.Cells.j4 j4Var2 = idVar.C;
            int i19 = org.telegram.ui.ActionBar.g6.d6;
            j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.C.setText(LocaleController.getString(idVar.E ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            idVar.G.addView(idVar.C);
            LinearLayout linearLayout3 = new LinearLayout(context);
            idVar.B = linearLayout3;
            linearLayout3.setOrientation(1);
            idVar.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.G.addView(idVar.B, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, false);
            idVar.M = f6Var;
            f6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            Boolean bool = idVar.g0;
            if (bool != null && !bool.booleanValue()) {
                idVar.W = true;
            }
            if (idVar.E) {
                idVar.M.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !idVar.W);
            } else {
                idVar.M.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !idVar.W);
            }
            idVar.M.setOnClickListener(new ad(idVar, i13));
            if (bool == null || bool.booleanValue()) {
                idVar.B.addView(idVar.M, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.f6 f6Var2 = new org.telegram.ui.Cells.f6(context, false);
            idVar.N = f6Var2;
            f6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (bool != null && bool.booleanValue()) {
                idVar.W = false;
            }
            if (idVar.E) {
                idVar.N.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, idVar.W);
            } else {
                idVar.N.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, idVar.W);
            }
            idVar.N.setOnClickListener(new ad(idVar, 3));
            if (bool == null || !bool.booleanValue()) {
                idVar.B.addView(idVar.N, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
            idVar.d = w6Var;
            idVar.G.addView(w6Var, h7.z5.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            idVar.I = linearLayout4;
            linearLayout4.setOrientation(1);
            idVar.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.G.addView(idVar.I, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.j4 j4Var3 = new org.telegram.ui.Cells.j4(context);
            idVar.R = j4Var3;
            idVar.I.addView(j4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            idVar.J = linearLayout5;
            linearLayout5.setOrientation(0);
            idVar.I.addView(idVar.J, h7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            idVar.D = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/");
            idVar.D.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = idVar.D;
            int i20 = org.telegram.ui.ActionBar.g6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            EditTextBoldCursor editTextBoldCursor5 = idVar.D;
            int i21 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            idVar.D.setMaxLines(1);
            idVar.D.setLines(1);
            idVar.D.setEnabled(false);
            idVar.D.setBackgroundDrawable(null);
            idVar.D.setPadding(0, 0, 0, 0);
            idVar.D.setSingleLine(true);
            idVar.D.setInputType(163840);
            idVar.D.setImeOptions(6);
            idVar.J.addView(idVar.D, h7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            idVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            idVar.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            idVar.w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            idVar.w.setMaxLines(1);
            idVar.w.setLines(1);
            idVar.w.setBackgroundDrawable(null);
            idVar.w.setPadding(0, 0, 0, 0);
            idVar.w.setSingleLine(true);
            idVar.w.setInputType(163872);
            idVar.w.setImeOptions(6);
            idVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            idVar.w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            idVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            idVar.w.setCursorWidth(1.5f);
            idVar.J.addView(idVar.w, h7.z5.n(-1, 36));
            idVar.w.addTextChangedListener(new p0(idVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            idVar.K = linearLayout6;
            linearLayout6.setOrientation(1);
            idVar.I.addView(idVar.K, h7.z5.n(-1, -2));
            org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(context, idVar, null, true, ChatObject.isChannel(idVar.getMessagesController().getChat(Long.valueOf(j10))));
            idVar.L = i80Var;
            i80Var.b(true);
            idVar.L.d(0, null, false);
            idVar.K.addView(idVar.L);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(idVar, context, 3);
            idVar.Q = w1Var;
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            idVar.Q.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
            idVar.Q.setTextSize(1, 15.0f);
            idVar.Q.setGravity(LocaleController.isRTL ? 5 : 3);
            idVar.Q.setVisibility(8);
            idVar.Q.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            idVar.I.addView(idVar.Q, h7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            idVar.O = x8Var;
            int i22 = R.drawable.greydivider_bottom;
            int i23 = org.telegram.ui.ActionBar.g6.b7;
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i22, i23));
            idVar.G.addView(idVar.O, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            idVar.c0 = p4Var;
            idVar.G.addView(p4Var, h7.z5.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            idVar.H = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.H.setOrientation(1);
            idVar.G.addView(idVar.H, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            idVar.a0 = x8Var2;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i23));
            idVar.G.addView(idVar.a0, h7.z5.n(-1, -2));
            idVar.h0();
        }
        return idVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setVisibility(0);
        }
        org.telegram.messenger.voip.l0 l0Var = this.U;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
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
        org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(28, this, str);
        this.U = l0Var2;
        AndroidUtilities.runOnUIThread(l0Var2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.q0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.q0 = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            g0(false);
            this.n0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.q0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.q0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            id idVar = new id(bundle);
            idVar.p0 = this.p0;
            presentFragment(idVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var == null || !j40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j40 j40Var = this.v;
        return (j40Var == null || dialog != j40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.i40
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
            fd fdVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, (Property<fd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<gd, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            fd fdVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(fdVar2, (Property<fd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<gd, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new ag.x(28, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ag.i1 i1Var = new ag.i1(2, this.currentAccount, getParentActivity(), this, null);
        i1Var.r0 = true;
        i1Var.D0 = new zc(this, 0);
        showDialog(i1Var);
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
            this.s0.setInterpolator(org.telegram.ui.Components.er.f);
            this.s0.start();
        }
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ cu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        org.telegram.ui.Components.tt ttVar = this.c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.tt ttVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.tt ttVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.g6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.tt ttVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.g6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.P;
        int i15 = org.telegram.ui.ActionBar.g6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.w6 w6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.w1 w1Var = this.Q;
        int i18 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.K;
        int i19 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c0, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8192, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16384, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 8192, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 16384, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.g6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.W || this.f0) {
            org.telegram.ui.Cells.x8 x8Var = this.O;
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            x8Var.setTag(Integer.valueOf(i11));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.a0.setVisibility(8);
            this.H.setVisibility(8);
            org.telegram.ui.Cells.x8 x8Var2 = this.O;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(x8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
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
            org.telegram.ui.Components.i80 i80Var = this.L;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Y;
            i80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.w1 w1Var = this.Q;
            if (!this.W && w1Var.length() != 0) {
                i10 = 0;
            }
            w1Var.setVisibility(i10);
        } else {
            this.O.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.x8 x8Var3 = this.O;
            int i12 = org.telegram.ui.ActionBar.g6.p7;
            x8Var3.setTag(Integer.valueOf(i12));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.I.setVisibility(8);
            this.d.setVisibility(8);
            if (this.Z) {
                this.c0.setVisibility(0);
                this.H.setVisibility(8);
                org.telegram.ui.Cells.x8 x8Var4 = this.O;
                x8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(x8Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                this.a0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.x8 x8Var5 = this.O;
                x8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(x8Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tt ttVar = this.c;
        if (ttVar == null || !ttVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        ttVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new yc(this, 3));
            }
        }
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.a = this;
            j40Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.o0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.o0.intValue(), true);
            this.o0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.tt ttVar = this.c;
        if (ttVar != null) {
            ttVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.tt ttVar = this.c;
        if (ttVar != null) {
            ttVar.r();
        }
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.k(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.tt ttVar = this.c;
        if (ttVar != null) {
            ttVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.d0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.ot otVar = this.c.a;
        otVar.requestFocus();
        AndroidUtilities.showKeyboard(otVar);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.d0 == 0) {
            org.telegram.ui.Components.j40 j40Var = this.v;
            if (j40Var != null) {
                j40Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.tt ttVar = this.c;
                if (ttVar != null) {
                    ttVar.setText(string);
                } else {
                    this.A = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.d0 == 0) {
            org.telegram.ui.Components.j40 j40Var = this.v;
            if (j40Var != null && (str = j40Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.tt ttVar = this.c;
            if (ttVar != null) {
                String obj = ttVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ void P() {
    }
}
