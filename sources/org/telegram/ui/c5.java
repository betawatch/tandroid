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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        fa1 fa1Var;
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
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                d5 d5Var = (d5) this.b;
                d5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                d5Var.w = false;
                fh.b bVar = d5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, d5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                m9 m9Var = (m9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = m9Var.J.isEmpty();
                ArrayList arrayList2 = m9Var.F;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.h61 c13 = org.telegram.ui.Components.h61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c13.q = true;
                    arrayList.add(c13);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.h61 c14 = org.telegram.ui.Components.h61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c14.q = true;
                        arrayList.add(c14);
                    }
                    arrayList.add(org.telegram.ui.Components.h61.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = m9Var.J;
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, i12);
                            int i14 = k9.a;
                            org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(k9.class);
                            K.G = chat;
                            K.D = p8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.h61.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i12 < size2) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        i9 i9Var = (i9) obj4;
                        ai.f2 f2Var = new ai.f2(27, m9Var, i9Var);
                        int i15 = g9.a;
                        org.telegram.ui.Components.h61 K2 = org.telegram.ui.Components.h61.K(g9.class);
                        K2.G = i9Var;
                        K2.D = f2Var;
                        K2.L(m9Var.f0(i9Var.c));
                        arrayList.add(K2);
                    }
                    if (!m9Var.I) {
                        arrayList.add(org.telegram.ui.Components.h61.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.h61.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.h61.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                me meVar = (me) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                meVar.R0 = -1;
                TLRPC.Chat chat2 = MessagesController.getInstance(meVar.o0).getChat(Long.valueOf(-meVar.p0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(meVar.o0).getChatFull(-meVar.p0);
                int i16 = chatFull != null ? chatFull.stats_dc : -1;
                if (meVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.h61.g(meVar.s0));
                    fa1 fa1Var2 = meVar.l1;
                    if (fa1Var2 == null || fa1Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.h61.h(5, i16, fa1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.h61.B(-1, null));
                    }
                    fa1 fa1Var3 = meVar.m1;
                    if (fa1Var3 != null && !fa1Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.h61.h(2, i16, fa1Var3));
                        arrayList4.add(org.telegram.ui.Components.h61.B(-2, charSequence));
                    }
                }
                if (meVar.c1 && (fa1Var = meVar.n1) != null && !fa1Var.l) {
                    arrayList4.add(org.telegram.ui.Components.h61.h(2, i16, fa1Var));
                    arrayList4.add(org.telegram.ui.Components.h61.B(-3, null));
                }
                if (meVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.h61.v(meVar.p1));
                    arrayList4.add(org.telegram.ui.Components.h61.v(meVar.q1));
                    arrayList4.add(org.telegram.ui.Components.h61.v(meVar.r1));
                    arrayList4.add(org.telegram.ui.Components.h61.B(-4, meVar.u0));
                }
                if (chat2 != null && chat2.creator) {
                    if (meVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.h61.k(meVar.w0));
                        arrayList4.add(org.telegram.ui.Components.h61.B(-5, meVar.t0));
                        int i17 = MessagesController.getInstance(meVar.o0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i18 = meVar.r0 < i17 ? i17 : 0;
                        if (i18 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(0, new fp0(i18, context, null, false));
                            rqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(rqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.h61 i19 = org.telegram.ui.Components.h61.i(1, string);
                        i19.L(meVar.r0 >= i17 && meVar.j1);
                        arrayList4.add(i19);
                        arrayList4.add(org.telegram.ui.Components.h61.B(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (meVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.h61.j(3, meVar.C0));
                        arrayList4.add(org.telegram.ui.Components.h61.B(-6, meVar.v0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(meVar.o0).getChat(Long.valueOf(-meVar.p0))) && MessagesController.getInstance(meVar.o0).starrefConnectAllowed) {
                    arrayList4.add(ei.i.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, meVar.n0), R.drawable.filled_earn_stars, to.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.h61.B(-7, null));
                }
                if (meVar.a1.a()) {
                    meVar.R0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.h61.n(meVar.T0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.h61.B(-10, null));
                    break;
                }
                break;
            case 3:
                ge geVar = (ge) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ie ieVar = geVar.f;
                int i20 = geVar.d;
                int i21 = ie.x;
                ArrayList arrayList6 = i20 == 0 ? ieVar.r : ieVar.n;
                int size3 = arrayList6.size();
                while (i12 < size3) {
                    Object obj5 = arrayList6.get(i12);
                    i12++;
                    int i22 = yh.s7.a;
                    org.telegram.ui.Components.h61 K3 = org.telegram.ui.Components.h61.K(yh.s7.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.q = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i20 == 0 ? ieVar.s : ieVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.h61.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.h61.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.h61.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                to toVar = (to) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    toVar.getClass();
                    org.telegram.ui.Components.yc.a0(toVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(toVar.k0);
                AndroidUtilities.removeFromParent(toVar.h0);
                AndroidUtilities.removeFromParent(toVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new nq((rr) this.b, c10 == true ? 1 : 0), 1000L);
                break;
            case 6:
                ((of.b) this.b).J(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                qs qsVar = (qs) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.V));
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.b));
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.c));
                if (TextUtils.isEmpty(qsVar.c0())) {
                    arrayList7.add(org.telegram.ui.Components.h61.C(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (qsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.h61.C(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.h61.C(null));
                }
                if (qsVar.I && qsVar.K) {
                    org.telegram.ui.Components.h61 i23 = org.telegram.ui.Components.h61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i23.L(qsVar.X);
                    arrayList7.add(i23);
                    arrayList7.add(org.telegram.ui.Components.h61.C(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.d));
                hg.c.n(R.string.AddNotesInfo, arrayList7);
                if (qsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.x));
                    arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.E));
                    }
                    charSequence2 = null;
                    arrayList7.add(org.telegram.ui.Components.h61.C(null));
                    org.telegram.ui.Components.h61 e7 = org.telegram.ui.Components.h61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.r = true;
                    arrayList7.add(e7);
                }
                arrayList7.add(org.telegram.ui.Components.h61.C(charSequence2));
                if (qsVar.Y) {
                    AndroidUtilities.runOnUIThread(new hs(qsVar, user, i12));
                    qsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new is(qsVar, i12), 200L);
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
                    ptVar.f(charSequence3, TextUtils.join("", rtVar.o), callback != null ? new ft(c11 == true ? 1 : 0, ntVar, callback) : null);
                    if (callback == null) {
                        rtVar.p();
                        break;
                    }
                }
                break;
            case 10:
                du.P((du) this.b, (ArrayList) obj);
                break;
            case 11:
                uy uyVar = (uy) this.b;
                uyVar.P1 = (Long) obj;
                uyVar.d5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final mz mzVar = (mz) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i24 = R.raw.topics_top;
                org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(2);
                h61Var.l = string2;
                h61Var.k = i24;
                arrayList8.add(h61Var);
                org.telegram.ui.Components.h61 i25 = org.telegram.ui.Components.h61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i25.L(mzVar.c);
                arrayList8.add(i25);
                if (mzVar.c) {
                    arrayList8.add(org.telegram.ui.Components.h61.C(null));
                    arrayList8.add(org.telegram.ui.Components.h61.u(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.iz
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
                                    mzVar2.S();
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
                                    mzVar3.S();
                                    break;
                            }
                        }
                    };
                    final char c15 = c12 == true ? 1 : 0;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.iz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (c15) {
                                case 0:
                                    lz lzVar = (lz) view.getParent();
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    lzVar.a(true, true);
                                    ai.m0 m0Var = mzVar2.f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.S();
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
                                    mzVar3.S();
                                    break;
                            }
                        }
                    };
                    int i26 = kz.a;
                    org.telegram.ui.Components.h61 K4 = org.telegram.ui.Components.h61.K(kz.class);
                    K4.d = 2;
                    K4.G = onClickListener;
                    K4.H = onClickListener2;
                    K4.L(mzVar.d);
                    arrayList8.add(K4);
                    hg.c.n(R.string.TopicsLayoutInfo, arrayList8);
                    break;
                }
                break;
            case 14:
                dc0 dc0Var = (dc0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                dc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(dc0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.q.p(R.string.AIEditorStyleNotFound, dc0.b(), R.raw.error, 36);
                        break;
                    } else {
                        dc0.b().d0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                gw0 gw0Var = (gw0) this.b;
                fh.b bVar2 = gw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                gw0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                gw0Var.w = paint;
                Bitmap bitmap2 = gw0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                gw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                gw0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                gw0Var.x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, gw0Var.c);
                gw0Var.G.d();
                break;
            case 16:
                nw0 nw0Var = (nw0) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i27 = R.raw.bubble;
                org.telegram.ui.Components.h61 h61Var2 = new org.telegram.ui.Components.h61(2);
                h61Var2.l = string3;
                h61Var2.k = i27;
                arrayList9.add(h61Var2);
                org.telegram.ui.Components.h61 i28 = org.telegram.ui.Components.h61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i28.L(nw0Var.r);
                arrayList9.add(i28);
                arrayList9.add(org.telegram.ui.Components.h61.B(2, null));
                if (nw0Var.r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList9);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) nw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.e1 e1Var = new org.telegram.ui.Components.voip.e1(20);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.c = a2;
                    y7Var.d = 20;
                    y7Var.e = e1Var;
                    nw0Var.b.d((int) Utilities.clamp(nw0Var.s, 10000L, 0L), y7Var, new t3(nw0Var, 18));
                    arrayList9.add(org.telegram.ui.Components.h61.j(3, nw0Var.b));
                    arrayList9.add(org.telegram.ui.Components.h61.B(4, nw0Var.s > 0 ? nw0Var.U() : null));
                    TLRPC.Chat chat3 = nw0Var.getMessagesController().getChat(Long.valueOf(nw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        nw0Var.c.setLink(nw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList9);
                        arrayList9.add(org.telegram.ui.Components.h61.j(5, nw0Var.c));
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
                s31 s31Var = (s31) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.e71 e71Var = s31Var.f;
                t31 t31Var = s31Var.v;
                ArrayList arrayList11 = t31Var.h;
                u5 u5Var = s31Var.h;
                if (u5Var.getMeasuredHeight() <= 0) {
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.h61 D = org.telegram.ui.Components.h61.D(u5Var.getMeasuredHeight());
                D.d = -1;
                D.s = true;
                arrayList10.add(D);
                int measuredHeight = (int) ((u5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = s31Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || s31Var.c != null || s31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || s31Var.c != null) {
                        Context context2 = s31Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.i6.L6;
                        d6Var = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i29, 21, 0, 0, false, false, d6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = s31Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = s31Var.c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(t31Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
                        org.telegram.ui.Components.h61 k10 = org.telegram.ui.Components.h61.k(m4Var);
                        k10.d = -2;
                        arrayList10.add(k10);
                        measuredHeight += 40;
                    }
                    if (s31Var.b != null) {
                        for (int i30 = 0; i30 < s31Var.b.options.size(); i30++) {
                            org.telegram.ui.Components.h61 h61Var3 = new org.telegram.ui.Components.h61(30);
                            h61Var3.l = s31Var.b.options.get(i30).text;
                            h61Var3.k = R.drawable.msg_arrowright;
                            h61Var3.d = i30;
                            arrayList10.add(h61Var3);
                            measuredHeight += 50;
                        }
                    } else if (s31Var.c != null) {
                        for (int i31 = 0; i31 < s31Var.c.options.size(); i31++) {
                            org.telegram.ui.Components.h61 h61Var4 = new org.telegram.ui.Components.h61(30);
                            h61Var4.l = s31Var.c.options.get(i31).text;
                            h61Var4.k = R.drawable.msg_arrowright;
                            h61Var4.d = i31;
                            arrayList10.add(h61Var4);
                            measuredHeight += 50;
                        }
                    } else if (s31Var.d != null) {
                        if (s31Var.n == null) {
                            Context context3 = s31Var.getContext();
                            d6Var5 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                            r31 r31Var = new r31(s31Var, context3, d6Var5);
                            s31Var.n = r31Var;
                            r31Var.setShowLimitWhenNear(100);
                        }
                        s31Var.n.b.setHint(LocaleController.getString(s31Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.h61 k11 = org.telegram.ui.Components.h61.k(s31Var.n);
                        k11.d = -3;
                        arrayList10.add(k11);
                        long j3 = t31Var.r;
                        if (arrayList11 != null && !arrayList11.isEmpty()) {
                            i11 = arrayList11.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j3)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.f3) t31Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        hg.c.n(i11, arrayList10);
                        if (s31Var.r == null) {
                            Context context4 = s31Var.getContext();
                            d6Var2 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                            ci.d dVar = new ci.d(context4, d6Var2, true);
                            s31Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(s31Var.getContext());
                            s31Var.r = frameLayout;
                            int i32 = org.telegram.ui.ActionBar.i6.h5;
                            d6Var3 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i32, d6Var3));
                            s31Var.r.addView(s31Var.s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(s31Var.getContext());
                            int i33 = org.telegram.ui.ActionBar.i6.d7;
                            d6Var4 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i33, d6Var4));
                            s31Var.r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        s31Var.s.setEnabled(s31Var.d.optional || !TextUtils.isEmpty(s31Var.n.getText()));
                        s31Var.s.setOnClickListener(new j60(s31Var, 28));
                        org.telegram.ui.Components.h61 k12 = org.telegram.ui.Components.h61.k(s31Var.r);
                        k12.d = -4;
                        arrayList10.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.h61) hg.c.g(1, arrayList10)).j = true;
                    if (t31Var.d && s31Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(s31Var.getContext());
                        Context context5 = s31Var.getContext();
                        int i34 = R.drawable.greydivider;
                        int i35 = org.telegram.ui.ActionBar.i6.b7;
                        d6Var6 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(t31Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7)), org.telegram.ui.ActionBar.i6.U0(context5, i34, org.telegram.ui.ActionBar.i6.v0(i35, d6Var6)), 0, 0);
                        sqVar.w = true;
                        frameLayout2.setBackground(sqVar);
                        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(s31Var.getContext(), null);
                        q90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        d6Var7 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                        q90Var.setText(AndroidUtilities.replaceLinks(string4, d6Var7));
                        int i36 = org.telegram.ui.ActionBar.i6.A6;
                        d6Var8 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
                        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i36, d6Var8));
                        q90Var.setGravity(17);
                        frameLayout2.addView(q90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.h61 k13 = org.telegram.ui.Components.h61.k(frameLayout2);
                        k13.d = -3;
                        arrayList10.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) t31Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        e71Var.e3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList10);
                        e71Var.e3.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.h61.k(((z31) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.h61.k(((m41) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                k71.O((k71) this.b, (ArrayList) obj);
                break;
            case 24:
                j71 j71Var = (j71) this.b;
                ArrayList arrayList12 = j71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i37 = j71Var.a;
                ArrayList arrayList13 = j71Var.d;
                if (tL_error3 != null) {
                    if (j71Var.r) {
                        arrayList13.clear();
                        j71Var.r = false;
                    }
                    j71Var.h = true;
                    j71Var.f = false;
                    int size4 = arrayList12.size();
                    while (i12 < size4) {
                        Object obj6 = arrayList12.get(i12);
                        i12++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i37).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i37).putChats(channels_channelparticipants.chats, false);
                    if (j71Var.r) {
                        arrayList13.clear();
                        j71Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList14 = channels_channelparticipants.participants;
                    int size5 = arrayList14.size();
                    int i38 = 0;
                    while (i38 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList14.get(i38);
                        i38++;
                        TLObject userOrChat = MessagesController.getInstance(i37).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList13.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        j71Var.h = true;
                    }
                    j71Var.f = false;
                    int size6 = arrayList12.size();
                    while (i12 < size6) {
                        Object obj7 = arrayList12.get(i12);
                        i12++;
                        ((Runnable) obj7).run();
                    }
                    break;
                }
            case 25:
                n71 n71Var = (n71) this.b;
                ArrayList arrayList15 = (ArrayList) obj;
                int i39 = n71Var.b0;
                ai.d9 d9Var = n71Var.Z;
                if (d9Var != null) {
                    arrayList15.add(org.telegram.ui.Components.h61.D(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList16 = d9Var.i;
                    int size7 = arrayList16.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size7) {
                        Object obj8 = arrayList16.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj8;
                        int i42 = ab1.b;
                        org.telegram.ui.Components.h61 K5 = org.telegram.ui.Components.h61.K(ab1.class);
                        K5.u = 1;
                        K5.z = 0;
                        K5.G = messageObject;
                        K5.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        K5.f = true;
                        K5.v = i39;
                        K5.L(n71Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        K5.u = 1;
                        arrayList15.add(K5);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (d9Var.k() || !d9Var.r) {
                        while (true) {
                            if (i12 < (i40 <= 0 ? i39 : i40)) {
                                i12++;
                                org.telegram.ui.Components.h61 q6 = org.telegram.ui.Components.h61.q(i12, 34);
                                q6.u = 1;
                                arrayList15.add(q6);
                            }
                        }
                    }
                    arrayList15.add(org.telegram.ui.Components.h61.D(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                y81.c0((y81) this.b, (ArrayList) obj);
                break;
            case 27:
                k91 k91Var = (k91) this.b;
                ArrayList arrayList17 = (ArrayList) obj;
                LinearLayout linearLayout = k91Var.Y;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.h61.k(linearLayout));
                }
                LinearLayout linearLayout2 = k91Var.Z;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.h61.k(linearLayout2));
                    break;
                }
                break;
            default:
                ee1 ee1Var = (ee1) this.b;
                fh.b bVar4 = ee1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                ee1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ee1Var.v = paint2;
                Bitmap bitmap4 = ee1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                ee1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                ee1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ee1Var.w = new Matrix();
                bVar4.a(bitmap3);
                gh.d.c(bVar4, ee1Var.b);
                ee1Var.F.d();
                break;
        }
    }
}
