package di;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.dd;
import c8.ha;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.dj;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.cn;
import org.telegram.ui.dg0;
import org.telegram.ui.fx0;
import org.telegram.ui.kx0;
import org.telegram.ui.nd0;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v3(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i7;
        int i10 = this.a;
        float f10 = 0.0f;
        int i11 = 13;
        char c10 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                q9 q9Var = (q9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                j4 j4Var = ((a4) obj4).x;
                a4 a4Var = j4Var.c1;
                if (a4Var != null) {
                    a4Var.a();
                }
                storyItem.dialogId = j4Var.k1;
                storyItem.messageId = storyItem.id;
                ij ijVar = new ij(j4Var.l2, storyItem);
                ijVar.r0(false);
                q9Var.N(new z3(chat.id, ijVar, false));
                break;
            case 1:
                hi.l lVar = (hi.l) obj4;
                cn cnVar = (cn) obj3;
                ij ijVar2 = (ij) obj2;
                String str = (String) obj;
                if (cnVar != null) {
                    lVar.getClass();
                    cnVar.la(ijVar2, false, false);
                }
                vf.c.s(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, qp.s1(p10.s0).d6, false, false);
                break;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                fi.d dVar = (fi.d) obj;
                strArr[0] = ((hi.l1) obj3).a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    hi.k1 k1Var = (hi.k1) obj5;
                    k1Var.b.a(TextUtils.equals(k1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                v2Var.dismiss();
                break;
            case 4:
                ((VideoAds) obj4).lambda$show$7((l60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 5:
                l60 F = l60.F(((org.telegram.ui.ActionBar.v2) obj4).c, (org.telegram.ui.ActionBar.g6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, id.M0(2131749477, null), (jg.c1) obj, false);
                F.Y = true;
                F.a0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 6:
                ((org.telegram.ui.Components.t4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.j4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).b).x0.run();
                break;
            case 7:
                fx0 fx0Var = (fx0) obj2;
                kx0.Z(fx0Var.a, fx0Var.b, ((org.telegram.ui.Components.g4) obj4).getValue() + 1, (((org.telegram.ui.Components.h4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).b).x0.run();
                break;
            case 8:
                ((org.telegram.ui.Components.t4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.e4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) obj).b).x0.run();
                break;
            case 9:
                ((re) obj4).m();
                org.telegram.ui.Components.v4.k((Context) obj3, (org.telegram.ui.ActionBar.g6) obj2, new org.telegram.ui.Components.u((org.telegram.ui.Components.f8) obj, i11));
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ia0 ia0Var = (ia0) obj2;
                dg0 dg0Var = (dg0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((ij) arrayList2.get(i13)).k.invert_media = chatActivityEnterView.R4;
                }
                ia0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    dg0Var.e((ij) arrayList2.get(0));
                }
                dg0Var.m(!chatActivityEnterView.R4);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                dj djVar = (dj) obj3;
                ij ijVar3 = (ij) obj2;
                dg0 dg0Var2 = (dg0) obj;
                int i14 = ChatActivityEnterView.s5;
                chatActivityEnterView2.getClass();
                if (djVar != null) {
                    ArrayList arrayList3 = djVar.d;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj6 = arrayList3.get(i15);
                        i15++;
                        ((ij) obj6).k.invert_media = chatActivityEnterView2.R4;
                    }
                    djVar.a();
                } else {
                    ijVar3.k.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.a0();
                dg0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                break;
            case 12:
                di diVar = (di) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
                if (chatAttachAlertPhotoLayout != null) {
                    dd.j1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bi.p5(12, diVar, z0Var), g6Var);
                    break;
                }
                break;
            case 13:
                r70 r70Var = (r70) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                float[] fArr = r70Var.I;
                FrameLayout frameLayout = r70Var.n;
                if (r70Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!r70Var.y && r70Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(id.M0(2131751335, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ha.o(-1, 48));
                        z0Var2.setOnClickListener(new k70(r70Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(id.M0(2131750472, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ha.o(-1, 48));
                    z0Var3.setOnClickListener(new k70(r70Var, 2));
                    if (!r70Var.F) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(id.M0(2131746023, null), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.l6.p7;
                        z0Var4.d(org.telegram.ui.ActionBar.l6.x0(null, i16, false), org.telegram.ui.ActionBar.l6.x0(null, i16, false));
                        z0Var4.setOnClickListener(new k70(r70Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ha.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = v2Var2 == null ? f2Var.getParentLayout().getOverlayContainerView() : v2Var2.c;
                    if (overlayContainerView != null) {
                        r70.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        fi.p5 p5Var = new fi.p5(r70Var, context2, overlayContainerView, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(p5Var, 4);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        overlayContainerView.addView(p5Var, ha.c(-1.0f, -1));
                        p5Var.setAlpha(0.0f);
                        p5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        r70Var.s = g1Var;
                        g1Var.setOnDismissListener(new n70(r70Var, p5Var, overlayContainerView, h1Var, 0));
                        r70Var.s.setOutsideTouchable(true);
                        r70Var.s.setFocusable(true);
                        r70Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        r70Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        r70Var.s.setInputMethodMode(2);
                        r70Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new j70(r70Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        r70Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 14:
                nd0 nd0Var = (nd0) obj4;
                l60 H = l60.H(nd0Var.w, nd0Var.a);
                H.c(R.drawable.msg_help, id.M0(2131745479, null), new ln0(nd0Var, (String) obj3, (String) obj2, (String) obj, 20), false);
                H.V(5);
                H.Z();
                break;
            case 15:
                l60 G = l60.G(((vy0) obj4).c, (org.telegram.ui.ActionBar.g6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((c20) obj3).a(G);
                break;
            default:
                zh.c2 c2Var = (zh.c2) obj4;
                bi.v9 v9Var = (bi.v9) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                u10 u10Var = (u10) obj;
                ArrayList i17 = v9Var.i();
                int i18 = 0;
                while (true) {
                    if (i18 >= i17.size()) {
                        savedStarGift = null;
                        i7 = -1;
                    } else if (((TL_stars.SavedStarGift) i17.get(i18)).gift.id == c2Var.i1) {
                        savedStarGift = (TL_stars.SavedStarGift) i17.get(i18);
                        i7 = i18;
                    } else {
                        i18++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i17.set(i7, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = v9Var.l;
                    arrayList4.removeAll(i17);
                    if (v9Var.e && !v9Var.c) {
                        Collections.sort(arrayList4, new a3.c(13));
                    }
                    arrayList4.addAll(0, i17);
                    qs.f(v9Var.a).k(qs.G3, Long.valueOf(v9Var.b), v9Var);
                    v9Var.n();
                    c2Var.dismiss();
                    ((hc) u10Var.run()).I(R.raw.ic_pin, id.a0(null, null, 2131750031, bi.k7.z1(savedStarGift2.gift)), id.a0(null, null, 2131750032, bi.k7.z1(savedStarGift.gift))).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v3(re reVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.f8 f8Var) {
        this.a = 9;
        this.b = reVar;
        this.c = context;
        this.d = g6Var;
        this.e = f8Var;
    }
}
