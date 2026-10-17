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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        d91 d91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        org.telegram.ui.ActionBar.d6 d6Var6;
        org.telegram.ui.ActionBar.d6 d6Var7;
        org.telegram.ui.ActionBar.d6 d6Var8;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        int i12 = 7;
        int i13 = 5;
        final int i14 = 1;
        final int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r9 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                h5 h5Var = (h5) this.b;
                h5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                h5Var.w = false;
                gh.b bVar = h5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, h5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                m9 m9Var = (m9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.f61 c10 = org.telegram.ui.Components.f61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.f61 c11 = org.telegram.ui.Components.f61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.f61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = m9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, i15);
                            int i22 = k9.a;
                            org.telegram.ui.Components.f61 J = org.telegram.ui.Components.f61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.f61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(i12, m9Var, i9Var);
                        int i23 = g9.a;
                        org.telegram.ui.Components.f61 J2 = org.telegram.ui.Components.f61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.l0(i9Var.c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.f61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.f61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.f61.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                ke keVar = (ke) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.y0).getChat(Long.valueOf(-keVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.y0).getChatFull(-keVar.z0);
                int i24 = chatFull != null ? chatFull.stats_dc : -1;
                if (keVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.f61.g(keVar.C0));
                    d91 d91Var2 = keVar.o1;
                    if (d91Var2 == null || d91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.f61.h(5, i24, d91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.f61.A(-1, null));
                    }
                    d91 d91Var3 = keVar.p1;
                    if (d91Var3 != null && !d91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.f61.h(2, i24, d91Var3));
                        arrayList4.add(org.telegram.ui.Components.f61.A(-2, charSequence));
                    }
                }
                if (keVar.g1 && (d91Var = keVar.q1) != null && !d91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.f61.h(2, i24, d91Var));
                    arrayList4.add(org.telegram.ui.Components.f61.A(-3, null));
                }
                if (keVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.f61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.f61.u(keVar.s1));
                    arrayList4.add(org.telegram.ui.Components.f61.u(keVar.t1));
                    arrayList4.add(org.telegram.ui.Components.f61.u(keVar.u1));
                    arrayList4.add(org.telegram.ui.Components.f61.A(-4, keVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.f61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.f61.k(keVar.G0));
                        arrayList4.add(org.telegram.ui.Components.f61.A(-5, keVar.D0));
                        int i25 = MessagesController.getInstance(keVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i26 = keVar.B0 < i25 ? i25 : 0;
                        if (i26 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(0, new so0(i26, context, null, false));
                            yqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.f61 i27 = org.telegram.ui.Components.f61.i(1, string);
                        if (keVar.B0 >= i25 && keVar.m1) {
                            z10 = true;
                        }
                        i27.K(z10);
                        arrayList4.add(i27);
                        arrayList4.add(org.telegram.ui.Components.f61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.f61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.f61.j(3, keVar.M0));
                        arrayList4.add(org.telegram.ui.Components.f61.A(-6, keVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.y0).getChat(Long.valueOf(-keVar.z0))) && MessagesController.getInstance(keVar.y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, keVar.x0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.f61.A(-7, null));
                }
                if (keVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.f61.p(keVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.f61.A(-10, null));
                    break;
                }
                break;
            case 3:
                ee eeVar = (ee) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ge geVar = eeVar.f;
                int i28 = eeVar.d;
                if (i28 == 0) {
                    ArrayList arrayList6 = geVar.n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i29 = ai.fd.a;
                        org.telegram.ui.Components.f61 J3 = org.telegram.ui.Components.f61.J(ai.fd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i28 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i30 = ai.fd.a;
                        org.telegram.ui.Components.f61 J4 = org.telegram.ui.Components.f61.J(ai.fd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                ko koVar = (ko) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    koVar.getClass();
                    org.telegram.ui.Components.xc.a0(koVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(koVar.k0);
                AndroidUtilities.removeFromParent(koVar.h0);
                AndroidUtilities.removeFromParent(koVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new eq((jr) this.b, i14), 1000L);
                break;
            case 6:
                ((n4.s) this.b).F(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                hs hsVar = (hs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.V));
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.b));
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.c));
                if (TextUtils.isEmpty(hsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.f61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.f61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.f61.B(null));
                }
                if (hsVar.I && hsVar.K) {
                    org.telegram.ui.Components.f61 i31 = org.telegram.ui.Components.f61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i31.K(hsVar.X);
                    arrayList8.add(i31);
                    arrayList8.add(org.telegram.ui.Components.f61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.d));
                i0.a.A(R.string.AddNotesInfo, arrayList8);
                if (hsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.x));
                    arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.f61.B(null));
                    org.telegram.ui.Components.f61 e = org.telegram.ui.Components.f61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.f61.B(charSequence2));
                if (hsVar.Y) {
                    AndroidUtilities.runOnUIThread(new yr(hsVar, user, i15));
                    hsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new zr(hsVar, i15), 200L);
                    break;
                }
                break;
            case 8:
                gt.a((gt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                ct ctVar = (ct) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                gt gtVar = ctVar.a;
                et etVar = gtVar.l;
                if (etVar != null) {
                    etVar.t(charSequence3, TextUtils.join("", gtVar.o), callback != null ? new org.telegram.ui.Components.qy(i12, ctVar, callback) : null);
                    if (callback == null) {
                        gtVar.p();
                        break;
                    }
                }
                break;
            case 10:
                st.S((st) this.b, (ArrayList) obj);
                break;
            case 11:
                ey eyVar = (ey) this.b;
                eyVar.P1 = (Long) obj;
                eyVar.S4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final wy wyVar = (wy) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i32 = R.raw.topics_top;
                org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(2);
                f61Var.l = string2;
                f61Var.k = i32;
                arrayList9.add(f61Var);
                org.telegram.ui.Components.f61 i33 = org.telegram.ui.Components.f61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i33.K(wyVar.c);
                arrayList9.add(i33);
                if (wyVar.c) {
                    arrayList9.add(org.telegram.ui.Components.f61.B(null));
                    arrayList9.add(org.telegram.ui.Components.f61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.sy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    vy vyVar = (vy) view.getParent();
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    vyVar.a(true, true);
                                    ai.q5 q5Var = wyVar2.f;
                                    if (q5Var != null) {
                                        q5Var.run(Boolean.valueOf(wyVar2.c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    break;
                                default:
                                    vy vyVar2 = (vy) view.getParent();
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    vyVar2.a(false, true);
                                    ai.q5 q5Var2 = wyVar3.f;
                                    if (q5Var2 != null) {
                                        q5Var2.run(Boolean.valueOf(wyVar3.c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.sy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    vy vyVar = (vy) view.getParent();
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    vyVar.a(true, true);
                                    ai.q5 q5Var = wyVar2.f;
                                    if (q5Var != null) {
                                        q5Var.run(Boolean.valueOf(wyVar2.c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    break;
                                default:
                                    vy vyVar2 = (vy) view.getParent();
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    vyVar2.a(false, true);
                                    ai.q5 q5Var2 = wyVar3.f;
                                    if (q5Var2 != null) {
                                        q5Var2.run(Boolean.valueOf(wyVar3.c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    break;
                            }
                        }
                    };
                    int i34 = uy.a;
                    org.telegram.ui.Components.f61 J5 = org.telegram.ui.Components.f61.J(uy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(wyVar.d);
                    arrayList9.add(J5);
                    i0.a.A(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                kb0 kb0Var = (kb0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                kb0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(kb0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.q.q(R.string.AIEditorStyleNotFound, kb0.d(), R.raw.error, 36);
                        break;
                    } else {
                        kb0.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                sv0 sv0Var = (sv0) this.b;
                gh.b bVar2 = sv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                sv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                sv0Var.w = paint;
                Bitmap bitmap2 = sv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                sv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                sv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                sv0Var.x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, sv0Var.c);
                sv0Var.G.d();
                break;
            case 16:
                zv0 zv0Var = (zv0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i35 = R.raw.bubble;
                org.telegram.ui.Components.f61 f61Var2 = new org.telegram.ui.Components.f61(2);
                f61Var2.l = string3;
                f61Var2.k = i35;
                arrayList10.add(f61Var2);
                org.telegram.ui.Components.f61 i36 = org.telegram.ui.Components.f61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i36.K(zv0Var.r);
                arrayList10.add(i36);
                arrayList10.add(org.telegram.ui.Components.f61.A(2, null));
                if (zv0Var.r) {
                    i0.a.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) zv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    hk0 hk0Var = new hk0(i13);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.c = a2;
                    x7Var.d = 20;
                    x7Var.e = hk0Var;
                    zv0Var.b.d((int) Utilities.clamp(zv0Var.s, 10000L, 0L), x7Var, new v3(zv0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.f61.j(3, zv0Var.b));
                    arrayList10.add(org.telegram.ui.Components.f61.A(4, zv0Var.s > 0 ? zv0Var.W() : null));
                    TLRPC.Chat chat3 = zv0Var.getMessagesController().getChat(Long.valueOf(zv0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        zv0Var.c.setLink(zv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i0.a.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.f61.j(5, zv0Var.c));
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
                gh.b bVar3 = profileActivity.r6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.s6.d();
                break;
            case 19:
                p21 p21Var = (p21) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var = p21Var.f;
                q21 q21Var = p21Var.v;
                ArrayList arrayList12 = q21Var.h;
                ai.n5 n5Var = p21Var.h;
                if (n5Var.getMeasuredHeight() <= 0) {
                    n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.f61 C = org.telegram.ui.Components.f61.C(n5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((n5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || p21Var.c != null || p21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || p21Var.c != null) {
                        Context context2 = p21Var.getContext();
                        int i37 = org.telegram.ui.ActionBar.h6.L6;
                        d6Var = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2, i37, 21, 0, 0, false, false, d6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = p21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(q21Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5));
                        org.telegram.ui.Components.f61 k10 = org.telegram.ui.Components.f61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (p21Var.b != null) {
                        for (int i38 = 0; i38 < p21Var.b.options.size(); i38++) {
                            org.telegram.ui.Components.f61 f61Var3 = new org.telegram.ui.Components.f61(30);
                            f61Var3.l = p21Var.b.options.get(i38).text;
                            f61Var3.k = R.drawable.msg_arrowright;
                            f61Var3.d = i38;
                            arrayList11.add(f61Var3);
                            measuredHeight += 50;
                        }
                    } else if (p21Var.c != null) {
                        for (int i39 = 0; i39 < p21Var.c.options.size(); i39++) {
                            org.telegram.ui.Components.f61 f61Var4 = new org.telegram.ui.Components.f61(30);
                            f61Var4.l = p21Var.c.options.get(i39).text;
                            f61Var4.k = R.drawable.msg_arrowright;
                            f61Var4.d = i39;
                            arrayList11.add(f61Var4);
                            measuredHeight += 50;
                        }
                    } else if (p21Var.d != null) {
                        if (p21Var.n == null) {
                            Context context3 = p21Var.getContext();
                            d6Var5 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                            o21 o21Var = new o21(p21Var, context3, d6Var5);
                            p21Var.n = o21Var;
                            o21Var.setShowLimitWhenNear(100);
                        }
                        p21Var.n.b.setHint(LocaleController.getString(p21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.f61 k11 = org.telegram.ui.Components.f61.k(p21Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = q21Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.f3) q21Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        i0.a.A(i11, arrayList11);
                        if (p21Var.r == null) {
                            Context context4 = p21Var.getContext();
                            d6Var2 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                            ei.d dVar = new ei.d(context4, d6Var2, true);
                            p21Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(p21Var.getContext());
                            p21Var.r = frameLayout;
                            int i40 = org.telegram.ui.ActionBar.h6.h5;
                            d6Var3 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i40, d6Var3));
                            p21Var.r.addView(p21Var.s, w7.z5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(p21Var.getContext());
                            int i41 = org.telegram.ui.ActionBar.h6.d7;
                            d6Var4 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i41, d6Var4));
                            p21Var.r.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        p21Var.s.setEnabled(p21Var.d.optional || !TextUtils.isEmpty(p21Var.n.getText()));
                        p21Var.s.setOnClickListener(new y50(p21Var, 26));
                        org.telegram.ui.Components.f61 k12 = org.telegram.ui.Components.f61.k(p21Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.f61) i0.a.h(1, arrayList11)).j = true;
                    if (q21Var.d && p21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(p21Var.getContext());
                        Context context5 = p21Var.getContext();
                        int i42 = R.drawable.greydivider;
                        int i43 = org.telegram.ui.ActionBar.h6.b7;
                        d6Var6 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(q21Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7)), org.telegram.ui.ActionBar.h6.V0(context5, i42, org.telegram.ui.ActionBar.h6.w0(i43, d6Var6)), 0, 0);
                        zqVar.w = true;
                        frameLayout2.setBackground(zqVar);
                        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(p21Var.getContext(), null);
                        x90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        d6Var7 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                        x90Var.setText(AndroidUtilities.replaceLinks(string4, d6Var7));
                        int i44 = org.telegram.ui.ActionBar.h6.A6;
                        d6Var8 = ((org.telegram.ui.ActionBar.f3) q21Var).resourcesProvider;
                        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i44, d6Var8));
                        x90Var.setGravity(17);
                        frameLayout2.addView(x90Var, w7.z5.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.f61 k13 = org.telegram.ui.Components.f61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (a71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) q21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        a71Var.V2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        a71Var.V2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.f61.k(((v21) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.f61.k(((j31) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                j61.R((j61) this.b, (ArrayList) obj);
                break;
            case 24:
                i61 i61Var = (i61) this.b;
                ArrayList arrayList13 = i61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i45 = i61Var.a;
                ArrayList arrayList14 = i61Var.d;
                if (tL_error3 != null) {
                    if (i61Var.r) {
                        arrayList14.clear();
                        i61Var.r = false;
                    }
                    i61Var.h = true;
                    i61Var.f = false;
                    int size5 = arrayList13.size();
                    while (i17 < size5) {
                        Object obj7 = arrayList13.get(i17);
                        i17++;
                        ((Runnable) obj7).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i45).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i45).putChats(channels_channelparticipants.chats, false);
                    if (i61Var.r) {
                        arrayList14.clear();
                        i61Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                    int size6 = arrayList15.size();
                    int i46 = 0;
                    while (i46 < size6) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i46);
                        i46++;
                        TLObject userOrChat = MessagesController.getInstance(i45).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList14.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        i61Var.h = true;
                    }
                    i61Var.f = false;
                    int size7 = arrayList13.size();
                    while (i18 < size7) {
                        Object obj8 = arrayList13.get(i18);
                        i18++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                m61 m61Var = (m61) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i47 = m61Var.b0;
                ci.a7 a7Var = m61Var.Z;
                if (a7Var != null) {
                    arrayList16.add(org.telegram.ui.Components.f61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = a7Var.i;
                    int size8 = arrayList17.size();
                    int i48 = i47;
                    int i49 = 0;
                    while (i49 < size8) {
                        Object obj9 = arrayList17.get(i49);
                        i49++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i50 = y91.b;
                        org.telegram.ui.Components.f61 J6 = org.telegram.ui.Components.f61.J(y91.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i47;
                        J6.K(m61Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i48--;
                        if (i48 == 0) {
                            i48 = i47;
                        }
                    }
                    if (a7Var.k() || !a7Var.r) {
                        while (true) {
                            if (i16 < (i48 <= 0 ? i47 : i48)) {
                                i16++;
                                org.telegram.ui.Components.f61 o10 = org.telegram.ui.Components.f61.o(i16, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.f61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                z71.b0((z71) this.b, (ArrayList) obj);
                break;
            case 27:
                j81 j81Var = (j81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = j81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.f61.k(linearLayout));
                }
                LinearLayout linearLayout2 = j81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.f61.k(linearLayout2));
                    break;
                }
                break;
            default:
                ad1 ad1Var = (ad1) this.b;
                gh.b bVar4 = ad1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                ad1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ad1Var.v = paint2;
                Bitmap bitmap4 = ad1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                ad1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                ad1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ad1Var.w = new Matrix();
                bVar4.a(bitmap3);
                hh.d.c(bVar4, ad1Var.b);
                ad1Var.F.d();
                break;
        }
    }
}
