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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a5(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        e91 e91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        org.telegram.ui.ActionBar.b6 b6Var6;
        org.telegram.ui.ActionBar.b6 b6Var7;
        org.telegram.ui.ActionBar.b6 b6Var8;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        int i11 = 14;
        final int i12 = 1;
        final int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        r10 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                b5 b5Var = (b5) this.b;
                b5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.w = false;
                ng.b bVar = b5Var.h;
                bVar.a((Bitmap) obj2);
                og.d.c(bVar, b5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                i9 i9Var = (i9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList2 = i9Var.C;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!i9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.l41 c11 = org.telegram.ui.Components.l41.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.l41.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = i9Var.G;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = i9Var.getMessagesController().getChat(l10)) != null) {
                            m8 m8Var = new m8(i9Var, i13);
                            int i20 = g9.a;
                            org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(g9.class);
                            J.G = chat;
                            J.D = m8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.l41.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        e9 e9Var = (e9) obj4;
                        mh.k3 k3Var = new mh.k3(i11, i9Var, e9Var);
                        int i21 = c9.a;
                        org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(c9.class);
                        J2.G = e9Var;
                        J2.D = k3Var;
                        J2.K(i9Var.k0(e9Var.c));
                        arrayList.add(J2);
                    }
                    if (!i9Var.F) {
                        arrayList.add(org.telegram.ui.Components.l41.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.l41.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.l41.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                fe feVar = (fe) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(feVar.u0).getChat(Long.valueOf(-feVar.v0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(feVar.u0).getChatFull(-feVar.v0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (feVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.l41.g(feVar.y0));
                    e91 e91Var2 = feVar.k1;
                    if (e91Var2 == null || e91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.l41.h(5, i22, e91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.l41.A(-1, null));
                    }
                    e91 e91Var3 = feVar.l1;
                    if (e91Var3 != null && !e91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.l41.h(2, i22, e91Var3));
                        arrayList4.add(org.telegram.ui.Components.l41.A(-2, charSequence));
                    }
                }
                if (feVar.c1 && (e91Var = feVar.m1) != null && !e91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.l41.h(2, i22, e91Var));
                    arrayList4.add(org.telegram.ui.Components.l41.A(-3, null));
                }
                if (feVar.n1) {
                    arrayList4.add(org.telegram.ui.Components.l41.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.l41.u(feVar.o1));
                    arrayList4.add(org.telegram.ui.Components.l41.u(feVar.p1));
                    arrayList4.add(org.telegram.ui.Components.l41.u(feVar.q1));
                    arrayList4.add(org.telegram.ui.Components.l41.A(-4, feVar.A0));
                }
                if (chat2 != null && chat2.creator) {
                    if (feVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.l41.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.l41.k(feVar.C0));
                        arrayList4.add(org.telegram.ui.Components.l41.A(-5, feVar.z0));
                        int i23 = MessagesController.getInstance(feVar.u0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = feVar.x0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(0, new lo0(i24, context, null, false));
                            eqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l41 i25 = org.telegram.ui.Components.l41.i(1, string);
                        if (feVar.x0 >= i23 && feVar.i1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.l41.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (feVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.l41.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.l41.j(3, feVar.I0));
                        arrayList4.add(org.telegram.ui.Components.l41.A(-6, feVar.B0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(feVar.u0).getChat(Long.valueOf(-feVar.v0))) && MessagesController.getInstance(feVar.u0).starrefConnectAllowed) {
                    arrayList4.add(mh.h.a(4, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uj, feVar.t0), R.drawable.filled_earn_stars, ho.c0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.l41.A(-7, null));
                }
                if (feVar.a1.a()) {
                    arrayList4.add(org.telegram.ui.Components.l41.p(feVar.a1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.l41.A(-10, null));
                    break;
                }
                break;
            case 3:
                zd zdVar = (zd) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                be beVar = zdVar.f;
                int i26 = zdVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = beVar.n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i27 = gh.ia.a;
                        org.telegram.ui.Components.l41 J3 = org.telegram.ui.Components.l41.J(gh.ia.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(beVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = beVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i28 = gh.ia.a;
                        org.telegram.ui.Components.l41 J4 = org.telegram.ui.Components.l41.J(gh.ia.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(beVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                ho hoVar = (ho) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    hoVar.getClass();
                    org.telegram.ui.Components.oc.a0(hoVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(hoVar.g0);
                AndroidUtilities.removeFromParent(hoVar.d0);
                AndroidUtilities.removeFromParent(hoVar.f0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new cq((jr) this.b, i12), 1000L);
                break;
            case 6:
                ((g5.b) this.b).r(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                is isVar = (is) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.R));
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.b));
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.c));
                if (TextUtils.isEmpty(isVar.b0())) {
                    arrayList8.add(org.telegram.ui.Components.l41.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (isVar.G) {
                    arrayList8.add(org.telegram.ui.Components.l41.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.l41.B(null));
                }
                if (isVar.E && isVar.G) {
                    org.telegram.ui.Components.l41 i29 = org.telegram.ui.Components.l41.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(isVar.T);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.l41.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.d));
                org.telegram.ui.Cells.j2.y(R.string.AddNotesInfo, arrayList8);
                if (isVar.E) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = isVar.getMessagesController().getUserFull(isVar.D);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.l41.k(isVar.B));
                    }
                    arrayList8.add(org.telegram.ui.Components.l41.k(isVar.x));
                    arrayList8.add(org.telegram.ui.Components.l41.k(isVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.l41.k(isVar.A));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.l41.B(null));
                    org.telegram.ui.Components.l41 e10 = org.telegram.ui.Components.l41.e(1, LocaleController.getString(R.string.DeleteContact));
                    e10.r = true;
                    arrayList8.add(e10);
                }
                arrayList8.add(org.telegram.ui.Components.l41.B(charSequence2));
                if (isVar.U) {
                    AndroidUtilities.runOnUIThread(new zr(isVar, user, i13));
                    isVar.U = false;
                    AndroidUtilities.runOnUIThread(new as(isVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                ht.a((ht) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                dt dtVar = (dt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.a;
                ft ftVar = htVar.l;
                if (ftVar != null) {
                    ftVar.F(charSequence3, TextUtils.join("", htVar.o), callback != null ? new df(26, dtVar, callback) : null);
                    if (callback == null) {
                        htVar.p();
                        break;
                    }
                }
                break;
            case 10:
                st.Q((st) this.b, (ArrayList) obj);
                break;
            case 11:
                dy dyVar = (dy) this.b;
                dyVar.L1 = (Long) obj;
                dyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final vy vyVar = (vy) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.l = string2;
                l41Var.k = i30;
                arrayList9.add(l41Var);
                org.telegram.ui.Components.l41 i31 = org.telegram.ui.Components.l41.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(vyVar.c);
                arrayList9.add(i31);
                if (vyVar.c) {
                    arrayList9.add(org.telegram.ui.Components.l41.B(null));
                    arrayList9.add(org.telegram.ui.Components.l41.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.ry
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    uy uyVar = (uy) view.getParent();
                                    vy vyVar2 = vyVar;
                                    vyVar2.d = true;
                                    uyVar.a(true, true);
                                    bg.y0 y0Var = vyVar2.f;
                                    if (y0Var != null) {
                                        y0Var.run(Boolean.valueOf(vyVar2.c), Boolean.valueOf(vyVar2.d));
                                    }
                                    vyVar2.T();
                                    break;
                                default:
                                    uy uyVar2 = (uy) view.getParent();
                                    vy vyVar3 = vyVar;
                                    vyVar3.d = false;
                                    uyVar2.a(false, true);
                                    bg.y0 y0Var2 = vyVar3.f;
                                    if (y0Var2 != null) {
                                        y0Var2.run(Boolean.valueOf(vyVar3.c), Boolean.valueOf(vyVar3.d));
                                    }
                                    vyVar3.T();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.ry
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    uy uyVar = (uy) view.getParent();
                                    vy vyVar2 = vyVar;
                                    vyVar2.d = true;
                                    uyVar.a(true, true);
                                    bg.y0 y0Var = vyVar2.f;
                                    if (y0Var != null) {
                                        y0Var.run(Boolean.valueOf(vyVar2.c), Boolean.valueOf(vyVar2.d));
                                    }
                                    vyVar2.T();
                                    break;
                                default:
                                    uy uyVar2 = (uy) view.getParent();
                                    vy vyVar3 = vyVar;
                                    vyVar3.d = false;
                                    uyVar2.a(false, true);
                                    bg.y0 y0Var2 = vyVar3.f;
                                    if (y0Var2 != null) {
                                        y0Var2.run(Boolean.valueOf(vyVar3.c), Boolean.valueOf(vyVar3.d));
                                    }
                                    vyVar3.T();
                                    break;
                            }
                        }
                    };
                    int i32 = ty.a;
                    org.telegram.ui.Components.l41 J5 = org.telegram.ui.Components.l41.J(ty.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(vyVar.d);
                    arrayList9.add(J5);
                    org.telegram.ui.Cells.j2.y(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                kb0 kb0Var = (kb0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                kb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(kb0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.l0.p(R.string.AIEditorStyleNotFound, kb0.b(), R.raw.error, 36);
                        break;
                    } else {
                        kb0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                iv0 iv0Var = (iv0) this.b;
                ng.b bVar2 = iv0Var.B;
                Bitmap bitmap = (Bitmap) obj2;
                iv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                iv0Var.w = paint;
                Bitmap bitmap2 = iv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                iv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? -0.02f : -0.04f);
                iv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                iv0Var.x = new Matrix();
                bVar2.a(bitmap);
                og.d.c(bVar2, iv0Var.c);
                iv0Var.C.d();
                break;
            case 16:
                pv0 pv0Var = (pv0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(2);
                l41Var2.l = string3;
                l41Var2.k = i33;
                arrayList10.add(l41Var2);
                org.telegram.ui.Components.l41 i34 = org.telegram.ui.Components.l41.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(pv0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.l41.A(2, null));
                if (pv0Var.r) {
                    org.telegram.ui.Cells.j2.l(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) pv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    fk0 fk0Var = new fk0(5);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = fk0Var;
                    pv0Var.b.d((int) Utilities.clamp(pv0Var.s, 10000L, 0L), w7Var, new w3(pv0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.l41.j(3, pv0Var.b));
                    arrayList10.add(org.telegram.ui.Components.l41.A(4, pv0Var.s > 0 ? pv0Var.V() : null));
                    TLRPC.Chat chat3 = pv0Var.getMessagesController().getChat(Long.valueOf(pv0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        pv0Var.c.setLink(pv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        org.telegram.ui.Cells.j2.l(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.l41.j(5, pv0Var.c));
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
                    privacySettingsActivity.z0(true);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ng.b bVar3 = profileActivity.l6;
                bVar3.a((Bitmap) obj2);
                og.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.m6.d();
                break;
            case 19:
                x21 x21Var = (x21) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.i51 i51Var = x21Var.f;
                y21 y21Var = x21Var.v;
                ArrayList arrayList12 = y21Var.h;
                bh.g gVar = x21Var.h;
                if (gVar.getMeasuredHeight() <= 0) {
                    gVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.l41 C = org.telegram.ui.Components.l41.C(gVar.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((gVar.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.c != null || x21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.c != null) {
                        Context context2 = x21Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.f6.L6;
                        b6Var = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i35, 21, 0, 0, false, false, b6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = x21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                        org.telegram.ui.Components.l41 k10 = org.telegram.ui.Components.l41.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (x21Var.b != null) {
                        for (int i36 = 0; i36 < x21Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.l41 l41Var3 = new org.telegram.ui.Components.l41(30);
                            l41Var3.l = x21Var.b.options.get(i36).text;
                            l41Var3.k = R.drawable.msg_arrowright;
                            l41Var3.d = i36;
                            arrayList11.add(l41Var3);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.c != null) {
                        for (int i37 = 0; i37 < x21Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.l41 l41Var4 = new org.telegram.ui.Components.l41(30);
                            l41Var4.l = x21Var.c.options.get(i37).text;
                            l41Var4.k = R.drawable.msg_arrowright;
                            l41Var4.d = i37;
                            arrayList11.add(l41Var4);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.d != null) {
                        if (x21Var.n == null) {
                            Context context3 = x21Var.getContext();
                            b6Var5 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            v21 v21Var = new v21(x21Var, context3, b6Var5);
                            x21Var.n = v21Var;
                            v21Var.setShowLimitWhenNear(100);
                        }
                        x21Var.n.b.setHint(LocaleController.getString(x21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.l41 k11 = org.telegram.ui.Components.l41.k(x21Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = y21Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i10 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i10 = R.string.Report2CommentInfoUser;
                        } else {
                            i9 = ((org.telegram.ui.ActionBar.f3) y21Var).currentAccount;
                            i10 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        org.telegram.ui.Cells.j2.y(i10, arrayList11);
                        if (x21Var.r == null) {
                            Context context4 = x21Var.getContext();
                            b6Var2 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            kh.d dVar = new kh.d(context4, b6Var2, true);
                            x21Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(x21Var.getContext());
                            x21Var.r = frameLayout;
                            int i38 = org.telegram.ui.ActionBar.f6.h5;
                            b6Var3 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i38, b6Var3));
                            x21Var.r.addView(x21Var.s, g7.e6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(x21Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.f6.d7;
                            b6Var4 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i39, b6Var4));
                            x21Var.r.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        x21Var.s.setEnabled(x21Var.d.optional || !TextUtils.isEmpty(x21Var.n.getText()));
                        x21Var.s.setOnClickListener(new q50(x21Var, 29));
                        org.telegram.ui.Components.l41 k12 = org.telegram.ui.Components.l41.k(x21Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.l41) j3.r0.j(1, arrayList11)).j = true;
                    if (y21Var.d && x21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(x21Var.getContext());
                        Context context5 = x21Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.f6.b7;
                        b6Var6 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7)), org.telegram.ui.ActionBar.f6.U0(context5, i40, org.telegram.ui.ActionBar.f6.v0(i41, b6Var6)), 0, 0);
                        fqVar.w = true;
                        frameLayout2.setBackground(fqVar);
                        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(x21Var.getContext(), null);
                        l80Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        b6Var7 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        l80Var.setText(AndroidUtilities.replaceLinks(string4, b6Var7));
                        int i42 = org.telegram.ui.ActionBar.f6.A6;
                        b6Var8 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i42, b6Var8));
                        l80Var.setGravity(17);
                        frameLayout2.addView(l80Var, g7.e6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.l41 k13 = org.telegram.ui.Components.l41.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (i51Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) y21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        i51Var.T2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        i51Var.T2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((d31) this.b).T));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((n31) this.b).T));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                l61.P((l61) this.b, (ArrayList) obj);
                break;
            case 24:
                k61 k61Var = (k61) this.b;
                ArrayList arrayList13 = k61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = k61Var.a;
                ArrayList arrayList14 = k61Var.d;
                if (tL_error3 != null) {
                    if (k61Var.r) {
                        arrayList14.clear();
                        k61Var.r = false;
                    }
                    k61Var.h = true;
                    k61Var.f = false;
                    int size5 = arrayList13.size();
                    while (i15 < size5) {
                        Object obj7 = arrayList13.get(i15);
                        i15++;
                        ((Runnable) obj7).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i43).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i43).putChats(channels_channelparticipants.chats, false);
                    if (k61Var.r) {
                        arrayList14.clear();
                        k61Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                    int size6 = arrayList15.size();
                    int i44 = 0;
                    while (i44 < size6) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i44);
                        i44++;
                        TLObject userOrChat = MessagesController.getInstance(i43).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList14.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        k61Var.h = true;
                    }
                    k61Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                o61 o61Var = (o61) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = o61Var.X;
                ih.n6 n6Var = o61Var.V;
                if (n6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.l41.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = n6Var.i;
                    int size8 = arrayList17.size();
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < size8) {
                        Object obj9 = arrayList17.get(i47);
                        i47++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i48 = z91.b;
                        org.telegram.ui.Components.l41 J6 = org.telegram.ui.Components.l41.J(z91.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(o61Var.W.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i46--;
                        if (i46 == 0) {
                            i46 = i45;
                        }
                    }
                    if (n6Var.k() || !n6Var.r) {
                        while (true) {
                            if (i14 < (i46 <= 0 ? i45 : i46)) {
                                i14++;
                                org.telegram.ui.Components.l41 o6 = org.telegram.ui.Components.l41.o(i14, 34);
                                o6.u = 1;
                                arrayList16.add(o6);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.l41.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                z71.Z((z71) this.b, (ArrayList) obj);
                break;
            case 27:
                k81 k81Var = (k81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = k81Var.U;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.l41.k(linearLayout));
                }
                LinearLayout linearLayout2 = k81Var.V;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.l41.k(linearLayout2));
                    break;
                }
                break;
            default:
                dd1 dd1Var = (dd1) this.b;
                ng.b bVar4 = dd1Var.A;
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.f6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.f6.I.q() ? -0.02f : -0.04f);
                dd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                dd1Var.w = new Matrix();
                bVar4.a(bitmap3);
                og.d.c(bVar4, dd1Var.b);
                dd1Var.B.d();
                break;
        }
    }
}
