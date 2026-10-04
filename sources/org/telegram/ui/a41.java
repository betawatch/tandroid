package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((b41) this.b).dismiss();
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
                ((o41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.r;
                        if (e4Var.V) {
                            e4Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                m71 m71Var = (m71) this.b;
                if (m71Var.a0 instanceof TLRPC.User) {
                    ci.d dVar = m71Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        m71Var.R((TLRPC.User) m71Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 5:
                n81.a((n81) this.b);
                break;
            case 6:
                ((ge1) this.b).c(true);
                break;
            case 7:
                ((ge1) ((cw0) this.b).c).c(true);
                break;
            case 8:
                ne1 ne1Var = (ne1) this.b;
                ArrayList arrayList = ne1Var.f;
                HashSet hashSet = ne1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ne1Var.getMessagesController().getUser(Long.valueOf(ne1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ne1Var.getMessagesController().putChat(chat, false);
                        ne1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    ne1Var.finishFragment();
                    break;
                }
                break;
            default:
                ej1 ej1Var = (ej1) this.b;
                ej1Var.a.c(!r0.b(), true);
                ej1Var.c.setEnabled(ej1Var.a.b());
                ej1Var.c.animate().alpha(ej1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
