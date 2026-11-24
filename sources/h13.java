// default package

import android.text.TextUtils;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h13 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ eh F;
    public final /* synthetic */ my0 G;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ up6 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ b61 e;
    public final /* synthetic */ su3 f;
    public final /* synthetic */ TreeSet h;
    public final /* synthetic */ pz2 n;
    public final /* synthetic */ njb r;
    public final /* synthetic */ ylb s;
    public final /* synthetic */ int[] w;
    public final /* synthetic */ Runnable[] x;
    public final /* synthetic */ int[] y;

    public /* synthetic */ h13(boolean[] zArr, int[] iArr, up6 up6Var, String[] strArr, b61 b61Var, su3 su3Var, TreeSet treeSet, pz2 pz2Var, njb njbVar, ylb ylbVar, int[] iArr2, Runnable[] runnableArr, int[] iArr3, int i, eh ehVar, my0 my0Var) {
        this.a = zArr;
        this.b = iArr;
        this.c = up6Var;
        this.d = strArr;
        this.e = b61Var;
        this.f = su3Var;
        this.h = treeSet;
        this.n = pz2Var;
        this.r = njbVar;
        this.s = ylbVar;
        this.w = iArr2;
        this.x = runnableArr;
        this.y = iArr3;
        this.E = i;
        this.F = ehVar;
        this.G = my0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean[] zArr = this.a;
        if (zArr[0] || this.b[0] >= 0) {
            return;
        }
        this.c.run();
        final String[] strArr = this.d;
        strArr[0] = null;
        final b61 b61Var = this.e;
        b61Var.setLoading(false);
        b61Var.setEnabled(false);
        String charSequence = this.f.getText().toString();
        StringBuilder s = td4.s(charSequence);
        boolean a = l13.a(charSequence, "bot");
        final TreeSet treeSet = this.h;
        s.append((a || l13.c(charSequence, treeSet) != null) ? "" : "bot");
        final String sb = s.toString();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        final pz2 pz2Var = this.n;
        if (isEmpty) {
            pz2Var.run();
            return;
        }
        int length = sb.length();
        final njb njbVar = this.r;
        final ylb ylbVar = this.s;
        if (length < 4 || sb.length() > 32) {
            njbVar.setText(jb6.M0(sb.length() < 4 ? 2131743341 : 2131743342, null));
            anb.X(njbVar.getTextView(), cmb.p7, ylbVar);
            return;
        }
        njbVar.setText(jb6.M0(2131743353, null));
        anb.X(njbVar.getTextView(), cmb.A6, ylbVar);
        final int[] iArr = this.w;
        final int i = iArr[0];
        final Runnable[] runnableArr = this.x;
        final int[] iArr2 = this.y;
        final int i2 = this.E;
        final eh ehVar = this.F;
        final my0 my0Var = this.G;
        Runnable runnable = new Runnable() { // from class: d13
            @Override // java.lang.Runnable
            public final void run() {
                byte b = 0;
                runnableArr[0] = null;
                final boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                final int[] iArr3 = iArr;
                int i3 = iArr3[0];
                final int i4 = i;
                if (i4 == i3) {
                    TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                    final String str = sb;
                    checkusername.username = str;
                    final int i5 = i2;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i5);
                    kc kcVar = new kc(b);
                    final int[] iArr4 = iArr2;
                    final String[] strArr2 = strArr;
                    final b61 b61Var2 = b61Var;
                    final pz2 pz2Var2 = pz2Var;
                    final TreeSet treeSet2 = treeSet;
                    final eh ehVar2 = ehVar;
                    final ylb ylbVar2 = ylbVar;
                    final njb njbVar2 = njbVar;
                    final my0 my0Var2 = my0Var;
                    iArr4[0] = connectionsManager.sendRequestTyped(checkusername, kcVar, new jac() { // from class: f13
                        @Override // jac
                        public final void a(Object obj, Object obj2) {
                            TLRPC.Bool bool = (TLRPC.Bool) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            if (zArr2[0]) {
                                return;
                            }
                            if (i4 == iArr3[0]) {
                                iArr4[0] = -1;
                                boolean z = bool instanceof TLRPC.TL_boolTrue;
                                String str2 = str;
                                b61 b61Var3 = b61Var2;
                                if (z) {
                                    strArr2[0] = str2;
                                    b61Var3.setEnabled(true);
                                    pz2Var2.run();
                                    return;
                                }
                                String str3 = tL_error == null ? "USERNAME_OCCUPIED" : tL_error.text;
                                int i6 = i5;
                                TreeSet treeSet3 = treeSet2;
                                eh ehVar3 = ehVar2;
                                ylb ylbVar3 = ylbVar2;
                                CharSequence d = l13.d(i6, str2, treeSet3, str3, ehVar3, ylbVar3);
                                CharSequence M0 = d != null ? d : jb6.M0(2131751664, null);
                                njb njbVar3 = njbVar2;
                                njbVar3.setText(M0);
                                anb.X(njbVar3.getTextView(), cmb.p7, ylbVar3);
                                if (d != null || tL_error == null) {
                                    return;
                                }
                                b61Var3.setEnabled(true);
                                wi8.u(my0Var2.F, ylbVar3, tL_error, false);
                            }
                        }
                    });
                }
            }
        };
        runnableArr[0] = runnable;
        gm.d3(runnable, 300L);
    }
}
