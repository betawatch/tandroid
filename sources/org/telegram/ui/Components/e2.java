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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements sd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
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

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.c;
                org.telegram.ui.nn0.Z(this.b, (String) this.f, (SecureDocument) this.d, (org.telegram.ui.ln0) this.e, nn0Var);
                break;
            default:
                yh.y2 y2Var = (yh.y2) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                yh.w2 w2Var = (yh.w2) y2Var.o.get(y2Var.q);
                if (w2Var != null) {
                    zf.a aVar = w2Var.c;
                    yh.m5 x10 = yh.m5.x(this.b, y2Var.q);
                    zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        zf.b bVar = y2Var.q;
                        if (bVar != zf.b.a) {
                            if (bVar == zf.b.b) {
                                new di.h(context, e6Var, w2Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new yh.e7(context, e6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        of.e eVar = y2Var.n;
                        if (eVar != null) {
                            eVar.a(false);
                            y2Var.n = null;
                        }
                        callback2.run(w2Var, b2Var.g(i10, true, true));
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        qg.o2 o2Var = (qg.o2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        org.telegram.ui.or0 or0Var = (org.telegram.ui.or0) this.e;
        ei.q4 q4Var = (ei.q4) this.f;
        o2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new x21(o2Var, bitmap, i10, or0Var), 2000L);
        } else {
            q4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.fg0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
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
        oz0 oz0Var = (oz0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != oz0Var.I) {
            return;
        }
        oz0Var.G = 1;
        oz0Var.H = str2;
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
            oz0Var.w = null;
            oz0Var.x = true;
            oz0Var.f();
            return;
        }
        oz0Var.x = false;
        oz0Var.v = false;
        oz0Var.c();
        ai.f0 f0Var = oz0Var.d;
        if (f0Var != null) {
            f0Var.setVisibility(0);
        }
        oz0Var.U = AndroidUtilities.dp(10.0f);
        oz0Var.w = arrayList;
        oz0Var.V = 0;
        oz0Var.W = Integer.valueOf(str2.length());
        ai.f0 f0Var2 = oz0Var.d;
        if (f0Var2 != null) {
            f0Var2.invalidate();
        }
        lz0 lz0Var = oz0Var.f;
        if (lz0Var != null) {
            lz0Var.l();
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

    public /* synthetic */ e2(org.telegram.ui.fg0 fg0Var, String str, String str2, String str3, int i10) {
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
        rs0 rs0Var = (rs0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.d5 d5Var = rs0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !rs0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= d5Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) d5Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d5Var.d().get(i10);
                    break;
                }
                i10++;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(rs0Var.c));
            boolean h = d5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            p80 H = p80.H(n2Var, view);
            H.W(new us0(rs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(rs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.d1(rs0Var, i12, publicUsername, tL_starGiftCollection2, context, e6Var, n2Var, 16), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.p0(11, rs0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(rs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.bi0(rs0Var, i11, tL_starGiftCollection2, 20));
            rs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
