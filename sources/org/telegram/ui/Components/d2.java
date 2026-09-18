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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements bd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d2(int i10, dd0 dd0Var, d4 d4Var, e4 e4Var, TextView textView) {
        this.a = 0;
        this.b = i10;
        this.c = dd0Var;
        this.d = d4Var;
        this.e = e4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) this.c;
                org.telegram.ui.pn0.Z(this.b, (String) this.f, (SecureDocument) this.d, (org.telegram.ui.nn0) this.e, pn0Var);
                break;
            default:
                yh.d3 d3Var = (yh.d3) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                yh.b3 b3Var = (yh.b3) d3Var.o.get(d3Var.q);
                if (b3Var != null) {
                    zf.a aVar = b3Var.c;
                    yh.t5 x10 = yh.t5.x(this.b, d3Var.q);
                    zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        zf.b bVar = d3Var.q;
                        if (bVar != zf.b.a) {
                            if (bVar == zf.b.b) {
                                new di.h(context, e6Var, b3Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new yh.k7(context, e6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        nf.e eVar = d3Var.n;
                        if (eVar != null) {
                            eVar.a(false);
                            d3Var.n = null;
                        }
                        callback2.run(b3Var, b2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        qg.m2 m2Var = (qg.m2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this.e;
        ei.r4 r4Var = (ei.r4) this.f;
        m2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && m2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new h21(m2Var, bitmap, i10, pr0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.gg0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        dd0 dd0Var2 = (dd0) this.c;
        d4 d4Var = (d4) this.d;
        e4 e4Var = (e4) this.e;
        TextView textView = (TextView) this.f;
        e5.g(null, null, 0L, this.b, 3, dd0Var2, d4Var, e4Var);
        e5.e(textView, dd0Var2, d4Var, e4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        zy0 zy0Var = (zy0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != zy0Var.I) {
            return;
        }
        zy0Var.G = 1;
        zy0Var.H = str2;
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
            zy0Var.w = null;
            zy0Var.x = true;
            zy0Var.f();
            return;
        }
        zy0Var.x = false;
        zy0Var.v = false;
        zy0Var.c();
        ai.f0 f0Var = zy0Var.d;
        if (f0Var != null) {
            f0Var.setVisibility(0);
        }
        zy0Var.U = AndroidUtilities.dp(10.0f);
        zy0Var.w = arrayList;
        zy0Var.V = 0;
        zy0Var.W = Integer.valueOf(str2.length());
        ai.f0 f0Var2 = zy0Var.d;
        if (f0Var2 != null) {
            f0Var2.invalidate();
        }
        wy0 wy0Var = zy0Var.f;
        if (wy0Var != null) {
            wy0Var.l();
        }
    }

    public /* synthetic */ d2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ d2(org.telegram.ui.gg0 gg0Var, String str, String str2, String str3, int i10) {
        this.a = 2;
        this.c = gg0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        zr0 zr0Var = (zr0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.k5 k5Var = zr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !zr0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= k5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) k5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) k5Var.d().get(i11);
                    i10 = i11;
                    break;
                }
                i11++;
            }
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(zr0Var.c));
            boolean h = k5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            w70 H = w70.H(n2Var, view);
            H.W(new cs0(zr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(zr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(zr0Var, i12, publicUsername, tL_starGiftCollection, context, e6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uf.b(10, zr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(zr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.fm0(zr0Var, i10, tL_starGiftCollection, 14));
            zr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
