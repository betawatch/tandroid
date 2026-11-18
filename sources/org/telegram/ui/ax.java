package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ax extends v4.w {
    public v4.f1 d;
    public boolean e;
    public boolean f;
    public final bx g;
    public final /* synthetic */ cx h;

    public ax(cx cxVar, bx bxVar) {
        this.h = cxVar;
        this.g = bxVar;
    }

    @Override // v4.w
    public final int b(int i7, int i10) {
        if (this.f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override // v4.w
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        cx cxVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (cxVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.h3(new sg(1, t2Var), this.g.y.e);
            cxVar.Z0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0148, code lost:
    
        if (org.telegram.messenger.bz.m(r14) == 4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e9, code lost:
    
        if (org.telegram.messenger.bz.m(r14) != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        if (org.telegram.messenger.bz.m(r8) != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
    
        if (r14 != 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).y() == false) goto L8;
     */
    @Override // v4.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        boolean z10;
        int i10;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.s4 s4Var2;
        bx bxVar = this.g;
        if (!bxVar.y.k()) {
            cx cxVar = this.h;
            s4Var = ((org.telegram.ui.ActionBar.h2) cxVar).parentLayout;
            if (s4Var != null) {
                s4Var2 = ((org.telegram.ui.ActionBar.h2) cxVar).parentLayout;
            }
            if (!cxVar.H3.c() && cxVar.a3 == 0) {
                if (this.e && this.f) {
                    View view = f1Var.a;
                    if (view instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view).x = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!cxVar.n2 && bxVar.p() && cxVar.Y0 == null) {
                    View view2 = f1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view2;
                        long dialogId = t2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                        if (kVar.z(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
                            if (cxVar.a1 && dialog2 != null && cxVar.v4(dialog2) && !org.telegram.messenger.n5.D(dialogId) && !cxVar.y4(bxVar)) {
                                org.telegram.ui.Cells.t2 t2Var2 = (org.telegram.ui.Cells.t2) f1Var.a;
                                cxVar.Z0 = t2Var2;
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, t2Var2, cxVar.getResourceProvider());
                                this.f = false;
                                return v4.w.l(3, 0);
                            }
                        } else {
                            int i17 = cxVar.T0;
                            try {
                                i17 = bxVar.d.h;
                            } catch (Exception unused) {
                            }
                            rw rwVar = cxVar.A0;
                            if (rwVar != null && rwVar.getVisibility() == 0) {
                                i16 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                            }
                            if (cxVar.e1) {
                                if (dialogId == cxVar.getUserConfig().n || dialogId == 777000 || i17 == 7 || i17 == 8) {
                                    i7 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                }
                                if (cxVar.getMessagesController().I2(dialogId, false)) {
                                    int i18 = cxVar.getMessagesController().D2;
                                    int i19 = org.telegram.messenger.mp.I8;
                                }
                                if (cxVar.Y2 == 0) {
                                    i11 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                    if (dialogId >= 0 || !org.telegram.messenger.v3.Y(org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-dialogId)))) {
                                        i12 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                        if (org.telegram.messenger.bz.m(i12) != 3) {
                                            i13 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                            if (org.telegram.messenger.bz.m(i13) != 1) {
                                                i14 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                                if (org.telegram.messenger.bz.m(i14) != 0) {
                                                    i15 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!cxVar.H3.c()) {
                                        z10 = true;
                                        i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                        if (org.telegram.messenger.bz.m(i10) == 1 && (dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId)) != null && cxVar.H4(bxVar, dialog) && cxVar.getMessagesController().w2(dialog)) {
                                            z10 = false;
                                        }
                                        this.f = false;
                                        this.e = !(z10 || org.telegram.messenger.n5.D(t2Var.getDialogId())) || (org.telegram.messenger.bz.q1 && org.telegram.messenger.n5.D(t2Var.getDialogId()));
                                        t2Var.setSliding(true);
                                        return v4.w.l(0, 4);
                                    }
                                }
                                z10 = false;
                                i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                if (org.telegram.messenger.bz.m(i10) == 1) {
                                    z10 = false;
                                }
                                this.f = false;
                                this.e = !(z10 || org.telegram.messenger.n5.D(t2Var.getDialogId())) || (org.telegram.messenger.bz.q1 && org.telegram.messenger.n5.D(t2Var.getDialogId()));
                                t2Var.setSliding(true);
                                return v4.w.l(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // v4.w
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // v4.w
    public final float g() {
        return 0.45f;
    }

    @Override // v4.w
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7;
        cx cxVar = this.h;
        ArrayList arrayList = cxVar.c1;
        View view = f1Var2.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
            if (dialog != null && cxVar.v4(dialog) && !org.telegram.messenger.n5.D(dialogId)) {
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                bx bxVar = this.g;
                if (bxVar.a.getItemAnimator() == null) {
                    bxVar.a.setItemAnimator(bxVar.y);
                }
                kv kvVar = bxVar.d;
                cx cxVar2 = kvVar.S;
                int i10 = kvVar.G;
                ArrayList d42 = cxVar2.d4(i10, kvVar.h, kvVar.r, false);
                int H = kvVar.H(b10);
                int H2 = kvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = kvVar.h;
                if (i11 == 7 || i11 == 8) {
                    LongSparseIntArray longSparseIntArray = org.telegram.messenger.mp.u1(i10).N[kvVar.h == 8 ? (char) 1 : (char) 0].j;
                    int i12 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(d42, H, H2);
                kvVar.X(null);
                int i14 = cxVar.f0[0].s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        cxVar.b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.ro roVar = cxVar.getMessagesController().N[cxVar.f0[0].s == i7 ? (char) 1 : (char) 0];
                if (arrayList.contains(roVar)) {
                    return true;
                }
                arrayList.add(roVar);
                return true;
            }
        }
        return false;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        if (f1Var != null) {
            this.g.a.d1(false);
        }
        this.d = f1Var;
        if (f1Var != null) {
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).x = false;
            }
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
        int i7;
        cx cxVar = this.h;
        if (f1Var == null) {
            cxVar.Y0 = null;
            return;
        }
        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) f1Var.a;
        long dialogId = t2Var.getDialogId();
        boolean D = org.telegram.messenger.n5.D(dialogId);
        bx bxVar = this.g;
        if (D) {
            yw ywVar = bxVar.a;
            int i10 = yw.C3;
            ywVar.C1(false, t2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!cxVar.getMessagesController().I2(dialogId, false) && cxVar.Y2 == 0) {
            i7 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
            if (org.telegram.messenger.bz.m(i7) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                cxVar.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                cxVar.K4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (org.telegram.messenger.v3.Y(cxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            cxVar.K4(arrayList2, org.telegram.messenger.ks.w1, true, false, null);
            return;
        }
        cxVar.Y0 = t2Var;
        l2.x xVar = new l2.x(this, dialog, bxVar.d.b(), f1Var.b(), 13);
        cxVar.U4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            xVar.run();
            return;
        }
        if (cxVar.X0 == null) {
            yw ywVar2 = bxVar.a;
            org.telegram.ui.Components.zb0 zb0Var = new org.telegram.ui.Components.zb0();
            zb0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            zb0Var.b = paint;
            zb0Var.e = 0L;
            zb0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            zb0Var.c = ywVar2;
            cxVar.X0 = zb0Var;
        }
        org.telegram.ui.Components.zb0 zb0Var2 = cxVar.X0;
        zb0Var2.d = xVar;
        zb0Var2.h = 0.0f;
        zb0Var2.g = 0.0f;
        zb0Var2.e = System.currentTimeMillis();
        zb0Var2.c.invalidate();
    }
}
