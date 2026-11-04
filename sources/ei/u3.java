package ei;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.zb;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.li0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.dl0;
import org.telegram.ui.l71;
import org.telegram.ui.ls0;
import org.telegram.ui.us;
import org.telegram.ui.wm;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u3(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.a = i3;
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
        int i3;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        final boolean z11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                b4 b4Var = (b4) obj3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                j4 j4Var = b4Var.x;
                z6 P1 = hp.s1(j4Var.m2).P1();
                long j10 = j4Var.l1;
                boolean z12 = this.b;
                P1.r0(j10, arrayList, z12, new g3(b4Var, storyItem, z12, (org.telegram.ui.ActionBar.e6) obj));
                b4 b4Var2 = j4Var.d1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                String str = (String) obj2;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj;
                if (!TextUtils.equals(az.h0, str)) {
                    if (z11) {
                        az.h0 = str;
                        az.y();
                        az.b = false;
                        dataSettingsActivity.s0(dataSettingsActivity.n);
                        zb.D().i(new us(dataSettingsActivity, i12));
                        alertDialog$Builder.a.O0.run();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        String M0 = bd.M0(2131751602, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.a;
                        s1Var.S = M0;
                        s1Var.U = bd.M0(2131745849, null);
                        alertDialog$Builder2.k(bd.M0(2131746751, null), new org.telegram.ui.b7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        k2.p1.v(null, 2131753756, alertDialog$Builder2, null);
                        break;
                    }
                }
                break;
            case 2:
                final yj0 yj0Var = (yj0) obj3;
                final ArrayList arrayList2 = (ArrayList) obj2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) obj;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (0; i10 < size2; i10 + 1) {
                        tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i10);
                        i10 = (yj0Var.v1(tL_secureRequiredType, false) == null && size2 != 1) ? i10 + 1 : 0;
                        secureValueType = tL_secureRequiredType2.type;
                        if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                            if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yj0Var.getParentActivity());
                                alertDialog$Builder3.k(bd.M0(2131752589, null), null);
                                TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                                z10 = secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder3.a;
                                if (!z10) {
                                    s1Var2.S = bd.M0(2131747573, null);
                                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                    s1Var2.S = bd.M0(2131747610, null);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                size = arrayList2.size();
                                for (i3 = 0; i3 < size; i3++) {
                                    TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i3)).type;
                                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        arrayList3.add(bd.M0(2131747623, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                                        arrayList3.add(bd.M0(2131747622, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        arrayList3.add(bd.M0(2131747625, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        arrayList3.add(bd.M0(2131747628, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                        arrayList3.add(bd.M0(2131747630, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                        arrayList3.add(bd.M0(2131747632, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                        arrayList3.add(bd.M0(2131747634, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                        arrayList3.add(bd.M0(2131747618, null));
                                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                        arrayList3.add(bd.M0(2131747620, null));
                                    }
                                }
                                alertDialog$Builder3.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ti0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        yj0 yj0Var2 = yj0Var;
                                        yj0Var2.getClass();
                                        ArrayList arrayList4 = arrayList2;
                                        yj0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                                    }
                                });
                                yj0Var.showDialog(s1Var2);
                                break;
                            }
                        } else {
                            boolean z13 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                            if ((z13 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && yj0Var.v1(tL_secureRequiredType2, false) != null) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(yj0Var.getParentActivity());
                                alertDialog$Builder4.k(bd.M0(2131747839, null), new ci.l3(yj0Var, tL_secureRequiredType2, z11, 10));
                                alertDialog$Builder4.h(bd.M0(2131752589, null), null);
                                String M02 = bd.M0(R.string.AppName, null);
                                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder4.a;
                                s1Var3.S = M02;
                                s1Var3.U = bd.M0(z13 ? 2131747593 : 2131747596, null);
                                yj0Var.showDialog(s1Var3);
                                break;
                            }
                        }
                        yj0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                        break;
                    }
                }
                tL_secureRequiredType = null;
                secureValueType = tL_secureRequiredType2.type;
                if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                }
                if (tL_secureRequiredType == null) {
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(yj0Var.getParentActivity());
                    alertDialog$Builder32.k(bd.M0(2131752589, null), null);
                    TLRPC.SecureValueType secureValueType22 = tL_secureRequiredType2.type;
                    z10 = secureValueType22 instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    org.telegram.ui.ActionBar.s1 s1Var22 = alertDialog$Builder32.a;
                    if (!z10) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    size = arrayList2.size();
                    while (i3 < size) {
                    }
                    alertDialog$Builder32.f((CharSequence[]) arrayList32.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ti0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            yj0 yj0Var2 = yj0Var;
                            yj0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            yj0Var2.I1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z11);
                        }
                    });
                    yj0Var.showDialog(s1Var22);
                }
                yj0Var.I1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z11);
                break;
            case 3:
                dl0.l0((dl0) obj3, (ac) obj2, z11, (TLRPC.Message[]) obj);
                break;
            case 4:
                dl0.d0((dl0) obj3, (ac) obj2, z11, (TLRPC.Message) obj);
                break;
            default:
                vg.v0 v0Var = (vg.v0) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                ls0 ls0Var = (ls0) obj;
                if (d2Var instanceof wm) {
                    wm wmVar = (wm) d2Var;
                    wmVar.O7(true);
                    x2 x2Var = wmVar.Y1;
                    if (x2Var != null) {
                        x2Var.a(true);
                    }
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                int i13 = 0;
                while (i13 < 2) {
                    org.telegram.ui.ActionBar.d2 d2Var2 = i13 == 0 ? d2Var : Q;
                    if (d2Var2 != null && d2Var2.getLastStoryViewer() != null) {
                        r9 lastStoryViewer = d2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.v0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.z1 z1Var = lastStoryViewer.w0;
                        if (z1Var != null) {
                            z1Var.dismiss();
                        }
                        j4 H = lastStoryViewer.H();
                        if (H != null) {
                            li0 li0Var = H.P1;
                            if (li0Var != null && li0Var.getReactionsWindow() != null) {
                                H.P1.getReactionsWindow().d();
                            }
                            a3 a3Var = H.J2;
                            if (a3Var != null) {
                                a3Var.dismiss();
                            }
                            H.L0();
                        }
                    }
                    if (d2Var2 != null && d2Var2.getVisibleDialog() != null) {
                        d2Var2.getVisibleDialog().dismiss();
                    }
                    i13++;
                }
                if (z11 || v0Var.x1) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(ls0Var.a));
                    if (d2Var instanceof l71) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                        b2Var.a = true;
                        d2Var.showAsSheet(premiumPreviewFragment, b2Var);
                    } else if (d2Var != null) {
                        d2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.p0(d2Var, v0Var.B1, PremiumPreviewFragment.q0(ls0Var.a), null);
                }
                v0Var.dismiss();
                break;
        }
    }

    public /* synthetic */ u3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, yj0 yj0Var, boolean z10) {
        this.a = 2;
        this.c = yj0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.b = z10;
    }
}
