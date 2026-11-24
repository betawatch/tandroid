// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lk3 extends eu5 {
    public u69 e;
    public boolean f;
    public boolean g;
    public final mk3 h;
    public final /* synthetic */ nk3 i;

    public lk3(nk3 nk3Var, mk3 mk3Var) {
        this.i = nk3Var;
        this.h = mk3Var;
    }

    @Override // eu5
    public final int b(int i, int i2) {
        if (this.g) {
            return 0;
        }
        return super.b(i, i2);
    }

    @Override // eu5
    public final long d(RecyclerView recyclerView, int i, float f, float f2) {
        nk3 nk3Var;
        hg3 hg3Var;
        if (i == 4) {
            return 200L;
        }
        if (i == 8 && (hg3Var = (nk3Var = this.i).Z0) != null) {
            gm.d3(new ud(hg3Var, (byte) 1), this.h.y.e);
            nk3Var.Z0 = null;
        }
        return super.d(recyclerView, i, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0141, code lost:
    
        if (gda.m(r14) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e5, code lost:
    
        if (gda.m(r14) != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        if (gda.m(r8) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
    
        if (r14 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).w() == false) goto L8;
     */
    @Override // eu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        tk5 tk5Var;
        a aVar;
        int i;
        boolean z;
        int i2;
        TLRPC.Dialog dialog;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        tk5 tk5Var2;
        mk3 mk3Var = this.h;
        if (!mk3Var.y.k()) {
            nk3 nk3Var = this.i;
            tk5Var = ((d) nk3Var).parentLayout;
            if (tk5Var != null) {
                tk5Var2 = ((d) nk3Var).parentLayout;
            }
            if (!nk3Var.H3.c() && nk3Var.a3 == 0) {
                if (this.f && this.g) {
                    View view = u69Var.a;
                    if (view instanceof hg3) {
                        ((hg3) view).x = true;
                    }
                    this.f = false;
                    return 0;
                }
                if (!nk3Var.n2 && mk3Var.a() && nk3Var.Y0 == null) {
                    View view2 = u69Var.a;
                    if (view2 instanceof hg3) {
                        hg3 hg3Var = (hg3) view2;
                        long dialogId = hg3Var.getDialogId();
                        aVar = ((d) nk3Var).actionBar;
                        if (aVar.z(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
                            if (nk3Var.a1 && dialog2 != null && nk3Var.H3(dialog2) && !pg3.C(dialogId) && !nk3Var.K3(mk3Var)) {
                                hg3 hg3Var2 = (hg3) u69Var.a;
                                nk3Var.Z0 = hg3Var2;
                                anb.h(cmb.c6, nk3Var.getResourceProvider(), hg3Var2);
                                this.g = false;
                                return eu5.m(3, 0);
                            }
                        } else {
                            int i9 = nk3Var.T0;
                            try {
                                i9 = mk3Var.d.h;
                            } catch (Exception unused) {
                            }
                            ak3 ak3Var = nk3Var.A0;
                            if (ak3Var != null && ak3Var.getVisibility() == 0) {
                                i8 = ((d) nk3Var).currentAccount;
                            }
                            if (nk3Var.e1) {
                                if (dialogId == nk3Var.getUserConfig().n || dialogId == 777000 || i9 == 7 || i9 == 8) {
                                    i = ((d) nk3Var).currentAccount;
                                }
                                if (nk3Var.getMessagesController().D2(dialogId, false)) {
                                    int i10 = nk3Var.getMessagesController().t2;
                                    int i11 = oc7.s5;
                                }
                                if (nk3Var.Y2 == 0) {
                                    i3 = ((d) nk3Var).currentAccount;
                                    if (dialogId >= 0 || !sd2.Y(oc7.r1(i3).L0(Long.valueOf(-dialogId)))) {
                                        i4 = ((d) nk3Var).currentAccount;
                                        if (gda.m(i4) != 3) {
                                            i5 = ((d) nk3Var).currentAccount;
                                            if (gda.m(i5) != 1) {
                                                i6 = ((d) nk3Var).currentAccount;
                                                if (gda.m(i6) != 0) {
                                                    i7 = ((d) nk3Var).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!nk3Var.H3.c()) {
                                        z = true;
                                        i2 = ((d) nk3Var).currentAccount;
                                        if (gda.m(i2) == 1 && (dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId)) != null && nk3Var.H4(mk3Var, dialog) && nk3Var.getMessagesController().q2(dialog)) {
                                            z = false;
                                        }
                                        this.g = false;
                                        this.f = !(z || pg3.C(hg3Var.getDialogId())) || (gda.m1 && pg3.C(hg3Var.getDialogId()));
                                        hg3Var.setSliding(true);
                                        return eu5.m(0, 4);
                                    }
                                }
                                z = false;
                                i2 = ((d) nk3Var).currentAccount;
                                if (gda.m(i2) == 1) {
                                    z = false;
                                }
                                this.g = false;
                                this.f = !(z || pg3.C(hg3Var.getDialogId())) || (gda.m1 && pg3.C(hg3Var.getDialogId()));
                                hg3Var.setSliding(true);
                                return eu5.m(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // eu5
    public final float g(float f) {
        return 3500.0f;
    }

    @Override // eu5
    public final float h() {
        return 0.45f;
    }

    @Override // eu5
    public final float i(float f) {
        return Float.MAX_VALUE;
    }

    @Override // eu5
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        nk3 nk3Var = this.i;
        ArrayList arrayList = nk3Var.c1;
        View view = u69Var2.a;
        if (view instanceof hg3) {
            long dialogId = ((hg3) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
            if (dialog != null && nk3Var.H3(dialog) && !pg3.C(dialogId)) {
                int b = u69Var.b();
                int b2 = u69Var2.b();
                mk3 mk3Var = this.h;
                if (mk3Var.a.getItemAnimator() == null) {
                    mk3Var.a.setItemAnimator(mk3Var.y);
                }
                qi3 qi3Var = mk3Var.d;
                nk3 nk3Var2 = qi3Var.S;
                int i = qi3Var.G;
                ArrayList o3 = nk3Var2.o3(i, qi3Var.h, qi3Var.r, false);
                int H = qi3Var.H(b);
                int H2 = qi3Var.H(b2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) o3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) o3.get(H2);
                int i2 = qi3Var.h;
                if (i2 == 7 || i2 == 8) {
                    LongSparseIntArray longSparseIntArray = oc7.r1(i).N[qi3Var.h == 8 ? (char) 1 : (char) 0].j;
                    int i3 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i3);
                } else {
                    int i4 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i4;
                }
                Collections.swap(o3, H, H2);
                qi3Var.S(null);
                int i5 = nk3Var.f0[0].s;
                if (i5 != 7 && i5 != 8) {
                    nk3Var.b1 = true;
                    return true;
                }
                ub7 ub7Var = nk3Var.getMessagesController().N[nk3Var.f0[0].s == 8 ? (char) 1 : (char) 0];
                if (arrayList.contains(ub7Var)) {
                    return true;
                }
                arrayList.add(ub7Var);
                return true;
            }
        }
        return false;
    }

    @Override // eu5
    public final void q(u69 u69Var, int i) {
        if (u69Var != null) {
            this.h.a.e1(false);
        }
        this.e = u69Var;
        if (u69Var != null) {
            View view = u69Var.a;
            if (view instanceof hg3) {
                ((hg3) view).x = false;
            }
        }
    }

    @Override // eu5
    public final void r(u69 u69Var) {
        int i;
        nk3 nk3Var = this.i;
        if (u69Var == null) {
            nk3Var.Y0 = null;
            return;
        }
        hg3 hg3Var = (hg3) u69Var.a;
        long dialogId = hg3Var.getDialogId();
        boolean C = pg3.C(dialogId);
        mk3 mk3Var = this.h;
        if (C) {
            jk3 jk3Var = mk3Var.a;
            int i2 = jk3.C3;
            jk3Var.C1(false, hg3Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!nk3Var.getMessagesController().D2(dialogId, false) && nk3Var.Y2 == 0) {
            i = ((d) nk3Var).currentAccount;
            if (gda.m(i) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                nk3Var.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                nk3Var.K4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (sd2.Y(nk3Var.getMessagesController().L0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            nk3Var.K4(arrayList2, nm7.v1, true, false, null);
            return;
        }
        nk3Var.Y0 = hg3Var;
        zq1 zq1Var = new zq1(this, dialog, mk3Var.d.b(), u69Var.b(), (byte) 4);
        nk3Var.U4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            zq1Var.run();
            return;
        }
        nt7 nt7Var = nk3Var.X0;
        if (nt7Var == null) {
            jk3 jk3Var2 = mk3Var.a;
            nt7Var = new nt7();
            nt7Var.a = new Paint(1);
            Paint paint = new Paint(1);
            nt7Var.b = paint;
            nt7Var.e = 0L;
            nt7Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.L(2.0f));
            nt7Var.c = jk3Var2;
            nk3Var.X0 = nt7Var;
        }
        nt7Var.d = zq1Var;
        nt7Var.h = 0.0f;
        nt7Var.g = 0.0f;
        nt7Var.e = System.currentTimeMillis();
        nt7Var.c.invalidate();
    }
}
