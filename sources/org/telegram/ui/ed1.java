package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ed1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        nn nnVar = null;
        boolean z4 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                hd1 hd1Var = (hd1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                hd1Var.y = 0;
                String str2 = hd1Var.B;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        hd1Var.a0(org.telegram.ui.ActionBar.j6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        hd1Var.a0(org.telegram.ui.ActionBar.j6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                hd1.W((hd1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                rd1 rd1Var = (rd1) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = rd1Var.D;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    nnVar = new nn();
                    nnVar.a = messageObject;
                    nnVar.b = -1;
                    nnVar.c = -1;
                    nnVar.g = true;
                    nnVar.d = i12;
                    nnVar.e();
                }
                xnVar.Cb(messageObject, nnVar);
                rd1Var.c(false);
                break;
            case 3:
                yd1 yd1Var = (yd1) obj3;
                ArrayList arrayList = yd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = yd1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                yd1Var.d.l();
                if (yd1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    yd1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new h11(yd1Var, 15));
                    yd1Var.y.setDuration(100L);
                    yd1Var.y.start();
                } else {
                    yd1Var.B = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(yd1Var.F);
                if (yd1Var.C.getVisibility() == 0) {
                    yd1Var.C.animate().alpha(0.0f).setListener(new ud1(yd1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                kf1 kf1Var = (kf1) obj3;
                kf1Var.s.deleteTopics(kf1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                gf1 gf1Var = (gf1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = gf1Var.a0;
                if (str3.equals(gf1Var.V)) {
                    int i13 = gf1Var.h0;
                    gf1Var.m0 = false;
                    gf1Var.i0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.p2) gf1Var.q0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        gf1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z4 = true;
                        }
                        gf1Var.j0 = z4;
                    } else {
                        gf1Var.j0 = false;
                    }
                    if (gf1Var.h0 == 0) {
                        gf1Var.k0.e(gf1Var.i0, true);
                    }
                    gf1Var.l0.b(i13);
                    break;
                }
                break;
            default:
                dh1 dh1Var = (dh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                tf.k1 k1Var = dh1Var.f;
                if (dh1Var.n) {
                    dh1Var.h = null;
                    dh1Var.d = arrayList4;
                    dh1Var.e = arrayList5;
                    k1Var.f(arrayList4, null);
                    if (dh1Var.n && !k1Var.e()) {
                        dh1Var.v.f.e(false, true);
                    }
                    dh1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ed1(hd1 hd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = hd1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
