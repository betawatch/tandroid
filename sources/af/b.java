package af;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import cg.f1;
import cg.f2;
import d4.t;
import dg.j;
import dg.q3;
import gg.v1;
import j3.c0;
import j3.f0;
import java.util.ArrayList;
import java.util.Collections;
import kh.a2;
import lh.q;
import lh.t7;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.e0;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.l1;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.u1;
import org.telegram.ui.Components.uf;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fe;
import org.telegram.ui.ft0;
import org.telegram.ui.gs0;
import org.telegram.ui.h;
import org.telegram.ui.jn;
import org.telegram.ui.pm;
import org.telegram.ui.s4;
import org.telegram.ui.vi;
import org.telegram.ui.wi;
import org.telegram.ui.xi;
import org.telegram.ui.xn;
import ph.f3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        l3.d dVar;
        int i10;
        CharSequence charSequence;
        int i11 = this.a;
        Object[] objArr = 0;
        final int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                d2[] d2VarArr = (d2[]) obj;
                d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    try {
                        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: af.c
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        d2VarArr[0].show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                ((ah.b) obj).v0(i12, 0, null);
                break;
            case 2:
                j jVar = (j) obj;
                jVar.I = i12;
                jVar.H = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.N;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.M = duration;
                duration.setInterpolator(nr.f);
                jVar.M.addUpdateListener(new dg.f(jVar, 5));
                jVar.M.addListener(new dg.g(jVar, r5));
                jVar.M.start();
                break;
            case 3:
                ft0 ft0Var = (ft0) obj;
                f2 f2Var = ft0Var.H1;
                ft0Var.s0(f2Var, null);
                f1.e(i12).j(f2Var.c);
                break;
            case 4:
                q3 q3Var = (q3) obj;
                q3Var.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                q3Var.h();
                break;
            case 5:
                e90 e90Var = ((v1) obj).e;
                try {
                    if (e90Var.getLayout().getLineForOffset(i12) == 0) {
                        e90Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 6:
                j3.d dVar2 = ((j3.c) obj).b;
                if (i12 != -3 && i12 != -2) {
                    if (i12 == -1) {
                        c0 c0Var = dVar2.c;
                        if (c0Var != null) {
                            f0 f0Var = c0Var.a;
                            boolean j10 = f0Var.j();
                            f0Var.g0(-1, j10 ? 2 : 1, j10);
                        }
                        dVar2.a();
                        break;
                    } else if (i12 == 1) {
                        dVar2.c(1);
                        c0 c0Var2 = dVar2.c;
                        if (c0Var2 != null) {
                            f0 f0Var2 = c0Var2.a;
                            f0Var2.g0(1, 1, f0Var2.j());
                            break;
                        }
                    } else {
                        e2.c.q(i12, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i12 != -2 && ((dVar = dVar2.d) == null || dVar.a != 1)) {
                    dVar2.c(3);
                    break;
                } else {
                    c0 c0Var3 = dVar2.c;
                    if (c0Var3 != null) {
                        f0 f0Var3 = c0Var3.a;
                        boolean j11 = f0Var3.j();
                        f0Var3.g0(0, j11 ? 2 : 1, j11);
                    }
                    dVar2.c(2);
                    break;
                }
                break;
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((e5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 8:
                g.s(((q) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            case 9:
                ConnectionsManager.getInstance(((t7) obj).a).cancelRequest(i12, true);
                break;
            case 10:
                mg.f fVar = (mg.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i12 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused3) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i12 - 100);
                    AndroidUtilities.runOnUIThread(new b(fVar, max, 10), max);
                    break;
                }
                break;
            case 11:
                t6 t6Var = (t6) obj;
                ArrayList arrayList = t6Var.g;
                t6Var.v(arrayList);
                t tVar = t6Var.J;
                Collections.sort(arrayList, tVar);
                ArrayList arrayList2 = t6Var.h;
                t6Var.v(arrayList2);
                Collections.sort(arrayList2, tVar);
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                break;
            case 12:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                break;
            case 13:
                MessagesController.getInstance(i12).loadFullChat(((TLRPC.Chat) obj).id, 0, true);
                break;
            case 14:
                ((s4) ((h) obj).b).V(i12, true);
                break;
            case 15:
                t1 t1Var = (t1) obj;
                int i13 = t1Var.s7;
                if (i12 == i13) {
                    e0 e0Var = (e0) t1Var.l7.get(i13);
                    if (e0Var != null) {
                        z zVar = e0Var.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!t1Var.v7.scheduled) {
                            if (e0Var.j != null) {
                                t1Var.k();
                            } else if (e0Var.i != null) {
                                t1Var.k();
                                k1 k1Var = t1Var.Gc;
                                if (k1Var != null) {
                                    k1Var.J1(t1Var, e0Var.i);
                                }
                            }
                        }
                    }
                    t1Var.s7 = -1;
                    t1Var.a3();
                    break;
                }
                break;
            case 16:
                ((fe) obj).f.c(i12);
                break;
            case 17:
                ((xi) obj).a.j(this.b, 0, true, 0, true, 0);
                break;
            case 18:
                xn xnVar = ((vi) obj).g;
                if (xnVar.tb == i12) {
                    xnVar.Ma();
                    break;
                }
                break;
            case 19:
                xn xnVar2 = ((wi) obj).g;
                if (xnVar2.tb == i12) {
                    xnVar2.Ma();
                    break;
                }
                break;
            case 20:
                xn xnVar3 = ((vi) obj).g;
                if (xnVar3.tb == i12) {
                    xnVar3.Ma();
                    break;
                }
                break;
            case 21:
                xn xnVar4 = ((wi) obj).g;
                if (xnVar4.tb == i12) {
                    xnVar4.Ma();
                    break;
                }
                break;
            case 22:
                xn xnVar5 = ((wi) obj).g;
                if (xnVar5.tb == i12) {
                    xnVar5.Ma();
                    break;
                }
                break;
            case 23:
                xn xnVar6 = ((pm) obj).G0;
                xnVar6.w0.h1(i12, xnVar6.v4);
                break;
            case 24:
                i10 = ((p2) ((jn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i12, true);
                break;
            case 25:
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, r6), 250L);
                break;
            case 26:
                e90 e90Var2 = (e90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i12).getPrivacyRules(11);
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
                e90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new l1(privacyRules, objArr == true ? 1 : 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                break;
            case 27:
                ((h8) obj).b(i12);
                break;
            case 28:
                bd bdVar = (bd) obj;
                f3 f3Var = bdVar.a1;
                if (bdVar.Y0 != i12) {
                    bdVar.setTimer(i12);
                    Utilities.Callback callback2 = bdVar.o1;
                    if (callback2 != null) {
                        callback2.run(Integer.valueOf(i12));
                    }
                    if (i12 == 0) {
                        charSequence = LocaleController.getString(bdVar.n1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        f3Var.h = bdVar.getMeasuredWidth();
                        f3Var.q(false);
                        f3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        f3Var.b0 = AndroidUtilities.dp(0);
                        f3Var.a0 = -AndroidUtilities.dp(1.0f);
                    } else if (i12 == Integer.MAX_VALUE) {
                        charSequence = LocaleController.getString(bdVar.n1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        f3Var.h = bdVar.getMeasuredWidth();
                        f3Var.q(false);
                        f3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        f3Var.b0 = AndroidUtilities.dp(0);
                        f3Var.a0 = -AndroidUtilities.dp(1.0f);
                    } else if (i12 > 0) {
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(bdVar.n1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i12, new Object[0]));
                        f3Var.q(true);
                        f3Var.h = f3.a(replaceTags, f3Var.getTextPaint());
                        f3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        f3Var.b0 = AndroidUtilities.dp(2);
                        f3Var.a0 = 0.0f;
                        charSequence = replaceTags;
                    }
                    f3Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), bdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (bdVar instanceof gs0 ? -1.0f : 1.0f));
                    f3Var.t(charSequence);
                    int i15 = i12 > 0 ? R.raw.fire_on : R.raw.fire_off;
                    gj0 gj0Var = new gj0(i15, AndroidUtilities.dp(34.0f), a2.j(i15, ""), AndroidUtilities.dp(34.0f));
                    gj0Var.start();
                    f3Var.k(gj0Var);
                    f3Var.v();
                    bdVar.l1 = false;
                    AndroidUtilities.cancelRunOnUIThread(bdVar.m1);
                    bdVar.invalidate();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i12 == 0) {
                    chatActivityEnterView.w2 = 0;
                }
                chatActivityEnterView.S0 = null;
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Z4 == null) {
                        ufVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.R0.setVisibility(8);
                    chatActivityEnterView.j1.removeView(chatActivityEnterView.R0);
                    if (chatActivityEnterView.C3) {
                        chatActivityEnterView.C3 = false;
                        chatActivityEnterView.R0 = null;
                    }
                }
                eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
