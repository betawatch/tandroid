package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ct0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s4(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        int i3 = 1;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                ct0 ct0Var = (ct0) this.c;
                if (tL_error == null) {
                    g5Var.a0.clear();
                    g5Var.Z.clear();
                    g5Var.n0 = 0;
                    g5Var.s = false;
                    g5Var.e = false;
                    g5Var.h = false;
                    g5Var.b = false;
                    g5Var.r = false;
                    g5Var.w = "";
                    g0.h3(new b4(28, g5Var, ct0Var));
                    break;
                } else {
                    g0.h3(ct0Var);
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
                                d5 d5Var = (d5) g5Var2.a0.get(user2.phone);
                                if (d5Var != null && (indexOf = d5Var.g.indexOf(user2.phone)) != -1) {
                                    d5Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    g0.h3(new fg(g5Var2, updates, user, 16));
                    break;
                }
                break;
            case 2:
                g5 g5Var3 = (g5) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    g0.h3(new fg(g5Var3, editor, (Vector) tLObject, 14));
                    break;
                }
                break;
            case 3:
                li liVar = (li) this.b;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) this.c;
                liVar.getClass();
                if (tL_error != null && r8.r(tL_error.text)) {
                    liVar.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    break;
                }
                break;
            case 4:
                g0.h3(new dg((li) this.b, tLObject, (TLRPC.Document) this.c, i3));
                break;
            case 5:
                li liVar2 = (li) this.b;
                Runnable runnable = (Runnable) this.c;
                liVar2.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    liVar2.v1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    liVar2.v1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (runnable != null) {
                    g0.h3(runnable);
                    break;
                }
                break;
            case 6:
                g0.h3(new dg((hp) this.b, tLObject, (ArrayList) this.c, 7));
                break;
            case 7:
                hp hpVar = (hp) this.b;
                Runnable runnable2 = (Runnable) this.c;
                hpVar.getClass();
                if (tL_error == null) {
                    hpVar.O3((TLRPC.Updates) tLObject, false);
                    if (runnable2 != null) {
                        g0.h3(runnable2);
                        break;
                    }
                }
                break;
            case 8:
                g0.h3(new ul((nv) this.b, tLObject, (ArrayList) this.c, tL_error, 22));
                break;
            case 9:
                yy yyVar = (yy) this.b;
                Runnable runnable3 = (Runnable) this.c;
                if (tLObject != null) {
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    if (runnable3 != null) {
                        g0.h3(runnable3);
                        break;
                    }
                } else {
                    yyVar.getClass();
                    break;
                }
                break;
            default:
                g0.i3(new i10((k10) this.b, (String) this.c, tL_error, tLObject, 0), 2L);
                break;
        }
    }
}
