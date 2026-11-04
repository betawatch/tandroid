package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Document document;
        uw uwVar;
        org.telegram.ui.ActionBar.t2 t2Var;
        int i3 = this.a;
        int i10 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                i4 i4Var = (i4) obj3;
                String str = (String) obj2;
                l3 l3Var = (l3) obj;
                i4Var.i0.k(false);
                org.telegram.messenger.g0.v1(i4Var.i0.c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                org.telegram.messenger.g0.g(str);
                new org.telegram.ui.Components.fc(l3Var.f, null).k(false).k(true);
                break;
            case 1:
                e7 e7Var = (e7) obj3;
                z6 z6Var = (z6) obj;
                Bundle bundle = new Bundle();
                di.b bVar = ((n7) obj2).d;
                long j10 = bVar.b;
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putInt("message_id", bVar.g);
                z6Var.presentFragment(new wm(bundle));
                e7Var.f.G.dismiss();
                org.telegram.ui.ActionBar.f1 f1Var = e7Var.a;
                if (f1Var != null) {
                    f1Var.d(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.uh0 uh0Var = (org.telegram.ui.Components.uh0) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr = (int[]) obj;
                if (uh0Var == null || uh0Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr[0]);
                    break;
                }
                break;
            case 3:
                wm wmVar = (wm) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                if (wmVar.getParentActivity() != null) {
                    if (wmVar.d1.getVisibility() != 0 || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        wmVar.a0.Z(keyboardInlineButton, ziVar, ziVar, null);
                        break;
                    }
                }
                break;
            case 4:
                ((wm) obj3).Ua((org.telegram.ui.Cells.z) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 5:
                wm.j0((wm) obj3, (boolean[]) obj2, (Context) obj);
                break;
            case 6:
                wm.Z0((wm) obj3, (oj) obj2, (boolean[]) obj);
                break;
            case 7:
                hm hmVar = (hm) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.ActionBar.d2 d2Var = hmVar.a;
                d2Var.finishPreviewFragment();
                chat.left = false;
                if (q1Var != null && q1Var.w != null) {
                    d2Var.getNotificationCenter().k(org.telegram.messenger.hs.f3, Long.valueOf(q1Var.w.e));
                }
                d2Var.getMessagesController().n(chat.id, d2Var.getUserConfig().f(), null, d2Var, new sl(hmVar, chat, 3));
                break;
            case 8:
                ln lnVar = (ln) obj3;
                org.telegram.ui.Cells.g6[] g6VarArr = (org.telegram.ui.Cells.g6[]) obj2;
                hi.d dVar = (hi.d) obj;
                Integer num = (Integer) view.getTag();
                g6VarArr[0].a(num.intValue() == 0);
                g6VarArr[1].a(num.intValue() == 1);
                lnVar.K0 = num.intValue() == 1;
                ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
                lnVar.u0(true, true);
                break;
            case 9:
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj2;
                PhotoViewer photoViewer = ((rq) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.V8;
                ArrayList arrayList = ((org.telegram.ui.Components.j51) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj4 = arrayList.get(i11);
                            i11++;
                            org.telegram.ui.Components.l51 l51Var = (org.telegram.ui.Components.l51) obj4;
                            if (l51Var.b()) {
                                document = l51Var.g;
                            }
                        } else {
                            long j11 = Long.MAX_VALUE;
                            org.telegram.ui.Components.l51 l51Var2 = null;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                org.telegram.ui.Components.l51 l51Var3 = (org.telegram.ui.Components.l51) arrayList.get(i12);
                                if (l51Var3.k < j11 && org.telegram.ui.Components.m51.D0(l51Var3.m)) {
                                    j11 = l51Var3.k;
                                    l51Var2 = l51Var3;
                                }
                            }
                            document = l51Var2 != null ? l51Var2.g : ((org.telegram.ui.Components.l51) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    org.telegram.messenger.w7.G(photoViewer.U);
                    File K = org.telegram.messenger.w7.K(document, null, false, true);
                    if (K == null || !K.exists()) {
                        org.telegram.messenger.w7.G(photoViewer.U);
                        K = org.telegram.messenger.w7.K(document, null, true, true);
                    }
                    if (K == null || !K.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        ziVar2.d3 = document;
                        arrayList2.add(ziVar2);
                        MediaController.g0(photoViewer.E, org.telegram.messenger.c.a(photoViewer.U), arrayList2, new ma(photoViewer, 2));
                    } else {
                        MediaController.d0(K.toString(), photoViewer.E, 1, null, null, new en0(photoViewer, i10));
                    }
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 10:
                lr lrVar = (lr) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                org.telegram.ui.Components.t4.N((Context) obj2, org.telegram.messenger.bd.M0(2131746096, null), org.telegram.messenger.bd.a0(null, null, 2131746097, user.first_name), org.telegram.messenger.bd.M0(2131746128, null), new dr(lrVar, user, i10), lrVar.r).p();
                break;
            case 11:
                ee0 ee0Var = (ee0) obj3;
                ((org.telegram.ui.Components.f60) obj2).u();
                int i13 = ((org.telegram.messenger.mo) obj).a;
                if (ee0Var.c.getCurrentPosition() != 0 || (uwVar = ee0Var.K) == null) {
                    if (ee0Var.K == null) {
                        ee0Var.r0(null);
                    }
                    ee0Var.J = Integer.valueOf(i13);
                    ee0Var.s0(0, true);
                    ee0Var.c.D(0);
                    break;
                } else {
                    uwVar.I4(i13);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj3;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj;
                String str2 = (String) obj2;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2VarArr[0];
                if (t2Var2 != null) {
                    t2Var2.dismiss();
                    t2VarArr[0] = null;
                    u10Var.a(str2);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.t2[] t2VarArr2 = (org.telegram.ui.ActionBar.t2[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!((gi.d) obj3).R && (t2Var = t2VarArr2[0]) != null) {
                    t2Var.dismiss();
                    t2VarArr2[0] = null;
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ProfileActivity.d0((ProfileActivity) obj3, (TLRPC.User) obj2, (org.telegram.ui.ActionBar.k5) obj);
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj3;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.f1) obj2).dismiss();
                LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.a);
                m10.remove(((org.telegram.messenger.iv) obj).d);
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, m10);
                saveToGallerySettingsActivity.e0();
                break;
        }
    }

    public /* synthetic */ a0(org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.messenger.u10 u10Var, String str) {
        this.a = 12;
        this.b = t2VarArr;
        this.d = u10Var;
        this.c = str;
    }
}
