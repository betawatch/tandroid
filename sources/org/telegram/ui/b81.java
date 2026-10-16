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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b81 extends org.telegram.ui.Components.db {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final ah.g Z;
    public TLObject a0;
    public final FrameLayout b0;
    public final t71 c0;
    public final v71 d0;
    public final a81 e0;
    public final a81 f0;
    public final a81 g0;
    public final di.d h0;
    public org.telegram.ui.Components.a71 i0;
    public Context j0;

    public b81(Context context, TLRPC.Chat chat, TLRPC.User user, ah.g gVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(2, context, c6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.a0 = user;
        this.Z = gVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.g6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.g6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w7.z5.a(24.0f, 11.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        t71 t71Var = new t71(context);
        this.c0 = t71Var;
        t71Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.R5));
        t71Var.setHintTextColor(getThemedColor(i10));
        t71Var.setTextSize(1, 15.0f);
        t71Var.setSingleLine(true);
        t71Var.setBackground(null);
        t71Var.setCursorWidth(1.5f);
        t71Var.setGravity(112);
        t71Var.setClipToPadding(true);
        t71Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t71Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        t71Var.setInputType(t71Var.getInputType() | TLObject.FLAG_19);
        t71Var.setImeOptions(33554435);
        t71Var.setTextIsSelectable(false);
        t71Var.setOnEditorActionListener(new na(this, 11));
        t71Var.addTextChangedListener(new u71(this));
        t71Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(t71Var, w7.z5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.z5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 23));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.z5.a(64.0f, f7, 0.0f, f7, 0.0f, -1, 55));
        v71 v71Var = new v71(context);
        this.d0 = v71Var;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        z9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        v71Var.addView(z9Var, w7.z5.e(130, 130, 17));
        a81 a81Var = new a81(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        a81Var.e.add(new tz0(this, 16));
        this.e0 = a81Var;
        a81 a81Var2 = new a81(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        a81Var2.e.add(new tz0(this, 16));
        this.f0 = a81Var2;
        a81 a81Var3 = new a81(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        a81Var3.e.add(new tz0(this, 16));
        this.g0 = a81Var3;
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new i21(this, 5));
        w71 w71Var = new w71(this);
        w71Var.m = false;
        w71Var.C = false;
        w71Var.o(org.telegram.ui.Components.es.h);
        w71Var.n(350L);
        this.d.setItemAnimator(w71Var);
        this.d.addOnLayoutChangeListener(new x71(this));
        this.d.j(new y71(this));
        this.containerView.addView(new z71(this, getContext()), w7.z5.e(-1, 68, 87));
        di.d dVar = new di.d(getContext(), c6Var, true);
        dVar.setRoundRadius(24);
        this.h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.r7));
        V(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.z5.a(48.0f, f10, 10.0f, f10, 10.0f, -1, 87));
        dVar.setOnClickListener(new v41(this, 3));
        org.telegram.ui.Components.a71 a71Var = this.i0;
        if (a71Var != null) {
            a71Var.N(false);
        }
        a81Var.b();
        a81Var2.b();
    }

    public static /* synthetic */ void Q(b81 b81Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            b81Var.X = MessagesController.getInstance(b81Var.currentAccount).getChat(Long.valueOf(j10));
            b81Var.U(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void R(b81 b81Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        a81 a81Var = b81Var.g0;
        a81 a81Var2 = b81Var.f0;
        TLRPC.User user = b81Var.Y;
        a81 a81Var3 = b81Var.e0;
        if (a81Var3 != null) {
            ArrayList arrayList2 = a81Var3.d;
            if (a81Var2 == null) {
                return;
            }
            ArrayList arrayList3 = a81Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(b81Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.m61.D(3, AndroidUtilities.dp(64.0f)));
            if (a81Var != null && !TextUtils.isEmpty(a81Var.c.q)) {
                ArrayList arrayList4 = a81Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.m61 v = org.telegram.ui.Components.m61.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(b81Var.a0));
                        arrayList.add(v);
                    }
                }
                if (a81Var.f) {
                    arrayList.add(org.telegram.ui.Components.m61.n(29));
                    arrayList.add(org.telegram.ui.Components.m61.n(29));
                    arrayList.add(org.telegram.ui.Components.m61.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.m61.k(b81Var.d0));
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
                            arrayList.add(org.telegram.ui.Components.m61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b81Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.m61 v10 = org.telegram.ui.Components.m61.v(user);
                            v10.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(b81Var.a0));
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
                        arrayList.add(org.telegram.ui.Components.m61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b81Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.m61 v11 = org.telegram.ui.Components.m61.v(tLObject2);
                    v11.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(b81Var.a0));
                    arrayList.add(v11);
                }
            }
            if (a81Var3.f) {
                arrayList.add(org.telegram.ui.Components.m61.n(29));
                arrayList.add(org.telegram.ui.Components.m61.n(29));
                arrayList.add(org.telegram.ui.Components.m61.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.m61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b81Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.m61 v12 = org.telegram.ui.Components.m61.v(user);
                v12.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(b81Var.a0));
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
                        arrayList.add(org.telegram.ui.Components.m61.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b81Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.m61 v13 = org.telegram.ui.Components.m61.v(tLObject3);
                    v13.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(b81Var.a0));
                    arrayList.add(v13);
                }
            }
            if (arrayList3.isEmpty() || !a81Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.m61.n(29));
            arrayList.add(org.telegram.ui.Components.m61.n(29));
            arrayList.add(org.telegram.ui.Components.m61.n(29));
        }
    }

    public static void S(final b81 b81Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                ah.g gVar = b81Var.Z;
                if (gVar != null) {
                    gVar.run();
                }
                b81Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (b81Var.j0 == null) {
            return;
        }
        final int i11 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b81Var.j0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(b81Var.X) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, b81Var.X.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new bs0(12, b81Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1(b81Var) { // from class: org.telegram.ui.s71
                    public final /* synthetic */ b81 b;

                    {
                        this.b = b81Var;
                    }

                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i12) {
                        switch (i11) {
                            case 0:
                                this.b.h0.setLoading(false);
                                break;
                            case 1:
                                b81 b81Var2 = this.b;
                                b81Var2.getClass();
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null) {
                                    b81Var2.dismiss();
                                    U.presentFragment(new oh1(6, null));
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
                ConnectionsManager.getInstance(b81Var.currentAccount).sendRequest(new TL_account.getPassword(), new ts0(b81Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.g5.g0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(b81Var.X), ChatObject.isCommunity(b81Var.X), tL_channels_editCreator);
                return;
            }
            if (b81Var.j0 != null && !AccountInstance.getInstance(b81Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                b81Var.showDialog(new sg.j0(5, b81Var.currentAccount, b81Var.j0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            b81Var.dismiss();
            U3.presentFragment(new ze1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b81Var.j0);
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(b81Var.j0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(b81Var.j0);
        int i12 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(b81Var.X)) {
            org.telegram.messenger.sk.r(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.sk.r(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(b81Var.j0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(b81Var.j0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        TextView textView2 = new TextView(b81Var.j0);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
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
        LinearLayout linearLayout3 = new LinearLayout(b81Var.j0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(b81Var.j0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i12, false), mode));
        TextView textView3 = new TextView(b81Var.j0);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
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
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.z1(b81Var) { // from class: org.telegram.ui.s71
                public final /* synthetic */ b81 b;

                {
                    this.b = b81Var;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i122) {
                    switch (i13) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            b81 b81Var2 = this.b;
                            b81Var2.getClass();
                            org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                b81Var2.dismiss();
                                U4.presentFragment(new oh1(6, null));
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
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1(b81Var) { // from class: org.telegram.ui.s71
                public final /* synthetic */ b81 b;

                {
                    this.b = b81Var;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i122) {
                    switch (i14) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            b81 b81Var2 = this.b;
                            b81Var2.getClass();
                            org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                b81Var2.dismiss();
                                U4.presentFragment(new oh1(6, null));
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
            TextView textView4 = new TextView(b81Var.j0);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i15 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1(b81Var) { // from class: org.telegram.ui.s71
                public final /* synthetic */ b81 b;

                {
                    this.b = b81Var;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i122) {
                    switch (i15) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            b81 b81Var2 = this.b;
                            b81Var2.getClass();
                            org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                b81Var2.dismiss();
                                U4.presentFragment(new oh1(6, null));
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

    public static void T(b81 b81Var) {
        org.telegram.ui.Components.mm0 mm0Var = b81Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        b81Var.b0.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
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
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.j0, this.X.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 17));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new di.fd(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 11));
    }

    public final void V(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.X) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        di.d dVar = this.h0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.a0), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.e0.a();
        this.f0.a();
        this.g0.a();
    }

    @Override // org.telegram.ui.Components.db
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(mm0Var, getContext(), this.currentAccount, 0, false, new f5(this, 23), this.resourcesProvider);
        this.i0 = a71Var;
        return a71Var;
    }
}
