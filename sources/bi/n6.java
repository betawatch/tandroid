package bi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import di.pb;
import fi.f9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.aj;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.pe;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
import org.telegram.ui.ex0;
import org.telegram.ui.jx0;
import org.telegram.ui.ld0;
import org.telegram.ui.uy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
                p6 p6Var = (p6) obj4;
                di.o8 o8Var = (di.o8) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                p10 p10Var = (p10) obj;
                ArrayList i10 = o8Var.i();
                int i11 = 0;
                while (true) {
                    if (i11 >= i10.size()) {
                        i11 = -1;
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) i10.get(i11)).gift.id == p6Var.m1) {
                        savedStarGift = (TL_stars.SavedStarGift) i10.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i10.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = o8Var.l;
                    arrayList.removeAll(i10);
                    if (o8Var.e && !o8Var.c) {
                        Collections.sort(arrayList, new a3.c(16));
                    }
                    arrayList.addAll(0, i10);
                    ks.f(o8Var.a).k(ks.I3, Long.valueOf(o8Var.b), o8Var);
                    o8Var.p();
                    p6Var.dismiss();
                    ((lc) p10Var.run()).I(R.raw.ic_pin, gd.a0(null, null, 2131750015, di.f6.F1(savedStarGift2.gift)), gd.a0(null, null, 2131750016, di.f6.F1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                f9 f9Var = (f9) obj2;
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
                ki.m mVar = (ki.m) obj4;
                bn bnVar = (bn) obj3;
                fj fjVar2 = (fj) obj2;
                String str = (String) obj;
                if (bnVar != null) {
                    mVar.getClass();
                    bnVar.ma(fjVar2, false, false);
                }
                vf.c.s(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, mp.u1(j10.t0).g6, false, false);
                break;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                hi.d dVar = (hi.d) obj;
                strArr[0] = ((ki.k1) obj3).a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    ki.j1 j1Var = (ki.j1) obj5;
                    j1Var.b.a(TextUtils.equals(j1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.v vVar = (org.telegram.ui.web.v) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    vVar.a(strArr2[0]);
                }
                x2Var.dismiss();
                break;
            case 5:
                ((VideoAds) obj4).lambda$show$7((y60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 6:
                y60 G = y60.G(((org.telegram.ui.ActionBar.x2) obj4).c, (org.telegram.ui.ActionBar.i6) obj3, (ImageView) obj2);
                G.c(R.drawable.menu_link_revoke, gd.M0(2131749285, null), (d5) obj, false);
                G.b0 = true;
                G.b0(0.0f, -org.telegram.messenger.g0.L(6.0f));
                G.s = 0;
                G.a0();
                break;
            case 7:
                ((org.telegram.ui.Components.z4) obj2).O(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).b).y0.run();
                break;
            case 8:
                ex0 ex0Var = (ex0) obj2;
                jx0.Z(ex0Var.a, ex0Var.b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).b).y0.run();
                break;
            case 9:
                ((org.telegram.ui.Components.z4) obj2).O(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).b).y0.run();
                break;
            case 10:
                ((pe) obj4).m();
                org.telegram.ui.Components.b5.k((Context) obj3, (org.telegram.ui.ActionBar.i6) obj2, new org.telegram.ui.Components.b0((org.telegram.ui.Components.k8) obj, 12));
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ta0 ta0Var = (ta0) obj2;
                eg0 eg0Var = (eg0) obj;
                chatActivityEnterView.M6 = !chatActivityEnterView.M6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    ((fj) arrayList3.get(i13)).k.invert_media = chatActivityEnterView.M6;
                }
                ta0Var.a(!chatActivityEnterView.M6, true);
                if (!arrayList3.isEmpty()) {
                    eg0Var.f((fj) arrayList3.get(0));
                }
                eg0Var.n(!chatActivityEnterView.M6);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                aj ajVar = (aj) obj3;
                fj fjVar3 = (fj) obj2;
                eg0 eg0Var2 = (eg0) obj;
                int i14 = ChatActivityEnterView.n7;
                chatActivityEnterView2.getClass();
                if (ajVar != null) {
                    ArrayList arrayList4 = ajVar.d;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj6 = arrayList4.get(i15);
                        i15++;
                        ((fj) obj6).k.invert_media = chatActivityEnterView2.M6;
                    }
                    ajVar.a();
                } else {
                    fjVar3.k.invert_media = chatActivityEnterView2.M6;
                }
                chatActivityEnterView2.q0();
                eg0Var2.h(true);
                chatActivityEnterView2.M6 = false;
                break;
            case 13:
                si siVar = (si) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.e2;
                if (chatAttachAlertPhotoLayout != null) {
                    pb.k1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new m6(17, siVar, z0Var), i6Var);
                    break;
                }
                break;
            case 14:
                e80 e80Var = (e80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.x2 x2Var2 = (org.telegram.ui.ActionBar.x2) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                float[] fArr = e80Var.J;
                FrameLayout frameLayout = e80Var.n;
                if (e80Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!e80Var.y && e80Var.H) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                        z0Var2.j(gd.M0(2131751324, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var2, ma.o(-1, 48));
                        z0Var2.setOnClickListener(new x70(e80Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(context2, true, false);
                    z0Var3.j(gd.M0(2131750456, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var3, ma.o(-1, 48));
                    z0Var3.setOnClickListener(new x70(e80Var, 2));
                    if (!e80Var.G) {
                        org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(context2, false, true);
                        z0Var4.j(gd.M0(2131745828, null), R.drawable.msg_delete, null);
                        int i16 = org.telegram.ui.ActionBar.n6.p7;
                        z0Var4.d(org.telegram.ui.ActionBar.n6.x0(null, i16, false), org.telegram.ui.ActionBar.n6.x0(null, i16, false));
                        z0Var4.setOnClickListener(new x70(e80Var, 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(z0Var4, ma.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = x2Var2 == null ? h2Var.getParentLayout().getOverlayContainerView() : x2Var2.c;
                    if (overlayContainerView != null) {
                        e80.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[1];
                        hi.m5 m5Var = new hi.m5(e80Var, context2, overlayContainerView, 8);
                        org.telegram.ui.ActionBar.i1 i1Var = new org.telegram.ui.ActionBar.i1(m5Var, 4);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(i1Var);
                        overlayContainerView.addView(m5Var, ma.c(-1.0f, -1));
                        m5Var.setAlpha(0.0f);
                        m5Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        e80Var.s = h1Var;
                        h1Var.setOnDismissListener(new a80(e80Var, m5Var, overlayContainerView, i1Var, 0));
                        e80Var.s.setOutsideTouchable(true);
                        e80Var.s.setFocusable(true);
                        e80Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        e80Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        e80Var.s.setInputMethodMode(2);
                        e80Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new w70(e80Var, 2));
                        if (org.telegram.messenger.g0.Q1()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        e80Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 15:
                ld0 ld0Var = (ld0) obj4;
                y60 I = y60.I(ld0Var.w, ld0Var.a);
                I.c(R.drawable.msg_help, gd.M0(2131745284, null), new n20(ld0Var, (String) obj3, (String) obj2, (String) obj, 27), false);
                I.W(5);
                I.a0();
                break;
            default:
                y60 H = y60.H(((uy0) obj4).c, (org.telegram.ui.ActionBar.i6) obj2, (ImageView) obj, true);
                H.W(5);
                H.t = false;
                H.b0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(-32.0f));
                ((x10) obj3).a(H);
                break;
        }
    }

    public /* synthetic */ n6(pe peVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.k8 k8Var) {
        this.a = 10;
        this.b = peVar;
        this.c = context;
        this.d = i6Var;
        this.e = k8Var;
    }
}
