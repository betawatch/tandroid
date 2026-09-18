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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        ma1 ma1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        org.telegram.ui.ActionBar.f6 f6Var6;
        org.telegram.ui.ActionBar.f6 f6Var7;
        org.telegram.ui.ActionBar.f6 f6Var8;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        final int i12 = 1;
        final int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        r8 = false;
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
                m9 m9Var = (m9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.j51 c10 = org.telegram.ui.Components.j51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.j51 c11 = org.telegram.ui.Components.j51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = m9Var.K;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, i13);
                            int i20 = k9.a;
                            org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        i9 i9Var = (i9) obj4;
                        ai.f2 f2Var = new ai.f2(27, m9Var, i9Var);
                        int i21 = g9.a;
                        org.telegram.ui.Components.j51 J2 = org.telegram.ui.Components.j51.J(g9.class);
                        J2.G = i9Var;
                        J2.D = f2Var;
                        J2.K(m9Var.l0(i9Var.c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.j51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                le leVar = (le) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(leVar.y0).getChat(Long.valueOf(-leVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(leVar.y0).getChatFull(-leVar.z0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (leVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.j51.g(leVar.C0));
                    ma1 ma1Var2 = leVar.o1;
                    if (ma1Var2 == null || ma1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.j51.h(5, i22, ma1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.j51.A(-1, null));
                    }
                    ma1 ma1Var3 = leVar.p1;
                    if (ma1Var3 != null && !ma1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.j51.h(2, i22, ma1Var3));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-2, charSequence));
                    }
                }
                if (leVar.g1 && (ma1Var = leVar.q1) != null && !ma1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.j51.h(2, i22, ma1Var));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-3, null));
                }
                if (leVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.j51.u(leVar.s1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(leVar.t1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(leVar.u1));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-4, leVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (leVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.k(leVar.G0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-5, leVar.D0));
                        int i23 = MessagesController.getInstance(leVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = leVar.B0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new lp0(i24, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.j51 i25 = org.telegram.ui.Components.j51.i(1, string);
                        if (leVar.B0 >= i23 && leVar.m1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.j51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (leVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.j(3, leVar.M0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-6, leVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(leVar.y0).getChat(Long.valueOf(-leVar.z0))) && MessagesController.getInstance(leVar.y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, leVar.x0), R.drawable.filled_earn_stars, wo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-7, null));
                }
                if (leVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.j51.p(leVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.j51.A(-10, null));
                    break;
                }
                break;
            case 3:
                fe feVar = (fe) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                he heVar = feVar.f;
                int i26 = feVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = heVar.n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i27 = yh.r7.a;
                        org.telegram.ui.Components.j51 J3 = org.telegram.ui.Components.j51.J(yh.r7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(heVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = heVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i28 = yh.r7.a;
                        org.telegram.ui.Components.j51 J4 = org.telegram.ui.Components.j51.J(yh.r7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(heVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                wo woVar = (wo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    woVar.getClass();
                    org.telegram.ui.Components.vc.a0(woVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(woVar.k0);
                AndroidUtilities.removeFromParent(woVar.h0);
                AndroidUtilities.removeFromParent(woVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new qq((ur) this.b, i12), 1000L);
                break;
            case 6:
                ((of.b) this.b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                us usVar = (us) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = usVar.getMessagesController().getUser(Long.valueOf(usVar.H));
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.V));
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.b));
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.c));
                if (TextUtils.isEmpty(usVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (usVar.K) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                }
                if (usVar.I && usVar.K) {
                    org.telegram.ui.Components.j51 i29 = org.telegram.ui.Components.j51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(usVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.j51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (usVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = usVar.getMessagesController().getUserFull(usVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(usVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.j51.k(usVar.x));
                    arrayList8.add(org.telegram.ui.Components.j51.k(usVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(usVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                    org.telegram.ui.Components.j51 e = org.telegram.ui.Components.j51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.j51.B(charSequence2));
                if (usVar.Y) {
                    AndroidUtilities.runOnUIThread(new ls(usVar, user, i13));
                    usVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ms(usVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                ut.a((ut) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                qt qtVar = (qt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ut utVar = qtVar.a;
                st stVar = utVar.l;
                if (stVar != null) {
                    stVar.G(charSequence3, TextUtils.join("", utVar.o), callback != null ? new pf(24, qtVar, callback) : null);
                    if (callback == null) {
                        utVar.p();
                        break;
                    }
                }
                break;
            case 10:
                eu.R((eu) this.b, (ArrayList) obj);
                break;
            case 11:
                wy wyVar = (wy) this.b;
                wyVar.P1 = (Long) obj;
                wyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final oz ozVar = (oz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(2);
                j51Var.l = string2;
                j51Var.k = i30;
                arrayList9.add(j51Var);
                org.telegram.ui.Components.j51 i31 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(ozVar.c);
                arrayList9.add(i31);
                if (ozVar.c) {
                    arrayList9.add(org.telegram.ui.Components.j51.B(null));
                    arrayList9.add(org.telegram.ui.Components.j51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.kz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    nz nzVar = (nz) view.getParent();
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    nzVar.a(true, true);
                                    ai.m0 m0Var = ozVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(ozVar2.c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    break;
                                default:
                                    nz nzVar2 = (nz) view.getParent();
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    nzVar2.a(false, true);
                                    ai.m0 m0Var2 = ozVar3.f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(ozVar3.c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.kz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    nz nzVar = (nz) view.getParent();
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    nzVar.a(true, true);
                                    ai.m0 m0Var = ozVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(ozVar2.c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    break;
                                default:
                                    nz nzVar2 = (nz) view.getParent();
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    nzVar2.a(false, true);
                                    ai.m0 m0Var2 = ozVar3.f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(ozVar3.c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    break;
                            }
                        }
                    };
                    int i32 = mz.a;
                    org.telegram.ui.Components.j51 J5 = org.telegram.ui.Components.j51.J(mz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(ozVar.d);
                    arrayList9.add(J5);
                    com.google.android.gms.internal.vision.e2.w(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                hc0 hc0Var = (hc0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                hc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(hc0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.w1.o(R.string.AIEditorStyleNotFound, hc0.b(), R.raw.error, 36);
                        break;
                    } else {
                        hc0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                ow0 ow0Var = (ow0) this.b;
                fh.b bVar2 = ow0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                ow0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                ow0Var.w = paint;
                Bitmap bitmap2 = ow0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ow0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                ow0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ow0Var.x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, ow0Var.c);
                ow0Var.G.d();
                break;
            case 16:
                vw0 vw0Var = (vw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.j51 j51Var2 = new org.telegram.ui.Components.j51(2);
                j51Var2.l = string3;
                j51Var2.k = i33;
                arrayList10.add(j51Var2);
                org.telegram.ui.Components.j51 i34 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(vw0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.j51.A(2, null));
                if (vw0Var.r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) vw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    bs0 bs0Var = new bs0(3);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.c = a2;
                    y7Var.d = 20;
                    y7Var.e = bs0Var;
                    vw0Var.b.d((int) Utilities.clamp(vw0Var.s, 10000L, 0L), y7Var, new s3(vw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.j51.j(3, vw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.j51.A(4, vw0Var.s > 0 ? vw0Var.W() : null));
                    TLRPC.Chat chat3 = vw0Var.getMessagesController().getChat(Long.valueOf(vw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        vw0Var.c.setLink(vw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.j51.j(5, vw0Var.c));
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
                c41 c41Var = (c41) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.f61 f61Var = c41Var.f;
                d41 d41Var = c41Var.v;
                ArrayList arrayList12 = d41Var.h;
                t5 t5Var = c41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.j51 C = org.telegram.ui.Components.j51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = c41Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || c41Var.c != null || c41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || c41Var.c != null) {
                        Context context2 = c41Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.j6.L6;
                        f6Var = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2, i35, 21, 0, 0, false, false, f6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = c41Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = c41Var.c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(d41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                        org.telegram.ui.Components.j51 k10 = org.telegram.ui.Components.j51.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (c41Var.b != null) {
                        for (int i36 = 0; i36 < c41Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.j51 j51Var3 = new org.telegram.ui.Components.j51(30);
                            j51Var3.l = c41Var.b.options.get(i36).text;
                            j51Var3.k = R.drawable.msg_arrowright;
                            j51Var3.d = i36;
                            arrayList11.add(j51Var3);
                            measuredHeight += 50;
                        }
                    } else if (c41Var.c != null) {
                        for (int i37 = 0; i37 < c41Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.j51 j51Var4 = new org.telegram.ui.Components.j51(30);
                            j51Var4.l = c41Var.c.options.get(i37).text;
                            j51Var4.k = R.drawable.msg_arrowright;
                            j51Var4.d = i37;
                            arrayList11.add(j51Var4);
                            measuredHeight += 50;
                        }
                    } else if (c41Var.d != null) {
                        if (c41Var.n == null) {
                            Context context3 = c41Var.getContext();
                            f6Var5 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                            b41 b41Var = new b41(c41Var, context3, f6Var5);
                            c41Var.n = b41Var;
                            b41Var.setShowLimitWhenNear(100);
                        }
                        c41Var.n.b.setHint(LocaleController.getString(c41Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.j51 k11 = org.telegram.ui.Components.j51.k(c41Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j3 = d41Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j3)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.g3) d41Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i11, arrayList11);
                        if (c41Var.r == null) {
                            Context context4 = c41Var.getContext();
                            f6Var2 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                            ci.d dVar = new ci.d(context4, f6Var2, true);
                            c41Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(c41Var.getContext());
                            c41Var.r = frameLayout;
                            int i38 = org.telegram.ui.ActionBar.j6.h5;
                            f6Var3 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i38, f6Var3));
                            c41Var.r.addView(c41Var.s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(c41Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.j6.d7;
                            f6Var4 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i39, f6Var4));
                            c41Var.r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        c41Var.s.setEnabled(c41Var.d.optional || !TextUtils.isEmpty(c41Var.n.getText()));
                        c41Var.s.setOnClickListener(new m60(c41Var, 28));
                        org.telegram.ui.Components.j51 k12 = org.telegram.ui.Components.j51.k(c41Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.j51) hg.k0.h(1, arrayList11)).j = true;
                    if (d41Var.d && c41Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(c41Var.getContext());
                        Context context5 = c41Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.j6.b7;
                        f6Var6 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(d41Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.U0(context5, i40, org.telegram.ui.ActionBar.j6.v0(i41, f6Var6)), 0, 0);
                        pqVar.w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(c41Var.getContext(), null);
                        c90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        f6Var7 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                        c90Var.setText(AndroidUtilities.replaceLinks(string4, f6Var7));
                        int i42 = org.telegram.ui.ActionBar.j6.A6;
                        f6Var8 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
                        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i42, f6Var8));
                        c90Var.setGravity(17);
                        frameLayout2.addView(c90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.j51 k13 = org.telegram.ui.Components.j51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (f61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.g3) d41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        f61Var.X2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        f61Var.X2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((j41) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((u41) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                s71.Q((s71) this.b, (ArrayList) obj);
                break;
            case 24:
                r71 r71Var = (r71) this.b;
                ArrayList arrayList13 = r71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = r71Var.a;
                ArrayList arrayList14 = r71Var.d;
                if (tL_error3 != null) {
                    if (r71Var.r) {
                        arrayList14.clear();
                        r71Var.r = false;
                    }
                    r71Var.h = true;
                    r71Var.f = false;
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
                    if (r71Var.r) {
                        arrayList14.clear();
                        r71Var.r = false;
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
                        r71Var.h = true;
                    }
                    r71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                v71 v71Var = (v71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = v71Var.b0;
                ai.d9 d9Var = v71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.i;
                    int size8 = arrayList17.size();
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < size8) {
                        Object obj9 = arrayList17.get(i47);
                        i47++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i48 = hb1.b;
                        org.telegram.ui.Components.j51 J6 = org.telegram.ui.Components.j51.J(hb1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(v71Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i46--;
                        if (i46 == 0) {
                            i46 = i45;
                        }
                    }
                    if (d9Var.k() || !d9Var.r) {
                        while (true) {
                            if (i14 < (i46 <= 0 ? i45 : i46)) {
                                i14++;
                                org.telegram.ui.Components.j51 o9 = org.telegram.ui.Components.j51.o(i14, 34);
                                o9.u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                g91.b0((g91) this.b, (ArrayList) obj);
                break;
            case 27:
                s91 s91Var = (s91) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = s91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout));
                }
                LinearLayout linearLayout2 = s91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout2));
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                me1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                me1Var.w = new Matrix();
                bVar4.a(bitmap3);
                gh.d.c(bVar4, me1Var.b);
                me1Var.F.d();
                break;
        }
    }
}
