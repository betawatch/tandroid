package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c71 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat U;
    public final TLRPC.User V;
    public final af.b W;
    public TLObject X;
    public final FrameLayout Y;
    public final u61 Z;
    public final w61 a0;
    public final b71 b0;
    public final b71 c0;
    public final b71 d0;
    public final qh.d e0;
    public org.telegram.ui.Components.x51 f0;
    public Context g0;

    public c71(Context context, TLRPC.Chat chat, TLRPC.User user, af.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, false, 2, g6Var);
        this.H = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.U = chat;
        this.V = user;
        this.X = user;
        this.W = bVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.k6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, k7.c6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        u61 u61Var = new u61(context);
        this.Z = u61Var;
        u61Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.R5));
        u61Var.setHintTextColor(getThemedColor(i10));
        u61Var.setTextSize(1, 15.0f);
        u61Var.setSingleLine(true);
        u61Var.setBackground(null);
        u61Var.setCursorWidth(1.5f);
        u61Var.setGravity(112);
        u61Var.setClipToPadding(true);
        u61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        u61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        u61Var.setInputType(u61Var.getInputType() | TLObject.FLAG_19);
        u61Var.setImeOptions(33554435);
        u61Var.setTextIsSelectable(false);
        u61Var.setOnEditorActionListener(new ha(this, 11));
        u61Var.addTextChangedListener(new v61(this));
        u61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(u61Var, k7.c6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, k7.c6.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        w61 w61Var = new w61(context);
        this.a0 = w61Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        w61Var.addView(p9Var, k7.c6.e(130, 130, 17));
        b71 b71Var = new b71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        b71Var.e.add(new xy0(this, 16));
        this.b0 = b71Var;
        b71 b71Var2 = new b71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        b71Var2.e.add(new xy0(this, 16));
        this.c0 = b71Var2;
        b71 b71Var3 = new b71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        b71Var3.e.add(new xy0(this, 16));
        this.d0 = b71Var3;
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new r21(this, 2));
        x61 x61Var = new x61(this);
        x61Var.m = false;
        x61Var.C = false;
        x61Var.o(org.telegram.ui.Components.pr.h);
        x61Var.n(350L);
        this.d.setItemAnimator(x61Var);
        this.d.addOnLayoutChangeListener(new y61(this));
        this.d.j(new z61(this));
        this.containerView.addView(new a71(this, getContext()), k7.c6.e(-1, 68, 87));
        qh.d dVar = new qh.d(getContext(), g6Var, true);
        dVar.setRoundRadius(24);
        this.e0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, k7.c6.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new k31(this, 5));
        org.telegram.ui.Components.x51 x51Var = this.f0;
        if (x51Var != null) {
            x51Var.N(false);
        }
        b71Var.b();
        b71Var2.b();
    }

    public static /* synthetic */ void P(c71 c71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            c71Var.U = MessagesController.getInstance(c71Var.currentAccount).getChat(Long.valueOf(j10));
            c71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(c71 c71Var, ArrayList arrayList) {
        boolean z4;
        boolean z10;
        b71 b71Var = c71Var.d0;
        b71 b71Var2 = c71Var.c0;
        TLRPC.User user = c71Var.V;
        b71 b71Var3 = c71Var.b0;
        if (b71Var3 != null) {
            ArrayList arrayList2 = b71Var3.d;
            if (b71Var2 == null) {
                return;
            }
            ArrayList arrayList3 = b71Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(c71Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.j51.D(3, AndroidUtilities.dp(64.0f)));
            if (b71Var != null && !TextUtils.isEmpty(b71Var.c.q)) {
                ArrayList arrayList4 = b71Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.j51 v = org.telegram.ui.Components.j51.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(c71Var.X));
                        arrayList.add(v);
                    }
                }
                if (b71Var.f) {
                    arrayList.add(org.telegram.ui.Components.j51.n(29));
                    arrayList.add(org.telegram.ui.Components.j51.n(29));
                    arrayList.add(org.telegram.ui.Components.j51.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.j51.k(c71Var.a0));
                    return;
                }
                return;
            }
            if (user != null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                            arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(c71Var.U) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.j51 v10 = org.telegram.ui.Components.j51.v(user);
                            v10.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(c71Var.X));
                            arrayList.add(v10);
                            z4 = false;
                        }
                    }
                }
            }
            z4 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z4) {
                        arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(c71Var.U) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z4 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.j51 v11 = org.telegram.ui.Components.j51.v(tLObject2);
                    v11.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(c71Var.X));
                    arrayList.add(v11);
                }
            }
            if (b71Var3.f) {
                arrayList.add(org.telegram.ui.Components.j51.n(29));
                arrayList.add(org.telegram.ui.Components.j51.n(29));
                arrayList.add(org.telegram.ui.Components.j51.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z10 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(c71Var.U) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.j51 v12 = org.telegram.ui.Components.j51.v(user);
                v12.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(c71Var.X));
                arrayList.add(v12);
                z10 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(c71Var.U) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.j51 v13 = org.telegram.ui.Components.j51.v(tLObject3);
                    v13.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(c71Var.X));
                    arrayList.add(v13);
                }
            }
            if (arrayList3.isEmpty() || !b71Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.j51.n(29));
            arrayList.add(org.telegram.ui.Components.j51.n(29));
            arrayList.add(org.telegram.ui.Components.j51.n(29));
        }
    }

    public static void R(final c71 c71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                af.b bVar = c71Var.W;
                if (bVar != null) {
                    bVar.run();
                }
                c71Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (c71Var.g0 == null) {
            return;
        }
        final int i10 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c71Var.g0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(c71Var.U) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, c71Var.U.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new vl0(17, c71Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(c71Var) { // from class: org.telegram.ui.s61
                    public final /* synthetic */ c71 b;

                    {
                        this.b = c71Var;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                        switch (i10) {
                            case 0:
                                this.b.e0.setLoading(false);
                                break;
                            case 1:
                                c71 c71Var2 = this.b;
                                c71Var2.getClass();
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    c71Var2.dismiss();
                                    U.presentFragment(new qg1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.e0.setLoading(false);
                                break;
                            default:
                                this.b.e0.setLoading(false);
                                break;
                        }
                    }
                });
                alertDialog$Builder.o();
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(c71Var.currentAccount).sendRequest(new TL_account.getPassword(), new tr0(c71Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.z4.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(c71Var.U), ChatObject.isCommunity(c71Var.U), tL_channels_editCreator);
                return;
            }
            if (c71Var.g0 != null && !AccountInstance.getInstance(c71Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                c71Var.showDialog(new fg.v0(5, c71Var.currentAccount, c71Var.g0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            c71Var.dismiss();
            U3.presentFragment(new be1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(c71Var.g0);
        alertDialog$Builder2.a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(c71Var.g0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(c71Var.g0);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(c71Var.U)) {
            b.o(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            b.o(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, k7.c6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(c71Var.g0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(c71Var.g0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(c71Var.g0);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, k7.c6.n(-1, -2));
            linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, k7.c6.n(-2, -2));
            linearLayout2.addView(textView2, k7.c6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(c71Var.g0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(c71Var.g0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(c71Var.g0);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, k7.c6.n(-1, -2));
            linearLayout3.addView(imageView2, k7.c6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, k7.c6.n(-2, -2));
            linearLayout3.addView(textView3, k7.c6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i12 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.c2(c71Var) { // from class: org.telegram.ui.s61
                public final /* synthetic */ c71 b;

                {
                    this.b = c71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i12) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            c71 c71Var2 = this.b;
                            c71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                c71Var2.dismiss();
                                U4.presentFragment(new qg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.e0.setLoading(false);
                            break;
                        default:
                            this.b.e0.setLoading(false);
                            break;
                    }
                }
            });
            final int i13 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(c71Var) { // from class: org.telegram.ui.s61
                public final /* synthetic */ c71 b;

                {
                    this.b = c71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i13) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            c71 c71Var2 = this.b;
                            c71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                c71Var2.dismiss();
                                U4.presentFragment(new qg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.e0.setLoading(false);
                            break;
                        default:
                            this.b.e0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(c71Var.g0);
            textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i14 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2(c71Var) { // from class: org.telegram.ui.s61
                public final /* synthetic */ c71 b;

                {
                    this.b = c71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i14) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            c71 c71Var2 = this.b;
                            c71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                c71Var2.dismiss();
                                U4.presentFragment(new qg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.e0.setLoading(false);
                            break;
                        default:
                            this.b.e0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void S(c71 c71Var) {
        org.telegram.ui.Components.tl0 tl0Var = c71Var.d;
        float f10 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= tl0Var.getChildCount()) {
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i10++;
        }
        c71Var.Y.setTranslationY(f10);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.g0 = getContext();
        }
        if (this.g0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.U)) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.g0, this.U.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 18));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.U)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.U;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new hg.e0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 13));
    }

    public final void U(boolean z4) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.U) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        qh.d dVar = this.e0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.X), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z4, true);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.b0.a();
        this.c0.a();
        this.d0.a();
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.sl0 v(org.telegram.ui.Components.tl0 tl0Var) {
        org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(tl0Var, getContext(), this.currentAccount, 0, false, new d5(this, 23), this.resourcesProvider);
        this.f0 = x51Var;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
