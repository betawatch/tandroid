package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g31(Object obj, int i10) {
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
                ((l31) this.b).dismiss();
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
                l61 l61Var = (l61) this.b;
                if (l61Var.a0 instanceof TLRPC.User) {
                    ei.d dVar = l61Var.h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        l61Var.T((TLRPC.User) l61Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = ((m71) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        w9.e0(sessionsActivity.getParentActivity(), 2, new k71(sessionsActivity));
                        break;
                    }
                }
                break;
            case 5:
                ((ed1) this.b).c(true);
                break;
            case 6:
                ((ed1) ((ai.j5) this.b).c).c(true);
                break;
            case 7:
                md1 md1Var = (md1) this.b;
                ArrayList arrayList = md1Var.f;
                HashSet hashSet = md1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = md1Var.getMessagesController().getUser(Long.valueOf(md1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        md1Var.getMessagesController().putChat(chat, false);
                        md1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    md1Var.finishFragment();
                    break;
                }
                break;
            default:
                hi1 hi1Var = (hi1) this.b;
                hi1Var.a.c(!r0.b(), true);
                hi1Var.c.setEnabled(hi1Var.a.b());
                hi1Var.c.animate().alpha(hi1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
