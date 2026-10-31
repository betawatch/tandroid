package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        int i10 = 27;
        int i11 = 1;
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.b;
                uu0 uu0Var = (uu0) this.c;
                if (tL_error == null) {
                    i5Var.Z.clear();
                    i5Var.Y.clear();
                    i5Var.m0 = 0;
                    i5Var.s = false;
                    i5Var.e = false;
                    i5Var.h = false;
                    i5Var.b = false;
                    i5Var.r = false;
                    i5Var.w = "";
                    i0.g3(new e4(26, i5Var, uu0Var));
                    break;
                } else {
                    i0.g3(uu0Var);
                    break;
                }
            case 1:
                i5 i5Var2 = (i5) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i12 = 0; i12 < updates.users.size(); i12++) {
                            if (updates.users.get(i12).id == user.id) {
                                updates.users.get(i12).photo = user.photo;
                            }
                        }
                    }
                    i5Var2.getMessagesController().L3(updates, false);
                    for (int i13 = 0; i13 < updates.users.size(); i13++) {
                        TLRPC.User user2 = updates.users.get(i13);
                        if (user2.id == user.id) {
                            Utilities.h.c(new e4(i10, i5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            i5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                i5.m(0, user2.first_name, user2.last_name);
                                i5Var2.getMessagesStorage().f(user2.phone, "");
                                f5 f5Var = (f5) i5Var2.Z.get(user2.phone);
                                if (f5Var != null && (indexOf = f5Var.g.indexOf(user2.phone)) != -1) {
                                    f5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    i0.g3(new mg(i5Var2, updates, user, 16));
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = (i5) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    i0.g3(new mg(i5Var3, editor, (Vector) tLObject, 14));
                    break;
                }
                break;
            case 3:
                ui uiVar = (ui) this.b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.c;
                uiVar.getClass();
                if (tL_error != null && w8.r(tL_error.text)) {
                    uiVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 4:
                i0.g3(new kg((ui) this.b, tLObject, (TLRPC.Document) this.c, i11));
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
                    i0.g3(runnable);
                    break;
                }
                break;
            case 6:
                i0.g3(new kg((vp) this.b, tLObject, (ArrayList) this.c, 9));
                break;
            case 7:
                vp vpVar = (vp) this.b;
                Runnable runnable2 = (Runnable) this.c;
                vpVar.getClass();
                if (tL_error == null) {
                    vpVar.L3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        i0.g3(runnable2);
                        break;
                    }
                }
                break;
            case 8:
                i0.g3(new ul((gw) this.b, tLObject, (ArrayList) this.c, tL_error, 22));
                break;
            case 9:
                i0.g3(new kg((qz) this.b, tLObject, (cz) this.c, i10));
                break;
            case 10:
                qz qzVar = (qz) this.b;
                Runnable runnable3 = (Runnable) this.c;
                if (tLObject != null) {
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        i0.g3(runnable3);
                        break;
                    }
                } else {
                    qzVar.getClass();
                    break;
                }
                break;
            default:
                i0.h3(new e20((g20) this.b, (String) this.c, tL_error, tLObject, 0), 2L);
                break;
        }
    }
}
