package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cd(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        boolean z10;
        String str = "";
        int i10 = 0;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                vh.p2 p2Var = (vh.p2) this.c;
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.removeView(p2Var);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                if (chatActivityEnterView2.Y4 == ((z60) this.c)) {
                    chatActivityEnterView2.Y4 = null;
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView3.setFieldText(charSequence);
                chatActivityEnterView3.W = null;
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) this.b;
                tc tcVar = (tc) this.c;
                int i13 = ChatActivityEnterView.s5;
                tcVar.run();
                org.telegram.messenger.js.o(chatActivityEnterView4.Q, chatActivityEnterView4.Q2);
                break;
            case 4:
                wf wfVar = (wf) this.b;
                tf tfVar = (tf) this.c;
                ChatActivityEnterView chatActivityEnterView5 = wfVar.b0;
                chatActivityEnterView5.i1 = chatActivityEnterView5.h1.getAudioRightMs() - chatActivityEnterView5.h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView5.h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView5.h1.getAudioRightMs();
                if (!B.G1) {
                    if (B.i1 != null) {
                        B.L1.c(new org.telegram.messenger.m9(B, new org.telegram.messenger.pe(0, org.telegram.messenger.b8.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.b8.r(null, B.e1)), audioLeftMs, audioRightMs, tfVar, 3));
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(tfVar);
                        break;
                    }
                } else {
                    e0.h hVar = B.E1;
                    if (hVar != null) {
                        ki.k kVar = (ki.k) hVar.e;
                        kVar.getClass();
                        ki.k.q();
                        if (kVar.G == 5) {
                            long j11 = kVar.j();
                            long max = Math.max(0L, Math.min(j11, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j11, audioRightMs));
                            j10 = audioRightMs;
                            if (max2 - max >= Math.min(kVar.c, j11)) {
                                kVar.r = max;
                                kVar.s = max2;
                                i2.i0 i0Var = kVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                kVar.f.getClass();
                                kVar.m();
                                org.telegram.messenger.i0.g3(tfVar);
                                break;
                            }
                            i0.a.q(j10, a1.g.s(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.i0.g3(tfVar);
                        }
                    }
                    j10 = audioRightMs;
                    i0.a.q(j10, a1.g.s(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.i0.g3(tfVar);
                }
            case 5:
                ((bi) this.b).b.removeView((vh.p2) this.c);
                break;
            case 6:
                bi biVar = (bi) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                biVar.a(true);
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 7:
                bi biVar2 = (bi) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!biVar2.I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    break;
                }
                break;
            case 8:
                bi biVar3 = (bi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((vh) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                biVar3.B1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(biVar3.D3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().a.c(new org.telegram.messenger.rk(b02.e, 2, b02.a, b02, tL_attachMenuBots));
                    break;
                }
                break;
            case 9:
                bi biVar4 = (bi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.ui.b0(biVar4.D3).E0(false, true, null);
                if (biVar4.s2 == biVar4.r2.get(tL_attachMenuBot2.bot_id)) {
                    biVar4.E1(biVar4.a2);
                    break;
                }
                break;
            case 10:
                mi miVar = (mi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                miVar.G = false;
                miVar.H = arrayList;
                miVar.S();
                break;
            case 11:
                org.telegram.messenger.i0.g3(new cd(12, (dj) this.b, ((cj) this.c).run()));
                break;
            case 12:
                ((dj) this.b).setStatus((CharSequence) this.c);
                break;
            case 13:
                wj wjVar = (wj) this.b;
                String str2 = (String) this.c;
                wjVar.getClass();
                ArrayList arrayList2 = new ArrayList(wjVar.X.w.e);
                if (wjVar.X.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) wjVar.X.w.h);
                }
                Utilities.g.c(new org.telegram.ui.kp(wjVar, str2, !wjVar.R.isEmpty(), arrayList2, 2));
                break;
            case 14:
                wj wjVar2 = (wj) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                xj xjVar = wjVar2.X;
                boolean z11 = xjVar.b0;
                lj ljVar = xjVar.r;
                if (z11) {
                    s4.g0 adapter = ljVar.getAdapter();
                    wj wjVar3 = xjVar.D;
                    if (adapter != wjVar3) {
                        ljVar.setAdapter(wjVar3);
                    }
                }
                wjVar2.s = arrayList3;
                wjVar2.f();
                break;
            case 15:
                kk kkVar = (kk) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                bi biVar5 = kkVar.b;
                biVar5.dismiss();
                biVar5.W1.presentFragment(org.telegram.ui.un.ha(user.id));
                break;
            case 16:
                org.telegram.messenger.m5.n(null, 2131743227, new cc((kk) this.b, (org.telegram.ui.ActionBar.p6) this.c), R.raw.copy, 36);
                break;
            case 17:
                bl blVar = (bl) this.b;
                float[] fArr = (float[]) this.c;
                blVar.getClass();
                blVar.e0(fArr[0], fArr[1]);
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                uh uhVar = (uh) this.c;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = uhVar.getCurrentItemTop();
                int listTopPadding = uhVar.getListTopPadding();
                pl plVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > org.telegram.messenger.i0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                plVar.scrollBy(0, listTopPadding);
                break;
            case 19:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                yl ylVar = chatAttachAlertPhotoLayout2.P;
                if (ylVar != null) {
                    ylVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 20:
                jm jmVar = (jm) this.b;
                uh uhVar2 = (uh) this.c;
                int currentItemTop2 = uhVar2.getCurrentItemTop();
                int listTopPadding2 = uhVar2.getListTopPadding();
                ag.b1 b1Var = jmVar.r;
                if (currentItemTop2 > org.telegram.messenger.i0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                break;
            case 21:
                vn vnVar = (vn) this.b;
                ag.n nVar = (ag.n) this.c;
                xn.a(vnVar.c);
                nVar.run();
                break;
            case 22:
                ((zo) this.b).b.R0((ArrayList) this.c);
                break;
            case 23:
                ((ap) this.b).b.R0((ArrayList) this.c);
                break;
            case 24:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.b;
                Context context = (Context) this.c;
                z2Var.dismiss();
                gf.f.r(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 25:
                org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence2 = m3Var.getText().toString();
                if (!vq.a(charSequence2, "bot") && vq.c(charSequence2, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.k3 k3Var = m3Var.d;
                k3Var.setRightText(str);
                k3Var.setPadding(0, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(TextUtils.isEmpty(str) ? 21.0f : 63.0f), org.telegram.messenger.i0.L(15.0f));
                break;
            case 26:
                cr crVar = (cr) this.b;
                vh.d dVar = (vh.d) this.c;
                crVar.getClass();
                dVar.setLoading(false);
                crVar.dismiss();
                break;
            case 27:
                cr crVar2 = (cr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    crVar2.T1 = groupcallstreamrtmpurl.url;
                    crVar2.U1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(crVar2.U1);
                    crVar2.V1 = spannableStringBuilder;
                    yz0 yz0Var = new yz0();
                    yz0Var.a |= 256;
                    yz0Var.b = 0;
                    yz0Var.c = spannableStringBuilder.length();
                    crVar2.V1.setSpan(new zz0(yz0Var, 0), 0, crVar2.V1.length(), 0);
                    crVar2.W1.O(false);
                    break;
                }
                break;
            case 28:
                fs fsVar = (fs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                bs bsVar = fsVar.b;
                ArrayList arrayList4 = fsVar.h;
                int i14 = fsVar.a;
                if (!(tLObject2 instanceof TL_bots.popularAppBots)) {
                    fsVar.g = null;
                    fsVar.e = true;
                    fsVar.c = false;
                    bsVar.run();
                    break;
                } else {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.vp.r1(i14).V3(popularappbots.users, false);
                    org.telegram.messenger.hs.a0(i14).m1(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    fsVar.g = str3;
                    fsVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    fsVar.f = currentTimeMillis;
                    if (fsVar.i) {
                        z10 = false;
                    } else {
                        fsVar.i = true;
                        String str4 = fsVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        int i15 = 0;
                        while (i15 < arrayList4.size()) {
                            i15 = c3.i0.k(i15, 1, ((TLRPC.User) arrayList4.get(i15)).id, arrayList5);
                            arrayList4 = arrayList4;
                        }
                        org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i14);
                        a02.a.c(new org.telegram.messenger.voip.g(fsVar, a02, arrayList5, currentTimeMillis, str5, 3));
                        z10 = false;
                    }
                    fsVar.c = z10;
                    bsVar.run();
                    break;
                }
            default:
                bt btVar = (bt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max3 = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.i0.g3(new at(i10, btVar, decodeFile));
                break;
        }
    }
}
