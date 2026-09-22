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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements sc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d2(int i10, uc0 uc0Var, b4 b4Var, c4 c4Var, TextView textView) {
        this.a = 0;
        this.b = i10;
        this.c = uc0Var;
        this.d = b4Var;
        this.e = c4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.c;
                org.telegram.ui.on0.Z(this.b, (String) this.f, (SecureDocument) this.d, (org.telegram.ui.mn0) this.e, on0Var);
                break;
            default:
                yh.e3 e3Var = (yh.e3) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                yh.c3 c3Var = (yh.c3) e3Var.o.get(e3Var.q);
                if (c3Var != null) {
                    zf.a aVar = c3Var.c;
                    yh.u5 x10 = yh.u5.x(this.b, e3Var.q);
                    zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        zf.b bVar = e3Var.q;
                        if (bVar != zf.b.a) {
                            if (bVar == zf.b.b) {
                                new di.h(context, e6Var, c3Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new yh.m7(context, e6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        nf.e eVar = e3Var.n;
                        if (eVar != null) {
                            eVar.a(false);
                            e3Var.n = null;
                        }
                        callback2.run(c3Var, b2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        qg.p2 p2Var = (qg.p2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.e;
        ei.r4 r4Var = (ei.r4) this.f;
        p2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new s11(p2Var, bitmap, i10, or0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.fg0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        uc0 uc0Var2 = (uc0) this.c;
        b4 b4Var = (b4) this.d;
        c4 c4Var = (c4) this.e;
        TextView textView = (TextView) this.f;
        c5.g(null, null, 0L, this.b, 3, uc0Var2, b4Var, c4Var);
        c5.e(textView, uc0Var2, b4Var, c4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ny0 ny0Var = (ny0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != ny0Var.I) {
            return;
        }
        ny0Var.G = 1;
        ny0Var.H = str2;
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
            ny0Var.w = null;
            ny0Var.x = true;
            ny0Var.f();
            return;
        }
        ny0Var.x = false;
        ny0Var.v = false;
        ny0Var.c();
        ai.f0 f0Var = ny0Var.d;
        if (f0Var != null) {
            f0Var.setVisibility(0);
        }
        ny0Var.U = AndroidUtilities.dp(10.0f);
        ny0Var.w = arrayList;
        ny0Var.V = 0;
        ny0Var.W = Integer.valueOf(str2.length());
        ai.f0 f0Var2 = ny0Var.d;
        if (f0Var2 != null) {
            f0Var2.invalidate();
        }
        ky0 ky0Var = ny0Var.f;
        if (ky0Var != null) {
            ky0Var.l();
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

    public /* synthetic */ d2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
        this.a = 2;
        this.c = fg0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        nr0 nr0Var = (nr0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.l5 l5Var = nr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !nr0Var.L) {
            int i11 = 0;
            while (true) {
                if (i11 >= l5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) l5Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) l5Var.d().get(i11);
                    i10 = i11;
                    break;
                }
                i11++;
            }
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(nr0Var.c));
            boolean h = l5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            n70 H = n70.H(n2Var, view);
            H.W(new qr0(nr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.t1(nr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(nr0Var, i12, publicUsername, tL_starGiftCollection, context, e6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new uh.i(6, nr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.t1(nr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.em0(nr0Var, i10, tL_starGiftCollection, 14));
            nr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
