// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lj3 implements ag4 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ uj3 b;

    public lj3(uj3 uj3Var, Context context) {
        this.b = uj3Var;
        this.a = context;
    }

    @Override // ag4
    public final void a(float f) {
        uj3 uj3Var = this.b;
        if (f != 1.0f || uj3Var.f0[1].getVisibility() == 0 || uj3Var.l2) {
            boolean z = uj3Var.k3;
            tj3[] tj3VarArr = uj3Var.f0;
            if (z) {
                tj3VarArr[0].setTranslationX((-f) * r2.getMeasuredWidth());
                uj3Var.f0[1].setTranslationX(r2[0].getMeasuredWidth() - (f * uj3Var.f0[0].getMeasuredWidth()));
            } else {
                tj3VarArr[0].setTranslationX(r2.getMeasuredWidth() * f);
                uj3Var.f0[1].setTranslationX((f * r2[0].getMeasuredWidth()) - uj3Var.f0[0].getMeasuredWidth());
            }
            if (f == 1.0f) {
                tj3[] tj3VarArr2 = uj3Var.f0;
                tj3 tj3Var = tj3VarArr2[0];
                tj3VarArr2[0] = tj3VarArr2[1];
                tj3VarArr2[1] = tj3Var;
                tj3Var.setVisibility(8);
                uj3Var.j5(true);
                uj3Var.p5(false);
                uj3Var.F5(-1, true);
                uj3Var.A0.Q = false;
                uj3Var.M2(uj3Var.f0[0]);
                uj3Var.f0[0].d.getClass();
                uj3Var.f0[1].d.getClass();
            }
        }
    }

    @Override // ag4
    public final boolean b() {
        return !this.b.l2;
    }

    public final void c(ac7 ac7Var) {
        boolean c = ac7Var.c();
        uj3 uj3Var = this.b;
        if (c) {
            qn4.c1(uj3Var, ac7Var.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
        String M0 = ob6.M0(2131750755, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131750754, null);
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131751563, null), new q72(this, ac7Var, (byte) 27));
        uj3Var.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, uj3Var.getResourceProvider());
        }
    }

    @Override // ag4
    public final void e() {
        this.b.R4(true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if ((r10 & (-1537)) != 0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
    @Override // ag4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(dg4 dg4Var) {
        a aVar;
        ac7 ac7Var;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        ac7 ac7Var2;
        ac7 ac7Var3;
        boolean z4;
        int i;
        String str;
        int i2;
        CharSequence M0;
        int i3;
        int i4;
        int i5;
        boolean z5;
        TLRPC.Chat M02;
        uj3 uj3Var = this.b;
        if (uj3Var.T0 == 0) {
            aVar = ((e) uj3Var).actionBar;
            if (!aVar.z() && uj3Var.U == 0.0f) {
                fu5 fu5Var = uj3Var.M0;
                if (fu5Var != null && fu5Var.E()) {
                    uj3Var.M0.u();
                    uj3Var.M0 = null;
                    return false;
                }
                if (dg4Var.getId() != uj3Var.A0.getDefaultTabId()) {
                    ArrayList T0 = uj3Var.getMessagesController().T0();
                    int id = dg4Var.getId();
                    if (T0 != null && id >= 0 && id < T0.size()) {
                        ac7Var = (ac7) T0.get(dg4Var.getId());
                        z = ac7Var != null;
                        boolean[] zArr = {true};
                        uc7 messagesController = uj3Var.getMessagesController();
                        arrayList = new ArrayList(!z ? messagesController.W0(uj3Var.Y2) : messagesController.y);
                        if (ac7Var == null) {
                            ac7Var2 = (ac7) uj3Var.getMessagesController().T0().get(dg4Var.getId());
                            int i6 = 0;
                            int i7 = i6;
                            if (ac7Var2 != null) {
                                while (i7 < arrayList.size()) {
                                    if (!ac7Var2.a(uj3Var.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i7)).id)) {
                                        arrayList.remove(i7);
                                        i7--;
                                    }
                                    i7++;
                                }
                                if (!ac7Var2.c()) {
                                    if (ac7Var2.i.isEmpty()) {
                                        int i8 = ac7Var2.g;
                                        int i9 = uc7.s5;
                                    }
                                    i6 = 0;
                                    if (i6 != 0) {
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= ac7Var2.h.size()) {
                                                break;
                                            }
                                            long longValue = ((Long) ac7Var2.h.get(i10)).longValue();
                                            if (longValue < 0 && (M02 = uj3Var.getMessagesController().M0(Long.valueOf(-longValue))) != null && nf4.i0(M02)) {
                                                zArr[0] = false;
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                }
                                i6 = 1;
                                if (i6 != 0) {
                                }
                            }
                            if (arrayList.isEmpty()) {
                                z3 = false;
                                z2 = i6;
                            } else {
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= arrayList.size()) {
                                        z5 = true;
                                        break;
                                    }
                                    if (!uj3Var.getMessagesController().p2(((TLRPC.Dialog) arrayList.get(i11)).id, 0L, null)) {
                                        z5 = false;
                                        break;
                                    }
                                    i11++;
                                }
                                z3 = !z5;
                                z2 = i6;
                            }
                        } else {
                            z2 = 0;
                            z3 = false;
                            ac7Var2 = null;
                        }
                        if (z) {
                            uj3Var.getMessagesController().getClass();
                            if (ac7Var2 != null && (ac7Var2.g & 64) == 0) {
                                ac7Var3 = ac7Var2;
                            }
                            ac7Var3 = null;
                        } else {
                            ArrayList T02 = uj3Var.getMessagesController().T0();
                            for (int i12 = 0; i12 < T02.size(); i12++) {
                                if (((ac7) T02.get(i12)).d()) {
                                    ac7Var3 = (ac7) T02.get(i12);
                                    break;
                                }
                            }
                            ac7Var3 = null;
                        }
                        z4 = ac7Var3 == null && uj3Var.getMessagesController().v0(ac7Var3);
                        boolean z6 = false;
                        for (i = 0; i < arrayList.size(); i++) {
                            if (((TLRPC.Dialog) arrayList.get(i)).unread_mark || ((TLRPC.Dialog) arrayList.get(i)).unread_count > 0) {
                                z6 = true;
                            }
                        }
                        fu5 I = fu5.I(uj3Var, dg4Var);
                        kj3 kj3Var = new kj3((byte) 0);
                        Paint paint = new Paint(1);
                        kj3Var.b = paint;
                        kj3Var.c = new RectF();
                        paint.setColor(uj3Var.getThemedColor(aob.G8));
                        I.X(kj3Var);
                        I.k(R.drawable.tabs_reorder, ob6.M0(2131750670, null), new zg3(this, (byte) 8), uj3Var.getMessagesController().T0().size() <= 1);
                        if (z) {
                            str = null;
                            i2 = 2131750746;
                        } else {
                            i2 = 2131750745;
                            str = null;
                        }
                        I.b(R.drawable.msg_edit, ob6.M0(i2, str), new jj3(this, z, ac7Var), false);
                        boolean z7 = ac7Var == null && !arrayList.isEmpty();
                        if (z3) {
                            M0 = ob6.M0(2131750660, null);
                            i3 = R.drawable.msg_unmute;
                        } else {
                            M0 = ob6.M0(2131750702, null);
                            i3 = R.drawable.msg_mute;
                        }
                        boolean z8 = z;
                        I.k(i3, M0, new ds6(this, arrayList, z3, (byte) 17), z7);
                        I.k(R.drawable.msg_markread, ob6.M0(2131748436, null), new wd3(this, arrayList, (byte) 6), z6);
                        boolean z9 = ac7Var3 == null;
                        if (z4) {
                            i4 = R.drawable.msg_markunread;
                            i5 = 2131750662;
                        } else {
                            i4 = R.drawable.msg_discussion;
                            i5 = 2131750666;
                        }
                        I.k(i4, ob6.M0(i5, null), new jj3(this, ac7Var3, z4), z9);
                        I.k(R.drawable.msg_share, nf4.E0((ac7Var2 == null && ac7Var2.e()) ? -1 : 0, ob6.M0(2131748679, null), true), new cv2(this, zArr, ac7Var2, (byte) 6), z2);
                        I.l(R.drawable.msg_delete, new wd3(this, ac7Var, (byte) 7), ob6.M0(2131750752, null), !z8, true);
                        I.s = (short) 96;
                        I.i = (byte) 3;
                        I.b0(hl.L(-12.0f), hl.L(-4.0f));
                        I.a0();
                        uj3Var.M0 = I;
                        return true;
                    }
                }
                ac7Var = null;
                if (ac7Var != null) {
                }
                boolean[] zArr2 = {true};
                uc7 messagesController2 = uj3Var.getMessagesController();
                arrayList = new ArrayList(!z ? messagesController2.W0(uj3Var.Y2) : messagesController2.y);
                if (ac7Var == null) {
                }
                if (z) {
                }
                if (ac7Var3 == null) {
                }
                boolean z62 = false;
                while (i < arrayList.size()) {
                }
                fu5 I2 = fu5.I(uj3Var, dg4Var);
                kj3 kj3Var2 = new kj3((byte) 0);
                Paint paint2 = new Paint(1);
                kj3Var2.b = paint2;
                kj3Var2.c = new RectF();
                paint2.setColor(uj3Var.getThemedColor(aob.G8));
                I2.X(kj3Var2);
                I2.k(R.drawable.tabs_reorder, ob6.M0(2131750670, null), new zg3(this, (byte) 8), uj3Var.getMessagesController().T0().size() <= 1);
                if (z) {
                }
                I2.b(R.drawable.msg_edit, ob6.M0(i2, str), new jj3(this, z, ac7Var), false);
                if (ac7Var == null) {
                }
                if (z3) {
                }
                boolean z82 = z;
                I2.k(i3, M0, new ds6(this, arrayList, z3, (byte) 17), z7);
                I2.k(R.drawable.msg_markread, ob6.M0(2131748436, null), new wd3(this, arrayList, (byte) 6), z62);
                if (ac7Var3 == null) {
                }
                if (z4) {
                }
                I2.k(i4, ob6.M0(i5, null), new jj3(this, ac7Var3, z4), z9);
                I2.k(R.drawable.msg_share, nf4.E0((ac7Var2 == null && ac7Var2.e()) ? -1 : 0, ob6.M0(2131748679, null), true), new cv2(this, zArr2, ac7Var2, (byte) 6), z2);
                I2.l(R.drawable.msg_delete, new wd3(this, ac7Var, (byte) 7), ob6.M0(2131750752, null), !z82, true);
                I2.s = (short) 96;
                I2.i = (byte) 3;
                I2.b0(hl.L(-12.0f), hl.L(-4.0f));
                I2.a0();
                uj3Var.M0 = I2;
                return true;
            }
        }
        return false;
    }

    @Override // ag4
    public final boolean i() {
        fu5 fu5Var = this.b.M0;
        return fu5Var != null && fu5Var.E();
    }

    @Override // ag4
    public final void l(int i) {
        c((ac7) this.b.getMessagesController().T0().get(i));
    }

    @Override // ag4
    public final void p(int i, int i2) {
        int i3 = 0;
        while (true) {
            tj3[] tj3VarArr = this.b.f0;
            if (i3 >= tj3VarArr.length) {
                return;
            }
            tj3 tj3Var = tj3VarArr[i3];
            int i4 = tj3Var.h;
            if (i4 == i) {
                tj3Var.h = i2;
            } else if (i4 == i2) {
                tj3Var.h = i;
            }
            i3++;
        }
    }

    @Override // ag4
    public final int q(int i) {
        uj3 uj3Var = this.b;
        if (uj3Var.T0 == 3) {
            return 0;
        }
        if (i == uj3Var.A0.getDefaultTabId()) {
            return uj3Var.getMessagesStorage().L;
        }
        ArrayList T0 = uj3Var.getMessagesController().T0();
        if (i < 0 || i >= T0.size()) {
            return 0;
        }
        return ((ac7) uj3Var.getMessagesController().T0().get(i)).d;
    }

    @Override // ag4
    public final void s(bg4 bg4Var, boolean z) {
        int i;
        int i2;
        uj3 uj3Var = this.b;
        int i3 = uj3Var.f0[0].h;
        int i4 = bg4Var.a;
        if (i3 != i4) {
            if (bg4Var.f) {
                uj3Var.A0.n(i4);
                i2 = ((e) uj3Var).currentAccount;
                uj3Var.showDialog(new l46(3, i2, null, this.a, uj3Var));
                return;
            }
            ArrayList T0 = uj3Var.getMessagesController().T0();
            if (bg4Var.e || ((i = bg4Var.a) >= 0 && i < T0.size())) {
                tj3 tj3Var = uj3Var.f0[1];
                tj3Var.h = bg4Var.a;
                tj3Var.setVisibility(0);
                uj3Var.f0[1].setTranslationX(r6[0].getMeasuredWidth());
                uj3Var.j5(false);
                uj3Var.n5(true);
                uj3Var.F5(bg4Var.a, true);
                uj3Var.k3 = z;
            }
        }
    }
}
