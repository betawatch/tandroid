package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lh.i4;
import lh.j7;
import lh.k4;
import lh.t7;
import lh.z9;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.bn0;
import org.telegram.ui.dn0;
import org.telegram.ui.sq0;
import org.telegram.ui.wf0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements OnFailureListener, Utilities.Callback2Return, org.telegram.ui.ActionBar.c2, uc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l3(int i10, wc0 wc0Var, org.telegram.ui.Components.y3 y3Var, org.telegram.ui.Components.z3 z3Var, TextView textView) {
        this.a = 3;
        this.b = i10;
        this.c = wc0Var;
        this.d = y3Var;
        this.e = z3Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                k4 k4Var = (k4) this.c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
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
                                new qh.f(context, f6Var, i4Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new z9(context, f6Var, aVar.a(), 14, null, null, 0L).show();
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
                dn0 dn0Var = (dn0) this.c;
                dn0.Z(this.b, (String) this.f, (SecureDocument) this.d, (bn0) this.e, dn0Var);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        q3 q3Var = (q3) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        sq0 sq0Var = (sq0) this.e;
        j3 j3Var = (j3) this.f;
        q3Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof ya.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && q3Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new cg.v1(q3Var, bitmap, i10, sq0Var, 1), 2000L);
        } else {
            j3Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new kh.m2((wf0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.uc0
    public void q(wc0 wc0Var, int i10) {
        wc0 wc0Var2 = (wc0) this.c;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.d;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.e;
        TextView textView = (TextView) this.f;
        z4.g(null, null, 0L, this.b, 3, wc0Var2, y3Var, z3Var);
        z4.e(textView, wc0Var2, y3Var, z3Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        qy0 qy0Var = (qy0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != qy0Var.F) {
            return;
        }
        qy0Var.D = 1;
        qy0Var.E = str2;
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
            qy0Var.w = null;
            qy0Var.x = true;
            qy0Var.f();
            return;
        }
        qy0Var.x = false;
        qy0Var.v = false;
        qy0Var.c();
        u2 u2Var = qy0Var.d;
        if (u2Var != null) {
            u2Var.setVisibility(0);
        }
        qy0Var.R = AndroidUtilities.dp(10.0f);
        qy0Var.w = arrayList;
        qy0Var.S = 0;
        qy0Var.T = Integer.valueOf(str2.length());
        u2 u2Var2 = qy0Var.d;
        if (u2Var2 != null) {
            u2Var2.invalidate();
        }
        ny0 ny0Var = qy0Var.f;
        if (ny0Var != null) {
            ny0Var.l();
        }
    }

    public /* synthetic */ l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ l3(wf0 wf0Var, String str, String str2, String str3, int i10) {
        this.a = 5;
        this.c = wf0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        or0 or0Var = (or0) this.c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        Context context = (Context) this.e;
        f6 f6Var = (f6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        j7 j7Var = or0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !or0Var.I) {
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
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(or0Var.c));
            boolean h = j7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            o70 H = o70.H(p2Var, view);
            H.W(new kh.t2(or0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new kh.l2(or0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new kh.m2(or0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, p2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new gf.c(23, or0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new kh.l2(or0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new ah.a(or0Var, i10, tL_starGiftCollection, 6));
            or0Var.F = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
