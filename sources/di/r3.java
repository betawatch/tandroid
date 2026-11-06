package di;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.an;
import org.telegram.ui.bk0;
import org.telegram.ui.hl0;
import org.telegram.ui.u71;
import org.telegram.ui.vs0;
import org.telegram.ui.ws;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r3(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
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
        boolean z9;
        int size;
        int i7;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        final boolean z10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                z3 z3Var = (z3) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                i4 i4Var = z3Var.x;
                y6 P1 = qp.s1(i4Var.l2).P1();
                long j3 = i4Var.k1;
                boolean z11 = this.b;
                P1.r0(j3, arrayList, z11, new d3(z3Var, storyItem, z11, (org.telegram.ui.ActionBar.f6) obj));
                z3 z3Var2 = i4Var.c1;
                if (z3Var2 != null) {
                    z3Var2.a();
                    break;
                }
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                if (!TextUtils.equals(iz.h0, str)) {
                    if (z10) {
                        iz.h0 = str;
                        iz.y();
                        iz.b = false;
                        dataSettingsActivity.s0(dataSettingsActivity.n);
                        gc.D().i(new ws(dataSettingsActivity, i12));
                        alertDialog$Builder.a.L0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String M0 = hd.M0(2131751602, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                        u1Var.R = M0;
                        u1Var.T = hd.M0(2131745840, null);
                        alertDialog$Builder2.k(hd.M0(2131746742, null), new org.telegram.ui.a7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        jg.g.w(null, 2131753756, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final bk0 bk0Var = (bk0) obj3;
                final ArrayList arrayList2 = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (0; i10 < size2; i10 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i10);
                        i10 = (bk0Var.v1(tL_secureRequiredType, false) == null && size2 != 1) ? i10 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bk0Var.getParentActivity());
                                alertDialog$Builder3.k(hd.M0(2131752589, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z9 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder3.a;
                                if (!z9) {
                                    u1Var2.R = hd.M0(2131747564, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    u1Var2.R = hd.M0(2131747601, null);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                size = arrayList2.size();
                                for (i7 = 0; i7 < size; i7++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i7)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList3.add(hd.M0(2131747614, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList3.add(hd.M0(2131747613, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList3.add(hd.M0(2131747616, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList3.add(hd.M0(2131747619, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList3.add(hd.M0(2131747621, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList3.add(hd.M0(2131747623, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList3.add(hd.M0(2131747625, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList3.add(hd.M0(2131747609, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList3.add(hd.M0(2131747611, null));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.wi0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        bk0 bk0Var2 = bk0Var;
                                        bk0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        bk0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z10);
                                    }
                                });
                                bk0Var.showDialog(u1Var2);
                                break;
                            }
                        } else {
                            boolean z12 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z12 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && bk0Var.v1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bk0Var.getParentActivity());
                                alertDialog$Builder4.k(hd.M0(2131747830, null), new ab.j(bk0Var, tL_secureRequiredType2, z10, 11));
                                alertDialog$Builder4.h(hd.M0(2131752589, null), null);
                                String M02 = hd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
                                u1Var3.R = M02;
                                u1Var3.T = hd.M0(z12 ? 2131747584 : 2131747587, null);
                                bk0Var.showDialog(u1Var3);
                                break;
                            }
                        }
                        bk0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z10);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(bk0Var.getParentActivity());
                    alertDialog$Builder32.k(hd.M0(2131752589, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z9 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    org.telegram.ui.ActionBar.u1 u1Var22 = alertDialog$Builder32.a;
                    if (!z9) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i7 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.wi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            bk0 bk0Var2 = bk0Var;
                            bk0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            bk0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z10);
                        }
                    });
                    bk0Var.showDialog(u1Var22);
                }
                bk0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z10);
                break;
            case 3:
                hl0.l0((hl0) obj3, (cc) obj2, z10, (TLRPC.Message[]) obj);
                break;
            case 4:
                hl0.d0((hl0) obj3, (cc) obj2, z10, (TLRPC.Message) obj);
                break;
            default:
                ug.w0 w0Var = (ug.w0) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                vs0 vs0Var = (vs0) obj;
                if (f2Var instanceof an) {
                    an anVar = (an) f2Var;
                    anVar.O7(true);
                    u2 u2Var = anVar.X1;
                    if (u2Var != null) {
                        u2Var.a(true);
                    }
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                int i13 = 0;
                while (i13 < 2) {
                    org.telegram.ui.ActionBar.f2 f2Var2 = i13 == 0 ? f2Var : Q;
                    if (f2Var2 != null && f2Var2.getLastStoryViewer() != null) {
                        p9 lastStoryViewer = f2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.u0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.b2 b2Var = lastStoryViewer.v0;
                        if (b2Var != null) {
                            b2Var.dismiss();
                        }
                        i4 z13 = lastStoryViewer.z();
                        if (z13 != null) {
                            ii0 ii0Var = z13.O1;
                            if (ii0Var != null && ii0Var.getReactionsWindow() != null) {
                                z13.O1.getReactionsWindow().d();
                            }
                            x2 x2Var = z13.I2;
                            if (x2Var != null) {
                                x2Var.dismiss();
                            }
                            z13.L0();
                        }
                    }
                    if (f2Var2 != null && f2Var2.getVisibleDialog() != null) {
                        f2Var2.getVisibleDialog().dismiss();
                    }
                    i13++;
                }
                if (z10 || w0Var.w1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(vs0Var.a));
                    if (f2Var instanceof u71) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                        d2Var.a = true;
                        f2Var.showAsSheet(premiumPreviewFragment, d2Var);
                    } else if (f2Var != null) {
                        f2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.p0(f2Var, w0Var.A1, PremiumPreviewFragment.q0(vs0Var.a), null);
                }
                w0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ r3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, bk0 bk0Var, boolean z9) {
        this.a = 2;
        this.c = bk0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z9;
    }
}
