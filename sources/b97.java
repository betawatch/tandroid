// default package

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b97 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ b97(ub4 ub4Var, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, nd4 nd4Var) {
        this.e = ub4Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = nd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd4 nd4Var;
        nd4 nd4Var2;
        String str;
        TLRPC.TL_secureData tL_secureData;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.e;
                e eVar = (e) this.f;
                l01 l01Var = (l01) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str2 = (String) this.c;
                boolean z = this.b;
                boolean z2 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (eVar == null) {
                    eVar = LaunchActivity.S();
                }
                if (eVar != null) {
                    if (l01Var != null) {
                        l01Var.b();
                    }
                    if (!zArr[0]) {
                        String E1 = uc7Var.E1(user.restriction_reason);
                        if (!TextUtils.isEmpty(E1)) {
                            uc7.f5(E1, eVar);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (eVar.getParentLayout() instanceof ActionBarLayout) {
                                    eVar = ((ActionBarLayout) eVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                hl.t1(eVar.getFragmentView());
                                int i = uc7Var.currentAccount;
                                long j = user.id;
                                gzc b = gzc.b(i, j, j, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str2, user, 0, z, z2);
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().l(b) == null) {
                                    xw0 xw0Var = new xw0(eVar.getContext(), eVar.getResourceProvider());
                                    xw0Var.B(false);
                                    xw0Var.C0 = true;
                                    xw0Var.m0 = eVar.getParentActivity();
                                    xw0Var.x(eVar, b);
                                    xw0Var.show();
                                    break;
                                }
                            } else {
                                eVar.presentFragment(zu1.ha(user.id));
                                break;
                            }
                        } else {
                            long j2 = user.id;
                            if (eVar instanceof zu1) {
                                j2 = ((zu1) eVar).a();
                            } else if (eVar instanceof ProfileActivity) {
                                j2 = ((ProfileActivity) eVar).a();
                            }
                            if (eVar.getParentLayout() instanceof ActionBarLayout) {
                                eVar = ((ActionBarLayout) eVar.getParentLayout()).getSheetFragment();
                            }
                            hl.t1(eVar.getFragmentView());
                            gzc b2 = gzc.b(uc7Var.currentAccount, j2, user.id, null, null, 4, 0, 0L, null, false, str2, user, 0, z, z2);
                            LaunchActivity launchActivity2 = LaunchActivity.H1;
                            if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.H1.O().l(b2) == null) {
                                xw0 xw0Var2 = new xw0(eVar.getContext(), eVar.getResourceProvider());
                                xw0Var2.B(true);
                                xw0Var2.C0 = false;
                                xw0Var2.m0 = eVar.getParentActivity();
                                xw0Var2.x(eVar, b2);
                                xw0Var2.show();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                ub4 ub4Var = (ub4) this.e;
                boolean z3 = this.b;
                String str3 = (String) this.c;
                boolean z4 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                nd4 nd4Var3 = (nd4) this.s;
                xb4 xb4Var = ub4Var.d;
                if (z3) {
                    xb4Var.n.remove(str3);
                } else {
                    xb4Var.h.remove(str3);
                }
                xb4 xb4Var2 = ub4Var.d;
                if (z4) {
                    int i2 = xb4Var2.s - 1;
                    xb4Var2.s = i2;
                    if (i2 < 1 && (nd4Var2 = (nd4) xb4Var2.f.poll()) != null) {
                        ub4Var.d.s++;
                        nd4Var2.c();
                    }
                } else {
                    int i3 = xb4Var2.r - 1;
                    xb4Var2.r = i3;
                    if (i3 < 1 && (nd4Var = (nd4) xb4Var2.e.poll()) != null) {
                        ub4Var.d.r++;
                        nd4Var.c();
                    }
                }
                sm5 sm5Var = ub4Var.d.F;
                if (sm5Var != null) {
                    Utilities.d.c(new as0(sm5Var, sm5Var.a, str3, inputFile, inputEncryptedFile, bArr, bArr2, nd4Var3.t));
                    break;
                }
                break;
            default:
                b18 b18Var = (b18) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                vz7 vz7Var = (vz7) this.h;
                boolean z5 = this.b;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.n;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.r;
                boolean z6 = this.d;
                ArrayList arrayList = (ArrayList) this.c;
                sz7 sz7Var = (sz7) this.s;
                String str4 = null;
                if (tL_error == null) {
                    if (!z5) {
                        if (z6) {
                            b18Var.K1(tL_secureRequiredType2);
                        }
                        b18Var.K1(tL_secureRequiredType);
                    } else if (tL_secureRequiredType != null) {
                        b18Var.K1(tL_secureRequiredType);
                    } else {
                        b18Var.K1(tL_secureRequiredType2);
                    }
                    if (b18Var.b == 8) {
                        a18 a18Var = (a18) b18Var.r1.remove(tL_secureRequiredType2);
                        if (a18Var != null) {
                            b18Var.d0.removeView(a18Var);
                            View childAt = b18Var.d0.getChildAt(r1.getChildCount() - 6);
                            if (childAt instanceof a18) {
                                ((a18) childAt).setNeedDivider(false);
                            }
                        }
                        b18Var.U1();
                    } else {
                        if (tL_secureRequiredType == null || arrayList == null || arrayList.size() <= 1) {
                            str = null;
                        } else {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    str = null;
                                } else {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(i4);
                                    TLRPC.TL_secureValue l1 = b18Var.l1(tL_secureRequiredType3, false);
                                    if (l1 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = l1.data;
                                        str = tL_secureData2 != null ? b18.a1(tL_secureData2.data, b18Var.b1(tL_secureData2.secret, tL_secureData2.data_hash), l1.data.data_hash) : null;
                                        tL_secureRequiredType = tL_secureRequiredType3;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            if (tL_secureRequiredType == null) {
                                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                            }
                        }
                        if (z6) {
                            b18Var.O1(tL_secureRequiredType2, null, null, tL_secureRequiredType, str, z5, arrayList != null ? arrayList.size() : 0);
                        } else {
                            String str5 = str;
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                            TLRPC.TL_secureValue l12 = b18Var.l1(tL_secureRequiredType2, false);
                            if (l12 != null && (tL_secureData = l12.data) != null) {
                                str4 = b18.a1(tL_secureData.data, b18Var.b1(tL_secureData.secret, tL_secureData.data_hash), l12.data.data_hash);
                            }
                            b18Var.O1(tL_secureRequiredType2, null, str4, tL_secureRequiredType4, str5, z5, arrayList != null ? arrayList.size() : 0);
                        }
                    }
                    if (sz7Var != null) {
                        sz7Var.run();
                        break;
                    }
                } else {
                    if (vz7Var != null) {
                        String str6 = tL_error.text;
                        vz7Var.b.A1();
                    }
                    b18Var.P1(ob6.M0(R.string.AppName, null), tL_error.text);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b97(uc7 uc7Var, e eVar, l01 l01Var, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.e = uc7Var;
        this.f = eVar;
        this.h = l01Var;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z;
        this.d = z2;
        this.s = botInfoArr;
    }

    public /* synthetic */ b97(b18 b18Var, TLRPC.TL_error tL_error, vz7 vz7Var, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, sz7 sz7Var) {
        this.e = b18Var;
        this.f = tL_error;
        this.h = vz7Var;
        this.b = z;
        this.n = tL_secureRequiredType;
        this.r = tL_secureRequiredType2;
        this.d = z2;
        this.c = arrayList;
        this.s = sz7Var;
    }
}
