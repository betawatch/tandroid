package org.telegram.ui;

import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lo(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        switch (this.a) {
            case 0:
                mo moVar = (mo) this.b;
                org.telegram.ui.Components.a70 a70Var = (org.telegram.ui.Components.a70) this.c;
                moVar.y.d.P = false;
                a70Var.run();
                break;
            case 1:
                mo moVar2 = (mo) this.b;
                Runnable runnable = (Runnable) this.c;
                qo qoVar = moVar2.y.d;
                qoVar.P = false;
                qoVar.Q = false;
                runnable.run();
                break;
            case 2:
                mo moVar3 = (mo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                moVar3.getClass();
                chat.join_request = true;
                moVar3.h = true;
                moVar3.c.setChecked(true);
                break;
            case 3:
                nq nqVar = (nq) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                nqVar.getClass();
                nqVar.getMessagesController().V2(0, updates.chats.get(0).id, true);
                break;
            case 4:
                bq bqVar = (bq) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                nq nqVar2 = bqVar.a;
                if (org.telegram.ui.Components.fc.a(nqVar2)) {
                    org.telegram.ui.Components.fc.C(user.first_name, nqVar2).j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                org.telegram.messenger.e eVar = e0Var.n2;
                eVar.b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.a).sendRequest(savetone, null);
                break;
            case 6:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) this.c;
                rVar.getClass();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(tL_aiComposeTone2.author_id));
                    rVar.dismiss();
                    break;
                }
                break;
            case 7:
                boolean[] zArr = (boolean[]) this.b;
                pu0 pu0Var = (pu0) this.c;
                if (zArr[0]) {
                    pu0Var.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                acVar.n = true;
                ViewParent viewParent = acVar.e;
                if (viewParent instanceof org.telegram.ui.Components.gb) {
                    org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) ((org.telegram.ui.Components.gb) viewParent);
                    hbVar.b.setText(charSequence);
                    org.telegram.messenger.g0.V3(hbVar.d, false, false);
                    org.telegram.messenger.g0.V3(hbVar.b, true, false);
                }
                acVar.i(true);
                break;
            case 9:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable2.run();
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.Components.sc) this.b).removeView((gi.l3) this.c);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                gi.l3 l3Var = (gi.l3) this.c;
                int i3 = ChatActivityEnterView.t5;
                chatActivityEnterView.removeView(l3Var);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                if (chatActivityEnterView2.Z4 == ((org.telegram.ui.Components.f60) this.c)) {
                    chatActivityEnterView2.Z4 = null;
                    break;
                }
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i10 = ChatActivityEnterView.t5;
                chatActivityEnterView3.setFieldText(charSequence2);
                chatActivityEnterView3.a0 = null;
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.c;
                int i11 = ChatActivityEnterView.t5;
                ycVar.run();
                org.telegram.messenger.b6.n(chatActivityEnterView4.R, chatActivityEnterView4.R2);
                break;
            case 15:
                org.telegram.ui.Components.yf yfVar = (org.telegram.ui.Components.yf) this.b;
                org.telegram.ui.Components.vf vfVar = (org.telegram.ui.Components.vf) this.c;
                ChatActivityEnterView chatActivityEnterView5 = yfVar.c0;
                chatActivityEnterView5.j1 = chatActivityEnterView5.i1.getAudioRightMs() - chatActivityEnterView5.i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView5.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView5.i1.getAudioRightMs();
                if (!B.I1) {
                    if (B.k1 != null) {
                        B.N1.c(new org.telegram.messenger.f9(B, new org.telegram.messenger.je(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.g1)), audioLeftMs, audioRightMs, vfVar, 3));
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(vfVar);
                        break;
                    }
                } else {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        vi.j jVar = (vi.j) gVar.e;
                        jVar.getClass();
                        vi.j.q();
                        if (jVar.G == 5) {
                            long j11 = jVar.j();
                            long max = Math.max(0L, Math.min(j11, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j11, audioRightMs));
                            j10 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.c, j11)) {
                                jVar.r = max;
                                jVar.s = max2;
                                k2.i0 i0Var = jVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                jVar.f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.h3(vfVar);
                                break;
                            }
                            k2.p1.r(j10, a1.g.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(vfVar);
                        }
                    }
                    j10 = audioRightMs;
                    k2.p1.r(j10, a1.g.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(vfVar);
                }
            case 16:
                ((org.telegram.ui.Components.bi) this.b).b.removeView((gi.l3) this.c);
                break;
            case 17:
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                biVar.a(true);
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.bi biVar2 = (org.telegram.ui.Components.bi) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!biVar2.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.bi biVar3 = (org.telegram.ui.Components.bi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.uh) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                biVar3.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(biVar3.E3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().a.c(new org.telegram.messenger.yj(b02.e, 2, b02.a, b02, tL_attachMenuBots));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.bi biVar4 = (org.telegram.ui.Components.bi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.li.b0(biVar4.E3).E0(false, true, null);
                if (biVar4.t2 == biVar4.s2.get(tL_attachMenuBot2.bot_id)) {
                    biVar4.F1(biVar4.b2);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                niVar.H = false;
                niVar.I = arrayList;
                niVar.T();
                break;
            case 22:
                org.telegram.messenger.g0.h3(new lo(23, (org.telegram.ui.Components.dj) this.b, ((org.telegram.ui.Components.cj) this.c).run()));
                break;
            case 23:
                ((org.telegram.ui.Components.dj) this.b).setStatus((CharSequence) this.c);
                break;
            case 24:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.b;
                String str = (String) this.c;
                tjVar.getClass();
                ArrayList arrayList2 = new ArrayList(tjVar.Y.w.e);
                if (tjVar.Y.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) tjVar.Y.w.h);
                }
                Utilities.g.c(new rn(tjVar, str, !tjVar.S.isEmpty(), arrayList2, 4));
                break;
            case 25:
                org.telegram.ui.Components.tj tjVar2 = (org.telegram.ui.Components.tj) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.uj ujVar = tjVar2.Y;
                boolean z10 = ujVar.c0;
                org.telegram.ui.Components.jj jjVar = ujVar.r;
                if (z10) {
                    u4.h0 adapter = jjVar.getAdapter();
                    org.telegram.ui.Components.tj tjVar3 = ujVar.E;
                    if (adapter != tjVar3) {
                        jjVar.setAdapter(tjVar3);
                    }
                }
                tjVar2.s = arrayList3;
                tjVar2.f();
                break;
            case 26:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.Components.bi biVar5 = hkVar.b;
                biVar5.dismiss();
                biVar5.X1.presentFragment(wm.ra(user2.id));
                break;
            case 27:
                org.telegram.messenger.k5.o(null, 2131743211, new org.telegram.ui.Components.fc((org.telegram.ui.Components.hk) this.b, (org.telegram.ui.ActionBar.e6) this.c), R.raw.copy, 36);
                break;
            case 28:
                org.telegram.ui.Components.uk ukVar = (org.telegram.ui.Components.uk) this.b;
                float[] fArr = (float[]) this.c;
                ukVar.getClass();
                ukVar.h0(fArr[0], fArr[1]);
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.th thVar = (org.telegram.ui.Components.th) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = thVar.getCurrentItemTop();
                int listTopPadding = thVar.getListTopPadding();
                org.telegram.ui.Components.il ilVar = chatAttachAlertPhotoLayout.F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ilVar.scrollBy(0, listTopPadding);
                break;
        }
    }
}
