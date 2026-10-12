package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        ta1 ta1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        org.telegram.ui.ActionBar.c6 c6Var6;
        org.telegram.ui.ActionBar.c6 c6Var7;
        org.telegram.ui.ActionBar.c6 c6Var8;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        final int i12 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.w = false;
                gh.b bVar = g5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, g5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                n9 n9Var = (n9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = n9Var.K.isEmpty();
                ArrayList arrayList2 = n9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l61 c10 = org.telegram.ui.Components.l61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!n9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.l61 c11 = org.telegram.ui.Components.l61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.l61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = n9Var.K;
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList3.get(i14);
                        i14++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = n9Var.getMessagesController().getChat(l4)) != null) {
                            q8 q8Var = new q8(n9Var, 0);
                            int i15 = l9.a;
                            org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(l9.class);
                            J.G = chat;
                            J.D = q8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.l61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj4 = arrayList2.get(i16);
                        i16++;
                        j9 j9Var = (j9) obj4;
                        bi.u1 u1Var = new bi.u1(27, n9Var, j9Var);
                        int i17 = h9.a;
                        org.telegram.ui.Components.l61 J2 = org.telegram.ui.Components.l61.J(h9.class);
                        J2.G = j9Var;
                        J2.D = u1Var;
                        J2.K(n9Var.l0(j9Var.c));
                        arrayList.add(J2);
                    }
                    if (!n9Var.J) {
                        arrayList.add(org.telegram.ui.Components.l61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.l61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.l61.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                qe qeVar = (qe) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(qeVar.y0).getChat(Long.valueOf(-qeVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(qeVar.y0).getChatFull(-qeVar.z0);
                int i18 = chatFull != null ? chatFull.stats_dc : -1;
                if (qeVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.l61.g(qeVar.C0));
                    ta1 ta1Var2 = qeVar.o1;
                    if (ta1Var2 == null || ta1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.l61.h(5, i18, ta1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.l61.A(-1, null));
                    }
                    ta1 ta1Var3 = qeVar.p1;
                    if (ta1Var3 != null && !ta1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.l61.h(2, i18, ta1Var3));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-2, charSequence));
                    }
                }
                if (qeVar.g1 && (ta1Var = qeVar.q1) != null && !ta1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.l61.h(2, i18, ta1Var));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-3, null));
                }
                if (qeVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.l61.u(qeVar.s1));
                    arrayList4.add(org.telegram.ui.Components.l61.u(qeVar.t1));
                    arrayList4.add(org.telegram.ui.Components.l61.u(qeVar.u1));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-4, qeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (qeVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.l61.k(qeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-5, qeVar.D0));
                        int i19 = MessagesController.getInstance(qeVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i20 = qeVar.B0 < i19 ? i19 : 0;
                        if (i20 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(0, new pp0(i20, context, null, false));
                            brVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l61 i21 = org.telegram.ui.Components.l61.i(1, string);
                        i21.K(qeVar.B0 >= i19 && qeVar.m1);
                        arrayList4.add(i21);
                        arrayList4.add(org.telegram.ui.Components.l61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (qeVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.l61.j(3, qeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-6, qeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(qeVar.y0).getChat(Long.valueOf(-qeVar.z0))) && MessagesController.getInstance(qeVar.y0).starrefConnectAllowed) {
                    arrayList4.add(fi.h.a(4, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, qeVar.x0), R.drawable.filled_earn_stars, zo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-7, null));
                }
                if (qeVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.l61.p(qeVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.l61.A(-10, null));
                    break;
                }
                break;
            case 3:
                ke keVar = (ke) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                me meVar = keVar.f;
                int i22 = keVar.d;
                if (i22 == 0) {
                    ArrayList arrayList6 = meVar.n;
                    int size3 = arrayList6.size();
                    while (i13 < size3) {
                        Object obj5 = arrayList6.get(i13);
                        i13++;
                        int i23 = zh.i7.a;
                        org.telegram.ui.Components.l61 J3 = org.telegram.ui.Components.l61.J(zh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(meVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i22 == 1) {
                    ArrayList arrayList7 = meVar.h;
                    int size4 = arrayList7.size();
                    while (i13 < size4) {
                        Object obj6 = arrayList7.get(i13);
                        i13++;
                        int i24 = zh.i7.a;
                        org.telegram.ui.Components.l61 J4 = org.telegram.ui.Components.l61.J(zh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(meVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                zo zoVar = (zo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    zoVar.getClass();
                    org.telegram.ui.Components.zc.a0(zoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(zoVar.k0);
                AndroidUtilities.removeFromParent(zoVar.h0);
                AndroidUtilities.removeFromParent(zoVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new uq((yr) this.b, i12), 1000L);
                break;
            case 6:
                ((qf.b) this.b).Z(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                ws wsVar = (ws) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = wsVar.getMessagesController().getUser(Long.valueOf(wsVar.H));
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.V));
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.b));
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.c));
                if (TextUtils.isEmpty(wsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (wsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.l61.B(null));
                }
                if (wsVar.I && wsVar.K) {
                    org.telegram.ui.Components.l61 i25 = org.telegram.ui.Components.l61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i25.K(wsVar.X);
                    arrayList8.add(i25);
                    arrayList8.add(org.telegram.ui.Components.l61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.d));
                i2.d.y(R.string.AddNotesInfo, arrayList8);
                if (wsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = wsVar.getMessagesController().getUserFull(wsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.x));
                    arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.l61.k(wsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.l61.B(null));
                    org.telegram.ui.Components.l61 e = org.telegram.ui.Components.l61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.l61.B(charSequence2));
                if (wsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ns(wsVar, user, i13));
                    wsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new os(wsVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                xt.a((xt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                tt ttVar = (tt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                xt xtVar = ttVar.a;
                vt vtVar = xtVar.l;
                if (vtVar != null) {
                    vtVar.f(charSequence3, TextUtils.join("", xtVar.o), callback != null ? new mt(i12, ttVar, callback) : null);
                    if (callback == null) {
                        xtVar.p();
                        break;
                    }
                }
                break;
            case 10:
                hu.S((hu) this.b, (ArrayList) obj);
                break;
            case 11:
                yy yyVar = (yy) this.b;
                yyVar.P1 = (Long) obj;
                yyVar.R4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final qz qzVar = (qz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i26 = R.raw.topics_top;
                org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(2);
                l61Var.l = string2;
                l61Var.k = i26;
                arrayList9.add(l61Var);
                org.telegram.ui.Components.l61 i27 = org.telegram.ui.Components.l61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i27.K(qzVar.c);
                arrayList9.add(i27);
                if (qzVar.c) {
                    arrayList9.add(org.telegram.ui.Components.l61.B(null));
                    arrayList9.add(org.telegram.ui.Components.l61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.mz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    pz pzVar = (pz) view.getParent();
                                    qz qzVar2 = qzVar;
                                    qzVar2.d = true;
                                    pzVar.a(true, true);
                                    bi.f0 f0Var = qzVar2.f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(qzVar2.c), Boolean.valueOf(qzVar2.d));
                                    }
                                    qzVar2.U();
                                    break;
                                default:
                                    pz pzVar2 = (pz) view.getParent();
                                    qz qzVar3 = qzVar;
                                    qzVar3.d = false;
                                    pzVar2.a(false, true);
                                    bi.f0 f0Var2 = qzVar3.f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(qzVar3.c), Boolean.valueOf(qzVar3.d));
                                    }
                                    qzVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.mz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    pz pzVar = (pz) view.getParent();
                                    qz qzVar2 = qzVar;
                                    qzVar2.d = true;
                                    pzVar.a(true, true);
                                    bi.f0 f0Var = qzVar2.f;
                                    if (f0Var != null) {
                                        f0Var.run(Boolean.valueOf(qzVar2.c), Boolean.valueOf(qzVar2.d));
                                    }
                                    qzVar2.U();
                                    break;
                                default:
                                    pz pzVar2 = (pz) view.getParent();
                                    qz qzVar3 = qzVar;
                                    qzVar3.d = false;
                                    pzVar2.a(false, true);
                                    bi.f0 f0Var2 = qzVar3.f;
                                    if (f0Var2 != null) {
                                        f0Var2.run(Boolean.valueOf(qzVar3.c), Boolean.valueOf(qzVar3.d));
                                    }
                                    qzVar3.U();
                                    break;
                            }
                        }
                    };
                    int i28 = oz.a;
                    org.telegram.ui.Components.l61 J5 = org.telegram.ui.Components.l61.J(oz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(qzVar.d);
                    arrayList9.add(J5);
                    i2.d.y(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                jc0 jc0Var = (jc0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                jc0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(jc0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.q.r(R.string.AIEditorStyleNotFound, jc0.d(), R.raw.error, 36);
                        break;
                    } else {
                        jc0.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                sw0 sw0Var = (sw0) this.b;
                gh.b bVar2 = sw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                sw0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                sw0Var.w = paint;
                Bitmap bitmap2 = sw0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                sw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                sw0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                sw0Var.x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, sw0Var.c);
                sw0Var.G.d();
                break;
            case 16:
                zw0 zw0Var = (zw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i29 = R.raw.bubble;
                org.telegram.ui.Components.l61 l61Var2 = new org.telegram.ui.Components.l61(2);
                l61Var2.l = string3;
                l61Var2.k = i29;
                arrayList10.add(l61Var2);
                org.telegram.ui.Components.l61 i30 = org.telegram.ui.Components.l61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i30.K(zw0Var.r);
                arrayList10.add(i30);
                arrayList10.add(org.telegram.ui.Components.l61.A(2, null));
                if (zw0Var.r) {
                    i2.d.o(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) zw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    ul0 ul0Var = new ul0(4);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.c = a2;
                    y7Var.d = 20;
                    y7Var.e = ul0Var;
                    zw0Var.b.d((int) Utilities.clamp(zw0Var.s, 10000L, 0L), y7Var, new v3(zw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.l61.j(3, zw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.l61.A(4, zw0Var.s > 0 ? zw0Var.W() : null));
                    TLRPC.Chat chat3 = zw0Var.getMessagesController().getChat(Long.valueOf(zw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        zw0Var.c.setLink(zw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.d.o(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.l61.j(5, zw0Var.c));
                        break;
                    }
                }
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                gh.b bVar3 = profileActivity.p6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                break;
            case 19:
                h41 h41Var = (h41) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var = h41Var.f;
                i41 i41Var = h41Var.v;
                ArrayList arrayList12 = i41Var.h;
                x5 x5Var = h41Var.h;
                if (x5Var.getMeasuredHeight() <= 0) {
                    x5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.l61 C = org.telegram.ui.Components.l61.C(x5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((x5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = h41Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || h41Var.c != null || h41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || h41Var.c != null) {
                        Context context2 = h41Var.getContext();
                        int i31 = org.telegram.ui.ActionBar.g6.L6;
                        c6Var = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i31, 21, 0, 0, false, false, c6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = h41Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = h41Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                        org.telegram.ui.Components.l61 k10 = org.telegram.ui.Components.l61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (h41Var.b != null) {
                        for (int i32 = 0; i32 < h41Var.b.options.size(); i32++) {
                            org.telegram.ui.Components.l61 l61Var3 = new org.telegram.ui.Components.l61(30);
                            l61Var3.l = h41Var.b.options.get(i32).text;
                            l61Var3.k = R.drawable.msg_arrowright;
                            l61Var3.d = i32;
                            arrayList11.add(l61Var3);
                            measuredHeight += 50;
                        }
                    } else if (h41Var.c != null) {
                        for (int i33 = 0; i33 < h41Var.c.options.size(); i33++) {
                            org.telegram.ui.Components.l61 l61Var4 = new org.telegram.ui.Components.l61(30);
                            l61Var4.l = h41Var.c.options.get(i33).text;
                            l61Var4.k = R.drawable.msg_arrowright;
                            l61Var4.d = i33;
                            arrayList11.add(l61Var4);
                            measuredHeight += 50;
                        }
                    } else if (h41Var.d != null) {
                        if (h41Var.n == null) {
                            Context context3 = h41Var.getContext();
                            c6Var5 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                            g41 g41Var = new g41(h41Var, context3, c6Var5);
                            h41Var.n = g41Var;
                            g41Var.setShowLimitWhenNear(100);
                        }
                        h41Var.n.b.setHint(LocaleController.getString(h41Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.l61 k11 = org.telegram.ui.Components.l61.k(h41Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = i41Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.e3) i41Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        i2.d.y(i11, arrayList11);
                        if (h41Var.r == null) {
                            Context context4 = h41Var.getContext();
                            c6Var2 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                            di.d dVar = new di.d(context4, c6Var2, true);
                            h41Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(h41Var.getContext());
                            h41Var.r = frameLayout;
                            int i34 = org.telegram.ui.ActionBar.g6.h5;
                            c6Var3 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i34, c6Var3));
                            h41Var.r.addView(h41Var.s, w7.a6.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(h41Var.getContext());
                            int i35 = org.telegram.ui.ActionBar.g6.d7;
                            c6Var4 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i35, c6Var4));
                            h41Var.r.addView(view, w7.a6.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        h41Var.s.setEnabled(h41Var.d.optional || !TextUtils.isEmpty(h41Var.n.getText()));
                        h41Var.s.setOnClickListener(new t60(h41Var, 27));
                        org.telegram.ui.Components.l61 k12 = org.telegram.ui.Components.l61.k(h41Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.l61) i2.d.g(1, arrayList11)).j = true;
                    if (i41Var.d && h41Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(h41Var.getContext());
                        Context context5 = h41Var.getContext();
                        int i36 = R.drawable.greydivider;
                        int i37 = org.telegram.ui.ActionBar.g6.b7;
                        c6Var6 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.V0(context5, i36, org.telegram.ui.ActionBar.g6.w0(i37, c6Var6)), 0, 0);
                        crVar.w = true;
                        frameLayout2.setBackground(crVar);
                        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(h41Var.getContext(), null);
                        da0Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        c6Var7 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                        da0Var.setText(AndroidUtilities.replaceLinks(string4, c6Var7));
                        int i38 = org.telegram.ui.ActionBar.g6.A6;
                        c6Var8 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
                        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i38, c6Var8));
                        da0Var.setGravity(17);
                        frameLayout2.addView(da0Var, w7.a6.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.l61 k13 = org.telegram.ui.Components.l61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (h71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.e3) i41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        h71Var.V2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        h71Var.V2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.l61.k(((n41) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.l61.k(((b51) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                b81.R((b81) this.b, (ArrayList) obj);
                break;
            case 24:
                a81 a81Var = (a81) this.b;
                ArrayList arrayList13 = a81Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i39 = a81Var.a;
                ArrayList arrayList14 = a81Var.d;
                if (tL_error3 != null) {
                    if (a81Var.r) {
                        arrayList14.clear();
                        a81Var.r = false;
                    }
                    a81Var.h = true;
                    a81Var.f = false;
                    int size5 = arrayList13.size();
                    while (i13 < size5) {
                        Object obj7 = arrayList13.get(i13);
                        i13++;
                        ((Runnable) obj7).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i39).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i39).putChats(channels_channelparticipants.chats, false);
                    if (a81Var.r) {
                        arrayList14.clear();
                        a81Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                    int size6 = arrayList15.size();
                    int i40 = 0;
                    while (i40 < size6) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i40);
                        i40++;
                        TLObject userOrChat = MessagesController.getInstance(i39).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList14.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        a81Var.h = true;
                    }
                    a81Var.f = false;
                    int size7 = arrayList13.size();
                    while (i13 < size7) {
                        Object obj8 = arrayList13.get(i13);
                        i13++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                e81 e81Var = (e81) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i41 = e81Var.b0;
                bi.o8 o8Var = e81Var.Z;
                if (o8Var != null) {
                    arrayList16.add(org.telegram.ui.Components.l61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = o8Var.i;
                    int size8 = arrayList17.size();
                    int i42 = i41;
                    int i43 = 0;
                    while (i43 < size8) {
                        Object obj9 = arrayList17.get(i43);
                        i43++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i44 = ob1.b;
                        org.telegram.ui.Components.l61 J6 = org.telegram.ui.Components.l61.J(ob1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i41;
                        J6.K(e81Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i42--;
                        if (i42 == 0) {
                            i42 = i41;
                        }
                    }
                    if (o8Var.k() || !o8Var.r) {
                        while (true) {
                            if (i13 < (i42 <= 0 ? i41 : i42)) {
                                i13++;
                                org.telegram.ui.Components.l61 o10 = org.telegram.ui.Components.l61.o(i13, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.l61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                o91.b0((o91) this.b, (ArrayList) obj);
                break;
            case 27:
                z91 z91Var = (z91) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = z91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.l61.k(linearLayout));
                }
                LinearLayout linearLayout2 = z91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.l61.k(linearLayout2));
                    break;
                }
                break;
            default:
                se1 se1Var = (se1) this.b;
                gh.b bVar4 = se1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                se1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                se1Var.v = paint2;
                Bitmap bitmap4 = se1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                se1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                se1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                se1Var.w = new Matrix();
                bVar4.a(bitmap3);
                hh.d.c(bVar4, se1Var.b);
                se1Var.F.d();
                break;
        }
    }
}
