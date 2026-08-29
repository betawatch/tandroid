package bg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import jh.s7;
import lh.s6;
import nh.gb;
import nh.o7;
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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fn;
import org.telegram.ui.km;
import org.telegram.ui.q4;
import org.telegram.ui.qi;
import org.telegram.ui.ri;
import org.telegram.ui.si;
import org.telegram.ui.tn;
import org.telegram.ui.ws0;
import org.telegram.ui.yd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        l3.e eVar;
        int i10;
        int i11 = this.a;
        Object[] objArr = 0;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                k kVar = (k) obj;
                kVar.H = i12;
                kVar.G = true;
                try {
                    kVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator = kVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = kVar.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                kVar.L = duration;
                duration.setInterpolator(jr.f);
                kVar.L.addUpdateListener(new g(kVar, 5));
                kVar.L.addListener(new h(kVar, r4));
                kVar.L.start();
                break;
            case 1:
                ws0 ws0Var = (ws0) obj;
                ag.k2 k2Var = ws0Var.G1;
                ws0Var.s0(k2Var, null);
                ag.h1.e(i12).j(k2Var.c);
                break;
            case 2:
                u3 u3Var = (u3) obj;
                u3Var.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                u3Var.h();
                break;
            case 3:
                y80 y80Var = ((eg.w1) obj).e;
                try {
                    if (y80Var.getLayout().getLineForOffset(i12) == 0) {
                        y80Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 4:
                j3.d dVar = ((j3.c) obj).b;
                if (i12 != -3 && i12 != -2) {
                    if (i12 == -1) {
                        j3.h0 h0Var = dVar.c;
                        if (h0Var != null) {
                            j3.k0 k0Var = h0Var.a;
                            boolean h = k0Var.h();
                            k0Var.n0(-1, h ? 2 : 1, h);
                        }
                        dVar.a();
                        break;
                    } else if (i12 == 1) {
                        dVar.c(1);
                        j3.h0 h0Var2 = dVar.c;
                        if (h0Var2 != null) {
                            j3.k0 k0Var2 = h0Var2.a;
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
                    j3.h0 h0Var3 = dVar.c;
                    if (h0Var3 != null) {
                        j3.k0 k0Var3 = h0Var3.a;
                        boolean h10 = k0Var3.h();
                        k0Var3.n0(0, h10 ? 2 : 1, h10);
                    }
                    dVar.c(2);
                    break;
                }
                break;
            case 5:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ye.d.s(((jh.q) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            case 7:
                ConnectionsManager.getInstance(((s7) obj).a).cancelRequest(i12, true);
                break;
            case 8:
                kg.f fVar = (kg.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i12 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i12 - 100);
                    AndroidUtilities.runOnUIThread(new f(fVar, max, 8), max);
                    break;
                }
                break;
            case 9:
                s6 s6Var = (s6) obj;
                ArrayList arrayList = s6Var.g;
                s6Var.v(arrayList);
                a4.v vVar = s6Var.J;
                Collections.sort(arrayList, vVar);
                ArrayList arrayList2 = s6Var.h;
                s6Var.v(arrayList2);
                Collections.sort(arrayList2, vVar);
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 10:
                ((nh.o) obj).run(Integer.valueOf(i12));
                break;
            case 11:
                ((Utilities.Callback) obj).run(Integer.valueOf(i12));
                break;
            case 12:
                ((nh.k2) obj).p0(i12);
                break;
            case 13:
                MessagesController.getInstance(i12).putUsers((ArrayList) obj, true);
                break;
            case 14:
                gb gbVar = (gb) obj;
                int i13 = gbVar.c;
                gbVar.m();
                gbVar.T1 = false;
                File file = gbVar.G1.O0;
                if (file != null) {
                    file.delete();
                    gbVar.G1.O0 = null;
                }
                gbVar.W(gbVar.G1, true);
                CharSequence[] charSequenceArr = {gbVar.Y0.getText()};
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i13).storyEntitiesAllowed() ? MediaDataController.getInstance(i13).getEntities(new CharSequence[]{gbVar.G1.C0}, true) : new ArrayList<>();
                o7 o7Var = gbVar.G1;
                o7Var.k = (TextUtils.equals(o7Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                gbVar.G1.C0 = new SpannableString(gbVar.Y0.getText());
                gbVar.z();
                gbVar.y();
                o7 o7Var2 = gbVar.G1;
                gbVar.K1 = (o7Var2 == null || !o7Var2.K) ? 0 : 1;
                gbVar.G1 = (o7) gbVar.D1.get(i12);
                gbVar.O(0, 1);
                gbVar.N(0, 1);
                gbVar.Z0.b.U2.N(false);
                gbVar.Y0.setText(gbVar.G1.C0);
                break;
            case 15:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                break;
            case 16:
                MessagesController.getInstance(i12).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 17:
                ((q4) ((org.telegram.ui.h) obj).b).V(i12, true);
                break;
            case 18:
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
                                    j1Var.I1(s1Var, e0Var.i);
                                }
                            }
                        }
                    }
                    s1Var.r7 = -1;
                    s1Var.a3();
                    break;
                }
                break;
            case 19:
                ((yd) obj).f.c(i12);
                break;
            case 20:
                ((si) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 21:
                tn tnVar = ((qi) obj).g;
                if (tnVar.sb == i12) {
                    tnVar.Ma();
                    break;
                }
                break;
            case 22:
                tn tnVar2 = ((ri) obj).g;
                if (tnVar2.sb == i12) {
                    tnVar2.Ma();
                    break;
                }
                break;
            case 23:
                tn tnVar3 = ((qi) obj).g;
                if (tnVar3.sb == i12) {
                    tnVar3.Ma();
                    break;
                }
                break;
            case 24:
                tn tnVar4 = ((ri) obj).g;
                if (tnVar4.sb == i12) {
                    tnVar4.Ma();
                    break;
                }
                break;
            case 25:
                tn tnVar5 = ((ri) obj).g;
                if (tnVar5.sb == i12) {
                    tnVar5.Ma();
                    break;
                }
                break;
            case 26:
                tn tnVar6 = ((km) obj).F0;
                tnVar6.v0.h1(i12, tnVar6.u4);
                break;
            case 27:
                i10 = ((org.telegram.ui.ActionBar.o2) ((fn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i12, true);
                break;
            case 28:
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w1((MessagesStorage.BooleanCallback) obj, r6), 250L);
                break;
            default:
                y80 y80Var2 = (y80) obj;
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
                y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
