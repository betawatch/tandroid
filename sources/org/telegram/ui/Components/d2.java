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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements dd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d2(int i10, fd0 fd0Var, c4 c4Var, d4 d4Var, TextView textView) {
        this.a = 0;
        this.b = i10;
        this.c = fd0Var;
        this.d = c4Var;
        this.e = d4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) this.c;
                org.telegram.ui.pn0.Z(this.b, (String) this.f, (SecureDocument) this.d, (org.telegram.ui.nn0) this.e, pn0Var);
                break;
            default:
                yh.d3 d3Var = (yh.d3) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                yh.b3 b3Var = (yh.b3) d3Var.o.get(d3Var.q);
                if (b3Var != null) {
                    zf.a aVar = b3Var.c;
                    yh.u5 x10 = yh.u5.x(this.b, d3Var.q);
                    zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        zf.b bVar = d3Var.q;
                        if (bVar != zf.b.a) {
                            if (bVar == zf.b.b) {
                                new di.h(context, f6Var, b3Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new yh.l7(context, f6Var, aVar.a(), 14, null, null, 0L).show();
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
        qg.n2 n2Var = (qg.n2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this.e;
        ei.r4 r4Var = (ei.r4) this.f;
        n2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new i21(n2Var, bitmap, i10, pr0Var), 2000L);
        } else {
            r4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.hg0) this.c, (String) this.d, hVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.dd0
    public void q(fd0 fd0Var, int i10) {
        fd0 fd0Var2 = (fd0) this.c;
        c4 c4Var = (c4) this.d;
        d4 d4Var = (d4) this.e;
        TextView textView = (TextView) this.f;
        d5.g(null, null, 0L, this.b, 3, fd0Var2, c4Var, d4Var);
        d5.e(textView, fd0Var2, c4Var, d4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        az0 az0Var = (az0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != az0Var.I) {
            return;
        }
        az0Var.G = 1;
        az0Var.H = str2;
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
            az0Var.w = null;
            az0Var.x = true;
            az0Var.f();
            return;
        }
        az0Var.x = false;
        az0Var.v = false;
        az0Var.c();
        ai.f0 f0Var = az0Var.d;
        if (f0Var != null) {
            f0Var.setVisibility(0);
        }
        az0Var.U = AndroidUtilities.dp(10.0f);
        az0Var.w = arrayList;
        az0Var.V = 0;
        az0Var.W = Integer.valueOf(str2.length());
        ai.f0 f0Var2 = az0Var.d;
        if (f0Var2 != null) {
            f0Var2.invalidate();
        }
        xy0 xy0Var = az0Var.f;
        if (xy0Var != null) {
            xy0Var.l();
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

    public /* synthetic */ d2(org.telegram.ui.hg0 hg0Var, String str, String str2, String str3, int i10) {
        this.a = 2;
        this.c = hg0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        bs0 bs0Var = (bs0) this.c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        yh.k5 k5Var = bs0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !bs0Var.L) {
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
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(bs0Var.c));
            boolean h = k5Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            y70 H = y70.H(n2Var, view);
            H.W(new es0(bs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new xh.u1(bs0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new gg.e1(bs0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, n2Var, 15), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.j0(12, bs0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new xh.u1(bs0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new org.telegram.ui.fm0(bs0Var, i10, tL_starGiftCollection, 14));
            bs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
