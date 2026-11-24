// default package

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l63 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l63(vx7 vx7Var, ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        this.a = (byte) 1;
        this.c = vx7Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0297  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.SecureValueType secureValueType;
        boolean z;
        int size;
        int i;
        int i2;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 3;
        final boolean z2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                dataSettingsActivity.getClass();
                if (!TextUtils.equals(gba.e0, str)) {
                    if (z2) {
                        gba.e0 = str;
                        gba.x();
                        gba.a = false;
                        dataSettingsActivity.r0(dataSettingsActivity.n);
                        fl5.z().e(new i63(dataSettingsActivity, b2));
                        alertDialog$Builder.a.M0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String M0 = k96.M0(2131751589, null);
                        hd hdVar = alertDialog$Builder2.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745647, null);
                        alertDialog$Builder2.j(k96.M0(2131746552, null), new lt2(dataSettingsActivity, str, alertDialog$Builder, b3));
                        ug8.y(null, 2131753753, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 1:
                final vx7 vx7Var = (vx7) obj3;
                final ArrayList arrayList = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (0; i2 < size2; i2 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(i2);
                        i2 = (vx7Var.k1(tL_secureRequiredType, false) == null && size2 != 1) ? i2 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList != null && !arrayList.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vx7Var.getParentActivity());
                                alertDialog$Builder3.j(k96.M0(2131752577, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                hd hdVar2 = alertDialog$Builder3.a;
                                if (!z) {
                                    hdVar2.S = k96.M0(2131747372, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    hdVar2.S = k96.M0(2131747409, null);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                size = arrayList.size();
                                for (i = 0; i < size; i++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList2.add(k96.M0(2131747422, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList2.add(k96.M0(2131747421, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList2.add(k96.M0(2131747424, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList2.add(k96.M0(2131747427, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList2.add(k96.M0(2131747429, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList2.add(k96.M0(2131747431, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList2.add(k96.M0(2131747433, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList2.add(k96.M0(2131747417, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList2.add(k96.M0(2131747419, null));
                                    }
                                }
                                alertDialog$Builder3.e((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: sw7
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                        ArrayList arrayList3 = arrayList;
                                        vx7.this.G1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                                    }
                                });
                                vx7Var.showDialog(hdVar2);
                                break;
                            }
                        } else {
                            boolean z3 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z3 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && vx7Var.k1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vx7Var.getParentActivity());
                                alertDialog$Builder4.j(k96.M0(2131747638, null), new ch((Object) vx7Var, (Object) tL_secureRequiredType2, z2, (byte) 11));
                                alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                                String M02 = k96.M0(R.string.AppName, null);
                                hd hdVar3 = alertDialog$Builder4.a;
                                hdVar3.S = M02;
                                hdVar3.U = k96.M0(z3 ? 2131747392 : 2131747395, null);
                                vx7Var.showDialog(hdVar3);
                                break;
                            }
                        }
                        vx7Var.G1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(vx7Var.getParentActivity());
                    alertDialog$Builder32.j(k96.M0(2131752577, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    hd hdVar22 = alertDialog$Builder32.a;
                    if (!z) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    size = arrayList.size();
                    while (i < size) {
                    }
                    alertDialog$Builder32.e((CharSequence[]) arrayList22.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: sw7
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            ArrayList arrayList3 = arrayList;
                            vx7.this.G1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                        }
                    });
                    vx7Var.showDialog(hdVar22);
                }
                vx7Var.G1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                break;
            case 2:
                ((p) obj3).q0((m21) obj2, z2, (TLRPC.Message[]) obj);
                break;
            case 3:
                ((p) obj3).s0((m21) obj2, z2, (TLRPC.Message) obj);
                break;
            case 4:
                s28 s28Var = (s28) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(storyItem);
                y28 y28Var = s28Var.x;
                g2b M1 = na7.q1(y28Var.s2).M1();
                long j = y28Var.r1;
                boolean z4 = this.b;
                M1.r0(j, arrayList3, z4, new gv1(s28Var, storyItem, z4, (f53) obj));
                s28 s28Var2 = y28Var.j1;
                if (s28Var2 != null) {
                    s28Var2.a();
                    break;
                }
                break;
            case 5:
                jh8 jh8Var = (jh8) obj3;
                d dVar = (d) obj2;
                fi8 fi8Var = (fi8) obj;
                if (dVar instanceof mu1) {
                    mu1 mu1Var = (mu1) dVar;
                    mu1Var.F5(true);
                    x31 x31Var = mu1Var.Y1;
                    if (x31Var != null) {
                        x31Var.a(true);
                    }
                }
                d Q = LaunchActivity.Q();
                int i3 = 0;
                while (i3 < 2) {
                    d dVar2 = i3 == 0 ? dVar : Q;
                    if (dVar2 != null && dVar2.getLastStoryViewer() != null) {
                        m8b lastStoryViewer = dVar2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.v0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        zf0 zf0Var = lastStoryViewer.w0;
                        if (zf0Var != null) {
                            zf0Var.dismiss();
                        }
                        y28 w = lastStoryViewer.w();
                        if (w != null) {
                            t09 t09Var = w.V1;
                            if (t09Var != null && t09Var.getReactionsWindow() != null) {
                                w.V1.getReactionsWindow().d();
                            }
                            w18 w18Var = w.P2;
                            if (w18Var != null) {
                                w18Var.dismiss();
                            }
                            w.G0();
                        }
                    }
                    if (dVar2 != null && dVar2.getVisibleDialog() != null) {
                        dVar2.getVisibleDialog().dismiss();
                    }
                    i3++;
                }
                if (z2 || jh8Var.z1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(fi8Var.a));
                    if (dVar instanceof qmb) {
                        ag0 ag0Var = new ag0();
                        ag0Var.a = true;
                        dVar.showAsSheet(premiumPreviewFragment, ag0Var);
                    } else if (dVar != null) {
                        dVar.presentFragment(premiumPreviewFragment);
                    } else {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.n0(dVar, jh8Var.D1, PremiumPreviewFragment.o0(fi8Var.a), null);
                }
                jh8Var.dismiss();
                break;
            default:
                eya eyaVar = (eya) obj3;
                wjb wjbVar = (wjb) obj;
                if (((TLRPC.User) obj2).premium) {
                    if (eyaVar.m1) {
                        eyaVar.dismiss();
                        nh3 nh3Var = eyaVar.o1;
                        if (nh3Var != null) {
                            nh3Var.a(false);
                            break;
                        }
                    } else {
                        g2b M12 = na7.q1(eyaVar.a).M1();
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = M12.B;
                        if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(eyaVar.a).getCurrentTime() > tL_storiesStealthMode.cooldown_until_date) {
                            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                            tL_stories_activateStealthMode.future = true;
                            tL_stories_activateStealthMode.past = true;
                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                            tL_storiesStealthMode2.flags |= 3;
                            int currentTime = ConnectionsManager.getInstance(eyaVar.a).getCurrentTime();
                            vr2 vr2Var = na7.q1(eyaVar.a).k4.e3;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            tL_storiesStealthMode2.cooldown_until_date = currentTime + ((int) vr2Var.g(timeUnit));
                            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(eyaVar.a).getCurrentTime() + ((int) na7.q1(eyaVar.a).k4.d3.g(timeUnit));
                            M12.h0(tL_storiesStealthMode2);
                            ConnectionsManager.getInstance(eyaVar.a).sendRequest(tL_stories_activateStealthMode, new ce2((byte) 8));
                            try {
                                eyaVar.b.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            eyaVar.dismiss();
                            if (!z2) {
                                eya.D0();
                            }
                            nh3 nh3Var2 = eyaVar.o1;
                            if (nh3Var2 != null) {
                                nh3Var2.a(true);
                                break;
                            }
                        } else if (eyaVar.m1) {
                            eyaVar.dismiss();
                            nh3 nh3Var3 = eyaVar.o1;
                            if (nh3Var3 != null) {
                                nh3Var3.a(false);
                                break;
                            }
                        } else {
                            new u21(eyaVar.c, wjbVar).t(gl.T2(k96.M0(2131744647, null)), null).k(true);
                            break;
                        }
                    }
                } else {
                    eyaVar.dismiss();
                    d Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        Q2.showDialog(new jh8(Q2, 14, false));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l63(eya eyaVar, TLRPC.User user, int i, wjb wjbVar) {
        this.a = (byte) 6;
        this.c = eyaVar;
        this.d = user;
        this.b = i;
        this.e = wjbVar;
    }

    public /* synthetic */ l63(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
