package a1;

import a3.m0;
import ah.g1;
import ah.j1;
import ah.l1;
import ah.t0;
import ah.w;
import ah.w0;
import ah.y;
import ai.d2;
import ai.fa;
import ai.ha;
import ai.i0;
import ai.l7;
import ai.me;
import ai.q7;
import ai.r0;
import ai.y9;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.a2;
import com.google.android.gms.internal.play_billing.k3;
import i2.a0;
import i2.b0;
import i2.h0;
import ih.l;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import v0.i;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) obj2, (Exception) obj);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) obj2, (p) obj);
                break;
            case 2:
                ((a3.f) ((qf.b) obj2).c).h.onVideoSizeChanged((a2) obj);
                break;
            case 3:
                m0 m0Var = (m0) ((s) obj2).c;
                String str = e2.m0.a;
                s.h(((b0) m0Var).a.G, (i2.d) obj);
                break;
            case 4:
                a2 a2Var = (a2) obj;
                m0 m0Var2 = (m0) ((s) obj2).c;
                String str2 = e2.m0.a;
                h0 h0Var = ((b0) m0Var2).a;
                h0Var.k0 = a2Var;
                h0Var.m.e(25, new a0(a2Var));
                break;
            case 5:
                m0 m0Var3 = (m0) ((s) obj2).c;
                String str3 = e2.m0.a;
                j2.e eVar = ((b0) m0Var3).a.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1030, new l(p5, (Exception) obj, 4));
                break;
            case 6:
                m0 m0Var4 = (m0) ((s) obj2).c;
                String str4 = e2.m0.a;
                j2.e eVar2 = ((b0) m0Var4).a.s;
                j2.a p9 = eVar2.p();
                eVar2.q(p9, 1019, new l(p9, (String) obj, 11));
                break;
            case 7:
                ah.a0 a0Var = (ah.a0) obj2;
                a6 a6Var = (a6) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0Var.n.getText());
                a6[] a6VarArr = (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class);
                int length = a6VarArr.length;
                while (i13 < length) {
                    a6 a6Var2 = a6VarArr[i13];
                    if (a6Var2 == a6Var) {
                        int editTextSelectionEnd = a0Var.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(a6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(a6Var2);
                        a0Var.n.getText().delete(spanStart, spanEnd);
                        int i14 = spanEnd - spanStart;
                        w wVar = a0Var.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i14;
                        }
                        wVar.setSelection(editTextSelectionEnd);
                        break;
                    } else {
                        i13++;
                    }
                }
                break;
            case 8:
                ah.a0 a0Var2 = (ah.a0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (a0Var2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    l1.f(-a0Var2.M, a0Var2.R, a0Var2.Q);
                    break;
                } else {
                    String str5 = tL_error.text;
                    if (str5.equals("REACTIONS_TOO_MANY")) {
                        str5 = LocaleController.formatPluralString("ReactionMaxCountError", a0Var2.J, new Object[0]);
                    }
                    xc.a0(a0Var2).t(str5, null).j();
                    break;
                }
                break;
            case 9:
                a6 a6Var3 = (a6) obj;
                ah.a0 a0Var3 = ((y) obj2).f2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a0Var3.n.getText());
                a6[] a6VarArr2 = (a6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), a6.class);
                int length2 = a6VarArr2.length;
                while (i13 < length2) {
                    a6 a6Var4 = a6VarArr2[i13];
                    if (a6Var4 == a6Var3) {
                        int editTextSelectionEnd2 = a0Var3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(a6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(a6Var4);
                        a0Var3.n.getText().delete(spanStart2, spanEnd2);
                        int i15 = spanEnd2 - spanStart2;
                        w wVar2 = a0Var3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i15;
                        }
                        wVar2.setSelection(editTextSelectionEnd2);
                        break;
                    } else {
                        i13++;
                    }
                }
                break;
            case 10:
                t0 t0Var = (t0) obj2;
                gl0 gl0Var = (gl0) obj;
                t0Var.l = true;
                t0Var.a.invalidate();
                gl0Var.c1 = false;
                gl0Var.invalidate();
                t0Var.c(true);
                break;
            case 11:
                w0 w0Var = (w0) obj2;
                ah.c cVar = (ah.c) obj;
                w0Var.getText().delete(w0Var.getText().getSpanStart(cVar), w0Var.getText().getSpanEnd(cVar));
                w0Var.setCursorVisible(true);
                w0Var.setLongClickable(true);
                break;
            case 12:
                j1 j1Var = (j1) obj2;
                g1 g1Var = (g1) obj;
                j1Var.getClass();
                TLRPC.ReactionCount reactionCount = g1Var.a;
                ViewParent viewParent = j1Var.z;
                if (k3.s(viewParent)) {
                    ((n4) viewParent).e(reactionCount, true, 0.0f, 0.0f);
                }
                g1Var.Y.c(false);
                j1Var.S = null;
                j1Var.T = false;
                j1Var.U = null;
                break;
            case 13:
                ai.h0 h0Var2 = (ai.h0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = h0Var2.a;
                ArrayList arrayList2 = h0Var2.e;
                h0Var2.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i16).putUsers(connectedstarrefbots.users, false);
                    if (h0Var2.c <= 0) {
                        arrayList2.clear();
                    }
                    h0Var2.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    h0Var2.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= h0Var2.c;
                } else {
                    h0Var2.h = true;
                    h0Var2.d = true;
                }
                h0Var2.g = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(h0Var2.b));
                break;
            case 14:
                i0 i0Var = (i0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i17 = i0Var.a;
                ArrayList arrayList3 = i0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(suggestedstarrefbots.users, false);
                    if (i0Var.c <= 0) {
                        arrayList3.clear();
                    }
                    i0Var.c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    i0Var.j = suggestedstarrefbots.next_offset;
                    i0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList3.size() >= i0Var.c;
                } else {
                    i0Var.i = true;
                    i0Var.d = true;
                }
                i0Var.h = false;
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(i0Var.b));
                break;
            case 15:
                l7.e1((l7) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                break;
            case 16:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ((c2) obj2).dismiss();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = xc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = xc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    v0.p(i11, a02, i10, 36);
                    break;
                }
                break;
            case 17:
                l7.P0((l7) obj2, (Long) obj);
                break;
            case 18:
                l7 l7Var = (l7) obj2;
                if (!((ha) obj).e) {
                    qc Q = l7Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    l7Var.k0.setLoading(false);
                    l7Var.Q1();
                    break;
                }
            case 19:
                MessagesController.getInstance(((l7) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                break;
            case 20:
                ((l7) obj2).getBulletinFactory().f0((TLRPC.TL_error) obj, false);
                break;
            case 21:
                l7 l7Var2 = (l7) obj2;
                xc.a0((sn) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(l7Var2.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new d2(l7Var2, 8)).k(true);
                break;
            case 22:
                l7 l7Var3 = (l7) obj2;
                l7Var3.getClass();
                ((boolean[]) obj)[0] = true;
                l7Var3.k0.setLoading(false);
                l7Var3.Q1();
                break;
            case 23:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((l7) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 24:
                ((l7) obj2).Q2((CharSequence) obj);
                break;
            case 25:
                q7 q7Var = (q7) obj2;
                sn snVar = (sn) obj;
                z zVar = q7Var.b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    q7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    z zVar2 = q7Var.b;
                    if (zVar2 instanceof t1) {
                        messageObject = ((t1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    fa faVar = ha.y(messageObject2.currentAccount, false).B;
                    if (faVar != null) {
                        faVar.b();
                    }
                    TLRPC.ChatFull chatFull = snVar.l8;
                    me meVar = new me(q7Var.getContext(), snVar.getCurrentAccount(), snVar.a(), snVar, messageObject2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, snVar.getResourceProvider());
                    messageObject2.getId();
                    z zVar3 = q7Var.b;
                    meVar.V = snVar;
                    meVar.W = zVar3;
                    meVar.show();
                    break;
                }
                break;
            case 26:
                TLObject tLObject3 = (TLObject) obj2;
                r0 r0Var = (r0) obj;
                if (!(tLObject3 instanceof TL_stars.StarGifts)) {
                    r0Var.run(null);
                    break;
                } else {
                    r0Var.run((TL_stars.StarGifts) tLObject3);
                    break;
                }
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    break;
                }
                break;
            case 28:
                y9 y9Var = (y9) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = y9Var.l;
                int i18 = y9Var.a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i19 = 0;
                        while (i19 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i19)).pinned_to_top) {
                            i19++;
                        }
                        arrayList5.add(i19, savedStarGift);
                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.b), y9Var);
                        break;
                    }
                }
                break;
            default:
                ((MessagesController) obj2).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                break;
        }
    }

    public /* synthetic */ f(ha haVar, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 27;
        this.b = zArr;
        this.c = callback2;
    }
}
