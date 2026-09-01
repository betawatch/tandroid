package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i31 i31Var = (i31) ((eg.q1) this.b).e;
                if (i31Var != null) {
                    i31Var.run();
                    break;
                }
                break;
            case 1:
                ((r31) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((b41) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        qh.f3 f3Var = secretMediaViewer.r;
                        if (f3Var.S) {
                            f3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 5:
                c71 c71Var = (c71) this.b;
                if (c71Var.X instanceof TLRPC.User) {
                    qh.d dVar = c71Var.e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        c71Var.T((TLRPC.User) c71Var.X, null, null);
                        break;
                    }
                }
                break;
            case 6:
                c81.a((c81) this.b);
                break;
            case 7:
                ((ud1) this.b).c(true);
                break;
            case 8:
                ((ud1) ((hg.u) this.b).c).c(true);
                break;
            case 9:
                be1 be1Var = (be1) this.b;
                ArrayList arrayList = be1Var.f;
                HashSet hashSet = be1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = be1Var.getMessagesController().getUser(Long.valueOf(be1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        be1Var.getMessagesController().putChat(chat, false);
                        be1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    be1Var.finishFragment();
                    break;
                }
                break;
            default:
                vi1 vi1Var = (vi1) this.b;
                vi1Var.a.c(!r0.b(), true);
                vi1Var.c.setEnabled(vi1Var.a.b());
                vi1Var.c.animate().alpha(vi1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
