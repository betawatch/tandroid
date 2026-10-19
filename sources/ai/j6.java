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
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.mf0;
import org.telegram.ui.tm0;
import org.telegram.ui.vm0;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements org.telegram.ui.ActionBar.a2, md0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j6(int i10, od0 od0Var, org.telegram.ui.Components.e4 e4Var, org.telegram.ui.Components.f4 f4Var, TextView textView) {
        this.a = 1;
        this.b = i10;
        this.c = od0Var;
        this.d = e4Var;
        this.e = f4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                i6 i6Var = (i6) l6Var.o.get(l6Var.q);
                if (i6Var != null) {
                    ag.a aVar = i6Var.c;
                    ga x10 = ga.x(this.b, l6Var.q);
                    ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        ag.b bVar = l6Var.q;
                        if (bVar != ag.b.a) {
                            if (bVar == ag.b.b) {
                                new fi.f(context, d6Var, i6Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new cd(context, d6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        pf.c cVar = l6Var.n;
                        if (cVar != null) {
                            cVar.a(false);
                            l6Var.n = null;
                        }
                        callback2.run(i6Var, b2Var.h(i10, true, true));
                        break;
                    }
                }
                break;
            default:
                vm0 vm0Var = (vm0) this.c;
                vm0.Z(this.b, (String) this.f, (SecureDocument) this.d, (tm0) this.e, vm0Var);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        rg.n2 n2Var = (rg.n2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        wq0 wq0Var = (wq0) this.e;
        gi.g4 g4Var = (gi.g4) this.f;
        n2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new bz0(n2Var, bitmap, i10, wq0Var, 20), 2000L);
        } else {
            g4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((mf0) this.c, (String) this.d, iVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        od0 od0Var2 = (od0) this.c;
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.d;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.e;
        TextView textView = (TextView) this.f;
        org.telegram.ui.Components.f5.f(null, null, 0L, this.b, 3, od0Var2, e4Var, f4Var);
        org.telegram.ui.Components.f5.d(textView, od0Var2, e4Var, f4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        hz0 hz0Var = (hz0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != hz0Var.I) {
            return;
        }
        hz0Var.G = 1;
        hz0Var.H = str2;
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
            hz0Var.w = null;
            hz0Var.x = true;
            hz0Var.f();
            return;
        }
        hz0Var.x = false;
        hz0Var.v = false;
        hz0Var.c();
        ah.x xVar = hz0Var.d;
        if (xVar != null) {
            xVar.setVisibility(0);
        }
        hz0Var.U = AndroidUtilities.dp(10.0f);
        hz0Var.w = arrayList;
        hz0Var.V = 0;
        hz0Var.W = Integer.valueOf(str2.length());
        ah.x xVar2 = hz0Var.d;
        if (xVar2 != null) {
            xVar2.invalidate();
        }
        ez0 ez0Var = hz0Var.f;
        if (ez0Var != null) {
            ez0Var.l();
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

    public /* synthetic */ j6(js0 js0Var, int i10, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = 6;
        this.c = js0Var;
        this.b = i10;
        this.f = n2Var;
        this.d = context;
        this.e = d6Var;
    }

    public /* synthetic */ j6(mf0 mf0Var, String str, String str2, String str3, int i10) {
        this.a = 3;
        this.c = mf0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        js0 js0Var = (js0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        v9 v9Var = js0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !js0Var.L) {
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
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(js0Var.c));
            boolean h = v9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            i80 H = i80.H(n2Var, view);
            H.W(new ms0(js0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.q1(js0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(js0Var, i12, publicUsername, tL_starGiftCollection2, context, d6Var, n2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uf.c(18, js0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.q1(js0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new x31(js0Var, i11, tL_starGiftCollection2, 26));
            js0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
