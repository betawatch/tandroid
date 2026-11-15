package fi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;
import org.telegram.ui.ek0;
import org.telegram.ui.jl0;
import org.telegram.ui.ss0;
import org.telegram.ui.t71;
import org.telegram.ui.zs;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.SecureValueType secureValueType;
        boolean z10;
        int size;
        int i7;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        final boolean z11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                t3 t3Var = (t3) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                b4 b4Var = t3Var.x;
                s6 P1 = np.s1(b4Var.m2).P1();
                long j3 = b4Var.l1;
                boolean z12 = this.b;
                P1.r0(j3, arrayList, z12, new y2(t3Var, storyItem, z12, (org.telegram.ui.ActionBar.e6) obj));
                t3 t3Var2 = b4Var.d1;
                if (t3Var2 != null) {
                    t3Var2.a();
                    break;
                }
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                if (!TextUtils.equals(gz.h0, str)) {
                    if (z11) {
                        gz.h0 = str;
                        gz.y();
                        gz.b = false;
                        dataSettingsActivity.s0(dataSettingsActivity.n);
                        fc.D().i(new zs(dataSettingsActivity, i12));
                        alertDialog$Builder.a.M0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String M0 = hd.M0(2131751601, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.a;
                        t1Var.S = M0;
                        t1Var.U = hd.M0(2131745839, null);
                        alertDialog$Builder2.k(hd.M0(2131746743, null), new org.telegram.ui.a7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        i5.c.x(null, 2131753756, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final ek0 ek0Var = (ek0) obj3;
                final ArrayList arrayList2 = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (0; i10 < size2; i10 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i10);
                        i10 = (ek0Var.v1(tL_secureRequiredType, false) == null && size2 != 1) ? i10 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ek0Var.getParentActivity());
                                alertDialog$Builder3.k(hd.M0(2131752589, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                                if (!z10) {
                                    t1Var2.S = hd.M0(2131747565, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    t1Var2.S = hd.M0(2131747602, null);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                size = arrayList2.size();
                                for (i7 = 0; i7 < size; i7++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i7)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList3.add(hd.M0(2131747615, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList3.add(hd.M0(2131747614, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList3.add(hd.M0(2131747617, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList3.add(hd.M0(2131747620, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList3.add(hd.M0(2131747622, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList3.add(hd.M0(2131747624, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList3.add(hd.M0(2131747626, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList3.add(hd.M0(2131747610, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList3.add(hd.M0(2131747612, null));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.zi0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        ek0 ek0Var2 = ek0Var;
                                        ek0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        ek0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                                    }
                                });
                                ek0Var.showDialog(t1Var2);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && ek0Var.v1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ek0Var.getParentActivity());
                                alertDialog$Builder4.k(hd.M0(2131747831, null), new ab.j(ek0Var, tL_secureRequiredType2, z11, 11));
                                alertDialog$Builder4.h(hd.M0(2131752589, null), null);
                                String M02 = hd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.a;
                                t1Var3.S = M02;
                                t1Var3.U = hd.M0(z13 ? 2131747585 : 2131747588, null);
                                ek0Var.showDialog(t1Var3);
                                break;
                            }
                        }
                        ek0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(ek0Var.getParentActivity());
                    alertDialog$Builder32.k(hd.M0(2131752589, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z10 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    org.telegram.ui.ActionBar.t1 t1Var22 = alertDialog$Builder32.a;
                    if (!z10) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i7 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.zi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            ek0 ek0Var2 = ek0Var;
                            ek0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            ek0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                        }
                    });
                    ek0Var.showDialog(t1Var22);
                }
                ek0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 3:
                jl0.l0((jl0) obj3, (xb) obj2, z11, (TLRPC.Message[]) obj);
                break;
            case 4:
                jl0.d0((jl0) obj3, (xb) obj2, z11, (TLRPC.Message) obj);
                break;
            default:
                ug.x0 x0Var = (ug.x0) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                ss0 ss0Var = (ss0) obj;
                if (e2Var instanceof an) {
                    an anVar = (an) e2Var;
                    anVar.P7(true);
                    p2 p2Var = anVar.Y1;
                    if (p2Var != null) {
                        p2Var.a(true);
                    }
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                int i13 = 0;
                while (i13 < 2) {
                    org.telegram.ui.ActionBar.e2 e2Var2 = i13 == 0 ? e2Var : Q;
                    if (e2Var2 != null && e2Var2.getLastStoryViewer() != null) {
                        i9 lastStoryViewer = e2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.v0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.a2 a2Var = lastStoryViewer.w0;
                        if (a2Var != null) {
                            a2Var.dismiss();
                        }
                        b4 z14 = lastStoryViewer.z();
                        if (z14 != null) {
                            mi0 mi0Var = z14.P1;
                            if (mi0Var != null && mi0Var.getReactionsWindow() != null) {
                                z14.P1.getReactionsWindow().d();
                            }
                            s2 s2Var = z14.J2;
                            if (s2Var != null) {
                                s2Var.dismiss();
                            }
                            z14.L0();
                        }
                    }
                    if (e2Var2 != null && e2Var2.getVisibleDialog() != null) {
                        e2Var2.getVisibleDialog().dismiss();
                    }
                    i13++;
                }
                if (z11 || x0Var.A1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(ss0Var.a));
                    if (e2Var instanceof t71) {
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                        c2Var.a = true;
                        e2Var.showAsSheet(premiumPreviewFragment, c2Var);
                    } else if (e2Var != null) {
                        e2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.p0(e2Var, x0Var.E1, PremiumPreviewFragment.q0(ss0Var.a), null);
                }
                x0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ m3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, ek0 ek0Var, boolean z10) {
        this.a = 2;
        this.c = ek0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
