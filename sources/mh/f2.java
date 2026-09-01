package mh;

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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.sc;
import org.telegram.ui.jy;
import org.telegram.ui.lg;
import org.telegram.ui.nd;
import org.telegram.ui.pe;
import org.telegram.ui.py;
import org.telegram.ui.qe;
import org.telegram.ui.sb;
import org.telegram.ui.tt0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                g5.r0((g5) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (sc[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new lh.e1((sb) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.ra) this.f, 10));
                break;
            case 2:
                final xn xnVar = (xn) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? xnVar.getMessagesController().getUserFull(user.id) : null;
                q70 I = q70.I(xnVar, t1Var);
                jm0 jm0Var = new jm0(xnVar.getParentActivity(), xnVar.ba);
                I.p = new pe(jm0Var, 1);
                org.telegram.ui.a0 a0Var = new org.telegram.ui.a0(xnVar, user, str, 2);
                q70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new tt0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.s1(xnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new tt0(a0Var, 26), false);
                if (tL_contact == null && (user == null || !xnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new lh.y2(I, J, 2), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new qe(xnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new qe(xnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new qe(xnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new lg(xnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i10 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.kg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z4;
                                boolean z10;
                                switch (i10) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            xnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z4 = true;
                                                org.telegram.ui.Components.voip.g2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.g2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.kg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z4;
                                boolean z10;
                                switch (i11) {
                                    case 0:
                                        xn xnVar2 = xnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            xnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z4 = true;
                                                org.telegram.ui.Components.voip.g2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z4 = false;
                                        org.telegram.ui.Components.voip.g2.n(user, false, z4, xnVar2.getParentActivity(), userFull2, xnVar2.getAccountInstance());
                                    default:
                                        xn xnVar3 = xnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            xnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.n(user, true, z10, xnVar3.getParentActivity(), userFull3, xnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new qe(xnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new qe(xnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.s1(xnVar, jm0Var, user, 16));
                }
                jm0Var.e(I);
                if (characterStyle instanceof p51) {
                    String url = ((p51) characterStyle).getURL();
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
                    jm0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    jm0Var.f(t1Var, characterStyle, null, false);
                }
                xnVar.showDialog(jm0Var);
                break;
            case 3:
                xn xnVar2 = (xn) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l10 = (Long) obj;
                int i12 = xnVar2.O3;
                Object obj2 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.z4.M(xnVar2.getParentActivity(), xnVar2.Q5, new a1.d(xnVar2, tL_document, str2, obj2, 5), xnVar2.ba);
                } else {
                    xnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, xnVar2.Q5, xnVar2.k5, xnVar2.U3, null, xnVar2.i5, sendAnimationData, true, 0, 0, false, obj2, xnVar2.C8(), l10.longValue(), xnVar2.N8(), xnVar2.d5);
                    tL_document = tL_document;
                }
                xnVar2.e9(false);
                xnVar2.V.o(tL_document);
                xnVar2.V.setFieldText("");
                break;
            case 4:
                ky kyVar = (ky) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ly lyVar = kyVar.a;
                String str4 = lyVar.v;
                ArrayList arrayList4 = lyVar.r;
                ArrayList arrayList5 = lyVar.h;
                ArrayList arrayList6 = lyVar.s;
                mz mzVar = lyVar.C;
                if (str3.equals(str4)) {
                    iw iwVar = mzVar.S;
                    kx kxVar = mzVar.M;
                    int i13 = 0;
                    iwVar.e(false);
                    lyVar.y = true;
                    f2.p0 adapter = kxVar.getAdapter();
                    ly lyVar2 = mzVar.P;
                    if (adapter != lyVar2) {
                        kxVar.setAdapter(lyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(lyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        dy dyVar = (dy) obj3;
                        if (longSparseIntArray.indexOfKey(dyVar.c.id) < 0) {
                            longSparseIntArray.append(dyVar.c.id, 1);
                            arrayList6.add(dyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        dy dyVar2 = (dy) obj4;
                        if (longSparseIntArray.indexOfKey(dyVar2.c.id) < 0) {
                            longSparseIntArray.append(dyVar2.c.id, 1);
                            arrayList6.add(dyVar2);
                        }
                    }
                    lyVar.l();
                    break;
                }
                break;
            default:
                py pyVar = (py) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                Long l11 = (Long) this.d;
                nd ndVar = (nd) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                pyVar.getClass();
                d2Var.dismiss();
                pyVar.getMessagesController().loadChannelParticipants(l11);
                jy jyVar = pyVar.z2;
                pyVar.removeSelfFromStack();
                ndVar.removeSelfFromStack();
                p2Var.finishFragment();
                if (jyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    jyVar.v(pyVar, arrayList7, null, false, pyVar.G2, pyVar.H2, pyVar.I2, null);
                    break;
                }
                break;
        }
    }
}
