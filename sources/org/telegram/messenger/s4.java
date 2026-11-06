package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.kt0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        int i7 = 1;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                kt0 kt0Var = (kt0) this.c;
                if (tL_error == null) {
                    g5Var.Z.clear();
                    g5Var.Y.clear();
                    g5Var.m0 = 0;
                    g5Var.s = false;
                    g5Var.e = false;
                    g5Var.h = false;
                    g5Var.b = false;
                    g5Var.r = false;
                    g5Var.w = "";
                    g0.h3(new b4(28, g5Var, kt0Var));
                    break;
                } else {
                    g0.h3(kt0Var);
                    break;
                }
            case 1:
                g5 g5Var2 = (g5) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i10 = 0; i10 < updates.users.size(); i10++) {
                            if (updates.users.get(i10).id == user.id) {
                                updates.users.get(i10).photo = user.photo;
                            }
                        }
                    }
                    g5Var2.getMessagesController().O3(updates, false);
                    for (int i11 = 0; i11 < updates.users.size(); i11++) {
                        TLRPC.User user2 = updates.users.get(i11);
                        if (user2.id == user.id) {
                            Utilities.h.c(new b4(29, g5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            g5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                g5.m(0, user2.first_name, user2.last_name);
                                g5Var2.getMessagesStorage().f(user2.phone, "");
                                d5 d5Var = (d5) g5Var2.Z.get(user2.phone);
                                if (d5Var != null && (indexOf = d5Var.g.indexOf(user2.phone)) != -1) {
                                    d5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.h3(new ng(g5Var2, updates, user, 16));
                    break;
                }
                break;
            case 2:
                g5 g5Var3 = (g5) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    g0.h3(new ng(g5Var3, editor, (Vector) tLObject, 14));
                    break;
                }
                break;
            case 3:
                ui uiVar = (ui) this.b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.c;
                uiVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    uiVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 4:
                g0.h3(new lg((ui) this.b, tLObject, (TLRPC.Document) this.c, i7));
                break;
            case 5:
                ui uiVar2 = (ui) this.b;
                Runnable runnable = (Runnable) this.c;
                uiVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    uiVar2.v1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    uiVar2.v1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.h3(runnable);
                    break;
                }
                break;
            case 6:
                g0.h3(new lg((qp) this.b, tLObject, (ArrayList) this.c, 7));
                break;
            case 7:
                qp qpVar = (qp) this.b;
                Runnable runnable2 = (Runnable) this.c;
                qpVar.getClass();
                if (tL_error == null) {
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.h3(runnable2);
                        break;
                    }
                }
                break;
            case 8:
                g0.h3(new em((vv) this.b, tLObject, (ArrayList) this.c, tL_error, 22));
                break;
            case 9:
                gz gzVar = (gz) this.b;
                Runnable runnable3 = (Runnable) this.c;
                if (tLObject != null) {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.h3(runnable3);
                        break;
                    }
                } else {
                    gzVar.getClass();
                    break;
                }
                break;
            default:
                g0.i3(new q10((s10) this.b, (String) this.c, tL_error, tLObject, 0), 2L);
                break;
        }
    }
}
