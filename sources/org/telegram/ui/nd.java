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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.v40 {
    public String B;
    public LinearLayout C;
    public org.telegram.ui.Cells.m4 D;
    public EditTextBoldCursor E;
    public boolean F;
    public org.telegram.ui.Components.gj0 G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public LinearLayout L;
    public org.telegram.ui.Components.x80 M;
    public org.telegram.ui.Cells.i6 N;
    public org.telegram.ui.Cells.i6 O;
    public org.telegram.ui.Cells.a9 P;
    public TextView Q;
    public org.telegram.ui.Cells.x1 R;
    public org.telegram.ui.Cells.m4 S;
    public int T;
    public String U;
    public yb V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public TLRPC.TL_chatInviteExported Z;
    public org.telegram.ui.ActionBar.w0 a;
    public boolean a0;
    public org.telegram.ui.Components.mr b;
    public org.telegram.ui.Cells.a9 b0;
    public org.telegram.ui.Components.du c;
    public final ArrayList c0;
    public org.telegram.ui.Cells.z6 d;
    public org.telegram.ui.Cells.s4 d0;
    public nh.y3 e;
    public final int e0;
    public eg.i0 f;
    public final long f0;
    public boolean g0;
    public kd h;
    public final Boolean h0;
    public TLRPC.InputFile i0;
    public TLRPC.InputFile j0;
    public TLRPC.VideoSize k0;
    public String l0;
    public double m0;
    public AnimatorSet n;
    public boolean n0;
    public boolean o0;
    public Integer p0;
    public Utilities.Callback2 q0;
    public ld r;
    public org.telegram.ui.ActionBar.d2 r0;
    public final org.telegram.ui.Components.z8 s;
    public final ed s0;
    public ValueAnimator t0;
    public final org.telegram.ui.Components.w40 v;
    public EditTextBoldCursor w;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public nd(Bundle bundle) {
        super(bundle);
        this.c0 = new ArrayList();
        this.g0 = true;
        this.s0 = new ed(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.e0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.h0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            this.v = new org.telegram.ui.Components.w40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z4 = bundle.getBoolean("canCreatePublic", true);
            this.g0 = z4;
            this.X = !z4;
            if (!z4 && !this.a0) {
                this.a0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.f0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(nd ndVar, org.telegram.ui.ActionBar.d2 d2Var) {
        ndVar.o0 = false;
        ndVar.n0 = false;
        if (ndVar.p0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.p0.intValue(), true);
            ndVar.p0 = null;
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
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.f0);
        ndVar.T = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new ba(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        if (currentChannel.megagroup) {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new mg.w(12, ndVar, currentChannel));
        ndVar.showDialog(d2Var);
    }

    public static void Y(nd ndVar) {
        if (ndVar.r0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new a1(ndVar, 12));
        ndVar.r0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.v40
    public final void D(float f10) {
        ld ldVar = this.r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.v40
    public final void I(boolean z4, boolean z10) {
        ld ldVar = this.r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.v40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        final nd ndVar = this;
        org.telegram.ui.Components.du duVar = ndVar.c;
        if (duVar != null) {
            duVar.o();
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
        org.telegram.ui.Components.mr mrVar = new org.telegram.ui.Components.mr(mutate, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        ndVar.b = mrVar;
        ndVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), mrVar);
        int i13 = 2;
        int i14 = ndVar.e0;
        if (i14 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(i12, context, ndVar);
            jdVar.setOnTouchListener(new oh.d(i13));
            ndVar.fragmentView = jdVar;
            int i15 = org.telegram.ui.ActionBar.j6.d6;
            jdVar.setTag(Integer.valueOf(i15));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.H = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.H, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.H.addView(frameLayout, k7.b6.n(-1, -2));
            nh.y3 y3Var = new nh.y3(ndVar, context, 4);
            ndVar.e = y3Var;
            y3Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.z8 z8Var = ndVar.s;
            z8Var.n(5L, null, null);
            ndVar.e.setImageDrawable(z8Var);
            nh.y3 y3Var2 = ndVar.e;
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(y3Var2, k7.b6.d(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            eg.i0 i0Var = new eg.i0(ndVar, context, paint, i10);
            ndVar.f = i0Var;
            i0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            eg.i0 i0Var2 = ndVar.f;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(i0Var2, k7.b6.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            ndVar.f.setOnClickListener(new fd(ndVar, i10));
            ndVar.G = new org.telegram.ui.Components.gj0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            kd kdVar = new kd(ndVar, context, 0);
            ndVar.h = kdVar;
            kdVar.setScaleType(ImageView.ScaleType.CENTER);
            ndVar.h.setAnimation(ndVar.G);
            ndVar.h.setEnabled(false);
            ndVar.h.setClickable(false);
            ndVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            kd kdVar2 = ndVar.h;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(kdVar2, k7.b6.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 15.0f, 12.0f, z11 ? 15.0f : 0.0f, 12.0f));
            ld ldVar = new ld(ndVar, context, i12);
            ndVar.r = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.r.setProgressColor(-1);
            ndVar.r.setNoProgress(false);
            ld ldVar2 = ndVar.r;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(ldVar2, k7.b6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 12.0f));
            ndVar.e0(false, false);
            org.telegram.ui.Components.du duVar2 = new org.telegram.ui.Components.du(context, jdVar, ndVar, 0, false, null);
            ndVar = ndVar;
            ndVar.c = duVar2;
            duVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.B;
            if (str != null) {
                ndVar.c.setText(str);
                ndVar.B = null;
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
            org.telegram.ui.Components.du duVar3 = ndVar.c;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(duVar3, k7.b6.d(-1, -2.0f, 16, z13 ? 5.0f : 96.0f, 0.0f, z13 ? 96.0f : 5.0f, 0.0f));
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
            ndVar.H.addView(ndVar.w, k7.b6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
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
            ndVar.Q = textView;
            textView.setTextSize(1, 15.0f);
            ndVar.Q.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
            ndVar.Q.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.Q.setText(LocaleController.getString(R.string.DescriptionInfo));
            ndVar.H.addView(ndVar.Q, k7.b6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i14 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            ndVar.H = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(ndVar.H, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j10 = ndVar.f0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z14 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            ndVar.F = z14;
            ndVar.actionBar.setTitle(LocaleController.getString(z14 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = ndVar.fragmentView;
            int i17 = org.telegram.ui.ActionBar.j6.a7;
            view.setTag(Integer.valueOf(i17));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ndVar.D = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ndVar.D;
            int i18 = org.telegram.ui.ActionBar.j6.d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.D.setText(LocaleController.getString(ndVar.F ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            ndVar.H.addView(ndVar.D);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.C = linearLayout3;
            linearLayout3.setOrientation(1);
            ndVar.C.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.H.addView(ndVar.C, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            ndVar.N = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            Boolean bool = ndVar.h0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.X = true;
            }
            if (ndVar.F) {
                ndVar.N.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.X);
            } else {
                ndVar.N.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.X);
            }
            ndVar.N.setOnClickListener(new fd(ndVar, i13));
            if (bool == null || bool.booleanValue()) {
                ndVar.C.addView(ndVar.N, k7.b6.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            ndVar.O = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ndVar.X = false;
            }
            if (ndVar.F) {
                ndVar.O.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.X);
            } else {
                ndVar.O.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.X);
            }
            ndVar.O.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.C.addView(ndVar.O, k7.b6.n(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
            ndVar.d = z6Var;
            ndVar.H.addView(z6Var, k7.b6.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            ndVar.J = linearLayout4;
            linearLayout4.setOrientation(1);
            ndVar.J.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.H.addView(ndVar.J, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
            ndVar.S = m4Var3;
            ndVar.J.addView(m4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.K = linearLayout5;
            linearLayout5.setOrientation(0);
            ndVar.J.addView(ndVar.K, k7.b6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            ndVar.E = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.E.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = ndVar.E;
            int i19 = org.telegram.ui.ActionBar.j6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            EditTextBoldCursor editTextBoldCursor5 = ndVar.E;
            int i20 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            ndVar.E.setMaxLines(1);
            ndVar.E.setLines(1);
            ndVar.E.setEnabled(false);
            ndVar.E.setBackgroundDrawable(null);
            ndVar.E.setPadding(0, 0, 0, 0);
            ndVar.E.setSingleLine(true);
            ndVar.E.setInputType(163840);
            ndVar.E.setImeOptions(6);
            ndVar.K.addView(ndVar.E, k7.b6.n(-2, 36));
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
            ndVar.K.addView(ndVar.w, k7.b6.n(-1, 36));
            ndVar.w.addTextChangedListener(new n0(ndVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.L = linearLayout6;
            linearLayout6.setOrientation(1);
            ndVar.J.addView(ndVar.L, k7.b6.n(-1, -2));
            org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j10))));
            ndVar.M = x80Var;
            x80Var.b(true);
            ndVar.M.d(0, null, false);
            ndVar.L.addView(ndVar.M);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(ndVar, context, 3);
            ndVar.R = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            ndVar.R.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
            ndVar.R.setTextSize(1, 15.0f);
            ndVar.R.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.R.setVisibility(8);
            ndVar.R.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            ndVar.J.addView(ndVar.R, k7.b6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            ndVar.P = a9Var;
            int i21 = R.drawable.greydivider_bottom;
            int i22 = org.telegram.ui.ActionBar.j6.b7;
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i21, i22));
            ndVar.H.addView(ndVar.P, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ndVar.d0 = s4Var;
            ndVar.H.addView(s4Var, k7.b6.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.I = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            ndVar.I.setOrientation(1);
            ndVar.H.addView(ndVar.I, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            ndVar.b0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i22));
            ndVar.H.addView(ndVar.b0, k7.b6.n(-1, -2));
            ndVar.h0();
        }
        return ndVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.R.setVisibility(8);
        } else {
            this.R.setVisibility(0);
        }
        yb ybVar = this.V;
        if (ybVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ybVar);
            this.V = null;
            this.U = null;
            if (this.T != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.T, true);
            }
        }
        this.W = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.R.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var = this.R;
                int i10 = org.telegram.ui.ActionBar.j6.p7;
                x1Var.setTag(Integer.valueOf(i10));
                this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.R.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.x1 x1Var2 = this.R;
                    int i12 = org.telegram.ui.ActionBar.j6.p7;
                    x1Var2.setTag(Integer.valueOf(i12));
                    this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.R.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.x1 x1Var3 = this.R;
                    int i13 = org.telegram.ui.ActionBar.j6.p7;
                    x1Var3.setTag(Integer.valueOf(i13));
                    this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.R.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.x1 x1Var4 = this.R;
            int i14 = org.telegram.ui.ActionBar.j6.p7;
            x1Var4.setTag(Integer.valueOf(i14));
            this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.R.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.x1 x1Var5 = this.R;
            int i15 = org.telegram.ui.ActionBar.j6.p7;
            x1Var5.setTag(Integer.valueOf(i15));
            this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            return false;
        }
        this.R.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.x1 x1Var6 = this.R;
        int i16 = org.telegram.ui.ActionBar.j6.F6;
        x1Var6.setTag(Integer.valueOf(i16));
        this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.U = str;
        yb ybVar2 = new yb(4, this, str);
        this.V = ybVar2;
        AndroidUtilities.runOnUIThread(ybVar2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.d2 d2Var = this.r0;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                    this.r0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.o0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.d2 d2Var2 = this.r0;
            if (d2Var2 != null) {
                try {
                    d2Var2.dismiss();
                    this.r0 = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.g0);
            Boolean bool = this.h0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.i0 != null || this.j0 != null || this.k0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.i0, this.j0, this.k0, this.m0, this.l0, this.x, this.y, null);
            }
            nd ndVar = new nd(bundle);
            ndVar.q0 = this.q0;
            presentFragment(ndVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var == null || !w40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.w40 w40Var = this.v;
        return (w40Var == null || dialog != w40Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z4, boolean z10) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        if (!z10) {
            if (z4) {
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
        if (z4) {
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
        this.n.addListener(new dg.w2(19, this, z4));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.s0 = true;
        v0Var.E0 = new ed(this, 0);
        showDialog(v0Var);
    }

    public final void g0(boolean z4) {
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.s0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z4 ? 1.0f : 0.0f);
            this.t0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 4));
            this.t0.setDuration((long) (Math.abs(this.b.c - (z4 ? 1.0f : 0.0f)) * 200.0f));
            this.t0.setInterpolator(org.telegram.ui.Components.nr.f);
            this.t0.start();
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.v40
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        org.telegram.ui.Components.du duVar = this.c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(duVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.du duVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(duVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.du duVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(duVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.du duVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(duVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.Q;
        int i15 = org.telegram.ui.ActionBar.j6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.z6 z6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.x1 x1Var = this.R;
        int i18 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(x1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.L;
        int i19 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.X || this.g0) {
            org.telegram.ui.Cells.a9 a9Var = this.P;
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            a9Var.setTag(Integer.valueOf(i11));
            this.P.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.b0.setVisibility(8);
            this.I.setVisibility(8);
            org.telegram.ui.Cells.a9 a9Var2 = this.P;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(a9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            this.J.setVisibility(0);
            this.d0.setVisibility(8);
            if (this.F) {
                this.P.setText(LocaleController.getString(this.X ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.S.setText(LocaleController.getString(this.X ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.P.setText(LocaleController.getString(this.X ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.S.setText(LocaleController.getString(this.X ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.K.setVisibility(this.X ? 8 : 0);
            this.L.setVisibility(this.X ? 0 : 8);
            this.J.setPadding(0, 0, 0, this.X ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.x80 x80Var = this.M;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Z;
            x80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.x1 x1Var = this.R;
            if (!this.X && x1Var.length() != 0) {
                i10 = 0;
            }
            x1Var.setVisibility(i10);
        } else {
            this.P.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.a9 a9Var3 = this.P;
            int i12 = org.telegram.ui.ActionBar.j6.p7;
            a9Var3.setTag(Integer.valueOf(i12));
            this.P.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.J.setVisibility(8);
            this.d.setVisibility(8);
            if (this.a0) {
                this.d0.setVisibility(0);
                this.I.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var4 = this.P;
                a9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(a9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                this.b0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.a9 a9Var5 = this.P;
                a9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(a9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
                this.d0.setVisibility(8);
                this.I.setVisibility(0);
                this.b0.setVisibility(0);
            }
        }
        this.N.a(!this.X);
        this.O.a(this.X);
        this.w.clearFocus();
        AndroidUtilities.hideKeyboard(this.w);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.du duVar = this.c;
        if (duVar == null || !duVar.e) {
            return true;
        }
        if (!z4) {
            return false;
        }
        duVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.e0 == 1 && !this.Y && this.Z == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.Z = chatFull.exported_invite;
            }
            if (this.Z == null) {
                this.Y = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.a = this;
            w40Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.p0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.p0.intValue(), true);
            this.p0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.du duVar = this.c;
        if (duVar != null) {
            duVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.du duVar = this.c;
        if (duVar != null) {
            duVar.r();
        }
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.k(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.du duVar = this.c;
        if (duVar != null) {
            duVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 || this.e0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.yt ytVar = this.c.a;
        ytVar.requestFocus();
        AndroidUtilities.showKeyboard(ytVar);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.e0 == 0) {
            org.telegram.ui.Components.w40 w40Var = this.v;
            if (w40Var != null) {
                w40Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.du duVar = this.c;
                if (duVar != null) {
                    duVar.setText(string);
                } else {
                    this.B = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.e0 == 0) {
            org.telegram.ui.Components.w40 w40Var = this.v;
            if (w40Var != null && (str = w40Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.du duVar = this.c;
            if (duVar != null) {
                String obj = duVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void P() {
    }
}
