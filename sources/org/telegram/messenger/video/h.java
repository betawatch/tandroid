package org.telegram.messenger.video;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ih.s;
import java.util.ArrayList;
import java.util.Collections;
import kg.f0;
import m4.n0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ej;
import org.telegram.messenger.fe;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.za0;
import org.telegram.ui.ex0;
import org.telegram.ui.g01;
import org.telegram.ui.kh0;
import org.telegram.ui.py0;
import org.telegram.ui.se0;
import org.telegram.ui.un;
import org.telegram.ui.uy0;
import org.telegram.ui.w50;
import org.telegram.ui.web.v;
import ph.i2;
import rh.h8;
import rh.v5;
import th.o7;
import th.t2;
import th.u2;
import w7.b6;
import xh.e1;
import xh.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(KeyEvent.Callback callback, Context context, KeyEvent.Callback callback2, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.e = context;
        this.c = callback2;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i10;
        int i11 = this.a;
        float f7 = 0.0f;
        int i12 = 13;
        char c10 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 0:
                ((VideoAds) obj4).lambda$show$7((z60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 1:
                z60 F = z60.F(((z2) obj4).c, (p6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, cd.L0(2131749486, null), (fe) obj, false);
                F.Y = true;
                F.a0(0.0f, -i0.L(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 2:
                ((q4) obj2).K(((int[]) obj4)[((g4) obj3).getValue()] * 60, 0, true);
                ((z2) ((l2.f) obj).b).x0.run();
                break;
            case 3:
                py0 py0Var = (py0) obj2;
                uy0.Y(py0Var.a, py0Var.b, ((d4) obj4).getValue() + 1, (((e4) obj3).getValue() + 1) * 60);
                ((z2) ((l2.f) obj).b).x0.run();
                break;
            case 4:
                ((q4) obj2).K(((int[]) obj4)[((b4) obj3).getValue()], 0, true);
                ((z2) ((l2.f) obj).b).x0.run();
                break;
            case 5:
                ((n0) obj4).l();
                s4.k((Context) obj, (p6) obj3, new t((a8) obj2, i12));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                za0 za0Var = (za0) obj2;
                kh0 kh0Var = (kh0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((jj) arrayList.get(i13)).k.invert_media = chatActivityEnterView.R4;
                }
                za0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList.isEmpty()) {
                    kh0Var.e((jj) arrayList.get(0));
                }
                kh0Var.m(!chatActivityEnterView.R4);
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                ej ejVar = (ej) obj3;
                jj jjVar = (jj) obj2;
                kh0 kh0Var2 = (kh0) obj;
                int i14 = ChatActivityEnterView.s5;
                chatActivityEnterView2.getClass();
                if (ejVar != null) {
                    ArrayList arrayList2 = ejVar.d;
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj5 = arrayList2.get(i15);
                        i15++;
                        ((jj) obj5).k.invert_media = chatActivityEnterView2.R4;
                    }
                    ejVar.a();
                } else {
                    jjVar.k.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.Z();
                kh0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                break;
            case 8:
                bi biVar = (bi) obj4;
                Context context = (Context) obj;
                b1 b1Var = (b1) obj3;
                p6 p6Var = (p6) obj2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                if (chatAttachAlertPhotoLayout != null) {
                    h8.i1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new s(6, biVar, b1Var), p6Var);
                    break;
                }
                break;
            case 9:
                j80 j80Var = (j80) obj4;
                Context context2 = (Context) obj;
                z2 z2Var = (z2) obj3;
                k2 k2Var = (k2) obj2;
                float[] fArr = j80Var.I;
                FrameLayout frameLayout = j80Var.n;
                if (j80Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!j80Var.y && j80Var.G) {
                        b1 b1Var2 = new b1(context2, true, false);
                        b1Var2.j(cd.L0(2131751336, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var2, b6.o(-1, 48));
                        b1Var2.setOnClickListener(new c80(j80Var, c10 == true ? 1 : 0));
                    }
                    b1 b1Var3 = new b1(context2, true, false);
                    b1Var3.j(cd.L0(2131750481, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var3, b6.o(-1, 48));
                    b1Var3.setOnClickListener(new c80(j80Var, 2));
                    if (!j80Var.F) {
                        b1 b1Var4 = new b1(context2, false, true);
                        b1Var4.j(cd.L0(2131746040, null), R.drawable.msg_delete, null);
                        int i16 = t6.p7;
                        b1Var4.d(t6.x0(null, i16, false), t6.x0(null, i16, false));
                        b1Var4.setOnClickListener(new c80(j80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(b1Var4, b6.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = z2Var == null ? k2Var.getParentLayout().getOverlayContainerView() : z2Var.c;
                    if (overlayContainerView != null) {
                        j80.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        f0 f0Var = new f0(j80Var, context2, overlayContainerView, 7);
                        l1 l1Var = new l1(f0Var, 4);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(l1Var);
                        overlayContainerView.addView(f0Var, b6.c(-1.0f, -1));
                        f0Var.setAlpha(0.0f);
                        f0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        k1 k1Var = new k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        j80Var.s = k1Var;
                        k1Var.setOnDismissListener(new f80(j80Var, f0Var, overlayContainerView, l1Var, 0));
                        j80Var.s.setOutsideTouchable(true);
                        j80Var.s.setFocusable(true);
                        j80Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        j80Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        j80Var.s.setInputMethodMode(2);
                        j80Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b80(j80Var, 2));
                        if (i0.Q1()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        j80Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - i0.L(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 10:
                se0 se0Var = (se0) obj4;
                z60 H = z60.H(se0Var.w, se0Var.a);
                H.c(R.drawable.msg_help, cd.L0(2131745497, null), new w50(se0Var, (String) obj3, (String) obj2, (String) obj, 10), false);
                H.V(5);
                H.Z();
                break;
            case 11:
                z60 G = z60.G(((g01) obj4).c, (p6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(i0.L(12.0f), i0.L(-32.0f));
                ((q20) obj3).a(G);
                break;
            case 12:
                i2 i2Var = (i2) obj4;
                v5 v5Var = (v5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                i20 i20Var = (i20) obj;
                ArrayList i17 = v5Var.i();
                int i18 = 0;
                while (true) {
                    if (i18 >= i17.size()) {
                        savedStarGift = null;
                        i10 = -1;
                    } else if (((TL_stars.SavedStarGift) i17.get(i18)).gift.id == i2Var.i1) {
                        savedStarGift = (TL_stars.SavedStarGift) i17.get(i18);
                        i10 = i18;
                    } else {
                        i18++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i17.set(i10, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList3 = v5Var.l;
                    arrayList3.removeAll(i17);
                    if (v5Var.e && !v5Var.c) {
                        Collections.sort(arrayList3, new ex0(13));
                    }
                    arrayList3.addAll(0, i17);
                    zs.f(v5Var.a).k(zs.G3, Long.valueOf(v5Var.b), v5Var);
                    v5Var.n();
                    i2Var.dismiss();
                    ((cc) i20Var.run()).I(R.raw.ic_pin, cd.a0(null, null, 2131750040, rh.e4.A1(savedStarGift2.gift)), cd.a0(null, null, 2131750041, rh.e4.A1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 13:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                o7 o7Var = (o7) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                th.z2 z2Var2 = ((u2) obj4).x;
                u2 u2Var = z2Var2.c1;
                if (u2Var != null) {
                    u2Var.a();
                }
                storyItem.dialogId = z2Var2.k1;
                storyItem.messageId = storyItem.id;
                jj jjVar2 = new jj(z2Var2.l2, storyItem);
                jjVar2.r0(false);
                o7Var.V(new t2(chat.id, jjVar2, false));
                break;
            case 14:
                xh.k kVar = (xh.k) obj4;
                un unVar = (un) obj3;
                jj jjVar3 = (jj) obj2;
                String str = (String) obj;
                if (unVar != null) {
                    kVar.getClass();
                    unVar.Z9(jjVar3, false, false);
                }
                gf.f.q(kVar.getContext(), Uri.parse(str), true, false, false, null, null, false, vp.r1(d20.s0).e6, false);
                break;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                vh.d dVar = (vh.d) obj;
                strArr[0] = ((f1) obj3).a;
                int size2 = arrayList4.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj6 = arrayList4.get(i19);
                    i19++;
                    e1 e1Var = (e1) obj6;
                    e1Var.b.a(TextUtils.equals(e1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            default:
                boolean[] zArr = (boolean[]) obj4;
                v vVar = (v) obj3;
                String[] strArr2 = (String[]) obj2;
                z2 z2Var3 = (z2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                z2Var3.dismiss();
                break;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ h(n0 n0Var, Context context, int i10, p6 p6Var, a8 a8Var) {
        this.a = 5;
        this.b = n0Var;
        this.e = context;
        this.c = p6Var;
        this.d = a8Var;
    }
}
