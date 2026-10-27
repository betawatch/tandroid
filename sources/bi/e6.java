package bi;

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
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.fr0;
import org.telegram.ui.fx;
import org.telegram.ui.in0;
import org.telegram.ui.kn0;
import org.telegram.ui.qf0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements org.telegram.ui.ActionBar.b2, ld0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e6(int i10, nd0 nd0Var, org.telegram.ui.Components.f4 f4Var, org.telegram.ui.Components.g4 g4Var, TextView textView) {
        this.a = 1;
        this.b = i10;
        this.c = nd0Var;
        this.d = f4Var;
        this.e = g4Var;
        this.f = textView;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f;
                d6 d6Var = (d6) g6Var.o.get(g6Var.q);
                if (d6Var != null) {
                    bg.a aVar = d6Var.c;
                    ca x9 = ca.x(this.b, g6Var.q);
                    bg.a l4 = x9.e ? bg.a.l(x9.p()) : null;
                    if (l4 != null && aVar.b > l4.b) {
                        bg.b bVar = g6Var.q;
                        if (bVar != bg.b.a) {
                            if (bVar == bg.b.b) {
                                new gi.g(context, u6Var, d6Var.c, true, null).show();
                                break;
                            }
                        } else {
                            new tc(context, u6Var, aVar.a(), 14, null, null, 0L).show();
                            break;
                        }
                    } else {
                        qf.c cVar = g6Var.n;
                        if (cVar != null) {
                            cVar.a(false);
                            g6Var.n = null;
                        }
                        callback2.run(d6Var, e2Var.h(i10, true, true));
                        break;
                    }
                }
                break;
            default:
                kn0 kn0Var = (kn0) this.c;
                kn0.a0(this.b, (String) this.f, (SecureDocument) this.d, (in0) this.e, kn0Var);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        sg.o2 o2Var = (sg.o2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.b;
        fr0 fr0Var = (fr0) this.e;
        hi.p4 p4Var = (hi.p4) this.f;
        o2Var.x = false;
        FileLog.e(exc);
        if ((exc instanceof ob.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new as0(o2Var, bitmap, i10, fr0Var, 23), 2000L);
        } else {
            p4Var.run(new ArrayList());
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new ig.d1((qf0) this.c, (String) this.d, iVar, list, (String) this.e, (String) this.f, this.b));
    }

    @Override // org.telegram.ui.Components.ld0
    public void q(nd0 nd0Var, int i10) {
        nd0 nd0Var2 = (nd0) this.c;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.d;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.e;
        TextView textView = (TextView) this.f;
        org.telegram.ui.Components.g5.g(null, null, 0L, this.b, 3, nd0Var2, f4Var, g4Var);
        org.telegram.ui.Components.g5.e(textView, nd0Var2, f4Var, g4Var);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        uz0 uz0Var = (uz0) this.c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        if (this.b != uz0Var.K) {
            return;
        }
        uz0Var.I = 1;
        uz0Var.J = str2;
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
            uz0Var.w = null;
            uz0Var.x = true;
            uz0Var.f();
            return;
        }
        uz0Var.x = false;
        uz0Var.v = false;
        uz0Var.c();
        bh.r rVar = uz0Var.d;
        if (rVar != null) {
            rVar.setVisibility(0);
        }
        uz0Var.W = AndroidUtilities.dp(10.0f);
        uz0Var.w = arrayList;
        uz0Var.a0 = 0;
        uz0Var.b0 = Integer.valueOf(str2.length());
        bh.r rVar2 = uz0Var.d;
        if (rVar2 != null) {
            rVar2.invalidate();
        }
        rz0 rz0Var = uz0Var.f;
        if (rz0Var != null) {
            rz0Var.l();
        }
    }

    public /* synthetic */ e6(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ e6(ws0 ws0Var, int i10, org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = 6;
        this.c = ws0Var;
        this.b = i10;
        this.f = r2Var;
        this.d = context;
        this.e = u6Var;
    }

    public /* synthetic */ e6(qf0 qf0Var, String str, String str2, String str3, int i10) {
        this.a = 3;
        this.c = qf0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ws0 ws0Var = (ws0) this.c;
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        q9 q9Var = ws0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ws0Var.O) {
            int i10 = 0;
            while (true) {
                if (i10 >= q9Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) q9Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) q9Var.d().get(i10);
                    break;
                }
                i10++;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ws0Var.c));
            boolean h = q9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            l80 H = l80.H(r2Var, view);
            H.W(new ys0(ws0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new zh.r1(ws0Var, 2), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new ig.d1(ws0Var, i12, publicUsername, tL_starGiftCollection2, context, u6Var, r2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new vi.k0(11, ws0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new zh.r1(ws0Var, 0), h);
            H.m(R.drawable.msg_delete, new fx(ws0Var, i11, tL_starGiftCollection2, 26), LocaleController.getString(R.string.Gift2CollectionsDelete), h, true);
            ws0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
