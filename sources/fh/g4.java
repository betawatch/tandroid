package fh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import gh.n7;
import gh.oa;
import ih.m9;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.x70;
import org.telegram.ui.d31;
import org.telegram.ui.li0;
import org.telegram.ui.n01;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.s01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        char c10;
        float f10;
        int i9 = this.a;
        TL_stars.SavedStarGift savedStarGift = null;
        int i10 = -1;
        int i11 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i9) {
            case 0:
                i4 i4Var = (i4) obj4;
                n7 n7Var = (n7) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = n7Var.h();
                int i12 = 0;
                while (true) {
                    if (i12 < h.size()) {
                        if (((TL_stars.SavedStarGift) h.get(i12)).gift.id == i4Var.b) {
                            savedStarGift = (TL_stars.SavedStarGift) h.get(i12);
                            i10 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i10, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList = n7Var.l;
                    arrayList.removeAll(h);
                    if (n7Var.e && !n7Var.c) {
                        Collections.sort(arrayList, new a5.e(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(n7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n7Var.b), n7Var);
                    n7Var.l();
                    i4Var.dismiss();
                    ((oc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, gh.k5.D1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, gh.k5.D1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                m9 m9Var = (m9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ih.i4 i4Var2 = ((ih.b4) obj4).l;
                ih.b4 b4Var = i4Var2.p1;
                if (b4Var != null) {
                    b4Var.a();
                }
                storyItem.dialogId = i4Var2.x1;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(i4Var2.y2, storyItem);
                messageObject.generateThumbs(false);
                m9Var.H(new ih.a4(messageObject, false, chat.id));
                break;
            case 2:
                mh.n nVar = (mh.n) obj4;
                qn qnVar = (qn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (qnVar != null) {
                    nVar.getClass();
                    qnVar.J9(messageObject2, false, false);
                }
                ve.e.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 3:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                kh.d dVar = (kh.d) obj;
                strArr[0] = ((mh.o1) obj3).a;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList2.get(i13);
                    i13++;
                    mh.n1 n1Var = (mh.n1) obj5;
                    n1Var.b.a(TextUtils.equals(n1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj4;
                bg.j1 j1Var = (bg.j1) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j1Var.run(strArr2[0]);
                }
                f3Var.dismiss();
                break;
            case 5:
                ((VideoAds) obj4).lambda$show$7((x60) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 6:
                x60 F = x60.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.b6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (u2) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 7:
                ((org.telegram.ui.Components.x4) obj2).B(((int[]) obj4)[((org.telegram.ui.Components.h4) obj3).getValue()] * 60, 0, true);
                ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable.run();
                break;
            case 8:
                n01 n01Var = (n01) obj2;
                s01.T(n01Var.a, n01Var.b, ((org.telegram.ui.Components.e4) obj4).getValue() + 1, (((org.telegram.ui.Components.f4) obj3).getValue() + 1) * 60);
                ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable.run();
                break;
            case 9:
                ((org.telegram.ui.Components.x4) obj2).B(((int[]) obj4)[((org.telegram.ui.Components.c4) obj3).getValue()], 0, true);
                ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable.run();
                break;
            case 10:
                ((h8) obj4).a();
                org.telegram.ui.Components.y4.k((Context) obj3, (org.telegram.ui.ActionBar.b6) obj2, new org.telegram.ui.Components.s((g8) obj, 13));
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                bb0 bb0Var = (bb0) obj2;
                li0 li0Var = (li0) obj;
                chatActivityEnterView.M4 = !chatActivityEnterView.M4;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    ((MessageObject) arrayList3.get(i14)).messageOwner.invert_media = chatActivityEnterView.M4;
                }
                bb0Var.a(!chatActivityEnterView.M4, true);
                if (!arrayList3.isEmpty()) {
                    li0Var.f((MessageObject) arrayList3.get(0));
                }
                li0Var.n(!chatActivityEnterView.M4);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                li0 li0Var2 = (li0) obj;
                int i15 = ChatActivityEnterView.i5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList4 = groupedMessages.messages;
                    int size2 = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        MessageObject messageObject4 = arrayList4.get(i16);
                        i16++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.M4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.M4;
                }
                chatActivityEnterView2.c0();
                li0Var2.h(true);
                chatActivityEnterView2.M4 = false;
                break;
            case 13:
                ki kiVar = (ki) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
                if (chatAttachAlertPhotoLayout != null) {
                    oa.g1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bg.y0(15, kiVar, g1Var), b6Var);
                    break;
                }
                break;
            case 14:
                e80 e80Var = (e80) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                float[] fArr = e80Var.E;
                FrameLayout frameLayout = e80Var.n;
                if (e80Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!e80Var.x && e80Var.C) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, g7.e6.n(-1, 48));
                        g1Var2.setOnClickListener(new x70(e80Var, i11));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, g7.e6.n(-1, 48));
                    g1Var3.setOnClickListener(new x70(e80Var, 2));
                    int i17 = 3;
                    if (e80Var.B) {
                        c10 = 1;
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        c10 = 1;
                        g1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i18 = org.telegram.ui.ActionBar.f6.p7;
                        g1Var4.c(org.telegram.ui.ActionBar.f6.w0(null, i18, false), org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                        g1Var4.setOnClickListener(new x70(e80Var, i17));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, g7.e6.n(-1, 48));
                    }
                    FrameLayout overlayContainerView = f3Var2 == null ? o2Var.getParentLayout().getOverlayContainerView() : f3Var2.getContainer();
                    if (overlayContainerView != null) {
                        e80.a(frameLayout, overlayContainerView, fArr);
                        float f11 = fArr[c10];
                        kh.h6 h6Var = new kh.h6(e80Var, context2, overlayContainerView, 7);
                        ca caVar = new ca(h6Var, i17);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(caVar);
                        overlayContainerView.addView(h6Var, g7.e6.c(-1.0f, -1));
                        h6Var.setAlpha(0.0f);
                        h6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        e80Var.s = o1Var;
                        o1Var.setOnDismissListener(new a80(e80Var, h6Var, overlayContainerView, caVar, 0));
                        e80Var.s.setOutsideTouchable(true);
                        e80Var.s.setFocusable(true);
                        e80Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        e80Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        e80Var.s.setInputMethodMode(2);
                        e80Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new w70(e80Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f11 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f10 = 0.0f;
                        }
                        e80Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f11 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 15:
                of0 of0Var = (of0) obj4;
                x60 H = x60.H(of0Var.v, of0Var.a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new no0(of0Var, (String) obj3, (String) obj2, (String) obj, 20), false);
                H.V(5);
                H.Z();
                break;
            default:
                x60 G = x60.G(((d31) obj4).container, (org.telegram.ui.ActionBar.b6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                break;
        }
    }

    public /* synthetic */ g4(h8 h8Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, g8 g8Var) {
        this.a = 10;
        this.b = h8Var;
        this.c = context;
        this.d = b6Var;
        this.e = g8Var;
    }
}
