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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cg implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cg(guc gucVar, Context context, int i, vnb vnbVar, a70 a70Var) {
        this.a = (byte) 3;
        this.c = gucVar;
        this.d = context;
        this.e = vnbVar;
        this.b = a70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f;
        TL_stars.SavedStarGift savedStarGift;
        float f2;
        byte b = 25;
        byte b2 = 17;
        int i = -1;
        byte b3 = 2;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                ti tiVar = (ti) this.c;
                ui uiVar = (ui) this.d;
                uu8 uu8Var = (uu8) this.e;
                z8d z8dVar = (z8d) this.b;
                uu8Var.a.m0(tiVar.getValue() + 1, (uiVar.getValue() + 1) * 60, uu8Var.b);
                ((nx0) z8dVar.b).y0.run();
                break;
            case 1:
                int[] iArr = (int[]) this.c;
                qi qiVar = (qi) this.d;
                hj hjVar = (hj) this.e;
                z8d z8dVar2 = (z8d) this.b;
                hjVar.y(iArr[qiVar.getValue()], 0, true);
                ((nx0) z8dVar2.b).y0.run();
                break;
            case 2:
                int[] iArr2 = (int[]) this.c;
                wi wiVar = (wi) this.d;
                hj hjVar2 = (hj) this.e;
                z8d z8dVar3 = (z8d) this.b;
                hjVar2.y(iArr2[wiVar.getValue()] * 60, 0, true);
                ((nx0) z8dVar3.b).y0.run();
                break;
            case 3:
                guc gucVar = (guc) this.c;
                Context context = (Context) this.d;
                vnb vnbVar = (vnb) this.e;
                a70 a70Var = (a70) this.b;
                gucVar.o();
                jj.k(context, vnbVar, new m0(a70Var, b));
                break;
            case 4:
                no0 no0Var = (no0) this.c;
                zu1 zu1Var = (zu1) this.d;
                r47 r47Var = (r47) this.e;
                String str = (String) this.b;
                zu1Var.Z9(r47Var, false, false);
                m01.t(no0Var.getContext(), Uri.parse(str), true, false, false, null, null, false, uc7.s1(yac.t0).k4.I2.f, false, false);
                break;
            case 5:
                String[] strArr = (String[]) this.c;
                nt0 nt0Var = (nt0) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                c51 c51Var = (c51) this.b;
                strArr[0] = nt0Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    mt0 mt0Var = (mt0) obj;
                    mt0Var.b.a(TextUtils.equals(mt0Var.a, strArr[0]), true);
                }
                c51Var.setEnabled(strArr[0] != null);
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                hu0 hu0Var = (hu0) this.d;
                String[] strArr2 = (String[]) this.e;
                nx0 nx0Var = (nx0) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    hu0Var.a(strArr2[0]);
                }
                nx0Var.dismiss();
                break;
            case 7:
                nx0 nx0Var2 = (nx0) this.c;
                vnb vnbVar2 = (vnb) this.d;
                ImageView imageView = (ImageView) this.e;
                st stVar = (st) this.b;
                fu5 G = fu5.G(nx0Var2.c, vnbVar2, imageView);
                G.b(R.drawable.menu_link_revoke, ob6.M0(2131749231, null), stVar, false);
                G.e0 = true;
                G.b0(0.0f, -hl.L(6.0f));
                G.s = (short) 0;
                G.a0();
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                r57 r57Var = (r57) this.e;
                q67 q67Var = (q67) this.b;
                int i3 = ChatActivityEnterView.X7;
                chatActivityEnterView.n7 = !chatActivityEnterView.n7;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    ((r47) arrayList2.get(i4)).k.invert_media = chatActivityEnterView.n7;
                }
                r57Var.a(!chatActivityEnterView.n7, true);
                if (!arrayList2.isEmpty()) {
                    q67Var.d((r47) arrayList2.get(0));
                }
                q67Var.n(!chatActivityEnterView.n7);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                m47 m47Var = (m47) this.d;
                r47 r47Var2 = (r47) this.e;
                q67 q67Var2 = (q67) this.b;
                int i5 = ChatActivityEnterView.X7;
                if (m47Var != null) {
                    ArrayList arrayList3 = m47Var.d;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        ((r47) obj2).k.invert_media = chatActivityEnterView2.n7;
                    }
                    m47Var.a();
                } else {
                    r47Var2.k.invert_media = chatActivityEnterView2.n7;
                }
                chatActivityEnterView2.w0();
                q67Var2.f(true);
                chatActivityEnterView2.n7 = false;
                break;
            case 10:
                n12 n12Var = (n12) this.c;
                Context context2 = (Context) this.d;
                b8 b8Var = (b8) this.e;
                vnb vnbVar3 = (vnb) this.b;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                if (chatAttachAlertPhotoLayout != null) {
                    nza.k1(context2, chatAttachAlertPhotoLayout.getStarsPrice(), true, new qe2((Object) n12Var, (Object) b8Var, (byte) 9), vnbVar3);
                    break;
                }
                break;
            case 11:
                i56 i56Var = (i56) this.c;
                Context context3 = (Context) this.d;
                nx0 nx0Var3 = (nx0) this.e;
                e eVar = (e) this.b;
                float[] fArr = i56Var.J;
                FrameLayout frameLayout = i56Var.n;
                if (i56Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context3, null);
                    if (!i56Var.y && i56Var.H) {
                        b8 b8Var2 = new b8(context3, true, false);
                        b8Var2.j(ob6.M0(2131751300, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var2, tre.o(-1, 48));
                        b8Var2.setOnClickListener(new c56(i56Var, b4));
                    }
                    b8 b8Var3 = new b8(context3, true, false);
                    b8Var3.j(ob6.M0(2131750433, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var3, tre.o(-1, 48));
                    b8Var3.setOnClickListener(new c56(i56Var, b3));
                    if (!i56Var.G) {
                        b8 b8Var4 = new b8(context3, false, true);
                        b8Var4.j(ob6.M0(2131745750, null), R.drawable.msg_delete, null);
                        int i7 = aob.p7;
                        b8Var4.d(aob.w0(null, i7, false), aob.w0(null, i7, false));
                        b8Var4.setOnClickListener(new c56(i56Var, (byte) 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var4, tre.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = nx0Var3 == null ? eVar.getParentLayout().getOverlayContainerView() : nx0Var3.c;
                    if (overlayContainerView != null) {
                        i56.a(frameLayout, overlayContainerView, fArr);
                        float f3 = fArr[1];
                        a81 a81Var = new a81(i56Var, context3, overlayContainerView, (byte) 13);
                        gb gbVar = new gb(a81Var, (byte) 6);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(gbVar);
                        overlayContainerView.addView(a81Var, tre.c(-1.0f, -1));
                        a81Var.setAlpha(0.0f);
                        a81Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        i56Var.s = n8Var;
                        n8Var.setOnDismissListener(new ae4(i56Var, a81Var, overlayContainerView, gbVar, (byte) 1));
                        i56Var.s.setOutsideTouchable(true);
                        i56Var.s.setFocusable(true);
                        i56Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        i56Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        i56Var.s.setInputMethodMode(2);
                        i56Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b56(i56Var, b3));
                        if (hl.O1()) {
                            f3 += overlayContainerView.getPaddingTop();
                            f = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f = 0.0f;
                        }
                        i56Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - hl.L(16.0f)) + f), (int) (overlayContainerView.getY() + f3 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 12:
                zg6 zg6Var = (zg6) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                String str4 = (String) this.b;
                fu5 I = fu5.I(zg6Var.w, zg6Var.a);
                I.b(R.drawable.msg_help, ob6.M0(2131745207, null), new g65(zg6Var, str2, str3, str4, (byte) 19), false);
                I.W(5);
                I.a0();
                break;
            case 13:
                j68 j68Var = (j68) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                lcb lcbVar = (lcb) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                o68 o68Var = j68Var.x;
                j68 j68Var2 = o68Var.d1;
                if (j68Var2 != null) {
                    j68Var2.a();
                }
                storyItem.dialogId = o68Var.l1;
                storyItem.messageId = storyItem.id;
                r47 r47Var3 = new r47(o68Var.m2, storyItem);
                r47Var3.r0(false);
                lcbVar.L(new i68(chat.id, r47Var3, false));
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ns1 ns1Var = (ns1) this.b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.K2(emojiStatus, user, ns1Var);
                break;
            case 15:
                du8 du8Var = (du8) this.c;
                axa axaVar = (axa) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.e;
                hcc hccVar = (hcc) this.b;
                ArrayList i8 = axaVar.i();
                int i9 = 0;
                while (true) {
                    if (i9 >= i8.size()) {
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) i8.get(i9)).gift.id == du8Var.l1) {
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
                    ArrayList arrayList4 = axaVar.l;
                    arrayList4.removeAll(i8);
                    if (axaVar.e && !axaVar.c) {
                        Collections.sort(arrayList4, new fna((byte) 2));
                    }
                    arrayList4.addAll(0, i8);
                    jn7.f(axaVar.a).k(jn7.I3, Long.valueOf(axaVar.b), axaVar);
                    axaVar.p();
                    du8Var.dismiss();
                    ((d31) hccVar.run()).I(R.raw.ic_pin, ob6.a0(null, null, 2131749989, wua.u1(savedStarGift2.gift)), ob6.a0(null, null, 2131749990, wua.u1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 16:
                qe9 qe9Var = (qe9) this.c;
                y0 y0Var = (y0) this.d;
                fu5 H = fu5.H(qe9Var.c, (vnb) this.e, (ImageView) this.b, true);
                H.W(5);
                H.t = false;
                H.b0(hl.L(12.0f), hl.L(-32.0f));
                y0Var.a(H);
                break;
            case 17:
                ((VideoAds) this.c).lambda$show$7((fu5) this.d, (TLRPC.TL_sponsoredMessage) this.e, (Context) this.b, view);
                break;
            case 18:
                Activity activity = (Activity) this.c;
                vnb vnbVar4 = (vnb) this.d;
                vlc vlcVar = (vlc) this.e;
                nx0 nx0Var4 = (nx0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar4, activity);
                alertDialog$Builder.a.S = ob6.M0(2131742789, null);
                alertDialog$Builder.a.U = ob6.M0(2131742790, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new yw9(vlcVar, nx0Var4, b));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            case 19:
                c51 c51Var2 = (c51) this.c;
                pcc pccVar = (pcc) this.d;
                nx0 nx0Var5 = (nx0) this.e;
                vnb vnbVar5 = (vnb) this.b;
                c51Var2.setLoading(true);
                pccVar.a(new gpc(c51Var2, nx0Var5, vnbVar5, b4));
                break;
            case 20:
                ktc ktcVar = (ktc) this.c;
                vnb vnbVar6 = (vnb) this.d;
                Runnable runnable = (Runnable) this.e;
                Runnable runnable2 = (Runnable) this.b;
                vnb vnbVar7 = ktcVar.a;
                if (!TextUtils.isEmpty(ktcVar.s) && ktcVar.r != null) {
                    id[] idVarArr = new id[1];
                    LinearLayout linearLayout = new LinearLayout(ktcVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                    TLRPC.User user2 = ktcVar.r;
                    if (user2 != null) {
                        String l = lbc.l(user2);
                        f2 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(ktcVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        de0 de0Var = new de0(ktcVar.getContext());
                        de0Var.setRoundRadius(hl.L(15.0f));
                        rb0 rb0Var = new rb0((vnb) null);
                        rb0Var.q(ktcVar.r);
                        de0Var.f(ktcVar.r, rb0Var);
                        linearLayout2.addView(de0Var, tre.r(30, 30, 16));
                        TextView textView = new TextView(ktcVar.getContext());
                        int i10 = aob.G6;
                        yob.X(textView, i10, vnbVar6);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(ob6.a0(null, null, 2131742595, l));
                        textView.setTypeface(hl.o());
                        textView.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        linearLayout2.addView(textView, tre.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, tre.r(-1, -2, 55));
                        p66 p66Var = new p66(ktcVar.getContext(), null);
                        yob.X(p66Var, i10, vnbVar6);
                        yob.G(p66Var, aob.Xc, vnbVar6);
                        p66Var.setTextSize(1, 16.0f);
                        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                        p66Var.setText(hl.N2(ob6.a0(null, null, 2131742850, lbc.r(ktcVar.r)), -1, 0, new vlc(idVarArr, runnable, (byte) 23), null));
                        linearLayout.addView(p66Var, tre.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f2 = 4.0f;
                    }
                    FrameLayout frameLayout2 = new FrameLayout(ktcVar.getContext());
                    frameLayout2.setPadding(hl.L(f2), 0, hl.L(f2), 0);
                    TextView textView2 = new TextView(ktcVar.getContext());
                    textView2.setTextSize(1, 14.0f);
                    yob.X(textView2, aob.G6, vnbVar6);
                    textView2.setText(atc.Z(ktcVar.s));
                    textView2.setPadding(hl.L(10.0f), hl.L(12.0f), hl.L(10.0f), hl.L(12.0f));
                    textView2.setTypeface(hl.n1("fonts/rmono.ttf"));
                    int i11 = aob.a7;
                    int v0 = aob.v0(i11, vnbVar7);
                    int v02 = aob.v0(i11, vnbVar7);
                    int i12 = aob.i6;
                    hf0 Z = aob.Z(v0, aob.v(v02, aob.v0(i12, vnbVar7)), 10, 10);
                    uob M = yob.M(i11);
                    uob p = yob.p(i11, i12);
                    textView2.setBackground(Z);
                    yob.j(textView2, Z, M, p, vnbVar6);
                    textView2.setGravity(17);
                    frameLayout2.addView(textView2, tre.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout2, tre.t(-1, -2, 55, 0, 14, 0, 0));
                    iye.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new lw4(ktcVar, idVarArr, runnable2, (byte) 28));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar6, ktcVar.getContext());
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                    idVarArr[0] = alertDialog$Builder2.o();
                    break;
                }
                break;
            default:
                c51 c51Var3 = (c51) this.c;
                ku9 ku9Var = (ku9) this.d;
                jl7 jl7Var = (jl7) this.e;
                vnb vnbVar8 = (vnb) this.b;
                if (!c51Var3.R) {
                    c51Var3.setLoading(true);
                    ku9Var.a(new v58(c51Var3, jl7Var, vnbVar8, b2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cg(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
