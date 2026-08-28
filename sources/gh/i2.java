package gh;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.dy;
import org.telegram.ui.hg;
import org.telegram.ui.id;
import org.telegram.ui.ke;
import org.telegram.ui.kt0;
import org.telegram.ui.le;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
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
                k5.q0((k5) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (qc[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fh.k1((pb) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.oa) this.f, 13));
                break;
            case 2:
                final qn qnVar = (qn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? qnVar.getMessagesController().getUserFull(user.id) : null;
                x60 I = x60.I(qnVar, t1Var);
                ll0 ll0Var = new ll0(qnVar.getParentActivity(), qnVar.aa);
                I.p = new ke(ll0Var, 1);
                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(qnVar, user, str, 2);
                x60 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.t1(qnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new kt0(a0Var, 26), false);
                if (tL_contact == null && (user == null || !qnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new fh.k3(I, J, 3), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new le(qnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new le(qnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new le(qnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new hg(qnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i9 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.gg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i9) {
                                    case 0:
                                        qn qnVar2 = qnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            qnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                    default:
                                        qn qnVar3 = qnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            qnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i10 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.gg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i10) {
                                    case 0:
                                        qn qnVar2 = qnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            qnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, false, z10, qnVar2.getParentActivity(), userFull2, qnVar2.getAccountInstance());
                                    default:
                                        qn qnVar3 = qnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            qnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.e2.n(user, true, z11, qnVar3.getParentActivity(), userFull3, qnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new le(qnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new le(qnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.t1(qnVar, ll0Var, user, 16));
                }
                ll0Var.e(I);
                if (characterStyle instanceof r41) {
                    String url = ((r41) characterStyle).getURL();
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
                    ll0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    ll0Var.f(t1Var, characterStyle, null, false);
                }
                qnVar.showDialog(ll0Var);
                break;
            case 3:
                qn qnVar2 = (qn) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l10 = (Long) obj;
                int i11 = qnVar2.N3;
                Object obj2 = this.e;
                if (i11 == 1) {
                    org.telegram.ui.Components.y4.M(qnVar2.getParentActivity(), qnVar2.P5, new a1.d(qnVar2, tL_document, str2, obj2, 6), qnVar2.aa);
                } else {
                    qnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, qnVar2.P5, qnVar2.j5, qnVar2.T3, null, qnVar2.h5, sendAnimationData, true, 0, 0, false, obj2, qnVar2.C8(), l10.longValue(), qnVar2.N8(), qnVar2.c5);
                    tL_document = tL_document;
                }
                qnVar2.e9(false);
                qnVar2.U.o(tL_document);
                qnVar2.U.setFieldText("");
                break;
            case 4:
                ux uxVar = (ux) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                vx vxVar = uxVar.a;
                String str4 = vxVar.v;
                ArrayList arrayList4 = vxVar.r;
                ArrayList arrayList5 = vxVar.h;
                ArrayList arrayList6 = vxVar.s;
                wy wyVar = vxVar.B;
                if (str3.equals(str4)) {
                    wv wvVar = wyVar.R;
                    ww wwVar = wyVar.L;
                    int i12 = 0;
                    wvVar.e(false);
                    vxVar.y = true;
                    f2.r0 adapter = wwVar.getAdapter();
                    vx vxVar2 = wyVar.O;
                    if (adapter != vxVar2) {
                        wwVar.setAdapter(vxVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(vxVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        ox oxVar = (ox) obj3;
                        if (longSparseIntArray.indexOfKey(oxVar.c.id) < 0) {
                            longSparseIntArray.append(oxVar.c.id, 1);
                            arrayList6.add(oxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i12 < size2) {
                        Object obj4 = arrayList3.get(i12);
                        i12++;
                        ox oxVar2 = (ox) obj4;
                        if (longSparseIntArray.indexOfKey(oxVar2.c.id) < 0) {
                            longSparseIntArray.append(oxVar2.c.id, 1);
                            arrayList6.add(oxVar2);
                        }
                    }
                    vxVar.l();
                    break;
                }
                break;
            default:
                dy dyVar = (dy) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Long l11 = (Long) this.d;
                id idVar = (id) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                dyVar.getClass();
                c2Var.dismiss();
                dyVar.getMessagesController().loadChannelParticipants(l11);
                wx wxVar = dyVar.y2;
                dyVar.removeSelfFromStack();
                idVar.removeSelfFromStack();
                o2Var.finishFragment();
                if (wxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    wxVar.v(dyVar, arrayList7, null, false, dyVar.F2, dyVar.G2, dyVar.H2, null);
                    break;
                }
                break;
        }
    }
}
