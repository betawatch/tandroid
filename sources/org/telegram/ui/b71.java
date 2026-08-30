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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b71 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat U;
    public final TLRPC.User V;
    public final af.b W;
    public TLObject X;
    public final FrameLayout Y;
    public final t61 Z;
    public final v61 a0;
    public final a71 b0;
    public final a71 c0;
    public final a71 d0;
    public final ph.d e0;
    public org.telegram.ui.Components.w51 f0;
    public Context g0;

    public b71(Context context, TLRPC.Chat chat, TLRPC.User user, af.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, false, 2, f6Var);
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
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.j6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.j6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, k7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        t61 t61Var = new t61(context);
        this.Z = t61Var;
        t61Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.R5));
        t61Var.setHintTextColor(getThemedColor(i10));
        t61Var.setTextSize(1, 15.0f);
        t61Var.setSingleLine(true);
        t61Var.setBackground(null);
        t61Var.setCursorWidth(1.5f);
        t61Var.setGravity(112);
        t61Var.setClipToPadding(true);
        t61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        t61Var.setInputType(t61Var.getInputType() | TLObject.FLAG_19);
        t61Var.setImeOptions(33554435);
        t61Var.setTextIsSelectable(false);
        t61Var.setOnEditorActionListener(new ha(this, 11));
        t61Var.addTextChangedListener(new u61(this));
        t61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(t61Var, k7.b6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, k7.b6.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        v61 v61Var = new v61(context);
        this.a0 = v61Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setImageDrawable(new org.telegram.ui.Components.gj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        v61Var.addView(p9Var, k7.b6.e(130, 130, 17));
        a71 a71Var = new a71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        a71Var.e.add(new vy0(this, 17));
        this.b0 = a71Var;
        a71 a71Var2 = new a71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        a71Var2.e.add(new vy0(this, 17));
        this.c0 = a71Var2;
        a71 a71Var3 = new a71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        a71Var3.e.add(new vy0(this, 17));
        this.d0 = a71Var3;
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new p21(this, 2));
        w61 w61Var = new w61(this);
        w61Var.m = false;
        w61Var.C = false;
        w61Var.o(org.telegram.ui.Components.nr.h);
        w61Var.n(350L);
        this.d.setItemAnimator(w61Var);
        this.d.addOnLayoutChangeListener(new x61(this));
        this.d.j(new y61(this));
        this.containerView.addView(new z61(this, getContext()), k7.b6.e(-1, 68, 87));
        ph.d dVar = new ph.d(getContext(), f6Var, true);
        dVar.setRoundRadius(24);
        this.e0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, k7.b6.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new i31(this, 5));
        org.telegram.ui.Components.w51 w51Var = this.f0;
        if (w51Var != null) {
            w51Var.N(false);
        }
        a71Var.b();
        a71Var2.b();
    }

    public static /* synthetic */ void P(b71 b71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            b71Var.U = MessagesController.getInstance(b71Var.currentAccount).getChat(Long.valueOf(j10));
            b71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(b71 b71Var, ArrayList arrayList) {
        boolean z4;
        boolean z10;
        a71 a71Var = b71Var.d0;
        a71 a71Var2 = b71Var.c0;
        TLRPC.User user = b71Var.V;
        a71 a71Var3 = b71Var.b0;
        if (a71Var3 != null) {
            ArrayList arrayList2 = a71Var3.d;
            if (a71Var2 == null) {
                return;
            }
            ArrayList arrayList3 = a71Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(b71Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.i51.D(3, AndroidUtilities.dp(64.0f)));
            if (a71Var != null && !TextUtils.isEmpty(a71Var.c.q)) {
                ArrayList arrayList4 = a71Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.i51 v = org.telegram.ui.Components.i51.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(b71Var.X));
                        arrayList.add(v);
                    }
                }
                if (a71Var.f) {
                    arrayList.add(org.telegram.ui.Components.i51.n(29));
                    arrayList.add(org.telegram.ui.Components.i51.n(29));
                    arrayList.add(org.telegram.ui.Components.i51.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.i51.k(b71Var.a0));
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
                            arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b71Var.U) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.i51 v10 = org.telegram.ui.Components.i51.v(user);
                            v10.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(b71Var.X));
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
                        arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b71Var.U) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z4 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.i51 v11 = org.telegram.ui.Components.i51.v(tLObject2);
                    v11.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(b71Var.X));
                    arrayList.add(v11);
                }
            }
            if (a71Var3.f) {
                arrayList.add(org.telegram.ui.Components.i51.n(29));
                arrayList.add(org.telegram.ui.Components.i51.n(29));
                arrayList.add(org.telegram.ui.Components.i51.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z10 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b71Var.U) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.i51 v12 = org.telegram.ui.Components.i51.v(user);
                v12.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(b71Var.X));
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
                        arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b71Var.U) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.i51 v13 = org.telegram.ui.Components.i51.v(tLObject3);
                    v13.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(b71Var.X));
                    arrayList.add(v13);
                }
            }
            if (arrayList3.isEmpty() || !a71Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.i51.n(29));
            arrayList.add(org.telegram.ui.Components.i51.n(29));
            arrayList.add(org.telegram.ui.Components.i51.n(29));
        }
    }

    public static void R(final b71 b71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                af.b bVar = b71Var.W;
                if (bVar != null) {
                    bVar.run();
                }
                b71Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (b71Var.g0 == null) {
            return;
        }
        final int i10 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b71Var.g0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b71Var.U) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, b71Var.U.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new tl0(17, b71Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(b71Var) { // from class: org.telegram.ui.r61
                    public final /* synthetic */ b71 b;

                    {
                        this.b = b71Var;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                        switch (i10) {
                            case 0:
                                this.b.e0.setLoading(false);
                                break;
                            case 1:
                                b71 b71Var2 = this.b;
                                b71Var2.getClass();
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    b71Var2.dismiss();
                                    U.presentFragment(new og1(6, null));
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
                ConnectionsManager.getInstance(b71Var.currentAccount).sendRequest(new TL_account.getPassword(), new rr0(b71Var, twoStepVerificationActivity, user, 7), 8);
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
                org.telegram.ui.Components.z4.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(b71Var.U), ChatObject.isCommunity(b71Var.U), tL_channels_editCreator);
                return;
            }
            if (b71Var.g0 != null && !AccountInstance.getInstance(b71Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                b71Var.showDialog(new eg.v0(5, b71Var.currentAccount, b71Var.g0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            b71Var.dismiss();
            U3.presentFragment(new yd1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b71Var.g0);
        alertDialog$Builder2.a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(b71Var.g0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(b71Var.g0);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(b71Var.U)) {
            b.o(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            b.o(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, k7.b6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(b71Var.g0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(b71Var.g0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(b71Var.g0);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, k7.b6.n(-1, -2));
            linearLayout2.addView(imageView, k7.b6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, k7.b6.n(-2, -2));
            linearLayout2.addView(textView2, k7.b6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(b71Var.g0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(b71Var.g0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(b71Var.g0);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, k7.b6.n(-1, -2));
            linearLayout3.addView(imageView2, k7.b6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, k7.b6.n(-2, -2));
            linearLayout3.addView(textView3, k7.b6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i12 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.c2(b71Var) { // from class: org.telegram.ui.r61
                public final /* synthetic */ b71 b;

                {
                    this.b = b71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i12) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            b71 b71Var2 = this.b;
                            b71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                b71Var2.dismiss();
                                U4.presentFragment(new og1(6, null));
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
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(b71Var) { // from class: org.telegram.ui.r61
                public final /* synthetic */ b71 b;

                {
                    this.b = b71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i13) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            b71 b71Var2 = this.b;
                            b71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                b71Var2.dismiss();
                                U4.presentFragment(new og1(6, null));
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
            TextView textView4 = new TextView(b71Var.g0);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i14 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2(b71Var) { // from class: org.telegram.ui.r61
                public final /* synthetic */ b71 b;

                {
                    this.b = b71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i14) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            b71 b71Var2 = this.b;
                            b71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                b71Var2.dismiss();
                                U4.presentFragment(new og1(6, null));
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

    public static void S(b71 b71Var) {
        org.telegram.ui.Components.sl0 sl0Var = b71Var.d;
        float f10 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i10++;
        }
        b71Var.Y.setTranslationY(f10);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new gg.e0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 13));
    }

    public final void U(boolean z4) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.U) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        ph.d dVar = this.e0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.X), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z4, true);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.b0.a();
        this.c0.a();
        this.d0.a();
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, false, new d5(this, 23), this.resourcesProvider);
        this.f0 = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
