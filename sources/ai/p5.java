package ai;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yi;
import org.telegram.ui.dj0;
import org.telegram.ui.fg0;
import org.telegram.ui.h41;
import org.telegram.ui.mb1;
import org.telegram.ui.q11;
import org.telegram.ui.v11;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        float f7;
        TL_stars.SavedStarGift savedStarGift;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        char c10 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i11) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                kc kcVar = (kc) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                f6 f6Var = ((w5) obj4).l;
                w5 w5Var = f6Var.t1;
                if (w5Var != null) {
                    w5Var.a();
                }
                storyItem.dialogId = f6Var.B1;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(f6Var.C2, storyItem);
                messageObject.generateThumbs(false);
                kcVar.H(new v5(messageObject, false, chat.id));
                break;
            case 1:
                ei.n nVar = (ei.n) obj4;
                zn znVar = (zn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (znVar != null) {
                    nVar.getClass();
                    znVar.O9(messageObject2, false, false);
                }
                of.f.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                ci.d dVar = (ci.d) obj;
                strArr[0] = ((ei.s1) obj3).a;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    ei.r1 r1Var = (ei.r1) obj5;
                    r1Var.b.a(TextUtils.equals(r1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.z zVar = (org.telegram.ui.web.z) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    zVar.run(strArr2[0]);
                }
                f3Var.dismiss();
                break;
            case 4:
                ((VideoAds) obj4).lambda$show$7((p80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 5:
                p80 F = p80.F(((org.telegram.ui.ActionBar.f3) obj4).getContainer(), (org.telegram.ui.ActionBar.e6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (gg.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 6:
                ((org.telegram.ui.Components.f5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 7:
                q11 q11Var = (q11) obj2;
                v11.U(q11Var.a, q11Var.b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable2.run();
                break;
            case 8:
                ((org.telegram.ui.Components.f5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.a3) obj).a.dismissRunnable;
                runnable3.run();
                break;
            case 9:
                ((org.telegram.ui.Components.q8) obj4).a();
                org.telegram.ui.Components.g5.j((Context) obj3, (org.telegram.ui.ActionBar.e6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.p8) obj, 13));
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                uc0 uc0Var = (uc0) obj2;
                dj0 dj0Var = (dj0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                uc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    dj0Var.f((MessageObject) arrayList2.get(0));
                }
                dj0Var.n(!chatActivityEnterView.R4);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                dj0 dj0Var2 = (dj0) obj;
                int i15 = ChatActivityEnterView.n5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        MessageObject messageObject4 = arrayList3.get(i16);
                        i16++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.R4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.b0();
                dj0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                break;
            case 12:
                yi yiVar = (yi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
                if (chatAttachAlertPhotoLayout != null) {
                    yh.p7.h1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new m0(9, yiVar, f1Var), e6Var);
                    break;
                }
                break;
            case 13:
                x90 x90Var = (x90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                float[] fArr = x90Var.I;
                FrameLayout frameLayout = x90Var.n;
                if (x90Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!x90Var.x && x90Var.G) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                        f1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                        f1Var2.setOnClickListener(new q90(x90Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(context2, true, false);
                    f1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, w7.x5.n(-1, 48));
                    f1Var3.setOnClickListener(new q90(x90Var, i12));
                    int i17 = 3;
                    if (!x90Var.F) {
                        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(context2, false, true);
                        f1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i18 = org.telegram.ui.ActionBar.i6.p7;
                        f1Var4.c(org.telegram.ui.ActionBar.i6.x0(null, i18, false), org.telegram.ui.ActionBar.i6.x0(null, i18, false));
                        f1Var4.setOnClickListener(new q90(x90Var, i17));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var4, w7.x5.n(-1, 48));
                    }
                    FrameLayout overlayContainerView = f3Var2 == null ? n2Var.getParentLayout().getOverlayContainerView() : f3Var2.getContainer();
                    if (overlayContainerView != null) {
                        x90.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        ci.r6 r6Var = new ci.r6(x90Var, context2, overlayContainerView, 7);
                        org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(r6Var, i17);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(daVar);
                        overlayContainerView.addView(r6Var, w7.x5.d(-1.0f, -1));
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        x90Var.s = n1Var;
                        n1Var.setOnDismissListener(new t90(x90Var, r6Var, overlayContainerView, daVar, 0));
                        x90Var.s.setOutsideTouchable(true);
                        x90Var.s.setFocusable(true);
                        x90Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        x90Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        x90Var.s.setInputMethodMode(2);
                        x90Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new p90(x90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        x90Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 14:
                fg0 fg0Var = (fg0) obj4;
                p80 H = p80.H(fg0Var.v, fg0Var.a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new oo0(fg0Var, (String) obj3, (String) obj2, (String) obj, 22), false);
                H.V(5);
                H.Z();
                break;
            case 15:
                p80 G = p80.G(((h41) obj4).container, (org.telegram.ui.ActionBar.e6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                break;
            default:
                xh.r2 r2Var = (xh.r2) obj4;
                yh.e5 e5Var = (yh.e5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = e5Var.h();
                int i19 = 0;
                while (true) {
                    if (i19 >= h.size()) {
                        savedStarGift = null;
                        i10 = -1;
                    } else if (((TL_stars.SavedStarGift) h.get(i19)).gift.id == r2Var.b) {
                        savedStarGift = (TL_stars.SavedStarGift) h.get(i19);
                        i10 = i19;
                    } else {
                        i19++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    h.set(i10, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = e5Var.l;
                    arrayList4.removeAll(h);
                    if (e5Var.e && !e5Var.c) {
                        Collections.sort(arrayList4, new mb1(24));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(e5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(e5Var.b), e5Var);
                    e5Var.l();
                    r2Var.dismiss();
                    ((ad) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, yh.s3.E1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, yh.s3.E1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p5(org.telegram.ui.Components.q8 q8Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.p8 p8Var) {
        this.a = 9;
        this.b = q8Var;
        this.c = context;
        this.d = e6Var;
        this.e = p8Var;
    }
}
