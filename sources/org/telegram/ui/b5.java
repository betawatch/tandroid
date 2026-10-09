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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        na1 na1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.ActionBar.e6 e6Var5;
        org.telegram.ui.ActionBar.e6 e6Var6;
        org.telegram.ui.ActionBar.e6 e6Var7;
        org.telegram.ui.ActionBar.e6 e6Var8;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        final int i12 = 1;
        final int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        r11 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                c5 c5Var = (c5) this.b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.w = false;
                fh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                j9 j9Var = (j9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = j9Var.K.isEmpty();
                ArrayList arrayList2 = j9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.p61 c10 = org.telegram.ui.Components.p61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!j9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.p61 c11 = org.telegram.ui.Components.p61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.p61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = j9Var.K;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = j9Var.getMessagesController().getChat(l4)) != null) {
                            m8 m8Var = new m8(j9Var, i13);
                            int i20 = h9.a;
                            org.telegram.ui.Components.p61 J = org.telegram.ui.Components.p61.J(h9.class);
                            J.G = chat;
                            J.D = m8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.p61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        f9 f9Var = (f9) obj4;
                        ai.f2 f2Var = new ai.f2(27, j9Var, f9Var);
                        int i21 = d9.a;
                        org.telegram.ui.Components.p61 J2 = org.telegram.ui.Components.p61.J(d9.class);
                        J2.G = f9Var;
                        J2.D = f2Var;
                        J2.K(j9Var.l0(f9Var.c));
                        arrayList.add(J2);
                    }
                    if (!j9Var.J) {
                        arrayList.add(org.telegram.ui.Components.p61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.p61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.p61.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                ke keVar = (ke) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.y0).getChat(Long.valueOf(-keVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.y0).getChatFull(-keVar.z0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (keVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.p61.g(keVar.C0));
                    na1 na1Var2 = keVar.o1;
                    if (na1Var2 == null || na1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.p61.h(5, i22, na1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.p61.A(-1, null));
                    }
                    na1 na1Var3 = keVar.p1;
                    if (na1Var3 != null && !na1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.p61.h(2, i22, na1Var3));
                        arrayList4.add(org.telegram.ui.Components.p61.A(-2, charSequence));
                    }
                }
                if (keVar.g1 && (na1Var = keVar.q1) != null && !na1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.p61.h(2, i22, na1Var));
                    arrayList4.add(org.telegram.ui.Components.p61.A(-3, null));
                }
                if (keVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.p61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.p61.u(keVar.s1));
                    arrayList4.add(org.telegram.ui.Components.p61.u(keVar.t1));
                    arrayList4.add(org.telegram.ui.Components.p61.u(keVar.u1));
                    arrayList4.add(org.telegram.ui.Components.p61.A(-4, keVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.p61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.p61.k(keVar.G0));
                        arrayList4.add(org.telegram.ui.Components.p61.A(-5, keVar.D0));
                        int i23 = MessagesController.getInstance(keVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = keVar.B0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(0, new jp0(i24, context, null, false));
                            erVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.p61 i25 = org.telegram.ui.Components.p61.i(1, string);
                        if (keVar.B0 >= i23 && keVar.m1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.p61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.p61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.p61.j(3, keVar.M0));
                        arrayList4.add(org.telegram.ui.Components.p61.A(-6, keVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.y0).getChat(Long.valueOf(-keVar.z0))) && MessagesController.getInstance(keVar.y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, keVar.x0), R.drawable.filled_earn_stars, uo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.p61.A(-7, null));
                }
                if (keVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.p61.p(keVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.p61.A(-10, null));
                    break;
                }
                break;
            case 3:
                ee eeVar = (ee) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ge geVar = eeVar.f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i27 = yh.i7.a;
                        org.telegram.ui.Components.p61 J3 = org.telegram.ui.Components.p61.J(yh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i28 = yh.i7.a;
                        org.telegram.ui.Components.p61 J4 = org.telegram.ui.Components.p61.J(yh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                uo uoVar = (uo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    uoVar.getClass();
                    org.telegram.ui.Components.ad.a0(uoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(uoVar.k0);
                AndroidUtilities.removeFromParent(uoVar.h0);
                AndroidUtilities.removeFromParent(uoVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new oq((tr) this.b, i12), 1000L);
                break;
            case 6:
                ((pf.b) this.b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                qs qsVar = (qs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.V));
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.b));
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.c));
                if (TextUtils.isEmpty(qsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.p61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (qsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.p61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.p61.B(null));
                }
                if (qsVar.I && qsVar.K) {
                    org.telegram.ui.Components.p61 i29 = org.telegram.ui.Components.p61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(qsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.p61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.d));
                hg.c.n(R.string.AddNotesInfo, arrayList8);
                if (qsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.x));
                    arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.p61.B(null));
                    org.telegram.ui.Components.p61 e7 = org.telegram.ui.Components.p61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.r = true;
                    arrayList8.add(e7);
                }
                arrayList8.add(org.telegram.ui.Components.p61.B(charSequence2));
                if (qsVar.Y) {
                    AndroidUtilities.runOnUIThread(new hs(qsVar, user, i13));
                    qsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new is(qsVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                rt.a((rt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                nt ntVar = (nt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                rt rtVar = ntVar.a;
                pt ptVar = rtVar.l;
                if (ptVar != null) {
                    ptVar.f(charSequence3, TextUtils.join("", rtVar.o), callback != null ? new ft(i12, ntVar, callback) : null);
                    if (callback == null) {
                        rtVar.p();
                        break;
                    }
                }
                break;
            case 10:
                bu.S((bu) this.b, (ArrayList) obj);
                break;
            case 11:
                ty tyVar = (ty) this.b;
                tyVar.P1 = (Long) obj;
                tyVar.R4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final lz lzVar = (lz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.p61 p61Var = new org.telegram.ui.Components.p61(2);
                p61Var.l = string2;
                p61Var.k = i30;
                arrayList9.add(p61Var);
                org.telegram.ui.Components.p61 i31 = org.telegram.ui.Components.p61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(lzVar.c);
                arrayList9.add(i31);
                if (lzVar.c) {
                    arrayList9.add(org.telegram.ui.Components.p61.B(null));
                    arrayList9.add(org.telegram.ui.Components.p61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.hz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    kz kzVar = (kz) view.getParent();
                                    lz lzVar2 = lzVar;
                                    lzVar2.d = true;
                                    kzVar.a(true, true);
                                    ai.m0 m0Var = lzVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(lzVar2.c), Boolean.valueOf(lzVar2.d));
                                    }
                                    lzVar2.U();
                                    break;
                                default:
                                    kz kzVar2 = (kz) view.getParent();
                                    lz lzVar3 = lzVar;
                                    lzVar3.d = false;
                                    kzVar2.a(false, true);
                                    ai.m0 m0Var2 = lzVar3.f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(lzVar3.c), Boolean.valueOf(lzVar3.d));
                                    }
                                    lzVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.hz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    kz kzVar = (kz) view.getParent();
                                    lz lzVar2 = lzVar;
                                    lzVar2.d = true;
                                    kzVar.a(true, true);
                                    ai.m0 m0Var = lzVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(lzVar2.c), Boolean.valueOf(lzVar2.d));
                                    }
                                    lzVar2.U();
                                    break;
                                default:
                                    kz kzVar2 = (kz) view.getParent();
                                    lz lzVar3 = lzVar;
                                    lzVar3.d = false;
                                    kzVar2.a(false, true);
                                    ai.m0 m0Var2 = lzVar3.f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(lzVar3.c), Boolean.valueOf(lzVar3.d));
                                    }
                                    lzVar3.U();
                                    break;
                            }
                        }
                    };
                    int i32 = jz.a;
                    org.telegram.ui.Components.p61 J5 = org.telegram.ui.Components.p61.J(jz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(lzVar.d);
                    arrayList9.add(J5);
                    hg.c.n(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                ec0 ec0Var = (ec0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ec0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ec0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.q.q(R.string.AIEditorStyleNotFound, ec0.d(), R.raw.error, 36);
                        break;
                    } else {
                        ec0.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                mw0 mw0Var = (mw0) this.b;
                fh.b bVar2 = mw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                mw0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                mw0Var.w = paint;
                Bitmap bitmap2 = mw0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                mw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                mw0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                mw0Var.x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, mw0Var.c);
                mw0Var.G.d();
                break;
            case 16:
                tw0 tw0Var = (tw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.p61 p61Var2 = new org.telegram.ui.Components.p61(2);
                p61Var2.l = string3;
                p61Var2.k = i33;
                arrayList10.add(p61Var2);
                org.telegram.ui.Components.p61 i34 = org.telegram.ui.Components.p61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(tw0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.p61.A(2, null));
                if (tw0Var.r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    a80 a80Var = new a80(9);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.c = a2;
                    y7Var.d = 20;
                    y7Var.e = a80Var;
                    tw0Var.b.d((int) Utilities.clamp(tw0Var.s, 10000L, 0L), y7Var, new t3(tw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.p61.j(3, tw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.p61.A(4, tw0Var.s > 0 ? tw0Var.W() : null));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.p61.j(5, tw0Var.c));
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
                fh.b bVar3 = profileActivity.p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                break;
            case 19:
                b41 b41Var = (b41) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.k71 k71Var = b41Var.f;
                c41 c41Var = b41Var.v;
                ArrayList arrayList12 = c41Var.h;
                t5 t5Var = b41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.p61 C = org.telegram.ui.Components.p61.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || b41Var.c != null || b41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || b41Var.c != null) {
                        Context context2 = b41Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.i6.L6;
                        e6Var = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i35, 21, 0, 0, false, false, e6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = b41Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
                        org.telegram.ui.Components.p61 k10 = org.telegram.ui.Components.p61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (b41Var.b != null) {
                        for (int i36 = 0; i36 < b41Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.p61 p61Var3 = new org.telegram.ui.Components.p61(30);
                            p61Var3.l = b41Var.b.options.get(i36).text;
                            p61Var3.k = R.drawable.msg_arrowright;
                            p61Var3.d = i36;
                            arrayList11.add(p61Var3);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.c != null) {
                        for (int i37 = 0; i37 < b41Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.p61 p61Var4 = new org.telegram.ui.Components.p61(30);
                            p61Var4.l = b41Var.c.options.get(i37).text;
                            p61Var4.k = R.drawable.msg_arrowright;
                            p61Var4.d = i37;
                            arrayList11.add(p61Var4);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.d != null) {
                        if (b41Var.n == null) {
                            Context context3 = b41Var.getContext();
                            e6Var5 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            a41 a41Var = new a41(b41Var, context3, e6Var5);
                            b41Var.n = a41Var;
                            a41Var.setShowLimitWhenNear(100);
                        }
                        b41Var.n.b.setHint(LocaleController.getString(b41Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.p61 k11 = org.telegram.ui.Components.p61.k(b41Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j3 = c41Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j3)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.f3) c41Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        hg.c.n(i11, arrayList11);
                        if (b41Var.r == null) {
                            Context context4 = b41Var.getContext();
                            e6Var2 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            ci.d dVar = new ci.d(context4, e6Var2, true);
                            b41Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(b41Var.getContext());
                            b41Var.r = frameLayout;
                            int i38 = org.telegram.ui.ActionBar.i6.h5;
                            e6Var3 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i38, e6Var3));
                            b41Var.r.addView(b41Var.s, w7.x5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(b41Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.i6.d7;
                            e6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i39, e6Var4));
                            b41Var.r.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        b41Var.s.setEnabled(b41Var.d.optional || !TextUtils.isEmpty(b41Var.n.getText()));
                        b41Var.s.setOnClickListener(new m60(b41Var, 27));
                        org.telegram.ui.Components.p61 k12 = org.telegram.ui.Components.p61.k(b41Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.p61) hg.c.g(1, arrayList11)).j = true;
                    if (c41Var.d && b41Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(b41Var.getContext());
                        Context context5 = b41Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.i6.b7;
                        e6Var6 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7)), org.telegram.ui.ActionBar.i6.V0(context5, i40, org.telegram.ui.ActionBar.i6.w0(i41, e6Var6)), 0, 0);
                        frVar.w = true;
                        frameLayout2.setBackground(frVar);
                        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(b41Var.getContext(), null);
                        ea0Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        e6Var7 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        ea0Var.setText(AndroidUtilities.replaceLinks(string4, e6Var7));
                        int i42 = org.telegram.ui.ActionBar.i6.A6;
                        e6Var8 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i42, e6Var8));
                        ea0Var.setGravity(17);
                        frameLayout2.addView(ea0Var, w7.x5.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.p61 k13 = org.telegram.ui.Components.p61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (k71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) c41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        k71Var.V2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        k71Var.V2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.p61.k(((h41) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.p61.k(((u41) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                u71.R((u71) this.b, (ArrayList) obj);
                break;
            case 24:
                t71 t71Var = (t71) this.b;
                ArrayList arrayList13 = t71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = t71Var.a;
                ArrayList arrayList14 = t71Var.d;
                if (tL_error3 != null) {
                    if (t71Var.r) {
                        arrayList14.clear();
                        t71Var.r = false;
                    }
                    t71Var.h = true;
                    t71Var.f = false;
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
                    if (t71Var.r) {
                        arrayList14.clear();
                        t71Var.r = false;
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
                        t71Var.h = true;
                    }
                    t71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                x71 x71Var = (x71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = x71Var.b0;
                ai.e9 e9Var = x71Var.Z;
                if (e9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.p61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = e9Var.i;
                    int size8 = arrayList17.size();
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < size8) {
                        Object obj9 = arrayList17.get(i47);
                        i47++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i48 = ib1.b;
                        org.telegram.ui.Components.p61 J6 = org.telegram.ui.Components.p61.J(ib1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(x71Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i46--;
                        if (i46 == 0) {
                            i46 = i45;
                        }
                    }
                    if (e9Var.k() || !e9Var.r) {
                        while (true) {
                            if (i14 < (i46 <= 0 ? i45 : i46)) {
                                i14++;
                                org.telegram.ui.Components.p61 o9 = org.telegram.ui.Components.p61.o(i14, 34);
                                o9.u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.p61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                i91.b0((i91) this.b, (ArrayList) obj);
                break;
            case 27:
                t91 t91Var = (t91) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = t91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.p61.k(linearLayout));
                }
                LinearLayout linearLayout2 = t91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.p61.k(linearLayout2));
                    break;
                }
                break;
            default:
                me1 me1Var = (me1) this.b;
                fh.b bVar4 = me1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                me1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                me1Var.v = paint2;
                Bitmap bitmap4 = me1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                me1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                me1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                me1Var.w = new Matrix();
                bVar4.a(bitmap3);
                gh.d.c(bVar4, me1Var.b);
                me1Var.F.d();
                break;
        }
    }
}
