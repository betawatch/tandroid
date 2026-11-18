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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mg(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        boolean z10;
        String str = "";
        switch (this.a) {
            case 0:
                pg pgVar = (pg) this.b;
                lg lgVar = (lg) this.c;
                ChatActivityEnterView chatActivityEnterView = pgVar.Q0;
                chatActivityEnterView.W1 = chatActivityEnterView.i1.getAudioRightMs() - chatActivityEnterView.i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView.i1.getAudioRightMs();
                if (!B.I1) {
                    if (B.k1 != null) {
                        B.N1.c(new org.telegram.messenger.j9(B, new org.telegram.messenger.ne(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.g1)), audioLeftMs, audioRightMs, lgVar, 3));
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(lgVar);
                        break;
                    }
                } else {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        yi.j jVar = (yi.j) gVar.e;
                        jVar.getClass();
                        yi.j.q();
                        if (jVar.G == 5) {
                            long j10 = jVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.c, j10)) {
                                jVar.r = max;
                                jVar.s = max2;
                                l2.f0 f0Var = jVar.A;
                                if (f0Var != null) {
                                    f0Var.Z0(5, max);
                                }
                                jVar.f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.g3(lgVar);
                                break;
                            }
                            i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.g3(lgVar);
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.g3(lgVar);
                }
            case 1:
                ((si) this.b).b.removeView((hi.m3) this.c);
                break;
            case 2:
                si siVar = (si) this.b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.c;
                siVar.a(true);
                if (h2Var != null) {
                    h2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 3:
                si siVar2 = (si) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!siVar2.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            case 4:
                si siVar3 = (si) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((li) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                siVar3.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(siVar3.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().a.c(new org.telegram.messenger.ek(d02.e, 2, d02.a, d02, tL_attachMenuBots));
                    break;
                }
                break;
            case 5:
                si siVar4 = (si) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.ri.d0(siVar4.H3).H0(false, true, null);
                if (siVar4.w2 == siVar4.v2.get(tL_attachMenuBot2.bot_id)) {
                    siVar4.G1(siVar4.e2);
                    break;
                }
                break;
            case 6:
                cj cjVar = (cj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                cjVar.H = false;
                cjVar.I = arrayList;
                cjVar.U();
                break;
            case 7:
                org.telegram.messenger.g0.g3(new mg(8, (sj) this.b, ((rj) this.c).run()));
                break;
            case 8:
                ((sj) this.b).setStatus((CharSequence) this.c);
                break;
            case 9:
                jk jkVar = (jk) this.b;
                String str2 = (String) this.c;
                jkVar.getClass();
                ArrayList arrayList2 = new ArrayList(jkVar.Y.w.e);
                if (jkVar.Y.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) jkVar.Y.w.h);
                }
                Utilities.g.c(new org.telegram.ui.yn(jkVar, str2, !jkVar.S.isEmpty(), arrayList2, 4));
                break;
            case 10:
                jk jkVar2 = (jk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                kk kkVar = jkVar2.Y;
                boolean z11 = kkVar.c0;
                yj yjVar = kkVar.r;
                if (z11) {
                    v4.i0 adapter = yjVar.getAdapter();
                    jk jkVar3 = kkVar.E;
                    if (adapter != jkVar3) {
                        yjVar.setAdapter(jkVar3);
                    }
                }
                jkVar2.s = arrayList3;
                jkVar2.f();
                break;
            case 11:
                xk xkVar = (xk) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                si siVar5 = xkVar.b;
                siVar5.dismiss();
                siVar5.a2.presentFragment(org.telegram.ui.bn.ua(user.id));
                break;
            case 12:
                org.telegram.messenger.f3.n(null, 2131742963, new lc((xk) this.b, (org.telegram.ui.ActionBar.i6) this.c), R.raw.copy, 36);
                break;
            case 13:
                kl klVar = (kl) this.b;
                float[] fArr = (float[]) this.c;
                klVar.getClass();
                klVar.h0(fArr[0], fArr[1]);
                break;
            case 14:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ki kiVar = (ki) this.c;
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = kiVar.getCurrentItemTop();
                int listTopPadding = kiVar.getListTopPadding();
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                xlVar.scrollBy(0, listTopPadding);
                break;
            case 15:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                em emVar = chatAttachAlertPhotoLayout2.Q;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 16:
                pm pmVar = (pm) this.b;
                ki kiVar2 = (ki) this.c;
                int currentItemTop2 = kiVar2.getCurrentItemTop();
                int listTopPadding2 = kiVar2.getListTopPadding();
                di.b1 b1Var = pmVar.r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                break;
            case 17:
                eo eoVar = (eo) this.b;
                kg.g gVar2 = (kg.g) this.c;
                go.a(eoVar.c);
                gVar2.run();
                break;
            case 18:
                ((hp) this.b).b.S0((ArrayList) this.c);
                break;
            case 19:
                ((ip) this.b).b.S0((ArrayList) this.c);
                break;
            case 20:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.b;
                Context context = (Context) this.c;
                x2Var.dismiss();
                vf.c.t(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 21:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence = k3Var.getText().toString();
                if (!zq.a(charSequence, "bot") && zq.c(charSequence, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                i3Var.setRightText(str);
                i3Var.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(TextUtils.isEmpty(str) ? 21.0f : 63.0f), org.telegram.messenger.g0.L(15.0f));
                break;
            case 22:
                hr hrVar = (hr) this.b;
                hi.d dVar = (hi.d) this.c;
                hrVar.getClass();
                dVar.setLoading(false);
                hrVar.dismiss();
                break;
            case 23:
                hr hrVar2 = (hr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    hrVar2.X1 = groupcallstreamrtmpurl.url;
                    hrVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hrVar2.Y1);
                    hrVar2.Z1 = spannableStringBuilder;
                    dz0 dz0Var = new dz0();
                    dz0Var.a |= 256;
                    dz0Var.b = 0;
                    dz0Var.c = spannableStringBuilder.length();
                    hrVar2.Z1.setSpan(new ez0(dz0Var, 0), 0, hrVar2.Z1.length(), 0);
                    hrVar2.a2.O(false);
                    break;
                }
                break;
            case 24:
                hs hsVar = (hs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                es esVar = hsVar.b;
                ArrayList arrayList4 = hsVar.h;
                int i7 = hsVar.a;
                if (!(tLObject2 instanceof TL_bots.popularAppBots)) {
                    hsVar.g = null;
                    hsVar.e = true;
                    hsVar.c = false;
                    esVar.run();
                    break;
                } else {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.mp.u1(i7).f4(popularappbots.users, false);
                    org.telegram.messenger.tr.a0(i7).m1(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    hsVar.g = str3;
                    hsVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    hsVar.f = currentTimeMillis;
                    if (hsVar.i) {
                        z10 = false;
                    } else {
                        hsVar.i = true;
                        String str4 = hsVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        int i10 = 0;
                        while (i10 < arrayList4.size()) {
                            i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.User) arrayList4.get(i10)).id, arrayList5);
                            arrayList4 = arrayList4;
                        }
                        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                        a02.a.c(new bi.k2(hsVar, a02, arrayList5, currentTimeMillis, str5, 11));
                        z10 = false;
                    }
                    hsVar.c = z10;
                    esVar.run();
                    break;
                }
            case 25:
                ct ctVar = (ct) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max3 = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new mg(26, ctVar, decodeFile));
                break;
            case 26:
                ((ct) this.b).setImage((Bitmap) this.c);
                break;
            case 27:
                ((EditTextBoldCursor) this.b).p0.draw((Canvas) this.c);
                break;
            case 28:
                org.telegram.messenger.mp.u1(((mu) this.b).a.a).t5((TLRPC.EmojiStatus) this.c, null);
                break;
            default:
                org.telegram.messenger.mp.u1(((nw) this.b).a.d1).t5((TLRPC.EmojiStatus) this.c, null);
                break;
        }
    }
}
