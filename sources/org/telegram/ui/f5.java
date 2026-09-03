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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        aa1 aa1Var;
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
        boolean z4 = false;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.w = false;
                sg.b bVar = g5Var.h;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, g5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                n9 n9Var = (n9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = n9Var.H.isEmpty();
                ArrayList arrayList2 = n9Var.D;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.i51 c3 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.q = true;
                    arrayList.add(c3);
                    if (!n9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = n9Var.H;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = n9Var.getMessagesController().getChat(l10)) != null) {
                            r8 r8Var = new r8(n9Var, i13);
                            int i20 = l9.a;
                            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(l9.class);
                            J.G = chat;
                            J.D = r8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        j9 j9Var = (j9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, n9Var, j9Var);
                        int i21 = h9.a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(h9.class);
                        J2.G = j9Var;
                        J2.D = gVar;
                        J2.K(n9Var.l0(j9Var.c));
                        arrayList.add(J2);
                    }
                    if (!n9Var.G) {
                        arrayList.add(org.telegram.ui.Components.i51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                me meVar = (me) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(meVar.v0).getChat(Long.valueOf(-meVar.w0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(meVar.v0).getChatFull(-meVar.w0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (meVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.i51.g(meVar.z0));
                    aa1 aa1Var2 = meVar.l1;
                    if (aa1Var2 == null || aa1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i22, aa1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    }
                    aa1 aa1Var3 = meVar.m1;
                    if (aa1Var3 != null && !aa1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i22, aa1Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (meVar.d1 && (aa1Var = meVar.n1) != null && !aa1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i22, aa1Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (meVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(meVar.p1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(meVar.q1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(meVar.r1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, meVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (meVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(meVar.D0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, meVar.A0));
                        int i23 = MessagesController.getInstance(meVar.v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = meVar.y0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(0, new wo0(i24, context, null, false));
                            lqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.i51 i25 = org.telegram.ui.Components.i51.i(1, string);
                        if (meVar.y0 >= i23 && meVar.j1) {
                            z4 = true;
                        }
                        i25.K(z4);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (meVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, meVar.J0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, meVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(meVar.v0).getChat(Long.valueOf(-meVar.w0))) && MessagesController.getInstance(meVar.v0).starrefConnectAllowed) {
                    arrayList4.add(rh.f.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, meVar.u0), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (meVar.b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(meVar.b1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
                    break;
                }
                break;
            case 3:
                ge geVar = (ge) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ie ieVar = geVar.f;
                int i26 = geVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = ieVar.n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i27 = lh.da.a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(ieVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = ieVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i28 = lh.da.a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(ieVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                ro roVar = (ro) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    roVar.getClass();
                    org.telegram.ui.Components.qc.a0(roVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(roVar.h0);
                AndroidUtilities.removeFromParent(roVar.e0);
                AndroidUtilities.removeFromParent(roVar.g0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new mq((rr) this.b, i12), 1000L);
                break;
            case 6:
                ((n7.qa) this.b).q0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                ps psVar = (ps) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.S));
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.b));
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.c));
                if (TextUtils.isEmpty(psVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (psVar.H) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (psVar.F && psVar.H) {
                    org.telegram.ui.Components.i51 i29 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(psVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.d));
                ai.A(R.string.AddNotesInfo, arrayList8);
                if (psVar.F) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(psVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(psVar.x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(psVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(psVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.i51.B(charSequence2));
                if (psVar.V) {
                    AndroidUtilities.runOnUIThread(new gs(psVar, user, i13));
                    psVar.V = false;
                    AndroidUtilities.runOnUIThread(new hs(psVar, i13), 200L);
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
                    ptVar.A(charSequence3, TextUtils.join("", rtVar.o), callback != null ? new org.telegram.ui.Components.vk(11, ntVar, callback) : null);
                    if (callback == null) {
                        rtVar.p();
                        break;
                    }
                }
                break;
            case 10:
                cu.R((cu) this.b, (ArrayList) obj);
                break;
            case 11:
                qy qyVar = (qy) this.b;
                qyVar.M1 = (Long) obj;
                qyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final jz jzVar = (jz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.l = string2;
                i51Var.k = i30;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i31 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(jzVar.c);
                arrayList9.add(i31);
                if (jzVar.c) {
                    arrayList9.add(org.telegram.ui.Components.i51.B(null));
                    arrayList9.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.fz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    iz izVar = (iz) view.getParent();
                                    jz jzVar2 = jzVar;
                                    jzVar2.d = true;
                                    izVar.a(true, true);
                                    dh.v vVar = jzVar2.f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(jzVar2.c), Boolean.valueOf(jzVar2.d));
                                    }
                                    jzVar2.U();
                                    break;
                                default:
                                    iz izVar2 = (iz) view.getParent();
                                    jz jzVar3 = jzVar;
                                    jzVar3.d = false;
                                    izVar2.a(false, true);
                                    dh.v vVar2 = jzVar3.f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(jzVar3.c), Boolean.valueOf(jzVar3.d));
                                    }
                                    jzVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.fz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    iz izVar = (iz) view.getParent();
                                    jz jzVar2 = jzVar;
                                    jzVar2.d = true;
                                    izVar.a(true, true);
                                    dh.v vVar = jzVar2.f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(jzVar2.c), Boolean.valueOf(jzVar2.d));
                                    }
                                    jzVar2.U();
                                    break;
                                default:
                                    iz izVar2 = (iz) view.getParent();
                                    jz jzVar3 = jzVar;
                                    jzVar3.d = false;
                                    izVar2.a(false, true);
                                    dh.v vVar2 = jzVar3.f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(jzVar3.c), Boolean.valueOf(jzVar3.d));
                                    }
                                    jzVar3.U();
                                    break;
                            }
                        }
                    };
                    int i32 = hz.a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(hz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(jzVar.d);
                    arrayList9.add(J5);
                    ai.A(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                yb0 yb0Var = (yb0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                yb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(yb0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        kf.k0.v(R.string.AIEditorStyleNotFound, yb0.b(), R.raw.error, 36);
                        break;
                    } else {
                        yb0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                yv0 yv0Var = (yv0) this.b;
                sg.b bVar2 = yv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                yv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                yv0Var.w = paint;
                Bitmap bitmap2 = yv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                yv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                yv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                yv0Var.x = new Matrix();
                bVar2.a(bitmap);
                tg.c.c(bVar2, yv0Var.c);
                yv0Var.D.d();
                break;
            case 16:
                fw0 fw0Var = (fw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.l = string3;
                i51Var2.k = i33;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i34 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(fw0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (fw0Var.r) {
                    ai.q(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.w7.a((int) fw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    cl0 cl0Var = new cl0(4);
                    org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7();
                    v7Var.c = a2;
                    v7Var.d = 20;
                    v7Var.e = cl0Var;
                    fw0Var.b.d((int) Utilities.clamp(fw0Var.s, 10000L, 0L), v7Var, new y3(fw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, fw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, fw0Var.s > 0 ? fw0Var.W() : null));
                    TLRPC.Chat chat3 = fw0Var.getMessagesController().getChat(Long.valueOf(fw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        fw0Var.c.setLink(fw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        ai.q(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, fw0Var.c));
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
                sg.b bVar3 = profileActivity.m6;
                bVar3.a((Bitmap) obj2);
                tg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.n6.d();
                break;
            case 19:
                p31 p31Var = (p31) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.g61 g61Var = p31Var.f;
                q31 q31Var = p31Var.v;
                ArrayList arrayList12 = q31Var.h;
                dg.s1 s1Var = p31Var.h;
                if (s1Var.getMeasuredHeight() <= 0) {
                    s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(s1Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((s1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p31Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || p31Var.c != null || p31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || p31Var.c != null) {
                        Context context2 = p31Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.j6.L6;
                        f6Var = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2, i35, 21, 0, 0, false, false, f6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = p31Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p31Var.c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(q31Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (p31Var.b != null) {
                        for (int i36 = 0; i36 < p31Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.l = p31Var.b.options.get(i36).text;
                            i51Var3.k = R.drawable.msg_arrowright;
                            i51Var3.d = i36;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (p31Var.c != null) {
                        for (int i37 = 0; i37 < p31Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.l = p31Var.c.options.get(i37).text;
                            i51Var4.k = R.drawable.msg_arrowright;
                            i51Var4.d = i37;
                            arrayList11.add(i51Var4);
                            measuredHeight += 50;
                        }
                    } else if (p31Var.d != null) {
                        if (p31Var.n == null) {
                            Context context3 = p31Var.getContext();
                            f6Var5 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                            o31 o31Var = new o31(p31Var, context3, f6Var5);
                            p31Var.n = o31Var;
                            o31Var.setShowLimitWhenNear(100);
                        }
                        p31Var.n.b.setHint(LocaleController.getString(p31Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(p31Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = q31Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.g3) q31Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        ai.A(i11, arrayList11);
                        if (p31Var.r == null) {
                            Context context4 = p31Var.getContext();
                            f6Var2 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                            ph.d dVar = new ph.d(context4, f6Var2, true);
                            p31Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(p31Var.getContext());
                            p31Var.r = frameLayout;
                            int i38 = org.telegram.ui.ActionBar.j6.h5;
                            f6Var3 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i38, f6Var3));
                            p31Var.r.addView(p31Var.s, k7.b6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(p31Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.j6.d7;
                            f6Var4 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i39, f6Var4));
                            p31Var.r.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        p31Var.s.setEnabled(p31Var.d.optional || !TextUtils.isEmpty(p31Var.n.getText()));
                        p31Var.s.setOnClickListener(new g60(p31Var, 28));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(p31Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) kf.k0.i(1, arrayList11)).j = true;
                    if (q31Var.d && p31Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(p31Var.getContext());
                        Context context5 = p31Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.j6.b7;
                        f6Var6 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(q31Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.U0(context5, i40, org.telegram.ui.ActionBar.j6.v0(i41, f6Var6)), 0, 0);
                        mqVar.w = true;
                        frameLayout2.setBackground(mqVar);
                        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(p31Var.getContext(), null);
                        f90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        f6Var7 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                        f90Var.setText(AndroidUtilities.replaceLinks(string4, f6Var7));
                        int i42 = org.telegram.ui.ActionBar.j6.A6;
                        f6Var8 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
                        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i42, f6Var8));
                        f90Var.setGravity(17);
                        frameLayout2.addView(f90Var, k7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (g61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.g3) q31Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        g61Var.U2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        g61Var.U2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((w31) this.b).U));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((g41) this.b).U));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                i71.Q((i71) this.b, (ArrayList) obj);
                break;
            case 24:
                h71 h71Var = (h71) this.b;
                ArrayList arrayList13 = h71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = h71Var.a;
                ArrayList arrayList14 = h71Var.d;
                if (tL_error3 != null) {
                    if (h71Var.r) {
                        arrayList14.clear();
                        h71Var.r = false;
                    }
                    h71Var.h = true;
                    h71Var.f = false;
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
                    if (h71Var.r) {
                        arrayList14.clear();
                        h71Var.r = false;
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
                        h71Var.h = true;
                    }
                    h71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                l71 l71Var = (l71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = l71Var.Y;
                nh.l6 l6Var = l71Var.W;
                if (l6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l6Var.i;
                    int size8 = arrayList17.size();
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < size8) {
                        Object obj9 = arrayList17.get(i47);
                        i47++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i48 = va1.b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(va1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(l71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i46--;
                        if (i46 == 0) {
                            i46 = i45;
                        }
                    }
                    if (l6Var.k() || !l6Var.r) {
                        while (true) {
                            if (i14 < (i46 <= 0 ? i45 : i46)) {
                                i14++;
                                org.telegram.ui.Components.i51 o10 = org.telegram.ui.Components.i51.o(i14, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                w81.a0((w81) this.b, (ArrayList) obj);
                break;
            case 27:
                g91 g91Var = (g91) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = g91Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = g91Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    break;
                }
                break;
            default:
                yd1 yd1Var = (yd1) this.b;
                sg.b bVar4 = yd1Var.B;
                Bitmap bitmap3 = (Bitmap) obj2;
                yd1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                yd1Var.v = paint2;
                Bitmap bitmap4 = yd1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                yd1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                yd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                yd1Var.w = new Matrix();
                bVar4.a(bitmap3);
                tg.c.c(bVar4, yd1Var.b);
                yd1Var.C.d();
                break;
        }
    }
}
