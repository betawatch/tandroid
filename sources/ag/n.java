package ag;

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
import bg.n3;
import bg.r3;
import bg.u3;
import cg.m2;
import eg.e1;
import eg.s;
import eg.w2;
import i7.f6;
import ih.o3;
import ih.p3;
import ih.p5;
import ih.q5;
import ih.r5;
import ih.s3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import jh.g4;
import jh.h5;
import jh.ia;
import jh.k7;
import jh.x9;
import lh.d4;
import lh.d8;
import lh.i9;
import lh.v7;
import lh.w3;
import lh.x3;
import lh.z8;
import nh.yb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        r3 j10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        x3 x3Var;
        int i10 = 5;
        int i11 = 8;
        int i12 = 3;
        jh.f1 f1Var = null;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                Context context = (Context) this.c;
                if (!f0Var.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(f0Var.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    f0Var.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    q qVar = new q(f0Var, context, createBitmap);
                    f0Var.n.f().addView(qVar, f6.c(-1.0f, -1));
                    z zVar = f0Var.n;
                    Objects.requireNonNull(zVar);
                    qVar.setColorListener(new p(zVar, i13));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(jr.f);
                    duration.addUpdateListener(new bg.q1(qVar, i12));
                    duration.start();
                    f0Var.n.a();
                    f0Var.dismiss();
                    break;
                }
                break;
            case 1:
                u3 u3Var = (u3) this.b;
                yb ybVar = (yb) this.c;
                r3[] r3VarArr = u3Var.D;
                if (r3VarArr != null && r3VarArr.length != 0 && u3Var.E != null && (j10 = u3Var.j(u3Var.j0, u3Var.k0)) != null) {
                    ybVar.run(j10);
                    break;
                }
                break;
            case 2:
                on.d0((tn) this.c, 41026, new i0((bh.f) this.b, 4), null);
                break;
            case 3:
                cg.v0.V((cg.v0) this.b, (Context) this.c);
                break;
            case 4:
                eg.x1 x1Var = (eg.x1) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = x1Var.T;
                if (!arrayList.isEmpty()) {
                    eg.g1 g1Var = x1Var.W;
                    if (!g1Var.J) {
                        g1Var.setLoading(true);
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
                        eg.q0.a(chat.id, arrayList2, new eg.d1(x1Var, chat, arrayList2, hashSet, 1), new i0(x1Var, i11));
                        break;
                    }
                }
                break;
            case 5:
                w2 w2Var = (w2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashSet hashSet2 = w2Var.d0;
                int size2 = arrayList3.size();
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    w2Var.j0.remove(l10);
                }
                w2Var.W();
                w2Var.V.b(true, hashSet2, new eg.h2(w2Var, i10), null);
                w2Var.i0(true, true);
                w2Var.X();
                break;
            case 6:
                w2.S((w2) this.b, (TLRPC.User) this.c, view);
                break;
            case 7:
                final fg.e eVar = (fg.e) this.b;
                final gg.a aVar = (gg.a) this.c;
                if (!eVar.d) {
                    ((eg.e1) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.J) {
                    final int i14 = 1;
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: fg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i13) {
                                case 0:
                                    aVar.b(false);
                                    e1 e1Var = (e1) eVar;
                                    AndroidUtilities.runOnUIThread(new m2(e1Var, 11), 200L);
                                    e1Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    s.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: fg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i14) {
                                case 0:
                                    aVar.b(false);
                                    e1 e1Var = (e1) eVar;
                                    AndroidUtilities.runOnUIThread(new m2(e1Var, 11), 200L);
                                    e1Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    s.c((TLRPC.TL_error) obj3, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new eg.g0(callback2, callback, i13), 2);
                    break;
                }
                break;
            case 8:
                gg.h hVar = (gg.h) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                gg.g gVar = hVar.s;
                if (gVar != null) {
                    eg.c1 c1Var = ((eg.s0) gVar).a;
                    c1Var.Y.remove(chat2);
                    c1Var.a0(true, true);
                    break;
                }
                break;
            case 9:
                ((i0) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 10:
                ((i0) this.b).run((TLRPC.Chat) this.c);
                break;
            case 11:
                ih.d.P((ih.d) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 12:
                s3 s3Var = (s3) this.b;
                n3 n3Var = (n3) this.c;
                HashSet hashSet3 = s3Var.V;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = s3Var.U.l;
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
                    n3Var.run(arrayList4);
                    s3Var.dismiss();
                    break;
                }
                break;
            case 13:
                p3 p3Var = (p3) this.b;
                o3 o3Var = (o3) this.c;
                k7 k7Var = p3Var.c.U;
                k7Var.e = !k7Var.e;
                o3Var.run();
                k7Var.i(true);
                break;
            case 14:
                r5 r5Var = (r5) this.b;
                x9 x9Var = (x9) this.c;
                r5Var.getClass();
                if (x9Var.f > 0) {
                    r5Var.presentFragment(new ia());
                    break;
                }
                break;
            case 15:
                q5.P((q5) this.b, (p5) this.c);
                break;
            case 16:
                jh.q.X((jh.q) this.b, (Context) this.c, view);
                break;
            case 17:
                jh.n0 n0Var = (jh.n0) this.b;
                Context context2 = (Context) this.c;
                int i17 = 6;
                String[] strArr = new String[6];
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    int[] iArr = jh.n0.s0;
                    if (i18 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        i0 i0Var = new i0(n0Var, 18);
                        Pattern pattern = c5.a;
                        sf.v1 b10 = sf.v1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = g6.w0(null, g6.j5, false);
                            int w03 = g6.w0(null, g6.h5, false);
                            g6.w0(null, g6.Ji, false);
                            g6.w0(null, g6.Ni, false);
                            g6.w0(null, g6.E8, false);
                            g6.w0(null, g6.G8, false);
                            g6.w0(null, g6.i6, false);
                            g6.w0(null, g6.Sh, false);
                            g6.w0(null, g6.Oh, false);
                            g6.w0(null, g6.Qh, false);
                            f3 f3Var = new f3(context2, null, false, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            qc0 qc0Var = new qc0(context2, null);
                            qc0Var.setAllItemsCount(6);
                            qc0Var.setItemCount(Math.min(6, 8));
                            qc0Var.setTextColor(w02);
                            qc0Var.setGravity(17);
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(5);
                            qc0Var.setValue(i19);
                            linearLayout.addView(qc0Var, f6.l(1.0f, 0, 432));
                            qc0Var.setFormatter(new org.telegram.ui.Components.u(strArr, 7));
                            u4 u4Var = new u4(context2, qc0Var);
                            u4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context2);
                            TextView textView = new TextView(context2);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new mh.d(10));
                            u4Var.addView(frameLayout, f6.t(-1, -2, 51, 22, 0, 0, 4));
                            u4Var.addView(linearLayout, f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            nh.d dVar = new nh.d(context2, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r1, 1));
                            u4Var.addView(dVar, f6.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = u4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new eg.g(i17, i0Var, qc0Var));
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                            f3[] f3VarArr = {f3Var};
                            break;
                        }
                    } else {
                        strArr[i18] = LocaleController.formatPluralString("GiftOfferHours", iArr[i18] / 3600, new Object[0]);
                        if (iArr[i18] == n0Var.j0) {
                            i19 = i18;
                        }
                        i18++;
                    }
                }
                break;
            case 18:
                jh.w0 w0Var = (jh.w0) this.b;
                ih.b1 b1Var = (ih.b1) this.c;
                nh.d dVar2 = w0Var.f;
                if (dVar2.S && !dVar2.J) {
                    AndroidUtilities.hideKeyboard(w0Var.c);
                    dVar2.setLoading(true);
                    b1Var.run(w0Var.A);
                    break;
                }
                break;
            case 19:
                jh.j1 j1Var = (jh.j1) this.b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) this.c;
                jh.c1 c1Var2 = j1Var.k0;
                int i20 = j1Var.y0;
                if (i20 != 2) {
                    if (i20 == 1) {
                        jh.f1 f1Var2 = new jh.f1(c1Var2.getUpgradeBackdropAttribute(), c1Var2.getUpgradePatternAttribute(), c1Var2.getUpgradeImageViewAttribute());
                        j1Var.r0 = f1Var2;
                        c1Var2.setPreviewAttributes(f1Var2);
                        j1Var.S(2);
                        break;
                    }
                } else {
                    c1Var2.setPreviewingAttributes(arrayList6);
                    j1Var.S(1);
                    break;
                }
                break;
            case 20:
                jh.d1 d1Var = (jh.d1) this.b;
                jh.f1 f1Var3 = (jh.f1) this.c;
                jh.j1 j1Var2 = d1Var.J;
                int i21 = j1Var2.y0;
                jh.c1 c1Var3 = j1Var2.k0;
                if (i21 == 1) {
                    j1Var2.r0 = new jh.f1(c1Var3.getUpgradeBackdropAttribute(), c1Var3.getUpgradePatternAttribute(), c1Var3.getUpgradeImageViewAttribute());
                    j1Var2.S(2);
                }
                int i22 = j1Var2.f0.r;
                jh.f1 f1Var4 = j1Var2.r0;
                if (f1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var4.b;
                    if (i22 == 1) {
                        f1Var = new jh.f1(f1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i22 == 2) {
                        f1Var = new jh.f1(stargiftattributebackdrop, f1Var3.b, stargiftattributemodel);
                    } else if (i22 == 0) {
                        f1Var = new jh.f1(stargiftattributebackdrop, stargiftattributepattern, f1Var3.c);
                    }
                }
                j1Var2.r0 = f1Var;
                c1Var3.setPreviewAttributes(f1Var);
                j1Var2.U();
                break;
            case 21:
                ye.d.u(((h5) this.b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.c).fragment_listed_url);
                break;
            case 22:
                ((h5) this.b).n2((CharSequence) this.c);
                break;
            case 23:
                g4 g4Var = (g4) this.b;
                c6 c6Var = (c6) this.c;
                if (g4Var.A.getAlpha() >= 1.0f && !g4Var.d0 && !g4Var.f0 && g4Var.W != null) {
                    new jh.j1(g4Var.getContext(), c6Var, g4Var.S, g4Var.V, g4Var.W, true).show();
                    break;
                }
                break;
            case 24:
                ye.d.s((Context) this.c, ((TL_stars.StarsTransaction) this.b).transaction_url);
                break;
            case 25:
                lh.d1 d1Var2 = (lh.d1) this.b;
                Context context3 = (Context) this.c;
                if (d1Var2 != null) {
                    int i23 = d1Var2.e;
                    if (i23 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            launchActivity.K0(i23);
                        }
                    }
                    o2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i23).getStoriesController().u(d1Var2.c, d1Var2.b);
                        if (u10 == null) {
                            u10 = d1Var2.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().B(i23, context3, u10, null);
                            AndroidUtilities.runOnUIThread(new o0(15), 200L);
                            break;
                        }
                    }
                }
                break;
            case 26:
                d4 d4Var = (d4) this.b;
                v7 v7Var = (v7) this.c;
                i9 i9Var = d4Var.F0;
                if (v7Var.b == null) {
                    mc Q = new tc(d4Var.Y0, d4Var.x0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
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
                        i9Var.H(new tn(bundle));
                        break;
                    } else {
                        i9Var.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 27:
                d4 d4Var2 = (d4) this.b;
                f3 f3Var2 = (f3) this.c;
                ((z8) d4Var2.M1).h(new cg.p1(d4Var2.F0.f, 14, false));
                f3Var2.dismiss();
                break;
            case 28:
                w3 w3Var = (w3) this.b;
                d8 d8Var = (d8) this.c;
                d4 d4Var3 = w3Var.l;
                jv alert = d8Var.getAlert();
                if (alert != null && (x3Var = d4Var3.M1) != null) {
                    ((z8) x3Var).h(alert);
                    d4Var3.p1.a();
                    break;
                }
                break;
            default:
                nh.n3 n3Var2 = (nh.n3) this.b;
                n3Var2.e((MediaController.AlbumEntry) this.c, false);
                n3Var2.B.n();
                break;
        }
    }

    public /* synthetic */ n(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.a = 24;
        this.c = context;
        this.b = starsTransaction;
    }
}
