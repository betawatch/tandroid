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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        f91 f91Var;
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
        switch (this.a) {
            case 0:
                c5 c5Var = (c5) this.b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.w = false;
                qg.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                rg.c.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                h9 h9Var = (h9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = h9Var.G.isEmpty();
                ArrayList arrayList2 = h9Var.C;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.w41 c3 = org.telegram.ui.Components.w41.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.q = true;
                    arrayList.add(c3);
                    if (!h9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.w41 c6 = org.telegram.ui.Components.w41.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c6.q = true;
                        arrayList.add(c6);
                    }
                    arrayList.add(org.telegram.ui.Components.w41.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = h9Var.G;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList3.get(i15);
                        i15++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = h9Var.getMessagesController().getChat(l10)) != null) {
                            l8 l8Var = new l8(h9Var, 0);
                            int i16 = f9.a;
                            org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(f9.class);
                            J.G = chat;
                            J.D = l8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.w41.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList2.get(i17);
                        i17++;
                        d9 d9Var = (d9) obj4;
                        nh.r7 r7Var = new nh.r7(i12, h9Var, d9Var);
                        int i18 = b9.a;
                        org.telegram.ui.Components.w41 J2 = org.telegram.ui.Components.w41.J(b9.class);
                        J2.G = d9Var;
                        J2.D = r7Var;
                        J2.K(h9Var.l0(d9Var.c));
                        arrayList.add(J2);
                    }
                    if (!h9Var.F) {
                        arrayList.add(org.telegram.ui.Components.w41.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.w41.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.w41.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                de deVar = (de) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(deVar.u0).getChat(Long.valueOf(-deVar.v0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(deVar.u0).getChatFull(-deVar.v0);
                int i19 = chatFull != null ? chatFull.stats_dc : -1;
                if (deVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.w41.g(deVar.y0));
                    f91 f91Var2 = deVar.k1;
                    if (f91Var2 == null || f91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.w41.h(5, i19, f91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.w41.A(-1, null));
                    }
                    f91 f91Var3 = deVar.l1;
                    if (f91Var3 != null && !f91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.w41.h(2, i19, f91Var3));
                        arrayList4.add(org.telegram.ui.Components.w41.A(-2, charSequence));
                    }
                }
                if (deVar.c1 && (f91Var = deVar.m1) != null && !f91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.w41.h(2, i19, f91Var));
                    arrayList4.add(org.telegram.ui.Components.w41.A(-3, null));
                }
                if (deVar.n1) {
                    arrayList4.add(org.telegram.ui.Components.w41.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.w41.u(deVar.o1));
                    arrayList4.add(org.telegram.ui.Components.w41.u(deVar.p1));
                    arrayList4.add(org.telegram.ui.Components.w41.u(deVar.q1));
                    arrayList4.add(org.telegram.ui.Components.w41.A(-4, deVar.A0));
                }
                if (chat2 != null && chat2.creator) {
                    if (deVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.w41.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.w41.k(deVar.C0));
                        arrayList4.add(org.telegram.ui.Components.w41.A(-5, deVar.z0));
                        int i20 = MessagesController.getInstance(deVar.u0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i21 = deVar.x0 < i20 ? i20 : 0;
                        if (i21 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(0, new ko0(i21, context, null, false));
                            iqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.w41 i22 = org.telegram.ui.Components.w41.i(1, string);
                        i22.K(deVar.x0 >= i20 && deVar.i1);
                        arrayList4.add(i22);
                        arrayList4.add(org.telegram.ui.Components.w41.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (deVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.w41.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.w41.j(3, deVar.I0));
                        arrayList4.add(org.telegram.ui.Components.w41.A(-6, deVar.B0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(deVar.u0).getChat(Long.valueOf(-deVar.v0))) && MessagesController.getInstance(deVar.u0).starrefConnectAllowed) {
                    arrayList4.add(ph.f.a(4, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, deVar.t0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.w41.A(-7, null));
                }
                if (deVar.a1.a()) {
                    arrayList4.add(org.telegram.ui.Components.w41.p(deVar.a1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.w41.A(-10, null));
                    break;
                }
                break;
            case 3:
                xd xdVar = (xd) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                zd zdVar = xdVar.f;
                int i23 = xdVar.d;
                if (i23 == 0) {
                    ArrayList arrayList6 = zdVar.n;
                    int size3 = arrayList6.size();
                    while (i14 < size3) {
                        Object obj5 = arrayList6.get(i14);
                        i14++;
                        int i24 = jh.ca.a;
                        org.telegram.ui.Components.w41 J3 = org.telegram.ui.Components.w41.J(jh.ca.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(zdVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i23 == 1) {
                    ArrayList arrayList7 = zdVar.h;
                    int size4 = arrayList7.size();
                    while (i14 < size4) {
                        Object obj6 = arrayList7.get(i14);
                        i14++;
                        int i25 = jh.ca.a;
                        org.telegram.ui.Components.w41 J4 = org.telegram.ui.Components.w41.J(jh.ca.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(zdVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                ko koVar = (ko) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    koVar.getClass();
                    org.telegram.ui.Components.tc.a0(koVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(koVar.g0);
                AndroidUtilities.removeFromParent(koVar.d0);
                AndroidUtilities.removeFromParent(koVar.f0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new eq((jr) this.b, i13), 1000L);
                break;
            case 6:
                ((g9.l) this.b).o(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                hs hsVar = (hs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.R));
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.b));
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.c));
                if (TextUtils.isEmpty(hsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.w41.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.G) {
                    arrayList8.add(org.telegram.ui.Components.w41.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.w41.B(null));
                }
                if (hsVar.E && hsVar.G) {
                    org.telegram.ui.Components.w41 i26 = org.telegram.ui.Components.w41.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i26.K(hsVar.T);
                    arrayList8.add(i26);
                    arrayList8.add(org.telegram.ui.Components.w41.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.d));
                th.A(R.string.AddNotesInfo, arrayList8);
                if (hsVar.E) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.D);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.B));
                    }
                    arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.x));
                    arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.A));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.w41.B(null));
                    org.telegram.ui.Components.w41 e10 = org.telegram.ui.Components.w41.e(1, LocaleController.getString(R.string.DeleteContact));
                    e10.r = true;
                    arrayList8.add(e10);
                }
                arrayList8.add(org.telegram.ui.Components.w41.B(charSequence2));
                if (hsVar.U) {
                    AndroidUtilities.runOnUIThread(new yr(hsVar, user, i14));
                    hsVar.U = false;
                    AndroidUtilities.runOnUIThread(new zr(hsVar, i14), 200L);
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
                    ftVar.F(charSequence3, TextUtils.join("", htVar.o), callback != null ? new tm(19, dtVar, callback) : null);
                    if (callback == null) {
                        htVar.p();
                        break;
                    }
                }
                break;
            case 10:
                tt.R((tt) this.b, (ArrayList) obj);
                break;
            case 11:
                fy fyVar = (fy) this.b;
                fyVar.L1 = (Long) obj;
                fyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final xy xyVar = (xy) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i27 = R.raw.topics_top;
                org.telegram.ui.Components.w41 w41Var = new org.telegram.ui.Components.w41(2);
                w41Var.l = string2;
                w41Var.k = i27;
                arrayList9.add(w41Var);
                org.telegram.ui.Components.w41 i28 = org.telegram.ui.Components.w41.i(1, LocaleController.getString(R.string.TopicsEnable));
                i28.K(xyVar.c);
                arrayList9.add(i28);
                if (xyVar.c) {
                    arrayList9.add(org.telegram.ui.Components.w41.B(null));
                    arrayList9.add(org.telegram.ui.Components.w41.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.ty
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    wy wyVar = (wy) view.getParent();
                                    xy xyVar2 = xyVar;
                                    xyVar2.d = true;
                                    wyVar.a(true, true);
                                    bh.v vVar = xyVar2.f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(xyVar2.c), Boolean.valueOf(xyVar2.d));
                                    }
                                    xyVar2.U();
                                    break;
                                default:
                                    wy wyVar2 = (wy) view.getParent();
                                    xy xyVar3 = xyVar;
                                    xyVar3.d = false;
                                    wyVar2.a(false, true);
                                    bh.v vVar2 = xyVar3.f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(xyVar3.c), Boolean.valueOf(xyVar3.d));
                                    }
                                    xyVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.ty
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    wy wyVar = (wy) view.getParent();
                                    xy xyVar2 = xyVar;
                                    xyVar2.d = true;
                                    wyVar.a(true, true);
                                    bh.v vVar = xyVar2.f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(xyVar2.c), Boolean.valueOf(xyVar2.d));
                                    }
                                    xyVar2.U();
                                    break;
                                default:
                                    wy wyVar2 = (wy) view.getParent();
                                    xy xyVar3 = xyVar;
                                    xyVar3.d = false;
                                    wyVar2.a(false, true);
                                    bh.v vVar2 = xyVar3.f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(xyVar3.c), Boolean.valueOf(xyVar3.d));
                                    }
                                    xyVar3.U();
                                    break;
                            }
                        }
                    };
                    int i29 = vy.a;
                    org.telegram.ui.Components.w41 J5 = org.telegram.ui.Components.w41.J(vy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(xyVar.d);
                    arrayList9.add(J5);
                    th.A(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                mb0 mb0Var = (mb0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                mb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(mb0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.s(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        j7.l1.v(R.string.AIEditorStyleNotFound, mb0.b(), R.raw.error, 36);
                        break;
                    } else {
                        mb0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                iv0 iv0Var = (iv0) this.b;
                qg.b bVar2 = iv0Var.B;
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                iv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                iv0Var.x = new Matrix();
                bVar2.a(bitmap);
                rg.c.c(bVar2, iv0Var.c);
                iv0Var.C.d();
                break;
            case 16:
                pv0 pv0Var = (pv0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i30 = R.raw.bubble;
                org.telegram.ui.Components.w41 w41Var2 = new org.telegram.ui.Components.w41(2);
                w41Var2.l = string3;
                w41Var2.k = i30;
                arrayList10.add(w41Var2);
                org.telegram.ui.Components.w41 i31 = org.telegram.ui.Components.w41.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i31.K(pv0Var.r);
                arrayList10.add(i31);
                arrayList10.add(org.telegram.ui.Components.w41.A(2, null));
                if (pv0Var.r) {
                    th.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.v7.a((int) pv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.xo0 xo0Var = new org.telegram.ui.Components.xo0(29);
                    org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7();
                    u7Var.c = a2;
                    u7Var.d = 20;
                    u7Var.e = xo0Var;
                    pv0Var.b.d((int) Utilities.clamp(pv0Var.s, 10000L, 0L), u7Var, new x3(pv0Var, i12));
                    arrayList10.add(org.telegram.ui.Components.w41.j(3, pv0Var.b));
                    arrayList10.add(org.telegram.ui.Components.w41.A(4, pv0Var.s > 0 ? pv0Var.W() : null));
                    TLRPC.Chat chat3 = pv0Var.getMessagesController().getChat(Long.valueOf(pv0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        pv0Var.c.setLink(pv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        th.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.w41.j(5, pv0Var.c));
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
                qg.b bVar3 = profileActivity.l6;
                bVar3.a((Bitmap) obj2);
                rg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.m6.d();
                break;
            case 19:
                x21 x21Var = (x21) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.u51 u51Var = x21Var.f;
                y21 y21Var = x21Var.v;
                ArrayList arrayList12 = y21Var.h;
                bg.u1 u1Var = x21Var.h;
                if (u1Var.getMeasuredHeight() <= 0) {
                    u1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.w41 C = org.telegram.ui.Components.w41.C(u1Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((u1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.c != null || x21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.c != null) {
                        Context context2 = x21Var.getContext();
                        int i32 = org.telegram.ui.ActionBar.g6.L6;
                        c6Var = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context2, i32, 21, 0, 0, false, false, c6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = x21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            k4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                k4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        k4Var.setBackgroundColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                        org.telegram.ui.Components.w41 k9 = org.telegram.ui.Components.w41.k(k4Var);
                        k9.d = -2;
                        arrayList11.add(k9);
                        measuredHeight += 40;
                    }
                    if (x21Var.b != null) {
                        for (int i33 = 0; i33 < x21Var.b.options.size(); i33++) {
                            org.telegram.ui.Components.w41 w41Var3 = new org.telegram.ui.Components.w41(30);
                            w41Var3.l = x21Var.b.options.get(i33).text;
                            w41Var3.k = R.drawable.msg_arrowright;
                            w41Var3.d = i33;
                            arrayList11.add(w41Var3);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.c != null) {
                        for (int i34 = 0; i34 < x21Var.c.options.size(); i34++) {
                            org.telegram.ui.Components.w41 w41Var4 = new org.telegram.ui.Components.w41(30);
                            w41Var4.l = x21Var.c.options.get(i34).text;
                            w41Var4.k = R.drawable.msg_arrowright;
                            w41Var4.d = i34;
                            arrayList11.add(w41Var4);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.d != null) {
                        if (x21Var.n == null) {
                            Context context3 = x21Var.getContext();
                            c6Var5 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            v21 v21Var = new v21(x21Var, context3, c6Var5);
                            x21Var.n = v21Var;
                            v21Var.setShowLimitWhenNear(100);
                        }
                        x21Var.n.b.setHint(LocaleController.getString(x21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.w41 k10 = org.telegram.ui.Components.w41.k(x21Var.n);
                        k10.d = -3;
                        arrayList11.add(k10);
                        long j10 = y21Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.f3) y21Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        th.A(i11, arrayList11);
                        if (x21Var.r == null) {
                            Context context4 = x21Var.getContext();
                            c6Var2 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            nh.d dVar = new nh.d(context4, c6Var2, true);
                            x21Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(x21Var.getContext());
                            x21Var.r = frameLayout;
                            int i35 = org.telegram.ui.ActionBar.g6.h5;
                            c6Var3 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i35, c6Var3));
                            x21Var.r.addView(x21Var.s, i7.f6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(x21Var.getContext());
                            int i36 = org.telegram.ui.ActionBar.g6.d7;
                            c6Var4 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i36, c6Var4));
                            x21Var.r.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        x21Var.s.setEnabled(x21Var.d.optional || !TextUtils.isEmpty(x21Var.n.getText()));
                        x21Var.s.setOnClickListener(new t50(x21Var, 29));
                        org.telegram.ui.Components.w41 k11 = org.telegram.ui.Components.w41.k(x21Var.r);
                        k11.d = -4;
                        arrayList11.add(k11);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.w41) j7.l1.i(1, arrayList11)).j = true;
                    if (y21Var.d && x21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(x21Var.getContext());
                        Context context5 = x21Var.getContext();
                        int i37 = R.drawable.greydivider;
                        int i38 = org.telegram.ui.ActionBar.g6.b7;
                        c6Var6 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(y21Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.U0(context5, i37, org.telegram.ui.ActionBar.g6.v0(i38, c6Var6)), 0, 0);
                        jqVar.w = true;
                        frameLayout2.setBackground(jqVar);
                        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(x21Var.getContext(), null);
                        y80Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        c6Var7 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        y80Var.setText(AndroidUtilities.replaceLinks(string4, c6Var7));
                        int i39 = org.telegram.ui.ActionBar.g6.A6;
                        c6Var8 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
                        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i39, c6Var8));
                        y80Var.setGravity(17);
                        frameLayout2.addView(y80Var, i7.f6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.w41 k12 = org.telegram.ui.Components.w41.k(frameLayout2);
                        k12.d = -3;
                        arrayList11.add(k12);
                        measuredHeight += 46;
                    }
                }
                if (u51Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) y21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        u51Var.T2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        u51Var.T2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.w41.k(((d31) this.b).T));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.w41.k(((o31) this.b).T));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                n61.Q((n61) this.b, (ArrayList) obj);
                break;
            case 24:
                m61 m61Var = (m61) this.b;
                ArrayList arrayList13 = m61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i40 = m61Var.a;
                ArrayList arrayList14 = m61Var.d;
                if (tL_error3 != null) {
                    if (m61Var.r) {
                        arrayList14.clear();
                        m61Var.r = false;
                    }
                    m61Var.h = true;
                    m61Var.f = false;
                    int size5 = arrayList13.size();
                    while (i14 < size5) {
                        Object obj7 = arrayList13.get(i14);
                        i14++;
                        ((Runnable) obj7).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i40).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i40).putChats(channels_channelparticipants.chats, false);
                    if (m61Var.r) {
                        arrayList14.clear();
                        m61Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                    int size6 = arrayList15.size();
                    int i41 = 0;
                    while (i41 < size6) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i41);
                        i41++;
                        TLObject userOrChat = MessagesController.getInstance(i40).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList14.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        m61Var.h = true;
                    }
                    m61Var.f = false;
                    int size7 = arrayList13.size();
                    while (i14 < size7) {
                        Object obj8 = arrayList13.get(i14);
                        i14++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                q61 q61Var = (q61) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i42 = q61Var.X;
                lh.k6 k6Var = q61Var.V;
                if (k6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.w41.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = k6Var.i;
                    int size8 = arrayList17.size();
                    int i43 = i42;
                    int i44 = 0;
                    while (i44 < size8) {
                        Object obj9 = arrayList17.get(i44);
                        i44++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i45 = aa1.b;
                        org.telegram.ui.Components.w41 J6 = org.telegram.ui.Components.w41.J(aa1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i42;
                        J6.K(q61Var.W.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i43--;
                        if (i43 == 0) {
                            i43 = i42;
                        }
                    }
                    if (k6Var.k() || !k6Var.r) {
                        while (true) {
                            if (i14 < (i43 <= 0 ? i42 : i43)) {
                                i14++;
                                org.telegram.ui.Components.w41 o10 = org.telegram.ui.Components.w41.o(i14, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.w41.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                b81.a0((b81) this.b, (ArrayList) obj);
                break;
            case 27:
                l81 l81Var = (l81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = l81Var.U;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.w41.k(linearLayout));
                }
                LinearLayout linearLayout2 = l81Var.V;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.w41.k(linearLayout2));
                    break;
                }
                break;
            default:
                fd1 fd1Var = (fd1) this.b;
                qg.b bVar4 = fd1Var.A;
                Bitmap bitmap3 = (Bitmap) obj2;
                fd1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                fd1Var.v = paint2;
                Bitmap bitmap4 = fd1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                fd1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                fd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                fd1Var.w = new Matrix();
                bVar4.a(bitmap3);
                rg.c.c(bVar4, fd1Var.b);
                fd1Var.B.d();
                break;
        }
    }
}
