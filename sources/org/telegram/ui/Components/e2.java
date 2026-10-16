package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements sd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.z1, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e2(int i10, ud0 ud0Var, f4 f4Var, g4 g4Var, TextView textView) {
        this.a = 0;
        this.b = i10;
        this.c = ud0Var;
        this.d = f4Var;
        this.e = g4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.sn0 sn0Var = (org.telegram.ui.sn0) this.c;
                org.telegram.ui.sn0.Z(this.b, (String) this.f, (SecureDocument) this.d, (org.telegram.ui.qn0) this.e, sn0Var);
                break;
            default:
                zh.x2 x2Var = (zh.x2) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                zh.v2 v2Var = (zh.v2) x2Var.o.get(x2Var.q);
                if (v2Var != null) {
                    ag.a aVar = v2Var.c;
                    zh.n5 x10 = zh.n5.x(this.b, x2Var.q);
                    ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        ag.b bVar = x2Var.q;
                        if (bVar != ag.b.a) {
                            if (bVar == ag.b.b) {
                                new ei.h(context, c6Var, v2Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new zh.e7(context, c6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        pf.c cVar = x2Var.n;
                        if (cVar != null) {
                            cVar.a(false);
                            x2Var.n = null;
                        }
                        callback2.run(v2Var, a2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        rg.p2 p2Var = (rg.p2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        org.telegram.ui.tr0 tr0Var = (org.telegram.ui.tr0) this.e;
        fi.r4 r4Var = (fi.r4) this.f;
        p2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new n21(p2Var, bitmap, i10, tr0Var, 19), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.jg0) this.c, (String) this.d, iVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        ud0 ud0Var2 = (ud0) this.c;
        f4 f4Var = (f4) this.d;
        g4 g4Var = (g4) this.e;
        TextView textView = (TextView) this.f;
        g5.f(null, null, 0L, this.b, 3, ud0Var2, f4Var, g4Var);
        g5.d(textView, ud0Var2, f4Var, g4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        lz0 lz0Var = (lz0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != lz0Var.I) {
            return;
        }
        lz0Var.G = 1;
        lz0Var.H = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                if (!hashSet.contains(keywordResult.emoji)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            lz0Var.w = null;
            lz0Var.x = true;
            lz0Var.f();
            return;
        }
        lz0Var.x = false;
        lz0Var.v = false;
        lz0Var.c();
        ah.x xVar = lz0Var.d;
        if (xVar != null) {
            xVar.setVisibility(0);
        }
        lz0Var.U = AndroidUtilities.dp(10.0f);
        lz0Var.w = arrayList;
        lz0Var.V = 0;
        lz0Var.W = Integer.valueOf(str2.length());
        ah.x xVar2 = lz0Var.d;
        if (xVar2 != null) {
            xVar2.invalidate();
        }
        iz0 iz0Var = lz0Var.f;
        if (iz0Var != null) {
            iz0Var.l();
        }
    }

    public /* synthetic */ e2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ e2(org.telegram.ui.jg0 jg0Var, String str, String str2, String str3, int i10) {
        this.a = 2;
        this.c = jg0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ns0 ns0Var = (ns0) this.c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        zh.e5 e5Var = ns0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ns0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= e5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) e5Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) e5Var.d().get(i10);
                    break;
                }
                i10++;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ns0Var.c));
            boolean h = e5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            l80 H = l80.H(m2Var, view);
            H.W(new qs0(ns0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.s1(ns0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(ns0Var, i12, publicUsername, tL_starGiftCollection2, context, c6Var, m2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new s9.b(27, ns0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.s1(ns0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.c90(ns0Var, i11, tL_starGiftCollection2, 21));
            ns0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
