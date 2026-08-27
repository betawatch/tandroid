package gh;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import hh.ea;
import hh.k7;
import hh.u7;
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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.nq0;
import org.telegram.ui.rf0;
import org.telegram.ui.vm0;
import org.telegram.ui.xm0;
import org.telegram.ui.xs;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.a2, dc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u2(int i10, fc0 fc0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.a = 2;
        this.b = i10;
        this.e = fc0Var;
        this.f = x3Var;
        this.c = y3Var;
        this.d = textView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                hh.m4 m4Var = (hh.m4) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                hh.k4 k4Var = (hh.k4) m4Var.o.get(m4Var.q);
                if (k4Var != null) {
                    hf.a aVar = k4Var.c;
                    u7 x8 = u7.x(this.b, m4Var.q);
                    hf.a l10 = x8.e ? hf.a.l(x8.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        hf.b bVar = m4Var.q;
                        if (bVar != hf.b.a) {
                            if (bVar == hf.b.b) {
                                new mh.f(context, c6Var, k4Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new ea(context, c6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        we.d dVar = m4Var.n;
                        if (dVar != null) {
                            dVar.a(false);
                            m4Var.n = null;
                        }
                        callback2.run(k4Var, b2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
            default:
                xm0 xm0Var = (xm0) this.e;
                xm0.Z(this.b, (String) this.d, (SecureDocument) this.f, (vm0) this.c, xm0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dc0
    public void m(fc0 fc0Var, int i10) {
        fc0 fc0Var2 = (fc0) this.e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.y4.g(null, null, 0L, this.b, 3, fc0Var2, x3Var, y3Var);
        org.telegram.ui.Components.y4.e(textView, fc0Var2, x3Var, y3Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        zf.n2 n2Var = (zf.n2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i10 = this.b;
        nq0 nq0Var = (nq0) this.c;
        q2 q2Var = (q2) this.d;
        n2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof va.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new xs(n2Var, bitmap, i10, nq0Var, 16), 2000L);
        } else {
            q2Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new p2((rf0) this.e, (String) this.f, gVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        wx0 wx0Var = (wx0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != wx0Var.E) {
            return;
        }
        wx0Var.C = 1;
        wx0Var.D = str2;
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
            wx0Var.w = null;
            wx0Var.x = true;
            wx0Var.f();
            return;
        }
        wx0Var.x = false;
        wx0Var.v = false;
        wx0Var.c();
        ag.p1 p1Var = wx0Var.d;
        if (p1Var != null) {
            p1Var.setVisibility(0);
        }
        wx0Var.Q = AndroidUtilities.dp(10.0f);
        wx0Var.w = arrayList;
        wx0Var.R = 0;
        wx0Var.S = Integer.valueOf(str2.length());
        ag.p1 p1Var2 = wx0Var.d;
        if (p1Var2 != null) {
            p1Var2.invalidate();
        }
        tx0 tx0Var = wx0Var.f;
        if (tx0Var != null) {
            tx0Var.l();
        }
    }

    public /* synthetic */ u2(FrameLayout frameLayout, int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.e = frameLayout;
        this.b = i10;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ u2(hh.m4 m4Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback2 callback2) {
        this.a = 1;
        this.e = m4Var;
        this.b = i10;
        this.c = context;
        this.d = c6Var;
        this.f = callback2;
    }

    public /* synthetic */ u2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.e = notificationCenterDelegate;
        this.f = obj;
        this.b = i10;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ u2(rf0 rf0Var, String str, String str2, String str3, int i10) {
        this.a = 4;
        this.e = rf0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        wq0 wq0Var = (wq0) this.e;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        k7 k7Var = wq0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !wq0Var.H) {
            int i11 = 0;
            while (true) {
                if (i11 >= k7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) k7Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) k7Var.d().get(i11);
                    i10 = i11;
                    break;
                }
                i11++;
            }
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(wq0Var.c));
            boolean h = k7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            b70 H = b70.H(n2Var, view);
            H.W(new z2(wq0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new o2(wq0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new p2(wq0Var, i12, publicUsername, tL_starGiftCollection, context, c6Var, n2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new d5.u(13, wq0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new o2(wq0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new d5.i(wq0Var, i10, tL_starGiftCollection, 2));
            wq0Var.E = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
