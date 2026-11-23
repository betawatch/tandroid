package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qp0(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        if (r1 < 2) goto L56;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        zh.e eVar = null;
        boolean z10 = true;
        char c10 = 1;
        switch (this.a) {
            case 0:
                it0 it0Var = (it0) this.c;
                if (!this.b) {
                    it0Var.p0.setVisibility(8);
                    break;
                } else {
                    it0Var.getClass();
                    break;
                }
            case 1:
                fq0 fq0Var = (fq0) this.c;
                if (!this.b) {
                    fq0Var.W.t0.setVisibility(8);
                    break;
                } else {
                    fq0Var.getClass();
                    break;
                }
            case 2:
                iq0 iq0Var = (iq0) this.c;
                if (!this.b) {
                    iq0Var.x.t0.setVisibility(8);
                    break;
                } else {
                    iq0Var.getClass();
                    break;
                }
            case 3:
                cu0 cu0Var = (cu0) this.c;
                boolean z11 = this.b;
                ArrayList arrayList = cu0Var.r;
                bu0 bu0Var = cu0Var.n;
                if (bu0Var != null) {
                    bu0Var.L(cu0Var.f, z11);
                }
                while (r4 < arrayList.size()) {
                    ((bu0) arrayList.get(r4)).L(cu0Var.f, z11);
                    r4++;
                }
                break;
            case 4:
                du0 du0Var = (du0) this.c;
                boolean z12 = this.b;
                ArrayList arrayList2 = du0Var.r;
                bu0 bu0Var2 = du0Var.n;
                if (bu0Var2 != null) {
                    bu0Var2.L(du0Var.i0, z12);
                }
                while (r4 < arrayList2.size()) {
                    ((bu0) arrayList2.get(r4)).L(du0Var.i0, z12);
                    r4++;
                }
                break;
            case 5:
                ((org.telegram.messenger.p10) this.c).a(null, Boolean.valueOf(this.b));
                break;
            case 6:
                ((b51) this.c).Q(this.b);
                break;
            case 7:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.c;
                b5.J(bxVar.getParentActivity(), this.b ? bxVar.getUserConfig().e() : -1L, new org.telegram.ui.gv(bxVar), bxVar.getResourceProvider());
                break;
            case 8:
                org.telegram.ui.jy jyVar = (org.telegram.ui.jy) this.c;
                jyVar.e0(jyVar.P, this.b);
                break;
            case 9:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) this.c;
                if (!this.b) {
                    pa0Var.b.setVisibility(8);
                    break;
                } else {
                    pa0Var.getClass();
                    break;
                }
            case 10:
                org.telegram.ui.de0 de0Var = (org.telegram.ui.de0) this.c;
                if (!this.b) {
                    de0Var.X.setVisibility(8);
                    break;
                }
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                if (!this.b) {
                    photoViewer.W0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.f9;
                    photoViewer.getClass();
                    break;
                }
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z13 = this.b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.H5(z13, true);
                break;
            case 13:
                ((FrameLayout) this.c).setVisibility(this.b ? 4 : 0);
                break;
            case 14:
                vf.c.t(((org.telegram.ui.jw0) this.c).e.getParentActivity(), org.telegram.messenger.gd.N0(this.b ? 2131746508 : 2131746510, null));
                break;
            case 15:
                org.telegram.ui.g81 g81Var = (org.telegram.ui.g81) this.c;
                boolean z14 = this.b;
                org.telegram.messenger.g0.g3(new org.telegram.ui.z71(g81Var, c10 == true ? 1 : 0));
                org.telegram.ui.Cells.r1 r1Var = g81Var.L;
                if (r1Var != null) {
                    r1Var.setVisibility(0);
                    if (!z14) {
                        org.telegram.ui.Cells.r1 r1Var2 = g81Var.L;
                        int c22 = r1Var2.c2(g81Var.P);
                        org.telegram.ui.e81 e81Var = g81Var.J;
                        CheckBoxBase[] checkBoxBaseArr2 = r1Var2.f7;
                        if (checkBoxBaseArr2 != null && c22 >= 0 && c22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[c22]) != null && e81Var != null && (checkBoxBaseArr = e81Var.f7) != null && c22 >= 0 && c22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[c22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.r1 r1Var3 = g81Var.L;
                    r1Var3.c6 = -1;
                    r1Var3.invalidate();
                }
                org.telegram.ui.ul ulVar = g81Var.d0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    g81Var.d0 = null;
                    break;
                }
                break;
            case 16:
                ((View) this.c).setVisibility(this.b ? 0 : 8);
                break;
            case 17:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.c;
                boolean z15 = this.b;
                if (!p1Var.A && p1Var.v != 0) {
                    p1Var.v = 0L;
                    p1Var.o.set(false);
                    p1Var.U = "Widget engine stopped";
                    org.telegram.utils.twidget.d1 d1Var = p1Var.R;
                    if (d1Var != null) {
                        if (!z15) {
                            d1Var.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - d1Var.D > 60000) {
                                d1Var.D = elapsedRealtime;
                                d1Var.C = 0;
                            }
                            if (d1Var.o) {
                                int i7 = d1Var.C;
                                d1Var.C = i7 + 1;
                                break;
                            }
                            z10 = false;
                            d1Var.m();
                            if (d1Var.e != null) {
                                sa.d.D2(d1Var, z10);
                            } else if (z10) {
                                d1Var.a();
                            }
                            if (!z10) {
                                d1Var.f("Widget engine stopped");
                                break;
                            }
                        } else {
                            if (d1Var.o && d1Var.n && !d1Var.p) {
                                r4 = 1;
                            }
                            d1Var.m();
                            if (r4 != 0) {
                                if (d1Var.e == null) {
                                    d1Var.a();
                                    break;
                                } else {
                                    sa.d.D2(d1Var, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 18:
                zh.l lVar = (zh.l) this.c;
                boolean z16 = this.b;
                ArrayList arrayList3 = lVar.c;
                boolean isEmpty = TextUtils.isEmpty(lVar.t);
                String str = lVar.t;
                lVar.w = true;
                lVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i5.c.h(1, arrayList3);
                boolean z17 = tL_chatInviteImporter == null;
                if (isEmpty && z17 && z16) {
                    eVar = new zh.e(lVar, 1);
                }
                zh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.h3(eVar2, 300L);
                }
                lVar.v = lVar.i.a(lVar.j, str, tL_chatInviteImporter, lVar.d, new di.x3(lVar, isEmpty, eVar2, str, z17));
                break;
            default:
                zi.k kVar = (zi.k) this.c;
                boolean z18 = this.b;
                kVar.O = z18;
                kVar.P = kVar.F();
                kVar.Q = 0;
                kVar.R = 0;
                kVar.j.b("torch requested: enabled=" + z18 + ", available=" + kVar.F() + ", cameraId=" + kVar.o + ", facing=" + kVar.F);
                kVar.f();
                break;
        }
    }
}
