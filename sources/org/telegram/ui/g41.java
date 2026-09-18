package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((h41) this.b).dismiss();
                break;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 2:
                ((s41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.f4 f4Var = secretMediaViewer.r;
                        if (f4Var.V) {
                            f4Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                q71 q71Var = (q71) this.b;
                if (q71Var.a0 instanceof TLRPC.User) {
                    ci.d dVar = q71Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        q71Var.T((TLRPC.User) q71Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 5:
                q81.a((q81) this.b);
                break;
            case 6:
                ((ke1) this.b).c(true);
                break;
            case 7:
                ((ke1) ((iw0) this.b).c).c(true);
                break;
            case 8:
                se1 se1Var = (se1) this.b;
                ArrayList arrayList = se1Var.f;
                HashSet hashSet = se1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = se1Var.getMessagesController().getUser(Long.valueOf(se1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        se1Var.getMessagesController().putChat(chat, false);
                        se1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    se1Var.finishFragment();
                    break;
                }
                break;
            default:
                kj1 kj1Var = (kj1) this.b;
                kj1Var.a.c(!r0.b(), true);
                kj1Var.c.setEnabled(kj1Var.a.b());
                kj1Var.c.animate().alpha(kj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
