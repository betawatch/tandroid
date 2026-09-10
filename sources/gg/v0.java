package gg;

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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.telegram.ui.mh1;
import org.telegram.ui.tt;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ v0(y0 y0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f = y0Var;
        this.b = tL_error;
        this.c = tLObject;
        this.h = iArr;
        this.e = arrayList;
        this.d = z10;
        this.n = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        TLRPC.User user;
        int i10 = this.a;
        boolean z10 = this.d;
        TLObject tLObject = this.n;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        switch (i10) {
            case 0:
                y0.U((y0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                break;
            case 1:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$73((TLRPC.TL_error) obj4, (TLObject) obj3, this.d, (ArrayList) obj, (ArrayList) obj2, this.n);
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                p2 p2Var = (p2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(p2Var.getParentActivity(), null, p2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new xx0(), (eo) obj3);
                PhotoViewer.t1().X0(document, z10 ? document : null, false, null);
                tt q6 = tt.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                break;
            case 3:
                mh1.d0((mh1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                break;
            default:
                vh.p pVar = (vh.p) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = pVar.k;
                ArrayList arrayList3 = pVar.e;
                p2 p2Var2 = pVar.g;
                if (p2Var2 != null && p2Var2.getParentActivity() != null) {
                    if (tL_error != null) {
                        d5.f0(i11, tL_error, p2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i11).loadFullChat(tL_updates.chats.get(0).id, 0, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList3.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i12);
                                } else {
                                    i12++;
                                }
                            }
                        }
                        vh.i iVar = pVar.f;
                        vh.p pVar2 = iVar.c;
                        int i13 = 0;
                        while (true) {
                            arrayList = pVar2.c;
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
                            iVar.u((!iVar.c.B ? 1 : 0) + i13);
                            if (arrayList.isEmpty()) {
                                iVar.u(1);
                            }
                        }
                        pVar.f(pVar.t, false, true);
                        if (z10) {
                            bc bcVar = new bc(p2Var2.getParentActivity(), p2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            w9 w9Var = bcVar.a;
                            w9Var.setRoundRadius(dp);
                            TLRPC.User user3 = user;
                            w9Var.e(user3, new g9(0, user3));
                            String firstName = UserObject.getFirstName(user3);
                            String formatString = pVar.a ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            bcVar.b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                pc.g(p2Var2, bcVar, 2750).j();
                            } else {
                                pc.f(pVar.h, bcVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.z n10 = p2Var2.getActionBar().n();
                        if (TextUtils.isEmpty(pVar.t) && pVar.l) {
                            n10.k(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ v0(File file, ArrayList arrayList, p2 p2Var, eo eoVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f = file;
        this.e = arrayList;
        this.b = p2Var;
        this.c = eoVar;
        this.h = document;
        this.d = z10;
        this.n = tL_messages_stickerSet;
    }

    public /* synthetic */ v0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f = sendMessagesHelper;
        this.b = tL_error;
        this.c = tLObject;
        this.d = z10;
        this.e = arrayList;
        this.h = arrayList2;
        this.n = tLObject2;
    }

    public /* synthetic */ v0(mh1 mh1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f = mh1Var;
        this.b = tL_error;
        this.d = z10;
        this.c = tLObject;
        this.h = bArr;
        this.e = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ v0(vh.p pVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f = pVar;
        this.b = tL_error;
        this.c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.n = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
