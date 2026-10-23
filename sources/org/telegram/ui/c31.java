package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 1:
                ((h31) this.b).dismiss();
                break;
            case 2:
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
            case 3:
                h61 h61Var = (h61) this.b;
                if (h61Var.a0 instanceof TLRPC.User) {
                    ei.d dVar = h61Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        h61Var.U((TLRPC.User) h61Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = ((i71) this.b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        w9.e0(sessionsActivity.getParentActivity(), 2, new g71(sessionsActivity));
                        break;
                    }
                }
                break;
            case 5:
                ((yc1) this.b).c(true);
                break;
            case 6:
                ((yc1) ((ai.j5) this.b).c).c(true);
                break;
            case 7:
                gd1 gd1Var = (gd1) this.b;
                ArrayList arrayList = gd1Var.f;
                HashSet hashSet = gd1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = gd1Var.getMessagesController().getUser(Long.valueOf(gd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        gd1Var.getMessagesController().putChat(chat, false);
                        gd1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    gd1Var.finishFragment();
                    break;
                }
                break;
            default:
                zh1 zh1Var = (zh1) this.b;
                zh1Var.a.c(!r0.b(), true);
                zh1Var.c.setEnabled(zh1Var.a.b());
                zh1Var.c.animate().alpha(zh1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
