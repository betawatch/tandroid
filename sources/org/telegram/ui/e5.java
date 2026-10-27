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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        k91 k91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        org.telegram.ui.ActionBar.u6 u6Var7;
        org.telegram.ui.ActionBar.u6 u6Var8;
        org.telegram.ui.ActionBar.u6 u6Var9;
        org.telegram.ui.ActionBar.u6 u6Var10;
        ViewGroup viewGroup;
        TL_stories.StoryItem storyItem;
        int i12 = 7;
        final int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        r10 = false;
        boolean z10 = false;
        final int i18 = 1;
        switch (this.a) {
            case 0:
                f5 f5Var = (f5) this.b;
                f5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                f5Var.w = false;
                hh.b bVar = f5Var.h;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, f5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                o9 o9Var = (o9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = o9Var.F.isEmpty();
                ArrayList arrayList2 = o9Var.w;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.u61 c10 = org.telegram.ui.Components.u61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.q = true;
                    arrayList.add(c10);
                    arrayList.add(org.telegram.ui.Components.u61.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = o9Var.F;
                    int size = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj3 = arrayList3.get(i19);
                        i19++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = o9Var.getMessagesController().getChat(l4)) != null) {
                            q8 q8Var = new q8(o9Var, i13);
                            int i20 = m9.a;
                            org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(m9.class);
                            K.G = chat;
                            K.D = q8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.u61.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        k9 k9Var = (k9) obj4;
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(i12, o9Var, k9Var);
                        int i21 = i9.a;
                        org.telegram.ui.Components.u61 K2 = org.telegram.ui.Components.u61.K(i9.class);
                        K2.G = k9Var;
                        K2.D = u1Var;
                        K2.L(o9Var.g0(k9Var.c));
                        arrayList.add(K2);
                    }
                    if (!o9Var.E) {
                        arrayList.add(org.telegram.ui.Components.u61.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.u61.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.u61.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                ke keVar = (ke) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                keVar.R0 = -1;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.o0).getChat(Long.valueOf(-keVar.p0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.o0).getChatFull(-keVar.p0);
                int i22 = chatFull != null ? chatFull.stats_dc : -1;
                if (keVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.u61.g(keVar.s0));
                    k91 k91Var2 = keVar.l1;
                    if (k91Var2 == null || k91Var2.l) {
                        charSequence = null;
                    } else {
                        arrayList4.add(org.telegram.ui.Components.u61.h(5, i22, k91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.u61.B(-1, null));
                    }
                    k91 k91Var3 = keVar.m1;
                    if (k91Var3 != null && !k91Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.u61.h(2, i22, k91Var3));
                        arrayList4.add(org.telegram.ui.Components.u61.B(-2, charSequence));
                    }
                }
                if (keVar.c1 && (k91Var = keVar.n1) != null && !k91Var.l) {
                    arrayList4.add(org.telegram.ui.Components.u61.h(2, i22, k91Var));
                    arrayList4.add(org.telegram.ui.Components.u61.B(-3, null));
                }
                if (keVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.u61.v(keVar.p1));
                    arrayList4.add(org.telegram.ui.Components.u61.v(keVar.q1));
                    arrayList4.add(org.telegram.ui.Components.u61.v(keVar.r1));
                    arrayList4.add(org.telegram.ui.Components.u61.B(-4, keVar.u0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.u61.k(keVar.w0));
                        arrayList4.add(org.telegram.ui.Components.u61.B(-5, keVar.t0));
                        int i23 = MessagesController.getInstance(keVar.o0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        int i24 = keVar.r0 < i23 ? i23 : 0;
                        if (i24 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(0, new cp0(i24, context, null, false));
                            zqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.u61 i25 = org.telegram.ui.Components.u61.i(1, string);
                        if (keVar.r0 >= i23 && keVar.j1) {
                            z10 = true;
                        }
                        i25.L(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.u61.B(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.u61.j(3, keVar.C0));
                        arrayList4.add(org.telegram.ui.Components.u61.B(-6, keVar.v0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.o0).getChat(Long.valueOf(-keVar.p0))) && MessagesController.getInstance(keVar.o0).starrefConnectAllowed) {
                    arrayList4.add(hi.g.a(4, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, keVar.n0), R.drawable.filled_earn_stars, oo.e0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.u61.B(-7, null));
                }
                if (keVar.a1.a()) {
                    keVar.R0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.u61.n(keVar.T0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.u61.B(-10, null));
                    break;
                }
                break;
            case 3:
                ee eeVar = (ee) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ge geVar = eeVar.f;
                int i26 = eeVar.d;
                int i27 = ge.x;
                ArrayList arrayList6 = i26 == 0 ? geVar.r : geVar.n;
                int size3 = arrayList6.size();
                while (i17 < size3) {
                    Object obj5 = arrayList6.get(i17);
                    i17++;
                    int i28 = bi.xc.a;
                    org.telegram.ui.Components.u61 K3 = org.telegram.ui.Components.u61.K(bi.xc.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.q = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i26 == 0 ? geVar.s : geVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.u61.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.u61.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.u61.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                oo ooVar = (oo) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ooVar.getClass();
                    org.telegram.ui.Components.wc.b0(ooVar).g0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(ooVar.j0);
                AndroidUtilities.removeFromParent(ooVar.g0);
                AndroidUtilities.removeFromParent(ooVar.i0);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new jq((mr) this.b, i18), 1000L);
                break;
            case 6:
                ((rf.b) this.b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                ls lsVar = (ls) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User user = lsVar.getMessagesController().getUser(Long.valueOf(lsVar.H));
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.V));
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.b));
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.c));
                if (TextUtils.isEmpty(lsVar.c0())) {
                    arrayList7.add(org.telegram.ui.Components.u61.C(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (lsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.u61.C(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.u61.C(null));
                }
                if (lsVar.I && lsVar.K) {
                    org.telegram.ui.Components.u61 i29 = org.telegram.ui.Components.u61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.L(lsVar.X);
                    arrayList7.add(i29);
                    arrayList7.add(org.telegram.ui.Components.u61.C(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.d));
                ic.a.z(R.string.AddNotesInfo, arrayList7);
                if (lsVar.I) {
                    charSequence2 = null;
                } else {
                    TLRPC.UserFull userFull = lsVar.getMessagesController().getUserFull(lsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.x));
                    arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.u61.k(lsVar.E));
                    }
                    charSequence2 = null;
                    arrayList7.add(org.telegram.ui.Components.u61.C(null));
                    org.telegram.ui.Components.u61 e = org.telegram.ui.Components.u61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.r = true;
                    arrayList7.add(e);
                }
                arrayList7.add(org.telegram.ui.Components.u61.C(charSequence2));
                if (lsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ds(lsVar, user, i13));
                    lsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new bs(lsVar, i18), 200L);
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
                    ftVar.O(charSequence3, TextUtils.join("", htVar.o), callback != null ? new org.telegram.ui.Components.oy(9, dtVar, callback) : null);
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
                eyVar.c5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                final wy wyVar = (wy) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(2);
                u61Var.l = string2;
                u61Var.k = i30;
                arrayList8.add(u61Var);
                org.telegram.ui.Components.u61 i31 = org.telegram.ui.Components.u61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.L(wyVar.c);
                arrayList8.add(i31);
                if (wyVar.c) {
                    arrayList8.add(org.telegram.ui.Components.u61.C(null));
                    arrayList8.add(org.telegram.ui.Components.u61.u(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.sy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    vy vyVar = (vy) view.getParent();
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    vyVar.a(true, true);
                                    bi.m5 m5Var = wyVar2.f;
                                    if (m5Var != null) {
                                        m5Var.run(Boolean.valueOf(wyVar2.c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.V();
                                    break;
                                default:
                                    vy vyVar2 = (vy) view.getParent();
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    vyVar2.a(false, true);
                                    bi.m5 m5Var2 = wyVar3.f;
                                    if (m5Var2 != null) {
                                        m5Var2.run(Boolean.valueOf(wyVar3.c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.V();
                                    break;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.sy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    vy vyVar = (vy) view.getParent();
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    vyVar.a(true, true);
                                    bi.m5 m5Var = wyVar2.f;
                                    if (m5Var != null) {
                                        m5Var.run(Boolean.valueOf(wyVar2.c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.V();
                                    break;
                                default:
                                    vy vyVar2 = (vy) view.getParent();
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    vyVar2.a(false, true);
                                    bi.m5 m5Var2 = wyVar3.f;
                                    if (m5Var2 != null) {
                                        m5Var2.run(Boolean.valueOf(wyVar3.c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.V();
                                    break;
                            }
                        }
                    };
                    int i32 = uy.a;
                    org.telegram.ui.Components.u61 K4 = org.telegram.ui.Components.u61.K(uy.class);
                    K4.d = 2;
                    K4.G = onClickListener;
                    K4.H = onClickListener2;
                    K4.L(wyVar.d);
                    arrayList8.add(K4);
                    ic.a.z(R.string.TopicsLayoutInfo, arrayList8);
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
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.t.q(R.string.AIEditorStyleNotFound, ob0.d(), R.raw.error, 36);
                        break;
                    } else {
                        ob0.d().g0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                zv0 zv0Var = (zv0) this.b;
                hh.b bVar2 = zv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                zv0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                zv0Var.w = paint;
                Bitmap bitmap2 = zv0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                zv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.y6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.y6.I.q() ? -0.02f : -0.04f);
                zv0Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                zv0Var.x = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, zv0Var.c);
                zv0Var.G.d();
                break;
            case 16:
                hw0 hw0Var = (hw0) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.u61 u61Var2 = new org.telegram.ui.Components.u61(2);
                u61Var2.l = string3;
                u61Var2.k = i33;
                arrayList9.add(u61Var2);
                org.telegram.ui.Components.u61 i34 = org.telegram.ui.Components.u61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.L(hw0Var.n);
                arrayList9.add(i34);
                arrayList9.add(org.telegram.ui.Components.u61.B(2, null));
                if (hw0Var.n) {
                    ic.a.p(R.string.PriceForEachSuggestion, arrayList9);
                    int[] a2 = org.telegram.ui.Cells.c8.a((int) hw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(18);
                    org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8();
                    b8Var.c = a2;
                    b8Var.d = 20;
                    b8Var.e = c1Var;
                    hw0Var.b.d((int) Utilities.clamp(hw0Var.r, 10000L, 0L), b8Var, new t3(hw0Var, 19));
                    arrayList9.add(org.telegram.ui.Components.u61.j(3, hw0Var.b));
                    arrayList9.add(org.telegram.ui.Components.u61.B(4, hw0Var.r > 0 ? hw0Var.X() : null));
                    TLRPC.Chat chat3 = hw0Var.getMessagesController().getChat(Long.valueOf(hw0Var.a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        hw0Var.c.setLink(hw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        ic.a.p(R.string.ChannelLinkDirectMessages, arrayList9);
                        arrayList9.add(org.telegram.ui.Components.u61.j(5, hw0Var.c));
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
                    privacySettingsActivity.B0(true);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                hh.b bVar3 = profileActivity.E6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.F6.d();
                break;
            case 19:
                w21 w21Var = (w21) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.s71 s71Var = w21Var.f;
                x21 x21Var = w21Var.v;
                ArrayList arrayList11 = x21Var.n;
                bi.j5 j5Var = w21Var.h;
                if (j5Var.getMeasuredHeight() <= 0) {
                    j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.u61 D = org.telegram.ui.Components.u61.D(j5Var.getMeasuredHeight());
                D.d = -1;
                D.s = true;
                arrayList10.add(D);
                int measuredHeight = (int) ((j5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = w21Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.c != null || w21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || w21Var.c != null) {
                        Context context2 = w21Var.getContext();
                        int i35 = org.telegram.ui.ActionBar.y6.L6;
                        u6Var = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context2, i35, 21, 0, 0, false, false, u6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = w21Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            q4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = w21Var.c;
                            if (tL_reportResultChooseOption != null) {
                                q4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        int i36 = org.telegram.ui.ActionBar.y6.h5;
                        u6Var2 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.i(i36, q4Var, u6Var2);
                        org.telegram.ui.Components.u61 k10 = org.telegram.ui.Components.u61.k(q4Var);
                        k10.d = -2;
                        arrayList10.add(k10);
                        measuredHeight += 40;
                    }
                    if (w21Var.b != null) {
                        for (int i37 = 0; i37 < w21Var.b.options.size(); i37++) {
                            org.telegram.ui.Components.u61 u61Var3 = new org.telegram.ui.Components.u61(30);
                            u61Var3.l = w21Var.b.options.get(i37).text;
                            u61Var3.k = R.drawable.msg_arrowright;
                            u61Var3.d = i37;
                            arrayList10.add(u61Var3);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.c != null) {
                        for (int i38 = 0; i38 < w21Var.c.options.size(); i38++) {
                            org.telegram.ui.Components.u61 u61Var4 = new org.telegram.ui.Components.u61(30);
                            u61Var4.l = w21Var.c.options.get(i38).text;
                            u61Var4.k = R.drawable.msg_arrowright;
                            u61Var4.d = i38;
                            arrayList10.add(u61Var4);
                            measuredHeight += 50;
                        }
                    } else if (w21Var.d != null) {
                        if (w21Var.n == null) {
                            Context context3 = w21Var.getContext();
                            u6Var6 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                            u21 u21Var = new u21(w21Var, context3, u6Var6);
                            w21Var.n = u21Var;
                            u21Var.setShowLimitWhenNear(100);
                        }
                        w21Var.n.d.setHint(LocaleController.getString(w21Var.d.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        org.telegram.ui.Components.u61 k11 = org.telegram.ui.Components.u61.k(w21Var.n);
                        k11.d = -3;
                        arrayList10.add(k11);
                        long j10 = x21Var.s;
                        if (arrayList11 != null && !arrayList11.isEmpty()) {
                            i11 = arrayList11.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo;
                        } else if (DialogObject.isUserDialog(j10)) {
                            i11 = R.string.Report2CommentInfoUser;
                        } else {
                            i10 = ((org.telegram.ui.ActionBar.k3) x21Var).currentAccount;
                            i11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? R.string.Report2CommentInfoChannel : R.string.Report2CommentInfoGroup;
                        }
                        ic.a.z(i11, arrayList10);
                        if (w21Var.r == null) {
                            Context context4 = w21Var.getContext();
                            u6Var3 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                            fi.d dVar = new fi.d(context4, u6Var3, true);
                            w21Var.s = dVar;
                            dVar.i(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(w21Var.getContext());
                            w21Var.r = frameLayout;
                            int i39 = org.telegram.ui.ActionBar.y6.h5;
                            u6Var4 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                            org.telegram.ui.ActionBar.f7.i(i39, frameLayout, u6Var4);
                            w21Var.r.addView(w21Var.s, org.telegram.ui.Components.kb1.h(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(w21Var.getContext());
                            int i40 = org.telegram.ui.ActionBar.y6.d7;
                            u6Var5 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                            org.telegram.ui.ActionBar.f7.i(i40, view, u6Var5);
                            w21Var.r.addView(view, org.telegram.ui.Components.kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        w21Var.s.setEnabled(w21Var.d.optional || !TextUtils.isEmpty(w21Var.n.getText()));
                        w21Var.s.setOnClickListener(new z50(w21Var, 29));
                        org.telegram.ui.Components.u61 k12 = org.telegram.ui.Components.u61.k(w21Var.r);
                        k12.d = -4;
                        arrayList10.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.u61) ic.a.g(1, arrayList10)).j = true;
                    if (x21Var.e && w21Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(w21Var.getContext());
                        Drawable mutate = w21Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        int i41 = org.telegram.ui.ActionBar.y6.b7;
                        u6Var7 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.y(frameLayout2, mutate, i41, u6Var7, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        int i42 = org.telegram.ui.ActionBar.y6.a7;
                        u6Var8 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.y(frameLayout2, colorDrawable, i42, u6Var8, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, mutate, 0, 0);
                        arVar.w = true;
                        frameLayout2.setBackground(arVar);
                        org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(w21Var.getContext(), null);
                        aa0Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        u6Var9 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                        aa0Var.setText(AndroidUtilities.replaceLinks(string4, u6Var9));
                        int i43 = org.telegram.ui.ActionBar.y6.A6;
                        u6Var10 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
                        org.telegram.ui.ActionBar.f7.V(aa0Var, i43, u6Var10);
                        aa0Var.setGravity(17);
                        frameLayout2.addView(aa0Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.u61 k13 = org.telegram.ui.Components.u61.k(frameLayout2);
                        k13.d = -3;
                        arrayList10.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (s71Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.k3) x21Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        s71Var.f3.l1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList10);
                        s71Var.f3.l1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.u61.k(((c31) this.b).X));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.u61.k(((o31) this.b).X));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                p61.Q((p61) this.b, (ArrayList) obj);
                break;
            case 24:
                o61 o61Var = (o61) this.b;
                ArrayList arrayList12 = o61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i44 = o61Var.a;
                ArrayList arrayList13 = o61Var.d;
                if (tL_error3 != null) {
                    if (o61Var.r) {
                        arrayList13.clear();
                        o61Var.r = false;
                    }
                    o61Var.h = true;
                    o61Var.f = false;
                    int size4 = arrayList12.size();
                    while (i15 < size4) {
                        Object obj6 = arrayList12.get(i15);
                        i15++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    MessagesController.getInstance(i44).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i44).putChats(channels_channelparticipants.chats, false);
                    if (o61Var.r) {
                        arrayList13.clear();
                        o61Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList14 = channels_channelparticipants.participants;
                    int size5 = arrayList14.size();
                    int i45 = 0;
                    while (i45 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList14.get(i45);
                        i45++;
                        TLObject userOrChat = MessagesController.getInstance(i44).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList13.add(userOrChat);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        o61Var.h = true;
                    }
                    o61Var.f = false;
                    int size6 = arrayList12.size();
                    while (i16 < size6) {
                        Object obj7 = arrayList12.get(i16);
                        i16++;
                        ((Runnable) obj7).run();
                    }
                    break;
                }
            case 25:
                s61 s61Var = (s61) this.b;
                ArrayList arrayList15 = (ArrayList) obj;
                int i46 = s61Var.b0;
                di.z6 z6Var = s61Var.Z;
                if (z6Var != null) {
                    arrayList15.add(org.telegram.ui.Components.u61.D(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList16 = z6Var.i;
                    int size7 = arrayList16.size();
                    int i47 = i46;
                    int i48 = 0;
                    while (i48 < size7) {
                        Object obj8 = arrayList16.get(i48);
                        i48++;
                        MessageObject messageObject = (MessageObject) obj8;
                        int i49 = fa1.b;
                        org.telegram.ui.Components.u61 K5 = org.telegram.ui.Components.u61.K(fa1.class);
                        K5.u = 1;
                        K5.z = 0;
                        K5.G = messageObject;
                        K5.B = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        K5.f = true;
                        K5.v = i46;
                        K5.L(s61Var.a0.containsKey(Integer.valueOf(messageObject.getId())));
                        K5.u = 1;
                        arrayList15.add(K5);
                        i47--;
                        if (i47 == 0) {
                            i47 = i46;
                        }
                    }
                    if (z6Var.k() || !z6Var.r) {
                        while (true) {
                            if (i14 < (i47 <= 0 ? i46 : i47)) {
                                i14++;
                                org.telegram.ui.Components.u61 q5 = org.telegram.ui.Components.u61.q(i14, 34);
                                q5.u = 1;
                                arrayList15.add(q5);
                            }
                        }
                    }
                    arrayList15.add(org.telegram.ui.Components.u61.D(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 26:
                f81.a0((f81) this.b, (ArrayList) obj);
                break;
            case 27:
                p81 p81Var = (p81) this.b;
                ArrayList arrayList17 = (ArrayList) obj;
                LinearLayout linearLayout = p81Var.Y;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.u61.k(linearLayout));
                }
                LinearLayout linearLayout2 = p81Var.Z;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.u61.k(linearLayout2));
                    break;
                }
                break;
            default:
                kd1 kd1Var = (kd1) this.b;
                hh.b bVar4 = kd1Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                kd1Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                kd1Var.v = paint2;
                Bitmap bitmap4 = kd1Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                kd1Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.y6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.y6.I.q() ? -0.02f : -0.04f);
                kd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                kd1Var.w = new Matrix();
                bVar4.a(bitmap3);
                ih.d.c(bVar4, kd1Var.b);
                kd1Var.F.d();
                break;
        }
    }
}
