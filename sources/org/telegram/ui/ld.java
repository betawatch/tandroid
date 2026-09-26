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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ld extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.u40 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.ij0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.g90 P;
    public org.telegram.ui.Cells.j6 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public org.telegram.ui.ActionBar.a6 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.u0 a;
    public boolean a0;
    public org.telegram.ui.Components.qr b;
    public boolean b0;
    public org.telegram.ui.Components.ku c;
    public TLRPC.TL_chatInviteExported c0;
    public org.telegram.ui.Cells.b7 d;
    public boolean d0;
    public ai.y5 e;
    public org.telegram.ui.Cells.e9 e0;
    public ci.r6 f;
    public final ArrayList f0;
    public org.telegram.ui.Cells.s4 g0;
    public id h;
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
    public jd r;
    public boolean r0;
    public final org.telegram.ui.Components.h9 s;
    public Integer s0;
    public Utilities.Callback2 t0;
    public org.telegram.ui.ActionBar.a2 u0;
    public final org.telegram.ui.Components.v40 v;
    public final cd v0;
    public EditTextBoldCursor w;
    public ValueAnimator w0;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public ld(Bundle bundle) {
        super(bundle);
        this.f0 = new ArrayList();
        this.j0 = true;
        this.v0 = new cd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            this.v = new org.telegram.ui.Components.v40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new bd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.j0 = z10;
            this.a0 = !z10;
            if (!z10 && !this.d0) {
                this.d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new bd(this, 0));
            }
        }
        this.i0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(ld ldVar, org.telegram.ui.ActionBar.a2 a2Var) {
        ldVar.r0 = false;
        ldVar.q0 = false;
        if (ldVar.s0 != null) {
            ConnectionsManager.getInstance(ldVar.currentAccount).cancelRequest(ldVar.s0.intValue(), true);
            ldVar.s0 = null;
        }
        ldVar.g0(false);
        a2Var.dismiss();
    }

    public static /* synthetic */ void V(ld ldVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ldVar.currentAccount).sendRequest(tL_channels_updateUsername, new bd(ldVar, 1), 64);
    }

    public static /* synthetic */ void W(ld ldVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ldVar.currentAccount).getInputChannel(ldVar.i0);
        ldVar.W = ConnectionsManager.getInstance(ldVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(ldVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(ld ldVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        if (currentChannel.megagroup) {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(6, ldVar, currentChannel));
        ldVar.showDialog(a2Var);
    }

    public static void Y(ld ldVar) {
        if (ldVar.u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new z0(ldVar, 12));
        ldVar.u0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        jd jdVar = this.r;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
        jd jdVar = this.r;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.u40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        final ld ldVar = this;
        org.telegram.ui.Components.ku kuVar = ldVar.c;
        if (kuVar != null) {
            kuVar.o();
        }
        ldVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        ldVar.actionBar.setAllowOverlayTitle(true);
        ldVar.actionBar.setActionBarMenuOnItemClick(new gd(ldVar));
        org.telegram.ui.ActionBar.y n10 = ldVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.h6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.qr qrVar = new org.telegram.ui.Components.qr(mutate, new org.telegram.ui.Components.up(org.telegram.ui.ActionBar.h6.w0(null, i11, false)));
        ldVar.b = qrVar;
        ldVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), qrVar);
        int i13 = 2;
        int i14 = 5;
        int i15 = ldVar.h0;
        if (i15 == 0) {
            ldVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            hd hdVar = new hd(i12, context, ldVar);
            hdVar.setOnTouchListener(new bi.d(i13));
            ldVar.fragmentView = hdVar;
            int i16 = org.telegram.ui.ActionBar.h6.d6;
            hdVar.setTag(Integer.valueOf(i16));
            ldVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ldVar.K = linearLayout;
            linearLayout.setOrientation(1);
            hdVar.addView(ldVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ldVar.K.addView(frameLayout, w7.y5.n(-1, -2));
            ai.y5 y5Var = new ai.y5(ldVar, context, i14);
            ldVar.e = y5Var;
            y5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = ldVar.s;
            h9Var.n(5L, null, null);
            ldVar.e.setImageDrawable(h9Var);
            ai.y5 y5Var2 = ldVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(y5Var2, w7.y5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.r6 r6Var = new ci.r6(ldVar, context, paint, i13);
            ldVar.f = r6Var;
            r6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ci.r6 r6Var2 = ldVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(r6Var2, w7.y5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            ldVar.f.setOnClickListener(new dd(ldVar, i10));
            ldVar.J = new org.telegram.ui.Components.ij0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            id idVar = new id(ldVar, context, 0);
            ldVar.h = idVar;
            idVar.setScaleType(ImageView.ScaleType.CENTER);
            ldVar.h.setAnimation(ldVar.J);
            ldVar.h.setEnabled(false);
            ldVar.h.setClickable(false);
            ldVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            id idVar2 = ldVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(idVar2, w7.y5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            jd jdVar = new jd(ldVar, context, i12);
            ldVar.r = jdVar;
            jdVar.setSize(AndroidUtilities.dp(30.0f));
            ldVar.r.setProgressColor(-1);
            ldVar.r.setNoProgress(false);
            jd jdVar2 = ldVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(jdVar2, w7.y5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            ldVar.e0(false, false);
            org.telegram.ui.Components.ku kuVar2 = new org.telegram.ui.Components.ku(context, hdVar, this, 0, false, null);
            ldVar = this;
            ldVar.c = kuVar2;
            kuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ldVar.E;
            if (str != null) {
                ldVar.c.setText(str);
                ldVar.E = null;
            }
            ldVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ldVar.c.getEditText().setSingleLine(true);
            ldVar.c.getEditText().setImeOptions(5);
            ldVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ldVar) { // from class: org.telegram.ui.ed
                public final /* synthetic */ ld b;

                {
                    this.b = ldVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i12) {
                        case 0:
                            ld ldVar2 = this.b;
                            if (i17 != 5) {
                                ldVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(ldVar2.c.getEditText().getText())) {
                                ldVar2.w.requestFocus();
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
            org.telegram.ui.Components.ku kuVar3 = ldVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(kuVar3, w7.y5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ldVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ldVar.w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ldVar.w;
            int i17 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
            ldVar.w.setBackgroundDrawable(null);
            ldVar.w.setLineColors(ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.k6), ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.l6), ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.p7));
            ldVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            ldVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            ldVar.w.setInputType(180225);
            ldVar.w.setImeOptions(6);
            ldVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ldVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ldVar.w.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
            ldVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            ldVar.w.setCursorWidth(1.5f);
            ldVar.K.addView(ldVar.w, w7.y5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ldVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(ldVar) { // from class: org.telegram.ui.ed
                public final /* synthetic */ ld b;

                {
                    this.b = ldVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i10) {
                        case 0:
                            ld ldVar2 = this.b;
                            if (i172 != 5) {
                                ldVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(ldVar2.c.getEditText().getText())) {
                                ldVar2.w.requestFocus();
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
            ldVar.w.addTextChangedListener(new kd(0));
            TextView textView = new TextView(context);
            ldVar.T = textView;
            textView.setTextSize(1, 15.0f);
            ldVar.T.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F6, false));
            ldVar.T.setGravity(LocaleController.isRTL ? 5 : 3);
            ldVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            ldVar.K.addView(ldVar.T, w7.y5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ldVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            ldVar.K = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(ldVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ldVar.getMessagesController();
            long j3 = ldVar.i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            ldVar.I = z15;
            ldVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = ldVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.h6.a7;
            view.setTag(Integer.valueOf(i18));
            ldVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i18, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ldVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ldVar.G;
            int i19 = org.telegram.ui.ActionBar.h6.d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i19, false));
            ldVar.G.setText(LocaleController.getString(ldVar.I ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            ldVar.K.addView(ldVar.G);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ldVar.F = linearLayout3;
            linearLayout3.setOrientation(1);
            ldVar.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i19, false));
            ldVar.K.addView(ldVar.F, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            ldVar.Q = j6Var;
            j6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            Boolean bool = ldVar.k0;
            if (bool != null && !bool.booleanValue()) {
                ldVar.a0 = true;
            }
            if (ldVar.I) {
                ldVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ldVar.a0);
            } else {
                ldVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ldVar.a0);
            }
            ldVar.Q.setOnClickListener(new dd(ldVar, i13));
            if (bool == null || bool.booleanValue()) {
                ldVar.F.addView(ldVar.Q, w7.y5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            ldVar.R = j6Var2;
            j6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ldVar.a0 = false;
            }
            if (ldVar.I) {
                ldVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ldVar.a0);
            } else {
                ldVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ldVar.a0);
            }
            ldVar.R.setOnClickListener(new dd(ldVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ldVar.F.addView(ldVar.R, w7.y5.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            ldVar.d = b7Var;
            ldVar.K.addView(b7Var, w7.y5.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            ldVar.M = linearLayout4;
            linearLayout4.setOrientation(1);
            ldVar.M.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i19, false));
            ldVar.K.addView(ldVar.M, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
            ldVar.V = m4Var3;
            ldVar.M.addView(m4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            ldVar.N = linearLayout5;
            linearLayout5.setOrientation(0);
            ldVar.M.addView(ldVar.N, w7.y5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            ldVar.H = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/");
            ldVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = ldVar.H;
            int i20 = org.telegram.ui.ActionBar.h6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i20, false));
            EditTextBoldCursor editTextBoldCursor5 = ldVar.H;
            int i21 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i21, false));
            ldVar.H.setMaxLines(1);
            ldVar.H.setLines(1);
            ldVar.H.setEnabled(false);
            ldVar.H.setBackgroundDrawable(null);
            ldVar.H.setPadding(0, 0, 0, 0);
            ldVar.H.setSingleLine(true);
            ldVar.H.setInputType(163840);
            ldVar.H.setImeOptions(6);
            ldVar.N.addView(ldVar.H, w7.y5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            ldVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            ldVar.w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i20, false));
            ldVar.w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i21, false));
            ldVar.w.setMaxLines(1);
            ldVar.w.setLines(1);
            ldVar.w.setBackgroundDrawable(null);
            ldVar.w.setPadding(0, 0, 0, 0);
            ldVar.w.setSingleLine(true);
            ldVar.w.setInputType(163872);
            ldVar.w.setImeOptions(6);
            ldVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ldVar.w.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i21, false));
            ldVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            ldVar.w.setCursorWidth(1.5f);
            ldVar.N.addView(ldVar.w, w7.y5.n(-1, 36));
            ldVar.w.addTextChangedListener(new m0(ldVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            ldVar.O = linearLayout6;
            linearLayout6.setOrientation(1);
            ldVar.M.addView(ldVar.O, w7.y5.n(-1, -2));
            org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, ldVar, null, true, ChatObject.isChannel(ldVar.getMessagesController().getChat(Long.valueOf(j3))));
            ldVar.P = g90Var;
            g90Var.b(true);
            ldVar.P.d(0, null, false);
            ldVar.O.addView(ldVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(ldVar, context, 3);
            ldVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
            ldVar.U.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.K6, false));
            ldVar.U.setTextSize(1, 15.0f);
            ldVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            ldVar.U.setVisibility(8);
            ldVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            ldVar.M.addView(ldVar.U, w7.y5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            ldVar.S = e9Var;
            int i22 = R.drawable.greydivider_bottom;
            int i23 = org.telegram.ui.ActionBar.h6.b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i22, i23));
            ldVar.K.addView(ldVar.S, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ldVar.g0 = s4Var;
            ldVar.K.addView(s4Var, w7.y5.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ldVar.L = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i19, false));
            ldVar.L.setOrientation(1);
            ldVar.K.addView(ldVar.L, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            ldVar.e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i23));
            ldVar.K.addView(ldVar.e0, w7.y5.n(-1, -2));
            ldVar.h0();
        }
        return ldVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.U.setVisibility(8);
        } else {
            this.U.setVisibility(0);
        }
        org.telegram.ui.ActionBar.a6 a6Var = this.Y;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
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
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.y1 y1Var2 = this.U;
                    int i12 = org.telegram.ui.ActionBar.h6.p7;
                    y1Var2.setTag(Integer.valueOf(i12));
                    this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.y1 y1Var3 = this.U;
                    int i13 = org.telegram.ui.ActionBar.h6.p7;
                    y1Var3.setTag(Integer.valueOf(i13));
                    this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.y1 y1Var4 = this.U;
            int i14 = org.telegram.ui.ActionBar.h6.p7;
            y1Var4.setTag(Integer.valueOf(i14));
            this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.h6.p7;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
            return false;
        }
        this.U.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.h6.F6;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        this.X = str;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(21, this, str);
        this.Y = a6Var2;
        AndroidUtilities.runOnUIThread(a6Var2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.a2 a2Var = this.u0;
            if (a2Var != null) {
                try {
                    a2Var.dismiss();
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
            org.telegram.ui.ActionBar.a2 a2Var2 = this.u0;
            if (a2Var2 != null) {
                try {
                    a2Var2.dismiss();
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
            ld ldVar = new ld(bundle);
            ldVar.t0 = this.t0;
            presentFragment(ldVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var == null || !v40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.v40 v40Var = this.v;
        return (v40Var == null || dialog != v40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.u40
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
            id idVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(idVar, (Property<id, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<jd, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            id idVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(idVar2, (Property<id, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<jd, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new ai.n(27, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = true;
        j0Var.H0 = new cd(this, 0);
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
            ofFloat.addUpdateListener(new c3(this, 4));
            this.w0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.w0.setInterpolator(org.telegram.ui.Components.rr.f);
            this.w0.start();
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ vu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        org.telegram.ui.Components.ku kuVar = this.c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.ku kuVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kuVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.ku kuVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.h6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.ku kuVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.h6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.h6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.b7 b7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(b7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.h6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.h6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.h6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.h6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
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
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i11 = org.telegram.ui.ActionBar.h6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var2 = this.S;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
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
            org.telegram.ui.Components.g90 g90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c0;
            g90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.a0 && y1Var.length() != 0) {
                i10 = 0;
            }
            y1Var.setVisibility(i10);
        } else {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var3 = this.S;
            int i12 = org.telegram.ui.ActionBar.h6.p7;
            e9Var3.setTag(Integer.valueOf(i12));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = this.S;
                e9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(e9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
                this.e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var5 = this.S;
                e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(e9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
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

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var != null) {
            v40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar == null || !kuVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        kuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new bd(this, 3));
            }
        }
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var != null) {
            v40Var.a = this;
            v40Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.s0.intValue(), true);
            this.s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var != null) {
            v40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.r();
        }
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var != null) {
            v40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var != null) {
            v40Var.k(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ku kuVar = this.c;
        if (kuVar != null) {
            kuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.v40 v40Var = this.v;
        if (v40Var != null) {
            v40Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.h0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.fu fuVar = this.c.a;
        fuVar.requestFocus();
        AndroidUtilities.showKeyboard(fuVar);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.h0 == 0) {
            org.telegram.ui.Components.v40 v40Var = this.v;
            if (v40Var != null) {
                v40Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ku kuVar = this.c;
                if (kuVar != null) {
                    kuVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.h0 == 0) {
            org.telegram.ui.Components.v40 v40Var = this.v;
            if (v40Var != null && (str = v40Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ku kuVar = this.c;
            if (kuVar != null) {
                String obj = kuVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ void P() {
    }
}
