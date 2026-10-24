package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        g91 g91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        org.telegram.ui.ActionBar.g6 g6Var7;
        org.telegram.ui.ActionBar.g6 g6Var8;
        org.telegram.ui.ActionBar.g6 g6Var9;
        org.telegram.ui.ActionBar.g6 g6Var10;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        int i12 = 7;
        final int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        r9 = false;
        boolean z10 = false;
        final int i19 = 1;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.w = false;
                gh.b bVar = g5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, g5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
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
                    org.telegram.ui.Components.m61 c10 = org.telegram.ui.Components.m61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.m61 c11 = org.telegram.ui.Components.m61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.m61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = m9Var.K;
                    int size = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj3 = arrayList3.get(i20);
                        i20++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, i13);
                            int i21 = k9.a;
                            org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.m61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(i12, m9Var, i9Var);
                        int i22 = g9.a;
                        org.telegram.ui.Components.m61 J2 = org.telegram.ui.Components.m61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.k0(i9Var.c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.m61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.m61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.m61.o(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                ie ieVar = (ie) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                TLRPC.Chat chat2 = MessagesController.getInstance(ieVar.y0).getChat(Long.valueOf(-ieVar.z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(ieVar.y0).getChatFull(-ieVar.z0);
                int i23 = chatFull != null ? chatFull.stats_dc : -1;
                if (ieVar.f1) {
                    arrayList4.add(org.telegram.ui.Components.m61.g(ieVar.C0));
                    g91 g91Var2 = ieVar.o1;
                    if (g91Var2 == null || g91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.m61.h(5, i23, g91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.m61.A(-1, null));
                    }
                    g91 g91Var3 = ieVar.p1;
                    if (g91Var3 != null && !g91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.m61.h(2, i23, g91Var3));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-2, charSequence));
                    }
                }
                if (ieVar.g1 && (g91Var = ieVar.q1) != null && !g91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.m61.h(2, i23, g91Var));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-3, null));
                }
                if (ieVar.r1) {
                    arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.m61.u(ieVar.s1));
                    arrayList4.add(org.telegram.ui.Components.m61.u(ieVar.t1));
                    arrayList4.add(org.telegram.ui.Components.m61.u(ieVar.u1));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-4, ieVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (ieVar.f1) {
                        arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.m61.k(ieVar.G0));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-5, ieVar.D0));
                        int i24 = MessagesController.getInstance(ieVar.y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i25 = ieVar.B0 < i24 ? i24 : 0;
                        if (i25 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(0, new uo0(i25, context, null, false));
                            xqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(xqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.m61 i26 = org.telegram.ui.Components.m61.i(1, string);
                        if (ieVar.B0 >= i24 && ieVar.m1) {
                            z10 = true;
                        }
                        i26.K(z10);
                        arrayList4.add(i26);
                        arrayList4.add(org.telegram.ui.Components.m61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (ieVar.g1) {
                        arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.m61.j(3, ieVar.M0));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-6, ieVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(ieVar.y0).getChat(Long.valueOf(-ieVar.z0))) && MessagesController.getInstance(ieVar.y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, ieVar.x0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-7, null));
                }
                if (ieVar.e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.m61.p(ieVar.e1, AndroidUtilities.dp(24.0f), true));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.m61.A(-10, null));
                    break;
                }
                break;
            case 3:
                ce ceVar = (ce) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ee eeVar = ceVar.f;
                int i27 = ceVar.d;
                if (i27 == 0) {
                    ArrayList arrayList6 = eeVar.n;
                    int size3 = arrayList6.size();
                    while (i17 < size3) {
                        Object obj5 = arrayList6.get(i17);
                        i17++;
                        int i28 = ai.hd.a;
                        org.telegram.ui.Components.m61 J3 = org.telegram.ui.Components.m61.J(ai.hd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(eeVar.r)) {
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        break;
                    }
                } else if (i27 == 1) {
                    ArrayList arrayList7 = eeVar.h;
                    int size4 = arrayList7.size();
                    while (i18 < size4) {
                        Object obj6 = arrayList7.get(i18);
                        i18++;
                        int i29 = ai.hd.a;
                        org.telegram.ui.Components.m61 J4 = org.telegram.ui.Components.m61.J(ai.hd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(eeVar.f)) {
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
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
                AndroidUtilities.removeFromParent(koVar.j0);
                AndroidUtilities.removeFromParent(koVar.g0);
                AndroidUtilities.removeFromParent(koVar.i0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new eq((jr) this.b, i19), 1000L);
                break;
            case 6:
                ((n4.s) this.b).A(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                hs hsVar = (hs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.V));
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.b));
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.c));
                if (TextUtils.isEmpty(hsVar.b0())) {
                    arrayList8.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.m61.B(null));
                }
                if (hsVar.I && hsVar.K) {
                    org.telegram.ui.Components.m61 i30 = org.telegram.ui.Components.m61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i30.K(hsVar.X);
                    arrayList8.add(i30);
                    arrayList8.add(org.telegram.ui.Components.m61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.d));
                i2.o1.B(R.string.AddNotesInfo, arrayList8);
                if (hsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.x));
                    arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.m61.B(null));
                    org.telegram.ui.Components.m61 e = org.telegram.ui.Components.m61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList8.add(e);
                }
                arrayList8.add(org.telegram.ui.Components.m61.B(charSequence2));
                if (hsVar.Y) {
                    AndroidUtilities.runOnUIThread(new zr(hsVar, user, i13));
                    hsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new xr(hsVar, i19), 200L);
                    break;
                }
                break;
            case 8:
                ht.a((ht) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                dt dtVar = (dt) this.b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.a;
                ft ftVar = htVar.l;
                if (ftVar != null) {
                    ftVar.t(charSequence3, TextUtils.join("", htVar.o), callback != null ? new org.telegram.ui.Components.qy(i12, dtVar, callback) : null);
                    if (callback == null) {
                        htVar.n();
                        break;
                    }
                }
                break;
            case 10:
                tt.R((tt) this.b, (ArrayList) obj);
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
                int i31 = R.raw.topics_top;
                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(2);
                m61Var.l = string2;
                m61Var.k = i31;
                arrayList9.add(m61Var);
                org.telegram.ui.Components.m61 i32 = org.telegram.ui.Components.m61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i32.K(wyVar.c);
                arrayList9.add(i32);
                if (wyVar.c) {
                    arrayList9.add(org.telegram.ui.Components.m61.B(null));
                    arrayList9.add(org.telegram.ui.Components.m61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.sy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    vy vyVar = (vy) view.getParent();
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    vyVar.a(true, true);
                                    ai.r5 r5Var = wyVar2.f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(wyVar2.c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    break;
                                default:
                                    vy vyVar2 = (vy) view.getParent();
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    vyVar2.a(false, true);
                                    ai.r5 r5Var2 = wyVar3.f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(wyVar3.c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.sy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    vy vyVar = (vy) view.getParent();
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    vyVar.a(true, true);
                                    ai.r5 r5Var = wyVar2.f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(wyVar2.c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    break;
                                default:
                                    vy vyVar2 = (vy) view.getParent();
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    vyVar2.a(false, true);
                                    ai.r5 r5Var2 = wyVar3.f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(wyVar3.c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    break;
                            }
                        }
                    };
                    int i33 = uy.a;
                    org.telegram.ui.Components.m61 J5 = org.telegram.ui.Components.m61.J(uy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(wyVar.d);
                    arrayList9.add(J5);
                    i2.o1.B(R.string.TopicsLayoutInfo, arrayList9);
                    break;
                }
                break;
            case 14:
                ob0 ob0Var = (ob0) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ob0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ob0Var.b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.v0.p(R.string.AIEditorStyleNotFound, ob0.d(), R.raw.error, 36);
                        break;
                    } else {
                        ob0.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                uv0 uv0Var = (uv0) this.b;
                gh.b bVar2 = uv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                uv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                uv0Var.w = paint;
                Bitmap bitmap2 = uv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                uv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                uv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                uv0Var.x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, uv0Var.c);
                uv0Var.G.d();
                break;
            case 16:
                bw0 bw0Var = (bw0) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i34 = R.raw.bubble;
                org.telegram.ui.Components.m61 m61Var2 = new org.telegram.ui.Components.m61(2);
                m61Var2.l = string3;
                m61Var2.k = i34;
                arrayList10.add(m61Var2);
                org.telegram.ui.Components.m61 i35 = org.telegram.ui.Components.m61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i35.K(bw0Var.s);
                arrayList10.add(i35);
                arrayList10.add(org.telegram.ui.Components.m61.A(2, null));
                if (bw0Var.s) {
                    i2.o1.q(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) bw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    wv wvVar = new wv(15);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.c = a2;
                    x7Var.d = 20;
                    x7Var.e = wvVar;
                    bw0Var.b.d((int) Utilities.clamp(bw0Var.v, 10000L, 0L), x7Var, new u3(bw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.m61.j(3, bw0Var.b));
                    arrayList10.add(org.telegram.ui.Components.m61.A(4, bw0Var.v > 0 ? bw0Var.W() : null));
                    TLRPC.Chat chat3 = bw0Var.getMessagesController().getChat(Long.valueOf(bw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        bw0Var.c.setLink(bw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.o1.q(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.m61.j(5, bw0Var.c));
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
                gh.b bVar3 = profileActivity.w6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.x6.d();
                break;
            case 19:
                r21 r21Var = (r21) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.j71 j71Var = r21Var.f;
                s21 s21Var = r21Var.v;
                ArrayList arrayList12 = s21Var.n;
                ai.o5 o5Var = r21Var.h;
                if (o5Var.getMeasuredHeight() <= 0) {
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.m61 C = org.telegram.ui.Components.m61.C(o5Var.getMeasuredHeight());
                C.d = -1;
                C.s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((o5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = r21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || r21Var.c != null || r21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || r21Var.c != null) {
                        Context context2 = r21Var.getContext();
                        int i36 = org.telegram.ui.ActionBar.k6.L6;
                        g6Var = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2, i36, 21, 0, 0, false, false, g6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = r21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = r21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        int i37 = org.telegram.ui.ActionBar.k6.h5;
                        g6Var2 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.i(i37, l4Var, g6Var2);
                        org.telegram.ui.Components.m61 k10 = org.telegram.ui.Components.m61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (r21Var.b != null) {
                        for (int i38 = 0; i38 < r21Var.b.options.size(); i38++) {
                            org.telegram.ui.Components.m61 m61Var3 = new org.telegram.ui.Components.m61(30);
                            m61Var3.l = r21Var.b.options.get(i38).text;
                            m61Var3.k = R.drawable.msg_arrowright;
                            m61Var3.d = i38;
                            arrayList11.add(m61Var3);
                            measuredHeight += 50;
                        }
                    } else if (r21Var.c != null) {
                        for (int i39 = 0; i39 < r21Var.c.options.size(); i39++) {
                            org.telegram.ui.Components.m61 m61Var4 = new org.telegram.ui.Components.m61(30);
                            m61Var4.l = r21Var.c.options.get(i39).text;
                            m61Var4.k = R.drawable.msg_arrowright;
                            m61Var4.d = i39;
                            arrayList11.add(m61Var4);
                            measuredHeight += 50;
                        }
                    } else if (r21Var.d != null) {
                        if (r21Var.n == null) {
                            Context context3 = r21Var.getContext();
                            g6Var6 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                            q21 q21Var = new q21(r21Var, context3, g6Var6);
                            r21Var.n = q21Var;
                            q21Var.setShowLimitWhenNear(100);
                        }
                        r21Var.n.d.setHint(LocaleController.getString(r21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.m61 k11 = org.telegram.ui.Components.m61.k(r21Var.n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = s21Var.s;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            i11 = arrayList12.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.h3) s21Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        i2.o1.B(i11, arrayList11);
                        if (r21Var.r == null) {
                            Context context4 = r21Var.getContext();
                            g6Var3 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                            ei.d dVar = new ei.d(context4, g6Var3, true);
                            r21Var.s = dVar;
                            dVar.i(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(r21Var.getContext());
                            r21Var.r = frameLayout;
                            int i40 = org.telegram.ui.ActionBar.k6.h5;
                            g6Var4 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                            org.telegram.ui.ActionBar.r6.i(i40, frameLayout, g6Var4);
                            r21Var.r.addView(r21Var.s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(r21Var.getContext());
                            int i41 = org.telegram.ui.ActionBar.k6.d7;
                            g6Var5 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                            org.telegram.ui.ActionBar.r6.i(i41, view, g6Var5);
                            r21Var.r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        r21Var.s.setEnabled(r21Var.d.optional || !TextUtils.isEmpty(r21Var.n.getText()));
                        r21Var.s.setOnClickListener(new w50(r21Var, 27));
                        org.telegram.ui.Components.m61 k12 = org.telegram.ui.Components.m61.k(r21Var.r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.m61) i2.o1.i(1, arrayList11)).j = true;
                    if (s21Var.e && r21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(r21Var.getContext());
                        Drawable mutate = r21Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        int i42 = org.telegram.ui.ActionBar.k6.b7;
                        g6Var7 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(frameLayout2, mutate, i42, g6Var7, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        int i43 = org.telegram.ui.ActionBar.k6.a7;
                        g6Var8 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.z(frameLayout2, colorDrawable, i43, g6Var8, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(colorDrawable, mutate, 0, 0);
                        yqVar.w = true;
                        frameLayout2.setBackground(yqVar);
                        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(r21Var.getContext(), null);
                        y90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        g6Var9 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                        y90Var.setText(AndroidUtilities.replaceLinks(string4, g6Var9));
                        int i44 = org.telegram.ui.ActionBar.k6.A6;
                        g6Var10 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.r6.W(y90Var, i44, g6Var10);
                        y90Var.setGravity(17);
                        frameLayout2.addView(y90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.m61 k13 = org.telegram.ui.Components.m61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (j71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.h3) s21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        j71Var.Y2.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList11);
                        j71Var.Y2.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.m61.k(((x21) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.m61.k(((l31) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                l61.Q((l61) this.b, (ArrayList) obj);
                break;
            case 24:
                k61 k61Var = (k61) this.b;
                ArrayList arrayList13 = k61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i45 = k61Var.a;
                ArrayList arrayList14 = k61Var.d;
                if (tL_error3 != null) {
                    if (k61Var.r) {
                        arrayList14.clear();
                        k61Var.r = false;
                    }
                    k61Var.h = true;
                    k61Var.f = false;
                    int size5 = arrayList13.size();
                    while (i15 < size5) {
                        Object obj7 = arrayList13.get(i15);
                        i15++;
                        ((Runnable) obj7).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i45).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i45).putChats(channels_channelparticipants.chats, false);
                    if (k61Var.r) {
                        arrayList14.clear();
                        k61Var.r = false;
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
                        k61Var.h = true;
                    }
                    k61Var.f = false;
                    int size7 = arrayList13.size();
                    while (i16 < size7) {
                        Object obj8 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj8).run();
                    }
                    break;
                }
            case 25:
                o61 o61Var = (o61) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                int i47 = o61Var.b0;
                ci.z6 z6Var = o61Var.Z;
                if (z6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.m61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = z6Var.i;
                    int size8 = arrayList17.size();
                    int i48 = i47;
                    int i49 = 0;
                    while (i49 < size8) {
                        Object obj9 = arrayList17.get(i49);
                        i49++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i50 = ba1.b;
                        org.telegram.ui.Components.m61 J6 = org.telegram.ui.Components.m61.J(ba1.class);
                        J6.u = 1;
                        J6.z = 0;
                        J6.G = messageObject;
                        J6.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        J6.f = true;
                        J6.v = i47;
                        J6.K(o61Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.u = 1;
                        arrayList16.add(J6);
                        i48--;
                        if (i48 == 0) {
                            i48 = i47;
                        }
                    }
                    if (z6Var.k() || !z6Var.r) {
                        while (true) {
                            if (i14 < (i48 <= 0 ? i47 : i48)) {
                                i14++;
                                org.telegram.ui.Components.m61 o10 = org.telegram.ui.Components.m61.o(i14, 34);
                                o10.u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.m61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                c81.b0((c81) this.b, (ArrayList) obj);
                break;
            case 27:
                m81 m81Var = (m81) this.b;
                ArrayList arrayList18 = (ArrayList) obj;
                LinearLayout linearLayout = m81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.m61.k(linearLayout));
                }
                LinearLayout linearLayout2 = m81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.m61.k(linearLayout2));
                    break;
                }
                break;
            default:
                ed1 ed1Var = (ed1) this.b;
                gh.b bVar4 = ed1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                ed1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ed1Var.v = paint2;
                Bitmap bitmap4 = ed1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                ed1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                ed1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ed1Var.w = new Matrix();
                bVar4.a(bitmap3);
                hh.d.c(bVar4, ed1Var.b);
                ed1Var.F.d();
                break;
        }
    }
}
