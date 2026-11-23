package bi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import di.pb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.aj;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.pe;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.z70;
import org.telegram.ui.bn;
import org.telegram.ui.cx0;
import org.telegram.ui.dg0;
import org.telegram.ui.hx0;
import org.telegram.ui.ld0;
import org.telegram.ui.ty0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
        char c10 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                u6 u6Var = (u6) obj4;
                di.p8 p8Var = (di.p8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                o10 o10Var = (o10) obj;
                ArrayList i10 = p8Var.i();
                int i11 = 0;
                while (true) {
                    if (i11 >= i10.size()) {
                        i11 = -1;
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) i10.get(i11)).gift.id == u6Var.m1) {
                        savedStarGift = (TL_stars.SavedStarGift) i10.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i10.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = p8Var.l;
                    arrayList.removeAll(i10);
                    if (p8Var.e && !p8Var.c) {
                        Collections.sort(arrayList, new a3.c(16));
                    }
                    arrayList.addAll(0, i10);
                    ks.f(p8Var.a).k(ks.I3, Long.valueOf(p8Var.b), p8Var);
                    p8Var.p();
                    u6Var.dismiss();
                    ((kc) o10Var.run()).I(R.raw.ic_pin, gd.a0(null, null, 2131750014, di.f6.F1(savedStarGift2.gift)), gd.a0(null, null, 2131750015, di.f6.F1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                fi.f9 f9Var = (fi.f9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                fi.z3 z3Var = ((fi.r3) obj4).x;
                fi.r3 r3Var = z3Var.d1;
                if (r3Var != null) {
                    r3Var.a();
                }
                storyItem.dialogId = z3Var.l1;
                storyItem.messageId = storyItem.id;
                fj fjVar = new fj(z3Var.m2, storyItem);
                fjVar.r0(false);
                f9Var.N(new fi.q3(chat.id, fjVar, false));
                break;
            case 2:
                ki.l lVar = (ki.l) obj4;
                bn bnVar = (bn) obj3;
                fj fjVar2 = (fj) obj2;
                String str = (String) obj;
                if (bnVar != null) {
                    lVar.getClass();
                    bnVar.ma(fjVar2, false, false);
                }
                vf.c.s(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, mp.u1(i10.t0).g6, false, false);
                break;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                hi.e eVar = (hi.e) obj;
                strArr[0] = ((ki.j1) obj3).a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    ki.i1 i1Var = (ki.i1) obj5;
                    i1Var.b.a(TextUtils.equals(i1Var.a, strArr[0]), true);
                }
                eVar.setEnabled(strArr[0] != null);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                w2Var.dismiss();
                break;
            case 5:
                ((VideoAds) obj4).lambda$show$7((x60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 6:
                x60 G = x60.G(((org.telegram.ui.ActionBar.w2) obj4).c, (org.telegram.ui.ActionBar.i6) obj3, (ImageView) obj2);
                G.c(R.drawable.menu_link_revoke, gd.N0(2131749284, null), (i5) obj, false);
                G.b0 = true;
                G.b0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                G.s = 0;
                G.a0();
                break;
            case 7:
                ((org.telegram.ui.Components.z4) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.w2) ((h6.o) obj).b).y0.run();
                break;
            case 8:
                cx0 cx0Var = (cx0) obj2;
                hx0.Z(cx0Var.a, cx0Var.b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.w2) ((h6.o) obj).b).y0.run();
                break;
            case 9:
                ((org.telegram.ui.Components.z4) obj2).I(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.w2) ((h6.o) obj).b).y0.run();
                break;
            case 10:
                ((pe) obj4).m();
                org.telegram.ui.Components.b5.k((Context) obj3, (org.telegram.ui.ActionBar.i6) obj2, new org.telegram.ui.Components.b0((org.telegram.ui.Components.i8) obj, 12));
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                sa0 sa0Var = (sa0) obj2;
                dg0 dg0Var = (dg0) obj;
                chatActivityEnterView.O6 = !chatActivityEnterView.O6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((fj) arrayList3.get(i13)).k.invert_media = chatActivityEnterView.O6;
                }
                sa0Var.a(!chatActivityEnterView.O6, true);
                if (!arrayList3.isEmpty()) {
                    dg0Var.f((fj) arrayList3.get(0));
                }
                dg0Var.n(!chatActivityEnterView.O6);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                aj ajVar = (aj) obj3;
                fj fjVar3 = (fj) obj2;
                dg0 dg0Var2 = (dg0) obj;
                int i14 = ChatActivityEnterView.s7;
                chatActivityEnterView2.getClass();
                if (ajVar != null) {
                    ArrayList arrayList4 = ajVar.d;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj6 = arrayList4.get(i15);
                        i15++;
                        ((fj) obj6).k.invert_media = chatActivityEnterView2.O6;
                    }
                    ajVar.a();
                } else {
                    fjVar3.k.invert_media = chatActivityEnterView2.O6;
                }
                chatActivityEnterView2.u0();
                dg0Var2.h(true);
                chatActivityEnterView2.O6 = false;
                break;
            case 13:
                ti tiVar = (ti) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.e2;
                if (chatAttachAlertPhotoLayout != null) {
                    pb.k1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new r6(17, tiVar, y0Var), i6Var);
                    break;
                }
                break;
            case 14:
                d80 d80Var = (d80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.w2 w2Var2 = (org.telegram.ui.ActionBar.w2) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                float[] fArr = d80Var.J;
                FrameLayout frameLayout = d80Var.n;
                if (d80Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!d80Var.y && d80Var.H) {
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(context2, true, false);
                        y0Var2.j(gd.N0(2131751323, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var2, na.o(-1, 48));
                        y0Var2.setOnClickListener(new w70(d80Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(context2, true, false);
                    y0Var3.j(gd.N0(2131750455, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var3, na.o(-1, 48));
                    y0Var3.setOnClickListener(new w70(d80Var, 2));
                    if (!d80Var.G) {
                        org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(context2, false, true);
                        y0Var4.j(gd.N0(2131745827, null), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.n6.p7;
                        y0Var4.d(org.telegram.ui.ActionBar.n6.x0(null, i16, false), org.telegram.ui.ActionBar.n6.x0(null, i16, false));
                        y0Var4.setOnClickListener(new w70(d80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(y0Var4, na.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = w2Var2 == null ? g2Var.getParentLayout().getOverlayContainerView() : w2Var2.c;
                    if (overlayContainerView != null) {
                        d80.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.w5 w5Var = new hi.w5(d80Var, context2, overlayContainerView, 8);
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(w5Var, 4);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(h1Var);
                        overlayContainerView.addView(w5Var, na.c(-1.0f, -1));
                        w5Var.setAlpha(0.0f);
                        w5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        d80Var.s = g1Var;
                        g1Var.setOnDismissListener(new z70(d80Var, w5Var, overlayContainerView, h1Var, 0));
                        d80Var.s.setOutsideTouchable(true);
                        d80Var.s.setFocusable(true);
                        d80Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        d80Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        d80Var.s.setInputMethodMode(2);
                        d80Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new v70(d80Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        d80Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 15:
                ld0 ld0Var = (ld0) obj4;
                x60 I = x60.I(ld0Var.w, ld0Var.a);
                I.c(R.drawable.msg_help, gd.N0(2131745283, null), new xz(ld0Var, (String) obj3, (String) obj2, (String) obj, 28), false);
                I.W(5);
                I.a0();
                break;
            default:
                x60 H = x60.H(((ty0) obj4).c, (org.telegram.ui.ActionBar.i6) obj2, (ImageView) obj, true);
                H.W(5);
                H.t = false;
                H.b0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((w10) obj3).a(H);
                break;
        }
    }

    public /* synthetic */ s6(pe peVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.i8 i8Var) {
        this.a = 10;
        this.b = peVar;
        this.c = context;
        this.d = i6Var;
        this.e = i8Var;
    }
}
