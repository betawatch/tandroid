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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class aj3 extends fs5 {
    public s49 e;
    public boolean f;
    public boolean g;
    public final bj3 h;
    public final /* synthetic */ cj3 i;

    public aj3(cj3 cj3Var, bj3 bj3Var) {
        this.i = cj3Var;
        this.h = bj3Var;
    }

    @Override // fs5
    public final int b(int i, int i2) {
        if (this.g) {
            return 0;
        }
        return super.b(i, i2);
    }

    @Override // fs5
    public final long d(RecyclerView recyclerView, int i, float f, float f2) {
        cj3 cj3Var;
        ue3 ue3Var;
        if (i == 4) {
            return 200L;
        }
        if (i == 8 && (ue3Var = (cj3Var = this.i).Z0) != null) {
            gl.e3(new uc(ue3Var, (byte) 1), this.h.y.e);
            cj3Var.Z0 = null;
        }
        return super.d(recyclerView, i, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0141, code lost:
    
        if (gba.m(r14) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e5, code lost:
    
        if (gba.m(r14) != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        if (gba.m(r8) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f9, code lost:
    
        if (r14 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).w() == false) goto L8;
     */
    @Override // fs5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        ui5 ui5Var;
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
        ui5 ui5Var2;
        bj3 bj3Var = this.h;
        if (!bj3Var.y.k()) {
            cj3 cj3Var = this.i;
            ui5Var = ((d) cj3Var).parentLayout;
            if (ui5Var != null) {
                ui5Var2 = ((d) cj3Var).parentLayout;
            }
            if (!cj3Var.H3.c() && cj3Var.a3 == 0) {
                if (this.f && this.g) {
                    View view = s49Var.a;
                    if (view instanceof ue3) {
                        ((ue3) view).x = true;
                    }
                    this.f = false;
                    return 0;
                }
                if (!cj3Var.n2 && bj3Var.a() && cj3Var.Y0 == null) {
                    View view2 = s49Var.a;
                    if (view2 instanceof ue3) {
                        ue3 ue3Var = (ue3) view2;
                        long dialogId = ue3Var.getDialogId();
                        aVar = ((d) cj3Var).actionBar;
                        if (aVar.z(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
                            if (cj3Var.a1 && dialog2 != null && cj3Var.F3(dialog2) && !cf3.C(dialogId) && !cj3Var.I3(bj3Var)) {
                                ue3 ue3Var2 = (ue3) s49Var.a;
                                cj3Var.Z0 = ue3Var2;
                                zkb.h(bkb.c6, cj3Var.getResourceProvider(), ue3Var2);
                                this.g = false;
                                return fs5.m(3, 0);
                            }
                        } else {
                            int i9 = cj3Var.T0;
                            try {
                                i9 = bj3Var.d.h;
                            } catch (Exception unused) {
                            }
                            qi3 qi3Var = cj3Var.A0;
                            if (qi3Var != null && qi3Var.getVisibility() == 0) {
                                i8 = ((d) cj3Var).currentAccount;
                            }
                            if (cj3Var.e1) {
                                if (dialogId == cj3Var.getUserConfig().n || dialogId == 777000 || i9 == 7 || i9 == 8) {
                                    i = ((d) cj3Var).currentAccount;
                                }
                                if (cj3Var.getMessagesController().B2(dialogId, false)) {
                                    int i10 = cj3Var.getMessagesController().t2;
                                    int i11 = na7.q5;
                                }
                                if (cj3Var.Y2 == 0) {
                                    i3 = ((d) cj3Var).currentAccount;
                                    if (dialogId >= 0 || !hc2.Y(na7.q1(i3).K0(Long.valueOf(-dialogId)))) {
                                        i4 = ((d) cj3Var).currentAccount;
                                        if (gba.m(i4) != 3) {
                                            i5 = ((d) cj3Var).currentAccount;
                                            if (gba.m(i5) != 1) {
                                                i6 = ((d) cj3Var).currentAccount;
                                                if (gba.m(i6) != 0) {
                                                    i7 = ((d) cj3Var).currentAccount;
                                                }
                                            }
                                        }
                                    }
                                    if (!cj3Var.H3.c()) {
                                        z = true;
                                        i2 = ((d) cj3Var).currentAccount;
                                        if (gba.m(i2) == 1 && (dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId)) != null && cj3Var.D4(bj3Var, dialog) && cj3Var.getMessagesController().p2(dialog)) {
                                            z = false;
                                        }
                                        this.g = false;
                                        this.f = !(z || cf3.C(ue3Var.getDialogId())) || (gba.n1 && cf3.C(ue3Var.getDialogId()));
                                        ue3Var.setSliding(true);
                                        return fs5.m(0, 4);
                                    }
                                }
                                z = false;
                                i2 = ((d) cj3Var).currentAccount;
                                if (gba.m(i2) == 1) {
                                    z = false;
                                }
                                this.g = false;
                                this.f = !(z || cf3.C(ue3Var.getDialogId())) || (gba.n1 && cf3.C(ue3Var.getDialogId()));
                                ue3Var.setSliding(true);
                                return fs5.m(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // fs5
    public final float g(float f) {
        return 3500.0f;
    }

    @Override // fs5
    public final float h() {
        return 0.45f;
    }

    @Override // fs5
    public final float i(float f) {
        return Float.MAX_VALUE;
    }

    @Override // fs5
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        cj3 cj3Var = this.i;
        ArrayList arrayList = cj3Var.c1;
        View view = s49Var2.a;
        if (view instanceof ue3) {
            long dialogId = ((ue3) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
            if (dialog != null && cj3Var.F3(dialog) && !cf3.C(dialogId)) {
                int b = s49Var.b();
                int b2 = s49Var2.b();
                bj3 bj3Var = this.h;
                if (bj3Var.a.getItemAnimator() == null) {
                    bj3Var.a.setItemAnimator(bj3Var.y);
                }
                eh3 eh3Var = bj3Var.d;
                cj3 cj3Var2 = eh3Var.S;
                int i = eh3Var.G;
                ArrayList m3 = cj3Var2.m3(i, eh3Var.h, eh3Var.r, false);
                int H = eh3Var.H(b);
                int H2 = eh3Var.H(b2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) m3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) m3.get(H2);
                int i2 = eh3Var.h;
                if (i2 == 7 || i2 == 8) {
                    LongSparseIntArray longSparseIntArray = na7.q1(i).N[eh3Var.h == 8 ? (char) 1 : (char) 0].j;
                    int i3 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i3);
                } else {
                    int i4 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i4;
                }
                Collections.swap(m3, H, H2);
                eh3Var.S(null);
                int i5 = cj3Var.f0[0].s;
                if (i5 != 7 && i5 != 8) {
                    cj3Var.b1 = true;
                    return true;
                }
                t97 t97Var = cj3Var.getMessagesController().N[cj3Var.f0[0].s == 8 ? (char) 1 : (char) 0];
                if (arrayList.contains(t97Var)) {
                    return true;
                }
                arrayList.add(t97Var);
                return true;
            }
        }
        return false;
    }

    @Override // fs5
    public final void q(s49 s49Var, int i) {
        if (s49Var != null) {
            this.h.a.e1(false);
        }
        this.e = s49Var;
        if (s49Var != null) {
            View view = s49Var.a;
            if (view instanceof ue3) {
                ((ue3) view).x = false;
            }
        }
    }

    @Override // fs5
    public final void r(s49 s49Var) {
        int i;
        cj3 cj3Var = this.i;
        if (s49Var == null) {
            cj3Var.Y0 = null;
            return;
        }
        ue3 ue3Var = (ue3) s49Var.a;
        long dialogId = ue3Var.getDialogId();
        boolean C = cf3.C(dialogId);
        bj3 bj3Var = this.h;
        if (C) {
            yi3 yi3Var = bj3Var.a;
            int i2 = yi3.C3;
            yi3Var.C1(false, ue3Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!cj3Var.getMessagesController().B2(dialogId, false) && cj3Var.Y2 == 0) {
            i = ((d) cj3Var).currentAccount;
            if (gba.m(i) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                cj3Var.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                cj3Var.G4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (hc2.Y(cj3Var.getMessagesController().K0(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            cj3Var.G4(arrayList2, kk7.v1, true, false, null);
            return;
        }
        cj3Var.Y0 = ue3Var;
        mp1 mp1Var = new mp1(this, dialog, bj3Var.d.b(), s49Var.b(), (byte) 4);
        cj3Var.Q4(true, true);
        if (Utilities.b.nextInt(1000) != 1) {
            mp1Var.run();
            return;
        }
        mr7 mr7Var = cj3Var.X0;
        if (mr7Var == null) {
            yi3 yi3Var2 = bj3Var.a;
            mr7Var = new mr7();
            mr7Var.a = new Paint(1);
            Paint paint = new Paint(1);
            mr7Var.b = paint;
            mr7Var.e = 0L;
            mr7Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(2.0f));
            mr7Var.c = yi3Var2;
            cj3Var.X0 = mr7Var;
        }
        mr7Var.d = mp1Var;
        mr7Var.h = 0.0f;
        mr7Var.g = 0.0f;
        mr7Var.e = System.currentTimeMillis();
        mr7Var.c.invalidate();
    }
}
