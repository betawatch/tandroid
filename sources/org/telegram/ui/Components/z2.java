package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.ky0 ky0Var = (org.telegram.ui.ky0) this.c;
                if (zArr[0]) {
                    ky0Var.run();
                    break;
                }
                break;
            case 1:
                aa aaVar = (aa) this.b;
                TLObject tLObject = (TLObject) this.c;
                aaVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    aaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 2:
                mc mcVar = (mc) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                mcVar.n = true;
                ViewParent viewParent = mcVar.e;
                if (viewParent instanceof sb) {
                    tb tbVar = (tb) ((sb) viewParent);
                    tbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(tbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(tbVar.b, true, false, true);
                }
                mcVar.i(true);
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 4:
                ((ed) this.b).removeView((nh.t3) this.c);
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                nh.t3 t3Var = (nh.t3) this.c;
                int i10 = ChatActivityEnterView.i5;
                chatActivityEnterView.removeView(t3Var);
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.S = null;
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                ld ldVar = (ld) this.c;
                int i12 = ChatActivityEnterView.i5;
                ldVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.M, chatActivityEnterView3.L2, true);
                break;
            case 8:
                lg lgVar = (lg) this.b;
                ig igVar = (ig) this.c;
                ChatActivityEnterView chatActivityEnterView4 = lgVar.R;
                chatActivityEnterView4.e1 = chatActivityEnterView4.d1.getAudioRightMs() - chatActivityEnterView4.d1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.d1.getAudioLeftMs(), chatActivityEnterView4.d1.getAudioRightMs(), igVar);
                break;
            case 9:
                ((ni) this.b).containerView.removeView((nh.t3) this.c);
                break;
            case 10:
                ni niVar = (ni) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                niVar.dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 11:
                ni niVar2 = (ni) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((gi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                niVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(niVar2.F1).updateAttachMenuBotsInCache();
                break;
            case 12:
                ni niVar3 = (ni) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(niVar3.F1).loadAttachMenuBots(false, true);
                if (niVar3.u0 == niVar3.t0.get(tL_attachMenuBot2.bot_id)) {
                    niVar3.Q1(niVar3.f0);
                    break;
                }
                break;
            case 13:
                yi yiVar = (yi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                yiVar.D = false;
                yiVar.E = arrayList;
                yiVar.P();
                break;
            case 14:
                yi yiVar2 = (yi) this.b;
                ((ni) this.c).Z0();
                yiVar2.K();
                yiVar2.b.X1(yiVar2, 0);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new z2(16, (rj) this.b, ((qj) this.c).run()));
                break;
            case 16:
                ((rj) this.b).setStatus((CharSequence) this.c);
                break;
            case 17:
                ik ikVar = (ik) this.b;
                String str = (String) this.c;
                ikVar.getClass();
                ArrayList arrayList2 = new ArrayList(ikVar.T.v.c);
                if (ikVar.T.v.d.isEmpty()) {
                    arrayList2.addAll(0, ikVar.T.v.e);
                }
                Utilities.searchQueue.postRunnable(new ag.w0(ikVar, str, !ikVar.N.isEmpty(), arrayList2, 15));
                break;
            case 18:
                ik ikVar2 = (ik) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                jk jkVar = ikVar2.T;
                boolean z10 = jkVar.U;
                xj xjVar = jkVar.r;
                if (z10) {
                    f2.p0 adapter = xjVar.getAdapter();
                    ik ikVar3 = jkVar.y;
                    if (adapter != ikVar3) {
                        xjVar.setAdapter(ikVar3);
                    }
                }
                ikVar2.s = arrayList3;
                ikVar2.l();
                break;
            case 19:
                bl blVar = (bl) this.b;
                float[] fArr = (float[]) this.c;
                blVar.getClass();
                blVar.b0(fArr[0], fArr[1]);
                break;
            case 20:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                fi fiVar = (fi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                int currentItemTop = fiVar.getCurrentItemTop();
                int listTopPadding = fiVar.getListTopPadding();
                ol olVar = chatAttachAlertPhotoLayout.A;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                olVar.scrollBy(0, listTopPadding);
                break;
            case 21:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                yl ylVar = chatAttachAlertPhotoLayout2.L;
                if (ylVar != null) {
                    ylVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 22:
                lm lmVar = (lm) this.b;
                fi fiVar2 = (fi) this.c;
                int currentItemTop2 = fiVar2.getCurrentItemTop();
                int listTopPadding2 = fiVar2.getListTopPadding();
                jh.e1 e1Var = lmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                e1Var.scrollBy(0, listTopPadding2);
                break;
            case 23:
                ao aoVar = (ao) this.b;
                sf.h hVar = (sf.h) this.c;
                co.a(aoVar.c);
                hVar.run();
                break;
            case 24:
                ((bp) this.b).b.x((List) this.c);
                break;
            case 25:
                ((cp) this.b).b.x((List) this.c);
                break;
            case 26:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                ye.d.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 27:
                fr frVar = (fr) this.b;
                nh.d dVar = (nh.d) this.c;
                frVar.getClass();
                dVar.setLoading(false);
                frVar.dismiss();
                break;
            case 28:
                fr frVar2 = (fr) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                    frVar2.X = groupcallstreamrtmpurl.url;
                    frVar2.Y = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(frVar2.Y);
                    frVar2.Z = spannableStringBuilder;
                    h01 h01Var = new h01();
                    h01Var.a |= 256;
                    h01Var.b = 0;
                    h01Var.c = spannableStringBuilder.length();
                    frVar2.Z.setSpan(new i01(h01Var, 0), 0, frVar2.Z.length(), 0);
                    frVar2.a0.N(false);
                    break;
                }
                break;
            default:
                ks ksVar = (ks) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hs hsVar = ksVar.b;
                ArrayList arrayList4 = ksVar.h;
                int i13 = ksVar.a;
                if (tLObject3 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject3;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    ksVar.g = str2;
                    ksVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    ksVar.f = currentTimeMillis;
                    if (!ksVar.i) {
                        ksVar.i = true;
                        String str3 = ksVar.g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList4.size(); i14 = a4.w.g(((TLRPC.User) arrayList4.get(i14)).id, arrayList5, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new ih.h1(ksVar, messagesStorage, arrayList5, currentTimeMillis, str4, 11));
                    }
                    ksVar.c = false;
                    hsVar.run();
                    break;
                } else {
                    ksVar.g = null;
                    ksVar.e = true;
                    ksVar.c = false;
                    hsVar.run();
                    break;
                }
        }
    }
}
