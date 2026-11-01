package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                tu0 tu0Var = (tu0) this.c;
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
                    i0.g3(new e4(26, i5Var, tu0Var));
                    break;
                } else {
                    i0.g3(tu0Var);
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
                    i0.g3(new ng(i5Var2, updates, user, 16));
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = (i5) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    i0.g3(new ng(i5Var3, editor, (Vector) tLObject, 14));
                    break;
                }
                break;
            case 3:
                vi viVar = (vi) this.b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.c;
                viVar.getClass();
                if (tL_error != null && w8.r(tL_error.text)) {
                    viVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 4:
                i0.g3(new lg((vi) this.b, tLObject, (TLRPC.Document) this.c, i11));
                break;
            case 5:
                vi viVar2 = (vi) this.b;
                Runnable runnable = (Runnable) this.c;
                viVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    viVar2.v1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    viVar2.v1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    i0.g3(runnable);
                    break;
                }
                break;
            case 6:
                i0.g3(new lg((wp) this.b, tLObject, (ArrayList) this.c, 9));
                break;
            case 7:
                wp wpVar = (wp) this.b;
                Runnable runnable2 = (Runnable) this.c;
                wpVar.getClass();
                if (tL_error == null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        i0.g3(runnable2);
                        break;
                    }
                }
                break;
            case 8:
                i0.g3(new vl((hw) this.b, tLObject, (ArrayList) this.c, tL_error, 22));
                break;
            case 9:
                i0.g3(new lg((rz) this.b, tLObject, (dz) this.c, i10));
                break;
            case 10:
                rz rzVar = (rz) this.b;
                Runnable runnable3 = (Runnable) this.c;
                if (tLObject != null) {
                    rzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        i0.g3(runnable3);
                        break;
                    }
                } else {
                    rzVar.getClass();
                    break;
                }
                break;
            default:
                i0.h3(new f20((h20) this.b, (String) this.c, tL_error, tLObject, 0), 2L);
                break;
        }
    }
}
