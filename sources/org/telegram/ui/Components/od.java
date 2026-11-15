package org.telegram.ui.Components;

import android.animation.Animator;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ od(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        String str = "";
        int i7 = 0;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.setFieldText(charSequence);
                chatActivityEnterView.a0 = null;
                break;
            case 1:
                ((ji.h) this.b).a((ai.h) this.c);
                break;
            case 2:
                gf gfVar = (gf) this.b;
                ji.n nVar = (ji.n) this.c;
                gfVar.getClass();
                org.telegram.messenger.g0.E2(nVar);
                ChatActivityEnterView chatActivityEnterView2 = gfVar.a;
                chatActivityEnterView2.m1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView2.v2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 3:
                ((hf) this.b).onAnimationEnd((Animator) this.c);
                break;
            case 4:
                gg ggVar = (gg) this.b;
                dg dgVar = (dg) this.c;
                ChatActivityEnterView chatActivityEnterView3 = ggVar.Q0;
                chatActivityEnterView3.Q1 = chatActivityEnterView3.i1.getAudioRightMs() - chatActivityEnterView3.i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView3.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView3.i1.getAudioRightMs();
                if (B.I1) {
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
                                org.telegram.messenger.g0.h3(dgVar);
                                break;
                            }
                            i5.c.t(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(dgVar);
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.t(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(dgVar);
                } else if (B.k1 == null) {
                    org.telegram.messenger.g0.h3(dgVar);
                    break;
                } else {
                    B.N1.c(new org.telegram.messenger.k9(B, new org.telegram.messenger.oe(i7, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.g1)), audioLeftMs, audioRightMs, dgVar, 3));
                    break;
                }
            case 5:
                ((ki) this.b).b.removeView((hi.l3) this.c);
                break;
            case 6:
                ki kiVar = (ki) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                kiVar.a(true);
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 7:
                ki kiVar2 = (ki) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!kiVar2.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    break;
                }
                break;
            case 8:
                ki kiVar3 = (ki) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((di) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                kiVar3.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(kiVar3.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().a.c(new org.telegram.messenger.fk(b02.e, 2, b02.a, b02, tL_attachMenuBots));
                    break;
                }
                break;
            case 9:
                ki kiVar4 = (ki) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.si.b0(kiVar4.H3).E0(false, true, null);
                if (kiVar4.w2 == kiVar4.v2.get(tL_attachMenuBot2.bot_id)) {
                    kiVar4.F1(kiVar4.e2);
                    break;
                }
                break;
            case 10:
                vi viVar = (vi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                viVar.H = false;
                viVar.I = arrayList;
                viVar.U();
                break;
            case 11:
                org.telegram.messenger.g0.h3(new od(12, (lj) this.b, ((kj) this.c).run()));
                break;
            case 12:
                ((lj) this.b).setStatus((CharSequence) this.c);
                break;
            case 13:
                ck ckVar = (ck) this.b;
                String str2 = (String) this.c;
                ckVar.getClass();
                ArrayList arrayList2 = new ArrayList(ckVar.Y.w.e);
                if (ckVar.Y.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) ckVar.Y.w.h);
                }
                Utilities.g.c(new org.telegram.ui.wn(ckVar, str2, !ckVar.S.isEmpty(), arrayList2, 4));
                break;
            case 14:
                ck ckVar2 = (ck) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                dk dkVar = ckVar2.Y;
                boolean z10 = dkVar.c0;
                rj rjVar = dkVar.r;
                if (z10) {
                    v4.h0 adapter = rjVar.getAdapter();
                    ck ckVar3 = dkVar.E;
                    if (adapter != ckVar3) {
                        rjVar.setAdapter(ckVar3);
                    }
                }
                ckVar2.s = arrayList3;
                ckVar2.f();
                break;
            case 15:
                qk qkVar = (qk) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ki kiVar5 = qkVar.b;
                kiVar5.dismiss();
                kiVar5.a2.presentFragment(org.telegram.ui.an.ua(user.id));
                break;
            case 16:
                org.telegram.messenger.k5.n(null, 2131743201, new cc((qk) this.b, (org.telegram.ui.ActionBar.e6) this.c), R.raw.copy, 36);
                break;
            case 17:
                dl dlVar = (dl) this.b;
                float[] fArr = (float[]) this.c;
                dlVar.getClass();
                dlVar.h0(fArr[0], fArr[1]);
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ci ciVar = (ci) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = ciVar.getCurrentItemTop();
                int listTopPadding = ciVar.getListTopPadding();
                ql qlVar = chatAttachAlertPhotoLayout.F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                qlVar.scrollBy(0, listTopPadding);
                break;
            case 19:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                xl xlVar = chatAttachAlertPhotoLayout2.Q;
                if (xlVar != null) {
                    xlVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 20:
                im imVar = (im) this.b;
                ci ciVar2 = (ci) this.c;
                int currentItemTop2 = ciVar2.getCurrentItemTop();
                int listTopPadding2 = ciVar2.getListTopPadding();
                di.c1 c1Var = imVar.r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                c1Var.scrollBy(0, listTopPadding2);
                break;
            case 21:
                vn vnVar = (vn) this.b;
                kg.g gVar2 = (kg.g) this.c;
                xn.a(vnVar.c);
                gVar2.run();
                break;
            case 22:
                ((ap) this.b).b.R0((ArrayList) this.c);
                break;
            case 23:
                ((bp) this.b).b.R0((ArrayList) this.c);
                break;
            case 24:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.b;
                Context context = (Context) this.c;
                u2Var.dismiss();
                vf.c.t(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 25:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence2 = k3Var.getText().toString();
                if (!sq.a(charSequence2, "bot") && sq.c(charSequence2, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                i3Var.setRightText(str);
                i3Var.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(TextUtils.isEmpty(str) ? 21.0f : 63.0f), org.telegram.messenger.g0.L(15.0f));
                break;
            case 26:
                ar arVar = (ar) this.b;
                hi.d dVar = (hi.d) this.c;
                arVar.getClass();
                dVar.setLoading(false);
                arVar.dismiss();
                break;
            case 27:
                ar arVar2 = (ar) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    arVar2.X1 = groupcallstreamrtmpurl.url;
                    arVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(arVar2.Y1);
                    arVar2.Z1 = spannableStringBuilder;
                    wy0 wy0Var = new wy0();
                    wy0Var.a |= 256;
                    wy0Var.b = 0;
                    wy0Var.c = spannableStringBuilder.length();
                    arVar2.Z1.setSpan(new xy0(wy0Var, 0), 0, arVar2.Z1.length(), 0);
                    arVar2.a2.O(false);
                    break;
                }
                break;
            case 28:
                as asVar = (as) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                xr xrVar = asVar.b;
                ArrayList arrayList4 = asVar.h;
                int i11 = asVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.np.s1(i11).Y3(popularappbots.users, false);
                    org.telegram.messenger.vr.a0(i11).m1(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    asVar.g = str3;
                    asVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    asVar.f = currentTimeMillis;
                    if (!asVar.i) {
                        asVar.i = true;
                        String str4 = asVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList4.size(); i12 = com.google.android.gms.internal.vision.e2.g(i12, 1, ((TLRPC.User) arrayList4.get(i12)).id, arrayList5)) {
                        }
                        org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i11);
                        a02.a.c(new bi.r1(asVar, a02, arrayList5, currentTimeMillis, str5, 12));
                    }
                    asVar.c = false;
                    xrVar.run();
                    break;
                } else {
                    asVar.g = null;
                    asVar.e = true;
                    asVar.c = false;
                    xrVar.run();
                    break;
                }
            default:
                ws wsVar = (ws) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max3 = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new vs(i7, wsVar, decodeFile));
                break;
        }
    }
}
