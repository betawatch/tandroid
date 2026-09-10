package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((n41) this.b).dismiss();
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
                ((x41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        bi.x4 x4Var = secretMediaViewer.r;
                        if (x4Var.V) {
                            x4Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                v71 v71Var = (v71) this.b;
                if (v71Var.a0 instanceof TLRPC.User) {
                    bi.d dVar = v71Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        v71Var.T((TLRPC.User) v71Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 5:
                w81.a((w81) this.b);
                break;
            case 6:
                ((pe1) this.b).c(true);
                break;
            case 7:
                ((pe1) ((kw0) this.b).c).c(true);
                break;
            case 8:
                xe1 xe1Var = (xe1) this.b;
                ArrayList arrayList = xe1Var.f;
                HashSet hashSet = xe1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = xe1Var.getMessagesController().getUser(Long.valueOf(xe1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        xe1Var.getMessagesController().putChat(chat, false);
                        xe1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    xe1Var.finishFragment();
                    break;
                }
                break;
            default:
                qj1 qj1Var = (qj1) this.b;
                qj1Var.a.c(!r0.b(), true);
                qj1Var.c.setEnabled(qj1Var.a.b());
                qj1Var.c.animate().alpha(qj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
