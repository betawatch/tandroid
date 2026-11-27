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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e73 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e73(b18 b18Var, ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        this.a = (byte) 1;
        this.c = b18Var;
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
                if (!TextUtils.equals(xea.e0, str)) {
                    if (z2) {
                        xea.e0 = str;
                        xea.x();
                        xea.a = false;
                        dataSettingsActivity.r0(dataSettingsActivity.n);
                        in5.z().e(new b73(dataSettingsActivity, b2));
                        alertDialog$Builder.a.M0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String M0 = ob6.M0(2131751566, null);
                        id idVar = alertDialog$Builder2.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131745567, null);
                        alertDialog$Builder2.j(ob6.M0(2131746472, null), new fu2(dataSettingsActivity, str, alertDialog$Builder, b3));
                        ik8.y(null, 2131753749, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 1:
                final b18 b18Var = (b18) obj3;
                final ArrayList arrayList = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (0; i2 < size2; i2 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(i2);
                        i2 = (b18Var.l1(tL_secureRequiredType, false) == null && size2 != 1) ? i2 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList != null && !arrayList.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(b18Var.getParentActivity());
                                alertDialog$Builder3.j(ob6.M0(2131752570, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                id idVar2 = alertDialog$Builder3.a;
                                if (!z) {
                                    idVar2.S = ob6.M0(2131747292, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    idVar2.S = ob6.M0(2131747329, null);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                size = arrayList.size();
                                for (i = 0; i < size; i++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList.get(i)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList2.add(ob6.M0(2131747342, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList2.add(ob6.M0(2131747341, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList2.add(ob6.M0(2131747344, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList2.add(ob6.M0(2131747347, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList2.add(ob6.M0(2131747349, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList2.add(ob6.M0(2131747351, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList2.add(ob6.M0(2131747353, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList2.add(ob6.M0(2131747337, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList2.add(ob6.M0(2131747339, null));
                                    }
                                }
                                alertDialog$Builder3.e((CharSequence[]) arrayList2.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: zz7
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                        ArrayList arrayList3 = arrayList;
                                        b18.this.H1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                                    }
                                });
                                b18Var.showDialog(idVar2);
                                break;
                            }
                        } else {
                            boolean z3 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z3 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && b18Var.l1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(b18Var.getParentActivity());
                                alertDialog$Builder4.j(ob6.M0(2131747558, null), new bh((Object) b18Var, (Object) tL_secureRequiredType2, z2, (byte) 11));
                                alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
                                String M02 = ob6.M0(R.string.AppName, null);
                                id idVar3 = alertDialog$Builder4.a;
                                idVar3.S = M02;
                                idVar3.U = ob6.M0(z3 ? 2131747312 : 2131747315, null);
                                b18Var.showDialog(idVar3);
                                break;
                            }
                        }
                        b18Var.H1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(b18Var.getParentActivity());
                    alertDialog$Builder32.j(ob6.M0(2131752570, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    id idVar22 = alertDialog$Builder32.a;
                    if (!z) {
                    }
                    ArrayList arrayList22 = new ArrayList();
                    size = arrayList.size();
                    while (i < size) {
                    }
                    alertDialog$Builder32.e((CharSequence[]) arrayList22.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: zz7
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            ArrayList arrayList3 = arrayList;
                            b18.this.H1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList3.get(i3), arrayList3, z2);
                        }
                    });
                    b18Var.showDialog(idVar22);
                }
                b18Var.H1(tL_secureRequiredType2, tL_secureRequiredType, arrayList, z2);
                break;
            case 2:
                ((p) obj3).s0((v21) obj2, z2, (TLRPC.Message) obj);
                break;
            case 3:
                ((p) obj3).q0((v21) obj2, z2, (TLRPC.Message[]) obj);
                break;
            case 4:
                j68 j68Var = (j68) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(storyItem);
                o68 o68Var = j68Var.x;
                c6b O1 = uc7.s1(o68Var.m2).O1();
                long j = o68Var.l1;
                boolean z4 = this.b;
                O1.r0(j, arrayList3, z4, new wv1(j68Var, storyItem, z4, (x53) obj));
                j68 j68Var2 = o68Var.d1;
                if (j68Var2 != null) {
                    j68Var2.a();
                    break;
                }
                break;
            case 5:
                xk8 xk8Var = (xk8) obj3;
                e eVar = (e) obj2;
                sl8 sl8Var = (sl8) obj;
                if (eVar instanceof zu1) {
                    zu1 zu1Var = (zu1) eVar;
                    zu1Var.M5(true);
                    f41 f41Var = zu1Var.Y1;
                    if (f41Var != null) {
                        f41Var.a(true);
                    }
                }
                e Q = LaunchActivity.Q();
                int i3 = 0;
                while (i3 < 2) {
                    e eVar2 = i3 == 0 ? eVar : Q;
                    if (eVar2 != null && eVar2.getLastStoryViewer() != null) {
                        lcb lastStoryViewer = eVar2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.v0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        ag0 ag0Var = lastStoryViewer.w0;
                        if (ag0Var != null) {
                            ag0Var.dismiss();
                        }
                        o68 w = lastStoryViewer.w();
                        if (w != null) {
                            i49 i49Var = w.P1;
                            if (i49Var != null && i49Var.getReactionsWindow() != null) {
                                w.P1.getReactionsWindow().d();
                            }
                            n58 n58Var = w.J2;
                            if (n58Var != null) {
                                n58Var.dismiss();
                            }
                            w.G0();
                        }
                    }
                    if (eVar2 != null && eVar2.getVisibleDialog() != null) {
                        eVar2.getVisibleDialog().dismiss();
                    }
                    i3++;
                }
                if (z2 || xk8Var.z1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(sl8Var.a));
                    if (eVar instanceof pqb) {
                        bg0 bg0Var = new bg0();
                        bg0Var.a = true;
                        eVar.showAsSheet(premiumPreviewFragment, bg0Var);
                    } else if (eVar != null) {
                        eVar.presentFragment(premiumPreviewFragment);
                    } else {
                        e S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.n0(eVar, xk8Var.D1, PremiumPreviewFragment.o0(sl8Var.a), null);
                }
                xk8Var.dismiss();
                break;
            default:
                g2b g2bVar = (g2b) obj3;
                vnb vnbVar = (vnb) obj;
                if (((TLRPC.User) obj2).premium) {
                    if (g2bVar.m1) {
                        g2bVar.dismiss();
                        hi3 hi3Var = g2bVar.o1;
                        if (hi3Var != null) {
                            hi3Var.a(false);
                            break;
                        }
                    } else {
                        c6b O12 = uc7.s1(g2bVar.a).O1();
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = O12.B;
                        if (tL_storiesStealthMode == null || ConnectionsManager.getInstance(g2bVar.a).getCurrentTime() > tL_storiesStealthMode.cooldown_until_date) {
                            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                            tL_stories_activateStealthMode.future = true;
                            tL_stories_activateStealthMode.past = true;
                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                            tL_storiesStealthMode2.flags |= 3;
                            int currentTime = ConnectionsManager.getInstance(g2bVar.a).getCurrentTime();
                            os2 os2Var = uc7.s1(g2bVar.a).l4.m3;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            tL_storiesStealthMode2.cooldown_until_date = currentTime + ((int) os2Var.g(timeUnit));
                            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(g2bVar.a).getCurrentTime() + ((int) uc7.s1(g2bVar.a).l4.l3.g(timeUnit));
                            O12.h0(tL_storiesStealthMode2);
                            ConnectionsManager.getInstance(g2bVar.a).sendRequest(tL_stories_activateStealthMode, new xe2((byte) 8));
                            try {
                                g2bVar.b.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            g2bVar.dismiss();
                            if (!z2) {
                                g2b.E0();
                            }
                            hi3 hi3Var2 = g2bVar.o1;
                            if (hi3Var2 != null) {
                                hi3Var2.a(true);
                                break;
                            }
                        } else if (g2bVar.m1) {
                            g2bVar.dismiss();
                            hi3 hi3Var3 = g2bVar.o1;
                            if (hi3Var3 != null) {
                                hi3Var3.a(false);
                                break;
                            }
                        } else {
                            new d31(g2bVar.c, vnbVar).t(hl.S2(ob6.M0(2131744541, null)), null).k(true);
                            break;
                        }
                    }
                } else {
                    g2bVar.dismiss();
                    e Q2 = LaunchActivity.Q();
                    if (Q2 != null) {
                        Q2.showDialog(new xk8(Q2, 14, false));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e73(g2b g2bVar, TLRPC.User user, int i, vnb vnbVar) {
        this.a = (byte) 6;
        this.c = g2bVar;
        this.d = user;
        this.b = i;
        this.e = vnbVar;
    }

    public /* synthetic */ e73(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
