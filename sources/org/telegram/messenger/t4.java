package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t4(int i7, Object obj, Object obj2) {
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
                i5 i5Var = (i5) this.b;
                mt0 mt0Var = (mt0) this.c;
                if (tL_error == null) {
                    i5Var.a0.clear();
                    i5Var.Z.clear();
                    i5Var.n0 = 0;
                    i5Var.s = false;
                    i5Var.e = false;
                    i5Var.h = false;
                    i5Var.b = false;
                    i5Var.r = false;
                    i5Var.w = "";
                    g0.g3(new w3(28, i5Var, mt0Var));
                    break;
                } else {
                    g0.g3(mt0Var);
                    break;
                }
            case 1:
                i5 i5Var2 = (i5) this.b;
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
                    i5Var2.getMessagesController().V3(updates, false);
                    for (int i11 = 0; i11 < updates.users.size(); i11++) {
                        TLRPC.User user2 = updates.users.get(i11);
                        if (user2.id == user.id) {
                            Utilities.h.c(new w3(29, i5Var2, user2));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user2.id;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(tL_contact);
                            i5Var2.getMessagesStorage().c1(arrayList, false);
                            if (!TextUtils.isEmpty(user2.phone)) {
                                i5.m(0, user2.first_name, user2.last_name);
                                i5Var2.getMessagesStorage().f(user2.phone, "");
                                f5 f5Var = (f5) i5Var2.a0.get(user2.phone);
                                if (f5Var != null && (indexOf = f5Var.g.indexOf(user2.phone)) != -1) {
                                    f5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.g3(new zf(i5Var2, updates, user, 16));
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = (i5) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    g0.g3(new zf(i5Var3, editor, (Vector) tLObject, 14));
                    break;
                }
                break;
            case 3:
                si siVar = (si) this.b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.c;
                siVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    siVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 4:
                g0.g3(new lg((si) this.b, tLObject, (TLRPC.Document) this.c, i7));
                break;
            case 5:
                si siVar2 = (si) this.b;
                Runnable runnable = (Runnable) this.c;
                siVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    siVar2.y1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    siVar2.y1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.g3(runnable);
                    break;
                }
                break;
            case 6:
                g0.g3(new lg((np) this.b, tLObject, (ArrayList) this.c, 8));
                break;
            case 7:
                np npVar = (np) this.b;
                Runnable runnable2 = (Runnable) this.c;
                npVar.getClass();
                if (tL_error == null) {
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.g3(runnable2);
                        break;
                    }
                }
                break;
            case 8:
                g0.g3(new ul((qv) this.b, tLObject, (ArrayList) this.c, tL_error, 22));
                break;
            case 9:
                az azVar = (az) this.b;
                Runnable runnable3 = (Runnable) this.c;
                if (tLObject != null) {
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.g3(runnable3);
                        break;
                    }
                } else {
                    azVar.getClass();
                    break;
                }
                break;
            default:
                g0.h3(new l10((n10) this.b, (String) this.c, tL_error, tLObject, 0), 2L);
                break;
        }
    }
}
