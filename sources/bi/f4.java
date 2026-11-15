package bi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import di.l8;
import di.lb;
import fi.i9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.messenger.qe;
import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u80;
import org.telegram.ui.an;
import org.telegram.ui.ax0;
import org.telegram.ui.bg0;
import org.telegram.ui.fx0;
import org.telegram.ui.kd0;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f4(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        float f10;
        int i7 = this.a;
        int i10 = 13;
        char c10 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                h4 h4Var = (h4) obj4;
                l8 l8Var = (l8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                r10 r10Var = (r10) obj;
                ArrayList i11 = l8Var.i();
                int i12 = 0;
                while (true) {
                    if (i12 >= i11.size()) {
                        i12 = -1;
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) i11.get(i12)).gift.id == h4Var.m1) {
                        savedStarGift = (TL_stars.SavedStarGift) i11.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i11.set(i12, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = l8Var.l;
                    arrayList.removeAll(i11);
                    if (l8Var.e && !l8Var.c) {
                        Collections.sort(arrayList, new a3.c(16));
                    }
                    arrayList.addAll(0, i11);
                    ns.f(l8Var.a).k(ns.G3, Long.valueOf(l8Var.b), l8Var);
                    l8Var.n();
                    h4Var.dismiss();
                    ((cc) r10Var.run()).I(R.raw.ic_pin, hd.a0(null, null, 2131750031, di.c6.A1(savedStarGift2.gift)), hd.a0(null, null, 2131750032, di.c6.A1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                fi.b4 b4Var = ((fi.t3) obj4).x;
                fi.t3 t3Var = b4Var.d1;
                if (t3Var != null) {
                    t3Var.a();
                }
                storyItem.dialogId = b4Var.l1;
                storyItem.messageId = storyItem.id;
                gj gjVar = new gj(b4Var.m2, storyItem);
                gjVar.r0(false);
                i9Var.N(new fi.s3(chat.id, gjVar, false));
                break;
            case 2:
                ki.m mVar = (ki.m) obj4;
                an anVar = (an) obj3;
                gj gjVar2 = (gj) obj2;
                String str = (String) obj;
                if (anVar != null) {
                    mVar.getClass();
                    anVar.ma(gjVar2, false, false);
                }
                vf.c.s(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, np.s1(m10.t0).e6, false, false);
                break;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                hi.d dVar = (hi.d) obj;
                strArr[0] = ((ki.m1) obj3).a;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList2.get(i13);
                    i13++;
                    ki.l1 l1Var = (ki.l1) obj5;
                    l1Var.b.a(TextUtils.equals(l1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                u2Var.dismiss();
                break;
            case 5:
                ((VideoAds) obj4).lambda$show$7((m60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 6:
                m60 F = m60.F(((org.telegram.ui.ActionBar.u2) obj4).c, (org.telegram.ui.ActionBar.e6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, hd.M0(2131749477, null), (u2) obj, false);
                F.Y = true;
                F.a0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 7:
                ((org.telegram.ui.Components.r4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.u2) ((ou) obj).b).y0.run();
                break;
            case 8:
                ax0 ax0Var = (ax0) obj2;
                fx0.Z(ax0Var.a, ax0Var.b, ((org.telegram.ui.Components.e4) obj4).getValue() + 1, (((org.telegram.ui.Components.f4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.u2) ((ou) obj).b).y0.run();
                break;
            case 9:
                ((org.telegram.ui.Components.r4) obj2).L(((int[]) obj4)[((org.telegram.ui.Components.c4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.u2) ((ou) obj).b).y0.run();
                break;
            case 10:
                ((qe) obj4).m();
                org.telegram.ui.Components.t4.k((Context) obj3, (org.telegram.ui.ActionBar.e6) obj2, new org.telegram.ui.Components.s((c8) obj, i10));
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ja0 ja0Var = (ja0) obj2;
                bg0 bg0Var = (bg0) obj;
                chatActivityEnterView.m6 = !chatActivityEnterView.m6;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    ((gj) arrayList3.get(i14)).k.invert_media = chatActivityEnterView.m6;
                }
                ja0Var.a(!chatActivityEnterView.m6, true);
                if (!arrayList3.isEmpty()) {
                    bg0Var.f((gj) arrayList3.get(0));
                }
                bg0Var.n(!chatActivityEnterView.m6);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                bj bjVar = (bj) obj3;
                gj gjVar3 = (gj) obj2;
                bg0 bg0Var2 = (bg0) obj;
                int i15 = ChatActivityEnterView.N6;
                chatActivityEnterView2.getClass();
                if (bjVar != null) {
                    ArrayList arrayList4 = bjVar.d;
                    int size2 = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj6 = arrayList4.get(i16);
                        i16++;
                        ((gj) obj6).k.invert_media = chatActivityEnterView2.m6;
                    }
                    bjVar.a();
                } else {
                    gjVar3.k.invert_media = chatActivityEnterView2.m6;
                }
                chatActivityEnterView2.j0();
                bg0Var2.h(true);
                chatActivityEnterView2.m6 = false;
                break;
            case 13:
                ki kiVar = (ki) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
                if (chatAttachAlertPhotoLayout != null) {
                    lb.j1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new e4(13, kiVar, z0Var), e6Var);
                    break;
                }
                break;
            case 14:
                t70 t70Var = (t70) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.u2 u2Var2 = (org.telegram.ui.ActionBar.u2) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                float[] fArr = t70Var.J;
                FrameLayout frameLayout = t70Var.n;
                if (t70Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!t70Var.y && t70Var.H) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(hd.M0(2131751335, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ja.o(-1, 48));
                        z0Var2.setOnClickListener(new m70(t70Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(hd.M0(2131750472, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ja.o(-1, 48));
                    z0Var3.setOnClickListener(new m70(t70Var, 2));
                    if (!t70Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(hd.M0(2131746023, null), R.drawable.msg_delete, null);
                        int i17 = org.telegram.ui.ActionBar.j6.p7;
                        z0Var4.d(org.telegram.ui.ActionBar.j6.x0(null, i17, false), org.telegram.ui.ActionBar.j6.x0(null, i17, false));
                        z0Var4.setOnClickListener(new m70(t70Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ja.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = u2Var2 == null ? e2Var.getParentLayout().getOverlayContainerView() : u2Var2.c;
                    if (overlayContainerView != null) {
                        t70.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.n5 n5Var = new hi.n5(t70Var, context2, overlayContainerView, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(n5Var, 4);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        overlayContainerView.addView(n5Var, ja.c(-1.0f, -1));
                        n5Var.setAlpha(0.0f);
                        n5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        t70Var.s = g1Var;
                        g1Var.setOnDismissListener(new p70(t70Var, n5Var, overlayContainerView, h1Var, 0));
                        t70Var.s.setOutsideTouchable(true);
                        t70Var.s.setFocusable(true);
                        t70Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        t70Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        t70Var.s.setInputMethodMode(2);
                        t70Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new l70(t70Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        t70Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 15:
                kd0 kd0Var = (kd0) obj4;
                m60 H = m60.H(kd0Var.w, kd0Var.a);
                H.c(R.drawable.msg_help, hd.M0(2131745479, null), new u80(kd0Var, (String) obj3, (String) obj2, (String) obj, 24), false);
                H.V(5);
                H.Z();
                break;
            default:
                m60 G = m60.G(((qy0) obj4).c, (org.telegram.ui.ActionBar.e6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((z10) obj3).a(G);
                break;
        }
    }

    public /* synthetic */ f4(qe qeVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, c8 c8Var) {
        this.a = 10;
        this.b = qeVar;
        this.c = context;
        this.d = e6Var;
        this.e = c8Var;
    }
}
