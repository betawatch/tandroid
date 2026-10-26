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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nd extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50 {
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.q4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.xj0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.r90 Q;
    public org.telegram.ui.Cells.n6 R;
    public org.telegram.ui.Cells.n6 S;
    public org.telegram.ui.Cells.i9 T;
    public TextView U;
    public org.telegram.ui.Cells.w1 V;
    public org.telegram.ui.Cells.q4 W;
    public int X;
    public String Y;
    public org.telegram.messenger.voip.m0 Z;
    public org.telegram.ui.ActionBar.w0 a;
    public boolean a0;
    public org.telegram.ui.Components.cs b;
    public boolean b0;
    public org.telegram.ui.Components.gq c;
    public boolean c0;
    public org.telegram.ui.Components.ru d;
    public TLRPC.TL_chatInviteExported d0;
    public org.telegram.ui.Cells.f7 e;
    public boolean e0;
    public di.k4 f;
    public org.telegram.ui.Cells.i9 f0;
    public final ArrayList g0;
    public fi.f6 h;
    public org.telegram.ui.Cells.w4 h0;
    public final int i0;
    public final long j0;
    public boolean k0;
    public final Boolean l0;
    public TLRPC.InputFile m0;
    public kd n;
    public TLRPC.InputFile n0;
    public TLRPC.VideoSize o0;
    public String p0;
    public double q0;
    public AnimatorSet r;
    public boolean r0;
    public ld s;
    public boolean s0;
    public Integer t0;
    public Utilities.Callback2 u0;
    public final org.telegram.ui.Components.j9 v;
    public org.telegram.ui.ActionBar.e2 v0;
    public final org.telegram.ui.Components.g50 w;
    public final cd w0;
    public EditTextBoldCursor x;
    public ValueAnimator x0;
    public TLRPC.FileLocation y;
    public int y0;

    public nd(Bundle bundle) {
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
            this.v = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            this.w = new org.telegram.ui.Components.g50(1, true, true);
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
                j0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.j0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void V(nd ndVar, org.telegram.ui.ActionBar.e2 e2Var) {
        ndVar.s0 = false;
        ndVar.r0 = false;
        if (ndVar.t0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.t0.intValue(), true);
            ndVar.t0 = null;
        }
        ndVar.i0(false);
        e2Var.dismiss();
    }

    public static /* synthetic */ void W(nd ndVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(ndVar, 2), 64);
    }

    public static /* synthetic */ void X(nd ndVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.j0);
        ndVar.X = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new ea(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void Y(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        if (currentChannel.megagroup) {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.s0(12, ndVar, currentChannel));
        ndVar.showDialog(e2Var);
    }

    public static void Z(nd ndVar) {
        if (ndVar.v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new y0(ndVar, 14));
        ndVar.v0 = alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        ld ldVar = this.s;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        ld ldVar = this.s;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10;
        final nd ndVar = this;
        org.telegram.ui.Components.ru ruVar = ndVar.d;
        if (ruVar != null) {
            ruVar.o();
        }
        ndVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 1;
        ndVar.actionBar.setAllowOverlayTitle(true);
        ndVar.actionBar.setActionBarMenuOnItemClick(new id(ndVar));
        org.telegram.ui.ActionBar.z l4 = ndVar.actionBar.l();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = org.telegram.ui.ActionBar.y6.v8;
        final int i13 = 0;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.gq gqVar = new org.telegram.ui.Components.gq(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        ndVar.c = gqVar;
        org.telegram.ui.Components.cs csVar = new org.telegram.ui.Components.cs(mutate, gqVar);
        ndVar.b = csVar;
        int dp = AndroidUtilities.dp(56.0f);
        String string = LocaleController.getString(R.string.Done);
        org.telegram.ui.ActionBar.k kVar = l4.b;
        org.telegram.ui.ActionBar.w0 b10 = l4.b(1, 0, null, l4.c ? kVar.q0 : kVar.p0, csVar, dp, string, null);
        ndVar.a = b10;
        org.telegram.ui.ActionBar.f7.y(b10, mutate, i12, null, mode);
        int i14 = 2;
        int i15 = 3;
        int i16 = 5;
        int i17 = ndVar.i0;
        if (i17 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(i13, context, ndVar);
            jdVar.setOnTouchListener(new ei.d(i14));
            ndVar.fragmentView = jdVar;
            int i18 = org.telegram.ui.ActionBar.y6.d6;
            jdVar.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.f7.i(i18, ndVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.L = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.L.addView(frameLayout, org.telegram.ui.Components.gb1.r(-1, -2));
            di.k4 k4Var = new di.k4(ndVar, context, i16);
            ndVar.f = k4Var;
            k4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.j9 j9Var = ndVar.v;
            j9Var.n(5L, null, null);
            ndVar.f.setImageDrawable(j9Var);
            di.k4 k4Var2 = ndVar.f;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(k4Var2, org.telegram.ui.Components.gb1.h(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fi.f6 f6Var = new fi.f6(ndVar, context, paint, i15);
            ndVar.h = f6Var;
            f6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            fi.f6 f6Var2 = ndVar.h;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(f6Var2, org.telegram.ui.Components.gb1.h(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            ndVar.h.setOnClickListener(new fd(ndVar, i11));
            ndVar.K = new org.telegram.ui.Components.xj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            kd kdVar = new kd(ndVar, context, 0);
            ndVar.n = kdVar;
            kdVar.setScaleType(ImageView.ScaleType.CENTER);
            ndVar.n.setAnimation(ndVar.K);
            ndVar.n.setEnabled(false);
            ndVar.n.setClickable(false);
            ndVar.n.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            kd kdVar2 = ndVar.n;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(kdVar2, org.telegram.ui.Components.gb1.h(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            ld ldVar = new ld(ndVar, context, i13);
            ndVar.s = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.s.setProgressColor(-1);
            ndVar.s.setNoProgress(false);
            ld ldVar2 = ndVar.s;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(ldVar2, org.telegram.ui.Components.gb1.h(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            ndVar.g0(false, false);
            org.telegram.ui.Components.ru ruVar2 = new org.telegram.ui.Components.ru(context, jdVar, this, 0, false, null);
            ndVar = this;
            ndVar.d = ruVar2;
            ruVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.F;
            if (str != null) {
                ndVar.d.setText(str);
                ndVar.F = null;
            }
            ndVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ndVar.d.getEditText().setSingleLine(true);
            ndVar.d.getEditText().setImeOptions(5);
            ndVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) { // from class: org.telegram.ui.gd
                public final /* synthetic */ nd b;

                {
                    this.b = ndVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i19, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i13) {
                        case 0:
                            nd ndVar2 = this.b;
                            if (i19 != 5) {
                                ndVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(ndVar2.d.getEditText().getText())) {
                                ndVar2.x.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i19 == 6 && (w0Var = this.b.a) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.ru ruVar3 = ndVar.d;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(ruVar3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ndVar.x = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.f7.E(ndVar.x, org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = ndVar.x;
            int i19 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i19, null);
            ndVar.x.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.f7.G(ndVar.x, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, ndVar.getResourceProvider());
            ndVar.x.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            ndVar.x.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.x.setInputType(180225);
            ndVar.x.setImeOptions(6);
            ndVar.x.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ndVar.x.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            org.telegram.ui.ActionBar.f7.w(ndVar.x, i19, null);
            ndVar.x.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.x.setCursorWidth(1.5f);
            ndVar.L.addView(ndVar.x, org.telegram.ui.Components.gb1.o(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ndVar.x.setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) { // from class: org.telegram.ui.gd
                public final /* synthetic */ nd b;

                {
                    this.b = ndVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i192, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i11) {
                        case 0:
                            nd ndVar2 = this.b;
                            if (i192 != 5) {
                                ndVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(ndVar2.d.getEditText().getText())) {
                                ndVar2.x.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i192 == 6 && (w0Var = this.b.a) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            ndVar.x.addTextChangedListener(new md(0));
            TextView textView = new TextView(context);
            ndVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(ndVar.U, org.telegram.ui.ActionBar.y6.F6, null);
            ndVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.U.setText(LocaleController.getString(R.string.DescriptionInfo));
            ndVar.L.addView(ndVar.U, org.telegram.ui.Components.gb1.x(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i17 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            ndVar.L = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(ndVar.L, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j10 = ndVar.j0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            ndVar.J = z15;
            ndVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = ndVar.fragmentView;
            int i20 = org.telegram.ui.ActionBar.y6.a7;
            view.setTag(Integer.valueOf(i20));
            org.telegram.ui.ActionBar.f7.i(i20, ndVar.fragmentView, null);
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 23);
            ndVar.H = q4Var;
            q4Var.setHeight(46);
            org.telegram.ui.Cells.q4 q4Var2 = ndVar.H;
            int i21 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i21, q4Var2, null);
            ndVar.H.setText(LocaleController.getString(ndVar.J ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            ndVar.L.addView(ndVar.H);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.G = linearLayout3;
            linearLayout3.setOrientation(1);
            org.telegram.ui.ActionBar.f7.i(i21, ndVar.G, null);
            ndVar.L.addView(ndVar.G, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, false);
            ndVar.R = n6Var;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(false);
            int i22 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i22);
            n6Var.setBackground(M0);
            org.telegram.ui.ActionBar.f7.k(n6Var, M0, null, N, null);
            Boolean bool = ndVar.l0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.b0 = true;
            }
            if (ndVar.J) {
                i10 = 1;
                ndVar.R.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.b0);
            } else {
                i10 = 1;
                ndVar.R.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.b0);
            }
            ndVar.R.setOnClickListener(new fd(ndVar, i14));
            if (bool == null || bool.booleanValue()) {
                ndVar.G.addView(ndVar.R, org.telegram.ui.Components.gb1.r(-1, -2));
            }
            org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(context, false);
            ndVar.S = n6Var2;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(false);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i22);
            n6Var2.setBackground(M02);
            org.telegram.ui.ActionBar.f7.k(n6Var2, M02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                ndVar.b0 = false;
            }
            if (ndVar.J) {
                ndVar.S.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.b0);
            } else {
                ndVar.S.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.b0);
            }
            ndVar.S.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.G.addView(ndVar.S, org.telegram.ui.Components.gb1.r(-1, -2));
            }
            org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            ndVar.e = f7Var;
            ndVar.L.addView(f7Var, org.telegram.ui.Components.gb1.r(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            ndVar.N = linearLayout4;
            linearLayout4.setOrientation(i10);
            org.telegram.ui.ActionBar.f7.i(i21, ndVar.N, null);
            ndVar.L.addView(ndVar.N, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(context);
            ndVar.W = q4Var3;
            ndVar.N.addView(q4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.O = linearLayout5;
            linearLayout5.setOrientation(0);
            ndVar.N.addView(ndVar.O, org.telegram.ui.Components.gb1.o(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            ndVar.I = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = ndVar.I;
            int i23 = org.telegram.ui.ActionBar.y6.H6;
            org.telegram.ui.ActionBar.f7.E(editTextBoldCursor4, i23, null);
            EditTextBoldCursor editTextBoldCursor5 = ndVar.I;
            int i24 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor5, i24, null);
            ndVar.I.setMaxLines(1);
            ndVar.I.setLines(1);
            ndVar.I.setEnabled(false);
            ndVar.I.setBackgroundDrawable(null);
            ndVar.I.setPadding(0, 0, 0, 0);
            ndVar.I.setSingleLine(true);
            ndVar.I.setInputType(163840);
            ndVar.I.setImeOptions(6);
            ndVar.O.addView(ndVar.I, org.telegram.ui.Components.gb1.r(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            ndVar.x = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.f7.E(ndVar.x, i23, null);
            org.telegram.ui.ActionBar.f7.V(ndVar.x, i24, null);
            ndVar.x.setMaxLines(1);
            ndVar.x.setLines(1);
            ndVar.x.setBackgroundDrawable(null);
            ndVar.x.setPadding(0, 0, 0, 0);
            ndVar.x.setSingleLine(true);
            ndVar.x.setInputType(163872);
            ndVar.x.setImeOptions(6);
            ndVar.x.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            org.telegram.ui.ActionBar.f7.w(ndVar.x, i24, null);
            ndVar.x.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.x.setCursorWidth(1.5f);
            ndVar.O.addView(ndVar.x, org.telegram.ui.Components.gb1.r(-1, 36));
            ndVar.x.addTextChangedListener(new m0(ndVar, 1));
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.P = linearLayout6;
            linearLayout6.setOrientation(1);
            ndVar.N.addView(ndVar.P, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j10))));
            ndVar.Q = r90Var;
            r90Var.b(true);
            ndVar.Q.d(0, null, false);
            ndVar.P.addView(ndVar.Q);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(ndVar, context, 3);
            ndVar.V = w1Var;
            org.telegram.ui.ActionBar.f7.H(w1Var, org.telegram.ui.ActionBar.y6.J6, null);
            org.telegram.ui.ActionBar.f7.D(ndVar.V, org.telegram.ui.ActionBar.y6.K6, null);
            ndVar.V.setTextSize(1, 15.0f);
            ndVar.V.setGravity(LocaleController.isRTL ? 5 : 3);
            ndVar.V.setVisibility(8);
            ndVar.V.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            ndVar.N.addView(ndVar.V, org.telegram.ui.Components.gb1.x(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            ndVar.T = i9Var;
            int i25 = R.drawable.greydivider_bottom;
            int i26 = org.telegram.ui.ActionBar.y6.b7;
            org.telegram.ui.ActionBar.f7.a0(i25, i26, context, i9Var, null);
            ndVar.L.addView(ndVar.T, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.w4 w4Var = new org.telegram.ui.Cells.w4(context);
            ndVar.h0 = w4Var;
            ndVar.L.addView(w4Var, org.telegram.ui.Components.gb1.r(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.M = linearLayout7;
            org.telegram.ui.ActionBar.f7.i(i21, linearLayout7, null);
            ndVar.M.setOrientation(1);
            ndVar.L.addView(ndVar.M, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context);
            ndVar.f0 = i9Var2;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i26, context, i9Var2, null);
            ndVar.L.addView(ndVar.f0, org.telegram.ui.Components.gb1.r(-1, -2));
            ndVar.j0();
        }
        return ndVar.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.e2 e2Var = this.v0;
            if (e2Var != null) {
                try {
                    e2Var.dismiss();
                    this.v0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            i0(false);
            this.s0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.e2 e2Var2 = this.v0;
            if (e2Var2 != null) {
                try {
                    e2Var2.dismiss();
                    this.v0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            nd ndVar = new nd(bundle);
            ndVar.u0 = this.u0;
            presentFragment(ndVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var == null || !g50Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.g50 g50Var = this.w;
        return (g50Var == null || dialog != g50Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.U7, false) + ((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T7, false) + ((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.S7, false) + ((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R7, false) + ((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Q7, false) + ((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P7, false) + ((org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O7, false) + (org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
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

    public final boolean f0(String str) {
        if (str == null || str.length() <= 0) {
            this.V.setVisibility(8);
        } else {
            this.V.setVisibility(0);
        }
        org.telegram.messenger.voip.m0 m0Var = this.Z;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
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
                org.telegram.ui.Cells.w1 w1Var = this.V;
                int i10 = org.telegram.ui.ActionBar.y6.p7;
                w1Var.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.f7.V(this.V, i10, null);
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.V.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.w1 w1Var2 = this.V;
                    int i12 = org.telegram.ui.ActionBar.y6.p7;
                    w1Var2.setTag(Integer.valueOf(i12));
                    org.telegram.ui.ActionBar.f7.V(this.V, i12, null);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.w1 w1Var3 = this.V;
                    int i13 = org.telegram.ui.ActionBar.y6.p7;
                    w1Var3.setTag(Integer.valueOf(i13));
                    org.telegram.ui.ActionBar.f7.V(this.V, i13, null);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.V.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.w1 w1Var4 = this.V;
            int i14 = org.telegram.ui.ActionBar.y6.p7;
            w1Var4.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.f7.V(this.V, i14, null);
            return false;
        }
        if (str.length() > 32) {
            this.V.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.w1 w1Var5 = this.V;
            int i15 = org.telegram.ui.ActionBar.y6.p7;
            w1Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.f7.V(this.V, i15, null);
            return false;
        }
        this.V.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.w1 w1Var6 = this.V;
        int i16 = org.telegram.ui.ActionBar.y6.F6;
        w1Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f7.V(this.V, i16, null);
        this.Y = str;
        org.telegram.messenger.voip.m0 m0Var2 = new org.telegram.messenger.voip.m0(29, this, str);
        this.Z = m0Var2;
        AndroidUtilities.runOnUIThread(m0Var2, 300L);
        return true;
    }

    public final void g0(boolean z10, boolean z11) {
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
            kd kdVar = this.n;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, (Property<kd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<ld, Float>) property, 1.0f));
        } else {
            if (this.n.getVisibility() != 0) {
                this.n.setAlpha(0.0f);
            }
            this.n.setVisibility(0);
            AnimatorSet animatorSet3 = this.r;
            kd kdVar2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, (Property<kd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<ld, Float>) property2, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new bh.f0(28, this, z10));
        this.r.start();
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.ru ruVar = this.d;
        int i10 = org.telegram.ui.ActionBar.y6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ruVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.Components.ru ruVar2 = this.d;
        int i11 = org.telegram.ui.ActionBar.y6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ruVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.x, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.x, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.b7));
        LinearLayout linearLayout = this.P;
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h0, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        return arrayList;
    }

    public final void h0() {
        if (getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = true;
        j0Var.H0 = new cd(this, 1);
        showDialog(j0Var);
    }

    public final void i0(boolean z10) {
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
            ofFloat.addUpdateListener(new b3(this, 3));
            this.x0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.x0.setInterpolator(org.telegram.ui.Components.ds.f);
            this.x0.start();
        }
    }

    public final void j0() {
        if (this.e == null) {
            return;
        }
        int i10 = 8;
        if (this.b0 || this.k0) {
            org.telegram.ui.Cells.i9 i9Var = this.T;
            int i11 = org.telegram.ui.ActionBar.y6.B6;
            i9Var.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.f7.V(this.T.getTextView(), i11, null);
            this.e.setVisibility(0);
            this.f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.i9 i9Var2 = this.T;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, i9Var2.getContext(), i9Var2, null);
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
            org.telegram.ui.Cells.w1 w1Var = this.V;
            if (!this.b0 && w1Var.length() != 0) {
                i10 = 0;
            }
            w1Var.setVisibility(i10);
        } else {
            this.T.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.i9 i9Var3 = this.T;
            int i12 = org.telegram.ui.ActionBar.y6.p7;
            i9Var3.setTag(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.f7.V(this.T.getTextView(), i12, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.i9 i9Var4 = this.T;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, i9Var4.getContext(), i9Var4, null);
                this.f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.i9 i9Var5 = this.T;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7, i9Var5.getContext(), i9Var5, null);
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var != null) {
            g50Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar == null || !ruVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        ruVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
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
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var != null) {
            g50Var.a = this;
            g50Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.t0.intValue(), true);
            this.t0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var != null) {
            g50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.r();
        }
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var != null) {
            g50Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var != null) {
            g50Var.j(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.g50 g50Var = this.w;
        if (g50Var != null) {
            g50Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.Components.gq gqVar = this.c;
            if (gqVar != null) {
                gqVar.b(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.v8, false));
            }
            org.telegram.ui.Cells.w4 w4Var = this.h0;
            if (w4Var == null || w4Var.getChildCount() <= 0 || !(this.h0.getChildAt(0) instanceof RadialProgressView)) {
                return;
            }
            ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h6, false));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.i0 == 1) {
            return;
        }
        this.d.requestFocus();
        org.telegram.ui.Components.mu muVar = this.d.a;
        muVar.requestFocus();
        AndroidUtilities.showKeyboard(muVar);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.i0 == 0) {
            org.telegram.ui.Components.g50 g50Var = this.w;
            if (g50Var != null) {
                g50Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ru ruVar = this.d;
                if (ruVar != null) {
                    ruVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.i0 == 0) {
            org.telegram.ui.Components.g50 g50Var = this.w;
            if (g50Var != null && (str = g50Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ru ruVar = this.d;
            if (ruVar != null) {
                String obj = ruVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }
}
