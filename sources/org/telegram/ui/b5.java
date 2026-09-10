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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        ra1 ra1Var;
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
        int i12 = 24;
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
                eh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                fh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                k9 k9Var = (k9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.v51 c10 = org.telegram.ui.Components.v51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.v51 c11 = org.telegram.ui.Components.v51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.v51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = k9Var.K;
                    int size = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj3 = arrayList3.get(i20);
                        i20++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = k9Var.getMessagesController().getChat(l4)) != null) {
                            n8 n8Var = new n8(k9Var, i14);
                            int i21 = i9.a;
                            org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.v51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        g9 g9Var = (g9) obj4;
                        bi.n3 n3Var = new bi.n3(i12, k9Var, g9Var);
                        int i22 = e9.a;
                        org.telegram.ui.Components.v51 J2 = org.telegram.ui.Components.v51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = n3Var;
                        J2.K(k9Var.l0(g9Var.c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.v51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.v51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.v51.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                le leVar = (le) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(leVar.y0).getChat(Long.valueOf(-leVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(leVar.y0).getChatFull(-leVar.z0);
                int i23 = chatFull != null ? chatFull.stats_dc : -1;
                if (leVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.v51.g(leVar.C0));
                    ra1 ra1Var2 = leVar.o1;
                    if (ra1Var2 == null || ra1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.v51.h(5, i23, ra1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.v51.A(-1, null));
                    }
                    ra1 ra1Var3 = leVar.p1;
                    if (ra1Var3 != null && !ra1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.v51.h(2, i23, ra1Var3));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-2, charSequence));
                    }
                }
                if (leVar.g1 && (ra1Var = leVar.q1) != null && !ra1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.v51.h(2, i23, ra1Var));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-3, null));
                }
                if (leVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.v51.u(leVar.s1));
                    arrayList4.add(org.telegram.ui.Components.v51.u(leVar.t1));
                    arrayList4.add(org.telegram.ui.Components.v51.u(leVar.u1));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-4, leVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (leVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.v51.k(leVar.G0));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-5, leVar.D0));
                        int i24 = MessagesController.getInstance(leVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i25 = leVar.B0 < i24 ? i24 : 0;
                        if (i25 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(0, new jp0(i25, context, null, false));
                            uqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.v51 i26 = org.telegram.ui.Components.v51.i(1, string);
                        if (leVar.B0 >= i24 && leVar.m1) {
                            z10 = true;
                        }
                        i26.K(z10);
                        arrayList4.add(i26);
                        arrayList4.add(org.telegram.ui.Components.v51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (leVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.v51.j(3, leVar.M0));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-6, leVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(leVar.y0).getChat(Long.valueOf(-leVar.z0))) && MessagesController.getInstance(leVar.y0).starrefConnectAllowed) {
                    arrayList4.add(di.i.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, leVar.x0), R.drawable.filled_earn_stars, yo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-7, null));
                }
                if (leVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.v51.p(leVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.v51.A(-10, null));
                    break;
                }
                break;
            case 3:
                fe feVar = (fe) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                he heVar = feVar.f;
                int i27 = feVar.d;
                if (i27 == 0) {
                    ArrayList arrayList6 = heVar.n;
                    int size3 = arrayList6.size();
                    while (i18 < size3) {
                        Object obj5 = arrayList6.get(i18);
                        i18++;
                        int i28 = xh.s7.a;
                        org.telegram.ui.Components.v51 J3 = org.telegram.ui.Components.v51.J(xh.s7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(heVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i27 == 1) {
                    ArrayList arrayList7 = heVar.h;
                    int size4 = arrayList7.size();
                    while (i19 < size4) {
                        Object obj6 = arrayList7.get(i19);
                        i19++;
                        int i29 = xh.s7.a;
                        org.telegram.ui.Components.v51 J4 = org.telegram.ui.Components.v51.J(xh.s7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(heVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                yo yoVar = (yo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    yoVar.getClass();
                    org.telegram.ui.Components.wc.a0(yoVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(yoVar.k0);
                AndroidUtilities.removeFromParent(yoVar.h0);
                AndroidUtilities.removeFromParent(yoVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new sq((wr) this.b, i13), 1000L);
                break;
            case 6:
                ((og.u0) this.b).q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                ts tsVar = (ts) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.V));
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.b));
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.c));
                if (TextUtils.isEmpty(tsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (tsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.v51.B(null));
                }
                if (tsVar.I && tsVar.K) {
                    org.telegram.ui.Components.v51 i30 = org.telegram.ui.Components.v51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i30.K(tsVar.X);
                    arrayList8.add(i30);
                    arrayList8.add(org.telegram.ui.Components.v51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (tsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.x));
                    arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.v51.B(null));
                    org.telegram.ui.Components.v51 e = org.telegram.ui.Components.v51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.v51.B(charSequence2));
                if (tsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ks(tsVar, user, i14));
                    tsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ls(tsVar, i14), 200L);
                    break;
                }
                break;
            case 8:
                tt.a((tt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                pt ptVar = (pt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                tt ttVar = ptVar.a;
                rt rtVar = ttVar.l;
                if (rtVar != null) {
                    rtVar.F(charSequence3, TextUtils.join("", ttVar.o), callback != null ? new pf(i12, ptVar, callback) : null);
                    if (callback == null) {
                        ttVar.p();
                        break;
                    }
                }
                break;
            case 10:
                du.R((du) this.b, (ArrayList) obj);
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
                int i31 = R.raw.topics_top;
                org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(2);
                v51Var.l = string2;
                v51Var.k = i31;
                arrayList9.add(v51Var);
                org.telegram.ui.Components.v51 i32 = org.telegram.ui.Components.v51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i32.K(ozVar.c);
                arrayList9.add(i32);
                if (ozVar.c) {
                    arrayList9.add(org.telegram.ui.Components.v51.B(null));
                    arrayList9.add(org.telegram.ui.Components.v51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.kz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    nz nzVar = (nz) view.getParent();
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    nzVar.a(true, true);
                                    bi.k6 k6Var = ozVar2.f;
                                    if (k6Var != null) {
                                        k6Var.run(Boolean.valueOf(ozVar2.c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    break;
                                default:
                                    nz nzVar2 = (nz) view.getParent();
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    nzVar2.a(false, true);
                                    bi.k6 k6Var2 = ozVar3.f;
                                    if (k6Var2 != null) {
                                        k6Var2.run(Boolean.valueOf(ozVar3.c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.kz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    nz nzVar = (nz) view.getParent();
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    nzVar.a(true, true);
                                    bi.k6 k6Var = ozVar2.f;
                                    if (k6Var != null) {
                                        k6Var.run(Boolean.valueOf(ozVar2.c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    break;
                                default:
                                    nz nzVar2 = (nz) view.getParent();
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    nzVar2.a(false, true);
                                    bi.k6 k6Var2 = ozVar3.f;
                                    if (k6Var2 != null) {
                                        k6Var2.run(Boolean.valueOf(ozVar3.c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    break;
                            }
                        }
                    };
                    int i33 = mz.a;
                    org.telegram.ui.Components.v51 J5 = org.telegram.ui.Components.v51.J(mz.class);
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
                fc0 fc0Var = (fc0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                fc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(fc0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.a2.o(R.string.AIEditorStyleNotFound, fc0.b(), R.raw.error, 36);
                        break;
                    } else {
                        fc0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                ow0 ow0Var = (ow0) this.b;
                eh.b bVar2 = ow0Var.F;
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
                fh.d.c(bVar2, ow0Var.c);
                ow0Var.G.d();
                break;
            case 16:
                vw0 vw0Var = (vw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i34 = R.raw.bubble;
                org.telegram.ui.Components.v51 v51Var2 = new org.telegram.ui.Components.v51(2);
                v51Var2.l = string3;
                v51Var2.k = i34;
                arrayList10.add(v51Var2);
                org.telegram.ui.Components.v51 i35 = org.telegram.ui.Components.v51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i35.K(vw0Var.r);
                arrayList10.add(i35);
                arrayList10.add(org.telegram.ui.Components.v51.A(2, null));
                if (vw0Var.r) {
                    com.google.android.gms.internal.vision.e2.m(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.a8.a((int) vw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    js0 js0Var = new js0(1);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.c = a2;
                    z7Var.d = 20;
                    z7Var.e = js0Var;
                    vw0Var.b.d((int) Utilities.clamp(vw0Var.s, 10000L, 0L), z7Var, new u3(vw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.v51.j(3, vw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.v51.A(4, vw0Var.s > 0 ? vw0Var.W() : null));
                    TLRPC.Chat chat3 = vw0Var.getMessagesController().getChat(Long.valueOf(vw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        vw0Var.c.setLink(vw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.m(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.v51.j(5, vw0Var.c));
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
                eh.b bVar3 = profileActivity.p6;
                bVar3.a((Bitmap) obj2);
                fh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                break;
            case 19:
                g41 g41Var = (g41) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.r61 r61Var = g41Var.f;
                h41 h41Var = g41Var.v;
                ArrayList arrayList12 = h41Var.h;
                u5 u5Var = g41Var.h;
                if (u5Var.getMeasuredHeight() <= 0) {
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.v51 C = org.telegram.ui.Components.v51.C(u5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((u5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = g41Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || g41Var.c != null || g41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || g41Var.c != null) {
                        Context context2 = g41Var.getContext();
                        int i36 = org.telegram.ui.ActionBar.j6.L6;
                        f6Var = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i36, 21, 0, 0, false, false, f6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = g41Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = g41Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(h41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                        org.telegram.ui.Components.v51 k10 = org.telegram.ui.Components.v51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (g41Var.b != null) {
                        for (int i37 = 0; i37 < g41Var.b.options.size(); i37++) {
                            org.telegram.ui.Components.v51 v51Var3 = new org.telegram.ui.Components.v51(30);
                            v51Var3.l = g41Var.b.options.get(i37).text;
                            v51Var3.k = R.drawable.msg_arrowright;
                            v51Var3.d = i37;
                            arrayList11.add(v51Var3);
                            measuredHeight += 50;
                        }
                    } else if (g41Var.c != null) {
                        for (int i38 = 0; i38 < g41Var.c.options.size(); i38++) {
                            org.telegram.ui.Components.v51 v51Var4 = new org.telegram.ui.Components.v51(30);
                            v51Var4.l = g41Var.c.options.get(i38).text;
                            v51Var4.k = R.drawable.msg_arrowright;
                            v51Var4.d = i38;
                            arrayList11.add(v51Var4);
                            measuredHeight += 50;
                        }
                    } else if (g41Var.d != null) {
                        if (g41Var.n == null) {
                            Context context3 = g41Var.getContext();
                            f6Var5 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                            f41 f41Var = new f41(g41Var, context3, f6Var5);
                            g41Var.n = f41Var;
                            f41Var.setShowLimitWhenNear(100);
                        }
                        g41Var.n.b.setHint(LocaleController.getString(g41Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.v51 k11 = org.telegram.ui.Components.v51.k(g41Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j3 = h41Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j3)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.h3) h41Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i11, arrayList11);
                        if (g41Var.r == null) {
                            Context context4 = g41Var.getContext();
                            f6Var2 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                            bi.d dVar = new bi.d(context4, f6Var2, true);
                            g41Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(g41Var.getContext());
                            g41Var.r = frameLayout;
                            int i39 = org.telegram.ui.ActionBar.j6.h5;
                            f6Var3 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i39, f6Var3));
                            g41Var.r.addView(g41Var.s, w7.a6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(g41Var.getContext());
                            int i40 = org.telegram.ui.ActionBar.j6.d7;
                            f6Var4 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i40, f6Var4));
                            g41Var.r.addView(view, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        g41Var.s.setEnabled(g41Var.d.optional || !TextUtils.isEmpty(g41Var.n.getText()));
                        g41Var.s.setOnClickListener(new l60(g41Var, 28));
                        org.telegram.ui.Components.v51 k12 = org.telegram.ui.Components.v51.k(g41Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.v51) hc.b.i(1, arrayList11)).j = true;
                    if (h41Var.d && g41Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(g41Var.getContext());
                        Context context5 = g41Var.getContext();
                        int i41 = R.drawable.greydivider;
                        int i42 = org.telegram.ui.ActionBar.j6.b7;
                        f6Var6 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(h41Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.U0(context5, i41, org.telegram.ui.ActionBar.j6.v0(i42, f6Var6)), 0, 0);
                        vqVar.w = true;
                        frameLayout2.setBackground(vqVar);
                        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(g41Var.getContext(), null);
                        m90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        f6Var7 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                        m90Var.setText(AndroidUtilities.replaceLinks(string4, f6Var7));
                        int i43 = org.telegram.ui.ActionBar.j6.A6;
                        f6Var8 = ((org.telegram.ui.ActionBar.h3) h41Var).resourcesProvider;
                        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i43, f6Var8));
                        m90Var.setGravity(17);
                        frameLayout2.addView(m90Var, w7.a6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.v51 k13 = org.telegram.ui.Components.v51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (r61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.h3) h41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        r61Var.X2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        r61Var.X2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.v51.k(((n41) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.v51.k(((x41) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                v71.Q((v71) this.b, (ArrayList) obj);
                break;
            case 24:
                u71 u71Var = (u71) this.b;
                ArrayList arrayList13 = u71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i44 = u71Var.a;
                ArrayList arrayList14 = u71Var.d;
                if (tL_error3 != null) {
                    if (u71Var.r) {
                        arrayList14.clear();
                        u71Var.r = false;
                    }
                    u71Var.h = true;
                    u71Var.f = false;
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
                    if (u71Var.r) {
                        arrayList14.clear();
                        u71Var.r = false;
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
                        u71Var.h = true;
                    }
                    u71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i17 < size7) {
                        Object obj8 = arrayList13.get(i17);
                        i17++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                z71 z71Var = (z71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i46 = z71Var.b0;
                zh.a5 a5Var = z71Var.Z;
                if (a5Var != null) {
                    arrayList16.add(org.telegram.ui.Components.v51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = a5Var.i;
                    int size8 = arrayList17.size();
                    int i47 = i46;
                    int i48 = 0;
                    while (i48 < size8) {
                        Object obj9 = arrayList17.get(i48);
                        i48++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i49 = mb1.b;
                        org.telegram.ui.Components.v51 J6 = org.telegram.ui.Components.v51.J(mb1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i46;
                        J6.K(z71Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i47--;
                        if (i47 == 0) {
                            i47 = i46;
                        }
                    }
                    if (a5Var.k() || !a5Var.r) {
                        while (true) {
                            if (i15 < (i47 <= 0 ? i46 : i47)) {
                                i15++;
                                org.telegram.ui.Components.v51 o9 = org.telegram.ui.Components.v51.o(i15, 34);
                                o9.u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.v51.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                k91.b0((k91) this.b, (ArrayList) obj);
                break;
            case 27:
                x91 x91Var = (x91) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = x91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.v51.k(linearLayout));
                }
                LinearLayout linearLayout2 = x91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.v51.k(linearLayout2));
                    break;
                }
                break;
            default:
                pe1 pe1Var = (pe1) this.b;
                eh.b bVar4 = pe1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                pe1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                pe1Var.v = paint2;
                Bitmap bitmap4 = pe1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                pe1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                pe1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                pe1Var.w = new Matrix();
                bVar4.a(bitmap3);
                fh.d.c(bVar4, pe1Var.b);
                pe1Var.F.d();
                break;
        }
    }
}
