package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd1;
import org.telegram.ui.dd1;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a50(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i9 = this.a;
        int i10 = 0;
        int i11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i9) {
            case 0:
                f50 f50Var = ((e50) obj).D0;
                if (!f50Var.c0) {
                    try {
                        f50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(f50Var.c.getParentActivity());
                    f50Var.W = z10 ? f50Var.b0 : 0L;
                    f50Var.V = System.currentTimeMillis();
                    f50Var.a0 = true;
                    f50Var.r();
                    f50Var.invalidate();
                    NotificationCenter.getInstance(f50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(f50Var.M), Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                k90 k90Var = (k90) obj;
                if (!z10) {
                    k90Var.getClass();
                    break;
                } else {
                    k90Var.C.setVisibility(8);
                    break;
                }
            case 2:
                ((gm0) obj).C.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                eu0 eu0Var = (eu0) obj;
                if (!z10) {
                    eu0Var.i0.setVisibility(8);
                    break;
                } else {
                    eu0Var.getClass();
                    break;
                }
            case 4:
                vq0 vq0Var = (vq0) obj;
                if (!z10) {
                    vq0Var.Q.m0.setVisibility(0);
                    break;
                } else {
                    vq0Var.getClass();
                    break;
                }
            case 5:
                zq0 zq0Var = (zq0) obj;
                if (!z10) {
                    zq0Var.D.m0.setVisibility(0);
                    break;
                } else {
                    zq0Var.getClass();
                    break;
                }
            case 6:
                xu0 xu0Var = (xu0) obj;
                ArrayList arrayList = xu0Var.r;
                wu0 wu0Var = xu0Var.n;
                if (wu0Var != null) {
                    wu0Var.G(xu0Var.f, z10);
                }
                while (i10 < arrayList.size()) {
                    ((wu0) arrayList.get(i10)).G(xu0Var.f, z10);
                    i10++;
                }
                break;
            case 7:
                yu0 yu0Var = (yu0) obj;
                ArrayList arrayList2 = yu0Var.r;
                wu0 wu0Var2 = yu0Var.n;
                if (wu0Var2 != null) {
                    wu0Var2.G(yu0Var.u0, z10);
                }
                while (i10 < arrayList2.size()) {
                    ((wu0) arrayList2.get(i10)).G(yu0Var.u0, z10);
                    i10++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((z41) obj).P(z10);
                break;
            case 10:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) obj;
                lzVar.Y(lzVar.L, z10);
                break;
            case 11:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) obj;
                if (!z10) {
                    fg0Var.S.setVisibility(8);
                    break;
                }
                break;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.R0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.P8;
                    photoViewer.getClass();
                    break;
                }
            case 13:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 14:
                ve.e.s(((org.telegram.ui.vz0) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 15:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) obj;
                org.telegram.ui.z11 z11Var = y11Var.O;
                ap apVar = y11Var.b;
                if (apVar != null && apVar.d != null) {
                    y11Var.a(z10, true);
                    if (y11Var.G != null) {
                        y11Var.M = true;
                        z11Var.G = z10;
                        z11Var.c0(z11Var.K, z11Var.F, false);
                    }
                    if (apVar.d != null) {
                        while (i10 < apVar.d.size()) {
                            ((bp) apVar.d.get(i10)).c = z10 ? 1 : 0;
                            ((bp) apVar.d.get(i10)).e = z11Var.a0(((bp) apVar.d.get(i10)).a, z10);
                            i10++;
                        }
                        z11Var.r = null;
                        apVar.l();
                        break;
                    }
                }
                break;
            default:
                dd1 dd1Var = (dd1) obj;
                AndroidUtilities.runOnUIThread(new uc1(dd1Var, i11));
                org.telegram.ui.Cells.t1 t1Var = dd1Var.G;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.t1 t1Var2 = dd1Var.G;
                        int O2 = t1Var2.O2(dd1Var.K);
                        bd1 bd1Var = dd1Var.E;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.N8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && bd1Var != null && (checkBoxBaseArr = bd1Var.N8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = dd1Var.G;
                    t1Var3.G7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.nm nmVar = dd1Var.Y;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    dd1Var.Y = null;
                    break;
                }
                break;
        }
    }
}
