// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n35 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n35(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z;
        ?? r16;
        byte b;
        String str;
        int size;
        int i;
        byte b2;
        String[] strArr;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLObject tLObject2 = tLObject;
        byte b3 = this.a;
        byte b4 = 27;
        String str2 = null;
        byte b5 = 23;
        byte b6 = 26;
        byte b7 = 24;
        byte b8 = 3;
        byte b9 = 15;
        boolean z2 = true;
        byte b10 = 0;
        int i2 = 0;
        Object obj = this.b;
        switch (b3) {
            case 0:
                gl.c3(new jf4(obj, (Object) tL_error, (Object) tLObject2, (byte) 17));
                break;
            case 1:
                k65 k65Var = (k65) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    na7.q1(k65Var.b.n1.a).R3((TLRPC.TL_updates) tLObject2, false);
                    break;
                }
                break;
            case 2:
                gl.c3(new vc4((mb5) obj, tL_error, (byte) 28));
                break;
            case 3:
                gl.c3(new hb5((zq5) obj, tLObject2, (byte) 13));
                break;
            case 4:
                gl.c3(new jf4((jr5) obj, tL_error, tLObject2, b4));
                break;
            case 5:
                gl.c3(new kz5((a46) obj, tLObject2, b8));
                break;
            case 6:
                gl.c3(new kz5((be6) obj, tL_error, (byte) 20));
                break;
            case 7:
                gl.c3(new sx5(obj, (Object) tL_error, (Object) tLObject2, (byte) 22));
                break;
            case 8:
                gl.c3(new sx5(b7, (ve6) obj, tL_error, tLObject2));
                break;
            case 9:
                gl.c3(new lo6((byte) 12, obj, (Object) tL_error, tLObject2));
                break;
            case 10:
                gl.c3(new ks2((Runnable) obj, b8));
                break;
            case 11:
                ba7 ba7Var = (ba7) obj;
                TLRPC.ChannelParticipant channelParticipant = tLObject2 instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject2).participant : null;
                boolean z3 = (tL_error != null || channelParticipant == null || channelParticipant.left) ? false : true;
                if (channelParticipant != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant.admin_rights;
                    str2 = channelParticipant.rank;
                    tL_chatAdminRights = tL_chatAdminRights2;
                } else {
                    tL_chatAdminRights = null;
                }
                ba7Var.a(z3, tL_chatAdminRights, str2);
                break;
            case 12:
                gl.c3(new t67((ha7) obj, tLObject2, b9));
                break;
            case 13:
                ia7 ia7Var = (ia7) obj;
                ArrayList arrayList = new ArrayList();
                if (tLObject2 instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject2).documents;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        TLRPC.Document document = arrayList2.get(i3);
                        i3++;
                        arrayList.add(ia7Var.d(document));
                    }
                }
                gl.c3(new lo6(ia7Var, tLObject2, arrayList, b5));
                break;
            case 14:
                gl.c3(new vl6((NotificationsSettingsActivity) obj, (byte) 25));
                break;
            case 15:
                gl.c3(new pc7(obj, (Object) tL_error, (Object) tLObject2, (byte) 8));
                break;
            case 16:
                qx7 qx7Var = (qx7) obj;
                if (tL_error != null && tL_error.text != null) {
                    gl.c3(new bj7(qx7Var, tL_error, b7));
                    break;
                }
                break;
            case 17:
                gl.c3(new h18((yf8) obj, tLObject2, (byte) 19));
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.getClass();
                gl.c3(new pc7(premiumPreviewFragment, tL_error, tLObject2, b4));
                break;
            case 19:
                gl.c3(new h18((PrivacyControlActivity) obj, tLObject2, b7));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    gl.c3(new h18(privacySettingsActivity, (TL_account.Password) tLObject2, b6));
                    break;
                }
                break;
            case 21:
                to8 to8Var = (to8) obj;
                int i4 = to8Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    na7.q1(i4).b4(tL_messages_webPage.users, false);
                    na7.q1(i4).V3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size3 = page.blocks.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size3) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i5);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i5 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i5 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = o.y(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            i = b10;
                                            while (i < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String C = o.C(tL_pageListItemText.text);
                                                    String charSequence = o.y(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(C) && !TextUtils.isEmpty(charSequence)) {
                                                        b2 = b10;
                                                        if (str != null) {
                                                            strArr = new String[2];
                                                            strArr[b2] = k96.M0(2131745276, null);
                                                            strArr[1] = str;
                                                        } else {
                                                            strArr = new String[1];
                                                            strArr[b2] = k96.M0(2131745276, null);
                                                        }
                                                        arrayList3.add(new aa7(charSequence, strArr, C));
                                                        i++;
                                                        b10 = b2;
                                                    }
                                                }
                                                b2 = b10;
                                                i++;
                                                b10 = b2;
                                            }
                                            b = b10;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i = b10;
                                    while (i < size) {
                                    }
                                    b = b10;
                                } else {
                                    b = b10;
                                    if (!(pageBlock instanceof TL_iv.pageBlockAnchor)) {
                                    }
                                }
                                i5++;
                                b10 = b;
                            } else {
                                b = b10;
                            }
                        }
                        to8Var.F = webPage;
                        r16 = b;
                    } else {
                        r16 = false;
                    }
                    gl.c3(new ll8(to8Var, arrayList3, b9));
                    z = r16;
                } else {
                    z = false;
                }
                to8Var.G = z;
                break;
            case 22:
                gl.c3(new lw8((ox8) obj, tLObject2, b8));
                break;
            case 23:
                oz8 oz8Var = (oz8) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject2;
                    int i6 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    oz8Var.post(new j45((Object) oz8Var, i6, (Object) tL_messages_messageReactionsList, (byte) 29));
                    break;
                }
                break;
            case 24:
                gl.c3(new rz8((a09) obj, tLObject2, b10));
                break;
            case 25:
                gl.c3(new lw8((gb9) obj, tLObject2, (byte) 18));
                break;
            case 26:
                gl.c3(new lw8((bg9) obj, tLObject2, b5));
                break;
            case 27:
                gl.c3(new lw8((ij9) obj, tLObject2, b6));
                break;
            case 28:
                gl.c3(new gm8((jj9) obj, tLObject2, tL_error, b9));
                break;
            default:
                nm9 nm9Var = (nm9) obj;
                int i7 = nm9Var.e;
                if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    na7.q1(i7).b4(groupcall.users, false);
                    na7.q1(i7).V3(groupcall.chats, false);
                    if (nm9Var.P != null && !nm9Var.w) {
                        while (true) {
                            if (i2 < groupcall.participants.size()) {
                                if (cf3.n(groupcall.participants.get(i2).peer) == nm9Var.b) {
                                    nm9Var.y = groupcall.participants.get(i2);
                                } else {
                                    i2++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = nm9Var.y;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = nm9Var.P;
                            String str3 = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] J = nm9.J(tL_groupCallParticipantVideo);
                            nm9Var.K(J);
                            nativeInstance.addIncomingVideoOutput(2, str3, J, nm9Var.Q, cf3.n(nm9Var.y.peer));
                            gl.c3(new tj9(nm9Var, nm9Var.y.video.endpoint, (byte) 5));
                            break;
                        } else {
                            gl.c3(new gm9(nm9Var, z2 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
