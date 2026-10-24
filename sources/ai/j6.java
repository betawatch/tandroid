package ai;

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
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.an0;
import org.telegram.ui.rf0;
import org.telegram.ui.ym0;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements org.telegram.ui.ActionBar.z1, od0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j6(int i10, qd0 qd0Var, org.telegram.ui.Components.d4 d4Var, org.telegram.ui.Components.e4 e4Var, TextView textView) {
        this.a = 1;
        this.b = i10;
        this.c = qd0Var;
        this.d = d4Var;
        this.e = e4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                i6 i6Var = (i6) l6Var.o.get(l6Var.q);
                if (i6Var != null) {
                    ag.a aVar = i6Var.c;
                    ha x10 = ha.x(this.b, l6Var.q);
                    ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        ag.b bVar = l6Var.q;
                        if (bVar != ag.b.a) {
                            if (bVar == ag.b.b) {
                                new fi.f(context, g6Var, i6Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new dd(context, g6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        pf.c cVar = l6Var.n;
                        if (cVar != null) {
                            cVar.a(false);
                            l6Var.n = null;
                        }
                        callback2.run(i6Var, c2Var.h(i10, true, true));
                        break;
                    }
                }
                break;
            default:
                an0 an0Var = (an0) this.c;
                an0.Z(this.b, (String) this.f, (SecureDocument) this.d, (ym0) this.e, an0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.od0
    public void n(qd0 qd0Var, int i10) {
        qd0 qd0Var2 = (qd0) this.c;
        org.telegram.ui.Components.d4 d4Var = (org.telegram.ui.Components.d4) this.d;
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.e;
        TextView textView = (TextView) this.f;
        org.telegram.ui.Components.f5.g(null, null, 0L, this.b, 3, qd0Var2, d4Var, e4Var);
        org.telegram.ui.Components.f5.e(textView, qd0Var2, d4Var, e4Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        rg.o2 o2Var = (rg.o2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        zq0 zq0Var = (zq0) this.e;
        gi.g4 g4Var = (gi.g4) this.f;
        o2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new fz0(o2Var, bitmap, i10, zq0Var, 21), 2000L);
        } else {
            g4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((rf0) this.c, (String) this.d, iVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        lz0 lz0Var = (lz0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != lz0Var.K) {
            return;
        }
        lz0Var.I = 1;
        lz0Var.J = str2;
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
        lz0Var.W = AndroidUtilities.dp(10.0f);
        lz0Var.w = arrayList;
        lz0Var.a0 = 0;
        lz0Var.b0 = Integer.valueOf(str2.length());
        ah.x xVar2 = lz0Var.d;
        if (xVar2 != null) {
            xVar2.invalidate();
        }
        iz0 iz0Var = lz0Var.f;
        if (iz0Var != null) {
            iz0Var.l();
        }
    }

    public /* synthetic */ j6(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ j6(ns0 ns0Var, int i10, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = 6;
        this.c = ns0Var;
        this.b = i10;
        this.f = o2Var;
        this.d = context;
        this.e = g6Var;
    }

    public /* synthetic */ j6(rf0 rf0Var, String str, String str2, String str3, int i10) {
        this.a = 3;
        this.c = rf0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ns0 ns0Var = (ns0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        v9 v9Var = ns0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ns0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= v9Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) v9Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) v9Var.d().get(i10);
                    break;
                }
                i10++;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ns0Var.c));
            boolean h = v9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            j80 H = j80.H(o2Var, view);
            H.W(new qs0(ns0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.q1(ns0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(ns0Var, i12, publicUsername, tL_starGiftCollection2, context, g6Var, o2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.k0(20, ns0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.q1(ns0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new c41(ns0Var, i11, tL_starGiftCollection2, 26));
            ns0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
