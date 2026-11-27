// default package

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ln6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fn7 d;

    public /* synthetic */ ln6(fn7 fn7Var, int i, int i2, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.b = i;
        this.c = i2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                hl.c3(new hz0((MediaController) fn7Var, this.b, tL_error, tLObject, this.c));
                break;
            case 1:
                uc7 uc7Var = (uc7) fn7Var;
                LongSparseIntArray longSparseIntArray = uc7Var.P0;
                int i = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        hl.c3(new aq1(uc7Var, updates_difference, this.b, this.c, (byte) 7));
                        break;
                    } else {
                        if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                            TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                            uc7Var.Y0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                        }
                        zh6 zh6Var = new zh6();
                        zh6 zh6Var2 = new zh6();
                        for (int i2 = 0; i2 < updates_difference.users.size(); i2++) {
                            TLRPC.User user = updates_difference.users.get(i2);
                            zh6Var.k(user.id, user);
                        }
                        for (int i3 = 0; i3 < updates_difference.chats.size(); i3++) {
                            TLRPC.Chat chat = updates_difference.chats.get(i3);
                            zh6Var2.k(chat.id, chat);
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!updates_difference.other_updates.isEmpty()) {
                            while (i < updates_difference.other_updates.size()) {
                                TLRPC.Update update = updates_difference.other_updates.get(i);
                                if (update instanceof TL_update.TL_updateMessageID) {
                                    arrayList.add((TL_update.TL_updateMessageID) update);
                                    updates_difference.other_updates.remove(i);
                                } else {
                                    if (uc7.V1(update) == 2) {
                                        long S1 = uc7.S1(update);
                                        int i4 = longSparseIntArray.get(S1);
                                        if (i4 == 0 && (i4 = uc7Var.getMessagesStorage().M(S1)) != 0) {
                                            longSparseIntArray.put(S1, i4);
                                        }
                                        if (i4 != 0 && uc7.T1(update) <= i4) {
                                            updates_difference.other_updates.remove(i);
                                        }
                                    }
                                    i++;
                                }
                                i--;
                                i++;
                            }
                        }
                        hl.c3(new mn6((Object) uc7Var, (Object) updates_difference, (byte) 20));
                        uc7Var.getMessagesStorage().a.c(new tw4((Object) uc7Var, (Object) updates_difference, (Object) arrayList, (Object) zh6Var, (Object) zh6Var2, (byte) 22));
                        break;
                    }
                } else {
                    uc7Var.Y1 = false;
                    uc7Var.getConnectionsManager().setIsUpdating(false);
                    cc4.b("received: isUpdating = false");
                    break;
                }
                break;
            default:
                hl.c3(new ifa((eja) fn7Var, tL_error, this.b, this.c, tLObject, (byte) 0));
                break;
        }
    }
}
