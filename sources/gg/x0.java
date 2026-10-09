package gg;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ x0(j1 j1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.a = 0;
        this.c = j1Var;
        this.d = str;
        this.b = z10;
        this.h = tLObject;
        this.n = user;
        this.e = str2;
        this.r = messagesStorage;
        this.f = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [a0.i, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ?? r10;
        TextView textView;
        ?? r16;
        int i10 = this.a;
        boolean z11 = this.b;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i10) {
            case 0:
                j1 j1Var = (j1) obj7;
                String str = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str2 = (String) obj5;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                String str3 = (String) obj4;
                kb0 kb0Var = j1Var.V;
                if (str.equals(j1Var.r0)) {
                    j1Var.u0 = 0;
                    if (z11 && tLObject == null) {
                        j1Var.T(false, user, str, str2);
                    } else if (kb0Var != null) {
                        kb0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        j1Var.s0 = tL_messages_botResults.next_offset;
                        if (j1Var.T == null) {
                            j1Var.T = tL_messages_botResults.switch_pm;
                        }
                        j1Var.U = tL_messages_botResults.switch_webview;
                        int i11 = 0;
                        while (i11 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i11);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i11);
                                i11--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i11++;
                        }
                        if (j1Var.R == null || str2.length() == 0) {
                            j1Var.R = tL_messages_botResults.results;
                            j1Var.x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            j1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                j1Var.s0 = "";
                            }
                            z10 = true;
                        }
                        t tVar = j1Var.p0;
                        if (tVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(tVar);
                            r10 = 0;
                            j1Var.p0 = null;
                        } else {
                            r10 = 0;
                        }
                        j1Var.I = r10;
                        j1Var.A0 = r10;
                        j1Var.x = r10;
                        j1Var.y = r10;
                        j1Var.J = r10;
                        j1Var.Q = r10;
                        j1Var.M = r10;
                        j1Var.N = r10;
                        j1Var.K = r10;
                        j1Var.P = r10;
                        j1Var.o0 = false;
                        kb0Var.a((j1Var.R.isEmpty() && j1Var.T == null && j1Var.U == null) ? false : true);
                        if (!z10) {
                            j1Var.l();
                            break;
                        } else {
                            int i12 = (j1Var.T == null && j1Var.U == null) ? 0 : 1;
                            j1Var.m(((j1Var.R.size() - tL_messages_botResults.results.size()) + i12) - 1);
                            j1Var.s((j1Var.R.size() - tL_messages_botResults.results.size()) + i12, tL_messages_botResults.results.size());
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((ContactsController) obj7).lambda$performSyncPhoneBook$19((HashMap) obj6, (HashMap) obj5, this.b, (HashMap) obj4, (ArrayList) obj3, (HashMap) obj2, (boolean[]) obj);
                break;
            case 2:
                ((MediaDataController) obj7).lambda$broadcastPinnedMessage$169((ArrayList) obj6, this.b, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj3, (a0.i) obj2, (a0.i) obj);
                break;
            case 3:
                ((SendMessagesHelper) obj7).lambda$sendCallback$46((TLRPC.TL_error) obj6, (TLObject) obj3, (TwoStepVerificationActivity) obj5, this.b, (MessageObject) obj4, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj);
                break;
            case 4:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                break;
            default:
                ci.d dVar = (ci.d) obj7;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj6;
                org.telegram.ui.Wallet.d2 d2Var = k0Var.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj4;
                TextView textView2 = (TextView) obj3;
                y9 y9Var = (y9) obj2;
                TextView textView3 = (TextView) obj;
                if (!z11) {
                    ArrayList arrayList = d2Var.d;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj8 = arrayList.get(i13);
                            i13++;
                            TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                            textView = textView3;
                            r16 = 0;
                            ArrayList arrayList2 = arrayList;
                            if (tonconnectsession2.id == tonconnectsession.id) {
                                y1Var.e = tonconnectsession2;
                            } else {
                                textView3 = textView;
                                arrayList = arrayList2;
                            }
                        } else {
                            textView = textView3;
                            r16 = 0;
                        }
                    }
                    TL_wallet.tonConnectSession tonconnectsession3 = y1Var.e;
                    boolean z12 = (tonconnectsession3.manifest == null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing) ? r16 : true;
                    dVar.setEnabled((!z12 || y1Var.f) ? r16 : true);
                    TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                    if (tonconnectmanifest != null) {
                        int i14 = R.string.WalletConnectToApp;
                        Object[] objArr = new Object[1];
                        objArr[r16] = tonconnectmanifest.name;
                        textView2.setText(LocaleController.formatSpannable(i14, objArr));
                        TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                        if (webDocument != null) {
                            y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession3.manifest);
                        }
                    }
                    Integer num = tonconnectsession3.manifest_error;
                    if (num == null) {
                        if (!z12) {
                            textView.setText(LocaleController.getString((tonconnectsession3.closed || tonconnectsession3.closing) ? R.string.WalletTonConnectSessionClosed : R.string.Loading));
                            break;
                        } else {
                            d2Var.getClass();
                            textView.setText(LocaleController.getString(org.telegram.ui.Wallet.d2.u(y1Var) ? R.string.WalletConnectProofInfo : R.string.WalletConnectInfo));
                            break;
                        }
                    } else {
                        int i15 = R.string.WalletTonConnectManifestLoadFailed;
                        Object[] objArr2 = new Object[1];
                        objArr2[r16] = num;
                        textView.setText(LocaleController.formatString(i15, objArr2));
                        break;
                    }
                } else {
                    dVar.setEnabled((!k0Var.D() || k0Var.r() == null || k0Var.w() == null || dVar.N) ? false : true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, boolean z10, Serializable serializable, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = serializable;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
    }

    public /* synthetic */ x0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar, a0.i iVar2) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = arrayList;
        this.b = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = iVar;
        this.r = iVar2;
    }

    public /* synthetic */ x0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.a = 3;
        this.c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.e = twoStepVerificationActivity;
        this.b = z10;
        this.f = messageObject;
        this.n = keyboardButtonProto;
        this.r = znVar;
    }

    public /* synthetic */ x0(boolean z10, ci.d dVar, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.y1 y1Var, TextView textView, y9 y9Var, TextView textView2) {
        this.a = 5;
        this.b = z10;
        this.c = dVar;
        this.d = k0Var;
        this.e = tonconnectsession;
        this.f = y1Var;
        this.h = textView;
        this.n = y9Var;
        this.r = textView2;
    }
}
