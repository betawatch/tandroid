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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mf(int i7, Object obj, Object obj2) {
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
                rf rfVar = (rf) this.b;
                ji.p pVar = (ji.p) this.c;
                rfVar.getClass();
                org.telegram.messenger.g0.E2(pVar);
                ChatActivityEnterView chatActivityEnterView = rfVar.a;
                chatActivityEnterView.t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 1:
                ((tf) this.b).onAnimationEnd((Animator) this.c);
                break;
            case 2:
                rg rgVar = (rg) this.b;
                og ogVar = (og) this.c;
                ChatActivityEnterView chatActivityEnterView2 = rgVar.Q0;
                chatActivityEnterView2.Y1 = chatActivityEnterView2.i1.getAudioRightMs() - chatActivityEnterView2.i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView2.i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView2.i1.getAudioRightMs();
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
                                org.telegram.messenger.g0.g3(ogVar);
                                break;
                            }
                            i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.g3(ogVar);
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.g3(ogVar);
                } else if (B.k1 == null) {
                    org.telegram.messenger.g0.g3(ogVar);
                    break;
                } else {
                    B.N1.c(new org.telegram.messenger.k9(B, new org.telegram.messenger.oe(i7, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.g1)), audioLeftMs, audioRightMs, ogVar, 3));
                    break;
                }
            case 3:
                ((ui) this.b).b.removeView((hi.l3) this.c);
                break;
            case 4:
                ui uiVar = (ui) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                uiVar.a(true);
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 5:
                ui uiVar2 = (ui) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!uiVar2.J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            case 6:
                ui uiVar3 = (ui) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ni) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                uiVar3.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(uiVar3.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().a.c(new org.telegram.messenger.fk(d02.e, 2, d02.a, d02, tL_attachMenuBots));
                    break;
                }
                break;
            case 7:
                ui uiVar4 = (ui) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                org.telegram.messenger.si.d0(uiVar4.H3).H0(false, true, null);
                if (uiVar4.w2 == uiVar4.v2.get(tL_attachMenuBot2.bot_id)) {
                    uiVar4.G1(uiVar4.e2);
                    break;
                }
                break;
            case 8:
                ej ejVar = (ej) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ejVar.H = false;
                ejVar.I = arrayList;
                ejVar.U();
                break;
            case 9:
                org.telegram.messenger.g0.g3(new mf(10, (uj) this.b, ((tj) this.c).run()));
                break;
            case 10:
                ((uj) this.b).setStatus((CharSequence) this.c);
                break;
            case 11:
                lk lkVar = (lk) this.b;
                String str2 = (String) this.c;
                lkVar.getClass();
                ArrayList arrayList2 = new ArrayList(lkVar.Y.w.e);
                if (lkVar.Y.w.f.isEmpty()) {
                    arrayList2.addAll(0, (ArrayList) lkVar.Y.w.h);
                }
                Utilities.g.c(new org.telegram.ui.yn(lkVar, str2, !lkVar.S.isEmpty(), arrayList2, 4));
                break;
            case 12:
                lk lkVar2 = (lk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                mk mkVar = lkVar2.Y;
                boolean z10 = mkVar.c0;
                ak akVar = mkVar.r;
                if (z10) {
                    v4.i0 adapter = akVar.getAdapter();
                    lk lkVar3 = mkVar.E;
                    if (adapter != lkVar3) {
                        akVar.setAdapter(lkVar3);
                    }
                }
                lkVar2.s = arrayList3;
                lkVar2.f();
                break;
            case 13:
                zk zkVar = (zk) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ui uiVar5 = zkVar.b;
                uiVar5.dismiss();
                uiVar5.a2.presentFragment(org.telegram.ui.bn.ua(user.id));
                break;
            case 14:
                org.telegram.messenger.f3.n(null, 2131742955, new lc((zk) this.b, (org.telegram.ui.ActionBar.h6) this.c), R.raw.copy, 36);
                break;
            case 15:
                ml mlVar = (ml) this.b;
                float[] fArr = (float[]) this.c;
                mlVar.getClass();
                mlVar.h0(fArr[0], fArr[1]);
                break;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                mi miVar = (mi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                int currentItemTop = miVar.getCurrentItemTop();
                int listTopPadding = miVar.getListTopPadding();
                zl zlVar = chatAttachAlertPhotoLayout.F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                zlVar.scrollBy(0, listTopPadding);
                break;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                gm gmVar = chatAttachAlertPhotoLayout2.Q;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 18:
                rm rmVar = (rm) this.b;
                mi miVar2 = (mi) this.c;
                int currentItemTop2 = miVar2.getCurrentItemTop();
                int listTopPadding2 = miVar2.getListTopPadding();
                di.b1 b1Var = rmVar.r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                break;
            case 19:
                go goVar = (go) this.b;
                kg.g gVar2 = (kg.g) this.c;
                io.a(goVar.c);
                gVar2.run();
                break;
            case 20:
                ((jp) this.b).b.S0((ArrayList) this.c);
                break;
            case 21:
                ((kp) this.b).b.S0((ArrayList) this.c);
                break;
            case 22:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.b;
                Context context = (Context) this.c;
                w2Var.dismiss();
                vf.c.t(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 23:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence = l3Var.getText().toString();
                if (!br.a(charSequence, "bot") && br.c(charSequence, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.j3 j3Var = l3Var.d;
                j3Var.setRightText(str);
                j3Var.setPadding(0, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(TextUtils.isEmpty(str) ? 21.0f : 63.0f), org.telegram.messenger.g0.L(15.0f));
                break;
            case 24:
                jr jrVar = (jr) this.b;
                hi.e eVar = (hi.e) this.c;
                jrVar.getClass();
                eVar.setLoading(false);
                jrVar.dismiss();
                break;
            case 25:
                jr jrVar2 = (jr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    jrVar2.X1 = groupcallstreamrtmpurl.url;
                    jrVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jrVar2.Y1);
                    jrVar2.Z1 = spannableStringBuilder;
                    fz0 fz0Var = new fz0();
                    fz0Var.a |= 256;
                    fz0Var.b = 0;
                    fz0Var.c = spannableStringBuilder.length();
                    jrVar2.Z1.setSpan(new gz0(fz0Var, 0), 0, jrVar2.Z1.length(), 0);
                    jrVar2.a2.O(false);
                    break;
                }
                break;
            case 26:
                js jsVar = (js) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                gs gsVar = jsVar.b;
                ArrayList arrayList4 = jsVar.h;
                int i10 = jsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.np.u1(i10).f4(popularappbots.users, false);
                    org.telegram.messenger.ur.a0(i10).m1(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    jsVar.g = str3;
                    jsVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    jsVar.f = currentTimeMillis;
                    if (!jsVar.i) {
                        jsVar.i = true;
                        String str4 = jsVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList4.size(); i11 = com.google.android.gms.internal.vision.e2.g(i11, 1, ((TLRPC.User) arrayList4.get(i11)).id, arrayList5)) {
                        }
                        org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i10);
                        a02.a.c(new bi.o2(jsVar, a02, arrayList5, currentTimeMillis, str5, 11));
                    }
                    jsVar.c = false;
                    gsVar.run();
                    break;
                } else {
                    jsVar.g = null;
                    jsVar.e = true;
                    jsVar.c = false;
                    gsVar.run();
                    break;
                }
            case 27:
                et etVar = (et) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max3 = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new mf(28, etVar, decodeFile));
                break;
            case 28:
                ((et) this.b).setImage((Bitmap) this.c);
                break;
            default:
                ((EditTextBoldCursor) this.b).p0.draw((Canvas) this.c);
                break;
        }
    }
}
