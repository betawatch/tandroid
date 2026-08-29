package hh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a0;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.yb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cg1;
import org.telegram.ui.ht;
import org.telegram.ui.tn;
import sf.l0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h(v vVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.e = vVar;
        this.b = tL_error;
        this.c = tLObject;
        this.f = tL_chatInviteImporter;
        this.d = z10;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        TLRPC.User user;
        int i10 = this.a;
        boolean z10 = this.d;
        Object obj = this.h;
        Object obj2 = this.n;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (i10) {
            case 0:
                v vVar = (v) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj2;
                int i11 = vVar.k;
                ArrayList arrayList2 = vVar.e;
                o2 o2Var = vVar.g;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        c5.f0(i11, tL_error, o2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i11).loadFullChat(tL_updates.chats.get(0).id, 0, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList2.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList2.remove(i12);
                                } else {
                                    i12++;
                                }
                            }
                        }
                        n nVar = vVar.f;
                        v vVar2 = nVar.c;
                        int i13 = 0;
                        while (true) {
                            arrayList = vVar2.c;
                            if (i13 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            nVar.u((!nVar.c.B ? 1 : 0) + i13);
                            if (arrayList.isEmpty()) {
                                nVar.u(1);
                            }
                        }
                        vVar.f(vVar.t, false, true);
                        if (z10) {
                            yb ybVar = new yb(o2Var.getParentActivity(), o2Var.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            t9 t9Var = ybVar.a;
                            t9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            t9Var.e(user3, new e9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            String formatString = vVar.a ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ybVar.b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                mc.g(o2Var, ybVar, 2750).j();
                            } else {
                                mc.f(vVar.h, ybVar, 2750).j();
                            }
                        }
                        a0 n10 = o2Var.getActionBar().n();
                        if (TextUtils.isEmpty(vVar.t) && vVar.l) {
                            n10.k(0).setVisibility(arrayList2.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((SendMessagesHelper) obj6).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj5, (TLObject) obj4, this.d, (ArrayList) obj3, (ArrayList) obj, (TLObject) obj2);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj5;
                o2 o2Var2 = (o2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj6).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(o2Var2.getParentActivity(), null, o2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new dx0(), (tn) obj3);
                PhotoViewer.t1().X0(document, z10 ? document : null, false, null);
                ht q6 = ht.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                break;
            case 3:
                cg1.d0((cg1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                break;
            default:
                l0.U((l0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                break;
        }
    }

    public /* synthetic */ h(File file, ArrayList arrayList, o2 o2Var, tn tnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.e = file;
        this.b = arrayList;
        this.c = o2Var;
        this.f = tnVar;
        this.h = document;
        this.d = z10;
        this.n = tL_messages_stickerSet;
    }

    public /* synthetic */ h(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.e = sendMessagesHelper;
        this.b = tL_error;
        this.c = tLObject;
        this.d = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.n = tLObject2;
    }

    public /* synthetic */ h(cg1 cg1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.e = cg1Var;
        this.b = tL_error;
        this.d = z10;
        this.c = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ h(l0 l0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.e = l0Var;
        this.b = tL_error;
        this.c = tLObject;
        this.f = iArr;
        this.n = arrayList;
        this.d = z10;
        this.h = user;
    }
}
