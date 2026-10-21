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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        b91 b91Var;
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
                    org.telegram.ui.Components.h61 c10 = org.telegram.ui.Components.h61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.h61 c11 = org.telegram.ui.Components.h61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.h61.B(null));
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
                            org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.h61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(i12, m9Var, i9Var);
                        int i23 = g9.a;
                        org.telegram.ui.Components.h61 J2 = org.telegram.ui.Components.h61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.l0(i9Var.c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.h61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.h61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.h61.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                ie ieVar = (ie) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(ieVar.y0).getChat(Long.valueOf(-ieVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(ieVar.y0).getChatFull(-ieVar.z0);
                int i24 = chatFull != null ? chatFull.stats_dc : -1;
                if (ieVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.h61.g(ieVar.C0));
                    b91 b91Var2 = ieVar.o1;
                    if (b91Var2 == null || b91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.h61.h(5, i24, b91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.h61.A(-1, null));
                    }
                    b91 b91Var3 = ieVar.p1;
                    if (b91Var3 != null && !b91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.h61.h(2, i24, b91Var3));
                        arrayList4.add(org.telegram.ui.Components.h61.A(-2, charSequence));
                    }
                }
                if (ieVar.g1 && (b91Var = ieVar.q1) != null && !b91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.h61.h(2, i24, b91Var));
                    arrayList4.add(org.telegram.ui.Components.h61.A(-3, null));
                }
                if (ieVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.h61.u(ieVar.s1));
                    arrayList4.add(org.telegram.ui.Components.h61.u(ieVar.t1));
                    arrayList4.add(org.telegram.ui.Components.h61.u(ieVar.u1));
                    arrayList4.add(org.telegram.ui.Components.h61.A(-4, ieVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (ieVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.h61.k(ieVar.G0));
                        arrayList4.add(org.telegram.ui.Components.h61.A(-5, ieVar.D0));
                        int i25 = MessagesController.getInstance(ieVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i26 = ieVar.B0 < i25 ? i25 : 0;
                        if (i26 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(0, new ro0(i26, context, null, false));
                            yqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.h61 i27 = org.telegram.ui.Components.h61.i(1, string);
                        if (ieVar.B0 >= i25 && ieVar.m1) {
                            z10 = true;
                        }
                        i27.K(z10);
                        arrayList4.add(i27);
                        arrayList4.add(org.telegram.ui.Components.h61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (ieVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.h61.j(3, ieVar.M0));
                        arrayList4.add(org.telegram.ui.Components.h61.A(-6, ieVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(ieVar.y0).getChat(Long.valueOf(-ieVar.z0))) && MessagesController.getInstance(ieVar.y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, ieVar.x0), R.drawable.filled_earn_stars, io.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.h61.A(-7, null));
                }
                if (ieVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.h61.p(ieVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.h61.A(-10, null));
                    break;
                }
                break;
            case 3:
                ce ceVar = (ce) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ee eeVar = ceVar.f;
                int i28 = ceVar.d;
                if (i28 == 0) {
                    ArrayList arrayList6 = eeVar.n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i29 = ai.gd.a;
                        org.telegram.ui.Components.h61 J3 = org.telegram.ui.Components.h61.J(ai.gd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(eeVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.h61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h61.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i28 == 1) {
                    ArrayList arrayList7 = eeVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i30 = ai.gd.a;
                        org.telegram.ui.Components.h61 J4 = org.telegram.ui.Components.h61.J(ai.gd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(eeVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.h61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h61.o(arrayList5.size(), 7));
                        break;
                    }
                }
                break;
            case 4:
                io ioVar = (io) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ioVar.getClass();
                    org.telegram.ui.Components.xc.a0(ioVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(ioVar.k0);
                AndroidUtilities.removeFromParent(ioVar.h0);
                AndroidUtilities.removeFromParent(ioVar.j0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new cq((hr) this.b, i14), 1000L);
                break;
            case 6:
                ((n4.s) this.b).B(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                fs fsVar = (fs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = fsVar.getMessagesController().getUser(Long.valueOf(fsVar.H));
                arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.V));
                arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.b));
                arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.c));
                if (TextUtils.isEmpty(fsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.h61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (fsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.h61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.h61.B(null));
                }
                if (fsVar.I && fsVar.K) {
                    org.telegram.ui.Components.h61 i31 = org.telegram.ui.Components.h61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i31.K(fsVar.X);
                    arrayList8.add(i31);
                    arrayList8.add(org.telegram.ui.Components.h61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.d));
                i2.e.B(R.string.AddNotesInfo, arrayList8);
                if (fsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = fsVar.getMessagesController().getUserFull(fsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.x));
                    arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.h61.k(fsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.h61.B(null));
                    org.telegram.ui.Components.h61 e = org.telegram.ui.Components.h61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.h61.B(charSequence2));
                if (fsVar.Y) {
                    AndroidUtilities.runOnUIThread(new wr(fsVar, user, i15));
                    fsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new xr(fsVar, i15), 200L);
                    break;
                }
                break;
            case 8:
                et.a((et) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                at atVar = (at) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                et etVar = atVar.a;
                ct ctVar = etVar.l;
                if (ctVar != null) {
                    ctVar.t(charSequence3, TextUtils.join("", etVar.o), callback != null ? new org.telegram.ui.Components.qy(i12, atVar, callback) : null);
                    if (callback == null) {
                        etVar.p();
                        break;
                    }
                }
                break;
            case 10:
                qt.S((qt) this.b, (ArrayList) obj);
                break;
            case 11:
                cy cyVar = (cy) this.b;
                cyVar.P1 = (Long) obj;
                cyVar.S4();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final uy uyVar = (uy) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i32 = R.raw.topics_top;
                org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(2);
                h61Var.l = string2;
                h61Var.k = i32;
                arrayList9.add(h61Var);
                org.telegram.ui.Components.h61 i33 = org.telegram.ui.Components.h61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i33.K(uyVar.c);
                arrayList9.add(i33);
                if (uyVar.c) {
                    arrayList9.add(org.telegram.ui.Components.h61.B(null));
                    arrayList9.add(org.telegram.ui.Components.h61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.qy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    ty tyVar = (ty) view.getParent();
                                    uy uyVar2 = uyVar;
                                    uyVar2.d = true;
                                    tyVar.a(true, true);
                                    ai.r5 r5Var = uyVar2.f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(uyVar2.c), Boolean.valueOf(uyVar2.d));
                                    }
                                    uyVar2.U();
                                    break;
                                default:
                                    ty tyVar2 = (ty) view.getParent();
                                    uy uyVar3 = uyVar;
                                    uyVar3.d = false;
                                    tyVar2.a(false, true);
                                    ai.r5 r5Var2 = uyVar3.f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(uyVar3.c), Boolean.valueOf(uyVar3.d));
                                    }
                                    uyVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.qy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    ty tyVar = (ty) view.getParent();
                                    uy uyVar2 = uyVar;
                                    uyVar2.d = true;
                                    tyVar.a(true, true);
                                    ai.r5 r5Var = uyVar2.f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(uyVar2.c), Boolean.valueOf(uyVar2.d));
                                    }
                                    uyVar2.U();
                                    break;
                                default:
                                    ty tyVar2 = (ty) view.getParent();
                                    uy uyVar3 = uyVar;
                                    uyVar3.d = false;
                                    tyVar2.a(false, true);
                                    ai.r5 r5Var2 = uyVar3.f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(uyVar3.c), Boolean.valueOf(uyVar3.d));
                                    }
                                    uyVar3.U();
                                    break;
                            }
                        }
                    };
                    int i34 = sy.a;
                    org.telegram.ui.Components.h61 J5 = org.telegram.ui.Components.h61.J(sy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(uyVar.d);
                    arrayList9.add(J5);
                    i2.e.B(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                ib0 ib0Var = (ib0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ib0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ib0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.g0.q(R.string.AIEditorStyleNotFound, ib0.d(), R.raw.error, 36);
                        break;
                    } else {
                        ib0.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                qv0 qv0Var = (qv0) this.b;
                gh.b bVar2 = qv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                qv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                qv0Var.w = paint;
                Bitmap bitmap2 = qv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                qv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                qv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                qv0Var.x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, qv0Var.c);
                qv0Var.G.d();
                break;
            case 16:
                xv0 xv0Var = (xv0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i35 = R.raw.bubble;
                org.telegram.ui.Components.h61 h61Var2 = new org.telegram.ui.Components.h61(2);
                h61Var2.l = string3;
                h61Var2.k = i35;
                arrayList10.add(h61Var2);
                org.telegram.ui.Components.h61 i36 = org.telegram.ui.Components.h61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i36.K(xv0Var.r);
                arrayList10.add(i36);
                arrayList10.add(org.telegram.ui.Components.h61.A(2, null));
                if (xv0Var.r) {
                    i2.e.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) xv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    fk0 fk0Var = new fk0(i13);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.c = a2;
                    x7Var.d = 20;
                    x7Var.e = fk0Var;
                    xv0Var.b.d((int) Utilities.clamp(xv0Var.s, 10000L, 0L), x7Var, new v3(xv0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.h61.j(3, xv0Var.b));
                    arrayList10.add(org.telegram.ui.Components.h61.A(4, xv0Var.s > 0 ? xv0Var.W() : null));
                    TLRPC.Chat chat3 = xv0Var.getMessagesController().getChat(Long.valueOf(xv0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        xv0Var.c.setLink(xv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.e.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.h61.j(5, xv0Var.c));
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
                gh.b bVar3 = profileActivity.t6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.u6.d();
                break;
            case 19:
                n21 n21Var = (n21) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var = n21Var.f;
                o21 o21Var = n21Var.v;
                ArrayList arrayList12 = o21Var.h;
                ai.o5 o5Var = n21Var.h;
                if (o5Var.getMeasuredHeight() <= 0) {
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.h61 C = org.telegram.ui.Components.h61.C(o5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((o5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = n21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || n21Var.c != null || n21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || n21Var.c != null) {
                        Context context2 = n21Var.getContext();
                        int i37 = org.telegram.ui.ActionBar.h6.L6;
                        d6Var = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2, i37, 21, 0, 0, false, false, d6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = n21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = n21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(o21Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5));
                        org.telegram.ui.Components.h61 k10 = org.telegram.ui.Components.h61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (n21Var.b != null) {
                        for (int i38 = 0; i38 < n21Var.b.options.size(); i38++) {
                            org.telegram.ui.Components.h61 h61Var3 = new org.telegram.ui.Components.h61(30);
                            h61Var3.l = n21Var.b.options.get(i38).text;
                            h61Var3.k = R.drawable.msg_arrowright;
                            h61Var3.d = i38;
                            arrayList11.add(h61Var3);
                            measuredHeight += 50;
                        }
                    } else if (n21Var.c != null) {
                        for (int i39 = 0; i39 < n21Var.c.options.size(); i39++) {
                            org.telegram.ui.Components.h61 h61Var4 = new org.telegram.ui.Components.h61(30);
                            h61Var4.l = n21Var.c.options.get(i39).text;
                            h61Var4.k = R.drawable.msg_arrowright;
                            h61Var4.d = i39;
                            arrayList11.add(h61Var4);
                            measuredHeight += 50;
                        }
                    } else if (n21Var.d != null) {
                        if (n21Var.n == null) {
                            Context context3 = n21Var.getContext();
                            d6Var5 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                            m21 m21Var = new m21(n21Var, context3, d6Var5);
                            n21Var.n = m21Var;
                            m21Var.setShowLimitWhenNear(100);
                        }
                        n21Var.n.b.setHint(LocaleController.getString(n21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.h61 k11 = org.telegram.ui.Components.h61.k(n21Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = o21Var.r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.f3) o21Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        i2.e.B(i11, arrayList11);
                        if (n21Var.r == null) {
                            Context context4 = n21Var.getContext();
                            d6Var2 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                            ei.d dVar = new ei.d(context4, d6Var2, true);
                            n21Var.s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(n21Var.getContext());
                            n21Var.r = frameLayout;
                            int i40 = org.telegram.ui.ActionBar.h6.h5;
                            d6Var3 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i40, d6Var3));
                            n21Var.r.addView(n21Var.s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(n21Var.getContext());
                            int i41 = org.telegram.ui.ActionBar.h6.d7;
                            d6Var4 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i41, d6Var4));
                            n21Var.r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        n21Var.s.setEnabled(n21Var.d.optional || !TextUtils.isEmpty(n21Var.n.getText()));
                        n21Var.s.setOnClickListener(new s50(n21Var, 27));
                        org.telegram.ui.Components.h61 k12 = org.telegram.ui.Components.h61.k(n21Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.h61) i2.e.h(1, arrayList11)).j = true;
                    if (o21Var.d && n21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(n21Var.getContext());
                        Context context5 = n21Var.getContext();
                        int i42 = R.drawable.greydivider;
                        int i43 = org.telegram.ui.ActionBar.h6.b7;
                        d6Var6 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(o21Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7)), org.telegram.ui.ActionBar.h6.V0(context5, i42, org.telegram.ui.ActionBar.h6.w0(i43, d6Var6)), 0, 0);
                        zqVar.w = true;
                        frameLayout2.setBackground(zqVar);
                        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(n21Var.getContext(), null);
                        x90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        d6Var7 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                        x90Var.setText(AndroidUtilities.replaceLinks(string4, d6Var7));
                        int i44 = org.telegram.ui.ActionBar.h6.A6;
                        d6Var8 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
                        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i44, d6Var8));
                        x90Var.setGravity(17);
                        frameLayout2.addView(x90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.h61 k13 = org.telegram.ui.Components.h61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (c71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) o21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        c71Var.V2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        c71Var.V2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.h61.k(((t21) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.h61.k(((h31) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                h61.R((h61) this.b, (ArrayList) obj);
                break;
            case 24:
                g61 g61Var = (g61) this.b;
                ArrayList arrayList13 = g61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i45 = g61Var.a;
                ArrayList arrayList14 = g61Var.d;
                if (tL_error3 != null) {
                    if (g61Var.r) {
                        arrayList14.clear();
                        g61Var.r = false;
                    }
                    g61Var.h = true;
                    g61Var.f = false;
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
                    if (g61Var.r) {
                        arrayList14.clear();
                        g61Var.r = false;
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
                        g61Var.h = true;
                    }
                    g61Var.f = false;
                    int size7 = arrayList13.size();
                    while (i18 < size7) {
                        Object obj8 = arrayList13.get(i18);
                        i18++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                k61 k61Var = (k61) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i47 = k61Var.b0;
                ci.a7 a7Var = k61Var.Z;
                if (a7Var != null) {
                    arrayList16.add(org.telegram.ui.Components.h61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = a7Var.i;
                    int size8 = arrayList17.size();
                    int i48 = i47;
                    int i49 = 0;
                    while (i49 < size8) {
                        Object obj9 = arrayList17.get(i49);
                        i49++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i50 = w91.b;
                        org.telegram.ui.Components.h61 J6 = org.telegram.ui.Components.h61.J(w91.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i47;
                        J6.K(k61Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
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
                                org.telegram.ui.Components.h61 o10 = org.telegram.ui.Components.h61.o(i16, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.h61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                x71.b0((x71) this.b, (ArrayList) obj);
                break;
            case 27:
                h81 h81Var = (h81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = h81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.h61.k(linearLayout));
                }
                LinearLayout linearLayout2 = h81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.h61.k(linearLayout2));
                    break;
                }
                break;
            default:
                yc1 yc1Var = (yc1) this.b;
                gh.b bVar4 = yc1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                yc1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                yc1Var.v = paint2;
                Bitmap bitmap4 = yc1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                yc1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                yc1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                yc1Var.w = new Matrix();
                bVar4.a(bitmap3);
                hh.d.c(bVar4, yc1Var.b);
                yc1Var.F.d();
                break;
        }
    }
}
