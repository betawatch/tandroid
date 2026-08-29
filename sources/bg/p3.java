package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jh.i7;
import jh.j4;
import jh.l4;
import jh.s7;
import jh.y9;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.mq0;
import org.telegram.ui.of0;
import org.telegram.ui.tm0;
import org.telegram.ui.vm0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements OnFailureListener, Utilities.Callback2Return, org.telegram.ui.ActionBar.b2, oc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p3(int i10, qc0 qc0Var, org.telegram.ui.Components.b4 b4Var, org.telegram.ui.Components.c4 c4Var, TextView textView) {
        this.a = 3;
        this.b = i10;
        this.c = qc0Var;
        this.d = b4Var;
        this.e = c4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                l4 l4Var = (l4) this.c;
                Context context = (Context) this.d;
                c6 c6Var = (c6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                j4 j4Var = (j4) l4Var.o.get(l4Var.q);
                if (j4Var != null) {
                    kf.a aVar = j4Var.c;
                    s7 x4 = s7.x(this.b, l4Var.q);
                    kf.a l10 = x4.e ? kf.a.l(x4.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        kf.b bVar = l4Var.q;
                        if (bVar != kf.b.a) {
                            if (bVar == kf.b.b) {
                                new oh.f(context, c6Var, j4Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new y9(context, c6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        ye.c cVar = l4Var.n;
                        if (cVar != null) {
                            cVar.a(false);
                            l4Var.n = null;
                        }
                        callback2.run(j4Var, c2Var.g(i10, true, true));
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
        u3 u3Var = (u3) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        mq0 mq0Var = (mq0) this.e;
        n3 n3Var = (n3) this.f;
        u3Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof wa.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && u3Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new ag.z1(u3Var, bitmap, i10, mq0Var, 1), 2000L);
        } else {
            n3Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new ih.m2((of0) this.c, (String) this.d, gVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        qc0 qc0Var2 = (qc0) this.c;
        org.telegram.ui.Components.b4 b4Var = (org.telegram.ui.Components.b4) this.d;
        org.telegram.ui.Components.c4 c4Var = (org.telegram.ui.Components.c4) this.e;
        TextView textView = (TextView) this.f;
        c5.g(null, null, 0L, this.b, 3, qc0Var2, b4Var, c4Var);
        c5.e(textView, qc0Var2, b4Var, c4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        fy0 fy0Var = (fy0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != fy0Var.E) {
            return;
        }
        fy0Var.C = 1;
        fy0Var.D = str2;
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
            fy0Var.w = null;
            fy0Var.x = true;
            fy0Var.f();
            return;
        }
        fy0Var.x = false;
        fy0Var.v = false;
        fy0Var.c();
        x2 x2Var = fy0Var.d;
        if (x2Var != null) {
            x2Var.setVisibility(0);
        }
        fy0Var.Q = AndroidUtilities.dp(10.0f);
        fy0Var.w = arrayList;
        fy0Var.R = 0;
        fy0Var.S = Integer.valueOf(str2.length());
        x2 x2Var2 = fy0Var.d;
        if (x2Var2 != null) {
            x2Var2.invalidate();
        }
        cy0 cy0Var = fy0Var.f;
        if (cy0Var != null) {
            cy0Var.l();
        }
    }

    public /* synthetic */ p3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ p3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ p3(of0 of0Var, String str, String str2, String str3, int i10) {
        this.a = 5;
        this.c = of0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        gr0 gr0Var = (gr0) this.c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        Context context = (Context) this.e;
        c6 c6Var = (c6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        i7 i7Var = gr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !gr0Var.H) {
            int i11 = 0;
            while (true) {
                if (i11 >= i7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) i7Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) i7Var.d().get(i11);
                    i10 = i11;
                    break;
                }
                i11++;
            }
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(gr0Var.c));
            boolean h = i7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            j70 H = j70.H(o2Var, view);
            H.W(new ih.t2(gr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new ih.l2(gr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new ih.m2(gr0Var, i12, publicUsername, tL_starGiftCollection, context, c6Var, o2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new ef.c(21, gr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new ih.l2(gr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new ag.v0(gr0Var, i10, tL_starGiftCollection, 4));
            gr0Var.E = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
