package org.telegram.ui.Components;

import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.b;
                org.telegram.messenger.e eVar = g0Var.m2;
                eVar.b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.a).sendRequest(savetone, null);
                break;
            case 1:
                s sVar = (s) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) this.b;
                sVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(tL_aiComposeTone2.author_id));
                    sVar.dismiss();
                    break;
                }
                break;
            case 2:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.qu0 qu0Var = (org.telegram.ui.qu0) this.b;
                if (zArr[0]) {
                    qu0Var.run();
                    break;
                }
                break;
            case 3:
                cc ccVar = (cc) this.c;
                CharSequence charSequence = (CharSequence) this.b;
                ccVar.n = true;
                ViewParent viewParent = ccVar.e;
                if (viewParent instanceof hb) {
                    ib ibVar = (ib) ((hb) viewParent);
                    ibVar.b.setText(charSequence);
                    org.telegram.messenger.g0.V3(ibVar.d, false, false);
                    org.telegram.messenger.g0.V3(ibVar.b, true, false);
                }
                ccVar.i(true);
                break;
            case 4:
                boolean[] zArr2 = (boolean[]) this.c;
                Runnable runnable = (Runnable) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((uc) this.c).removeView((fi.m3) this.b);
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                fi.m3 m3Var = (fi.m3) this.b;
                int i7 = ChatActivityEnterView.s5;
                chatActivityEnterView.removeView(m3Var);
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                if (chatActivityEnterView2.Y4 == ((k60) this.b)) {
                    chatActivityEnterView2.Y4 = null;
                    break;
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.c;
                CharSequence charSequence2 = (CharSequence) this.b;
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView3.setFieldText(charSequence2);
                chatActivityEnterView3.W = null;
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) this.c;
                ad adVar = (ad) this.b;
                int i11 = ChatActivityEnterView.s5;
                adVar.run();
                org.telegram.messenger.b6.n(chatActivityEnterView4.Q, chatActivityEnterView4.Q2);
                break;
            case 10:
                ag agVar = (ag) this.c;
                xf xfVar = (xf) this.b;
                ChatActivityEnterView chatActivityEnterView5 = agVar.b0;
                chatActivityEnterView5.i1 = chatActivityEnterView5.h1.getAudioRightMs() - chatActivityEnterView5.h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView5.h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView5.h1.getAudioRightMs();
                if (!B.H1) {
                    if (B.j1 != null) {
                        B.M1.c(new org.telegram.messenger.l9(B, new org.telegram.messenger.pe(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f1)), audioLeftMs, audioRightMs, xfVar, 3));
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(xfVar);
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
                                org.telegram.messenger.g0.h3(xfVar);
                                break;
                            }
                            jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(xfVar);
                        }
                    }
                    j3 = audioRightMs;
                    jg.g.u(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(xfVar);
                }
            case 11:
                ((di) this.c).b.removeView((fi.m3) this.b);
                break;
            case 12:
                di diVar = (di) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.b;
                diVar.a(true);
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 13:
                di diVar2 = (di) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                if (!diVar2.I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            case 14:
                di diVar3 = (di) this.c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((wh) this.b).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                diVar3.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(diVar3.D3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().a.c(new org.telegram.messenger.ik(b02.e, 2, b02.a, b02, tL_attachMenuBots));
                    break;
                }
                break;
            case 15:
                di diVar4 = (di) this.c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.b;
                org.telegram.messenger.ui.b0(diVar4.D3).E0(false, true, null);
                if (diVar4.s2 == diVar4.r2.get(tL_attachMenuBot2.bot_id)) {
                    diVar4.F1(diVar4.a2);
                    break;
                }
                break;
            case 16:
                ni niVar = (ni) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                niVar.G = false;
                niVar.H = arrayList;
                niVar.T();
                break;
            case 17:
                org.telegram.messenger.g0.h3(new f(18, (ej) this.c, ((dj) this.b).run()));
                break;
            case 18:
                ((ej) this.c).setStatus((CharSequence) this.b);
                break;
            case 19:
                uj ujVar = (uj) this.c;
                String str = (String) this.b;
                ujVar.getClass();
                ArrayList arrayList2 = new ArrayList(ujVar.X.w.e);
                if (ujVar.X.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) ujVar.X.w.h);
                }
                Utilities.g.c(new org.telegram.ui.vn(ujVar, str, !ujVar.R.isEmpty(), arrayList2, 4));
                break;
            case 20:
                uj ujVar2 = (uj) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                vj vjVar = ujVar2.X;
                boolean z9 = vjVar.b0;
                kj kjVar = vjVar.r;
                if (z9) {
                    v4.g0 adapter = kjVar.getAdapter();
                    uj ujVar3 = vjVar.D;
                    if (adapter != ujVar3) {
                        kjVar.setAdapter(ujVar3);
                    }
                }
                ujVar2.s = arrayList3;
                ujVar2.f();
                break;
            case 21:
                ik ikVar = (ik) this.c;
                TLRPC.User user = (TLRPC.User) this.b;
                di diVar5 = ikVar.b;
                diVar5.dismiss();
                diVar5.W1.presentFragment(org.telegram.ui.an.ra(user.id));
                break;
            case 22:
                org.telegram.messenger.k5.o(null, 2131743202, new hc((ik) this.c, (org.telegram.ui.ActionBar.f6) this.b), R.raw.copy, 36);
                break;
            case 23:
                wk wkVar = (wk) this.c;
                float[] fArr = (float[]) this.b;
                wkVar.getClass();
                wkVar.h0(fArr[0], fArr[1]);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                vh vhVar = (vh) this.b;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = vhVar.getCurrentItemTop();
                int listTopPadding = vhVar.getListTopPadding();
                jl jlVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                jlVar.scrollBy(0, listTopPadding);
                break;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.c;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b;
                ql qlVar = chatAttachAlertPhotoLayout2.P;
                if (qlVar != null) {
                    qlVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 26:
                bm bmVar = (bm) this.c;
                vh vhVar2 = (vh) this.b;
                int currentItemTop2 = vhVar2.getCurrentItemTop();
                int listTopPadding2 = vhVar2.getListTopPadding();
                bi.q1 q1Var = bmVar.r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                q1Var.scrollBy(0, listTopPadding2);
                break;
            case 27:
                nn nnVar = (nn) this.c;
                kg.g gVar2 = (kg.g) this.b;
                pn.a(nnVar.c);
                gVar2.run();
                break;
            case 28:
                ((ro) this.c).b.R0((ArrayList) this.b);
                break;
            default:
                ((so) this.c).b.R0((ArrayList) this.b);
                break;
        }
    }
}
