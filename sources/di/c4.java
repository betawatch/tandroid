package di;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.dd;
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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.c31;
import org.telegram.ui.e11;
import org.telegram.ui.j11;
import org.telegram.ui.pi0;
import org.telegram.ui.qf0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c4(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        ?? r22;
        float f7;
        int i10 = this.a;
        int i11 = 13;
        TL_stars.SavedStarGift savedStarGift = null;
        int i12 = -1;
        int i13 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                y9 y9Var = (y9) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                q4 q4Var = ((h4) obj4).l;
                h4 h4Var = q4Var.i1;
                if (h4Var != null) {
                    h4Var.a();
                }
                storyItem.dialogId = q4Var.q1;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(q4Var.r2, storyItem);
                messageObject.generateThumbs(false);
                y9Var.I(new g4(messageObject, false, chat.id));
                break;
            case 1:
                hi.u uVar = (hi.u) obj4;
                wn wnVar = (wn) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (wnVar != null) {
                    uVar.getClass();
                    wnVar.W9(messageObject2, false, false);
                }
                qf.d.q(uVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                fi.d dVar = (fi.d) obj;
                strArr[0] = ((hi.v1) obj3).a;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    hi.u1 u1Var = (hi.u1) obj5;
                    u1Var.b.a(TextUtils.equals(u1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a0Var.run(strArr2[0]);
                }
                k3Var.dismiss();
                break;
            case 4:
                ((VideoAds) obj4).lambda$show$7((l80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 5:
                l80 F = l80.F(((org.telegram.ui.ActionBar.k3) obj4).getContainer(), (org.telegram.ui.ActionBar.u6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (ig.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 6:
                ((org.telegram.ui.Components.e5) obj2).G(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.e3) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 7:
                e11 e11Var = (e11) obj2;
                j11.V(e11Var.a, e11Var.b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.e3) obj).a.dismissRunnable;
                runnable2.run();
                break;
            case 8:
                ((org.telegram.ui.Components.e5) obj2).G(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.e3) obj).a.dismissRunnable;
                runnable3.run();
                break;
            case 9:
                ((org.telegram.ui.Components.r8) obj4).a();
                org.telegram.ui.Components.g5.k((Context) obj3, (org.telegram.ui.ActionBar.u6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.q8) obj, i11));
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                nc0 nc0Var = (nc0) obj2;
                pi0 pi0Var = (pi0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    ((MessageObject) arrayList2.get(i15)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                nc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    pi0Var.e((MessageObject) arrayList2.get(0));
                }
                pi0Var.m(!chatActivityEnterView.R4);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                pi0 pi0Var2 = (pi0) obj;
                int i16 = ChatActivityEnterView.r5;
                chatActivityEnterView2.getClass();
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        MessageObject messageObject4 = arrayList3.get(i17);
                        i17++;
                        messageObject4.messageOwner.invert_media = chatActivityEnterView2.R4;
                    }
                    groupedMessages.calculate();
                } else {
                    messageObject3.messageOwner.invert_media = chatActivityEnterView2.R4;
                }
                chatActivityEnterView2.Z();
                pi0Var2.g(true);
                chatActivityEnterView2.R4 = false;
                break;
            case 12:
                ti tiVar = (ti) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
                if (chatAttachAlertPhotoLayout != null) {
                    dd.f1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new bi.m5(i11, tiVar, g1Var), u6Var);
                    break;
                }
                break;
            case 13:
                s90 s90Var = (s90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                float[] fArr = s90Var.I;
                FrameLayout frameLayout = s90Var.n;
                if (s90Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!s90Var.x && s90Var.G) {
                        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                        g1Var2.j(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, kb1.r(-1, 48));
                        g1Var2.setOnClickListener(new l90(s90Var, i13));
                    }
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(context2, true, false);
                    g1Var3.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, kb1.r(-1, 48));
                    g1Var3.setOnClickListener(new l90(s90Var, 2));
                    int i18 = 3;
                    if (s90Var.F) {
                        r22 = 1;
                    } else {
                        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(context2, false, true);
                        r22 = 1;
                        g1Var4.j(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i19 = org.telegram.ui.ActionBar.y6.p7;
                        g1Var4.d(org.telegram.ui.ActionBar.y6.x0(null, i19, false), org.telegram.ui.ActionBar.y6.x0(null, i19, false));
                        g1Var4.setOnClickListener(new l90(s90Var, i18));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var4, kb1.r(-1, 48));
                    }
                    FrameLayout overlayContainerView = k3Var2 == null ? r2Var.getParentLayout().getOverlayContainerView() : k3Var2.getContainer();
                    if (overlayContainerView != null) {
                        s90.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[r22];
                        fi.f6 f6Var = new fi.f6(s90Var, context2, overlayContainerView, 8);
                        org.telegram.ui.Cells.ha haVar = new org.telegram.ui.Cells.ha(f6Var, i18);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(haVar);
                        overlayContainerView.addView(f6Var, kb1.g(-1.0f, -1));
                        f6Var.setAlpha(0.0f);
                        f6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        s90Var.s = o1Var;
                        o1Var.setOnDismissListener(new o90(s90Var, f6Var, overlayContainerView, haVar, 0));
                        boolean z10 = r22;
                        s90Var.s.setOutsideTouchable(z10);
                        s90Var.s.setFocusable(z10);
                        s90Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        s90Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        s90Var.s.setInputMethodMode(2);
                        s90Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new k90(s90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        s90Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 14:
                qf0 qf0Var = (qf0) obj4;
                l80 H = l80.H(qf0Var.v, qf0Var.a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new e10(qf0Var, (String) obj3, (String) obj2, (String) obj, 28), false);
                H.V(5);
                H.Z();
                break;
            case 15:
                l80 G = l80.G(((c31) obj4).container, (org.telegram.ui.ActionBar.u6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                break;
            default:
                zh.q2 q2Var = (zh.q2) obj4;
                bi.t9 t9Var = (bi.t9) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList i20 = t9Var.i();
                int i21 = 0;
                while (true) {
                    if (i21 < i20.size()) {
                        if (((TL_stars.SavedStarGift) i20.get(i21)).gift.id == q2Var.b) {
                            savedStarGift = (TL_stars.SavedStarGift) i20.get(i21);
                            i12 = i21;
                        } else {
                            i21++;
                        }
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i20.set(i12, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = t9Var.l;
                    arrayList4.removeAll(i20);
                    if (t9Var.e && !t9Var.c) {
                        Collections.sort(arrayList4, new a4.d(4));
                    }
                    arrayList4.addAll(0, i20);
                    NotificationCenter.getInstance(t9Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(t9Var.b), t9Var);
                    t9Var.n();
                    q2Var.dismiss();
                    ((wc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, bi.h7.X1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, bi.h7.X1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c4(org.telegram.ui.Components.r8 r8Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.q8 q8Var) {
        this.a = 9;
        this.b = r8Var;
        this.c = context;
        this.d = u6Var;
        this.e = q8Var;
    }
}
