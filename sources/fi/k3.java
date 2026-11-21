package fi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bn;
import org.telegram.ui.bt;
import org.telegram.ui.hk0;
import org.telegram.ui.ml0;
import org.telegram.ui.ws0;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
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
                r3 r3Var = (r3) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                z3 z3Var = r3Var.x;
                p6 R1 = mp.u1(z3Var.m2).R1();
                long j3 = z3Var.l1;
                boolean z12 = this.b;
                R1.r0(j3, arrayList, z12, new w2(r3Var, storyItem, z12, (org.telegram.ui.ActionBar.h6) obj));
                r3 r3Var2 = z3Var.d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    break;
                }
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                if (!TextUtils.equals(bz.h0, str)) {
                    if (z11) {
                        bz.h0 = str;
                        bz.y();
                        bz.b = false;
                        dataSettingsActivity.s0(dataSettingsActivity.n);
                        ec.D().i(new bt(dataSettingsActivity, i12));
                        alertDialog$Builder.a.M0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String N0 = gd.N0(2131751589, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.a;
                        t1Var.S = N0;
                        t1Var.U = gd.N0(2131745643, null);
                        alertDialog$Builder2.k(gd.N0(2131746549, null), new org.telegram.ui.z6(dataSettingsActivity, str, alertDialog$Builder, 12));
                        i5.c.y(null, 2131753753, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final hk0 hk0Var = (hk0) obj3;
                final ArrayList arrayList2 = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (0; i10 < size2; i10 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i10);
                        i10 = (hk0Var.v1(tL_secureRequiredType, false) == null && size2 != 1) ? i10 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hk0Var.getParentActivity());
                                alertDialog$Builder3.k(gd.N0(2131752577, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder3.a;
                                if (!z10) {
                                    t1Var2.S = gd.N0(2131747371, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    t1Var2.S = gd.N0(2131747408, null);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                size = arrayList2.size();
                                for (i7 = 0; i7 < size; i7++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i7)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList3.add(gd.N0(2131747421, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList3.add(gd.N0(2131747420, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList3.add(gd.N0(2131747423, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList3.add(gd.N0(2131747426, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList3.add(gd.N0(2131747428, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList3.add(gd.N0(2131747430, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList3.add(gd.N0(2131747432, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList3.add(gd.N0(2131747416, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList3.add(gd.N0(2131747418, null));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.cj0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        hk0 hk0Var2 = hk0Var;
                                        hk0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        hk0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                                    }
                                });
                                hk0Var.showDialog(t1Var2);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && hk0Var.v1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hk0Var.getParentActivity());
                                alertDialog$Builder4.k(gd.N0(2131747637, null), new ab.j(hk0Var, tL_secureRequiredType2, z11, 11));
                                alertDialog$Builder4.h(gd.N0(2131752577, null), null);
                                String N02 = gd.N0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.a;
                                t1Var3.S = N02;
                                t1Var3.U = gd.N0(z13 ? 2131747391 : 2131747394, null);
                                hk0Var.showDialog(t1Var3);
                                break;
                            }
                        }
                        hk0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(hk0Var.getParentActivity());
                    alertDialog$Builder32.k(gd.N0(2131752577, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z10 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    org.telegram.ui.ActionBar.t1 t1Var22 = alertDialog$Builder32.a;
                    if (!z10) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i7 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.cj0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            hk0 hk0Var2 = hk0Var;
                            hk0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            hk0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                        }
                    });
                    hk0Var.showDialog(t1Var22);
                }
                hk0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 3:
                ml0.l0((ml0) obj3, (gc) obj2, z11, (TLRPC.Message[]) obj);
                break;
            case 4:
                ml0.d0((ml0) obj3, (gc) obj2, z11, (TLRPC.Message) obj);
                break;
            default:
                ug.y0 y0Var = (ug.y0) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                ws0 ws0Var = (ws0) obj;
                if (g2Var instanceof bn) {
                    bn bnVar = (bn) g2Var;
                    bnVar.P7(true);
                    n2 n2Var = bnVar.Y1;
                    if (n2Var != null) {
                        n2Var.a(true);
                    }
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                int i13 = 0;
                while (i13 < 2) {
                    org.telegram.ui.ActionBar.g2 g2Var2 = i13 == 0 ? g2Var : Q;
                    if (g2Var2 != null && g2Var2.getLastStoryViewer() != null) {
                        f9 lastStoryViewer = g2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.v0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.c2 c2Var = lastStoryViewer.w0;
                        if (c2Var != null) {
                            c2Var.dismiss();
                        }
                        z3 z14 = lastStoryViewer.z();
                        if (z14 != null) {
                            xi0 xi0Var = z14.P1;
                            if (xi0Var != null && xi0Var.getReactionsWindow() != null) {
                                z14.P1.getReactionsWindow().d();
                            }
                            q2 q2Var = z14.J2;
                            if (q2Var != null) {
                                q2Var.dismiss();
                            }
                            z14.L0();
                        }
                    }
                    if (g2Var2 != null && g2Var2.getVisibleDialog() != null) {
                        g2Var2.getVisibleDialog().dismiss();
                    }
                    i13++;
                }
                if (z11 || y0Var.A1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(ws0Var.a));
                    if (g2Var instanceof x71) {
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                        e2Var.a = true;
                        g2Var.showAsSheet(premiumPreviewFragment, e2Var);
                    } else if (g2Var != null) {
                        g2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.p0(g2Var, y0Var.E1, PremiumPreviewFragment.q0(ws0Var.a), null);
                }
                y0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ k3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, hk0 hk0Var, boolean z10) {
        this.a = 2;
        this.c = hk0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
