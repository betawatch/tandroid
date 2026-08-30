package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                g31 g31Var = (g31) ((dg.s1) this.b).e;
                if (g31Var != null) {
                    g31Var.run();
                    break;
                }
                break;
            case 1:
                ((p31) this.b).dismiss();
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
                ((z31) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ph.f3 f3Var = secretMediaViewer.r;
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
                b71 b71Var = (b71) this.b;
                if (b71Var.X instanceof TLRPC.User) {
                    ph.d dVar = b71Var.e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        b71Var.T((TLRPC.User) b71Var.X, null, null);
                        break;
                    }
                }
                break;
            case 6:
                b81.a((b81) this.b);
                break;
            case 7:
                ((rd1) this.b).c(true);
                break;
            case 8:
                ((rd1) ((gg.u) this.b).c).c(true);
                break;
            case 9:
                yd1 yd1Var = (yd1) this.b;
                ArrayList arrayList = yd1Var.f;
                HashSet hashSet = yd1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = yd1Var.getMessagesController().getUser(Long.valueOf(yd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        yd1Var.getMessagesController().putChat(chat, false);
                        yd1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    yd1Var.finishFragment();
                    break;
                }
                break;
            default:
                si1 si1Var = (si1) this.b;
                si1Var.a.c(!r0.b(), true);
                si1Var.c.setEnabled(si1Var.a.b());
                si1Var.c.animate().alpha(si1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
