package bg;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.k1;
import bg.u;
import fh.a4;
import fh.d4;
import fh.e6;
import fh.f6;
import fh.g6;
import fh.z3;
import gh.da;
import gh.i4;
import gh.k5;
import gh.n7;
import gh.oa;
import ih.b4;
import ih.c4;
import ih.d9;
import ih.h8;
import ih.j7;
import ih.m9;
import ih.z7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import kh.k8;
import kh.q3;
import kh.u8;
import kh.w9;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0460 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        c4 c4Var;
        int i9 = this.a;
        int i10 = 5;
        gh.g1 g1Var = null;
        CharSequence charSequence = null;
        g1Var = null;
        final int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                g2 g2Var = (g2) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ArrayList arrayList = g2Var.T;
                if (!arrayList.isEmpty()) {
                    m1 m1Var = g2Var.W;
                    if (!m1Var.J) {
                        m1Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 0;
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i12 < size) {
                            Object obj3 = arrayList.get(i12);
                            i12++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj3;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        u0.a(chat.id, arrayList2, new j1(g2Var, chat, arrayList2, hashSet, 1), new i(g2Var, 1));
                        break;
                    }
                }
                break;
            case 1:
                g3 g3Var = (g3) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                HashSet hashSet2 = g3Var.d0;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj4 = arrayList3.get(i11);
                    i11++;
                    Long l10 = (Long) obj4;
                    l10.getClass();
                    hashSet2.remove(l10);
                    g3Var.j0.remove(l10);
                }
                g3Var.V();
                g3Var.V.b(true, hashSet2, new r2(g3Var, i10), null);
                g3Var.h0(true, true);
                g3Var.W();
                break;
            case 2:
                g3.R((g3) obj2, (TLRPC.User) obj, view);
                break;
            case 3:
                final cg.e eVar = (cg.e) obj2;
                final dg.a aVar = (dg.a) obj;
                if (!eVar.d) {
                    ((k1) eVar).r.dismiss();
                    break;
                } else if (!aVar.a.J) {
                    final int i13 = 1;
                    aVar.b(true);
                    String str = eVar.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: cg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj5) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    k1 k1Var = (k1) eVar;
                                    AndroidUtilities.runOnUIThread(new af.e(k1Var, 12), 200L);
                                    k1Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    u.c((TLRPC.TL_error) obj5, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: cg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj5) {
                            switch (i13) {
                                case 0:
                                    aVar.b(false);
                                    k1 k1Var = (k1) eVar;
                                    AndroidUtilities.runOnUIThread(new af.e(k1Var, 12), 200L);
                                    k1Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar2 = eVar;
                                    u.c((TLRPC.TL_error) obj5, eVar2.n, eVar2.c, new c(eVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new i0(callback2, callback, i11), 2);
                    break;
                }
                break;
            case 4:
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                dg.g gVar = ((dg.h) obj2).s;
                if (gVar != null) {
                    h1 h1Var = ((w0) gVar).a;
                    h1Var.Y.remove(chat2);
                    h1Var.Z(true, true);
                    break;
                }
                break;
            case 5:
                ((i) obj2).run((TLRPC.TL_payments_checkedGiftCode) obj);
                break;
            case 6:
                ((i) obj2).run((TLRPC.Chat) obj);
                break;
            case 7:
                fh.d.O((fh.d) obj2, (TL_stars.TL_StarGiftAuctionAcquiredGift) obj);
                break;
            case 8:
                d4 d4Var = (d4) obj2;
                fh.v2 v2Var = (fh.v2) obj;
                HashSet hashSet3 = d4Var.V;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = d4Var.U.l;
                        int size3 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj5 = arrayList5.get(i14);
                            i14++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj5;
                            int i15 = savedStarGift2.msg_id;
                            if ((i15 != 0 && i15 == longValue) || savedStarGift2.saved_id == longValue) {
                                savedStarGift = savedStarGift2;
                                if (savedStarGift == null) {
                                    arrayList4.add(savedStarGift);
                                }
                            }
                        }
                        savedStarGift = null;
                        if (savedStarGift == null) {
                        }
                    }
                    v2Var.run(arrayList4);
                    d4Var.dismiss();
                    break;
                }
                break;
            case 9:
                n7 n7Var = ((a4) obj2).c.U;
                n7Var.e = !n7Var.e;
                ((z3) obj).run();
                n7Var.i(true);
                break;
            case 10:
                g6 g6Var = (g6) obj2;
                g6Var.getClass();
                if (((da) obj).f > 0) {
                    g6Var.presentFragment(new oa());
                    break;
                }
                break;
            case 11:
                f6.O((f6) obj2, (e6) obj);
                break;
            case 12:
                gh.r.W((gh.r) obj2, (Context) obj, view);
                break;
            case 13:
                gh.o0 o0Var = (gh.o0) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    int[] iArr = gh.o0.s0;
                    if (i16 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        i iVar = new i(o0Var, 11);
                        Pattern pattern = y4.a;
                        pf.u1 b10 = pf.u1.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false);
                            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ji, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ni, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                            org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, null, false, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            bc0 bc0Var = new bc0(context, null);
                            bc0Var.setAllItemsCount(6);
                            bc0Var.setItemCount(Math.min(6, 8));
                            bc0Var.setTextColor(w02);
                            bc0Var.setGravity(17);
                            bc0Var.setMinValue(0);
                            bc0Var.setMaxValue(5);
                            bc0Var.setValue(i17);
                            linearLayout.addView(bc0Var, g7.e6.l(1.0f, 0, 432));
                            bc0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            q4 q4Var = new q4(context, bc0Var);
                            q4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new jh.d(10));
                            q4Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                            q4Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            kh.d dVar = new kh.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.h2(r3, 1));
                            q4Var.addView(dVar, g7.e6.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = q4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new j(9, iVar, bc0Var));
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
                            break;
                        }
                    } else {
                        strArr[i16] = LocaleController.formatPluralString("GiftOfferHours", iArr[i16] / 3600, new Object[0]);
                        if (iArr[i16] == o0Var.j0) {
                            i17 = i16;
                        }
                        i16++;
                    }
                }
                break;
            case 14:
                gh.x0 x0Var = (gh.x0) obj2;
                fh.f1 f1Var = (fh.f1) obj;
                kh.d dVar2 = x0Var.f;
                if (dVar2.S && !dVar2.J) {
                    AndroidUtilities.hideKeyboard(x0Var.c);
                    dVar2.setLoading(true);
                    f1Var.run(x0Var.A);
                    break;
                }
                break;
            case 15:
                gh.l1 l1Var = (gh.l1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList6 = (ArrayList) obj;
                gh.d1 d1Var = l1Var.k0;
                int i18 = l1Var.y0;
                if (i18 != 2) {
                    if (i18 == 1) {
                        gh.g1 g1Var2 = new gh.g1(d1Var.getUpgradeBackdropAttribute(), d1Var.getUpgradePatternAttribute(), d1Var.getUpgradeImageViewAttribute());
                        l1Var.r0 = g1Var2;
                        d1Var.setPreviewAttributes(g1Var2);
                        l1Var.R(2);
                        break;
                    }
                } else {
                    d1Var.setPreviewingAttributes(arrayList6);
                    l1Var.R(1);
                    break;
                }
                break;
            case 16:
                gh.g1 g1Var3 = (gh.g1) obj;
                gh.l1 l1Var2 = ((gh.e1) obj2).J;
                int i19 = l1Var2.y0;
                gh.d1 d1Var2 = l1Var2.k0;
                if (i19 == 1) {
                    l1Var2.r0 = new gh.g1(d1Var2.getUpgradeBackdropAttribute(), d1Var2.getUpgradePatternAttribute(), d1Var2.getUpgradeImageViewAttribute());
                    l1Var2.R(2);
                }
                int i20 = l1Var2.f0.r;
                gh.g1 g1Var4 = l1Var2.r0;
                if (g1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g1Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = g1Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = g1Var4.b;
                    if (i20 == 1) {
                        g1Var = new gh.g1(g1Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i20 == 2) {
                        g1Var = new gh.g1(stargiftattributebackdrop, g1Var3.b, stargiftattributemodel);
                    } else if (i20 == 0) {
                        g1Var = new gh.g1(stargiftattributebackdrop, stargiftattributepattern, g1Var3.c);
                    }
                }
                l1Var2.r0 = g1Var;
                d1Var2.setPreviewAttributes(g1Var);
                l1Var2.T();
                break;
            case 17:
                ve.e.u(((k5) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                break;
            case 18:
                ((k5) obj2).n2((CharSequence) obj);
                break;
            case 19:
                i4 i4Var = (i4) obj2;
                b6 b6Var = (b6) obj;
                if (i4Var.A.getAlpha() >= 1.0f && !i4Var.d0 && !i4Var.f0 && i4Var.W != null) {
                    new gh.l1(i4Var.getContext(), b6Var, i4Var.S, i4Var.V, i4Var.W, true).show();
                    break;
                }
                break;
            case 20:
                ve.e.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                break;
            case 21:
                ih.f1 f1Var2 = (ih.f1) obj2;
                Context context2 = (Context) obj;
                if (f1Var2 != null) {
                    int i21 = f1Var2.e;
                    if (i21 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            launchActivity.K0(i21);
                        }
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i21).getStoriesController().u(f1Var2.c, f1Var2.b);
                        if (u10 == null) {
                            u10 = f1Var2.a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i21, context2, u10, null);
                            AndroidUtilities.runOnUIThread(new d2(10), 200L);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ih.i4 i4Var2 = (ih.i4) obj2;
                z7 z7Var = (z7) obj;
                m9 m9Var = i4Var2.F0;
                if (z7Var.b == null) {
                    gc Q = new oc(i4Var2.Y0, i4Var2.x0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    if (z7Var.b.longValue() >= 0) {
                        bundle.putLong("user_id", z7Var.b.longValue());
                    } else {
                        bundle.putLong("chat_id", -z7Var.b.longValue());
                    }
                    if (z7Var.e && (num = z7Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        m9Var.H(new qn(bundle));
                        break;
                    } else {
                        m9Var.H(new ProfileActivity(bundle, null));
                        break;
                    }
                }
                break;
            case 23:
                ih.i4 i4Var3 = (ih.i4) obj2;
                ((d9) i4Var3.M1).h(new zf.x0(i4Var3.F0.f, 14, false));
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                break;
            case 24:
                ih.i4 i4Var4 = ((b4) obj2).l;
                dv alert = ((h8) obj).getAlert();
                if (alert != null && (c4Var = i4Var4.M1) != null) {
                    ((d9) c4Var).h(alert);
                    i4Var4.p1.a();
                    break;
                }
                break;
            case 25:
                q3 q3Var = (q3) obj2;
                q3Var.e((MediaController.AlbumEntry) obj, false);
                q3Var.B.n();
                break;
            case 26:
                k8 k8Var = (k8) obj2;
                j7 j7Var = (j7) obj;
                j3 j3Var = k8Var.U;
                try {
                    charSequence = ((ClipboardManager) k8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(k8Var.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    j3Var.b.setText(charSequence.toString());
                    h3 h3Var = j3Var.b;
                    h3Var.setSelection(0, h3Var.getText().length());
                }
                j7Var.run();
                break;
            case 27:
                wb wbVar = (wb) obj2;
                new u8((Context) obj, wbVar.c, true, wbVar.t0, new w9(wbVar, 20), wbVar.a).show();
                break;
            case 28:
                mh.l.w0((mh.l) obj2, (Context) obj);
                break;
            default:
                mh.c3 c3Var = (mh.c3) obj2;
                mh.j0 j0Var = (mh.j0) obj;
                if (j0Var.c()) {
                    j0Var.a();
                } else {
                    File file = j0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = j0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                    }
                }
                x60 x60Var = c3Var.G0;
                if (x60Var != null) {
                    x60Var.u();
                    c3Var.G0 = null;
                    break;
                }
                break;
        }
    }
}
