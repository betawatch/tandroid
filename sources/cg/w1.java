package cg;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.StateSet;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import jh.s6;
import lh.sb;
import lh.w3;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ae;
import org.telegram.ui.as0;
import org.telegram.ui.dn;
import org.telegram.ui.jm;
import org.telegram.ui.pi;
import org.telegram.ui.q4;
import org.telegram.ui.qi;
import org.telegram.ui.ri;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        j3.e eVar;
        int i10;
        CharSequence charSequence;
        int i11 = this.a;
        Object[] objArr = 0;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                p80 p80Var = ((y1) obj).e;
                try {
                    if (p80Var.getLayout().getLineForOffset(i12) == 0) {
                        p80Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                h3.d dVar = ((h3.c) obj).b;
                if (i12 != -3 && i12 != -2) {
                    if (i12 == -1) {
                        h3.h0 h0Var = dVar.c;
                        if (h0Var != null) {
                            h3.k0 k0Var = h0Var.a;
                            boolean h = k0Var.h();
                            k0Var.n0(-1, h ? 2 : 1, h);
                        }
                        dVar.a();
                        break;
                    } else if (i12 == 1) {
                        dVar.c(1);
                        h3.h0 h0Var2 = dVar.c;
                        if (h0Var2 != null) {
                            h3.k0 k0Var2 = h0Var2.a;
                            k0Var2.n0(1, 1, k0Var2.h());
                            break;
                        }
                    } else {
                        com.google.android.recaptcha.internal.a.s(i12, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i12 != -2 && ((eVar = dVar.d) == null || eVar.a != 1)) {
                    dVar.c(3);
                    break;
                } else {
                    h3.h0 h0Var3 = dVar.c;
                    if (h0Var3 != null) {
                        h3.k0 k0Var3 = h0Var3.a;
                        boolean h10 = k0Var3.h();
                        k0Var3.n0(0, h10 ? 2 : 1, h10);
                    }
                    dVar.c(2);
                    break;
                }
                break;
            case 3:
                we.e.s(((hh.r) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            case 4:
                ConnectionsManager.getInstance(((u7) obj).a).cancelRequest(i12, true);
                break;
            case 5:
                ig.f fVar = (ig.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i12 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i12 - 100);
                    AndroidUtilities.runOnUIThread(new w1(fVar, max, 5), max);
                    break;
                }
                break;
            case 6:
                s6 s6Var = (s6) obj;
                ArrayList arrayList = s6Var.g;
                s6Var.v(arrayList);
                ag.h hVar = s6Var.J;
                Collections.sort(arrayList, hVar);
                ArrayList arrayList2 = s6Var.h;
                s6Var.v(arrayList2);
                Collections.sort(arrayList2, hVar);
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 7:
                ((lh.o) obj).run(Integer.valueOf(i12));
                break;
            case 8:
                ((Utilities.Callback) obj).run(Integer.valueOf(i12));
                break;
            case 9:
                ((lh.l2) obj).p0(i12);
                break;
            case 10:
                MessagesController.getInstance(i12).putUsers((ArrayList) obj, true);
                break;
            case 11:
                sb sbVar = (sb) obj;
                int i13 = sbVar.c;
                sbVar.m();
                sbVar.T1 = false;
                File file = sbVar.G1.O0;
                if (file != null) {
                    file.delete();
                    sbVar.G1.O0 = null;
                }
                sbVar.W(sbVar.G1, true);
                CharSequence[] charSequenceArr = {sbVar.Y0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(new CharSequence[]{sbVar.G1.C0}, true) : new ArrayList<>();
                z7 z7Var = sbVar.G1;
                z7Var.k = (TextUtils.equals(z7Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                sbVar.G1.C0 = new SpannableString(sbVar.Y0.getText());
                sbVar.z();
                sbVar.y();
                z7 z7Var2 = sbVar.G1;
                sbVar.K1 = (z7Var2 == null || !z7Var2.K) ? 0 : 1;
                sbVar.G1 = (z7) sbVar.D1.get(i12);
                sbVar.O(0, 1);
                sbVar.N(0, 1);
                sbVar.Z0.b.U2.N(false);
                sbVar.Y0.setText(sbVar.G1.C0);
                break;
            case 12:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                break;
            case 13:
                MessagesController.getInstance(i12).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 14:
                ((q4) ((org.telegram.ui.g) obj).b).V(i12, true);
                break;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                int i14 = s1Var.r7;
                if (i12 == i14) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) s1Var.k7.get(i14);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!s1Var.u7.scheduled) {
                            if (e0Var.j != null) {
                                s1Var.k();
                            } else if (e0Var.i != null) {
                                s1Var.k();
                                org.telegram.ui.Cells.j1 j1Var = s1Var.Fc;
                                if (j1Var != null) {
                                    j1Var.y1(s1Var, e0Var.i);
                                }
                            }
                        }
                    }
                    s1Var.r7 = -1;
                    s1Var.Z2();
                    break;
                }
                break;
            case 16:
                ((ae) obj).f.c(i12);
                break;
            case 17:
                ((ri) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 18:
                rn rnVar = ((pi) obj).g;
                if (rnVar.sb == i12) {
                    rnVar.Ma();
                    break;
                }
                break;
            case 19:
                rn rnVar2 = ((qi) obj).g;
                if (rnVar2.sb == i12) {
                    rnVar2.Ma();
                    break;
                }
                break;
            case 20:
                rn rnVar3 = ((pi) obj).g;
                if (rnVar3.sb == i12) {
                    rnVar3.Ma();
                    break;
                }
                break;
            case 21:
                rn rnVar4 = ((qi) obj).g;
                if (rnVar4.sb == i12) {
                    rnVar4.Ma();
                    break;
                }
                break;
            case 22:
                rn rnVar5 = ((qi) obj).g;
                if (rnVar5.sb == i12) {
                    rnVar5.Ma();
                    break;
                }
                break;
            case 23:
                rn rnVar6 = ((jm) obj).F0;
                rnVar6.v0.h1(i12, rnVar6.u4);
                break;
            case 24:
                i10 = ((org.telegram.ui.ActionBar.n2) ((dn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i12, true);
                break;
            case 25:
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s1((MessagesStorage.BooleanCallback) obj, r6), 250L);
                break;
            case 26:
                p80 p80Var2 = (p80) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i12).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < privacyRules.size()) {
                            if (privacyRules.get(i15) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i15) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i15) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i15++;
                            }
                        }
                    }
                }
                p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.l1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 27:
                ((g8) obj).b(i12);
                break;
            case 28:
                xc xcVar = (xc) obj;
                w3 w3Var = xcVar.Z0;
                if (xcVar.X0 != i12) {
                    xcVar.setTimer(i12);
                    Utilities.Callback callback2 = xcVar.n1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i12));
                    }
                    if (i12 == 0) {
                        charSequence = LocaleController.getString(xcVar.m1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        w3Var.h = xcVar.getMeasuredWidth();
                        w3Var.q(false);
                        w3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        w3Var.a0 = AndroidUtilities.dp(0);
                        w3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i12 == Integer.MAX_VALUE) {
                        charSequence = LocaleController.getString(xcVar.m1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        w3Var.h = xcVar.getMeasuredWidth();
                        w3Var.q(false);
                        w3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        w3Var.a0 = AndroidUtilities.dp(0);
                        w3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i12 > 0) {
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(xcVar.m1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i12, new Object[0]));
                        w3Var.q(true);
                        w3Var.h = w3.a(replaceTags, w3Var.getTextPaint());
                        w3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        w3Var.a0 = AndroidUtilities.dp(2);
                        w3Var.W = 0.0f;
                        charSequence = replaceTags;
                    }
                    w3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), xcVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (xcVar instanceof as0 ? -1.0f : 1.0f));
                    w3Var.t(charSequence);
                    int i16 = i12 > 0 ? R.raw.fire_on : R.raw.fire_off;
                    oi0 oi0Var = new oi0(i16, AndroidUtilities.dp(34.0f), i0.a.k(i16, ""), AndroidUtilities.dp(34.0f));
                    oi0Var.start();
                    w3Var.k(oi0Var);
                    w3Var.v();
                    xcVar.k1 = false;
                    AndroidUtilities.cancelRunOnUIThread(xcVar.l1);
                    xcVar.invalidate();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i12 == 0) {
                    chatActivityEnterView.v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        qfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.i1.removeView(chatActivityEnterView.Q0);
                    if (chatActivityEnterView.B3) {
                        chatActivityEnterView.B3 = false;
                        chatActivityEnterView.Q0 = null;
                    }
                }
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
        }
    }

    public /* synthetic */ w1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
