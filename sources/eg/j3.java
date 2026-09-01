package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mh.i4;
import mh.j7;
import mh.k4;
import mh.t7;
import mh.z9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.dn0;
import org.telegram.ui.fn0;
import org.telegram.ui.uq0;
import org.telegram.ui.xf0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements OnFailureListener, Utilities.Callback2Return, org.telegram.ui.ActionBar.c2, wc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j3(int i10, yc0 yc0Var, org.telegram.ui.Components.y3 y3Var, org.telegram.ui.Components.z3 z3Var, TextView textView) {
        this.a = 3;
        this.b = i10;
        this.c = yc0Var;
        this.d = y3Var;
        this.e = z3Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                k4 k4Var = (k4) this.c;
                Context context = (Context) this.d;
                g6 g6Var = (g6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                i4 i4Var = (i4) k4Var.o.get(k4Var.q);
                if (i4Var != null) {
                    mf.a aVar = i4Var.c;
                    t7 x10 = t7.x(this.b, k4Var.q);
                    mf.a l10 = x10.e ? mf.a.l(x10.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        mf.b bVar = k4Var.q;
                        if (bVar != mf.b.a) {
                            if (bVar == mf.b.b) {
                                new rh.f(context, g6Var, i4Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new z9(context, g6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        af.f fVar = k4Var.n;
                        if (fVar != null) {
                            fVar.a(false);
                            k4Var.n = null;
                        }
                        callback2.run(i4Var, d2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
            default:
                fn0 fn0Var = (fn0) this.c;
                fn0.Z(this.b, (String) this.f, (SecureDocument) this.d, (dn0) this.e, fn0Var);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        o3 o3Var = (o3) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        uq0 uq0Var = (uq0) this.e;
        h3 h3Var = (h3) this.f;
        o3Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof ya.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o3Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new dg.u1(o3Var, bitmap, i10, uq0Var, 2), 2000L);
        } else {
            h3Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new lh.l2((xf0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        yc0 yc0Var2 = (yc0) this.c;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.d;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.e;
        TextView textView = (TextView) this.f;
        z4.g(null, null, 0L, this.b, 3, yc0Var2, y3Var, z3Var);
        z4.e(textView, yc0Var2, y3Var, z3Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ry0 ry0Var = (ry0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != ry0Var.F) {
            return;
        }
        ry0Var.D = 1;
        ry0Var.E = str2;
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
            ry0Var.w = null;
            ry0Var.x = true;
            ry0Var.f();
            return;
        }
        ry0Var.x = false;
        ry0Var.v = false;
        ry0Var.c();
        s2 s2Var = ry0Var.d;
        if (s2Var != null) {
            s2Var.setVisibility(0);
        }
        ry0Var.R = AndroidUtilities.dp(10.0f);
        ry0Var.w = arrayList;
        ry0Var.S = 0;
        ry0Var.T = Integer.valueOf(str2.length());
        s2 s2Var2 = ry0Var.d;
        if (s2Var2 != null) {
            s2Var2.invalidate();
        }
        oy0 oy0Var = ry0Var.f;
        if (oy0Var != null) {
            oy0Var.l();
        }
    }

    public /* synthetic */ j3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ j3(xf0 xf0Var, String str, String str2, String str3, int i10) {
        this.a = 5;
        this.c = xf0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        pr0 pr0Var = (pr0) this.c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        Context context = (Context) this.e;
        g6 g6Var = (g6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        j7 j7Var = pr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !pr0Var.I) {
            int i11 = 0;
            while (true) {
                if (i11 >= j7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) j7Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) j7Var.d().get(i11);
                    i10 = i11;
                    break;
                }
                i11++;
            }
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(pr0Var.c));
            boolean h = j7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            q70 H = q70.H(p2Var, view);
            H.W(new lh.s2(pr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new lh.k2(pr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new lh.l2(pr0Var, i12, publicUsername, tL_starGiftCollection, context, g6Var, p2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new gf.c(25, pr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new lh.k2(pr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new bh.a(pr0Var, i10, tL_starGiftCollection, 6));
            pr0Var.F = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
