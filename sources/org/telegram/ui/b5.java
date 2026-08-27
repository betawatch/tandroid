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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        c91 c91Var;
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
        int i12 = 15;
        final int i13 = 1;
        final int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        r11 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                c5 c5Var = (c5) this.b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.w = false;
                og.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                pg.c.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                j9 j9Var = (j9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = j9Var.G.isEmpty();
                ArrayList arrayList2 = j9Var.C;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!j9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.n41 c11 = org.telegram.ui.Components.n41.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.n41.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = j9Var.G;
                    int size = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj3 = arrayList3.get(i20);
                        i20++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = j9Var.getMessagesController().getChat(l10)) != null) {
                            n8 n8Var = new n8(j9Var, i14);
                            int i21 = h9.a;
                            org.telegram.ui.Components.n41 J = org.telegram.ui.Components.n41.J(h9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.n41.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        f9 f9Var = (f9) obj4;
                        nh.x1 x1Var = new nh.x1(i12, j9Var, f9Var);
                        int i22 = d9.a;
                        org.telegram.ui.Components.n41 J2 = org.telegram.ui.Components.n41.J(d9.class);
                        J2.G = f9Var;
                        J2.D = x1Var;
                        J2.K(j9Var.l0(f9Var.c));
                        arrayList.add(J2);
                    }
                    if (!j9Var.F) {
                        arrayList.add(org.telegram.ui.Components.n41.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.n41.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.n41.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                fe feVar = (fe) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(feVar.u0).getChat(Long.valueOf(-feVar.v0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(feVar.u0).getChatFull(-feVar.v0);
                int i23 = chatFull != null ? chatFull.stats_dc : -1;
                if (feVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.n41.g(feVar.y0));
                    c91 c91Var2 = feVar.k1;
                    if (c91Var2 == null || c91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.n41.h(5, i23, c91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.n41.A(-1, null));
                    }
                    c91 c91Var3 = feVar.l1;
                    if (c91Var3 != null && !c91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.n41.h(2, i23, c91Var3));
                        arrayList4.add(org.telegram.ui.Components.n41.A(-2, charSequence));
                    }
                }
                if (feVar.c1 && (c91Var = feVar.m1) != null && !c91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.n41.h(2, i23, c91Var));
                    arrayList4.add(org.telegram.ui.Components.n41.A(-3, null));
                }
                if (feVar.n1) {
                    arrayList4.add(org.telegram.ui.Components.n41.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.n41.u(feVar.o1));
                    arrayList4.add(org.telegram.ui.Components.n41.u(feVar.p1));
                    arrayList4.add(org.telegram.ui.Components.n41.u(feVar.q1));
                    arrayList4.add(org.telegram.ui.Components.n41.A(-4, feVar.A0));
                }
                if (chat2 != null && chat2.creator) {
                    if (feVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.n41.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.n41.k(feVar.C0));
                        arrayList4.add(org.telegram.ui.Components.n41.A(-5, feVar.z0));
                        int i24 = MessagesController.getInstance(feVar.u0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i25 = feVar.x0 < i24 ? i24 : 0;
                        if (i25 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(0, new mo0(i25, context, null, false));
                            cqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.n41 i26 = org.telegram.ui.Components.n41.i(1, string);
                        if (feVar.x0 >= i24 && feVar.i1) {
                            z10 = true;
                        }
                        i26.K(z10);
                        arrayList4.add(i26);
                        arrayList4.add(org.telegram.ui.Components.n41.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (feVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.n41.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.n41.j(3, feVar.I0));
                        arrayList4.add(org.telegram.ui.Components.n41.A(-6, feVar.B0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(feVar.u0).getChat(Long.valueOf(-feVar.v0))) && MessagesController.getInstance(feVar.u0).starrefConnectAllowed) {
                    arrayList4.add(nh.g.a(4, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, feVar.t0), R.drawable.filled_earn_stars, jo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.n41.A(-7, null));
                }
                if (feVar.a1.a()) {
                    arrayList4.add(org.telegram.ui.Components.n41.p(feVar.a1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.n41.A(-10, null));
                    break;
                }
                break;
            case 3:
                zd zdVar = (zd) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                be beVar = zdVar.f;
                int i27 = zdVar.d;
                if (i27 == 0) {
                    ArrayList arrayList6 = beVar.n;
                    int size3 = arrayList6.size();
                    while (i18 < size3) {
                        Object obj5 = arrayList6.get(i18);
                        i18++;
                        int i28 = hh.ia.a;
                        org.telegram.ui.Components.n41 J3 = org.telegram.ui.Components.n41.J(hh.ia.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(beVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i27 == 1) {
                    ArrayList arrayList7 = beVar.h;
                    int size4 = arrayList7.size();
                    while (i19 < size4) {
                        Object obj6 = arrayList7.get(i19);
                        i19++;
                        int i29 = hh.ia.a;
                        org.telegram.ui.Components.n41 J4 = org.telegram.ui.Components.n41.J(hh.ia.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(beVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.n41.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                jo joVar = (jo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    joVar.getClass();
                    org.telegram.ui.Components.mc.a0(joVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(joVar.g0);
                AndroidUtilities.removeFromParent(joVar.d0);
                AndroidUtilities.removeFromParent(joVar.f0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new eq((lr) this.b, i13), 1000L);
                break;
            case 6:
                ((g5.b) this.b).r(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                js jsVar = (js) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.R));
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.b));
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.c));
                if (TextUtils.isEmpty(jsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.n41.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (jsVar.G) {
                    arrayList8.add(org.telegram.ui.Components.n41.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.n41.B(null));
                }
                if (jsVar.E && jsVar.G) {
                    org.telegram.ui.Components.n41 i30 = org.telegram.ui.Components.n41.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i30.K(jsVar.T);
                    arrayList8.add(i30);
                    arrayList8.add(org.telegram.ui.Components.n41.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.d));
                org.telegram.ui.Cells.pa.A(R.string.AddNotesInfo, arrayList8);
                if (jsVar.E) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.D);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.B));
                    }
                    arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.x));
                    arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.n41.k(jsVar.A));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.n41.B(null));
                    org.telegram.ui.Components.n41 e9 = org.telegram.ui.Components.n41.e(1, LocaleController.getString(R.string.DeleteContact));
                    e9.r = true;
                    arrayList8.add(e9);
                }
                arrayList8.add(org.telegram.ui.Components.n41.B(charSequence2));
                if (jsVar.U) {
                    AndroidUtilities.runOnUIThread(new as(jsVar, user, i14));
                    jsVar.U = false;
                    AndroidUtilities.runOnUIThread(new bs(jsVar, i14), 200L);
                    break;
                }
                break;
            case 8:
                kt.a((kt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                ft ftVar = (ft) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                kt ktVar = ftVar.a;
                ht htVar = ktVar.l;
                if (htVar != null) {
                    htVar.E(charSequence3, TextUtils.join("", ktVar.o), callback != null ? new df(26, ftVar, callback) : null);
                    if (callback == null) {
                        ktVar.p();
                        break;
                    }
                }
                break;
            case 10:
                vt.R((vt) this.b, (ArrayList) obj);
                break;
            case 11:
                gy gyVar = (gy) this.b;
                gyVar.L1 = (Long) obj;
                gyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final yy yyVar = (yy) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i31 = R.raw.topics_top;
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(2);
                n41Var.l = string2;
                n41Var.k = i31;
                arrayList9.add(n41Var);
                org.telegram.ui.Components.n41 i32 = org.telegram.ui.Components.n41.i(1, LocaleController.getString(R.string.TopicsEnable));
                i32.K(yyVar.c);
                arrayList9.add(i32);
                if (yyVar.c) {
                    arrayList9.add(org.telegram.ui.Components.n41.B(null));
                    arrayList9.add(org.telegram.ui.Components.n41.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.uy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    xy xyVar = (xy) view.getParent();
                                    yy yyVar2 = yyVar;
                                    yyVar2.d = true;
                                    xyVar.a(true, true);
                                    cg.u0 u0Var = yyVar2.f;
                                    if (u0Var != null) {
                                        u0Var.run(Boolean.valueOf(yyVar2.c), Boolean.valueOf(yyVar2.d));
                                    }
                                    yyVar2.U();
                                    break;
                                default:
                                    xy xyVar2 = (xy) view.getParent();
                                    yy yyVar3 = yyVar;
                                    yyVar3.d = false;
                                    xyVar2.a(false, true);
                                    cg.u0 u0Var2 = yyVar3.f;
                                    if (u0Var2 != null) {
                                        u0Var2.run(Boolean.valueOf(yyVar3.c), Boolean.valueOf(yyVar3.d));
                                    }
                                    yyVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.uy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    xy xyVar = (xy) view.getParent();
                                    yy yyVar2 = yyVar;
                                    yyVar2.d = true;
                                    xyVar.a(true, true);
                                    cg.u0 u0Var = yyVar2.f;
                                    if (u0Var != null) {
                                        u0Var.run(Boolean.valueOf(yyVar2.c), Boolean.valueOf(yyVar2.d));
                                    }
                                    yyVar2.U();
                                    break;
                                default:
                                    xy xyVar2 = (xy) view.getParent();
                                    yy yyVar3 = yyVar;
                                    yyVar3.d = false;
                                    xyVar2.a(false, true);
                                    cg.u0 u0Var2 = yyVar3.f;
                                    if (u0Var2 != null) {
                                        u0Var2.run(Boolean.valueOf(yyVar3.c), Boolean.valueOf(yyVar3.d));
                                    }
                                    yyVar3.U();
                                    break;
                            }
                        }
                    };
                    int i33 = wy.a;
                    org.telegram.ui.Components.n41 J5 = org.telegram.ui.Components.n41.J(wy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(yyVar.d);
                    arrayList9.add(J5);
                    org.telegram.ui.Cells.pa.A(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                ob0 ob0Var = (ob0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ob0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ob0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.y1.q(R.string.AIEditorStyleNotFound, ob0.b(), R.raw.error, 36);
                        break;
                    } else {
                        ob0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                jv0 jv0Var = (jv0) this.b;
                og.b bVar2 = jv0Var.B;
                Bitmap bitmap = (Bitmap) obj2;
                jv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                jv0Var.w = paint;
                Bitmap bitmap2 = jv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                jv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                jv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                jv0Var.x = new Matrix();
                bVar2.a(bitmap);
                pg.c.c(bVar2, jv0Var.c);
                jv0Var.C.d();
                break;
            case 16:
                qv0 qv0Var = (qv0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i34 = R.raw.bubble;
                org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(2);
                n41Var2.l = string3;
                n41Var2.k = i34;
                arrayList10.add(n41Var2);
                org.telegram.ui.Components.n41 i35 = org.telegram.ui.Components.n41.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i35.K(qv0Var.r);
                arrayList10.add(i35);
                arrayList10.add(org.telegram.ui.Components.n41.A(2, null));
                if (qv0Var.r) {
                    org.telegram.ui.Cells.pa.o(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.u7.a((int) qv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    j70 j70Var = new j70(10);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a2;
                    t7Var.d = 20;
                    t7Var.e = j70Var;
                    qv0Var.b.d((int) Utilities.clamp(qv0Var.s, 10000L, 0L), t7Var, new x3(qv0Var, i12));
                    arrayList10.add(org.telegram.ui.Components.n41.j(3, qv0Var.b));
                    arrayList10.add(org.telegram.ui.Components.n41.A(4, qv0Var.s > 0 ? qv0Var.W() : null));
                    TLRPC.Chat chat3 = qv0Var.getMessagesController().getChat(Long.valueOf(qv0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        qv0Var.c.setLink(qv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        org.telegram.ui.Cells.pa.o(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.n41.j(5, qv0Var.c));
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
                og.b bVar3 = profileActivity.l6;
                bVar3.a((Bitmap) obj2);
                pg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.m6.d();
                break;
            case 19:
                w21 w21Var = (w21) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var = w21Var.f;
                x21 x21Var = w21Var.v;
                ArrayList arrayList12 = x21Var.h;
                ag.w wVar = w21Var.h;
                if (wVar.getMeasuredHeight() <= 0) {
                    wVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.n41 C = org.telegram.ui.Components.n41.C(wVar.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((wVar.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.c != null || w21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.c != null) {
                        Context context2 = w21Var.getContext();
                        int i36 = org.telegram.ui.ActionBar.g6.L6;
                        c6Var = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context2, i36, 21, 0, 0, false, false, c6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = w21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            j4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                j4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        j4Var.setBackgroundColor(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                        org.telegram.ui.Components.n41 k10 = org.telegram.ui.Components.n41.k(j4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (w21Var.b != null) {
                        for (int i37 = 0; i37 < w21Var.b.options.size(); i37++) {
                            org.telegram.ui.Components.n41 n41Var3 = new org.telegram.ui.Components.n41(30);
                            n41Var3.l = w21Var.b.options.get(i37).text;
                            n41Var3.k = R.drawable.msg_arrowright;
                            n41Var3.d = i37;
                            arrayList11.add(n41Var3);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.c != null) {
                        for (int i38 = 0; i38 < w21Var.c.options.size(); i38++) {
                            org.telegram.ui.Components.n41 n41Var4 = new org.telegram.ui.Components.n41(30);
                            n41Var4.l = w21Var.c.options.get(i38).text;
                            n41Var4.k = R.drawable.msg_arrowright;
                            n41Var4.d = i38;
                            arrayList11.add(n41Var4);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.d != null) {
                        if (w21Var.n == null) {
                            Context context3 = w21Var.getContext();
                            c6Var5 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                            u21 u21Var = new u21(w21Var, context3, c6Var5);
                            w21Var.n = u21Var;
                            u21Var.setShowLimitWhenNear(100);
                        }
                        w21Var.n.b.setHint(LocaleController.getString(w21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.n41 k11 = org.telegram.ui.Components.n41.k(w21Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = x21Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.e3) x21Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        org.telegram.ui.Cells.pa.A(i11, arrayList11);
                        if (w21Var.r == null) {
                            Context context4 = w21Var.getContext();
                            c6Var2 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                            lh.d dVar = new lh.d(context4, c6Var2, true);
                            w21Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(w21Var.getContext());
                            w21Var.r = frameLayout;
                            int i39 = org.telegram.ui.ActionBar.g6.h5;
                            c6Var3 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i39, c6Var3));
                            w21Var.r.addView(w21Var.s, h7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(w21Var.getContext());
                            int i40 = org.telegram.ui.ActionBar.g6.d7;
                            c6Var4 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i40, c6Var4));
                            w21Var.r.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        w21Var.s.setEnabled(w21Var.d.optional || !TextUtils.isEmpty(w21Var.n.getText()));
                        w21Var.s.setOnClickListener(new u50(w21Var, 29));
                        org.telegram.ui.Components.n41 k12 = org.telegram.ui.Components.n41.k(w21Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.n41) i0.a.i(1, arrayList11)).j = true;
                    if (x21Var.d && w21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(w21Var.getContext());
                        Context context5 = w21Var.getContext();
                        int i41 = R.drawable.greydivider;
                        int i42 = org.telegram.ui.ActionBar.g6.b7;
                        c6Var6 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.U0(context5, i41, org.telegram.ui.ActionBar.g6.v0(i42, c6Var6)), 0, 0);
                        dqVar.w = true;
                        frameLayout2.setBackground(dqVar);
                        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(w21Var.getContext(), null);
                        p80Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        c6Var7 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                        p80Var.setText(AndroidUtilities.replaceLinks(string4, c6Var7));
                        int i43 = org.telegram.ui.ActionBar.g6.A6;
                        c6Var8 = ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider;
                        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i43, c6Var8));
                        p80Var.setGravity(17);
                        frameLayout2.addView(p80Var, h7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.n41 k13 = org.telegram.ui.Components.n41.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (k51Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.e3) x21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        k51Var.T2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        k51Var.T2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((c31) this.b).T));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((m31) this.b).T));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                k61.Q((k61) this.b, (ArrayList) obj);
                break;
            case 24:
                j61 j61Var = (j61) this.b;
                ArrayList arrayList13 = j61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i44 = j61Var.a;
                ArrayList arrayList14 = j61Var.d;
                if (tL_error3 != null) {
                    if (j61Var.r) {
                        arrayList14.clear();
                        j61Var.r = false;
                    }
                    j61Var.h = true;
                    j61Var.f = false;
                    int size5 = arrayList13.size();
                    while (i16 < size5) {
                        Object obj7 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj7).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i44).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i44).putChats(channels_channelparticipants.chats, false);
                    if (j61Var.r) {
                        arrayList14.clear();
                        j61Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                    int size6 = arrayList15.size();
                    int i45 = 0;
                    while (i45 < size6) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i45);
                        i45++;
                        TLObject userOrChat = MessagesController.getInstance(i44).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList14.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        j61Var.h = true;
                    }
                    j61Var.f = false;
                    int size7 = arrayList13.size();
                    while (i17 < size7) {
                        Object obj8 = arrayList13.get(i17);
                        i17++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                n61 n61Var = (n61) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i46 = n61Var.X;
                jh.j6 j6Var = n61Var.V;
                if (j6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.n41.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = j6Var.i;
                    int size8 = arrayList17.size();
                    int i47 = i46;
                    int i48 = 0;
                    while (i48 < size8) {
                        Object obj9 = arrayList17.get(i48);
                        i48++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i49 = x91.b;
                        org.telegram.ui.Components.n41 J6 = org.telegram.ui.Components.n41.J(x91.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i46;
                        J6.K(n61Var.W.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i47--;
                        if (i47 == 0) {
                            i47 = i46;
                        }
                    }
                    if (j6Var.k() || !j6Var.r) {
                        while (true) {
                            if (i15 < (i47 <= 0 ? i46 : i47)) {
                                i15++;
                                org.telegram.ui.Components.n41 o10 = org.telegram.ui.Components.n41.o(i15, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.n41.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                x71.a0((x71) this.b, (ArrayList) obj);
                break;
            case 27:
                i81 i81Var = (i81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = i81Var.U;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.n41.k(linearLayout));
                }
                LinearLayout linearLayout2 = i81Var.V;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.n41.k(linearLayout2));
                    break;
                }
                break;
            default:
                dd1 dd1Var = (dd1) this.b;
                og.b bVar4 = dd1Var.A;
                Bitmap bitmap3 = (Bitmap) obj2;
                dd1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                dd1Var.v = paint2;
                Bitmap bitmap4 = dd1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                dd1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                dd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                dd1Var.w = new Matrix();
                bVar4.a(bitmap3);
                pg.c.c(bVar4, dd1Var.b);
                dd1Var.B.d();
                break;
        }
    }
}
