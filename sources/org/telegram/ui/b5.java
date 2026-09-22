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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        la1 la1Var;
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
        r9 = false;
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
                k9 k9Var = (k9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c11 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = k9Var.K;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = k9Var.getMessagesController().getChat(l4)) != null) {
                            n8 n8Var = new n8(k9Var, i13);
                            int i20 = i9.a;
                            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
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
                        g9 g9Var = (g9) obj4;
                        ai.f2 f2Var = new ai.f2(27, k9Var, g9Var);
                        int i21 = e9.a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = f2Var;
                        J2.K(k9Var.l0(g9Var.c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.i51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                je jeVar = (je) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(jeVar.y0).getChat(Long.valueOf(-jeVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(jeVar.y0).getChatFull(-jeVar.z0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (jeVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.i51.g(jeVar.C0));
                    la1 la1Var2 = jeVar.o1;
                    if (la1Var2 == null || la1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i22, la1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    }
                    la1 la1Var3 = jeVar.p1;
                    if (la1Var3 != null && !la1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i22, la1Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (jeVar.g1 && (la1Var = jeVar.q1) != null && !la1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i22, la1Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (jeVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.s1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.t1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.u1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, jeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (jeVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(jeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, jeVar.D0));
                        int i23 = MessagesController.getInstance(jeVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = jeVar.B0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new jp0(i24, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.i51 i25 = org.telegram.ui.Components.i51.i(1, string);
                        if (jeVar.B0 >= i23 && jeVar.m1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (jeVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, jeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, jeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(jeVar.y0).getChat(Long.valueOf(-jeVar.z0))) && MessagesController.getInstance(jeVar.y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, jeVar.x0), R.drawable.filled_earn_stars, wo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (jeVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(jeVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
                    break;
                }
                break;
            case 3:
                de deVar = (de) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                fe feVar = deVar.f;
                int i26 = deVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = feVar.n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i27 = yh.q7.a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(yh.q7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(feVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i26 == 1) {
                    ArrayList arrayList7 = feVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i28 = yh.q7.a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(yh.q7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(feVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
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
                ss ssVar = (ss) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.V));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.b));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.c));
                if (TextUtils.isEmpty(ssVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (ssVar.K) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (ssVar.I && ssVar.K) {
                    org.telegram.ui.Components.i51 i29 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(ssVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.d));
                hg.c.p(R.string.AddNotesInfo, arrayList8);
                if (ssVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.i51.B(charSequence2));
                if (ssVar.Y) {
                    AndroidUtilities.runOnUIThread(new js(ssVar, user, i13));
                    ssVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ks(ssVar, i13), 200L);
                    break;
                }
                break;
            case 8:
                st.a((st) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                ot otVar = (ot) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                st stVar = otVar.a;
                qt qtVar = stVar.l;
                if (qtVar != null) {
                    qtVar.G(charSequence3, TextUtils.join("", stVar.o), callback != null ? new nf(24, otVar, callback) : null);
                    if (callback == null) {
                        stVar.p();
                        break;
                    }
                }
                break;
            case 10:
                cu.R((cu) this.b, (ArrayList) obj);
                break;
            case 11:
                uy uyVar = (uy) this.b;
                uyVar.P1 = (Long) obj;
                uyVar.U4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final mz mzVar = (mz) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.l = string2;
                i51Var.k = i30;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i31 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(mzVar.c);
                arrayList9.add(i31);
                if (mzVar.c) {
                    arrayList9.add(org.telegram.ui.Components.i51.B(null));
                    arrayList9.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.iz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    lz lzVar = (lz) view.getParent();
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    lzVar.a(true, true);
                                    ai.m0 m0Var = mzVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    break;
                                default:
                                    lz lzVar2 = (lz) view.getParent();
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    lzVar2.a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.iz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    lz lzVar = (lz) view.getParent();
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    lzVar.a(true, true);
                                    ai.m0 m0Var = mzVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    break;
                                default:
                                    lz lzVar2 = (lz) view.getParent();
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    lzVar2.a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    break;
                            }
                        }
                    };
                    int i32 = kz.a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(kz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(mzVar.d);
                    arrayList9.add(J5);
                    hg.c.p(R.string.TopicsLayoutInfo, arrayList9);
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
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.y0.o(R.string.AIEditorStyleNotFound, fc0.b(), R.raw.error, 36);
                        break;
                    } else {
                        fc0.b().d0(tL_error2, false);
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
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.l = string3;
                i51Var2.k = i33;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i34 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(tw0Var.r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (tw0Var.r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    js0 js0Var = new js0(2);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.c = a2;
                    y7Var.d = 20;
                    y7Var.e = js0Var;
                    tw0Var.b.d((int) Utilities.clamp(tw0Var.s, 10000L, 0L), y7Var, new s3(tw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, tw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, tw0Var.s > 0 ? tw0Var.W() : null));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, tw0Var.c));
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
                org.telegram.ui.Components.e61 e61Var = b41Var.f;
                c41 c41Var = b41Var.v;
                ArrayList arrayList12 = c41Var.h;
                t5 t5Var = b41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(t5Var.getMeasuredHeight());
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
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (b41Var.b != null) {
                        for (int i36 = 0; i36 < b41Var.b.options.size(); i36++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.l = b41Var.b.options.get(i36).text;
                            i51Var3.k = R.drawable.msg_arrowright;
                            i51Var3.d = i36;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.c != null) {
                        for (int i37 = 0; i37 < b41Var.c.options.size(); i37++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.l = b41Var.c.options.get(i37).text;
                            i51Var4.k = R.drawable.msg_arrowright;
                            i51Var4.d = i37;
                            arrayList11.add(i51Var4);
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
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(b41Var.n);
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
                        hg.c.p(i11, arrayList11);
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
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i38, e6Var3));
                            b41Var.r.addView(b41Var.s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(b41Var.getContext());
                            int i39 = org.telegram.ui.ActionBar.i6.d7;
                            e6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i39, e6Var4));
                            b41Var.r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        b41Var.s.setEnabled(b41Var.d.optional || !TextUtils.isEmpty(b41Var.n.getText()));
                        b41Var.s.setOnClickListener(new k60(b41Var, 28));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(b41Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) hg.c.h(1, arrayList11)).j = true;
                    if (c41Var.d && b41Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(b41Var.getContext());
                        Context context5 = b41Var.getContext();
                        int i40 = R.drawable.greydivider;
                        int i41 = org.telegram.ui.ActionBar.i6.b7;
                        e6Var6 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7)), org.telegram.ui.ActionBar.i6.U0(context5, i40, org.telegram.ui.ActionBar.i6.v0(i41, e6Var6)), 0, 0);
                        pqVar.w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(b41Var.getContext(), null);
                        c90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        e6Var7 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        c90Var.setText(AndroidUtilities.replaceLinks(string4, e6Var7));
                        int i42 = org.telegram.ui.ActionBar.i6.A6;
                        e6Var8 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i42, e6Var8));
                        c90Var.setGravity(17);
                        frameLayout2.addView(c90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) c41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        e61Var.X2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        e61Var.X2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((i41) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((s41) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                r71.Q((r71) this.b, (ArrayList) obj);
                break;
            case 24:
                q71 q71Var = (q71) this.b;
                ArrayList arrayList13 = q71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i43 = q71Var.a;
                ArrayList arrayList14 = q71Var.d;
                if (tL_error3 != null) {
                    if (q71Var.r) {
                        arrayList14.clear();
                        q71Var.r = false;
                    }
                    q71Var.h = true;
                    q71Var.f = false;
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
                    if (q71Var.r) {
                        arrayList14.clear();
                        q71Var.r = false;
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
                        q71Var.h = true;
                    }
                    q71Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                u71 u71Var = (u71) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i45 = u71Var.b0;
                ai.d9 d9Var = u71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.i;
                    int size8 = arrayList17.size();
                    int i46 = i45;
                    int i47 = 0;
                    while (i47 < size8) {
                        Object obj9 = arrayList17.get(i47);
                        i47++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i48 = gb1.b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(gb1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i45;
                        J6.K(u71Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
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
                                org.telegram.ui.Components.i51 o9 = org.telegram.ui.Components.i51.o(i14, 34);
                                o9.u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                f91.b0((f91) this.b, (ArrayList) obj);
                break;
            case 27:
                r91 r91Var = (r91) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = r91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = r91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    break;
                }
                break;
            default:
                le1 le1Var = (le1) this.b;
                fh.b bVar4 = le1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                le1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                le1Var.v = paint2;
                Bitmap bitmap4 = le1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                le1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                le1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                le1Var.w = new Matrix();
                bVar4.a(bitmap3);
                gh.d.c(bVar4, le1Var.b);
                le1Var.F.d();
                break;
        }
    }
}
