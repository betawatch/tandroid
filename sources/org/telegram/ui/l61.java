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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l61 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat T;
    public final TLRPC.User U;
    public final bg.c2 V;
    public TLObject W;
    public final FrameLayout X;
    public final d61 Y;
    public final f61 Z;
    public final k61 a0;
    public final k61 b0;
    public final k61 c0;
    public final kh.d d0;
    public org.telegram.ui.Components.z41 e0;
    public Context f0;

    public l61(Context context, TLRPC.Chat chat, TLRPC.User user, bg.c2 c2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, 2, b6Var);
        this.G = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.T = chat;
        this.U = user;
        this.W = user;
        this.V = c2Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.f6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i9 = org.telegram.ui.ActionBar.f6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, g7.e6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        d61 d61Var = new d61(context);
        this.Y = d61Var;
        d61Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.R5));
        d61Var.setHintTextColor(getThemedColor(i9));
        d61Var.setTextSize(1, 15.0f);
        d61Var.setSingleLine(true);
        d61Var.setBackground(null);
        d61Var.setCursorWidth(1.5f);
        d61Var.setGravity(112);
        d61Var.setClipToPadding(true);
        d61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        d61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        d61Var.setInputType(d61Var.getInputType() | TLObject.FLAG_19);
        d61Var.setImeOptions(33554435);
        d61Var.setTextIsSelectable(false);
        d61Var.setOnEditorActionListener(new ea(this, 11));
        d61Var.addTextChangedListener(new e61(this));
        d61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(d61Var, g7.e6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, g7.e6.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        f61 f61Var = new f61(context);
        this.Z = f61Var;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        o9Var.setImageDrawable(new org.telegram.ui.Components.mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        f61Var.addView(o9Var, g7.e6.e(130, 130, 17));
        k61 k61Var = new k61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        k61Var.e.add(new ky0(this, 17));
        this.a0 = k61Var;
        k61 k61Var2 = new k61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        k61Var2.e.add(new ky0(this, 17));
        this.b0 = k61Var2;
        k61 k61Var3 = new k61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        k61Var3.e.add(new ky0(this, 17));
        this.c0 = k61Var3;
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new c21(this, 2));
        g61 g61Var = new g61(this);
        g61Var.m = false;
        g61Var.C = false;
        g61Var.o(org.telegram.ui.Components.gr.h);
        g61Var.n(350L);
        this.d.setItemAnimator(g61Var);
        this.d.addOnLayoutChangeListener(new h61(this));
        this.d.j(new i61(this));
        this.containerView.addView(new j61(this, getContext()), g7.e6.e(-1, 68, 87));
        kh.d dVar = new kh.d(getContext(), b6Var, true);
        dVar.setRoundRadius(24);
        this.d0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.f6.r7));
        T(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, g7.e6.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new w21(this, 5));
        org.telegram.ui.Components.z41 z41Var = this.e0;
        if (z41Var != null) {
            z41Var.N(false);
        }
        k61Var.b();
        k61Var2.b();
    }

    public static /* synthetic */ void O(l61 l61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            l61Var.T = MessagesController.getInstance(l61Var.currentAccount).getChat(Long.valueOf(j10));
            l61Var.S(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void P(l61 l61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        k61 k61Var = l61Var.c0;
        k61 k61Var2 = l61Var.b0;
        TLRPC.User user = l61Var.U;
        k61 k61Var3 = l61Var.a0;
        if (k61Var3 != null) {
            ArrayList arrayList2 = k61Var3.d;
            if (k61Var2 == null) {
                return;
            }
            ArrayList arrayList3 = k61Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(l61Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.l41.D(3, AndroidUtilities.dp(64.0f)));
            if (k61Var != null && !TextUtils.isEmpty(k61Var.c.q)) {
                ArrayList arrayList4 = k61Var.d;
                int size = arrayList4.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList4.get(i9);
                    i9++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.l41 v = org.telegram.ui.Components.l41.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(l61Var.W));
                        arrayList.add(v);
                    }
                }
                if (k61Var.f) {
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                    arrayList.add(org.telegram.ui.Components.l41.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.l41.k(l61Var.Z));
                    return;
                }
                return;
            }
            if (user != null) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                            arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(l61Var.T) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.l41 v4 = org.telegram.ui.Components.l41.v(user);
                            v4.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(l61Var.W));
                            arrayList.add(v4);
                            z10 = false;
                        }
                    }
                }
            }
            z10 = true;
            int size3 = arrayList2.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(l61Var.T) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.l41 v10 = org.telegram.ui.Components.l41.v(tLObject2);
                    v10.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(l61Var.W));
                    arrayList.add(v10);
                }
            }
            if (k61Var3.f) {
                arrayList.add(org.telegram.ui.Components.l41.n(29));
                arrayList.add(org.telegram.ui.Components.l41.n(29));
                arrayList.add(org.telegram.ui.Components.l41.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(l61Var.T) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.l41 v11 = org.telegram.ui.Components.l41.v(user);
                v11.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(l61Var.W));
                arrayList.add(v11);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(l61Var.T) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.l41 v12 = org.telegram.ui.Components.l41.v(tLObject3);
                    v12.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(l61Var.W));
                    arrayList.add(v12);
                }
            }
            if (arrayList3.isEmpty() || !k61Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.l41.n(29));
            arrayList.add(org.telegram.ui.Components.l41.n(29));
            arrayList.add(org.telegram.ui.Components.l41.n(29));
        }
    }

    public static void Q(final l61 l61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                bg.c2 c2Var = l61Var.V;
                if (c2Var != null) {
                    c2Var.run();
                }
                l61Var.dismiss();
                twoStepVerificationActivity.n0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (l61Var.f0 == null) {
            return;
        }
        final int i9 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l61Var.f0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(l61Var.T) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.N = string;
                c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, l61Var.T.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new nl0(18, l61Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(l61Var) { // from class: org.telegram.ui.c61
                    public final /* synthetic */ l61 b;

                    {
                        this.b = l61Var;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var3, int i10) {
                        switch (i9) {
                            case 0:
                                this.b.d0.setLoading(false);
                                break;
                            case 1:
                                l61 l61Var2 = this.b;
                                l61Var2.getClass();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    l61Var2.dismiss();
                                    U.presentFragment(new ag1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.d0.setLoading(false);
                                break;
                            default:
                                this.b.d0.setLoading(false);
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
                ConnectionsManager.getInstance(l61Var.currentAccount).sendRequest(new TL_account.getPassword(), new kr0(l61Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.n0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.y4.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(l61Var.T), ChatObject.isCommunity(l61Var.T), tL_channels_editCreator);
                return;
            }
            if (l61Var.f0 != null && !AccountInstance.getInstance(l61Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                l61Var.showDialog(new zf.j0(5, l61Var.currentAccount, l61Var.f0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            l61Var.dismiss();
            U3.presentFragment(new kd1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.n0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l61Var.f0);
        alertDialog$Builder2.a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(l61Var.f0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(l61Var.f0);
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(l61Var.T)) {
            org.telegram.messenger.ll.q(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.ll.q(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(l61Var.f0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(l61Var.f0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(l61Var.f0);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, g7.e6.n(-1, -2));
            linearLayout2.addView(imageView, g7.e6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, g7.e6.n(-2, -2));
            linearLayout2.addView(textView2, g7.e6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(l61Var.f0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(l61Var.f0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), mode));
        TextView textView3 = new TextView(l61Var.f0);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, g7.e6.n(-1, -2));
            linearLayout3.addView(imageView2, g7.e6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, g7.e6.n(-2, -2));
            linearLayout3.addView(textView3, g7.e6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i11 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(l61Var) { // from class: org.telegram.ui.c61
                public final /* synthetic */ l61 b;

                {
                    this.b = l61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var3, int i102) {
                    switch (i11) {
                        case 0:
                            this.b.d0.setLoading(false);
                            break;
                        case 1:
                            l61 l61Var2 = this.b;
                            l61Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                l61Var2.dismiss();
                                U4.presentFragment(new ag1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.d0.setLoading(false);
                            break;
                        default:
                            this.b.d0.setLoading(false);
                            break;
                    }
                }
            });
            final int i12 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(l61Var) { // from class: org.telegram.ui.c61
                public final /* synthetic */ l61 b;

                {
                    this.b = l61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var3, int i102) {
                    switch (i12) {
                        case 0:
                            this.b.d0.setLoading(false);
                            break;
                        case 1:
                            l61 l61Var2 = this.b;
                            l61Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                l61Var2.dismiss();
                                U4.presentFragment(new ag1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.d0.setLoading(false);
                            break;
                        default:
                            this.b.d0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(l61Var.f0);
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i13 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(l61Var) { // from class: org.telegram.ui.c61
                public final /* synthetic */ l61 b;

                {
                    this.b = l61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var3, int i102) {
                    switch (i13) {
                        case 0:
                            this.b.d0.setLoading(false);
                            break;
                        case 1:
                            l61 l61Var2 = this.b;
                            l61Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                l61Var2.dismiss();
                                U4.presentFragment(new ag1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.d0.setLoading(false);
                            break;
                        default:
                            this.b.d0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void R(l61 l61Var) {
        org.telegram.ui.Components.wk0 wk0Var = l61Var.d;
        float f10 = -AndroidUtilities.dp(64.0f);
        int i9 = 0;
        while (true) {
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i9++;
        }
        l61Var.X.setTranslationY(f10);
    }

    public final void S(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.f0 = getContext();
        }
        if (this.f0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.T)) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f0, this.T.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.T)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.T;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new bg.h0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 14));
    }

    public final void T(boolean z10) {
        int i9 = ChatObject.isChannelAndNotMegaGroup(this.T) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        kh.d dVar = this.d0;
        dVar.g(LocaleController.formatString(i9, TextUtils.ellipsize(DialogObject.getShortTitle(this.W), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i9))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.a0.a();
        this.b0.a();
        this.c0.a();
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(wk0Var, getContext(), this.currentAccount, 0, false, new a5(this, 23), this.resourcesProvider);
        this.e0 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
