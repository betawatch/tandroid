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
import org.telegram.ui.g81;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rp0(int i7, Object obj, boolean z10) {
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
                jt0 jt0Var = (jt0) this.c;
                if (!this.b) {
                    jt0Var.p0.setVisibility(8);
                    break;
                } else {
                    jt0Var.getClass();
                    break;
                }
            case 1:
                gq0 gq0Var = (gq0) this.c;
                if (!this.b) {
                    gq0Var.W.t0.setVisibility(8);
                    break;
                } else {
                    gq0Var.getClass();
                    break;
                }
            case 2:
                jq0 jq0Var = (jq0) this.c;
                if (!this.b) {
                    jq0Var.x.t0.setVisibility(8);
                    break;
                } else {
                    jq0Var.getClass();
                    break;
                }
            case 3:
                du0 du0Var = (du0) this.c;
                boolean z11 = this.b;
                ArrayList arrayList = du0Var.r;
                cu0 cu0Var = du0Var.n;
                if (cu0Var != null) {
                    cu0Var.L(du0Var.f, z11);
                }
                while (r4 < arrayList.size()) {
                    ((cu0) arrayList.get(r4)).L(du0Var.f, z11);
                    r4++;
                }
                break;
            case 4:
                eu0 eu0Var = (eu0) this.c;
                boolean z12 = this.b;
                ArrayList arrayList2 = eu0Var.r;
                cu0 cu0Var2 = eu0Var.n;
                if (cu0Var2 != null) {
                    cu0Var2.L(eu0Var.i0, z12);
                }
                while (r4 < arrayList2.size()) {
                    ((cu0) arrayList2.get(r4)).L(eu0Var.i0, z12);
                    r4++;
                }
                break;
            case 5:
                ((org.telegram.messenger.r10) this.c).a(null, Boolean.valueOf(this.b));
                break;
            case 6:
                ((c51) this.c).Q(this.b);
                break;
            case 7:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.c;
                c5.J(cxVar.getParentActivity(), this.b ? cxVar.getUserConfig().e() : -1L, new org.telegram.ui.hv(cxVar), cxVar.getResourceProvider());
                break;
            case 8:
                org.telegram.ui.ky kyVar = (org.telegram.ui.ky) this.c;
                kyVar.e0(kyVar.P, this.b);
                break;
            case 9:
                org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) this.c;
                if (!this.b) {
                    qa0Var.b.setVisibility(8);
                    break;
                } else {
                    qa0Var.getClass();
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
                    Drawable[] drawableArr = PhotoViewer.Z8;
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
                vf.c.t(((org.telegram.ui.lw0) this.c).e.getParentActivity(), org.telegram.messenger.hd.N0(this.b ? 2131746508 : 2131746510, null));
                break;
            case 15:
                i81 i81Var = (i81) this.c;
                boolean z14 = this.b;
                org.telegram.messenger.g0.g3(new org.telegram.ui.b81(i81Var, c10 == true ? 1 : 0));
                org.telegram.ui.Cells.r1 r1Var = i81Var.L;
                if (r1Var != null) {
                    r1Var.setVisibility(0);
                    if (!z14) {
                        org.telegram.ui.Cells.r1 r1Var2 = i81Var.L;
                        int c22 = r1Var2.c2(i81Var.P);
                        g81 g81Var = i81Var.J;
                        CheckBoxBase[] checkBoxBaseArr2 = r1Var2.f7;
                        if (checkBoxBaseArr2 != null && c22 >= 0 && c22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[c22]) != null && g81Var != null && (checkBoxBaseArr = g81Var.f7) != null && c22 >= 0 && c22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[c22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.r1 r1Var3 = i81Var.L;
                    r1Var3.c6 = -1;
                    r1Var3.invalidate();
                }
                org.telegram.ui.ul ulVar = i81Var.d0;
                if (ulVar != null) {
                    org.telegram.messenger.g0.g3(ulVar);
                    i81Var.d0 = null;
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
