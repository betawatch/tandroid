package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((k41) this.b).dismiss();
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
                ((u41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        di.f4 f4Var = secretMediaViewer.r;
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
                    di.d dVar = t71Var.h0;
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
                ((le1) this.b).c(true);
                break;
            case 7:
                ((le1) ((hw0) this.b).c).c(true);
                break;
            case 8:
                te1 te1Var = (te1) this.b;
                ArrayList arrayList = te1Var.f;
                HashSet hashSet = te1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = te1Var.getMessagesController().getUser(Long.valueOf(te1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        te1Var.getMessagesController().putChat(chat, false);
                        te1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    te1Var.finishFragment();
                    break;
                }
                break;
            default:
                mj1 mj1Var = (mj1) this.b;
                mj1Var.a.c(!r0.b(), true);
                mj1Var.c.setEnabled(mj1Var.a.b());
                mj1Var.c.animate().alpha(mj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
