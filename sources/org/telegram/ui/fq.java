package org.telegram.ui;

import android.widget.FrameLayout;
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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fq(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        switch (this.a) {
            case 0:
                gq gqVar = (gq) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                rq rqVar = gqVar.a;
                if (org.telegram.ui.Components.gc.a(rqVar)) {
                    org.telegram.ui.Components.gc.C(user.first_name, rqVar).j();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                org.telegram.messenger.e eVar = f0Var.p2;
                eVar.b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.a).sendRequest(savetone, null);
                break;
            case 2:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) this.c;
                rVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(tL_aiComposeTone2.author_id));
                    rVar.dismiss();
                    break;
                }
                break;
            case 3:
                boolean[] zArr = (boolean[]) this.b;
                uu0 uu0Var = (uu0) this.c;
                if (zArr[0]) {
                    uu0Var.run();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.bc bcVar = (org.telegram.ui.Components.bc) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                bcVar.n = true;
                org.telegram.ui.ActionBar.c6 c6Var = bcVar.e;
                if (c6Var instanceof org.telegram.ui.Components.gb) {
                    org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) ((org.telegram.ui.Components.gb) c6Var);
                    hbVar.b.setText(charSequence);
                    org.telegram.messenger.g0.V3(hbVar.d, false, false);
                    org.telegram.messenger.g0.V3(hbVar.b, true, false);
                }
                bcVar.i(true);
                break;
            case 5:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ((org.telegram.ui.Components.tc) this.b).removeView((fi.m3) this.c);
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                fi.m3 m3Var = (fi.m3) this.c;
                int i7 = ChatActivityEnterView.s5;
                chatActivityEnterView.removeView(m3Var);
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                if (chatActivityEnterView2.Y4 == ((org.telegram.ui.Components.k60) this.c)) {
                    chatActivityEnterView2.Y4 = null;
                    break;
                }
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView3.setFieldText(charSequence2);
                chatActivityEnterView3.W = null;
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.c;
                int i11 = ChatActivityEnterView.s5;
                zcVar.run();
                org.telegram.messenger.b6.n(chatActivityEnterView4.Q, chatActivityEnterView4.Q2);
                break;
            case 11:
                org.telegram.ui.Components.zf zfVar = (org.telegram.ui.Components.zf) this.b;
                org.telegram.ui.Components.wf wfVar = (org.telegram.ui.Components.wf) this.c;
                ChatActivityEnterView chatActivityEnterView5 = zfVar.b0;
                chatActivityEnterView5.i1 = chatActivityEnterView5.h1.getAudioRightMs() - chatActivityEnterView5.h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView5.h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView5.h1.getAudioRightMs();
                if (!B.H1) {
                    if (B.j1 != null) {
                        B.M1.c(new org.telegram.messenger.l9(B, new org.telegram.messenger.pe(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f1)), audioLeftMs, audioRightMs, wfVar, 3));
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(wfVar);
                        break;
                    }
                } else {
                    e0.g gVar = B.F1;
                    if (gVar != null) {
                        vi.h hVar = (vi.h) gVar.e;
                        hVar.getClass();
                        vi.h.q();
                        if (hVar.G == 5) {
                            long j10 = hVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(hVar.c, j10)) {
                                hVar.r = max;
                                hVar.s = max2;
                                l2.i0 i0Var = hVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                hVar.f.getClass();
                                hVar.m();
                                org.telegram.messenger.g0.h3(wfVar);
                                break;
                            }
                            jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(wfVar);
                        }
                    }
                    j3 = audioRightMs;
                    jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(wfVar);
                }
            case 12:
                ((org.telegram.ui.Components.ci) this.b).b.removeView((fi.m3) this.c);
                break;
            case 13:
                org.telegram.ui.Components.ci ciVar = (org.telegram.ui.Components.ci) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                ciVar.a(true);
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.ci ciVar2 = (org.telegram.ui.Components.ci) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!ciVar2.I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.ci ciVar3 = (org.telegram.ui.Components.ci) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.vh) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                ciVar3.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ciVar3.G3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().a.c(new org.telegram.messenger.hk(b02.e, 2, b02.a, b02, tL_attachMenuBots));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.ci ciVar4 = (org.telegram.ui.Components.ci) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.ui.b0(ciVar4.G3).E0(false, true, null);
                if (ciVar4.v2 == ciVar4.u2.get(tL_attachMenuBot2.bot_id)) {
                    ciVar4.F1(ciVar4.d2);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.mi miVar = (org.telegram.ui.Components.mi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                miVar.G = false;
                miVar.H = arrayList;
                miVar.T();
                break;
            case 18:
                org.telegram.messenger.g0.h3(new fq(19, (org.telegram.ui.Components.dj) this.b, ((org.telegram.ui.Components.cj) this.c).run()));
                break;
            case 19:
                ((org.telegram.ui.Components.dj) this.b).setStatus((CharSequence) this.c);
                break;
            case 20:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.b;
                String str = (String) this.c;
                tjVar.getClass();
                ArrayList arrayList2 = new ArrayList(tjVar.X.w.e);
                if (tjVar.X.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) tjVar.X.w.h);
                }
                Utilities.g.c(new xn(tjVar, str, !tjVar.R.isEmpty(), arrayList2, 4));
                break;
            case 21:
                org.telegram.ui.Components.tj tjVar2 = (org.telegram.ui.Components.tj) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.uj ujVar = tjVar2.X;
                boolean z9 = ujVar.b0;
                org.telegram.ui.Components.jj jjVar = ujVar.r;
                if (z9) {
                    v4.g0 adapter = jjVar.getAdapter();
                    org.telegram.ui.Components.tj tjVar3 = ujVar.D;
                    if (adapter != tjVar3) {
                        jjVar.setAdapter(tjVar3);
                    }
                }
                tjVar2.s = arrayList3;
                tjVar2.f();
                break;
            case 22:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.Components.ci ciVar5 = hkVar.b;
                ciVar5.dismiss();
                ciVar5.Z1.presentFragment(cn.ta(user2.id));
                break;
            case 23:
                org.telegram.messenger.k5.o(null, 2131743201, new org.telegram.ui.Components.gc((org.telegram.ui.Components.hk) this.b, (org.telegram.ui.ActionBar.h6) this.c), R.raw.copy, 36);
                break;
            case 24:
                org.telegram.ui.Components.vk vkVar = (org.telegram.ui.Components.vk) this.b;
                float[] fArr = (float[]) this.c;
                vkVar.getClass();
                vkVar.h0(fArr[0], fArr[1]);
                break;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.uh uhVar = (org.telegram.ui.Components.uh) this.c;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = uhVar.getCurrentItemTop();
                int listTopPadding = uhVar.getListTopPadding();
                org.telegram.ui.Components.il ilVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ilVar.scrollBy(0, listTopPadding);
                break;
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                org.telegram.ui.Components.pl plVar = chatAttachAlertPhotoLayout2.P;
                if (plVar != null) {
                    plVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.am amVar = (org.telegram.ui.Components.am) this.b;
                org.telegram.ui.Components.uh uhVar2 = (org.telegram.ui.Components.uh) this.c;
                int currentItemTop2 = uhVar2.getCurrentItemTop();
                int listTopPadding2 = uhVar2.getListTopPadding();
                bi.q1 q1Var = amVar.r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                q1Var.scrollBy(0, listTopPadding2);
                break;
            case 28:
                org.telegram.ui.Components.mn mnVar = (org.telegram.ui.Components.mn) this.b;
                kg.g gVar2 = (kg.g) this.c;
                org.telegram.ui.Components.on.a(mnVar.c);
                gVar2.run();
                break;
            default:
                ((org.telegram.ui.Components.qo) this.b).b.R0((ArrayList) this.c);
                break;
        }
    }
}
