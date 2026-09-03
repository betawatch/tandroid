package dg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import eg.h3;
import eg.l3;
import eg.o3;
import eh.m;
import hg.d1;
import hg.r;
import hg.v2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import k7.c6;
import lh.p3;
import lh.p5;
import lh.q5;
import lh.r5;
import lh.s3;
import mh.f4;
import mh.g5;
import mh.ja;
import mh.l7;
import mh.y9;
import oh.d8;
import oh.i9;
import oh.v7;
import oh.y3;
import oh.z3;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l3 j10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        z3 z3Var;
        int i10 = 8;
        int i11 = 17;
        int i12 = 3;
        mh.e1 e1Var = null;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                Context context = (Context) this.c;
                if (!e0Var.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(e0Var.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    e0Var.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    p pVar = new p(e0Var, context, createBitmap);
                    e0Var.n.f().addView(pVar, c6.c(-1.0f, -1));
                    y yVar = e0Var.n;
                    Objects.requireNonNull(yVar);
                    pVar.setColorListener(new o(yVar, i13));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(pr.f);
                    duration.addUpdateListener(new eg.m1(pVar, i12));
                    duration.start();
                    e0Var.n.a();
                    e0Var.dismiss();
                    break;
                }
                break;
            case 1:
                o3 o3Var = (o3) this.b;
                ml mlVar = (ml) this.c;
                l3[] l3VarArr = o3Var.E;
                if (l3VarArr != null && l3VarArr.length != 0 && o3Var.F != null && (j10 = o3Var.j(o3Var.k0, o3Var.l0)) != null) {
                    mlVar.run(j10);
                    break;
                }
                break;
            case 2:
                rn.d0((xn) this.c, 41026, new h0((eh.f) this.b, 4), null);
                break;
            case 3:
                fg.v0.V((fg.v0) this.b, (Context) this.c);
                break;
            case 4:
                hg.w1 w1Var = (hg.w1) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = w1Var.U;
                if (!arrayList.isEmpty()) {
                    hg.f1 f1Var = w1Var.X;
                    if (!f1Var.K) {
                        f1Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        hg.p0.a(chat.id, arrayList2, new hg.c1(w1Var, chat, arrayList2, hashSet, 1), new h0(w1Var, i10));
                        break;
                    }
                }
                break;
            case 5:
                v2 v2Var = (v2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = v2Var.e0;
                int size2 = arrayList3.size();
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    v2Var.k0.remove(l10);
                }
                v2Var.W();
                v2Var.W.b(true, hashSet2, new hg.g2(v2Var, 5), null);
                v2Var.i0(true, true);
                v2Var.X();
                break;
            case 6:
                v2.S((v2) this.b, (TLRPC.User) this.c, view);
                break;
            case 7:
                final ig.e eVar = (ig.e) this.b;
                final jg.a aVar = (jg.a) this.c;
                if (!eVar.d) {
                    ((hg.d1) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.K) {
                    final int i14 = 1;
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ig.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i13) {
                                case 0:
                                    aVar.b(false);
                                    d1 d1Var = (d1) eVar;
                                    AndroidUtilities.runOnUIThread(new m(d1Var, 15), 200L);
                                    d1Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    r.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: ig.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i14) {
                                case 0:
                                    aVar.b(false);
                                    d1 d1Var = (d1) eVar;
                                    AndroidUtilities.runOnUIThread(new m(d1Var, 15), 200L);
                                    d1Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    r.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new hg.f0(callback2, callback, i13), 2);
                    break;
                }
                break;
            case 8:
                jg.h hVar = (jg.h) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                jg.g gVar = hVar.s;
                if (gVar != null) {
                    hg.b1 b1Var = ((hg.r0) gVar).a;
                    b1Var.Z.remove(chat2);
                    b1Var.a0(true, true);
                    break;
                }
                break;
            case 9:
                ((h0) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 10:
                ((h0) this.b).run((TLRPC.Chat) this.c);
                break;
            case 11:
                lh.d.P((lh.d) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 12:
                s3 s3Var = (s3) this.b;
                h3 h3Var = (h3) this.c;
                HashSet hashSet3 = s3Var.W;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = s3Var.V.l;
                        int size3 = arrayList5.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size3) {
                                Object obj3 = arrayList5.get(i15);
                                i15++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i16 = savedStarGift.msg_id;
                                if ((i16 == 0 || i16 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList4.add(savedStarGift);
                        }
                    }
                    h3Var.run(arrayList4);
                    s3Var.dismiss();
                    break;
                }
                break;
            case 13:
                p3 p3Var = (p3) this.b;
                lh.o3 o3Var2 = (lh.o3) this.c;
                l7 l7Var = p3Var.c.V;
                l7Var.e = !l7Var.e;
                o3Var2.run();
                l7Var.i(true);
                break;
            case 14:
                r5 r5Var = (r5) this.b;
                y9 y9Var = (y9) this.c;
                r5Var.getClass();
                if (y9Var.f > 0) {
                    r5Var.presentFragment(new ja());
                    break;
                }
                break;
            case 15:
                q5.P((q5) this.b, (p5) this.c);
                break;
            case 16:
                mh.p.X((mh.p) this.b, (Context) this.c, view);
                break;
            case 17:
                mh.m0 m0Var = (mh.m0) this.b;
                Context context2 = (Context) this.c;
                int i17 = 6;
                String[] strArr = new String[6];
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    int[] iArr = mh.m0.t0;
                    if (i18 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        h0 h0Var = new h0(m0Var, 18);
                        Pattern pattern = z4.a;
                        vf.s1 b10 = vf.s1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = k6.w0(null, k6.j5, false);
                            int w03 = k6.w0(null, k6.h5, false);
                            k6.w0(null, k6.Ji, false);
                            k6.w0(null, k6.Ni, false);
                            k6.w0(null, k6.E8, false);
                            k6.w0(null, k6.G8, false);
                            k6.w0(null, k6.i6, false);
                            k6.w0(null, k6.Sh, false);
                            k6.w0(null, k6.Oh, false);
                            k6.w0(null, k6.Qh, false);
                            org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(context2, null, false, false);
                            h3Var2.fixNavigationBar();
                            h3Var2.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            yc0 yc0Var = new yc0(context2, null);
                            yc0Var.setAllItemsCount(6);
                            yc0Var.setItemCount(Math.min(6, 8));
                            yc0Var.setTextColor(w02);
                            yc0Var.setGravity(17);
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(5);
                            yc0Var.setValue(i19);
                            linearLayout.addView(yc0Var, c6.l(1.0f, 0, 432));
                            yc0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            r4 r4Var = new r4(context2, yc0Var);
                            r4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context2);
                            TextView textView = new TextView(context2);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new s2(9));
                            r4Var.addView(frameLayout, c6.t(-1, -2, 51, 22, 0, 0, 4));
                            r4Var.addView(linearLayout, c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            qh.d dVar = new qh.d(context2, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new i2(r1, 1));
                            r4Var.addView(dVar, c6.t(-1, 48, 0, 16, 12, 16, 12));
                            h3Var2.customView = r4Var;
                            h3Var2.show();
                            h3Var2.setOnDismissListener(new hg.g(i17, h0Var, yc0Var));
                            h3Var2.setBackgroundColor(w03);
                            h3Var2.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var2};
                            break;
                        }
                    } else {
                        strArr[i18] = LocaleController.formatPluralString("GiftOfferHours", iArr[i18] / 3600, new Object[0]);
                        if (iArr[i18] == m0Var.k0) {
                            i19 = i18;
                        }
                        i18++;
                    }
                }
                break;
            case 18:
                mh.v0 v0Var = (mh.v0) this.b;
                lh.a1 a1Var = (lh.a1) this.c;
                qh.d dVar2 = v0Var.f;
                if (dVar2.T && !dVar2.K) {
                    AndroidUtilities.hideKeyboard(v0Var.c);
                    dVar2.setLoading(true);
                    a1Var.run(v0Var.B);
                    break;
                }
                break;
            case 19:
                mh.i1 i1Var = (mh.i1) this.b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) this.c;
                mh.b1 b1Var2 = i1Var.l0;
                int i20 = i1Var.z0;
                if (i20 != 2) {
                    if (i20 == 1) {
                        mh.e1 e1Var2 = new mh.e1(b1Var2.getUpgradeBackdropAttribute(), b1Var2.getUpgradePatternAttribute(), b1Var2.getUpgradeImageViewAttribute());
                        i1Var.s0 = e1Var2;
                        b1Var2.setPreviewAttributes(e1Var2);
                        i1Var.S(2);
                        break;
                    }
                } else {
                    b1Var2.setPreviewingAttributes(arrayList6);
                    i1Var.S(1);
                    break;
                }
                break;
            case 20:
                mh.c1 c1Var = (mh.c1) this.b;
                mh.e1 e1Var3 = (mh.e1) this.c;
                mh.i1 i1Var2 = c1Var.K;
                int i21 = i1Var2.z0;
                mh.b1 b1Var3 = i1Var2.l0;
                if (i21 == 1) {
                    i1Var2.s0 = new mh.e1(b1Var3.getUpgradeBackdropAttribute(), b1Var3.getUpgradePatternAttribute(), b1Var3.getUpgradeImageViewAttribute());
                    i1Var2.S(2);
                }
                int i22 = i1Var2.g0.r;
                mh.e1 e1Var4 = i1Var2.s0;
                if (e1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = e1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = e1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = e1Var4.b;
                    if (i22 == 1) {
                        e1Var = new mh.e1(e1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i22 == 2) {
                        e1Var = new mh.e1(stargiftattributebackdrop, e1Var3.b, stargiftattributemodel);
                    } else if (i22 == 0) {
                        e1Var = new mh.e1(stargiftattributebackdrop, stargiftattributepattern, e1Var3.c);
                    }
                }
                i1Var2.s0 = e1Var;
                b1Var3.setPreviewAttributes(e1Var);
                i1Var2.U();
                break;
            case 21:
                af.g.u(((g5) this.b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.c).fragment_listed_url);
                break;
            case 22:
                ((g5) this.b).n2((CharSequence) this.c);
                break;
            case 23:
                f4 f4Var = (f4) this.b;
                g6 g6Var = (g6) this.c;
                if (f4Var.B.getAlpha() >= 1.0f && !f4Var.e0 && !f4Var.g0 && f4Var.a0 != null) {
                    new mh.i1(f4Var.getContext(), g6Var, f4Var.T, f4Var.W, f4Var.a0, true).show();
                    break;
                }
                break;
            case 24:
                af.g.s((Context) this.c, ((TL_stars.StarsTransaction) this.b).transaction_url);
                break;
            case 25:
                oh.e1 e1Var5 = (oh.e1) this.b;
                Context context3 = (Context) this.c;
                if (e1Var5 != null) {
                    int i23 = e1Var5.e;
                    if (i23 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            launchActivity.K0(i23);
                        }
                    }
                    p2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i23).getStoriesController().u(e1Var5.c, e1Var5.b);
                        if (u10 == null) {
                            u10 = e1Var5.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i23, context3, u10, null);
                            AndroidUtilities.runOnUIThread(new ag.f(i11), 200L);
                            break;
                        }
                    }
                }
                break;
            case 26:
                oh.f4 f4Var2 = (oh.f4) this.b;
                v7 v7Var = (v7) this.c;
                i9 i9Var = f4Var2.G0;
                if (v7Var.b == null) {
                    ic Q = new qc(f4Var2.Z0, f4Var2.y0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (v7Var.b.longValue() >= 0) {
                        bundle.putLong("user_id", v7Var.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -v7Var.b.longValue());
                    }
                    if (v7Var.e && (num = v7Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        i9Var.H(new xn(bundle));
                        break;
                    } else {
                        i9Var.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 27:
                oh.f4 f4Var3 = (oh.f4) this.b;
                org.telegram.ui.ActionBar.h3 h3Var3 = (org.telegram.ui.ActionBar.h3) this.c;
                ((z8) f4Var3.N1).h(new fg.n1(f4Var3.G0.f, 14, false));
                h3Var3.dismiss();
                break;
            case 28:
                y3 y3Var = (y3) this.b;
                d8 d8Var = (d8) this.c;
                oh.f4 f4Var4 = y3Var.l;
                ov alert = d8Var.getAlert();
                if (alert != null && (z3Var = f4Var4.N1) != null) {
                    ((z8) z3Var).h(alert);
                    f4Var4.q1.a();
                    break;
                }
                break;
            default:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                break;
        }
    }

    public /* synthetic */ n(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = 24;
        this.c = context;
        this.b = starsTransaction;
    }
}
