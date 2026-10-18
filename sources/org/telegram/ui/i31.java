package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((j31) this.b).dismiss();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ei.x3 x3Var = secretMediaViewer.r;
                        if (x3Var.V) {
                            x3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 2:
                j61 j61Var = (j61) this.b;
                if (j61Var.a0 instanceof TLRPC.User) {
                    ei.d dVar = j61Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        j61Var.U((TLRPC.User) j61Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 3:
                SessionsActivity sessionsActivity = ((k71) this.b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        y9.e0(sessionsActivity.getParentActivity(), false, 2, new i71(sessionsActivity));
                        break;
                    }
                }
                break;
            case 4:
                ((ad1) this.b).c(true);
                break;
            case 5:
                ((ad1) ((ai.i5) this.b).c).c(true);
                break;
            case 6:
                id1 id1Var = (id1) this.b;
                ArrayList arrayList = id1Var.f;
                HashSet hashSet = id1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = id1Var.getMessagesController().getUser(Long.valueOf(id1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        id1Var.getMessagesController().putChat(chat, false);
                        id1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    id1Var.finishFragment();
                    break;
                }
                break;
            default:
                bi1 bi1Var = (bi1) this.b;
                bi1Var.a.c(!r0.b(), true);
                bi1Var.c.setEnabled(bi1Var.a.b());
                bi1Var.c.animate().alpha(bi1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
