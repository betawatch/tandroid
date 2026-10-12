package bi;

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
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.c21;
import org.telegram.ui.es0;
import org.telegram.ui.fo;
import org.telegram.ui.hj0;
import org.telegram.ui.kg0;
import org.telegram.ui.n41;
import org.telegram.ui.x11;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                sb sbVar = (sb) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                q5 q5Var = ((h5) obj4).l;
                h5 h5Var = q5Var.t1;
                if (h5Var != null) {
                    h5Var.a();
                }
                storyItem.dialogId = q5Var.B1;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject = new MessageObject(q5Var.C2, storyItem);
                messageObject.generateThumbs(false);
                sbVar.H(new g5(messageObject, false, chat.id));
                break;
            case 1:
                fi.n nVar = (fi.n) obj4;
                fo foVar = (fo) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                String str = (String) obj;
                if (foVar != null) {
                    nVar.getClass();
                    foVar.O9(messageObject2, false, false);
                }
                pf.d.r(nVar.getContext(), Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 2:
                String[] strArr = (String[]) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                di.d dVar = (di.d) obj;
                strArr[0] = ((fi.r1) obj3).a;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    fi.q1 q1Var = (fi.q1) obj5;
                    q1Var.b.a(TextUtils.equals(q1Var.a, strArr[0]), true);
                }
                dVar.setEnabled(strArr[0] != null);
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.web.z zVar = (org.telegram.ui.web.z) obj3;
                String[] strArr2 = (String[]) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    zVar.run(strArr2[0]);
                }
                e3Var.dismiss();
                break;
            case 4:
                ((VideoAds) obj4).lambda$show$7((m80) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 5:
                m80 F = m80.F(((org.telegram.ui.ActionBar.e3) obj4).getContainer(), (org.telegram.ui.ActionBar.c6) obj3, (ImageView) obj2);
                F.c(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (hg.d1) obj, false);
                F.Y = true;
                F.a0(0.0f, -AndroidUtilities.dp(6.0f));
                F.s = 0;
                F.Z();
                break;
            case 6:
                ((org.telegram.ui.Components.f5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.p4) obj3).getValue()] * 60, 0, true);
                runnable = ((org.telegram.ui.ActionBar.z2) obj).a.dismissRunnable;
                runnable.run();
                break;
            case 7:
                x11 x11Var = (x11) obj2;
                c21.U(x11Var.a, x11Var.b, ((org.telegram.ui.Components.m4) obj4).getValue() + 1, (((org.telegram.ui.Components.n4) obj3).getValue() + 1) * 60);
                runnable2 = ((org.telegram.ui.ActionBar.z2) obj).a.dismissRunnable;
                runnable2.run();
                break;
            case 8:
                ((org.telegram.ui.Components.f5) obj2).J(((int[]) obj4)[((org.telegram.ui.Components.k4) obj3).getValue()], 0, true);
                runnable3 = ((org.telegram.ui.ActionBar.z2) obj).a.dismissRunnable;
                runnable3.run();
                break;
            case 9:
                ((org.telegram.ui.Components.s8) obj4).a();
                org.telegram.ui.Components.g5.j((Context) obj3, (org.telegram.ui.ActionBar.c6) obj2, new org.telegram.ui.Components.s((org.telegram.ui.Components.r8) obj, 13));
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                uc0 uc0Var = (uc0) obj2;
                hj0 hj0Var = (hj0) obj;
                chatActivityEnterView.R4 = !chatActivityEnterView.R4;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).messageOwner.invert_media = chatActivityEnterView.R4;
                }
                uc0Var.a(!chatActivityEnterView.R4, true);
                if (!arrayList2.isEmpty()) {
                    hj0Var.f((MessageObject) arrayList2.get(0));
                }
                hj0Var.n(!chatActivityEnterView.R4);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                hj0 hj0Var2 = (hj0) obj;
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
                hj0Var2.h(true);
                chatActivityEnterView2.R4 = false;
                break;
            case 12:
                vi viVar = (vi) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
                if (chatAttachAlertPhotoLayout != null) {
                    zh.p7.h1(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new f0(9, viVar, e1Var), c6Var);
                    break;
                }
                break;
            case 13:
                w90 w90Var = (w90) obj4;
                Context context2 = (Context) obj3;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                float[] fArr = w90Var.I;
                FrameLayout frameLayout = w90Var.n;
                if (w90Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context2, null);
                    if (!w90Var.x && w90Var.G) {
                        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                        e1Var2.g(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.a6.n(-1, 48));
                        e1Var2.setOnClickListener(new p90(w90Var, c10 == true ? 1 : 0));
                    }
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(context2, true, false);
                    e1Var3.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.a6.n(-1, 48));
                    e1Var3.setOnClickListener(new p90(w90Var, i12));
                    int i17 = 3;
                    if (!w90Var.F) {
                        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(context2, false, true);
                        e1Var4.g(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i18 = org.telegram.ui.ActionBar.g6.p7;
                        e1Var4.c(org.telegram.ui.ActionBar.g6.x0(null, i18, false), org.telegram.ui.ActionBar.g6.x0(null, i18, false));
                        e1Var4.setOnClickListener(new p90(w90Var, i17));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var4, w7.a6.n(-1, 48));
                    }
                    FrameLayout overlayContainerView = e3Var2 == null ? m2Var.getParentLayout().getOverlayContainerView() : e3Var2.getContainer();
                    if (overlayContainerView != null) {
                        w90.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        di.p6 p6Var = new di.p6(w90Var, context2, overlayContainerView, 7);
                        org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(p6Var, i17);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(daVar);
                        overlayContainerView.addView(p6Var, w7.a6.d(-1.0f, -1));
                        p6Var.setAlpha(0.0f);
                        p6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        w90Var.s = m1Var;
                        m1Var.setOnDismissListener(new s90(w90Var, p6Var, overlayContainerView, daVar, 0));
                        w90Var.s.setOutsideTouchable(true);
                        w90Var.s.setFocusable(true);
                        w90Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        w90Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        w90Var.s.setInputMethodMode(2);
                        w90Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new o90(w90Var, 2));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f7 = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f7 = 0.0f;
                        }
                        w90Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f7), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 14:
                kg0 kg0Var = (kg0) obj4;
                m80 H = m80.H(kg0Var.v, kg0Var.a);
                H.c(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new gq0(kg0Var, (String) obj3, (String) obj2, (String) obj, 20), false);
                H.V(5);
                H.Z();
                break;
            case 15:
                m80 G = m80.G(((n41) obj4).container, (org.telegram.ui.ActionBar.c6) obj2, (ImageView) obj, true);
                G.V(5);
                G.t = false;
                G.a0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((Utilities.Callback) obj3).run(G);
                break;
            default:
                yh.p2 p2Var = (yh.p2) obj4;
                zh.f5 f5Var = (zh.f5) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj;
                ArrayList h = f5Var.h();
                int i19 = 0;
                while (true) {
                    if (i19 >= h.size()) {
                        savedStarGift = null;
                        i10 = -1;
                    } else if (((TL_stars.SavedStarGift) h.get(i19)).gift.id == p2Var.b) {
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
                    ArrayList arrayList4 = f5Var.l;
                    arrayList4.removeAll(h);
                    if (f5Var.e && !f5Var.c) {
                        Collections.sort(arrayList4, new es0(28));
                    }
                    arrayList4.addAll(0, h);
                    NotificationCenter.getInstance(f5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.b), f5Var);
                    f5Var.l();
                    p2Var.dismiss();
                    ((zc) callback0Return.run()).M(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, zh.r3.E1(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, zh.r3.E1(savedStarGift.gift)), R.raw.ic_pin).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b5(org.telegram.ui.Components.s8 s8Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.r8 r8Var) {
        this.a = 9;
        this.b = s8Var;
        this.c = context;
        this.d = c6Var;
        this.e = r8Var;
    }
}
