package fh;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import gh.ea;
import gh.l7;
import gh.v7;
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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.mq0;
import org.telegram.ui.of0;
import org.telegram.ui.um0;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.b2, zb0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(int i9, bc0 bc0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.a = 2;
        this.b = i9;
        this.e = bc0Var;
        this.f = x3Var;
        this.c = y3Var;
        this.d = textView;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                gh.o4 o4Var = (gh.o4) this.e;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                gh.m4 m4Var = (gh.m4) o4Var.o.get(o4Var.q);
                if (m4Var != null) {
                    gf.a aVar = m4Var.c;
                    v7 x10 = v7.x(this.b, o4Var.q);
                    gf.a l10 = x10.e ? gf.a.l(x10.p()) : null;
                    if (l10 != null && aVar.b > l10.b) {
                        gf.b bVar = o4Var.q;
                        if (bVar != gf.b.a) {
                            if (bVar == gf.b.b) {
                                new lh.f(context, b6Var, m4Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new ea(context, b6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        ve.d dVar = o4Var.n;
                        if (dVar != null) {
                            dVar.a(false);
                            o4Var.n = null;
                        }
                        callback2.run(m4Var, c2Var.g(i9, true, true));
                        break;
                    }
                }
                break;
            default:
                wm0 wm0Var = (wm0) this.e;
                wm0.Y(this.b, (String) this.d, (SecureDocument) this.f, (um0) this.c, wm0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        bc0 bc0Var2 = (bc0) this.e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.y4.g(null, null, 0L, this.b, 3, bc0Var2, x3Var, y3Var);
        org.telegram.ui.Components.y4.e(textView, bc0Var2, x3Var, y3Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        yf.m2 m2Var = (yf.m2) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        int i9 = this.b;
        mq0 mq0Var = (mq0) this.c;
        v2 v2Var = (v2) this.d;
        m2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof ua.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && m2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new y01(m2Var, bitmap, i9, mq0Var), 2000L);
        } else {
            v2Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new u2((of0) this.e, (String) this.f, gVar, list, (String) this.c, (String) this.d, this.b));
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ux0 ux0Var = (ux0) this.e;
        String str2 = (String) this.f;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.b != ux0Var.E) {
            return;
        }
        ux0Var.C = 1;
        ux0Var.D = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                if (!hashSet.contains(keywordResult.emoji)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            ux0Var.w = null;
            ux0Var.x = true;
            ux0Var.f();
            return;
        }
        ux0Var.x = false;
        ux0Var.v = false;
        ux0Var.c();
        d2 d2Var = ux0Var.d;
        if (d2Var != null) {
            d2Var.setVisibility(0);
        }
        ux0Var.Q = AndroidUtilities.dp(10.0f);
        ux0Var.w = arrayList;
        ux0Var.R = 0;
        ux0Var.S = Integer.valueOf(str2.length());
        d2 d2Var2 = ux0Var.d;
        if (d2Var2 != null) {
            d2Var2.invalidate();
        }
        rx0 rx0Var = ux0Var.f;
        if (rx0Var != null) {
            rx0Var.l();
        }
    }

    public /* synthetic */ z2(FrameLayout frameLayout, int i9, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.b = i9;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ z2(gh.o4 o4Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, Utilities.Callback2 callback2) {
        this.a = 1;
        this.e = o4Var;
        this.b = i9;
        this.c = context;
        this.d = b6Var;
        this.f = callback2;
    }

    public /* synthetic */ z2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.f = obj;
        this.b = i9;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ z2(of0 of0Var, String str, String str2, String str3, int i9) {
        this.a = 4;
        this.e = of0Var;
        this.f = str;
        this.c = str2;
        this.d = str3;
        this.b = i9;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i9;
        vq0 vq0Var = (vq0) this.e;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
        Context context = (Context) this.c;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        l7 l7Var = vq0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !vq0Var.H) {
            int i10 = 0;
            while (true) {
                if (i10 >= l7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i9 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) l7Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) l7Var.d().get(i10);
                    i9 = i10;
                    break;
                }
                i10++;
            }
            int i11 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i11).getUserOrChat(vq0Var.c));
            boolean h = l7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            x60 H = x60.H(o2Var, view);
            H.W(new e3(vq0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new t2(vq0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new u2(vq0Var, i11, publicUsername, tL_starGiftCollection, context, b6Var, o2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new e5.u(7, vq0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new t2(vq0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new d5.i(vq0Var, i9, tL_starGiftCollection, 2));
            vq0Var.E = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
