package jh;

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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.fg;
import org.telegram.ui.fy;
import org.telegram.ui.hd;
import org.telegram.ui.ie;
import org.telegram.ui.it0;
import org.telegram.ui.je;
import org.telegram.ui.ob;
import org.telegram.ui.tn;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                h5.r0((h5) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (vc[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ih.f1((ob) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (org.telegram.ui.na) this.f, 11));
                break;
            case 2:
                final tn tnVar = (tn) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? tnVar.getMessagesController().getUserFull(user.id) : null;
                j70 I = j70.I(tnVar, s1Var);
                yl0 yl0Var = new yl0(tnVar.getParentActivity(), tnVar.aa);
                I.p = new ie(yl0Var, 1);
                org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(tnVar, user, str, 2);
                j70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new it0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new org.telegram.ui.u1(tnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new it0(b0Var, 26), false);
                if (tL_contact == null && (user == null || !tnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ih.z2(I, J, 2), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new je(tnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new je(tnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new je(tnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new fg(tnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i10 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.eg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i10) {
                                    case 0:
                                        tn tnVar2 = tnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            tnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                    default:
                                        tn tnVar3 = tnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            tnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.eg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        tn tnVar2 = tnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            tnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, false, z10, tnVar2.getParentActivity(), userFull2, tnVar2.getAccountInstance());
                                    default:
                                        tn tnVar3 = tnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            tnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.h2.n(user, true, z11, tnVar3.getParentActivity(), userFull3, tnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new je(tnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new je(tnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new org.telegram.ui.u1(tnVar, yl0Var, user, 16));
                }
                yl0Var.e(I);
                if (characterStyle instanceof c51) {
                    String url = ((c51) characterStyle).getURL();
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
                    yl0Var.f(s1Var, characterStyle, spannableString, false);
                } else {
                    yl0Var.f(s1Var, characterStyle, null, false);
                }
                tnVar.showDialog(yl0Var);
                break;
            case 3:
                tn tnVar2 = (tn) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l10 = (Long) obj;
                int i12 = tnVar2.N3;
                Object obj2 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.c5.M(tnVar2.getParentActivity(), tnVar2.P5, new a1.d(tnVar2, tL_document, str2, obj2, 5), tnVar2.aa);
                } else {
                    tnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, tnVar2.P5, tnVar2.j5, tnVar2.T3, null, tnVar2.h5, sendAnimationData, true, 0, 0, false, obj2, tnVar2.C8(), l10.longValue(), tnVar2.N8(), tnVar2.c5);
                    tL_document = tL_document;
                }
                tnVar2.e9(false);
                tnVar2.U.o(tL_document);
                tnVar2.U.setFieldText("");
                break;
            case 4:
                dy dyVar = (dy) this.b;
                String str3 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ey eyVar = dyVar.a;
                String str4 = eyVar.v;
                ArrayList arrayList4 = eyVar.r;
                ArrayList arrayList5 = eyVar.h;
                ArrayList arrayList6 = eyVar.s;
                fz fzVar = eyVar.B;
                if (str3.equals(str4)) {
                    cw cwVar = fzVar.R;
                    dx dxVar = fzVar.L;
                    int i13 = 0;
                    cwVar.e(false);
                    eyVar.y = true;
                    f2.p0 adapter = dxVar.getAdapter();
                    ey eyVar2 = fzVar.O;
                    if (adapter != eyVar2) {
                        dxVar.setAdapter(eyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(eyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        wx wxVar = (wx) obj3;
                        if (longSparseIntArray.indexOfKey(wxVar.c.id) < 0) {
                            longSparseIntArray.append(wxVar.c.id, 1);
                            arrayList6.add(wxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        wx wxVar2 = (wx) obj4;
                        if (longSparseIntArray.indexOfKey(wxVar2.c.id) < 0) {
                            longSparseIntArray.append(wxVar2.c.id, 1);
                            arrayList6.add(wxVar2);
                        }
                    }
                    eyVar.l();
                    break;
                }
                break;
            default:
                fy fyVar = (fy) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Long l11 = (Long) this.d;
                hd hdVar = (hd) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                fyVar.getClass();
                c2Var.dismiss();
                fyVar.getMessagesController().loadChannelParticipants(l11);
                yx yxVar = fyVar.y2;
                fyVar.removeSelfFromStack();
                hdVar.removeSelfFromStack();
                o2Var.finishFragment();
                if (yxVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l11.longValue(), 0L));
                    yxVar.v(fyVar, arrayList7, null, false, fyVar.F2, fyVar.G2, fyVar.H2, null);
                    break;
                }
                break;
        }
    }
}
