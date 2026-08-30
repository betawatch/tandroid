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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        s91 s91Var;
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
                e5 e5Var = (e5) this.b;
                e5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                e5Var.w = false;
                sg.b bVar = e5Var.h;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, e5Var);
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
                    org.telegram.ui.Components.i51 c3 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.q = true;
                    arrayList.add(c3);
                    if (!l9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
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
                            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(j9.class);
                            J.G = chat;
                            J.D = p8Var;
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
                        h9 h9Var = (h9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, l9Var, h9Var);
                        int i21 = f9.a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(f9.class);
                        J2.G = h9Var;
                        J2.D = gVar;
                        J2.K(l9Var.l0(h9Var.c));
                        arrayList.add(J2);
                    }
                    if (!l9Var.G) {
                        arrayList.add(org.telegram.ui.Components.i51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-3, 8));
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
                    arrayList4.add(org.telegram.ui.Components.i51.g(keVar.z0));
                    s91 s91Var2 = keVar.l1;
                    if (s91Var2 == null || s91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i22, s91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    }
                    s91 s91Var3 = keVar.m1;
                    if (s91Var3 != null && !s91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i22, s91Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (keVar.d1 && (s91Var = keVar.n1) != null && !s91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i22, s91Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (keVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(keVar.p1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(keVar.q1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(keVar.r1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, keVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(keVar.D0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, keVar.A0));
                        int i23 = MessagesController.getInstance(keVar.v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = keVar.y0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(0, new so0(i24, context, null, false));
                            mqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.i51 i25 = org.telegram.ui.Components.i51.i(1, string);
                        if (keVar.y0 >= i23 && keVar.j1) {
                            z4 = true;
                        }
                        i25.K(z4);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, keVar.J0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, keVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.v0).getChat(Long.valueOf(-keVar.w0))) && MessagesController.getInstance(keVar.v0).starrefConnectAllowed) {
                    arrayList4.add(rh.g.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, keVar.u0), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (keVar.b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(keVar.b1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
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
                        int i27 = lh.da.a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
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
                    if (!TextUtils.isEmpty(geVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
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
                AndroidUtilities.runOnUIThread(new kq((pr) this.b, i12), 1000L);
                break;
            case 6:
                ((n7.qa) this.b).b1(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                ns nsVar = (ns) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.E));
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.S));
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.b));
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.c));
                if (TextUtils.isEmpty(nsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (nsVar.H) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (nsVar.F && nsVar.H) {
                    org.telegram.ui.Components.i51 i29 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(nsVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.d));
                yh.A(R.string.AddNotesInfo, arrayList8);
                if (nsVar.F) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.i51.B(charSequence2));
                if (nsVar.V) {
                    AndroidUtilities.runOnUIThread(new es(nsVar, user, i13));
                    nsVar.V = false;
                    AndroidUtilities.runOnUIThread(new fs(nsVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                pt.a((pt) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                lt ltVar = (lt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                pt ptVar = ltVar.a;
                nt ntVar = ptVar.l;
                if (ntVar != null) {
                    ntVar.A(charSequence3, TextUtils.join("", ptVar.o), callback != null ? new org.telegram.ui.Components.vk(11, ltVar, callback) : null);
                    if (callback == null) {
                        ptVar.p();
                        break;
                    }
                }
                break;
            case 10:
                au.R((au) this.b, (ArrayList) obj);
                break;
            case 11:
                oy oyVar = (oy) this.b;
                oyVar.M1 = (Long) obj;
                oyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final hz hzVar = (hz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.l = string2;
                i51Var.k = i30;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i31 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(hzVar.c);
                arrayList9.add(i31);
                if (hzVar.c) {
                    arrayList9.add(org.telegram.ui.Components.i51.B(null));
                    arrayList9.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.dz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    gz gzVar = (gz) view.getParent();
                                    hz hzVar2 = hzVar;
                                    hzVar2.d = true;
                                    gzVar.a(true, true);
                                    dh.v vVar = hzVar2.f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(hzVar2.c), Boolean.valueOf(hzVar2.d));
                                    }
                                    hzVar2.U();
                                    break;
                                default:
                                    gz gzVar2 = (gz) view.getParent();
                                    hz hzVar3 = hzVar;
                                    hzVar3.d = false;
                                    gzVar2.a(false, true);
                                    dh.v vVar2 = hzVar3.f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(hzVar3.c), Boolean.valueOf(hzVar3.d));
                                    }
                                    hzVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.dz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    gz gzVar = (gz) view.getParent();
                                    hz hzVar2 = hzVar;
                                    hzVar2.d = true;
                                    gzVar.a(true, true);
                                    dh.v vVar = hzVar2.f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(hzVar2.c), Boolean.valueOf(hzVar2.d));
                                    }
                                    hzVar2.U();
                                    break;
                                default:
                                    gz gzVar2 = (gz) view.getParent();
                                    hz hzVar3 = hzVar;
                                    hzVar3.d = false;
                                    gzVar2.a(false, true);
                                    dh.v vVar2 = hzVar3.f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(hzVar3.c), Boolean.valueOf(hzVar3.d));
                                    }
                                    hzVar3.U();
                                    break;
                            }
                        }
                    };
                    int i32 = fz.a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(fz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(hzVar.d);
                    arrayList9.add(J5);
                    yh.A(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                wb0 wb0Var = (wb0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                wb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(wb0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        kh.a2.v(R.string.AIEditorStyleNotFound, wb0.b(), R.raw.error, 36);
                        break;
                    } else {
                        wb0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                rv0 rv0Var = (rv0) this.b;
                sg.b bVar2 = rv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                rv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                rv0Var.w = paint;
                Bitmap bitmap2 = rv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                rv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                rv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                rv0Var.x = new Matrix();
                bVar2.a(bitmap);
                tg.c.c(bVar2, rv0Var.c);
                rv0Var.D.d();
                break;
            case 16:
                yv0 yv0Var = (yv0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.l = string3;
                i51Var2.k = i33;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i34 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(yv0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (yv0Var.r) {
                    yh.r(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) yv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    al0 al0Var = new al0(4);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = al0Var;
                    yv0Var.b.d((int) Utilities.clamp(yv0Var.s, 10000L, 0L), w7Var, new w3(yv0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, yv0Var.b));
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, yv0Var.s > 0 ? yv0Var.W() : null));
                    TLRPC.Chat chat3 = yv0Var.getMessagesController().getChat(Long.valueOf(yv0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        yv0Var.c.setLink(yv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        yh.r(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, yv0Var.c));
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
                j31 j31Var = (j31) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.g61 g61Var = j31Var.f;
                k31 k31Var = j31Var.v;
                ArrayList arrayList12 = k31Var.h;
                dg.s1 s1Var = j31Var.h;
                if (s1Var.getMeasuredHeight() <= 0) {
                    s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(s1Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((s1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = j31Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || j31Var.c != null || j31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || j31Var.c != null) {
                        Context context2 = j31Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.j6.L6;
                        f6Var = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i35, 21, 0, 0, false, false, f6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = j31Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = j31Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (j31Var.b != null) {
                        for (int i36 = 0; i36 < j31Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.l = j31Var.b.options.get(i36).text;
                            i51Var3.k = R.drawable.msg_arrowright;
                            i51Var3.d = i36;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (j31Var.c != null) {
                        for (int i37 = 0; i37 < j31Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.l = j31Var.c.options.get(i37).text;
                            i51Var4.k = R.drawable.msg_arrowright;
                            i51Var4.d = i37;
                            arrayList11.add(i51Var4);
                            measuredHeight += 50;
                        }
                    } else if (j31Var.d != null) {
                        if (j31Var.n == null) {
                            Context context3 = j31Var.getContext();
                            f6Var5 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                            h31 h31Var = new h31(j31Var, context3, f6Var5);
                            j31Var.n = h31Var;
                            h31Var.setShowLimitWhenNear(100);
                        }
                        j31Var.n.b.setHint(LocaleController.getString(j31Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(j31Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = k31Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.g3) k31Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        yh.A(i11, arrayList11);
                        if (j31Var.r == null) {
                            Context context4 = j31Var.getContext();
                            f6Var2 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                            ph.d dVar = new ph.d(context4, f6Var2, true);
                            j31Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(j31Var.getContext());
                            j31Var.r = frameLayout;
                            int i38 = org.telegram.ui.ActionBar.j6.h5;
                            f6Var3 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i38, f6Var3));
                            j31Var.r.addView(j31Var.s, k7.b6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(j31Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.j6.d7;
                            f6Var4 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i39, f6Var4));
                            j31Var.r.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        j31Var.s.setEnabled(j31Var.d.optional || !TextUtils.isEmpty(j31Var.n.getText()));
                        j31Var.s.setOnClickListener(new e60(j31Var, 29));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(j31Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) kh.a2.i(1, arrayList11)).j = true;
                    if (k31Var.d && j31Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(j31Var.getContext());
                        Context context5 = j31Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.j6.b7;
                        f6Var6 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.U0(context5, i40, org.telegram.ui.ActionBar.j6.v0(i41, f6Var6)), 0, 0);
                        nqVar.w = true;
                        frameLayout2.setBackground(nqVar);
                        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(j31Var.getContext(), null);
                        e90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        f6Var7 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                        e90Var.setText(AndroidUtilities.replaceLinks(string4, f6Var7));
                        int i42 = org.telegram.ui.ActionBar.j6.A6;
                        f6Var8 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
                        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i42, f6Var8));
                        e90Var.setGravity(17);
                        frameLayout2.addView(e90Var, k7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (g61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.g3) k31Var).containerView;
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
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((p31) this.b).U));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((z31) this.b).U));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                b71.Q((b71) this.b, (ArrayList) obj);
                break;
            case 24:
                a71 a71Var = (a71) this.b;
                ArrayList arrayList13 = a71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = a71Var.a;
                ArrayList arrayList14 = a71Var.d;
                if (tL_error3 != null) {
                    if (a71Var.r) {
                        arrayList14.clear();
                        a71Var.r = false;
                    }
                    a71Var.h = true;
                    a71Var.f = false;
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
                    if (a71Var.r) {
                        arrayList14.clear();
                        a71Var.r = false;
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
                        a71Var.h = true;
                    }
                    a71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                e71 e71Var = (e71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = e71Var.Y;
                nh.l6 l6Var = e71Var.W;
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
                        int i48 = na1.b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(na1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(e71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
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
                o81.a0((o81) this.b, (ArrayList) obj);
                break;
            case 27:
                y81 y81Var = (y81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = y81Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = y81Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    break;
                }
                break;
            default:
                rd1 rd1Var = (rd1) this.b;
                sg.b bVar4 = rd1Var.B;
                Bitmap bitmap3 = (Bitmap) obj2;
                rd1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                rd1Var.v = paint2;
                Bitmap bitmap4 = rd1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                rd1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                rd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                rd1Var.w = new Matrix();
                bVar4.a(bitmap3);
                tg.c.c(bVar4, rd1Var.b);
                rd1Var.C.d();
                break;
        }
    }
}
