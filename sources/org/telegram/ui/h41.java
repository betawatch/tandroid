package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class h41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((i41) this.b).dismiss();
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
                ((v41) this.b).dismiss();
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
                t71 t71Var = (t71) this.b;
                if (t71Var.a0 instanceof TLRPC.User) {
                    ci.d dVar = t71Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        t71Var.T((TLRPC.User) t71Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 5:
                u81.a((u81) this.b);
                break;
            case 6:
                ((me1) this.b).c(true);
                break;
            case 7:
                ((me1) ((iw0) this.b).c).c(true);
                break;
            case 8:
                ue1 ue1Var = (ue1) this.b;
                ArrayList arrayList = ue1Var.f;
                HashSet hashSet = ue1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ue1Var.getMessagesController().getUser(Long.valueOf(ue1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ue1Var.getMessagesController().putChat(chat, false);
                        ue1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    ue1Var.finishFragment();
                    break;
                }
                break;
            default:
                lj1 lj1Var = (lj1) this.b;
                lj1Var.a.c(!r0.b(), true);
                lj1Var.c.setEnabled(lj1Var.a.b());
                lj1Var.c.animate().alpha(lj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
