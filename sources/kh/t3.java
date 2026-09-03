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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.c30;
import org.telegram.ui.g11;
import org.telegram.ui.l11;
import org.telegram.ui.ui0;
import org.telegram.ui.w31;
import org.telegram.ui.yf0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                v3 v3Var = (v3) obj4;
                l7 l7Var = (l7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = l7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.id == v3Var.b) {
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
                        Collections.sort(arrayList, new e5.e(19));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(l7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.b), l7Var);
                    l7Var.l();
                    v3Var.dismiss();
                    ((qc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, lh.g5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, lh.g5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                i9 i9Var = (i9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                nh.d4 d4Var = ((nh.w3) obj4).l;
                nh.w3 w3Var = d4Var.q1;
                if (w3Var != null) {
                    w3Var.a();
                }
                storyItem.dialogId = d4Var.y1;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(d4Var.z2, storyItem);
                messageObject.generateThumbs(false);
                i9Var.H(new nh.v3(messageObject, false, chat.id));
                break;
            case 2:
                ((VideoAds) obj4).lambda$show$7((p70) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 3:
                p70 F = p70.F(((org.telegram.ui.ActionBar.g3) obj4).getContainer(), (f6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (l2) obj, false);
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
                g11 g11Var = (g11) obj2;
                l11.U(g11Var.a, g11Var.b, ((org.telegram.ui.Components.f4) obj4).getValue() + 1, (((org.telegram.ui.Components.g4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 6:
                ((org.telegram.ui.Components.y4) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.d4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.b3) obj).a.dismissRunnable.run();
                break;
            case 7:
                ((h8) obj4).a();
                org.telegram.ui.Components.z4.k((Context) obj3, (f6) obj2, new org.telegram.ui.Components.t((g8) obj, 13));
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                wb0 wb0Var = (wb0) obj2;
                ui0 ui0Var = (ui0) obj;
                chatActivityEnterView.N4 = !chatActivityEnterView.N4;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ((MessageObject) arrayList2.get(i13)).messageOwner.invert_media = chatActivityEnterView.N4;
                }
                wb0Var.a(!chatActivityEnterView.N4, true);
                if (!arrayList2.isEmpty()) {
                    ui0Var.f((MessageObject) arrayList2.get(0));
                }
                ui0Var.n(!chatActivityEnterView.N4);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                ui0 ui0Var2 = (ui0) obj;
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
                ui0Var2.h(true);
                chatActivityEnterView2.N4 = false;
                break;
            case 10:
                li liVar = (li) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                f6 f6Var = (f6) obj;
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
                        aa aaVar = new aa(i0Var, i16);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(aaVar);
                        overlayContainerView.addView(i0Var, k7.b6.c(-1.0f, -1));
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        x80Var.s = p1Var;
                        p1Var.setOnDismissListener(new t80(x80Var, i0Var, overlayContainerView, aaVar, 0));
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
                yf0 yf0Var = (yf0) obj4;
                p70 H = p70.H(yf0Var.v, yf0Var.a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new c30(yf0Var, (String) obj3, (String) obj2, (String) obj, 12), false);
                H.V(5);
                H.Z();
                break;
            case 13:
                p70 G = p70.G(((w31) obj4).container, (f6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                break;
            case 14:
                rh.l lVar = (rh.l) obj4;
                zn znVar = (zn) obj3;
                MessageObject messageObject4 = (MessageObject) obj2;
                String str = (String) obj;
                if (znVar != null) {
                    lVar.getClass();
                    znVar.J9(messageObject4, false, false);
                }
                ze.d.r(lVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 15:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                ph.d dVar = (ph.d) obj;
                strArr[0] = ((rh.h1) obj3).a;
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj5 = arrayList4.get(i18);
                    i18++;
                    rh.g1 g1Var5 = (rh.g1) obj5;
                    g1Var5.b.a(TextUtils.equals(g1Var5.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            default:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                g3Var2.dismiss();
                break;
        }
    }

    public /* synthetic */ t3(h8 h8Var, Context context, int i10, f6 f6Var, g8 g8Var) {
        this.a = 7;
        this.b = h8Var;
        this.c = context;
        this.d = f6Var;
        this.e = g8Var;
    }
}
