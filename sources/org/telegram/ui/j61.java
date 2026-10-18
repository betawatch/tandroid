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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class j61 extends org.telegram.ui.Components.bb {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final org.telegram.ui.Components.e2 Z;
    public TLObject a0;
    public final FrameLayout b0;
    public final b61 c0;
    public final d61 d0;
    public final i61 e0;
    public final i61 f0;
    public final i61 g0;
    public final ei.d h0;
    public org.telegram.ui.Components.s61 i0;
    public Context j0;

    public j61(Context context, TLRPC.Chat chat, TLRPC.User user, org.telegram.ui.Components.e2 e2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(2, context, d6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.a0 = user;
        this.Z = e2Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.h6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.h6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w7.z5.a(24.0f, 11.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        b61 b61Var = new b61(context);
        this.c0 = b61Var;
        b61Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.R5));
        b61Var.setHintTextColor(getThemedColor(i10));
        b61Var.setTextSize(1, 15.0f);
        b61Var.setSingleLine(true);
        b61Var.setBackground(null);
        b61Var.setCursorWidth(1.5f);
        b61Var.setGravity(112);
        b61Var.setClipToPadding(true);
        b61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        b61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        b61Var.setInputType(b61Var.getInputType() | TLObject.FLAG_19);
        b61Var.setImeOptions(33554435);
        b61Var.setTextIsSelectable(false);
        b61Var.setOnEditorActionListener(new ma(this, 11));
        b61Var.addTextChangedListener(new c61(this));
        b61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(b61Var, w7.z5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.z5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 23));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.z5.a(64.0f, f7, 0.0f, f7, 0.0f, -1, 55));
        d61 d61Var = new d61(context);
        this.d0 = d61Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setImageDrawable(new org.telegram.ui.Components.uj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        d61Var.addView(w9Var, w7.z5.e(130, 130, 17));
        i61 i61Var = new i61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        i61Var.e.add(new sy0(this, 16));
        this.e0 = i61Var;
        i61 i61Var2 = new i61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        i61Var2.e.add(new sy0(this, 16));
        this.f0 = i61Var2;
        i61 i61Var3 = new i61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        i61Var3.e.add(new sy0(this, 16));
        this.g0 = i61Var3;
        org.telegram.ui.Components.im0 im0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        im0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new h11(this, 4));
        e61 e61Var = new e61(this);
        e61Var.m = false;
        e61Var.C = false;
        e61Var.o(org.telegram.ui.Components.bs.h);
        e61Var.n(350L);
        this.d.setItemAnimator(e61Var);
        this.d.addOnLayoutChangeListener(new f61(this));
        this.d.j(new g61(this));
        this.containerView.addView(new h61(this, getContext()), w7.z5.e(-1, 68, 87));
        ei.d dVar = new ei.d(getContext(), d6Var, true);
        dVar.setRoundRadius(24);
        this.h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.r7));
        V(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.z5.a(48.0f, f10, 10.0f, f10, 10.0f, -1, 87));
        dVar.setOnClickListener(new i31(this, 2));
        org.telegram.ui.Components.s61 s61Var = this.i0;
        if (s61Var != null) {
            s61Var.N(false);
        }
        i61Var.b();
        i61Var2.b();
    }

    public static /* synthetic */ void Q(j61 j61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            j61Var.X = MessagesController.getInstance(j61Var.currentAccount).getChat(Long.valueOf(j10));
            j61Var.U(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void R(j61 j61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        i61 i61Var = j61Var.g0;
        i61 i61Var2 = j61Var.f0;
        TLRPC.User user = j61Var.Y;
        i61 i61Var3 = j61Var.e0;
        if (i61Var3 != null) {
            ArrayList arrayList2 = i61Var3.d;
            if (i61Var2 == null) {
                return;
            }
            ArrayList arrayList3 = i61Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(j61Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.f61.D(3, AndroidUtilities.dp(64.0f)));
            if (i61Var != null && !TextUtils.isEmpty(i61Var.c.q)) {
                ArrayList arrayList4 = i61Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.f61 v = org.telegram.ui.Components.f61.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(j61Var.a0));
                        arrayList.add(v);
                    }
                }
                if (i61Var.f) {
                    arrayList.add(org.telegram.ui.Components.f61.n(29));
                    arrayList.add(org.telegram.ui.Components.f61.n(29));
                    arrayList.add(org.telegram.ui.Components.f61.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.f61.k(j61Var.d0));
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
                            arrayList.add(org.telegram.ui.Components.f61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(j61Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.f61 v10 = org.telegram.ui.Components.f61.v(user);
                            v10.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(j61Var.a0));
                            arrayList.add(v10);
                            z10 = false;
                        }
                    }
                }
            }
            z10 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.f61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(j61Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.f61 v11 = org.telegram.ui.Components.f61.v(tLObject2);
                    v11.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(j61Var.a0));
                    arrayList.add(v11);
                }
            }
            if (i61Var3.f) {
                arrayList.add(org.telegram.ui.Components.f61.n(29));
                arrayList.add(org.telegram.ui.Components.f61.n(29));
                arrayList.add(org.telegram.ui.Components.f61.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.f61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(j61Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.f61 v12 = org.telegram.ui.Components.f61.v(user);
                v12.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(j61Var.a0));
                arrayList.add(v12);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.f61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(j61Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.f61 v13 = org.telegram.ui.Components.f61.v(tLObject3);
                    v13.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(j61Var.a0));
                    arrayList.add(v13);
                }
            }
            if (arrayList3.isEmpty() || !i61Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.f61.n(29));
            arrayList.add(org.telegram.ui.Components.f61.n(29));
            arrayList.add(org.telegram.ui.Components.f61.n(29));
        }
    }

    public static void S(final j61 j61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                org.telegram.ui.Components.e2 e2Var = j61Var.Z;
                if (e2Var != null) {
                    e2Var.run();
                }
                j61Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (j61Var.j0 == null) {
            return;
        }
        final int i11 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j61Var.j0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(j61Var.X) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, j61Var.X.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new gn0(14, j61Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(j61Var) { // from class: org.telegram.ui.a61
                    public final /* synthetic */ j61 b;

                    {
                        this.b = j61Var;
                    }

                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i12) {
                        switch (i11) {
                            case 0:
                                this.b.h0.setLoading(false);
                                break;
                            case 1:
                                j61 j61Var2 = this.b;
                                j61Var2.getClass();
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null) {
                                    j61Var2.dismiss();
                                    U.presentFragment(new xf1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.h0.setLoading(false);
                                break;
                            default:
                                this.b.h0.setLoading(false);
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
                ConnectionsManager.getInstance(j61Var.currentAccount).sendRequest(new TL_account.getPassword(), new vr0(j61Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.f5.g0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(j61Var.X), ChatObject.isCommunity(j61Var.X), tL_channels_editCreator);
                return;
            }
            if (j61Var.j0 != null && !AccountInstance.getInstance(j61Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                j61Var.showDialog(new sg.j0(5, j61Var.currentAccount, j61Var.j0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            j61Var.dismiss();
            U3.presentFragment(new id1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j61Var.j0);
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(j61Var.j0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(j61Var.j0);
        int i12 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(j61Var.X)) {
            org.telegram.messenger.kk.r(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.kk.r(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(j61Var.j0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(j61Var.j0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        TextView textView2 = new TextView(j61Var.j0);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.z5.n(-2, -2));
            linearLayout2.addView(textView2, w7.z5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(j61Var.j0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(j61Var.j0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i12, false), mode));
        TextView textView3 = new TextView(j61Var.j0);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, w7.z5.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
            linearLayout3.addView(textView3, w7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i13 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.a2(j61Var) { // from class: org.telegram.ui.a61
                public final /* synthetic */ j61 b;

                {
                    this.b = j61Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i122) {
                    switch (i13) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            j61 j61Var2 = this.b;
                            j61Var2.getClass();
                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                j61Var2.dismiss();
                                U4.presentFragment(new xf1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
            final int i14 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(j61Var) { // from class: org.telegram.ui.a61
                public final /* synthetic */ j61 b;

                {
                    this.b = j61Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i122) {
                    switch (i14) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            j61 j61Var2 = this.b;
                            j61Var2.getClass();
                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                j61Var2.dismiss();
                                U4.presentFragment(new xf1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(j61Var.j0);
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i15 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2(j61Var) { // from class: org.telegram.ui.a61
                public final /* synthetic */ j61 b;

                {
                    this.b = j61Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i122) {
                    switch (i15) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            j61 j61Var2 = this.b;
                            j61Var2.getClass();
                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                j61Var2.dismiss();
                                U4.presentFragment(new xf1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void T(j61 j61Var) {
        org.telegram.ui.Components.im0 im0Var = j61Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= im0Var.getChildCount()) {
                break;
            }
            View childAt = im0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        j61Var.b0.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }

    public final void U(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.j0 = getContext();
        }
        if (this.j0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.j0, this.X.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.X)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.X;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ai.s9(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void V(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.X) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        ei.d dVar = this.h0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.a0), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.e0.a();
        this.f0.a();
        this.g0.a();
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.hm0 x(org.telegram.ui.Components.im0 im0Var) {
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(im0Var, getContext(), this.currentAccount, 0, false, new g5(this, 23), this.resourcesProvider);
        this.i0 = s61Var;
        return s61Var;
    }
}
