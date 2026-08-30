package jh;

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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.og1;
import org.telegram.ui.pt;
import org.telegram.ui.xn;
import uf.k0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h(File file, ArrayList arrayList, p2 p2Var, xn xnVar, TLRPC.Document document, boolean z4, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.e = file;
        this.b = arrayList;
        this.c = p2Var;
        this.f = xnVar;
        this.h = document;
        this.d = z4;
        this.n = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        TLRPC.User user;
        int i10 = this.a;
        boolean z4 = this.d;
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
                p2 p2Var = vVar.g;
                if (p2Var != null && p2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        z4.f0(i11, tL_error, p2Var, tL_messages_hideChatJoinRequest, new Object[0]);
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
                        if (z4) {
                            ub ubVar = new ub(p2Var.getParentActivity(), p2Var.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            p9 p9Var = ubVar.a;
                            p9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            p9Var.e(user3, new z8(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            String formatString = vVar.a ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ubVar.b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                ic.g(p2Var, ubVar, 2750).j();
                            } else {
                                ic.f(vVar.h, ubVar, 2750).j();
                            }
                        }
                        z n10 = p2Var.getActionBar().n();
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
                p2 p2Var2 = (p2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj6).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(p2Var2.getParentActivity(), null, p2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new mx0(), (xn) obj3);
                PhotoViewer.t1().X0(document, z4 ? document : null, false, null);
                pt q10 = pt.q();
                if (!z4) {
                    tL_messages_stickerSet = null;
                }
                q10.T = tL_messages_stickerSet;
                break;
            case 3:
                og1.d0((og1) obj6, (TLRPC.TL_error) obj5, this.d, (TLObject) obj4, (byte[]) obj3, (String) obj, (TL_account.passwordInputSettings) obj2);
                break;
            default:
                k0.U((k0) obj6, (TLRPC.TL_error) obj5, (TLObject) obj4, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                break;
        }
    }

    public /* synthetic */ h(v vVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.e = vVar;
        this.b = tL_error;
        this.c = tLObject;
        this.f = tL_chatInviteImporter;
        this.d = z4;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ h(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.e = sendMessagesHelper;
        this.b = tL_error;
        this.c = tLObject;
        this.d = z4;
        this.f = arrayList;
        this.h = arrayList2;
        this.n = tLObject2;
    }

    public /* synthetic */ h(og1 og1Var, TLRPC.TL_error tL_error, boolean z4, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.e = og1Var;
        this.b = tL_error;
        this.d = z4;
        this.c = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ h(k0 k0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        this.e = k0Var;
        this.b = tL_error;
        this.c = tLObject;
        this.f = iArr;
        this.n = arrayList;
        this.d = z4;
        this.h = user;
    }
}
