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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        t91 t91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        org.telegram.ui.ActionBar.g6 g6Var7;
        org.telegram.ui.ActionBar.g6 g6Var8;
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
                e5 e5Var = (e5) this.b;
                e5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                e5Var.w = false;
                tg.b bVar = e5Var.h;
                bVar.a((Bitmap) obj2);
                ug.c.c(bVar, e5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                l9 l9Var = (l9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = l9Var.H.isEmpty();
                ArrayList arrayList2 = l9Var.D;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.j51 c3 = org.telegram.ui.Components.j51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.q = true;
                    arrayList.add(c3);
                    if (!l9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.j51 c10 = org.telegram.ui.Components.j51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = l9Var.H;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = l9Var.getMessagesController().getChat(l10)) != null) {
                            p8 p8Var = new p8(l9Var, i13);
                            int i20 = j9.a;
                            org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(j9.class);
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
                        h9 h9Var = (h9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, l9Var, h9Var);
                        int i21 = f9.a;
                        org.telegram.ui.Components.j51 J2 = org.telegram.ui.Components.j51.J(f9.class);
                        J2.G = h9Var;
                        J2.D = gVar;
                        J2.K(l9Var.l0(h9Var.c));
                        arrayList.add(J2);
                    }
                    if (!l9Var.G) {
                        arrayList.add(org.telegram.ui.Components.j51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                ke keVar = (ke) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.v0).getChat(Long.valueOf(-keVar.w0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.v0).getChatFull(-keVar.w0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (keVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.j51.g(keVar.z0));
                    t91 t91Var2 = keVar.l1;
                    if (t91Var2 == null || t91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.j51.h(5, i22, t91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.j51.A(-1, null));
                    }
                    t91 t91Var3 = keVar.m1;
                    if (t91Var3 != null && !t91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.j51.h(2, i22, t91Var3));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-2, charSequence));
                    }
                }
                if (keVar.d1 && (t91Var = keVar.n1) != null && !t91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.j51.h(2, i22, t91Var));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-3, null));
                }
                if (keVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.j51.u(keVar.p1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(keVar.q1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(keVar.r1));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-4, keVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.k(keVar.D0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-5, keVar.A0));
                        int i23 = MessagesController.getInstance(keVar.v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = keVar.y0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new uo0(i24, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.j51 i25 = org.telegram.ui.Components.j51.i(1, string);
                        if (keVar.y0 >= i23 && keVar.j1) {
                            z4 = true;
                        }
                        i25.K(z4);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.j51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.j(3, keVar.J0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-6, keVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.v0).getChat(Long.valueOf(-keVar.w0))) && MessagesController.getInstance(keVar.v0).starrefConnectAllowed) {
                    arrayList4.add(sh.f.a(4, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.uj, keVar.u0), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-7, null));
                }
                if (keVar.b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.j51.p(keVar.b1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.j51.A(-10, null));
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
                        int i27 = mh.da.a;
                        org.telegram.ui.Components.j51 J3 = org.telegram.ui.Components.j51.J(mh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i28 = mh.da.a;
                        org.telegram.ui.Components.j51 J4 = org.telegram.ui.Components.j51.J(mh.da.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                po poVar = (po) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    poVar.getClass();
                    org.telegram.ui.Components.qc.a0(poVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(poVar.h0);
                AndroidUtilities.removeFromParent(poVar.e0);
                AndroidUtilities.removeFromParent(poVar.g0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new lq((qr) this.b, i12), 1000L);
                break;
            case 6:
                ((n7.qa) this.b).X0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                os osVar = (os) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.S));
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.b));
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.c));
                if (TextUtils.isEmpty(osVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (osVar.H) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                }
                if (osVar.F && osVar.H) {
                    org.telegram.ui.Components.j51 i29 = org.telegram.ui.Components.j51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(osVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.j51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.j51.k(osVar.d));
                yh.A(R.string.AddNotesInfo, arrayList8);
                if (osVar.F) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(osVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.j51.k(osVar.x));
                    arrayList8.add(org.telegram.ui.Components.j51.k(osVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(osVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                    org.telegram.ui.Components.j51 e6 = org.telegram.ui.Components.j51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e6.r = true;
                    arrayList8.add(e6);
                }
                arrayList8.add(org.telegram.ui.Components.j51.B(charSequence2));
                if (osVar.V) {
                    AndroidUtilities.runOnUIThread(new fs(osVar, user, i13));
                    osVar.V = false;
                    AndroidUtilities.runOnUIThread(new gs(osVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                qt.a((qt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                mt mtVar = (mt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                qt qtVar = mtVar.a;
                ot otVar = qtVar.l;
                if (otVar != null) {
                    otVar.z(charSequence3, TextUtils.join("", qtVar.o), callback != null ? new org.telegram.ui.Components.xk(11, mtVar, callback) : null);
                    if (callback == null) {
                        qtVar.p();
                        break;
                    }
                }
                break;
            case 10:
                bu.R((bu) this.b, (ArrayList) obj);
                break;
            case 11:
                py pyVar = (py) this.b;
                pyVar.M1 = (Long) obj;
                pyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final iz izVar = (iz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(2);
                j51Var.l = string2;
                j51Var.k = i30;
                arrayList9.add(j51Var);
                org.telegram.ui.Components.j51 i31 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(izVar.c);
                arrayList9.add(i31);
                if (izVar.c) {
                    arrayList9.add(org.telegram.ui.Components.j51.B(null));
                    arrayList9.add(org.telegram.ui.Components.j51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.ez
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    hz hzVar = (hz) view.getParent();
                                    iz izVar2 = izVar;
                                    izVar2.d = true;
                                    hzVar.a(true, true);
                                    eh.w wVar = izVar2.f;
                                    if (wVar != null) {
                                        wVar.run(Boolean.valueOf(izVar2.c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    break;
                                default:
                                    hz hzVar2 = (hz) view.getParent();
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    hzVar2.a(false, true);
                                    eh.w wVar2 = izVar3.f;
                                    if (wVar2 != null) {
                                        wVar2.run(Boolean.valueOf(izVar3.c), Boolean.valueOf(izVar3.d));
                                    }
                                    izVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.ez
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    hz hzVar = (hz) view.getParent();
                                    iz izVar2 = izVar;
                                    izVar2.d = true;
                                    hzVar.a(true, true);
                                    eh.w wVar = izVar2.f;
                                    if (wVar != null) {
                                        wVar.run(Boolean.valueOf(izVar2.c), Boolean.valueOf(izVar2.d));
                                    }
                                    izVar2.U();
                                    break;
                                default:
                                    hz hzVar2 = (hz) view.getParent();
                                    iz izVar3 = izVar;
                                    izVar3.d = false;
                                    hzVar2.a(false, true);
                                    eh.w wVar2 = izVar3.f;
                                    if (wVar2 != null) {
                                        wVar2.run(Boolean.valueOf(izVar3.c), Boolean.valueOf(izVar3.d));
                                    }
                                    izVar3.U();
                                    break;
                            }
                        }
                    };
                    int i32 = gz.a;
                    org.telegram.ui.Components.j51 J5 = org.telegram.ui.Components.j51.J(gz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(izVar.d);
                    arrayList9.add(J5);
                    yh.A(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                xb0 xb0Var = (xb0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                xb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(xb0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        l.d.v(R.string.AIEditorStyleNotFound, xb0.b(), R.raw.error, 36);
                        break;
                    } else {
                        xb0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                tv0 tv0Var = (tv0) this.b;
                tg.b bVar2 = tv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                tv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                tv0Var.w = paint;
                Bitmap bitmap2 = tv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                tv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                tv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                tv0Var.x = new Matrix();
                bVar2.a(bitmap);
                ug.c.c(bVar2, tv0Var.c);
                tv0Var.D.d();
                break;
            case 16:
                aw0 aw0Var = (aw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.j51 j51Var2 = new org.telegram.ui.Components.j51(2);
                j51Var2.l = string3;
                j51Var2.k = i33;
                arrayList10.add(j51Var2);
                org.telegram.ui.Components.j51 i34 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(aw0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.j51.A(2, null));
                if (aw0Var.r) {
                    yh.r(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) aw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    cl0 cl0Var = new cl0(4);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = cl0Var;
                    aw0Var.b.d((int) Utilities.clamp(aw0Var.s, 10000L, 0L), w7Var, new w3(aw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.j51.j(3, aw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.j51.A(4, aw0Var.s > 0 ? aw0Var.W() : null));
                    TLRPC.Chat chat3 = aw0Var.getMessagesController().getChat(Long.valueOf(aw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        aw0Var.c.setLink(aw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        yh.r(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.j51.j(5, aw0Var.c));
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
                tg.b bVar3 = profileActivity.m6;
                bVar3.a((Bitmap) obj2);
                ug.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.n6.d();
                break;
            case 19:
                l31 l31Var = (l31) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.i61 i61Var = l31Var.f;
                m31 m31Var = l31Var.v;
                ArrayList arrayList12 = m31Var.h;
                eg.q1 q1Var = l31Var.h;
                if (q1Var.getMeasuredHeight() <= 0) {
                    q1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.j51 C = org.telegram.ui.Components.j51.C(q1Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((q1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = l31Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || l31Var.c != null || l31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || l31Var.c != null) {
                        Context context2 = l31Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.k6.L6;
                        g6Var = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i35, 21, 0, 0, false, false, g6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = l31Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = l31Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                        org.telegram.ui.Components.j51 k10 = org.telegram.ui.Components.j51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (l31Var.b != null) {
                        for (int i36 = 0; i36 < l31Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.j51 j51Var3 = new org.telegram.ui.Components.j51(30);
                            j51Var3.l = l31Var.b.options.get(i36).text;
                            j51Var3.k = R.drawable.msg_arrowright;
                            j51Var3.d = i36;
                            arrayList11.add(j51Var3);
                            measuredHeight += 50;
                        }
                    } else if (l31Var.c != null) {
                        for (int i37 = 0; i37 < l31Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.j51 j51Var4 = new org.telegram.ui.Components.j51(30);
                            j51Var4.l = l31Var.c.options.get(i37).text;
                            j51Var4.k = R.drawable.msg_arrowright;
                            j51Var4.d = i37;
                            arrayList11.add(j51Var4);
                            measuredHeight += 50;
                        }
                    } else if (l31Var.d != null) {
                        if (l31Var.n == null) {
                            Context context3 = l31Var.getContext();
                            g6Var5 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                            j31 j31Var = new j31(l31Var, context3, g6Var5);
                            l31Var.n = j31Var;
                            j31Var.setShowLimitWhenNear(100);
                        }
                        l31Var.n.b.setHint(LocaleController.getString(l31Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.j51 k11 = org.telegram.ui.Components.j51.k(l31Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = m31Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.h3) m31Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        yh.A(i11, arrayList11);
                        if (l31Var.r == null) {
                            Context context4 = l31Var.getContext();
                            g6Var2 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                            qh.d dVar = new qh.d(context4, g6Var2, true);
                            l31Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(l31Var.getContext());
                            l31Var.r = frameLayout;
                            int i38 = org.telegram.ui.ActionBar.k6.h5;
                            g6Var3 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i38, g6Var3));
                            l31Var.r.addView(l31Var.s, k7.c6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(l31Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.k6.d7;
                            g6Var4 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i39, g6Var4));
                            l31Var.r.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        l31Var.s.setEnabled(l31Var.d.optional || !TextUtils.isEmpty(l31Var.n.getText()));
                        l31Var.s.setOnClickListener(new f60(l31Var, 29));
                        org.telegram.ui.Components.j51 k12 = org.telegram.ui.Components.j51.k(l31Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.j51) l.d.i(1, arrayList11)).j = true;
                    if (m31Var.d && l31Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(l31Var.getContext());
                        Context context5 = l31Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.k6.b7;
                        g6Var6 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7)), org.telegram.ui.ActionBar.k6.U0(context5, i40, org.telegram.ui.ActionBar.k6.v0(i41, g6Var6)), 0, 0);
                        pqVar.w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(l31Var.getContext(), null);
                        g90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        g6Var7 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                        g90Var.setText(AndroidUtilities.replaceLinks(string4, g6Var7));
                        int i42 = org.telegram.ui.ActionBar.k6.A6;
                        g6Var8 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
                        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i42, g6Var8));
                        g90Var.setGravity(17);
                        frameLayout2.addView(g90Var, k7.c6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.j51 k13 = org.telegram.ui.Components.j51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (i61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.h3) m31Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        i61Var.U2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        i61Var.U2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((r31) this.b).U));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((b41) this.b).U));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                c71.Q((c71) this.b, (ArrayList) obj);
                break;
            case 24:
                b71 b71Var = (b71) this.b;
                ArrayList arrayList13 = b71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = b71Var.a;
                ArrayList arrayList14 = b71Var.d;
                if (tL_error3 != null) {
                    if (b71Var.r) {
                        arrayList14.clear();
                        b71Var.r = false;
                    }
                    b71Var.h = true;
                    b71Var.f = false;
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
                    if (b71Var.r) {
                        arrayList14.clear();
                        b71Var.r = false;
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
                        b71Var.h = true;
                    }
                    b71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                f71 f71Var = (f71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = f71Var.Y;
                oh.l6 l6Var = f71Var.W;
                if (l6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l6Var.i;
                    int size8 = arrayList17.size();
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < size8) {
                        Object obj9 = arrayList17.get(i47);
                        i47++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i48 = oa1.b;
                        org.telegram.ui.Components.j51 J6 = org.telegram.ui.Components.j51.J(oa1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(f71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
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
                                org.telegram.ui.Components.j51 o10 = org.telegram.ui.Components.j51.o(i14, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                p81.a0((p81) this.b, (ArrayList) obj);
                break;
            case 27:
                z81 z81Var = (z81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = z81Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout));
                }
                LinearLayout linearLayout2 = z81Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout2));
                    break;
                }
                break;
            default:
                ud1 ud1Var = (ud1) this.b;
                tg.b bVar4 = ud1Var.B;
                Bitmap bitmap3 = (Bitmap) obj2;
                ud1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ud1Var.v = paint2;
                Bitmap bitmap4 = ud1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                ud1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                ud1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ud1Var.w = new Matrix();
                bVar4.a(bitmap3);
                ug.c.c(bVar4, ud1Var.b);
                ud1Var.C.d();
                break;
        }
    }
}
