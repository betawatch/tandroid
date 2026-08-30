package kh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import lh.ja;
import lh.l7;
import nh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.a30;
import org.telegram.ui.e11;
import org.telegram.ui.p31;
import org.telegram.ui.si0;
import org.telegram.ui.wf0;
import org.telegram.ui.xn;
import org.telegram.ui.z01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class u3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c3;
        float f10;
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i11 = -1;
        char c10 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                w3 w3Var = (w3) obj4;
                l7 l7Var = (l7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = l7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.id == w3Var.b) {
                            savedStarGift = (TL_stars.SavedStarGift) h.get(i12);
                            i11 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i11, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = l7Var.l;
                    arrayList.removeAll(h);
                    if (l7Var.e && !l7Var.c) {
                        Collections.sort(arrayList, new e5.f(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(l7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.b), l7Var);
                    l7Var.l();
                    w3Var.dismiss();
                    ((qc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, lh.g5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, lh.g5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nh.d4 d4Var = ((nh.w3) obj4).l;
                nh.w3 w3Var2 = d4Var.q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                }
                storyItem.dialogId = d4Var.y1;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(d4Var.z2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new nh.v3(messageObject, false, chat.id));
                break;
            case 2:
                ((VideoAds) obj4).lambda$show$7((o70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 3:
                o70 F = o70.F(((org.telegram.ui.ActionBar.g3) obj4).getContainer(), (org.telegram.ui.ActionBar.f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (m2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 4:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.i4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 5:
                z01 z01Var = (z01) obj2;
                e11.U(z01Var.a, z01Var.b, ((org.telegram.ui.Components.f4) obj4).getValue() + 1, (((org.telegram.ui.Components.g4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 6:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.d4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 7:
                ((h8) obj4).a();
                org.telegram.ui.Components.z4.k((Context) obj3, (org.telegram.ui.ActionBar.f6) obj2, new org.telegram.ui.Components.t((g8) obj, 13));
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                vb0 vb0Var = (vb0) obj2;
                si0 si0Var = (si0) obj;
                chatActivityEnterView.N4 = !chatActivityEnterView.N4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.N4;
                }
                vb0Var.a(!chatActivityEnterView.N4, true);
                if (!arrayList2.isEmpty()) {
                    si0Var.f((MessageObject) arrayList2.get(0));
                }
                si0Var.n(!chatActivityEnterView.N4);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                si0 si0Var2 = (si0) obj;
                int i14 = ChatActivityEnterView.j5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        MessageObject messageObject3 = arrayList3.get(i15);
                        i15++;
                        messageObject3.messageOwner.invert_media = chatActivityEnterView2.N4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject2.messageOwner.invert_media = chatActivityEnterView2.N4;
                }
                chatActivityEnterView2.d0();
                si0Var2.h(true);
                chatActivityEnterView2.N4 = false;
                break;
            case 10:
                li liVar = (li) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
                if (chatAttachAlertPhotoLayout != null) {
                    ja.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new dh.v(14, liVar, g1Var), f6Var);
                    break;
                }
                break;
            case 11:
                x80 x80Var = (x80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                float[] fArr = x80Var.F;
                FrameLayout frameLayout = x80Var.n;
                if (x80Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!x80Var.x && x80Var.D) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
                        g1Var2.setOnClickListener(new q80(x80Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.b6.n(-1, 48));
                    g1Var3.setOnClickListener(new q80(x80Var, 2));
                    int i16 = 3;
                    if (x80Var.C) {
                        c3 = 1;
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c3 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i17 = j6.p7;
                        g1Var4.c(j6.w0(null, i17, false), j6.w0(null, i17, false));
                        g1Var4.setOnClickListener(new q80(x80Var, i16));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, k7.b6.n(-1, 48));
                    }
                    FrameLayout overlayContainerView = g3Var == null ? p2Var.getParentLayout().getOverlayContainerView() : g3Var.getContainer();
                    if (overlayContainerView != null) {
                        x80.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[c3];
                        eg.i0 i0Var = new eg.i0(x80Var, context2, overlayContainerView, 6);
                        ba baVar = new ba(i0Var, i16);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(baVar);
                        overlayContainerView.addView(i0Var, k7.b6.c(-1.0f, -1));
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        x80Var.s = p1Var;
                        p1Var.setOnDismissListener(new t80(x80Var, i0Var, overlayContainerView, baVar, 0));
                        x80Var.s.setOutsideTouchable(true);
                        x80Var.s.setFocusable(true);
                        x80Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        x80Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        x80Var.s.setInputMethodMode(2);
                        x80Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new p80(x80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        x80Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 12:
                wf0 wf0Var = (wf0) obj4;
                o70 H = o70.H(wf0Var.v, wf0Var.a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new a30(wf0Var, (String) obj3, (String) obj2, (String) obj, 12), false);
                H.V(5);
                H.Z();
                break;
            case 13:
                o70 G = o70.G(((p31) obj4).container, (org.telegram.ui.ActionBar.f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                break;
            case 14:
                rh.m mVar = (rh.m) obj4;
                xn xnVar = (xn) obj3;
                MessageObject messageObject4 = (MessageObject) obj2;
                String str = (String) obj;
                if (xnVar != null) {
                    mVar.getClass();
                    xnVar.J9(messageObject4, false, false);
                }
                af.g.r(mVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                ph.d dVar = (ph.d) obj;
                strArr[0] = ((rh.i1) obj3).a;
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj5 = arrayList4.get(i18);
                    i18++;
                    rh.h1 h1Var = (rh.h1) obj5;
                    h1Var.b.a(TextUtils.equals(h1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            default:
                boolean[] zArr = (boolean[]) obj4;
                gg.c1 c1Var = (gg.c1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c1Var.run(strArr2[0]);
                }
                g3Var2.dismiss();
                break;
        }
    }

    public /* synthetic */ u3(h8 h8Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, g8 g8Var) {
        this.a = 7;
        this.b = h8Var;
        this.c = context;
        this.d = f6Var;
        this.e = g8Var;
    }
}
