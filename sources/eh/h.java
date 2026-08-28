package eh;

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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ag1;
import org.telegram.ui.ht;
import org.telegram.ui.qn;
import pf.m0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h(x xVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.e = xVar;
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
        int i9 = this.a;
        boolean z10 = this.d;
        Object obj = this.h;
        Object obj2 = this.n;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (i9) {
            case 0:
                x xVar = (x) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj2;
                int i10 = xVar.k;
                ArrayList arrayList2 = xVar.e;
                o2 o2Var = xVar.g;
                if (o2Var != null && o2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        y4.f0(i10, tL_error, o2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i10).loadFullChat(tL_updates.chats.get(0).id, 0, true);
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList2.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i11)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList2.remove(i11);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        p pVar = xVar.f;
                        x xVar2 = pVar.c;
                        int i12 = 0;
                        while (true) {
                            arrayList = xVar2.c;
                            if (i12 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i12)).user_id != tL_chatInviteImporter.user_id) {
                                    i12++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i12 = -1;
                            }
                        }
                        if (i12 >= 0) {
                            arrayList.remove(i12);
                            pVar.u((!pVar.c.B ? 1 : 0) + i12);
                            if (arrayList.isEmpty()) {
                                pVar.u(1);
                            }
                        }
                        xVar.f(xVar.t, false, true);
                        if (z10) {
                            sb sbVar = new sb(o2Var.getParentActivity(), o2Var.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            o9 o9Var = sbVar.a;
                            o9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            o9Var.e(user3, new z8(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            String formatString = xVar.a ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            sbVar.b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                gc.g(o2Var, sbVar, 2750).j();
                            } else {
                                gc.f(xVar.h, sbVar, 2750).j();
                            }
                        }
                        z n10 = o2Var.getActionBar().n();
                        if (TextUtils.isEmpty(xVar.t) && xVar.l) {
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
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new sw0(), (qn) obj3);
                PhotoViewer.t1().X0(document, z10 ? document : null, false, null);
                ht q10 = ht.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q10.T = tL_messages_stickerSet;
                break;
            case 3:
                ag1.c0((ag1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                break;
            default:
                m0.T((m0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                break;
        }
    }

    public /* synthetic */ h(File file, ArrayList arrayList, o2 o2Var, qn qnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.e = file;
        this.b = arrayList;
        this.c = o2Var;
        this.f = qnVar;
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

    public /* synthetic */ h(ag1 ag1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.e = ag1Var;
        this.b = tL_error;
        this.d = z10;
        this.c = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ h(m0 m0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.e = m0Var;
        this.b = tL_error;
        this.c = tLObject;
        this.f = iArr;
        this.n = arrayList;
        this.d = z10;
        this.h = user;
    }
}
