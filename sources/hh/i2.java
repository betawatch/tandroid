package hh;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.yy;
import org.telegram.ui.gy;
import org.telegram.ui.id;
import org.telegram.ui.jg;
import org.telegram.ui.ke;
import org.telegram.ui.le;
import org.telegram.ui.lt0;
import org.telegram.ui.qb;
import org.telegram.ui.rn;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i5.r0((i5) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (oc[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gh.i1((qb) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.pa) this.f, 11));
                break;
            case 2:
                final rn rnVar = (rn) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? rnVar.getMessagesController().getUserFull(user.id) : null;
                b70 I = b70.I(rnVar, s1Var);
                ol0 ol0Var = new ol0(rnVar.getParentActivity(), rnVar.aa);
                I.p = new ke(ol0Var, 1);
                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(rnVar, user, str, 2);
                b70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.u1(rnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new lt0(b0Var, 26), false);
                if (tL_contact == null && (user == null || !rnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new gh.f3(I, J, 3), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new le(rnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new le(rnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new le(rnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new jg(rnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i10 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.ig
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i10) {
                                    case 0:
                                        rn rnVar2 = rnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            rnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, false, z10, rnVar2.getParentActivity(), userFull2, rnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, false, z10, rnVar2.getParentActivity(), userFull2, rnVar2.getAccountInstance());
                                    default:
                                        rn rnVar3 = rnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            rnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, true, z11, rnVar3.getParentActivity(), userFull3, rnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, true, z11, rnVar3.getParentActivity(), userFull3, rnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.ig
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        rn rnVar2 = rnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            rnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, false, z10, rnVar2.getParentActivity(), userFull2, rnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, false, z10, rnVar2.getParentActivity(), userFull2, rnVar2.getAccountInstance());
                                    default:
                                        rn rnVar3 = rnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            rnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, true, z11, rnVar3.getParentActivity(), userFull3, rnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, true, z11, rnVar3.getParentActivity(), userFull3, rnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new le(rnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new le(rnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.u1(rnVar, ol0Var, user, 16));
                }
                ol0Var.e(I);
                if (characterStyle instanceof t41) {
                    String url = ((t41) characterStyle).getURL();
                    if (url == null) {
                        url = "";
                    }
                    String trim = url.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        trim = trim.substring(0, 204) + "…";
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    ol0Var.f(s1Var, characterStyle, spannableString, false);
                } else {
                    ol0Var.f(s1Var, characterStyle, null, false);
                }
                rnVar.showDialog(ol0Var);
                break;
            case 3:
                rn rnVar2 = (rn) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l10 = (Long) obj;
                int i12 = rnVar2.N3;
                Object obj2 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.y4.M(rnVar2.getParentActivity(), rnVar2.P5, new a1.d(rnVar2, tL_document, str2, obj2, 6), rnVar2.aa);
                } else {
                    rnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, rnVar2.P5, rnVar2.j5, rnVar2.T3, null, rnVar2.h5, sendAnimationData, true, 0, 0, false, obj2, rnVar2.C8(), l10.longValue(), rnVar2.N8(), rnVar2.c5);
                    tL_document = tL_document;
                }
                rnVar2.e9(false);
                rnVar2.U.p(tL_document);
                rnVar2.U.setFieldText("");
                break;
            case 4:
                vx vxVar = (vx) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                wx wxVar = vxVar.a;
                String str4 = wxVar.v;
                ArrayList arrayList4 = wxVar.r;
                ArrayList arrayList5 = wxVar.h;
                ArrayList arrayList6 = wxVar.s;
                yy yyVar = wxVar.B;
                if (str3.equals(str4)) {
                    vv vvVar = yyVar.R;
                    ww wwVar = yyVar.L;
                    int i13 = 0;
                    vvVar.e(false);
                    wxVar.y = true;
                    f2.q0 adapter = wwVar.getAdapter();
                    wx wxVar2 = yyVar.O;
                    if (adapter != wxVar2) {
                        wwVar.setAdapter(wxVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(wxVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        px pxVar = (px) obj3;
                        if (longSparseIntArray.indexOfKey(pxVar.c.id) < 0) {
                            longSparseIntArray.append(pxVar.c.id, 1);
                            arrayList6.add(pxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        px pxVar2 = (px) obj4;
                        if (longSparseIntArray.indexOfKey(pxVar2.c.id) < 0) {
                            longSparseIntArray.append(pxVar2.c.id, 1);
                            arrayList6.add(pxVar2);
                        }
                    }
                    wxVar.l();
                    break;
                }
                break;
            default:
                gy gyVar = (gy) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Long l11 = (Long) this.d;
                id idVar = (id) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                gyVar.getClass();
                b2Var.dismiss();
                gyVar.getMessagesController().loadChannelParticipants(l11);
                zx zxVar = gyVar.y2;
                gyVar.removeSelfFromStack();
                idVar.removeSelfFromStack();
                n2Var.finishFragment();
                if (zxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    zxVar.w(gyVar, arrayList7, null, false, gyVar.F2, gyVar.G2, gyVar.H2, null);
                    break;
                }
                break;
        }
    }
}
