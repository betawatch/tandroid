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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements bd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.c2, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f2(int i10, dd0 dd0Var, c4 c4Var, d4 d4Var, TextView textView) {
        this.a = 0;
        this.b = i10;
        this.c = dd0Var;
        this.d = c4Var;
        this.e = d4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.c;
                org.telegram.ui.on0.Z(this.b, (String) this.f, (SecureDocument) this.d, (org.telegram.ui.mn0) this.e, on0Var);
                break;
            default:
                xh.c3 c3Var = (xh.c3) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                xh.a3 a3Var = (xh.a3) c3Var.o.get(c3Var.q);
                if (a3Var != null) {
                    yf.a aVar = a3Var.c;
                    xh.v5 x10 = xh.v5.x(this.b, c3Var.q);
                    yf.a l4 = x10.e ? yf.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        yf.b bVar = c3Var.q;
                        if (bVar != yf.b.a) {
                            if (bVar == yf.b.b) {
                                new ci.i(context, f6Var, a3Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new xh.o7(context, f6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        nf.e eVar = c3Var.n;
                        if (eVar != null) {
                            eVar.a(false);
                            c3Var.n = null;
                        }
                        callback2.run(a3Var, d2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        pg.n2 n2Var = (pg.n2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.e;
        di.v4 v4Var = (di.v4) this.f;
        n2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new g21(n2Var, bitmap, i10, or0Var), 2000L);
        } else {
            v4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new fg.f1((org.telegram.ui.fg0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        dd0 dd0Var2 = (dd0) this.c;
        c4 c4Var = (c4) this.d;
        d4 d4Var = (d4) this.e;
        TextView textView = (TextView) this.f;
        d5.g(null, null, 0L, this.b, 3, dd0Var2, c4Var, d4Var);
        d5.e(textView, dd0Var2, c4Var, d4Var);
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
        bi.ld ldVar = zy0Var.d;
        if (ldVar != null) {
            ldVar.setVisibility(0);
        }
        zy0Var.U = AndroidUtilities.dp(10.0f);
        zy0Var.w = arrayList;
        zy0Var.V = 0;
        zy0Var.W = Integer.valueOf(str2.length());
        bi.ld ldVar2 = zy0Var.d;
        if (ldVar2 != null) {
            ldVar2.invalidate();
        }
        wy0 wy0Var = zy0Var.f;
        if (wy0Var != null) {
            wy0Var.l();
        }
    }

    public /* synthetic */ f2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ f2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ f2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
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
        wr0 wr0Var = (wr0) this.c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        xh.l5 l5Var = wr0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !wr0Var.L) {
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
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(wr0Var.c));
            boolean h = l5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            w70 H = w70.H(p2Var, view);
            H.W(new zr0(wr0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new wh.s1(wr0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new fg.f1(wr0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, p2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.k0(7, wr0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new wh.s1(wr0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.uu0(wr0Var, i10, tL_starGiftCollection, 11));
            wr0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
