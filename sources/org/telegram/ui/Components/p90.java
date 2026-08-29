package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd1;
import org.telegram.ui.fd1;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p90(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                y90 y90Var = (y90) obj;
                if (!z10) {
                    y90Var.getClass();
                    break;
                } else {
                    y90Var.C.setVisibility(8);
                    break;
                }
            case 1:
                ((tm0) obj).C.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 2:
                qu0 qu0Var = (qu0) obj;
                if (!z10) {
                    qu0Var.i0.setVisibility(8);
                    break;
                } else {
                    qu0Var.getClass();
                    break;
                }
            case 3:
                gr0 gr0Var = (gr0) obj;
                if (!z10) {
                    gr0Var.Q.m0.setVisibility(0);
                    break;
                } else {
                    gr0Var.getClass();
                    break;
                }
            case 4:
                kr0 kr0Var = (kr0) obj;
                if (!z10) {
                    kr0Var.D.m0.setVisibility(0);
                    break;
                } else {
                    kr0Var.getClass();
                    break;
                }
            case 5:
                hv0 hv0Var = (hv0) obj;
                ArrayList arrayList = hv0Var.r;
                gv0 gv0Var = hv0Var.n;
                if (gv0Var != null) {
                    gv0Var.G(hv0Var.f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((gv0) arrayList.get(i12)).G(hv0Var.f, z10);
                    i12++;
                }
                break;
            case 6:
                iv0 iv0Var = (iv0) obj;
                ArrayList arrayList2 = iv0Var.r;
                gv0 gv0Var2 = iv0Var.n;
                if (gv0Var2 != null) {
                    gv0Var2.G(iv0Var.u0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((gv0) arrayList2.get(i12)).G(iv0Var.u0, z10);
                    i12++;
                }
                break;
            case 7:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 8:
                ((k51) obj).P(z10);
                break;
            case 9:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) obj;
                nzVar.Z(nzVar.L, z10);
                break;
            case 10:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) obj;
                if (!z10) {
                    fg0Var.S.setVisibility(8);
                    break;
                }
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.R0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.P8;
                    photoViewer.getClass();
                    break;
                }
            case 12:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 13:
                ye.d.s(((org.telegram.ui.vz0) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 14:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj;
                org.telegram.ui.a21 a21Var = z11Var.O;
                ep epVar = z11Var.b;
                if (epVar != null && epVar.d != null) {
                    z11Var.a(z10, true);
                    if (z11Var.G != null) {
                        z11Var.M = true;
                        a21Var.G = z10;
                        a21Var.d0(a21Var.K, a21Var.F, false);
                    }
                    if (epVar.d != null) {
                        while (i12 < epVar.d.size()) {
                            ((fp) epVar.d.get(i12)).c = z10 ? 1 : 0;
                            ((fp) epVar.d.get(i12)).e = a21Var.b0(((fp) epVar.d.get(i12)).a, z10);
                            i12++;
                        }
                        a21Var.r = null;
                        epVar.l();
                        break;
                    }
                }
                break;
            case 15:
                fd1 fd1Var = (fd1) obj;
                AndroidUtilities.runOnUIThread(new wc1(fd1Var, i11));
                org.telegram.ui.Cells.s1 s1Var = fd1Var.G;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.s1 s1Var2 = fd1Var.G;
                        int O2 = s1Var2.O2(fd1Var.K);
                        dd1 dd1Var = fd1Var.E;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.N8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && dd1Var != null && (checkBoxBaseArr = dd1Var.N8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = fd1Var.G;
                    s1Var3.G7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.pm pmVar = fd1Var.Y;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    fd1Var.Y = null;
                    break;
                }
                break;
            default:
                ((qh.o0) obj).f(z10, false);
                break;
        }
    }
}
