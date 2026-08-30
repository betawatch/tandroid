package cg;

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
import dg.j3;
import dg.n3;
import dg.q3;
import gg.d1;
import gg.r;
import gg.v2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import k7.b6;
import kh.o3;
import kh.p3;
import kh.p5;
import kh.q5;
import kh.r5;
import kh.s3;
import lh.f4;
import lh.g5;
import lh.ja;
import lh.l7;
import lh.y9;
import nh.d4;
import nh.d8;
import nh.i9;
import nh.v7;
import nh.w3;
import nh.x3;
import nh.z8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        n3 j10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        x3 x3Var;
        int i10 = 5;
        int i11 = 8;
        int i12 = 3;
        lh.f1 f1Var = null;
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
                    e0Var.n.f().addView(pVar, b6.c(-1.0f, -1));
                    y yVar = e0Var.n;
                    Objects.requireNonNull(yVar);
                    pVar.setColorListener(new o(yVar, i13));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(nr.f);
                    duration.addUpdateListener(new dg.o1(pVar, i12));
                    duration.start();
                    e0Var.n.a();
                    e0Var.dismiss();
                    break;
                }
                break;
            case 1:
                q3 q3Var = (q3) this.b;
                ll llVar = (ll) this.c;
                n3[] n3VarArr = q3Var.E;
                if (n3VarArr != null && n3VarArr.length != 0 && q3Var.F != null && (j10 = q3Var.j(q3Var.k0, q3Var.l0)) != null) {
                    llVar.run(j10);
                    break;
                }
                break;
            case 2:
                qn.d0((xn) this.c, 41026, new h0((dh.f) this.b, 4), null);
                break;
            case 3:
                eg.v0.V((eg.v0) this.b, (Context) this.c);
                break;
            case 4:
                gg.w1 w1Var = (gg.w1) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = w1Var.U;
                if (!arrayList.isEmpty()) {
                    gg.f1 f1Var2 = w1Var.X;
                    if (!f1Var2.K) {
                        f1Var2.setLoading(true);
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
                        gg.p0.a(chat.id, arrayList2, new gg.c1(w1Var, chat, arrayList2, hashSet, 1), new h0(w1Var, i11));
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
                v2Var.W.b(true, hashSet2, new gg.g2(v2Var, i10), null);
                v2Var.i0(true, true);
                v2Var.X();
                break;
            case 6:
                v2.S((v2) this.b, (TLRPC.User) this.c, view);
                break;
            case 7:
                final hg.e eVar = (hg.e) this.b;
                final ig.a aVar = (ig.a) this.c;
                if (!eVar.d) {
                    ((gg.d1) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.K) {
                    final int i14 = 1;
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: hg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i13) {
                                case 0:
                                    aVar.b(false);
                                    d1 d1Var = (d1) eVar;
                                    AndroidUtilities.runOnUIThread(new ef.e(d1Var, 13), 200L);
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
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: hg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i14) {
                                case 0:
                                    aVar.b(false);
                                    d1 d1Var = (d1) eVar;
                                    AndroidUtilities.runOnUIThread(new ef.e(d1Var, 13), 200L);
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
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new gg.f0(callback2, callback, i13), 2);
                    break;
                }
                break;
            case 8:
                ig.h hVar = (ig.h) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ig.g gVar = hVar.s;
                if (gVar != null) {
                    gg.b1 b1Var = ((gg.r0) gVar).a;
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
                kh.d.P((kh.d) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 12:
                s3 s3Var = (s3) this.b;
                j3 j3Var = (j3) this.c;
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
                    j3Var.run(arrayList4);
                    s3Var.dismiss();
                    break;
                }
                break;
            case 13:
                p3 p3Var = (p3) this.b;
                o3 o3Var = (o3) this.c;
                l7 l7Var = p3Var.c.V;
                l7Var.e = !l7Var.e;
                o3Var.run();
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
                lh.q.X((lh.q) this.b, (Context) this.c, view);
                break;
            case 17:
                lh.n0 n0Var = (lh.n0) this.b;
                Context context2 = (Context) this.c;
                int i17 = 6;
                String[] strArr = new String[6];
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    int[] iArr = lh.n0.t0;
                    if (i18 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        h0 h0Var = new h0(n0Var, 18);
                        Pattern pattern = z4.a;
                        uf.s1 b10 = uf.s1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = j6.w0(null, j6.j5, false);
                            int w03 = j6.w0(null, j6.h5, false);
                            j6.w0(null, j6.Ji, false);
                            j6.w0(null, j6.Ni, false);
                            j6.w0(null, j6.E8, false);
                            j6.w0(null, j6.G8, false);
                            j6.w0(null, j6.i6, false);
                            j6.w0(null, j6.Sh, false);
                            j6.w0(null, j6.Oh, false);
                            j6.w0(null, j6.Qh, false);
                            g3 g3Var = new g3(context2, null, false, false);
                            g3Var.fixNavigationBar();
                            g3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            wc0 wc0Var = new wc0(context2, null);
                            wc0Var.setAllItemsCount(6);
                            wc0Var.setItemCount(Math.min(6, 8));
                            wc0Var.setTextColor(w02);
                            wc0Var.setGravity(17);
                            wc0Var.setMinValue(0);
                            wc0Var.setMaxValue(5);
                            wc0Var.setValue(i19);
                            linearLayout.addView(wc0Var, b6.l(1.0f, 0, 432));
                            wc0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            r4 r4Var = new r4(context2, wc0Var);
                            r4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context2);
                            TextView textView = new TextView(context2);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new oh.d(10));
                            r4Var.addView(frameLayout, b6.t(-1, -2, 51, 22, 0, 0, 4));
                            r4Var.addView(linearLayout, b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ph.d dVar = new ph.d(context2, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.i2(r1, 1));
                            r4Var.addView(dVar, b6.t(-1, 48, 0, 16, 12, 16, 12));
                            g3Var.customView = r4Var;
                            g3Var.show();
                            g3Var.setOnDismissListener(new gg.g(i17, h0Var, wc0Var));
                            g3Var.setBackgroundColor(w03);
                            g3Var.fixNavigationBar(w03);
                            g3[] g3VarArr = {g3Var};
                            break;
                        }
                    } else {
                        strArr[i18] = LocaleController.formatPluralString("GiftOfferHours", iArr[i18] / 3600, new Object[0]);
                        if (iArr[i18] == n0Var.k0) {
                            i19 = i18;
                        }
                        i18++;
                    }
                }
                break;
            case 18:
                lh.w0 w0Var = (lh.w0) this.b;
                kh.a1 a1Var = (kh.a1) this.c;
                ph.d dVar2 = w0Var.f;
                if (dVar2.T && !dVar2.K) {
                    AndroidUtilities.hideKeyboard(w0Var.c);
                    dVar2.setLoading(true);
                    a1Var.run(w0Var.B);
                    break;
                }
                break;
            case 19:
                lh.j1 j1Var = (lh.j1) this.b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) this.c;
                lh.c1 c1Var = j1Var.l0;
                int i20 = j1Var.z0;
                if (i20 != 2) {
                    if (i20 == 1) {
                        lh.f1 f1Var3 = new lh.f1(c1Var.getUpgradeBackdropAttribute(), c1Var.getUpgradePatternAttribute(), c1Var.getUpgradeImageViewAttribute());
                        j1Var.s0 = f1Var3;
                        c1Var.setPreviewAttributes(f1Var3);
                        j1Var.S(2);
                        break;
                    }
                } else {
                    c1Var.setPreviewingAttributes(arrayList6);
                    j1Var.S(1);
                    break;
                }
                break;
            case 20:
                lh.d1 d1Var = (lh.d1) this.b;
                lh.f1 f1Var4 = (lh.f1) this.c;
                lh.j1 j1Var2 = d1Var.K;
                int i21 = j1Var2.z0;
                lh.c1 c1Var2 = j1Var2.l0;
                if (i21 == 1) {
                    j1Var2.s0 = new lh.f1(c1Var2.getUpgradeBackdropAttribute(), c1Var2.getUpgradePatternAttribute(), c1Var2.getUpgradeImageViewAttribute());
                    j1Var2.S(2);
                }
                int i22 = j1Var2.g0.r;
                lh.f1 f1Var5 = j1Var2.s0;
                if (f1Var5 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var5.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var5.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var5.b;
                    if (i22 == 1) {
                        f1Var = new lh.f1(f1Var4.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i22 == 2) {
                        f1Var = new lh.f1(stargiftattributebackdrop, f1Var4.b, stargiftattributemodel);
                    } else if (i22 == 0) {
                        f1Var = new lh.f1(stargiftattributebackdrop, stargiftattributepattern, f1Var4.c);
                    }
                }
                j1Var2.s0 = f1Var;
                c1Var2.setPreviewAttributes(f1Var);
                j1Var2.U();
                break;
            case 21:
                af.g.u(((g5) this.b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.c).fragment_listed_url);
                break;
            case 22:
                ((g5) this.b).n2((CharSequence) this.c);
                break;
            case 23:
                f4 f4Var = (f4) this.b;
                f6 f6Var = (f6) this.c;
                if (f4Var.B.getAlpha() >= 1.0f && !f4Var.e0 && !f4Var.g0 && f4Var.a0 != null) {
                    new lh.j1(f4Var.getContext(), f6Var, f4Var.T, f4Var.W, f4Var.a0, true).show();
                    break;
                }
                break;
            case 24:
                af.g.s((Context) this.c, ((TL_stars.StarsTransaction) this.b).transaction_url);
                break;
            case 25:
                nh.e1 e1Var = (nh.e1) this.b;
                Context context3 = (Context) this.c;
                if (e1Var != null) {
                    int i23 = e1Var.e;
                    if (i23 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            launchActivity.K0(i23);
                        }
                    }
                    p2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i23).getStoriesController().u(e1Var.c, e1Var.b);
                        if (u10 == null) {
                            u10 = e1Var.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i23, context3, u10, null);
                            AndroidUtilities.runOnUIThread(new n0(15), 200L);
                            break;
                        }
                    }
                }
                break;
            case 26:
                d4 d4Var = (d4) this.b;
                v7 v7Var = (v7) this.c;
                i9 i9Var = d4Var.G0;
                if (v7Var.b == null) {
                    ic Q = new qc(d4Var.Z0, d4Var.y0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
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
                d4 d4Var2 = (d4) this.b;
                g3 g3Var2 = (g3) this.c;
                ((z8) d4Var2.N1).h(new eg.o1(d4Var2.G0.f, 14, false));
                g3Var2.dismiss();
                break;
            case 28:
                w3 w3Var = (w3) this.b;
                d8 d8Var = (d8) this.c;
                d4 d4Var3 = w3Var.l;
                mv alert = d8Var.getAlert();
                if (alert != null && (x3Var = d4Var3.N1) != null) {
                    ((z8) x3Var).h(alert);
                    d4Var3.q1.a();
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
