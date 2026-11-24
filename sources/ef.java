// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ef(trc trcVar, Context context, int i, ylb ylbVar, y70 y70Var) {
        this.a = (byte) 3;
        this.c = trcVar;
        this.d = context;
        this.e = ylbVar;
        this.b = y70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f;
        TL_stars.SavedStarGift savedStarGift;
        float f2;
        byte b = 17;
        byte b2 = 2;
        int i = -1;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.c;
                vj vjVar = (vj) this.d;
                gk gkVar = (gk) this.e;
                k6d k6dVar = (k6d) this.b;
                gkVar.y(iArr[vjVar.getValue()] * 60, 0, true);
                ((my0) k6dVar.b).y0.run();
                break;
            case 1:
                sj sjVar = (sj) this.c;
                tj tjVar = (tj) this.d;
                nt8 nt8Var = (nt8) this.e;
                k6d k6dVar2 = (k6d) this.b;
                nt8Var.a.n0(sjVar.getValue() + 1, (tjVar.getValue() + 1) * 60, nt8Var.b);
                ((my0) k6dVar2.b).y0.run();
                break;
            case 2:
                int[] iArr2 = (int[]) this.c;
                pj pjVar = (pj) this.d;
                gk gkVar2 = (gk) this.e;
                k6d k6dVar3 = (k6d) this.b;
                gkVar2.y(iArr2[pjVar.getValue()], 0, true);
                ((my0) k6dVar3.b).y0.run();
                break;
            case 3:
                trc trcVar = (trc) this.c;
                Context context = (Context) this.d;
                ylb ylbVar = (ylb) this.e;
                y70 y70Var = (y70) this.b;
                trcVar.o();
                ik.k(context, ylbVar, new l0(y70Var, (byte) 27));
                break;
            case 4:
                np0 np0Var = (np0) this.c;
                yv1 yv1Var = (yv1) this.d;
                k47 k47Var = (k47) this.e;
                String str = (String) this.b;
                yv1Var.Y9(k47Var, false, false);
                l11.t(np0Var.getContext(), Uri.parse(str), true, false, false, null, null, false, oc7.r1(z8c.t0).l4.A2.f, false, false);
                break;
            case 5:
                String[] strArr = (String[]) this.c;
                nu0 nu0Var = (nu0) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                b61 b61Var = (b61) this.b;
                strArr[0] = nu0Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    mu0 mu0Var = (mu0) obj;
                    mu0Var.b.a(TextUtils.equals(mu0Var.a, strArr[0]), true);
                }
                b61Var.setEnabled(strArr[0] != null);
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                hv0 hv0Var = (hv0) this.d;
                String[] strArr2 = (String[]) this.e;
                my0 my0Var = (my0) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    hv0Var.a(strArr2[0]);
                }
                my0Var.dismiss();
                break;
            case 7:
                my0 my0Var2 = (my0) this.c;
                ylb ylbVar2 = (ylb) this.d;
                ImageView imageView = (ImageView) this.e;
                qu quVar = (qu) this.b;
                bu5 G = bu5.G(my0Var2.c, ylbVar2, imageView);
                G.b(R.drawable.menu_link_revoke, jb6.M0(2131749234, null), quVar, false);
                G.b0 = true;
                G.b0(0.0f, -gm.L(6.0f));
                G.s = (short) 0;
                G.a0();
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                k57 k57Var = (k57) this.e;
                j67 j67Var = (j67) this.b;
                int i3 = ChatActivityEnterView.z7;
                chatActivityEnterView.V6 = !chatActivityEnterView.V6;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    ((k47) arrayList2.get(i4)).k.invert_media = chatActivityEnterView.V6;
                }
                k57Var.a(!chatActivityEnterView.V6, true);
                if (!arrayList2.isEmpty()) {
                    j67Var.d((k47) arrayList2.get(0));
                }
                j67Var.n(!chatActivityEnterView.V6);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                f47 f47Var = (f47) this.d;
                k47 k47Var2 = (k47) this.e;
                j67 j67Var2 = (j67) this.b;
                int i5 = ChatActivityEnterView.z7;
                if (f47Var != null) {
                    ArrayList arrayList3 = f47Var.d;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        ((k47) obj2).k.invert_media = chatActivityEnterView2.V6;
                    }
                    f47Var.a();
                } else {
                    k47Var2.k.invert_media = chatActivityEnterView2.V6;
                }
                chatActivityEnterView2.t0();
                j67Var2.f(true);
                chatActivityEnterView2.V6 = false;
                break;
            case 10:
                i22 i22Var = (i22) this.c;
                Context context2 = (Context) this.d;
                a8 a8Var = (a8) this.e;
                ylb ylbVar3 = (ylb) this.b;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
                if (chatAttachAlertPhotoLayout != null) {
                    nxa.k1(context2, chatAttachAlertPhotoLayout.getStarsPrice(), true, new lf2((Object) i22Var, (Object) a8Var, (byte) 11), ylbVar3);
                    break;
                }
                break;
            case 11:
                f56 f56Var = (f56) this.c;
                Context context3 = (Context) this.d;
                my0 my0Var3 = (my0) this.e;
                d dVar = (d) this.b;
                float[] fArr = f56Var.J;
                FrameLayout frameLayout = f56Var.n;
                if (f56Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context3, null);
                    if (!f56Var.y && f56Var.H) {
                        a8 a8Var2 = new a8(context3, true, false);
                        a8Var2.j(jb6.M0(2131751272, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, qoe.o(-1, 48));
                        a8Var2.setOnClickListener(new z46(f56Var, b3));
                    }
                    a8 a8Var3 = new a8(context3, true, false);
                    a8Var3.j(jb6.M0(2131750405, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var3, qoe.o(-1, 48));
                    a8Var3.setOnClickListener(new z46(f56Var, b2));
                    if (!f56Var.G) {
                        a8 a8Var4 = new a8(context3, false, true);
                        a8Var4.j(jb6.M0(2131745756, null), R.drawable.msg_delete, null);
                        int i7 = cmb.o7;
                        a8Var4.d(cmb.w0(null, i7, false), cmb.w0(null, i7, false));
                        a8Var4.setOnClickListener(new z46(f56Var, (byte) 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var4, qoe.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = my0Var3 == null ? dVar.getParentLayout().getOverlayContainerView() : my0Var3.c;
                    if (overlayContainerView != null) {
                        f56.a(frameLayout, overlayContainerView, fArr);
                        float f3 = fArr[1];
                        a91 a91Var = new a91(f56Var, context3, overlayContainerView, (byte) 13);
                        fb fbVar = new fb(a91Var, (byte) 6);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(fbVar);
                        overlayContainerView.addView(a91Var, qoe.c(-1.0f, -1));
                        a91Var.setAlpha(0.0f);
                        a91Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        f56Var.s = m8Var;
                        m8Var.setOnDismissListener(new de4(f56Var, a91Var, overlayContainerView, fbVar, (byte) 1));
                        f56Var.s.setOutsideTouchable(true);
                        f56Var.s.setFocusable(true);
                        f56Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        f56Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        f56Var.s.setInputMethodMode(2);
                        f56Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new y46(f56Var, b2));
                        if (gm.O1()) {
                            f3 += overlayContainerView.getPaddingTop();
                            f = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f = 0.0f;
                        }
                        f56Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - gm.L(16.0f)) + f), (int) (overlayContainerView.getY() + f3 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 12:
                wg6 wg6Var = (wg6) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                String str4 = (String) this.b;
                bu5 I = bu5.I(wg6Var.w, wg6Var.a);
                I.b(R.drawable.msg_help, jb6.M0(2131745213, null), new d65(wg6Var, str2, str3, str4, (byte) 19), false);
                I.W(5);
                I.a0();
                break;
            case 13:
                v48 v48Var = (v48) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                oab oabVar = (oab) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                a58 a58Var = v48Var.x;
                v48 v48Var2 = a58Var.j1;
                if (v48Var2 != null) {
                    v48Var2.a();
                }
                storyItem.dialogId = a58Var.r1;
                storyItem.messageId = storyItem.id;
                k47 k47Var3 = new k47(a58Var.s2, storyItem);
                k47Var3.r0(false);
                oabVar.L(new u48(chat.id, k47Var3, false));
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                mt1 mt1Var = (mt1) this.b;
                RectF rectF = ProfileActivity.e7;
                profileActivity.M2(emojiStatus, user, mt1Var);
                break;
            case 15:
                us8 us8Var = (us8) this.c;
                ava avaVar = (ava) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.e;
                iac iacVar = (iac) this.b;
                ArrayList i8 = avaVar.i();
                int i9 = 0;
                while (true) {
                    if (i9 >= i8.size()) {
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) i8.get(i9)).gift.id == us8Var.l1) {
                        savedStarGift = (TL_stars.SavedStarGift) i8.get(i9);
                        i = i9;
                    } else {
                        i9++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i8.set(i, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = avaVar.l;
                    arrayList4.removeAll(i8);
                    if (avaVar.e && !avaVar.c) {
                        Collections.sort(arrayList4, new zua((byte) 0));
                    }
                    arrayList4.addAll(0, i8);
                    nm7.f(avaVar.a).k(nm7.I3, Long.valueOf(avaVar.b), avaVar);
                    avaVar.p();
                    us8Var.dismiss();
                    ((c41) iacVar.run()).I(R.raw.ic_pin, jb6.a0(null, null, 2131749964, wsa.t1(savedStarGift2.gift)), jb6.a0(null, null, 2131749965, wsa.t1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 16:
                cd9 cd9Var = (cd9) this.c;
                x0 x0Var = (x0) this.d;
                bu5 H = bu5.H(cd9Var.c, (ylb) this.e, (ImageView) this.b, true);
                H.W(5);
                H.t = false;
                H.b0(gm.L(12.0f), gm.L(-32.0f));
                x0Var.a(H);
                break;
            case 17:
                ((VideoAds) this.c).lambda$show$7((bu5) this.d, (TLRPC.TL_sponsoredMessage) this.e, (Context) this.b, view);
                break;
            case 18:
                Activity activity = (Activity) this.c;
                ylb ylbVar4 = (ylb) this.d;
                qhc qhcVar = (qhc) this.e;
                my0 my0Var4 = (my0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar4, activity);
                alertDialog$Builder.a.S = jb6.M0(2131742821, null);
                alertDialog$Builder.a.U = jb6.M0(2131742822, null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new uxb(qhcVar, my0Var4, (byte) 10));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            case 19:
                b61 b61Var2 = (b61) this.c;
                qac qacVar = (qac) this.d;
                my0 my0Var5 = (my0) this.e;
                ylb ylbVar5 = (ylb) this.b;
                b61Var2.setLoading(true);
                qacVar.a(new tmc(b61Var2, my0Var5, ylbVar5, b3));
                break;
            case 20:
                zqc zqcVar = (zqc) this.c;
                ylb ylbVar6 = (ylb) this.d;
                Runnable runnable = (Runnable) this.e;
                Runnable runnable2 = (Runnable) this.b;
                ylb ylbVar7 = zqcVar.a;
                if (!TextUtils.isEmpty(zqcVar.s) && zqcVar.r != null) {
                    he[] heVarArr = new he[1];
                    LinearLayout linearLayout = new LinearLayout(zqcVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                    TLRPC.User user2 = zqcVar.r;
                    if (user2 != null) {
                        String l = m9c.l(user2);
                        f2 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(zqcVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                        bf0 bf0Var = new bf0(zqcVar.getContext());
                        bf0Var.setRoundRadius(gm.L(15.0f));
                        pc0 pc0Var = new pc0((ylb) null);
                        pc0Var.q(zqcVar.r);
                        bf0Var.f(zqcVar.r, pc0Var);
                        linearLayout2.addView(bf0Var, qoe.r(30, 30, 16));
                        TextView textView = new TextView(zqcVar.getContext());
                        int i10 = cmb.F6;
                        anb.X(textView, i10, ylbVar6);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(jb6.a0(null, null, 2131742627, l));
                        textView.setTypeface(gm.o());
                        textView.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                        linearLayout2.addView(textView, qoe.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, qoe.r(-1, -2, 55));
                        l66 l66Var = new l66(zqcVar.getContext(), null);
                        anb.X(l66Var, i10, ylbVar6);
                        anb.G(l66Var, cmb.Wc, ylbVar6);
                        l66Var.setTextSize(1, 16.0f);
                        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                        l66Var.setText(gm.N2(jb6.a0(null, null, 2131742882, m9c.r(zqcVar.r)), -1, 0, new qhc((Object) heVarArr, (Object) runnable, (byte) 26), null));
                        linearLayout.addView(l66Var, qoe.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f2 = 4.0f;
                    }
                    FrameLayout frameLayout2 = new FrameLayout(zqcVar.getContext());
                    frameLayout2.setPadding(gm.L(f2), 0, gm.L(f2), 0);
                    TextView textView2 = new TextView(zqcVar.getContext());
                    textView2.setTextSize(1, 14.0f);
                    anb.X(textView2, cmb.F6, ylbVar6);
                    textView2.setText(pqc.a0(zqcVar.s));
                    textView2.setPadding(gm.L(10.0f), gm.L(12.0f), gm.L(10.0f), gm.L(12.0f));
                    textView2.setTypeface(gm.n1("fonts/rmono.ttf"));
                    int i11 = cmb.Z6;
                    int v0 = cmb.v0(i11, ylbVar7);
                    int v02 = cmb.v0(i11, ylbVar7);
                    int i12 = cmb.h6;
                    fg0 Z = cmb.Z(v0, cmb.v(v02, cmb.v0(i12, ylbVar7)), 10, 10);
                    wmb M = anb.M(i11);
                    wmb p = anb.p(i11, i12);
                    textView2.setBackground(Z);
                    anb.j(textView2, Z, M, p, ylbVar6);
                    textView2.setGravity(17);
                    frameLayout2.addView(textView2, qoe.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout2, qoe.t(-1, -2, 55, 0, 14, 0, 0));
                    rve.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new jw4(zqcVar, heVarArr, runnable2, (byte) 27));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ylbVar6, zqcVar.getContext());
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                    heVarArr[0] = alertDialog$Builder2.o();
                    break;
                }
                break;
            default:
                b61 b61Var3 = (b61) this.c;
                ts9 ts9Var = (ts9) this.d;
                el7 el7Var = (el7) this.e;
                ylb ylbVar8 = (ylb) this.b;
                if (!b61Var3.R) {
                    b61Var3.setLoading(true);
                    ts9Var.a(new i48(b61Var3, el7Var, ylbVar8, b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ef(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
