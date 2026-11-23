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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd(int i7, Object obj, Object obj2) {
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
                int i10 = ChatActivityEnterView.s7;
                chatActivityEnterView.setFieldText(charSequence);
                chatActivityEnterView.a0 = null;
                break;
            case 1:
                ((ji.h) this.b).a((ai.c) this.c);
                break;
            case 2:
                qf qfVar = (qf) this.b;
                ji.o oVar = (ji.o) this.c;
                qfVar.getClass();
                org.telegram.messenger.g0.E2(oVar);
                ChatActivityEnterView chatActivityEnterView2 = qfVar.a;
                chatActivityEnterView2.t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView2.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 3:
                ((sf) this.b).onAnimationEnd((Animator) this.c);
                break;
            case 4:
                qg qgVar = (qg) this.b;
                ng ngVar = (ng) this.c;
                ChatActivityEnterView chatActivityEnterView3 = qgVar.Q0;
                chatActivityEnterView3.Y1 = chatActivityEnterView3.i1.getAudioRightMs() - chatActivityEnterView3.i1.getAudioLeftMs();
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
                                l2.g0 g0Var = jVar.A;
                                if (g0Var != null) {
                                    g0Var.Z0(5, max);
                                }
                                jVar.f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.g3(ngVar);
                                break;
                            }
                            i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.g3(ngVar);
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.g3(ngVar);
                } else if (B.k1 == null) {
                    org.telegram.messenger.g0.g3(ngVar);
                    break;
                } else {
                    B.N1.c(new org.telegram.messenger.j9(B, new org.telegram.messenger.ne(i7, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.g1)), audioLeftMs, audioRightMs, ngVar, 3));
                    break;
                }
            case 5:
                ((ti) this.b).b.removeView((hi.u3) this.c);
                break;
            case 6:
                ti tiVar = (ti) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                tiVar.a(true);
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 7:
                ti tiVar2 = (ti) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!tiVar2.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            case 8:
                ti tiVar3 = (ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((mi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar3.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(tiVar3.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().a.c(new org.telegram.messenger.ek(d02.e, 2, d02.a, d02, tL_attachMenuBots));
                    break;
                }
                break;
            case 9:
                ti tiVar4 = (ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.ri.d0(tiVar4.H3).H0(false, true, null);
                if (tiVar4.w2 == tiVar4.v2.get(tL_attachMenuBot2.bot_id)) {
                    tiVar4.G1(tiVar4.e2);
                    break;
                }
                break;
            case 10:
                dj djVar = (dj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                djVar.H = false;
                djVar.I = arrayList;
                djVar.U();
                break;
            case 11:
                org.telegram.messenger.g0.g3(new xd(12, (tj) this.b, ((sj) this.c).run()));
                break;
            case 12:
                ((tj) this.b).setStatus((CharSequence) this.c);
                break;
            case 13:
                jk jkVar = (jk) this.b;
                String str2 = (String) this.c;
                jkVar.getClass();
                ArrayList arrayList2 = new ArrayList(jkVar.Y.w.e);
                if (jkVar.Y.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) jkVar.Y.w.h);
                }
                Utilities.g.c(new org.telegram.ui.xn(jkVar, str2, !jkVar.S.isEmpty(), arrayList2, 4));
                break;
            case 14:
                jk jkVar2 = (jk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                kk kkVar = jkVar2.Y;
                boolean z10 = kkVar.c0;
                zj zjVar = kkVar.r;
                if (z10) {
                    v4.i0 adapter = zjVar.getAdapter();
                    jk jkVar3 = kkVar.E;
                    if (adapter != jkVar3) {
                        zjVar.setAdapter(jkVar3);
                    }
                }
                jkVar2.s = arrayList3;
                jkVar2.f();
                break;
            case 15:
                xk xkVar = (xk) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ti tiVar5 = xkVar.b;
                tiVar5.dismiss();
                tiVar5.a2.presentFragment(org.telegram.ui.bn.ua(user.id));
                break;
            case 16:
                org.telegram.messenger.f3.n(null, 2131742950, new kc((xk) this.b, (org.telegram.ui.ActionBar.i6) this.c), R.raw.copy, 36);
                break;
            case 17:
                kl klVar = (kl) this.b;
                float[] fArr = (float[]) this.c;
                klVar.getClass();
                klVar.h0(fArr[0], fArr[1]);
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                li liVar = (li) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                xlVar.scrollBy(0, listTopPadding);
                break;
            case 19:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                em emVar = chatAttachAlertPhotoLayout2.Q;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 20:
                pm pmVar = (pm) this.b;
                li liVar2 = (li) this.c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                di.b1 b1Var = pmVar.r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                break;
            case 21:
                co coVar = (co) this.b;
                kg.g gVar2 = (kg.g) this.c;
                fo.a(coVar.c);
                gVar2.run();
                break;
            case 22:
                ((gp) this.b).b.S0((ArrayList) this.c);
                break;
            case 23:
                ((hp) this.b).b.S0((ArrayList) this.c);
                break;
            case 24:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.b;
                Context context = (Context) this.c;
                w2Var.dismiss();
                vf.c.t(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 25:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence2 = l3Var.getText().toString();
                if (!yq.a(charSequence2, "bot") && yq.c(charSequence2, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.j3 j3Var = l3Var.d;
                j3Var.setRightText(str);
                j3Var.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(TextUtils.isEmpty(str) ? 21.0f : 63.0f), org.telegram.messenger.g0.L(15.0f));
                break;
            case 26:
                gr grVar = (gr) this.b;
                hi.e eVar = (hi.e) this.c;
                grVar.getClass();
                eVar.setLoading(false);
                grVar.dismiss();
                break;
            case 27:
                gr grVar2 = (gr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    grVar2.X1 = groupcallstreamrtmpurl.url;
                    grVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(grVar2.Y1);
                    grVar2.Z1 = spannableStringBuilder;
                    ez0 ez0Var = new ez0();
                    ez0Var.a |= 256;
                    ez0Var.b = 0;
                    ez0Var.c = spannableStringBuilder.length();
                    grVar2.Z1.setSpan(new fz0(ez0Var, 0), 0, grVar2.Z1.length(), 0);
                    grVar2.a2.O(false);
                    break;
                }
                break;
            case 28:
                gs gsVar = (gs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ds dsVar = gsVar.b;
                ArrayList arrayList4 = gsVar.h;
                int i11 = gsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.mp.u1(i11).f4(popularappbots.users, false);
                    org.telegram.messenger.tr.a0(i11).m1(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    gsVar.g = str3;
                    gsVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    gsVar.f = currentTimeMillis;
                    if (!gsVar.i) {
                        gsVar.i = true;
                        String str4 = gsVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList4.size(); i12 = com.google.android.gms.internal.vision.e2.g(i12, 1, ((TLRPC.User) arrayList4.get(i12)).id, arrayList5)) {
                        }
                        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i11);
                        a02.a.c(new bi.q2(gsVar, a02, arrayList5, currentTimeMillis, str5, 11));
                    }
                    gsVar.c = false;
                    dsVar.run();
                    break;
                } else {
                    gsVar.g = null;
                    gsVar.e = true;
                    gsVar.c = false;
                    dsVar.run();
                    break;
                }
            default:
                ct ctVar = (ct) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max3 = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new bt(i7, ctVar, decodeFile));
                break;
        }
    }
}
