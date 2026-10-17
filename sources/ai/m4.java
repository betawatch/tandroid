package ai;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gt;
import org.telegram.ui.sn;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m4(k7 k7Var, TLRPC.TL_error tL_error, byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, Utilities.Callback callback, TLObject tLObject) {
        this.e = k7Var;
        this.b = tL_error;
        this.f = bArr;
        this.h = twoStepVerificationActivity;
        this.d = z10;
        this.n = callback;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10;
        int i11 = this.a;
        boolean z10 = this.d;
        TLObject tLObject = this.c;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (i11) {
            case 0:
                k7.f0((k7) obj5, (TLRPC.TL_error) obj4, (byte[]) obj3, (TwoStepVerificationActivity) obj2, this.d, (Utilities.Callback) obj, this.c);
                break;
            case 1:
                ig.r0.U((ig.r0) obj5, (TLRPC.TL_error) obj4, this.c, (int[]) obj3, (ArrayList) obj2, this.d, (TLRPC.User) obj);
                break;
            case 2:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequestMulti$76((TLRPC.TL_error) obj4, this.c, this.d, (ArrayList) obj3, (ArrayList) obj2, (TLObject) obj);
                break;
            case 3:
                ArrayList arrayList2 = (ArrayList) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.Document document = (TLRPC.Document) obj;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new MediaController.PhotoEntry(0, 0, 0L, ((File) obj5).getAbsolutePath(), 0, false, 0, 0, 0L));
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().g2(arrayList2, 0, 11, false, new ey0(), (sn) obj2);
                PhotoViewer.t1().Y0(document, z10 ? document : null, false, null);
                gt q6 = gt.q();
                if (!z10) {
                    tL_messages_stickerSet = null;
                }
                q6.T = tL_messages_stickerSet;
                break;
            case 4:
                xf1.d0((xf1) obj5, (TLRPC.TL_error) obj4, this.d, this.c, (byte[]) obj3, (String) obj2, (TL_account.passwordInputSettings) obj);
                break;
            default:
                xh.k kVar = (xh.k) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i12 = kVar.k;
                ArrayList arrayList3 = kVar.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = kVar.g;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    if (tL_error != null) {
                        org.telegram.ui.Components.f5.e0(i12, tL_error, n2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject;
                        if (!tL_updates.chats.isEmpty()) {
                            MessagesController.getInstance(i12).loadFullChat(tL_updates.chats.get(0).id, 0, true);
                        }
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList3.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i13)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i13);
                                } else {
                                    i13++;
                                }
                            }
                        }
                        xh.f fVar = kVar.f;
                        xh.k kVar2 = fVar.c;
                        int i14 = 0;
                        while (true) {
                            arrayList = kVar2.c;
                            if (i14 < arrayList.size()) {
                                int i15 = i14;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i14)).user_id == tL_chatInviteImporter.user_id) {
                                    i10 = i15;
                                } else {
                                    i14 = i15 + 1;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            arrayList.remove(i10);
                            fVar.u((!fVar.c.B ? 1 : 0) + i10);
                            if (arrayList.isEmpty()) {
                                fVar.u(1);
                            }
                        }
                        kVar.f(kVar.t, false, true);
                        if (z10) {
                            org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                            int dp = AndroidUtilities.dp(15.0f);
                            org.telegram.ui.Components.w9 w9Var = ccVar.a;
                            w9Var.setRoundRadius(dp);
                            w9Var.e(user, new org.telegram.ui.Components.h9(0, user));
                            String firstName = UserObject.getFirstName(user);
                            String formatString = kVar.a ? LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, firstName) : LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, firstName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                            int indexOf = formatString.indexOf(firstName);
                            spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), indexOf, firstName.length() + indexOf, 18);
                            ccVar.b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                org.telegram.ui.Components.qc.g(n2Var2, ccVar, 2750).j();
                            } else {
                                org.telegram.ui.Components.qc.f(kVar.h, ccVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y n10 = n2Var2.getActionBar().n();
                        if (TextUtils.isEmpty(kVar.t) && kVar.l) {
                            n10.k(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ m4(ig.r0 r0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.e = r0Var;
        this.b = tL_error;
        this.c = tLObject;
        this.f = iArr;
        this.h = arrayList;
        this.d = z10;
        this.n = user;
    }

    public /* synthetic */ m4(File file, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, sn snVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.e = file;
        this.b = arrayList;
        this.f = n2Var;
        this.h = snVar;
        this.n = document;
        this.d = z10;
        this.c = tL_messages_stickerSet;
    }

    public /* synthetic */ m4(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.e = sendMessagesHelper;
        this.b = tL_error;
        this.c = tLObject;
        this.d = z10;
        this.f = arrayList;
        this.h = arrayList2;
        this.n = tLObject2;
    }

    public /* synthetic */ m4(xf1 xf1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.e = xf1Var;
        this.b = tL_error;
        this.d = z10;
        this.c = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ m4(xh.k kVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.e = kVar;
        this.b = tL_error;
        this.c = tLObject;
        this.f = tL_chatInviteImporter;
        this.d = z10;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }
}
