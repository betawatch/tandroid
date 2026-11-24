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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d77 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ d77(y94 y94Var, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, qb4 qb4Var) {
        this.e = y94Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = qb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qb4 qb4Var;
        qb4 qb4Var2;
        String str;
        TLRPC.TL_secureData tL_secureData;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.e;
                d dVar = (d) this.f;
                c01 c01Var = (c01) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str2 = (String) this.c;
                boolean z = this.b;
                boolean z2 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (dVar == null) {
                    dVar = LaunchActivity.S();
                }
                if (dVar != null) {
                    if (c01Var != null) {
                        c01Var.b();
                    }
                    if (!zArr[0]) {
                        String C1 = na7Var.C1(user.restriction_reason);
                        if (!TextUtils.isEmpty(C1)) {
                            na7.W4(C1, dVar);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (dVar.getParentLayout() instanceof ActionBarLayout) {
                                    dVar = ((ActionBarLayout) dVar.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                gl.t1(dVar.getFragmentView());
                                int i = na7Var.currentAccount;
                                long j = user.id;
                                quc b = quc.b(i, j, j, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str2, user, 0, z, z2);
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().l(b) == null) {
                                    ow0 ow0Var = new ow0(dVar.getContext(), dVar.getResourceProvider());
                                    ow0Var.B(false);
                                    ow0Var.C0 = true;
                                    ow0Var.m0 = dVar.getParentActivity();
                                    ow0Var.x(dVar, b);
                                    ow0Var.show();
                                    break;
                                }
                            } else {
                                dVar.presentFragment(mu1.U9(user.id));
                                break;
                            }
                        } else {
                            long j2 = user.id;
                            if (dVar instanceof mu1) {
                                j2 = ((mu1) dVar).a();
                            } else if (dVar instanceof ProfileActivity) {
                                j2 = ((ProfileActivity) dVar).a();
                            }
                            if (dVar.getParentLayout() instanceof ActionBarLayout) {
                                dVar = ((ActionBarLayout) dVar.getParentLayout()).getSheetFragment();
                            }
                            gl.t1(dVar.getFragmentView());
                            quc b2 = quc.b(na7Var.currentAccount, j2, user.id, null, null, 4, 0, 0L, null, false, str2, user, 0, z, z2);
                            LaunchActivity launchActivity2 = LaunchActivity.H1;
                            if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.H1.O().l(b2) == null) {
                                ow0 ow0Var2 = new ow0(dVar.getContext(), dVar.getResourceProvider());
                                ow0Var2.B(true);
                                ow0Var2.C0 = false;
                                ow0Var2.m0 = dVar.getParentActivity();
                                ow0Var2.x(dVar, b2);
                                ow0Var2.show();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                y94 y94Var = (y94) this.e;
                boolean z3 = this.b;
                String str3 = (String) this.c;
                boolean z4 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                qb4 qb4Var3 = (qb4) this.s;
                ba4 ba4Var = y94Var.d;
                if (z3) {
                    ba4Var.n.remove(str3);
                } else {
                    ba4Var.h.remove(str3);
                }
                ba4 ba4Var2 = y94Var.d;
                if (z4) {
                    int i2 = ba4Var2.s - 1;
                    ba4Var2.s = i2;
                    if (i2 < 1 && (qb4Var2 = (qb4) ba4Var2.f.poll()) != null) {
                        y94Var.d.s++;
                        qb4Var2.c();
                    }
                } else {
                    int i3 = ba4Var2.r - 1;
                    ba4Var2.r = i3;
                    if (i3 < 1 && (qb4Var = (qb4) ba4Var2.e.poll()) != null) {
                        y94Var.d.r++;
                        qb4Var.c();
                    }
                }
                pk5 pk5Var = y94Var.d.F;
                if (pk5Var != null) {
                    Utilities.d.c(new sr0(pk5Var, pk5Var.a, str3, inputFile, inputEncryptedFile, bArr, bArr2, qb4Var3.t));
                    break;
                }
                break;
            default:
                vx7 vx7Var = (vx7) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                nw7 nw7Var = (nw7) this.h;
                boolean z5 = this.b;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.n;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.r;
                boolean z6 = this.d;
                ArrayList arrayList = (ArrayList) this.c;
                kw7 kw7Var = (kw7) this.s;
                String str4 = null;
                if (tL_error == null) {
                    if (!z5) {
                        if (z6) {
                            vx7Var.J1(tL_secureRequiredType2);
                        }
                        vx7Var.J1(tL_secureRequiredType);
                    } else if (tL_secureRequiredType != null) {
                        vx7Var.J1(tL_secureRequiredType);
                    } else {
                        vx7Var.J1(tL_secureRequiredType2);
                    }
                    if (vx7Var.b == 8) {
                        ux7 ux7Var = (ux7) vx7Var.r1.remove(tL_secureRequiredType2);
                        if (ux7Var != null) {
                            vx7Var.d0.removeView(ux7Var);
                            View childAt = vx7Var.d0.getChildAt(r1.getChildCount() - 6);
                            if (childAt instanceof ux7) {
                                ((ux7) childAt).setNeedDivider(false);
                            }
                        }
                        vx7Var.T1();
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
                                    TLRPC.TL_secureValue k1 = vx7Var.k1(tL_secureRequiredType3, false);
                                    if (k1 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = k1.data;
                                        str = tL_secureData2 != null ? vx7.Z0(tL_secureData2.data, vx7Var.a1(tL_secureData2.secret, tL_secureData2.data_hash), k1.data.data_hash) : null;
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
                            vx7Var.N1(tL_secureRequiredType2, null, null, tL_secureRequiredType, str, z5, arrayList != null ? arrayList.size() : 0);
                        } else {
                            String str5 = str;
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                            TLRPC.TL_secureValue k12 = vx7Var.k1(tL_secureRequiredType2, false);
                            if (k12 != null && (tL_secureData = k12.data) != null) {
                                str4 = vx7.Z0(tL_secureData.data, vx7Var.a1(tL_secureData.secret, tL_secureData.data_hash), k12.data.data_hash);
                            }
                            vx7Var.N1(tL_secureRequiredType2, null, str4, tL_secureRequiredType4, str5, z5, arrayList != null ? arrayList.size() : 0);
                        }
                    }
                    if (kw7Var != null) {
                        kw7Var.run();
                        break;
                    }
                } else {
                    if (nw7Var != null) {
                        String str6 = tL_error.text;
                        nw7Var.b.z1();
                    }
                    vx7Var.O1(k96.M0(R.string.AppName, null), tL_error.text);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d77(na7 na7Var, d dVar, c01 c01Var, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.e = na7Var;
        this.f = dVar;
        this.h = c01Var;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z;
        this.d = z2;
        this.s = botInfoArr;
    }

    public /* synthetic */ d77(vx7 vx7Var, TLRPC.TL_error tL_error, nw7 nw7Var, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, kw7 kw7Var) {
        this.e = vx7Var;
        this.f = tL_error;
        this.h = nw7Var;
        this.b = z;
        this.n = tL_secureRequiredType;
        this.r = tL_secureRequiredType2;
        this.d = z2;
        this.c = arrayList;
        this.s = kw7Var;
    }
}
