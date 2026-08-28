package bg;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.StateSet;
import gh.v7;
import ih.v6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import kh.a8;
import kh.wb;
import kh.x3;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ae;
import org.telegram.ui.cn;
import org.telegram.ui.im;
import org.telegram.ui.ni;
import org.telegram.ui.oi;
import org.telegram.ui.p4;
import org.telegram.ui.pi;
import org.telegram.ui.qn;
import org.telegram.ui.zr0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c2(int i9, Object obj, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        j3.e eVar;
        int i9;
        CharSequence charSequence;
        int i10 = this.a;
        Object[] objArr = 0;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                l80 l80Var = ((f2) obj).e;
                try {
                    if (l80Var.getLayout().getLineForOffset(i11) == 0) {
                        l80Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                ve.e.s(((gh.r) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            case 3:
                ConnectionsManager.getInstance(((v7) obj).a).cancelRequest(i11, true);
                break;
            case 4:
                h3.d dVar = ((h3.c) obj).b;
                if (i11 != -3 && i11 != -2) {
                    if (i11 == -1) {
                        h3.h0 h0Var = dVar.c;
                        if (h0Var != null) {
                            h3.k0 k0Var = h0Var.a;
                            boolean h = k0Var.h();
                            k0Var.n0(-1, h ? 2 : 1, h);
                        }
                        dVar.a();
                        break;
                    } else if (i11 == 1) {
                        dVar.c(1);
                        h3.h0 h0Var2 = dVar.c;
                        if (h0Var2 != null) {
                            h3.k0 k0Var2 = h0Var2.a;
                            k0Var2.n0(1, 1, k0Var2.h());
                            break;
                        }
                    } else {
                        e2.c.t(i11, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i11 != -2 && ((eVar = dVar.d) == null || eVar.a != 1)) {
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
            case 5:
                hg.f fVar = (hg.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i11 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new c2(fVar, max, 5), max);
                    break;
                }
                break;
            case 6:
                v6 v6Var = (v6) obj;
                ArrayList arrayList = v6Var.g;
                v6Var.v(arrayList);
                l0 l0Var = v6Var.J;
                Collections.sort(arrayList, l0Var);
                ArrayList arrayList2 = v6Var.h;
                v6Var.v(arrayList2);
                Collections.sort(arrayList2, l0Var);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 7:
                ((kh.o) obj).run(Integer.valueOf(i11));
                break;
            case 8:
                ((Utilities.Callback) obj).run(Integer.valueOf(i11));
                break;
            case 9:
                ((kh.n2) obj).o0(i11);
                break;
            case 10:
                MessagesController.getInstance(i11).putUsers((ArrayList) obj, true);
                break;
            case 11:
                wb wbVar = (wb) obj;
                int i12 = wbVar.c;
                wbVar.m();
                wbVar.T1 = false;
                File file = wbVar.G1.O0;
                if (file != null) {
                    file.delete();
                    wbVar.G1.O0 = null;
                }
                wbVar.W(wbVar.G1, true);
                CharSequence[] charSequenceArr = {wbVar.Y0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i12).storyEntitiesAllowed() ? MediaDataController.getInstance(i12).getEntities(new CharSequence[]{wbVar.G1.C0}, true) : new ArrayList<>();
                a8 a8Var = wbVar.G1;
                a8Var.k = (TextUtils.equals(a8Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                wbVar.G1.C0 = new SpannableString(wbVar.Y0.getText());
                wbVar.z();
                wbVar.y();
                a8 a8Var2 = wbVar.G1;
                wbVar.K1 = (a8Var2 == null || !a8Var2.K) ? 0 : 1;
                wbVar.G1 = (a8) wbVar.D1.get(i11);
                wbVar.O(0, 1);
                wbVar.N(0, 1);
                wbVar.Z0.b.U2.N(false);
                wbVar.Y0.setText(wbVar.G1.C0);
                break;
            case 12:
                ((of.f0) obj).m(i11);
                break;
            case 13:
                ConnectionsManager.lambda$onUpdateConfig$21(i11, (TLRPC.TL_config) obj);
                break;
            case 14:
                MessagesController.getInstance(i11).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 15:
                ((p4) ((org.telegram.ui.g) obj).b).U(i11, true);
                break;
            case 16:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int i13 = t1Var.r7;
                if (i11 == i13) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) t1Var.k7.get(i13);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!t1Var.u7.scheduled) {
                            if (e0Var.j != null) {
                                t1Var.k();
                            } else if (e0Var.i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Fc;
                                if (k1Var != null) {
                                    k1Var.y1(t1Var, e0Var.i);
                                }
                            }
                        }
                    }
                    t1Var.r7 = -1;
                    t1Var.a3();
                    break;
                }
                break;
            case 17:
                ((ae) obj).f.c(i11);
                break;
            case 18:
                ((pi) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 19:
                qn qnVar = ((ni) obj).g;
                if (qnVar.sb == i11) {
                    qnVar.Ma();
                    break;
                }
                break;
            case 20:
                qn qnVar2 = ((oi) obj).g;
                if (qnVar2.sb == i11) {
                    qnVar2.Ma();
                    break;
                }
                break;
            case 21:
                qn qnVar3 = ((ni) obj).g;
                if (qnVar3.sb == i11) {
                    qnVar3.Ma();
                    break;
                }
                break;
            case 22:
                qn qnVar4 = ((oi) obj).g;
                if (qnVar4.sb == i11) {
                    qnVar4.Ma();
                    break;
                }
                break;
            case 23:
                qn qnVar5 = ((oi) obj).g;
                if (qnVar5.sb == i11) {
                    qnVar5.Ma();
                    break;
                }
                break;
            case 24:
                qn qnVar6 = ((im) obj).F0;
                qnVar6.v0.h1(i11, qnVar6.u4);
                break;
            case 25:
                i9 = ((org.telegram.ui.ActionBar.o2) ((cn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i9).cancelRequest(i11, true);
                break;
            case 26:
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s1((MessagesStorage.BooleanCallback) obj, r6), 250L);
                break;
            case 27:
                l80 l80Var2 = (l80) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i11).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < privacyRules.size()) {
                            if (privacyRules.get(i14) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i14) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i14) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i14++;
                            }
                        }
                    }
                }
                l80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.l1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 28:
                ((h8) obj).b(i11);
                break;
            default:
                ad adVar = (ad) obj;
                x3 x3Var = adVar.Z0;
                if (adVar.X0 != i11) {
                    adVar.setTimer(i11);
                    Utilities.Callback callback2 = adVar.n1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i11));
                    }
                    if (i11 == 0) {
                        charSequence = LocaleController.getString(adVar.m1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        x3Var.h = adVar.getMeasuredWidth();
                        x3Var.q(false);
                        x3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.a0 = AndroidUtilities.dp(0);
                        x3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i11 == Integer.MAX_VALUE) {
                        charSequence = LocaleController.getString(adVar.m1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        x3Var.h = adVar.getMeasuredWidth();
                        x3Var.q(false);
                        x3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.a0 = AndroidUtilities.dp(0);
                        x3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i11 > 0) {
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(adVar.m1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i11, new Object[0]));
                        x3Var.q(true);
                        x3Var.h = x3.a(replaceTags, x3Var.getTextPaint());
                        x3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        x3Var.a0 = AndroidUtilities.dp(2);
                        x3Var.W = 0.0f;
                        charSequence = replaceTags;
                    }
                    x3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), adVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (adVar instanceof zr0 ? -1.0f : 1.0f));
                    x3Var.t(charSequence);
                    int i15 = i11 > 0 ? R.raw.fire_on : R.raw.fire_off;
                    mi0 mi0Var = new mi0(i15, AndroidUtilities.dp(34.0f), j3.r0.l(i15, ""), AndroidUtilities.dp(34.0f));
                    mi0Var.start();
                    x3Var.k(mi0Var);
                    x3Var.v();
                    adVar.k1 = false;
                    AndroidUtilities.cancelRunOnUIThread(adVar.l1);
                    adVar.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c2(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }
}
